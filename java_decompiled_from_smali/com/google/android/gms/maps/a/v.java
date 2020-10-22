package com.google.android.gms.maps.a;

import com.google.android.gms.e;

public final class v {
    public static byte a(Boolean bool) {
        return bool != null ? bool.booleanValue() ? (byte) 1 : (byte) 0 : (byte) -1;
    }

    public static Boolean a(byte b) {
        switch (b) {
            case e.MapAttrs_mapType /*0*/:
                return Boolean.FALSE;
            case e.MapAttrs_cameraBearing /*1*/:
                return Boolean.TRUE;
            default:
                return null;
        }
    }
}
