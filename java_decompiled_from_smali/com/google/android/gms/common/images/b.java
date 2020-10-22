package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import com.google.android.gms.internal.dr;

final class b extends dr {
    /* Access modifiers changed, original: protected */
    public int a(f fVar, Bitmap bitmap) {
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    /* Access modifiers changed, original: protected */
    public void a(boolean z, f fVar, Bitmap bitmap, Bitmap bitmap2) {
        super.a(z, fVar, bitmap, bitmap2);
    }
}
