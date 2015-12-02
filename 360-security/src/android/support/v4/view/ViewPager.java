// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.widget.d;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//            o, m, s, z, 
//            g, q, a

public class ViewPager extends ViewGroup
{
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams
    {

        public boolean a;
        public int b;
        float c;
        boolean d;
        int e;
        int f;

        public LayoutParams()
        {
            super(-1, -1);
            c = 0.0F;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            c = 0.0F;
            context = context.obtainStyledAttributes(attributeset, ViewPager.f());
            b = context.getInteger(0, 48);
            context.recycle();
        }
    }

    public static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = android.support.v4.b.a.a(new android.support.v4.b.b() {

            public Object a(Parcel parcel, ClassLoader classloader)
            {
                return b(parcel, classloader);
            }

            public Object[] a(int i1)
            {
                return b(i1);
            }

            public SavedState b(Parcel parcel, ClassLoader classloader)
            {
                return new SavedState(parcel, classloader);
            }

            public SavedState[] b(int i1)
            {
                return new SavedState[i1];
            }

        });
        int a;
        Parcelable b;
        ClassLoader c;

        public String toString()
        {
            return (new StringBuilder()).append("FragmentPager.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" position=").append(a).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
            parcel.writeParcelable(b, i1);
        }


        SavedState(Parcel parcel, ClassLoader classloader)
        {
            super(parcel);
            ClassLoader classloader1 = classloader;
            if (classloader == null)
            {
                classloader1 = getClass().getClassLoader();
            }
            a = parcel.readInt();
            b = parcel.readParcelable(classloader1);
            c = classloader1;
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    static interface a
    {
    }

    static class b
    {

        Object a;
        int b;
        boolean c;
        float d;
        float e;

        b()
        {
        }
    }

    class c extends android.support.v4.view.a
    {

        final ViewPager b;

        private boolean b()
        {
            return ViewPager.a(b) != null && ViewPager.a(b).b() > 1;
        }

        public void a(View view, android.support.v4.view.a.a a1)
        {
            super.a(view, a1);
            a1.b(android/support/v4/view/ViewPager.getName());
            a1.i(b());
            if (b.canScrollHorizontally(1))
            {
                a1.a(4096);
            }
            if (b.canScrollHorizontally(-1))
            {
                a1.a(8192);
            }
        }

        public void d(View view, AccessibilityEvent accessibilityevent)
        {
            super.d(view, accessibilityevent);
            accessibilityevent.setClassName(android/support/v4/view/ViewPager.getName());
            view = android.support.v4.view.a.e.a();
            view.a(b());
            if (accessibilityevent.getEventType() == 4096 && ViewPager.a(b) != null)
            {
                view.a(ViewPager.a(b).b());
                view.b(ViewPager.b(b));
                view.c(ViewPager.b(b));
            }
        }

        c()
        {
            b = ViewPager.this;
            super();
        }
    }

    static interface d
    {

        public abstract void a(o o1, o o2);
    }

    public static interface e
    {

        public abstract void a(int i1);

        public abstract void a(int i1, float f1, int j1);

        public abstract void b(int i1);
    }

    public static interface f
    {

        public abstract void a(View view, float f1);
    }

    private class g extends DataSetObserver
    {

        final ViewPager a;

        public void onChanged()
        {
            a.b();
        }

        public void onInvalidated()
        {
            a.b();
        }

        private g()
        {
            a = ViewPager.this;
            super();
        }

    }

    static class h
        implements Comparator
    {

        public int a(View view, View view1)
        {
            view = (LayoutParams)view.getLayoutParams();
            view1 = (LayoutParams)view1.getLayoutParams();
            if (((LayoutParams) (view)).a != ((LayoutParams) (view1)).a)
            {
                return !((LayoutParams) (view)).a ? -1 : 1;
            } else
            {
                return ((LayoutParams) (view)).e - ((LayoutParams) (view1)).e;
            }
        }

        public int compare(Object obj, Object obj1)
        {
            return a((View)obj, (View)obj1);
        }

        h()
        {
        }
    }


    private static final int a[] = {
        0x10100b3
    };
    private static final h af = new h();
    private static final Comparator c = new Comparator() {

        public int a(b b1, b b2)
        {
            return b1.b - b2.b;
        }

        public int compare(Object obj, Object obj1)
        {
            return a((b)obj, (b)obj1);
        }

    };
    private static final Interpolator d = new Interpolator() {

        public float getInterpolation(float f1)
        {
            f1--;
            return f1 * (f1 * f1 * f1 * f1) + 1.0F;
        }

    };
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private float F;
    private float G;
    private float H;
    private float I;
    private int J;
    private VelocityTracker K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private android.support.v4.widget.d Q;
    private android.support.v4.widget.d R;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V;
    private e W;
    private e Z;
    private d aa;
    private f ab;
    private Method ac;
    private int ad;
    private ArrayList ae;
    private final Runnable ag;
    private int ah;
    private int b;
    private final ArrayList e;
    private final b f;
    private final Rect g;
    private o h;
    private int i;
    private int j;
    private Parcelable k;
    private ClassLoader l;
    private Scroller m;
    private g n;
    private int o;
    private Drawable p;
    private int q;
    private int r;
    private float s;
    private float t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    public ViewPager(Context context)
    {
        super(context);
        e = new ArrayList();
        f = new b();
        g = new Rect();
        j = -1;
        k = null;
        l = null;
        s = -3.402823E+38F;
        t = 3.402823E+38F;
        z = 1;
        J = -1;
        S = true;
        T = false;
        ag = new Runnable() {

            final ViewPager a;

            public void run()
            {
                ViewPager.a(a, 0);
                a.c();
            }

            
            {
                a = ViewPager.this;
                super();
            }
        };
        ah = 0;
        a();
    }

    public ViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = new ArrayList();
        f = new b();
        g = new Rect();
        j = -1;
        k = null;
        l = null;
        s = -3.402823E+38F;
        t = 3.402823E+38F;
        z = 1;
        J = -1;
        S = true;
        T = false;
        ag = new _cls3();
        ah = 0;
        a();
    }

    private int a(int i1, float f1, int j1, int k1)
    {
        if (Math.abs(k1) > N && Math.abs(j1) > L)
        {
            if (j1 <= 0)
            {
                i1++;
            }
        } else
        {
            float f2;
            if (i1 >= i)
            {
                f2 = 0.4F;
            } else
            {
                f2 = 0.6F;
            }
            i1 = (int)(f2 + ((float)i1 + f1));
        }
        j1 = i1;
        if (e.size() > 0)
        {
            b b1 = (b)e.get(0);
            b b2 = (b)e.get(e.size() - 1);
            j1 = Math.max(b1.b, Math.min(i1, b2.b));
        }
        return j1;
    }

    private Rect a(Rect rect, View view)
    {
        if (rect == null)
        {
            rect = new Rect();
        }
        if (view == null)
        {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        for (view = view.getParent(); (view instanceof ViewGroup) && view != this; view = view.getParent())
        {
            view = (ViewGroup)view;
            rect.left = rect.left + view.getLeft();
            rect.right = rect.right + view.getRight();
            rect.top = rect.top + view.getTop();
            rect.bottom = rect.bottom + view.getBottom();
        }

        return rect;
    }

    static o a(ViewPager viewpager)
    {
        return viewpager.h;
    }

    private void a(int i1, int j1, int k1, int l1)
    {
        if (j1 > 0 && !e.isEmpty())
        {
            int i2 = getPaddingLeft();
            int j2 = getPaddingRight();
            int k2 = getPaddingLeft();
            int l2 = getPaddingRight();
            float f1 = (float)getScrollX() / (float)((j1 - k2 - l2) + l1);
            j1 = (int)((float)((i1 - i2 - j2) + k1) * f1);
            scrollTo(j1, getScrollY());
            if (!m.isFinished())
            {
                k1 = m.getDuration();
                l1 = m.timePassed();
                b b1 = b(i);
                m.startScroll(j1, 0, (int)(b1.e * (float)i1), 0, k1 - l1);
            }
        } else
        {
            b b2 = b(i);
            float f2;
            if (b2 != null)
            {
                f2 = Math.min(b2.e, t);
            } else
            {
                f2 = 0.0F;
            }
            i1 = (int)(f2 * (float)(i1 - getPaddingLeft() - getPaddingRight()));
            if (i1 != getScrollX())
            {
                a(false);
                scrollTo(i1, getScrollY());
                return;
            }
        }
    }

    private void a(int i1, boolean flag, int j1, boolean flag1)
    {
        b b1 = b(i1);
        int k1;
        if (b1 != null)
        {
            float f1 = getClientWidth();
            k1 = (int)(Math.max(s, Math.min(b1.e, t)) * f1);
        } else
        {
            k1 = 0;
        }
        if (flag)
        {
            a(k1, 0, j1);
            if (flag1 && W != null)
            {
                W.a(i1);
            }
            if (flag1 && Z != null)
            {
                Z.a(i1);
            }
            return;
        }
        if (flag1 && W != null)
        {
            W.a(i1);
        }
        if (flag1 && Z != null)
        {
            Z.a(i1);
        }
        a(false);
        scrollTo(k1, 0);
        d(k1);
    }

    private void a(b b1, int i1, b b2)
    {
        int i3 = h.b();
        int j1 = getClientWidth();
        float f4;
        if (j1 > 0)
        {
            f4 = (float)o / (float)j1;
        } else
        {
            f4 = 0.0F;
        }
        if (b2 != null)
        {
            j1 = b2.b;
            if (j1 < b1.b)
            {
                float f1 = b2.e + b2.d + f4;
                j1++;
                int j2;
                for (int k1 = 0; j1 <= b1.b && k1 < e.size(); j1 = j2 + 1)
                {
                    b2 = (b)e.get(k1);
                    float f5;
                    do
                    {
                        j2 = j1;
                        f5 = f1;
                        if (j1 <= b2.b)
                        {
                            break;
                        }
                        j2 = j1;
                        f5 = f1;
                        if (k1 >= e.size() - 1)
                        {
                            break;
                        }
                        k1++;
                        b2 = (b)e.get(k1);
                    } while (true);
                    for (; j2 < b2.b; j2++)
                    {
                        f5 += h.d(j2) + f4;
                    }

                    b2.e = f5;
                    f1 = f5 + (b2.d + f4);
                }

            } else
            if (j1 > b1.b)
            {
                int l1 = e.size() - 1;
                float f2 = b2.e;
                int k2;
                for (j1--; j1 >= b1.b && l1 >= 0; j1 = k2 - 1)
                {
                    b2 = (b)e.get(l1);
                    float f6;
                    do
                    {
                        k2 = j1;
                        f6 = f2;
                        if (j1 >= b2.b)
                        {
                            break;
                        }
                        k2 = j1;
                        f6 = f2;
                        if (l1 <= 0)
                        {
                            break;
                        }
                        l1--;
                        b2 = (b)e.get(l1);
                    } while (true);
                    for (; k2 > b2.b; k2--)
                    {
                        f6 -= h.d(k2) + f4;
                    }

                    f2 = f6 - (b2.d + f4);
                    b2.e = f2;
                }

            }
        }
        int l2 = e.size();
        float f7 = b1.e;
        j1 = b1.b - 1;
        float f3;
        int i2;
        if (b1.b == 0)
        {
            f3 = b1.e;
        } else
        {
            f3 = -3.402823E+38F;
        }
        s = f3;
        if (b1.b == i3 - 1)
        {
            f3 = (b1.e + b1.d) - 1.0F;
        } else
        {
            f3 = 3.402823E+38F;
        }
        t = f3;
        i2 = i1 - 1;
        f3 = f7;
        for (; i2 >= 0; i2--)
        {
            for (b2 = (b)e.get(i2); j1 > b2.b; j1--)
            {
                f3 -= h.d(j1) + f4;
            }

            f3 -= b2.d + f4;
            b2.e = f3;
            if (b2.b == 0)
            {
                s = f3;
            }
            j1--;
        }

        f3 = b1.e + b1.d + f4;
        i2 = b1.b + 1;
        j1 = i1 + 1;
        i1 = i2;
        for (; j1 < l2; j1++)
        {
            for (b1 = (b)e.get(j1); i1 < b1.b; i1++)
            {
                f3 = h.d(i1) + f4 + f3;
            }

            if (b1.b == i3 - 1)
            {
                t = (b1.d + f3) - 1.0F;
            }
            b1.e = f3;
            f3 += b1.d + f4;
            i1++;
        }

        T = false;
    }

    static void a(ViewPager viewpager, int i1)
    {
        viewpager.setScrollState(i1);
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = android.support.v4.view.m.b(motionevent);
        if (android.support.v4.view.m.b(motionevent, i1) == J)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            F = android.support.v4.view.m.c(motionevent, i1);
            J = android.support.v4.view.m.b(motionevent, i1);
            if (K != null)
            {
                K.clear();
            }
        }
    }

    private void a(boolean flag)
    {
label0:
        {
            int i1;
            boolean flag1;
            boolean flag2;
            if (ah == 2)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                setScrollingCacheEnabled(false);
                m.abortAnimation();
                int j1 = getScrollX();
                int k1 = getScrollY();
                int l1 = m.getCurrX();
                int i2 = m.getCurrY();
                if (j1 != l1 || k1 != i2)
                {
                    scrollTo(l1, i2);
                }
            }
            y = false;
            flag2 = false;
            flag1 = i1;
            for (i1 = ((flag2) ? 1 : 0); i1 < e.size(); i1++)
            {
                b b1 = (b)e.get(i1);
                if (b1.c)
                {
                    b1.c = false;
                    flag1 = true;
                }
            }

            if (flag1)
            {
                if (!flag)
                {
                    break label0;
                }
                android.support.v4.view.s.a(this, ag);
            }
            return;
        }
        ag.run();
    }

