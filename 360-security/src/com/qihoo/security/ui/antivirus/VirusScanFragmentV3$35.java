// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import com.qihoo.security.ui.fragment.utils.FragmentAction;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            VirusScanFragmentV3

static class 
{

    static final int a[];

    static 
    {
        a = new int[FragmentAction.values().length];
        try
        {
            a[FragmentAction.RESULT_ACTION_FINISH.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[FragmentAction.RESULT_ACTION_SWITCH_TAB.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[FragmentAction.RESULT_ACTION_SKIP_SUB_MODULE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[FragmentAction.RESULT_ACTION_SKIP_DRAWER.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
