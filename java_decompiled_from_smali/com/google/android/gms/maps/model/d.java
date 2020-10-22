package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;

public class d implements Creator {
    static void a(CircleOptions circleOptions, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, circleOptions.a());
        c.a(parcel, 2, circleOptions.b(), i, false);
        c.a(parcel, 3, circleOptions.c());
        c.a(parcel, 4, circleOptions.d());
        c.a(parcel, 5, circleOptions.e());
        c.a(parcel, 6, circleOptions.f());
        c.a(parcel, 7, circleOptions.g());
        c.a(parcel, 8, circleOptions.h());
        c.a(parcel, a);
    }

    /* renamed from: a */
    public CircleOptions createFromParcel(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int b = a.b(parcel);
        LatLng latLng = null;
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing /*1*/:
                    i3 = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    latLng = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    d = a.j(parcel, a);
                    break;
                case e.MapAttrs_cameraTilt /*4*/:
                    f2 = a.i(parcel, a);
                    break;
                case e.MapAttrs_cameraZoom /*5*/:
                    i2 = a.f(parcel, a);
                    break;
                case e.MapAttrs_uiCompass /*6*/:
                    i = a.f(parcel, a);
                    break;
                case e.MapAttrs_uiRotateGestures /*7*/:
                    f = a.i(parcel, a);
                    break;
                case e.MapAttrs_uiScrollGestures /*8*/:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CircleOptions(i3, latLng, d, f2, i2, i, f, z);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public CircleOptions[] newArray(int i) {
        return new CircleOptions[i];
    }
}
