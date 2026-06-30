package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wu0 implements vu0 {
    public final int a;
    public final int b;
    public final Map c;
    public final g3 d;
    public final q e;
    public final /* synthetic */ int f;
    public final /* synthetic */ xu0 g;
    public final /* synthetic */ u3 h;

    public wu0(int i, int i2, Map map, g3 g3Var, q qVar, xu0 xu0Var, u3 u3Var) {
        this.f = i;
        this.g = xu0Var;
        this.h = u3Var;
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = g3Var;
        this.e = qVar;
    }

    @Override // defpackage.vu0
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.vu0
    public final void b() {
        xu0 xu0Var = this.g;
        boolean z = xu0Var instanceof ws0;
        u3 u3Var = this.h;
        if (z) {
            u3Var.i(((ws0) xu0Var).t);
            return;
        }
        u3Var.i(new bo1(this.f, xu0Var.getLayoutDirection(), xu0Var.b(), xu0Var.l()));
    }

    @Override // defpackage.vu0
    public final wa0 c() {
        return this.e;
    }

    @Override // defpackage.vu0
    public final int d() {
        return this.b;
    }

    @Override // defpackage.vu0
    public final sa0 f() {
        return this.d;
    }

    @Override // defpackage.vu0
    public final int g() {
        return this.a;
    }
}
