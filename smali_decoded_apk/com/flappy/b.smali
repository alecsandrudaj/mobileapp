.class Lcom/flappy/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/flappy/GameActivity;


# direct methods
.method constructor <init>(Lcom/flappy/GameActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/flappy/b;->a:Lcom/flappy/GameActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/flappy/b;->a:Lcom/flappy/GameActivity;

    iget-object v0, v0, Lcom/flappy/GameActivity;->a:Lcom/google/ads/AdView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/ads/AdView;->setVisibility(I)V

    return-void
.end method
