.class final Lcom/localytics/android/MigrationDatabaseHelper$AmpConditionValuesDbColumns;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/provider/BaseColumns;


# static fields
.field static final CONDITION_ID_REF:Ljava/lang/String; = "condition_id_ref"

.field static final TABLE_NAME:Ljava/lang/String; = "amp_condition_values"

.field static final VALUE:Ljava/lang/String; = "value"


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 1552
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1553
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This class is non-instantiable"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
