package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.internal.cc.d;
import java.util.HashSet;
import java.util.Set;

public class br implements Creator {
    static void a(d dVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        Set e = dVar.e();
        if (e.contains(Integer.valueOf(1))) {
            c.a(parcel, 1, dVar.f());
        }
        if (e.contains(Integer.valueOf(2))) {
            c.a(parcel, 2, dVar.g(), true);
        }
        if (e.contains(Integer.valueOf(3))) {
            c.a(parcel, 3, dVar.h(), true);
        }
        if (e.contains(Integer.valueOf(4))) {
            c.a(parcel, 4, dVar.i(), true);
        }
        if (e.contains(Integer.valueOf(5))) {
            c.a(parcel, 5, dVar.j(), true);
        }
        if (e.contains(Integer.valueOf(6))) {
            c.a(parcel, 6, dVar.k(), true);
        }
        if (e.contains(Integer.valueOf(7))) {
            c.a(parcel, 7, dVar.l(), true);
        }
        c.a(parcel, a);
    }

    /* renamed from: a */
    public d createFromParcel(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing /*1*/:
                    i = a.f(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    str6 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    str5 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case e.MapAttrs_cameraTilt /*4*/:
                    str4 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case e.MapAttrs_cameraZoom /*5*/:
                    str3 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case e.MapAttrs_uiCompass /*6*/:
                    str2 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(6));
                    break;
                case e.MapAttrs_uiRotateGestures /*7*/:
                    str = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(7));
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new d(hashSet, i, str6, str5, str4, str3, str2, str);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public d[] newArray(int i) {
        return new d[i];
    }
}
