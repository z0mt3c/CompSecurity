// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import android.content.DialogInterface;

// Referenced classes of package com.soundcloud.android.onboarding:
//            OnboardActivity

class this._cls0
    implements android.content.ClickListener
{

    final OnboardActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        requestFacebookEmail();
    }

    _cls9()
    {
        this$0 = OnboardActivity.this;
        super();
    }
}
