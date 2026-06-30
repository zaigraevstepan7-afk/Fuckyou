package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class uu extends zu1 implements sa0 {
    public Object i;
    public Serializable j;
    public Object k;
    public Object l;
    public Iterator m;
    public int n;
    public int o;
    public final /* synthetic */ mv p;
    public final /* synthetic */ vu q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(mv mvVar, vu vuVar, ks ksVar) {
        super(1, ksVar);
        this.p = mvVar;
        this.q = vuVar;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        return new uu(this.p, this.q, (ks) obj).q(t32.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        sy0 uy0Var;
        vc1 vc1Var;
        zc1 zc1Var;
        zc1 zc1Var2;
        Iterator it;
        sy0 sy0Var;
        vc1 vc1Var2;
        zc1 zc1Var3;
        tu tuVar;
        uy0 uy0Var2;
        zc1 zc1Var4;
        vc1 vc1Var3;
        sy0 sy0Var2;
        int iHashCode;
        Integer numA;
        Object obj2;
        int i = this.o;
        vu vuVar = this.q;
        mv mvVar = this.p;
        wt wtVar = wt.e;
        if (i == 0) {
            xc.G(obj);
            uy0Var = new uy0();
            vc1Var = new vc1();
            zc1Var = new zc1();
            this.i = uy0Var;
            this.j = vc1Var;
            this.k = zc1Var;
            this.l = zc1Var;
            this.o = 1;
            obj = mv.f(mvVar, true, this);
            if (obj != wtVar) {
                zc1Var2 = zc1Var;
            }
            return wtVar;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iHashCode = this.n;
                    obj2 = this.i;
                    xc.G(obj);
                    return new lu(iHashCode, ((Number) obj).intValue(), obj2);
                }
                sy0 sy0Var3 = (sy0) this.k;
                zc1Var4 = (zc1) this.j;
                vc1Var3 = (vc1) this.i;
                xc.G(obj);
                sy0Var2 = sy0Var3;
                try {
                    vc1Var3.e = true;
                    ((uy0) sy0Var2).h(null);
                    Object obj3 = zc1Var4.e;
                    iHashCode = obj3 == null ? obj3.hashCode() : 0;
                    fo1 fo1VarI = mvVar.i();
                    this.i = obj3;
                    this.j = null;
                    this.k = null;
                    this.n = iHashCode;
                    this.o = 4;
                    numA = fo1VarI.a();
                    if (numA != wtVar) {
                        obj = numA;
                        obj2 = obj3;
                        return new lu(iHashCode, ((Number) obj).intValue(), obj2);
                    }
                    return wtVar;
                } catch (Throwable th) {
                    ((uy0) sy0Var2).h(null);
                    throw th;
                }
            }
            it = this.m;
            tuVar = (tu) this.l;
            zc1Var3 = (zc1) this.k;
            vc1Var2 = (vc1) this.j;
            sy0Var = (sy0) this.i;
            xc.G(obj);
            while (it.hasNext()) {
                wa0 wa0Var = (wa0) it.next();
                this.i = sy0Var;
                this.j = vc1Var2;
                this.k = zc1Var3;
                this.l = tuVar;
                this.m = it;
                this.o = 2;
                if (wa0Var.h(tuVar, this) == wtVar) {
                    break;
                }
            }
            zc1Var2 = zc1Var3;
            vc1Var = vc1Var2;
            uy0Var = sy0Var;
            vuVar.g = null;
            this.i = vc1Var;
            this.j = zc1Var2;
            this.k = uy0Var;
            this.l = null;
            this.m = null;
            this.o = 3;
            uy0Var2 = (uy0) uy0Var;
            if (uy0Var2.e(this) != wtVar) {
                zc1Var4 = zc1Var2;
                vc1Var3 = vc1Var;
                sy0Var2 = uy0Var2;
                vc1Var3.e = true;
                ((uy0) sy0Var2).h(null);
                Object obj32 = zc1Var4.e;
                if (obj32 == null) {
                }
                fo1 fo1VarI2 = mvVar.i();
                this.i = obj32;
                this.j = null;
                this.k = null;
                this.n = iHashCode;
                this.o = 4;
                numA = fo1VarI2.a();
                if (numA != wtVar) {
                }
            }
            return wtVar;
        }
        zc1Var = (zc1) this.l;
        zc1Var2 = (zc1) this.k;
        vc1Var = (vc1) this.j;
        uy0Var = (sy0) this.i;
        xc.G(obj);
        zc1Var.e = ((lu) obj).b;
        tu tuVar2 = new tu(uy0Var, vc1Var, zc1Var2, mvVar);
        List list = (List) vuVar.g;
        if (list != null) {
            it = list.iterator();
            sy0Var = uy0Var;
            vc1Var2 = vc1Var;
            zc1Var3 = zc1Var2;
            tuVar = tuVar2;
            while (it.hasNext()) {
            }
            zc1Var2 = zc1Var3;
            vc1Var = vc1Var2;
            uy0Var = sy0Var;
        }
        vuVar.g = null;
        this.i = vc1Var;
        this.j = zc1Var2;
        this.k = uy0Var;
        this.l = null;
        this.m = null;
        this.o = 3;
        uy0Var2 = (uy0) uy0Var;
        if (uy0Var2.e(this) != wtVar) {
        }
        return wtVar;
    }
}
