// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;


// Referenced classes of package android.support.v4.view.a:
//            f

public class android.support.v4.view.a.e
{
    static class a extends e
    {

        public Object a()
        {
            return f.a();
        }

        public void a(Object obj, int i)
        {
            f.a(obj, i);
        }

        public void a(Object obj, boolean flag)
        {
            f.a(obj, flag);
        }

        public void b(Object obj, int i)
        {
            f.b(obj, i);
        }

        public void c(Object obj, int i)
        {
            f.c(obj, i);
        }

        a()
        {
        }
    }

    static class b extends a
    {

        b()
        {
        }
    }

    static interface c
    {

        public abstract Object a();

        public abstract void a(Object obj, int i);

        public abstract void a(Object obj, boolean flag);

        public abstract void b(Object obj, int i);

        public abstract void c(Object obj, int i);
    }

    static class d extends b
    {

        d()
        {
        }
    }

    static class e
        implements c
    {

        public Object a()
        {
            return null;
        }

        public void a(Object obj, int i)
        {
        }

        public void a(Object obj, boolean flag)
        {
        }

        public void b(Object obj, int i)
        {
        }

        public void c(Object obj, int i)
        {
        }

        e()
        {
        }
    }


    private static final c a;
    private final Object b;

    public android.support.v4.view.a.e(Object obj)
    {
        b = obj;
    }

    public static android.support.v4.view.a.e a()
    {
        return new android.support.v4.view.a.e(a.a());
    }

    public void a(int i)
    {
        a.b(b, i);
    }

    public void a(boolean flag)
    {
        a.a(b, flag);
    }

    public void b(int i)
    {
        a.a(b, i);
    }

    public void c(int i)
    {
        a.c(b, i);
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (android.support.v4.view.a.e)obj;
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((android.support.v4.view.a.e) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((android.support.v4.view.a.e) (obj)).b)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.hashCode();
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new d();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            a = new b();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new a();
        } else
        {
            a = new e();
        }
    }
}
