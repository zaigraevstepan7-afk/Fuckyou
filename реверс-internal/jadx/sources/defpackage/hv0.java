package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hv0 implements si1 {
    public final a0 a;
    public final v32 b;
    public final m50 c;

    public hv0(v32 v32Var, m50 m50Var, a0 a0Var) {
        this.b = v32Var;
        m50Var.getClass();
        this.c = m50Var;
        this.a = a0Var;
    }

    @Override // defpackage.si1
    public final int a(xb0 xb0Var) {
        this.b.getClass();
        return xb0Var.unknownFields.hashCode();
    }

    @Override // defpackage.si1
    public final void b(Object obj, Object obj2) {
        ti1.k(this.b, obj, obj2);
    }

    @Override // defpackage.si1
    public final void c(Object obj) {
        this.b.getClass();
        u32 u32Var = ((xb0) obj).unknownFields;
        if (u32Var.e) {
            u32Var.e = false;
        }
        this.c.getClass();
        s91.t(obj);
        throw null;
    }

    @Override // defpackage.si1
    public final int d(xb0 xb0Var) {
        this.b.getClass();
        u32 u32Var = xb0Var.unknownFields;
        int i = u32Var.d;
        if (i != -1) {
            return i;
        }
        int iF = 0;
        for (int i2 = 0; i2 < u32Var.a; i2++) {
            int i3 = u32Var.b[i2] >>> 3;
            iF += nl.f(3, (ji) u32Var.c[i2]) + nl.i(i3) + nl.h(2) + (nl.h(1) * 2);
        }
        u32Var.d = iF;
        return iF;
    }

    @Override // defpackage.si1
    public final boolean e(Object obj) {
        this.c.getClass();
        s91.t(obj);
        throw null;
    }

    @Override // defpackage.si1
    public final void f(Object obj, qt0 qt0Var) {
        this.c.getClass();
        s91.t(obj);
        throw null;
    }

    @Override // defpackage.si1
    public final boolean g(xb0 xb0Var, xb0 xb0Var2) {
        this.b.getClass();
        return xb0Var.unknownFields.equals(xb0Var2.unknownFields);
    }

    @Override // defpackage.si1
    public final void h(Object obj, ll llVar, l50 l50Var) {
        this.b.getClass();
        v32.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.si1
    public final xb0 i() {
        a0 a0Var = this.a;
        return a0Var instanceof xb0 ? ((xb0) a0Var).i() : ((vb0) ((xb0) a0Var).c(5)).b();
    }
}
