// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;

import android.animation.Animator;
import android.widget.ImageView;
import com.snapchat.android.ui.ImageResourceView;
import com.snapchat.android.ui.TextureVideoView;

// Referenced classes of package com.snapchat.android.model.chat:
//            ChatVideoItemProxy

final class val.hasOverlay
    implements android.animation.ener
{

    boolean mCanceled;
    final ChatVideoItemProxy this$0;
    final boolean val$hasOverlay;

    public final void onAnimationCancel(Animator animator)
    {
        mCanceled = true;
        ChatVideoItemProxy.c(ChatVideoItemProxy.this, false);
        ChatVideoItemProxy.o(ChatVideoItemProxy.this).setAlpha(1.0F);
        ChatVideoItemProxy.n(ChatVideoItemProxy.this).setVisibility(8);
        ChatVideoItemProxy.f(ChatVideoItemProxy.this).setVisibility(8);
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (!mCanceled)
        {
            ChatVideoItemProxy.o(ChatVideoItemProxy.this).setVisibility(8);
        }
        ChatVideoItemProxy.p(ChatVideoItemProxy.this);
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
        if (val$hasOverlay)
        {
            ChatVideoItemProxy.n(ChatVideoItemProxy.this).setAlpha(0.0F);
            ChatVideoItemProxy.n(ChatVideoItemProxy.this).setVisibility(0);
        }
        ChatVideoItemProxy.f(ChatVideoItemProxy.this).setAlpha(0.0F);
        ChatVideoItemProxy.f(ChatVideoItemProxy.this).setVisibility(0);
    }

    ()
    {
        this$0 = final_chatvideoitemproxy;
        val$hasOverlay = Z.this;
        super();
    }
}
