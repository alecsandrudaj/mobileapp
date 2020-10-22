package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.ae.a;

public class e implements Creator {
    static void a(a aVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, aVar.a());
        c.a(parcel, 2, aVar.b());
        c.a(parcel, 3, aVar.c());
        c.a(parcel, 4, aVar.d());
        c.a(parcel, 5, aVar.e());
        c.a(parcel, 6, aVar.f(), false);
        c.a(parcel, 7, aVar.g());
        c.a(parcel, 8, aVar.i(), false);
        c.a(parcel, 9, aVar.k(), i, false);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public a createFromParcel(Parcel parcel) {
        z zVar = null;
        int i = 0;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String str = null;
        String str2 = null;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                    i4 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLat /*2*/:
                    i3 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTargetLng /*3*/:
                    z2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraTilt /*4*/:
                    i2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_cameraZoom /*5*/:
                    z = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiCompass /*6*/:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiRotateGestures /*7*/:
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiScrollGestures /*8*/:
                    str = com.google.android.gms.common.internal.safeparcel.a.l(parcel, a);
                    break;
                case com.google.android.gms.e.MapAttrs_uiTiltGestures /*9*/:
                    zVar = (z) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, z.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new a(i4, i3, z2, i2, z, str2, i, str, zVar);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public a[] newArray(int i) {
        return new a[i];
    }
}
