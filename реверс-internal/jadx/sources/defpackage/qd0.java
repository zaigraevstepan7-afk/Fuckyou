package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qd0 {
    public final zk0 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final sx0 f = new sx0();
    public final h01 g = new h01();
    public final lx0 h = new lx0(10);

    public qd0(zk0 zk0Var) {
        this.a = zk0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, List list, boolean z) {
        lx0 lx0Var;
        long[] jArr;
        long[] jArr2;
        int i;
        uz0 uz0Var;
        Object obj;
        int size = list.size();
        h01 h01Var = this.g;
        h01 h01Var2 = h01Var;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            lx0Var = this.h;
            if (i2 >= size) {
                break;
            }
            sv0 sv0Var = (sv0) list.get(i2);
            if (sv0Var.r) {
                sv0Var.q = new y3(5, this, sv0Var);
                if (z2) {
                    iy0 iy0Var = h01Var2.a;
                    Object[] objArr = iy0Var.e;
                    int i3 = iy0Var.g;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i4];
                        if (xi0.o(((uz0) obj).c, sv0Var)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    uz0Var = (uz0) obj;
                    if (uz0Var != null) {
                        uz0Var.i = true;
                        uz0Var.d.a(j);
                        if (z) {
                            Object objD = lx0Var.d(j);
                            if (objD == null) {
                                objD = new sx0();
                                lx0Var.g(j, objD);
                            }
                            ((sx0) objD).a(uz0Var);
                        }
                        h01Var2 = uz0Var;
                    } else {
                        z2 = false;
                        uz0Var = new uz0(sv0Var);
                        uz0Var.d.a(j);
                        if (z) {
                            Object objD2 = lx0Var.d(j);
                            if (objD2 == null) {
                                objD2 = new sx0();
                                lx0Var.g(j, objD2);
                            }
                            ((sx0) objD2).a(uz0Var);
                        }
                        h01Var2.a.b(uz0Var);
                        h01Var2 = uz0Var;
                    }
                } else {
                    uz0Var = new uz0(sv0Var);
                    uz0Var.d.a(j);
                    if (z) {
                    }
                    h01Var2.a.b(uz0Var);
                    h01Var2 = uz0Var;
                }
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = lx0Var.b;
            Object[] objArr2 = lx0Var.c;
            long[] jArr4 = lx0Var.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr4[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j3 = jArr3[i9];
                                sx0 sx0Var = (sx0) objArr2[i9];
                                iy0 iy0Var2 = h01Var.a;
                                i = i6;
                                Object[] objArr3 = iy0Var2.e;
                                int i10 = iy0Var2.g;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((uz0) objArr3[i11]).f(j3, sx0Var);
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i6;
                            }
                            j2 >>= i;
                            i8++;
                            i6 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr3 = jArr;
                }
            }
        }
        lx0Var.a();
    }

    public final boolean b(xg0 xg0Var, boolean z) {
        qs0 qs0Var = (qs0) xg0Var.f;
        zk0 zk0Var = this.a;
        h01 h01Var = this.g;
        boolean zA = h01Var.a(qs0Var, zk0Var, xg0Var, z);
        iy0 iy0Var = h01Var.a;
        if (!zA) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = iy0Var.e;
        int i = iy0Var.g;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((uz0) objArr[i2]).e(xg0Var, z) || z3;
        }
        Object[] objArr2 = iy0Var.e;
        int i3 = iy0Var.g;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((uz0) objArr2[i4]).d(xg0Var) || z4;
        }
        h01Var.b(xg0Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            sx0 sx0Var = this.f;
            int i5 = sx0Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((sv0) sx0Var.f(i6));
            }
            sx0Var.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            h01Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        h01 h01Var = this.g;
        iy0 iy0Var = h01Var.a;
        Object[] objArr = iy0Var.e;
        int i = iy0Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((uz0) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            h01Var.a.g();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d(sv0 sv0Var) {
        if (this.b) {
            this.e = true;
            this.f.a(sv0Var);
            return;
        }
        h01 h01Var = this.g;
        sx0 sx0Var = h01Var.b;
        sx0Var.d();
        sx0Var.a(h01Var);
        while (sx0Var.i()) {
            h01 h01Var2 = (h01) sx0Var.k(sx0Var.b - 1);
            int i = 0;
            while (true) {
                iy0 iy0Var = h01Var2.a;
                if (i < iy0Var.g) {
                    uz0 uz0Var = (uz0) iy0Var.e[i];
                    if (xi0.o(uz0Var.c, sv0Var)) {
                        h01Var2.a.j(uz0Var);
                        uz0Var.c();
                    } else {
                        sx0Var.a(uz0Var);
                        i++;
                    }
                }
            }
        }
    }
}
