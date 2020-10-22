package org.andengine.opengl.view;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.andengine.b.a;
import org.andengine.b.c.d;
import org.andengine.opengl.util.e;

public class g implements Renderer {
    final a a;
    final a b;
    final boolean c = this.a.d().e().a();
    final h d;
    final e e = new e();

    public g(a aVar, a aVar2, h hVar) {
        this.a = aVar;
        this.b = aVar2;
        this.d = hVar;
    }

    public void onDrawFrame(GL10 gl10) {
        synchronized (e.class) {
            if (this.c && this.b.a()) {
                GLES20.glClear(32768);
            }
            try {
                this.a.a(this.e);
            } catch (InterruptedException e) {
                org.andengine.d.e.a.b("GLThread interrupted!", e);
            }
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.a.a(i, i2);
        GLES20.glViewport(0, 0, i, i2);
        this.e.o();
        if (this.d != null) {
            this.d.a(this.e, i, i2);
        }
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        synchronized (e.class) {
            d e = this.a.d().e();
            this.e.a(e, this.b, eGLConfig);
            this.e.g();
            this.e.a();
            this.e.a(e.b());
            if (this.d != null) {
                this.d.a(this.e);
            }
        }
    }
}
