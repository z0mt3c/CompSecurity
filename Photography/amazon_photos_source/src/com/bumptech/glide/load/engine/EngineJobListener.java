// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;

// Referenced classes of package com.bumptech.glide.load.engine:
//            EngineJob, EngineResource

interface EngineJobListener
{

    public abstract void onEngineJobCancelled(EngineJob enginejob, Key key);

    public abstract void onEngineJobComplete(Key key, EngineResource engineresource);
}
