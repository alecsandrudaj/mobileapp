package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.internal.cc.b;
import com.google.android.gms.internal.cc.d;
import com.google.android.gms.internal.cc.f;
import com.google.android.gms.internal.cc.g;
import com.google.android.gms.internal.cc.h;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class bl implements Creator {
    static void a(cc ccVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        Set e = ccVar.e();
        if (e.contains(Integer.valueOf(1))) {
            c.a(parcel, 1, ccVar.f());
        }
        if (e.contains(Integer.valueOf(2))) {
            c.a(parcel, 2, ccVar.g(), true);
        }
        if (e.contains(Integer.valueOf(3))) {
            c.a(parcel, 3, ccVar.h(), i, true);
        }
        if (e.contains(Integer.valueOf(4))) {
            c.a(parcel, 4, ccVar.i(), true);
        }
        if (e.contains(Integer.valueOf(5))) {
            c.a(parcel, 5, ccVar.j(), true);
        }
        if (e.contains(Integer.valueOf(6))) {
            c.a(parcel, 6, ccVar.k());
        }
        if (e.contains(Integer.valueOf(7))) {
            c.a(parcel, 7, ccVar.l(), i, true);
        }
        if (e.contains(Integer.valueOf(8))) {
            c.a(parcel, 8, ccVar.m(), true);
        }
        if (e.contains(Integer.valueOf(9))) {
            c.a(parcel, 9, ccVar.n(), true);
        }
        if (e.contains(Integer.valueOf(12))) {
            c.a(parcel, 12, ccVar.o());
        }
        if (e.contains(Integer.valueOf(14))) {
            c.a(parcel, 14, ccVar.p(), true);
        }
        if (e.contains(Integer.valueOf(15))) {
            c.a(parcel, 15, ccVar.q(), i, true);
        }
        if (e.contains(Integer.valueOf(16))) {
            c.a(parcel, 16, ccVar.r());
        }
        if (e.contains(Integer.valueOf(19))) {
            c.a(parcel, 19, ccVar.t(), i, true);
        }
        if (e.contains(Integer.valueOf(18))) {
            c.a(parcel, 18, ccVar.s(), true);
        }
        if (e.contains(Integer.valueOf(21))) {
            c.a(parcel, 21, ccVar.v());
        }
        if (e.contains(Integer.valueOf(20))) {
            c.a(parcel, 20, ccVar.u(), true);
        }
        if (e.contains(Integer.valueOf(23))) {
            c.b(parcel, 23, ccVar.x(), true);
        }
        if (e.contains(Integer.valueOf(22))) {
            c.b(parcel, 22, ccVar.w(), true);
        }
        if (e.contains(Integer.valueOf(25))) {
            c.a(parcel, 25, ccVar.z());
        }
        if (e.contains(Integer.valueOf(24))) {
            c.a(parcel, 24, ccVar.y());
        }
        if (e.contains(Integer.valueOf(27))) {
            c.a(parcel, 27, ccVar.B(), true);
        }
        if (e.contains(Integer.valueOf(26))) {
            c.a(parcel, 26, ccVar.A(), true);
        }
        if (e.contains(Integer.valueOf(29))) {
            c.a(parcel, 29, ccVar.D());
        }
        if (e.contains(Integer.valueOf(28))) {
            c.b(parcel, 28, ccVar.C(), true);
        }
        c.a(parcel, a);
    }

    /* renamed from: a */
    public cc createFromParcel(Parcel parcel) {
        int b = a.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        cc.a aVar = null;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        b bVar = null;
        String str4 = null;
        String str5 = null;
        int i3 = 0;
        String str6 = null;
        cc.c cVar = null;
        boolean z = false;
        String str7 = null;
        d dVar = null;
        String str8 = null;
        int i4 = 0;
        List list = null;
        List list2 = null;
        int i5 = 0;
        int i6 = 0;
        String str9 = null;
        String str10 = null;
        List list3 = null;
        boolean z2 = false;
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
                case e.MapAttrs_cameraTargetLng /*3*/:
                    cc.a aVar2 = (cc.a) a.a(parcel, a, cc.a.CREATOR);
                    hashSet.add(Integer.valueOf(3));
                    aVar = aVar2;
                    break;
                case e.MapAttrs_cameraTilt /*4*/:
                    str2 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case e.MapAttrs_cameraZoom /*5*/:
                    str3 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case e.MapAttrs_uiCompass /*6*/:
                    i2 = a.f(parcel, a);
                    hashSet.add(Integer.valueOf(6));
                    break;
                case e.MapAttrs_uiRotateGestures /*7*/:
                    b bVar2 = (b) a.a(parcel, a, b.CREATOR);
                    hashSet.add(Integer.valueOf(7));
                    bVar = bVar2;
                    break;
                case e.MapAttrs_uiScrollGestures /*8*/:
                    str4 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(8));
                    break;
                case e.MapAttrs_uiTiltGestures /*9*/:
                    str5 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(9));
                    break;
                case e.MapAttrs_useViewLifecycle /*12*/:
                    i3 = a.f(parcel, a);
                    hashSet.add(Integer.valueOf(12));
                    break;
                case 14:
                    str6 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(14));
                    break;
                case 15:
                    cc.c cVar2 = (cc.c) a.a(parcel, a, cc.c.CREATOR);
                    hashSet.add(Integer.valueOf(15));
                    cVar = cVar2;
                    break;
                case 16:
                    z = a.c(parcel, a);
                    hashSet.add(Integer.valueOf(16));
                    break;
                case 18:
                    str7 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(18));
                    break;
                case 19:
                    d dVar2 = (d) a.a(parcel, a, (Creator) d.CREATOR);
                    hashSet.add(Integer.valueOf(19));
                    dVar = dVar2;
                    break;
                case 20:
                    str8 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(20));
                    break;
                case 21:
                    i4 = a.f(parcel, a);
                    hashSet.add(Integer.valueOf(21));
                    break;
                case 22:
                    list = a.c(parcel, a, f.CREATOR);
                    hashSet.add(Integer.valueOf(22));
                    break;
                case 23:
                    list2 = a.c(parcel, a, g.CREATOR);
                    hashSet.add(Integer.valueOf(23));
                    break;
                case 24:
                    i5 = a.f(parcel, a);
                    hashSet.add(Integer.valueOf(24));
                    break;
                case 25:
                    i6 = a.f(parcel, a);
                    hashSet.add(Integer.valueOf(25));
                    break;
                case 26:
                    str9 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(26));
                    break;
                case 27:
                    str10 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(27));
                    break;
                case 28:
                    list3 = a.c(parcel, a, h.CREATOR);
                    hashSet.add(Integer.valueOf(28));
                    break;
                case 29:
                    z2 = a.c(parcel, a);
                    hashSet.add(Integer.valueOf(29));
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new cc(hashSet, i, str, aVar, str2, str3, i2, bVar, str4, str5, i3, str6, cVar, z, str7, dVar, str8, i4, list, list2, i5, i6, str9, str10, list3, z2);
        }
        throw new com.google.android.gms.common.internal.safeparcel.b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public cc[] newArray(int i) {
        return new cc[i];
    }
}
