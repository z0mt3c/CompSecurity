// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public abstract class kvy extends Binder
    implements kvx
{

    public kvy()
    {
        attachInterface(this, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static kvx a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        if (iinterface != null && (iinterface instanceof kvx))
        {
            return (kvx)iinterface;
        } else
        {
            return new kvz(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj = null;
        Bundle bundle = null;
        boolean flag;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (parcel.readInt() != 0)
            {
                bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            a(bundle);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            f();
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            g();
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            h();
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            i();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            Bundle bundle1 = obj;
            if (parcel.readInt() != 0)
            {
                bundle1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            b(bundle1);
            parcel1.writeNoException();
            if (bundle1 != null)
            {
                parcel1.writeInt(1);
                bundle1.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            j();
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            k();
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            l();
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            d();
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            flag = e();
            parcel1.writeNoException();
            break;
        }
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel1.writeInt(i);
        return true;
    }
}
