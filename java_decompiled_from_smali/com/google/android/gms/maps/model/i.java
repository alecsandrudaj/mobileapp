package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import java.util.ArrayList;
import java.util.List;

public class i implements Creator {
    static void a(PolygonOptions polygonOptions, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, polygonOptions.a());
        c.b(parcel, 2, polygonOptions.c(), false);
        c.c(parcel, 3, polygonOptions.b(), false);
        c.a(parcel, 4, polygonOptions.d());
        c.a(parcel, 5, polygonOptions.e());
        c.a(parcel, 6, polygonOptions.f());
        c.a(parcel, 7, polygonOptions.g());
        c.a(parcel, 8, polygonOptions.h());
        c.a(parcel, 9, polygonOptions.i());
        c.a(parcel, a);
    }

    /* renamed from: a */
    public PolygonOptions createFromParcel(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int b = a.b(parcel);
        List list = null;
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
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
                    list = a.c(parcel, a, LatLng.CREATOR);
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    a.a(parcel, a, arrayList, getClass().getClassLoader());
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
                    z2 = a.c(parcel, a);
                    break;
                case e.MapAttrs_uiTiltGestures /*9*/:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PolygonOptions(i3, list, arrayList, f2, i2, i, f, z2, z);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public PolygonOptions[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
