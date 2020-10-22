package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.e;

public class c implements Creator {
    static void a(CameraPosition cameraPosition, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, cameraPosition.a());
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, cameraPosition.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, cameraPosition.b);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, cameraPosition.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, cameraPosition.d);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, a);
    }

    /* renamed from: a */
    public CameraPosition createFromParcel(Parcel parcel) {
        float f = 0.0f;
        int b = a.b(parcel);
        int i = 0;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing /*1*/:
                    i = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    latLng = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    f3 = a.i(parcel, a);
                    break;
                case e.MapAttrs_cameraTilt /*4*/:
                    f2 = a.i(parcel, a);
                    break;
                case e.MapAttrs_cameraZoom /*5*/:
                    f = a.i(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CameraPosition(i, latLng, f3, f2, f);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public CameraPosition[] newArray(int i) {
        return new CameraPosition[i];
    }
}
