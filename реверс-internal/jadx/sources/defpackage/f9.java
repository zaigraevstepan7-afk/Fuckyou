package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class f9 extends zu1 implements sa0 {
    public xa i;
    public vc1 j;
    public int k;
    public final /* synthetic */ h9 l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ yv1 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ sa0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(h9 h9Var, Object obj, yv1 yv1Var, long j, sa0 sa0Var, ks ksVar) {
        super(1, ksVar);
        this.l = h9Var;
        this.m = obj;
        this.n = yv1Var;
        this.o = j;
        this.p = sa0Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        long j = this.o;
        sa0 sa0Var = this.p;
        return new f9(this.l, this.m, this.n, j, sa0Var, (ks) obj).q(t32.a);
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        h9 h9Var;
        xa xaVar;
        vc1 vc1Var;
        long j;
        e9 e9Var;
        xa xaVar2;
        vc1 vc1Var2;
        CancellationException cancellationException;
        yv1 yv1Var = this.n;
        int i = this.k;
        h9 h9Var2 = this.l;
        if (i == 0) {
            xc.G(obj);
            try {
                h9Var2.c.g = (cb) h9Var2.a.a.i(this.m);
                h9Var2.e.setValue(yv1Var.c);
                h9Var2.d.setValue(Boolean.TRUE);
                xa xaVar3 = h9Var2.c;
                xaVar = new xa(xaVar3.e, xaVar3.f.getValue(), xi0.v(xaVar3.g), xaVar3.h, Long.MIN_VALUE, xaVar3.j);
                vc1Var = new vc1();
                j = this.o;
                e9Var = new e9(h9Var2, xaVar, this.p, vc1Var, 0);
                h9Var = h9Var2;
            } catch (CancellationException e) {
                e = e;
                h9Var = h9Var2;
                cancellationException = e;
                h9.a(h9Var);
                throw cancellationException;
            }
            try {
                this.i = xaVar;
                this.j = vc1Var;
                this.k = 1;
                Object objD = kd1.d(xaVar, yv1Var, j, e9Var, this);
                wt wtVar = wt.e;
                if (objD == wtVar) {
                    return wtVar;
                }
                xaVar2 = xaVar;
                vc1Var2 = vc1Var;
            } catch (CancellationException e2) {
                e = e2;
                cancellationException = e;
                h9.a(h9Var);
                throw cancellationException;
            }
        } else {
            if (i != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vc1Var2 = this.j;
            xaVar2 = this.i;
            try {
                xc.G(obj);
                h9Var = h9Var2;
            } catch (CancellationException e3) {
                cancellationException = e3;
                h9Var = h9Var2;
                h9.a(h9Var);
                throw cancellationException;
            }
        }
        ta taVar = vc1Var2.e ? ta.e : ta.f;
        h9.a(h9Var);
        return new ua(xaVar2, taVar);
    }
}
