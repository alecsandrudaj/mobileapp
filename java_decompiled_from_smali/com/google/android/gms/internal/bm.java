package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.internal.cc.a;
import java.util.HashSet;
import java.util.Set;

public class bm implements Creator {
    static void a(a aVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        Set e = aVar.e();
        if (e.contains(Integer.valueOf(1))) {
            c.a(parcel, 1, aVar.f());
        }
        if (e.contains(Integer.valueOf(2))) {
            c.a(parcel, 2, aVar.g());
        }
        if (e.contains(Integer.valueOf(3))) {
            c.a(parcel, 3, aVar.h());
        }
        c.a(parcel, a);
    }

    /* renamed from: a */
    public a createFromParcel(Parcel parcel) {
        int i = 0;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case e.MapAttrs_cameraBearing /*1*/:
                    i3 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    i2 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new a(hashSet, i3, i2, i);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public a[] newArray(int i) {
        return new a[i];
    }
}
