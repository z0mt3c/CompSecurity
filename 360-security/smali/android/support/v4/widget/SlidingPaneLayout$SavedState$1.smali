.class final Landroid/support/v4/widget/SlidingPaneLayout$SavedState$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/widget/SlidingPaneLayout$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Landroid/support/v4/widget/SlidingPaneLayout$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1465
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Landroid/support/v4/widget/SlidingPaneLayout$SavedState;
    .locals 2

    .prologue
    .line 1467
    new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;-><init>(Landroid/os/Parcel;Landroid/support/v4/widget/SlidingPaneLayout$1;)V

    return-object v0
.end method

.method public a(I)[Landroid/support/v4/widget/SlidingPaneLayout$SavedState;
    .locals 1

    .prologue
    .line 1471
    new-array v0, p1, [Landroid/support/v4/widget/SlidingPaneLayout$SavedState;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1465
    invoke-virtual {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$SavedState$1;->a(Landroid/os/Parcel;)Landroid/support/v4/widget/SlidingPaneLayout$SavedState;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1465
    invoke-virtual {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$SavedState$1;->a(I)[Landroid/support/v4/widget/SlidingPaneLayout$SavedState;

    move-result-object v0

    return-object v0
.end method
