package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;

public class p implements Creator {
    static void a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, visibleRegion.a());
        c.a(parcel, 2, visibleRegion.a, i, false);
        c.a(parcel, 3, visibleRegion.b, i, false);
        c.a(parcel, 4, visibleRegion.c, i, false);
        c.a(parcel, 5, visibleRegion.d, i, false);
        c.a(parcel, 6, visibleRegion.e, i, false);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public VisibleRegion createFromParcel(Parcel parcel) {
        LatLngBounds latLngBounds = null;
        int b = a.b(parcel);
        int i = 0;
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing /*1*/:
                    i = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    latLng4 = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    latLng3 = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    break;
                case e.MapAttrs_cameraTilt /*4*/:
                    latLng2 = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    break;
                case e.MapAttrs_cameraZoom /*5*/:
                    latLng = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    break;
                case e.MapAttrs_uiCompass /*6*/:
                    latLngBounds = (LatLngBounds) a.a(parcel, a, LatLngBounds.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new VisibleRegion(i, latLng4, latLng3, latLng2, latLng, latLngBounds);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public VisibleRegion[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
