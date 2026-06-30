package p082p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p005C0.C0048n;
import p015I0.C0109e;
import p080o.AbstractC1014a;

/* JADX INFO: renamed from: p.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1018a extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final int[] f4058f = {R.attr.colorBackground};

    /* JADX INFO: renamed from: g */
    public static final C0109e f4059g = new C0109e(25);

    /* JADX INFO: renamed from: a */
    public boolean f4060a;

    /* JADX INFO: renamed from: b */
    public boolean f4061b;

    /* JADX INFO: renamed from: c */
    public final Rect f4062c;

    /* JADX INFO: renamed from: d */
    public final Rect f4063d;

    /* JADX INFO: renamed from: e */
    public final C0048n f4064e;

    public AbstractC1018a(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, com.reddit.frontpage.R.attr.resc);
        Rect rect = new Rect();
        this.f4062c = rect;
        this.f4063d = new Rect();
        C0048n c0048n = new C0048n(16, this);
        this.f4064e = c0048n;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1014a.f4045a, com.reddit.frontpage.R.attr.resc, com.reddit.frontpage.R.style.resc);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f4058f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.reddit.frontpage.R.color.resc) : getResources().getColor(com.reddit.frontpage.R.color.resc));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f4060a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f4061b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        C0109e c0109e = f4059g;
        C1019b c1019b = new C1019b(colorStateListValueOf, dimension);
        c0048n.f174b = c1019b;
        setBackgroundDrawable(c1019b);
        setClipToOutline(true);
        setElevation(dimension2);
        c0109e.m465n(c0048n, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C1019b) ((Drawable) this.f4064e.f174b)).f4072h;
    }

    public float getCardElevation() {
        return ((AbstractC1018a) this.f4064e.f175c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f4062c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f4062c.left;
    }

    public int getContentPaddingRight() {
        return this.f4062c.right;
    }

    public int getContentPaddingTop() {
        return this.f4062c.top;
    }

    public float getMaxCardElevation() {
        return ((C1019b) ((Drawable) this.f4064e.f174b)).f4069e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f4061b;
    }

    public float getRadius() {
        return ((C1019b) ((Drawable) this.f4064e.f174b)).f4065a;
    }

    public boolean getUseCompatPadding() {
        return this.f4060a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
        C1019b c1019b = (C1019b) ((Drawable) this.f4064e.f174b);
        if (colorStateListValueOf == null) {
            c1019b.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        c1019b.f4072h = colorStateListValueOf;
        c1019b.f4066b.setColor(colorStateListValueOf.getColorForState(c1019b.getState(), c1019b.f4072h.getDefaultColor()));
        c1019b.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((AbstractC1018a) this.f4064e.f175c).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        f4059g.m465n(this.f4064e, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        super.setMinimumWidth(i2);
    }

    public void setPreventCornerOverlap(boolean z2) {
        if (z2 != this.f4061b) {
            this.f4061b = z2;
            C0109e c0109e = f4059g;
            C0048n c0048n = this.f4064e;
            c0109e.m465n(c0048n, ((C1019b) ((Drawable) c0048n.f174b)).f4069e);
        }
    }

    public void setRadius(float f) {
        C1019b c1019b = (C1019b) ((Drawable) this.f4064e.f174b);
        if (f == c1019b.f4065a) {
            return;
        }
        c1019b.f4065a = f;
        c1019b.m2469b(null);
        c1019b.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.f4060a != z2) {
            this.f4060a = z2;
            C0109e c0109e = f4059g;
            C0048n c0048n = this.f4064e;
            c0109e.m465n(c0048n, ((C1019b) ((Drawable) c0048n.f174b)).f4069e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C1019b c1019b = (C1019b) ((Drawable) this.f4064e.f174b);
        if (colorStateList == null) {
            c1019b.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c1019b.f4072h = colorStateList;
        c1019b.f4066b.setColor(colorStateList.getColorForState(c1019b.getState(), c1019b.f4072h.getDefaultColor()));
        c1019b.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }
}
