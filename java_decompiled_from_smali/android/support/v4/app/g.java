package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.Fragment.SavedState;

final class g implements Creator {
    g() {
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
