package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import com.google.android.gms.internal.cc.f;
import java.util.HashSet;
import java.util.Set;

public class bs implements Creator {
    static void a(f fVar, Parcel parcel, int i) {
        int a = c.a(parcel);
        Set e = fVar.e();
        if (e.contains(Integer.valueOf(1))) {
            c.a(parcel, 1, fVar.f());
        }
        if (e.contains(Integer.valueOf(2))) {
            c.a(parcel, 2, fVar.g(), true);
        }
        if (e.contains(Integer.valueOf(3))) {
            c.a(parcel, 3, fVar.h(), true);
        }
        if (e.contains(Integer.valueOf(4))) {
            c.a(parcel, 4, fVar.i(), true);
        }
        if (e.contains(Integer.valueOf(5))) {
            c.a(parcel, 5, fVar.j(), true);
        }
        if (e.contains(Integer.valueOf(6))) {
            c.a(parcel, 6, fVar.k(), true);
        }
        if (e.contains(Integer.valueOf(7))) {
            c.a(parcel, 7, fVar.l());
        }
        if (e.contains(Integer.valueOf(8))) {
            c.a(parcel, 8, fVar.m(), true);
        }
        if (e.contains(Integer.valueOf(9))) {
            c.a(parcel, 9, fVar.n(), true);
        }
        if (e.contains(Integer.valueOf(10))) {
            c.a(parcel, 10, fVar.o());
        }
        c.a(parcel, a);
    }

    /* renamed from: a */
    public f createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = a.b(parcel);
        HashSet hashSet = new HashSet();
        String str2 = null;
        boolean z = false;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case e.MapAttrs_cameraBearing /*1*/:
                    i2 = a.f(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    str7 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    str6 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case e.MapAttrs_cameraTilt /*4*/:
                    str5 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case e.MapAttrs_cameraZoom /*5*/:
                    str4 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case e.MapAttrs_uiCompass /*6*/:
                    str3 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(6));
                    break;
                case e.MapAttrs_uiRotateGestures /*7*/:
                    z = a.c(parcel, a);
                    hashSet.add(Integer.valueOf(7));
                    break;
                case e.MapAttrs_uiScrollGestures /*8*/:
                    str2 = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(8));
                    break;
                case e.MapAttrs_uiTiltGestures /*9*/:
                    str = a.l(parcel, a);
                    hashSet.add(Integer.valueOf(9));
                    break;
                case e.MapAttrs_uiZoomControls /*10*/:
                    i = a.f(parcel, a);
                    hashSet.add(Integer.valueOf(10));
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new f(hashSet, i2, str7, str6, str5, str4, str3, z, str2, str, i);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public f[] newArray(int i) {
        return new f[i];
    }
}
