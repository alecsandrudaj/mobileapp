.class public final Lcom/google/ads/mediation/inmobi/InMobiAdapter;
.super Ljava/lang/Object;
.source "InMobiAdapter.java"

# interfaces
.implements Lcom/google/ads/mediation/MediationInterstitialAdapter;
.implements Lcom/google/ads/mediation/MediationBannerAdapter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/ads/mediation/inmobi/InMobiAdapter$BannerListener;,
        Lcom/google/ads/mediation/inmobi/InMobiAdapter$InterstitialListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/ads/mediation/MediationInterstitialAdapter",
        "<",
        "Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;",
        "Lcom/google/ads/mediation/inmobi/InMobiAdapterServerParameters;",
        ">;",
        "Lcom/google/ads/mediation/MediationBannerAdapter",
        "<",
        "Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;",
        "Lcom/google/ads/mediation/inmobi/InMobiAdapterServerParameters;",
        ">;"
    }
.end annotation


# static fields
.field private static synthetic $SWITCH_TABLE$com$google$ads$AdRequest$Gender:[I

.field private static final ADSIZE_INMOBI_AD_UNIT_120X600:Lcom/google/ads/AdSize;

.field private static final ADSIZE_INMOBI_AD_UNIT_300X250:Lcom/google/ads/AdSize;

.field private static final ADSIZE_INMOBI_AD_UNIT_320X48:Lcom/google/ads/AdSize;

.field private static final ADSIZE_INMOBI_AD_UNIT_320X50:Lcom/google/ads/AdSize;

.field private static final ADSIZE_INMOBI_AD_UNIT_468X60:Lcom/google/ads/AdSize;

.field private static final ADSIZE_INMOBI_AD_UNIT_728X90:Lcom/google/ads/AdSize;

.field private static disableHardwareFlag:Ljava/lang/Boolean;


# instance fields
.field private adInterstitial:Lcom/inmobi/androidsdk/IMAdInterstitial;

.field private adView:Lcom/inmobi/androidsdk/IMAdView;

.field private bannerListener:Lcom/google/ads/mediation/MediationBannerListener;

.field private interstitialListener:Lcom/google/ads/mediation/MediationInterstitialListener;

.field private isAdShown:Z

.field private shouldSendClickAndPresence:Z

.field private wrappedAdView:Landroid/widget/FrameLayout;


# direct methods
.method static synthetic $SWITCH_TABLE$com$google$ads$AdRequest$Gender()[I
    .locals 3

    .prologue
    .line 34
    sget-object v0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->$SWITCH_TABLE$com$google$ads$AdRequest$Gender:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/ads/AdRequest$Gender;->values()[Lcom/google/ads/AdRequest$Gender;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/google/ads/AdRequest$Gender;->FEMALE:Lcom/google/ads/AdRequest$Gender;

    invoke-virtual {v1}, Lcom/google/ads/AdRequest$Gender;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_2

    :goto_1
    :try_start_1
    sget-object v1, Lcom/google/ads/AdRequest$Gender;->MALE:Lcom/google/ads/AdRequest$Gender;

    invoke-virtual {v1}, Lcom/google/ads/AdRequest$Gender;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :goto_2
    :try_start_2
    sget-object v1, Lcom/google/ads/AdRequest$Gender;->UNKNOWN:Lcom/google/ads/AdRequest$Gender;

    invoke-virtual {v1}, Lcom/google/ads/AdRequest$Gender;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_0

    :goto_3
    sput-object v0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->$SWITCH_TABLE$com$google$ads$AdRequest$Gender:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_3

    :catch_1
    move-exception v1

    goto :goto_2

    :catch_2
    move-exception v1

    goto :goto_1
.end method

.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/16 v2, 0x140

    .line 40
    new-instance v0, Lcom/google/ads/AdSize;

    .line 41
    const/16 v1, 0x30

    .line 40
    invoke-direct {v0, v2, v1}, Lcom/google/ads/AdSize;-><init>(II)V

    sput-object v0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->ADSIZE_INMOBI_AD_UNIT_320X48:Lcom/google/ads/AdSize;

    .line 42
    new-instance v0, Lcom/google/ads/AdSize;

    .line 43
    const/16 v1, 0x32

    .line 42
    invoke-direct {v0, v2, v1}, Lcom/google/ads/AdSize;-><init>(II)V

    sput-object v0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->ADSIZE_INMOBI_AD_UNIT_320X50:Lcom/google/ads/AdSize;

    .line 44
    new-instance v0, Lcom/google/ads/AdSize;

    const/16 v1, 0x1d4

    .line 45
    const/16 v2, 0x3c

    .line 44
    invoke-direct {v0, v1, v2}, Lcom/google/ads/AdSize;-><init>(II)V

    sput-object v0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->ADSIZE_INMOBI_AD_UNIT_468X60:Lcom/google/ads/AdSize;

    .line 46
    new-instance v0, Lcom/google/ads/AdSize;

    const/16 v1, 0x2d8

    .line 47
    const/16 v2, 0x5a

    .line 46
    invoke-direct {v0, v1, v2}, Lcom/google/ads/AdSize;-><init>(II)V

    sput-object v0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->ADSIZE_INMOBI_AD_UNIT_728X90:Lcom/google/ads/AdSize;

    .line 48
    new-instance v0, Lcom/google/ads/AdSize;

    const/16 v1, 0x12c

    .line 49
    const/16 v2, 0xfa

    .line 48
    invoke-direct {v0, v1, v2}, Lcom/google/ads/AdSize;-><init>(II)V

    sput-object v0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->ADSIZE_INMOBI_AD_UNIT_300X250:Lcom/google/ads/AdSize;

    .line 50
    new-instance v0, Lcom/google/ads/AdSize;

    const/16 v1, 0x78

    .line 51
    const/16 v2, 0x258

    .line 50
    invoke-direct {v0, v1, v2}, Lcom/google/ads/AdSize;-><init>(II)V

    sput-object v0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->ADSIZE_INMOBI_AD_UNIT_120X600:Lcom/google/ads/AdSize;

    .line 62
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->disableHardwareFlag:Ljava/lang/Boolean;

    .line 34
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$2(Lcom/google/ads/mediation/inmobi/InMobiAdapter;Z)V
    .locals 0

    .prologue
    .line 60
    iput-boolean p1, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->shouldSendClickAndPresence:Z

    return-void
.end method

.method static synthetic access$3(Lcom/google/ads/mediation/inmobi/InMobiAdapter;)Lcom/google/ads/mediation/MediationBannerListener;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->bannerListener:Lcom/google/ads/mediation/MediationBannerListener;

    return-object v0
.end method

.method static synthetic access$4(Lcom/google/ads/mediation/inmobi/InMobiAdapter;Z)V
    .locals 0

    .prologue
    .line 61
    iput-boolean p1, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->isAdShown:Z

    return-void
.end method

.method static synthetic access$5(Lcom/google/ads/mediation/inmobi/InMobiAdapter;)Z
    .locals 1

    .prologue
    .line 60
    iget-boolean v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->shouldSendClickAndPresence:Z

    return v0
.end method

.method static synthetic access$6(Lcom/google/ads/mediation/inmobi/InMobiAdapter;)Z
    .locals 1

    .prologue
    .line 61
    iget-boolean v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->isAdShown:Z

    return v0
.end method

.method static synthetic access$7(Lcom/google/ads/mediation/inmobi/InMobiAdapter;)Lcom/google/ads/mediation/MediationInterstitialListener;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->interstitialListener:Lcom/google/ads/mediation/MediationInterstitialListener;

    return-object v0
.end method

.method private buildAdRequest(Lcom/google/ads/mediation/inmobi/InMobiAdapterServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;)Lcom/inmobi/androidsdk/IMAdRequest;
    .locals 5
    .param p1, "serverParameters"    # Lcom/google/ads/mediation/inmobi/InMobiAdapterServerParameters;
    .param p2, "mediationAdRequest"    # Lcom/google/ads/mediation/MediationAdRequest;
    .param p3, "extras"    # Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;

    .prologue
    .line 72
    if-nez p3, :cond_0

    .line 73
    new-instance p3, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;

    .end local p3    # "extras":Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    invoke-direct {p3}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;-><init>()V

    .line 76
    .restart local p3    # "extras":Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    :cond_0
    new-instance v0, Lcom/inmobi/androidsdk/IMAdRequest;

    invoke-direct {v0}, Lcom/inmobi/androidsdk/IMAdRequest;-><init>()V

    .line 79
    .local v0, "adRequest":Lcom/inmobi/androidsdk/IMAdRequest;
    invoke-virtual {p2}, Lcom/google/ads/mediation/MediationAdRequest;->getAgeInYears()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 80
    invoke-virtual {p2}, Lcom/google/ads/mediation/MediationAdRequest;->getAgeInYears()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/inmobi/androidsdk/IMAdRequest;->setAge(I)V

    .line 84
    :cond_1
    invoke-virtual {p3}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->getAreaCode()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 85
    invoke-virtual {p3}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->getAreaCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/inmobi/androidsdk/IMAdRequest;->setAreaCode(Ljava/lang/String;)V

    .line 89
    :cond_2
    invoke-virtual {p2}, Lcom/google/ads/mediation/MediationAdRequest;->getLocation()Landroid/location/Location;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 90
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/inmobi/androidsdk/IMAdRequest;->setLocationInquiryAllowed(Z)V

    .line 91
    invoke-virtual {p2}, Lcom/google/ads/mediation/MediationAdRequest;->getLocation()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/inmobi/androidsdk/IMAdRequest;->setCurrentLocation(Landroid/location/Location;)V

    .line 95
    :cond_3
    invoke-virtual {p2}, Lcom/google/ads/mediation/MediationAdRequest;->getBirthday()Ljava/util/Date;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 96
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 97
    .local v1, "dob":Ljava/util/Calendar;
    invoke-virtual {p2}, Lcom/google/ads/mediation/MediationAdRequest;->getBirthday()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 98
    invoke-virtual {v0, v1}, Lcom/inmobi/androidsdk/IMAdRequest;->setDateOfBirth(Ljava/util/Calendar;)V

    .line 102
    .end local v1    # "dob":Ljava/util/Calendar;
    :cond_4
    invoke-virtual {p3}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->getEducation()Lcom/inmobi/androidsdk/IMAdRequest$EducationType;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 103
    invoke-virtual {p3}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->getEducation()Lcom/inmobi/androidsdk/IMAdRequest$EducationType;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/inmobi/androidsdk/IMAdRequest;->setEducation(Lcom/inmobi/androidsdk/IMAdRequest$EducationType;)V

    .line 107
    :cond_5
    invoke-virtual {p3}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->getEthnicity()Lcom/inmobi/androidsdk/IMAdRequest$EthnicityType;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 108
    invoke-virtual {p3}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->getEthnicity()Lcom/inmobi/androidsdk/IMAdRequest$EthnicityType;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/inmobi/androidsdk/IMAdRequest;->setEthnicity(Lcom/inmobi/androidsdk/IMAdRequest$EthnicityType;)V

    .line 112
    :cond_6
    invoke-virtual {p2}, Lcom/google/ads/mediation/MediationAdRequest;->getGender()Lcom/google/ads/AdRequest$Gender;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 113
    invoke-static {}, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->$SWITCH_TABLE$com$google$ads$AdRequest$Gender()[I

    move-result-object v3

    invoke-virtual {p2}, Lcom/google/ads/mediation/MediationAdRequest;->getGender()Lcom/google/ads/AdRequest$Gender;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/ads/AdRequest$Gender;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    .line 125
    :cond_7
    :goto_0
    invoke-virtual {p3}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->getIncome()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_8

    .line 126
    invoke-virtual {p3}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->getIncome()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/inmobi/androidsdk/IMAdRequest;->setIncome(I)V

    .line 130
    :cond_8
    invoke-virtual {p3}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->getInterests()Ljava/util/Set;

    move-result-object v3

    if-eqz v3, :cond_9

    .line 131
    const-string v3, ", "

    invoke-virtual {p3}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->getInterests()Ljava/util/Set;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/inmobi/androidsdk/IMAdRequest;->setInterests(Ljava/lang/String;)V

    .line 135
    :cond_9
    invoke-virtual {p2}, Lcom/google/ads/mediation/MediationAdRequest;->getKeywords()Ljava/util/Set;

    move-result-object v3

    if-eqz v3, :cond_a

    .line 136
    const-string v3, ", "

    .line 137
    invoke-virtual {p2}, Lcom/google/ads/mediation/MediationAdRequest;->getKeywords()Ljava/util/Set;

    move-result-object v4

    .line 136
    invoke-static {v3, v4}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/inmobi/androidsdk/IMAdRequest;->setKeywords(Ljava/lang/String;)V

    .line 141
    :cond_a
    invoke-virtual {p3}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->getPostalCode()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b

    .line 142
    invoke-virtual {p3}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->getPostalCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/inmobi/androidsdk/IMAdRequest;->setPostalCode(Ljava/lang/String;)V

    .line 146
    :cond_b
    invoke-virtual {p3}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->getSearchString()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_c

    .line 147
    invoke-virtual {p3}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->getSearchString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/inmobi/androidsdk/IMAdRequest;->setSearchString(Ljava/lang/String;)V

    .line 151
    :cond_c
    invoke-virtual {p3}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->getDeviceIdMask()I

    move-result v3

    invoke-static {v3}, Lcom/inmobi/commons/IMCommonUtil;->setDeviceIDMask(I)V

    .line 153
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 154
    .local v2, "paramMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v3, "tp"

    const-string v4, "c_gwhirl"

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    invoke-virtual {v0, v2}, Lcom/inmobi/androidsdk/IMAdRequest;->setRequestParams(Ljava/util/Map;)V

    .line 156
    return-object v0

    .line 115
    .end local v2    # "paramMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    :pswitch_0
    sget-object v3, Lcom/inmobi/androidsdk/IMAdRequest$GenderType;->MALE:Lcom/inmobi/androidsdk/IMAdRequest$GenderType;

    invoke-virtual {v0, v3}, Lcom/inmobi/androidsdk/IMAdRequest;->setGender(Lcom/inmobi/androidsdk/IMAdRequest$GenderType;)V

    goto :goto_0

    .line 119
    :pswitch_1
    sget-object v3, Lcom/inmobi/androidsdk/IMAdRequest$GenderType;->FEMALE:Lcom/inmobi/androidsdk/IMAdRequest$GenderType;

    invoke-virtual {v0, v3}, Lcom/inmobi/androidsdk/IMAdRequest;->setGender(Lcom/inmobi/androidsdk/IMAdRequest$GenderType;)V

    goto :goto_0

    .line 113
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static disableHardwareAcceleration()V
    .locals 1

    .prologue
    .line 461
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->disableHardwareFlag:Ljava/lang/Boolean;

    .line 462
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 0

    .prologue
    .line 274
    return-void
.end method

.method public getAdditionalParametersType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<",
            "Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;",
            ">;"
        }
    .end annotation

    .prologue
    .line 171
    const-class v0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;

    return-object v0
.end method

.method public getBannerView()Landroid/view/View;
    .locals 1

    .prologue
    .line 278
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->wrappedAdView:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public getServerParametersType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<",
            "Lcom/google/ads/mediation/inmobi/InMobiAdapterServerParameters;",
            ">;"
        }
    .end annotation

    .prologue
    .line 176
    const-class v0, Lcom/google/ads/mediation/inmobi/InMobiAdapterServerParameters;

    return-object v0
.end method

.method public bridge synthetic requestBannerAd(Lcom/google/ads/mediation/MediationBannerListener;Landroid/app/Activity;Lcom/google/ads/mediation/MediationServerParameters;Lcom/google/ads/AdSize;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/NetworkExtras;)V
    .locals 7

    .prologue
    .line 1
    move-object v3, p3

    check-cast v3, Lcom/google/ads/mediation/inmobi/InMobiAdapterServerParameters;

    move-object v6, p6

    check-cast v6, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v6}, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->requestBannerAd(Lcom/google/ads/mediation/MediationBannerListener;Landroid/app/Activity;Lcom/google/ads/mediation/inmobi/InMobiAdapterServerParameters;Lcom/google/ads/AdSize;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;)V

    return-void
.end method

.method public requestBannerAd(Lcom/google/ads/mediation/MediationBannerListener;Landroid/app/Activity;Lcom/google/ads/mediation/inmobi/InMobiAdapterServerParameters;Lcom/google/ads/AdSize;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;)V
    .locals 6
    .param p1, "listener"    # Lcom/google/ads/mediation/MediationBannerListener;
    .param p2, "activity"    # Landroid/app/Activity;
    .param p3, "serverParameters"    # Lcom/google/ads/mediation/inmobi/InMobiAdapterServerParameters;
    .param p4, "mediationAdSize"    # Lcom/google/ads/AdSize;
    .param p5, "mediationAdRequest"    # Lcom/google/ads/mediation/MediationAdRequest;
    .param p6, "extras"    # Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;

    .prologue
    .line 189
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v4, 0x7

    if-ge v3, v4, :cond_0

    .line 190
    sget-object v3, Lcom/google/ads/AdRequest$ErrorCode;->INVALID_REQUEST:Lcom/google/ads/AdRequest$ErrorCode;

    invoke-interface {p1, p0, v3}, Lcom/google/ads/mediation/MediationBannerListener;->onFailedToReceiveAd(Lcom/google/ads/mediation/MediationBannerAdapter;Lcom/google/ads/AdRequest$ErrorCode;)V

    .line 244
    :goto_0
    return-void

    .line 193
    :cond_0
    iput-object p1, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->bannerListener:Lcom/google/ads/mediation/MediationBannerListener;

    .line 196
    const/4 v3, 0x6

    new-array v3, v3, [Lcom/google/ads/AdSize;

    const/4 v4, 0x0

    .line 197
    sget-object v5, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->ADSIZE_INMOBI_AD_UNIT_320X48:Lcom/google/ads/AdSize;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    sget-object v5, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->ADSIZE_INMOBI_AD_UNIT_320X50:Lcom/google/ads/AdSize;

    aput-object v5, v3, v4

    const/4 v4, 0x2

    .line 198
    sget-object v5, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->ADSIZE_INMOBI_AD_UNIT_468X60:Lcom/google/ads/AdSize;

    aput-object v5, v3, v4

    const/4 v4, 0x3

    sget-object v5, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->ADSIZE_INMOBI_AD_UNIT_728X90:Lcom/google/ads/AdSize;

    aput-object v5, v3, v4

    const/4 v4, 0x4

    .line 199
    sget-object v5, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->ADSIZE_INMOBI_AD_UNIT_300X250:Lcom/google/ads/AdSize;

    aput-object v5, v3, v4

    const/4 v4, 0x5

    sget-object v5, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->ADSIZE_INMOBI_AD_UNIT_120X600:Lcom/google/ads/AdSize;

    aput-object v5, v3, v4

    .line 196
    invoke-virtual {p4, v3}, Lcom/google/ads/AdSize;->findBestSize([Lcom/google/ads/AdSize;)Lcom/google/ads/AdSize;

    move-result-object v1

    .line 201
    .local v1, "bestFitSize":Lcom/google/ads/AdSize;
    sget-object v3, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->ADSIZE_INMOBI_AD_UNIT_320X48:Lcom/google/ads/AdSize;

    if-ne v1, v3, :cond_2

    .line 202
    const/16 v0, 0x9

    .line 217
    .local v0, "adSize":I
    :goto_1
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 218
    invoke-virtual {v1, p2}, Lcom/google/ads/AdSize;->getWidthInPixels(Landroid/content/Context;)I

    move-result v3

    .line 219
    invoke-virtual {v1, p2}, Lcom/google/ads/AdSize;->getHeightInPixels(Landroid/content/Context;)I

    move-result v4

    .line 217
    invoke-direct {v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 221
    .local v2, "wrappedLayoutParams":Landroid/widget/FrameLayout$LayoutParams;
    new-instance v3, Lcom/inmobi/androidsdk/IMAdView;

    iget-object v4, p3, Lcom/google/ads/mediation/inmobi/InMobiAdapterServerParameters;->appId:Ljava/lang/String;

    invoke-direct {v3, p2, v0, v4}, Lcom/inmobi/androidsdk/IMAdView;-><init>(Landroid/app/Activity;ILjava/lang/String;)V

    iput-object v3, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->adView:Lcom/inmobi/androidsdk/IMAdView;

    .line 224
    iget-object v3, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->adView:Lcom/inmobi/androidsdk/IMAdView;

    const/4 v4, -0x1

    invoke-virtual {v3, v4}, Lcom/inmobi/androidsdk/IMAdView;->setRefreshInterval(I)V

    .line 226
    iget-object v3, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->adView:Lcom/inmobi/androidsdk/IMAdView;

    sget-object v4, Lcom/inmobi/androidsdk/IMAdView$AnimationType;->ANIMATION_OFF:Lcom/inmobi/androidsdk/IMAdView$AnimationType;

    invoke-virtual {v3, v4}, Lcom/inmobi/androidsdk/IMAdView;->setAnimationType(Lcom/inmobi/androidsdk/IMAdView$AnimationType;)V

    .line 227
    iget-object v3, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->adView:Lcom/inmobi/androidsdk/IMAdView;

    new-instance v4, Lcom/google/ads/mediation/inmobi/InMobiAdapter$BannerListener;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lcom/google/ads/mediation/inmobi/InMobiAdapter$BannerListener;-><init>(Lcom/google/ads/mediation/inmobi/InMobiAdapter;Lcom/google/ads/mediation/inmobi/InMobiAdapter$BannerListener;)V

    invoke-virtual {v3, v4}, Lcom/inmobi/androidsdk/IMAdView;->setIMAdListener(Lcom/inmobi/androidsdk/IMAdListener;)V

    .line 228
    sget-object v3, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->disableHardwareFlag:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 229
    iget-object v3, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->adView:Lcom/inmobi/androidsdk/IMAdView;

    invoke-virtual {v3}, Lcom/inmobi/androidsdk/IMAdView;->disableHardwareAcceleration()V

    .line 238
    :cond_1
    new-instance v3, Landroid/widget/FrameLayout;

    invoke-direct {v3, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->wrappedAdView:Landroid/widget/FrameLayout;

    .line 239
    iget-object v3, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->wrappedAdView:Landroid/widget/FrameLayout;

    invoke-virtual {v3, v2}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 240
    iget-object v3, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->wrappedAdView:Landroid/widget/FrameLayout;

    iget-object v4, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->adView:Lcom/inmobi/androidsdk/IMAdView;

    invoke-virtual {v3, v4}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 241
    iget-object v3, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->adView:Lcom/inmobi/androidsdk/IMAdView;

    invoke-direct {p0, p3, p5, p6}, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->buildAdRequest(Lcom/google/ads/mediation/inmobi/InMobiAdapterServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;)Lcom/inmobi/androidsdk/IMAdRequest;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/inmobi/androidsdk/IMAdView;->loadNewAd(Lcom/inmobi/androidsdk/IMAdRequest;)V

    goto/16 :goto_0

    .line 203
    .end local v0    # "adSize":I
    .end local v2    # "wrappedLayoutParams":Landroid/widget/FrameLayout$LayoutParams;
    :cond_2
    sget-object v3, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->ADSIZE_INMOBI_AD_UNIT_320X50:Lcom/google/ads/AdSize;

    if-ne v1, v3, :cond_3

    .line 204
    const/16 v0, 0xf

    .restart local v0    # "adSize":I
    goto :goto_1

    .line 205
    .end local v0    # "adSize":I
    :cond_3
    sget-object v3, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->ADSIZE_INMOBI_AD_UNIT_468X60:Lcom/google/ads/AdSize;

    if-ne v1, v3, :cond_4

    .line 206
    const/16 v0, 0xc

    .restart local v0    # "adSize":I
    goto :goto_1

    .line 207
    .end local v0    # "adSize":I
    :cond_4
    sget-object v3, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->ADSIZE_INMOBI_AD_UNIT_728X90:Lcom/google/ads/AdSize;

    if-ne v1, v3, :cond_5

    .line 208
    const/16 v0, 0xb

    .restart local v0    # "adSize":I
    goto :goto_1

    .line 209
    .end local v0    # "adSize":I
    :cond_5
    sget-object v3, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->ADSIZE_INMOBI_AD_UNIT_300X250:Lcom/google/ads/AdSize;

    if-ne v1, v3, :cond_6

    .line 210
    const/16 v0, 0xa

    .restart local v0    # "adSize":I
    goto :goto_1

    .line 211
    .end local v0    # "adSize":I
    :cond_6
    sget-object v3, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->ADSIZE_INMOBI_AD_UNIT_120X600:Lcom/google/ads/AdSize;

    if-ne v1, v3, :cond_7

    .line 212
    const/16 v0, 0xd

    .restart local v0    # "adSize":I
    goto :goto_1

    .line 214
    .end local v0    # "adSize":I
    :cond_7
    sget-object v3, Lcom/google/ads/AdRequest$ErrorCode;->INVALID_REQUEST:Lcom/google/ads/AdRequest$ErrorCode;

    invoke-interface {p1, p0, v3}, Lcom/google/ads/mediation/MediationBannerListener;->onFailedToReceiveAd(Lcom/google/ads/mediation/MediationBannerAdapter;Lcom/google/ads/AdRequest$ErrorCode;)V

    goto/16 :goto_0
.end method

.method public bridge synthetic requestInterstitialAd(Lcom/google/ads/mediation/MediationInterstitialListener;Landroid/app/Activity;Lcom/google/ads/mediation/MediationServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/NetworkExtras;)V
    .locals 6

    .prologue
    .line 1
    move-object v3, p3

    check-cast v3, Lcom/google/ads/mediation/inmobi/InMobiAdapterServerParameters;

    move-object v5, p5

    check-cast v5, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->requestInterstitialAd(Lcom/google/ads/mediation/MediationInterstitialListener;Landroid/app/Activity;Lcom/google/ads/mediation/inmobi/InMobiAdapterServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;)V

    return-void
.end method

.method public requestInterstitialAd(Lcom/google/ads/mediation/MediationInterstitialListener;Landroid/app/Activity;Lcom/google/ads/mediation/inmobi/InMobiAdapterServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;)V
    .locals 3
    .param p1, "listener"    # Lcom/google/ads/mediation/MediationInterstitialListener;
    .param p2, "activity"    # Landroid/app/Activity;
    .param p3, "serverParameters"    # Lcom/google/ads/mediation/inmobi/InMobiAdapterServerParameters;
    .param p4, "mediationAdRequest"    # Lcom/google/ads/mediation/MediationAdRequest;
    .param p5, "extras"    # Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;

    .prologue
    .line 251
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x7

    if-ge v0, v1, :cond_0

    .line 252
    sget-object v0, Lcom/google/ads/AdRequest$ErrorCode;->INVALID_REQUEST:Lcom/google/ads/AdRequest$ErrorCode;

    invoke-interface {p1, p0, v0}, Lcom/google/ads/mediation/MediationInterstitialListener;->onFailedToReceiveAd(Lcom/google/ads/mediation/MediationInterstitialAdapter;Lcom/google/ads/AdRequest$ErrorCode;)V

    .line 265
    :goto_0
    return-void

    .line 255
    :cond_0
    iput-object p1, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->interstitialListener:Lcom/google/ads/mediation/MediationInterstitialListener;

    .line 257
    new-instance v0, Lcom/inmobi/androidsdk/IMAdInterstitial;

    iget-object v1, p3, Lcom/google/ads/mediation/inmobi/InMobiAdapterServerParameters;->appId:Ljava/lang/String;

    invoke-direct {v0, p2, v1}, Lcom/inmobi/androidsdk/IMAdInterstitial;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->adInterstitial:Lcom/inmobi/androidsdk/IMAdInterstitial;

    .line 259
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->adInterstitial:Lcom/inmobi/androidsdk/IMAdInterstitial;

    new-instance v1, Lcom/google/ads/mediation/inmobi/InMobiAdapter$InterstitialListener;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/google/ads/mediation/inmobi/InMobiAdapter$InterstitialListener;-><init>(Lcom/google/ads/mediation/inmobi/InMobiAdapter;Lcom/google/ads/mediation/inmobi/InMobiAdapter$InterstitialListener;)V

    invoke-virtual {v0, v1}, Lcom/inmobi/androidsdk/IMAdInterstitial;->setIMAdInterstitialListener(Lcom/inmobi/androidsdk/IMAdInterstitialListener;)V

    .line 260
    sget-object v0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->disableHardwareFlag:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 261
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->adInterstitial:Lcom/inmobi/androidsdk/IMAdInterstitial;

    invoke-virtual {v0}, Lcom/inmobi/androidsdk/IMAdInterstitial;->disableHardwareAcceleration()V

    .line 263
    :cond_1
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->adInterstitial:Lcom/inmobi/androidsdk/IMAdInterstitial;

    invoke-direct {p0, p3, p4, p5}, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->buildAdRequest(Lcom/google/ads/mediation/inmobi/InMobiAdapterServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;)Lcom/inmobi/androidsdk/IMAdRequest;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/inmobi/androidsdk/IMAdInterstitial;->loadNewAd(Lcom/inmobi/androidsdk/IMAdRequest;)V

    goto :goto_0
.end method

.method public showInterstitial()V
    .locals 1

    .prologue
    .line 269
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapter;->adInterstitial:Lcom/inmobi/androidsdk/IMAdInterstitial;

    invoke-virtual {v0}, Lcom/inmobi/androidsdk/IMAdInterstitial;->show()V

    .line 270
    return-void
.end method
