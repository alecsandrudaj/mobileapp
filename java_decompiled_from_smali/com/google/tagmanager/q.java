package com.google.tagmanager;

import android.content.SharedPreferences.Editor;

final class q implements Runnable {
    final /* synthetic */ Editor a;

    q(Editor editor) {
        this.a = editor;
    }

    public void run() {
        this.a.commit();
    }
}
