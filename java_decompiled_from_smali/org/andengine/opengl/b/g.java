package org.andengine.opengl.b;

import android.opengl.GLES20;
import java.util.HashMap;
import org.andengine.opengl.b.a.c;
import org.andengine.opengl.b.b.a;
import org.andengine.opengl.b.b.b;
import org.andengine.opengl.util.e;

public class g {
    private static final int[] a = new int[1];
    private static final int[] b = new int[1];
    private static final int[] c = new int[1];
    private static final int[] d = new int[1];
    private static final int[] e = new int[1];
    private static final byte[] l = new byte[64];
    protected final a f;
    protected final a g;
    protected int h;
    protected boolean i;
    protected final HashMap j;
    protected final HashMap k;

    public g(String str, String str2) {
        this(new b(str), new b(str2));
    }

    public g(a aVar, a aVar2) {
        this.h = -1;
        this.j = new HashMap();
        this.k = new HashMap();
        this.f = aVar;
        this.g = aVar2;
    }

    private static int a(String str, int i) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            throw new org.andengine.opengl.b.a.b("Could not create Shader of type: '" + i + '\"');
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, a, 0);
        if (a[0] != 0) {
            return glCreateShader;
        }
        throw new org.andengine.opengl.b.a.a(GLES20.glGetShaderInfoLog(glCreateShader), str);
    }

    private void a() {
        this.j.clear();
        b[0] = 0;
        GLES20.glGetProgramiv(this.h, 35718, b, 0);
        int i = b[0];
        for (int i2 = 0; i2 < i; i2++) {
            GLES20.glGetActiveUniform(this.h, i2, 64, c, 0, d, 0, e, 0, l, 0);
            int i3 = c[0];
            if (i3 == 0) {
                while (i3 < 64 && l[i3] != (byte) 0) {
                    i3++;
                }
            }
            Object str = new String(l, 0, i3);
            i3 = GLES20.glGetUniformLocation(this.h, str);
            if (i3 == -1) {
                i3 = 0;
                while (i3 < 64 && l[i3] != (byte) 0) {
                    i3++;
                }
                str = new String(l, 0, i3);
                i3 = GLES20.glGetUniformLocation(this.h, str);
                if (i3 == -1) {
                    throw new c("Invalid location for uniform: '" + str + "'.");
                }
            }
            this.j.put(str, Integer.valueOf(i3));
        }
    }

    @Deprecated
    private void c() {
        this.k.clear();
        b[0] = 0;
        GLES20.glGetProgramiv(this.h, 35721, b, 0);
        int i = b[0];
        for (int i2 = 0; i2 < i; i2++) {
            GLES20.glGetActiveAttrib(this.h, i2, 64, c, 0, d, 0, e, 0, l, 0);
            int i3 = c[0];
            if (i3 == 0) {
                while (i3 < 64 && l[i3] != (byte) 0) {
                    i3++;
                }
            }
            Object str = new String(l, 0, i3);
            i3 = GLES20.glGetAttribLocation(this.h, str);
            if (i3 == -1) {
                i3 = 0;
                while (i3 < 64 && l[i3] != (byte) 0) {
                    i3++;
                }
                str = new String(l, 0, i3);
                i3 = GLES20.glGetAttribLocation(this.h, str);
                if (i3 == -1) {
                    throw new c("Invalid location for attribute: '" + str + "'.");
                }
            }
            this.k.put(str, Integer.valueOf(i3));
        }
    }

    public int a(String str) {
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new org.andengine.opengl.b.a.b("Unexpected uniform: '" + str + "'. Existing uniforms: " + this.j.toString());
    }

    /* Access modifiers changed, original: protected */
    public void a(e eVar) {
        GLES20.glLinkProgram(this.h);
        GLES20.glGetProgramiv(this.h, 35714, a, 0);
        if (a[0] == 0) {
            throw new c(GLES20.glGetProgramInfoLog(this.h));
        }
        c();
        a();
        this.i = true;
    }

    public void a(e eVar, org.andengine.opengl.d.a.c cVar) {
        if (!this.i) {
            c(eVar);
        }
        eVar.c(this.h);
        cVar.a();
    }

    public void a(boolean z) {
        this.i = z;
    }

    public void b(e eVar) {
    }

    public boolean b() {
        return this.i;
    }

    /* Access modifiers changed, original: protected */
    public void c(e eVar) {
        String a = this.f.a(eVar);
        int a2 = a(a, 35633);
        String a3 = this.g.a(eVar);
        int a4 = a(a3, 35632);
        this.h = GLES20.glCreateProgram();
        GLES20.glAttachShader(this.h, a2);
        GLES20.glAttachShader(this.h, a4);
        try {
            a(eVar);
            GLES20.glDeleteShader(a2);
            GLES20.glDeleteShader(a4);
        } catch (c e) {
            throw new c("VertexShaderSource:\n##########################\n" + a + "\n##########################" + "\n\nFragmentShaderSource:\n##########################\n" + a3 + "\n##########################", e);
        }
    }
}
