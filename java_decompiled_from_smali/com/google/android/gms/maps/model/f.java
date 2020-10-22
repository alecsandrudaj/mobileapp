package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;

public class f implements Creator {
    static void a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, latLngBounds.a());
        c.a(parcel, 2, latLngBounds.a, i, false);
        c.a(parcel, 3, latLngBounds.b, i, false);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public LatLngBounds createFromParcel(Parcel parcel) {
        LatLng latLng = null;
        int b = a.b(parcel);
        int i = 0;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < b) {
            int f;
            LatLng latLng3;
            int a = a.a(parcel);
            LatLng latLng4;
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing /*1*/:
                    latLng4 = latLng;
                    latLng = latLng2;
                    f = a.f(parcel, a);
                    latLng3 = latLng4;
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    f = i;
                    latLng4 = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    latLng3 = latLng;
                    latLng = latLng4;
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    latLng3 = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    latLng = latLng2;
                    f = i;
                    break;
                default:
                    a.b(parcel, a);
                    latLng3 = latLng;
                    latLng = latLng2;
                    f = i;
                    break;
            }
            i = f;
            latLng2 = latLng;
            latLng = latLng3;
        }
        if (parcel.dataPosition() == b) {
            return new LatLngBounds(i, latLng2, latLng);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public LatLngBounds[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
