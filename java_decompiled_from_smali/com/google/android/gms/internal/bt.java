package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.internal.cc.g;
import java.util.HashSet;
import java.util.Set;

public class bt implements Creator {
    static void a(g gVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        Set e = gVar.e();
        if (e.contains(Integer.valueOf(1))) {
            c.a(parcel, 1, gVar.f());
        }
        if (e.contains(Integer.valueOf(2))) {
            c.a(parcel, 2, gVar.g());
        }
        if (e.contains(Integer.valueOf(3))) {
            c.a(parcel, 3, gVar.h(), true);
        }
        c.a(parcel, a);
    }

    /* renamed from: a */
    public g createFromParcel(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing /*1*/:
                    i = a.f(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    z = a.c(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    str = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new g(hashSet, i, z, str);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public g[] newArray(int i) {
        return new g[i];
    }
}
