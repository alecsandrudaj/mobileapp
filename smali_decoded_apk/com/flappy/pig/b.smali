.class public Lcom/flappy/pig/b;
.super Lcom/flappy/h;


# instance fields
.field m:F


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "font"

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, Lcom/flappy/h;-><init>(Ljava/lang/String;I)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/flappy/pig/b;->m:F

    return-void
.end method
