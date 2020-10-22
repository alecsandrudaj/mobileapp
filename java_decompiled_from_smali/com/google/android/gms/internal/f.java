package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.internal.ae.a;
import com.google.android.gms.internal.ah.b;

public class f implements Creator {
    static void a(b bVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, bVar.a);
        c.a(parcel, 2, bVar.b, false);
        c.a(parcel, 3, bVar.c, i, false);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public b createFromParcel(Parcel parcel) {
        a aVar = null;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case e.MapAttrs_cameraBearing /*1*/:
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    str = com.google.android.gms.common.internal.safeparcel.a.l(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    aVar = (a) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, a.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new b(i, str, aVar);
        }
        throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public b[] newArray(int i) {
        return new b[i];
    }
}
