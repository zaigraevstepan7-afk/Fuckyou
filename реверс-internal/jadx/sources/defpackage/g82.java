package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class g82 extends f82 {
    public eh0 s;
    public eh0 t;
    public eh0 u;

    public g82(p82 p82Var, WindowInsets windowInsets) {
        super(p82Var, windowInsets);
        this.s = null;
        this.t = null;
        this.u = null;
    }

    @Override // defpackage.m82
    public eh0 j() {
        if (this.t == null) {
            this.t = eh0.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.t;
    }

    @Override // defpackage.m82
    public eh0 l() {
        if (this.s == null) {
            this.s = eh0.c(this.c.getSystemGestureInsets());
        }
        return this.s;
    }

    @Override // defpackage.m82
    public eh0 n() {
        if (this.u == null) {
            this.u = eh0.c(this.c.getTappableElementInsets());
        }
        return this.u;
    }

    @Override // defpackage.d82, defpackage.m82
    public p82 q(int i, int i2, int i3, int i4) {
        return p82.c(this.c.inset(i, i2, i3, i4), null);
    }

    @Override // defpackage.e82, defpackage.m82
    public void x(eh0 eh0Var) {
    }
}
