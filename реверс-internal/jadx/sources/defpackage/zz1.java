package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zz1 extends xv0 {
    public final String a;
    public final d02 b;
    public final c90 c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;

    public zz1(String str, d02 d02Var, c90 c90Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = d02Var;
        this.c = c90Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        c02 c02Var = new c02();
        c02Var.s = this.a;
        c02Var.t = this.b;
        c02Var.u = this.c;
        c02Var.v = this.d;
        c02Var.w = this.e;
        c02Var.x = this.f;
        c02Var.y = this.g;
        return c02Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz1)) {
            return false;
        }
        zz1 zz1Var = (zz1) obj;
        return xi0.o(this.a, zz1Var.a) && xi0.o(this.b, zz1Var.b) && xi0.o(this.c, zz1Var.c) && this.d == zz1Var.d && this.e == zz1Var.e && this.f == zz1Var.f && this.g == zz1Var.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.xv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(sv0 sv0Var) {
        boolean z;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        c90 c90Var;
        c90 c90Var2;
        int i5;
        int i6;
        c02 c02Var = (c02) sv0Var;
        c02Var.getClass();
        d02 d02Var = c02Var.t;
        boolean z4 = false;
        boolean z5 = true;
        d02 d02Var2 = this.b;
        if (d02Var2 != d02Var) {
            if (!d02Var2.a.b(d02Var.a)) {
                z = true;
            }
            str = c02Var.s;
            str2 = this.a;
            if (!xi0.o(str, str2)) {
                c02Var.s = str2;
                c02Var.C = null;
                z4 = true;
            }
            boolean z6 = !c02Var.t.c(d02Var2);
            c02Var.t = d02Var2;
            i = c02Var.y;
            i2 = this.g;
            if (i != i2) {
                c02Var.y = i2;
                z6 = true;
            }
            i3 = c02Var.x;
            i4 = this.f;
            if (i3 != i4) {
                c02Var.x = i4;
                z6 = true;
            }
            z2 = c02Var.w;
            z3 = this.e;
            if (z2 != z3) {
                c02Var.w = z3;
                z6 = true;
            }
            c90Var = c02Var.u;
            c90Var2 = this.c;
            if (!xi0.o(c90Var, c90Var2)) {
                c02Var.u = c90Var2;
                z6 = true;
            }
            i5 = c02Var.v;
            i6 = this.d;
            if (i5 != i6) {
                z5 = z6;
            } else {
                c02Var.v = i6;
            }
            if (!z4 || z5) {
                o41 o41VarL0 = c02Var.L0();
                String str3 = c02Var.s;
                d02 d02Var3 = c02Var.t;
                c90 c90Var3 = c02Var.u;
                int i7 = c02Var.v;
                boolean z7 = c02Var.w;
                int i8 = c02Var.x;
                int i9 = c02Var.y;
                o41VarL0.a = str3;
                o41VarL0.b = d02Var3;
                o41VarL0.c = c90Var3;
                o41VarL0.d = i7;
                o41VarL0.e = z7;
                o41VarL0.f = i8;
                o41VarL0.g = i9;
                o41VarL0.s = (o41VarL0.s << 2) | 2;
                o41VarL0.c();
            }
            if (c02Var.r) {
                return;
            }
            if (z4 || (z && c02Var.B != null)) {
                kd1.t(c02Var);
            }
            if (z4 || z5) {
                el.D(c02Var);
                al.C(c02Var);
            }
            if (z) {
                al.C(c02Var);
                return;
            }
            return;
        }
        d02Var2.getClass();
        z = false;
        str = c02Var.s;
        str2 = this.a;
        if (!xi0.o(str, str2)) {
        }
        boolean z62 = !c02Var.t.c(d02Var2);
        c02Var.t = d02Var2;
        i = c02Var.y;
        i2 = this.g;
        if (i != i2) {
        }
        i3 = c02Var.x;
        i4 = this.f;
        if (i3 != i4) {
        }
        z2 = c02Var.w;
        z3 = this.e;
        if (z2 != z3) {
        }
        c90Var = c02Var.u;
        c90Var2 = this.c;
        if (!xi0.o(c90Var, c90Var2)) {
        }
        i5 = c02Var.v;
        i6 = this.d;
        if (i5 != i6) {
        }
        if (!z4) {
            o41 o41VarL02 = c02Var.L0();
            String str32 = c02Var.s;
            d02 d02Var32 = c02Var.t;
            c90 c90Var32 = c02Var.u;
            int i72 = c02Var.v;
            boolean z72 = c02Var.w;
            int i82 = c02Var.x;
            int i92 = c02Var.y;
            o41VarL02.a = str32;
            o41VarL02.b = d02Var32;
            o41VarL02.c = c90Var32;
            o41VarL02.d = i72;
            o41VarL02.e = z72;
            o41VarL02.f = i82;
            o41VarL02.g = i92;
            o41VarL02.s = (o41VarL02.s << 2) | 2;
            o41VarL02.c();
        }
        if (c02Var.r) {
        }
    }

    public final int hashCode() {
        return (((s91.d(s91.b(this.d, (this.c.hashCode() + s91.e(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31, this.e) + this.f) * 31) + this.g) * 31;
    }
}
