.class public Lcom/google/ads/a/w;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/Object;


# instance fields
.field private A:Ljava/lang/String;

.field private B:Ljava/lang/String;

.field private final b:Lcom/google/ads/bt;

.field private c:Lcom/google/ads/a/n;

.field private d:Lcom/google/ads/d;

.field private e:Lcom/google/ads/a/ab;

.field private f:Lcom/google/ads/a/e;

.field private g:Lcom/google/ads/a/ad;

.field private h:Z

.field private i:J

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Landroid/content/SharedPreferences;

.field private p:J

.field private q:Lcom/google/ads/p;

.field private r:Z

.field private s:Ljava/util/LinkedList;

.field private t:Ljava/util/LinkedList;

.field private u:Ljava/util/LinkedList;

.field private v:I

.field private w:Ljava/lang/Boolean;

.field private x:Lcom/google/ads/bc;

.field private y:Lcom/google/ads/bd;

.field private z:Lcom/google/ads/bh;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/ads/a/w;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/ads/a;Landroid/app/Activity;Lcom/google/ads/g;Ljava/lang/String;Landroid/view/ViewGroup;Z)V
    .locals 12

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/ads/a/w;->h:Z

    const/4 v1, -0x1

    iput v1, p0, Lcom/google/ads/a/w;->v:I

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/ads/a/w;->A:Ljava/lang/String;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/ads/a/w;->B:Ljava/lang/String;

    move/from16 v0, p6

    iput-boolean v0, p0, Lcom/google/ads/a/w;->r:Z

    new-instance v1, Lcom/google/ads/a/ab;

    invoke-direct {v1}, Lcom/google/ads/a/ab;-><init>()V

    iput-object v1, p0, Lcom/google/ads/a/w;->e:Lcom/google/ads/a/ab;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/ads/a/w;->c:Lcom/google/ads/a/n;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/ads/a/w;->d:Lcom/google/ads/d;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/ads/a/w;->k:Z

    const-wide/32 v1, 0xea60

    iput-wide v1, p0, Lcom/google/ads/a/w;->p:J

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/ads/a/w;->l:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/ads/a/w;->n:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/ads/a/w;->m:Z

    if-nez p3, :cond_1

    sget-object v10, Lcom/google/ads/a/ac;->a:Lcom/google/ads/a/ac;

    :goto_0
    instance-of v1, p1, Lcom/google/ads/doubleclick/SwipeableDfpAdView;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v10, v1}, Lcom/google/ads/a/ac;->a(Z)V

    :cond_0
    if-nez p2, :cond_4

    new-instance v1, Lcom/google/ads/bt;

    invoke-static {}, Lcom/google/ads/br;->a()Lcom/google/ads/br;

    move-result-object v2

    instance-of v3, p1, Lcom/google/ads/AdView;

    if-eqz v3, :cond_2

    move-object v3, p1

    check-cast v3, Lcom/google/ads/AdView;

    move-object v4, v3

    :goto_1
    instance-of v3, p1, Lcom/google/ads/i;

    if-eqz v3, :cond_3

    move-object v3, p1

    check-cast v3, Lcom/google/ads/i;

    move-object v5, v3

    :goto_2
    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p1

    move-object/from16 v6, p4

    move-object/from16 v9, p5

    move-object v11, p0

    invoke-direct/range {v1 .. v11}, Lcom/google/ads/bt;-><init>(Lcom/google/ads/br;Lcom/google/ads/a;Lcom/google/ads/AdView;Lcom/google/ads/i;Ljava/lang/String;Landroid/app/Activity;Landroid/content/Context;Landroid/view/ViewGroup;Lcom/google/ads/a/ac;Lcom/google/ads/a/w;)V

    iput-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    :goto_3
    return-void

    :cond_1
    invoke-virtual {p2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {p3, v1}, Lcom/google/ads/a/ac;->a(Lcom/google/ads/g;Landroid/content/Context;)Lcom/google/ads/a/ac;

    move-result-object v10

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    goto :goto_2

    :cond_4
    sget-object v2, Lcom/google/ads/a/w;->a:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    invoke-virtual {p2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "GoogleAdMobAdsPrefs"

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    iput-object v1, p0, Lcom/google/ads/a/w;->o:Landroid/content/SharedPreferences;

    if-eqz p6, :cond_6

    iget-object v1, p0, Lcom/google/ads/a/w;->o:Landroid/content/SharedPreferences;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Timeout"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v0, p4

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-wide/16 v4, -0x1

    invoke-interface {v1, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-gez v1, :cond_5

    const-wide/16 v3, 0x1388

    iput-wide v3, p0, Lcom/google/ads/a/w;->i:J

    :goto_4
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v1, Lcom/google/ads/bt;

    invoke-static {}, Lcom/google/ads/br;->a()Lcom/google/ads/br;

    move-result-object v2

    instance-of v3, p1, Lcom/google/ads/AdView;

    if-eqz v3, :cond_7

    move-object v3, p1

    check-cast v3, Lcom/google/ads/AdView;

    move-object v4, v3

    :goto_5
    instance-of v3, p1, Lcom/google/ads/i;

    if-eqz v3, :cond_8

    move-object v3, p1

    check-cast v3, Lcom/google/ads/i;

    move-object v5, v3

    :goto_6
    invoke-virtual {p2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v8

    move-object v3, p1

    move-object/from16 v6, p4

    move-object v7, p2

    move-object/from16 v9, p5

    move-object v11, p0

    invoke-direct/range {v1 .. v11}, Lcom/google/ads/bt;-><init>(Lcom/google/ads/br;Lcom/google/ads/a;Lcom/google/ads/AdView;Lcom/google/ads/i;Ljava/lang/String;Landroid/app/Activity;Landroid/content/Context;Landroid/view/ViewGroup;Lcom/google/ads/a/ac;Lcom/google/ads/a/w;)V

    iput-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    new-instance v1, Lcom/google/ads/p;

    invoke-direct {v1, p0}, Lcom/google/ads/p;-><init>(Lcom/google/ads/a/w;)V

    iput-object v1, p0, Lcom/google/ads/a/w;->q:Lcom/google/ads/p;

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/google/ads/a/w;->s:Ljava/util/LinkedList;

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/google/ads/a/w;->t:Ljava/util/LinkedList;

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/google/ads/a/w;->u:Ljava/util/LinkedList;

    invoke-virtual {p0}, Lcom/google/ads/a/w;->a()V

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->f:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v1}, Lcom/google/ads/util/AdUtil;->h(Landroid/content/Context;)V

    new-instance v1, Lcom/google/ads/bc;

    invoke-direct {v1}, Lcom/google/ads/bc;-><init>()V

    iput-object v1, p0, Lcom/google/ads/a/w;->x:Lcom/google/ads/bc;

    new-instance v1, Lcom/google/ads/bd;

    invoke-direct {v1, p0}, Lcom/google/ads/bd;-><init>(Lcom/google/ads/a/w;)V

    iput-object v1, p0, Lcom/google/ads/a/w;->y:Lcom/google/ads/bd;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/ads/a/w;->w:Ljava/lang/Boolean;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/ads/a/w;->z:Lcom/google/ads/bh;

    goto/16 :goto_3

    :cond_5
    :try_start_1
    iput-wide v3, p0, Lcom/google/ads/a/w;->i:J

    goto :goto_4

    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_6
    const-wide/32 v3, 0xea60

    :try_start_2
    iput-wide v3, p0, Lcom/google/ads/a/w;->i:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :cond_7
    const/4 v4, 0x0

    goto :goto_5

    :cond_8
    const/4 v5, 0x0

    goto :goto_6
.end method

.method private a(Lcom/google/ads/bh;Ljava/lang/Boolean;)V
    .locals 8

    invoke-virtual {p1}, Lcom/google/ads/bh;->d()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v0, "http://e.admob.com/imp?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&ad_network_id=@gw_adnetid@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&nr=@gw_adnetrefresh@&adt=@gw_adt@&aec=@gw_aec@"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p1}, Lcom/google/ads/bh;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/ads/bh;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/ads/bh;->c()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/google/ads/a/w;->e:Lcom/google/ads/a/ab;

    invoke-virtual {v0}, Lcom/google/ads/a/ab;->d()Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lcom/google/ads/a/w;->e:Lcom/google/ads/a/ab;

    invoke-virtual {v0}, Lcom/google/ads/a/ab;->e()Ljava/lang/String;

    move-result-object v7

    move-object v0, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v7}, Lcom/google/ads/a/w;->a(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/util/List;Ljava/lang/String;)V
    .locals 8

    const/4 v2, 0x0

    if-nez p1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v0, "http://e.admob.com/nofill?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&adt=@gw_adt@&aec=@gw_aec@"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    iget-object v0, p0, Lcom/google/ads/a/w;->e:Lcom/google/ads/a/ab;

    invoke-virtual {v0}, Lcom/google/ads/a/ab;->d()Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lcom/google/ads/a/w;->e:Lcom/google/ads/a/ab;

    invoke-virtual {v0}, Lcom/google/ads/a/ab;->e()Ljava/lang/String;

    move-result-object v7

    move-object v0, p0

    move-object v3, v2

    move-object v4, p2

    move-object v5, v2

    invoke-direct/range {v0 .. v7}, Lcom/google/ads/a/w;->a(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    move-object v1, p1

    goto :goto_0
.end method

.method private a(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V
    .locals 12

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->f:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lcom/google/ads/util/AdUtil;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/google/ads/az;->a()Lcom/google/ads/az;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/ads/az;->b()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcom/google/ads/az;->c()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->h:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    move-object/from16 v2, p5

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    invoke-static/range {v0 .. v10}, Lcom/google/ads/bi;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/Thread;

    new-instance v4, Lcom/google/ads/o;

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->f:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-direct {v4, v1, v0}, Lcom/google/ads/o;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    invoke-direct {v2, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/ads/a/w;->e:Lcom/google/ads/a/ab;

    invoke-virtual {v0}, Lcom/google/ads/a/ab;->b()V

    return-void
.end method


# virtual methods
.method public A()Ljava/util/LinkedList;
    .locals 1

    iget-object v0, p0, Lcom/google/ads/a/w;->t:Ljava/util/LinkedList;

    return-object v0
.end method

.method public declared-synchronized a()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->g:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/a/ac;

    invoke-virtual {v0}, Lcom/google/ads/a/ac;->c()Lcom/google/ads/g;

    move-result-object v1

    sget v0, Lcom/google/ads/util/AdUtil;->a:I

    const/16 v2, 0xe

    if-lt v0, v2, :cond_1

    new-instance v0, Lcom/google/ads/util/c;

    iget-object v2, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    invoke-direct {v0, v2, v1}, Lcom/google/ads/util/c;-><init>(Lcom/google/ads/bt;Lcom/google/ads/g;)V

    :goto_0
    iput-object v0, p0, Lcom/google/ads/a/w;->f:Lcom/google/ads/a/e;

    iget-object v0, p0, Lcom/google/ads/a/w;->f:Lcom/google/ads/a/e;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/google/ads/a/e;->setVisibility(I)V

    sget-object v0, Lcom/google/ads/a/h;->d:Ljava/util/Map;

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    invoke-virtual {v2}, Lcom/google/ads/bt;->b()Z

    move-result v2

    invoke-static {p0, v0, v1, v2}, Lcom/google/ads/a/ad;->a(Lcom/google/ads/a/w;Ljava/util/Map;ZZ)Lcom/google/ads/a/ad;

    move-result-object v0

    iput-object v0, p0, Lcom/google/ads/a/w;->g:Lcom/google/ads/a/ad;

    iget-object v0, p0, Lcom/google/ads/a/w;->f:Lcom/google/ads/a/e;

    iget-object v1, p0, Lcom/google/ads/a/w;->g:Lcom/google/ads/a/ad;

    invoke-virtual {v0, v1}, Lcom/google/ads/a/e;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->d:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/br;

    iget-object v0, v0, Lcom/google/ads/br;->b:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/bs;

    sget v1, Lcom/google/ads/util/AdUtil;->a:I

    iget-object v0, v0, Lcom/google/ads/bs;->b:Lcom/google/ads/util/ae;

    invoke-virtual {v0}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ge v1, v0, :cond_0

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->g:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/a/ac;

    invoke-virtual {v0}, Lcom/google/ads/a/ac;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Disabling hardware acceleration for a banner."

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/a/w;->f:Lcom/google/ads/a/e;

    invoke-virtual {v0}, Lcom/google/ads/a/e;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance v0, Lcom/google/ads/a/e;

    iget-object v2, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    invoke-direct {v0, v2, v1}, Lcom/google/ads/a/e;-><init>(Lcom/google/ads/bt;Lcom/google/ads/g;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(F)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/google/ads/a/w;->p:J

    const/high16 v2, 0x447a0000    # 1000.0f

    mul-float/2addr v2, p1

    float-to-long v2, v2

    iput-wide v2, p0, Lcom/google/ads/a/w;->p:J

    invoke-virtual {p0}, Lcom/google/ads/a/w;->r()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-wide v2, p0, Lcom/google/ads/a/w;->p:J

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/ads/a/w;->e()V

    invoke-virtual {p0}, Lcom/google/ads/a/w;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(I)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput p1, p0, Lcom/google/ads/a/w;->v:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(IIII)V
    .locals 6

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->e:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/a/a;

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->f:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    if-gez p3, :cond_2

    iget-object v2, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v2, v2, Lcom/google/ads/bt;->g:Lcom/google/ads/util/ad;

    invoke-virtual {v2}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/ads/a/ac;

    invoke-virtual {v2}, Lcom/google/ads/a/ac;->c()Lcom/google/ads/g;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/ads/g;->a()I

    move-result v2

    :goto_0
    invoke-static {v1, v2}, Lcom/google/ads/util/AdUtil;->a(Landroid/content/Context;I)I

    move-result v3

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->f:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    if-gez p4, :cond_0

    iget-object v2, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v2, v2, Lcom/google/ads/bt;->g:Lcom/google/ads/util/ad;

    invoke-virtual {v2}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/ads/a/ac;

    invoke-virtual {v2}, Lcom/google/ads/a/ac;->c()Lcom/google/ads/g;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/ads/g;->b()I

    move-result p4

    :cond_0
    invoke-static {v1, p4}, Lcom/google/ads/util/AdUtil;->a(Landroid/content/Context;I)I

    move-result v1

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v5, v3, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    if-gez p3, :cond_4

    move v2, v4

    move v1, v4

    :goto_1
    if-gez v1, :cond_3

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->e:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ads/a/a;

    invoke-virtual {v1}, Lcom/google/ads/a/a;->d()I

    move-result v1

    move v3, v1

    :goto_2
    if-gez v2, :cond_1

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->e:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ads/a/a;

    invoke-virtual {v1}, Lcom/google/ads/a/a;->c()I

    move-result v1

    move v2, v1

    :cond_1
    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->e:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ads/a/a;

    invoke-virtual {v1, v3}, Lcom/google/ads/a/a;->setXPosition(I)V

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->e:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ads/a/a;

    invoke-virtual {v1, v2}, Lcom/google/ads/a/a;->setYPosition(I)V

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->f:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v1, v3}, Lcom/google/ads/util/AdUtil;->a(Landroid/content/Context;I)I

    move-result v3

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->f:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v1, v2}, Lcom/google/ads/util/AdUtil;->a(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v5, v3, v1, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    invoke-virtual {v0, v5}, Lcom/google/ads/a/a;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_2
    move v2, p3

    goto/16 :goto_0

    :cond_3
    move v3, v1

    goto :goto_2

    :cond_4
    move v2, p2

    move v1, p1

    goto :goto_1
.end method

.method public a(J)V
    .locals 4

    sget-object v1, Lcom/google/ads/a/w;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/ads/a/w;->o:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Timeout"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v3, v3, Lcom/google/ads/bt;->h:Lcom/google/ads/util/ad;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-boolean v0, p0, Lcom/google/ads/a/w;->r:Z

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lcom/google/ads/a/w;->i:J

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Landroid/view/View;)V
    .locals 7

    const/4 v2, 0x0

    const/4 v3, -0x1

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->i:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->i:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->i:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->g:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/a/ac;

    invoke-virtual {v0}, Lcom/google/ads/a/ac;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->b:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/a/w;

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->l:Lcom/google/ads/util/ae;

    invoke-virtual {v1}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ads/bq;

    move v4, v3

    move v5, v3

    move v6, v3

    invoke-virtual/range {v0 .. v6}, Lcom/google/ads/a/w;->a(Lcom/google/ads/bq;ZIIII)V

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->e:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/a/a;

    invoke-virtual {v0}, Lcom/google/ads/a/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->i:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->e:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    iget-object v2, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v2, v2, Lcom/google/ads/bt;->f:Lcom/google/ads/util/ad;

    invoke-virtual {v2}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    iget-object v3, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v3, v3, Lcom/google/ads/bt;->g:Lcom/google/ads/util/ad;

    invoke-virtual {v3}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/ads/a/ac;

    invoke-virtual {v3}, Lcom/google/ads/a/ac;->c()Lcom/google/ads/g;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/ads/g;->a()I

    move-result v3

    invoke-static {v2, v3}, Lcom/google/ads/util/AdUtil;->a(Landroid/content/Context;I)I

    move-result v4

    iget-object v2, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v2, v2, Lcom/google/ads/bt;->f:Lcom/google/ads/util/ad;

    invoke-virtual {v2}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    iget-object v3, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v3, v3, Lcom/google/ads/bt;->g:Lcom/google/ads/util/ad;

    invoke-virtual {v3}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/ads/a/ac;

    invoke-virtual {v3}, Lcom/google/ads/a/ac;->c()Lcom/google/ads/g;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/ads/g;->b()I

    move-result v3

    invoke-static {v2, v3}, Lcom/google/ads/util/AdUtil;->a(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v1, v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    :cond_0
    return-void
.end method

.method public declared-synchronized a(Landroid/view/View;Lcom/google/ads/bk;Lcom/google/ads/bh;Z)V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "AdManager.onReceiveGWhirlAd() called."

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/ads/a/w;->k:Z

    iput-object p3, p0, Lcom/google/ads/a/w;->z:Lcom/google/ads/bh;

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    invoke-virtual {v0}, Lcom/google/ads/bt;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/ads/a/w;->a(Landroid/view/View;)V

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, p3, v0}, Lcom/google/ads/a/w;->a(Lcom/google/ads/bh;Ljava/lang/Boolean;)V

    :cond_0
    iget-object v0, p0, Lcom/google/ads/a/w;->y:Lcom/google/ads/bd;

    invoke-virtual {v0, p2}, Lcom/google/ads/bd;->a(Lcom/google/ads/bk;)V

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->o:Lcom/google/ads/util/ae;

    invoke-virtual {v0}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/c;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->a:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ads/a;

    invoke-interface {v0, v1}, Lcom/google/ads/c;->a(Lcom/google/ads/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/google/ads/ba;)V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/google/ads/a/w;->c:Lcom/google/ads/a/n;

    iget-object v0, p0, Lcom/google/ads/a/w;->y:Lcom/google/ads/bd;

    iget-object v1, p0, Lcom/google/ads/a/w;->d:Lcom/google/ads/d;

    invoke-virtual {v0, p1, v1}, Lcom/google/ads/bd;->a(Lcom/google/ads/ba;Lcom/google/ads/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Lcom/google/ads/bq;ZIIII)V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->e:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/a/a;

    if-nez p2, :cond_1

    const/4 v1, 0x1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/google/ads/a/a;->setOverlayActivated(Z)V

    invoke-virtual {p0, p3, p4, p5, p6}, Lcom/google/ads/a/w;->a(IIII)V

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->q:Lcom/google/ads/util/ae;

    invoke-virtual {v0}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_2

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->q:Lcom/google/ads/util/ae;

    invoke-virtual {v0}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/j;

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->a:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ads/a;

    invoke-interface {v0, v1}, Lcom/google/ads/j;->a(Lcom/google/ads/a;)V

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->q:Lcom/google/ads/util/ae;

    invoke-virtual {v0}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/j;

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->a:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ads/a;

    invoke-interface {v0, v1}, Lcom/google/ads/j;->b(Lcom/google/ads/a;)V

    goto :goto_1
.end method

.method public declared-synchronized a(Lcom/google/ads/d;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    const-string v0, "v6.4.1 RC00"

    invoke-static {v0}, Lcom/google/ads/util/g;->d(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/google/ads/a/w;->h:Z

    if-eqz v0, :cond_1

    const-string v0, "loadAd called after ad was destroyed."

    invoke-static {v0}, Lcom/google/ads/util/g;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {p0}, Lcom/google/ads/a/w;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "loadAd called while the ad is already loading, so aborting."

    invoke-static {v0}, Lcom/google/ads/util/g;->e(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_2
    :try_start_2
    invoke-static {}, Lcom/google/ads/AdActivity;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "loadAd called while an interstitial or landing page is displayed, so aborting"

    invoke-static {v0}, Lcom/google/ads/util/g;->e(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->f:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lcom/google/ads/util/AdUtil;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->f:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lcom/google/ads/util/AdUtil;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/ads/a/w;->o:Landroid/content/SharedPreferences;

    const-string v1, "GoogleAdMobDoritosLife"

    const-wide/32 v2, 0xea60

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->f:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0, v1, v2}, Lcom/google/ads/at;->a(Landroid/content/Context;J)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->c:Lcom/google/ads/util/af;

    invoke-virtual {v0}, Lcom/google/ads/util/af;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lcom/google/ads/at;->a(Landroid/app/Activity;)V

    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/ads/a/w;->k:Z

    iget-object v0, p0, Lcom/google/ads/a/w;->s:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    iget-object v0, p0, Lcom/google/ads/a/w;->t:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    iput-object p1, p0, Lcom/google/ads/a/w;->d:Lcom/google/ads/d;

    iget-object v0, p0, Lcom/google/ads/a/w;->x:Lcom/google/ads/bc;

    invoke-virtual {v0}, Lcom/google/ads/bc;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/ads/a/w;->y:Lcom/google/ads/bd;

    iget-object v1, p0, Lcom/google/ads/a/w;->x:Lcom/google/ads/bc;

    invoke-virtual {v1}, Lcom/google/ads/bc;->b()Lcom/google/ads/ba;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/google/ads/bd;->a(Lcom/google/ads/ba;Lcom/google/ads/d;)V

    goto/16 :goto_0

    :cond_5
    new-instance v0, Lcom/google/ads/bq;

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    invoke-direct {v0, v1}, Lcom/google/ads/bq;-><init>(Lcom/google/ads/bt;)V

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->m:Lcom/google/ads/util/ae;

    invoke-virtual {v1, v0}, Lcom/google/ads/util/ae;->a(Ljava/lang/Object;)V

    iget-object v0, v0, Lcom/google/ads/bq;->b:Lcom/google/ads/util/ae;

    invoke-virtual {v0}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/a/n;

    iput-object v0, p0, Lcom/google/ads/a/w;->c:Lcom/google/ads/a/n;

    iget-object v0, p0, Lcom/google/ads/a/w;->c:Lcom/google/ads/a/n;

    invoke-virtual {v0, p1}, Lcom/google/ads/a/n;->a(Lcom/google/ads/d;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0
.end method

.method public declared-synchronized a(Lcom/google/ads/e;)V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/google/ads/a/w;->c:Lcom/google/ads/a/n;

    sget-object v0, Lcom/google/ads/e;->c:Lcom/google/ads/e;

    if-ne p1, v0, :cond_0

    const/high16 v0, 0x42700000    # 60.0f

    invoke-virtual {p0, v0}, Lcom/google/ads/a/w;->a(F)V

    invoke-virtual {p0}, Lcom/google/ads/a/w;->r()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/ads/a/w;->g()V

    :cond_0
    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    invoke-virtual {v0}, Lcom/google/ads/bt;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/ads/e;->b:Lcom/google/ads/e;

    if-ne p1, v0, :cond_3

    iget-object v0, p0, Lcom/google/ads/a/w;->e:Lcom/google/ads/a/ab;

    invoke-virtual {v0}, Lcom/google/ads/a/ab;->B()V

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onFailedToReceiveAd("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/ads/util/g;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->o:Lcom/google/ads/util/ae;

    invoke-virtual {v0}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/c;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->a:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ads/a;

    invoke-interface {v0, v1, p1}, Lcom/google/ads/c;->a(Lcom/google/ads/a;Lcom/google/ads/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit p0

    return-void

    :cond_3
    :try_start_1
    sget-object v0, Lcom/google/ads/e;->c:Lcom/google/ads/e;

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lcom/google/ads/a/w;->e:Lcom/google/ads/a/ab;

    invoke-virtual {v0}, Lcom/google/ads/a/ab;->z()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 6

    iput-object p1, p0, Lcom/google/ads/a/w;->B:Ljava/lang/String;

    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    invoke-virtual {v0, p1}, Landroid/net/Uri$Builder;->encodedQuery(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0}, Lcom/google/ads/util/AdUtil;->b(Landroid/net/Uri;)Ljava/util/HashMap;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "\n"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/ads/a/w;->A:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/ads/a/w;->A:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/ads/a/w;->A:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public declared-synchronized a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->p:Lcom/google/ads/util/ae;

    invoke-virtual {v0}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/h;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->a:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ads/a;

    invoke-interface {v0, v1, p1, p2}, Lcom/google/ads/h;->a(Lcom/google/ads/a;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected declared-synchronized a(Ljava/util/LinkedList;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Adding a click tracking URL: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    :try_start_1
    iput-object p1, p0, Lcom/google/ads/a/w;->u:Ljava/util/LinkedList;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void
.end method

.method public declared-synchronized a(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput-boolean p1, p0, Lcom/google/ads/a/w;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/ads/a/w;->A:Ljava/lang/String;

    return-object v0
.end method

.method public declared-synchronized b(J)V
    .locals 2

    monitor-enter p0

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/ads/a/w;->o:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "GoogleAdMobDoritosLife"

    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Lcom/google/ads/ba;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "AdManager.onGWhirlNoFill() called."

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/ads/ba;->i()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/ads/ba;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/ads/a/w;->a(Ljava/util/List;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->o:Lcom/google/ads/util/ae;

    invoke-virtual {v0}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/c;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->a:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ads/a;

    sget-object v2, Lcom/google/ads/e;->b:Lcom/google/ads/e;

    invoke-interface {v0, v1, v2}, Lcom/google/ads/c;->a(Lcom/google/ads/a;Lcom/google/ads/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected declared-synchronized b(Ljava/lang/String;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Adding a tracking URL: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/a/w;->s:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public b(Z)V
    .locals 1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/ads/a/w;->w:Ljava/lang/Boolean;

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/ads/a/w;->B:Ljava/lang/String;

    return-object v0
.end method

.method protected declared-synchronized c(Ljava/lang/String;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Adding a manual tracking URL: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/ads/a/w;->A()Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/google/ads/a/w;->m:Z

    const-string v0, "Refreshing is no longer allowed on this AdView."

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized e()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/ads/a/w;->l:Z

    if-eqz v0, :cond_0

    const-string v0, "Disabling refreshing."

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/ads/br;->a()Lcom/google/ads/br;

    move-result-object v0

    iget-object v0, v0, Lcom/google/ads/br;->c:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/ads/a/w;->q:Lcom/google/ads/p;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/ads/a/w;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    const-string v0, "Refreshing is already disabled."

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized f()V
    .locals 4

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/google/ads/a/w;->n:Z

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    invoke-virtual {v0}, Lcom/google/ads/bt;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/google/ads/a/w;->m:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/google/ads/a/w;->l:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Enabling refreshing every "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/google/ads/a/w;->p:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " milliseconds."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/ads/br;->a()Lcom/google/ads/br;

    move-result-object v0

    iget-object v0, v0, Lcom/google/ads/br;->c:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/ads/a/w;->q:Lcom/google/ads/p;

    iget-wide v2, p0, Lcom/google/ads/a/w;->p:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/ads/a/w;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    const-string v0, "Refreshing is already enabled."

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    :try_start_2
    const-string v0, "Refreshing disabled on this AdView"

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string v0, "Tried to enable refreshing on something other than an AdView."

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public g()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/ads/a/w;->f()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/ads/a/w;->n:Z

    return-void
.end method

.method public h()Lcom/google/ads/bt;
    .locals 1

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    return-object v0
.end method

.method public declared-synchronized i()Lcom/google/ads/bc;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/ads/a/w;->x:Lcom/google/ads/bc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized j()Lcom/google/ads/a/n;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/ads/a/w;->c:Lcom/google/ads/a/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized k()Lcom/google/ads/a/e;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/ads/a/w;->f:Lcom/google/ads/a/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized l()Lcom/google/ads/a/ad;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/ads/a/w;->g:Lcom/google/ads/a/ad;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public m()Lcom/google/ads/a/ab;
    .locals 1

    iget-object v0, p0, Lcom/google/ads/a/w;->e:Lcom/google/ads/a/ab;

    return-object v0
.end method

.method public declared-synchronized n()I
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/google/ads/a/w;->v:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public o()J
    .locals 2

    iget-wide v0, p0, Lcom/google/ads/a/w;->i:J

    return-wide v0
.end method

.method public declared-synchronized p()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/ads/a/w;->c:Lcom/google/ads/a/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized q()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/ads/a/w;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized r()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/ads/a/w;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized s()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/ads/a/w;->e:Lcom/google/ads/a/ab;

    invoke-virtual {v0}, Lcom/google/ads/a/ab;->C()V

    const-string v0, "onDismissScreen()"

    invoke-static {v0}, Lcom/google/ads/util/g;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->o:Lcom/google/ads/util/ae;

    invoke-virtual {v0}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/c;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->a:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ads/a;

    invoke-interface {v0, v1}, Lcom/google/ads/c;->c(Lcom/google/ads/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized t()V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "onPresentScreen()"

    invoke-static {v0}, Lcom/google/ads/util/g;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->o:Lcom/google/ads/util/ae;

    invoke-virtual {v0}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/c;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->a:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ads/a;

    invoke-interface {v0, v1}, Lcom/google/ads/c;->b(Lcom/google/ads/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized u()V
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "onLeaveApplication()"

    invoke-static {v0}, Lcom/google/ads/util/g;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->o:Lcom/google/ads/util/ae;

    invoke-virtual {v0}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/c;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->a:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ads/a;

    invoke-interface {v0, v1}, Lcom/google/ads/c;->d(Lcom/google/ads/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public v()V
    .locals 1

    iget-object v0, p0, Lcom/google/ads/a/w;->e:Lcom/google/ads/a/ab;

    invoke-virtual {v0}, Lcom/google/ads/a/ab;->f()V

    invoke-virtual {p0}, Lcom/google/ads/a/w;->y()V

    return-void
.end method

.method public declared-synchronized w()V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->c:Lcom/google/ads/util/af;

    invoke-virtual {v0}, Lcom/google/ads/util/af;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-nez v0, :cond_1

    const-string v0, "activity was null while trying to ping tracking URLs."

    invoke-static {v0}, Lcom/google/ads/util/g;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/google/ads/a/w;->s:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v3, Ljava/lang/Thread;

    new-instance v4, Lcom/google/ads/o;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v1, v5}, Lcom/google/ads/o;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    invoke-direct {v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v3}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized x()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/ads/a/w;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/ads/a/w;->d:Lcom/google/ads/d;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    invoke-virtual {v0}, Lcom/google/ads/bt;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->j:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/AdView;

    invoke-virtual {v0}, Lcom/google/ads/AdView;->isShown()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/ads/util/AdUtil;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Refreshing ad."

    invoke-static {v0}, Lcom/google/ads/util/g;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/a/w;->d:Lcom/google/ads/d;

    invoke-virtual {p0, v0}, Lcom/google/ads/a/w;->a(Lcom/google/ads/d;)V

    :goto_1
    iget-boolean v0, p0, Lcom/google/ads/a/w;->n:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/ads/a/w;->e()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    :try_start_2
    const-string v0, "Not refreshing because the ad is not visible."

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-static {}, Lcom/google/ads/br;->a()Lcom/google/ads/br;

    move-result-object v0

    iget-object v0, v0, Lcom/google/ads/br;->c:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/ads/a/w;->q:Lcom/google/ads/p;

    iget-wide v2, p0, Lcom/google/ads/a/w;->p:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_3
    const-string v0, "Tried to refresh an ad that wasn\'t an AdView."

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    const-string v0, "Tried to refresh before calling loadAd()."

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method protected declared-synchronized y()V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->c:Lcom/google/ads/util/af;

    invoke-virtual {v0}, Lcom/google/ads/util/af;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-nez v0, :cond_1

    const-string v0, "activity was null while trying to ping click tracking URLs."

    invoke-static {v0}, Lcom/google/ads/util/g;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/google/ads/a/w;->u:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v3, Ljava/lang/Thread;

    new-instance v4, Lcom/google/ads/o;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v1, v5}, Lcom/google/ads/o;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    invoke-direct {v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v3}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected declared-synchronized z()V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/google/ads/a/w;->c:Lcom/google/ads/a/n;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/ads/a/w;->k:Z

    iget-object v0, p0, Lcom/google/ads/a/w;->f:Lcom/google/ads/a/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/ads/a/e;->setVisibility(I)V

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    invoke-virtual {v0}, Lcom/google/ads/bt;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/ads/a/w;->f:Lcom/google/ads/a/e;

    invoke-virtual {p0, v0}, Lcom/google/ads/a/w;->a(Landroid/view/View;)V

    :cond_0
    iget-object v0, p0, Lcom/google/ads/a/w;->e:Lcom/google/ads/a/ab;

    invoke-virtual {v0}, Lcom/google/ads/a/ab;->g()V

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    invoke-virtual {v0}, Lcom/google/ads/bt;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/ads/a/w;->w()V

    :cond_1
    const-string v0, "onReceiveAd()"

    invoke-static {v0}, Lcom/google/ads/util/g;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->o:Lcom/google/ads/util/ae;

    invoke-virtual {v0}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/c;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->a:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ads/a;

    invoke-interface {v0, v1}, Lcom/google/ads/c;->a(Lcom/google/ads/a;)V

    :cond_2
    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->l:Lcom/google/ads/util/ae;

    iget-object v1, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v1, v1, Lcom/google/ads/bt;->m:Lcom/google/ads/util/ae;

    invoke-virtual {v1}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/ads/util/ae;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/ads/a/w;->b:Lcom/google/ads/bt;

    iget-object v0, v0, Lcom/google/ads/bt;->m:Lcom/google/ads/util/ae;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/ads/util/ae;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
