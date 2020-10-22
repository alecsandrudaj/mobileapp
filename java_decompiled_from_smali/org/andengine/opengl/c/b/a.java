package org.andengine.opengl.c.b;

import android.graphics.Bitmap.Config;
import org.andengine.opengl.c.c;

public enum a {
    RGBA_8888(Config.ARGB_8888, c.RGBA_8888),
    RGB_565(Config.RGB_565, c.RGB_565),
    RGBA_4444(Config.ARGB_4444, c.RGBA_4444),
    A_8(Config.ALPHA_8, c.A_8);
    
    private final Config e;
    private final c f;

    private a(Config config, c cVar) {
        this.e = config;
        this.f = cVar;
    }

    public Config a() {
        return this.e;
    }

    public c b() {
        return this.f;
    }
}
