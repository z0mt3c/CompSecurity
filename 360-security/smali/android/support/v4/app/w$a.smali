.class public Landroid/support/v4/app/w$a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/support/v4/app/o;
.implements Landroid/support/v4/app/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/app/Notification$Builder;

.field private final b:Landroid/os/Bundle;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/app/Notification;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/widget/RemoteViews;ILandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/graphics/Bitmap;IIZZILjava/lang/CharSequence;ZLandroid/os/Bundle;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 8

    .prologue
    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Landroid/support/v4/app/w$a;->c:Ljava/util/List;

    .line 77
    new-instance v4, Landroid/app/Notification$Builder;

    invoke-direct {v4, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    iget-wide v6, p2, Landroid/app/Notification;->when:J

    invoke-virtual {v4, v6, v7}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v4

    iget v5, p2, Landroid/app/Notification;->icon:I

    iget v6, p2, Landroid/app/Notification;->iconLevel:I

    invoke-virtual {v4, v5, v6}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    move-result-object v4

    iget-object v5, p2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v4

    iget-object v5, p2, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    invoke-virtual {v4, v5, p6}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v4

    iget-object v5, p2, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iget v6, p2, Landroid/app/Notification;->audioStreamType:I

    invoke-virtual {v4, v5, v6}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;I)Landroid/app/Notification$Builder;

    move-result-object v4

    iget-object v5, p2, Landroid/app/Notification;->vibrate:[J

    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    move-result-object v4

    iget v5, p2, Landroid/app/Notification;->ledARGB:I

    iget v6, p2, Landroid/app/Notification;->ledOnMS:I

    iget v7, p2, Landroid/app/Notification;->ledOffMS:I

    invoke-virtual {v4, v5, v6, v7}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v4, p2, Landroid/app/Notification;->flags:I

    and-int/lit8 v4, v4, 0x2

    if-eqz v4, :cond_4

    const/4 v4, 0x1

    :goto_0
    invoke-virtual {v5, v4}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v4, p2, Landroid/app/Notification;->flags:I

    and-int/lit8 v4, v4, 0x8

    if-eqz v4, :cond_5

    const/4 v4, 0x1

    :goto_1
    invoke-virtual {v5, v4}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v4, p2, Landroid/app/Notification;->flags:I

    and-int/lit8 v4, v4, 0x10

    if-eqz v4, :cond_6

    const/4 v4, 0x1

    :goto_2
    invoke-virtual {v5, v4}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v4

    iget v5, p2, Landroid/app/Notification;->defaults:I

    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v4

    invoke-virtual {v4, p3}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v4

    invoke-virtual {v4, p4}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v4

    move-object/from16 v0, p16

    invoke-virtual {v4, v0}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v4

    invoke-virtual {v4, p5}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v4

    move-object/from16 v0, p8

    invoke-virtual {v4, v0}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v4

    iget-object v5, p2, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v4, p2, Landroid/app/Notification;->flags:I

    and-int/lit16 v4, v4, 0x80

    if-eqz v4, :cond_7

    const/4 v4, 0x1

    :goto_3
    move-object/from16 v0, p9

    invoke-virtual {v5, v0, v4}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    move-result-object v4

    move-object/from16 v0, p10

    invoke-virtual {v4, v0}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    move-result-object v4

    invoke-virtual {v4, p7}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    move-result-object v4

    move/from16 v0, p14

    invoke-virtual {v4, v0}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    move-result-object v4

    move/from16 v0, p15

    invoke-virtual {v4, v0}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    move-result-object v4

    move/from16 v0, p11

    move/from16 v1, p12

    move/from16 v2, p13

    invoke-virtual {v4, v0, v1, v2}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    move-result-object v4

    iput-object v4, p0, Landroid/support/v4/app/w$a;->a:Landroid/app/Notification$Builder;

    .line 102
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    iput-object v4, p0, Landroid/support/v4/app/w$a;->b:Landroid/os/Bundle;

    .line 103
    if-eqz p18, :cond_0

    .line 104
    iget-object v4, p0, Landroid/support/v4/app/w$a;->b:Landroid/os/Bundle;

    move-object/from16 v0, p18

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 106
    :cond_0
    if-eqz p17, :cond_1

    .line 107
    iget-object v4, p0, Landroid/support/v4/app/w$a;->b:Landroid/os/Bundle;

    const-string/jumbo v5, "android.support.localOnly"

    const/4 v6, 0x1

    invoke-virtual {v4, v5, v6}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 109
    :cond_1
    if-eqz p19, :cond_2

    .line 110
    iget-object v4, p0, Landroid/support/v4/app/w$a;->b:Landroid/os/Bundle;

    const-string/jumbo v5, "android.support.groupKey"

    move-object/from16 v0, p19

    invoke-virtual {v4, v5, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    if-eqz p20, :cond_8

    .line 112
    iget-object v4, p0, Landroid/support/v4/app/w$a;->b:Landroid/os/Bundle;

    const-string/jumbo v5, "android.support.isGroupSummary"

    const/4 v6, 0x1

    invoke-virtual {v4, v5, v6}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 117
    :cond_2
    :goto_4
    if-eqz p21, :cond_3

    .line 118
    iget-object v4, p0, Landroid/support/v4/app/w$a;->b:Landroid/os/Bundle;

    const-string/jumbo v5, "android.support.sortKey"

    move-object/from16 v0, p21

    invoke-virtual {v4, v5, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    :cond_3
    return-void

    .line 77
    :cond_4
    const/4 v4, 0x0

    goto/16 :goto_0

    :cond_5
    const/4 v4, 0x0

    goto/16 :goto_1

    :cond_6
    const/4 v4, 0x0

    goto/16 :goto_2

    :cond_7
    const/4 v4, 0x0

    goto :goto_3

    .line 114
    :cond_8
    iget-object v4, p0, Landroid/support/v4/app/w$a;->b:Landroid/os/Bundle;

    const-string/jumbo v5, "android.support.useSideChannel"

    const/4 v6, 0x1

    invoke-virtual {v4, v5, v6}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_4
.end method


# virtual methods
.method public a()Landroid/app/Notification$Builder;
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Landroid/support/v4/app/w$a;->a:Landroid/app/Notification$Builder;

    return-object v0
.end method

.method public a(Landroid/support/v4/app/s$a;)V
    .locals 2

    .prologue
    .line 124
    iget-object v0, p0, Landroid/support/v4/app/w$a;->c:Ljava/util/List;

    iget-object v1, p0, Landroid/support/v4/app/w$a;->a:Landroid/app/Notification$Builder;

    invoke-static {v1, p1}, Landroid/support/v4/app/w;->a(Landroid/app/Notification$Builder;Landroid/support/v4/app/s$a;)Landroid/os/Bundle;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    return-void
.end method

.method public b()Landroid/app/Notification;
    .locals 6

    .prologue
    .line 133
    iget-object v0, p0, Landroid/support/v4/app/w$a;->a:Landroid/app/Notification$Builder;

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    .line 136
    invoke-static {v1}, Landroid/support/v4/app/w;->a(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v2

    .line 137
    new-instance v3, Landroid/os/Bundle;

    iget-object v0, p0, Landroid/support/v4/app/w$a;->b:Landroid/os/Bundle;

    invoke-direct {v3, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 138
    iget-object v0, p0, Landroid/support/v4/app/w$a;->b:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 139
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 140
    invoke-virtual {v3, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    goto :goto_0

    .line 143
    :cond_1
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 144
    iget-object v0, p0, Landroid/support/v4/app/w$a;->c:Ljava/util/List;

    invoke-static {v0}, Landroid/support/v4/app/w;->a(Ljava/util/List;)Landroid/util/SparseArray;

    move-result-object v0

    .line 145
    if-eqz v0, :cond_2

    .line 147
    invoke-static {v1}, Landroid/support/v4/app/w;->a(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v2

    const-string/jumbo v3, "android.support.actionExtras"

    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 149
    :cond_2
    return-object v1
.end method
