package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yu extends zu1 implements xa0 {
    public final /* synthetic */ int i = 1;
    public int j;
    public /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu(mv mvVar, ks ksVar) {
        super(3, ksVar);
        this.k = mvVar;
    }

    @Override // defpackage.xa0
    public final Object f(Object obj, Object obj2, Object obj3) {
        int i = this.i;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                return new yu((mv) this.k, (ks) obj3).q(t32Var);
            default:
                ((Boolean) obj2).getClass();
                yu yuVar = new yu(3, (ks) obj3);
                yuVar.k = (a60) obj;
                return yuVar.q(t32Var);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) throws IOException {
        int i = this.i;
        wt wtVar = wt.e;
        ks ksVar = null;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    xc.G(obj);
                    mv mvVar = (mv) this.k;
                    this.j = 1;
                    if (mv.a(mvVar, this) == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (i2 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            default:
                int i3 = this.j;
                if (i3 == 0) {
                    xc.G(obj);
                    a60 a60Var = (a60) this.k;
                    this.j = 1;
                    if (!a60Var.b.get()) {
                        Object objJ = bk.j(a60Var.a, new k8(a60Var, ksVar, 3), this);
                        return objJ == wtVar ? wtVar : objJ;
                    }
                    yc.l("This scope has already been closed.");
                } else {
                    if (i3 == 1) {
                        xc.G(obj);
                        return obj;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    public /* synthetic */ yu(int i, ks ksVar) {
        super(i, ksVar);
    }
}
