// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.widget:
//            NestedScrollView

static class a extends android.view.w.SavedState
{

    public static final android.os.iew.SavedState.a CREATOR = new android.os.Parcelable.Creator() {

        public NestedScrollView.SavedState a(Parcel parcel)
        {
            return new NestedScrollView.SavedState(parcel);
        }

        public NestedScrollView.SavedState[] a(int i)
        {
            return new NestedScrollView.SavedState[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    public int a;

    public String toString()
    {
        return (new StringBuilder()).append("HorizontalScrollView.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" scrollPosition=").append(a).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.arcel(parcel, i);
        parcel.writeInt(a);
    }


    public _cls1(Parcel parcel)
    {
        super(parcel);
        a = parcel.readInt();
    }

    a(Parcelable parcelable)
    {
        super(parcelable);
    }
}
