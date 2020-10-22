.class Lcom/flappy/pig/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/flappy/pig/SplashScreen;


# direct methods
.method constructor <init>(Lcom/flappy/pig/SplashScreen;)V
    .locals 0

    iput-object p1, p0, Lcom/flappy/pig/d;->a:Lcom/flappy/pig/SplashScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/flappy/pig/d;->a:Lcom/flappy/pig/SplashScreen;

    const-class v2, Lcom/flappy/GameActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Lcom/flappy/pig/d;->a:Lcom/flappy/pig/SplashScreen;

    invoke-virtual {v1, v0}, Lcom/flappy/pig/SplashScreen;->startActivity(Landroid/content/Intent;)V

    iget-object v0, p0, Lcom/flappy/pig/d;->a:Lcom/flappy/pig/SplashScreen;

    invoke-virtual {v0}, Lcom/flappy/pig/SplashScreen;->finish()V

    return-void
.end method
