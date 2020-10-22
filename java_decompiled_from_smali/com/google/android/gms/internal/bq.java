package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.e;
import com.google.android.gms.internal.cc.c;
import java.util.HashSet;
import java.util.Set;

public class bq implements Creator {
    static void a(c cVar, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
        Set e = cVar.e();
        if (e.contains(Integer.valueOf(1))) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, cVar.f());
        }
        if (e.contains(Integer.valueOf(2))) {
            com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, cVar.g(), true);
        }
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, a);
    }

    /* renamed from: a */
    public c createFromParcel(Parcel parcel) {
        int b = a.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing /*1*/:
                    i = a.f(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    str = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new c(hashSet, i, str);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public c[] newArray(int i) {
        return new c[i];
    }
}
