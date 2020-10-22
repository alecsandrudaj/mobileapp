package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.j;

final class g extends i {
    g() {
    }

    /* renamed from: a */
    public PlayerEntity createFromParcel(Parcel parcel) {
        Uri uri = null;
        if (av.b(j.u()) || j.b(PlayerEntity.class.getCanonicalName())) {
            return super.createFromParcel(parcel);
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        Uri parse = readString3 == null ? null : Uri.parse(readString3);
        if (readString4 != null) {
            uri = Uri.parse(readString4);
        }
        return new PlayerEntity(1, readString, readString2, parse, uri, parcel.readLong());
    }
}
