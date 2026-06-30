package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class lv extends zu1 implements wa0 {
    public xc1 i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xc1 l;
    public final /* synthetic */ mv m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(xc1 xc1Var, mv mvVar, Object obj, boolean z, ks ksVar) {
        super(2, ksVar);
        this.l = xc1Var;
        this.m = mvVar;
        this.n = obj;
        this.o = z;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        return ((lv) o((ks) obj2, (g60) obj)).q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        lv lvVar = new lv(this.l, this.m, this.n, this.o, ksVar);
        lvVar.k = obj;
        return lvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (r10 == r8) goto L21;
     */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) throws IOException {
        g60 g60Var;
        xc1 xc1Var;
        int i = this.j;
        t32 t32Var = t32.a;
        Object obj2 = this.n;
        mv mvVar = this.m;
        xc1 xc1Var2 = this.l;
        wt wtVar = wt.e;
        if (i == 0) {
            xc.G(obj);
            g60 g60Var2 = (g60) this.k;
            fo1 fo1VarI = mvVar.i();
            this.k = g60Var2;
            this.i = xc1Var2;
            this.j = 1;
            Integer num = new Integer(((AtomicInteger) fo1VarI.b.f).incrementAndGet());
            if (num != wtVar) {
                g60Var = g60Var2;
                obj = num;
                xc1Var = xc1Var2;
            }
            return wtVar;
        }
        if (i != 1) {
            if (i != 2) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xc.G(obj);
            if (this.o) {
                mvVar.k.B(new lu(obj2 != null ? obj2.hashCode() : 0, xc1Var2.e, obj2));
            }
            return t32Var;
        }
        xc1Var = this.i;
        g60Var = (g60) this.k;
        xc.G(obj);
        xc1Var.e = ((Number) obj).intValue();
        this.k = null;
        this.i = null;
        this.j = 2;
        if (g60Var.b.get()) {
            yc.l("This scope has already been closed.");
            return null;
        }
        Object objJ = bk.j(g60Var.a, new jv(g60Var, obj2, null), this);
        if (objJ != wtVar) {
            objJ = t32Var;
        }
    }
}
