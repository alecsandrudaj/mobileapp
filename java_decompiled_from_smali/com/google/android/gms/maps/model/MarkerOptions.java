package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.f;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.bk;

public final class MarkerOptions implements SafeParcelable {
    public static final h CREATOR = new h();
    private final int a;
    private LatLng b;
    private String c;
    private String d;
    private a e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;
    private boolean j;
    private float k;
    private float l;
    private float m;

    public MarkerOptions() {
        this.f = 0.5f;
        this.g = 1.0f;
        this.i = true;
        this.j = false;
        this.k = 0.0f;
        this.l = 0.5f;
        this.m = 0.0f;
        this.a = 1;
    }

    MarkerOptions(int i, LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5) {
        this.f = 0.5f;
        this.g = 1.0f;
        this.i = true;
        this.j = false;
        this.k = 0.0f;
        this.l = 0.5f;
        this.m = 0.0f;
        this.a = i;
        this.b = latLng;
        this.c = str;
        this.d = str2;
        this.e = iBinder == null ? null : new a(f.a(iBinder));
        this.f = f;
        this.g = f2;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = f3;
        this.l = f4;
        this.m = f5;
    }

    /* Access modifiers changed, original: 0000 */
    public int a() {
        return this.a;
    }

    /* Access modifiers changed, original: 0000 */
    public IBinder b() {
        return this.e == null ? null : this.e.a().asBinder();
    }

    public LatLng c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.d;
    }

    public float f() {
        return this.f;
    }

    public float g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public boolean i() {
        return this.i;
    }

    public boolean j() {
        return this.j;
    }

    public float k() {
        return this.k;
    }

    public float l() {
        return this.l;
    }

    public float m() {
        return this.m;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (bk.a()) {
            v.a(this, parcel, i);
        } else {
            h.a(this, parcel, i);
        }
    }
}
