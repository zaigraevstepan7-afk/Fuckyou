package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class d22 {
    public final xg0 a;
    public final d22 b;
    public final String c;
    public final v41 d = xc.B(c());
    public final v41 e = xc.B(null);
    public final v41 f = xc.B(new b22(c(), c()));
    public final t41 g = new t41(0);
    public final t41 h = new t41(Long.MIN_VALUE);
    public final v41 i;
    public final mq1 j;
    public final mq1 k;
    public final v41 l;

    public d22(xg0 xg0Var, d22 d22Var, String str) {
        this.a = xg0Var;
        this.b = d22Var;
        this.c = str;
        Boolean bool = Boolean.FALSE;
        this.i = xc.B(bool);
        this.j = new mq1();
        this.k = new mq1();
        this.l = xc.B(bool);
        xc.s(new x12(this, 1));
    }

    public final void a(Object obj, ob0 ob0Var, int i) {
        int i2;
        ob0Var.X(-1493585151);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ob0Var.f(obj) : ob0Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.f(this) ? 32 : 16;
        }
        int i4 = 0;
        if (!ob0Var.N(i2 & 1, (i2 & 19) != 18)) {
            ob0Var.Q();
        } else if (g()) {
            ob0Var.W(467722849);
            ob0Var.p(false);
        } else {
            ob0Var.W(466062241);
            k(obj);
            int i5 = i2 & 112;
            boolean z = i5 == 32;
            Object objK = ob0Var.K();
            l91 l91Var = kp.a;
            if (z || objK == l91Var) {
                objK = xc.s(new x12(this, i4));
                ob0Var.f0(objK);
            }
            if (((Boolean) ((ns1) objK).getValue()).booleanValue()) {
                ob0Var.W(466470356);
                Object objK2 = ob0Var.K();
                if (objK2 == l91Var) {
                    objK2 = wi0.v(ob0Var);
                    ob0Var.f0(objK2);
                }
                vt vtVar = (vt) objK2;
                boolean zH = ob0Var.h(vtVar) | (i5 == 32);
                Object objK3 = ob0Var.K();
                if (zH || objK3 == l91Var) {
                    objK3 = new d(23, vtVar, this);
                    ob0Var.f0(objK3);
                }
                wi0.d(vtVar, this, (sa0) objK3, ob0Var);
                ob0Var.p(false);
            } else {
                ob0Var.W(467712929);
                ob0Var.p(false);
            }
            ob0Var.p(false);
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new go(i, i3, this, obj);
        }
    }

    public final long b() {
        mq1 mq1Var = this.j;
        int size = mq1Var.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((c22) mq1Var.get(i)).n.g());
        }
        mq1 mq1Var2 = this.k;
        int size2 = mq1Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((d22) mq1Var2.get(i2)).b());
        }
        return jMax;
    }

    public final Object c() {
        return ((v41) this.a.g).getValue();
    }

    public final boolean d() {
        mq1 mq1Var = this.j;
        int size = mq1Var.size();
        for (int i = 0; i < size; i++) {
            ((c22) mq1Var.get(i)).getClass();
        }
        mq1 mq1Var2 = this.k;
        int size2 = mq1Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((d22) mq1Var2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        d22 d22Var = this.b;
        return d22Var != null ? d22Var.e() : this.g.g();
    }

    public final a22 f() {
        return (a22) this.f.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final void h(long j, boolean z) {
        xg0 xg0Var = this.a;
        v41 v41Var = (v41) xg0Var.f;
        t41 t41Var = this.h;
        if (t41Var.g() == Long.MIN_VALUE) {
            t41Var.h(j);
            ((v41) xg0Var.f).setValue(Boolean.TRUE);
        } else if (!((Boolean) v41Var.getValue()).booleanValue()) {
            v41Var.setValue(Boolean.TRUE);
        }
        this.i.setValue(Boolean.FALSE);
        mq1 mq1Var = this.j;
        int size = mq1Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            c22 c22Var = (c22) mq1Var.get(i);
            v41 v41Var2 = c22Var.i;
            v41 v41Var3 = c22Var.i;
            if (!((Boolean) v41Var2.getValue()).booleanValue()) {
                long jC = z ? c22Var.a().c() : j;
                c22Var.e(c22Var.a().b(jC));
                c22Var.m = c22Var.a().f(jC);
                if (c22Var.a().g(jC)) {
                    v41Var3.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) v41Var3.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        mq1 mq1Var2 = this.k;
        int size2 = mq1Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            d22 d22Var = (d22) mq1Var2.get(i2);
            if (!xi0.o(d22Var.d.getValue(), d22Var.c())) {
                d22Var.h(j, z);
            }
            if (!xi0.o(d22Var.d.getValue(), d22Var.c())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.h.h(Long.MIN_VALUE);
        Object value = this.d.getValue();
        xg0 xg0Var = this.a;
        ((v41) xg0Var.g).setValue(value);
        if (this.b == null) {
            this.g.h(0L);
        }
        ((v41) xg0Var.f).setValue(Boolean.FALSE);
        mq1 mq1Var = this.k;
        int size = mq1Var.size();
        for (int i = 0; i < size; i++) {
            ((d22) mq1Var.get(i)).i();
        }
    }

    public final void j(Object obj, Object obj2) {
        this.h.h(Long.MIN_VALUE);
        xg0 xg0Var = this.a;
        ((v41) xg0Var.f).setValue(Boolean.FALSE);
        boolean zG = g();
        v41 v41Var = this.d;
        if (!zG || !xi0.o(c(), obj) || !xi0.o(v41Var.getValue(), obj2)) {
            if (!xi0.o(c(), obj)) {
                ((v41) xg0Var.g).setValue(obj);
            }
            v41Var.setValue(obj2);
            this.l.setValue(Boolean.TRUE);
            this.f.setValue(new b22(obj, obj2));
        }
        mq1 mq1Var = this.k;
        int size = mq1Var.size();
        for (int i = 0; i < size; i++) {
            d22 d22Var = (d22) mq1Var.get(i);
            d22Var.getClass();
            if (d22Var.g()) {
                d22Var.j(d22Var.c(), d22Var.d.getValue());
            }
        }
        mq1 mq1Var2 = this.j;
        int size2 = mq1Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((c22) mq1Var2.get(i2)).c();
        }
    }

    public final void k(Object obj) {
        v41 v41Var = this.d;
        if (xi0.o(v41Var.getValue(), obj)) {
            return;
        }
        this.f.setValue(new b22(v41Var.getValue(), obj));
        if (!xi0.o(c(), v41Var.getValue())) {
            ((v41) this.a.g).setValue(v41Var.getValue());
        }
        v41Var.setValue(obj);
        if (this.h.g() == Long.MIN_VALUE) {
            this.i.setValue(Boolean.TRUE);
        }
        mq1 mq1Var = this.j;
        int size = mq1Var.size();
        for (int i = 0; i < size; i++) {
            ((c22) mq1Var.get(i)).j.h(-2.0f);
        }
    }

    public final String toString() {
        mq1 mq1Var = this.j;
        int size = mq1Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((c22) mq1Var.get(i)) + ", ";
        }
        return str;
    }
}
