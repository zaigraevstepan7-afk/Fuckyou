package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class am0 extends nl0 {
    public final /* synthetic */ em0 b;
    public final /* synthetic */ wa0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am0(em0 em0Var, wa0 wa0Var, String str) {
        super(str);
        this.b = em0Var;
        this.c = wa0Var;
    }

    @Override // defpackage.uu0
    public final vu0 g(xu0 xu0Var, List list, long j) {
        em0 em0Var = this.b;
        yl0 yl0Var = em0Var.l;
        yl0Var.e = xu0Var.getLayoutDirection();
        yl0Var.f = xu0Var.b();
        yl0Var.g = xu0Var.l();
        boolean zS = xu0Var.s();
        wa0 wa0Var = this.c;
        if (zS || em0Var.e.l == null) {
            em0Var.h = 0;
            vu0 vu0Var = (vu0) wa0Var.h(yl0Var, new kr(j));
            return new zl0(vu0Var, em0Var, em0Var.h, vu0Var, 1);
        }
        em0Var.i = 0;
        vu0 vu0Var2 = (vu0) wa0Var.h(em0Var.m, new kr(j));
        return new zl0(vu0Var2, em0Var, em0Var.i, vu0Var2, 0);
    }
}
