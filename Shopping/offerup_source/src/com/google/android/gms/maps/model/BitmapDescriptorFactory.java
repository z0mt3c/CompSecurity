// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.model.internal.zza;

// Referenced classes of package com.google.android.gms.maps.model:
//            BitmapDescriptor, RuntimeRemoteException

public final class BitmapDescriptorFactory
{

    public static final float HUE_AZURE = 210F;
    public static final float HUE_BLUE = 240F;
    public static final float HUE_CYAN = 180F;
    public static final float HUE_GREEN = 120F;
    public static final float HUE_MAGENTA = 300F;
    public static final float HUE_ORANGE = 30F;
    public static final float HUE_RED = 0F;
    public static final float HUE_ROSE = 330F;
    public static final float HUE_VIOLET = 270F;
    public static final float HUE_YELLOW = 60F;
    private static zza zzaJH;

    private BitmapDescriptorFactory()
    {
    }

    public static BitmapDescriptor defaultMarker()
    {
        BitmapDescriptor bitmapdescriptor;
        try
        {
            bitmapdescriptor = new BitmapDescriptor(zzxX().zzyc());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return bitmapdescriptor;
    }

    public static BitmapDescriptor defaultMarker(float f)
    {
        BitmapDescriptor bitmapdescriptor;
        try
        {
            bitmapdescriptor = new BitmapDescriptor(zzxX().zzh(f));
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return bitmapdescriptor;
    }

    public static BitmapDescriptor fromAsset(String s)
    {
        try
        {
            s = new BitmapDescriptor(zzxX().zzdE(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeRemoteException(s);
        }
        return s;
    }

    public static BitmapDescriptor fromBitmap(Bitmap bitmap)
    {
        try
        {
            bitmap = new BitmapDescriptor(zzxX().zzb(bitmap));
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            throw new RuntimeRemoteException(bitmap);
        }
        return bitmap;
    }

    public static BitmapDescriptor fromFile(String s)
    {
        try
        {
            s = new BitmapDescriptor(zzxX().zzdF(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeRemoteException(s);
        }
        return s;
    }

    public static BitmapDescriptor fromPath(String s)
    {
        try
        {
            s = new BitmapDescriptor(zzxX().zzdG(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeRemoteException(s);
        }
        return s;
    }

    public static BitmapDescriptor fromResource(int i)
    {
        BitmapDescriptor bitmapdescriptor;
        try
        {
            bitmapdescriptor = new BitmapDescriptor(zzxX().zzhV(i));
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return bitmapdescriptor;
    }

    public static void zza(zza zza1)
    {
        if (zzaJH != null)
        {
            return;
        } else
        {
            zzaJH = (zza)zzx.zzw(zza1);
            return;
        }
    }

    private static zza zzxX()
    {
        return (zza)zzx.zzb(zzaJH, "IBitmapDescriptorFactory is not initialized");
    }
}
