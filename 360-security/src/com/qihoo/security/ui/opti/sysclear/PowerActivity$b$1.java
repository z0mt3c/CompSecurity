// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;

import android.view.View;
import android.widget.CheckBox;
import com.qihoo.security.support.b;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear:
//            PowerActivity

class a
    implements android.view.er
{

    final a a;
    final a b;

    public void onClick(View view)
    {
        int i;
        boolean flag;
        flag = ((CheckBox)view).isChecked();
        i = PowerActivity.f(b.b);
        if (!a.a.equals("rom_sys_info")) goto _L2; else goto _L1
_L1:
        Iterator iterator = a(b).iterator();
        while (iterator.hasNext()) 
        {
            a a1 = (b)iterator.next();
            if (flag)
            {
                if (!a1.b)
                {
                    PowerActivity.e(b.b, a1.b);
                }
            } else
            if (a1.b)
            {
                PowerActivity.f(b.b, a1.b);
            }
            a1.b = flag;
        }
          goto _L3
_L2:
        if (!flag) goto _L5; else goto _L4
_L4:
        PowerActivity.e(b.b, a.a);
        a.a = true;
        if (a.a)
        {
            com.qihoo.security.support.b.c(11308);
        }
_L3:
        ((CheckBox)view).setChecked(flag);
        b.tifyDataSetChanged();
        PowerActivity.a(b.b, false, PowerActivity.f(b.b), i);
        return;
_L5:
        PowerActivity.f(b.b, a.a);
        a.a = false;
        if (!a.a)
        {
            com.qihoo.security.support.b.c(11307);
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    ( ,  1)
    {
        b = ;
        a = 1;
        super();
    }
}
