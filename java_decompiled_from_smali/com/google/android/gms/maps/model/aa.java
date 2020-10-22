package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

public class aa {
    static void a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.a(parcel, 1, visibleRegion.a());
        c.a(parcel, 2, visibleRegion.a, i, false);
        c.a(parcel, 3, visibleRegion.b, i, false);
        c.a(parcel, 4, visibleRegion.c, i, false);
        c.a(parcel, 5, visibleRegion.d, i, false);
        c.a(parcel, 6, visibleRegion.e, i, false);
        c.a(parcel, a);
    }
}
