.class Lcom/squareup/okhttp/HttpResponseCache$CacheResponseBody$1;
.super Ljava/io/FilterInputStream;
.source "HttpResponseCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/okhttp/HttpResponseCache$CacheResponseBody;-><init>(Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/okhttp/HttpResponseCache$CacheResponseBody;

.field final synthetic val$snapshot:Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;


# direct methods
.method constructor <init>(Lcom/squareup/okhttp/HttpResponseCache$CacheResponseBody;Ljava/io/InputStream;Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;)V
    .locals 0
    .param p2, "x0"    # Ljava/io/InputStream;

    .prologue
    .line 564
    iput-object p1, p0, Lcom/squareup/okhttp/HttpResponseCache$CacheResponseBody$1;->this$0:Lcom/squareup/okhttp/HttpResponseCache$CacheResponseBody;

    iput-object p3, p0, Lcom/squareup/okhttp/HttpResponseCache$CacheResponseBody$1;->val$snapshot:Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;

    invoke-direct {p0, p2}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 566
    iget-object v0, p0, Lcom/squareup/okhttp/HttpResponseCache$CacheResponseBody$1;->val$snapshot:Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/DiskLruCache$Snapshot;->close()V

    .line 567
    invoke-super {p0}, Ljava/io/FilterInputStream;->close()V

    .line 568
    return-void
.end method
