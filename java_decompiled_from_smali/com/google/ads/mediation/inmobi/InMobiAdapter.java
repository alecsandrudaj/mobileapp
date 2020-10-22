package com.google.ads.mediation.inmobi;

import android.app.Activity;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.ads.AdRequest;
import com.google.ads.AdRequest.Gender;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.e;
import com.inmobi.androidsdk.IMAdInterstitial;
import com.inmobi.androidsdk.IMAdInterstitialListener;
import com.inmobi.androidsdk.IMAdListener;
import com.inmobi.androidsdk.IMAdRequest;
import com.inmobi.androidsdk.IMAdRequest.ErrorCode;
import com.inmobi.androidsdk.IMAdRequest.GenderType;
import com.inmobi.androidsdk.IMAdView;
import com.inmobi.androidsdk.IMAdView.AnimationType;
import com.inmobi.commons.IMCommonUtil;
import java.util.Calendar;
import java.util.HashMap;

public final class InMobiAdapter implements MediationInterstitialAdapter<InMobiAdapterExtras, InMobiAdapterServerParameters>, MediationBannerAdapter<InMobiAdapterExtras, InMobiAdapterServerParameters> {
    private static /* synthetic */ int[] $SWITCH_TABLE$com$google$ads$AdRequest$Gender;
    private static final AdSize ADSIZE_INMOBI_AD_UNIT_120X600 = new AdSize(120, 600);
    private static final AdSize ADSIZE_INMOBI_AD_UNIT_300X250 = new AdSize(300, 250);
    private static final AdSize ADSIZE_INMOBI_AD_UNIT_320X48 = new AdSize(320, 48);
    private static final AdSize ADSIZE_INMOBI_AD_UNIT_320X50 = new AdSize(320, 50);
    private static final AdSize ADSIZE_INMOBI_AD_UNIT_468X60 = new AdSize(468, 60);
    private static final AdSize ADSIZE_INMOBI_AD_UNIT_728X90 = new AdSize(728, 90);
    private static Boolean disableHardwareFlag = Boolean.valueOf(false);
    private IMAdInterstitial adInterstitial;
    private IMAdView adView;
    private MediationBannerListener bannerListener;
    private MediationInterstitialListener interstitialListener;
    private boolean isAdShown;
    private boolean shouldSendClickAndPresence;
    private FrameLayout wrappedAdView;

    private class BannerListener implements IMAdListener {
        private static /* synthetic */ int[] $SWITCH_TABLE$com$inmobi$androidsdk$IMAdRequest$ErrorCode;

