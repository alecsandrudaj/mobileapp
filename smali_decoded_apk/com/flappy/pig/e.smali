.class public Lcom/flappy/pig/e;
.super Lcom/flappy/m;


# instance fields
.field public a:Lcom/flappy/r;

.field public b:Lcom/flappy/i;

.field public c:I

.field public d:F

.field public e:F

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/flappy/m;-><init>()V

    sget-object v0, Lcom/flappy/g;->D:Lcom/flappy/g;

    const-string v1, "text_game_over"

    invoke-virtual {v0, v1}, Lcom/flappy/g;->b(Ljava/lang/String;)Lcom/flappy/i;

    move-result-object v0

    iput-object v0, p0, Lcom/flappy/pig/e;->b:Lcom/flappy/i;

    new-instance v0, Lcom/flappy/r;

    invoke-direct {v0}, Lcom/flappy/r;-><init>()V

    iput-object v0, p0, Lcom/flappy/pig/e;->a:Lcom/flappy/r;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    const/4 v0, 0x1

    const/4 v4, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    iput-boolean v0, p0, Lcom/flappy/pig/e;->F:Z

    iput-boolean v0, p0, Lcom/flappy/pig/e;->G:Z

    iget-object v0, p0, Lcom/flappy/pig/e;->a:Lcom/flappy/r;

    const/4 v1, 0x0

    const/16 v2, 0xb

    invoke-virtual {v0, v1, v3, v2, v3}, Lcom/flappy/r;->a(FFIF)V

    const/4 v0, -0x1

    iput v0, p0, Lcom/flappy/pig/e;->c:I

    const/high16 v0, -0x40000000    # -2.0f

    iput v0, p0, Lcom/flappy/pig/e;->d:F

    const/high16 v0, 0x3e800000    # 0.25f

    iput v0, p0, Lcom/flappy/pig/e;->e:F

    iput v4, p0, Lcom/flappy/pig/e;->f:I

    sget-object v0, Lcom/flappy/pig/c;->D:Lcom/flappy/g;

    const/16 v1, 0xa

    invoke-virtual {v0, v1, v4}, Lcom/flappy/g;->c(II)V

    return-void
.end method

.method public a(F)V
    .locals 8

    const/16 v3, 0xa

    const/4 v2, 0x2

    const/4 v7, 0x0

    iget-object v0, p0, Lcom/flappy/pig/e;->a:Lcom/flappy/r;

    invoke-virtual {v0, p1}, Lcom/flappy/r;->a(F)V

    iget v0, p0, Lcom/flappy/pig/e;->c:I

    if-gez v0, :cond_1

    iget v0, p0, Lcom/flappy/pig/e;->c:I

    int-to-float v0, v0

    iget v1, p0, Lcom/flappy/pig/e;->d:F

    add-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/flappy/pig/e;->c:I

    iget v0, p0, Lcom/flappy/pig/e;->d:F

    iget v1, p0, Lcom/flappy/pig/e;->e:F

    add-float/2addr v0, v1

    iput v0, p0, Lcom/flappy/pig/e;->d:F

    :goto_0
    iget v0, p0, Lcom/flappy/pig/e;->f:I

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    iput v7, p0, Lcom/flappy/pig/e;->c:I

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lcom/flappy/pig/e;->a:Lcom/flappy/r;

    iget-boolean v0, v0, Lcom/flappy/r;->g:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Lcom/flappy/pig/e;->f:I

    sget-object v0, Lcom/flappy/g;->D:Lcom/flappy/g;

    iget-object v0, v0, Lcom/flappy/g;->C:Lcom/flappy/p;

    sget-object v1, Lcom/flappy/g;->D:Lcom/flappy/g;

    iget v1, v1, Lcom/flappy/g;->y:I

    sget-object v2, Lcom/flappy/g;->D:Lcom/flappy/g;

    iget v2, v2, Lcom/flappy/g;->z:I

    const/16 v4, 0x14

    const/16 v5, 0x1e

    const/16 v6, 0x28

    invoke-virtual/range {v0 .. v6}, Lcom/flappy/p;->a(IIIIII)V

    sget-object v0, Lcom/flappy/pig/c;->D:Lcom/flappy/g;

    invoke-virtual {v0, v3, v7}, Lcom/flappy/g;->c(II)V

    goto :goto_1

    :pswitch_1
    sget-object v0, Lcom/flappy/g;->D:Lcom/flappy/g;

    iget-object v0, v0, Lcom/flappy/g;->C:Lcom/flappy/p;

    iget v0, v0, Lcom/flappy/p;->k:I

    if-ne v0, v2, :cond_0

    iput v2, p0, Lcom/flappy/pig/e;->f:I

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public a(Lcom/flappy/g;)V
    .locals 4

    iget-object v0, p0, Lcom/flappy/pig/e;->b:Lcom/flappy/i;

    iget-object v1, p0, Lcom/flappy/pig/e;->b:Lcom/flappy/i;

    iget v1, v1, Lcom/flappy/i;->b:I

    rsub-int v1, v1, 0x120

    shr-int/lit8 v1, v1, 0x1

    iget v2, p0, Lcom/flappy/pig/e;->c:I

    add-int/lit16 v2, v2, 0x82

    iget-object v3, p0, Lcom/flappy/pig/e;->a:Lcom/flappy/r;

    iget v3, v3, Lcom/flappy/r;->a:F

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/flappy/g;->a(Lcom/flappy/i;IIF)V

    return-void
.end method
