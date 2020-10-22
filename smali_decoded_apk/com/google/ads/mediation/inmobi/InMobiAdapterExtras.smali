.class public final Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
.super Ljava/lang/Object;
.source "InMobiAdapterExtras.java"

# interfaces
.implements Lcom/google/ads/mediation/NetworkExtras;


# instance fields
.field private areaCode:Ljava/lang/String;

.field private education:Lcom/inmobi/androidsdk/IMAdRequest$EducationType;

.field private ethnicity:Lcom/inmobi/androidsdk/IMAdRequest$EthnicityType;

.field private idtypeParams:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/inmobi/androidsdk/IMAdRequest$IMIDType;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private income:Ljava/lang/Integer;

.field private interests:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private isLocationInquiryAllowed:Z

.field private keywords:Ljava/lang/String;

.field private postalCode:Ljava/lang/String;

.field private requestParams:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private searchString:Ljava/lang/String;

.field private uidMapFlag:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->areaCode:Ljava/lang/String;

    .line 63
    iput-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->education:Lcom/inmobi/androidsdk/IMAdRequest$EducationType;

    .line 89
    iput-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->ethnicity:Lcom/inmobi/androidsdk/IMAdRequest$EthnicityType;

    .line 115
    iput-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->income:Ljava/lang/Integer;

    .line 141
    iput-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->interests:Ljava/util/Set;

    .line 188
    iput-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->postalCode:Ljava/lang/String;

    .line 214
    iput-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->searchString:Ljava/lang/String;

    .line 240
    iput-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->keywords:Ljava/lang/String;

    .line 291
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->isLocationInquiryAllowed:Z

    .line 325
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->idtypeParams:Ljava/util/Map;

    .line 22
    return-void
.end method


# virtual methods
.method public addIDType(Lcom/inmobi/androidsdk/IMAdRequest$IMIDType;Ljava/lang/String;)V
    .locals 1
    .param p1, "idtype"    # Lcom/inmobi/androidsdk/IMAdRequest$IMIDType;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 329
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->idtypeParams:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 330
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->idtypeParams:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    :cond_0
    return-void
.end method

.method public addInterests(Ljava/lang/String;)V
    .locals 1
    .param p1, "interest"    # Ljava/lang/String;

    .prologue
    .line 181
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->interests:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 183
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->interests:Ljava/util/Set;

    .line 185
    :cond_0
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->interests:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 186
    return-void
.end method

.method public clearAreaCode()Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->setAreaCode(Ljava/lang/String;)Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;

    move-result-object v0

    return-object v0
.end method

.method public clearDeviceIdMask()Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 1

    .prologue
    .line 319
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->setDeviceIDMask(I)V

    .line 320
    return-object p0
.end method

.method public clearEducation()Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 1

    .prologue
    .line 77
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->setEducation(Lcom/inmobi/androidsdk/IMAdRequest$EducationType;)Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;

    move-result-object v0

    return-object v0
.end method

.method public clearEthnicity()Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 1

    .prologue
    .line 103
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->setEthnicity(Lcom/inmobi/androidsdk/IMAdRequest$EthnicityType;)Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;

    move-result-object v0

    return-object v0
.end method

.method public clearIncome()Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 1

    .prologue
    .line 129
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->setIncome(Ljava/lang/Integer;)Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;

    move-result-object v0

    return-object v0
.end method

.method public clearInterests()Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 1

    .prologue
    .line 161
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->setInterests(Ljava/util/Collection;)Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;

    move-result-object v0

    return-object v0
.end method

.method public clearKeywords()Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 1

    .prologue
    .line 254
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->setKeywords(Ljava/lang/String;)Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;

    move-result-object v0

    return-object v0
.end method

.method public clearLocationInquiryAllowed()Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 1

    .prologue
    .line 303
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->setLocationInquiryAllowed(Z)V

    .line 304
    return-object p0
.end method

.method public clearPostalCode()Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 1

    .prologue
    .line 202
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->setPostalCode(Ljava/lang/String;)Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;

    move-result-object v0

    return-object v0
.end method

.method public clearRequestParams()Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 1

    .prologue
    .line 279
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->setRequestParams(Ljava/util/Map;)Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;

    move-result-object v0

    return-object v0
.end method

.method public clearSearchString()Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->setSearchString(Ljava/lang/String;)Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;

    move-result-object v0

    return-object v0
.end method

.method public getAreaCode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->areaCode:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceIdMask()I
    .locals 1

    .prologue
    .line 315
    iget v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->uidMapFlag:I

    return v0
.end method

.method public getEducation()Lcom/inmobi/androidsdk/IMAdRequest$EducationType;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->education:Lcom/inmobi/androidsdk/IMAdRequest$EducationType;

    return-object v0
.end method

.method public getEthnicity()Lcom/inmobi/androidsdk/IMAdRequest$EthnicityType;
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->ethnicity:Lcom/inmobi/androidsdk/IMAdRequest$EthnicityType;

    return-object v0
.end method

