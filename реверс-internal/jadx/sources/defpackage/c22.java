package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class c22 implements ns1 {
    public final r22 e;
    public final v41 f;
    public final v41 g;
    public final v41 h;
    public final v41 i;
    public final r41 j;
    public boolean k;
    public final v41 l;
    public cb m;
    public final t41 n;
    public boolean o;
    public final gr1 p;
    public final /* synthetic */ d22 q;

    public c22(d22 d22Var, Object obj, cb cbVar, r22 r22Var) {
        this.q = d22Var;
        this.e = r22Var;
        v41 v41VarB = xc.B(obj);
        this.f = v41VarB;
        Object objI = null;
        this.g = xc.B(pv.D(0.0f, 0.0f, null, 7));
        this.h = xc.B(new yv1(b(), r22Var, obj, v41VarB.getValue(), cbVar));
        this.i = xc.B(Boolean.TRUE);
        this.j = new r41(-1.0f);
        this.l = xc.B(obj);
        this.m = cbVar;
        this.n = new t41(a().c());
        Float f = (Float) z62.a.get(r22Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            cb cbVar2 = (cb) r22Var.a.i(obj);
            int iB = cbVar2.b();
            for (int i = 0; i < iB; i++) {
                cbVar2.e(i, fFloatValue);
            }
            objI = this.e.b.i(cbVar2);
        }
        this.p = pv.D(0.0f, 0.0f, objI, 3);
    }

    public final yv1 a() {
        return (yv1) this.h.getValue();
    }

    public final p60 b() {
        return (p60) this.g.getValue();
    }

    public final void c() {
        if (this.j.g() == -1.0f) {
            this.o = true;
            if (xi0.o(a().c, a().d)) {
                e(a().c);
            } else {
                e(a().b(0L));
                this.m = a().f(0L);
            }
        }
    }

    public final void e(Object obj) {
        this.l.setValue(obj);
    }

    public final void f(Object obj, boolean z) {
        d22 d22Var = this.q;
        v41 v41Var = d22Var.i;
        v41 v41Var2 = this.f;
        boolean zO = xi0.o(null, v41Var2.getValue());
        t41 t41Var = this.n;
        v41 v41Var3 = this.h;
        if (zO) {
            v41Var3.setValue(new yv1(this.p, this.e, obj, obj, this.m.c()));
            this.k = true;
            t41Var.h(a().c());
            return;
        }
        p60 p60VarB = (!z || this.o || (b() instanceof gr1)) ? b() : this.p;
        long jMax = 0;
        v41Var3.setValue(new yv1(d22Var.e() <= 0 ? p60VarB : new kr1(p60VarB, d22Var.e()), this.e, obj, v41Var2.getValue(), this.m));
        t41Var.h(a().c());
        this.k = false;
        v41Var.setValue(Boolean.TRUE);
        if (d22Var.g()) {
            mq1 mq1Var = d22Var.j;
            int size = mq1Var.size();
            for (int i = 0; i < size; i++) {
                c22 c22Var = (c22) mq1Var.get(i);
                jMax = Math.max(jMax, c22Var.n.g());
                c22Var.c();
            }
            v41Var.setValue(Boolean.FALSE);
        }
    }

    public final void g(Object obj, Object obj2, p60 p60Var) {
        this.f.setValue(obj2);
        this.g.setValue(p60Var);
        if (xi0.o(a().d, obj) && xi0.o(a().c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // defpackage.ns1
    public final Object getValue() {
        return this.l.getValue();
    }

    public final void h(Object obj, p60 p60Var, Object obj2, cb cbVar) {
        if (this.k && xi0.o(obj, null)) {
            return;
        }
        v41 v41Var = this.f;
        boolean zO = xi0.o(v41Var.getValue(), obj);
        r41 r41Var = this.j;
        if (zO && r41Var.g() == -1.0f && (obj2 == null || obj2.equals(a().d))) {
            return;
        }
        v41Var.setValue(obj);
        this.g.setValue(p60Var);
        Object value = obj2 == null ? r41Var.g() == -3.0f ? obj : this.l.getValue() : obj2;
        if (obj2 != null) {
            e(value);
            if (cbVar != null) {
                this.m = cbVar;
            }
        }
        v41 v41Var2 = this.i;
        f(value, !((Boolean) v41Var2.getValue()).booleanValue());
        v41Var2.setValue(Boolean.valueOf(r41Var.g() == -3.0f));
        if (r41Var.g() >= 0.0f) {
            e(a().b((long) (r41Var.g() * a().c())));
        } else if (r41Var.g() == -3.0f) {
            e(obj);
        }
        this.k = false;
        r41Var.h(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.l.getValue() + ", target: " + this.f.getValue() + ", spec: " + b();
    }
}
