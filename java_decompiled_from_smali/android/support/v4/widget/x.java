package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class x implements Creator {
    x() {
    }

    /* renamed from: a */
    public SavedState createFromParcel(Parcel parcel) {
        return new SavedState(parcel, null);
    }

    /* renamed from: a */
    public SavedState[] newArray(int i) {
        return new SavedState[i];
    }
}
