package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.e;
import com.google.android.gms.internal.ab.a;

public class c implements Creator {
    static void a(a aVar, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, aVar.a);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, aVar.b, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, aVar.c);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, a);
    }

    /* renamed from: a */
    public a createFromParcel(Parcel parcel) {
        int i = 0;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case e.MapAttrs_cameraBearing /*1*/:
                    i2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    str = com.google.android.gms.common.internal.safeparcel.a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new a(i2, str, i);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public a[] newArray(int i) {
        return new a[i];
    }
}
