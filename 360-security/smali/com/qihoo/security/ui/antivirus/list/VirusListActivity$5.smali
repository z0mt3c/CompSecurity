.class Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$5;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->A()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/dialog/i;

.field final synthetic b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/dialog/i;)V
    .locals 0

    .prologue
    .line 1156
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$5;->b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    iput-object p2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$5;->a:Lcom/qihoo/security/dialog/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1159
    const/4 v1, 0x4

    if-ne p2, v1, :cond_0

    .line 1160
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$5;->b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->b(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Z)Z

    .line 1161
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$5;->a:Lcom/qihoo/security/dialog/i;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/d;->b(Landroid/app/Dialog;)V

    .line 1162
    const/4 v0, 0x1

    .line 1164
    :cond_0
    return v0
.end method
