package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import java.util.HashSet;
import java.util.Set;

public class bk implements Creator {
    static void a(bz bzVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        Set e = bzVar.e();
        if (e.contains(Integer.valueOf(1))) {
            c.a(parcel, 1, bzVar.f());
        }
        if (e.contains(Integer.valueOf(2))) {
            c.a(parcel, 2, bzVar.g(), true);
        }
        if (e.contains(Integer.valueOf(4))) {
            c.a(parcel, 4, bzVar.h(), i, true);
        }
        if (e.contains(Integer.valueOf(5))) {
            c.a(parcel, 5, bzVar.i(), true);
        }
        if (e.contains(Integer.valueOf(6))) {
            c.a(parcel, 6, bzVar.j(), i, true);
        }
        if (e.contains(Integer.valueOf(7))) {
            c.a(parcel, 7, bzVar.k(), true);
        }
        c.a(parcel, a);
    }

    /* renamed from: a */
    public bz createFromParcel(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        bx bxVar = null;
        String str2 = null;
        bx bxVar2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            bx bxVar3;
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing /*1*/:
                    i = a.f(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    str3 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case e.MapAttrs_cameraTilt /*4*/:
                    bxVar3 = (bx) a.a(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(4));
                    bxVar2 = bxVar3;
                    break;
                case e.MapAttrs_cameraZoom /*5*/:
                    str2 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case e.MapAttrs_uiCompass /*6*/:
                    bxVar3 = (bx) a.a(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(6));
                    bxVar = bxVar3;
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
            return new bz(hashSet, i, str3, bxVar2, str2, bxVar, str);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public bz[] newArray(int i) {
        return new bz[i];
    }
}
