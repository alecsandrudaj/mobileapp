package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class a implements Creator {
    a() {
    }

    /* renamed from: a */
    public RealTimeMessage createFromParcel(Parcel parcel) {
        return new RealTimeMessage(parcel, null);
    }

    /* renamed from: a */
    public RealTimeMessage[] newArray(int i) {
        return new RealTimeMessage[i];
    }
}
