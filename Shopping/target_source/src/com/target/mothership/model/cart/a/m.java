// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.target.mothership.model.cart.a;

import com.target.mothership.model.cart.interfaces.a.h;
import com.target.mothership.model.common.a.g;
import com.target.mothership.services.x;

// Referenced classes of package com.target.mothership.model.cart.a:
//            l

public class m
    implements g
{

    com.target.mothership.model.common.a.h mErrorSetTransformer;
    l mJsonTransformer;

    public m()
    {
        mJsonTransformer = new l();
    }

    public h a(x x1)
    {
        h h1 = new h();
        mErrorSetTransformer = new com.target.mothership.model.common.a.h(mJsonTransformer, h1);
        return (h)mErrorSetTransformer.a(x1);
    }

    public volatile Object a(Object obj)
    {
        return a((x)obj);
    }
}