.method public getIDType(Lcom/inmobi/androidsdk/IMAdRequest$IMIDType;)Ljava/lang/String;
    .locals 1
    .param p1, "idtype"    # Lcom/inmobi/androidsdk/IMAdRequest$IMIDType;

    .prologue
    .line 342
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->idtypeParams:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 343
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->idtypeParams:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 345
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getIncome()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->income:Ljava/lang/Integer;

    return-object v0
.end method

.method public getInterests()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 168
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->interests:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 169
    const/4 v0, 0x0

    .line 172
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->interests:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    goto :goto_0
.end method

.method public getKeywords()Ljava/lang/String;
    .locals 1

    .prologue
    .line 261
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->keywords:Ljava/lang/String;

    return-object v0
.end method

.method public getPostalCode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 209
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->postalCode:Ljava/lang/String;

    return-object v0
.end method

.method public getRequestParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 286
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->requestParams:Ljava/util/Map;

    return-object v0
.end method

.method public getSearchString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 235
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->searchString:Ljava/lang/String;

    return-object v0
.end method

.method public isLocationInquiryAllowed()Z
    .locals 1

    .prologue
    .line 295
    iget-boolean v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->isLocationInquiryAllowed:Z

    return v0
.end method

.method public removeIDType(Lcom/inmobi/androidsdk/IMAdRequest$IMIDType;)V
    .locals 1
    .param p1, "idtype"    # Lcom/inmobi/androidsdk/IMAdRequest$IMIDType;

    .prologue
    .line 357
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->idtypeParams:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 358
    iget-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->idtypeParams:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    :cond_0
    return-void
.end method

.method public setAreaCode(Ljava/lang/String;)Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 0
    .param p1, "areaCode"    # Ljava/lang/String;

    .prologue
    .line 42
    iput-object p1, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->areaCode:Ljava/lang/String;

    .line 43
    return-object p0
.end method

.method public setDeviceIDMask(I)V
    .locals 0
    .param p1, "mask"    # I

    .prologue
    .line 310
    iput p1, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->uidMapFlag:I

    .line 312
    return-void
.end method

.method public setEducation(Lcom/inmobi/androidsdk/IMAdRequest$EducationType;)Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 0
    .param p1, "education"    # Lcom/inmobi/androidsdk/IMAdRequest$EducationType;

    .prologue
    .line 69
    iput-object p1, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->education:Lcom/inmobi/androidsdk/IMAdRequest$EducationType;

    .line 70
    return-object p0
.end method

.method public setEthnicity(Lcom/inmobi/androidsdk/IMAdRequest$EthnicityType;)Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 0
    .param p1, "ethnicity"    # Lcom/inmobi/androidsdk/IMAdRequest$EthnicityType;

    .prologue
    .line 95
    iput-object p1, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->ethnicity:Lcom/inmobi/androidsdk/IMAdRequest$EthnicityType;

    .line 96
    return-object p0
.end method

.method public setIncome(Ljava/lang/Integer;)Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 0
    .param p1, "income"    # Ljava/lang/Integer;

    .prologue
    .line 121
    iput-object p1, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->income:Ljava/lang/Integer;

    .line 122
    return-object p0
.end method

.method public setInterests(Ljava/util/Collection;)Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;"
        }
    .end annotation

    .prologue
    .line 147
    .local p1, "interests":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    if-nez p1, :cond_0

    .line 148
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->interests:Ljava/util/Set;

    .line 153
    :goto_0
    return-object p0

    .line 150
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->interests:Ljava/util/Set;

    goto :goto_0
.end method

.method public setKeywords(Ljava/lang/String;)Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 0
    .param p1, "keyword"    # Ljava/lang/String;

    .prologue
    .line 246
    iput-object p1, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->keywords:Ljava/lang/String;

    .line 247
    return-object p0
.end method

.method public setLocationInquiryAllowed(Z)V
    .locals 0
    .param p1, "isLocationInquiryAllowed"    # Z

    .prologue
    .line 299
    iput-boolean p1, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->isLocationInquiryAllowed:Z

    .line 300
    return-void
.end method

.method public setPostalCode(Ljava/lang/String;)Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 0
    .param p1, "postalCode"    # Ljava/lang/String;

    .prologue
    .line 194
    iput-object p1, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->postalCode:Ljava/lang/String;

    .line 195
    return-object p0
.end method

.method public setRequestParams(Ljava/util/Map;)Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;"
        }
    .end annotation

    .prologue
    .line 271
    .local p1, "requestParams":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    iput-object p1, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->requestParams:Ljava/util/Map;

    .line 272
    return-object p0
.end method

.method public setSearchString(Ljava/lang/String;)Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;
    .locals 0
    .param p1, "searchString"    # Ljava/lang/String;

    .prologue
    .line 220
    iput-object p1, p0, Lcom/google/ads/mediation/inmobi/InMobiAdapterExtras;->searchString:Ljava/lang/String;

    .line 221
    return-object p0
.end method
