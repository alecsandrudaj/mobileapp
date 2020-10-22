package android.support.v4.app;

import android.support.v4.b.d;
import android.support.v4.b.m;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class z extends x {
    static boolean a = false;
    final m b = new m();
    final m c = new m();
    final String d;
    FragmentActivity e;
    boolean f;
    boolean g;

    z(String str, FragmentActivity fragmentActivity, boolean z) {
        this.d = str;
        this.e = fragmentActivity;
        this.f = z;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(FragmentActivity fragmentActivity) {
        this.e = fragmentActivity;
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        aa aaVar;
        int i = 0;
        if (this.b.b() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i2 = 0; i2 < this.b.b(); i2++) {
                aaVar = (aa) this.b.b(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.b.a(i2));
                printWriter.print(": ");
                printWriter.println(aaVar.toString());
                aaVar.a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.c.b() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            while (i < this.c.b()) {
                aaVar = (aa) this.c.b(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.c.a(i));
                printWriter.print(": ");
                printWriter.println(aaVar.toString());
                aaVar.a(str3, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    public boolean a() {
        int b = this.b.b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            aa aaVar = (aa) this.b.b(i2);
            int i3 = (!aaVar.h || aaVar.f) ? 0 : 1;
            i |= i3;
        }
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public void b() {
        if (a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.f = true;
        for (int b = this.b.b() - 1; b >= 0; b--) {
            ((aa) this.b.b(b)).a();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void c() {
        if (a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (this.f) {
            for (int b = this.b.b() - 1; b >= 0; b--) {
                ((aa) this.b.b(b)).e();
            }
            this.f = false;
            return;
        }
        RuntimeException runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
    }

    /* Access modifiers changed, original: 0000 */
    public void d() {
        if (a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (this.f) {
            this.g = true;
            this.f = false;
            for (int b = this.b.b() - 1; b >= 0; b--) {
                ((aa) this.b.b(b)).b();
            }
            return;
        }
        RuntimeException runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
    }

    /* Access modifiers changed, original: 0000 */
    public void e() {
        if (this.g) {
            if (a) {
                Log.v("LoaderManager", "Finished Retaining in " + this);
            }
            this.g = false;
            for (int b = this.b.b() - 1; b >= 0; b--) {
                ((aa) this.b.b(b)).c();
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void f() {
        for (int b = this.b.b() - 1; b >= 0; b--) {
            ((aa) this.b.b(b)).k = true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void g() {
        for (int b = this.b.b() - 1; b >= 0; b--) {
            ((aa) this.b.b(b)).d();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void h() {
        int b;
        if (!this.g) {
            if (a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (b = this.b.b() - 1; b >= 0; b--) {
                ((aa) this.b.b(b)).f();
            }
            this.b.c();
        }
        if (a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (b = this.c.b() - 1; b >= 0; b--) {
            ((aa) this.c.b(b)).f();
        }
        this.c.c();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        d.a(this.e, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
