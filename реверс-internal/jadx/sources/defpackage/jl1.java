package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jl1 extends zu1 implements wa0 {
    public final /* synthetic */ int i = 1;
    public int j;
    public final /* synthetic */ long k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl1(long j, ev1 ev1Var, ks ksVar) {
        super(2, ksVar);
        this.k = j;
        this.l = ev1Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((jl1) o(ksVar, vtVar)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        Object obj2 = this.l;
        long j = this.k;
        switch (i) {
            case 0:
                return new jl1((h9) obj2, j, ksVar);
            default:
                return new jl1(j, (ev1) obj2, ksVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (defpackage.al.s(8, r13) == r8) goto L16;
     */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) throws IllegalAccessException, ly, InvocationTargetException {
        int i = this.i;
        t32 t32Var = t32.a;
        Object obj2 = this.l;
        wt wtVar = wt.e;
        long j = this.k;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 != 0) {
                    if (i2 == 1) {
                        xc.G(obj);
                        return t32Var;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                h9 h9Var = (h9) obj2;
                w01 w01Var = new w01(j);
                gr1 gr1Var = kl1.d;
                this.j = 1;
                return h9.b(h9Var, w01Var, gr1Var, null, null, this, 12) == wtVar ? wtVar : t32Var;
            default:
                int i3 = this.j;
                if (i3 == 0) {
                    xc.G(obj);
                    this.j = 1;
                    if (al.s(j - 8, this) != wtVar) {
                    }
                    return wtVar;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                    xi xiVar = ((ev1) obj2).g;
                    if (xiVar == null) {
                        return t32Var;
                    }
                    xiVar.g(new oe1(new g81(j)));
                    return t32Var;
                }
                xc.G(obj);
                this.j = 2;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl1(h9 h9Var, long j, ks ksVar) {
        super(2, ksVar);
        this.l = h9Var;
        this.k = j;
    }
}
