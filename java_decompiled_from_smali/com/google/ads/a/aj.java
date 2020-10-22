package com.google.ads.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class aj implements OnClickListener {
    final /* synthetic */ ah a;

    aj(ah ahVar) {
        this.a = ahVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        new Thread(new ae(this.a.c.c(), this.a.b.getApplicationContext())).start();
    }
}
