package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ur extends zu1 implements wa0 {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ vr k;
    public final /* synthetic */ k42 l;
    public final /* synthetic */ gh m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur(vr vrVar, k42 k42Var, gh ghVar, long j, ks ksVar) {
        super(2, ksVar);
        this.k = vrVar;
        this.l = k42Var;
        this.m = ghVar;
        this.n = j;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        return ((ur) o((ks) obj2, (vt) obj)).q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        ur urVar = new ur(this.k, this.l, this.m, this.n, ksVar);
        urVar.j = obj;
        return urVar;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        vr vrVar = this.k;
        wg wgVar = vrVar.w;
        int i = this.i;
        try {
            try {
                if (i == 0) {
                    xc.G(obj);
                    oj0 oj0VarD = bk.D(((vt) this.j).f());
                    vrVar.z = true;
                    bk1 bk1Var = vrVar.t;
                    ly0 ly0Var = ly0.e;
                    tr trVar = new tr(this.l, vrVar, this.m, this.n, oj0VarD, null);
                    this.i = 1;
                    Object objG = bk1Var.g(ly0Var, trVar, this);
                    wt wtVar = wt.e;
                    if (objG == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (i != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                wgVar.b();
                vrVar.z = false;
                wgVar.a(null);
                vrVar.x = false;
                return t32.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            vrVar.z = false;
            wgVar.a(null);
            vrVar.x = false;
            throw th;
        }
    }
}
