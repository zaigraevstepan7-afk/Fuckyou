package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qv implements sa {
    public final vu a;
    public final r22 b;
    public final Object c;
    public final cb d;
    public final cb e;
    public final cb f;
    public final Object g;
    public final long h;

    public qv(rv rvVar, r22 r22Var, Object obj, cb cbVar) {
        vu vuVar = new vu(rvVar.a);
        this.a = vuVar;
        this.b = r22Var;
        this.c = obj;
        cb cbVar2 = (cb) r22Var.a.i(obj);
        this.d = cbVar2;
        this.e = xi0.v(cbVar);
        sa0 sa0Var = r22Var.b;
        if (((cb) vuVar.h) == null) {
            vuVar.h = cbVar2.c();
        }
        cb cbVar3 = (cb) vuVar.h;
        if (cbVar3 == null) {
            xi0.K("targetVector");
            throw null;
        }
        int iB = cbVar3.b();
        int i = 0;
        while (true) {
            cb cbVar4 = (cb) vuVar.h;
            if (i >= iB) {
                if (cbVar4 == null) {
                    xi0.K("targetVector");
                    throw null;
                }
                this.g = sa0Var.i(cbVar4);
                vu vuVar2 = this.a;
                cb cbVar5 = this.d;
                if (((cb) vuVar2.g) == null) {
                    vuVar2.g = cbVar5.c();
                }
                cb cbVar6 = (cb) vuVar2.g;
                if (cbVar6 == null) {
                    xi0.K("velocityVector");
                    throw null;
                }
                int iB2 = cbVar6.b();
                long jMax = 0;
                for (int i2 = 0; i2 < iB2; i2++) {
                    y41 y41Var = (y41) vuVar2.e;
                    cbVar5.getClass();
                    jMax = Math.max(jMax, ((long) (Math.exp(((u60) y41Var.f).b(cbVar.a(i2)) / (((double) v60.a) - 1.0d)) * 1000.0d)) * 1000000);
                }
                this.h = jMax;
                cb cbVarV = xi0.v(this.a.g(jMax, this.d, cbVar));
                this.f = cbVarV;
                int iB3 = cbVarV.b();
                for (int i3 = 0; i3 < iB3; i3++) {
                    cb cbVar7 = this.f;
                    float fA = cbVar7.a(i3);
                    this.a.getClass();
                    this.a.getClass();
                    cbVar7.e(i3, lk.z(fA, -0.0f, 0.0f));
                }
                return;
            }
            if (cbVar4 == null) {
                xi0.K("targetVector");
                throw null;
            }
            y41 y41Var2 = (y41) vuVar.e;
            float fA2 = cbVar2.a(i);
            float fA3 = cbVar.a(i);
            u60 u60Var = (u60) y41Var2.f;
            double dB = u60Var.b(fA3);
            double d = v60.a;
            int i4 = i;
            cbVar4.e(i4, (Math.signum(fA3) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) (u60Var.a * u60Var.b))))) + fA2);
            i = i4 + 1;
        }
    }

    @Override // defpackage.sa
    public final boolean a() {
        return false;
    }

    @Override // defpackage.sa
    public final Object b(long j) {
        if (g(j)) {
            return this.g;
        }
        sa0 sa0Var = this.b.b;
        vu vuVar = this.a;
        cb cbVar = (cb) vuVar.f;
        cb cbVar2 = this.d;
        if (cbVar == null) {
            vuVar.f = cbVar2.c();
        }
        cb cbVar3 = (cb) vuVar.f;
        if (cbVar3 == null) {
            xi0.K("valueVector");
            throw null;
        }
        int iB = cbVar3.b();
        int i = 0;
        while (true) {
            cb cbVar4 = (cb) vuVar.f;
            if (i >= iB) {
                if (cbVar4 != null) {
                    return sa0Var.i(cbVar4);
                }
                xi0.K("valueVector");
                throw null;
            }
            if (cbVar4 == null) {
                xi0.K("valueVector");
                throw null;
            }
            y41 y41Var = (y41) vuVar.e;
            float fA = cbVar2.a(i);
            long j2 = j / 1000000;
            t60 t60VarA = ((u60) y41Var.f).a(this.e.a(i));
            long j3 = t60VarA.c;
            cbVar4.e(i, (Math.signum(t60VarA.a) * t60VarA.b * a6.a(j3 > 0 ? j2 / j3 : 1.0f).a) + fA);
            i++;
        }
    }

    @Override // defpackage.sa
    public final long c() {
        return this.h;
    }

    @Override // defpackage.sa
    public final r22 d() {
        return this.b;
    }

    @Override // defpackage.sa
    public final Object e() {
        return this.g;
    }

    @Override // defpackage.sa
    public final cb f(long j) {
        if (g(j)) {
            return this.f;
        }
        return this.a.g(j, this.d, this.e);
    }
}
