.class public Lcom/flappy/q;
.super Lcom/flappy/m;


# instance fields
.field a:[Lcom/flappy/d;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:F

.field public j:Lcom/flappy/d;

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:I

.field public p:[Lcom/flappy/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/flappy/m;-><init>()V

    const/16 v0, 0xa

    new-array v0, v0, [Lcom/flappy/d;

    iput-object v0, p0, Lcom/flappy/q;->a:[Lcom/flappy/d;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/flappy/q;->i:F

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/flappy/q;->j:Lcom/flappy/d;

    iput-boolean v1, p0, Lcom/flappy/q;->m:Z

    iput-boolean v1, p0, Lcom/flappy/q;->n:Z

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    iget-boolean v0, p0, Lcom/flappy/q;->m:Z

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/flappy/q;->j:Lcom/flappy/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/flappy/q;->j:Lcom/flappy/d;

    invoke-virtual {v0, p1}, Lcom/flappy/d;->a(F)V

    goto :goto_0
.end method

.method public a(II)V
    .locals 2

    const/4 v1, 0x1

    const/4 v0, 0x0

    iput p1, p0, Lcom/flappy/q;->b:I

    iput p2, p0, Lcom/flappy/q;->c:I

    iput v0, p0, Lcom/flappy/q;->d:I

    iput-boolean v1, p0, Lcom/flappy/q;->m:Z

    iput-boolean v1, p0, Lcom/flappy/q;->n:Z

    iput-boolean v0, p0, Lcom/flappy/q;->k:Z

    iput-boolean v0, p0, Lcom/flappy/q;->l:Z

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/flappy/q;->i:F

    return-void
.end method

.method public a(ILjava/lang/String;[IIIZ)V
    .locals 7

    new-instance v0, Lcom/flappy/d;

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/flappy/d;-><init>(ILjava/lang/String;[IIIZ)V

    iget-object v1, p0, Lcom/flappy/q;->a:[Lcom/flappy/d;

    aput-object v0, v1, p1

    return-void
.end method

.method public a(IZ)V
    .locals 1

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/flappy/q;->a:[Lcom/flappy/d;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Lcom/flappy/d;->a()V

    :cond_0
    iget-object v0, p0, Lcom/flappy/q;->a:[Lcom/flappy/d;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Lcom/flappy/d;->b()V

    iget-object v0, p0, Lcom/flappy/q;->a:[Lcom/flappy/d;

    aget-object v0, v0, p1

    iput-object v0, p0, Lcom/flappy/q;->j:Lcom/flappy/d;

    return-void
.end method

.method public a(Lcom/flappy/g;)V
    .locals 7

    const/high16 v4, 0x3f800000    # 1.0f

    iget-boolean v0, p0, Lcom/flappy/q;->n:Z

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/flappy/q;->p:[Lcom/flappy/i;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/flappy/q;->j:Lcom/flappy/d;

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/flappy/q;->p:[Lcom/flappy/i;

    iget-object v1, p0, Lcom/flappy/q;->j:Lcom/flappy/d;

    iget v1, v1, Lcom/flappy/d;->j:I

    aget-object v0, v0, v1

    :cond_1
    iget v1, v0, Lcom/flappy/i;->i:I

    iget v0, p0, Lcom/flappy/q;->b:I

    iget v2, p0, Lcom/flappy/q;->g:I

    sub-int v2, v0, v2

    iget v0, p0, Lcom/flappy/q;->c:I

    iget v3, p0, Lcom/flappy/q;->h:I

    sub-int v3, v0, v3

    iget v6, p0, Lcom/flappy/q;->i:F

    move-object v0, p1

    move v5, v4

    invoke-virtual/range {v0 .. v6}, Lcom/flappy/g;->a(IIIFFF)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;IIII)V
    .locals 3

    const/4 v2, 0x0

    sget-object v0, Lcom/flappy/g;->D:Lcom/flappy/g;

    invoke-virtual {v0, p1}, Lcom/flappy/g;->a(Ljava/lang/String;)[Lcom/flappy/i;

    move-result-object v0

    iput-object v0, p0, Lcom/flappy/q;->p:[Lcom/flappy/i;

    iget-object v0, p0, Lcom/flappy/q;->p:[Lcom/flappy/i;

    array-length v0, v0

    iput v0, p0, Lcom/flappy/q;->o:I

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    iput p2, p0, Lcom/flappy/q;->e:I

    iput p3, p0, Lcom/flappy/q;->f:I

    :goto_0
    if-eqz p4, :cond_1

    if-eqz p5, :cond_1

    iput p4, p0, Lcom/flappy/q;->g:I

    iput p5, p0, Lcom/flappy/q;->h:I

    :goto_1
    return-void

    :cond_0
    iget-object v0, p0, Lcom/flappy/q;->p:[Lcom/flappy/i;

    aget-object v0, v0, v2

    iget v0, v0, Lcom/flappy/i;->b:I

    iput v0, p0, Lcom/flappy/q;->e:I

    iget-object v0, p0, Lcom/flappy/q;->p:[Lcom/flappy/i;

    aget-object v0, v0, v2

    iget v0, v0, Lcom/flappy/i;->c:I

    iput v0, p0, Lcom/flappy/q;->f:I

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/flappy/q;->p:[Lcom/flappy/i;

    aget-object v0, v0, v2

    iget v0, v0, Lcom/flappy/i;->b:I

    iget v1, p0, Lcom/flappy/q;->e:I

    sub-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/flappy/q;->g:I

    iget-object v0, p0, Lcom/flappy/q;->p:[Lcom/flappy/i;

    aget-object v0, v0, v2

    iget v0, v0, Lcom/flappy/i;->c:I

    iget v1, p0, Lcom/flappy/q;->f:I

    sub-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/flappy/q;->h:I

    goto :goto_1
.end method
