// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.cardlist;

import android.app.Activity;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.cardlist:
//            PaymentCardListItemBinder

public final class  extends Binding
    implements Provider
{

    private Binding activity;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/cardlist/PaymentCardListItemBinder, getClass().getClassLoader());
    }

    public final PaymentCardListItemBinder get()
    {
        return new PaymentCardListItemBinder((Activity)activity.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
    }

    public ()
    {
        super("com.google.android.apps.wallet.cardlist.PaymentCardListItemBinder", "members/com.google.android.apps.wallet.cardlist.PaymentCardListItemBinder", false, com/google/android/apps/wallet/cardlist/PaymentCardListItemBinder);
    }
}
