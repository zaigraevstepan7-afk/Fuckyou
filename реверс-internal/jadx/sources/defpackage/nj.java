package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class nj implements ib0 {
    public final lt e;
    public final int f;
    public final ph g;

    public nj(lt ltVar, int i, ph phVar) {
        this.e = ltVar;
        this.f = i;
        this.g = phVar;
    }

    public abstract Object a(ya1 ya1Var, ks ksVar);

    public abstract nj b(lt ltVar, int i, ph phVar);

    @Override // defpackage.f70
    public Object c(g70 g70Var, ks ksVar) {
        Object objR = bl.r(new g(g70Var, this, (ks) null, 3), ksVar);
        return objR == wt.e ? objR : t32.a;
    }

    public f70 d() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // defpackage.ib0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f70 e(lt ltVar, int i, ph phVar) {
        lt ltVar2 = this.e;
        lt ltVarJ = ltVar.j(ltVar2);
        ph phVar2 = ph.e;
        ph phVar3 = this.g;
        int i2 = this.f;
        if (phVar == phVar2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i == -2) {
                            i = i2;
                        } else {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
            }
            phVar = phVar3;
        }
        return (xi0.o(ltVarJ, ltVar2) && i == i2 && phVar == phVar3) ? this : b(ltVarJ, i, phVar);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        d40 d40Var = d40.e;
        lt ltVar = this.e;
        if (ltVar != d40Var) {
            arrayList.add("context=" + ltVar);
        }
        int i = this.f;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        ph phVar = ph.e;
        ph phVar2 = this.g;
        if (phVar2 != phVar) {
            arrayList.add("onBufferOverflow=" + phVar2);
        }
        return getClass().getSimpleName() + '[' + pl.h0(arrayList, ", ", null, null, null, 62) + ']';
    }
}
