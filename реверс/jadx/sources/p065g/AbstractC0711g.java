package p065g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import p001A0.AbstractC0016e;
import p011G.AbstractC0092a;
import p023M0.RunnableC0191D;

/* JADX INFO: renamed from: g.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0711g extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ int f2831m = 0;

    /* JADX INFO: renamed from: a */
    public C0706b f2832a;

    /* JADX INFO: renamed from: b */
    public Rect f2833b;

    /* JADX INFO: renamed from: c */
    public Drawable f2834c;

    /* JADX INFO: renamed from: d */
    public Drawable f2835d;

    /* JADX INFO: renamed from: e */
    public int f2836e;

    /* JADX INFO: renamed from: f */
    public boolean f2837f;

    /* JADX INFO: renamed from: g */
    public int f2838g;

    /* JADX INFO: renamed from: h */
    public boolean f2839h;

    /* JADX INFO: renamed from: i */
    public RunnableC0191D f2840i;

    /* JADX INFO: renamed from: j */
    public long f2841j;

    /* JADX INFO: renamed from: k */
    public long f2842k;

    /* JADX INFO: renamed from: l */
    public C0710f f2843l;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1962a(boolean z2) {
        boolean z3;
        Drawable drawable;
        boolean z4 = true;
        this.f2837f = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f2834c;
        if (drawable2 != null) {
            long j2 = this.f2841j;
            if (j2 != 0) {
                if (j2 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f2836e);
                    this.f2841j = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j2 - jUptimeMillis) * 255)) / this.f2832a.f2815y)) * this.f2836e) / 255);
                    z3 = true;
                }
            }
            drawable = this.f2835d;
            if (drawable == null) {
                long j3 = this.f2842k;
                if (j3 != 0) {
                    if (j3 <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f2835d = null;
                        this.f2842k = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j3 - jUptimeMillis) * 255)) / this.f2832a.f2816z) * this.f2836e) / 255);
                    }
                }
                if (z2 && z4) {
                    scheduleSelf(this.f2840i, jUptimeMillis + 16);
                    return;
                }
                return;
            }
            this.f2842k = 0L;
            z4 = z3;
            if (z2) {
                return;
            } else {
                return;
            }
        }
        this.f2841j = 0L;
        z3 = false;
        drawable = this.f2835d;
        if (drawable == null) {
        }
        z4 = z3;
        if (z2) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        C0706b c0706b = this.f2832a;
        if (theme == null) {
            c0706b.getClass();
            return;
        }
        c0706b.m1954c();
        int i2 = c0706b.f2798h;
        Drawable[] drawableArr = c0706b.f2797g;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            if (drawable != null && AbstractC0092a.m423b(drawable)) {
                AbstractC0092a.m422a(drawableArr[i3], theme);
                c0706b.f2795e |= drawableArr[i3].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            c0706b.f2792b = resources;
            int i4 = resources.getDisplayMetrics().densityDpi;
            if (i4 == 0) {
                i4 = 160;
            }
            int i5 = c0706b.f2793c;
            c0706b.f2793c = i4;
            if (i5 != i4) {
                c0706b.f2803m = false;
                c0706b.f2800j = false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1963b(Drawable drawable) {
        if (this.f2843l == null) {
            this.f2843l = new C0710f();
        }
        C0710f c0710f = this.f2843l;
        c0710f.f2830b = drawable.getCallback();
        drawable.setCallback(c0710f);
        try {
            if (this.f2832a.f2815y <= 0 && this.f2837f) {
                drawable.setAlpha(this.f2836e);
            }
            C0706b c0706b = this.f2832a;
            if (c0706b.f2783C) {
                drawable.setColorFilter(c0706b.f2782B);
            } else {
                if (c0706b.f2786F) {
                    AbstractC0092a.m429h(drawable, c0706b.f2784D);
                }
                C0706b c0706b2 = this.f2832a;
                if (c0706b2.f2787G) {
                    AbstractC0092a.m430i(drawable, c0706b2.f2785E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f2832a.f2813w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC0016e.m200w0(drawable, AbstractC0016e.m167S(this));
            }
            drawable.setAutoMirrored(this.f2832a.f2781A);
            Rect rect = this.f2833b;
            if (rect != null) {
                AbstractC0092a.m427f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            C0710f c0710f2 = this.f2843l;
            Drawable.Callback callback = (Drawable.Callback) c0710f2.f2830b;
            c0710f2.f2830b = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            C0710f c0710f3 = this.f2843l;
            Drawable.Callback callback2 = (Drawable.Callback) c0710f3.f2830b;
            c0710f3.f2830b = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1964c(int i2) {
        if (i2 == this.f2838g) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f2832a.f2816z > 0) {
            Drawable drawable = this.f2835d;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f2834c;
            if (drawable2 != null) {
                this.f2835d = drawable2;
                this.f2842k = ((long) this.f2832a.f2816z) + jUptimeMillis;
            } else {
                this.f2835d = null;
                this.f2842k = 0L;
            }
        } else {
            Drawable drawable3 = this.f2834c;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i2 >= 0) {
            C0706b c0706b = this.f2832a;
            if (i2 < c0706b.f2798h) {
                Drawable drawableM1955d = c0706b.m1955d(i2);
                this.f2834c = drawableM1955d;
                this.f2838g = i2;
                if (drawableM1955d != null) {
                    int i3 = this.f2832a.f2815y;
                    if (i3 > 0) {
                        this.f2841j = jUptimeMillis + ((long) i3);
                    }
                    m1963b(drawableM1955d);
                }
            } else {
                this.f2834c = null;
                this.f2838g = -1;
            }
        }
        if (this.f2841j != 0 || this.f2842k != 0) {
            RunnableC0191D runnableC0191D = this.f2840i;
            if (runnableC0191D == null) {
                this.f2840i = new RunnableC0191D(7, (C0709e) this);
            } else {
                unscheduleSelf(runnableC0191D);
            }
            m1962a(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f2832a.canApplyTheme();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo1959d(C0706b c0706b);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f2834c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f2835d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f2836e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f2832a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z2;
        C0706b c0706b = this.f2832a;
        if (!c0706b.f2811u) {
            c0706b.m1954c();
            c0706b.f2811u = true;
            int i2 = c0706b.f2798h;
            Drawable[] drawableArr = c0706b.f2797g;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    c0706b.f2812v = true;
                    z2 = true;
                    break;
                }
                if (drawableArr[i3].getConstantState() == null) {
                    c0706b.f2812v = false;
                    z2 = false;
                    break;
                }
                i3++;
            }
        } else {
            z2 = c0706b.f2812v;
        }
        if (!z2) {
            return null;
        }
        this.f2832a.f2794d = getChangingConfigurations();
        return this.f2832a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f2834c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f2833b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C0706b c0706b = this.f2832a;
        if (c0706b.f2802l) {
            if (!c0706b.f2803m) {
                c0706b.m1953b();
            }
            return c0706b.f2805o;
        }
        Drawable drawable = this.f2834c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C0706b c0706b = this.f2832a;
        if (c0706b.f2802l) {
            if (!c0706b.f2803m) {
                c0706b.m1953b();
            }
            return c0706b.f2804n;
        }
        Drawable drawable = this.f2834c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        C0706b c0706b = this.f2832a;
        if (c0706b.f2802l) {
            if (!c0706b.f2803m) {
                c0706b.m1953b();
            }
            return c0706b.f2807q;
        }
        Drawable drawable = this.f2834c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        C0706b c0706b = this.f2832a;
        if (c0706b.f2802l) {
            if (!c0706b.f2803m) {
                c0706b.m1953b();
            }
            return c0706b.f2806p;
        }
        Drawable drawable = this.f2834c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2834c;
        if (drawable != null && drawable.isVisible()) {
            C0706b c0706b = this.f2832a;
            if (c0706b.f2808r) {
                return c0706b.f2809s;
            }
            c0706b.m1954c();
            int i2 = c0706b.f2798h;
            Drawable[] drawableArr = c0706b.f2797g;
            opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i3 = 1; i3 < i2; i3++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
            }
            c0706b.f2809s = opacity;
            c0706b.f2808r = true;
        }
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f2834c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C0706b c0706b = this.f2832a;
        boolean padding = false;
        Rect rect2 = null;
        if (!c0706b.f2799i) {
            Rect rect3 = c0706b.f2801k;
            if (rect3 != null || c0706b.f2800j) {
                rect2 = rect3;
            } else {
                c0706b.m1954c();
                Rect rect4 = new Rect();
                int i2 = c0706b.f2798h;
                Drawable[] drawableArr = c0706b.f2797g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i4 = rect4.left;
                        if (i4 > rect2.left) {
                            rect2.left = i4;
                        }
                        int i5 = rect4.top;
                        if (i5 > rect2.top) {
                            rect2.top = i5;
                        }
                        int i6 = rect4.right;
                        if (i6 > rect2.right) {
                            rect2.right = i6;
                        }
                        int i7 = rect4.bottom;
                        if (i7 > rect2.bottom) {
                            rect2.bottom = i7;
                        }
                    }
                }
                c0706b.f2800j = true;
                c0706b.f2801k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f2834c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f2832a.f2781A && AbstractC0016e.m167S(this) == 1) {
            int i8 = rect.left;
            rect.left = rect.right;
            rect.right = i8;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C0706b c0706b = this.f2832a;
        if (c0706b != null) {
            c0706b.f2808r = false;
            c0706b.f2810t = false;
        }
        if (drawable != this.f2834c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f2832a.f2781A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z2;
        Drawable drawable = this.f2835d;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f2835d = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f2834c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f2837f) {
                this.f2834c.setAlpha(this.f2836e);
            }
        }
        if (this.f2842k != 0) {
            this.f2842k = 0L;
            z2 = true;
        }
        if (this.f2841j != 0) {
            this.f2841j = 0L;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2839h && super.mutate() == this) {
            C0709e c0709e = (C0709e) this;
            C0706b c0706b = new C0706b(c0709e.f2824p, c0709e, null);
            c0706b.f2789I = c0706b.f2789I.clone();
            c0706b.f2790J = c0706b.f2790J.clone();
            mo1959d(c0706b);
            this.f2839h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2835d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f2834c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        C0706b c0706b = this.f2832a;
        int i3 = this.f2838g;
        int i4 = c0706b.f2798h;
        Drawable[] drawableArr = c0706b.f2797g;
        boolean z2 = false;
        for (int i5 = 0; i5 < i4; i5++) {
            Drawable drawable = drawableArr[i5];
            if (drawable != null) {
                boolean zM200w0 = Build.VERSION.SDK_INT >= 23 ? AbstractC0016e.m200w0(drawable, i2) : false;
                if (i5 == i3) {
                    z2 = zM200w0;
                }
            }
        }
        c0706b.f2814x = i2;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.f2835d;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f2834c;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable != this.f2834c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.f2837f && this.f2836e == i2) {
            return;
        }
        this.f2837f = true;
        this.f2836e = i2;
        Drawable drawable = this.f2834c;
        if (drawable != null) {
            if (this.f2841j == 0) {
                drawable.setAlpha(i2);
            } else {
                m1962a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        C0706b c0706b = this.f2832a;
        if (c0706b.f2781A != z2) {
            c0706b.f2781A = z2;
            Drawable drawable = this.f2834c;
            if (drawable != null) {
                drawable.setAutoMirrored(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C0706b c0706b = this.f2832a;
        c0706b.f2783C = true;
        if (c0706b.f2782B != colorFilter) {
            c0706b.f2782B = colorFilter;
            Drawable drawable = this.f2834c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        C0706b c0706b = this.f2832a;
        if (c0706b.f2813w != z2) {
            c0706b.f2813w = z2;
            Drawable drawable = this.f2834c;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f2834c;
        if (drawable != null) {
            AbstractC0092a.m426e(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f2833b;
        if (rect == null) {
            this.f2833b = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f2834c;
        if (drawable != null) {
            AbstractC0092a.m427f(drawable, i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        C0706b c0706b = this.f2832a;
        c0706b.f2786F = true;
        if (c0706b.f2784D != colorStateList) {
            c0706b.f2784D = colorStateList;
            AbstractC0092a.m429h(this.f2834c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C0706b c0706b = this.f2832a;
        c0706b.f2787G = true;
        if (c0706b.f2785E != mode) {
            c0706b.f2785E = mode;
            AbstractC0092a.m430i(this.f2834c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.f2835d;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f2834c;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f2834c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
