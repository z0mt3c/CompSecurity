// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//            NativeCrashWriter, CodedOutputStream

private static final class f extends e
{

    private final float a;
    private final int b;
    private final boolean c;
    private final int d;
    private final long e;
    private final long f;

    public final int a()
    {
        return CodedOutputStream.a() + 0 + CodedOutputStream.c(b) + CodedOutputStream.b(3) + CodedOutputStream.c(4, d) + CodedOutputStream.b(5, e) + CodedOutputStream.b(6, f);
    }

    public final void a(CodedOutputStream codedoutputstream)
        throws IOException
    {
        codedoutputstream.a(a);
        codedoutputstream.a(b);
        codedoutputstream.a(3, c);
        codedoutputstream.a(4, d);
        codedoutputstream.a(5, e);
        codedoutputstream.a(6, f);
    }

    public e(float f1, int i, boolean flag, int j, long l, long l1)
    {
        super(5, new e[0]);
        a = f1;
        b = i;
        c = flag;
        d = j;
        e = l;
        f = l1;
    }
}
