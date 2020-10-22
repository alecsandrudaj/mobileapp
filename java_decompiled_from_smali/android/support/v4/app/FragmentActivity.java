package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.b.l;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FragmentActivity extends Activity {
    final Handler a = new h(this);
    final o b = new o();
    final l c = new i(this);
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    l l;
    z m;

    private static String a(View view) {
        char c = 'F';
        char c2 = '.';
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(view.getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(view)));
        stringBuilder.append(' ');
        switch (view.getVisibility()) {
            case e.MapAttrs_mapType /*0*/:
                stringBuilder.append('V');
                break;
            case e.MapAttrs_cameraTilt /*4*/:
                stringBuilder.append('I');
                break;
            case e.MapAttrs_uiScrollGestures /*8*/:
                stringBuilder.append('G');
                break;
            default:
                stringBuilder.append('.');
                break;
        }
        stringBuilder.append(view.isFocusable() ? 'F' : '.');
        stringBuilder.append(view.isEnabled() ? 'E' : '.');
        stringBuilder.append(view.willNotDraw() ? '.' : 'D');
        stringBuilder.append(view.isHorizontalScrollBarEnabled() ? 'H' : '.');
        stringBuilder.append(view.isVerticalScrollBarEnabled() ? 'V' : '.');
        stringBuilder.append(view.isClickable() ? 'C' : '.');
        stringBuilder.append(view.isLongClickable() ? 'L' : '.');
        stringBuilder.append(' ');
        if (!view.isFocused()) {
            c = '.';
        }
        stringBuilder.append(c);
        stringBuilder.append(view.isSelected() ? 'S' : '.');
        if (view.isPressed()) {
            c2 = 'P';
        }
        stringBuilder.append(c2);
        stringBuilder.append(' ');
        stringBuilder.append(view.getLeft());
        stringBuilder.append(',');
        stringBuilder.append(view.getTop());
        stringBuilder.append('-');
        stringBuilder.append(view.getRight());
        stringBuilder.append(',');
        stringBuilder.append(view.getBottom());
        int id = view.getId();
        if (id != -1) {
            stringBuilder.append(" #");
            stringBuilder.append(Integer.toHexString(id));
            Resources resources = view.getResources();
            if (!(id == 0 || resources == null)) {
                String str;
                switch (-16777216 & id) {
                    case 16777216:
                        str = "android";
                        break;
                    case 2130706432:
                        str = "app";
                        break;
                    default:
                        try {
                            str = resources.getResourcePackageName(id);
                            break;
                        } catch (NotFoundException e) {
                            break;
                        }
                }
                String resourceTypeName = resources.getResourceTypeName(id);
                String resourceEntryName = resources.getResourceEntryName(id);
                stringBuilder.append(" ");
                stringBuilder.append(str);
                stringBuilder.append(":");
                stringBuilder.append(resourceTypeName);
                stringBuilder.append("/");
                stringBuilder.append(resourceEntryName);
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private void a(String str, PrintWriter printWriter, View view) {
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(a(view));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount > 0) {
                String str2 = str + "  ";
                for (int i = 0; i < childCount; i++) {
                    a(str2, printWriter, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public z a(String str, boolean z, boolean z2) {
        if (this.l == null) {
            this.l = new l();
        }
        z zVar = (z) this.l.get(str);
        if (zVar != null) {
            zVar.a(this);
            return zVar;
        } else if (!z2) {
            return zVar;
        } else {
            zVar = new z(str, this, z);
            this.l.put(str, zVar);
            return zVar;
        }
    }

    /* Access modifiers changed, original: protected */
    public void a() {
        this.b.m();
    }

    public void a(Fragment fragment) {
    }

    /* Access modifiers changed, original: 0000 */
    public void a(String str) {
        if (this.l != null) {
            z zVar = (z) this.l.get(str);
            if (zVar != null && !zVar.g) {
                zVar.h();
                this.l.remove(str);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(boolean z) {
        if (!this.g) {
            this.g = true;
            this.h = z;
            this.a.removeMessages(1);
            d();
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public Object b() {
        return null;
    }

    public void c() {
        if (VERSION.SDK_INT >= 11) {
            a.a(this);
        } else {
            this.i = true;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void d() {
        if (this.k) {
            this.k = false;
            if (this.m != null) {
                if (this.h) {
                    this.m.d();
                } else {
                    this.m.c();
                }
            }
        }
        this.b.p();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (VERSION.SDK_INT >= 11) {
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.d);
        printWriter.print("mResumed=");
        printWriter.print(this.e);
        printWriter.print(" mStopped=");
        printWriter.print(this.f);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.g);
        printWriter.print(str2);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.k);
        if (this.m != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.m)));
            printWriter.println(":");
            this.m.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        this.b.a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("View Hierarchy:");
        a(str + "  ", printWriter, getWindow().getDecorView());
    }

    /* Access modifiers changed, original: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.b.i();
        int i3 = i >> 16;
        if (i3 != 0) {
            i3--;
            if (this.b.f == null || i3 < 0 || i3 >= this.b.f.size()) {
                Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(i));
                return;
            }
            Fragment fragment = (Fragment) this.b.f.get(i3);
            if (fragment == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(i));
                return;
            } else {
                fragment.a(65535 & i, i2, intent);
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        if (!this.b.c()) {
            finish();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b.a(configuration);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        this.b.a(this, this.c, null);
        if (getLayoutInflater().getFactory() == null) {
            getLayoutInflater().setFactory(this);
        }
        super.onCreate(bundle);
        k kVar = (k) getLastNonConfigurationInstance();
        if (kVar != null) {
            this.l = kVar.e;
        }
        if (bundle != null) {
            this.b.a(bundle.getParcelable("android:support:fragments"), kVar != null ? kVar.d : null);
        }
        this.b.j();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        return VERSION.SDK_INT >= 11 ? super.onCreatePanelMenu(i, menu) | this.b.a(menu, getMenuInflater()) : true;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        int i = 0;
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return super.onCreateView(str, context, attributeSet);
        }
        String attributeValue = attributeSet.getAttributeValue(fragment, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.b((Context) this, attributeValue)) {
            return super.onCreateView(str, context, attributeSet);
        }
        if (fragment != null) {
            i = fragment.getId();
        }
        if (i == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.b.a(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.b.a(string);
        }
        if (fragment == null && i != -1) {
            fragment = this.b.a(i);
        }
        if (o.a) {
            Log.v("FragmentActivity", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + fragment);
        }
        if (fragment == null) {
            Fragment a = Fragment.a((Context) this, attributeValue);
            a.o = true;
            a.w = resourceId != 0 ? resourceId : i;
            a.x = i;
            a.y = string;
            a.p = true;
            a.s = this.b;
            a.a((Activity) this, attributeSet, a.d);
            this.b.a(a, true);
            fragment = a;
        } else if (fragment.p) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
        } else {
            fragment.p = true;
            if (!fragment.C) {
                fragment.a((Activity) this, attributeSet, fragment.d);
            }
            this.b.b(fragment);
        }
        if (fragment.I == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            fragment.I.setId(resourceId);
        }
        if (fragment.I.getTag() == null) {
            fragment.I.setTag(string);
        }
        return fragment.I;
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        super.onDestroy();
        a(false);
        this.b.r();
        if (this.m != null) {
            this.m.h();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 5 || i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        onBackPressed();
        return true;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.b.s();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        switch (i) {
            case e.MapAttrs_mapType /*0*/:
                return this.b.a(menuItem);
            case e.MapAttrs_uiCompass /*6*/:
                return this.b.b(menuItem);
            default:
                return false;
        }
    }

    /* Access modifiers changed, original: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.b.i();
    }

    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case e.MapAttrs_mapType /*0*/:
                this.b.b(menu);
                break;
        }
        super.onPanelClosed(i, menu);
    }

    /* Access modifiers changed, original: protected */
    public void onPause() {
        super.onPause();
        this.e = false;
        if (this.a.hasMessages(2)) {
            this.a.removeMessages(2);
            a();
        }
        this.b.n();
    }

    /* Access modifiers changed, original: protected */
    public void onPostResume() {
        super.onPostResume();
        this.a.removeMessages(2);
        a();
        this.b.e();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        if (this.i) {
            this.i = false;
            menu.clear();
            onCreatePanelMenu(i, menu);
        }
        return a(view, menu) | this.b.a(menu);
    }

    /* Access modifiers changed, original: protected */
    public void onResume() {
        super.onResume();
        this.a.sendEmptyMessage(2);
        this.e = true;
        this.b.e();
    }

    public final Object onRetainNonConfigurationInstance() {
        int i = 0;
        if (this.f) {
            a(true);
        }
        Object b = b();
        ArrayList g = this.b.g();
        int i2;
        if (this.l != null) {
            int size = this.l.size();
            z[] zVarArr = new z[size];
            for (int i3 = size - 1; i3 >= 0; i3--) {
                zVarArr[i3] = (z) this.l.c(i3);
            }
            i2 = 0;
            while (i < size) {
                z zVar = zVarArr[i];
                if (zVar.g) {
                    i2 = true;
                } else {
                    zVar.h();
                    this.l.remove(zVar.d);
                }
                i++;
            }
        } else {
            i2 = 0;
        }
        if (g == null && r0 == 0 && b == null) {
            return null;
        }
        k kVar = new k();
        kVar.a = null;
        kVar.b = b;
        kVar.c = null;
        kVar.d = g;
        kVar.e = this.l;
        return kVar;
    }

    /* Access modifiers changed, original: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable h = this.b.h();
        if (h != null) {
            bundle.putParcelable("android:support:fragments", h);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        super.onStart();
        this.f = false;
        this.g = false;
        this.a.removeMessages(1);
        if (!this.d) {
            this.d = true;
            this.b.k();
        }
        this.b.i();
        this.b.e();
        if (!this.k) {
            this.k = true;
            if (this.m != null) {
                this.m.b();
            } else if (!this.j) {
                this.m = a("(root)", this.k, false);
                if (!(this.m == null || this.m.f)) {
                    this.m.b();
                }
            }
            this.j = true;
        }
        this.b.l();
        if (this.l != null) {
            int size = this.l.size();
            z[] zVarArr = new z[size];
            for (int i = size - 1; i >= 0; i--) {
                zVarArr[i] = (z) this.l.c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                z zVar = zVarArr[i2];
                zVar.e();
                zVar.g();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        super.onStop();
        this.f = true;
        this.a.sendEmptyMessage(1);
        this.b.o();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (i == -1 || (-65536 & i) == 0) {
            super.startActivityForResult(intent, i);
            return;
        }
        throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
}
