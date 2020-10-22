package org.andengine.opengl.c.a.a.a;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import java.io.Closeable;
import java.io.IOException;
import org.andengine.d.d;

public class a extends org.andengine.opengl.c.a.b.a implements b {
    private final AssetManager e;
    private final String f;

    a(AssetManager assetManager, String str, int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.e = assetManager;
        this.f = str;
    }

    public static a a(AssetManager assetManager, String str) {
        return a(assetManager, str, 0, 0);
    }

    public static a a(AssetManager assetManager, String str, int i, int i2) {
        Closeable closeable = null;
        Options options = new Options();
        options.inJustDecodeBounds = true;
        try {
            closeable = assetManager.open(str);
            BitmapFactory.decodeStream(closeable, null, options);
        } catch (IOException e) {
            org.andengine.d.e.a.b("Failed loading Bitmap in AssetBitmapTextureAtlasSource. AssetPath: " + str, e);
        } finally {
            d.a(closeable);
        }
        return new a(assetManager, str, i, i2, options.outWidth, options.outHeight);
    }

    public Bitmap a(Config config) {
        Throwable e;
        Throwable th;
        Bitmap bitmap = null;
        Closeable open;
        try {
            Options options = new Options();
            options.inPreferredConfig = config;
            open = this.e.open(this.f);
            try {
                bitmap = BitmapFactory.decodeStream(open, null, options);
                d.a(open);
            } catch (IOException e2) {
                e = e2;
                try {
                    org.andengine.d.e.a.b("Failed loading Bitmap in " + getClass().getSimpleName() + ". AssetPath: " + this.f, e);
                    d.a(open);
                    return bitmap;
                } catch (Throwable th2) {
                    th = th2;
                    d.a(open);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            open = bitmap;
            org.andengine.d.e.a.b("Failed loading Bitmap in " + getClass().getSimpleName() + ". AssetPath: " + this.f, e);
            d.a(open);
            return bitmap;
        } catch (Throwable e4) {
            open = bitmap;
            th = e4;
            d.a(open);
            throw th;
        }
        return bitmap;
    }

    public String toString() {
        return new StringBuilder(String.valueOf(getClass().getSimpleName())).append("(").append(this.f).append(")").toString();
    }
}
