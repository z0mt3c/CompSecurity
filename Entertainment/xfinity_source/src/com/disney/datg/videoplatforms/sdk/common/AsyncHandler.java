// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.disney.datg.videoplatforms.sdk.common;


public interface AsyncHandler
{

    public abstract void onAsyncTask();

    public abstract void onError(Exception exception);

    public abstract void onSuccess(Object obj);
}
