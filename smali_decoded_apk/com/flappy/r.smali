.class public Lcom/flappy/r;
.super Ljava/lang/Object;


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:F

.field public e:F

.field public f:I

.field public g:Z

.field private h:I

.field private i:I

.field private j:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/flappy/r;->g:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/flappy/r;->a:F

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 3

    const/high16 v2, 0x42c80000    # 100.0f

    iget-boolean v0, p0, Lcom/flappy/r;->g:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v0, p0, Lcom/flappy/r;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/flappy/r;->i:I

    iget v0, p0, Lcom/flappy/r;->i:I

    int-to-float v0, v0

    iget v1, p0, Lcom/flappy/r;->j:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/flappy/r;->b:F

    iget v0, p0, Lcom/flappy/r;->f:I

    packed-switch v0, :pswitch_data_0

    :goto_1
    :pswitch_0
    iget v0, p0, Lcom/flappy/r;->b:F

    iget v1, p0, Lcom/flappy/r;->e:F

    mul-float/2addr v0, v1

    iget v1, p0, Lcom/flappy/r;->c:F

    add-float/2addr v0, v1

    iput v0, p0, Lcom/flappy/r;->a:F

    iget v0, p0, Lcom/flappy/r;->i:I

    iget v1, p0, Lcom/flappy/r;->h:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/flappy/r;->g:Z

    iget v0, p0, Lcom/flappy/r;->d:F

    iput v0, p0, Lcom/flappy/r;->a:F

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/flappy/r;->b:F

    goto :goto_0

    :pswitch_1
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->b(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto :goto_1

    :pswitch_2
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->c(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto :goto_1

    :pswitch_3
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->d(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto :goto_1

    :pswitch_4
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->e(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto :goto_1

    :pswitch_5
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->f(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto :goto_1

    :pswitch_6
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->g(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto :goto_1

    :pswitch_7
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->h(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto :goto_1

    :pswitch_8
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->i(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto :goto_1

    :pswitch_9
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->j(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto :goto_1

    :pswitch_a
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->k(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto/16 :goto_1

    :pswitch_b
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->l(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto/16 :goto_1

    :pswitch_c
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->m(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto/16 :goto_1

    :pswitch_d
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->n(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto/16 :goto_1

    :pswitch_e
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->o(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto/16 :goto_1

    :pswitch_f
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->p(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto/16 :goto_1

    :pswitch_10
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->q(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto/16 :goto_1

    :pswitch_11
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->r(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto/16 :goto_1

    :pswitch_12
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->s(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto/16 :goto_1

    :pswitch_13
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->t(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto/16 :goto_1

    :pswitch_14
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->u(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto/16 :goto_1

    :pswitch_15
    iget v0, p0, Lcom/flappy/r;->b:F

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {v0}, Lcom/flappy/j;->v(I)F

    move-result v0

    iput v0, p0, Lcom/flappy/r;->b:F

    goto/16 :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
        :pswitch_14
        :pswitch_15
    .end packed-switch
.end method

.method public a(FFIF)V
    .locals 3

    const/4 v2, 0x0

    iput p1, p0, Lcom/flappy/r;->c:F

    iput p2, p0, Lcom/flappy/r;->d:F

    iget v0, p0, Lcom/flappy/r;->d:F

    iget v1, p0, Lcom/flappy/r;->c:F

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/flappy/r;->e:F

    const/high16 v0, 0x42700000    # 60.0f

    mul-float/2addr v0, p4

    float-to-int v0, v0

    iput v0, p0, Lcom/flappy/r;->h:I

    const/high16 v0, 0x3f800000    # 1.0f

    iget v1, p0, Lcom/flappy/r;->h:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/flappy/r;->j:F

    iput v2, p0, Lcom/flappy/r;->i:I

    iput p3, p0, Lcom/flappy/r;->f:I

    iput-boolean v2, p0, Lcom/flappy/r;->g:Z

    iget v0, p0, Lcom/flappy/r;->c:F

    iput v0, p0, Lcom/flappy/r;->a:F

    return-void
.end method
