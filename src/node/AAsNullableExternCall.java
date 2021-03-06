/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AAsNullableExternCall extends PExternCall
{
    private PType _type_;
    private TKwas _kwas_;
    private TKwnullable _kwnullable_;

    public AAsNullableExternCall()
    {
        // Constructor
    }

    public AAsNullableExternCall(
        @SuppressWarnings("hiding") PType _type_,
        @SuppressWarnings("hiding") TKwas _kwas_,
        @SuppressWarnings("hiding") TKwnullable _kwnullable_)
    {
        // Constructor
        setType(_type_);

        setKwas(_kwas_);

        setKwnullable(_kwnullable_);

    }

    @Override
    public Object clone()
    {
        return new AAsNullableExternCall(
            cloneNode(this._type_),
            cloneNode(this._kwas_),
            cloneNode(this._kwnullable_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAsNullableExternCall(this);
    }

    public PType getType()
    {
        return this._type_;
    }

    public void setType(PType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
    }

    public TKwas getKwas()
    {
        return this._kwas_;
    }

    public void setKwas(TKwas node)
    {
        if(this._kwas_ != null)
        {
            this._kwas_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwas_ = node;
    }

    public TKwnullable getKwnullable()
    {
        return this._kwnullable_;
    }

    public void setKwnullable(TKwnullable node)
    {
        if(this._kwnullable_ != null)
        {
            this._kwnullable_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwnullable_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._type_)
            + toString(this._kwas_)
            + toString(this._kwnullable_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        if(this._kwas_ == child)
        {
            this._kwas_ = null;
            return;
        }

        if(this._kwnullable_ == child)
        {
            this._kwnullable_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        if(this._kwas_ == oldChild)
        {
            setKwas((TKwas) newChild);
            return;
        }

        if(this._kwnullable_ == oldChild)
        {
            setKwnullable((TKwnullable) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
