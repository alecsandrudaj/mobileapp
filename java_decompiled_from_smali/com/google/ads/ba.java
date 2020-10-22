package com.google.ads;

import com.google.ads.a.ac;
import com.google.ads.util.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class ba {
    private static final Map a = Collections.unmodifiableMap(new bb());
    private final String b;
    private final String c;
    private final List d;
    private final Integer e;
    private final Integer f;
    private final List g;
    private final List h;
    private final List i;

    private ba(String str, String str2, List list, Integer num, Integer num2, List list2, List list3, List list4) {
        e.a(str);
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = num;
        this.f = num2;
        this.g = list2;
        this.h = list3;
        this.i = list4;
    }

    public static ba a(String str) {
        Integer valueOf;
        List a;
        List a2;
        List a3;
        Integer num;
        Integer num2 = null;
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("qdata");
        String string2 = jSONObject.has("ad_type") ? jSONObject.getString("ad_type") : null;
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(a(jSONArray.getJSONObject(i)));
        }
        jSONObject = jSONObject.optJSONObject("settings");
        if (jSONObject != null) {
            valueOf = jSONObject.has("refresh") ? Integer.valueOf(jSONObject.getInt("refresh")) : null;
            if (jSONObject.has("ad_network_timeout_millis")) {
                num2 = Integer.valueOf(jSONObject.getInt("ad_network_timeout_millis"));
            }
            a = a(jSONObject, "imp_urls");
            a2 = a(jSONObject, "click_urls");
            a3 = a(jSONObject, "nofill_urls");
            num = num2;
        } else {
            a3 = null;
            a = null;
            a2 = null;
            num = null;
            valueOf = null;
        }
        return new ba(string, string2, arrayList, valueOf, num, a, a2, a3);
    }

    private static k a(JSONObject jSONObject) {
        HashMap hashMap;
        String string = jSONObject.getString("id");
        String optString = jSONObject.optString("allocation_id", null);
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        List a = a(jSONObject, "imp_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        HashMap hashMap2 = new HashMap(0);
        if (optJSONObject != null) {
            hashMap = new HashMap(optJSONObject.length());
            Iterator keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                hashMap.put(str, optJSONObject.getString(str));
            }
        } else {
            hashMap = hashMap2;
        }
        return new k(optString, string, arrayList, a, hashMap);
    }

    private static List a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return arrayList;
    }

    public boolean a() {
        return this.f != null;
    }

    public int b() {
        return this.f.intValue();
    }

    public String c() {
        return this.b;
    }

    public boolean d() {
        return this.e != null;
    }

    public int e() {
        return this.e.intValue();
    }

    public List f() {
        return this.d;
    }

    public List g() {
        return this.g;
    }

    public List h() {
        return this.h;
    }

    public List i() {
        return this.i;
    }

    public ac j() {
        if (this.c == null) {
            return null;
        }
        if ("interstitial".equals(this.c)) {
            return ac.a;
        }
        g gVar = (g) a.get(this.c);
        return gVar != null ? ac.a(gVar) : null;
    }
}
