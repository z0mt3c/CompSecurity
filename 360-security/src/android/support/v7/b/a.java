// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.b;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class android.support.v7.b.a
{
    public static interface a
    {

        public abstract void a(android.support.v7.b.a a1);

        public abstract boolean a(android.support.v7.b.a a1, Menu menu);

        public abstract boolean a(android.support.v7.b.a a1, MenuItem menuitem);

        public abstract boolean b(android.support.v7.b.a a1, Menu menu);
    }


    private Object mTag;
    private boolean mTitleOptionalHint;

    public android.support.v7.b.a()
    {
    }

    public abstract void finish();

    public abstract View getCustomView();

    public abstract Menu getMenu();

    public abstract MenuInflater getMenuInflater();

    public abstract CharSequence getSubtitle();

    public Object getTag()
    {
        return mTag;
    }

    public abstract CharSequence getTitle();

    public boolean getTitleOptionalHint()
    {
        return mTitleOptionalHint;
    }

    public abstract void invalidate();

    public boolean isTitleOptional()
    {
        return false;
    }

    public boolean isUiFocusable()
    {
        return true;
    }

    public abstract void setCustomView(View view);

    public abstract void setSubtitle(int i);

    public abstract void setSubtitle(CharSequence charsequence);

    public void setTag(Object obj)
    {
        mTag = obj;
    }

    public abstract void setTitle(int i);

    public abstract void setTitle(CharSequence charsequence);

    public void setTitleOptionalHint(boolean flag)
    {
        mTitleOptionalHint = flag;
    }
}
