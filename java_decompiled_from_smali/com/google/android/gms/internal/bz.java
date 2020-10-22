package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.e;
import com.google.android.gms.internal.ae.a;
import com.google.android.gms.plus.a.a.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class bz extends ae implements SafeParcelable, b {
    public static final bk CREATOR = new bk();
    private static final HashMap a = new HashMap();
    private final Set b;
    private final int c;
    private String d;
    private bx e;
    private String f;
    private bx g;
    private String h;

    static {
        a.put("id", a.d("id", 2));
        a.put("result", a.a("result", 4, bx.class));
        a.put("startDate", a.d("startDate", 5));
        a.put("target", a.a("target", 6, bx.class));
        a.put("type", a.d("type", 7));
    }

    public bz() {
        this.c = 1;
        this.b = new HashSet();
    }

    bz(Set set, int i, String str, bx bxVar, String str2, bx bxVar2, String str3) {
        this.b = set;
        this.c = i;
        this.d = str;
        this.e = bxVar;
        this.f = str2;
        this.g = bxVar2;
        this.h = str3;
    }

    /* Access modifiers changed, original: protected */
    public Object a(String str) {
        return null;
    }

    /* Access modifiers changed, original: protected */
    public boolean a(a aVar) {
        return this.b.contains(Integer.valueOf(aVar.g()));
    }

    /* Access modifiers changed, original: protected */
    public Object b(a aVar) {
        switch (aVar.g()) {
            case e.MapAttrs_cameraTargetLat /*2*/:
                return this.d;
            case e.MapAttrs_cameraTilt /*4*/:
                return this.e;
            case e.MapAttrs_cameraZoom /*5*/:
                return this.f;
            case e.MapAttrs_uiCompass /*6*/:
                return this.g;
            case e.MapAttrs_uiRotateGestures /*7*/:
                return this.h;
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + aVar.g());
        }
    }

    public HashMap b() {
        return a;
    }

    /* Access modifiers changed, original: protected */
    public boolean b(String str) {
        return false;
    }

    public int describeContents() {
        bk bkVar = CREATOR;
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public Set e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bz)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        bz bzVar = (bz) obj;
        for (a aVar : a.values()) {
            if (a(aVar)) {
                if (!bzVar.a(aVar)) {
                    return false;
                }
                if (!b(aVar).equals(bzVar.b(aVar))) {
                    return false;
                }
            } else if (bzVar.a(aVar)) {
                return false;
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public int f() {
        return this.c;
    }

    public String g() {
        return this.d;
    }

    /* Access modifiers changed, original: 0000 */
    public bx h() {
        return this.e;
    }

    public int hashCode() {
        int i = 0;
        Iterator it = a.values().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            a aVar = (a) it.next();
            if (a(aVar)) {
                i = b(aVar).hashCode() + (i2 + aVar.g());
            } else {
                i = i2;
            }
        }
    }

    public String i() {
        return this.f;
    }

    /* Access modifiers changed, original: 0000 */
    public bx j() {
        return this.g;
    }

    public String k() {
        return this.h;
    }

    /* renamed from: l */
    public bz a() {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bk bkVar = CREATOR;
        bk.a(this, parcel, i);
    }
}
