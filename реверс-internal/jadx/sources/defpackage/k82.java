package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class k82 extends j82 {
    public static final p82 w = p82.c(WindowInsets.CONSUMED, null);

    public k82(p82 p82Var, WindowInsets windowInsets) {
        super(p82Var, windowInsets);
    }

    @Override // defpackage.i82, defpackage.d82, defpackage.m82
    public eh0 h(int i) {
        return eh0.c(this.c.getInsets(o82.a(i)));
    }

    @Override // defpackage.i82, defpackage.d82, defpackage.m82
    public eh0 i(int i) {
        return eh0.c(this.c.getInsetsIgnoringVisibility(o82.a(i)));
    }

    @Override // defpackage.i82, defpackage.d82, defpackage.m82
    public boolean t(int i) {
        return this.c.isVisible(o82.a(i));
    }

    @Override // defpackage.d82, defpackage.m82
    public void o(View view) {
    }
}
