package editor;

import java.io.IOException;
import java.io.PushbackReader;

import lexer.Lexer;
import lexer.LexerException;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

/**
 * @author R4PaSs
 * Scanner used by the NitEditor to highlight words in the editor
 */
public class NitScanner implements ITokenScanner {

	/** The document to scan tokens in */
	protected IDocument doc;

	/** The end offset of the range to be scanned */
	protected int fRangeEnd;

	/** The offset of the last read token */
	protected int fTokenOffset;

	/** The length of the last read token */
	protected int fTokenLength;

	/** Converter from IDocument to Reader object (mandatory for use in Lexer) */
	protected DocumentBufferStream docStr = new DocumentBufferStream();

	/** The Lexer configured for Nit and generated by SableCC */
	protected Lexer lex;

	/**
	 * @param document
	 *            : The document to set
	 * 
	 *            Changes the document to scan for tokens
	 * 
	 */
	public void setDocument(IDocument document) {
		if (document != null) {
			this.doc = document;
			docStr.setDoc(this.doc);
			docStr.setRange(0, doc.getLength());
		}
	}

	@Override
	public void setRange(IDocument document, int offset, int length) {
		// Had to recreate the Lexer because the only way to stop parsing is by
		// arriving at EOF, when he does, there is no way to reset him
		// The second argument of PushBackReader is here to prevent random
		// crashes because of the PushbackReader buffer when encountering tokens
		// like .. or ...
		lex = new Lexer(new PushbackReader(this.docStr, 2));

		if (this.doc != document) {
			setDocument(document);
		} else {
			this.docStr.setRange(offset, length);
			this.fTokenOffset = offset;
			this.fTokenLength = 0;
		}
	}

	/**
	 * Computes the origin offset in the document of the token returned by the
	 * lexer
	 * 
	 * @param tok
	 *            : The token to get the origin position from
	 * @return the position computed from the document
	 */
	private int computePositionFromOfToken(node.Token tok) {
		try {
			int linesToAdd = this.doc.getLineOfOffset(this.docStr.fStartRange);
			int test = this.doc.getLineOffset(linesToAdd + tok.getLine() - 1);
			int tokPos = (tok.getPos() - 1);
			return test + tokPos;
		} catch (BadLocationException e) {
			return -1;
		}
	}

	@Override
	public IToken nextToken() {
		if (this.doc != null) {
			try {

				node.Token tok = lex.next();
				this.fTokenLength = tok.getText().length();
				this.fTokenOffset = this.computePositionFromOfToken(tok);
				if (tok instanceof node.EOF) {
					return Token.EOF;
				}

				// To discover what is the TextAttribute to map to which token
				// the Lexer sent back, we use the className without the whole
				// hierarchy
				String[] classNameArr = tok.getClass().getName().split("\\.");
				String className = classNameArr[classNameArr.length - 1];
				Token tokEclipse;
				//
				tokEclipse = new Token(NitColorReposit.getInstance()
						.getStyleForKeyWord(className));
				//
				return tokEclipse;
			} catch (LexerException e) {

				// A LexerException is thrown when an unknown token is
				// recognized by the Lexer (Like unfinished string token or ;)
				this.fTokenLength = this.docStr.currOffset
						- (this.fTokenOffset + this.fTokenLength);
				this.fTokenOffset = this.docStr.currOffset - this.fTokenLength;

				return new Token(new TextAttribute(new Color(
						Display.getCurrent(), new RGB(255, 0, 0)), null,
						SWT.UNDERLINE_ERROR));
			} catch (IOException e) {
				// This should never happen
				this.fTokenLength = docStr.currOffset - this.fTokenOffset;
				return new Token(new TextAttribute(new Color(
						Display.getCurrent(), new RGB(255, 0, 0)), null,
						SWT.UNDERLINE_ERROR));
			}
		} else {
			return Token.EOF;
		}
	}

	@Override
	public int getTokenOffset() {
		return this.fTokenOffset;
	}

	@Override
	public int getTokenLength() {
		return this.fTokenLength;
	}

}
