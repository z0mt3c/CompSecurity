// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import android.content.Context;
import com.qihoo360.mobilesafe.support.a;
import com.qihoo360.mobilesafe.support.a.b;
import java.util.ArrayList;

// Referenced classes of package com.qihoo360.common.utils:
//            RootEnhance, Utils

class b
    implements Runnable
{

    final String a = "app_process";
    private final Context b;

    public void run()
    {
        Object obj;
        Object obj1;
        Object aobj[];
        aobj = new Object[2];
        obj = null;
        obj1 = obj;
        Object obj2 = com.qihoo360.mobilesafe.support.a.a("app_process");
        obj1 = obj;
        obj = com.qihoo360.mobilesafe.support.a.a(b, aobj);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        if (((b) (obj)).a()) goto _L4; else goto _L3
_L3:
        obj1 = obj;
        boolean flag = ((b) (obj)).a(30000L);
        if (flag) goto _L4; else goto _L2
_L2:
        if (obj != null)
        {
            com.qihoo360.mobilesafe.support.a.b(b, aobj);
        }
_L5:
        return;
_L4:
        obj1 = obj;
        ArrayList arraylist = new ArrayList(4);
        obj1 = obj;
        arraylist.add(obj2);
        obj1 = obj;
        arraylist.add("com.qihoo360.RFS");
        obj1 = obj;
        arraylist.add("-reboot");
        obj1 = obj;
        ArrayList arraylist1 = new ArrayList();
        obj1 = obj;
        arraylist1.add((new StringBuilder("CLASSPATH=")).append(com.qihoo360.mobilesafe.support.a.f(b)).toString());
        obj1 = obj;
        com.qihoo360.mobilesafe.support.a.a(((b) (obj)), Utils.pathAppend(((String) (obj2)), "app_process"), arraylist, arraylist1, 0L);
        if (obj != null)
        {
            com.qihoo360.mobilesafe.support.a.b(b, aobj);
            return;
        }
          goto _L5
        obj;
        if (obj1 == null) goto _L5; else goto _L6
_L6:
        com.qihoo360.mobilesafe.support.a.b(b, aobj);
        return;
        obj;
        obj2 = null;
        obj1 = obj;
_L8:
        if (obj2 != null)
        {
            com.qihoo360.mobilesafe.support.a.b(b, aobj);
        }
        throw obj1;
        obj1;
        obj2 = obj;
        if (true) goto _L8; else goto _L7
_L7:
    }

    (Context context)
    {
        b = context;
        super();
    }
}
