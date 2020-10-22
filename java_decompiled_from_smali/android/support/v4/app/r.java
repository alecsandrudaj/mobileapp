package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class r implements Creator {
    r() {
    }

    /* renamed from: a */
    public FragmentManagerState createFromParcel(Parcel parcel) {
        return new FragmentManagerState(parcel);
    }

    /* renamed from: a */
    public FragmentManagerState[] newArray(int i) {
        return new FragmentManagerState[i];
    }
}
