.class final Lcom/google/ads/a/l;
.super Ljava/util/HashMap;


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string v0, "/log"

    new-instance v1, Lcom/google/ads/ce;

    invoke-direct {v1}, Lcom/google/ads/ce;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/a/l;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "/setNativeActivationOverlay"

    new-instance v1, Lcom/google/ads/l;

    invoke-direct {v1}, Lcom/google/ads/l;-><init>()V

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/a/l;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
