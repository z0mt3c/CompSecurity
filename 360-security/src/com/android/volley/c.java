// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            m, VolleyError

public class c
    implements m
{

    private int a;
    private int b;
    private final int c;
    private final float d;

    public c()
    {
        this(2500, 1, 1.0F);
    }

    public c(int i, int j, float f)
    {
        a = i;
        c = j;
        d = f;
    }

    public int a()
    {
        return a;
    }

    public void a(VolleyError volleyerror)
        throws VolleyError
    {
        b = b + 1;
        a = (int)((float)a + (float)a * d);
        if (!c())
        {
            throw volleyerror;
        } else
        {
            return;
        }
    }

    public int b()
    {
        return b;
    }

    protected boolean c()
    {
        return b <= c;
    }
}
