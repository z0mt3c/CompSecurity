// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.service;

import android.os.Parcel;

// Referenced classes of package com.qihoo.security.opti.trashclear.service:
//            TrashInfoSub

static final class 
    implements android.os.tor
{

    public TrashInfoSub a(Parcel parcel)
    {
        return new TrashInfoSub(parcel);
    }

    public TrashInfoSub[] a(int i)
    {
        return new TrashInfoSub[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