    private boolean a(float f1, float f2)
    {
        return f1 < (float)D && f2 > 0.0F || f1 > (float)(getWidth() - D) && f2 < 0.0F;
    }

    static int b(ViewPager viewpager)
    {
        return viewpager.i;
    }

    private void b(boolean flag)
    {
        int j1 = getChildCount();
        int i1 = 0;
        while (i1 < j1) 
        {
            byte byte0;
            if (flag)
            {
                byte0 = 2;
            } else
            {
                byte0 = 0;
            }
            android.support.v4.view.s.a(getChildAt(i1), byte0, null);
            i1++;
        }
    }

    private boolean b(float f1)
    {
        boolean flag1 = true;
        boolean flag3 = false;
        boolean flag2 = false;
        float f2 = F;
        F = f1;
        float f3 = (float)getScrollX() + (f2 - f1);
        int i1 = getClientWidth();
        f1 = (float)i1 * s;
        f2 = i1;
        float f4 = t;
        b b1 = (b)e.get(0);
        b b2 = (b)e.get(e.size() - 1);
        boolean flag;
        if (b1.b != 0)
        {
            f1 = b1.e * (float)i1;
            flag = false;
        } else
        {
            flag = true;
        }
        if (b2.b != h.b() - 1)
        {
            f2 = b2.e * (float)i1;
            flag1 = false;
        } else
        {
            f2 *= f4;
        }
        if (f3 >= f1) goto _L2; else goto _L1
_L1:
        f2 = f1;
        if (flag)
        {
            flag2 = Q.a(Math.abs(f1 - f3) / (float)i1);
            f2 = f1;
        }
_L4:
        F = F + (f2 - (float)(int)f2);
        scrollTo((int)f2, getScrollY());
        d((int)f2);
        return flag2;
_L2:
        if (f3 > f2)
        {
            flag2 = flag3;
            if (flag1)
            {
                flag2 = R.a(Math.abs(f3 - f2) / (float)i1);
            }
        } else
        {
            f2 = f3;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void c(boolean flag)
    {
        ViewParent viewparent = getParent();
        if (viewparent != null)
        {
            viewparent.requestDisallowInterceptTouchEvent(flag);
        }
    }

    private boolean d(int i1)
    {
        boolean flag = false;
        if (e.size() == 0)
        {
            U = false;
            a(0, 0.0F, 0);
            if (!U)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
        } else
        {
            b b1 = i();
            int k1 = getClientWidth();
            int l1 = o;
            float f1 = (float)o / (float)k1;
            int j1 = b1.b;
            f1 = ((float)i1 / (float)k1 - b1.e) / (b1.d + f1);
            i1 = (int)((float)(l1 + k1) * f1);
            U = false;
            a(j1, f1, i1);
            if (!U)
            {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            flag = true;
        }
        return flag;
    }

    static int[] f()
    {
        return a;
    }

    private void g()
    {
        int j1;
        for (int i1 = 0; i1 < getChildCount(); i1 = j1 + 1)
        {
            j1 = i1;
            if (!((LayoutParams)getChildAt(i1).getLayoutParams()).a)
            {
                removeViewAt(i1);
                j1 = i1 - 1;
            }
        }

    }

    private int getClientWidth()
    {
        return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    }

    private void h()
    {
        if (ad != 0)
        {
            int j1;
            if (ae == null)
            {
                ae = new ArrayList();
            } else
            {
                ae.clear();
            }
            j1 = getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                View view = getChildAt(i1);
                ae.add(view);
            }

            Collections.sort(ae, af);
        }
    }

    private b i()
    {
        int i1 = getClientWidth();
        float f1;
        float f2;
        float f3;
        float f4;
        b b2;
        boolean flag;
        int j1;
        if (i1 > 0)
        {
            f1 = (float)getScrollX() / (float)i1;
        } else
        {
            f1 = 0.0F;
        }
        if (i1 > 0)
        {
            f2 = (float)o / (float)i1;
        } else
        {
            f2 = 0.0F;
        }
        f4 = 0.0F;
        f3 = 0.0F;
        j1 = -1;
        i1 = 0;
        flag = true;
        b2 = null;
        do
        {
            b b1;
label0:
            {
                b b3;
label1:
                {
                    b3 = b2;
                    if (i1 >= e.size())
                    {
                        break label1;
                    }
                    b1 = (b)e.get(i1);
                    if (!flag && b1.b != j1 + 1)
                    {
                        b1 = f;
                        b1.e = f4 + f3 + f2;
                        b1.b = j1 + 1;
                        b1.d = h.d(b1.b);
                        i1--;
                    }
                    f3 = b1.e;
                    f4 = b1.d;
                    if (!flag)
                    {
                        b3 = b2;
                        if (f1 < f3)
                        {
                            break label1;
                        }
                    }
                    if (f1 >= f4 + f3 + f2 && i1 != e.size() - 1)
                    {
                        break label0;
                    }
                    b3 = b1;
                }
                return b3;
            }
            j1 = b1.b;
            f4 = b1.d;
            flag = false;
            i1++;
            b2 = b1;
        } while (true);
    }

    private void j()
    {
        A = false;
        B = false;
        if (K != null)
        {
            K.recycle();
            K = null;
        }
    }

    private void setScrollState(int i1)
    {
        if (ah != i1)
        {
            ah = i1;
            if (ab != null)
            {
                boolean flag;
                if (i1 != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                b(flag);
            }
            if (W != null)
            {
                W.b(i1);
                return;
            }
        }
    }

    private void setScrollingCacheEnabled(boolean flag)
    {
        if (x != flag)
        {
            x = flag;
        }
    }

    float a(float f1)
    {
        return (float)Math.sin((float)((double)(f1 - 0.5F) * 0.4712389167638204D));
    }

    b a(int i1, int j1)
    {
        b b1 = new b();
        b1.b = i1;
        b1.a = h.a(this, i1);
        b1.d = h.d(i1);
        if (j1 < 0 || j1 >= e.size())
        {
            e.add(b1);
            return b1;
        } else
        {
            e.add(j1, b1);
            return b1;
        }
    }

    b a(View view)
    {
        for (int i1 = 0; i1 < e.size(); i1++)
        {
            b b1 = (b)e.get(i1);
            if (h.a(view, b1.a))
            {
                return b1;
            }
        }

        return null;
    }

    e a(e e1)
    {
        e e2 = Z;
        Z = e1;
        return e2;
    }

    void a()
    {
        setWillNotDraw(false);
        setDescendantFocusability(0x40000);
        setFocusable(true);
        Context context = getContext();
        m = new Scroller(context, d);
        ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
        float f1 = context.getResources().getDisplayMetrics().density;
        E = android.support.v4.view.z.a(viewconfiguration);
        L = (int)(400F * f1);
        M = viewconfiguration.getScaledMaximumFlingVelocity();
        Q = new android.support.v4.widget.d(context);
        R = new android.support.v4.widget.d(context);
        N = (int)(25F * f1);
        O = (int)(2.0F * f1);
        C = (int)(16F * f1);
        android.support.v4.view.s.a(this, new c());
        if (android.support.v4.view.s.c(this) == 0)
        {
            android.support.v4.view.s.c(this, 1);
        }
    }

    void a(int i1)
    {
        float f1;
        float f2;
        float f3;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        int j1;
        byte byte1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        if (i != i1)
        {
            byte byte0;
            if (i < i1)
            {
                byte0 = 66;
            } else
            {
                byte0 = 17;
            }
            obj1 = b(i);
            i = i1;
            byte1 = byte0;
        } else
        {
            obj1 = null;
            byte1 = 2;
        }
        if (h != null) goto _L2; else goto _L1
_L1:
        h();
_L4:
        return;
_L2:
        if (y)
        {
            h();
            return;
        }
        if (getWindowToken() == null) goto _L4; else goto _L3
_L3:
        h.a(this);
        i1 = z;
        l2 = Math.max(0, i - i1);
        j2 = h.b();
        k2 = Math.min(j2 - 1, i1 + i);
        if (j2 != b)
        {
            String s1;
            try
            {
                s1 = getResources().getResourceName(getId());
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception)
            {
                notfoundexception = Integer.toHexString(getId());
            }
            throw new IllegalStateException((new StringBuilder()).append("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ").append(b).append(", found: ").append(j2).append(" Pager id: ").append(s1).append(" Pager class: ").append(getClass()).append(" Problematic adapter: ").append(h.getClass()).toString());
        }
        i1 = 0;
_L20:
        if (i1 >= e.size())
        {
            break MISSING_BLOCK_LABEL_1273;
        }
        obj = (b)e.get(i1);
        if (((b) (obj)).b < i) goto _L6; else goto _L5
_L5:
        if (((b) (obj)).b != i)
        {
            break MISSING_BLOCK_LABEL_1273;
        }
_L30:
        if (obj == null && j2 > 0)
        {
            obj2 = a(i, i1);
        } else
        {
            obj2 = obj;
        }
        if (obj2 == null) goto _L8; else goto _L7
_L7:
        i2 = i1 - 1;
        if (i2 >= 0)
        {
            obj = (b)e.get(i2);
        } else
        {
            obj = null;
        }
        i3 = getClientWidth();
        if (i3 <= 0)
        {
            f2 = 0.0F;
        } else
        {
            f2 = (2.0F - ((b) (obj2)).d) + (float)getPaddingLeft() / (float)i3;
        }
        j1 = i;
        f3 = 0.0F;
        l1 = j1 - 1;
        k1 = i1;
        obj3 = obj;
_L21:
        if (l1 < 0) goto _L10; else goto _L9
_L9:
        if (f3 < f2 || l1 >= l2) goto _L12; else goto _L11
_L11:
        if (obj3 != null) goto _L13; else goto _L10
_L10:
        f1 = ((b) (obj2)).d;
        i1 = k1 + 1;
        if (f1 >= 2.0F) goto _L15; else goto _L14
_L14:
        if (i1 < e.size())
        {
            obj = (b)e.get(i1);
        } else
        {
            obj = null;
        }
        if (i3 <= 0)
        {
            f2 = 0.0F;
        } else
        {
            f2 = (float)getPaddingRight() / (float)i3 + 2.0F;
        }
        j1 = i;
        j1++;
_L23:
        if (j1 >= j2) goto _L15; else goto _L16
_L16:
        if (f1 < f2 || j1 <= k2) goto _L18; else goto _L17
_L17:
        if (obj != null) goto _L19; else goto _L15
_L15:
        a(((b) (obj2)), k1, ((b) (obj1)));
          goto _L8
_L6:
        i1++;
          goto _L20
_L13:
        obj = obj3;
        i1 = i2;
        f1 = f3;
        j1 = k1;
        if (l1 == ((b) (obj3)).b)
        {
            obj = obj3;
            i1 = i2;
            f1 = f3;
            j1 = k1;
            if (!((b) (obj3)).c)
            {
                e.remove(i2);
                h.a(this, l1, ((b) (obj3)).a);
                i1 = i2 - 1;
                j1 = k1 - 1;
                if (i1 >= 0)
                {
                    obj = (b)e.get(i1);
                    f1 = f3;
                } else
                {
                    obj = null;
                    f1 = f3;
                }
            }
        }
_L22:
        l1--;
        obj3 = obj;
        i2 = i1;
        f3 = f1;
        k1 = j1;
          goto _L21
_L12:
        if (obj3 != null && l1 == ((b) (obj3)).b)
        {
            f1 = f3 + ((b) (obj3)).d;
            i1 = i2 - 1;
            if (i1 >= 0)
            {
                obj = (b)e.get(i1);
                j1 = k1;
            } else
            {
                obj = null;
                j1 = k1;
            }
        } else
        {
            f1 = f3 + a(l1, i2 + 1).d;
            j1 = k1 + 1;
            if (i2 >= 0)
            {
                obj = (b)e.get(i2);
                i1 = i2;
            } else
            {
                obj = null;
                i1 = i2;
            }
        }
          goto _L22
_L19:
        if (j1 == ((b) (obj)).b && !((b) (obj)).c)
        {
            e.remove(i1);
            h.a(this, j1, ((b) (obj)).a);
            if (i1 < e.size())
            {
                obj = (b)e.get(i1);
            } else
            {
                obj = null;
            }
        }
_L24:
        j1++;
          goto _L23
_L18:
        if (obj != null && j1 == ((b) (obj)).b)
        {
            float f4 = ((b) (obj)).d;
            i1++;
            if (i1 < e.size())
            {
                obj = (b)e.get(i1);
            } else
            {
                obj = null;
            }
            f1 += f4;
        } else
        {
            obj = a(j1, i1);
            i1++;
            float f5 = ((b) (obj)).d;
            if (i1 < e.size())
            {
                obj = (b)e.get(i1);
            } else
            {
                obj = null;
            }
            f1 += f5;
        }
          goto _L24
_L8:
        obj1 = h;
        i1 = i;
        if (obj2 != null)
        {
            obj = ((b) (obj2)).a;
        } else
        {
            obj = null;
        }
        ((o) (obj1)).b(this, i1, obj);
        h.b(this);
        j1 = getChildCount();
        for (i1 = 0; i1 < j1; i1++)
        {
            obj1 = getChildAt(i1);
            obj = (LayoutParams)((View) (obj1)).getLayoutParams();
            obj.f = i1;
            if (!((LayoutParams) (obj)).a && ((LayoutParams) (obj)).c == 0.0F)
            {
                obj1 = a(((View) (obj1)));
                if (obj1 != null)
                {
                    obj.c = ((b) (obj1)).d;
                    obj.e = ((b) (obj1)).b;
                }
            }
        }

        h();
        if (!hasFocus()) goto _L4; else goto _L25
_L25:
        obj = findFocus();
        if (obj != null)
        {
            obj = b(((View) (obj)));
        } else
        {
            obj = null;
        }
        if (obj != null && ((b) (obj)).b == i) goto _L4; else goto _L26
_L26:
        i1 = 0;
_L29:
        if (i1 >= getChildCount()) goto _L4; else goto _L27
_L27:
        obj = getChildAt(i1);
        obj1 = a(((View) (obj)));
        if (obj1 != null && ((b) (obj1)).b == i && ((View) (obj)).requestFocus(byte1)) goto _L4; else goto _L28
_L28:
        i1++;
          goto _L29
        obj = null;
          goto _L30
    }

    protected void a(int i1, float f1, int j1)
    {
        int k1;
        int i2;
        int k3;
        int l3;
        int i4;
        int j4;
        if (V <= 0)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        l3 = getScrollX();
        k1 = getPaddingLeft();
        i2 = getPaddingRight();
        i4 = getWidth();
        j4 = getChildCount();
        k3 = 0;
_L2:
        View view;
        LayoutParams layoutparams;
        int j2;
        int k2;
        if (k3 >= j4)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        view = getChildAt(k3);
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.a)
        {
            break; /* Loop/switch isn't completed */
        }
        k2 = k1;
        j2 = i2;
_L7:
        k3++;
        k1 = k2;
        i2 = j2;
        if (true) goto _L2; else goto _L1
_L1:
        layoutparams.b & 7;
        JVM INSTR tableswitch 1 5: default 140
    //                   1 229
    //                   2 140
    //                   3 200
    //                   4 140
    //                   5 261;
           goto _L3 _L4 _L3 _L5 _L3 _L6
_L6:
        break MISSING_BLOCK_LABEL_261;
_L3:
        j2 = k1;
        k2 = i2;
        i2 = k1;
        k1 = k2;
_L8:
        int k4 = (j2 + l3) - view.getLeft();
        j2 = k1;
        k2 = i2;
        if (k4 != 0)
        {
            view.offsetLeftAndRight(k4);
            j2 = k1;
            k2 = i2;
        }
          goto _L7
_L5:
        j2 = view.getWidth();
        int l2 = j2 + k1;
        j2 = k1;
        k1 = i2;
        i2 = l2;
          goto _L8
_L4:
        j2 = Math.max((i4 - view.getMeasuredWidth()) / 2, k1);
        int i3 = k1;
        k1 = i2;
        i2 = i3;
          goto _L8
        j2 = i4 - i2 - view.getMeasuredWidth();
        int l4 = view.getMeasuredWidth();
        int j3 = k1;
        k1 = i2 + l4;
        i2 = j3;
          goto _L8
        if (W != null)
        {
            W.a(i1, f1, j1);
        }
        if (Z != null)
        {
            Z.a(i1, f1, j1);
        }
        if (ab != null)
        {
            j1 = getScrollX();
            int l1 = getChildCount();
            i1 = 0;
            while (i1 < l1) 
            {
                View view1 = getChildAt(i1);
                if (!((LayoutParams)view1.getLayoutParams()).a)
                {
                    f1 = (float)(view1.getLeft() - j1) / (float)getClientWidth();
                    ab.a(view1, f1);
                }
                i1++;
            }
        }
        U = true;
        return;
          goto _L7
    }

    void a(int i1, int j1, int k1)
    {
        if (getChildCount() == 0)
        {
            setScrollingCacheEnabled(false);
            return;
        }
        int l1 = getScrollX();
        int i2 = getScrollY();
        int j2 = i1 - l1;
        j1 -= i2;
        if (j2 == 0 && j1 == 0)
        {
            a(false);
            c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        i1 = getClientWidth();
        int k2 = i1 / 2;
        float f5 = Math.min(1.0F, ((float)Math.abs(j2) * 1.0F) / (float)i1);
        float f1 = k2;
        float f3 = k2;
        f5 = a(f5);
        k1 = Math.abs(k1);
        if (k1 > 0)
        {
            i1 = Math.round(1000F * Math.abs((f3 * f5 + f1) / (float)k1)) * 4;
        } else
        {
            float f2 = i1;
            float f4 = h.d(i);
            i1 = (int)(((float)Math.abs(j2) / (f2 * f4 + (float)o) + 1.0F) * 100F);
        }
        i1 = Math.min(i1, 600);
        m.startScroll(l1, i2, j2, j1, i1);
        android.support.v4.view.s.b(this);
    }

    public void a(int i1, boolean flag)
    {
        y = false;
        a(i1, flag, false);
    }

    void a(int i1, boolean flag, boolean flag1)
    {
        a(i1, flag, flag1, 0);
    }

    void a(int i1, boolean flag, boolean flag1, int j1)
    {
        boolean flag2;
        flag2 = false;
        if (h == null || h.b() <= 0)
        {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!flag1 && i == i1 && e.size() != 0)
        {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        int k1 = 0;
_L4:
        i1 = z;
        if (k1 > i + i1 || k1 < i - i1)
        {
            for (i1 = 0; i1 < e.size(); i1++)
            {
                ((b)e.get(i1)).c = true;
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        k1 = i1;
        if (i1 >= h.b())
        {
            k1 = h.b() - 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
        if (i != k1)
        {
            flag1 = true;
        }
        if (S)
        {
            i = k1;
            if (flag1 && W != null)
            {
                W.a(k1);
            }
            if (flag1 && Z != null)
            {
                Z.a(k1);
            }
            requestLayout();
            return;
        } else
        {
            a(k1);
            a(k1, flag, j1, flag1);
            return;
        }
    }

    public boolean a(KeyEvent keyevent)
    {
        if (keyevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        keyevent.getKeyCode();
        JVM INSTR lookupswitch 3: default 44
    //                   21: 46
    //                   22: 53
    //                   61: 60;
           goto _L2 _L3 _L4 _L5
_L2:
        return false;
_L3:
        return c(17);
_L4:
        return c(66);
_L5:
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            if (android.support.v4.view.g.a(keyevent))
            {
                return c(2);
            }
            if (android.support.v4.view.g.a(keyevent, 1))
            {
                return c(1);
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    protected boolean a(View view, boolean flag, int i1, int j1, int k1)
    {
        if (!(view instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        ViewGroup viewgroup;
        int l1;
        int i2;
        int j2;
        viewgroup = (ViewGroup)view;
        i2 = view.getScrollX();
        j2 = view.getScrollY();
        l1 = viewgroup.getChildCount() - 1;
_L8:
        if (l1 < 0) goto _L2; else goto _L3
_L3:
        View view1 = viewgroup.getChildAt(l1);
        if (j1 + i2 < view1.getLeft() || j1 + i2 >= view1.getRight() || k1 + j2 < view1.getTop() || k1 + j2 >= view1.getBottom() || !a(view1, true, i1, (j1 + i2) - view1.getLeft(), (k1 + j2) - view1.getTop())) goto _L5; else goto _L4
_L4:
        return true;
_L5:
        l1--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (flag && android.support.v4.view.s.a(view, -i1)) goto _L4; else goto _L6
_L6:
        return false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        int l1 = arraylist.size();
        int i2 = getDescendantFocusability();
        if (i2 != 0x60000)
        {
            for (int k1 = 0; k1 < getChildCount(); k1++)
            {
                View view = getChildAt(k1);
                if (view.getVisibility() == 0)
                {
                    b b1 = a(view);
                    if (b1 != null && b1.b == i)
                    {
                        view.addFocusables(arraylist, i1, j1);
                    }
                }
            }

        }
        while (i2 == 0x40000 && l1 != arraylist.size() || !isFocusable() || (j1 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode() || arraylist == null) 
        {
            return;
        }
        arraylist.add(this);
    }

    public void addTouchables(ArrayList arraylist)
    {
        for (int i1 = 0; i1 < getChildCount(); i1++)
        {
            View view = getChildAt(i1);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            b b1 = a(view);
            if (b1 != null && b1.b == i)
            {
                view.addTouchables(arraylist);
            }
        }

    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (!checkLayoutParams(layoutparams))
        {
            layoutparams = generateLayoutParams(layoutparams);
        }
        LayoutParams layoutparams1 = (LayoutParams)layoutparams;
        layoutparams1.a = layoutparams1.a | (view instanceof a);
        if (w)
        {
            if (layoutparams1 != null && layoutparams1.a)
            {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            } else
            {
                layoutparams1.d = true;
                addViewInLayout(view, i1, layoutparams);
                return;
            }
        } else
        {
            super.addView(view, i1, layoutparams);
            return;
        }
    }

    b b(int i1)
    {
        for (int j1 = 0; j1 < e.size(); j1++)
        {
            b b1 = (b)e.get(j1);
            if (b1.b == i1)
            {
                return b1;
            }
        }

        return null;
    }

    b b(View view)
    {
        do
        {
            ViewParent viewparent = view.getParent();
            if (viewparent != this)
            {
                if (viewparent == null || !(viewparent instanceof View))
                {
                    return null;
                }
                view = (View)viewparent;
            } else
            {
                return a(view);
            }
        } while (true);
    }

    void b()
    {
        int i3 = h.b();
        b = i3;
        int i1;
        int j1;
        int k1;
        int l1;
        boolean flag;
        if (e.size() < z * 2 + 1 && e.size() < i3)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        j1 = i;
        k1 = 0;
        flag = false;
        l1 = i1;
        i1 = j1;
        j1 = k1;
        k1 = ((flag) ? 1 : 0);
        while (k1 < e.size()) 
        {
            Object obj = (b)e.get(k1);
            int i2 = h.a(((b) (obj)).a);
            int k2;
            if (i2 == -1)
            {
                i2 = k1;
                int j2 = j1;
                k1 = l1;
                j1 = i1;
                i1 = j2;
                l1 = i2;
            } else
            if (i2 == -2)
            {
                e.remove(k1);
                l1 = k1 - 1;
                k1 = j1;
                if (j1 == 0)
                {
                    h.a(this);
                    k1 = 1;
                }
                h.a(this, ((b) (obj)).b, ((b) (obj)).a);
                int l2;
                if (i == ((b) (obj)).b)
                {
                    j1 = Math.max(0, Math.min(i, i3 - 1));
                    i1 = k1;
                    k1 = 1;
                } else
                {
                    j1 = i1;
                    boolean flag1 = true;
                    i1 = k1;
                    k1 = ((flag1) ? 1 : 0);
                }
            } else
            if (((b) (obj)).b != i2)
            {
                if (((b) (obj)).b == i)
                {
                    i1 = i2;
                }
                obj.b = i2;
                i2 = i1;
                l2 = 1;
                l1 = k1;
                i1 = j1;
                j1 = i2;
                k1 = l2;
            } else
            {
                i2 = i1;
                l2 = l1;
                l1 = k1;
                i1 = j1;
                j1 = i2;
                k1 = l2;
            }
            i2 = k1;
            k2 = j1;
            k1 = l1 + 1;
            j1 = i1;
            i1 = k2;
            l1 = i2;
        }
        if (j1 != 0)
        {
            h.b(this);
        }
        Collections.sort(e, c);
        if (l1 != 0)
        {
            k1 = getChildCount();
            for (j1 = 0; j1 < k1; j1++)
            {
                obj = (LayoutParams)getChildAt(j1).getLayoutParams();
                if (!((LayoutParams) (obj)).a)
                {
                    obj.c = 0.0F;
                }
            }

            a(i1, false, true);
            requestLayout();
        }
    }

    void c()
    {
        a(i);
    }

    public boolean c(int i1)
    {
        View view = findFocus();
        if (view != this) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L13:
        view = FocusFinder.getInstance().findNextFocus(this, ((View) (obj)), i1);
        if (view == null || view == obj) goto _L4; else goto _L3
_L3:
        if (i1 != 17) goto _L6; else goto _L5
_L5:
        int j1;
        boolean flag;
        j1 = a(g, view).left;
        int k1 = a(g, ((View) (obj))).left;
        StringBuilder stringbuilder;
        if (obj != null && j1 >= k1)
        {
            flag = d();
        } else
        {
            flag = view.requestFocus();
        }
_L16:
        if (flag)
        {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i1));
        }
        return flag;
_L2:
        if (view == null) goto _L8; else goto _L7
_L7:
        obj = view.getParent();
_L12:
        if (!(obj instanceof ViewGroup))
        {
            break MISSING_BLOCK_LABEL_359;
        }
        if (obj != this) goto _L10; else goto _L9
_L9:
        j1 = 1;
_L18:
        if (j1 != 0) goto _L8; else goto _L11
_L10:
        obj = ((ViewParent) (obj)).getParent();
          goto _L12
_L11:
        stringbuilder = new StringBuilder();
        stringbuilder.append(view.getClass().getSimpleName());
        for (obj = view.getParent(); obj instanceof ViewGroup; obj = ((ViewParent) (obj)).getParent())
        {
            stringbuilder.append(" => ").append(obj.getClass().getSimpleName());
        }

        Log.e("ViewPager", (new StringBuilder()).append("arrowScroll tried to find focus based on non-child current focused view ").append(stringbuilder.toString()).toString());
        obj = null;
          goto _L13
_L6:
        if (i1 != 66) goto _L15; else goto _L14
_L14:
        j1 = a(g, view).left;
        int l1 = a(g, ((View) (obj))).left;
        if (obj != null && j1 <= l1)
        {
            flag = e();
        } else
        {
            flag = view.requestFocus();
        }
          goto _L16
_L4:
label0:
        {
            if (i1 != 17 && i1 != 1)
            {
                break label0;
            }
            flag = d();
        }
          goto _L16
        if (i1 != 66 && i1 != 2) goto _L15; else goto _L17
_L17:
        flag = e();
          goto _L16
_L15:
        flag = false;
          goto _L16
_L8:
        obj = view;
          goto _L13
        j1 = 0;
          goto _L18
    }

    public boolean canScrollHorizontally(int i1)
    {
        boolean flag2 = true;
        boolean flag = true;
        if (h != null)
        {
            int j1 = getClientWidth();
            int k1 = getScrollX();
            if (i1 < 0)
            {
                if (k1 <= (int)((float)j1 * s))
                {
                    flag = false;
                }
                return flag;
            }
            if (i1 > 0)
            {
                boolean flag1;
                if (k1 < (int)((float)j1 * t))
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                return flag1;
            }
        }
        return false;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
        if (!m.isFinished() && m.computeScrollOffset())
        {
            int i1 = getScrollX();
            int j1 = getScrollY();
            int k1 = m.getCurrX();
            int l1 = m.getCurrY();
            if (i1 != k1 || j1 != l1)
            {
                scrollTo(k1, l1);
                if (!d(k1))
                {
                    m.abortAnimation();
                    scrollTo(0, l1);
                }
            }
            android.support.v4.view.s.b(this);
            return;
        } else
        {
            a(true);
            return;
        }
    }

    boolean d()
    {
        if (i > 0)
        {
            a(i - 1, true);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return super.dispatchKeyEvent(keyevent) || a(keyevent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        boolean flag1 = false;
        if (accessibilityevent.getEventType() != 4096) goto _L2; else goto _L1
_L1:
        boolean flag = super.dispatchPopulateAccessibilityEvent(accessibilityevent);
_L4:
        return flag;
_L2:
        int j1 = getChildCount();
        int i1 = 0;
        do
        {
            flag = flag1;
            if (i1 >= j1)
            {
                continue;
            }
            View view = getChildAt(i1);
            if (view.getVisibility() == 0)
            {
                b b1 = a(view);
                if (b1 != null && b1.b == i && view.dispatchPopulateAccessibilityEvent(accessibilityevent))
                {
                    return true;
                }
            }
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        int j1 = 0;
        int i1 = 0;
        int k1 = android.support.v4.view.s.a(this);
        if (k1 == 0 || k1 == 1 && h != null && h.b() > 1)
        {
            if (!Q.a())
            {
                j1 = canvas.save();
                i1 = getHeight() - getPaddingTop() - getPaddingBottom();
                int l1 = getWidth();
                canvas.rotate(270F);
                canvas.translate(-i1 + getPaddingTop(), s * (float)l1);
                Q.a(i1, l1);
                i1 = false | Q.a(canvas);
                canvas.restoreToCount(j1);
            }
            j1 = i1;
            if (!R.a())
            {
                int i2 = canvas.save();
                j1 = getWidth();
                int j2 = getHeight();
                int k2 = getPaddingTop();
                int l2 = getPaddingBottom();
                canvas.rotate(90F);
                canvas.translate(-getPaddingTop(), -(t + 1.0F) * (float)j1);
                R.a(j2 - k2 - l2, j1);
                j1 = i1 | R.a(canvas);
                canvas.restoreToCount(i2);
            }
        } else
        {
            Q.b();
            R.b();
        }
        if (j1 != 0)
        {
            android.support.v4.view.s.b(this);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        Drawable drawable = p;
        if (drawable != null && drawable.isStateful())
        {
            drawable.setState(getDrawableState());
        }
    }

    boolean e()
    {
        if (h != null && i < h.b() - 1)
        {
            a(i + 1, true);
            return true;
        } else
        {
            return false;
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateDefaultLayoutParams();
    }

    public o getAdapter()
    {
        return h;
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        int k1 = j1;
        if (ad == 2)
        {
            k1 = i1 - 1 - j1;
        }
        return ((LayoutParams)((View)ae.get(k1)).getLayoutParams()).f;
    }

    public int getCurrentItem()
    {
        return i;
    }

    public int getOffscreenPageLimit()
    {
        return z;
    }

    public int getPageMargin()
    {
        return o;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        S = true;
    }

    protected void onDetachedFromWindow()
    {
        removeCallbacks(ag);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (o <= 0 || p == null || e.size() <= 0 || h == null) goto _L2; else goto _L1
_L1:
        float f1;
        float f3;
        Object obj;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        k1 = getScrollX();
        l1 = getWidth();
        f3 = (float)o / (float)l1;
        obj = (b)e.get(0);
        f1 = ((b) (obj)).e;
        i2 = e.size();
        i1 = ((b) (obj)).b;
        j2 = ((b)e.get(i2 - 1)).b;
        j1 = 0;
_L6:
        if (i1 >= j2) goto _L2; else goto _L3
_L3:
        for (; i1 > ((b) (obj)).b && j1 < i2; obj = (b)((ArrayList) (obj)).get(j1))
        {
            obj = e;
            j1++;
        }

        float f2;
        if (i1 == ((b) (obj)).b)
        {
            f2 = (((b) (obj)).e + ((b) (obj)).d) * (float)l1;
            f1 = ((b) (obj)).e + ((b) (obj)).d + f3;
        } else
        {
            float f4 = h.d(i1);
            f2 = (f1 + f4) * (float)l1;
            f1 += f4 + f3;
        }
        if ((float)o + f2 > (float)k1)
        {
            p.setBounds((int)f2, q, (int)((float)o + f2 + 0.5F), r);
            p.draw(canvas);
        }
        if (f2 <= (float)(k1 + l1)) goto _L4; else goto _L2
_L2:
        return;
_L4:
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1 = motionevent.getAction() & 0xff;
        if (i1 != 3 && i1 != 1) goto _L2; else goto _L1
_L1:
        A = false;
        B = false;
        J = -1;
        if (K != null)
        {
            K.recycle();
            K = null;
        }
_L4:
        return false;
_L2:
        if (i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (A)
        {
            return true;
        }
        if (B) goto _L4; else goto _L3
_L3:
        i1;
        JVM INSTR lookupswitch 3: default 116
    //                   0: 381
    //                   2: 143
    //                   6: 513;
           goto _L5 _L6 _L7 _L8
_L5:
        if (K == null)
        {
            K = VelocityTracker.obtain();
        }
        K.addMovement(motionevent);
        return A;
_L7:
        float f1;
        float f3;
        float f4;
        float f5;
        float f6;
        int j1 = J;
        if (j1 == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = android.support.v4.view.m.a(motionevent, j1);
        f3 = android.support.v4.view.m.c(motionevent, j1);
        f1 = f3 - F;
        f5 = Math.abs(f1);
        f4 = android.support.v4.view.m.d(motionevent, j1);
        f6 = Math.abs(f4 - I);
        if (f1 != 0.0F && !a(F, f1) && a(this, false, (int)f1, (int)f3, (int)f4))
        {
            F = f3;
            G = f4;
            B = true;
            return false;
        }
        if (f5 <= (float)E || 0.5F * f5 <= f6) goto _L10; else goto _L9
_L9:
        A = true;
        c(true);
        setScrollState(1);
        if (f1 > 0.0F)
        {
            f1 = H + (float)E;
        } else
        {
            f1 = H - (float)E;
        }
        F = f1;
        G = f4;
        setScrollingCacheEnabled(true);
_L11:
        if (A && b(f3))
        {
            android.support.v4.view.s.b(this);
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (f6 > (float)E)
        {
            B = true;
        }
        if (true) goto _L11; else goto _L6
_L6:
        float f2 = motionevent.getX();
        H = f2;
        F = f2;
        f2 = motionevent.getY();
        I = f2;
        G = f2;
        J = android.support.v4.view.m.b(motionevent, 0);
        B = false;
        m.computeScrollOffset();
        if (ah == 2 && Math.abs(m.getFinalX() - m.getCurrX()) > O)
        {
            m.abortAnimation();
            y = false;
            c();
            A = true;
            c(true);
            setScrollState(1);
        } else
        {
            a(false);
            A = false;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        a(motionevent);
        if (true) goto _L5; else goto _L12
_L12:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int i2;
        int j2;
        int j3;
        int l4;
        int i5;
        int j5;
        int k5;
        l4 = getChildCount();
        j5 = k1 - i1;
        i5 = l1 - j1;
        j1 = getPaddingLeft();
        i1 = getPaddingTop();
        i2 = getPaddingRight();
        k1 = getPaddingBottom();
        k5 = getScrollX();
        j2 = 0;
        j3 = 0;
_L14:
        if (j3 >= l4) goto _L2; else goto _L1
_L1:
        View view = getChildAt(j3);
        if (view.getVisibility() == 8) goto _L4; else goto _L3
_L3:
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.a) goto _L4; else goto _L5
_L5:
        int l5;
        l1 = layoutparams.b;
        l5 = layoutparams.b;
        l1 & 7;
        JVM INSTR tableswitch 1 5: default 148
    //                   1 304
    //                   2 148
    //                   3 285
    //                   4 148
    //                   5 326;
           goto _L6 _L7 _L6 _L8 _L6 _L9
_L6:
        int k2;
        l1 = j1;
        k2 = j1;
_L15:
        l5 & 0x70;
        JVM INSTR lookupswitch 3: default 192
    //                   16: 394
    //                   48: 367
    //                   80: 422;
           goto _L10 _L11 _L12 _L13
_L10:
        int k3 = i1;
        j1 = i1;
        i1 = k1;
        k1 = k3;
_L16:
        l1 += k5;
        view.layout(l1, k1, view.getMeasuredWidth() + l1, view.getMeasuredHeight() + k1);
        j2++;
        l1 = i2;
        k1 = k2;
        i2 = i1;
        i1 = j2;
_L17:
        j3++;
        k2 = k1;
        j2 = i1;
        i1 = j1;
        k1 = i2;
        i2 = l1;
        j1 = k2;
          goto _L14
_L8:
        k2 = view.getMeasuredWidth();
        l1 = j1;
        k2 += j1;
          goto _L15
_L7:
        l1 = Math.max((j5 - view.getMeasuredWidth()) / 2, j1);
        k2 = j1;
          goto _L15
_L9:
        k2 = view.getMeasuredWidth();
        l1 = i2 + view.getMeasuredWidth();
        int l3 = j5 - i2 - k2;
        i2 = l1;
        k2 = j1;
        l1 = l3;
          goto _L15
_L12:
        int i4 = view.getMeasuredHeight();
        j1 = k1;
        i4 += i1;
        k1 = i1;
        i1 = j1;
        j1 = i4;
          goto _L16
_L11:
        int j4 = Math.max((i5 - view.getMeasuredHeight()) / 2, i1);
        j1 = i1;
        i1 = k1;
        k1 = j4;
          goto _L16
_L13:
        int k4 = i5 - k1 - view.getMeasuredHeight();
        int i6 = view.getMeasuredHeight();
        j1 = i1;
        i1 = k1 + i6;
        k1 = k4;
          goto _L16
_L2:
        i2 = j5 - j1 - i2;
        for (l1 = 0; l1 < l4; l1++)
        {
            View view1 = getChildAt(l1);
            if (view1.getVisibility() == 8)
            {
                continue;
            }
            LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
            if (layoutparams1.a)
            {
                continue;
            }
            b b1 = a(view1);
            if (b1 == null)
            {
                continue;
            }
            float f1 = i2;
            int l2 = (int)(b1.e * f1) + j1;
            if (layoutparams1.d)
            {
                layoutparams1.d = false;
                float f2 = i2;
                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(layoutparams1.c * f2), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i5 - i1 - k1, 0x40000000));
            }
            view1.layout(l2, i1, view1.getMeasuredWidth() + l2, view1.getMeasuredHeight() + i1);
        }

        q = i1;
        r = i5 - k1;
        V = j2;
        if (S)
        {
            a(i, false, 0, false);
        }
        S = false;
        return;
_L4:
        l1 = j2;
        j2 = i1;
        int i3 = j1;
        i1 = l1;
        l1 = i2;
        i2 = k1;
        j1 = j2;
        k1 = i3;
          goto _L17
    }

    protected void onMeasure(int i1, int j1)
    {
label0:
        {
            setMeasuredDimension(getDefaultSize(0, i1), getDefaultSize(0, j1));
            i1 = getMeasuredWidth();
            D = Math.min(i1 / 10, C);
            i1 = i1 - getPaddingLeft() - getPaddingRight();
            j1 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
            int j3 = getChildCount();
            int i2 = 0;
            while (i2 < j3) 
            {
label1:
                {
                    {
                        View view = getChildAt(i2);
                        int k1 = i1;
                        int l1 = j1;
                        if (view.getVisibility() == 8)
                        {
                            break label1;
                        }
                        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                        k1 = i1;
                        l1 = j1;
                        if (layoutparams == null)
                        {
                            break label1;
                        }
                        k1 = i1;
                        l1 = j1;
                        if (!layoutparams.a)
                        {
                            break label1;
                        }
                        k1 = layoutparams.b & 7;
                        int j2 = layoutparams.b & 0x70;
                        int k2 = 0x80000000;
                        l1 = 0x80000000;
                        boolean flag;
                        boolean flag1;
                        if (j2 == 48 || j2 == 80)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (k1 == 3 || k1 == 5)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        if (flag)
                        {
                            k1 = 0x40000000;
                        } else
                        {
                            k1 = k2;
                            if (flag1)
                            {
                                l1 = 0x40000000;
                                k1 = k2;
                            }
                        }
                        if (layoutparams.width != -2)
                        {
                            k2 = 0x40000000;
                            float f1;
                            int l2;
                            int i3;
                            if (layoutparams.width != -1)
                            {
                                k1 = layoutparams.width;
                            } else
                            {
                                k1 = i1;
                            }
                        } else
                        {
                            k2 = k1;
                            k1 = i1;
                        }
                        if (layoutparams.height == -2)
                        {
                            break label0;
                        }
                        l2 = 0x40000000;
                        l1 = l2;
                        if (layoutparams.height == -1)
                        {
                            break label0;
                        }
                        i3 = layoutparams.height;
                        l1 = l2;
                        l2 = i3;
                    }
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1, k2), android.view.View.MeasureSpec.makeMeasureSpec(l2, l1));
                    if (flag)
                    {
                        l1 = j1 - view.getMeasuredHeight();
                        k1 = i1;
                    } else
                    {
                        k1 = i1;
                        l1 = j1;
                        if (flag1)
                        {
                            k1 = i1 - view.getMeasuredWidth();
                            l1 = j1;
                        }
                    }
                }
                i2++;
                i1 = k1;
                j1 = l1;
            }
            u = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
            v = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x40000000);
            w = true;
            c();
            w = false;
            k1 = getChildCount();
            for (j1 = 0; j1 < k1; j1++)
            {
                view = getChildAt(j1);
                if (view.getVisibility() == 8)
                {
                    continue;
                }
                layoutparams = (LayoutParams)view.getLayoutParams();
                if (layoutparams == null || !layoutparams.a)
                {
                    f1 = i1;
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(layoutparams.c * f1), 0x40000000), v);
                }
            }

            return;
        }
        l2 = j1;
        break MISSING_BLOCK_LABEL_282;
    }

    protected boolean onRequestFocusInDescendants(int i1, Rect rect)
    {
        byte byte0 = -1;
        int k1 = getChildCount();
        int j1;
        if ((i1 & 2) != 0)
        {
            byte0 = 1;
            j1 = 0;
        } else
        {
            j1 = k1 - 1;
            k1 = -1;
        }
        for (; j1 != k1; j1 += byte0)
        {
            View view = getChildAt(j1);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            b b1 = a(view);
            if (b1 != null && b1.b == i && view.requestFocus(i1, rect))
            {
                return true;
            }
        }

        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof SavedState))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (h != null)
        {
            h.a(((SavedState) (parcelable)).b, ((SavedState) (parcelable)).c);
            a(((SavedState) (parcelable)).a, false, true);
            return;
        } else
        {
            j = ((SavedState) (parcelable)).a;
            k = ((SavedState) (parcelable)).b;
            l = ((SavedState) (parcelable)).c;
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = i;
        if (h != null)
        {
            savedstate.b = h.a();
        }
        return savedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1)
        {
            a(i1, k1, o, o);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        int j1;
        j1 = 0;
        if (P)
        {
            return true;
        }
        if (motionevent.getAction() == 0 && motionevent.getEdgeFlags() != 0)
        {
            return false;
        }
        if (h == null || h.b() == 0)
        {
            return false;
        }
        if (K == null)
        {
            K = VelocityTracker.obtain();
        }
        K.addMovement(motionevent);
        i1 = j1;
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 124
    //                   0 139
    //                   1 392
    //                   2 201
    //                   3 546
    //                   4 128
    //                   5 601
    //                   6 634;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        i1 = j1;
_L10:
        if (i1 != 0)
        {
            android.support.v4.view.s.b(this);
        }
        return true;
_L2:
        m.abortAnimation();
        y = false;
        c();
        float f1 = motionevent.getX();
        H = f1;
        F = f1;
        f1 = motionevent.getY();
        I = f1;
        G = f1;
        J = android.support.v4.view.m.b(motionevent, 0);
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!A)
        {
            i1 = android.support.v4.view.m.a(motionevent, J);
            float f2 = android.support.v4.view.m.c(motionevent, i1);
            float f4 = Math.abs(f2 - F);
            float f3 = android.support.v4.view.m.d(motionevent, i1);
            float f5 = Math.abs(f3 - G);
            if (f4 > (float)E && f4 > f5)
            {
                A = true;
                c(true);
                ViewParent viewparent;
                if (f2 - H > 0.0F)
                {
                    f2 = H + (float)E;
                } else
                {
                    f2 = H - (float)E;
                }
                F = f2;
                G = f3;
                setScrollState(1);
                setScrollingCacheEnabled(true);
                viewparent = getParent();
                if (viewparent != null)
                {
                    viewparent.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        i1 = j1;
        if (A)
        {
            i1 = false | b(android.support.v4.view.m.c(motionevent, android.support.v4.view.m.a(motionevent, J)));
        }
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = j1;
        if (A)
        {
            Object obj = K;
            ((VelocityTracker) (obj)).computeCurrentVelocity(1000, M);
            i1 = (int)android.support.v4.view.q.a(((VelocityTracker) (obj)), J);
            y = true;
            j1 = getClientWidth();
            int k1 = getScrollX();
            obj = i();
            a(a(((b) (obj)).b, ((float)k1 / (float)j1 - ((b) (obj)).e) / ((b) (obj)).d, i1, (int)(android.support.v4.view.m.c(motionevent, android.support.v4.view.m.a(motionevent, J)) - H)), true, true, i1);
            J = -1;
            j();
            boolean flag = Q.c();
            i1 = R.c() | flag;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = j1;
        if (A)
        {
            a(i, true, 0, false);
            J = -1;
            j();
            boolean flag1 = Q.c();
            i1 = R.c() | flag1;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        i1 = android.support.v4.view.m.b(motionevent);
        F = android.support.v4.view.m.c(motionevent, i1);
        J = android.support.v4.view.m.b(motionevent, i1);
        i1 = j1;
        continue; /* Loop/switch isn't completed */
_L8:
        a(motionevent);
        F = android.support.v4.view.m.c(motionevent, android.support.v4.view.m.a(motionevent, J));
        i1 = j1;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void removeView(View view)
    {
        if (w)
        {
            removeViewInLayout(view);
            return;
        } else
        {
            super.removeView(view);
            return;
        }
    }

    public void setAdapter(o o1)
    {
        if (h != null)
        {
            h.b(n);
            h.a(this);
            for (int i1 = 0; i1 < e.size(); i1++)
            {
                b b1 = (b)e.get(i1);
                h.a(this, b1.b, b1.a);
            }

            h.b(this);
            e.clear();
            g();
            i = 0;
            scrollTo(0, 0);
        }
        o o2 = h;
        h = o1;
        b = 0;
        if (h != null)
        {
            if (n == null)
            {
                n = new g();
            }
            h.a(n);
            y = false;
            boolean flag = S;
            S = true;
            b = h.b();
            if (j >= 0)
            {
                h.a(k, l);
                a(j, false, true);
                j = -1;
                k = null;
                l = null;
            } else
            if (!flag)
            {
                c();
            } else
            {
                requestLayout();
            }
        }
        if (aa != null && o2 != o1)
        {
            aa.a(o2, o1);
        }
    }

    void setChildrenDrawingOrderEnabledCompat(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT < 7)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (ac == null)
        {
            try
            {
                ac = android/view/ViewGroup.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] {
                    Boolean.TYPE
                });
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", nosuchmethodexception);
            }
        }
        ac.invoke(this, new Object[] {
            Boolean.valueOf(flag)
        });
        return;
        Exception exception;
        exception;
        Log.e("ViewPager", "Error changing children drawing order", exception);
        return;
    }

    public void setCurrentItem(int i1)
    {
        y = false;
        boolean flag;
        if (!S)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(i1, flag, false);
    }

    public void setOffscreenPageLimit(int i1)
    {
        int j1 = i1;
        if (i1 < 1)
        {
            Log.w("ViewPager", (new StringBuilder()).append("Requested offscreen page limit ").append(i1).append(" too small; defaulting to ").append(1).toString());
            j1 = 1;
        }
        if (j1 != z)
        {
            z = j1;
            c();
        }
    }

    void setOnAdapterChangeListener(d d1)
    {
        aa = d1;
    }

    public void setOnPageChangeListener(e e1)
    {
        W = e1;
    }

    public void setPageMargin(int i1)
    {
        int j1 = o;
        o = i1;
        int k1 = getWidth();
        a(k1, k1, i1, j1);
        requestLayout();
    }

    public void setPageMarginDrawable(int i1)
    {
        setPageMarginDrawable(getContext().getResources().getDrawable(i1));
    }

    public void setPageMarginDrawable(Drawable drawable)
    {
        p = drawable;
        if (drawable != null)
        {
            refreshDrawableState();
        }
        boolean flag;
        if (drawable == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        invalidate();
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == p;
    }

}
