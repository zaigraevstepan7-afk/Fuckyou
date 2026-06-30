package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class py0 extends zu1 implements wa0 {
    public sy0 i;
    public Object j;
    public Object k;
    public qy0 l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ ly0 o;
    public final /* synthetic */ qy0 p;
    public final /* synthetic */ wa0 q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py0(ly0 ly0Var, qy0 qy0Var, wa0 wa0Var, Object obj, ks ksVar) {
        super(2, ksVar);
        this.o = ly0Var;
        this.p = qy0Var;
        this.q = wa0Var;
        this.r = obj;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        return ((py0) o((ks) obj2, (vt) obj)).q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        py0 py0Var = new py0(this.o, this.p, this.q, this.r, ksVar);
        py0Var.n = obj;
        return py0Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        ny0 ny0Var;
        qy0 qy0Var;
        wa0 wa0Var;
        Object obj2;
        sy0 sy0Var;
        Throwable th;
        ny0 ny0Var2;
        qy0 qy0Var2;
        sy0 sy0Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i = this.m;
        wt wtVar = wt.e;
        try {
            try {
                if (i == 0) {
                    xc.G(obj);
                    jt jtVarL = ((vt) this.n).f().l(v20.O);
                    jtVarL.getClass();
                    ny0Var = new ny0(this.o, (oj0) jtVarL);
                    qy0Var = this.p;
                    qy0.a(qy0Var, ny0Var);
                    uy0 uy0Var = qy0Var.b;
                    this.n = ny0Var;
                    this.i = uy0Var;
                    wa0Var = this.q;
                    this.j = wa0Var;
                    Object obj3 = this.r;
                    this.k = obj3;
                    this.l = qy0Var;
                    this.m = 1;
                    if (uy0Var.e(this) != wtVar) {
                        obj2 = obj3;
                        sy0Var = uy0Var;
                    }
                    return wtVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qy0Var2 = (qy0) this.j;
                    sy0 sy0Var3 = this.i;
                    ny0Var2 = (ny0) this.n;
                    try {
                        xc.G(obj);
                        sy0Var2 = sy0Var3;
                        atomicReference2 = qy0Var2.a;
                        while (!atomicReference2.compareAndSet(ny0Var2, null) && atomicReference2.get() == ny0Var2) {
                        }
                        ((uy0) sy0Var2).h(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = qy0Var2.a;
                        while (!atomicReference.compareAndSet(ny0Var2, null)) {
                        }
                        throw th;
                    }
                }
                qy0 qy0Var3 = this.l;
                obj2 = this.k;
                wa0 wa0Var2 = (wa0) this.j;
                sy0 sy0Var4 = this.i;
                ny0 ny0Var3 = (ny0) this.n;
                xc.G(obj);
                wa0Var = wa0Var2;
                sy0Var = sy0Var4;
                qy0Var = qy0Var3;
                ny0Var = ny0Var3;
                this.n = ny0Var;
                this.i = sy0Var;
                this.j = qy0Var;
                this.k = null;
                this.l = null;
                this.m = 2;
                Object objH = wa0Var.h(obj2, this);
                if (objH != wtVar) {
                    qy0 qy0Var4 = qy0Var;
                    obj = objH;
                    ny0Var2 = ny0Var;
                    qy0Var2 = qy0Var4;
                    sy0Var2 = sy0Var;
                    atomicReference2 = qy0Var2.a;
                    while (!atomicReference2.compareAndSet(ny0Var2, null)) {
                    }
                    ((uy0) sy0Var2).h(null);
                    return obj;
                }
                return wtVar;
            } catch (Throwable th3) {
                qy0 qy0Var5 = qy0Var;
                th = th3;
                ny0Var2 = ny0Var;
                qy0Var2 = qy0Var5;
                atomicReference = qy0Var2.a;
                while (!atomicReference.compareAndSet(ny0Var2, null) && atomicReference.get() == ny0Var2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((uy0) 2).h(null);
            throw th4;
        }
    }
}
