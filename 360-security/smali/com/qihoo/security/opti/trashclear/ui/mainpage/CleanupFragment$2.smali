.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$2;
.super Lcom/qihoo/security/widget/RevealRippleLayout$b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)V
    .locals 0

    .prologue
    .line 1293
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-direct {p0}, Lcom/qihoo/security/widget/RevealRippleLayout$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IZ)Z
    .locals 1

    .prologue
    .line 1297
    const/16 v0, 0x1e

    if-lt p1, v0, :cond_1

    .line 1298
    if-eqz p2, :cond_0

    .line 1301
    :cond_0
    const/4 v0, 0x0

    .line 1303
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method
