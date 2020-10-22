package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.internal.ah.a;
import com.google.android.gms.internal.ah.b;
import java.util.ArrayList;

public class h implements Creator {
    static void a(a aVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, aVar.a);
        c.a(parcel, 2, aVar.b, false);
        c.b(parcel, 3, aVar.c, false);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public a createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
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
                    arrayList = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, b.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new a(i, str, arrayList);
        }
        throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public a[] newArray(int i) {
        return new a[i];
    }
}
