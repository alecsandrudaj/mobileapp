.class public Lcom/google/ads/ak;
.super Lcom/google/ads/aj;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/ads/ak$a;
    }
.end annotation


# static fields
.field static c:Z

.field private static d:Ljava/lang/reflect/Method;

.field private static e:Ljava/lang/reflect/Method;

.field private static f:Ljava/lang/reflect/Method;

.field private static g:Ljava/lang/reflect/Method;

.field private static h:Ljava/lang/reflect/Method;

.field private static i:Ljava/lang/String;

.field private static j:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 35
    sput-object v0, Lcom/google/ads/ak;->d:Ljava/lang/reflect/Method;

    .line 36
    sput-object v0, Lcom/google/ads/ak;->e:Ljava/lang/reflect/Method;

    .line 37
    sput-object v0, Lcom/google/ads/ak;->f:Ljava/lang/reflect/Method;

    .line 38
    sput-object v0, Lcom/google/ads/ak;->g:Ljava/lang/reflect/Method;

    .line 39
    sput-object v0, Lcom/google/ads/ak;->h:Ljava/lang/reflect/Method;

    .line 42
    sput-object v0, Lcom/google/ads/ak;->i:Ljava/lang/String;

    .line 45
    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/google/ads/ak;->j:J

    .line 48
    const/4 v0, 0x0

    sput-boolean v0, Lcom/google/ads/ak;->c:Z

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 118
    invoke-direct {p0, p1}, Lcom/google/ads/aj;-><init>(Landroid/content/Context;)V

    .line 119
    return-void
.end method

.method public static a(Ljava/lang/String;Landroid/content/Context;)Lcom/google/ads/ak;
    .locals 1

    .prologue
    .line 73
    invoke-static {p0, p1}, Lcom/google/ads/ak;->b(Ljava/lang/String;Landroid/content/Context;)V

    .line 75
    new-instance v0, Lcom/google/ads/ak;

    invoke-direct {v0, p1}, Lcom/google/ads/ak;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method static a()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/ads/ak$a;
        }
    .end annotation

    .prologue
    .line 203
    sget-object v0, Lcom/google/ads/ak;->i:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 204
    new-instance v0, Lcom/google/ads/ak$a;

    invoke-direct {v0}, Lcom/google/ads/ak$a;-><init>()V

    throw v0

    .line 207
    :cond_0
    sget-object v0, Lcom/google/ads/ak;->i:Ljava/lang/String;

    return-object v0
.end method

