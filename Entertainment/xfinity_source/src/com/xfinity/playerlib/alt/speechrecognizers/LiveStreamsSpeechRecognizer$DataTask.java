// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.xfinity.playerlib.alt.speechrecognizers;

import com.comcast.cim.cmasl.taskexecutor.task.NonCachingBaseTask;
import com.comcast.cim.cmasl.taskexecutor.task.Task;
import com.comcast.cim.cmasl.utils.container.Tuple3;
import com.xfinity.playerlib.model.consumable.hal.HalLiveStreamResource;
import com.xfinity.playerlib.model.database.LiveStreamBookmarkDAO;
import com.xfinity.playerlib.model.entitlement.VideoEntitlement;

// Referenced classes of package com.xfinity.playerlib.alt.speechrecognizers:
//            LiveStreamsSpeechRecognizer

private class <init> extends NonCachingBaseTask
{

    final LiveStreamsSpeechRecognizer this$0;

    public Tuple3 execute()
    {
        java.util.List list = LiveStreamsSpeechRecognizer.access$500(LiveStreamsSpeechRecognizer.this).getFavorites();
        return new Tuple3((VideoEntitlement)LiveStreamsSpeechRecognizer.access$600(LiveStreamsSpeechRecognizer.this).execute(), (HalLiveStreamResource)LiveStreamsSpeechRecognizer.access$700(LiveStreamsSpeechRecognizer.this).execute(), list);
    }

    public volatile Object execute()
    {
        return execute();
    }

    private ()
    {
        this$0 = LiveStreamsSpeechRecognizer.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
