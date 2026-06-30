package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zv extends zu1 implements wa0 {
    public wc1 i;
    public xa j;
    public int k;
    public final /* synthetic */ float l;
    public final /* synthetic */ aw m;
    public final /* synthetic */ yj1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(float f, aw awVar, yj1 yj1Var, ks ksVar) {
        super(2, ksVar);
        this.l = f;
        this.m = awVar;
        this.n = yj1Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        return ((zv) o((ks) obj2, (vt) obj)).q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        return new zv(this.l, this.m, this.n, ksVar);
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        float f;
        xa xaVar;
        wc1 wc1Var;
        xa xaVar2;
        rv rvVar;
        e9 e9Var;
        Object objD;
        Object obj2;
        int i = this.k;
        if (i == 0) {
            xc.G(obj);
            f = this.l;
            if (Math.abs(f) > 1.0f) {
                wc1 wc1Var2 = new wc1();
                wc1Var2.e = f;
                wc1 wc1Var3 = new wc1();
                xa xaVarA = wi0.a(28, f);
                try {
                    aw awVar = this.m;
                    rvVar = awVar.a;
                    e9Var = new e9(wc1Var3, this.n, wc1Var2, awVar, 2);
                    this.i = wc1Var2;
                    this.j = xaVarA;
                    this.k = 1;
                    xaVar = xaVarA;
                } catch (CancellationException unused) {
                    xaVar = xaVarA;
                }
                try {
                    objD = kd1.d(xaVar, new qv(rvVar, c2.P, xaVarA.f.getValue(), xaVarA.g), Long.MIN_VALUE, e9Var, this);
                    obj2 = wt.e;
                    if (objD != obj2) {
                        objD = t32.a;
                    }
                } catch (CancellationException unused2) {
                    wc1Var = wc1Var2;
                    xaVar2 = xaVar;
                    wc1Var.e = ((Number) xaVar2.e.b.i(xaVar2.g)).floatValue();
                }
                if (objD == obj2) {
                    return obj2;
                }
                wc1Var = wc1Var2;
                f = wc1Var.e;
            }
        } else {
            if (i != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xaVar2 = this.j;
            wc1Var = this.i;
            try {
                xc.G(obj);
            } catch (CancellationException unused3) {
                wc1Var.e = ((Number) xaVar2.e.b.i(xaVar2.g)).floatValue();
            }
            f = wc1Var.e;
        }
        return new Float(f);
    }
}
