// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.d;

import com.facebook.ads.internal.server.AdPlacementType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class c
{

    private static final AdPlacementType i;
    protected AdPlacementType a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected boolean f;
    public int g;
    public int h;

    public c(Map map)
    {
        a = i;
        b = 1;
        d = 0;
        e = 20;
        f = false;
        g = -1;
        h = -1;
        map = map.entrySet().iterator();
_L20:
        java.util.Map.Entry entry;
        String s;
        if (!map.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        entry = (java.util.Map.Entry)map.next();
        s = (String)entry.getKey();
        s.hashCode();
        JVM INSTR lookupswitch 8: default 160
    //                   -1561601017: 294
    //                   -553208868: 309
    //                   3575610: 234
    //                   664421755: 264
    //                   700812481: 249
    //                   1085444827: 279
    //                   1503616961: 340
    //                   2002133996: 324;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        byte byte0 = -1;
_L11:
        switch (byte0)
        {
        case 0: // '\0'
            a = AdPlacementType.fromString(String.valueOf(entry.getValue()));
            break;

        case 1: // '\001'
            b = Integer.parseInt((String)entry.getValue());
            break;

        case 2: // '\002'
            c = ((Integer)entry.getValue()).intValue();
            break;

        case 3: // '\003'
            d = Integer.parseInt((String)entry.getValue());
            break;

        case 4: // '\004'
            e = Integer.parseInt((String)entry.getValue());
            break;

        case 5: // '\005'
            f = ((Boolean)entry.getValue()).booleanValue();
            break;

        case 6: // '\006'
            g = ((Integer)entry.getValue()).intValue();
            break;

        case 7: // '\007'
            h = ((Integer)entry.getValue()).intValue();
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!s.equals("type")) goto _L1; else goto _L10
_L10:
        byte0 = 0;
          goto _L11
_L6:
        if (!s.equals("min_viewability_percentage")) goto _L1; else goto _L12
_L12:
        byte0 = 1;
          goto _L11
_L5:
        if (!s.equals("min_viewability_duration")) goto _L1; else goto _L13
_L13:
        byte0 = 2;
          goto _L11
_L7:
        if (!s.equals("refresh")) goto _L1; else goto _L14
_L14:
        byte0 = 3;
          goto _L11
_L2:
        if (!s.equals("refresh_threshold")) goto _L1; else goto _L15
_L15:
        byte0 = 4;
          goto _L11
_L3:
        if (!s.equals("cacheable")) goto _L1; else goto _L16
_L16:
        byte0 = 5;
          goto _L11
_L9:
        if (!s.equals("placement_width")) goto _L1; else goto _L17
_L17:
        byte0 = 6;
          goto _L11
_L8:
        if (!s.equals("placement_height")) goto _L1; else goto _L18
_L18:
        byte0 = 7;
          goto _L11
        if (true) goto _L20; else goto _L19
_L19:
    }

    public static c a(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return null;
        }
        Iterator iterator = jsonobject.keys();
        HashMap hashmap = new HashMap();
        String s;
        for (; iterator.hasNext(); hashmap.put(s, jsonobject.opt(s)))
        {
            s = (String)iterator.next();
        }

        return new c(hashmap);
    }

    public AdPlacementType a()
    {
        return a;
    }

    public long b()
    {
        return (long)(d * 1000);
    }

    public long c()
    {
        return (long)(e * 1000);
    }

    public boolean d()
    {
        return f;
    }

    public int e()
    {
        return b;
    }

    static 
    {
        i = AdPlacementType.UNKNOWN;
    }
}
