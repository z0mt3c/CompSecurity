// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.io.OutputStream;
import org.json.JSONArray;

// Referenced classes of package a.a:
//            av, ct, ew, cu, 
//            en

public final class cs extends av
{

    public static final cs a;
    private String b;
    private String c;
    private String d;
    private ct e;

    public cs(String s, ct ct1)
    {
        this(s, ew.a.a(), ct1);
    }

    private cs(String s, String s1, ct ct1)
    {
        d = cu.a.a();
        String s2 = s;
        if (s.length() > 140)
        {
            s2 = s.substring(0, 140);
        }
        b = s2;
        c = s1;
        e = ct1;
    }

    public final void a(OutputStream outputstream)
    {
        Object obj = new JSONArray();
        ((JSONArray) (obj)).put(b);
        ((JSONArray) (obj)).put(c);
        obj = ((JSONArray) (obj)).toString();
        (new StringBuilder("BREADCRUMB WRITING ")).append(((String) (obj)));
        en.b();
        outputstream.write(((String) (obj)).getBytes());
    }

    public final String f()
    {
        return d;
    }

    static 
    {
        a = new cs("session_start", ct.a);
    }
}