        static /* synthetic */ int[] $SWITCH_TABLE$com$inmobi$androidsdk$IMAdRequest$ErrorCode() {
            int[] iArr = $SWITCH_TABLE$com$inmobi$androidsdk$IMAdRequest$ErrorCode;
            if (iArr == null) {
                iArr = new int[ErrorCode.values().length];
                try {
                    iArr[ErrorCode.AD_CLICK_IN_PROGRESS.ordinal()] = 3;
                } catch (NoSuchFieldError e) {
                }
                try {
                    iArr[ErrorCode.AD_DOWNLOAD_IN_PROGRESS.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                }
                try {
                    iArr[ErrorCode.AD_FETCH_TIMEOUT.ordinal()] = 4;
                } catch (NoSuchFieldError e3) {
                }
                try {
                    iArr[ErrorCode.AD_RENDERING_TIMEOUT.ordinal()] = 5;
                } catch (NoSuchFieldError e4) {
                }
                try {
                    iArr[ErrorCode.INTERNAL_ERROR.ordinal()] = 7;
                } catch (NoSuchFieldError e5) {
                }
                try {
                    iArr[ErrorCode.INVALID_APP_ID.ordinal()] = 9;
                } catch (NoSuchFieldError e6) {
                }
                try {
                    iArr[ErrorCode.INVALID_REQUEST.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[ErrorCode.NETWORK_ERROR.ordinal()] = 6;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[ErrorCode.NO_FILL.ordinal()] = 8;
                } catch (NoSuchFieldError e9) {
                }
                $SWITCH_TABLE$com$inmobi$androidsdk$IMAdRequest$ErrorCode = iArr;
            }
            return iArr;
        }

        private BannerListener() {
        }

        /* synthetic */ BannerListener(InMobiAdapter inMobiAdapter, BannerListener bannerListener) {
            this();
        }

        public void onAdRequestCompleted(IMAdView arg0) {
            InMobiAdapter.this.shouldSendClickAndPresence = true;
            InMobiAdapter.this.bannerListener.onReceivedAd(InMobiAdapter.this);
        }

        public void onAdRequestFailed(IMAdView arg0, ErrorCode arg1) {
            switch ($SWITCH_TABLE$com$inmobi$androidsdk$IMAdRequest$ErrorCode()[arg1.ordinal()]) {
                case e.MapAttrs_cameraBearing /*1*/:
                    InMobiAdapter.this.bannerListener.onFailedToReceiveAd(InMobiAdapter.this, AdRequest.ErrorCode.INVALID_REQUEST);
                    return;
                case e.MapAttrs_cameraTilt /*4*/:
                case e.MapAttrs_cameraZoom /*5*/:
                    break;
                case e.MapAttrs_uiCompass /*6*/:
                    InMobiAdapter.this.bannerListener.onFailedToReceiveAd(InMobiAdapter.this, AdRequest.ErrorCode.NETWORK_ERROR);
                    return;
                case e.MapAttrs_uiRotateGestures /*7*/:
                    InMobiAdapter.this.bannerListener.onFailedToReceiveAd(InMobiAdapter.this, AdRequest.ErrorCode.INTERNAL_ERROR);
                    return;
                case e.MapAttrs_uiScrollGestures /*8*/:
                    InMobiAdapter.this.bannerListener.onFailedToReceiveAd(InMobiAdapter.this, AdRequest.ErrorCode.NO_FILL);
                    return;
                case e.MapAttrs_uiTiltGestures /*9*/:
                    InMobiAdapter.this.bannerListener.onFailedToReceiveAd(InMobiAdapter.this, AdRequest.ErrorCode.INVALID_REQUEST);
                    break;
                default:
                    InMobiAdapter.this.bannerListener.onFailedToReceiveAd(InMobiAdapter.this, AdRequest.ErrorCode.INVALID_REQUEST);
                    return;
            }
            InMobiAdapter.this.bannerListener.onFailedToReceiveAd(InMobiAdapter.this, AdRequest.ErrorCode.NO_FILL);
        }

        public void onDismissAdScreen(IMAdView arg0) {
            InMobiAdapter.this.shouldSendClickAndPresence = true;
            InMobiAdapter.this.isAdShown = false;
            InMobiAdapter.this.bannerListener.onDismissScreen(InMobiAdapter.this);
        }

        public void onShowAdScreen(IMAdView arg0) {
            if (InMobiAdapter.this.shouldSendClickAndPresence) {
                InMobiAdapter.this.shouldSendClickAndPresence = false;
                InMobiAdapter.this.isAdShown = true;
                InMobiAdapter.this.bannerListener.onClick(InMobiAdapter.this);
                InMobiAdapter.this.bannerListener.onPresentScreen(InMobiAdapter.this);
            }
        }

        public void onLeaveApplication(IMAdView arg0) {
            if (InMobiAdapter.this.shouldSendClickAndPresence) {
                if (InMobiAdapter.this.isAdShown) {
                    InMobiAdapter.this.shouldSendClickAndPresence = false;
                }
                InMobiAdapter.this.bannerListener.onClick(InMobiAdapter.this);
                InMobiAdapter.this.bannerListener.onPresentScreen(InMobiAdapter.this);
            }
            InMobiAdapter.this.bannerListener.onLeaveApplication(InMobiAdapter.this);
        }
    }

    private class InterstitialListener implements IMAdInterstitialListener {
        private static /* synthetic */ int[] $SWITCH_TABLE$com$inmobi$androidsdk$IMAdRequest$ErrorCode;

        static /* synthetic */ int[] $SWITCH_TABLE$com$inmobi$androidsdk$IMAdRequest$ErrorCode() {
            int[] iArr = $SWITCH_TABLE$com$inmobi$androidsdk$IMAdRequest$ErrorCode;
            if (iArr == null) {
                iArr = new int[ErrorCode.values().length];
                try {
                    iArr[ErrorCode.AD_CLICK_IN_PROGRESS.ordinal()] = 3;
                } catch (NoSuchFieldError e) {
                }
                try {
                    iArr[ErrorCode.AD_DOWNLOAD_IN_PROGRESS.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                }
                try {
                    iArr[ErrorCode.AD_FETCH_TIMEOUT.ordinal()] = 4;
                } catch (NoSuchFieldError e3) {
                }
                try {
                    iArr[ErrorCode.AD_RENDERING_TIMEOUT.ordinal()] = 5;
                } catch (NoSuchFieldError e4) {
                }
                try {
                    iArr[ErrorCode.INTERNAL_ERROR.ordinal()] = 7;
                } catch (NoSuchFieldError e5) {
                }
                try {
                    iArr[ErrorCode.INVALID_APP_ID.ordinal()] = 9;
                } catch (NoSuchFieldError e6) {
                }
                try {
                    iArr[ErrorCode.INVALID_REQUEST.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[ErrorCode.NETWORK_ERROR.ordinal()] = 6;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[ErrorCode.NO_FILL.ordinal()] = 8;
                } catch (NoSuchFieldError e9) {
                }
                $SWITCH_TABLE$com$inmobi$androidsdk$IMAdRequest$ErrorCode = iArr;
            }
            return iArr;
        }

        private InterstitialListener() {
        }

        /* synthetic */ InterstitialListener(InMobiAdapter inMobiAdapter, InterstitialListener interstitialListener) {
            this();
        }

        public void onAdRequestFailed(IMAdInterstitial arg0, ErrorCode arg1) {
            switch ($SWITCH_TABLE$com$inmobi$androidsdk$IMAdRequest$ErrorCode()[arg1.ordinal()]) {
                case e.MapAttrs_cameraBearing /*1*/:
                    InMobiAdapter.this.interstitialListener.onFailedToReceiveAd(InMobiAdapter.this, AdRequest.ErrorCode.INVALID_REQUEST);
                    return;
                case e.MapAttrs_cameraTilt /*4*/:
                case e.MapAttrs_cameraZoom /*5*/:
                    InMobiAdapter.this.interstitialListener.onFailedToReceiveAd(InMobiAdapter.this, AdRequest.ErrorCode.NO_FILL);
                    return;
                case e.MapAttrs_uiCompass /*6*/:
                    InMobiAdapter.this.interstitialListener.onFailedToReceiveAd(InMobiAdapter.this, AdRequest.ErrorCode.NETWORK_ERROR);
                    return;
                case e.MapAttrs_uiRotateGestures /*7*/:
                    InMobiAdapter.this.interstitialListener.onFailedToReceiveAd(InMobiAdapter.this, AdRequest.ErrorCode.INTERNAL_ERROR);
                    return;
                case e.MapAttrs_uiScrollGestures /*8*/:
                    InMobiAdapter.this.interstitialListener.onFailedToReceiveAd(InMobiAdapter.this, AdRequest.ErrorCode.NO_FILL);
                    return;
                case e.MapAttrs_uiTiltGestures /*9*/:
                    InMobiAdapter.this.interstitialListener.onFailedToReceiveAd(InMobiAdapter.this, AdRequest.ErrorCode.INVALID_REQUEST);
                    return;
                default:
                    InMobiAdapter.this.interstitialListener.onFailedToReceiveAd(InMobiAdapter.this, AdRequest.ErrorCode.INVALID_REQUEST);
                    return;
            }
        }

        public void onAdRequestLoaded(IMAdInterstitial arg0) {
            InMobiAdapter.this.interstitialListener.onReceivedAd(InMobiAdapter.this);
        }

        public void onDismissAdScreen(IMAdInterstitial arg0) {
            InMobiAdapter.this.interstitialListener.onDismissScreen(InMobiAdapter.this);
        }

        public void onShowAdScreen(IMAdInterstitial arg0) {
            InMobiAdapter.this.interstitialListener.onPresentScreen(InMobiAdapter.this);
        }

        public void onLeaveApplication(IMAdInterstitial arg0) {
            InMobiAdapter.this.interstitialListener.onLeaveApplication(InMobiAdapter.this);
        }
    }

    static /* synthetic */ int[] $SWITCH_TABLE$com$google$ads$AdRequest$Gender() {
        int[] iArr = $SWITCH_TABLE$com$google$ads$AdRequest$Gender;
        if (iArr == null) {
            iArr = new int[Gender.values().length];
            try {
                iArr[Gender.FEMALE.ordinal()] = 3;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Gender.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Gender.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            $SWITCH_TABLE$com$google$ads$AdRequest$Gender = iArr;
        }
        return iArr;
    }

    private IMAdRequest buildAdRequest(InMobiAdapterServerParameters serverParameters, MediationAdRequest mediationAdRequest, InMobiAdapterExtras extras) {
        if (extras == null) {
            extras = new InMobiAdapterExtras();
        }
        IMAdRequest adRequest = new IMAdRequest();
        if (mediationAdRequest.getAgeInYears() != null) {
            adRequest.setAge(mediationAdRequest.getAgeInYears().intValue());
        }
        if (extras.getAreaCode() != null) {
            adRequest.setAreaCode(extras.getAreaCode());
        }
        if (mediationAdRequest.getLocation() != null) {
            adRequest.setLocationInquiryAllowed(true);
            adRequest.setCurrentLocation(mediationAdRequest.getLocation());
        }
        if (mediationAdRequest.getBirthday() != null) {
            Calendar dob = Calendar.getInstance();
            dob.setTime(mediationAdRequest.getBirthday());
            adRequest.setDateOfBirth(dob);
        }
        if (extras.getEducation() != null) {
            adRequest.setEducation(extras.getEducation());
        }
        if (extras.getEthnicity() != null) {
            adRequest.setEthnicity(extras.getEthnicity());
        }
        if (mediationAdRequest.getGender() != null) {
            switch ($SWITCH_TABLE$com$google$ads$AdRequest$Gender()[mediationAdRequest.getGender().ordinal()]) {
                case e.MapAttrs_cameraTargetLat /*2*/:
                    adRequest.setGender(GenderType.MALE);
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    adRequest.setGender(GenderType.FEMALE);
                    break;
            }
        }
        if (extras.getIncome() != null) {
            adRequest.setIncome(extras.getIncome().intValue());
        }
        if (extras.getInterests() != null) {
            adRequest.setInterests(TextUtils.join(", ", extras.getInterests()));
        }
        if (mediationAdRequest.getKeywords() != null) {
            adRequest.setKeywords(TextUtils.join(", ", mediationAdRequest.getKeywords()));
        }
        if (extras.getPostalCode() != null) {
            adRequest.setPostalCode(extras.getPostalCode());
        }
        if (extras.getSearchString() != null) {
            adRequest.setSearchString(extras.getSearchString());
        }
        IMCommonUtil.setDeviceIDMask(extras.getDeviceIdMask());
        HashMap<String, String> paramMap = new HashMap();
        paramMap.put("tp", "c_gwhirl");
        adRequest.setRequestParams(paramMap);
        return adRequest;
    }

    public Class<InMobiAdapterExtras> getAdditionalParametersType() {
        return InMobiAdapterExtras.class;
    }

    public Class<InMobiAdapterServerParameters> getServerParametersType() {
        return InMobiAdapterServerParameters.class;
    }

    public void requestBannerAd(MediationBannerListener listener, Activity activity, InMobiAdapterServerParameters serverParameters, AdSize mediationAdSize, MediationAdRequest mediationAdRequest, InMobiAdapterExtras extras) {
        if (VERSION.SDK_INT < 7) {
            listener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INVALID_REQUEST);
            return;
        }
        int adSize;
        this.bannerListener = listener;
        AdSize bestFitSize = mediationAdSize.findBestSize(ADSIZE_INMOBI_AD_UNIT_320X48, ADSIZE_INMOBI_AD_UNIT_320X50, ADSIZE_INMOBI_AD_UNIT_468X60, ADSIZE_INMOBI_AD_UNIT_728X90, ADSIZE_INMOBI_AD_UNIT_300X250, ADSIZE_INMOBI_AD_UNIT_120X600);
        if (bestFitSize == ADSIZE_INMOBI_AD_UNIT_320X48) {
            adSize = 9;
        } else if (bestFitSize == ADSIZE_INMOBI_AD_UNIT_320X50) {
            adSize = 15;
        } else if (bestFitSize == ADSIZE_INMOBI_AD_UNIT_468X60) {
            adSize = 12;
        } else if (bestFitSize == ADSIZE_INMOBI_AD_UNIT_728X90) {
            adSize = 11;
        } else if (bestFitSize == ADSIZE_INMOBI_AD_UNIT_300X250) {
            adSize = 10;
        } else if (bestFitSize == ADSIZE_INMOBI_AD_UNIT_120X600) {
            adSize = 13;
        } else {
            listener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INVALID_REQUEST);
            return;
        }
        LayoutParams wrappedLayoutParams = new LayoutParams(bestFitSize.getWidthInPixels(activity), bestFitSize.getHeightInPixels(activity));
        this.adView = new IMAdView(activity, adSize, serverParameters.appId);
        this.adView.setRefreshInterval(-1);
        this.adView.setAnimationType(AnimationType.ANIMATION_OFF);
        this.adView.setIMAdListener(new BannerListener(this, null));
        if (disableHardwareFlag.booleanValue()) {
            this.adView.disableHardwareAcceleration();
        }
        this.wrappedAdView = new FrameLayout(activity);
        this.wrappedAdView.setLayoutParams(wrappedLayoutParams);
        this.wrappedAdView.addView(this.adView);
        this.adView.loadNewAd(buildAdRequest(serverParameters, mediationAdRequest, extras));
    }

    public void requestInterstitialAd(MediationInterstitialListener listener, Activity activity, InMobiAdapterServerParameters serverParameters, MediationAdRequest mediationAdRequest, InMobiAdapterExtras extras) {
        if (VERSION.SDK_INT < 7) {
            listener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INVALID_REQUEST);
            return;
        }
        this.interstitialListener = listener;
        this.adInterstitial = new IMAdInterstitial(activity, serverParameters.appId);
        this.adInterstitial.setIMAdInterstitialListener(new InterstitialListener(this, null));
        if (disableHardwareFlag.booleanValue()) {
            this.adInterstitial.disableHardwareAcceleration();
        }
        this.adInterstitial.loadNewAd(buildAdRequest(serverParameters, mediationAdRequest, extras));
    }

    public void showInterstitial() {
        this.adInterstitial.show();
    }

    public void destroy() {
    }

    public View getBannerView() {
        return this.wrappedAdView;
    }

    public static void disableHardwareAcceleration() {
        disableHardwareFlag = Boolean.valueOf(true);
    }
}
