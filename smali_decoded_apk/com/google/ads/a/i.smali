.class final Lcom/google/ads/a/i;
.super Ljava/util/HashMap;


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string v0, "/open"

    new-instance v1, Lcom/google/ads/cf;

    invoke-direct {v1}, Lcom/google/ads/cf;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/a/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "/canOpenURLs"

    new-instance v1, Lcom/google/ads/bw;

    invoke-direct {v1}, Lcom/google/ads/bw;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/a/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "/close"

    new-instance v1, Lcom/google/ads/by;

    invoke-direct {v1}, Lcom/google/ads/by;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/a/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "/customClose"

    new-instance v1, Lcom/google/ads/bz;

    invoke-direct {v1}, Lcom/google/ads/bz;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/a/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "/appEvent"

    new-instance v1, Lcom/google/ads/bv;

    invoke-direct {v1}, Lcom/google/ads/bv;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/a/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "/log"

    new-instance v1, Lcom/google/ads/ce;

    invoke-direct {v1}, Lcom/google/ads/ce;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/a/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "/click"

    new-instance v1, Lcom/google/ads/bx;

    invoke-direct {v1}, Lcom/google/ads/bx;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/a/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "/httpTrack"

    new-instance v1, Lcom/google/ads/ca;

    invoke-direct {v1}, Lcom/google/ads/ca;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/a/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "/touch"

    new-instance v1, Lcom/google/ads/m;

    invoke-direct {v1}, Lcom/google/ads/m;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/a/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "/video"

    new-instance v1, Lcom/google/ads/n;

    invoke-direct {v1}, Lcom/google/ads/n;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/a/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
