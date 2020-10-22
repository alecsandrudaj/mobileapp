package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.e;
import com.google.android.gms.plus.a.b.i;
import com.google.android.gms.plus.a.b.j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class cc extends ae implements SafeParcelable, com.google.android.gms.plus.a.b.a {
    public static final bl CREATOR = new bl();
    private static final HashMap a = new HashMap();
    private boolean A;
    private final Set b;
    private final int c;
    private String d;
    private a e;
    private String f;
    private String g;
    private int h;
    private b i;
    private String j;
    private String k;
    private int l;
    private String m;
    private c n;
    private boolean o;
    private String p;
    private d q;
    private String r;
    private int s;
    private List t;
    private List u;
    private int v;
    private int w;
    private String x;
    private String y;
    private List z;

    public final class a extends ae implements SafeParcelable, com.google.android.gms.plus.a.b.b {
        public static final bm CREATOR = new bm();
        private static final HashMap a = new HashMap();
        private final Set b;
        private final int c;
        private int d;
        private int e;

        static {
            a.put("max", com.google.android.gms.internal.ae.a.a("max", 2));
            a.put("min", com.google.android.gms.internal.ae.a.a("min", 3));
        }

        public a() {
            this.c = 1;
            this.b = new HashSet();
        }

        a(Set set, int i, int i2, int i3) {
            this.b = set;
            this.c = i;
            this.d = i2;
            this.e = i3;
        }

        /* Access modifiers changed, original: protected */
        public Object a(String str) {
            return null;
        }

        /* Access modifiers changed, original: protected */
        public boolean a(com.google.android.gms.internal.ae.a aVar) {
            return this.b.contains(Integer.valueOf(aVar.g()));
        }

        /* Access modifiers changed, original: protected */
        public Object b(com.google.android.gms.internal.ae.a aVar) {
            switch (aVar.g()) {
                case e.MapAttrs_cameraTargetLat /*2*/:
                    return Integer.valueOf(this.d);
                case e.MapAttrs_cameraTargetLng /*3*/:
                    return Integer.valueOf(this.e);
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
            bm bmVar = CREATOR;
            return 0;
        }

        /* Access modifiers changed, original: 0000 */
        public Set e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            a aVar = (a) obj;
            for (com.google.android.gms.internal.ae.a aVar2 : a.values()) {
                if (a(aVar2)) {
                    if (!aVar.a(aVar2)) {
                        return false;
                    }
                    if (!b(aVar2).equals(aVar.b(aVar2))) {
                        return false;
                    }
                } else if (aVar.a(aVar2)) {
                    return false;
                }
            }
            return true;
        }

        /* Access modifiers changed, original: 0000 */
        public int f() {
            return this.c;
        }

        public int g() {
            return this.d;
        }

        public int h() {
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
                com.google.android.gms.internal.ae.a aVar = (com.google.android.gms.internal.ae.a) it.next();
                if (a(aVar)) {
                    i = b(aVar).hashCode() + (i2 + aVar.g());
                } else {
                    i = i2;
                }
            }
        }

        /* renamed from: i */
        public a a() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            bm bmVar = CREATOR;
            bm.a(this, parcel, i);
        }
    }

    public final class b extends ae implements SafeParcelable, com.google.android.gms.plus.a.b.c {
        public static final bn CREATOR = new bn();
        private static final HashMap a = new HashMap();
        private final Set b;
        private final int c;
        private a d;
        private b e;
        private int f;

        public final class a extends ae implements SafeParcelable, com.google.android.gms.plus.a.b.d {
            public static final bo CREATOR = new bo();
            private static final HashMap a = new HashMap();
            private final Set b;
            private final int c;
            private int d;
            private int e;

            static {
                a.put("leftImageOffset", com.google.android.gms.internal.ae.a.a("leftImageOffset", 2));
                a.put("topImageOffset", com.google.android.gms.internal.ae.a.a("topImageOffset", 3));
            }

            public a() {
                this.c = 1;
                this.b = new HashSet();
            }

            a(Set set, int i, int i2, int i3) {
                this.b = set;
                this.c = i;
                this.d = i2;
                this.e = i3;
            }

            /* Access modifiers changed, original: protected */
            public Object a(String str) {
                return null;
            }

            /* Access modifiers changed, original: protected */
            public boolean a(com.google.android.gms.internal.ae.a aVar) {
                return this.b.contains(Integer.valueOf(aVar.g()));
            }

            /* Access modifiers changed, original: protected */
            public Object b(com.google.android.gms.internal.ae.a aVar) {
                switch (aVar.g()) {
                    case e.MapAttrs_cameraTargetLat /*2*/:
                        return Integer.valueOf(this.d);
                    case e.MapAttrs_cameraTargetLng /*3*/:
                        return Integer.valueOf(this.e);
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
                bo boVar = CREATOR;
                return 0;
            }

            /* Access modifiers changed, original: 0000 */
            public Set e() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof a)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                a aVar = (a) obj;
                for (com.google.android.gms.internal.ae.a aVar2 : a.values()) {
                    if (a(aVar2)) {
                        if (!aVar.a(aVar2)) {
                            return false;
                        }
                        if (!b(aVar2).equals(aVar.b(aVar2))) {
                            return false;
                        }
                    } else if (aVar.a(aVar2)) {
                        return false;
                    }
                }
                return true;
            }

            /* Access modifiers changed, original: 0000 */
            public int f() {
                return this.c;
            }

            public int g() {
                return this.d;
            }

            public int h() {
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
                    com.google.android.gms.internal.ae.a aVar = (com.google.android.gms.internal.ae.a) it.next();
                    if (a(aVar)) {
                        i = b(aVar).hashCode() + (i2 + aVar.g());
                    } else {
                        i = i2;
                    }
                }
            }

            /* renamed from: i */
            public a a() {
                return this;
            }

            public void writeToParcel(Parcel parcel, int i) {
                bo boVar = CREATOR;
                bo.a(this, parcel, i);
            }
        }

        public final class b extends ae implements SafeParcelable, com.google.android.gms.plus.a.b.e {
            public static final bp CREATOR = new bp();
            private static final HashMap a = new HashMap();
            private final Set b;
            private final int c;
            private int d;
            private String e;
            private int f;

            static {
                a.put("height", com.google.android.gms.internal.ae.a.a("height", 2));
                a.put("url", com.google.android.gms.internal.ae.a.d("url", 3));
                a.put("width", com.google.android.gms.internal.ae.a.a("width", 4));
            }

            public b() {
                this.c = 1;
                this.b = new HashSet();
            }

            b(Set set, int i, int i2, String str, int i3) {
                this.b = set;
                this.c = i;
                this.d = i2;
                this.e = str;
                this.f = i3;
            }

            /* Access modifiers changed, original: protected */
            public Object a(String str) {
                return null;
            }

            /* Access modifiers changed, original: protected */
            public boolean a(com.google.android.gms.internal.ae.a aVar) {
                return this.b.contains(Integer.valueOf(aVar.g()));
            }

            /* Access modifiers changed, original: protected */
            public Object b(com.google.android.gms.internal.ae.a aVar) {
                switch (aVar.g()) {
                    case e.MapAttrs_cameraTargetLat /*2*/:
                        return Integer.valueOf(this.d);
                    case e.MapAttrs_cameraTargetLng /*3*/:
                        return this.e;
                    case e.MapAttrs_cameraTilt /*4*/:
                        return Integer.valueOf(this.f);
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
                bp bpVar = CREATOR;
                return 0;
            }

            /* Access modifiers changed, original: 0000 */
            public Set e() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof b)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                b bVar = (b) obj;
                for (com.google.android.gms.internal.ae.a aVar : a.values()) {
                    if (a(aVar)) {
                        if (!bVar.a(aVar)) {
                            return false;
                        }
                        if (!b(aVar).equals(bVar.b(aVar))) {
                            return false;
                        }
                    } else if (bVar.a(aVar)) {
                        return false;
                    }
                }
                return true;
            }

            /* Access modifiers changed, original: 0000 */
            public int f() {
                return this.c;
            }

            public int g() {
                return this.d;
            }

            public String h() {
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
                    com.google.android.gms.internal.ae.a aVar = (com.google.android.gms.internal.ae.a) it.next();
                    if (a(aVar)) {
                        i = b(aVar).hashCode() + (i2 + aVar.g());
                    } else {
                        i = i2;
                    }
                }
            }

            public int i() {
                return this.f;
            }

            /* renamed from: j */
            public b a() {
                return this;
            }

            public void writeToParcel(Parcel parcel, int i) {
                bp bpVar = CREATOR;
                bp.a(this, parcel, i);
            }
        }

        static {
            a.put("coverInfo", com.google.android.gms.internal.ae.a.a("coverInfo", 2, a.class));
            a.put("coverPhoto", com.google.android.gms.internal.ae.a.a("coverPhoto", 3, b.class));
            a.put("layout", com.google.android.gms.internal.ae.a.a("layout", 4, new ab().a("banner", 0), false));
        }

        public b() {
            this.c = 1;
            this.b = new HashSet();
        }

        b(Set set, int i, a aVar, b bVar, int i2) {
            this.b = set;
            this.c = i;
            this.d = aVar;
            this.e = bVar;
            this.f = i2;
        }

        /* Access modifiers changed, original: protected */
        public Object a(String str) {
            return null;
        }

        /* Access modifiers changed, original: protected */
        public boolean a(com.google.android.gms.internal.ae.a aVar) {
            return this.b.contains(Integer.valueOf(aVar.g()));
        }

        /* Access modifiers changed, original: protected */
        public Object b(com.google.android.gms.internal.ae.a aVar) {
            switch (aVar.g()) {
                case e.MapAttrs_cameraTargetLat /*2*/:
                    return this.d;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    return this.e;
                case e.MapAttrs_cameraTilt /*4*/:
                    return Integer.valueOf(this.f);
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
            bn bnVar = CREATOR;
            return 0;
        }

        /* Access modifiers changed, original: 0000 */
        public Set e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            b bVar = (b) obj;
            for (com.google.android.gms.internal.ae.a aVar : a.values()) {
                if (a(aVar)) {
                    if (!bVar.a(aVar)) {
                        return false;
                    }
                    if (!b(aVar).equals(bVar.b(aVar))) {
                        return false;
                    }
                } else if (bVar.a(aVar)) {
                    return false;
                }
            }
            return true;
        }

        /* Access modifiers changed, original: 0000 */
        public int f() {
            return this.c;
        }

        /* Access modifiers changed, original: 0000 */
        public a g() {
            return this.d;
        }

        /* Access modifiers changed, original: 0000 */
        public b h() {
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
                com.google.android.gms.internal.ae.a aVar = (com.google.android.gms.internal.ae.a) it.next();
                if (a(aVar)) {
                    i = b(aVar).hashCode() + (i2 + aVar.g());
                } else {
                    i = i2;
                }
            }
        }

        public int i() {
            return this.f;
        }

        /* renamed from: j */
        public b a() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            bn bnVar = CREATOR;
            bn.a(this, parcel, i);
        }
    }

    public final class c extends ae implements SafeParcelable, com.google.android.gms.plus.a.b.f {
        public static final bq CREATOR = new bq();
        private static final HashMap a = new HashMap();
        private final Set b;
        private final int c;
        private String d;

        static {
            a.put("url", com.google.android.gms.internal.ae.a.d("url", 2));
        }

        public c() {
            this.c = 1;
            this.b = new HashSet();
        }

        c(Set set, int i, String str) {
            this.b = set;
            this.c = i;
            this.d = str;
        }

        /* Access modifiers changed, original: protected */
        public Object a(String str) {
            return null;
        }

        /* Access modifiers changed, original: protected */
        public boolean a(com.google.android.gms.internal.ae.a aVar) {
            return this.b.contains(Integer.valueOf(aVar.g()));
        }

        /* Access modifiers changed, original: protected */
        public Object b(com.google.android.gms.internal.ae.a aVar) {
            switch (aVar.g()) {
                case e.MapAttrs_cameraTargetLat /*2*/:
                    return this.d;
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
            bq bqVar = CREATOR;
            return 0;
        }

        /* Access modifiers changed, original: 0000 */
        public Set e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            c cVar = (c) obj;
            for (com.google.android.gms.internal.ae.a aVar : a.values()) {
                if (a(aVar)) {
                    if (!cVar.a(aVar)) {
                        return false;
                    }
                    if (!b(aVar).equals(cVar.b(aVar))) {
                        return false;
                    }
                } else if (cVar.a(aVar)) {
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

        /* renamed from: h */
        public c a() {
            return this;
        }

        public int hashCode() {
            int i = 0;
            Iterator it = a.values().iterator();
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    return i2;
                }
                com.google.android.gms.internal.ae.a aVar = (com.google.android.gms.internal.ae.a) it.next();
                if (a(aVar)) {
                    i = b(aVar).hashCode() + (i2 + aVar.g());
                } else {
                    i = i2;
                }
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            bq bqVar = CREATOR;
            bq.a(this, parcel, i);
        }
    }

    public final class d extends ae implements SafeParcelable, com.google.android.gms.plus.a.b.g {
        public static final br CREATOR = new br();
        private static final HashMap a = new HashMap();
        private final Set b;
        private final int c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;

        static {
            a.put("familyName", com.google.android.gms.internal.ae.a.d("familyName", 2));
            a.put("formatted", com.google.android.gms.internal.ae.a.d("formatted", 3));
            a.put("givenName", com.google.android.gms.internal.ae.a.d("givenName", 4));
            a.put("honorificPrefix", com.google.android.gms.internal.ae.a.d("honorificPrefix", 5));
            a.put("honorificSuffix", com.google.android.gms.internal.ae.a.d("honorificSuffix", 6));
            a.put("middleName", com.google.android.gms.internal.ae.a.d("middleName", 7));
        }

        public d() {
            this.c = 1;
            this.b = new HashSet();
        }

        d(Set set, int i, String str, String str2, String str3, String str4, String str5, String str6) {
            this.b = set;
            this.c = i;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = str5;
            this.i = str6;
        }

        /* Access modifiers changed, original: protected */
        public Object a(String str) {
            return null;
        }

        /* Access modifiers changed, original: protected */
        public boolean a(com.google.android.gms.internal.ae.a aVar) {
            return this.b.contains(Integer.valueOf(aVar.g()));
        }

        /* Access modifiers changed, original: protected */
        public Object b(com.google.android.gms.internal.ae.a aVar) {
            switch (aVar.g()) {
                case e.MapAttrs_cameraTargetLat /*2*/:
                    return this.d;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    return this.e;
                case e.MapAttrs_cameraTilt /*4*/:
                    return this.f;
                case e.MapAttrs_cameraZoom /*5*/:
                    return this.g;
                case e.MapAttrs_uiCompass /*6*/:
                    return this.h;
                case e.MapAttrs_uiRotateGestures /*7*/:
                    return this.i;
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
            br brVar = CREATOR;
            return 0;
        }

        /* Access modifiers changed, original: 0000 */
        public Set e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            d dVar = (d) obj;
            for (com.google.android.gms.internal.ae.a aVar : a.values()) {
                if (a(aVar)) {
                    if (!dVar.a(aVar)) {
                        return false;
                    }
                    if (!b(aVar).equals(dVar.b(aVar))) {
                        return false;
                    }
                } else if (dVar.a(aVar)) {
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

        public String h() {
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
                com.google.android.gms.internal.ae.a aVar = (com.google.android.gms.internal.ae.a) it.next();
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

        public String j() {
            return this.g;
        }

        public String k() {
            return this.h;
        }

        public String l() {
            return this.i;
        }

        /* renamed from: m */
        public d a() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            br brVar = CREATOR;
            br.a(this, parcel, i);
        }
    }

    public final class f extends ae implements SafeParcelable, com.google.android.gms.plus.a.b.h {
        public static final bs CREATOR = new bs();
        private static final HashMap a = new HashMap();
        private final Set b;
        private final int c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private boolean i;
        private String j;
        private String k;
        private int l;

        static {
            a.put("department", com.google.android.gms.internal.ae.a.d("department", 2));
            a.put("description", com.google.android.gms.internal.ae.a.d("description", 3));
            a.put("endDate", com.google.android.gms.internal.ae.a.d("endDate", 4));
            a.put("location", com.google.android.gms.internal.ae.a.d("location", 5));
            a.put("name", com.google.android.gms.internal.ae.a.d("name", 6));
            a.put("primary", com.google.android.gms.internal.ae.a.c("primary", 7));
            a.put("startDate", com.google.android.gms.internal.ae.a.d("startDate", 8));
            a.put("title", com.google.android.gms.internal.ae.a.d("title", 9));
            a.put("type", com.google.android.gms.internal.ae.a.a("type", 10, new ab().a("work", 0).a("school", 1), false));
        }

        public f() {
            this.c = 1;
            this.b = new HashSet();
        }

        f(Set set, int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i2) {
            this.b = set;
            this.c = i;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = str5;
            this.i = z;
            this.j = str6;
            this.k = str7;
            this.l = i2;
        }

        /* Access modifiers changed, original: protected */
        public Object a(String str) {
            return null;
        }

        /* Access modifiers changed, original: protected */
        public boolean a(com.google.android.gms.internal.ae.a aVar) {
            return this.b.contains(Integer.valueOf(aVar.g()));
        }

        /* Access modifiers changed, original: protected */
        public Object b(com.google.android.gms.internal.ae.a aVar) {
            switch (aVar.g()) {
                case e.MapAttrs_cameraTargetLat /*2*/:
                    return this.d;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    return this.e;
                case e.MapAttrs_cameraTilt /*4*/:
                    return this.f;
                case e.MapAttrs_cameraZoom /*5*/:
                    return this.g;
                case e.MapAttrs_uiCompass /*6*/:
                    return this.h;
                case e.MapAttrs_uiRotateGestures /*7*/:
                    return Boolean.valueOf(this.i);
                case e.MapAttrs_uiScrollGestures /*8*/:
                    return this.j;
                case e.MapAttrs_uiTiltGestures /*9*/:
                    return this.k;
                case e.MapAttrs_uiZoomControls /*10*/:
                    return Integer.valueOf(this.l);
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
            bs bsVar = CREATOR;
            return 0;
        }

        /* Access modifiers changed, original: 0000 */
        public Set e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            f fVar = (f) obj;
            for (com.google.android.gms.internal.ae.a aVar : a.values()) {
                if (a(aVar)) {
                    if (!fVar.a(aVar)) {
                        return false;
                    }
                    if (!b(aVar).equals(fVar.b(aVar))) {
                        return false;
                    }
                } else if (fVar.a(aVar)) {
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

        public String h() {
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
                com.google.android.gms.internal.ae.a aVar = (com.google.android.gms.internal.ae.a) it.next();
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

        public String j() {
            return this.g;
        }

        public String k() {
            return this.h;
        }

        public boolean l() {
            return this.i;
        }

        public String m() {
            return this.j;
        }

        public String n() {
            return this.k;
        }

        public int o() {
            return this.l;
        }

        /* renamed from: p */
        public f a() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            bs bsVar = CREATOR;
            bs.a(this, parcel, i);
        }
    }

    public final class g extends ae implements SafeParcelable, i {
        public static final bt CREATOR = new bt();
        private static final HashMap a = new HashMap();
        private final Set b;
        private final int c;
        private boolean d;
        private String e;

        static {
            a.put("primary", com.google.android.gms.internal.ae.a.c("primary", 2));
            a.put("value", com.google.android.gms.internal.ae.a.d("value", 3));
        }

        public g() {
            this.c = 1;
            this.b = new HashSet();
        }

        g(Set set, int i, boolean z, String str) {
            this.b = set;
            this.c = i;
            this.d = z;
            this.e = str;
        }

        /* Access modifiers changed, original: protected */
        public Object a(String str) {
            return null;
        }

        /* Access modifiers changed, original: protected */
        public boolean a(com.google.android.gms.internal.ae.a aVar) {
            return this.b.contains(Integer.valueOf(aVar.g()));
        }

        /* Access modifiers changed, original: protected */
        public Object b(com.google.android.gms.internal.ae.a aVar) {
            switch (aVar.g()) {
                case e.MapAttrs_cameraTargetLat /*2*/:
                    return Boolean.valueOf(this.d);
                case e.MapAttrs_cameraTargetLng /*3*/:
                    return this.e;
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
            bt btVar = CREATOR;
            return 0;
        }

        /* Access modifiers changed, original: 0000 */
        public Set e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof g)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            g gVar = (g) obj;
            for (com.google.android.gms.internal.ae.a aVar : a.values()) {
                if (a(aVar)) {
                    if (!gVar.a(aVar)) {
                        return false;
                    }
                    if (!b(aVar).equals(gVar.b(aVar))) {
                        return false;
                    }
                } else if (gVar.a(aVar)) {
                    return false;
                }
            }
            return true;
        }

        /* Access modifiers changed, original: 0000 */
        public int f() {
            return this.c;
        }

        public boolean g() {
            return this.d;
        }

        public String h() {
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
                com.google.android.gms.internal.ae.a aVar = (com.google.android.gms.internal.ae.a) it.next();
                if (a(aVar)) {
                    i = b(aVar).hashCode() + (i2 + aVar.g());
                } else {
                    i = i2;
                }
            }
        }

        /* renamed from: i */
        public g a() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            bt btVar = CREATOR;
            bt.a(this, parcel, i);
        }
    }

    public final class h extends ae implements SafeParcelable, j {
        public static final bu CREATOR = new bu();
        private static final HashMap a = new HashMap();
        private final Set b;
        private final int c;
        private String d;
        private final int e;
        private int f;
        private String g;

        static {
            a.put("label", com.google.android.gms.internal.ae.a.d("label", 5));
            a.put("type", com.google.android.gms.internal.ae.a.a("type", 6, new ab().a("home", 0).a("work", 1).a("blog", 2).a("profile", 3).a("other", 4).a("otherProfile", 5).a("contributor", 6).a("website", 7), false));
            a.put("value", com.google.android.gms.internal.ae.a.d("value", 4));
        }

        public h() {
            this.e = 4;
            this.c = 2;
            this.b = new HashSet();
        }

        h(Set set, int i, String str, int i2, String str2, int i3) {
            this.e = 4;
            this.b = set;
            this.c = i;
            this.d = str;
            this.f = i2;
            this.g = str2;
        }

        /* Access modifiers changed, original: protected */
        public Object a(String str) {
            return null;
        }

        /* Access modifiers changed, original: protected */
        public boolean a(com.google.android.gms.internal.ae.a aVar) {
            return this.b.contains(Integer.valueOf(aVar.g()));
        }

        /* Access modifiers changed, original: protected */
        public Object b(com.google.android.gms.internal.ae.a aVar) {
            switch (aVar.g()) {
                case e.MapAttrs_cameraTilt /*4*/:
                    return this.g;
                case e.MapAttrs_cameraZoom /*5*/:
                    return this.d;
                case e.MapAttrs_uiCompass /*6*/:
                    return Integer.valueOf(this.f);
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
            bu buVar = CREATOR;
            return 0;
        }

        /* Access modifiers changed, original: 0000 */
        public Set e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof h)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            h hVar = (h) obj;
            for (com.google.android.gms.internal.ae.a aVar : a.values()) {
                if (a(aVar)) {
                    if (!hVar.a(aVar)) {
                        return false;
                    }
                    if (!b(aVar).equals(hVar.b(aVar))) {
                        return false;
                    }
                } else if (hVar.a(aVar)) {
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

        @Deprecated
        public int h() {
            return 4;
        }

        public int hashCode() {
            int i = 0;
            Iterator it = a.values().iterator();
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    return i2;
                }
                com.google.android.gms.internal.ae.a aVar = (com.google.android.gms.internal.ae.a) it.next();
                if (a(aVar)) {
                    i = b(aVar).hashCode() + (i2 + aVar.g());
                } else {
                    i = i2;
                }
            }
        }

        public int i() {
            return this.f;
        }

        public String j() {
            return this.g;
        }

        /* renamed from: k */
        public h a() {
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            bu buVar = CREATOR;
            bu.a(this, parcel, i);
        }
    }

    static {
        a.put("aboutMe", com.google.android.gms.internal.ae.a.d("aboutMe", 2));
        a.put("ageRange", com.google.android.gms.internal.ae.a.a("ageRange", 3, a.class));
        a.put("birthday", com.google.android.gms.internal.ae.a.d("birthday", 4));
        a.put("braggingRights", com.google.android.gms.internal.ae.a.d("braggingRights", 5));
        a.put("circledByCount", com.google.android.gms.internal.ae.a.a("circledByCount", 6));
        a.put("cover", com.google.android.gms.internal.ae.a.a("cover", 7, b.class));
        a.put("currentLocation", com.google.android.gms.internal.ae.a.d("currentLocation", 8));
        a.put("displayName", com.google.android.gms.internal.ae.a.d("displayName", 9));
        a.put("gender", com.google.android.gms.internal.ae.a.a("gender", 12, new ab().a("male", 0).a("female", 1).a("other", 2), false));
        a.put("id", com.google.android.gms.internal.ae.a.d("id", 14));
        a.put("image", com.google.android.gms.internal.ae.a.a("image", 15, c.class));
        a.put("isPlusUser", com.google.android.gms.internal.ae.a.c("isPlusUser", 16));
        a.put("language", com.google.android.gms.internal.ae.a.d("language", 18));
        a.put("name", com.google.android.gms.internal.ae.a.a("name", 19, d.class));
        a.put("nickname", com.google.android.gms.internal.ae.a.d("nickname", 20));
        a.put("objectType", com.google.android.gms.internal.ae.a.a("objectType", 21, new ab().a("person", 0).a("page", 1), false));
        a.put("organizations", com.google.android.gms.internal.ae.a.b("organizations", 22, f.class));
        a.put("placesLived", com.google.android.gms.internal.ae.a.b("placesLived", 23, g.class));
        a.put("plusOneCount", com.google.android.gms.internal.ae.a.a("plusOneCount", 24));
        a.put("relationshipStatus", com.google.android.gms.internal.ae.a.a("relationshipStatus", 25, new ab().a("single", 0).a("in_a_relationship", 1).a("engaged", 2).a("married", 3).a("its_complicated", 4).a("open_relationship", 5).a("widowed", 6).a("in_domestic_partnership", 7).a("in_civil_union", 8), false));
        a.put("tagline", com.google.android.gms.internal.ae.a.d("tagline", 26));
        a.put("url", com.google.android.gms.internal.ae.a.d("url", 27));
        a.put("urls", com.google.android.gms.internal.ae.a.b("urls", 28, h.class));
        a.put("verified", com.google.android.gms.internal.ae.a.c("verified", 29));
    }

    public cc() {
        this.c = 2;
        this.b = new HashSet();
    }

    cc(Set set, int i, String str, a aVar, String str2, String str3, int i2, b bVar, String str4, String str5, int i3, String str6, c cVar, boolean z, String str7, d dVar, String str8, int i4, List list, List list2, int i5, int i6, String str9, String str10, List list3, boolean z2) {
        this.b = set;
        this.c = i;
        this.d = str;
        this.e = aVar;
        this.f = str2;
        this.g = str3;
        this.h = i2;
        this.i = bVar;
        this.j = str4;
        this.k = str5;
        this.l = i3;
        this.m = str6;
        this.n = cVar;
        this.o = z;
        this.p = str7;
        this.q = dVar;
        this.r = str8;
        this.s = i4;
        this.t = list;
        this.u = list2;
        this.v = i5;
        this.w = i6;
        this.x = str9;
        this.y = str10;
        this.z = list3;
        this.A = z2;
    }

    public static cc a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        cc a = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return a;
    }

    public String A() {
        return this.x;
    }

    public String B() {
        return this.y;
    }

    /* Access modifiers changed, original: 0000 */
    public List C() {
        return this.z;
    }

    public boolean D() {
        return this.A;
    }

    /* renamed from: E */
    public cc a() {
        return this;
    }

    /* Access modifiers changed, original: protected */
    public Object a(String str) {
        return null;
    }

    /* Access modifiers changed, original: protected */
    public boolean a(com.google.android.gms.internal.ae.a aVar) {
        return this.b.contains(Integer.valueOf(aVar.g()));
    }

    /* Access modifiers changed, original: protected */
    public Object b(com.google.android.gms.internal.ae.a aVar) {
        switch (aVar.g()) {
            case e.MapAttrs_cameraTargetLat /*2*/:
                return this.d;
            case e.MapAttrs_cameraTargetLng /*3*/:
                return this.e;
            case e.MapAttrs_cameraTilt /*4*/:
                return this.f;
            case e.MapAttrs_cameraZoom /*5*/:
                return this.g;
            case e.MapAttrs_uiCompass /*6*/:
                return Integer.valueOf(this.h);
            case e.MapAttrs_uiRotateGestures /*7*/:
                return this.i;
            case e.MapAttrs_uiScrollGestures /*8*/:
                return this.j;
            case e.MapAttrs_uiTiltGestures /*9*/:
                return this.k;
            case e.MapAttrs_useViewLifecycle /*12*/:
                return Integer.valueOf(this.l);
            case 14:
                return this.m;
            case 15:
                return this.n;
            case 16:
                return Boolean.valueOf(this.o);
            case 18:
                return this.p;
            case 19:
                return this.q;
            case 20:
                return this.r;
            case 21:
                return Integer.valueOf(this.s);
            case 22:
                return this.t;
            case 23:
                return this.u;
            case 24:
                return Integer.valueOf(this.v);
            case 25:
                return Integer.valueOf(this.w);
            case 26:
                return this.x;
            case 27:
                return this.y;
            case 28:
                return this.z;
            case 29:
                return Boolean.valueOf(this.A);
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
        bl blVar = CREATOR;
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public Set e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof cc)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        cc ccVar = (cc) obj;
        for (com.google.android.gms.internal.ae.a aVar : a.values()) {
            if (a(aVar)) {
                if (!ccVar.a(aVar)) {
                    return false;
                }
                if (!b(aVar).equals(ccVar.b(aVar))) {
                    return false;
                }
            } else if (ccVar.a(aVar)) {
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
    public a h() {
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
            com.google.android.gms.internal.ae.a aVar = (com.google.android.gms.internal.ae.a) it.next();
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

    public String j() {
        return this.g;
    }

    public int k() {
        return this.h;
    }

    /* Access modifiers changed, original: 0000 */
    public b l() {
        return this.i;
    }

    public String m() {
        return this.j;
    }

    public String n() {
        return this.k;
    }

    public int o() {
        return this.l;
    }

    public String p() {
        return this.m;
    }

    /* Access modifiers changed, original: 0000 */
    public c q() {
        return this.n;
    }

    public boolean r() {
        return this.o;
    }

    public String s() {
        return this.p;
    }

    /* Access modifiers changed, original: 0000 */
    public d t() {
        return this.q;
    }

    public String u() {
        return this.r;
    }

    public int v() {
        return this.s;
    }

    /* Access modifiers changed, original: 0000 */
    public List w() {
        return this.t;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bl blVar = CREATOR;
        bl.a(this, parcel, i);
    }

    /* Access modifiers changed, original: 0000 */
    public List x() {
        return this.u;
    }

    public int y() {
        return this.v;
    }

    public int z() {
        return this.w;
    }
}
