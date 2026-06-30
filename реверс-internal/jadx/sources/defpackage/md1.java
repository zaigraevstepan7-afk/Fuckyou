package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class md1 implements vt, id1 {
    public static final bj h = new bj(0);
    public final lt e;
    public final md1 f = this;
    public volatile lt g;

    public md1(lt ltVar) {
        this.e = ltVar;
    }

    public final void a() {
        synchronized (this.f) {
            try {
                lt ltVar = this.g;
                if (ltVar == null) {
                    this.g = h;
                } else {
                    fa0 fa0Var = new fa0(0);
                    oj0 oj0Var = (oj0) ltVar.l(v20.O);
                    if (oj0Var != null) {
                        oj0Var.a(fa0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.id1
    public final void d() {
        a();
    }

    @Override // defpackage.id1
    public final void e() {
        a();
    }

    @Override // defpackage.vt
    public final lt f() {
        lt ltVarJ;
        lt ltVar = this.g;
        if (ltVar == null || ltVar == h) {
            rp rpVar = (rp) this.e.l(rp.f);
            lt ld1Var = rpVar != null ? new ld1(rpVar, this) : d40.e;
            synchronized (this.f) {
                try {
                    lt ltVar2 = this.g;
                    if (ltVar2 == null) {
                        lt ltVar3 = this.e;
                        ltVarJ = ltVar3.j(new qj0((oj0) ltVar3.l(v20.O))).j(d40.e).j(ld1Var);
                    } else if (ltVar2 == h) {
                        lt ltVar4 = this.e;
                        qj0 qj0Var = new qj0((oj0) ltVar4.l(v20.O));
                        qj0Var.C(new fa0(0));
                        ltVarJ = ltVar4.j(qj0Var).j(d40.e).j(ld1Var);
                    } else {
                        ltVarJ = ltVar2;
                    }
                    this.g = ltVarJ;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ltVar = ltVarJ;
        }
        ltVar.getClass();
        return ltVar;
    }

    @Override // defpackage.id1
    public final void c() {
    }
}
