package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public class e implements Creator {
    static void a(GroundOverlayOptions groundOverlayOptions, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, groundOverlayOptions.b());
        c.a(parcel, 2, groundOverlayOptions.a(), false);
        c.a(parcel, 3, groundOverlayOptions.c(), i, false);
        c.a(parcel, 4, groundOverlayOptions.d());
        c.a(parcel, 5, groundOverlayOptions.e());
        c.a(parcel, 6, groundOverlayOptions.f(), i, false);
        c.a(parcel, 7, groundOverlayOptions.g());
        c.a(parcel, 8, groundOverlayOptions.h());
        c.a(parcel, 9, groundOverlayOptions.l());
        c.a(parcel, 10, groundOverlayOptions.i());
        c.a(parcel, 11, groundOverlayOptions.j());
        c.a(parcel, 12, groundOverlayOptions.k());
        c.a(parcel, a);
    }

    /* renamed from: a */
    public GroundOverlayOptions createFromParcel(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        IBinder iBinder = null;
        LatLng latLng = null;
        float f = 0.0f;
        float f2 = 0.0f;
        LatLngBounds latLngBounds = null;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                    i = a.f(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /*2*/:
                    iBinder = a.m(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /*3*/:
                    latLng = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /*4*/:
                    f = a.i(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /*5*/:
                    f2 = a.i(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /*6*/:
                    latLngBounds = (LatLngBounds) a.a(parcel, a, LatLngBounds.CREATOR);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /*7*/:
                    f3 = a.i(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiScrollGestures /*8*/:
                    f4 = a.i(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiTiltGestures /*9*/:
                    z = a.c(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiZoomControls /*10*/:
                    f5 = a.i(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiZoomGestures /*11*/:
                    f6 = a.i(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_useViewLifecycle /*12*/:
                    f7 = a.i(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GroundOverlayOptions(i, iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public GroundOverlayOptions[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
