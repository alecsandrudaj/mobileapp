.class final Lcom/google/ads/a/k;
.super Ljava/util/HashMap;


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string v0, "/invalidRequest"

    new-instance v1, Lcom/google/ads/cb;

    invoke-direct {v1}, Lcom/google/ads/cb;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/a/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "/loadAdURL"

    new-instance v1, Lcom/google/ads/cc;

    invoke-direct {v1}, Lcom/google/ads/cc;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/a/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "/loadSdkConstants"

    new-instance v1, Lcom/google/ads/cd;

    invoke-direct {v1}, Lcom/google/ads/cd;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/a/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "/log"

    new-instance v1, Lcom/google/ads/ce;

    invoke-direct {v1}, Lcom/google/ads/ce;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/a/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
