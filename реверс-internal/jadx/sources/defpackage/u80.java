package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class u80 extends Drawable.ConstantState {
    public Drawable.ConstantState a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public int k;
    public float l;
    public int m;
    public float n;
    public int o;
    public float p;
    public int q;
    public float r;
    public int s;
    public zm1 t;
    public int u;
    public int v;
    public final Rect w;
    public final int[] x;

    public u80(u80 u80Var) {
        this.b = 0;
        this.c = false;
        this.d = Integer.MIN_VALUE;
        this.e = false;
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = Float.NaN;
        this.k = Integer.MIN_VALUE;
        this.l = Float.NaN;
        this.m = Integer.MIN_VALUE;
        this.n = Float.NaN;
        this.o = Integer.MIN_VALUE;
        this.p = Float.NaN;
        this.q = Integer.MIN_VALUE;
        this.r = Float.NaN;
        this.s = Integer.MIN_VALUE;
        this.t = null;
        this.u = Integer.MIN_VALUE;
        this.v = Integer.MIN_VALUE;
        this.w = null;
        this.x = FocusRingDrawable.t;
        if (u80Var != null) {
            this.a = u80Var.a;
            this.b = u80Var.b;
            this.c = u80Var.c;
            this.d = u80Var.d;
            this.e = u80Var.e;
            this.f = u80Var.f;
            this.g = u80Var.g;
            this.h = u80Var.h;
            this.i = u80Var.i;
            this.j = u80Var.j;
            this.k = u80Var.k;
            this.l = u80Var.l;
            this.m = u80Var.m;
            this.n = u80Var.n;
            this.o = u80Var.o;
            this.p = u80Var.p;
            this.q = u80Var.q;
            this.r = u80Var.r;
            this.s = u80Var.s;
            this.u = u80Var.u;
            this.v = u80Var.v;
            zm1 zm1Var = u80Var.t;
            if (zm1Var != null) {
                this.t = zm1Var.f().a();
            } else {
                this.t = zm1Var;
            }
            if (u80Var.w != null) {
                this.w = new Rect(u80Var.w);
            }
            int[] iArr = u80Var.x;
            this.x = Arrays.copyOf(iArr, iArr.length);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.a;
        return this.b | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new FocusRingDrawable(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new FocusRingDrawable(this, resources);
    }
}
