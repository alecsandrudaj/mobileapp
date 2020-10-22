package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.maps.model.CameraPosition;

public class b implements Creator {
    static void a(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, googleMapOptions.a());
        c.a(parcel, 2, googleMapOptions.b());
        c.a(parcel, 3, googleMapOptions.c());
        c.a(parcel, 4, googleMapOptions.j());
        c.a(parcel, 5, googleMapOptions.k(), i, false);
        c.a(parcel, 6, googleMapOptions.d());
        c.a(parcel, 7, googleMapOptions.e());
        c.a(parcel, 8, googleMapOptions.f());
        c.a(parcel, 9, googleMapOptions.g());
        c.a(parcel, 10, googleMapOptions.h());
        c.a(parcel, 11, googleMapOptions.i());
        c.a(parcel, a);
    }

    /* renamed from: a */
    public GoogleMapOptions createFromParcel(Parcel parcel) {
        byte b = (byte) 0;
        int b2 = a.b(parcel);
        CameraPosition cameraPosition = null;
        byte b3 = (byte) 0;
        byte b4 = (byte) 0;
        byte b5 = (byte) 0;
        byte b6 = (byte) 0;
        byte b7 = (byte) 0;
        int i = 0;
        byte b8 = (byte) 0;
        byte b9 = (byte) 0;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing /*1*/:
                    i2 = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    b9 = a.d(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    b8 = a.d(parcel, a);
                    break;
                case e.MapAttrs_cameraTilt /*4*/:
                    i = a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraZoom /*5*/:
                    cameraPosition = (CameraPosition) a.a(parcel, a, CameraPosition.CREATOR);
                    break;
                case e.MapAttrs_uiCompass /*6*/:
                    b7 = a.d(parcel, a);
                    break;
                case e.MapAttrs_uiRotateGestures /*7*/:
                    b6 = a.d(parcel, a);
                    break;
                case e.MapAttrs_uiScrollGestures /*8*/:
                    b5 = a.d(parcel, a);
                    break;
                case e.MapAttrs_uiTiltGestures /*9*/:
                    b4 = a.d(parcel, a);
                    break;
                case e.MapAttrs_uiZoomControls /*10*/:
                    b3 = a.d(parcel, a);
                    break;
                case e.MapAttrs_uiZoomGestures /*11*/:
                    b = a.d(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b2) {
            return new GoogleMapOptions(i2, b9, b8, i, cameraPosition, b7, b6, b5, b4, b3, b);
        }
        throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + b2, parcel);
    }

    /* renamed from: a */
    public GoogleMapOptions[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
