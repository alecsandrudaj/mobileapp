package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.e;
import com.google.android.gms.maps.a.bk;
import com.google.android.gms.maps.a.v;
import com.google.android.gms.maps.model.CameraPosition;

public final class GoogleMapOptions implements SafeParcelable {
    public static final b CREATOR = new b();
    private final int a;
    private Boolean b;
    private Boolean c;
    private int d;
    private CameraPosition e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;

    public GoogleMapOptions() {
        this.d = -1;
        this.a = 1;
    }

    GoogleMapOptions(int i, byte b, byte b2, int i2, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        this.d = -1;
        this.a = i;
        this.b = v.a(b);
        this.c = v.a(b2);
        this.d = i2;
        this.e = cameraPosition;
        this.f = v.a(b3);
        this.g = v.a(b4);
        this.h = v.a(b5);
        this.i = v.a(b6);
        this.j = v.a(b7);
        this.k = v.a(b8);
    }

    public static GoogleMapOptions a(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, e.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(0)) {
            googleMapOptions.a(obtainAttributes.getInt(0, -1));
        }
        if (obtainAttributes.hasValue(13)) {
            googleMapOptions.a(obtainAttributes.getBoolean(13, false));
        }
        if (obtainAttributes.hasValue(12)) {
            googleMapOptions.b(obtainAttributes.getBoolean(12, false));
        }
        if (obtainAttributes.hasValue(6)) {
            googleMapOptions.d(obtainAttributes.getBoolean(6, true));
        }
        if (obtainAttributes.hasValue(7)) {
            googleMapOptions.h(obtainAttributes.getBoolean(7, true));
        }
        if (obtainAttributes.hasValue(8)) {
            googleMapOptions.e(obtainAttributes.getBoolean(8, true));
        }
        if (obtainAttributes.hasValue(9)) {
            googleMapOptions.g(obtainAttributes.getBoolean(9, true));
        }
        if (obtainAttributes.hasValue(11)) {
            googleMapOptions.f(obtainAttributes.getBoolean(11, true));
        }
        if (obtainAttributes.hasValue(10)) {
            googleMapOptions.c(obtainAttributes.getBoolean(10, true));
        }
        googleMapOptions.a(CameraPosition.a(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    /* Access modifiers changed, original: 0000 */
    public int a() {
        return this.a;
    }

    public GoogleMapOptions a(int i) {
        this.d = i;
        return this;
    }

    public GoogleMapOptions a(CameraPosition cameraPosition) {
        this.e = cameraPosition;
        return this;
    }

    public GoogleMapOptions a(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public byte b() {
        return v.a(this.b);
    }

    public GoogleMapOptions b(boolean z) {
        this.c = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public byte c() {
        return v.a(this.c);
    }

    public GoogleMapOptions c(boolean z) {
        this.f = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public byte d() {
        return v.a(this.f);
    }

    public GoogleMapOptions d(boolean z) {
        this.g = Boolean.valueOf(z);
        return this;
    }

    public int describeContents() {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public byte e() {
        return v.a(this.g);
    }

    public GoogleMapOptions e(boolean z) {
        this.h = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public byte f() {
        return v.a(this.h);
    }

    public GoogleMapOptions f(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public byte g() {
        return v.a(this.i);
    }

    public GoogleMapOptions g(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public byte h() {
        return v.a(this.j);
    }

    public GoogleMapOptions h(boolean z) {
        this.k = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public byte i() {
        return v.a(this.k);
    }

    public int j() {
        return this.d;
    }

    public CameraPosition k() {
        return this.e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (bk.a()) {
            e.a(this, parcel, i);
        } else {
            b.a(this, parcel, i);
        }
    }
}
