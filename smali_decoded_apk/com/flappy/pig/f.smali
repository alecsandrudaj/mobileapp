.class public Lcom/flappy/pig/f;
.super Lcom/flappy/m;


# instance fields
.field public a:Lcom/flappy/r;

.field public b:Lcom/flappy/i;

.field public c:Lcom/flappy/i;

.field d:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/flappy/m;-><init>()V

    sget-object v0, Lcom/flappy/g;->D:Lcom/flappy/g;

    const-string v1, "text_ready"

    invoke-virtual {v0, v1}, Lcom/flappy/g;->b(Ljava/lang/String;)Lcom/flappy/i;

    move-result-object v0

    iput-object v0, p0, Lcom/flappy/pig/f;->b:Lcom/flappy/i;

    sget-object v0, Lcom/flappy/g;->D:Lcom/flappy/g;

    const-string v1, "tutorial"

    invoke-virtual {v0, v1}, Lcom/flappy/g;->b(Ljava/lang/String;)Lcom/flappy/i;

    move-result-object v0

    iput-object v0, p0, Lcom/flappy/pig/f;->c:Lcom/flappy/i;

    new-instance v0, Lcom/flappy/r;

    invoke-direct {v0}, Lcom/flappy/r;-><init>()V

    iput-object v0, p0, Lcom/flappy/pig/f;->a:Lcom/flappy/r;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    const/4 v0, 0x1

    const/4 v4, 0x0

    iput-boolean v0, p0, Lcom/flappy/pig/f;->F:Z

    iput-boolean v0, p0, Lcom/flappy/pig/f;->G:Z

    iget-object v0, p0, Lcom/flappy/pig/f;->a:Lcom/flappy/r;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1, v2, v4, v3}, Lcom/flappy/r;->a(FFIF)V

    iput v4, p0, Lcom/flappy/pig/f;->d:I

    return-void
.end method

.method public a(F)V
    .locals 2

    const/4 v1, 0x1

    iget-object v0, p0, Lcom/flappy/pig/f;->a:Lcom/flappy/r;

    invoke-virtual {v0, p1}, Lcom/flappy/r;->a(F)V

    iget v0, p0, Lcom/flappy/pig/f;->d:I

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/flappy/pig/f;->a:Lcom/flappy/r;

    iget-boolean v0, v0, Lcom/flappy/r;->g:Z

    if-eqz v0, :cond_0

    iput v1, p0, Lcom/flappy/pig/f;->d:I

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/flappy/pig/f;->a:Lcom/flappy/r;

    iget-boolean v0, v0, Lcom/flappy/r;->g:Z

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lcom/flappy/pig/f;->F:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/flappy/pig/f;->G:Z

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public a(Lcom/flappy/g;)V
    .locals 4

    iget-object v0, p0, Lcom/flappy/pig/f;->b:Lcom/flappy/i;

    iget-object v1, p0, Lcom/flappy/pig/f;->b:Lcom/flappy/i;

    iget v1, v1, Lcom/flappy/i;->b:I

    rsub-int v1, v1, 0x120

    shr-int/lit8 v1, v1, 0x1

    const/16 v2, 0x92

    iget-object v3, p0, Lcom/flappy/pig/f;->a:Lcom/flappy/r;

    iget v3, v3, Lcom/flappy/r;->a:F

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/flappy/g;->a(Lcom/flappy/i;IIF)V

    iget-object v0, p0, Lcom/flappy/pig/f;->c:Lcom/flappy/i;

    iget-object v1, p0, Lcom/flappy/pig/f;->c:Lcom/flappy/i;

    iget v1, v1, Lcom/flappy/i;->b:I

    rsub-int v1, v1, 0x120

    shr-int/lit8 v1, v1, 0x1

    const/16 v2, 0xdc

    iget-object v3, p0, Lcom/flappy/pig/f;->a:Lcom/flappy/r;

    iget v3, v3, Lcom/flappy/r;->a:F

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/flappy/g;->a(Lcom/flappy/i;IIF)V

    return-void
.end method
