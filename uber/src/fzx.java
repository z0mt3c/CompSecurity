// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.OkHttpClient;

public final class fzx
    implements hst
{

    static final boolean a;
    private final fzv b;
    private final hzb c;
    private final hzb d;

    private fzx(fzv fzv1, hzb hzb1, hzb hzb2)
    {
        if (!a && fzv1 == null)
        {
            throw new AssertionError();
        }
        b = fzv1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        } else
        {
            d = hzb2;
            return;
        }
    }

    public static hst a(fzv fzv1, hzb hzb1, hzb hzb2)
    {
        return new fzx(fzv1, hzb1, hzb2);
    }

    private dwt b()
    {
        return fzv.a((cev)c.a(), (OkHttpClient)d.a());
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!fzx.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
