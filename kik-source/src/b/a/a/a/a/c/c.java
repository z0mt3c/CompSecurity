// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.c;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package b.a.a.a.a.c:
//            a

final class c extends a.e
{

    final a a;

    c(a a1)
    {
        a = a1;
        super((byte)0);
    }

    public final Object call()
    {
        b.a.a.a.a.c.a.a(a).set(true);
        Process.setThreadPriority(10);
        return b.a.a.a.a.c.a.a(a, a.e());
    }
}
