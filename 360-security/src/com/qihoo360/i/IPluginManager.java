// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.i;

import android.content.Context;

// Referenced classes of package com.qihoo360.i:
//            IModule

public interface IPluginManager
{

    public abstract IModule query(String s, Class class1);

    public abstract Context queryPluginContext(String s);
}
