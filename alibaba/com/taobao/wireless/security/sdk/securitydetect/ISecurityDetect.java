// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.wireless.security.sdk.securitydetect;

import com.taobao.wireless.security.sdk.IComponent;

public interface ISecurityDetect
    extends IComponent
{
    public static interface IInjectionCB
    {

        public abstract void onInjection(int i);
    }


    public abstract void registerInjectionCB(IInjectionCB iinjectioncb);
}
