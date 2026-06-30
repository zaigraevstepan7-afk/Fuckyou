package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class e82 extends d82 {
    public eh0 r;

    public e82(p82 p82Var, WindowInsets windowInsets) {
        super(p82Var, windowInsets);
        this.r = null;
    }

    @Override // defpackage.m82
    public p82 b() {
        return p82.c(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.m82
    public p82 c() {
        return p82.c(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.m82
    public final eh0 k() {
        if (this.r == null) {
            WindowInsets windowInsets = this.c;
            this.r = eh0.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.r;
    }

    @Override // defpackage.m82
    public boolean r() {
        return this.c.isConsumed();
    }

    @Override // defpackage.m82
    public void x(eh0 eh0Var) {
        this.r = eh0Var;
    }
}
