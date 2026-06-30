package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p001A0.AbstractC0016e;
import p005C0.AbstractC0047m;
import p011G.AbstractC0092a;
import p012G0.AbstractC0102d;
import p012G0.C0100b;
import p015I0.C0116l;
import p015I0.C0117m;
import p015I0.InterfaceC0128x;
import p024N.AbstractC0240S;
import p027O0.AbstractC0322a;
import p036T.AbstractC0383m;
import p074l.C0962q;
import p079n0.AbstractC1013a;
import p090t0.C1051b;
import p090t0.C1052c;
import p090t0.C1055f;
import p090t0.InterfaceC1050a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends C0962q implements Checkable, InterfaceC0128x {

    /* JADX INFO: renamed from: r */
    public static final int[] f2126r = {R.attr.state_checkable};

    /* JADX INFO: renamed from: s */
    public static final int[] f2127s = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    public final C1052c f2128d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f2129e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1050a f2130f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f2131g;

    /* JADX INFO: renamed from: h */
    public ColorStateList f2132h;

    /* JADX INFO: renamed from: i */
    public Drawable f2133i;

    /* JADX INFO: renamed from: j */
    public String f2134j;

    /* JADX INFO: renamed from: k */
    public int f2135k;

    /* JADX INFO: renamed from: l */
    public int f2136l;

    /* JADX INFO: renamed from: m */
    public int f2137m;

    /* JADX INFO: renamed from: n */
    public int f2138n;

    /* JADX INFO: renamed from: o */
    public boolean f2139o;

    /* JADX INFO: renamed from: p */
    public boolean f2140p;

    /* JADX INFO: renamed from: q */
    public int f2141q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC0322a.m979a(context, attributeSet, com.reddit.frontpage.R.attr.resc, com.reddit.frontpage.R.style.resc), attributeSet, com.reddit.frontpage.R.attr.resc);
        this.f2129e = new LinkedHashSet();
        this.f2139o = false;
        this.f2140p = false;
        Context context2 = getContext();
        TypedArray typedArrayM279h = AbstractC0047m.m279h(context2, attributeSet, AbstractC1013a.f4030l, com.reddit.frontpage.R.attr.resc, com.reddit.frontpage.R.style.resc, new int[0]);
        this.f2138n = typedArrayM279h.getDimensionPixelSize(12, 0);
        int i2 = typedArrayM279h.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f2131g = AbstractC0047m.m280i(i2, mode);
        this.f2132h = AbstractC0016e.m162K(getContext(), typedArrayM279h, 14);
        this.f2133i = AbstractC0016e.m165O(getContext(), typedArrayM279h, 10);
        this.f2141q = typedArrayM279h.getInteger(11, 1);
        this.f2135k = typedArrayM279h.getDimensionPixelSize(13, 0);
        C1052c c1052c = new C1052c(this, C0117m.m492b(context2, attributeSet, com.reddit.frontpage.R.attr.resc, com.reddit.frontpage.R.style.resc).m489a());
        this.f2128d = c1052c;
        c1052c.f4191c = typedArrayM279h.getDimensionPixelOffset(1, 0);
        c1052c.f4192d = typedArrayM279h.getDimensionPixelOffset(2, 0);
        c1052c.f4193e = typedArrayM279h.getDimensionPixelOffset(3, 0);
        c1052c.f4194f = typedArrayM279h.getDimensionPixelOffset(4, 0);
        if (typedArrayM279h.hasValue(8)) {
            int dimensionPixelSize = typedArrayM279h.getDimensionPixelSize(8, -1);
            c1052c.f4195g = dimensionPixelSize;
            C0116l c0116lM495e = c1052c.f4190b.m495e();
            c0116lM495e.m490c(dimensionPixelSize);
            c1052c.m2553c(c0116lM495e.m489a());
            c1052c.f4204p = true;
        }
        c1052c.f4196h = typedArrayM279h.getDimensionPixelSize(20, 0);
        c1052c.f4197i = AbstractC0047m.m280i(typedArrayM279h.getInt(7, -1), mode);
        c1052c.f4198j = AbstractC0016e.m162K(getContext(), typedArrayM279h, 6);
        c1052c.f4199k = AbstractC0016e.m162K(getContext(), typedArrayM279h, 19);
        c1052c.f4200l = AbstractC0016e.m162K(getContext(), typedArrayM279h, 16);
        c1052c.f4205q = typedArrayM279h.getBoolean(5, false);
        c1052c.f4208t = typedArrayM279h.getDimensionPixelSize(9, 0);
        c1052c.f4206r = typedArrayM279h.getBoolean(21, true);
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM279h.hasValue(0)) {
            c1052c.f4203o = true;
            setSupportBackgroundTintList(c1052c.f4198j);
            setSupportBackgroundTintMode(c1052c.f4197i);
        } else {
            c1052c.m2555e();
        }
        setPaddingRelative(paddingStart + c1052c.f4191c, paddingTop + c1052c.f4193e, paddingEnd + c1052c.f4192d, paddingBottom + c1052c.f4194f);
        typedArrayM279h.recycle();
        setCompoundDrawablePadding(this.f2138n);
        m1709c(this.f2133i != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i2 = 0; i2 < lineCount; i2++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i2));
        }
        return (int) Math.ceil(fMax);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1707a() {
        C1052c c1052c = this.f2128d;
        return (c1052c == null || c1052c.f4203o) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final void m1708b() {
        int i2 = this.f2141q;
        boolean z2 = true;
        if (i2 != 1 && i2 != 2) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.f2133i, null, null, null);
            return;
        }
        if (i2 == 3 || i2 == 4) {
            setCompoundDrawablesRelative(null, null, this.f2133i, null);
        } else if (i2 == 16 || i2 == 32) {
            setCompoundDrawablesRelative(null, this.f2133i, null, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1709c(boolean z2) {
        Drawable drawable = this.f2133i;
        if (drawable != null) {
            Drawable drawableMutate = AbstractC0016e.m154B0(drawable).mutate();
            this.f2133i = drawableMutate;
            AbstractC0092a.m429h(drawableMutate, this.f2132h);
            PorterDuff.Mode mode = this.f2131g;
            if (mode != null) {
                AbstractC0092a.m430i(this.f2133i, mode);
            }
            int intrinsicWidth = this.f2135k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f2133i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f2135k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f2133i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f2133i;
            int i2 = this.f2136l;
            int i3 = this.f2137m;
            drawable2.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
            this.f2133i.setVisible(true, z2);
        }
        if (z2) {
            m1708b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i4 = this.f2141q;
        if (((i4 == 1 || i4 == 2) && drawable3 != this.f2133i) || (((i4 == 3 || i4 == 4) && drawable5 != this.f2133i) || ((i4 == 16 || i4 == 32) && drawable4 != this.f2133i))) {
            m1708b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1710d(int i2, int i3) {
        if (this.f2133i == null || getLayout() == null) {
            return;
        }
        int i4 = this.f2141q;
        if (!(i4 == 1 || i4 == 2) && i4 != 3 && i4 != 4) {
            if (i4 == 16 || i4 == 32) {
                this.f2136l = 0;
                if (i4 == 16) {
                    this.f2137m = 0;
                    m1709c(false);
                    return;
                }
                int intrinsicHeight = this.f2135k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f2133i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i3 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f2138n) - getPaddingBottom()) / 2);
                if (this.f2137m != iMax) {
                    this.f2137m = iMax;
                    m1709c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f2137m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.f2141q;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f2136l = 0;
            m1709c(false);
            return;
        }
        int intrinsicWidth = this.f2135k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f2133i.getIntrinsicWidth();
        }
        int textLayoutWidth = i2 - getTextLayoutWidth();
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f2138n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f2141q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f2136l != paddingEnd) {
            this.f2136l = paddingEnd;
            m1709c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f2134j)) {
            return this.f2134j;
        }
        C1052c c1052c = this.f2128d;
        return ((c1052c == null || !c1052c.f4205q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m1707a()) {
            return this.f2128d.f4195g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f2133i;
    }

    public int getIconGravity() {
        return this.f2141q;
    }

    public int getIconPadding() {
        return this.f2138n;
    }

    public int getIconSize() {
        return this.f2135k;
    }

    public ColorStateList getIconTint() {
        return this.f2132h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2131g;
    }

    public int getInsetBottom() {
        return this.f2128d.f4194f;
    }

    public int getInsetTop() {
        return this.f2128d.f4193e;
    }

    public ColorStateList getRippleColor() {
        if (m1707a()) {
            return this.f2128d.f4200l;
        }
        return null;
    }

    public C0117m getShapeAppearanceModel() {
        if (m1707a()) {
            return this.f2128d.f4190b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m1707a()) {
            return this.f2128d.f4199k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m1707a()) {
            return this.f2128d.f4196h;
        }
        return 0;
    }

    @Override // p074l.C0962q
    public ColorStateList getSupportBackgroundTintList() {
        return m1707a() ? this.f2128d.f4198j : super.getSupportBackgroundTintList();
    }

    @Override // p074l.C0962q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m1707a() ? this.f2128d.f4197i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2139o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m1707a()) {
            AbstractC0016e.m201x0(this, this.f2128d.m2552b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        C1052c c1052c = this.f2128d;
        if (c1052c != null && c1052c.f4205q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2126r);
        }
        if (this.f2139o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2127s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p074l.C0962q, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f2139o);
    }

    @Override // p074l.C0962q, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C1052c c1052c = this.f2128d;
        accessibilityNodeInfo.setCheckable(c1052c != null && c1052c.f4205q);
        accessibilityNodeInfo.setChecked(this.f2139o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p074l.C0962q, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        C1052c c1052c;
        super.onLayout(z2, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && (c1052c = this.f2128d) != null) {
            int i6 = i5 - i3;
            int i7 = i4 - i2;
            Drawable drawable = c1052c.f4201m;
            if (drawable != null) {
                drawable.setBounds(c1052c.f4191c, c1052c.f4193e, i7 - c1052c.f4192d, i6 - c1052c.f4194f);
            }
        }
        m1710d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1051b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1051b c1051b = (C1051b) parcelable;
        super.onRestoreInstanceState(c1051b.f1069a);
        setChecked(c1051b.f4186c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1051b c1051b = new C1051b(super.onSaveInstanceState());
        c1051b.f4186c = this.f2139o;
        return c1051b;
    }

    @Override // p074l.C0962q, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        m1710d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f2128d.f4206r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f2133i != null) {
            if (this.f2133i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f2134j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (!m1707a()) {
            super.setBackgroundColor(i2);
            return;
        }
        C1052c c1052c = this.f2128d;
        if (c1052c.m2552b(false) != null) {
            c1052c.m2552b(false).setTint(i2);
        }
    }

    @Override // p074l.C0962q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m1707a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C1052c c1052c = this.f2128d;
        c1052c.f4203o = true;
        ColorStateList colorStateList = c1052c.f4198j;
        MaterialButton materialButton = c1052c.f4189a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c1052c.f4197i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p074l.C0962q, android.view.View
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? AbstractC0383m.m1057w(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (m1707a()) {
            this.f2128d.f4205q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        C1052c c1052c = this.f2128d;
        if (c1052c == null || !c1052c.f4205q || !isEnabled() || this.f2139o == z2) {
            return;
        }
        this.f2139o = z2;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z3 = this.f2139o;
            if (!materialButtonToggleGroup.f2148f) {
                materialButtonToggleGroup.m1712b(getId(), z3);
            }
        }
        if (this.f2140p) {
            return;
        }
        this.f2140p = true;
        Iterator it = this.f2129e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f2140p = false;
    }

    public void setCornerRadius(int i2) {
        if (m1707a()) {
            C1052c c1052c = this.f2128d;
            if (c1052c.f4204p && c1052c.f4195g == i2) {
                return;
            }
            c1052c.f4195g = i2;
            c1052c.f4204p = true;
            C0116l c0116lM495e = c1052c.f4190b.m495e();
            c0116lM495e.m490c(i2);
            c1052c.m2553c(c0116lM495e.m489a());
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (m1707a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m1707a()) {
            this.f2128d.m2552b(false).m479k(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f2133i != drawable) {
            this.f2133i = drawable;
            m1709c(true);
            m1710d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.f2141q != i2) {
            this.f2141q = i2;
            m1710d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.f2138n != i2) {
            this.f2138n = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? AbstractC0383m.m1057w(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f2135k != i2) {
            this.f2135k = i2;
            m1709c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f2132h != colorStateList) {
            this.f2132h = colorStateList;
            m1709c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f2131g != mode) {
            this.f2131g = mode;
            m1709c(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(AbstractC0016e.m160I(getContext(), i2));
    }

    public void setInsetBottom(int i2) {
        C1052c c1052c = this.f2128d;
        c1052c.m2554d(c1052c.f4193e, i2);
    }

    public void setInsetTop(int i2) {
        C1052c c1052c = this.f2128d;
        c1052c.m2554d(i2, c1052c.f4194f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC1050a interfaceC1050a) {
        this.f2130f = interfaceC1050a;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        InterfaceC1050a interfaceC1050a = this.f2130f;
        if (interfaceC1050a != null) {
            ((MaterialButtonToggleGroup) ((C1055f) interfaceC1050a).f4215a).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m1707a()) {
            C1052c c1052c = this.f2128d;
            if (c1052c.f4200l != colorStateList) {
                c1052c.f4200l = colorStateList;
                boolean z2 = C1052c.f4187u;
                MaterialButton materialButton = c1052c.f4189a;
                if (z2 && (materialButton.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC0102d.m448a(colorStateList));
                } else {
                    if (z2 || !(materialButton.getBackground() instanceof C0100b)) {
                        return;
                    }
                    ((C0100b) materialButton.getBackground()).setTintList(AbstractC0102d.m448a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i2) {
        if (m1707a()) {
            setRippleColor(AbstractC0016e.m160I(getContext(), i2));
        }
    }

    @Override // p015I0.InterfaceC0128x
    public void setShapeAppearanceModel(C0117m c0117m) {
        if (!m1707a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f2128d.m2553c(c0117m);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (m1707a()) {
            C1052c c1052c = this.f2128d;
            c1052c.f4202n = z2;
            c1052c.m2556f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m1707a()) {
            C1052c c1052c = this.f2128d;
            if (c1052c.f4199k != colorStateList) {
                c1052c.f4199k = colorStateList;
                c1052c.m2556f();
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (m1707a()) {
            setStrokeColor(AbstractC0016e.m160I(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (m1707a()) {
            C1052c c1052c = this.f2128d;
            if (c1052c.f4196h != i2) {
                c1052c.f4196h = i2;
                c1052c.m2556f();
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (m1707a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // p074l.C0962q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m1707a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C1052c c1052c = this.f2128d;
        if (c1052c.f4198j != colorStateList) {
            c1052c.f4198j = colorStateList;
            if (c1052c.m2552b(false) != null) {
                AbstractC0092a.m429h(c1052c.m2552b(false), c1052c.f4198j);
            }
        }
    }

    @Override // p074l.C0962q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m1707a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C1052c c1052c = this.f2128d;
        if (c1052c.f4197i != mode) {
            c1052c.f4197i = mode;
            if (c1052c.m2552b(false) == null || c1052c.f4197i == null) {
                return;
            }
            AbstractC0092a.m430i(c1052c.m2552b(false), c1052c.f4197i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i2) {
        super.setTextAlignment(i2);
        m1710d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.f2128d.f4206r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2139o);
    }
}
