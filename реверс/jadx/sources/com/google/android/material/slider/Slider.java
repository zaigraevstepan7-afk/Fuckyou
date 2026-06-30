package com.google.android.material.slider;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.SeekBar;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import p001A0.AbstractC0016e;
import p015I0.C0105a;
import p015I0.C0109e;
import p015I0.C0112h;
import p015I0.C0116l;
import p015I0.C0117m;
import p019K0.AbstractC0165g;
import p019K0.InterfaceC0166h;

/* JADX INFO: loaded from: classes.dex */
public class Slider extends AbstractC0165g {
    public Slider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setValue(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.f528T;
    }

    public int getFocusedThumbIndex() {
        return this.f529U;
    }

    public int getHaloRadius() {
        return this.f515G;
    }

    public ColorStateList getHaloTintList() {
        return this.f545g0;
    }

    public int getLabelBehavior() {
        return this.f510B;
    }

    public float getStepSize() {
        return this.f530V;
    }

    public float getThumbElevation() {
        return this.f561o0.f346a.f340m;
    }

    public int getThumbHeight() {
        return this.f514F;
    }

    @Override // p019K0.AbstractC0165g
    public int getThumbRadius() {
        return this.f513E / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f561o0.f346a.f331d;
    }

    public float getThumbStrokeWidth() {
        return this.f561o0.f346a.f337j;
    }

    public ColorStateList getThumbTintList() {
        return this.f561o0.f346a.f330c;
    }

    public int getThumbTrackGapSize() {
        return this.f516H;
    }

    public int getThumbWidth() {
        return this.f513E;
    }

    public int getTickActiveRadius() {
        return this.f535b0;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f547h0;
    }

    public int getTickInactiveRadius() {
        return this.f537c0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f549i0;
    }

