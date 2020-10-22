package android.support.v4.a;

import android.os.Build.VERSION;
import android.os.Parcelable.Creator;

public class a {
    public static Creator a(c cVar) {
        if (VERSION.SDK_INT >= 13) {
            e.a(cVar);
        }
        return new b(cVar);
    }
}
