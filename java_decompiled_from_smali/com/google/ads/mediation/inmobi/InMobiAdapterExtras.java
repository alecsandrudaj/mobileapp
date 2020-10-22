package com.google.ads.mediation.inmobi;

import com.google.ads.mediation.NetworkExtras;
import com.inmobi.androidsdk.IMAdRequest.EducationType;
import com.inmobi.androidsdk.IMAdRequest.EthnicityType;
import com.inmobi.androidsdk.IMAdRequest.IMIDType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class InMobiAdapterExtras implements NetworkExtras {
    private String areaCode = null;
    private EducationType education = null;
    private EthnicityType ethnicity = null;
    private Map<IMIDType, String> idtypeParams = new HashMap();
    private Integer income = null;
    private Set<String> interests = null;
    private boolean isLocationInquiryAllowed = true;
    private String keywords = null;
    private String postalCode = null;
    private Map<String, String> requestParams;
    private String searchString = null;
    private int uidMapFlag;

    public InMobiAdapterExtras setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    public InMobiAdapterExtras clearAreaCode() {
        return setAreaCode(null);
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public InMobiAdapterExtras setEducation(EducationType education) {
        this.education = education;
        return this;
    }

    public InMobiAdapterExtras clearEducation() {
        return setEducation(null);
    }

    public EducationType getEducation() {
        return this.education;
    }

    public InMobiAdapterExtras setEthnicity(EthnicityType ethnicity) {
        this.ethnicity = ethnicity;
        return this;
    }

    public InMobiAdapterExtras clearEthnicity() {
        return setEthnicity(null);
    }

    public EthnicityType getEthnicity() {
        return this.ethnicity;
    }

    public InMobiAdapterExtras setIncome(Integer income) {
        this.income = income;
        return this;
    }

    public InMobiAdapterExtras clearIncome() {
        return setIncome(null);
    }

    public Integer getIncome() {
        return this.income;
    }

    public InMobiAdapterExtras setInterests(Collection<String> interests) {
        if (interests == null) {
            this.interests = new HashSet();
        } else {
            this.interests = new HashSet(interests);
        }
        return this;
    }

    public InMobiAdapterExtras clearInterests() {
        return setInterests(null);
    }

    public Set<String> getInterests() {
        if (this.interests == null) {
            return null;
        }
        return Collections.unmodifiableSet(this.interests);
    }

    public void addInterests(String interest) {
        if (this.interests == null) {
            this.interests = new HashSet();
        }
        this.interests.add(interest);
    }

    public InMobiAdapterExtras setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public InMobiAdapterExtras clearPostalCode() {
        return setPostalCode(null);
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public InMobiAdapterExtras setSearchString(String searchString) {
        this.searchString = searchString;
        return this;
    }

    public InMobiAdapterExtras clearSearchString() {
        return setSearchString(null);
    }

    public String getSearchString() {
        return this.searchString;
    }

    public InMobiAdapterExtras setKeywords(String keyword) {
        this.keywords = keyword;
        return this;
    }

    public InMobiAdapterExtras clearKeywords() {
        return setKeywords(null);
    }

    public String getKeywords() {
        return this.keywords;
    }

    public InMobiAdapterExtras setRequestParams(Map<String, String> requestParams) {
        this.requestParams = requestParams;
        return this;
    }

    public InMobiAdapterExtras clearRequestParams() {
        return setRequestParams(null);
    }

    public Map<String, String> getRequestParams() {
        return this.requestParams;
    }

    public boolean isLocationInquiryAllowed() {
        return this.isLocationInquiryAllowed;
    }

    public void setLocationInquiryAllowed(boolean isLocationInquiryAllowed) {
        this.isLocationInquiryAllowed = isLocationInquiryAllowed;
    }

    public InMobiAdapterExtras clearLocationInquiryAllowed() {
        setLocationInquiryAllowed(false);
        return this;
    }

    public void setDeviceIDMask(int mask) {
        this.uidMapFlag = mask;
    }

    public int getDeviceIdMask() {
        return this.uidMapFlag;
    }

    public InMobiAdapterExtras clearDeviceIdMask() {
        setDeviceIDMask(1);
        return this;
    }

    public void addIDType(IMIDType idtype, String value) {
        if (this.idtypeParams != null) {
            this.idtypeParams.put(idtype, value);
        }
    }

    public String getIDType(IMIDType idtype) {
        if (this.idtypeParams != null) {
            return (String) this.idtypeParams.get(idtype);
        }
        return null;
    }

    public void removeIDType(IMIDType idtype) {
        if (this.idtypeParams != null) {
            this.idtypeParams.remove(idtype);
        }
    }
}
