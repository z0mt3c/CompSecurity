// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;
import android.view.View;

public interface bo
    extends MenuItem
{

    public abstract bo a(cp cp);

    public abstract bo a(dc.e e);

    public abstract cp a();

    public abstract boolean collapseActionView();

    public abstract boolean expandActionView();

    public abstract View getActionView();

    public abstract boolean isActionViewExpanded();

    public abstract MenuItem setActionView(int i);

    public abstract MenuItem setActionView(View view);

    public abstract void setShowAsAction(int i);

    public abstract MenuItem setShowAsActionFlags(int i);
}
