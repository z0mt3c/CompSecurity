.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$14;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V
    .locals 0

    .prologue
    .line 1606
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$14;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    const/4 v1, 0x4

    .line 1609
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$14;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aj(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 1610
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$14;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ak(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 1611
    return-void
.end method
