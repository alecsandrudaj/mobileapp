package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class d implements Creator {
    d() {
    }

    /* renamed from: a */
    public BackStackState createFromParcel(Parcel parcel) {
        return new BackStackState(parcel);
    }

    /* renamed from: a */
    public BackStackState[] newArray(int i) {
        return new BackStackState[i];
    }
}
