package p005C0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p074l.AbstractC0868C0;
import p079n0.AbstractC1013a;

/* JADX INFO: renamed from: C0.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0039e extends AbstractC0868C0 {

    /* JADX INFO: renamed from: p */
    public Drawable f141p;

    /* JADX INFO: renamed from: q */
    public final Rect f142q;

    /* JADX INFO: renamed from: r */
    public final Rect f143r;

    /* JADX INFO: renamed from: s */
    public int f144s;

    /* JADX INFO: renamed from: t */
    public final boolean f145t;

    /* JADX INFO: renamed from: u */
    public boolean f146u;

    public AbstractC0039e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f142q = new Rect();
        this.f143r = new Rect();
        this.f144s = 119;
        this.f145t = true;
        this.f146u = false;
        int[] iArr = AbstractC1013a.f4027i;
        AbstractC0047m.m272a(context, attributeSet, 0, 0);
        AbstractC0047m.m273b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f144s = typedArrayObtainStyledAttributes.getInt(1, this.f144s);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f145t = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f141p;
        if (drawable != null) {
            if (this.f146u) {
                this.f146u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z2 = this.f145t;
                Rect rect = this.f142q;
                if (z2) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i2 = this.f144s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f143r;
                Gravity.apply(i2, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f141p;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f141p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f141p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f141p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f144s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f141p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p074l.AbstractC0868C0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.f146u = z2 | this.f146u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f146u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f141p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f141p);
            }
            this.f141p = drawable;
            this.f146u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f144s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i2) {
        if (this.f144s != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f144s = i2;
            if (i2 == 119 && this.f141p != null) {
                this.f141p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f141p;
    }
}
