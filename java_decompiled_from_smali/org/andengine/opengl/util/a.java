package org.andengine.opengl.util;

import android.graphics.Bitmap;
import com.google.android.gms.e;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.andengine.opengl.c.c;

public class a {
    private static /* synthetic */ int[] a;

    public static Buffer a(Bitmap bitmap, c cVar, ByteOrder byteOrder) {
        int[] a = a(bitmap);
        switch (a()[cVar.ordinal()]) {
            case e.MapAttrs_cameraTargetLat /*2*/:
                return ShortBuffer.wrap(c(a, byteOrder));
            case e.MapAttrs_cameraTilt /*4*/:
                return IntBuffer.wrap(a(a, byteOrder == ByteOrder.LITTLE_ENDIAN ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN));
            case e.MapAttrs_cameraZoom /*5*/:
                return ShortBuffer.wrap(b(a, byteOrder));
            case e.MapAttrs_uiCompass /*6*/:
                return ByteBuffer.wrap(a(a));
            default:
                throw new IllegalArgumentException("Unexpected " + c.class.getSimpleName() + ": '" + cVar + "'.");
        }
    }

    public static byte[] a(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int length = iArr.length - 1; length >= 0; length--) {
            bArr[length] = (byte) ((iArr[length] >> 24) & 255);
        }
        return bArr;
    }

    static /* synthetic */ int[] a() {
        int[] iArr = a;
        if (iArr == null) {
            iArr = new int[c.values().length];
            try {
                iArr[c.AI_88.ordinal()] = 8;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[c.A_8.ordinal()] = 6;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[c.I_8.ordinal()] = 7;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[c.RGBA_4444.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[c.RGBA_5551.ordinal()] = 3;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[c.RGBA_8888.ordinal()] = 4;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[c.RGB_565.ordinal()] = 5;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[c.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError e8) {
            }
            a = iArr;
        }
        return iArr;
    }

    public static int[] a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[(width * height)];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return iArr;
    }

    public static int[] a(int[] iArr, ByteOrder byteOrder) {
        int length;
        int i;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            for (length = iArr.length - 1; length >= 0; length--) {
                i = iArr[length];
                iArr[length] = ((i >> 16) & 255) | ((-16711936 & i) | ((i << 16) & 16711680));
            }
        } else {
            for (length = iArr.length - 1; length >= 0; length--) {
                i = iArr[length];
                iArr[length] = ((i >> 24) & 255) | ((i << 8) & -256);
            }
        }
        return iArr;
    }

    public static short[] b(int[] iArr, ByteOrder byteOrder) {
        short[] sArr = new short[iArr.length];
        int length;
        int i;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            for (length = iArr.length - 1; length >= 0; length--) {
                i = iArr[length];
                sArr[length] = (short) (((i << 5) & 7936) | ((((i >> 16) & 248) | ((i >> 13) & 7)) | ((i << 3) & 57344)));
            }
        } else {
            for (length = iArr.length - 1; length >= 0; length--) {
                i = iArr[length];
                sArr[length] = (short) (((i >> 3) & 31) | (((i >> 8) & 63488) | ((i >> 5) & 2016)));
            }
        }
        return sArr;
    }

    public static short[] c(int[] iArr, ByteOrder byteOrder) {
        short[] sArr = new short[iArr.length];
        int length;
        int i;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            for (length = iArr.length - 1; length >= 0; length--) {
                i = iArr[length];
                sArr[length] = (short) (((i >> 20) & 3840) | ((((i >> 16) & 240) | ((i >> 12) & 15)) | ((i << 8) & 61440)));
            }
        } else {
            for (length = iArr.length - 1; length >= 0; length--) {
                i = iArr[length];
                sArr[length] = (short) (((i >> 28) & 15) | ((((i >> 8) & 61440) | ((i >> 4) & 3840)) | (i & 240)));
            }
        }
        return sArr;
    }
}
