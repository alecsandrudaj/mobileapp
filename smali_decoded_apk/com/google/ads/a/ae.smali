.class public Lcom/google/ads/a/ae;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/ads/a/ae;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/ads/a/ae;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method protected a(Ljava/net/HttpURLConnection;)Ljava/io/BufferedOutputStream;
    .locals 2

    new-instance v0, Ljava/io/BufferedOutputStream;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-object v0
.end method

.method protected a(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 3

    const/4 v1, 0x1

    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    iget-object v1, p0, Lcom/google/ads/a/ae;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/google/ads/util/AdUtil;->a(Ljava/net/HttpURLConnection;Landroid/content/Context;)V

    const-string v1, "Accept"

    const-string v2, "application/json"

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "Content-Type"

    const-string v2, "application/json"

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public run()V
    .locals 3

    invoke-static {}, Lcom/google/ads/br;->a()Lcom/google/ads/br;

    move-result-object v0

    iget-object v0, v0, Lcom/google/ads/br;->b:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/bs;

    iget-object v0, v0, Lcom/google/ads/bs;->h:Lcom/google/ads/util/ae;

    invoke-virtual {v0}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/google/ads/a/ae;->a(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object v1

    new-instance v0, Lcom/google/ads/a/af;

    iget-object v2, p0, Lcom/google/ads/a/ae;->a:Ljava/lang/String;

    invoke-direct {v0, v2}, Lcom/google/ads/a/af;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/ads/a/af;->a()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v2, v0

    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {p0, v1}, Lcom/google/ads/a/ae;->a(Ljava/net/HttpURLConnection;)Ljava/io/BufferedOutputStream;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    const/16 v2, 0xc8

    if-eq v0, v2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Got error response from BadAd backend: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/ads/util/g;->b(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    :try_start_2
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    :goto_0
    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    const-string v1, "Error reporting bad ad."

    invoke-static {v1, v0}, Lcom/google/ads/util/g;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