.method static a(Landroid/view/MotionEvent;Landroid/util/DisplayMetrics;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/MotionEvent;",
            "Landroid/util/DisplayMetrics;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/ads/ak$a;
        }
    .end annotation

    .prologue
    .line 260
    sget-object v0, Lcom/google/ads/ak;->g:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    if-nez p0, :cond_1

    .line 262
    :cond_0
    new-instance v0, Lcom/google/ads/ak$a;

    invoke-direct {v0}, Lcom/google/ads/ak$a;-><init>()V

    throw v0

    .line 267
    :cond_1
    :try_start_0
    sget-object v0, Lcom/google/ads/ak;->g:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    .line 269
    return-object v0

    .line 270
    :catch_0
    move-exception v0

    .line 271
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 272
    :catch_1
    move-exception v0

    .line 273
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method static b()Ljava/lang/Long;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/ads/ak$a;
        }
    .end annotation

    .prologue
    .line 211
    sget-object v0, Lcom/google/ads/ak;->d:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    .line 212
    new-instance v0, Lcom/google/ads/ak$a;

    invoke-direct {v0}, Lcom/google/ads/ak$a;-><init>()V

    throw v0

    .line 216
    :cond_0
    :try_start_0
    sget-object v0, Lcom/google/ads/ak;->d:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v0

    .line 217
    :catch_0
    move-exception v0

    .line 218
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 219
    :catch_1
    move-exception v0

    .line 220
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static b([BLjava/lang/String;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/ads/ak$a;
        }
    .end annotation

    .prologue
    .line 303
    :try_start_0
    new-instance v0, Ljava/lang/String;

    invoke-static {p0, p1}, Lcom/google/ads/an;->a([BLjava/lang/String;)[B

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Lcom/google/ads/an$a; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/ads/ap; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_2

    return-object v0

    .line 306
    :catch_0
    move-exception v0

    .line 307
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 308
    :catch_1
    move-exception v0

    .line 309
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 310
    :catch_2
    move-exception v0

    .line 311
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected static declared-synchronized b(Ljava/lang/String;Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 92
    const-class v1, Lcom/google/ads/ak;

    monitor-enter v1

    :try_start_0
    sget-boolean v0, Lcom/google/ads/ak;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 95
    :try_start_1
    sput-object p0, Lcom/google/ads/ak;->i:Ljava/lang/String;

    .line 98
    invoke-static {p1}, Lcom/google/ads/ak;->f(Landroid/content/Context;)V

    .line 101
    invoke-static {}, Lcom/google/ads/ak;->b()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sput-wide v2, Lcom/google/ads/ak;->j:J

    .line 103
    const/4 v0, 0x1

    sput-boolean v0, Lcom/google/ads/ak;->c:Z
    :try_end_1
    .catch Lcom/google/ads/ak$a; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    .line 92
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    .line 106
    :catch_0
    move-exception v0

    goto :goto_0

    .line 104
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method static c()Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/ads/ak$a;
        }
    .end annotation

    .prologue
    .line 245
    sget-object v0, Lcom/google/ads/ak;->e:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    .line 246
    new-instance v0, Lcom/google/ads/ak$a;

    invoke-direct {v0}, Lcom/google/ads/ak$a;-><init>()V

    throw v0

    .line 250
    :cond_0
    :try_start_0
    sget-object v0, Lcom/google/ads/ak;->e:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v0

    .line 251
    :catch_0
    move-exception v0

    .line 252
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 253
    :catch_1
    move-exception v0

    .line 254
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/ads/ak$a;
        }
    .end annotation

    .prologue
    .line 226
    sget-object v0, Lcom/google/ads/ak;->h:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    .line 227
    new-instance v0, Lcom/google/ads/ak$a;

    invoke-direct {v0}, Lcom/google/ads/ak$a;-><init>()V

    throw v0

    .line 231
    :cond_0
    :try_start_0
    sget-object v0, Lcom/google/ads/ak;->h:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 232
    if-nez v0, :cond_1

    .line 233
    new-instance v0, Lcom/google/ads/ak$a;

    invoke-direct {v0}, Lcom/google/ads/ak$a;-><init>()V

    throw v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    .line 237
    :catch_0
    move-exception v0

    .line 238
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 239
    :catch_1
    move-exception v0

    .line 240
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 236
    :cond_1
    return-object v0
.end method

.method static e(Landroid/content/Context;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/ads/ak$a;
        }
    .end annotation

    .prologue
    .line 279
    sget-object v0, Lcom/google/ads/ak;->f:Ljava/lang/reflect/Method;

    if-nez v0, :cond_0

    .line 280
    new-instance v0, Lcom/google/ads/ak$a;

    invoke-direct {v0}, Lcom/google/ads/ak$a;-><init>()V

    throw v0

    .line 284
    :cond_0
    :try_start_0
    sget-object v0, Lcom/google/ads/ak;->f:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    .line 286
    if-nez v0, :cond_1

    .line 287
    new-instance v0, Lcom/google/ads/ak$a;

    invoke-direct {v0}, Lcom/google/ads/ak$a;-><init>()V

    throw v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    .line 293
    :catch_0
    move-exception v0

    .line 294
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 292
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/ads/aq;->a([BZ)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    return-object v0

    .line 295
    :catch_1
    move-exception v0

    .line 296
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static f(Landroid/content/Context;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/ads/ak$a;
        }
    .end annotation

    .prologue
    .line 329
    :try_start_0
    invoke-static {}, Lcom/google/ads/ao;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/ads/an;->a(Ljava/lang/String;)[B

    move-result-object v1

    .line 332
    invoke-static {}, Lcom/google/ads/ao;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/ads/an;->a([BLjava/lang/String;)[B

    move-result-object v2

    .line 335
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    .line 336
    if-nez v0, :cond_0

    .line 341
    const-string v0, "dex"

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    .line 342
    if-nez v0, :cond_0

    .line 343
    new-instance v0, Lcom/google/ads/ak$a;

    invoke-direct {v0}, Lcom/google/ads/ak$a;-><init>()V

    throw v0
    :try_end_0
    .catch Lcom/google/ads/ap; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/google/ads/an$a; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_6

    .line 389
    :catch_0
    move-exception v0

    .line 390
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 348
    :cond_0
    :try_start_1
    const-string v3, "ads"

    const-string v4, ".jar"

    invoke-static {v3, v4, v0}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v3

    .line 349
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 350
    const/4 v5, 0x0

    array-length v6, v2

    invoke-virtual {v4, v2, v5, v6}, Ljava/io/FileOutputStream;->write([BII)V

    .line 351
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 354
    new-instance v2, Ldalvik/system/DexClassLoader;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v7

    invoke-direct {v2, v4, v5, v6, v7}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    .line 359
    invoke-static {}, Lcom/google/ads/ao;->c()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/google/ads/ak;->b([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    .line 361
    invoke-static {}, Lcom/google/ads/ao;->i()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Lcom/google/ads/ak;->b([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    .line 363
    invoke-static {}, Lcom/google/ads/ao;->g()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Lcom/google/ads/ak;->b([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    .line 365
    invoke-static {}, Lcom/google/ads/ao;->k()Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Lcom/google/ads/ak;->b([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    .line 367
    invoke-static {}, Lcom/google/ads/ao;->e()Ljava/lang/String;

    move-result-object v8

    invoke-static {v1, v8}, Lcom/google/ads/ak;->b([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ldalvik/system/DexClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 371
    invoke-static {}, Lcom/google/ads/ao;->d()Ljava/lang/String;

    move-result-object v8

    invoke-static {v1, v8}, Lcom/google/ads/ak;->b([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    new-array v9, v9, [Ljava/lang/Class;

    invoke-virtual {v4, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    sput-object v4, Lcom/google/ads/ak;->d:Ljava/lang/reflect/Method;

    .line 373
    invoke-static {}, Lcom/google/ads/ao;->j()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/google/ads/ak;->b([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x0

    new-array v8, v8, [Ljava/lang/Class;

    invoke-virtual {v5, v4, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    sput-object v4, Lcom/google/ads/ak;->e:Ljava/lang/reflect/Method;

    .line 375
    invoke-static {}, Lcom/google/ads/ao;->h()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/google/ads/ak;->b([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Class;

    const/4 v8, 0x0

    const-class v9, Landroid/content/Context;

    aput-object v9, v5, v8

    invoke-virtual {v6, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    sput-object v4, Lcom/google/ads/ak;->f:Ljava/lang/reflect/Method;

    .line 377
    invoke-static {}, Lcom/google/ads/ao;->l()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/google/ads/ak;->b([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Class;

    const/4 v6, 0x0

    const-class v8, Landroid/view/MotionEvent;

    aput-object v8, v5, v6

    const/4 v6, 0x1

    const-class v8, Landroid/util/DisplayMetrics;

    aput-object v8, v5, v6

    invoke-virtual {v7, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    sput-object v4, Lcom/google/ads/ak;->g:Ljava/lang/reflect/Method;

    .line 380
    invoke-static {}, Lcom/google/ads/ao;->f()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/google/ads/ak;->b([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Class;

    const/4 v5, 0x0

    const-class v6, Landroid/content/Context;

    aput-object v6, v4, v5

    invoke-virtual {v2, v1, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    sput-object v1, Lcom/google/ads/ak;->h:Ljava/lang/reflect/Method;

    .line 385
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    .line 386
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 387
    new-instance v2, Ljava/io/File;

    const-string v3, ".jar"

    const-string v4, ".dex"

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_1
    .catch Lcom/google/ads/ap; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lcom/google/ads/an$a; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_6

    .line 408
    return-void

    .line 391
    :catch_1
    move-exception v0

    .line 392
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 393
    :catch_2
    move-exception v0

    .line 394
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 395
    :catch_3
    move-exception v0

    .line 396
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 397
    :catch_4
    move-exception v0

    .line 398
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 399
    :catch_5
    move-exception v0

    .line 400
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 401
    :catch_6
    move-exception v0

    .line 406
    new-instance v1, Lcom/google/ads/ak$a;

    invoke-direct {v1, v0}, Lcom/google/ads/ak$a;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method protected b(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 125
    const/4 v0, 0x1

    :try_start_0
    invoke-static {}, Lcom/google/ads/ak;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/ak;->a(ILjava/lang/String;)V
    :try_end_0
    .catch Lcom/google/ads/ak$a; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    :goto_0
    const/4 v0, 0x2

    :try_start_1
    invoke-static {}, Lcom/google/ads/ak;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/ak;->a(ILjava/lang/String;)V
    :try_end_1
    .catch Lcom/google/ads/ak$a; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 137
    :goto_1
    const/16 v0, 0x19

    :try_start_2
    invoke-static {}, Lcom/google/ads/ak;->b()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/ads/ak;->a(IJ)V
    :try_end_2
    .catch Lcom/google/ads/ak$a; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 143
    :goto_2
    const/16 v0, 0x18

    :try_start_3
    invoke-static {p1}, Lcom/google/ads/ak;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/ak;->a(ILjava/lang/String;)V
    :try_end_3
    .catch Lcom/google/ads/ak$a; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 150
    :goto_3
    return-void

    .line 147
    :catch_0
    move-exception v0

    goto :goto_3

    .line 144
    :catch_1
    move-exception v0

    goto :goto_3

    .line 138
    :catch_2
    move-exception v0

    goto :goto_2

    .line 132
    :catch_3
    move-exception v0

    goto :goto_1

    .line 126
    :catch_4
    move-exception v0

    goto :goto_0
.end method

.method protected c(Landroid/content/Context;)V
    .locals 6

    .prologue
    .line 156
    const/4 v0, 0x2

    :try_start_0
    invoke-static {}, Lcom/google/ads/ak;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/ak;->a(ILjava/lang/String;)V
    :try_end_0
    .catch Lcom/google/ads/ak$a; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    :goto_0
    const/4 v0, 0x1

    :try_start_1
    invoke-static {}, Lcom/google/ads/ak;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/ak;->a(ILjava/lang/String;)V
    :try_end_1
    .catch Lcom/google/ads/ak$a; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 168
    :goto_1
    :try_start_2
    invoke-static {}, Lcom/google/ads/ak;->b()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 169
    const/16 v2, 0x19

    invoke-virtual {p0, v2, v0, v1}, Lcom/google/ads/ak;->a(IJ)V

    .line 171
    sget-wide v2, Lcom/google/ads/ak;->j:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    .line 172
    const/16 v2, 0x11

    sget-wide v3, Lcom/google/ads/ak;->j:J

    sub-long/2addr v0, v3

    invoke-virtual {p0, v2, v0, v1}, Lcom/google/ads/ak;->a(IJ)V

    .line 173
    const/16 v0, 0x17

    sget-wide v1, Lcom/google/ads/ak;->j:J

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/ads/ak;->a(IJ)V
    :try_end_2
    .catch Lcom/google/ads/ak$a; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 180
    :cond_0
    :goto_2
    :try_start_3
    iget-object v0, p0, Lcom/google/ads/ak;->a:Landroid/view/MotionEvent;

    iget-object v1, p0, Lcom/google/ads/ak;->b:Landroid/util/DisplayMetrics;

    invoke-static {v0, v1}, Lcom/google/ads/ak;->a(Landroid/view/MotionEvent;Landroid/util/DisplayMetrics;)Ljava/util/ArrayList;

    move-result-object v1

    .line 181
    const/16 v2, 0xe

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {p0, v2, v3, v4}, Lcom/google/ads/ak;->a(IJ)V

    .line 182
    const/16 v2, 0xf

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {p0, v2, v3, v4}, Lcom/google/ads/ak;->a(IJ)V

    .line 183
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x3

    if-lt v0, v2, :cond_1

    .line 185
    const/16 v2, 0x10

    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v2, v0, v1}, Lcom/google/ads/ak;->a(IJ)V
    :try_end_3
    .catch Lcom/google/ads/ak$a; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 192
    :cond_1
    :goto_3
    const/16 v0, 0x1b

    :try_start_4
    invoke-static {p1}, Lcom/google/ads/ak;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/ads/ak;->a(ILjava/lang/String;)V
    :try_end_4
    .catch Lcom/google/ads/ak$a; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 199
    :goto_4
    return-void

    .line 196
    :catch_0
    move-exception v0

    goto :goto_4

    .line 193
    :catch_1
    move-exception v0

    goto :goto_4

    .line 187
    :catch_2
    move-exception v0

    goto :goto_3

    .line 175
    :catch_3
    move-exception v0

    goto :goto_2

    .line 163
    :catch_4
    move-exception v0

    goto :goto_1

    .line 157
    :catch_5
    move-exception v0

    goto :goto_0
.end method
