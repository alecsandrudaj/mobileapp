.class public Lcom/flappy/g;
.super Lcom/flappy/m;


# static fields
.field public static D:Lcom/flappy/g;


# instance fields
.field public A:I

.field public B:Lcom/flappy/l;

.field public C:Lcom/flappy/p;

.field public final E:F

.field public a:[Lcom/flappy/i;

.field public b:[I

.field public c:[I

.field public d:[Lcom/flappy/m;

.field public e:I

.field public f:Lcom/flappy/r;

.field public g:I

.field public h:Lcom/flappy/r;

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:Lcom/flappy/n;

.field public n:Lcom/flappy/n;

.field protected o:Lcom/flappy/i;

.field protected p:Lcom/flappy/i;

.field public q:I

.field public r:Z

.field protected s:[I

.field protected t:[I

.field protected u:I

.field v:I

.field w:[I

.field x:[D

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(IILjava/io/InputStream;)V
    .locals 11

    const/16 v2, 0xa

    const/4 v10, 0x1

    const/16 v1, 0x32

    invoke-direct {p0}, Lcom/flappy/m;-><init>()V

    new-array v0, v1, [I

    iput-object v0, p0, Lcom/flappy/g;->b:[I

    new-array v0, v1, [I

    iput-object v0, p0, Lcom/flappy/g;->c:[I

    new-array v0, v1, [Lcom/flappy/m;

    iput-object v0, p0, Lcom/flappy/g;->d:[Lcom/flappy/m;

    iput v10, p0, Lcom/flappy/g;->q:I

    new-array v0, v2, [I

    iput-object v0, p0, Lcom/flappy/g;->s:[I

    new-array v0, v2, [I

    iput-object v0, p0, Lcom/flappy/g;->t:[I

    new-array v0, v1, [I

    iput-object v0, p0, Lcom/flappy/g;->w:[I

    new-array v0, v1, [D

    iput-object v0, p0, Lcom/flappy/g;->x:[D

    const v0, 0x3c75c28f    # 0.015f

    iput v0, p0, Lcom/flappy/g;->E:F

    iput p1, p0, Lcom/flappy/g;->z:I

    iput p2, p0, Lcom/flappy/g;->A:I

    const/16 v0, 0x200

    new-array v0, v0, [Lcom/flappy/i;

    iput-object v0, p0, Lcom/flappy/g;->a:[Lcom/flappy/i;

    :try_start_0
    new-instance v8, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    invoke-direct {v0, p3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v8, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    :cond_0
    :goto_0
    invoke-virtual {v8}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :goto_1
    return-void

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v10, :cond_0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    new-instance v0, Lcom/flappy/i;

    const/4 v1, 0x0

    aget-object v1, v7, v1

    const/4 v2, 0x1

    aget-object v2, v7, v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x2

    aget-object v3, v7, v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    const/4 v4, 0x3

    aget-object v4, v7, v4

    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    const/4 v5, 0x4

    aget-object v5, v7, v5

    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v5

    const/4 v6, 0x5

    aget-object v6, v7, v6

    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    const/4 v9, 0x6

    aget-object v7, v7, v9

    invoke-static {v7}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v7

    invoke-direct/range {v0 .. v7}, Lcom/flappy/i;-><init>(Ljava/lang/String;IIFFFF)V

    iget v1, v0, Lcom/flappy/i;->d:F

    iget v2, v0, Lcom/flappy/i;->f:F

    add-float/2addr v1, v2

    iput v1, v0, Lcom/flappy/i;->f:F

    iget v1, v0, Lcom/flappy/i;->e:F

    iget v2, v0, Lcom/flappy/i;->g:F

    add-float/2addr v1, v2

    iput v1, v0, Lcom/flappy/i;->g:F

    iget-object v1, p0, Lcom/flappy/g;->a:[Lcom/flappy/i;

    iget v2, v0, Lcom/flappy/i;->i:I

    aput-object v0, v1, v2

    const-string v1, "FlappyBird"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, Lcom/flappy/i;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v0, Lcom/flappy/i;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v0, Lcom/flappy/i;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v0, Lcom/flappy/i;->d:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v0, Lcom/flappy/i;->e:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v0, Lcom/flappy/i;->f:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v0, v0, Lcom/flappy/i;->g:F

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_1
.end method


# virtual methods
.method public a()V
    .locals 4

    const/4 v1, 0x0

    new-instance v0, Lcom/flappy/j;

    invoke-direct {v0}, Lcom/flappy/j;-><init>()V

    sput-object v0, Lcom/flappy/j;->x:Lcom/flappy/j;

    new-instance v0, Lcom/flappy/r;

    invoke-direct {v0}, Lcom/flappy/r;-><init>()V

    iput-object v0, p0, Lcom/flappy/g;->f:Lcom/flappy/r;

    new-instance v0, Lcom/flappy/r;

    invoke-direct {v0}, Lcom/flappy/r;-><init>()V

    iput-object v0, p0, Lcom/flappy/g;->h:Lcom/flappy/r;

    const-string v0, "black"

    invoke-virtual {p0, v0}, Lcom/flappy/g;->b(Ljava/lang/String;)Lcom/flappy/i;

    move-result-object v0

    iput-object v0, p0, Lcom/flappy/g;->o:Lcom/flappy/i;

    const-string v0, "white"

    invoke-virtual {p0, v0}, Lcom/flappy/g;->b(Ljava/lang/String;)Lcom/flappy/i;

    move-result-object v0

    iput-object v0, p0, Lcom/flappy/g;->p:Lcom/flappy/i;

    iput v1, p0, Lcom/flappy/g;->u:I

    new-instance v0, Lcom/flappy/n;

    invoke-direct {v0}, Lcom/flappy/n;-><init>()V

    iput-object v0, p0, Lcom/flappy/g;->m:Lcom/flappy/n;

    move v0, v1

    :goto_0
    const/16 v2, 0x14

    if-lt v0, v2, :cond_0

    new-instance v0, Lcom/flappy/n;

    invoke-direct {v0}, Lcom/flappy/n;-><init>()V

    iput-object v0, p0, Lcom/flappy/g;->n:Lcom/flappy/n;

    move v0, v1

    :goto_1
    const/16 v2, 0xa

    if-lt v0, v2, :cond_1

    new-instance v0, Lcom/flappy/l;

    const-string v2, "number_score"

    invoke-direct {v0, v2}, Lcom/flappy/l;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/flappy/g;->B:Lcom/flappy/l;

    new-instance v0, Lcom/flappy/p;

    invoke-direct {v0}, Lcom/flappy/p;-><init>()V

    iput-object v0, p0, Lcom/flappy/g;->C:Lcom/flappy/p;

    iput v1, p0, Lcom/flappy/g;->l:I

    iput-boolean v1, p0, Lcom/flappy/g;->r:Z

    iput v1, p0, Lcom/flappy/g;->v:I

    invoke-virtual {p0}, Lcom/flappy/g;->d()V

    invoke-virtual {p0}, Lcom/flappy/g;->c()V

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-virtual {p0, v1, v1, v0}, Lcom/flappy/g;->a(ZIF)V

    return-void

    :cond_0
    iget-object v2, p0, Lcom/flappy/g;->m:Lcom/flappy/n;

    new-instance v3, Lcom/flappy/o;

    invoke-direct {v3}, Lcom/flappy/o;-><init>()V

    invoke-virtual {v2, v3}, Lcom/flappy/n;->a(Lcom/flappy/m;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/flappy/g;->n:Lcom/flappy/n;

    new-instance v3, Lcom/flappy/e;

    invoke-direct {v3}, Lcom/flappy/e;-><init>()V

    invoke-virtual {v2, v3}, Lcom/flappy/n;->a(Lcom/flappy/m;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public a(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lcom/flappy/g;->c(II)V

    iget v0, p0, Lcom/flappy/g;->z:I

    if-le p1, v0, :cond_0

    iput p1, p0, Lcom/flappy/g;->z:I

    :cond_0
    return-void
.end method

.method public a(IF)V
    .locals 0

    return-void
.end method

.method public a(II)V
    .locals 0

    return-void
.end method

.method public a(IIIFFF)V
    .locals 10

    iget-object v0, p0, Lcom/flappy/g;->a:[Lcom/flappy/i;

    aget-object v0, v0, p1

    int-to-float v1, p2

    iget v2, v0, Lcom/flappy/i;->b:I

    int-to-float v2, v2

    mul-float/2addr v2, p4

    add-float/2addr v1, v2

    float-to-int v3, v1

    int-to-float v1, p3

    iget v2, v0, Lcom/flappy/i;->c:I

    int-to-float v2, v2

    mul-float/2addr v2, p5

    add-float/2addr v1, v2

    float-to-int v4, v1

    iget v5, v0, Lcom/flappy/i;->d:F

    iget v6, v0, Lcom/flappy/i;->e:F

    iget v7, v0, Lcom/flappy/i;->f:F

    iget v8, v0, Lcom/flappy/i;->g:F

    move-object v0, p0

    move v1, p2

    move v2, p3

    move/from16 v9, p6

    invoke-virtual/range {v0 .. v9}, Lcom/flappy/g;->a(IIIIFFFFF)V

    return-void
.end method

.method public a(IIII)V
    .locals 0

    return-void
.end method

.method public a(IIIIFFFFF)V
    .locals 0

    invoke-static/range {p1 .. p9}, Lcom/flappy/c;->a(IIIIFFFFF)V

    return-void
.end method

.method public a(IIIIFFFFFI)V
    .locals 11

    move/from16 v0, p10

    int-to-float v10, v0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-static/range {v1 .. v10}, Lcom/flappy/c;->a(IIIIFFFFFF)V

    return-void
.end method

.method public a(IIIIIF)V
    .locals 10

    iget-object v0, p0, Lcom/flappy/g;->a:[Lcom/flappy/i;

    aget-object v0, v0, p1

    add-int v3, p2, p4

    add-int v4, p3, p5

    iget v5, v0, Lcom/flappy/i;->d:F

    iget v6, v0, Lcom/flappy/i;->e:F

    iget v7, v0, Lcom/flappy/i;->f:F

    iget v8, v0, Lcom/flappy/i;->g:F

    move-object v0, p0

    move v1, p2

    move v2, p3

    move/from16 v9, p6

    invoke-virtual/range {v0 .. v9}, Lcom/flappy/g;->a(IIIIFFFFF)V

    return-void
.end method

.method public a(ILcom/flappy/m;)V
    .locals 0

    return-void
.end method

.method public a(ILcom/flappy/m;I)V
    .locals 2

    iget-object v0, p0, Lcom/flappy/g;->c:[I

    iget v1, p0, Lcom/flappy/g;->e:I

    aput p1, v0, v1

    iget-object v0, p0, Lcom/flappy/g;->d:[Lcom/flappy/m;

    iget v1, p0, Lcom/flappy/g;->e:I

    aput-object p2, v0, v1

    iget-object v0, p0, Lcom/flappy/g;->b:[I

    iget v1, p0, Lcom/flappy/g;->e:I

    aput p3, v0, v1

    iget v0, p0, Lcom/flappy/g;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/flappy/g;->e:I

    iget v0, p0, Lcom/flappy/g;->e:I

    const/16 v1, 0x32

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    iput v0, p0, Lcom/flappy/g;->e:I

    :cond_0
    return-void
.end method

.method public a(Lcom/flappy/i;IIF)V
    .locals 10

    iget v0, p1, Lcom/flappy/i;->b:I

    add-int v3, p2, v0

    iget v0, p1, Lcom/flappy/i;->c:I

    add-int v4, p3, v0

    iget v5, p1, Lcom/flappy/i;->d:F

    iget v6, p1, Lcom/flappy/i;->e:F

    iget v7, p1, Lcom/flappy/i;->f:F

    iget v8, p1, Lcom/flappy/i;->g:F

    move-object v0, p0

    move v1, p2

    move v2, p3

    move v9, p4

    invoke-virtual/range {v0 .. v9}, Lcom/flappy/g;->a(IIIIFFFFF)V

    return-void
.end method

.method public a(Lcom/flappy/i;IIFI)V
    .locals 11

    iget v0, p1, Lcom/flappy/i;->b:I

    add-int v3, p2, v0

    iget v0, p1, Lcom/flappy/i;->c:I

    add-int v4, p3, v0

    iget v5, p1, Lcom/flappy/i;->d:F

    iget v6, p1, Lcom/flappy/i;->e:F

    iget v7, p1, Lcom/flappy/i;->f:F

    iget v8, p1, Lcom/flappy/i;->g:F

    move-object v0, p0

    move v1, p2

    move v2, p3

    move v9, p4

    move/from16 v10, p5

    invoke-virtual/range {v0 .. v10}, Lcom/flappy/g;->a(IIIIFFFFFI)V

    return-void
.end method

.method public a(ZIF)V
    .locals 4

    const/4 v3, 0x5

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/flappy/g;->f:Lcom/flappy/r;

    iget-boolean v0, v0, Lcom/flappy/r;->g:Z

    if-eqz v0, :cond_0

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/flappy/g;->f:Lcom/flappy/r;

    invoke-virtual {v0, v1, v2, v3, p3}, Lcom/flappy/r;->a(FFIF)V

    :goto_0
    iget-object v0, p0, Lcom/flappy/g;->f:Lcom/flappy/r;

    invoke-virtual {v0, v1}, Lcom/flappy/r;->a(F)V

    iput p2, p0, Lcom/flappy/g;->g:I

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/flappy/g;->f:Lcom/flappy/r;

    invoke-virtual {v0, v2, v1, v3, p3}, Lcom/flappy/r;->a(FFIF)V

    goto :goto_0
.end method

.method public a([F[F)V
    .locals 4

    const/16 v3, 0xa

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v3, :cond_0

    iput v3, p0, Lcom/flappy/g;->u:I

    return-void

    :cond_0
    iget-object v1, p0, Lcom/flappy/g;->s:[I

    aget v2, p1, v0

    float-to-int v2, v2

    aput v2, v1, v0

    iget-object v1, p0, Lcom/flappy/g;->t:[I

    aget v2, p2, v0

    float-to-int v2, v2

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)[Lcom/flappy/i;
    .locals 5

    const/16 v4, 0x200

    const/4 v2, 0x0

    move v1, v2

    move v0, v2

    :goto_0
    if-lt v1, v4, :cond_0

    if-lez v0, :cond_4

    new-array v1, v0, [Lcom/flappy/i;

    move v0, v2

    :goto_1
    if-lt v2, v4, :cond_2

    move-object v0, v1

    :goto_2
    return-object v0

    :cond_0
    iget-object v3, p0, Lcom/flappy/g;->a:[Lcom/flappy/i;

    aget-object v3, v3, v1

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/flappy/g;->a:[Lcom/flappy/i;

    aget-object v3, v3, v1

    iget-object v3, v3, Lcom/flappy/i;->a:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v0, v0, 0x1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-object v3, p0, Lcom/flappy/g;->a:[Lcom/flappy/i;

    aget-object v3, v3, v2

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/flappy/g;->a:[Lcom/flappy/i;

    aget-object v3, v3, v2

    iget-object v3, v3, Lcom/flappy/i;->a:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/flappy/g;->a:[Lcom/flappy/i;

    aget-object v3, v3, v2

    aput-object v3, v1, v0

    add-int/lit8 v0, v0, 0x1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    goto :goto_2
.end method

.method public b(Ljava/lang/String;)Lcom/flappy/i;
    .locals 2

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x200

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    :goto_1
    return-object v0

    :cond_0
    iget-object v1, p0, Lcom/flappy/g;->a:[Lcom/flappy/i;

    aget-object v1, v1, v0

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/flappy/g;->a:[Lcom/flappy/i;

    aget-object v1, v1, v0

    iget-object v1, v1, Lcom/flappy/i;->a:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/flappy/g;->a:[Lcom/flappy/i;

    aget-object v0, v1, v0

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public b()V
    .locals 8

    const/16 v2, -0x90

    const/16 v3, -0x100

    const/4 v1, 0x0

    const/4 v7, 0x0

    const v6, 0x3c75c28f    # 0.015f

    iput v1, p0, Lcom/flappy/g;->v:I

    iget-boolean v0, p0, Lcom/flappy/g;->r:Z

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    const/16 v4, 0x32

    if-lt v0, v4, :cond_a

    :cond_0
    invoke-virtual {p0, v6}, Lcom/flappy/g;->b(F)V

    iget-boolean v0, p0, Lcom/flappy/g;->r:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/flappy/g;->C:Lcom/flappy/p;

    invoke-virtual {v0, v6}, Lcom/flappy/p;->a(F)V

    iget-object v0, p0, Lcom/flappy/g;->n:Lcom/flappy/n;

    invoke-virtual {v0, v6}, Lcom/flappy/n;->a(F)V

    iget-object v0, p0, Lcom/flappy/g;->f:Lcom/flappy/r;

    iget-boolean v0, v0, Lcom/flappy/r;->g:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/flappy/g;->f:Lcom/flappy/r;

    iget v0, v0, Lcom/flappy/r;->a:F

    cmpl-float v0, v0, v7

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/flappy/g;->f:Lcom/flappy/r;

    invoke-virtual {v0, v6}, Lcom/flappy/r;->a(F)V

    iget-object v0, p0, Lcom/flappy/g;->f:Lcom/flappy/r;

    iget-boolean v0, v0, Lcom/flappy/r;->g:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/flappy/g;->g:I

    invoke-virtual {p0, v0, p0}, Lcom/flappy/g;->a(ILcom/flappy/m;)V

    :cond_2
    iget-object v0, p0, Lcom/flappy/g;->h:Lcom/flappy/r;

    iget-boolean v0, v0, Lcom/flappy/r;->g:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/flappy/g;->h:Lcom/flappy/r;

    iget v0, v0, Lcom/flappy/r;->a:F

    cmpl-float v0, v0, v7

    if-eqz v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/flappy/g;->h:Lcom/flappy/r;

    invoke-virtual {v0, v6}, Lcom/flappy/r;->a(F)V

    :cond_4
    iget v0, p0, Lcom/flappy/g;->l:I

    if-lez v0, :cond_c

    iget v0, p0, Lcom/flappy/g;->l:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/flappy/g;->l:I

    iget v0, p0, Lcom/flappy/g;->k:I

    neg-int v0, v0

    iget v1, p0, Lcom/flappy/g;->k:I

    invoke-static {v0, v1}, Lcom/flappy/j;->a(II)I

    move-result v0

    iput v0, p0, Lcom/flappy/g;->i:I

    iget v0, p0, Lcom/flappy/g;->k:I

    neg-int v0, v0

    iget v1, p0, Lcom/flappy/g;->k:I

    invoke-static {v0, v1}, Lcom/flappy/j;->a(II)I

    move-result v0

    iput v0, p0, Lcom/flappy/g;->j:I

    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/flappy/g;->C:Lcom/flappy/p;

    invoke-virtual {v0, p0}, Lcom/flappy/p;->a(Lcom/flappy/g;)V

    iget-object v0, p0, Lcom/flappy/g;->n:Lcom/flappy/n;

    invoke-virtual {v0, p0}, Lcom/flappy/n;->a(Lcom/flappy/g;)V

    iget-object v0, p0, Lcom/flappy/g;->f:Lcom/flappy/r;

    iget-boolean v0, v0, Lcom/flappy/r;->g:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/flappy/g;->f:Lcom/flappy/r;

    iget v0, v0, Lcom/flappy/r;->a:F

    cmpl-float v0, v0, v7

    if-eqz v0, :cond_7

    :cond_6
    iget-object v0, p0, Lcom/flappy/g;->o:Lcom/flappy/i;

    iget v1, v0, Lcom/flappy/i;->i:I

    const/16 v4, 0x360

    const/16 v5, 0x600

    iget-object v0, p0, Lcom/flappy/g;->f:Lcom/flappy/r;

    iget v6, v0, Lcom/flappy/r;->a:F

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/flappy/g;->a(IIIIIF)V

    :cond_7
    iget-object v0, p0, Lcom/flappy/g;->h:Lcom/flappy/r;

    iget-boolean v0, v0, Lcom/flappy/r;->g:Z

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/flappy/g;->h:Lcom/flappy/r;

    iget v0, v0, Lcom/flappy/r;->a:F

    cmpl-float v0, v0, v7

    if-eqz v0, :cond_9

    :cond_8
    iget-object v0, p0, Lcom/flappy/g;->p:Lcom/flappy/i;

    iget v1, v0, Lcom/flappy/i;->i:I

    const/16 v4, 0x360

    const/16 v5, 0x600

    iget-object v0, p0, Lcom/flappy/g;->h:Lcom/flappy/r;

    iget v6, v0, Lcom/flappy/r;->a:F

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/flappy/g;->a(IIIIIF)V

    :cond_9
    return-void

    :cond_a
    iget-object v4, p0, Lcom/flappy/g;->b:[I

    aget v4, v4, v0

    if-lez v4, :cond_b

    iget-object v4, p0, Lcom/flappy/g;->b:[I

    aget v5, v4, v0

    add-int/lit8 v5, v5, -0x1e

    aput v5, v4, v0

    iget-object v4, p0, Lcom/flappy/g;->b:[I

    aget v4, v4, v0

    if-gtz v4, :cond_b

    iget-object v4, p0, Lcom/flappy/g;->c:[I

    aget v4, v4, v0

    iget-object v5, p0, Lcom/flappy/g;->d:[Lcom/flappy/m;

    aget-object v5, v5, v0

    invoke-virtual {p0, v4, v5}, Lcom/flappy/g;->a(ILcom/flappy/m;)V

    :cond_b
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_c
    iput v1, p0, Lcom/flappy/g;->i:I

    iput v1, p0, Lcom/flappy/g;->j:I

    goto :goto_1
.end method

.method public b(F)V
    .locals 0

    return-void
.end method

.method public b(II)V
    .locals 1

    iget-object v0, p0, Lcom/flappy/g;->n:Lcom/flappy/n;

    invoke-virtual {v0}, Lcom/flappy/n;->c()Lcom/flappy/m;

    move-result-object v0

    check-cast v0, Lcom/flappy/e;

    invoke-virtual {v0, p1, p2}, Lcom/flappy/e;->a(II)V

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public c(F)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/flappy/g;->h:Lcom/flappy/r;

    iget-boolean v0, v0, Lcom/flappy/r;->g:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/flappy/g;->h:Lcom/flappy/r;

    const/high16 v1, 0x3f800000    # 1.0f

    const/16 v2, 0xb

    invoke-virtual {v0, v1, v3, v2, p1}, Lcom/flappy/r;->a(FFIF)V

    iget-object v0, p0, Lcom/flappy/g;->h:Lcom/flappy/r;

    invoke-virtual {v0, v3}, Lcom/flappy/r;->a(F)V

    :cond_0
    return-void
.end method

.method public c(II)V
    .locals 4

    iget-object v0, p0, Lcom/flappy/g;->w:[I

    iget v1, p0, Lcom/flappy/g;->v:I

    aput p1, v0, v1

    iget-object v0, p0, Lcom/flappy/g;->x:[D

    iget v1, p0, Lcom/flappy/g;->v:I

    int-to-double v2, p2

    aput-wide v2, v0, v1

    iget v0, p0, Lcom/flappy/g;->v:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/flappy/g;->v:I

    return-void
.end method

.method public d()V
    .locals 3

    const/4 v1, 0x0

    iput v1, p0, Lcom/flappy/g;->e:I

    move v0, v1

    :goto_0
    const/16 v2, 0x32

    if-lt v0, v2, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Lcom/flappy/g;->b:[I

    aput v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
