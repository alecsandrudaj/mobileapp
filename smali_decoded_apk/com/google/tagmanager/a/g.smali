.class Lcom/google/tagmanager/a/g;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/tagmanager/a/i;


# instance fields
.field final synthetic a:Lcom/google/tagmanager/a/e;

.field private b:I

.field private final c:I


# direct methods
.method private constructor <init>(Lcom/google/tagmanager/a/e;)V
    .locals 2

    iput-object p1, p0, Lcom/google/tagmanager/a/g;->a:Lcom/google/tagmanager/a/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/tagmanager/a/e;->b()I

    move-result v0

    iput v0, p0, Lcom/google/tagmanager/a/g;->b:I

    iget v0, p0, Lcom/google/tagmanager/a/g;->b:I

    invoke-virtual {p1}, Lcom/google/tagmanager/a/e;->a()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/tagmanager/a/g;->c:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/tagmanager/a/e;Lcom/google/tagmanager/a/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/tagmanager/a/g;-><init>(Lcom/google/tagmanager/a/e;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Byte;
    .locals 1

    invoke-virtual {p0}, Lcom/google/tagmanager/a/g;->b()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method

.method public b()B
    .locals 3

    iget v0, p0, Lcom/google/tagmanager/a/g;->b:I

    iget v1, p0, Lcom/google/tagmanager/a/g;->c:I

    if-lt v0, v1, :cond_0

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/tagmanager/a/g;->a:Lcom/google/tagmanager/a/e;

    iget-object v0, v0, Lcom/google/tagmanager/a/e;->c:[B

    iget v1, p0, Lcom/google/tagmanager/a/g;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/tagmanager/a/g;->b:I

    aget-byte v0, v0, v1

    return v0
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Lcom/google/tagmanager/a/g;->b:I

    iget v1, p0, Lcom/google/tagmanager/a/g;->c:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/tagmanager/a/g;->a()Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
