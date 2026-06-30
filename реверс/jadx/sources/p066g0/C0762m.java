package p066g0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p019K0.C0160b;
import p023M0.RunnableC0191D;

/* JADX INFO: renamed from: g0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0762m extends AbstractC0720H {

    /* JADX INFO: renamed from: C */
    public static final int[] f3045C = {R.attr.state_pressed};

    /* JADX INFO: renamed from: D */
    public static final int[] f3046D = new int[0];

    /* JADX INFO: renamed from: A */
    public int f3047A;

    /* JADX INFO: renamed from: B */
    public final RunnableC0191D f3048B;

    /* JADX INFO: renamed from: a */
    public final int f3049a;

    /* JADX INFO: renamed from: b */
    public final int f3050b;

    /* JADX INFO: renamed from: c */
    public final StateListDrawable f3051c;

    /* JADX INFO: renamed from: d */
    public final Drawable f3052d;

    /* JADX INFO: renamed from: e */
    public final int f3053e;

    /* JADX INFO: renamed from: f */
    public final int f3054f;

    /* JADX INFO: renamed from: g */
    public final StateListDrawable f3055g;

    /* JADX INFO: renamed from: h */
    public final Drawable f3056h;

    /* JADX INFO: renamed from: i */
    public final int f3057i;

    /* JADX INFO: renamed from: j */
    public final int f3058j;

    /* JADX INFO: renamed from: k */
    public int f3059k;

    /* JADX INFO: renamed from: l */
    public int f3060l;

    /* JADX INFO: renamed from: m */
    public float f3061m;

    /* JADX INFO: renamed from: n */
    public int f3062n;

    /* JADX INFO: renamed from: o */
    public int f3063o;

    /* JADX INFO: renamed from: p */
    public float f3064p;

    /* JADX INFO: renamed from: s */
    public final RecyclerView f3067s;

    /* JADX INFO: renamed from: z */
    public final ValueAnimator f3074z;

    /* JADX INFO: renamed from: q */
    public int f3065q = 0;

    /* JADX INFO: renamed from: r */
    public int f3066r = 0;

    /* JADX INFO: renamed from: t */
    public boolean f3068t = false;

    /* JADX INFO: renamed from: u */
    public boolean f3069u = false;

    /* JADX INFO: renamed from: v */
    public int f3070v = 0;

    /* JADX INFO: renamed from: w */
    public int f3071w = 0;

    /* JADX INFO: renamed from: x */
    public final int[] f3072x = new int[2];

    /* JADX INFO: renamed from: y */
    public final int[] f3073y = new int[2];

    public C0762m(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3074z = valueAnimatorOfFloat;
        this.f3047A = 0;
        RunnableC0191D runnableC0191D = new RunnableC0191D(8, this);
        this.f3048B = runnableC0191D;
        C0758k c0758k = new C0758k(this);
        this.f3051c = stateListDrawable;
        this.f3052d = drawable;
        this.f3055g = stateListDrawable2;
        this.f3056h = drawable2;
        this.f3053e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f3054f = Math.max(i2, drawable.getIntrinsicWidth());
        this.f3057i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f3058j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f3049a = i3;
        this.f3050b = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C0760l(this));
        valueAnimatorOfFloat.addUpdateListener(new C0160b(2, this));
        RecyclerView recyclerView2 = this.f3067s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC0723K abstractC0723K = recyclerView2.f1982m;
            if (abstractC0723K != null) {
                abstractC0723K.mo1569c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1986o;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m1610R();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f3067s;
            recyclerView3.f1988p.remove(this);
            if (recyclerView3.f1990q == this) {
                recyclerView3.f1990q = null;
            }
            ArrayList arrayList2 = this.f3067s.f1971g0;
            if (arrayList2 != null) {
                arrayList2.remove(c0758k);
            }
            this.f3067s.removeCallbacks(runnableC0191D);
        }
        this.f3067s = recyclerView;
        if (recyclerView != null) {
            recyclerView.m1628i(this);
            this.f3067s.f1988p.add(this);
            this.f3067s.m1630j(c0758k);
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m2093e(float f, float f2, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 != 0) {
            int i6 = i2 - i4;
            int i7 = (int) (((f2 - f) / i5) * i6);
            int i8 = i3 + i7;
            if (i8 < i6 && i8 >= 0) {
                return i7;
            }
        }
        return 0;
    }

    @Override // p066g0.AbstractC0720H
    /* JADX INFO: renamed from: b */
    public final void mo1983b(Canvas canvas, RecyclerView recyclerView) {
        if (this.f3065q != this.f3067s.getWidth() || this.f3066r != this.f3067s.getHeight()) {
            this.f3065q = this.f3067s.getWidth();
            this.f3066r = this.f3067s.getHeight();
            m2096f(0);
            return;
        }
        if (this.f3047A != 0) {
            if (this.f3068t) {
                int i2 = this.f3065q;
                int i3 = this.f3053e;
                int i4 = i2 - i3;
                int i5 = this.f3060l;
                int i6 = this.f3059k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f3051c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f3066r;
                int i9 = this.f3054f;
                Drawable drawable = this.f3052d;
                drawable.setBounds(0, 0, i9, i8);
                if (this.f3067s.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f3069u) {
                int i10 = this.f3066r;
                int i11 = this.f3057i;
                int i12 = i10 - i11;
                int i13 = this.f3063o;
                int i14 = this.f3062n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f3055g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f3065q;
                int i17 = this.f3058j;
                Drawable drawable2 = this.f3056h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2094c(float f, float f2) {
        if (f2 < this.f3066r - this.f3057i) {
            return false;
        }
        int i2 = this.f3063o;
        int i3 = this.f3062n;
        return f >= ((float) (i2 - (i3 / 2))) && f <= ((float) ((i3 / 2) + i2));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2095d(float f, float f2) {
        boolean z2 = this.f3067s.getLayoutDirection() == 1;
        int i2 = this.f3053e;
        if (!z2 ? f >= this.f3065q - i2 : f <= i2) {
            int i3 = this.f3060l;
            int i4 = this.f3059k / 2;
            if (f2 >= i3 - i4 && f2 <= i4 + i3) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m2096f(int i2) {
        RunnableC0191D runnableC0191D = this.f3048B;
        StateListDrawable stateListDrawable = this.f3051c;
        if (i2 == 2 && this.f3070v != 2) {
            stateListDrawable.setState(f3045C);
            this.f3067s.removeCallbacks(runnableC0191D);
        }
        if (i2 == 0) {
            this.f3067s.invalidate();
        } else {
            m2097g();
        }
        if (this.f3070v == 2 && i2 != 2) {
            stateListDrawable.setState(f3046D);
            this.f3067s.removeCallbacks(runnableC0191D);
            this.f3067s.postDelayed(runnableC0191D, 1200);
        } else if (i2 == 1) {
            this.f3067s.removeCallbacks(runnableC0191D);
            this.f3067s.postDelayed(runnableC0191D, 1500);
        }
        this.f3070v = i2;
    }

    /* JADX INFO: renamed from: g */
    public final void m2097g() {
        int i2 = this.f3047A;
        ValueAnimator valueAnimator = this.f3074z;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f3047A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
