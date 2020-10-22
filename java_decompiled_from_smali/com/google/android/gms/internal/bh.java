package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class bh implements Creator {
    static void a(bx bxVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        Set e = bxVar.e();
        if (e.contains(Integer.valueOf(1))) {
            c.a(parcel, 1, bxVar.f());
        }
        if (e.contains(Integer.valueOf(2))) {
            c.a(parcel, 2, bxVar.g(), i, true);
        }
        if (e.contains(Integer.valueOf(3))) {
            c.a(parcel, 3, bxVar.h(), true);
        }
        if (e.contains(Integer.valueOf(4))) {
            c.a(parcel, 4, bxVar.i(), i, true);
        }
        if (e.contains(Integer.valueOf(5))) {
            c.a(parcel, 5, bxVar.j(), true);
        }
        if (e.contains(Integer.valueOf(6))) {
            c.a(parcel, 6, bxVar.k(), true);
        }
        if (e.contains(Integer.valueOf(7))) {
            c.a(parcel, 7, bxVar.l(), true);
        }
        if (e.contains(Integer.valueOf(8))) {
            c.b(parcel, 8, bxVar.m(), true);
        }
        if (e.contains(Integer.valueOf(9))) {
            c.a(parcel, 9, bxVar.n());
        }
        if (e.contains(Integer.valueOf(10))) {
            c.b(parcel, 10, bxVar.o(), true);
        }
        if (e.contains(Integer.valueOf(11))) {
            c.a(parcel, 11, bxVar.p(), i, true);
        }
        if (e.contains(Integer.valueOf(12))) {
            c.b(parcel, 12, bxVar.q(), true);
        }
        if (e.contains(Integer.valueOf(13))) {
            c.a(parcel, 13, bxVar.r(), true);
        }
        if (e.contains(Integer.valueOf(14))) {
            c.a(parcel, 14, bxVar.s(), true);
        }
        if (e.contains(Integer.valueOf(15))) {
            c.a(parcel, 15, bxVar.t(), i, true);
        }
        if (e.contains(Integer.valueOf(17))) {
            c.a(parcel, 17, bxVar.v(), true);
        }
        if (e.contains(Integer.valueOf(16))) {
            c.a(parcel, 16, bxVar.u(), true);
        }
        if (e.contains(Integer.valueOf(19))) {
            c.b(parcel, 19, bxVar.x(), true);
        }
        if (e.contains(Integer.valueOf(18))) {
            c.a(parcel, 18, bxVar.w(), true);
        }
        if (e.contains(Integer.valueOf(21))) {
            c.a(parcel, 21, bxVar.z(), true);
        }
        if (e.contains(Integer.valueOf(20))) {
            c.a(parcel, 20, bxVar.y(), true);
        }
        if (e.contains(Integer.valueOf(23))) {
            c.a(parcel, 23, bxVar.B(), true);
        }
        if (e.contains(Integer.valueOf(22))) {
            c.a(parcel, 22, bxVar.A(), true);
        }
        if (e.contains(Integer.valueOf(25))) {
            c.a(parcel, 25, bxVar.D(), true);
        }
        if (e.contains(Integer.valueOf(24))) {
            c.a(parcel, 24, bxVar.C(), true);
        }
        if (e.contains(Integer.valueOf(27))) {
            c.a(parcel, 27, bxVar.F(), true);
        }
        if (e.contains(Integer.valueOf(26))) {
            c.a(parcel, 26, bxVar.E(), true);
        }
        if (e.contains(Integer.valueOf(29))) {
            c.a(parcel, 29, bxVar.H(), i, true);
        }
        if (e.contains(Integer.valueOf(28))) {
            c.a(parcel, 28, bxVar.G(), true);
        }
        if (e.contains(Integer.valueOf(31))) {
            c.a(parcel, 31, bxVar.J(), true);
        }
        if (e.contains(Integer.valueOf(30))) {
            c.a(parcel, 30, bxVar.I(), true);
        }
        if (e.contains(Integer.valueOf(34))) {
            c.a(parcel, 34, bxVar.M(), i, true);
        }
        if (e.contains(Integer.valueOf(32))) {
            c.a(parcel, 32, bxVar.K(), true);
        }
        if (e.contains(Integer.valueOf(33))) {
            c.a(parcel, 33, bxVar.L(), true);
        }
        if (e.contains(Integer.valueOf(38))) {
            c.a(parcel, 38, bxVar.P());
        }
        if (e.contains(Integer.valueOf(39))) {
            c.a(parcel, 39, bxVar.Q(), true);
        }
        if (e.contains(Integer.valueOf(36))) {
            c.a(parcel, 36, bxVar.N());
        }
        if (e.contains(Integer.valueOf(37))) {
            c.a(parcel, 37, bxVar.O(), i, true);
        }
        if (e.contains(Integer.valueOf(42))) {
            c.a(parcel, 42, bxVar.T(), true);
        }
        if (e.contains(Integer.valueOf(43))) {
            c.a(parcel, 43, bxVar.U(), true);
        }
        if (e.contains(Integer.valueOf(40))) {
            c.a(parcel, 40, bxVar.R(), i, true);
        }
        if (e.contains(Integer.valueOf(41))) {
            c.b(parcel, 41, bxVar.S(), true);
        }
        if (e.contains(Integer.valueOf(46))) {
            c.a(parcel, 46, bxVar.X(), i, true);
        }
        if (e.contains(Integer.valueOf(47))) {
            c.a(parcel, 47, bxVar.Y(), true);
        }
        if (e.contains(Integer.valueOf(44))) {
            c.a(parcel, 44, bxVar.V(), true);
        }
        if (e.contains(Integer.valueOf(45))) {
            c.a(parcel, 45, bxVar.W(), true);
        }
        if (e.contains(Integer.valueOf(51))) {
            c.a(parcel, 51, bxVar.ac(), true);
        }
        if (e.contains(Integer.valueOf(50))) {
            c.a(parcel, 50, bxVar.ab(), i, true);
        }
        if (e.contains(Integer.valueOf(49))) {
            c.a(parcel, 49, bxVar.aa(), true);
        }
        if (e.contains(Integer.valueOf(48))) {
            c.a(parcel, 48, bxVar.Z(), true);
        }
        if (e.contains(Integer.valueOf(55))) {
            c.a(parcel, 55, bxVar.ag(), true);
        }
        if (e.contains(Integer.valueOf(54))) {
            c.a(parcel, 54, bxVar.af(), true);
        }
        if (e.contains(Integer.valueOf(53))) {
            c.a(parcel, 53, bxVar.ae(), true);
        }
        if (e.contains(Integer.valueOf(52))) {
            c.a(parcel, 52, bxVar.ad(), true);
        }
        if (e.contains(Integer.valueOf(56))) {
            c.a(parcel, 56, bxVar.ah(), true);
        }
        c.a(parcel, a);
    }

    /* renamed from: a */
    public bx createFromParcel(Parcel parcel) {
        int b = a.b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        bx bxVar = null;
        List list = null;
        bx bxVar2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list2 = null;
        int i2 = 0;
        List list3 = null;
        bx bxVar3 = null;
        List list4 = null;
        String str4 = null;
        String str5 = null;
        bx bxVar4 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        List list5 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        bx bxVar5 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        bx bxVar6 = null;
        double d = 0.0d;
        bx bxVar7 = null;
        double d2 = 0.0d;
        String str22 = null;
        bx bxVar8 = null;
        List list6 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        bx bxVar9 = null;
        String str27 = null;
        String str28 = null;
        String str29 = null;
        bx bxVar10 = null;
        String str30 = null;
        String str31 = null;
        String str32 = null;
        String str33 = null;
        String str34 = null;
        String str35 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            bx bxVar11;
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing /*1*/:
                    i = a.f(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    bxVar11 = (bx) a.a(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(2));
                    bxVar = bxVar11;
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    list = a.x(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case e.MapAttrs_cameraTilt /*4*/:
                    bxVar11 = (bx) a.a(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(4));
                    bxVar2 = bxVar11;
                    break;
                case e.MapAttrs_cameraZoom /*5*/:
                    str = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case e.MapAttrs_uiCompass /*6*/:
                    str2 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(6));
                    break;
                case e.MapAttrs_uiRotateGestures /*7*/:
                    str3 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(7));
                    break;
                case e.MapAttrs_uiScrollGestures /*8*/:
                    list2 = a.c(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(8));
                    break;
                case e.MapAttrs_uiTiltGestures /*9*/:
                    i2 = a.f(parcel, a);
                    hashSet.add(Integer.valueOf(9));
                    break;
                case e.MapAttrs_uiZoomControls /*10*/:
                    list3 = a.c(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(10));
                    break;
                case e.MapAttrs_uiZoomGestures /*11*/:
                    bxVar11 = (bx) a.a(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(11));
                    bxVar3 = bxVar11;
                    break;
                case e.MapAttrs_useViewLifecycle /*12*/:
                    list4 = a.c(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(12));
                    break;
                case e.MapAttrs_zOrderOnTop /*13*/:
                    str4 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(13));
                    break;
                case 14:
                    str5 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(14));
                    break;
                case 15:
                    bxVar11 = (bx) a.a(parcel, a, (Creator) bx.CREATOR);
                    hashSet.add(Integer.valueOf(15));
                    bxVar4 = bxVar11;
                    break;
                case 16:
                    str6 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(16));
                    break;
                case 17:
                    str7 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(17));
                    break;
                case 18:
                    str8 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(18));
                    break;
                case 19:
                    list5 = a.c(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(19));
                    break;
                case 20:
                    str9 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(20));
                    break;
                case 21:
                    str10 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(21));
                    break;
                case 22:
                    str11 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(22));
                    break;
                case 23:
                    str12 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(23));
                    break;
                case 24:
                    str13 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(24));
                    break;
                case 25:
                    str14 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(25));
                    break;
                case 26:
                    str15 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(26));
                    break;
                case 27:
                    str16 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(27));
                    break;
                case 28:
                    str17 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(28));
                    break;
                case 29:
                    bxVar11 = (bx) a.a(parcel, a, (Creator) bx.CREATOR);
                    hashSet.add(Integer.valueOf(29));
                    bxVar5 = bxVar11;
                    break;
                case 30:
                    str18 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(30));
                    break;
                case 31:
                    str19 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(31));
                    break;
                case AdSize.LANDSCAPE_AD_HEIGHT /*32*/:
                    str20 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(32));
                    break;
                case 33:
                    str21 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(33));
                    break;
                case 34:
                    bxVar11 = (bx) a.a(parcel, a, (Creator) bx.CREATOR);
                    hashSet.add(Integer.valueOf(34));
                    bxVar6 = bxVar11;
                    break;
                case 36:
                    d = a.j(parcel, a);
                    hashSet.add(Integer.valueOf(36));
                    break;
                case 37:
                    bxVar11 = (bx) a.a(parcel, a, (Creator) bx.CREATOR);
                    hashSet.add(Integer.valueOf(37));
                    bxVar7 = bxVar11;
                    break;
                case 38:
                    d2 = a.j(parcel, a);
                    hashSet.add(Integer.valueOf(38));
                    break;
                case 39:
                    str22 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(39));
                    break;
                case 40:
                    bxVar11 = (bx) a.a(parcel, a, (Creator) bx.CREATOR);
                    hashSet.add(Integer.valueOf(40));
                    bxVar8 = bxVar11;
                    break;
                case 41:
                    list6 = a.c(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(41));
                    break;
                case 42:
                    str23 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(42));
                    break;
                case 43:
                    str24 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(43));
                    break;
                case 44:
                    str25 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(44));
                    break;
                case 45:
                    str26 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(45));
                    break;
                case 46:
                    bxVar11 = (bx) a.a(parcel, a, (Creator) bx.CREATOR);
                    hashSet.add(Integer.valueOf(46));
                    bxVar9 = bxVar11;
                    break;
                case 47:
                    str27 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(47));
                    break;
                case 48:
                    str28 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(48));
                    break;
                case 49:
                    str29 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(49));
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /*50*/:
                    bxVar11 = (bx) a.a(parcel, a, (Creator) bx.CREATOR);
                    hashSet.add(Integer.valueOf(50));
                    bxVar10 = bxVar11;
                    break;
                case 51:
                    str30 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(51));
                    break;
                case 52:
                    str31 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(52));
                    break;
                case 53:
                    str32 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(53));
                    break;
                case 54:
                    str33 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(54));
                    break;
                case 55:
                    str34 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(55));
                    break;
                case 56:
                    str35 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(56));
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new bx(hashSet, i, bxVar, list, bxVar2, str, str2, str3, list2, i2, list3, bxVar3, list4, str4, str5, bxVar4, str6, str7, str8, list5, str9, str10, str11, str12, str13, str14, str15, str16, str17, bxVar5, str18, str19, str20, str21, bxVar6, d, bxVar7, d2, str22, bxVar8, list6, str23, str24, str25, str26, bxVar9, str27, str28, str29, bxVar10, str30, str31, str32, str33, str34, str35);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public bx[] newArray(int i) {
        return new bx[i];
    }
}
