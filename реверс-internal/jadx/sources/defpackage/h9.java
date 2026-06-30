package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class h9 {
    public final r22 a;
    public final Object b;
    public final xa c;
    public final v41 d;
    public final v41 e;
    public final ry0 f;
    public final cb g;
    public final cb h;
    public cb i;
    public cb j;

    public h9(Object obj, r22 r22Var, Object obj2) {
        this.a = r22Var;
        this.b = obj2;
        xa xaVar = new xa(r22Var, obj, null, 60);
        this.c = xaVar;
        this.d = xc.B(Boolean.FALSE);
        this.e = xc.B(obj);
        this.f = new ry0();
        new gr1(obj2);
        cb cbVar = xaVar.g;
        boolean z = cbVar instanceof ya;
        cb cbVar2 = z ? xi0.e : cbVar instanceof za ? xi0.f : cbVar instanceof ab ? xi0.g : xi0.h;
        this.g = cbVar2;
        cb cbVar3 = z ? xi0.a : cbVar instanceof za ? xi0.b : cbVar instanceof ab ? xi0.c : xi0.d;
        this.h = cbVar3;
        this.i = cbVar2;
        this.j = cbVar3;
    }

    public static final void a(h9 h9Var) {
        xa xaVar = h9Var.c;
        xaVar.g.d();
        xaVar.h = Long.MIN_VALUE;
        h9Var.d.setValue(Boolean.FALSE);
    }

    public static Object b(h9 h9Var, Object obj, wa waVar, Float f, sa0 sa0Var, ks ksVar, int i) {
        Object objI = (i & 4) != 0 ? h9Var.a.b.i(h9Var.c.g) : f;
        sa0 sa0Var2 = (i & 8) != 0 ? null : sa0Var;
        Object objD = h9Var.d();
        r22 r22Var = h9Var.a;
        return ry0.a(h9Var.f, new f9(h9Var, objI, new yv1(waVar, r22Var, objD, obj, (cb) r22Var.a.i(objI)), h9Var.c.h, sa0Var2, null), ksVar);
    }

    public final Object c(Object obj) {
        if (!xi0.o(this.i, this.g) || !xi0.o(this.j, this.h)) {
            r22 r22Var = this.a;
            cb cbVar = (cb) r22Var.a.i(obj);
            int iB = cbVar.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (cbVar.a(i) < this.i.a(i) || cbVar.a(i) > this.j.a(i)) {
                    cbVar.e(i, lk.z(cbVar.a(i), this.i.a(i), this.j.a(i)));
                    z = true;
                }
            }
            if (z) {
                return r22Var.b.i(cbVar);
            }
        }
        return obj;
    }

    public final Object d() {
        return this.c.f.getValue();
    }

    public final boolean e() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final Object f(ks ksVar, Object obj) {
        Object objA = ry0.a(this.f, new g9(this, obj, null), ksVar);
        return objA == wt.e ? objA : t32.a;
    }

    public /* synthetic */ h9(Object obj, r22 r22Var, Object obj2, int i) {
        this(obj, r22Var, (i & 4) != 0 ? null : obj2);
    }
}
