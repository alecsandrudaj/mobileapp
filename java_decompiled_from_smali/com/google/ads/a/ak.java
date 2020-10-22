package com.google.ads.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class ak implements OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ ah b;

    ak(ah ahVar, String str) {
        this.b = ahVar;
        this.a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.b.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.a), "Share via"));
    }
}
