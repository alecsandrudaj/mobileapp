package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.j;

final class a extends h {
    a() {
    }

    /* renamed from: a */
    public GameEntity createFromParcel(Parcel parcel) {
        if (av.b(j.u()) || j.b(GameEntity.class.getCanonicalName())) {
            return super.createFromParcel(parcel);
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        Uri parse = readString7 == null ? null : Uri.parse(readString7);
        readString7 = parcel.readString();
        Uri parse2 = readString7 == null ? null : Uri.parse(readString7);
        readString7 = parcel.readString();
        return new GameEntity(1, readString, readString2, readString3, readString4, readString5, readString6, parse, parse2, readString7 == null ? null : Uri.parse(readString7), parcel.readInt() > 0, parcel.readInt() > 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
