package p082p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: p.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1019b extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f4065a;

    /* JADX INFO: renamed from: b */
    public final Paint f4066b;

    /* JADX INFO: renamed from: c */
    public final RectF f4067c;

    /* JADX INFO: renamed from: d */
    public final Rect f4068d;

    /* JADX INFO: renamed from: e */
    public float f4069e;

    /* JADX INFO: renamed from: h */
    public ColorStateList f4072h;

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter f4073i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f4074j;

    /* JADX INFO: renamed from: f */
    public boolean f4070f = false;

    /* JADX INFO: renamed from: g */
    public boolean f4071g = true;

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode f4075k = PorterDuff.Mode.SRC_IN;

    public C1019b(ColorStateList colorStateList, float f) {
        this.f4065a = f;
        Paint paint = new Paint(5);
        this.f4066b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f4072h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f4072h.getDefaultColor()));
        this.f4067c = new RectF();
        this.f4068d = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m2468a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: b */
    public final void m2469b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f4067c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f4068d;
        rect2.set(rect);
        if (this.f4070f) {
            rect2.inset((int) Math.ceil(AbstractC1020c.m2470a(this.f4069e, this.f4065a, this.f4071g)), (int) Math.ceil(AbstractC1020c.m2471b(this.f4069e, this.f4065a, this.f4071g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z2;
        Paint paint = this.f4066b;
        if (this.f4073i == null || paint.getColorFilter() != null) {
            z2 = false;
        } else {
            paint.setColorFilter(this.f4073i);
            z2 = true;
        }
        RectF rectF = this.f4067c;
        float f = this.f4065a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z2) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f4068d, this.f4065a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f4074j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f4072h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m2469b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f4072h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f4066b;
        boolean z2 = colorForState != paint.getColor();
        if (z2) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f4074j;
        if (colorStateList2 == null || (mode = this.f4075k) == null) {
            return z2;
        }
        this.f4073i = m2468a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f4066b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4066b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f4074j = colorStateList;
        this.f4073i = m2468a(colorStateList, this.f4075k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f4075k = mode;
        this.f4073i = m2468a(this.f4074j, mode);
        invalidateSelf();
    }
}
