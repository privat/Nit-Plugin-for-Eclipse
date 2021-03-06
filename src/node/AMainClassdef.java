/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AMainClassdef extends PClassdef
{
    private final LinkedList<PPropdef> _propdefs_ = new LinkedList<PPropdef>();

    public AMainClassdef()
    {
        // Constructor
    }

    public AMainClassdef(
        @SuppressWarnings("hiding") List<PPropdef> _propdefs_)
    {
        // Constructor
        setPropdefs(_propdefs_);

    }

    @Override
    public Object clone()
    {
        return new AMainClassdef(
            cloneList(this._propdefs_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMainClassdef(this);
    }

    public LinkedList<PPropdef> getPropdefs()
    {
        return this._propdefs_;
    }

    public void setPropdefs(List<PPropdef> list)
    {
        this._propdefs_.clear();
        this._propdefs_.addAll(list);
        for(PPropdef e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._propdefs_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._propdefs_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PPropdef> i = this._propdefs_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PPropdef) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
