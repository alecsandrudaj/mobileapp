package android.support.v4.view.a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import com.google.ads.AdSize;
import com.google.android.gms.e;

public class a {
    private static final c a;
    private final Object b;

    static {
        if (VERSION.SDK_INT >= 19) {
            a = new f();
        } else if (VERSION.SDK_INT >= 18) {
            a = new e();
        } else if (VERSION.SDK_INT >= 16) {
            a = new d();
        } else if (VERSION.SDK_INT >= 14) {
            a = new b();
        } else {
            a = new g();
        }
    }

    public a(Object obj) {
        this.b = obj;
    }

    public static a a(a aVar) {
        return a(a.a(aVar.b));
    }

    static a a(Object obj) {
        return obj != null ? new a(obj) : null;
    }

    private static String c(int i) {
        switch (i) {
            case e.MapAttrs_cameraBearing /*1*/:
                return "ACTION_FOCUS";
            case e.MapAttrs_cameraTargetLat /*2*/:
                return "ACTION_CLEAR_FOCUS";
            case e.MapAttrs_cameraTilt /*4*/:
                return "ACTION_SELECT";
            case e.MapAttrs_uiScrollGestures /*8*/:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case AdSize.LANDSCAPE_AD_HEIGHT /*32*/:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    public Object a() {
        return this.b;
    }

    public void a(int i) {
        a.a(this.b, i);
    }

    public void a(Rect rect) {
        a.a(this.b, rect);
    }

    public void a(View view) {
        a.c(this.b, view);
    }

    public void a(CharSequence charSequence) {
        a.c(this.b, charSequence);
    }

    public void a(boolean z) {
        a.c(this.b, z);
    }

    public int b() {
        return a.b(this.b);
    }

    public void b(int i) {
        a.b(this.b, i);
    }

    public void b(Rect rect) {
        a.c(this.b, rect);
    }

    public void b(View view) {
        a.a(this.b, view);
    }

    public void b(CharSequence charSequence) {
        a.a(this.b, charSequence);
    }

    public void b(boolean z) {
        a.d(this.b, z);
    }

    public int c() {
        return a.r(this.b);
    }

    public void c(Rect rect) {
        a.b(this.b, rect);
    }

    public void c(View view) {
        a.b(this.b, view);
    }

    public void c(CharSequence charSequence) {
        a.b(this.b, charSequence);
    }

    public void c(boolean z) {
        a.h(this.b, z);
    }

    public void d(Rect rect) {
        a.d(this.b, rect);
    }

    public void d(boolean z) {
        a.i(this.b, z);
    }

    public boolean d() {
        return a.g(this.b);
    }

    public void e(boolean z) {
        a.g(this.b, z);
    }

    public boolean e() {
        return a.h(this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.b == null ? aVar.b == null : this.b.equals(aVar.b);
    }

    public void f(boolean z) {
        a.a(this.b, z);
    }

    public boolean f() {
        return a.k(this.b);
    }

    public void g(boolean z) {
        a.e(this.b, z);
    }

    public boolean g() {
        return a.l(this.b);
    }

    public void h(boolean z) {
        a.b(this.b, z);
    }

    public boolean h() {
        return a.s(this.b);
    }

    public int hashCode() {
        return this.b == null ? 0 : this.b.hashCode();
    }

    public void i(boolean z) {
        a.f(this.b, z);
    }

    public boolean i() {
        return a.t(this.b);
    }

    public boolean j() {
        return a.p(this.b);
    }

    public boolean k() {
        return a.i(this.b);
    }

    public boolean l() {
        return a.m(this.b);
    }

    public boolean m() {
        return a.j(this.b);
    }

    public boolean n() {
        return a.n(this.b);
    }

    public boolean o() {
        return a.o(this.b);
    }

    public CharSequence p() {
        return a.e(this.b);
    }

    public CharSequence q() {
        return a.c(this.b);
    }

    public CharSequence r() {
        return a.f(this.b);
    }

    public CharSequence s() {
        return a.d(this.b);
    }

    public void t() {
        a.q(this.b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        stringBuilder.append("; boundsInParent: " + rect);
        c(rect);
        stringBuilder.append("; boundsInScreen: " + rect);
        stringBuilder.append("; packageName: ").append(p());
        stringBuilder.append("; className: ").append(q());
        stringBuilder.append("; text: ").append(r());
        stringBuilder.append("; contentDescription: ").append(s());
        stringBuilder.append("; viewId: ").append(u());
        stringBuilder.append("; checkable: ").append(d());
        stringBuilder.append("; checked: ").append(e());
        stringBuilder.append("; focusable: ").append(f());
        stringBuilder.append("; focused: ").append(g());
        stringBuilder.append("; selected: ").append(j());
        stringBuilder.append("; clickable: ").append(k());
        stringBuilder.append("; longClickable: ").append(l());
        stringBuilder.append("; enabled: ").append(m());
        stringBuilder.append("; password: ").append(n());
        stringBuilder.append("; scrollable: " + o());
        stringBuilder.append("; [");
        int b = b();
        while (b != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b);
            b &= numberOfTrailingZeros ^ -1;
            stringBuilder.append(c(numberOfTrailingZeros));
            if (b != 0) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public String u() {
        return a.u(this.b);
    }
}
