.class Lcom/google/ads/bf;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/ads/ba;

.field final synthetic b:Lcom/google/ads/bd;


# direct methods
.method constructor <init>(Lcom/google/ads/bd;Lcom/google/ads/ba;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ads/bf;->b:Lcom/google/ads/bd;

    iput-object p2, p0, Lcom/google/ads/bf;->a:Lcom/google/ads/ba;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/bf;->b:Lcom/google/ads/bd;

    invoke-static {v0}, Lcom/google/ads/bd;->b(Lcom/google/ads/bd;)Lcom/google/ads/a/w;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ads/bf;->a:Lcom/google/ads/ba;

    invoke-virtual {v0, v1}, Lcom/google/ads/a/w;->b(Lcom/google/ads/ba;)V

    return-void
.end method
