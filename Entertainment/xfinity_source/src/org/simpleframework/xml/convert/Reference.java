// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.simpleframework.xml.convert;

import org.simpleframework.xml.strategy.Value;

class Reference
    implements Value
{

    private Object data;
    private Value value;

    public Reference(Value value1, Object obj)
    {
        value = value1;
        data = obj;
    }

    public int getLength()
    {
        return 0;
    }

    public Class getType()
    {
        return data.getClass();
    }

    public Object getValue()
    {
        return data;
    }

    public boolean isReference()
    {
        return true;
    }

    public void setValue(Object obj)
    {
        if (value != null)
        {
            value.setValue(obj);
        }
        data = obj;
    }
}
