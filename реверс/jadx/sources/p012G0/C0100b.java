package p012G0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p011G.InterfaceC0095d;
import p015I0.C0117m;
import p015I0.InterfaceC0128x;

/* JADX INFO: renamed from: G0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0100b extends Drawable implements InterfaceC0128x, InterfaceC0095d {

    /* JADX INFO: renamed from: a */
    public C0099a f300a;

    public C0100b(C0099a c0099a) {
        this.f300a = c0099a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C0099a c0099a = this.f300a;
        if (c0099a.f299b) {
            c0099a.f298a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f300a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        this.f300a.f298a.getClass();
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f300a = new C0099a(this.f300a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f300a.f298a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f300a.f298a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zM449b = AbstractC0102d.m449b(iArr);
        C0099a c0099a = this.f300a;
        if (c0099a.f299b == zM449b) {
            return zOnStateChange;
        }
        c0099a.f299b = zM449b;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f300a.f298a.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f300a.f298a.setColorFilter(colorFilter);
    }

    @Override // p015I0.InterfaceC0128x
    public final void setShapeAppearanceModel(C0117m c0117m) {
        this.f300a.f298a.setShapeAppearanceModel(c0117m);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        this.f300a.f298a.setTint(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f300a.f298a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f300a.f298a.setTintMode(mode);
    }
}
