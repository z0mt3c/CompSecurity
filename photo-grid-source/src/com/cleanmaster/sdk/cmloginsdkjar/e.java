// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar;

import com.cleanmaster.sdk.cmloginsdkjar.model.CmRawObject;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar:
//            Response

final class e
    implements Request.Callback
{

    final Request.CmProxyLoginRegisterCallback a;

    e(Request.CmProxyLoginRegisterCallback cmproxyloginregistercallback)
    {
        a = cmproxyloginregistercallback;
        super();
    }

    public final void onCompleted(Response response)
    {
        if (a != null)
        {
            a.onCompleted((CmRawObject)response.getGraphObjectAs(com/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject), response);
        }
    }
}
