package p074l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.reddit.frontpage.R;
import p001A0.AbstractC0016e;
import p011G.AbstractC0092a;
import p024N.AbstractC0240S;
import p024N.C0270l;
import p057d.AbstractC0641a;

/* JADX INFO: renamed from: l.J */
/* JADX INFO: loaded from: classes.dex */
public final class C0881J extends C0871E {

    /* JADX INFO: renamed from: e */
    public final C0879I f3540e;

    /* JADX INFO: renamed from: f */
    public Drawable f3541f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f3542g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f3543h;

    /* JADX INFO: renamed from: i */
    public boolean f3544i;

    /* JADX INFO: renamed from: j */
    public boolean f3545j;

    public C0881J(C0879I c0879i) {
        super(c0879i);
        this.f3542g = null;
        this.f3543h = null;
        this.f3544i = false;
        this.f3545j = false;
        this.f3540e = c0879i;
    }

    @Override // p074l.C0871E
    /* JADX INFO: renamed from: b */
    public final void mo2279b(AttributeSet attributeSet, int i2) {
        super.mo2279b(attributeSet, R.attr.resc);
        C0879I c0879i = this.f3540e;
        Context context = c0879i.getContext();
        int[] iArr = AbstractC0641a.f2486g;
        C0270l c0270lM838m = C0270l.m838m(context, attributeSet, iArr, R.attr.resc);
        AbstractC0240S.m784o(c0879i, c0879i.getContext(), iArr, attributeSet, (TypedArray) c0270lM838m.f837b, R.attr.resc);
        Drawable drawableM846i = c0270lM838m.m846i(0);
        if (drawableM846i != null) {
            c0879i.setThumb(drawableM846i);
        }
        Drawable drawableM845h = c0270lM838m.m845h(1);
        Drawable drawable = this.f3541f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f3541f = drawableM845h;
        if (drawableM845h != null) {
            drawableM845h.setCallback(c0879i);
            AbstractC0016e.m200w0(drawableM845h, c0879i.getLayoutDirection());
            if (drawableM845h.isStateful()) {
                drawableM845h.setState(c0879i.getDrawableState());
            }
            m2288f();
        }
        c0879i.invalidate();
        TypedArray typedArray = (TypedArray) c0270lM838m.f837b;
        if (typedArray.hasValue(3)) {
            this.f3543h = AbstractC0966r0.m2415c(typedArray.getInt(3, -1), this.f3543h);
            this.f3545j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f3542g = c0270lM838m.m844g(2);
            this.f3544i = true;
        }
        c0270lM838m.m851o();
        m2288f();
    }

    /* JADX INFO: renamed from: f */
    public final void m2288f() {
        Drawable drawable = this.f3541f;
        if (drawable != null) {
            if (this.f3544i || this.f3545j) {
                Drawable drawableM154B0 = AbstractC0016e.m154B0(drawable.mutate());
                this.f3541f = drawableM154B0;
                if (this.f3544i) {
                    AbstractC0092a.m429h(drawableM154B0, this.f3542g);
                }
                if (this.f3545j) {
                    AbstractC0092a.m430i(this.f3541f, this.f3543h);
                }
                if (this.f3541f.isStateful()) {
                    this.f3541f.setState(this.f3540e.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2289g(Canvas canvas) {
        if (this.f3541f != null) {
            int max = this.f3540e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f3541f.getIntrinsicWidth();
                int intrinsicHeight = this.f3541f.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f3541f.setBounds(-i2, -i3, i2, i3);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f3541f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
