// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.appdatasearch.UsageInfo;

final class kyr
    implements kyp
{

    private IBinder a;

    kyr(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(com.google.android.gms.appdatasearch.GetRecentContextCall.Request request, kys kys1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (request == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        request.writeToParcel(parcel, 0);
_L3:
        if (kys1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        request = kys1.asBinder();
_L4:
        parcel.writeStrongBinder(request);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        request;
        parcel1.recycle();
        parcel.recycle();
        throw request;
        request = null;
          goto _L4
    }

    public final void a(kys kys1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (kys1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        kys1 = kys1.asBinder();
_L1:
        parcel.writeStrongBinder(kys1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        kys1 = null;
          goto _L1
        kys1;
        parcel1.recycle();
        parcel.recycle();
        throw kys1;
    }

    public final void a(kys kys1, String s, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (kys1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        kys1 = kys1.asBinder();
_L1:
        parcel.writeStrongBinder(kys1);
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        kys1 = null;
          goto _L1
        kys1;
        parcel1.recycle();
        parcel.recycle();
        throw kys1;
    }

    public final void a(kys kys1, String s, UsageInfo ausageinfo[])
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (kys1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        kys1 = kys1.asBinder();
_L1:
        parcel.writeStrongBinder(kys1);
        parcel.writeString(s);
        parcel.writeTypedArray(ausageinfo, 0);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        kys1 = null;
          goto _L1
        kys1;
        parcel1.recycle();
        parcel.recycle();
        throw kys1;
    }

    public final void a(kys kys1, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (kys1 == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        kys1 = kys1.asBinder();
_L1:
        parcel.writeStrongBinder(kys1);
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        kys1 = null;
          goto _L1
        kys1;
        parcel1.recycle();
        parcel.recycle();
        throw kys1;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b(kys kys1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (kys1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        kys1 = kys1.asBinder();
_L1:
        parcel.writeStrongBinder(kys1);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        kys1 = null;
          goto _L1
        kys1;
        parcel1.recycle();
        parcel.recycle();
        throw kys1;
    }
}
