package org.andengine.opengl.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import org.andengine.opengl.c.c;
import org.andengine.opengl.util.e;

public class a {
    protected final Paint a;
    protected final FontMetrics b;
    protected final Canvas c;
    private final org.andengine.opengl.c.a d;
    private final SparseArray e;
    private final ArrayList f;
    private final Paint g;

    public float a() {
        return this.b.ascent;
    }

    /* Access modifiers changed, original: protected */
    public Bitmap a(d dVar) {
        String valueOf = String.valueOf(dVar.a);
        Bitmap createBitmap = Bitmap.createBitmap(dVar.d + 2, dVar.e + 2, Config.ARGB_8888);
        this.c.setBitmap(createBitmap);
        this.c.drawRect(0.0f, 0.0f, (float) createBitmap.getWidth(), (float) createBitmap.getHeight(), this.g);
        a(valueOf, -dVar.f, -(dVar.g + a()));
        return createBitmap;
    }

    /* Access modifiers changed, original: protected */
    public void a(String str, float f, float f2) {
        this.c.drawText(str, f + 1.0f, 1.0f + f2, this.a);
    }

    public synchronized void a(e eVar) {
        if (this.d.c()) {
            ArrayList arrayList = this.f;
            if (arrayList.size() > 0) {
                this.d.d(eVar);
                c f = this.d.f();
                boolean z = this.d.g().n;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    d dVar = (d) arrayList.get(size);
                    if (!dVar.a()) {
                        Bitmap a = a(dVar);
                        Object obj = (org.andengine.d.g.a.a(a.getWidth()) && org.andengine.d.g.a.a(a.getHeight()) && f == c.RGBA_8888) ? 1 : null;
                        if (obj == null) {
                            GLES20.glPixelStorei(3317, 1);
                        }
                        if (z) {
                            GLUtils.texSubImage2D(3553, 0, dVar.b, dVar.c, a);
                        } else {
                            eVar.a(3553, 0, dVar.b, dVar.c, a, f);
                        }
                        if (obj == null) {
                            GLES20.glPixelStorei(3317, 4);
                        }
                        a.recycle();
                    }
                }
                arrayList.clear();
                System.gc();
            }
        }
    }

    public synchronized void b() {
        ArrayList arrayList = this.f;
        SparseArray sparseArray = this.e;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            arrayList.add((d) sparseArray.valueAt(size));
        }
    }
}
