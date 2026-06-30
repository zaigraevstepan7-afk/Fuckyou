package p021L0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.reddit.frontpage.R;
import java.util.WeakHashMap;
import p001A0.AbstractC0016e;
import p005C0.AbstractC0047m;
import p011G.AbstractC0092a;
import p015I0.C0112h;
import p015I0.C0117m;
import p024N.AbstractC0227E;
import p024N.AbstractC0229G;
import p024N.AbstractC0240S;
import p027O0.AbstractC0322a;
import p036T.AbstractC0383m;
import p079n0.AbstractC1013a;

/* JADX INFO: renamed from: L0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0180c extends FrameLayout {

    /* JADX INFO: renamed from: i */
    public static final ViewOnTouchListenerC0179b f600i = new ViewOnTouchListenerC0179b();

    /* JADX INFO: renamed from: a */
    public final C0117m f601a;

    /* JADX INFO: renamed from: b */
    public int f602b;

    /* JADX INFO: renamed from: c */
    public final float f603c;

    /* JADX INFO: renamed from: d */
    public final float f604d;

    /* JADX INFO: renamed from: e */
    public final int f605e;

    /* JADX INFO: renamed from: f */
    public final int f606f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f607g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f608h;

    public AbstractC0180c(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        Drawable drawableM154B0;
        super(AbstractC0322a.m979a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC1013a.f4013C);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = AbstractC0240S.f777a;
            AbstractC0229G.m717s(this, dimensionPixelSize);
        }
        this.f602b = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f601a = C0117m.m492b(context2, attributeSet, 0, 0).m489a();
        }
        this.f603c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC0016e.m162K(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC0047m.m280i(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f604d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f605e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f606f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f600i);
        setFocusable(true);
        if (getBackground() == null) {
            int iM1030I = AbstractC0383m.m1030I(AbstractC0383m.m1056v(this, R.attr.resc), AbstractC0383m.m1056v(this, R.attr.resc), getBackgroundOverlayColorAlpha());
            C0117m c0117m = this.f601a;
            if (c0117m != null) {
                int i2 = AbstractC0181d.f609a;
                C0112h c0112h = new C0112h(c0117m);
                c0112h.m480l(ColorStateList.valueOf(iM1030I));
                drawable = c0112h;
            } else {
                Resources resources = getResources();
                int i3 = AbstractC0181d.f609a;
                float dimension = resources.getDimension(R.dimen.resc);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iM1030I);
                drawable = gradientDrawable;
            }
            if (this.f607g != null) {
                drawableM154B0 = AbstractC0016e.m154B0(drawable);
                AbstractC0092a.m429h(drawableM154B0, this.f607g);
            } else {
                drawableM154B0 = AbstractC0016e.m154B0(drawable);
            }
            WeakHashMap weakHashMap2 = AbstractC0240S.f777a;
            setBackground(drawableM154B0);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f604d;
    }

    public int getAnimationMode() {
        return this.f602b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f603c;
    }

    public int getMaxInlineActionWidth() {
        return this.f606f;
    }

    public int getMaxWidth() {
        return this.f605e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = AbstractC0240S.f777a;
        AbstractC0227E.m698c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int i4 = this.f605e;
        if (i4 <= 0 || getMeasuredWidth() <= i4) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
    }

    public void setAnimationMode(int i2) {
        this.f602b = i2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f607g != null) {
            drawable = AbstractC0016e.m154B0(drawable.mutate());
            AbstractC0092a.m429h(drawable, this.f607g);
            AbstractC0092a.m430i(drawable, this.f608h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f607g = colorStateList;
        if (getBackground() != null) {
            Drawable drawableM154B0 = AbstractC0016e.m154B0(getBackground().mutate());
            AbstractC0092a.m429h(drawableM154B0, colorStateList);
            AbstractC0092a.m430i(drawableM154B0, this.f608h);
            if (drawableM154B0 != getBackground()) {
                super.setBackgroundDrawable(drawableM154B0);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f608h = mode;
        if (getBackground() != null) {
            Drawable drawableM154B0 = AbstractC0016e.m154B0(getBackground().mutate());
            AbstractC0092a.m430i(drawableM154B0, mode);
            if (drawableM154B0 != getBackground()) {
                super.setBackgroundDrawable(drawableM154B0);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f600i);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(AbstractC0181d abstractC0181d) {
    }
}
