.class Landroid/support/v4/widget/SwipeRefreshLayout$3;
.super Landroid/support/v4/widget/SwipeRefreshLayout$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/widget/SwipeRefreshLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v4/widget/SwipeRefreshLayout;


# direct methods
.method constructor <init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V
    .locals 1

    .prologue
    .line 123
    iput-object p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout$3;->a:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/SwipeRefreshLayout$a;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;Landroid/support/v4/widget/SwipeRefreshLayout$1;)V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 128
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout$3;->a:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->b(Landroid/support/v4/widget/SwipeRefreshLayout;I)I

    .line 129
    return-void
.end method
