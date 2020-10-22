package com.google.ads;

import android.app.Activity;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.MediationServerParameters.MappingException;
import com.google.ads.mediation.NetworkExtras;
import com.google.ads.util.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

class i implements Runnable {
    private final h a;
    private final String b;
    private final AdRequest c;
    private final HashMap<String, String> d;
    private final boolean e = a(this.d);
    private final WeakReference<Activity> f;

    private static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    private static boolean a(Map<String, String> map) {
        String str = (String) map.remove("gwhirl_share_location");
        if ("1".equals(str)) {
            return true;
        }
        if (!(str == null || "0".equals(str))) {
            b.b("Received an illegal value, '" + str + "', for the special share location parameter from mediation server" + " (expected '0' or '1'). Will not share the location.");
        }
        return false;
    }

    public i(h hVar, Activity activity, String str, AdRequest adRequest, HashMap<String, String> hashMap) {
        this.a = hVar;
        this.b = str;
        this.f = new WeakReference(activity);
        this.c = adRequest;
        this.d = new HashMap(hashMap);
    }

    public void run() {
        try {
            b.a("Trying to instantiate: " + this.b);
            a((MediationAdapter) g.a(this.b, MediationAdapter.class));
        } catch (ClassNotFoundException e) {
            a("Cannot find adapter class '" + this.b + "'. Did you link the ad network's mediation adapter? Skipping ad network.", e, com.google.ads.g.a.NOT_FOUND);
        } catch (Throwable th) {
            a("Error while creating adapter and loading ad from ad network. Skipping ad network.", th, com.google.ads.g.a.EXCEPTION);
        }
    }

    private void a(String str, Throwable th, com.google.ads.g.a aVar) {
        b.b(str, th);
        this.a.a(false, aVar);
    }

    private <T extends NetworkExtras, U extends MediationServerParameters> void a(MediationAdapter<T, U> mediationAdapter) throws MappingException, a, IllegalAccessException, InstantiationException {
        Activity activity = (Activity) this.f.get();
        if (activity == null) {
            throw new a("Activity became null while trying to instantiate adapter.");
        }
        MediationServerParameters mediationServerParameters;
        NetworkExtras networkExtras;
        this.a.a((MediationAdapter) mediationAdapter);
        Class serverParametersType = mediationAdapter.getServerParametersType();
        if (serverParametersType != null) {
            MediationServerParameters mediationServerParameters2 = (MediationServerParameters) serverParametersType.newInstance();
            mediationServerParameters2.load(this.d);
            mediationServerParameters = mediationServerParameters2;
        } else {
            mediationServerParameters = null;
        }
        serverParametersType = mediationAdapter.getAdditionalParametersType();
        if (serverParametersType != null) {
            networkExtras = (NetworkExtras) this.c.getNetworkExtras(serverParametersType);
        } else {
            networkExtras = null;
        }
        MediationAdRequest mediationAdRequest = new MediationAdRequest(this.c, activity, this.e);
        if (this.a.a.a()) {
            if (mediationAdapter instanceof MediationInterstitialAdapter) {
                ((MediationInterstitialAdapter) mediationAdapter).requestInterstitialAd(new k(this.a), activity, mediationServerParameters, mediationAdRequest, networkExtras);
            } else {
                throw new a("Adapter " + this.b + " doesn't support the MediationInterstitialAdapter" + " interface.");
            }
        } else if (mediationAdapter instanceof MediationBannerAdapter) {
            ((MediationBannerAdapter) mediationAdapter).requestBannerAd(new j(this.a), activity, mediationServerParameters, this.a.a.c(), mediationAdRequest, networkExtras);
        } else {
            throw new a("Adapter " + this.b + " doesn't support the MediationBannerAdapter interface");
        }
        this.a.k();
    }
}
