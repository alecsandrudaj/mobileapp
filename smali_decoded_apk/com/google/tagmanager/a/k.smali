.class public final Lcom/google/tagmanager/a/k;
.super Ljava/lang/Object;


# instance fields
.field private final a:[B

.field private final b:Z

.field private c:I

.field private d:I

.field private e:I

.field private final f:Ljava/io/InputStream;

.field private g:I

.field private h:Z

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:Lcom/google/tagmanager/a/l;


# direct methods
.method private constructor <init>(Lcom/google/tagmanager/a/aj;)V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/tagmanager/a/k;->h:Z

    const v0, 0x7fffffff

    iput v0, p0, Lcom/google/tagmanager/a/k;->j:I

    const/16 v0, 0x40

    iput v0, p0, Lcom/google/tagmanager/a/k;->l:I

    const/high16 v0, 0x4000000

    iput v0, p0, Lcom/google/tagmanager/a/k;->m:I

    iput-object v2, p0, Lcom/google/tagmanager/a/k;->n:Lcom/google/tagmanager/a/l;

    iget-object v0, p1, Lcom/google/tagmanager/a/aj;->c:[B

    iput-object v0, p0, Lcom/google/tagmanager/a/k;->a:[B

    invoke-virtual {p1}, Lcom/google/tagmanager/a/aj;->b()I

    move-result v0

    iput v0, p0, Lcom/google/tagmanager/a/k;->e:I

    invoke-virtual {p1}, Lcom/google/tagmanager/a/aj;->b()I

    move-result v0

    invoke-virtual {p1}, Lcom/google/tagmanager/a/aj;->a()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/tagmanager/a/k;->c:I

    iget v0, p0, Lcom/google/tagmanager/a/k;->e:I

    neg-int v0, v0

    iput v0, p0, Lcom/google/tagmanager/a/k;->i:I

    iput-object v2, p0, Lcom/google/tagmanager/a/k;->f:Ljava/io/InputStream;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/tagmanager/a/k;->b:Z

    return-void
.end method

.method private constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, p0, Lcom/google/tagmanager/a/k;->h:Z

    const v0, 0x7fffffff

    iput v0, p0, Lcom/google/tagmanager/a/k;->j:I

    const/16 v0, 0x40

    iput v0, p0, Lcom/google/tagmanager/a/k;->l:I

    const/high16 v0, 0x4000000

    iput v0, p0, Lcom/google/tagmanager/a/k;->m:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/tagmanager/a/k;->n:Lcom/google/tagmanager/a/l;

    const/16 v0, 0x1000

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/google/tagmanager/a/k;->a:[B

    iput v1, p0, Lcom/google/tagmanager/a/k;->c:I

    iput v1, p0, Lcom/google/tagmanager/a/k;->e:I

    iput v1, p0, Lcom/google/tagmanager/a/k;->i:I

    iput-object p1, p0, Lcom/google/tagmanager/a/k;->f:Ljava/io/InputStream;

    iput-boolean v1, p0, Lcom/google/tagmanager/a/k;->b:Z

    return-void
.end method

.method public static a(J)J
    .locals 4

    const/4 v0, 0x1

    ushr-long v0, p0, v0

    const-wide/16 v2, 0x1

    and-long/2addr v2, p0

    neg-long v2, v2

    xor-long/2addr v0, v2

    return-wide v0
.end method

.method static a(Lcom/google/tagmanager/a/aj;)Lcom/google/tagmanager/a/k;
    .locals 2

    new-instance v0, Lcom/google/tagmanager/a/k;

    invoke-direct {v0, p0}, Lcom/google/tagmanager/a/k;-><init>(Lcom/google/tagmanager/a/aj;)V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/tagmanager/a/aj;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/tagmanager/a/k;->c(I)I
    :try_end_0
    .catch Lcom/google/tagmanager/a/af; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a(Ljava/io/InputStream;)Lcom/google/tagmanager/a/k;
    .locals 1

    new-instance v0, Lcom/google/tagmanager/a/k;

    invoke-direct {v0, p0}, Lcom/google/tagmanager/a/k;-><init>(Ljava/io/InputStream;)V

    return-object v0
.end method

.method private a(Z)Z
    .locals 4

    const/4 v1, -0x1

    const/4 v2, 0x0

    iget v0, p0, Lcom/google/tagmanager/a/k;->e:I

    iget v3, p0, Lcom/google/tagmanager/a/k;->c:I

    if-ge v0, v3, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "refillBuffer() called when buffer wasn\'t empty."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget v0, p0, Lcom/google/tagmanager/a/k;->i:I

    iget v3, p0, Lcom/google/tagmanager/a/k;->c:I

    add-int/2addr v0, v3

    iget v3, p0, Lcom/google/tagmanager/a/k;->j:I

    if-ne v0, v3, :cond_2

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/google/tagmanager/a/af;->b()Lcom/google/tagmanager/a/af;

    move-result-object v0

    throw v0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    iget-object v0, p0, Lcom/google/tagmanager/a/k;->n:Lcom/google/tagmanager/a/l;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/tagmanager/a/k;->n:Lcom/google/tagmanager/a/l;

    invoke-interface {v0}, Lcom/google/tagmanager/a/l;->a()V

    :cond_3
    iget v0, p0, Lcom/google/tagmanager/a/k;->i:I

    iget v3, p0, Lcom/google/tagmanager/a/k;->c:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/google/tagmanager/a/k;->i:I

    iput v2, p0, Lcom/google/tagmanager/a/k;->e:I

    iget-object v0, p0, Lcom/google/tagmanager/a/k;->f:Ljava/io/InputStream;

    if-nez v0, :cond_5

    move v0, v1

    :goto_1
    iput v0, p0, Lcom/google/tagmanager/a/k;->c:I

    iget v0, p0, Lcom/google/tagmanager/a/k;->c:I

    if-eqz v0, :cond_4

    iget v0, p0, Lcom/google/tagmanager/a/k;->c:I

    if-ge v0, v1, :cond_6

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "InputStream#read(byte[]) returned invalid result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/google/tagmanager/a/k;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\nThe InputStream implementation is buggy."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    iget-object v0, p0, Lcom/google/tagmanager/a/k;->f:Ljava/io/InputStream;

    iget-object v3, p0, Lcom/google/tagmanager/a/k;->a:[B

    invoke-virtual {v0, v3}, Ljava/io/InputStream;->read([B)I

    move-result v0

    goto :goto_1

    :cond_6
    iget v0, p0, Lcom/google/tagmanager/a/k;->c:I

    if-ne v0, v1, :cond_8

    iput v2, p0, Lcom/google/tagmanager/a/k;->c:I

    if-eqz p1, :cond_7

    invoke-static {}, Lcom/google/tagmanager/a/af;->b()Lcom/google/tagmanager/a/af;

    move-result-object v0

    throw v0

    :cond_7
    move v0, v2

    goto :goto_0

    :cond_8
    invoke-direct {p0}, Lcom/google/tagmanager/a/k;->z()V

    iget v0, p0, Lcom/google/tagmanager/a/k;->i:I

    iget v1, p0, Lcom/google/tagmanager/a/k;->c:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/tagmanager/a/k;->d:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/tagmanager/a/k;->m:I

    if-gt v0, v1, :cond_9

    if-gez v0, :cond_a

    :cond_9
    invoke-static {}, Lcom/google/tagmanager/a/af;->i()Lcom/google/tagmanager/a/af;

    move-result-object v0

    throw v0

    :cond_a
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static b(I)I
    .locals 2

    ushr-int/lit8 v0, p0, 0x1

    and-int/lit8 v1, p0, 0x1

    neg-int v1, v1

    xor-int/2addr v0, v1

    return v0
.end method

.method private z()V
    .locals 2

    iget v0, p0, Lcom/google/tagmanager/a/k;->c:I

    iget v1, p0, Lcom/google/tagmanager/a/k;->d:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/tagmanager/a/k;->c:I

    iget v0, p0, Lcom/google/tagmanager/a/k;->i:I

    iget v1, p0, Lcom/google/tagmanager/a/k;->c:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/tagmanager/a/k;->j:I

    if-le v0, v1, :cond_0

    iget v1, p0, Lcom/google/tagmanager/a/k;->j:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/google/tagmanager/a/k;->d:I

    iget v0, p0, Lcom/google/tagmanager/a/k;->c:I

    iget v1, p0, Lcom/google/tagmanager/a/k;->d:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/google/tagmanager/a/k;->c:I

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/tagmanager/a/k;->d:I

    goto :goto_0
.end method


# virtual methods
.method public a()I
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->x()Z

    move-result v1

    if-eqz v1, :cond_0

    iput v0, p0, Lcom/google/tagmanager/a/k;->g:I

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->s()I

    move-result v0

    iput v0, p0, Lcom/google/tagmanager/a/k;->g:I

    iget v0, p0, Lcom/google/tagmanager/a/k;->g:I

    invoke-static {v0}, Lcom/google/tagmanager/a/bk;->b(I)I

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/google/tagmanager/a/af;->e()Lcom/google/tagmanager/a/af;

    move-result-object v0

    throw v0

    :cond_1
    iget v0, p0, Lcom/google/tagmanager/a/k;->g:I

    goto :goto_0
.end method

.method public a(Lcom/google/tagmanager/a/aq;Lcom/google/tagmanager/a/o;)Lcom/google/tagmanager/a/am;
    .locals 3

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->s()I

    move-result v0

    iget v1, p0, Lcom/google/tagmanager/a/k;->k:I

    iget v2, p0, Lcom/google/tagmanager/a/k;->l:I

    if-lt v1, v2, :cond_0

    invoke-static {}, Lcom/google/tagmanager/a/af;->h()Lcom/google/tagmanager/a/af;

    move-result-object v0

    throw v0

    :cond_0
    invoke-virtual {p0, v0}, Lcom/google/tagmanager/a/k;->c(I)I

    move-result v1

    iget v0, p0, Lcom/google/tagmanager/a/k;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/tagmanager/a/k;->k:I

    invoke-interface {p1, p0, p2}, Lcom/google/tagmanager/a/aq;->b(Lcom/google/tagmanager/a/k;Lcom/google/tagmanager/a/o;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/tagmanager/a/am;

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Lcom/google/tagmanager/a/k;->a(I)V

    iget v2, p0, Lcom/google/tagmanager/a/k;->k:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lcom/google/tagmanager/a/k;->k:I

    invoke-virtual {p0, v1}, Lcom/google/tagmanager/a/k;->d(I)V

    return-object v0
.end method

.method public a(I)V
    .locals 1

    iget v0, p0, Lcom/google/tagmanager/a/k;->g:I

    if-eq v0, p1, :cond_0

    invoke-static {}, Lcom/google/tagmanager/a/af;->f()Lcom/google/tagmanager/a/af;

    move-result-object v0

    throw v0

    :cond_0
    return-void
.end method

.method public a(ILcom/google/tagmanager/a/an;Lcom/google/tagmanager/a/o;)V
    .locals 2

    iget v0, p0, Lcom/google/tagmanager/a/k;->k:I

    iget v1, p0, Lcom/google/tagmanager/a/k;->l:I

    if-lt v0, v1, :cond_0

    invoke-static {}, Lcom/google/tagmanager/a/af;->h()Lcom/google/tagmanager/a/af;

    move-result-object v0

    throw v0

    :cond_0
    iget v0, p0, Lcom/google/tagmanager/a/k;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/tagmanager/a/k;->k:I

    invoke-interface {p2, p0, p3}, Lcom/google/tagmanager/a/an;->c(Lcom/google/tagmanager/a/k;Lcom/google/tagmanager/a/o;)Lcom/google/tagmanager/a/an;

    const/4 v0, 0x4

    invoke-static {p1, v0}, Lcom/google/tagmanager/a/bk;->a(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/tagmanager/a/k;->a(I)V

    iget v0, p0, Lcom/google/tagmanager/a/k;->k:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/tagmanager/a/k;->k:I

    return-void
.end method

.method public a(Lcom/google/tagmanager/a/an;Lcom/google/tagmanager/a/o;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->s()I

    move-result v0

    iget v1, p0, Lcom/google/tagmanager/a/k;->k:I

    iget v2, p0, Lcom/google/tagmanager/a/k;->l:I

    if-lt v1, v2, :cond_0

    invoke-static {}, Lcom/google/tagmanager/a/af;->h()Lcom/google/tagmanager/a/af;

    move-result-object v0

    throw v0

    :cond_0
    invoke-virtual {p0, v0}, Lcom/google/tagmanager/a/k;->c(I)I

    move-result v0

    iget v1, p0, Lcom/google/tagmanager/a/k;->k:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/google/tagmanager/a/k;->k:I

    invoke-interface {p1, p0, p2}, Lcom/google/tagmanager/a/an;->c(Lcom/google/tagmanager/a/k;Lcom/google/tagmanager/a/o;)Lcom/google/tagmanager/a/an;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/google/tagmanager/a/k;->a(I)V

    iget v1, p0, Lcom/google/tagmanager/a/k;->k:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/google/tagmanager/a/k;->k:I

    invoke-virtual {p0, v0}, Lcom/google/tagmanager/a/k;->d(I)V

    return-void
.end method

.method public a(Lcom/google/tagmanager/a/m;)V
    .locals 1

    :cond_0
    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->a()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0, p1}, Lcom/google/tagmanager/a/k;->a(ILcom/google/tagmanager/a/m;)Z

    move-result v0

    if-nez v0, :cond_0

    :cond_1
    return-void
.end method

.method public a(ILcom/google/tagmanager/a/m;)Z
    .locals 3

    const/4 v0, 0x1

    invoke-static {p1}, Lcom/google/tagmanager/a/bk;->a(I)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    invoke-static {}, Lcom/google/tagmanager/a/af;->g()Lcom/google/tagmanager/a/af;

    move-result-object v0

    throw v0

    :pswitch_0
    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->e()J

    move-result-wide v1

    invoke-virtual {p2, p1}, Lcom/google/tagmanager/a/m;->d(I)V

    invoke-virtual {p2, v1, v2}, Lcom/google/tagmanager/a/m;->a(J)V

    :goto_0
    return v0

    :pswitch_1
    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->v()J

    move-result-wide v1

    invoke-virtual {p2, p1}, Lcom/google/tagmanager/a/m;->d(I)V

    invoke-virtual {p2, v1, v2}, Lcom/google/tagmanager/a/m;->b(J)V

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->l()Lcom/google/tagmanager/a/h;

    move-result-object v1

    invoke-virtual {p2, p1}, Lcom/google/tagmanager/a/m;->d(I)V

    invoke-virtual {p2, v1}, Lcom/google/tagmanager/a/m;->a(Lcom/google/tagmanager/a/h;)V

    goto :goto_0

    :pswitch_3
    invoke-virtual {p2, p1}, Lcom/google/tagmanager/a/m;->d(I)V

    invoke-virtual {p0, p2}, Lcom/google/tagmanager/a/k;->a(Lcom/google/tagmanager/a/m;)V

    invoke-static {p1}, Lcom/google/tagmanager/a/bk;->b(I)I

    move-result v1

    const/4 v2, 0x4

    invoke-static {v1, v2}, Lcom/google/tagmanager/a/bk;->a(II)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/google/tagmanager/a/k;->a(I)V

    invoke-virtual {p2, v1}, Lcom/google/tagmanager/a/m;->d(I)V

    goto :goto_0

    :pswitch_4
    const/4 v0, 0x0

    goto :goto_0

    :pswitch_5
    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->u()I

    move-result v1

    invoke-virtual {p2, p1}, Lcom/google/tagmanager/a/m;->d(I)V

    invoke-virtual {p2, v1}, Lcom/google/tagmanager/a/m;->a(I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public b()D
    .locals 2

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->v()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public c()F
    .locals 1

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->u()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0
.end method

.method public c(I)I
    .locals 2

    if-gez p1, :cond_0

    invoke-static {}, Lcom/google/tagmanager/a/af;->c()Lcom/google/tagmanager/a/af;

    move-result-object v0

    throw v0

    :cond_0
    iget v0, p0, Lcom/google/tagmanager/a/k;->i:I

    iget v1, p0, Lcom/google/tagmanager/a/k;->e:I

    add-int/2addr v0, v1

    add-int/2addr v0, p1

    iget v1, p0, Lcom/google/tagmanager/a/k;->j:I

    if-le v0, v1, :cond_1

    invoke-static {}, Lcom/google/tagmanager/a/af;->b()Lcom/google/tagmanager/a/af;

    move-result-object v0

    throw v0

    :cond_1
    iput v0, p0, Lcom/google/tagmanager/a/k;->j:I

    invoke-direct {p0}, Lcom/google/tagmanager/a/k;->z()V

    return v1
.end method

.method public d()J
    .locals 2

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->t()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(I)V
    .locals 0

    iput p1, p0, Lcom/google/tagmanager/a/k;->j:I

    invoke-direct {p0}, Lcom/google/tagmanager/a/k;->z()V

    return-void
.end method

.method public e()J
    .locals 2

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->t()J

    move-result-wide v0

    return-wide v0
.end method

.method public e(I)[B
    .locals 11

    const/16 v10, 0x1000

    const/4 v5, 0x1

    const/4 v3, -0x1

    const/4 v1, 0x0

    if-gez p1, :cond_0

    invoke-static {}, Lcom/google/tagmanager/a/af;->c()Lcom/google/tagmanager/a/af;

    move-result-object v0

    throw v0

    :cond_0
    iget v0, p0, Lcom/google/tagmanager/a/k;->i:I

    iget v2, p0, Lcom/google/tagmanager/a/k;->e:I

    add-int/2addr v0, v2

    add-int/2addr v0, p1

    iget v2, p0, Lcom/google/tagmanager/a/k;->j:I

    if-le v0, v2, :cond_1

    iget v0, p0, Lcom/google/tagmanager/a/k;->j:I

    iget v1, p0, Lcom/google/tagmanager/a/k;->i:I

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/google/tagmanager/a/k;->e:I

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/tagmanager/a/k;->f(I)V

    invoke-static {}, Lcom/google/tagmanager/a/af;->b()Lcom/google/tagmanager/a/af;

    move-result-object v0

    throw v0

    :cond_1
    iget v0, p0, Lcom/google/tagmanager/a/k;->c:I

    iget v2, p0, Lcom/google/tagmanager/a/k;->e:I

    sub-int/2addr v0, v2

    if-gt p1, v0, :cond_2

    new-array v0, p1, [B

    iget-object v2, p0, Lcom/google/tagmanager/a/k;->a:[B

    iget v3, p0, Lcom/google/tagmanager/a/k;->e:I

    invoke-static {v2, v3, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, p0, Lcom/google/tagmanager/a/k;->e:I

    add-int/2addr v1, p1

    iput v1, p0, Lcom/google/tagmanager/a/k;->e:I

    :goto_0
    return-object v0

    :cond_2
    if-ge p1, v10, :cond_4

    new-array v2, p1, [B

    iget v0, p0, Lcom/google/tagmanager/a/k;->c:I

    iget v3, p0, Lcom/google/tagmanager/a/k;->e:I

    sub-int/2addr v0, v3

    iget-object v3, p0, Lcom/google/tagmanager/a/k;->a:[B

    iget v4, p0, Lcom/google/tagmanager/a/k;->e:I

    invoke-static {v3, v4, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v3, p0, Lcom/google/tagmanager/a/k;->c:I

    iput v3, p0, Lcom/google/tagmanager/a/k;->e:I

    invoke-direct {p0, v5}, Lcom/google/tagmanager/a/k;->a(Z)Z

    :goto_1
    sub-int v3, p1, v0

    iget v4, p0, Lcom/google/tagmanager/a/k;->c:I

    if-le v3, v4, :cond_3

    iget-object v3, p0, Lcom/google/tagmanager/a/k;->a:[B

    iget v4, p0, Lcom/google/tagmanager/a/k;->c:I

    invoke-static {v3, v1, v2, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v3, p0, Lcom/google/tagmanager/a/k;->c:I

    add-int/2addr v0, v3

    iget v3, p0, Lcom/google/tagmanager/a/k;->c:I

    iput v3, p0, Lcom/google/tagmanager/a/k;->e:I

    invoke-direct {p0, v5}, Lcom/google/tagmanager/a/k;->a(Z)Z

    goto :goto_1

    :cond_3
    iget-object v3, p0, Lcom/google/tagmanager/a/k;->a:[B

    sub-int v4, p1, v0

    invoke-static {v3, v1, v2, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int v0, p1, v0

    iput v0, p0, Lcom/google/tagmanager/a/k;->e:I

    move-object v0, v2

    goto :goto_0

    :cond_4
    iget v5, p0, Lcom/google/tagmanager/a/k;->e:I

    iget v6, p0, Lcom/google/tagmanager/a/k;->c:I

    iget v0, p0, Lcom/google/tagmanager/a/k;->i:I

    iget v2, p0, Lcom/google/tagmanager/a/k;->c:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/google/tagmanager/a/k;->i:I

    iput v1, p0, Lcom/google/tagmanager/a/k;->e:I

    iput v1, p0, Lcom/google/tagmanager/a/k;->c:I

    sub-int v0, v6, v5

    sub-int v0, p1, v0

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    move v4, v0

    :goto_2
    if-lez v4, :cond_8

    invoke-static {v4, v10}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-array v8, v0, [B

    move v0, v1

    :goto_3
    array-length v2, v8

    if-ge v0, v2, :cond_7

    iget-object v2, p0, Lcom/google/tagmanager/a/k;->f:Ljava/io/InputStream;

    if-nez v2, :cond_5

    move v2, v3

    :goto_4
    if-ne v2, v3, :cond_6

    invoke-static {}, Lcom/google/tagmanager/a/af;->b()Lcom/google/tagmanager/a/af;

    move-result-object v0

    throw v0

    :cond_5
    iget-object v2, p0, Lcom/google/tagmanager/a/k;->f:Ljava/io/InputStream;

    array-length v9, v8

    sub-int/2addr v9, v0

    invoke-virtual {v2, v8, v0, v9}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    goto :goto_4

    :cond_6
    iget v9, p0, Lcom/google/tagmanager/a/k;->i:I

    add-int/2addr v9, v2

    iput v9, p0, Lcom/google/tagmanager/a/k;->i:I

    add-int/2addr v0, v2

    goto :goto_3

    :cond_7
    array-length v0, v8

    sub-int v0, v4, v0

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v4, v0

    goto :goto_2

    :cond_8
    new-array v3, p1, [B

    sub-int v0, v6, v5

    iget-object v2, p0, Lcom/google/tagmanager/a/k;->a:[B

    invoke-static {v2, v5, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v2, v0

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    array-length v5, v0

    invoke-static {v0, v1, v3, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, v0

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_5

    :cond_9
    move-object v0, v3

    goto/16 :goto_0
.end method

.method public f()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->s()I

    move-result v0

    return v0
.end method

.method public f(I)V
    .locals 4

    const/4 v3, 0x1

    if-gez p1, :cond_0

    invoke-static {}, Lcom/google/tagmanager/a/af;->c()Lcom/google/tagmanager/a/af;

    move-result-object v0

    throw v0

    :cond_0
    iget v0, p0, Lcom/google/tagmanager/a/k;->i:I

    iget v1, p0, Lcom/google/tagmanager/a/k;->e:I

    add-int/2addr v0, v1

    add-int/2addr v0, p1

    iget v1, p0, Lcom/google/tagmanager/a/k;->j:I

    if-le v0, v1, :cond_1

    iget v0, p0, Lcom/google/tagmanager/a/k;->j:I

    iget v1, p0, Lcom/google/tagmanager/a/k;->i:I

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/google/tagmanager/a/k;->e:I

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/tagmanager/a/k;->f(I)V

    invoke-static {}, Lcom/google/tagmanager/a/af;->b()Lcom/google/tagmanager/a/af;

    move-result-object v0

    throw v0

    :cond_1
    iget v0, p0, Lcom/google/tagmanager/a/k;->c:I

    iget v1, p0, Lcom/google/tagmanager/a/k;->e:I

    sub-int/2addr v0, v1

    if-gt p1, v0, :cond_2

    iget v0, p0, Lcom/google/tagmanager/a/k;->e:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/google/tagmanager/a/k;->e:I

    :goto_0
    return-void

    :cond_2
    iget v0, p0, Lcom/google/tagmanager/a/k;->c:I

    iget v1, p0, Lcom/google/tagmanager/a/k;->e:I

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/google/tagmanager/a/k;->c:I

    iput v1, p0, Lcom/google/tagmanager/a/k;->e:I

    invoke-direct {p0, v3}, Lcom/google/tagmanager/a/k;->a(Z)Z

    :goto_1
    sub-int v1, p1, v0

    iget v2, p0, Lcom/google/tagmanager/a/k;->c:I

    if-le v1, v2, :cond_3

    iget v1, p0, Lcom/google/tagmanager/a/k;->c:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/tagmanager/a/k;->c:I

    iput v1, p0, Lcom/google/tagmanager/a/k;->e:I

    invoke-direct {p0, v3}, Lcom/google/tagmanager/a/k;->a(Z)Z

    goto :goto_1

    :cond_3
    sub-int v0, p1, v0

    iput v0, p0, Lcom/google/tagmanager/a/k;->e:I

    goto :goto_0
.end method

.method public g()J
    .locals 2

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->v()J

    move-result-wide v0

    return-wide v0
.end method

.method public h()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->u()I

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->s()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public j()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->s()I

    move-result v1

    iget v0, p0, Lcom/google/tagmanager/a/k;->c:I

    iget v2, p0, Lcom/google/tagmanager/a/k;->e:I

    sub-int/2addr v0, v2

    if-gt v1, v0, :cond_0

    if-lez v1, :cond_0

    new-instance v0, Ljava/lang/String;

    iget-object v2, p0, Lcom/google/tagmanager/a/k;->a:[B

    iget v3, p0, Lcom/google/tagmanager/a/k;->e:I

    const-string v4, "UTF-8"

    invoke-direct {v0, v2, v3, v1, v4}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    iget v2, p0, Lcom/google/tagmanager/a/k;->e:I

    add-int/2addr v1, v2

    iput v1, p0, Lcom/google/tagmanager/a/k;->e:I

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/google/tagmanager/a/k;->e(I)[B

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    goto :goto_0
.end method

.method public k()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->s()I

    move-result v1

    iget v0, p0, Lcom/google/tagmanager/a/k;->c:I

    iget v2, p0, Lcom/google/tagmanager/a/k;->e:I

    sub-int/2addr v0, v2

    if-gt v1, v0, :cond_0

    if-lez v1, :cond_0

    iget-object v0, p0, Lcom/google/tagmanager/a/k;->a:[B

    iget v2, p0, Lcom/google/tagmanager/a/k;->e:I

    invoke-static {v0, v2, v1}, Lcom/google/tagmanager/a/h;->a([BII)Lcom/google/tagmanager/a/h;

    move-result-object v0

    iget v2, p0, Lcom/google/tagmanager/a/k;->e:I

    add-int/2addr v1, v2

    iput v1, p0, Lcom/google/tagmanager/a/k;->e:I

    :goto_0
    invoke-virtual {v0}, Lcom/google/tagmanager/a/h;->g()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {}, Lcom/google/tagmanager/a/af;->j()Lcom/google/tagmanager/a/af;

    move-result-object v0

    throw v0

    :cond_0
    new-instance v0, Lcom/google/tagmanager/a/aj;

    invoke-virtual {p0, v1}, Lcom/google/tagmanager/a/k;->e(I)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/tagmanager/a/aj;-><init>([B)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/google/tagmanager/a/h;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public l()Lcom/google/tagmanager/a/h;
    .locals 4

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->s()I

    move-result v1

    if-nez v1, :cond_0

    sget-object v0, Lcom/google/tagmanager/a/h;->a:Lcom/google/tagmanager/a/h;

    :goto_0
    return-object v0

    :cond_0
    iget v0, p0, Lcom/google/tagmanager/a/k;->c:I

    iget v2, p0, Lcom/google/tagmanager/a/k;->e:I

    sub-int/2addr v0, v2

    if-gt v1, v0, :cond_2

    if-lez v1, :cond_2

    iget-boolean v0, p0, Lcom/google/tagmanager/a/k;->b:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/google/tagmanager/a/k;->h:Z

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/tagmanager/a/e;

    iget-object v2, p0, Lcom/google/tagmanager/a/k;->a:[B

    iget v3, p0, Lcom/google/tagmanager/a/k;->e:I

    invoke-direct {v0, v2, v3, v1}, Lcom/google/tagmanager/a/e;-><init>([BII)V

    :goto_1
    iget v2, p0, Lcom/google/tagmanager/a/k;->e:I

    add-int/2addr v1, v2

    iput v1, p0, Lcom/google/tagmanager/a/k;->e:I

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/tagmanager/a/k;->a:[B

    iget v2, p0, Lcom/google/tagmanager/a/k;->e:I

    invoke-static {v0, v2, v1}, Lcom/google/tagmanager/a/h;->a([BII)Lcom/google/tagmanager/a/h;

    move-result-object v0

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/google/tagmanager/a/aj;

    invoke-virtual {p0, v1}, Lcom/google/tagmanager/a/k;->e(I)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/tagmanager/a/aj;-><init>([B)V

    goto :goto_0
.end method

.method public m()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->s()I

    move-result v0

    return v0
.end method

.method public n()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->s()I

    move-result v0

    return v0
.end method

.method public o()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->u()I

    move-result v0

    return v0
.end method

.method public p()J
    .locals 2

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->v()J

    move-result-wide v0

    return-wide v0
.end method

.method public q()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->s()I

    move-result v0

    invoke-static {v0}, Lcom/google/tagmanager/a/k;->b(I)I

    move-result v0

    return v0
.end method

.method public r()J
    .locals 2

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->t()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/tagmanager/a/k;->a(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public s()I
    .locals 3

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->y()B

    move-result v0

    if-ltz v0, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    and-int/lit8 v0, v0, 0x7f

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->y()B

    move-result v1

    if-ltz v1, :cond_2

    shl-int/lit8 v1, v1, 0x7

    or-int/2addr v0, v1

    goto :goto_0

    :cond_2
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x7

    or-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->y()B

    move-result v1

    if-ltz v1, :cond_3

    shl-int/lit8 v1, v1, 0xe

    or-int/2addr v0, v1

    goto :goto_0

    :cond_3
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0xe

    or-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->y()B

    move-result v1

    if-ltz v1, :cond_4

    shl-int/lit8 v1, v1, 0x15

    or-int/2addr v0, v1

    goto :goto_0

    :cond_4
    and-int/lit8 v1, v1, 0x7f

    shl-int/lit8 v1, v1, 0x15

    or-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->y()B

    move-result v1

    shl-int/lit8 v2, v1, 0x1c

    or-int/2addr v0, v2

    if-gez v1, :cond_0

    const/4 v1, 0x0

    :goto_1
    const/4 v2, 0x5

    if-ge v1, v2, :cond_5

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->y()B

    move-result v2

    if-gez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    invoke-static {}, Lcom/google/tagmanager/a/af;->d()Lcom/google/tagmanager/a/af;

    move-result-object v0

    throw v0
.end method

.method public t()J
    .locals 6

    const/4 v2, 0x0

    const-wide/16 v0, 0x0

    :goto_0
    const/16 v3, 0x40

    if-ge v2, v3, :cond_1

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->y()B

    move-result v3

    and-int/lit8 v4, v3, 0x7f

    int-to-long v4, v4

    shl-long/2addr v4, v2

    or-long/2addr v0, v4

    and-int/lit16 v3, v3, 0x80

    if-nez v3, :cond_0

    return-wide v0

    :cond_0
    add-int/lit8 v2, v2, 0x7

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/tagmanager/a/af;->d()Lcom/google/tagmanager/a/af;

    move-result-object v0

    throw v0
.end method

.method public u()I
    .locals 4

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->y()B

    move-result v0

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->y()B

    move-result v1

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->y()B

    move-result v2

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->y()B

    move-result v3

    and-int/lit16 v0, v0, 0xff

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    and-int/lit16 v1, v2, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    and-int/lit16 v1, v3, 0xff

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v0, v1

    return v0
.end method

.method public v()J
    .locals 13

    const-wide/16 v11, 0xff

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->y()B

    move-result v0

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->y()B

    move-result v1

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->y()B

    move-result v2

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->y()B

    move-result v3

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->y()B

    move-result v4

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->y()B

    move-result v5

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->y()B

    move-result v6

    invoke-virtual {p0}, Lcom/google/tagmanager/a/k;->y()B

    move-result v7

    int-to-long v8, v0

    and-long/2addr v8, v11

    int-to-long v0, v1

    and-long/2addr v0, v11

    const/16 v10, 0x8

    shl-long/2addr v0, v10

    or-long/2addr v0, v8

    int-to-long v8, v2

    and-long/2addr v8, v11

    const/16 v2, 0x10

    shl-long/2addr v8, v2

    or-long/2addr v0, v8

    int-to-long v2, v3

    and-long/2addr v2, v11

    const/16 v8, 0x18

    shl-long/2addr v2, v8

    or-long/2addr v0, v2

    int-to-long v2, v4

    and-long/2addr v2, v11

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    int-to-long v2, v5

    and-long/2addr v2, v11

    const/16 v4, 0x28

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    int-to-long v2, v6

    and-long/2addr v2, v11

    const/16 v4, 0x30

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    int-to-long v2, v7

    and-long/2addr v2, v11

    const/16 v4, 0x38

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public w()I
    .locals 2

    iget v0, p0, Lcom/google/tagmanager/a/k;->j:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lcom/google/tagmanager/a/k;->i:I

    iget v1, p0, Lcom/google/tagmanager/a/k;->e:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/tagmanager/a/k;->j:I

    sub-int v0, v1, v0

    goto :goto_0
.end method

.method public x()Z
    .locals 3

    const/4 v0, 0x0

    iget v1, p0, Lcom/google/tagmanager/a/k;->e:I

    iget v2, p0, Lcom/google/tagmanager/a/k;->c:I

    if-ne v1, v2, :cond_0

    invoke-direct {p0, v0}, Lcom/google/tagmanager/a/k;->a(Z)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public y()B
    .locals 3

    iget v0, p0, Lcom/google/tagmanager/a/k;->e:I

    iget v1, p0, Lcom/google/tagmanager/a/k;->c:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/tagmanager/a/k;->a(Z)Z

    :cond_0
    iget-object v0, p0, Lcom/google/tagmanager/a/k;->a:[B

    iget v1, p0, Lcom/google/tagmanager/a/k;->e:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/tagmanager/a/k;->e:I

    aget-byte v0, v0, v1

    return v0
.end method
