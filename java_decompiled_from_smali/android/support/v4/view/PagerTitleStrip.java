package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public class PagerTitleStrip extends ViewGroup implements by {
    private static final int[] n = new int[]{16842804, 16842901, 16842904, 16842927};
    private static final int[] o = new int[]{16843660};
    private static final aj q;
    ViewPager a;
    TextView b;
    TextView c;
    TextView d;
    int e;
    private int f = -1;
    private float g = -1.0f;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private final ai l = new ai(this);
    private WeakReference m;
    private int p;

    static {
        if (VERSION.SDK_INT >= 14) {
            q = new al();
        } else {
            q = new ak();
        }
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        int i = 0;
        super(context, attributeSet);
        TextView textView = new TextView(context);
        this.b = textView;
        addView(textView);
        textView = new TextView(context);
        this.c = textView;
        addView(textView);
        textView = new TextView(context);
        this.d = textView;
        addView(textView);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.b.setTextAppearance(context, resourceId);
            this.c.setTextAppearance(context, resourceId);
            this.d.setTextAppearance(context, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            a(0, (float) dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            dimensionPixelSize = obtainStyledAttributes.getColor(2, 0);
            this.b.setTextColor(dimensionPixelSize);
            this.c.setTextColor(dimensionPixelSize);
            this.d.setTextColor(dimensionPixelSize);
        }
        this.i = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.e = this.c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.b.setEllipsize(TruncateAt.END);
        this.c.setEllipsize(TruncateAt.END);
        this.d.setEllipsize(TruncateAt.END);
        if (resourceId != 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(resourceId, o);
            i = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
        if (i != 0) {
            setSingleLineAllCaps(this.b);
            setSingleLineAllCaps(this.c);
            setSingleLineAllCaps(this.d);
        } else {
            this.b.setSingleLine();
            this.c.setSingleLine();
            this.d.setSingleLine();
        }
        this.h = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        q.a(textView);
    }

    public void a(int i, float f) {
        this.b.setTextSize(i, f);
        this.c.setTextSize(i, f);
        this.d.setTextSize(i, f);
    }

    /* Access modifiers changed, original: 0000 */
    public void a(int i, float f, boolean z) {
        if (i != this.f) {
            a(i, this.a.getAdapter());
        } else if (!z && f == this.g) {
            return;
        }
        this.k = true;
        int measuredWidth = this.b.getMeasuredWidth();
        int measuredWidth2 = this.c.getMeasuredWidth();
        int measuredWidth3 = this.d.getMeasuredWidth();
        int i2 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i3 = paddingRight + i2;
        int i4 = (width - (paddingLeft + i2)) - i3;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        i4 = ((width - i3) - ((int) (f2 * ((float) i4)))) - (measuredWidth2 / 2);
        i3 = i4 + measuredWidth2;
        i2 = this.b.getBaseline();
        measuredWidth2 = this.c.getBaseline();
        int baseline = this.d.getBaseline();
        int max = Math.max(Math.max(i2, measuredWidth2), baseline);
        i2 = max - i2;
        measuredWidth2 = max - measuredWidth2;
        baseline = max - baseline;
        int measuredHeight = this.d.getMeasuredHeight() + baseline;
        max = Math.max(Math.max(this.b.getMeasuredHeight() + i2, this.c.getMeasuredHeight() + measuredWidth2), measuredHeight);
        switch (this.i & 112) {
            case 16:
                paddingTop = (((height - paddingTop) - paddingBottom) - max) / 2;
                height = paddingTop + i2;
                measuredWidth2 += paddingTop;
                i2 = paddingTop + baseline;
                break;
            case 80:
                paddingTop = (height - paddingBottom) - max;
                height = paddingTop + i2;
                measuredWidth2 += paddingTop;
                i2 = paddingTop + baseline;
                break;
            default:
                height = paddingTop + i2;
                measuredWidth2 += paddingTop;
                i2 = paddingTop + baseline;
                break;
        }
        this.c.layout(i4, measuredWidth2, i3, this.c.getMeasuredHeight() + measuredWidth2);
        measuredWidth2 = Math.min(paddingLeft, (i4 - this.h) - measuredWidth);
        this.b.layout(measuredWidth2, height, measuredWidth + measuredWidth2, this.b.getMeasuredHeight() + height);
        measuredWidth2 = Math.max((width - paddingRight) - measuredWidth3, this.h + i3);
        this.d.layout(measuredWidth2, i2, measuredWidth2 + measuredWidth3, this.d.getMeasuredHeight() + i2);
        this.g = f;
        this.k = false;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(int i, ae aeVar) {
        CharSequence charSequence = null;
        int a = aeVar != null ? aeVar.a() : 0;
        this.j = true;
        CharSequence a2 = (i < 1 || aeVar == null) ? null : aeVar.a(i - 1);
        this.b.setText(a2);
        TextView textView = this.c;
        a2 = (aeVar == null || i >= a) ? null : aeVar.a(i);
        textView.setText(a2);
        if (i + 1 < a && aeVar != null) {
            charSequence = aeVar.a(i + 1);
        }
        this.d.setText(charSequence);
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        a = MeasureSpec.makeMeasureSpec((int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f), Integer.MIN_VALUE);
        height = MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE);
        this.b.measure(a, height);
        this.c.measure(a, height);
        this.d.measure(a, height);
        this.f = i;
        if (!this.k) {
            a(i, this.g, false);
        }
        this.j = false;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(ae aeVar, ae aeVar2) {
        if (aeVar != null) {
            aeVar.b(this.l);
            this.m = null;
        }
        if (aeVar2 != null) {
            aeVar2.a(this.l);
            this.m = new WeakReference(aeVar2);
        }
        if (this.a != null) {
            this.f = -1;
            this.g = -1.0f;
            a(this.a.getCurrentItem(), aeVar2);
            requestLayout();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int getMinHeight() {
        Drawable background = getBackground();
        return background != null ? background.getIntrinsicHeight() : 0;
    }

    public int getTextSpacing() {
        return this.h;
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            ae adapter = viewPager.getAdapter();
            viewPager.a(this.l);
            viewPager.setOnAdapterChangeListener(this.l);
            this.a = viewPager;
            a(this.m != null ? (ae) this.m.get() : null, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a != null) {
            a(this.a.getAdapter(), null);
            this.a.a(null);
            this.a.setOnAdapterChangeListener(null);
            this.a = null;
        }
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = 0.0f;
        if (this.a != null) {
            if (this.g >= 0.0f) {
                f = this.g;
            }
            a(this.f, f, true);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        mode = getMinHeight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i3 = size2 - paddingTop;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec((int) (((float) size) * 0.8f), Integer.MIN_VALUE);
        i3 = MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        this.b.measure(makeMeasureSpec, i3);
        this.c.measure(makeMeasureSpec, i3);
        this.d.measure(makeMeasureSpec, i3);
        if (mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(size, Math.max(mode, this.c.getMeasuredHeight() + paddingTop));
        }
    }

    public void requestLayout() {
        if (!this.j) {
            super.requestLayout();
        }
    }

    public void setGravity(int i) {
        this.i = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f) {
        this.p = ((int) (255.0f * f)) & 255;
        int i = (this.p << 24) | (this.e & 16777215);
        this.b.setTextColor(i);
        this.d.setTextColor(i);
    }

    public void setTextColor(int i) {
        this.e = i;
        this.c.setTextColor(i);
        int i2 = (this.p << 24) | (this.e & 16777215);
        this.b.setTextColor(i2);
        this.d.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.h = i;
        requestLayout();
    }
}
