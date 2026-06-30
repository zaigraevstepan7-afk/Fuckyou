package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class kn0 {
    public final un0 a;
    public final jn0 b;
    public final jm0 c;
    public final g6 d;

    public kn0(un0 un0Var, jn0 jn0Var, jm0 jm0Var, g6 g6Var) {
        this.a = un0Var;
        this.b = jn0Var;
        this.c = jm0Var;
        this.d = g6Var;
    }

    public final void a(int i, Object obj, ob0 ob0Var, int i2) {
        int i3;
        Object obj2;
        ob0 ob0Var2;
        ob0Var.X(-462424778);
        int i4 = (ob0Var.d(i) ? 4 : 2) | i2 | (ob0Var.h(obj) ? 32 : 16) | (ob0Var.f(this) ? 256 : 128);
        int i5 = 1;
        if (ob0Var.N(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            ob0Var2 = ob0Var;
            hk.e(obj2, i3, this.a.r, lk.d0(-824725566, new f5(i, i5, this), ob0Var), ob0Var2, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            ob0Var2 = ob0Var;
            ob0Var2.Q();
        }
        dc1 dc1VarR = ob0Var2.r();
        if (dc1VarR != null) {
            dc1VarR.d = new tm0(this, i3, obj2, i2);
        }
    }

    public final Object b(int i) {
        jn0 jn0Var = this.b;
        jn0Var.getClass();
        mi0 mi0VarA = jn0Var.a.a(i);
        ((kh) mi0VarA.c.b).i(Integer.valueOf(i - mi0VarA.a));
        return null;
    }

    public final int c() {
        jn0 jn0Var = this.b;
        jn0Var.getClass();
        return jn0Var.a.a;
    }

    public final Object d(int i) {
        g6 g6Var = this.d;
        Object[] objArr = (Object[]) g6Var.c;
        int i2 = i - g6Var.a;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        if (obj != null) {
            return obj;
        }
        jn0 jn0Var = this.b;
        jn0Var.getClass();
        mi0 mi0VarA = jn0Var.a.a(i);
        Object objI = ((cr) mi0VarA.c.a).i(Integer.valueOf(i - mi0VarA.a));
        return objI == null ? new gw(i) : objI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn0)) {
            return false;
        }
        return xi0.o(this.b, ((kn0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
