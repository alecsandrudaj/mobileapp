.class public Lcom/flappy/l;
.super Ljava/lang/Object;


# instance fields
.field public a:I

.field public b:I

.field private c:[Lcom/flappy/i;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/flappy/g;->D:Lcom/flappy/g;

    invoke-virtual {v0, p1}, Lcom/flappy/g;->a(Ljava/lang/String;)[Lcom/flappy/i;

    move-result-object v0

    iput-object v0, p0, Lcom/flappy/l;->c:[Lcom/flappy/i;

    iget-object v0, p0, Lcom/flappy/l;->c:[Lcom/flappy/i;

    aget-object v0, v0, v1

    iget v0, v0, Lcom/flappy/i;->b:I

    iput v0, p0, Lcom/flappy/l;->a:I

    iget-object v0, p0, Lcom/flappy/l;->c:[Lcom/flappy/i;

    aget-object v0, v0, v1

    iget v0, v0, Lcom/flappy/i;->c:I

    iput v0, p0, Lcom/flappy/l;->b:I

    return-void
.end method


# virtual methods
.method public a(Lcom/flappy/g;IIIZI)V
    .locals 8

    const/high16 v4, 0x3f800000    # 1.0f

    iget v0, p0, Lcom/flappy/l;->a:I

    sub-int v2, p3, v0

    const/4 v0, 0x1

    move v7, p2

    :goto_0
    if-gtz p6, :cond_0

    return-void

    :cond_0
    if-gtz v7, :cond_1

    if-eqz v0, :cond_2

    :cond_1
    rem-int/lit8 v0, v7, 0xa

    iget-object v1, p0, Lcom/flappy/l;->c:[Lcom/flappy/i;

    aget-object v0, v1, v0

    iget v1, v0, Lcom/flappy/i;->i:I

    move-object v0, p1

    move v3, p4

    move v5, v4

    move v6, v4

    invoke-virtual/range {v0 .. v6}, Lcom/flappy/g;->a(IIIFFF)V

    div-int/lit8 v0, v7, 0xa

    iget v1, p0, Lcom/flappy/l;->a:I

    sub-int/2addr v2, v1

    move v1, v0

    move v0, p5

    :goto_1
    add-int/lit8 p6, p6, -0x1

    move v7, v1

    goto :goto_0

    :cond_2
    move v1, v7

    goto :goto_1
.end method
