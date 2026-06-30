package p011G;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import p001A0.AbstractC0016e;

/* JADX INFO: renamed from: G.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0097f extends Drawable implements Drawable.Callback, InterfaceC0096e, InterfaceC0095d {

    /* JADX INFO: renamed from: g */
    public static final PorterDuff.Mode f286g = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h */
    public static Method f287h;

    /* JADX INFO: renamed from: a */
    public int f288a;

    /* JADX INFO: renamed from: b */
    public PorterDuff.Mode f289b;

    /* JADX INFO: renamed from: c */
    public boolean f290c;

    /* JADX INFO: renamed from: d */
    public C0098g f291d;

    /* JADX INFO: renamed from: e */
    public boolean f292e;

    /* JADX INFO: renamed from: f */
    public Drawable f293f;

    /* JADX INFO: renamed from: a */
    public static void m437a() {
        if (f287h == null) {
            try {
                f287h = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m438b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f293f;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    /* JADX INFO: renamed from: c */
    public final C0098g m439c() {
        C0098g c0098g = this.f291d;
        C0098g c0098g2 = new C0098g();
        c0098g2.f296c = null;
        c0098g2.f297d = f286g;
        if (c0098g != null) {
            c0098g2.f294a = c0098g.f294a;
            c0098g2.f295b = c0098g.f295b;
            c0098g2.f296c = c0098g.f296c;
            c0098g2.f297d = c0098g.f297d;
        }
        return c0098g2;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m440d(int[] iArr) {
        return m445i(iArr) || this.f293f.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f293f.draw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m441e(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    /* JADX INFO: renamed from: f */
    public final void m442f(ColorStateList colorStateList) {
        this.f291d.f296c = colorStateList;
        m445i(this.f293f.getState());
    }

    /* JADX INFO: renamed from: g */
    public final void m443g(PorterDuff.Mode mode) {
        this.f291d.f297d = mode;
        m445i(this.f293f.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0098g c0098g = this.f291d;
        return changingConfigurations | (c0098g != null ? c0098g.getChangingConfigurations() : 0) | this.f293f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        C0098g c0098g = this.f291d;
        if (c0098g == null || c0098g.f295b == null) {
            return null;
        }
        c0098g.f294a = getChangingConfigurations();
        return this.f291d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f293f.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.f293f.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f293f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f293f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return AbstractC0016e.m167S(this.f293f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f293f.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f293f.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f293f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.f293f.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f293f.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f293f.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f293f.getTransparentRegion();
    }

    /* JADX INFO: renamed from: h */
    public final void m444h(Drawable drawable) {
        Drawable drawable2 = this.f293f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f293f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0098g c0098g = this.f291d;
            if (c0098g != null) {
                c0098g.f295b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m445i(int[] iArr) {
        if (m438b()) {
            C0098g c0098g = this.f291d;
            ColorStateList colorStateList = c0098g.f296c;
            PorterDuff.Mode mode = c0098g.f297d;
            if (colorStateList == null || mode == null) {
                this.f290c = false;
                clearColorFilter();
                return false;
            }
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f290c || colorForState != this.f288a || mode != this.f289b) {
                setColorFilter(colorForState, mode);
                this.f288a = colorForState;
                this.f289b = mode;
                this.f290c = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f293f.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f293f;
        if (drawable != null && (method = f287h) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e2);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C0098g c0098g;
        ColorStateList colorStateList = (!m438b() || (c0098g = this.f291d) == null) ? null : c0098g.f296c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f293f.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f293f.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f292e && super.mutate() == this) {
            this.f291d = m439c();
            Drawable drawable = this.f293f;
            if (drawable != null) {
                drawable.mutate();
            }
            C0098g c0098g = this.f291d;
            if (c0098g != null) {
                Drawable drawable2 = this.f293f;
                c0098g.f295b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f292e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f293f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        return AbstractC0016e.m200w0(this.f293f, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        return this.f293f.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f293f.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        this.f293f.setAutoMirrored(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i2) {
        this.f293f.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f293f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        this.f293f.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z2) {
        this.f293f.setFilterBitmap(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        this.f293f.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.f293f.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (!m440d(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        if (m438b()) {
            m441e(i2);
        } else {
            this.f293f.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (m438b()) {
            m442f(colorStateList);
        } else {
            this.f293f.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (m438b()) {
            m443g(mode);
        } else {
            this.f293f.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.f293f.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
