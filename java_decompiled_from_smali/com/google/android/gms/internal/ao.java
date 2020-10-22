package com.google.android.gms.internal;

import com.google.android.gms.e;

public final class ao {
    public static String a(int i) {
        switch (i) {
            case e.MapAttrs_mapType /*0*/:
                return "DAILY";
            case e.MapAttrs_cameraBearing /*1*/:
                return "WEEKLY";
            case e.MapAttrs_cameraTargetLat /*2*/:
                return "ALL_TIME";
            default:
                throw new IllegalArgumentException("Unknown time span " + i);
        }
    }
}
