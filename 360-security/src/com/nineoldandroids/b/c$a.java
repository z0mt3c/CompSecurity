// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.b;

import android.view.View;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.nineoldandroids.b:
//            c

private class <init>
    implements com.nineoldandroids.a.<init>, com.nineoldandroids.a.t>
{

    final c a;

    public void a(a a1)
    {
        if (com.nineoldandroids.b.c.b(a) != null)
        {
            com.nineoldandroids.b.c.b(a).a(a1);
        }
    }

    public void a(o o1)
    {
        float f;
        f = o1.p();
        o1 = (a)com.nineoldandroids.b.c.c(a).get(o1);
        if ((((a) (o1)).a & 0x1ff) != 0)
        {
            View view = (View)com.nineoldandroids.b.c.d(a).get();
            if (view != null)
            {
                view.invalidate();
            }
        }
        o1 = ((te) (o1)).b;
        if (o1 == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = o1.size();
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        o1 = (View)com.nineoldandroids.b.c.d(a).get();
        if (o1 != null)
        {
            o1.invalidate();
        }
        return;
_L3:
        a a1 = (te)o1.get(i);
        float f1 = a1.b;
        float f2 = a1.c;
        com.nineoldandroids.b.c.a(a, a1.a, f1 + f2 * f);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void b(a a1)
    {
        if (com.nineoldandroids.b.c.b(a) != null)
        {
            com.nineoldandroids.b.c.b(a).b(a1);
        }
        com.nineoldandroids.b.c.c(a).remove(a1);
        if (com.nineoldandroids.b.c.c(a).isEmpty())
        {
            com.nineoldandroids.b.c.a(a, null);
        }
    }

    public void c(a a1)
    {
        if (com.nineoldandroids.b.c.b(a) != null)
        {
            com.nineoldandroids.b.c.b(a).c(a1);
        }
    }

    public void d(a a1)
    {
        if (com.nineoldandroids.b.c.b(a) != null)
        {
            com.nineoldandroids.b.c.b(a).d(a1);
        }
    }

    private e(c c1)
    {
        a = c1;
        super();
    }

    a(c c1, a a1)
    {
        this(c1);
    }
}
