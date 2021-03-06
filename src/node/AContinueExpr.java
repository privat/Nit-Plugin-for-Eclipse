/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AContinueExpr extends PExpr
{
    private TKwcontinue _kwcontinue_;
    private PLabel _label_;
    private PExpr _expr_;

    public AContinueExpr()
    {
        // Constructor
    }

    public AContinueExpr(
        @SuppressWarnings("hiding") TKwcontinue _kwcontinue_,
        @SuppressWarnings("hiding") PLabel _label_,
        @SuppressWarnings("hiding") PExpr _expr_)
    {
        // Constructor
        setKwcontinue(_kwcontinue_);

        setLabel(_label_);

        setExpr(_expr_);

    }

    @Override
    public Object clone()
    {
        return new AContinueExpr(
            cloneNode(this._kwcontinue_),
            cloneNode(this._label_),
            cloneNode(this._expr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAContinueExpr(this);
    }

    public TKwcontinue getKwcontinue()
    {
        return this._kwcontinue_;
    }

    public void setKwcontinue(TKwcontinue node)
    {
        if(this._kwcontinue_ != null)
        {
            this._kwcontinue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwcontinue_ = node;
    }

    public PLabel getLabel()
    {
        return this._label_;
    }

    public void setLabel(PLabel node)
    {
        if(this._label_ != null)
        {
            this._label_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._label_ = node;
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kwcontinue_)
            + toString(this._label_)
            + toString(this._expr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kwcontinue_ == child)
        {
            this._kwcontinue_ = null;
            return;
        }

        if(this._label_ == child)
        {
            this._label_ = null;
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kwcontinue_ == oldChild)
        {
            setKwcontinue((TKwcontinue) newChild);
            return;
        }

        if(this._label_ == oldChild)
        {
            setLabel((PLabel) newChild);
            return;
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
