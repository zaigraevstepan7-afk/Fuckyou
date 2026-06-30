package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hf1 extends View {
    public static final int[] j = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] k = new int[0];
    public z32 e;
    public Boolean f;
    public Long g;
    public p h;
    public p7 i;

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.h;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.g;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? j : k;
            z32 z32Var = this.e;
            if (z32Var != null) {
                z32Var.setState(iArr);
            }
        } else {
            p pVar = new p(8, this);
            this.h = pVar;
            postDelayed(pVar, 50L);
        }
        this.g = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(hf1 hf1Var) {
        z32 z32Var = hf1Var.e;
        if (z32Var != null) {
            z32Var.setState(k);
        }
        hf1Var.h = null;
    }

    public final void b(oa1 oa1Var, boolean z, long j2, int i, long j3, float f, p7 p7Var) {
        if (this.e == null || !Boolean.valueOf(z).equals(this.f)) {
            z32 z32Var = new z32(z);
            setBackground(z32Var);
            this.e = z32Var;
            this.f = Boolean.valueOf(z);
        }
        z32 z32Var2 = this.e;
        z32Var2.getClass();
        this.i = p7Var;
        e(j2, i, j3, f);
        if (z) {
            z32Var2.setHotspot(Float.intBitsToFloat((int) (oa1Var.a >> 32)), Float.intBitsToFloat((int) (oa1Var.a & 4294967295L)));
        } else {
            z32Var2.setHotspot(z32Var2.getBounds().centerX(), z32Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.i = null;
        p pVar = this.h;
        if (pVar != null) {
            removeCallbacks(pVar);
            p pVar2 = this.h;
            pVar2.getClass();
            pVar2.run();
        } else {
            z32 z32Var = this.e;
            if (z32Var != null) {
                z32Var.setState(k);
            }
        }
        z32 z32Var2 = this.e;
        if (z32Var2 == null) {
            return;
        }
        z32Var2.setVisible(false, false);
        unscheduleDrawable(z32Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(long j2, int i, long j3, float f) {
        z32 z32Var = this.e;
        if (z32Var == null) {
            return;
        }
        if (z32Var.getRadius() != i) {
            z32Var.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jB = vl.b(f, j3);
        vl vlVar = z32Var.f;
        if (!(vlVar == null ? false : vl.c(vlVar.a, jB))) {
            z32Var.f = new vl(jB);
            z32Var.setColor(ColorStateList.valueOf(lk.l0(jB)));
        }
        Rect rect = new Rect(0, 0, nu0.I(Float.intBitsToFloat((int) (j2 >> 32))), nu0.I(Float.intBitsToFloat((int) (j2 & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        z32Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) throws Throwable {
        p7 p7Var = this.i;
        if (p7Var != null) {
            p7Var.a();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
