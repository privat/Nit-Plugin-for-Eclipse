/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TKwisa extends Token
{
    public TKwisa()
    {
        super.setText("isa");
    }

    public TKwisa(int line, int pos)
    {
        super.setText("isa");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TKwisa(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKwisa(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKwisa text.");
    }
}
