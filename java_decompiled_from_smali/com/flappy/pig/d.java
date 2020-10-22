package com.flappy.pig;

import android.content.Intent;
import com.flappy.GameActivity;

class d implements Runnable {
    final /* synthetic */ SplashScreen a;

    d(SplashScreen splashScreen) {
        this.a = splashScreen;
    }

    public void run() {
        this.a.startActivity(new Intent(this.a, GameActivity.class));
        this.a.finish();
    }
}
