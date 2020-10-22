package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.e;
import java.util.List;

public class a implements Creator {
    static void a(ActivityRecognitionResult activityRecognitionResult, Parcel parcel, int i) {
        int a = c.a(parcel);
        c.b(parcel, 1, activityRecognitionResult.a, false);
        c.a(parcel, 1000, activityRecognitionResult.a());
        c.a(parcel, 2, activityRecognitionResult.b);
        c.a(parcel, 3, activityRecognitionResult.c);
        c.a(parcel, a);
    }

    /* renamed from: a */
    public ActivityRecognitionResult createFromParcel(Parcel parcel) {
        long j = 0;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        List list = null;
        long j2 = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case e.MapAttrs_cameraBearing /*1*/:
                    list = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, DetectedActivity.CREATOR);
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    j2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case e.MapAttrs_cameraTargetLng /*3*/:
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 1000:
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ActivityRecognitionResult(i, list, j2, j);
        }
        throw new b("Overread allowed size end=" + b, parcel);
    }

    /* renamed from: a */
    public ActivityRecognitionResult[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
