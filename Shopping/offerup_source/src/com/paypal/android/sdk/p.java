// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.HashSet;

// Referenced classes of package com.paypal.android.sdk:
//            o

final class p extends HashSet
{

    p()
    {
        o ao[] = o.values();
        int j = ao.length;
        for (int i = 0; i < j; i++)
        {
            o o1 = ao[i];
            if (o.a(o1))
            {
                add(o1.a());
            }
        }

    }
}
