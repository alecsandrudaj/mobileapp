.class public Lcom/google/ads/a/ah;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/gesture/GestureOverlayView$OnGesturePerformedListener;


# instance fields
.field private final a:Landroid/gesture/GestureStore;

.field private b:Landroid/app/Activity;

.field private c:Lcom/google/ads/a/w;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/google/ads/a/w;Landroid/gesture/GestureStore;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/ads/a/ah;->b:Landroid/app/Activity;

    iput-object p2, p0, Lcom/google/ads/a/ah;->c:Lcom/google/ads/a/w;

    iput-object p3, p0, Lcom/google/ads/a/ah;->a:Landroid/gesture/GestureStore;

    return-void
.end method

.method static synthetic a(Lcom/google/ads/a/ah;)Lcom/google/ads/a/w;
    .locals 1

    iget-object v0, p0, Lcom/google/ads/a/ah;->c:Lcom/google/ads/a/w;

    return-object v0
.end method

.method static synthetic b(Lcom/google/ads/a/ah;)Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/google/ads/a/ah;->b:Landroid/app/Activity;

    return-object v0
.end method


# virtual methods
.method public onGesturePerformed(Landroid/gesture/GestureOverlayView;Landroid/gesture/Gesture;)V
    .locals 7

    const/4 v6, 0x0

    iget-object v0, p0, Lcom/google/ads/a/ah;->a:Landroid/gesture/GestureStore;

    invoke-virtual {v0, p2}, Landroid/gesture/GestureStore;->recognize(Landroid/gesture/Gesture;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/gesture/Prediction;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Gesture: \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, v0, Landroid/gesture/Prediction;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\' = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-wide v4, v0, Landroid/gesture/Prediction;->score:D

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Gesture: No remotely reasonable predictions"

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V

    :cond_1
    :goto_1
    return-void

    :cond_2
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/gesture/Prediction;

    iget-wide v2, v0, Landroid/gesture/Prediction;->score:D

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    cmpl-double v0, v2, v4

    if-lez v0, :cond_1

    const-string v2, "debug"

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/gesture/Prediction;

    iget-object v0, v0, Landroid/gesture/Prediction;->name:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/ads/a/ah;->c:Lcom/google/ads/a/w;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/ads/a/ah;->c:Lcom/google/ads/a/w;

    invoke-virtual {v0}, Lcom/google/ads/a/w;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    const-string v0, "[No diagnostics available]"

    :goto_2
    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/google/ads/a/ah;->b:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const-string v2, "Ad Information"

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const-string v2, "Share"

    new-instance v3, Lcom/google/ads/a/ak;

    invoke-direct {v3, p0, v0}, Lcom/google/ads/a/ak;-><init>(Lcom/google/ads/a/ah;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "Report"

    new-instance v2, Lcom/google/ads/a/aj;

    invoke-direct {v2, p0}, Lcom/google/ads/a/aj;-><init>(Lcom/google/ads/a/ah;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "Close"

    new-instance v2, Lcom/google/ads/a/ai;

    invoke-direct {v2, p0}, Lcom/google/ads/a/ai;-><init>(Lcom/google/ads/a/ah;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/google/ads/a/ah;->c:Lcom/google/ads/a/w;

    invoke-virtual {v0}, Lcom/google/ads/a/w;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_2
.end method
