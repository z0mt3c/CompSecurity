// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ar, aq, dd, da, 
//            bo

static final class 
    implements ar
{

    public void a(dd dd1, Map map)
    {
        dd1 = dd1.ba();
        if (dd1 == null)
        {
            da.w("A GMSG tried to close something that wasn't an overlay.");
            return;
        } else
        {
            dd1.close();
            return;
        }
    }

    ()
    {
    }
}
