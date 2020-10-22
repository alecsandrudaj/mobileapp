package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.widget.DrawerLayout.SavedState;

final class e implements Creator {
    e() {
    }

    /* renamed from: a */
    public SavedState createFromParcel(Parcel parcel) {
        return new SavedState(parcel);
    }

    /* renamed from: a */
    public SavedState[] newArray(int i) {
        return new SavedState[i];
    }
}
