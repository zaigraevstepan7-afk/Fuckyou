package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xl0 implements vu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ yl0 d;
    public final /* synthetic */ em0 e;
    public final /* synthetic */ sa0 f;

    public xl0(int i, int i2, Map map, yl0 yl0Var, em0 em0Var, sa0 sa0Var) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = yl0Var;
        this.e = em0Var;
        this.f = sa0Var;
    }

    @Override // defpackage.vu0
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.vu0
    public final void b() {
        sg0 sg0Var;
        ql0 ql0Var = this.e.e;
        boolean zS = this.d.s();
        sa0 sa0Var = this.f;
        if (!zS || (sg0Var = ql0Var.I.c.a0) == null) {
            sa0Var.i(ql0Var.I.c.t);
        } else {
            sa0Var.i(sg0Var.t);
        }
    }

    @Override // defpackage.vu0
    public final int d() {
        return this.b;
    }

    @Override // defpackage.vu0
    public final sa0 e() {
        return null;
    }

    @Override // defpackage.vu0
    public final int g() {
        return this.a;
    }
}
