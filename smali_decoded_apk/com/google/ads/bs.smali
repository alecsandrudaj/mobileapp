.class public final Lcom/google/ads/bs;
.super Lcom/google/ads/util/aa;


# instance fields
.field public final a:Lcom/google/ads/util/ae;

.field public final b:Lcom/google/ads/util/ae;

.field public final c:Lcom/google/ads/util/ae;

.field public final d:Lcom/google/ads/util/ae;

.field public final e:Lcom/google/ads/util/ae;

.field public final f:Lcom/google/ads/util/ae;

.field public final g:Lcom/google/ads/util/ae;

.field public final h:Lcom/google/ads/util/ae;

.field public final i:Lcom/google/ads/util/ae;

.field public final j:Lcom/google/ads/util/ae;

.field public final k:Lcom/google/ads/util/ae;

.field public final l:Lcom/google/ads/util/ae;

.field public final m:Lcom/google/ads/util/ae;

.field public final n:Lcom/google/ads/util/ae;

.field public final o:Lcom/google/ads/util/ae;


# direct methods
.method public constructor <init>()V
    .locals 8

    const-wide/32 v6, 0x500000

    const-wide/32 v4, 0x20000

    const/16 v3, 0x12

    invoke-direct {p0}, Lcom/google/ads/util/aa;-><init>()V

    new-instance v0, Lcom/google/ads/util/ae;

    const-string v1, "ASDomains"

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/google/ads/util/ae;-><init>(Lcom/google/ads/util/aa;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/ads/bs;->a:Lcom/google/ads/util/ae;

    new-instance v0, Lcom/google/ads/util/ae;

    const-string v1, "minHwAccelerationVersionBanner"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/google/ads/util/ae;-><init>(Lcom/google/ads/util/aa;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/ads/bs;->b:Lcom/google/ads/util/ae;

    new-instance v0, Lcom/google/ads/util/ae;

    const-string v1, "minHwAccelerationVersionOverlay"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/google/ads/util/ae;-><init>(Lcom/google/ads/util/aa;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/ads/bs;->c:Lcom/google/ads/util/ae;

    new-instance v0, Lcom/google/ads/util/ae;

    const-string v1, "minHwAccelerationVersionOverlay"

    const/16 v2, 0xe

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/google/ads/util/ae;-><init>(Lcom/google/ads/util/aa;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/ads/bs;->d:Lcom/google/ads/util/ae;

    new-instance v0, Lcom/google/ads/util/ae;

    const-string v1, "mraidBannerPath"

    const-string v2, "http://media.admob.com/mraid/v1/mraid_app_banner.js"

    invoke-direct {v0, p0, v1, v2}, Lcom/google/ads/util/ae;-><init>(Lcom/google/ads/util/aa;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/ads/bs;->e:Lcom/google/ads/util/ae;

    new-instance v0, Lcom/google/ads/util/ae;

    const-string v1, "mraidExpandedBannerPath"

    const-string v2, "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js"

    invoke-direct {v0, p0, v1, v2}, Lcom/google/ads/util/ae;-><init>(Lcom/google/ads/util/aa;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/ads/bs;->f:Lcom/google/ads/util/ae;

    new-instance v0, Lcom/google/ads/util/ae;

    const-string v1, "mraidInterstitialPath"

    const-string v2, "http://media.admob.com/mraid/v1/mraid_app_interstitial.js"

    invoke-direct {v0, p0, v1, v2}, Lcom/google/ads/util/ae;-><init>(Lcom/google/ads/util/aa;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/ads/bs;->g:Lcom/google/ads/util/ae;

    new-instance v0, Lcom/google/ads/util/ae;

    const-string v1, "badAdReportPath"

    const-string v2, "https://badad.googleplex.com/s/reportAd"

    invoke-direct {v0, p0, v1, v2}, Lcom/google/ads/util/ae;-><init>(Lcom/google/ads/util/aa;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/ads/bs;->h:Lcom/google/ads/util/ae;

    new-instance v0, Lcom/google/ads/util/ae;

    const-string v1, "appCacheMaxSize"

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/google/ads/util/ae;-><init>(Lcom/google/ads/util/aa;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/ads/bs;->i:Lcom/google/ads/util/ae;

    new-instance v0, Lcom/google/ads/util/ae;

    const-string v1, "appCacheMaxSizePaddingInBytes"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/google/ads/util/ae;-><init>(Lcom/google/ads/util/aa;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/ads/bs;->j:Lcom/google/ads/util/ae;

    new-instance v0, Lcom/google/ads/util/ae;

    const-string v1, "maxTotalAppCacheQuotaInBytes"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/google/ads/util/ae;-><init>(Lcom/google/ads/util/aa;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/ads/bs;->k:Lcom/google/ads/util/ae;

    new-instance v0, Lcom/google/ads/util/ae;

    const-string v1, "maxTotalDatabaseQuotaInBytes"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/google/ads/util/ae;-><init>(Lcom/google/ads/util/aa;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/ads/bs;->l:Lcom/google/ads/util/ae;

    new-instance v0, Lcom/google/ads/util/ae;

    const-string v1, "maxDatabaseQuotaPerOriginInBytes"

    const-wide/32 v2, 0x100000

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/google/ads/util/ae;-><init>(Lcom/google/ads/util/aa;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/ads/bs;->m:Lcom/google/ads/util/ae;

    new-instance v0, Lcom/google/ads/util/ae;

    const-string v1, "databaseQuotaIncreaseStepInBytes"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/google/ads/util/ae;-><init>(Lcom/google/ads/util/aa;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/ads/bs;->n:Lcom/google/ads/util/ae;

    new-instance v0, Lcom/google/ads/util/ae;

    const-string v1, "isInitialized"

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/google/ads/util/ae;-><init>(Lcom/google/ads/util/aa;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/ads/bs;->o:Lcom/google/ads/util/ae;

    return-void
.end method
