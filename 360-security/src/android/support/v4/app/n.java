// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

class n extends FrameLayout
{

    public n(Context context)
    {
        super(context);
    }

    static ViewGroup a(View view)
    {
        n n1 = new n(view.getContext());
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (layoutparams != null)
        {
            n1.setLayoutParams(layoutparams);
        }
        view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        n1.addView(view);
        return n1;
    }

    protected void dispatchRestoreInstanceState(SparseArray sparsearray)
    {
        dispatchThawSelfOnly(sparsearray);
    }

    protected void dispatchSaveInstanceState(SparseArray sparsearray)
    {
        dispatchFreezeSelfOnly(sparsearray);
    }
}