    public ColorStateList getTickTintList() {
        if (this.f549i0.equals(this.f547h0)) {
            return this.f547h0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f551j0;
    }

    public int getTrackHeight() {
        return this.f511C;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f553k0;
    }

    public int getTrackInsideCornerSize() {
        return this.f520L;
    }

    public int getTrackSidePadding() {
        return this.f512D;
    }

    public int getTrackStopIndicatorSize() {
        return this.f519K;
    }

    public ColorStateList getTrackTintList() {
        if (this.f553k0.equals(this.f551j0)) {
            return this.f551j0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f539d0;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    public float getValueFrom() {
        return this.f525Q;
    }

    public float getValueTo() {
        return this.f526R;
    }

    public void setCustomThumbDrawable(int i2) {
        setCustomThumbDrawable(getResources().getDrawable(i2));
    }

    @Override // p019K0.AbstractC0165g, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setFocusedThumbIndex(int i2) {
        if (i2 < 0 || i2 >= this.f527S.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f529U = i2;
        this.f546h.m1113w(i2);
        postInvalidate();
    }

    @Override // p019K0.AbstractC0165g
    public void setHaloRadius(int i2) {
        if (i2 == this.f515G) {
            return;
        }
        this.f515G = i2;
        Drawable background = getBackground();
        if (!(getBackground() instanceof RippleDrawable) || !(background instanceof RippleDrawable)) {
            postInvalidate();
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) background;
        int i3 = this.f515G;
        if (Build.VERSION.SDK_INT >= 23) {
            rippleDrawable.setRadius(i3);
            return;
        }
        try {
            RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE).invoke(rippleDrawable, Integer.valueOf(i3));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            throw new IllegalStateException("Couldn't set RippleDrawable radius", e2);
        }
    }

    public void setHaloRadiusResource(int i2) {
        setHaloRadius(getResources().getDimensionPixelSize(i2));
    }

    @Override // p019K0.AbstractC0165g
    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f545g0)) {
            return;
        }
        this.f545g0 = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        Paint paint = this.f538d;
        paint.setColor(m583h(colorStateList));
        paint.setAlpha(63);
        invalidate();
    }

    @Override // p019K0.AbstractC0165g
    public void setLabelBehavior(int i2) {
        if (this.f510B != i2) {
            this.f510B = i2;
            requestLayout();
        }
    }

    public void setStepSize(float f) {
        if (f >= 0.0f) {
            if (this.f530V != f) {
                this.f530V = f;
                this.f543f0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The stepSize(" + f + ") must be 0, or a factor of the valueFrom(" + this.f525Q + ")-valueTo(" + this.f526R + ") range");
    }

    @Override // p019K0.AbstractC0165g
    public void setThumbElevation(float f) {
        this.f561o0.m479k(f);
    }

    public void setThumbElevationResource(int i2) {
        setThumbElevation(getResources().getDimension(i2));
    }

    @Override // p019K0.AbstractC0165g
    public void setThumbHeight(int i2) {
        if (i2 == this.f514F) {
            return;
        }
        this.f514F = i2;
        this.f561o0.setBounds(0, 0, this.f513E, i2);
        Drawable drawable = this.f563p0;
        if (drawable != null) {
            m576a(drawable);
        }
        Iterator it = this.f565q0.iterator();
        while (it.hasNext()) {
            m576a((Drawable) it.next());
        }
        m600y();
    }

    public void setThumbHeightResource(int i2) {
        setThumbHeight(getResources().getDimensionPixelSize(i2));
    }

    public void setThumbRadius(int i2) {
        int i3 = i2 * 2;
        setThumbWidth(i3);
        setThumbHeight(i3);
    }

    public void setThumbRadiusResource(int i2) {
        setThumbRadius(getResources().getDimensionPixelSize(i2));
    }

    @Override // p019K0.AbstractC0165g
    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f561o0.m484p(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i2) {
        if (i2 != 0) {
            setThumbStrokeColor(AbstractC0016e.m160I(getContext(), i2));
        }
    }

    @Override // p019K0.AbstractC0165g
    public void setThumbStrokeWidth(float f) {
        C0112h c0112h = this.f561o0;
        c0112h.f346a.f337j = f;
        c0112h.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i2) {
        if (i2 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i2));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        C0112h c0112h = this.f561o0;
        if (colorStateList.equals(c0112h.f346a.f330c)) {
            return;
        }
        c0112h.m480l(colorStateList);
        invalidate();
    }

    @Override // p019K0.AbstractC0165g
    public void setThumbTrackGapSize(int i2) {
        if (this.f516H == i2) {
            return;
        }
        this.f516H = i2;
        invalidate();
    }

    @Override // p019K0.AbstractC0165g
    public void setThumbWidth(int i2) {
        if (i2 == this.f513E) {
            return;
        }
        this.f513E = i2;
        C0112h c0112h = this.f561o0;
        C0109e c0109e = new C0109e(0);
        C0109e c0109e2 = new C0109e(0);
        C0109e c0109e3 = new C0109e(0);
        C0109e c0109e4 = new C0109e(0);
        float f = this.f513E / 2.0f;
        AbstractC0016e abstractC0016eM198t = AbstractC0016e.m198t(0);
        C0116l.m488b(abstractC0016eM198t);
        C0116l.m488b(abstractC0016eM198t);
        C0116l.m488b(abstractC0016eM198t);
        C0116l.m488b(abstractC0016eM198t);
        C0105a c0105a = new C0105a(f);
        C0105a c0105a2 = new C0105a(f);
        C0105a c0105a3 = new C0105a(f);
        C0105a c0105a4 = new C0105a(f);
        C0117m c0117m = new C0117m();
        c0117m.f383a = abstractC0016eM198t;
        c0117m.f384b = abstractC0016eM198t;
        c0117m.f385c = abstractC0016eM198t;
        c0117m.f386d = abstractC0016eM198t;
        c0117m.f387e = c0105a;
        c0117m.f388f = c0105a2;
        c0117m.f389g = c0105a3;
        c0117m.f390h = c0105a4;
        c0117m.f391i = c0109e;
        c0117m.f392j = c0109e2;
        c0117m.f393k = c0109e3;
        c0117m.f394l = c0109e4;
        c0112h.setShapeAppearanceModel(c0117m);
        c0112h.setBounds(0, 0, this.f513E, this.f514F);
        Drawable drawable = this.f563p0;
        if (drawable != null) {
            m576a(drawable);
        }
        Iterator it = this.f565q0.iterator();
        while (it.hasNext()) {
            m576a((Drawable) it.next());
        }
        m600y();
    }

    public void setThumbWidthResource(int i2) {
        setThumbWidth(getResources().getDimensionPixelSize(i2));
    }

    @Override // p019K0.AbstractC0165g
    public void setTickActiveRadius(int i2) {
        if (this.f535b0 != i2) {
            this.f535b0 = i2;
            this.f542f.setStrokeWidth(i2 * 2);
            m600y();
        }
    }

    @Override // p019K0.AbstractC0165g
    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f547h0)) {
            return;
        }
        this.f547h0 = colorStateList;
        this.f542f.setColor(m583h(colorStateList));
        invalidate();
    }

    @Override // p019K0.AbstractC0165g
    public void setTickInactiveRadius(int i2) {
        if (this.f537c0 != i2) {
            this.f537c0 = i2;
            this.f540e.setStrokeWidth(i2 * 2);
            m600y();
        }
    }

    @Override // p019K0.AbstractC0165g
    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f549i0)) {
            return;
        }
        this.f549i0 = colorStateList;
        this.f540e.setColor(m583h(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z2) {
        if (this.f533a0 != z2) {
            this.f533a0 = z2;
            postInvalidate();
        }
    }

    @Override // p019K0.AbstractC0165g
    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f551j0)) {
            return;
        }
        this.f551j0 = colorStateList;
        this.f534b.setColor(m583h(colorStateList));
        this.f544g.setColor(m583h(this.f551j0));
        invalidate();
    }

    @Override // p019K0.AbstractC0165g
    public void setTrackHeight(int i2) {
        if (this.f511C != i2) {
            this.f511C = i2;
            this.f532a.setStrokeWidth(i2);
            this.f534b.setStrokeWidth(this.f511C);
            m600y();
        }
    }

    @Override // p019K0.AbstractC0165g
    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f553k0)) {
            return;
        }
        this.f553k0 = colorStateList;
        this.f532a.setColor(m583h(colorStateList));
        invalidate();
    }

    @Override // p019K0.AbstractC0165g
    public void setTrackInsideCornerSize(int i2) {
        if (this.f520L == i2) {
            return;
        }
        this.f520L = i2;
        invalidate();
    }

    @Override // p019K0.AbstractC0165g
    public void setTrackStopIndicatorSize(int i2) {
        if (this.f519K == i2) {
            return;
        }
        this.f519K = i2;
        this.f544g.setStrokeWidth(i2);
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f) {
        setValues(Float.valueOf(f));
    }

    public void setValueFrom(float f) {
        this.f525Q = f;
        this.f543f0 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f526R = f;
        this.f543f0 = true;
        postInvalidate();
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        m576a(drawableNewDrawable);
        this.f563p0 = drawableNewDrawable;
        this.f565q0.clear();
        postInvalidate();
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(InterfaceC0166h interfaceC0166h) {
    }
}
