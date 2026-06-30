package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class mf {
    public static final /* synthetic */ int a = 0;

    static {
        bk.c(40.0f, 40.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final sa0 sa0Var, final tv0 tv0Var, final boolean z, final d02 d02Var, final nk0 nk0Var, final lk0 lk0Var, final boolean z2, final int i, final int i2, final ez1 ez1Var, sa0 sa0Var2, final jx0 jx0Var, final uq1 uq1Var, final jo joVar, ob0 ob0Var, final int i3) {
        final sa0 sa0Var3;
        sa0 sa0Var4;
        int i4;
        Object obj;
        int i5;
        Object obj2;
        ob0Var.X(2026950908);
        int i6 = i3 | (ob0Var.f(str) ? 4 : 2) | (ob0Var.h(sa0Var) ? 32 : 16) | (ob0Var.f(tv0Var) ? 256 : 128) | (ob0Var.g(z) ? 2048 : 1024) | (ob0Var.g(false) ? 16384 : 8192) | (ob0Var.f(d02Var) ? 131072 : 65536) | (ob0Var.f(nk0Var) ? 1048576 : 524288) | (ob0Var.f(lk0Var) ? 8388608 : 4194304) | (ob0Var.g(z2) ? 67108864 : 33554432) | (ob0Var.d(i) ? 536870912 : 268435456);
        int i7 = 196608 | (ob0Var.d(i2) ? 4 : 2) | (ob0Var.f(ez1Var) ? 32 : 16) | 384 | (ob0Var.f(jx0Var) ? 2048 : 1024) | (ob0Var.f(uq1Var) ? 16384 : 8192);
        if (ob0Var.N(i6 & 1, ((306783379 & i6) == 306783378 && (i7 & 74899) == 74898) ? false : true)) {
            ob0Var.S();
            int i8 = i3 & 1;
            Object obj3 = kp.a;
            if (i8 == 0 || ob0Var.x()) {
                Object objK = ob0Var.K();
                Object obj4 = objK;
                if (objK == obj3) {
                    Object p1Var = new p1(2);
                    ob0Var.f0(p1Var);
                    obj4 = p1Var;
                }
                sa0Var4 = (sa0) obj4;
            } else {
                ob0Var.Q();
                sa0Var4 = sa0Var2;
            }
            ob0Var.q();
            Object objK2 = ob0Var.K();
            if (objK2 == obj3) {
                i4 = 1;
                Object objB = xc.B(new az1(str, 0L, 6));
                ob0Var.f0(objB);
                obj = objB;
            } else {
                i4 = 1;
                obj = objK2;
            }
            fy0 fy0Var = (fy0) obj;
            az1 az1Var = (az1) fy0Var.getValue();
            sa0 sa0Var5 = sa0Var4;
            az1 az1Var2 = new az1(new hb(str), az1Var.b, az1Var.c);
            boolean zF = ob0Var.f(az1Var2);
            Object objK3 = ob0Var.K();
            if (zF || objK3 == obj3) {
                i5 = 4;
                Object f8Var = new f8(4, az1Var2, fy0Var);
                ob0Var.f0(f8Var);
                obj2 = f8Var;
            } else {
                i5 = 4;
                obj2 = objK3;
            }
            wi0.m((ha0) obj2, ob0Var);
            int i9 = (i6 & 14) == i5 ? i4 : 0;
            Object objK4 = ob0Var.K();
            Object obj5 = objK4;
            if (i9 != 0 || objK4 == obj3) {
                Object objB2 = xc.B(str);
                ob0Var.f0(objB2);
                obj5 = objB2;
            }
            Object obj6 = (fy0) obj5;
            nk0Var.getClass();
            int i10 = nk0Var.a;
            mk0 mk0Var = new mk0(i10);
            if (i10 == -1) {
                mk0Var = null;
            }
            int i11 = mk0Var != null ? mk0Var.a : 0;
            int i12 = nk0Var.b;
            cf0 cf0Var = new cf0(i12);
            if (i12 == -1) {
                cf0Var = null;
            }
            df0 df0Var = new df0(z2, i11, i4, i4, cf0Var != null ? cf0Var.a : i4, as0.g);
            boolean z3 = !z2;
            int i13 = z2 ? i4 : i2;
            int i14 = z2 ? i4 : i;
            boolean zF2 = ob0Var.f(obj6);
            if ((i6 & 112) != 32) {
                i4 = 0;
            }
            int i15 = (zF2 ? 1 : 0) | i4;
            Object objK5 = ob0Var.K();
            Object obj7 = objK5;
            if (i15 != 0 || objK5 == obj3) {
                Object kfVar = new kf(sa0Var, fy0Var, obj6, 0);
                ob0Var.f0(kfVar);
                obj7 = kfVar;
            }
            int i16 = i7 << 9;
            sa0Var3 = sa0Var5;
            bl.b(az1Var2, (sa0) obj7, tv0Var, d02Var, ez1Var, sa0Var3, jx0Var, uq1Var, z3, i14, i13, df0Var, lk0Var, z, joVar, ob0Var, (i6 & 896) | ((i6 >> 6) & 7168) | (i16 & 57344) | 196608 | (3670016 & i16) | (i16 & 29360128), ((i6 >> 15) & 896) | (i6 & 7168) | (i6 & 57344) | 196608);
        } else {
            ob0Var.Q();
            sa0Var3 = sa0Var2;
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new wa0(str, sa0Var, tv0Var, z, d02Var, nk0Var, lk0Var, z2, i, i2, ez1Var, sa0Var3, jx0Var, uq1Var, joVar, i3) { // from class: lf
                public final /* synthetic */ String e;
                public final /* synthetic */ sa0 f;
                public final /* synthetic */ tv0 g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ d02 i;
                public final /* synthetic */ nk0 j;
                public final /* synthetic */ lk0 k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ int m;
                public final /* synthetic */ int n;
                public final /* synthetic */ ez1 o;
                public final /* synthetic */ sa0 p;
                public final /* synthetic */ jx0 q;
                public final /* synthetic */ uq1 r;
                public final /* synthetic */ jo s;

                @Override // defpackage.wa0
                public final Object h(Object obj8, Object obj9) {
                    ((Integer) obj9).getClass();
                    int iV = al.V(1);
                    mf.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (ob0) obj8, iV);
                    return t32.a;
                }
            };
        }
    }
}
