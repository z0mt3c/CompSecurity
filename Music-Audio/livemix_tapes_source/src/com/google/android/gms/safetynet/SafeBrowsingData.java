// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.safetynet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.safetynet:
//            zzb

public class SafeBrowsingData
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    public final int mVersionCode;
    private String zzaNB;

    SafeBrowsingData(int i, String s)
    {
        mVersionCode = i;
        zzaNB = s;
    }

    public SafeBrowsingData(String s)
    {
        this(1, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getMetadata()
    {
        return zzaNB;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

}
