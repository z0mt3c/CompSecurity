// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import android.app.KeyguardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import com.facebook.ads.e;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.ads.internal.util:
//            t, r

public class h
{
    public static class a
    {

        public String a;
        public String b;
        public boolean c;

        public a(String s, String s1, boolean flag)
        {
            a = s;
            b = s1;
            c = flag;
        }
    }


    private static final Uri a = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");

    public static a a(ContentResolver contentresolver)
    {
        Cursor cursor = contentresolver.query(a, new String[] {
            "aid", "androidid", "limit_tracking"
        }, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        contentresolver = cursor;
        if (cursor.moveToFirst()) goto _L3; else goto _L2
_L2:
        contentresolver = cursor;
        a a1 = new a(null, null, false);
        contentresolver = a1;
        if (cursor != null)
        {
            cursor.close();
            contentresolver = a1;
        }
_L5:
        return contentresolver;
_L3:
        contentresolver = cursor;
        a1 = new a(cursor.getString(cursor.getColumnIndex("aid")), cursor.getString(cursor.getColumnIndex("androidid")), Boolean.valueOf(cursor.getString(cursor.getColumnIndex("limit_tracking"))).booleanValue());
        contentresolver = a1;
        if (cursor == null) goto _L5; else goto _L4
_L4:
        cursor.close();
        return a1;
        contentresolver;
        cursor = null;
_L9:
        contentresolver = cursor;
        a1 = new a(null, null, false);
        contentresolver = a1;
        if (cursor == null) goto _L5; else goto _L6
_L6:
        cursor.close();
        return a1;
        Exception exception;
        exception;
        contentresolver = null;
_L8:
        if (contentresolver != null)
        {
            contentresolver.close();
        }
        throw exception;
        exception;
        if (true) goto _L8; else goto _L7
_L7:
        contentresolver;
          goto _L9
    }

    public static transient Object a(Object obj, Method method, Object aobj[])
    {
        try
        {
            obj = method.invoke(obj, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        return obj;
    }

    public static String a(Map map)
    {
        JSONObject jsonobject = new JSONObject();
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            try
            {
                jsonobject.put((String)entry.getKey(), entry.getValue());
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
            }
        }

        return jsonobject.toString();
    }

    public static transient Method a(Class class1, String s, Class aclass[])
    {
        try
        {
            class1 = class1.getMethod(s, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    public static transient Method a(String s, String s1, Class aclass[])
    {
        try
        {
            s = a(Class.forName(s), s1, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static void a(Context context, String s)
    {
        if (e.a(context))
        {
            Log.d("FBAudienceNetworkLog", (new StringBuilder()).append(s).append(" (displayed for test ads only)").toString());
        }
    }

    public static boolean a()
    {
        String s = e.a();
        return !t.a(s) && s.endsWith(".sb");
    }

    public static boolean a(Context context)
    {
        if (!((PowerManager)context.getSystemService("power")).isScreenOn())
        {
            return false;
        }
        return !((KeyguardManager)context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    public static boolean a(Context context, View view, int i)
    {
        if (view == null || view.getParent() == null || view.getVisibility() != 0)
        {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 11 && view.getAlpha() < 0.9F)
        {
            return false;
        }
        int k = view.getWidth();
        int j = view.getHeight();
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        view = context.getResources().getDisplayMetrics();
        if (ai[0] < 0 || ((DisplayMetrics) (view)).widthPixels - ai[0] < k)
        {
            return false;
        }
        i = (int)(((double)j * (100D - (double)i)) / 100D);
        if (ai[1] < 0 && Math.abs(ai[1]) > i)
        {
            return false;
        }
        if ((j + ai[1]) - ((DisplayMetrics) (view)).heightPixels > i)
        {
            return false;
        } else
        {
            return a(context);
        }
    }

    public static HttpClient b()
    {
        DefaultHttpClient defaulthttpclient;
        Object obj;
        defaulthttpclient = new DefaultHttpClient();
        obj = defaulthttpclient.getParams();
        HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj)), 30000);
        HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj)), 30000);
        if (!a())
        {
            break MISSING_BLOCK_LABEL_144;
        }
        Object obj1 = KeyStore.getInstance(KeyStore.getDefaultType());
        ((KeyStore) (obj1)).load(null, null);
        obj1 = new r(((KeyStore) (obj1)));
        ((SSLSocketFactory) (obj1)).setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        HttpProtocolParams.setVersion(((org.apache.http.params.HttpParams) (obj)), HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(((org.apache.http.params.HttpParams) (obj)), "UTF-8");
        SchemeRegistry schemeregistry = new SchemeRegistry();
        schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeregistry.register(new Scheme("https", ((org.apache.http.conn.scheme.SocketFactory) (obj1)), 443));
        obj = new DefaultHttpClient(new ThreadSafeClientConnManager(((org.apache.http.params.HttpParams) (obj)), schemeregistry), ((org.apache.http.params.HttpParams) (obj)));
        return ((HttpClient) (obj));
        Exception exception;
        exception;
        return defaulthttpclient;
    }

}
