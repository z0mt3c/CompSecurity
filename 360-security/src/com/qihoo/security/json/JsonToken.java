// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.json;


public final class JsonToken extends Enum
{

    public static final JsonToken BEGIN_ARRAY;
    public static final JsonToken BEGIN_OBJECT;
    public static final JsonToken BOOLEAN;
    public static final JsonToken END_ARRAY;
    public static final JsonToken END_DOCUMENT;
    public static final JsonToken END_OBJECT;
    public static final JsonToken NAME;
    public static final JsonToken NULL;
    public static final JsonToken NUMBER;
    public static final JsonToken STRING;
    private static final JsonToken a[];

    private JsonToken(String s, int i)
    {
        super(s, i);
    }

    public static JsonToken valueOf(String s)
    {
        return (JsonToken)Enum.valueOf(com/qihoo/security/json/JsonToken, s);
    }

    public static JsonToken[] values()
    {
        return (JsonToken[])a.clone();
    }

    static 
    {
        BEGIN_ARRAY = new JsonToken("BEGIN_ARRAY", 0);
        END_ARRAY = new JsonToken("END_ARRAY", 1);
        BEGIN_OBJECT = new JsonToken("BEGIN_OBJECT", 2);
        END_OBJECT = new JsonToken("END_OBJECT", 3);
        NAME = new JsonToken("NAME", 4);
        STRING = new JsonToken("STRING", 5);
        NUMBER = new JsonToken("NUMBER", 6);
        BOOLEAN = new JsonToken("BOOLEAN", 7);
        NULL = new JsonToken("NULL", 8);
        END_DOCUMENT = new JsonToken("END_DOCUMENT", 9);
        a = (new JsonToken[] {
            BEGIN_ARRAY, END_ARRAY, BEGIN_OBJECT, END_OBJECT, NAME, STRING, NUMBER, BOOLEAN, NULL, END_DOCUMENT
        });
    }
}
