package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cy extends r implements c11 {
    public final Window n;
    public final v41 o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;

    public cy(Context context, Window window) {
        super(context);
        this.n = window;
        this.o = xc.B(ko.a);
        Field field = h62.a;
        b62.b(this, this);
        h62.c(this, new ay(this));
    }

    @Override // defpackage.c11
    public final p82 a(View view, p82 p82Var) {
        if (!this.q) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return p82Var.a.q(iMax, iMax2, iMax3, iMax4);
            }
        }
        return p82Var;
    }

    @Override // defpackage.r
    public final void b(ob0 ob0Var, int i) {
        ob0Var.X(1735448596);
        int i2 = (ob0Var.h(this) ? 4 : 2) | i;
        if (ob0Var.N(i2 & 1, (i2 & 3) != 2)) {
            ((wa0) this.o.getValue()).h(ob0Var, 0);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new q(this, i, 6);
        }
    }

    @Override // defpackage.r
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.s;
    }

    @Override // defpackage.r
    public final void h(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // defpackage.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i, int i2) {
        int iA;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.i(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.n;
        if (mode != Integer.MIN_VALUE || this.p || window.getAttributes().height != -2) {
            iA = size2;
        } else if (this.q) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                iA = kb.a.a(window);
            } else if (i3 < 32) {
                iA = mb.a.a(window);
            }
        } else {
            iA = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = iA - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.q || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.p) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
