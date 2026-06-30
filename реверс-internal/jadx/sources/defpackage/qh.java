package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qh implements a72 {
    public Object e = th.p;
    public xi f;
    public final /* synthetic */ rh g;

    public qh(rh rhVar) {
        this.g = rhVar;
    }

    @Override // defpackage.a72
    public final void a(ek1 ek1Var, int i) {
        xi xiVar = this.f;
        if (xiVar != null) {
            xiVar.a(ek1Var, i);
        }
    }

    public final Object b(ls lsVar) throws Throwable {
        yj yjVar;
        yj yjVar2;
        Object obj = this.e;
        boolean z = true;
        if (obj == th.p || obj == th.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = rh.k;
            rh rhVar = this.g;
            yj yjVar3 = (yj) atomicReferenceFieldUpdater.get(rhVar);
            while (true) {
                if (rhVar.x(rh.f.get(rhVar), true)) {
                    this.e = th.l;
                    Throwable thO = rhVar.o();
                    if (thO != null) {
                        int i = ir1.a;
                        throw thO;
                    }
                    z = false;
                } else {
                    long andIncrement = rh.g.getAndIncrement(rhVar);
                    long j = th.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (yjVar3.e != j2) {
                        yj yjVarL = rhVar.l(j2, yjVar3);
                        if (yjVarL == null) {
                            continue;
                        } else {
                            yjVar = yjVarL;
                        }
                    } else {
                        yjVar = yjVar3;
                    }
                    Object objI = rhVar.I(yjVar, i2, andIncrement, null);
                    s30 s30Var = th.m;
                    if (objI == s30Var) {
                        yc.l("unreachable");
                        return null;
                    }
                    s30 s30Var2 = th.o;
                    if (objI == s30Var2) {
                        if (andIncrement < rhVar.s()) {
                            yjVar.a();
                        }
                        yjVar3 = yjVar;
                    } else {
                        if (objI == th.n) {
                            xi xiVarU = s22.u(bl.E(lsVar));
                            try {
                                this.f = xiVarU;
                                Object objI2 = rhVar.I(yjVar, i2, andIncrement, this);
                                if (objI2 == s30Var) {
                                    a(yjVar, i2);
                                } else {
                                    if (objI2 == s30Var2) {
                                        if (andIncrement < rhVar.s()) {
                                            yjVar.a();
                                        }
                                        yj yjVar4 = (yj) rh.k.get(rhVar);
                                        while (true) {
                                            if (rhVar.x(rh.f.get(rhVar), true)) {
                                                xi xiVar = this.f;
                                                xiVar.getClass();
                                                this.f = null;
                                                this.e = th.l;
                                                Throwable thO2 = rhVar.o();
                                                if (thO2 == null) {
                                                    xiVar.g(Boolean.FALSE);
                                                } else {
                                                    xiVar.g(new oe1(thO2));
                                                }
                                            } else {
                                                long andIncrement2 = rh.g.getAndIncrement(rhVar);
                                                long j3 = th.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (yjVar4.e != j4) {
                                                    yj yjVarL2 = rhVar.l(j4, yjVar4);
                                                    if (yjVarL2 != null) {
                                                        yjVar2 = yjVarL2;
                                                    }
                                                } else {
                                                    yjVar2 = yjVar4;
                                                }
                                                Object objI3 = rhVar.I(yjVar2, i3, andIncrement2, this);
                                                yj yjVar5 = yjVar2;
                                                if (objI3 == th.m) {
                                                    a(yjVar5, i3);
                                                    break;
                                                }
                                                if (objI3 == th.o) {
                                                    if (andIncrement2 < rhVar.s()) {
                                                        yjVar5.a();
                                                    }
                                                    yjVar4 = yjVar5;
                                                } else {
                                                    if (objI3 == th.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    yjVar5.a();
                                                    this.e = objI3;
                                                    this.f = null;
                                                }
                                            }
                                        }
                                    } else {
                                        yjVar.a();
                                        this.e = objI2;
                                        this.f = null;
                                    }
                                    xiVarU.F(Boolean.TRUE, null);
                                }
                                return xiVarU.t();
                            } catch (Throwable th) {
                                xiVarU.D();
                                throw th;
                            }
                        }
                        yjVar.a();
                        this.e = objI;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() throws Throwable {
        Object obj = this.e;
        s30 s30Var = th.p;
        if (obj == s30Var) {
            yc.l("`hasNext()` has not been invoked");
            return null;
        }
        this.e = s30Var;
        if (obj != th.l) {
            return obj;
        }
        Throwable thP = this.g.p();
        int i = ir1.a;
        throw thP;
    }
}
