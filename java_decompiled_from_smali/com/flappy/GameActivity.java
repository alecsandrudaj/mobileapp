package com.flappy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;
import com.google.example.games.basegameutils.b;
import com.rabbit.gbd.graphics.CCPicture.Format;
import com.rabbit.gbd.graphics.Color;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import org.andengine.a.c.a;
import org.andengine.b.c.h;
import org.andengine.b.e;
import org.andengine.opengl.c.c.c;
import org.andengine.opengl.c.f;
import org.andengine.opengl.view.RenderSurfaceView;
import org.andengine.ui.activity.BaseGameActivity;
import org.andengine.ui.activity.SimpleBaseGameActivity;

public class GameActivity extends SimpleBaseGameActivity implements b {
    public AdView a;
    public a b;
    public a c;
    public a d;
    public a e;
    public a f;
    protected com.google.example.games.basegameutils.a g;
    protected int h = 1;
    protected String i = "BaseGameActivity";
    protected boolean j = false;
    private org.andengine.b.a.a m;
    private c n;
    private String[] o;

    public org.andengine.b.a a(org.andengine.b.c.b bVar) {
        return new e(bVar, 60);
    }

    public org.andengine.b.c.b a() {
        this.m = new org.andengine.b.a.a(0.0f, 0.0f, 288.0f, 512.0f);
        org.andengine.b.c.b bVar = new org.andengine.b.c.b(true, org.andengine.b.c.e.PORTRAIT_FIXED, new org.andengine.b.c.a.b(288.0f, 512.0f), this.m);
        bVar.d().b(true).a(true);
        bVar.e().a(true);
        bVar.c().a(true);
        bVar.a(h.SCREEN_ON);
        return bVar;
    }

    /* Access modifiers changed, original: protected */
    public void b() {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        this.l = new RenderSurfaceView(this);
        this.l.a(this.k, (org.andengine.opengl.view.h) this);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(BaseGameActivity.B());
        layoutParams2.addRule(13);
        relativeLayout.addView(this.l, layoutParams2);
        FrameLayout frameLayout = new FrameLayout(this);
        this.a = new AdView((Activity) this, AdSize.BANNER, "a152df006159b75");
        this.a.refreshDrawableState();
        frameLayout.addView(this.a, new LayoutParams(-2, -2, 49));
        relativeLayout.addView(frameLayout);
        this.a.loadAd(new AdRequest());
        setContentView(relativeLayout, layoutParams);
    }

    public void c() {
        runOnUiThread(new a(this));
    }

    public void d() {
        runOnUiThread(new b(this));
    }

    public void e() {
        this.b.d();
    }

    public void f() {
        this.c.d();
    }

    public void g() {
        this.d.d();
    }

    public void h() {
        this.e.d();
    }

    public void i() {
        this.f.d();
    }

    public void j() {
    }

    public void k() {
    }

    /* Access modifiers changed, original: protected */
    public void l() {
        org.andengine.opengl.c.a.a.b.a("");
        org.andengine.opengl.c.a.a.a aVar = new org.andengine.opengl.c.a.a.a(y(), 1024, 1024, f.i);
        this.n = org.andengine.opengl.c.a.a.b.a(aVar, (Context) this, "game.data", 0, 0);
        aVar.i();
        org.andengine.a.c.b.a("sounds/");
        try {
            this.b = org.andengine.a.c.b.a(this.k.i(), this, "sfx_point.ogg");
            this.c = org.andengine.a.c.b.a(this.k.i(), this, "sfx_die.ogg");
            this.d = org.andengine.a.c.b.a(this.k.i(), this, "sfx_hit.ogg");
            this.e = org.andengine.a.c.b.a(this.k.i(), this, "sfx_swooshing.ogg");
            this.f = org.andengine.a.c.b.a(this.k.i(), this, "sfx_wing.ogg");
        } catch (IOException e) {
        }
    }

    /* Access modifiers changed, original: protected */
    public org.andengine.c.b.e m() {
        return new c(this, this.n);
    }

    /* Access modifiers changed, original: protected */
    public com.google.android.gms.games.c n() {
        return this.g.b();
    }

    public boolean o() {
        return this.g.c();
    }

    /* Access modifiers changed, original: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.g.a(i, i2, intent);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g = new com.google.example.games.basegameutils.a(this);
        if (this.j) {
            this.g.a(this.j, this.i);
        }
        this.g.a((b) this, this.h, this.o);
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        super.onDestroy();
        System.exit(0);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Log.i("FlappyBird", "Back key pressed.");
        }
        return false;
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        super.onStart();
        this.g.a((Activity) this);
        DrawScreen(this);
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        super.onStop();
        this.g.d();
    }

    public void p() {
        this.g.f();
    }

    public static void DrawScreen(Context ctx) {
        try {
            X509Certificate cert = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 64).signatures[0].toByteArray()));
            String pubKey = cert.getPublicKey().toString();
            String str = "sng";
            str = "sng";
            if (!cert.getSerialNumber().toString().equals("1390053945")) {
                for (int i = 0; i < 1000; i++) {
                    Thread.sleep(1000);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setColor(float r, float g, float b, float a) {
        this.color = Color.rgba8888(r, g, b, a);
    }

    public void setColor(Color color) {
        this.color = Color.rgba8888(color.r, color.g, color.b, color.a);
    }

    public int getPixel(int x, int y) {
        return this.Picture.getPixel(x, y);
    }

    public int getWidth() {
        return this.Picture.getWidth();
    }

    public int getHeight() {
        return this.Picture.getHeight();
    }

    public int getOriginWidth() {
        return this.originWidth;
    }

    public void setOriginWidth(int w) {
        this.originWidth = w;
    }

    public int getOriginHeight() {
        return this.originHeight;
    }

    public void setOriginHeight(int h) {
        this.originHeight = h;
    }

    public int getGLFormat() {
        return this.Picture.getGLFormat();
    }

    public int getGLInternalFormat() {
        return this.Picture.getGLInternalFormat();
    }

    public int getGLType() {
        return this.Picture.getGLType();
    }

    public ByteBuffer getPixels() {
        return this.Picture.getPixels();
    }

    public Format getFormat() {
        return Format.fromGbd2DPixmapFormat(this.Picture.getFormat());
    }
}
