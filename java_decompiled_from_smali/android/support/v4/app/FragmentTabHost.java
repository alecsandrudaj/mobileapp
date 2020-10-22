package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost implements OnTabChangeListener {
    private final ArrayList a = new ArrayList();
    private Context b;
    private m c;
    private int d;
    private OnTabChangeListener e;
    private v f;
    private boolean g;

    class SavedState extends BaseSavedState {
        public static final Creator CREATOR = new u();
        String a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
        }

        /* synthetic */ SavedState(Parcel parcel, t tVar) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private w a(String str, w wVar) {
        v vVar = null;
        int i = 0;
        while (i < this.a.size()) {
            v vVar2 = (v) this.a.get(i);
            if (!vVar2.a.equals(str)) {
                vVar2 = vVar;
            }
            i++;
            vVar = vVar2;
        }
        if (vVar == null) {
            throw new IllegalStateException("No tab known for tag " + str);
        }
        if (this.f != vVar) {
            if (wVar == null) {
                wVar = this.c.a();
            }
            if (!(this.f == null || this.f.d == null)) {
                wVar.a(this.f.d);
            }
            if (vVar != null) {
                if (vVar.d == null) {
                    vVar.d = Fragment.a(this.b, vVar.b.getName(), vVar.c);
                    wVar.a(this.d, vVar.d, vVar.a);
                } else {
                    wVar.b(vVar.d);
                }
            }
            this.f = vVar;
        }
        return wVar;
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.d = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        w wVar = null;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.a.size()) {
                break;
            }
            v vVar = (v) this.a.get(i2);
            vVar.d = this.c.a(vVar.a);
            if (!(vVar.d == null || vVar.d.d())) {
                if (vVar.a.equals(currentTabTag)) {
                    this.f = vVar;
                } else {
                    if (wVar == null) {
                        wVar = this.c.a();
                    }
                    wVar.a(vVar.d);
                }
            }
            i = i2 + 1;
        }
        this.g = true;
        w a = a(currentTabTag, wVar);
        if (a != null) {
            a.a();
            this.c.b();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g = false;
    }

    /* Access modifiers changed, original: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.a);
    }

    /* Access modifiers changed, original: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = getCurrentTabTag();
        return savedState;
    }

    public void onTabChanged(String str) {
        if (this.g) {
            w a = a(str, null);
            if (a != null) {
                a.a();
            }
        }
        if (this.e != null) {
            this.e.onTabChanged(str);
        }
    }

    public void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.e = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
