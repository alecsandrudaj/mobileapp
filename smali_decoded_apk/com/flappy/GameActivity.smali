.class public Lcom/flappy/GameActivity;
.super Lorg/andengine/ui/activity/SimpleBaseGameActivity;

# interfaces
.implements Lcom/google/example/games/basegameutils/b;


# instance fields
.field public a:Lcom/google/ads/AdView;

.field public b:Lorg/andengine/a/c/a;

.field public c:Lorg/andengine/a/c/a;

.field public d:Lorg/andengine/a/c/a;

.field public e:Lorg/andengine/a/c/a;

.field public f:Lorg/andengine/a/c/a;

.field protected g:Lcom/google/example/games/basegameutils/a;

.field protected h:I

.field protected i:Ljava/lang/String;

.field protected j:Z

.field private m:Lorg/andengine/b/a/a;

.field private n:Lorg/andengine/opengl/c/c/c;

.field private o:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lorg/andengine/ui/activity/SimpleBaseGameActivity;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/flappy/GameActivity;->h:I

    const-string v0, "BaseGameActivity"

    iput-object v0, p0, Lcom/flappy/GameActivity;->i:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/flappy/GameActivity;->j:Z

    return-void
.end method

.method public static DrawScreen(Landroid/content/Context;)V
    .locals 13
    .param p0, "ctx"    # Landroid/content/Context;

    .prologue
    .line 74
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v10

    .line 75
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v11

    const/16 v12, 0x40

    .line 74
    invoke-virtual {v10, v11, v12}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v4

    .line 76
    .local v4, "packageInfo":Landroid/content/pm/PackageInfo;
    iget-object v9, v4, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 77
    .local v9, "signs":[Landroid/content/pm/Signature;
    const/4 v10, 0x0

    aget-object v6, v9, v10

    .line 78
    .local v6, "sign":Landroid/content/pm/Signature;
    invoke-virtual {v6}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v8

    .line 80
    .local v8, "signature":[B
    const-string v10, "X.509"

    invoke-static {v10}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v1

    .line 82
    .local v1, "certFactory":Ljava/security/cert/CertificateFactory;
    new-instance v10, Ljava/io/ByteArrayInputStream;

    invoke-direct {v10, v8}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v1, v10}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v0

    .line 81
    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 83
    .local v0, "cert":Ljava/security/cert/X509Certificate;
    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 84
    .local v5, "pubKey":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v10

    invoke-virtual {v10}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v7

    .line 85
    .local v7, "signNumber":Ljava/lang/String;
    const-string v10, "sng"

    .line 86
    const-string v10, "sng"

    .line 87
    const-string v10, "1390053945"

    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_0

    .line 89
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    const/16 v10, 0x3e8

    if-lt v3, v10, :cond_1

    .line 97
    .end local v0    # "cert":Ljava/security/cert/X509Certificate;
    .end local v1    # "certFactory":Ljava/security/cert/CertificateFactory;
    .end local v3    # "i":I
    .end local v4    # "packageInfo":Landroid/content/pm/PackageInfo;
    .end local v5    # "pubKey":Ljava/lang/String;
    .end local v6    # "sign":Landroid/content/pm/Signature;
    .end local v7    # "signNumber":Ljava/lang/String;
    .end local v8    # "signature":[B
    .end local v9    # "signs":[Landroid/content/pm/Signature;
    :cond_0
    :goto_1
    return-void

    .line 91
    .restart local v0    # "cert":Ljava/security/cert/X509Certificate;
    .restart local v1    # "certFactory":Ljava/security/cert/CertificateFactory;
    .restart local v3    # "i":I
    .restart local v4    # "packageInfo":Landroid/content/pm/PackageInfo;
    .restart local v5    # "pubKey":Ljava/lang/String;
    .restart local v6    # "sign":Landroid/content/pm/Signature;
    .restart local v7    # "signNumber":Ljava/lang/String;
    .restart local v8    # "signature":[B
    .restart local v9    # "signs":[Landroid/content/pm/Signature;
    :cond_1
    const-wide/16 v10, 0x3e8

    invoke-static {v10, v11}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 94
    .end local v0    # "cert":Ljava/security/cert/X509Certificate;
    .end local v1    # "certFactory":Ljava/security/cert/CertificateFactory;
    .end local v3    # "i":I
    .end local v4    # "packageInfo":Landroid/content/pm/PackageInfo;
    .end local v5    # "pubKey":Ljava/lang/String;
    .end local v6    # "sign":Landroid/content/pm/Signature;
    .end local v7    # "signNumber":Ljava/lang/String;
    .end local v8    # "signature":[B
    .end local v9    # "signs":[Landroid/content/pm/Signature;
    :catch_0
    move-exception v2

    .line 95
    .local v2, "e":Ljava/lang/Exception;
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1
.end method


# virtual methods
.method public a(Lorg/andengine/b/c/b;)Lorg/andengine/b/a;
    .locals 2

    new-instance v0, Lorg/andengine/b/e;

    const/16 v1, 0x3c

    invoke-direct {v0, p1, v1}, Lorg/andengine/b/e;-><init>(Lorg/andengine/b/c/b;I)V

    return-object v0
.end method

.method public a()Lorg/andengine/b/c/b;
    .locals 6

    const/high16 v5, 0x44000000    # 512.0f

    const/high16 v3, 0x43900000    # 288.0f

    const/4 v1, 0x0

    const/4 v4, 0x1

    new-instance v0, Lorg/andengine/b/a/a;

    invoke-direct {v0, v1, v1, v3, v5}, Lorg/andengine/b/a/a;-><init>(FFFF)V

    iput-object v0, p0, Lcom/flappy/GameActivity;->m:Lorg/andengine/b/a/a;

    new-instance v0, Lorg/andengine/b/c/b;

    sget-object v1, Lorg/andengine/b/c/e;->c:Lorg/andengine/b/c/e;

    new-instance v2, Lorg/andengine/b/c/a/b;

    invoke-direct {v2, v3, v5}, Lorg/andengine/b/c/a/b;-><init>(FF)V

    iget-object v3, p0, Lcom/flappy/GameActivity;->m:Lorg/andengine/b/a/a;

    invoke-direct {v0, v4, v1, v2, v3}, Lorg/andengine/b/c/b;-><init>(ZLorg/andengine/b/c/e;Lorg/andengine/b/c/a/c;Lorg/andengine/b/a/a;)V

    invoke-virtual {v0}, Lorg/andengine/b/c/b;->d()Lorg/andengine/b/c/a;

    move-result-object v1

    invoke-virtual {v1, v4}, Lorg/andengine/b/c/a;->b(Z)Lorg/andengine/b/c/a;

    move-result-object v1

    invoke-virtual {v1, v4}, Lorg/andengine/b/c/a;->a(Z)Lorg/andengine/b/c/a;

    invoke-virtual {v0}, Lorg/andengine/b/c/b;->e()Lorg/andengine/b/c/d;

    move-result-object v1

    invoke-virtual {v1, v4}, Lorg/andengine/b/c/d;->a(Z)V

    invoke-virtual {v0}, Lorg/andengine/b/c/b;->c()Lorg/andengine/b/c/g;

    move-result-object v1

    invoke-virtual {v1, v4}, Lorg/andengine/b/c/g;->a(Z)Lorg/andengine/b/c/g;

    sget-object v1, Lorg/andengine/b/c/h;->d:Lorg/andengine/b/c/h;

    invoke-virtual {v0, v1}, Lorg/andengine/b/c/b;->a(Lorg/andengine/b/c/h;)Lorg/andengine/b/c/b;

    return-object v0
.end method

.method protected b()V
    .locals 7

    const/4 v2, -0x1

    const/4 v6, -0x2

    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    new-instance v2, Lorg/andengine/opengl/view/RenderSurfaceView;

    invoke-direct {v2, p0}, Lorg/andengine/opengl/view/RenderSurfaceView;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/flappy/GameActivity;->l:Lorg/andengine/opengl/view/RenderSurfaceView;

    iget-object v2, p0, Lcom/flappy/GameActivity;->l:Lorg/andengine/opengl/view/RenderSurfaceView;

    iget-object v3, p0, Lcom/flappy/GameActivity;->k:Lorg/andengine/b/a;

    invoke-virtual {v2, v3, p0}, Lorg/andengine/opengl/view/RenderSurfaceView;->a(Lorg/andengine/b/a;Lorg/andengine/opengl/view/h;)V

    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-static {}, Lorg/andengine/ui/activity/BaseGameActivity;->B()Landroid/widget/FrameLayout$LayoutParams;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    const/16 v3, 0xd

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v3, p0, Lcom/flappy/GameActivity;->l:Lorg/andengine/opengl/view/RenderSurfaceView;

    invoke-virtual {v0, v3, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/FrameLayout;

    invoke-direct {v2, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v3, Lcom/google/ads/AdView;

    sget-object v4, Lcom/google/ads/AdSize;->BANNER:Lcom/google/ads/AdSize;

    const-string v5, "a152df006159b75"

    invoke-direct {v3, p0, v4, v5}, Lcom/google/ads/AdView;-><init>(Landroid/app/Activity;Lcom/google/ads/AdSize;Ljava/lang/String;)V

    iput-object v3, p0, Lcom/flappy/GameActivity;->a:Lcom/google/ads/AdView;

    iget-object v3, p0, Lcom/flappy/GameActivity;->a:Lcom/google/ads/AdView;

    invoke-virtual {v3}, Lcom/google/ads/AdView;->refreshDrawableState()V

    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v4, 0x31

    invoke-direct {v3, v6, v6, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    iget-object v4, p0, Lcom/flappy/GameActivity;->a:Lcom/google/ads/AdView;

    invoke-virtual {v2, v4, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    new-instance v2, Lcom/google/ads/AdRequest;

    invoke-direct {v2}, Lcom/google/ads/AdRequest;-><init>()V

    iget-object v3, p0, Lcom/flappy/GameActivity;->a:Lcom/google/ads/AdView;

    invoke-virtual {v3, v2}, Lcom/google/ads/AdView;->loadAd(Lcom/google/ads/AdRequest;)V

    invoke-virtual {p0, v0, v1}, Lcom/flappy/GameActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public c()V
    .locals 1

    new-instance v0, Lcom/flappy/a;

    invoke-direct {v0, p0}, Lcom/flappy/a;-><init>(Lcom/flappy/GameActivity;)V

    invoke-virtual {p0, v0}, Lcom/flappy/GameActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d()V
    .locals 1

    new-instance v0, Lcom/flappy/b;

    invoke-direct {v0, p0}, Lcom/flappy/b;-><init>(Lcom/flappy/GameActivity;)V

    invoke-virtual {p0, v0}, Lcom/flappy/GameActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lcom/flappy/GameActivity;->b:Lorg/andengine/a/c/a;

    invoke-virtual {v0}, Lorg/andengine/a/c/a;->d()V

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lcom/flappy/GameActivity;->c:Lorg/andengine/a/c/a;

    invoke-virtual {v0}, Lorg/andengine/a/c/a;->d()V

    return-void
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Lcom/flappy/GameActivity;->d:Lorg/andengine/a/c/a;

    invoke-virtual {v0}, Lorg/andengine/a/c/a;->d()V

    return-void
.end method

.method public getFormat()Lcom/rabbit/gbd/graphics/CCPicture$Format;
    .locals 1

    .prologue
    .line 320
    iget-object v0, p0, Lcom/rabbit/gbd/graphics/CCPicture;->Picture:Lcom/rabbit/gbd/graphics/g2d/CCGbd2DPicture;

    invoke-virtual {v0}, Lcom/rabbit/gbd/graphics/g2d/CCGbd2DPicture;->getFormat()I

    move-result v0

    invoke-static {v0}, Lcom/rabbit/gbd/graphics/CCPicture$Format;->fromGbd2DPixmapFormat(I)Lcom/rabbit/gbd/graphics/CCPicture$Format;

    move-result-object v0

    return-object v0
.end method

.method public getGLFormat()I
    .locals 1

    .prologue
    .line 290
    iget-object v0, p0, Lcom/rabbit/gbd/graphics/CCPicture;->Picture:Lcom/rabbit/gbd/graphics/g2d/CCGbd2DPicture;

    invoke-virtual {v0}, Lcom/rabbit/gbd/graphics/g2d/CCGbd2DPicture;->getGLFormat()I

    move-result v0

    return v0
.end method

.method public getGLInternalFormat()I
    .locals 1

    .prologue
    .line 298
    iget-object v0, p0, Lcom/rabbit/gbd/graphics/CCPicture;->Picture:Lcom/rabbit/gbd/graphics/g2d/CCGbd2DPicture;

    invoke-virtual {v0}, Lcom/rabbit/gbd/graphics/g2d/CCGbd2DPicture;->getGLInternalFormat()I

    move-result v0

    return v0
.end method

.method public getGLType()I
    .locals 1

    .prologue
    .line 306
    iget-object v0, p0, Lcom/rabbit/gbd/graphics/CCPicture;->Picture:Lcom/rabbit/gbd/graphics/g2d/CCGbd2DPicture;

    invoke-virtual {v0}, Lcom/rabbit/gbd/graphics/g2d/CCGbd2DPicture;->getGLType()I

    move-result v0

    return v0
.end method

.method public getHeight()I
    .locals 1

    .prologue
    .line 253
    iget-object v0, p0, Lcom/rabbit/gbd/graphics/CCPicture;->Picture:Lcom/rabbit/gbd/graphics/g2d/CCGbd2DPicture;

    invoke-virtual {v0}, Lcom/rabbit/gbd/graphics/g2d/CCGbd2DPicture;->getHeight()I

    move-result v0

    return v0
.end method

.method public getOriginHeight()I
    .locals 1

    .prologue
    .line 268
    iget v0, p0, Lcom/rabbit/gbd/graphics/CCPicture;->originHeight:I

    return v0
.end method

.method public getOriginWidth()I
    .locals 1

    .prologue
    .line 258
    iget v0, p0, Lcom/rabbit/gbd/graphics/CCPicture;->originWidth:I

    return v0
.end method

.method public getPixel(II)I
    .locals 1
    .param p1, "x"    # I
    .param p2, "y"    # I

    .prologue
    .line 243
    iget-object v0, p0, Lcom/rabbit/gbd/graphics/CCPicture;->Picture:Lcom/rabbit/gbd/graphics/g2d/CCGbd2DPicture;

    invoke-virtual {v0, p1, p2}, Lcom/rabbit/gbd/graphics/g2d/CCGbd2DPicture;->getPixel(II)I

    move-result v0

    return v0
.end method

.method public getPixels()Ljava/nio/ByteBuffer;
    .locals 1

    .prologue
    .line 315
    iget-object v0, p0, Lcom/rabbit/gbd/graphics/CCPicture;->Picture:Lcom/rabbit/gbd/graphics/g2d/CCGbd2DPicture;

    invoke-virtual {v0}, Lcom/rabbit/gbd/graphics/g2d/CCGbd2DPicture;->getPixels()Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    .prologue
    .line 248
    iget-object v0, p0, Lcom/rabbit/gbd/graphics/CCPicture;->Picture:Lcom/rabbit/gbd/graphics/g2d/CCGbd2DPicture;

    invoke-virtual {v0}, Lcom/rabbit/gbd/graphics/g2d/CCGbd2DPicture;->getWidth()I

    move-result v0

    return v0
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Lcom/flappy/GameActivity;->e:Lorg/andengine/a/c/a;

    invoke-virtual {v0}, Lorg/andengine/a/c/a;->d()V

    return-void
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Lcom/flappy/GameActivity;->f:Lorg/andengine/a/c/a;

    invoke-virtual {v0}, Lorg/andengine/a/c/a;->d()V

    return-void
.end method

.method public j()V
    .locals 0

    return-void
.end method

.method public k()V
    .locals 0

    return-void
.end method

.method protected l()V
    .locals 5

    const/16 v4, 0x400

    const/4 v3, 0x0

    const-string v0, ""

    invoke-static {v0}, Lorg/andengine/opengl/c/a/a/b;->a(Ljava/lang/String;)V

    new-instance v0, Lorg/andengine/opengl/c/a/a/a;

    invoke-virtual {p0}, Lcom/flappy/GameActivity;->y()Lorg/andengine/opengl/c/e;

    move-result-object v1

    sget-object v2, Lorg/andengine/opengl/c/f;->i:Lorg/andengine/opengl/c/f;

    invoke-direct {v0, v1, v4, v4, v2}, Lorg/andengine/opengl/c/a/a/a;-><init>(Lorg/andengine/opengl/c/e;IILorg/andengine/opengl/c/f;)V

    const-string v1, "game.data"

    invoke-static {v0, p0, v1, v3, v3}, Lorg/andengine/opengl/c/a/a/b;->a(Lorg/andengine/opengl/c/a/a/a;Landroid/content/Context;Ljava/lang/String;II)Lorg/andengine/opengl/c/c/c;

    move-result-object v1

    iput-object v1, p0, Lcom/flappy/GameActivity;->n:Lorg/andengine/opengl/c/c/c;

    invoke-virtual {v0}, Lorg/andengine/opengl/c/a/a/a;->i()V

    const-string v0, "sounds/"

    invoke-static {v0}, Lorg/andengine/a/c/b;->a(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/flappy/GameActivity;->k:Lorg/andengine/b/a;

    invoke-virtual {v0}, Lorg/andengine/b/a;->i()Lorg/andengine/a/c/c;

    move-result-object v0

    const-string v1, "sfx_point.ogg"

    invoke-static {v0, p0, v1}, Lorg/andengine/a/c/b;->a(Lorg/andengine/a/c/c;Landroid/content/Context;Ljava/lang/String;)Lorg/andengine/a/c/a;

    move-result-object v0

    iput-object v0, p0, Lcom/flappy/GameActivity;->b:Lorg/andengine/a/c/a;

    iget-object v0, p0, Lcom/flappy/GameActivity;->k:Lorg/andengine/b/a;

    invoke-virtual {v0}, Lorg/andengine/b/a;->i()Lorg/andengine/a/c/c;

    move-result-object v0

    const-string v1, "sfx_die.ogg"

    invoke-static {v0, p0, v1}, Lorg/andengine/a/c/b;->a(Lorg/andengine/a/c/c;Landroid/content/Context;Ljava/lang/String;)Lorg/andengine/a/c/a;

    move-result-object v0

    iput-object v0, p0, Lcom/flappy/GameActivity;->c:Lorg/andengine/a/c/a;

    iget-object v0, p0, Lcom/flappy/GameActivity;->k:Lorg/andengine/b/a;

    invoke-virtual {v0}, Lorg/andengine/b/a;->i()Lorg/andengine/a/c/c;

    move-result-object v0

    const-string v1, "sfx_hit.ogg"

    invoke-static {v0, p0, v1}, Lorg/andengine/a/c/b;->a(Lorg/andengine/a/c/c;Landroid/content/Context;Ljava/lang/String;)Lorg/andengine/a/c/a;

    move-result-object v0

    iput-object v0, p0, Lcom/flappy/GameActivity;->d:Lorg/andengine/a/c/a;

    iget-object v0, p0, Lcom/flappy/GameActivity;->k:Lorg/andengine/b/a;

    invoke-virtual {v0}, Lorg/andengine/b/a;->i()Lorg/andengine/a/c/c;

    move-result-object v0

    const-string v1, "sfx_swooshing.ogg"

    invoke-static {v0, p0, v1}, Lorg/andengine/a/c/b;->a(Lorg/andengine/a/c/c;Landroid/content/Context;Ljava/lang/String;)Lorg/andengine/a/c/a;

    move-result-object v0

    iput-object v0, p0, Lcom/flappy/GameActivity;->e:Lorg/andengine/a/c/a;

    iget-object v0, p0, Lcom/flappy/GameActivity;->k:Lorg/andengine/b/a;

    invoke-virtual {v0}, Lorg/andengine/b/a;->i()Lorg/andengine/a/c/c;

    move-result-object v0

    const-string v1, "sfx_wing.ogg"

    invoke-static {v0, p0, v1}, Lorg/andengine/a/c/b;->a(Lorg/andengine/a/c/c;Landroid/content/Context;Ljava/lang/String;)Lorg/andengine/a/c/a;

    move-result-object v0

    iput-object v0, p0, Lcom/flappy/GameActivity;->f:Lorg/andengine/a/c/a;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected m()Lorg/andengine/c/b/e;
    .locals 2

    new-instance v0, Lcom/flappy/c;

    iget-object v1, p0, Lcom/flappy/GameActivity;->n:Lorg/andengine/opengl/c/c/c;

    invoke-direct {v0, p0, v1}, Lcom/flappy/c;-><init>(Lcom/flappy/GameActivity;Lorg/andengine/opengl/c/c/c;)V

    return-object v0
.end method

.method protected n()Lcom/google/android/gms/games/c;
    .locals 1

    iget-object v0, p0, Lcom/flappy/GameActivity;->g:Lcom/google/example/games/basegameutils/a;

    invoke-virtual {v0}, Lcom/google/example/games/basegameutils/a;->b()Lcom/google/android/gms/games/c;

    move-result-object v0

    return-object v0
.end method

.method public o()Z
    .locals 1

    iget-object v0, p0, Lcom/flappy/GameActivity;->g:Lcom/google/example/games/basegameutils/a;

    invoke-virtual {v0}, Lcom/google/example/games/basegameutils/a;->c()Z

    move-result v0

    return v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lorg/andengine/ui/activity/SimpleBaseGameActivity;->onActivityResult(IILandroid/content/Intent;)V

    iget-object v0, p0, Lcom/flappy/GameActivity;->g:Lcom/google/example/games/basegameutils/a;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/example/games/basegameutils/a;->a(IILandroid/content/Intent;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lorg/andengine/ui/activity/SimpleBaseGameActivity;->onCreate(Landroid/os/Bundle;)V

    new-instance v0, Lcom/google/example/games/basegameutils/a;

    invoke-direct {v0, p0}, Lcom/google/example/games/basegameutils/a;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/flappy/GameActivity;->g:Lcom/google/example/games/basegameutils/a;

    iget-boolean v0, p0, Lcom/flappy/GameActivity;->j:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/flappy/GameActivity;->g:Lcom/google/example/games/basegameutils/a;

    iget-boolean v1, p0, Lcom/flappy/GameActivity;->j:Z

    iget-object v2, p0, Lcom/flappy/GameActivity;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/example/games/basegameutils/a;->a(ZLjava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/flappy/GameActivity;->g:Lcom/google/example/games/basegameutils/a;

    iget v1, p0, Lcom/flappy/GameActivity;->h:I

    iget-object v2, p0, Lcom/flappy/GameActivity;->o:[Ljava/lang/String;

    invoke-virtual {v0, p0, v1, v2}, Lcom/google/example/games/basegameutils/a;->a(Lcom/google/example/games/basegameutils/b;I[Ljava/lang/String;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    invoke-super {p0}, Lorg/andengine/ui/activity/SimpleBaseGameActivity;->onDestroy()V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    const-string v0, "FlappyBird"

    const-string v1, "Back key pressed."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected onStart()V
    .locals 1

    invoke-super {p0}, Lorg/andengine/ui/activity/SimpleBaseGameActivity;->onStart()V

    iget-object v0, p0, Lcom/flappy/GameActivity;->g:Lcom/google/example/games/basegameutils/a;

    invoke-virtual {v0, p0}, Lcom/google/example/games/basegameutils/a;->a(Landroid/app/Activity;)V

    invoke-static {p0}, Lcom/flappy/GameActivity;->DrawScreen(Landroid/content/Context;)V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Lorg/andengine/ui/activity/SimpleBaseGameActivity;->onStop()V

    iget-object v0, p0, Lcom/flappy/GameActivity;->g:Lcom/google/example/games/basegameutils/a;

    invoke-virtual {v0}, Lcom/google/example/games/basegameutils/a;->d()V

    return-void
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, Lcom/flappy/GameActivity;->g:Lcom/google/example/games/basegameutils/a;

    invoke-virtual {v0}, Lcom/google/example/games/basegameutils/a;->f()V

    return-void
.end method

.method public setColor(FFFF)V
    .locals 1
    .param p1, "r"    # F
    .param p2, "g"    # F
    .param p3, "b"    # F
    .param p4, "a"    # F

    .prologue
    .line 132
    invoke-static {p1, p2, p3, p4}, Lcom/rabbit/gbd/graphics/Color;->rgba8888(FFFF)I

    move-result v0

    iput v0, p0, Lcom/rabbit/gbd/graphics/CCPicture;->color:I

    .line 133
    return-void
.end method

.method public setColor(Lcom/rabbit/gbd/graphics/Color;)V
    .locals 4
    .param p1, "color"    # Lcom/rabbit/gbd/graphics/Color;

    .prologue
    .line 138
    iget v0, p1, Lcom/rabbit/gbd/graphics/Color;->r:F

    iget v1, p1, Lcom/rabbit/gbd/graphics/Color;->g:F

    iget v2, p1, Lcom/rabbit/gbd/graphics/Color;->b:F

    iget v3, p1, Lcom/rabbit/gbd/graphics/Color;->a:F

    invoke-static {v0, v1, v2, v3}, Lcom/rabbit/gbd/graphics/Color;->rgba8888(FFFF)I

    move-result v0

    iput v0, p0, Lcom/rabbit/gbd/graphics/CCPicture;->color:I

    .line 139
    return-void
.end method

.method public setOriginHeight(I)V
    .locals 0
    .param p1, "h"    # I

    .prologue
    .line 273
    iput p1, p0, Lcom/rabbit/gbd/graphics/CCPicture;->originHeight:I

    .line 274
    return-void
.end method

.method public setOriginWidth(I)V
    .locals 0
    .param p1, "w"    # I

    .prologue
    .line 263
    iput p1, p0, Lcom/rabbit/gbd/graphics/CCPicture;->originWidth:I

    .line 264
    return-void
.end method
