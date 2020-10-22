.class public Lcom/flappy/f;
.super Lcom/flappy/m;


# instance fields
.field public a:Lcom/flappy/i;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/flappy/m;-><init>()V

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 9

    const/4 v8, 0x1

    const/4 v1, 0x0

    sget-object v0, Lcom/flappy/g;->D:Lcom/flappy/g;

    iget v2, v0, Lcom/flappy/g;->u:I

    sget-object v0, Lcom/flappy/g;->D:Lcom/flappy/g;

    iget-object v3, v0, Lcom/flappy/g;->s:[I

    sget-object v0, Lcom/flappy/g;->D:Lcom/flappy/g;

    iget-object v4, v0, Lcom/flappy/g;->t:[I

    iput-boolean v1, p0, Lcom/flappy/f;->i:Z

    move v0, v1

    :goto_0
    if-lt v0, v2, :cond_1

    :goto_1
    iput-boolean v1, p0, Lcom/flappy/f;->g:Z

    iput-boolean v1, p0, Lcom/flappy/f;->h:Z

    iget-boolean v0, p0, Lcom/flappy/f;->i:Z

    iget-boolean v2, p0, Lcom/flappy/f;->f:Z

    if-eq v0, v2, :cond_0

    iget-boolean v0, p0, Lcom/flappy/f;->f:Z

    if-eqz v0, :cond_3

    iput-boolean v8, p0, Lcom/flappy/f;->h:Z

    iput-boolean v1, p0, Lcom/flappy/f;->f:Z

    :cond_0
    :goto_2
    return-void

    :cond_1
    aget v5, v3, v0

    iget v6, p0, Lcom/flappy/f;->b:I

    if-le v5, v6, :cond_2

    aget v5, v3, v0

    iget v6, p0, Lcom/flappy/f;->b:I

    iget v7, p0, Lcom/flappy/f;->d:I

    add-int/2addr v6, v7

    if-ge v5, v6, :cond_2

    aget v5, v4, v0

    iget v6, p0, Lcom/flappy/f;->c:I

    if-le v5, v6, :cond_2

    aget v5, v4, v0

    iget v6, p0, Lcom/flappy/f;->c:I

    iget v7, p0, Lcom/flappy/f;->e:I

    add-int/2addr v6, v7

    if-ge v5, v6, :cond_2

    iput-boolean v8, p0, Lcom/flappy/f;->i:Z

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    iput-boolean v8, p0, Lcom/flappy/f;->g:Z

    iput-boolean v8, p0, Lcom/flappy/f;->f:Z

    goto :goto_2
.end method

.method public a(II)V
    .locals 2

    const/4 v1, 0x1

    const/4 v0, 0x0

    iput p1, p0, Lcom/flappy/f;->b:I

    iput p2, p0, Lcom/flappy/f;->c:I

    iput-boolean v1, p0, Lcom/flappy/f;->F:Z

    iput-boolean v1, p0, Lcom/flappy/f;->G:Z

    iput-boolean v0, p0, Lcom/flappy/f;->i:Z

    iput-boolean v0, p0, Lcom/flappy/f;->g:Z

    iput-boolean v0, p0, Lcom/flappy/f;->h:Z

    iput-boolean v0, p0, Lcom/flappy/f;->f:Z

    return-void
.end method

.method public a(Lcom/flappy/g;)V
    .locals 7

    const/high16 v4, 0x3f800000    # 1.0f

    iget-boolean v0, p0, Lcom/flappy/f;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/flappy/f;->a:Lcom/flappy/i;

    iget v1, v0, Lcom/flappy/i;->i:I

    iget v2, p0, Lcom/flappy/f;->b:I

    iget v0, p0, Lcom/flappy/f;->c:I

    add-int/lit8 v3, v0, 0x2

    move-object v0, p1

    move v5, v4

    move v6, v4

    invoke-virtual/range {v0 .. v6}, Lcom/flappy/g;->a(IIIFFF)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/flappy/f;->a:Lcom/flappy/i;

    iget v1, v0, Lcom/flappy/i;->i:I

    iget v2, p0, Lcom/flappy/f;->b:I

    iget v3, p0, Lcom/flappy/f;->c:I

    move-object v0, p1

    move v5, v4

    move v6, v4

    invoke-virtual/range {v0 .. v6}, Lcom/flappy/g;->a(IIIFFF)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/flappy/g;->D:Lcom/flappy/g;

    invoke-virtual {v0, p1}, Lcom/flappy/g;->b(Ljava/lang/String;)Lcom/flappy/i;

    move-result-object v0

    iput-object v0, p0, Lcom/flappy/f;->a:Lcom/flappy/i;

    iget-object v0, p0, Lcom/flappy/f;->a:Lcom/flappy/i;

    iget v0, v0, Lcom/flappy/i;->b:I

    iput v0, p0, Lcom/flappy/f;->d:I

    iget-object v0, p0, Lcom/flappy/f;->a:Lcom/flappy/i;

    iget v0, v0, Lcom/flappy/i;->c:I

    iput v0, p0, Lcom/flappy/f;->e:I

    return-void
.end method
