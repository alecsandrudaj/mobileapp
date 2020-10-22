package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.internal.cc.b;
import java.util.HashSet;
import java.util.Set;

public class bn implements Creator {
    static void a(b bVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        Set e = bVar.e();
        if (e.contains(Integer.valueOf(1))) {
            c.a(parcel, 1, bVar.f());
        }
        if (e.contains(Integer.valueOf(2))) {
            c.a(parcel, 2, bVar.g(), i, true);
        }
        if (e.contains(Integer.valueOf(3))) {
            c.a(parcel, 3, bVar.h(), i, true);
        }
        if (e.contains(Integer.valueOf(4))) {
            c.a(parcel, 4, bVar.i());
        }
        c.a(parcel, a);
    }

    /* renamed from: a */
    public b createFromParcel(Parcel parcel) {
        b.b bVar = null;
        int i = 0;
        int b = a.b(parcel);
        HashSet hashSet = new HashSet();
        b.a aVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing /*1*/:
                    i2 = a.f(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    b.a aVar2 = (b.a) a.a(parcel, a, b.a.CREATOR);
                    hashSet.add(Integer.valueOf(2));
                    aVar = aVar2;
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    b.b bVar2 = (b.b) a.a(parcel, a, b.b.CREATOR);
                    hashSet.add(Integer.valueOf(3));
                    bVar = bVar2;
                    break;
                case e.MapAttrs_cameraTilt /*4*/:
                    i = a.f(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new b(hashSet, i2, aVar, bVar, i);
        }
        throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public b[] newArray(int i) {
        return new b[i];
    }
}
