package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import p001A0.AbstractC0016e;
import p005C0.AbstractC0047m;
import p011G.AbstractC0092a;
import p012G0.AbstractC0102d;
import p015I0.C0112h;
import p015I0.C0116l;
import p015I0.C0117m;
import p015I0.InterfaceC0128x;
import p027O0.AbstractC0322a;
import p036T.AbstractC0383m;
import p079n0.AbstractC1013a;
import p082p.AbstractC1018a;
import p092u0.C1059c;
import p092u0.InterfaceC1057a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends AbstractC1018a implements Checkable, InterfaceC0128x {

    /* JADX INFO: renamed from: l */
    public static final int[] f2153l = {R.attr.state_checkable};

    /* JADX INFO: renamed from: m */
    public static final int[] f2154m = {R.attr.state_checked};

    /* JADX INFO: renamed from: n */
    public static final int[] f2155n = {com.reddit.frontpage.R.attr.resc};

    /* JADX INFO: renamed from: h */
    public final C1059c f2156h;

    /* JADX INFO: renamed from: i */
    public final boolean f2157i;

    /* JADX INFO: renamed from: j */
    public boolean f2158j;

    /* JADX INFO: renamed from: k */
    public boolean f2159k;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(AbstractC0322a.m979a(context, attributeSet, com.reddit.frontpage.R.attr.resc, com.reddit.frontpage.R.style.resc), attributeSet);
        this.f2158j = false;
        this.f2159k = false;
        this.f2157i = true;
        TypedArray typedArrayM279h = AbstractC0047m.m279h(getContext(), attributeSet, AbstractC1013a.f4034p, com.reddit.frontpage.R.attr.resc, com.reddit.frontpage.R.style.resc, new int[0]);
        C1059c c1059c = new C1059c(this, attributeSet);
        this.f2156h = c1059c;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        C0112h c0112h = c1059c.f4221c;
        c0112h.m480l(cardBackgroundColor);
        c1059c.f4220b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c1059c.m2568l();
        MaterialCardView materialCardView = c1059c.f4219a;
        ColorStateList colorStateListM162K = AbstractC0016e.m162K(materialCardView.getContext(), typedArrayM279h, 11);
        c1059c.f4232n = colorStateListM162K;
        if (colorStateListM162K == null) {
            c1059c.f4232n = ColorStateList.valueOf(-1);
        }
        c1059c.f4226h = typedArrayM279h.getDimensionPixelSize(12, 0);
        boolean z2 = typedArrayM279h.getBoolean(0, false);
        c1059c.f4237s = z2;
        materialCardView.setLongClickable(z2);
        c1059c.f4230l = AbstractC0016e.m162K(materialCardView.getContext(), typedArrayM279h, 6);
        c1059c.m2563g(AbstractC0016e.m165O(materialCardView.getContext(), typedArrayM279h, 2));
        c1059c.f4224f = typedArrayM279h.getDimensionPixelSize(5, 0);
        c1059c.f4223e = typedArrayM279h.getDimensionPixelSize(4, 0);
        c1059c.f4225g = typedArrayM279h.getInteger(3, 8388661);
        ColorStateList colorStateListM162K2 = AbstractC0016e.m162K(materialCardView.getContext(), typedArrayM279h, 7);
        c1059c.f4229k = colorStateListM162K2;
        if (colorStateListM162K2 == null) {
            c1059c.f4229k = ColorStateList.valueOf(AbstractC0383m.m1056v(materialCardView, com.reddit.frontpage.R.attr.resc));
        }
        ColorStateList colorStateListM162K3 = AbstractC0016e.m162K(materialCardView.getContext(), typedArrayM279h, 1);
        C0112h c0112h2 = c1059c.f4222d;
        c0112h2.m480l(colorStateListM162K3 == null ? ColorStateList.valueOf(0) : colorStateListM162K3);
        int[] iArr = AbstractC0102d.f301a;
        RippleDrawable rippleDrawable = c1059c.f4233o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(c1059c.f4229k);
        }
        c0112h.m479k(materialCardView.getCardElevation());
        float f = c1059c.f4226h;
        ColorStateList colorStateList = c1059c.f4232n;
        c0112h2.f346a.f337j = f;
        c0112h2.invalidateSelf();
        c0112h2.m484p(colorStateList);
        materialCardView.setBackgroundInternal(c1059c.m2560d(c0112h));
        Drawable drawableM2559c = c1059c.m2566j() ? c1059c.m2559c() : c0112h2;
        c1059c.f4227i = drawableM2559c;
        materialCardView.setForeground(c1059c.m2560d(drawableM2559c));
        typedArrayM279h.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f2156h.f4221c.getBounds());
        return rectF;
    }

    /* JADX INFO: renamed from: b */
    public final void m1716b() {
        C1059c c1059c;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (c1059c = this.f2156h).f4233o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i2 = bounds.bottom;
        c1059c.f4233o.setBounds(bounds.left, bounds.top, bounds.right, i2 - 1);
        c1059c.f4233o.setBounds(bounds.left, bounds.top, bounds.right, i2);
    }

    @Override // p082p.AbstractC1018a
    public ColorStateList getCardBackgroundColor() {
        return this.f2156h.f4221c.f346a.f330c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f2156h.f4222d.f346a.f330c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f2156h.f4228j;
    }

    public int getCheckedIconGravity() {
        return this.f2156h.f4225g;
    }

    public int getCheckedIconMargin() {
        return this.f2156h.f4223e;
    }

    public int getCheckedIconSize() {
        return this.f2156h.f4224f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f2156h.f4230l;
    }

    @Override // p082p.AbstractC1018a
    public int getContentPaddingBottom() {
        return this.f2156h.f4220b.bottom;
    }

    @Override // p082p.AbstractC1018a
    public int getContentPaddingLeft() {
        return this.f2156h.f4220b.left;
    }

    @Override // p082p.AbstractC1018a
    public int getContentPaddingRight() {
        return this.f2156h.f4220b.right;
    }

    @Override // p082p.AbstractC1018a
    public int getContentPaddingTop() {
        return this.f2156h.f4220b.top;
    }

    public float getProgress() {
        return this.f2156h.f4221c.f346a.f336i;
    }

    @Override // p082p.AbstractC1018a
    public float getRadius() {
        return this.f2156h.f4221c.m476h();
    }

    public ColorStateList getRippleColor() {
        return this.f2156h.f4229k;
    }

    public C0117m getShapeAppearanceModel() {
        return this.f2156h.f4231m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f2156h.f4232n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f2156h.f4232n;
    }

    public int getStrokeWidth() {
        return this.f2156h.f4226h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2158j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1059c c1059c = this.f2156h;
        c1059c.m2567k();
        AbstractC0016e.m201x0(this, c1059c.f4221c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        C1059c c1059c = this.f2156h;
        if (c1059c != null && c1059c.f4237s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2153l);
        }
        if (this.f2158j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2154m);
        }
        if (this.f2159k) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2155n);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f2158j);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        C1059c c1059c = this.f2156h;
        accessibilityNodeInfo.setCheckable(c1059c != null && c1059c.f4237s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f2158j);
    }

    @Override // p082p.AbstractC1018a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.f2156h.m2561e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f2157i) {
            C1059c c1059c = this.f2156h;
            if (!c1059c.f4236r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                c1059c.f4236r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // p082p.AbstractC1018a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f2156h.f4221c.m480l(colorStateList);
    }

    @Override // p082p.AbstractC1018a
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        C1059c c1059c = this.f2156h;
        c1059c.f4221c.m479k(c1059c.f4219a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        C0112h c0112h = this.f2156h.f4222d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c0112h.m480l(colorStateList);
    }

    public void setCheckable(boolean z2) {
        this.f2156h.f4237s = z2;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (this.f2158j != z2) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f2156h.m2563g(drawable);
    }

    public void setCheckedIconGravity(int i2) {
        C1059c c1059c = this.f2156h;
        if (c1059c.f4225g != i2) {
            c1059c.f4225g = i2;
            MaterialCardView materialCardView = c1059c.f4219a;
            c1059c.m2561e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i2) {
        this.f2156h.f4223e = i2;
    }

    public void setCheckedIconMarginResource(int i2) {
        if (i2 != -1) {
            this.f2156h.f4223e = getResources().getDimensionPixelSize(i2);
        }
    }

    public void setCheckedIconResource(int i2) {
        this.f2156h.m2563g(AbstractC0383m.m1057w(getContext(), i2));
    }

    public void setCheckedIconSize(int i2) {
        this.f2156h.f4224f = i2;
    }

    public void setCheckedIconSizeResource(int i2) {
        if (i2 != 0) {
            this.f2156h.f4224f = getResources().getDimensionPixelSize(i2);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C1059c c1059c = this.f2156h;
        c1059c.f4230l = colorStateList;
        Drawable drawable = c1059c.f4228j;
        if (drawable != null) {
            AbstractC0092a.m429h(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z2) {
        super.setClickable(z2);
        C1059c c1059c = this.f2156h;
        if (c1059c != null) {
            c1059c.m2567k();
        }
    }

    public void setDragged(boolean z2) {
        if (this.f2159k != z2) {
            this.f2159k = z2;
            refreshDrawableState();
            m1716b();
            invalidate();
        }
    }

    @Override // p082p.AbstractC1018a
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f2156h.m2569m();
    }

    @Override // p082p.AbstractC1018a
    public void setPreventCornerOverlap(boolean z2) {
        super.setPreventCornerOverlap(z2);
        C1059c c1059c = this.f2156h;
        c1059c.m2569m();
        c1059c.m2568l();
    }

    public void setProgress(float f) {
        C1059c c1059c = this.f2156h;
        c1059c.f4221c.m481m(f);
        C0112h c0112h = c1059c.f4222d;
        if (c0112h != null) {
            c0112h.m481m(f);
        }
        C0112h c0112h2 = c1059c.f4235q;
        if (c0112h2 != null) {
            c0112h2.m481m(f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    @Override // p082p.AbstractC1018a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setRadius(float f) {
        super.setRadius(f);
        C1059c c1059c = this.f2156h;
        C0116l c0116lM495e = c1059c.f4231m.m495e();
        c0116lM495e.m490c(f);
        c1059c.m2564h(c0116lM495e.m489a());
        c1059c.f4227i.invalidateSelf();
        if (c1059c.m2565i()) {
            c1059c.m2568l();
        } else if (c1059c.f4219a.getPreventCornerOverlap()) {
            C0112h c0112h = c1059c.f4221c;
            if (!c0112h.f346a.f328a.m494d(c0112h.m475g())) {
            }
        }
        if (c1059c.m2565i()) {
            c1059c.m2569m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C1059c c1059c = this.f2156h;
        c1059c.f4229k = colorStateList;
        int[] iArr = AbstractC0102d.f301a;
        RippleDrawable rippleDrawable = c1059c.f4233o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i2) {
        ColorStateList colorStateListM160I = AbstractC0016e.m160I(getContext(), i2);
        C1059c c1059c = this.f2156h;
        c1059c.f4229k = colorStateListM160I;
        int[] iArr = AbstractC0102d.f301a;
        RippleDrawable rippleDrawable = c1059c.f4233o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListM160I);
        }
    }

    @Override // p015I0.InterfaceC0128x
    public void setShapeAppearanceModel(C0117m c0117m) {
        setClipToOutline(c0117m.m494d(getBoundsAsRectF()));
        this.f2156h.m2564h(c0117m);
    }

    public void setStrokeColor(int i2) {
        setStrokeColor(ColorStateList.valueOf(i2));
    }

    public void setStrokeWidth(int i2) {
        C1059c c1059c = this.f2156h;
        if (i2 != c1059c.f4226h) {
            c1059c.f4226h = i2;
            C0112h c0112h = c1059c.f4222d;
            ColorStateList colorStateList = c1059c.f4232n;
            c0112h.f346a.f337j = i2;
            c0112h.invalidateSelf();
            c0112h.m484p(colorStateList);
        }
        invalidate();
    }

    @Override // p082p.AbstractC1018a
    public void setUseCompatPadding(boolean z2) {
        super.setUseCompatPadding(z2);
        C1059c c1059c = this.f2156h;
        c1059c.m2569m();
        c1059c.m2568l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        C1059c c1059c = this.f2156h;
        if (c1059c != null && c1059c.f4237s && isEnabled()) {
            this.f2158j = !this.f2158j;
            refreshDrawableState();
            m1716b();
            c1059c.m2562f(this.f2158j, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C1059c c1059c = this.f2156h;
        if (c1059c.f4232n != colorStateList) {
            c1059c.f4232n = colorStateList;
            C0112h c0112h = c1059c.f4222d;
            c0112h.f346a.f337j = c1059c.f4226h;
            c0112h.invalidateSelf();
            c0112h.m484p(colorStateList);
        }
        invalidate();
    }

    @Override // p082p.AbstractC1018a
    public void setCardBackgroundColor(int i2) {
        this.f2156h.f4221c.m480l(ColorStateList.valueOf(i2));
    }

    public void setOnCheckedChangeListener(InterfaceC1057a interfaceC1057a) {
    }
}
