package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;

public class ap implements Creator {
    static void a(bi biVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, biVar.f(), false);
        c.a(parcel, 1000, biVar.a());
        c.a(parcel, 2, biVar.g());
        c.a(parcel, 3, biVar.b());
        c.a(parcel, 4, biVar.c());
        c.a(parcel, 5, biVar.d());
        c.a(parcel, 6, biVar.e());
        c.a(parcel, 7, biVar.h());
        c.a(parcel, a);
    }

    /* renamed from: a */
    public bi createFromParcel(Parcel parcel) {
        double d = 0.0d;
        short s = (short) 0;
        int b = a.b(parcel);
        String str = null;
        float f = 0.0f;
        long j = 0;
        double d2 = 0.0d;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing /*1*/:
                    str = a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    j = a.g(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    s = a.e(parcel, a);
                    break;
                case e.MapAttrs_cameraTilt /*4*/:
                    d2 = a.j(parcel, a);
                    break;
                case e.MapAttrs_cameraZoom /*5*/:
                    d = a.j(parcel, a);
                    break;
                case e.MapAttrs_uiCompass /*6*/:
                    f = a.i(parcel, a);
                    break;
                case e.MapAttrs_uiRotateGestures /*7*/:
                    i = a.f(parcel, a);
                    break;
                case 1000:
                    i2 = a.f(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new bi(i2, str, i, s, d2, d, f, j);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public bi[] newArray(int i) {
        return new bi[i];
    }
}
