.class public Lcom/flappy/o;
.super Lcom/flappy/m;


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field private m:[Lcom/flappy/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/flappy/m;-><init>()V

    const/16 v0, 0xc

    iput v0, p0, Lcom/flappy/o;->a:I

    const/16 v0, 0xe

    iput v0, p0, Lcom/flappy/o;->b:I

    sget-object v0, Lcom/flappy/g;->D:Lcom/flappy/g;

    const-string v1, "number_context"

    invoke-virtual {v0, v1}, Lcom/flappy/g;->a(Ljava/lang/String;)[Lcom/flappy/i;

    move-result-object v0

    iput-object v0, p0, Lcom/flappy/o;->m:[Lcom/flappy/i;

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 3

    const/4 v2, 0x0

    iget-boolean v0, p0, Lcom/flappy/o;->F:Z

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v0, p0, Lcom/flappy/o;->d:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/flappy/o;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/flappy/o;->d:I

    iget v0, p0, Lcom/flappy/o;->g:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_2

    iget v0, p0, Lcom/flappy/o;->k:I

    iget v1, p0, Lcom/flappy/o;->g:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/flappy/o;->k:I

    iget v0, p0, Lcom/flappy/o;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/flappy/o;->i:I

    iget v0, p0, Lcom/flappy/o;->i:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    iput v2, p0, Lcom/flappy/o;->i:I

    iget v0, p0, Lcom/flappy/o;->g:I

    iget v1, p0, Lcom/flappy/o;->h:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/flappy/o;->g:I

    :cond_2
    iget v0, p0, Lcom/flappy/o;->d:I

    if-gtz v0, :cond_0

    iput-boolean v2, p0, Lcom/flappy/o;->F:Z

    iput-boolean v2, p0, Lcom/flappy/o;->G:Z

    goto :goto_0
.end method

.method public a(Lcom/flappy/g;)V
    .locals 7

    const/high16 v4, 0x3f800000    # 1.0f

    iget-boolean v0, p0, Lcom/flappy/o;->G:Z

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/flappy/o;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/flappy/o;->m:[Lcom/flappy/i;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    iget v1, v0, Lcom/flappy/i;->i:I

    iget v2, p0, Lcom/flappy/o;->j:I

    iget v3, p0, Lcom/flappy/o;->k:I

    move-object v0, p1

    move v5, v4

    move v6, v4

    invoke-virtual/range {v0 .. v6}, Lcom/flappy/g;->a(IIIFFF)V

    :cond_1
    iget v2, p0, Lcom/flappy/o;->e:I

    iget v0, p0, Lcom/flappy/o;->j:I

    iget v1, p0, Lcom/flappy/o;->l:I

    add-int v3, v0, v1

    iget v4, p0, Lcom/flappy/o;->k:I

    const/4 v5, 0x0

    iget v6, p0, Lcom/flappy/o;->f:I

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v6}, Lcom/flappy/o;->a(Lcom/flappy/g;IIIZI)V

    goto :goto_0
.end method

.method public a(Lcom/flappy/g;IIIZI)V
    .locals 9

    iget v0, p0, Lcom/flappy/o;->a:I

    sub-int v2, p3, v0

    const/4 v0, 0x1

    move v7, p2

    :goto_0
    if-gtz p6, :cond_0

    return-void

    :cond_0
    if-gtz v7, :cond_1

    if-eqz v0, :cond_3

    :cond_1
    rem-int/lit8 v8, v7, 0xa

    iget-object v0, p0, Lcom/flappy/o;->m:[Lcom/flappy/i;

    aget-object v0, v0, v8

    iget v1, v0, Lcom/flappy/i;->i:I

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v0, p1

    move v3, p4

    invoke-virtual/range {v0 .. v6}, Lcom/flappy/g;->a(IIIFFF)V

    div-int/lit8 v1, v7, 0xa

    const/4 v0, 0x1

    if-eq v8, v0, :cond_2

    iget v0, p0, Lcom/flappy/o;->a:I

    add-int/lit8 v0, v0, -0x2

    sub-int v0, v2, v0

    :goto_1
    move v2, v0

    move v0, p5

    :goto_2
    add-int/lit8 p6, p6, -0x1

    move v7, v1

    goto :goto_0

    :cond_2
    add-int/lit8 v0, v2, -0x4

    goto :goto_1

    :cond_3
    move v1, v7

    goto :goto_2
.end method
