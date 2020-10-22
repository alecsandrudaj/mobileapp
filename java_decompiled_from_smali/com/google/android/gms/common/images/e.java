package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.cn;
import com.google.android.gms.internal.p;
import java.lang.ref.WeakReference;

public final class e {
    final f a;
    int b;
    private int c;
    private int d;
    private WeakReference e;
    private WeakReference f;
    private WeakReference g;
    private int h;
    private boolean i;
    private boolean j;

    private ch a(Drawable drawable, Drawable drawable2) {
        if (drawable == null) {
            drawable = null;
        } else if (drawable instanceof ch) {
            drawable = ((ch) drawable).b();
        }
        return new ch(drawable, drawable2);
    }

    private void a(Drawable drawable, boolean z, boolean z2, boolean z3) {
        switch (this.b) {
            case com.google.android.gms.e.MapAttrs_cameraBearing /*1*/:
                if (!z2) {
                    a aVar = (a) this.e.get();
                    if (aVar != null) {
                        aVar.a(this.a.a, drawable);
                        return;
                    }
                    return;
                }
                return;
            case com.google.android.gms.e.MapAttrs_cameraTargetLat /*2*/:
                ImageView imageView = (ImageView) this.f.get();
                if (imageView != null) {
                    a(imageView, drawable, z, z2, z3);
                    return;
                }
                return;
            case com.google.android.gms.e.MapAttrs_cameraTargetLng /*3*/:
                TextView textView = (TextView) this.g.get();
                if (textView != null) {
                    a(textView, this.h, drawable, z, z2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private void a(ImageView imageView, Drawable drawable, boolean z, boolean z2, boolean z3) {
        Object obj = (z2 || z3) ? null : 1;
        if (obj != null && (imageView instanceof cm)) {
            int a = ((cm) imageView).a();
            if (this.c != 0 && a == this.c) {
                return;
            }
        }
        boolean a2 = a(z, z2);
        Drawable a3 = a2 ? a(imageView.getDrawable(), drawable) : drawable;
        imageView.setImageDrawable(a3);
        if (imageView instanceof cm) {
            cm cmVar = (cm) imageView;
            cmVar.a(z3 ? this.a.a : null);
            cmVar.a(obj != null ? this.c : 0);
        }
        if (a2) {
            ((ch) a3).a(250);
        }
    }

    private void a(TextView textView, int i, Drawable drawable, boolean z, boolean z2) {
        boolean a = a(z, z2);
        Drawable[] compoundDrawablesRelative = p.e() ? textView.getCompoundDrawablesRelative() : textView.getCompoundDrawables();
        Drawable a2 = a ? a(compoundDrawablesRelative[i], drawable) : drawable;
        Drawable drawable2 = i == 0 ? a2 : compoundDrawablesRelative[0];
        Drawable drawable3 = i == 1 ? a2 : compoundDrawablesRelative[1];
        Drawable drawable4 = i == 2 ? a2 : compoundDrawablesRelative[2];
        Drawable drawable5 = i == 3 ? a2 : compoundDrawablesRelative[3];
        if (p.e()) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable5);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable5);
        }
        if (a) {
            ((ch) a2).a(250);
        }
    }

    private boolean a(boolean z, boolean z2) {
        return this.i && !z2 && (!z || this.j);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(Context context, Bitmap bitmap, boolean z) {
        cn.a((Object) bitmap);
        a(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(Context context, boolean z) {
        Drawable drawable = null;
        if (this.c != 0) {
            drawable = context.getResources().getDrawable(this.c);
        }
        a(drawable, z, false, false);
    }

    public boolean equals(Object obj) {
        return !(obj instanceof e) ? false : this == obj || ((e) obj).hashCode() == hashCode();
    }

    public int hashCode() {
        return this.d;
    }
}
