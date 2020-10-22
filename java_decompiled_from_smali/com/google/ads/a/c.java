package com.google.ads.a;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.MediaController;
import android.widget.VideoView;
import com.google.ads.util.g;
import java.lang.ref.WeakReference;

public class c extends FrameLayout implements OnCompletionListener, OnErrorListener, OnPreparedListener {
    private static final h b = ((h) h.a.b());
    public MediaController a = null;
    private final WeakReference c;
    private final e d;
    private long e = 0;
    private final VideoView f;
    private String g = null;

    public c(Activity activity, e eVar) {
        super(activity);
        this.c = new WeakReference(activity);
        this.d = eVar;
        this.f = new VideoView(activity);
        addView(this.f, new LayoutParams(-1, -1, 17));
        a();
        this.f.setOnCompletionListener(this);
        this.f.setOnPreparedListener(this);
        this.f.setOnErrorListener(this);
    }

    /* Access modifiers changed, original: protected */
    public void a() {
        new d(this).a();
    }

    public void a(int i) {
        this.f.seekTo(i);
    }

    public void a(MotionEvent motionEvent) {
        this.f.onTouchEvent(motionEvent);
    }

    public void b() {
        if (TextUtils.isEmpty(this.g)) {
            b.a(this.d, "onVideoEvent", "{'event': 'error', 'what': 'no_src'}");
        } else {
            this.f.setVideoPath(this.g);
        }
    }

    public void c() {
        this.f.pause();
    }

    public void d() {
        this.f.start();
    }

    public void e() {
        this.f.stopPlayback();
    }

    /* Access modifiers changed, original: 0000 */
    public void f() {
        long currentPosition = (long) this.f.getCurrentPosition();
        if (this.e != currentPosition) {
            b.a(this.d, "onVideoEvent", "{'event': 'timeupdate', 'time': " + (((float) currentPosition) / 1000.0f) + "}");
            this.e = currentPosition;
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        b.a(this.d, "onVideoEvent", "{'event': 'ended'}");
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        g.e("Video threw error! <what:" + i + ", extra:" + i2 + ">");
        b.a(this.d, "onVideoEvent", "{'event': 'error', 'what': '" + i + "', 'extra': '" + i2 + "'}");
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        b.a(this.d, "onVideoEvent", "{'event': 'canplaythrough', 'duration': '" + (((float) this.f.getDuration()) / 1000.0f) + "'}");
    }

    public void setMediaControllerEnabled(boolean z) {
        Activity activity = (Activity) this.c.get();
        if (activity == null) {
            g.e("adActivity was null while trying to enable controls on a video.");
        } else if (z) {
            if (this.a == null) {
                this.a = new MediaController(activity);
            }
            this.f.setMediaController(this.a);
        } else {
            if (this.a != null) {
                this.a.hide();
            }
            this.f.setMediaController(null);
        }
    }

    public void setSrc(String str) {
        this.g = str;
    }
}
