.class public Lcom/flappy/pig/a;
.super Lcom/flappy/q;


# instance fields
.field private A:Lcom/flappy/e;

.field private B:I

.field q:F

.field r:F

.field s:F

.field t:F

.field u:F

.field v:Z

.field w:Z

.field x:I

.field y:F

.field z:I


# direct methods
.method public constructor <init>()V
    .locals 11

    const/16 v10, 0xa

    const/4 v9, 0x0

    const/16 v8, 0xc

    const/4 v6, 0x2

    const/4 v7, 0x1

    invoke-direct {p0}, Lcom/flappy/q;-><init>()V

    const/16 v0, 0x1e

    iput v0, p0, Lcom/flappy/pig/a;->B:I

    const-string v1, "bird"

    const/16 v2, 0x14

    const/16 v3, 0x14

    const/16 v4, 0xe

    const/16 v5, 0xe

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/flappy/pig/a;->a(Ljava/lang/String;IIII)V

    new-array v3, v8, [I

    aput v7, v3, v7

    aput v6, v3, v6

    const/4 v0, 0x3

    aput v7, v3, v0

    const/4 v0, 0x5

    aput v7, v3, v0

    const/4 v0, 0x6

    aput v6, v3, v0

    const/4 v0, 0x7

    aput v7, v3, v0

    const/16 v0, 0x9

    aput v7, v3, v0

    aput v6, v3, v10

    const/16 v0, 0xb

    aput v7, v3, v0

    const-string v2, "flap"

    const/16 v5, 0x1e

    move-object v0, p0

    move v1, v9

    move v4, v8

    move v6, v9

    invoke-virtual/range {v0 .. v6}, Lcom/flappy/pig/a;->a(ILjava/lang/String;[IIIZ)V

    const-string v2, "auto"

    move-object v0, p0

    move v1, v7

    move v4, v8

    move v5, v10

    move v6, v7

    invoke-virtual/range {v0 .. v6}, Lcom/flappy/pig/a;->a(ILjava/lang/String;[IIIZ)V

    iput-boolean v7, p0, Lcom/flappy/pig/a;->w:Z

    invoke-static {}, Lcom/flappy/j;->a()I

    move-result v0

    rem-int/lit8 v0, v0, 0x3

    iput v0, p0, Lcom/flappy/pig/a;->z:I

    new-instance v0, Lcom/flappy/e;

    invoke-direct {v0}, Lcom/flappy/e;-><init>()V

    iput-object v0, p0, Lcom/flappy/pig/a;->A:Lcom/flappy/e;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x1

    const/16 v0, 0x50

    const/16 v1, 0xf6

    invoke-super {p0, v0, v1}, Lcom/flappy/q;->a(II)V

    iput v3, p0, Lcom/flappy/pig/a;->q:F

    iput v3, p0, Lcom/flappy/pig/a;->t:F

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/flappy/pig/a;->u:F

    const v0, 0x3ecccccd    # 0.4f

    iput v0, p0, Lcom/flappy/pig/a;->s:F

    iput-boolean v4, p0, Lcom/flappy/pig/a;->v:Z

    iput-boolean v2, p0, Lcom/flappy/pig/a;->w:Z

    iput v4, p0, Lcom/flappy/pig/a;->x:I

    invoke-virtual {p0, v2, v2}, Lcom/flappy/pig/a;->a(IZ)V

    invoke-static {}, Lcom/flappy/j;->a()I

    move-result v0

    rem-int/lit8 v0, v0, 0x3

    iput v0, p0, Lcom/flappy/pig/a;->z:I

    return-void
.end method

.method public a(F)V
    .locals 6

    const/high16 v5, 0x42b40000    # 90.0f

    const/high16 v4, 0x41000000    # 8.0f

    const/high16 v3, -0x3e600000    # -20.0f

    const/4 v2, 0x0

    invoke-super {p0, p1}, Lcom/flappy/q;->a(F)V

    iget-boolean v0, p0, Lcom/flappy/pig/a;->w:Z

    if-nez v0, :cond_6

    iput v2, p0, Lcom/flappy/pig/a;->y:F

    iget v0, p0, Lcom/flappy/pig/a;->t:F

    iget v1, p0, Lcom/flappy/pig/a;->u:F

    add-float/2addr v0, v1

    iput v0, p0, Lcom/flappy/pig/a;->t:F

    iget v0, p0, Lcom/flappy/pig/a;->t:F

    cmpl-float v0, v0, v4

    if-lez v0, :cond_0

    iput v4, p0, Lcom/flappy/pig/a;->t:F

    :cond_0
    iget v0, p0, Lcom/flappy/pig/a;->c:I

    int-to-float v0, v0

    iget v1, p0, Lcom/flappy/pig/a;->t:F

    add-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/flappy/pig/a;->c:I

    iget v0, p0, Lcom/flappy/pig/a;->c:I

    iget v1, p0, Lcom/flappy/pig/a;->f:I

    rsub-int v1, v1, 0x190

    if-le v0, v1, :cond_1

    iget v0, p0, Lcom/flappy/pig/a;->f:I

    rsub-int v0, v0, 0x190

    iput v0, p0, Lcom/flappy/pig/a;->c:I

    iput v2, p0, Lcom/flappy/pig/a;->u:F

    iput v2, p0, Lcom/flappy/pig/a;->t:F

    :cond_1
    iget v0, p0, Lcom/flappy/pig/a;->q:F

    iget v1, p0, Lcom/flappy/pig/a;->r:F

    add-float/2addr v0, v1

    iput v0, p0, Lcom/flappy/pig/a;->q:F

    iget v0, p0, Lcom/flappy/pig/a;->r:F

    iget v1, p0, Lcom/flappy/pig/a;->s:F

    add-float/2addr v0, v1

    iput v0, p0, Lcom/flappy/pig/a;->r:F

    iget v0, p0, Lcom/flappy/pig/a;->q:F

    cmpg-float v0, v0, v3

    if-gez v0, :cond_2

    iput v3, p0, Lcom/flappy/pig/a;->q:F

    :cond_2
    iget v0, p0, Lcom/flappy/pig/a;->q:F

    cmpl-float v0, v0, v5

    if-lez v0, :cond_3

    iput v5, p0, Lcom/flappy/pig/a;->q:F

    :cond_3
    iget v0, p0, Lcom/flappy/pig/a;->B:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/flappy/pig/a;->B:I

    iget v0, p0, Lcom/flappy/pig/a;->B:I

    if-nez v0, :cond_4

    const/16 v0, 0x1e

    iput v0, p0, Lcom/flappy/pig/a;->B:I

    :cond_4
    iget-object v0, p0, Lcom/flappy/pig/a;->A:Lcom/flappy/e;

    iget-boolean v0, v0, Lcom/flappy/e;->m:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/flappy/pig/a;->A:Lcom/flappy/e;

    invoke-virtual {v0, p1}, Lcom/flappy/e;->a(F)V

    :cond_5
    :goto_0
    return-void

    :cond_6
    iget v0, p0, Lcom/flappy/pig/a;->x:I

    add-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/flappy/pig/a;->x:I

    iget v0, p0, Lcom/flappy/pig/a;->x:I

    const/16 v1, 0x168

    if-ne v0, v1, :cond_7

    const/4 v0, 0x0

    iput v0, p0, Lcom/flappy/pig/a;->x:I

    :cond_7
    iget v0, p0, Lcom/flappy/pig/a;->x:I

    int-to-float v0, v0

    invoke-static {v0}, Lcom/flappy/j;->b(F)F

    move-result v0

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/flappy/pig/a;->y:F

    goto :goto_0
.end method

.method public a(Lcom/flappy/g;)V
    .locals 6

    iget-boolean v0, p0, Lcom/flappy/pig/a;->n:Z

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/flappy/pig/a;->p:[Lcom/flappy/i;

    iget v1, p0, Lcom/flappy/pig/a;->z:I

    mul-int/lit8 v1, v1, 0x3

    add-int/lit8 v1, v1, 0x1

    aget-object v1, v0, v1

    iget-object v0, p0, Lcom/flappy/pig/a;->j:Lcom/flappy/d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/flappy/pig/a;->j:Lcom/flappy/d;

    iget-boolean v0, v0, Lcom/flappy/d;->a:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/flappy/pig/a;->p:[Lcom/flappy/i;

    iget-object v1, p0, Lcom/flappy/pig/a;->j:Lcom/flappy/d;

    iget v1, v1, Lcom/flappy/d;->j:I

    iget v2, p0, Lcom/flappy/pig/a;->z:I

    mul-int/lit8 v2, v2, 0x3

    add-int/2addr v1, v2

    aget-object v1, v0, v1

    :cond_1
    iget v0, p0, Lcom/flappy/pig/a;->b:I

    iget v2, p0, Lcom/flappy/pig/a;->g:I

    sub-int v2, v0, v2

    iget v0, p0, Lcom/flappy/pig/a;->c:I

    iget v3, p0, Lcom/flappy/pig/a;->h:I

    sub-int/2addr v0, v3

    iget v3, p0, Lcom/flappy/pig/a;->y:F

    float-to-int v3, v3

    add-int/2addr v3, v0

    const/high16 v4, 0x3f800000    # 1.0f

    iget v0, p0, Lcom/flappy/pig/a;->q:F

    float-to-int v5, v0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/flappy/g;->a(Lcom/flappy/i;IIFI)V

    goto :goto_0
.end method

.method public b()V
    .locals 4

    const/4 v1, 0x0

    iget-boolean v0, p0, Lcom/flappy/pig/a;->w:Z

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lcom/flappy/pig/a;->w:Z

    :cond_0
    iget v0, p0, Lcom/flappy/pig/a;->c:I

    if-gez v0, :cond_2

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-boolean v0, p0, Lcom/flappy/pig/a;->v:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, v1, v0}, Lcom/flappy/pig/a;->a(IZ)V

    const/high16 v0, -0x3f600000    # -5.0f

    iput v0, p0, Lcom/flappy/pig/a;->t:F

    const v0, 0x3e99999a    # 0.3f

    iput v0, p0, Lcom/flappy/pig/a;->u:F

    const/high16 v0, -0x3ee00000    # -10.0f

    iput v0, p0, Lcom/flappy/pig/a;->r:F

    const v0, 0x3ecccccd    # 0.4f

    iput v0, p0, Lcom/flappy/pig/a;->s:F

    sget-object v0, Lcom/flappy/pig/c;->D:Lcom/flappy/g;

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x5

    invoke-virtual {v0, v1, v2, v3}, Lcom/flappy/g;->a(ILcom/flappy/m;I)V

    goto :goto_0
.end method
