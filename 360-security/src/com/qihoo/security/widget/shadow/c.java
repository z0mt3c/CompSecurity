// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.shadow;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

// Referenced classes of package com.qihoo.security.widget.shadow:
//            a, e

public class c
    implements a
{

    private final ShapeDrawable a = new ShapeDrawable(new RectShape());
    private final ShapeDrawable b = new ShapeDrawable(new RectShape());
    private final Rect c = new Rect();
    private final Rect d = new Rect();

    public c()
    {
    }

    public void a(Canvas canvas)
    {
        canvas.drawRect(d, b.getPaint());
        canvas.drawRect(c, a.getPaint());
    }

    public void a(e e1, int i, int j, int k, int l)
    {
        c.left = i;
        c.top = (int)((float)j + e1.c);
        c.right = k;
        c.bottom = (int)((float)l + e1.c);
        d.left = i;
        d.top = (int)((float)j + e1.d);
        d.right = k;
        d.bottom = (int)((float)l + e1.d);
        a.getPaint().setColor(Color.argb(e1.a, 0, 0, 0));
        if (0.0F < e1.e)
        {
            a.getPaint().setMaskFilter(new BlurMaskFilter(e1.e, android.graphics.BlurMaskFilter.Blur.NORMAL));
        } else
        {
            a.getPaint().setMaskFilter(null);
        }
        b.getPaint().setColor(Color.argb(e1.b, 0, 0, 0));
        if (0.0F < e1.f)
        {
            b.getPaint().setMaskFilter(new BlurMaskFilter(e1.f, android.graphics.BlurMaskFilter.Blur.NORMAL));
            return;
        } else
        {
            b.getPaint().setMaskFilter(null);
            return;
        }
    }
}
