.class Lcom/facebook/ads/internal/adapters/view/a$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/facebook/ads/internal/f/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/ads/internal/adapters/view/a;-><init>(Lcom/facebook/ads/InterstitialAdActivity;Lcom/facebook/ads/internal/adapters/view/b$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ads/InterstitialAdActivity;

.field final synthetic b:Lcom/facebook/ads/internal/adapters/view/a;


# direct methods
.method constructor <init>(Lcom/facebook/ads/internal/adapters/view/a;Lcom/facebook/ads/InterstitialAdActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/internal/adapters/view/a$1;->b:Lcom/facebook/ads/internal/adapters/view/a;

    iput-object p2, p0, Lcom/facebook/ads/internal/adapters/view/a$1;->a:Lcom/facebook/ads/InterstitialAdActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a$1;->b:Lcom/facebook/ads/internal/adapters/view/a;

    invoke-static {v0}, Lcom/facebook/ads/internal/adapters/view/a;->b(Lcom/facebook/ads/internal/adapters/view/a;)Lcom/facebook/ads/internal/adapters/r;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/r;->a()V

    return-void
.end method

.method public a(I)V
    .locals 0

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string/jumbo v1, "fbad"

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string/jumbo v1, "close"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a$1;->a:Lcom/facebook/ads/InterstitialAdActivity;

    invoke-virtual {v0}, Lcom/facebook/ads/InterstitialAdActivity;->finish()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/view/a$1;->b:Lcom/facebook/ads/internal/adapters/view/a;

    invoke-static {v1}, Lcom/facebook/ads/internal/adapters/view/a;->a(Lcom/facebook/ads/internal/adapters/view/a;)Lcom/facebook/ads/internal/adapters/view/b$a;

    move-result-object v1

    const-string/jumbo v2, "com.facebook.ads.interstitial.clicked"

    invoke-interface {v1, v2}, Lcom/facebook/ads/internal/adapters/view/b$a;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/view/a$1;->a:Lcom/facebook/ads/InterstitialAdActivity;

    invoke-static {v1, v0}, Lcom/facebook/ads/internal/a/b;->a(Landroid/content/Context;Landroid/net/Uri;)Lcom/facebook/ads/internal/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/view/a$1;->b:Lcom/facebook/ads/internal/adapters/view/a;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/a/a;->a()Lcom/facebook/ads/internal/util/b$a;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/ads/internal/adapters/view/a;->a(Lcom/facebook/ads/internal/adapters/view/a;Lcom/facebook/ads/internal/util/b$a;)Lcom/facebook/ads/internal/util/b$a;

    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/view/a$1;->b:Lcom/facebook/ads/internal/adapters/view/a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lcom/facebook/ads/internal/adapters/view/a;->a(Lcom/facebook/ads/internal/adapters/view/a;J)J

    invoke-virtual {v0}, Lcom/facebook/ads/internal/a/a;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/facebook/ads/internal/adapters/view/a;->d()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "Error executing action"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method
