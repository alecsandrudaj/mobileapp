package com.google.android.gms.plus;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.gms.e;

class i implements k {
    private Context a;

    private i(Context context) {
        this.a = context;
    }

    public Drawable a(int i) {
        try {
            String str;
            Resources resources = this.a.createPackageContext("com.google.android.gms", 4).getResources();
            String str2 = "com.google.android.gms";
            switch (i) {
                case e.MapAttrs_mapType /*0*/:
                    str = "ic_plusone_small";
                    break;
                case e.MapAttrs_cameraBearing /*1*/:
                    str = "ic_plusone_medium";
                    break;
                case e.MapAttrs_cameraTargetLat /*2*/:
                    str = "ic_plusone_tall";
                    break;
                default:
                    str = "ic_plusone_standard";
                    break;
            }
            return resources.getDrawable(resources.getIdentifier(str, "drawable", str2));
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    public boolean a() {
        try {
            this.a.createPackageContext("com.google.android.gms", 4).getResources();
            return true;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
