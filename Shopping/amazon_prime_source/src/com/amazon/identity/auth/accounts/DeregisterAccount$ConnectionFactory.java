// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.identity.auth.accounts;


// Referenced classes of package com.amazon.identity.auth.accounts:
//            DeregisterAccount, AccountRegistrar, SubAuthenticatorDescription, SubAuthenticatorConnection

public static interface 
{

    public abstract AccountRegistrar createAccountRegistrar();

    public abstract SubAuthenticatorConnection createSubAuthConnection(SubAuthenticatorDescription subauthenticatordescription);
}
