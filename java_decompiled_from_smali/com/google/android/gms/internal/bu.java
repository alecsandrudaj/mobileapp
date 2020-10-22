package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.internal.cc.h;
import java.util.HashSet;
import java.util.Set;

public class bu implements Creator {
    static void a(h hVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        Set e = hVar.e();
        if (e.contains(Integer.valueOf(1))) {
            c.a(parcel, 1, hVar.f());
        }
        if (e.contains(Integer.valueOf(3))) {
            c.a(parcel, 3, hVar.h());
        }
        if (e.contains(Integer.valueOf(4))) {
            c.a(parcel, 4, hVar.j(), true);
        }
        if (e.contains(Integer.valueOf(5))) {
            c.a(parcel, 5, hVar.g(), true);
        }
        if (e.contains(Integer.valueOf(6))) {
            c.a(parcel, 6, hVar.i());
        }
        c.a(parcel, a);
    }

    /* renamed from: a */
    public h createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = a.b(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing /*1*/:
                    i3 = a.f(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    i = a.f(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case e.MapAttrs_cameraTilt /*4*/:
                    str = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case e.MapAttrs_cameraZoom /*5*/:
                    str2 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case e.MapAttrs_uiCompass /*6*/:
                    i2 = a.f(parcel, a);
                    hashSet.add(Integer.valueOf(6));
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new h(hashSet, i3, str2, i2, str, i);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public h[] newArray(int i) {
        return new h[i];
    }
}
