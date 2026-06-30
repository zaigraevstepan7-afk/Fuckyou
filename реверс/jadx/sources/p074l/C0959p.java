package p074l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import p024N.AbstractC0229G;
import p024N.AbstractC0240S;
import p024N.C0270l;
import p057d.AbstractC0641a;

/* JADX INFO: renamed from: l.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0959p {

    /* JADX INFO: renamed from: a */
    public final View f3818a;

    /* JADX INFO: renamed from: d */
    public C0916a1 f3821d;

    /* JADX INFO: renamed from: e */
    public C0916a1 f3822e;

    /* JADX INFO: renamed from: f */
    public C0916a1 f3823f;

    /* JADX INFO: renamed from: c */
    public int f3820c = -1;

    /* JADX INFO: renamed from: b */
    public final C0973u f3819b = C0973u.m2423a();

    public C0959p(View view) {
        this.f3818a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m2403a() {
        View view = this.f3818a;
        Drawable background = view.getBackground();
        if (background != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 <= 21 ? i2 == 21 : this.f3821d != null) {
                if (this.f3823f == null) {
                    this.f3823f = new C0916a1();
                }
                C0916a1 c0916a1 = this.f3823f;
                c0916a1.f3699a = null;
                c0916a1.f3702d = false;
                c0916a1.f3700b = null;
                c0916a1.f3701c = false;
                WeakHashMap weakHashMap = AbstractC0240S.f777a;
                ColorStateList colorStateListM705g = AbstractC0229G.m705g(view);
                if (colorStateListM705g != null) {
                    c0916a1.f3702d = true;
                    c0916a1.f3699a = colorStateListM705g;
                }
                PorterDuff.Mode modeM706h = AbstractC0229G.m706h(view);
                if (modeM706h != null) {
                    c0916a1.f3701c = true;
                    c0916a1.f3700b = modeM706h;
                }
                if (c0916a1.f3702d || c0916a1.f3701c) {
                    C0973u.m2426e(background, c0916a1, view.getDrawableState());
                    return;
                }
            }
            C0916a1 c0916a12 = this.f3822e;
            if (c0916a12 != null) {
                C0973u.m2426e(background, c0916a12, view.getDrawableState());
                return;
            }
            C0916a1 c0916a13 = this.f3821d;
            if (c0916a13 != null) {
                C0973u.m2426e(background, c0916a13, view.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final ColorStateList m2404b() {
        C0916a1 c0916a1 = this.f3822e;
        if (c0916a1 != null) {
            return c0916a1.f3699a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final PorterDuff.Mode m2405c() {
        C0916a1 c0916a1 = this.f3822e;
        if (c0916a1 != null) {
            return c0916a1.f3700b;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m2406d(AttributeSet attributeSet, int i2) {
        ColorStateList colorStateListM2325i;
        View view = this.f3818a;
        Context context = view.getContext();
        int[] iArr = AbstractC0641a.f2505z;
        C0270l c0270lM838m = C0270l.m838m(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) c0270lM838m.f837b;
        View view2 = this.f3818a;
        AbstractC0240S.m784o(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c0270lM838m.f837b, i2);
        try {
            if (typedArray.hasValue(0)) {
                this.f3820c = typedArray.getResourceId(0, -1);
                C0973u c0973u = this.f3819b;
                Context context2 = view.getContext();
                int i3 = this.f3820c;
                synchronized (c0973u) {
                    colorStateListM2325i = c0973u.f3860a.m2325i(context2, i3);
                }
                if (colorStateListM2325i != null) {
                    m2409g(colorStateListM2325i);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC0240S.m787r(view, c0270lM838m.m844g(1));
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode modeM2415c = AbstractC0966r0.m2415c(typedArray.getInt(2, -1), null);
                int i4 = Build.VERSION.SDK_INT;
                AbstractC0229G.m716r(view, modeM2415c);
                if (i4 == 21) {
                    Drawable background = view.getBackground();
                    boolean z2 = (AbstractC0229G.m705g(view) == null && AbstractC0229G.m706h(view) == null) ? false : true;
                    if (background != null && z2) {
                        if (background.isStateful()) {
                            background.setState(view.getDrawableState());
                        }
                        view.setBackground(background);
                    }
                }
            }
            c0270lM838m.m851o();
        } catch (Throwable th) {
            c0270lM838m.m851o();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2407e() {
        this.f3820c = -1;
        m2409g(null);
        m2403a();
    }

    /* JADX INFO: renamed from: f */
    public final void m2408f(int i2) {
        ColorStateList colorStateListM2325i;
        this.f3820c = i2;
        C0973u c0973u = this.f3819b;
        if (c0973u != null) {
            Context context = this.f3818a.getContext();
            synchronized (c0973u) {
                colorStateListM2325i = c0973u.f3860a.m2325i(context, i2);
            }
        } else {
            colorStateListM2325i = null;
        }
        m2409g(colorStateListM2325i);
        m2403a();
    }

    /* JADX INFO: renamed from: g */
    public final void m2409g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3821d == null) {
                this.f3821d = new C0916a1();
            }
            C0916a1 c0916a1 = this.f3821d;
            c0916a1.f3699a = colorStateList;
            c0916a1.f3702d = true;
        } else {
            this.f3821d = null;
        }
        m2403a();
    }

    /* JADX INFO: renamed from: h */
    public final void m2410h(ColorStateList colorStateList) {
        if (this.f3822e == null) {
            this.f3822e = new C0916a1();
        }
        C0916a1 c0916a1 = this.f3822e;
        c0916a1.f3699a = colorStateList;
        c0916a1.f3702d = true;
        m2403a();
    }

    /* JADX INFO: renamed from: i */
    public final void m2411i(PorterDuff.Mode mode) {
        if (this.f3822e == null) {
            this.f3822e = new C0916a1();
        }
        C0916a1 c0916a1 = this.f3822e;
        c0916a1.f3700b = mode;
        c0916a1.f3701c = true;
        m2403a();
    }
}
