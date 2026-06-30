package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class tr extends zu1 implements wa0 {
    public final /* synthetic */ int i = 0;
    public int j;
    public final /* synthetic */ long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr(s71 s71Var, String str, long j, wz1 wz1Var, ry1 ry1Var, z01 z01Var, ks ksVar) {
        super(2, ksVar);
        this.l = s71Var;
        this.m = str;
        this.k = j;
        this.n = wz1Var;
        this.o = ry1Var;
        this.p = z01Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                return ((tr) o((ks) obj2, (zj1) obj)).q(t32Var);
            default:
                return ((tr) o((ks) obj2, (vt) obj)).q(t32Var);
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.n;
        Object obj5 = this.m;
        switch (i) {
            case 0:
                tr trVar = new tr((k42) obj5, (vr) obj4, (gh) obj3, this.k, (oj0) obj2, ksVar);
                trVar.l = obj;
                return trVar;
            default:
                return new tr((s71) this.l, (String) obj5, this.k, (wz1) obj4, (ry1) obj3, (z01) obj2, ksVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        Object objP;
        String str;
        int i = this.i;
        Object obj2 = this.n;
        wt wtVar = wt.e;
        Object obj3 = this.o;
        Object obj4 = this.m;
        Object obj5 = this.p;
        t32 t32Var = t32.a;
        ks ksVar = null;
        switch (i) {
            case 0:
                gh ghVar = (gh) obj3;
                vr vrVar = (vr) obj2;
                k42 k42Var = (k42) obj4;
                int i2 = this.j;
                if (i2 != 0) {
                    if (i2 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        xc.G(obj);
                    }
                    break;
                } else {
                    xc.G(obj);
                    zj1 zj1Var = (zj1) this.l;
                    k42Var.e = vr.L0(vrVar, ghVar, this.k);
                    kf kfVar = new kf(vrVar, k42Var, (oj0) obj5, zj1Var);
                    ke keVar = new ke(vrVar, k42Var, ghVar, 2);
                    this.j = 1;
                    if (k42Var.a(kfVar, keVar, this) == wtVar) {
                    }
                }
                break;
            default:
                z01 z01Var = (z01) obj5;
                String str2 = (String) obj4;
                ry1 ry1Var = (ry1) obj3;
                int i3 = this.j;
                if (i3 != 0) {
                    if (i3 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        xc.G(obj);
                        objP = obj;
                        str = str2;
                    }
                    break;
                } else {
                    xc.G(obj);
                    s71 s71Var = (s71) this.l;
                    this.j = 1;
                    s71Var.getClass();
                    if (str2.length() == 0) {
                        objP = null;
                        str = str2;
                        if (objP == wtVar) {
                        }
                    } else {
                        long j = this.k;
                        if (!wz1.c(j)) {
                            str = str2;
                            objP = nu0.P(s71Var.a, new m6(s71Var, new r71(j, (ks) null, s71Var, str2), ksVar, 13), this);
                        }
                        if (objP == wtVar) {
                        }
                    }
                }
                wz1 wz1Var = (wz1) objP;
                if (wz1Var != null) {
                    long j2 = wz1Var.a;
                    long jG = af1.g(z01Var.e((int) (j2 >> 32)), z01Var.e((int) (j2 & 4294967295L)));
                    if (!wz1.a(jG, (wz1) obj2) && xi0.o(ry1Var.n().a.f, str) && z01Var == ry1Var.b) {
                        ry1Var.c.i(ry1.e(ry1Var.n().a, jG));
                        ry1Var.v = new wz1(jG);
                    }
                }
                break;
        }
        return t32Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr(k42 k42Var, vr vrVar, gh ghVar, long j, oj0 oj0Var, ks ksVar) {
        super(2, ksVar);
        this.m = k42Var;
        this.n = vrVar;
        this.o = ghVar;
        this.k = j;
        this.p = oj0Var;
    }
}
