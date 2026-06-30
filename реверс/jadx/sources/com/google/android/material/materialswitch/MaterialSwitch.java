package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.reddit.frontpage.R;
import p001A0.AbstractC0016e;
import p005C0.AbstractC0047m;
import p009F.AbstractC0074a;
import p011G.AbstractC0092a;
import p024N.C0270l;
import p027O0.AbstractC0322a;
import p036T.AbstractC0383m;
import p074l.AbstractC0909X0;
import p079n0.AbstractC1013a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialSwitch extends AbstractC0909X0 {

    /* JADX INFO: renamed from: j0 */
    public static final int[] f2293j0 = {R.attr.resc};

    /* JADX INFO: renamed from: T */
    public Drawable f2294T;

    /* JADX INFO: renamed from: U */
    public Drawable f2295U;

    /* JADX INFO: renamed from: V */
    public int f2296V;

    /* JADX INFO: renamed from: W */
    public Drawable f2297W;

    /* JADX INFO: renamed from: a0 */
    public Drawable f2298a0;

    /* JADX INFO: renamed from: b0 */
    public ColorStateList f2299b0;

    /* JADX INFO: renamed from: c0 */
    public ColorStateList f2300c0;

    /* JADX INFO: renamed from: d0 */
    public PorterDuff.Mode f2301d0;

    /* JADX INFO: renamed from: e0 */
    public ColorStateList f2302e0;

    /* JADX INFO: renamed from: f0 */
    public ColorStateList f2303f0;

    /* JADX INFO: renamed from: g0 */
    public PorterDuff.Mode f2304g0;

    /* JADX INFO: renamed from: h0 */
    public int[] f2305h0;

    /* JADX INFO: renamed from: i0 */
    public int[] f2306i0;

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        super(AbstractC0322a.m979a(context, attributeSet, R.attr.resc, R.style.resc), attributeSet);
        this.f2296V = -1;
        Context context2 = getContext();
        this.f2294T = super.getThumbDrawable();
        this.f2299b0 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.f2297W = super.getTrackDrawable();
        this.f2302e0 = super.getTrackTintList();
        super.setTrackTintList(null);
        int[] iArr = AbstractC1013a.f4038t;
        AbstractC0047m.m272a(context2, attributeSet, R.attr.resc, R.style.resc);
        AbstractC0047m.m273b(context2, attributeSet, iArr, R.attr.resc, R.style.resc, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.resc, R.style.resc);
        C0270l c0270l = new C0270l(context2, typedArrayObtainStyledAttributes);
        this.f2295U = c0270l.m845h(0);
        this.f2296V = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        this.f2300c0 = c0270l.m844g(2);
        int i2 = typedArrayObtainStyledAttributes.getInt(3, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f2301d0 = AbstractC0047m.m280i(i2, mode);
        this.f2298a0 = c0270l.m845h(4);
        this.f2303f0 = c0270l.m844g(5);
        this.f2304g0 = AbstractC0047m.m280i(typedArrayObtainStyledAttributes.getInt(6, -1), mode);
        c0270l.m851o();
        setEnforceSwitchWidth(false);
        m1754e();
        m1755f();
    }

    /* JADX INFO: renamed from: g */
    public static void m1753g(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        AbstractC0092a.m428g(drawable, AbstractC0074a.m353b(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f));
    }

    /* JADX INFO: renamed from: e */
    public final void m1754e() {
        this.f2294T = AbstractC0016e.m152A(this.f2294T, this.f2299b0, getThumbTintMode(), false);
        this.f2295U = AbstractC0016e.m152A(this.f2295U, this.f2300c0, this.f2301d0, false);
        m1756h();
        Drawable drawable = this.f2294T;
        Drawable drawable2 = this.f2295U;
        int i2 = this.f2296V;
        super.setThumbDrawable(AbstractC0016e.m188o(drawable, drawable2, i2, i2));
        refreshDrawableState();
    }

    /* JADX INFO: renamed from: f */
    public final void m1755f() {
        this.f2297W = AbstractC0016e.m152A(this.f2297W, this.f2302e0, getTrackTintMode(), false);
        this.f2298a0 = AbstractC0016e.m152A(this.f2298a0, this.f2303f0, this.f2304g0, false);
        m1756h();
        Drawable layerDrawable = this.f2297W;
        if (layerDrawable != null && this.f2298a0 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.f2297W, this.f2298a0});
        } else if (layerDrawable == null) {
            layerDrawable = this.f2298a0;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    @Override // p074l.AbstractC0909X0
    public Drawable getThumbDrawable() {
        return this.f2294T;
    }

    public Drawable getThumbIconDrawable() {
        return this.f2295U;
    }

    public int getThumbIconSize() {
        return this.f2296V;
    }

    public ColorStateList getThumbIconTintList() {
        return this.f2300c0;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f2301d0;
    }

    @Override // p074l.AbstractC0909X0
    public ColorStateList getThumbTintList() {
        return this.f2299b0;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.f2298a0;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.f2303f0;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f2304g0;
    }

    @Override // p074l.AbstractC0909X0
    public Drawable getTrackDrawable() {
        return this.f2297W;
    }

    @Override // p074l.AbstractC0909X0
    public ColorStateList getTrackTintList() {
        return this.f2302e0;
    }

    /* JADX INFO: renamed from: h */
    public final void m1756h() {
        if (this.f2299b0 == null && this.f2300c0 == null && this.f2302e0 == null && this.f2303f0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f2299b0;
        if (colorStateList != null) {
            m1753g(this.f2294T, colorStateList, this.f2305h0, this.f2306i0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f2300c0;
        if (colorStateList2 != null) {
            m1753g(this.f2295U, colorStateList2, this.f2305h0, this.f2306i0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f2302e0;
        if (colorStateList3 != null) {
            m1753g(this.f2297W, colorStateList3, this.f2305h0, this.f2306i0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f2303f0;
        if (colorStateList4 != null) {
            m1753g(this.f2298a0, colorStateList4, this.f2305h0, this.f2306i0, thumbPosition);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        m1756h();
        super.invalidate();
    }

    @Override // p074l.AbstractC0909X0, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (this.f2295U != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2293j0);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i3 = 0;
        for (int i4 : iArrOnCreateDrawableState) {
            if (i4 != 16842912) {
                iArr[i3] = i4;
                i3++;
            }
        }
        this.f2305h0 = iArr;
        this.f2306i0 = AbstractC0016e.m158G(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // p074l.AbstractC0909X0
    public void setThumbDrawable(Drawable drawable) {
        this.f2294T = drawable;
        m1754e();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.f2295U = drawable;
        m1754e();
    }

    public void setThumbIconResource(int i2) {
        setThumbIconDrawable(AbstractC0383m.m1057w(getContext(), i2));
    }

    public void setThumbIconSize(int i2) {
        if (this.f2296V != i2) {
            this.f2296V = i2;
            m1754e();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.f2300c0 = colorStateList;
        m1754e();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.f2301d0 = mode;
        m1754e();
    }

    @Override // p074l.AbstractC0909X0
    public void setThumbTintList(ColorStateList colorStateList) {
        this.f2299b0 = colorStateList;
        m1754e();
    }

    @Override // p074l.AbstractC0909X0
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        m1754e();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.f2298a0 = drawable;
        m1755f();
    }

    public void setTrackDecorationResource(int i2) {
        setTrackDecorationDrawable(AbstractC0383m.m1057w(getContext(), i2));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.f2303f0 = colorStateList;
        m1755f();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.f2304g0 = mode;
        m1755f();
    }

    @Override // p074l.AbstractC0909X0
    public void setTrackDrawable(Drawable drawable) {
        this.f2297W = drawable;
        m1755f();
    }

    @Override // p074l.AbstractC0909X0
    public void setTrackTintList(ColorStateList colorStateList) {
        this.f2302e0 = colorStateList;
        m1755f();
    }

    @Override // p074l.AbstractC0909X0
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        m1755f();
    }
}
