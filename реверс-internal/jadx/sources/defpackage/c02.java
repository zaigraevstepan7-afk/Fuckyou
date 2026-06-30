package defpackage;

import android.os.Trace;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class c02 extends sv0 implements il0, o10, pl1 {
    public o41 A;
    public a02 B;
    public b02 C;
    public String s;
    public d02 t;
    public c90 u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public HashMap z;

    @Override // defpackage.sv0
    public final boolean A0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.il0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int D(ws0 ws0Var, pu0 pu0Var, int i) {
        o41 o41VarL0;
        b02 b02Var = this.C;
        if (b02Var == null) {
            o41VarL0 = L0();
        } else {
            if (!b02Var.c) {
                b02Var = null;
            }
            if (b02Var == null || (o41VarL0 = b02Var.d) == null) {
            }
        }
        o41VarL0.d(ws0Var);
        return o41VarL0.a(i, ws0Var.getLayoutDirection());
    }

    public final o41 L0() {
        d02 d02Var = this.t;
        if (this.A == null) {
            this.A = new o41(this.s, d02Var, this.u, this.v, this.w, this.x, this.y);
        }
        o41 o41Var = this.A;
        o41Var.getClass();
        return o41Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0016  */
    @Override // defpackage.o10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(sl0 sl0Var) {
        o41 o41VarL0;
        if (!this.r) {
            return;
        }
        b02 b02Var = this.C;
        if (b02Var == null) {
            o41VarL0 = L0();
        } else {
            if (!b02Var.c) {
                b02Var = null;
            }
            if (b02Var == null || (o41VarL0 = b02Var.d) == null) {
            }
        }
        r6 r6Var = o41VarL0.j;
        if (r6Var == null) {
            qg0.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.A + ", textSubstitution=" + this.C + ")");
            yc.j();
            return;
        }
        cj cjVarI = sl0Var.e.f.i();
        boolean z = o41VarL0.k;
        if (z) {
            long j = o41VarL0.l;
            cjVarI.l();
            cjVarI.e(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
        }
        try {
            d02 d02Var = this.t;
            zq1 zq1Var = d02Var.a;
            ax1 ax1Var = zq1Var.m;
            if (ax1Var == null) {
                ax1Var = ax1.b;
            }
            ax1 ax1Var2 = ax1Var;
            um1 um1Var = zq1Var.n;
            if (um1Var == null) {
                um1Var = um1.d;
            }
            um1 um1Var2 = um1Var;
            q10 q10Var = zq1Var.p;
            if (q10Var == null) {
                q10Var = i60.a;
            }
            q10 q10Var2 = q10Var;
            lh lhVarC = zq1Var.a.c();
            if (lhVarC != null) {
                r6Var.g(cjVarI, lhVarC, d02Var.a.a.a(), um1Var2, ax1Var2, q10Var2);
            } else {
                long jB = vl.g;
                if (jB == 16) {
                    jB = d02Var.b() != 16 ? d02Var.b() : vl.b;
                }
                r6Var.f(cjVarI, jB, um1Var2, ax1Var2, q10Var2);
            }
            if (z) {
                cjVarI.i();
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.il0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int O(ws0 ws0Var, pu0 pu0Var, int i) {
        o41 o41VarL0;
        b02 b02Var = this.C;
        if (b02Var == null) {
            o41VarL0 = L0();
        } else {
            if (!b02Var.c) {
                b02Var = null;
            }
            if (b02Var == null || (o41VarL0 = b02Var.d) == null) {
            }
        }
        o41VarL0.d(ws0Var);
        return qc1.f(o41VarL0.e(ws0Var.getLayoutDirection()).a());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x003d, B:21:0x0045, B:22:0x006c, B:12:0x0015), top: B:28:0x0005 }] */
    @Override // defpackage.il0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        o41 o41VarL0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            b02 b02Var = this.C;
            if (b02Var == null) {
                o41VarL0 = L0();
            } else {
                if (!b02Var.c) {
                    b02Var = null;
                }
                if (b02Var == null || (o41VarL0 = b02Var.d) == null) {
                }
            }
            o41VarL0.d(xu0Var);
            boolean zB = o41VarL0.b(j, xu0Var.getLayoutDirection());
            n41 n41Var = o41VarL0.n;
            if (n41Var != null) {
                n41Var.b();
            }
            r6 r6Var = o41VarL0.j;
            r6Var.getClass();
            nz1 nz1Var = r6Var.d;
            long j2 = o41VarL0.l;
            if (zB) {
                el.C(this);
                HashMap map = this.z;
                if (map == null) {
                    map = new HashMap(2);
                    this.z = map;
                }
                map.put(f3.a, Integer.valueOf(Math.round(nz1Var.d(0))));
                map.put(f3.b, Integer.valueOf(Math.round(nz1Var.d(nz1Var.g - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            z61 z61VarE = pu0Var.e(bl.x(i, i, i2, i2));
            HashMap map2 = this.z;
            map2.getClass();
            return xu0Var.f0(i, i2, map2, new pd(z61VarE, 9));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.il0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(ws0 ws0Var, pu0 pu0Var, int i) {
        o41 o41VarL0;
        b02 b02Var = this.C;
        if (b02Var == null) {
            o41VarL0 = L0();
        } else {
            if (!b02Var.c) {
                b02Var = null;
            }
            if (b02Var == null || (o41VarL0 = b02Var.d) == null) {
            }
        }
        o41VarL0.d(ws0Var);
        return qc1.f(o41VarL0.e(ws0Var.getLayoutDirection()).c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [sa0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [a02] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.pl1
    public final void g0(am1 am1Var) {
        a02 a02Var = this.B;
        ?? r0 = a02Var;
        if (a02Var == null) {
            final int i = 0;
            ?? r02 = new sa0(this) { // from class: a02
                public final /* synthetic */ c02 f;

                {
                    this.f = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
                @Override // defpackage.sa0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object i(Object obj) {
                    hx hxVar;
                    pz1 pz1Var;
                    int i2 = i;
                    c02 c02Var = this.f;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            o41 o41VarL0 = c02Var.L0();
                            d02 d02VarE = d02.e(c02Var.t, vl.g, 0L, null, 0L, 0, 0L, 16777214);
                            al0 al0Var = o41VarL0.o;
                            pz1 pz1Var2 = null;
                            if (al0Var != null && (hxVar = o41VarL0.i) != null) {
                                hb hbVar = new hb(o41VarL0.a);
                                if (o41VarL0.j == null || o41VarL0.n == null) {
                                    pz1Var = null;
                                } else {
                                    long j = o41VarL0.p & (-8589934589L);
                                    int i3 = o41VarL0.f;
                                    boolean z = o41VarL0.e;
                                    int i4 = o41VarL0.d;
                                    c90 c90Var = o41VarL0.c;
                                    f40 f40Var = f40.e;
                                    pz1Var = new pz1(new oz1(hbVar, d02VarE, f40Var, i3, z, i4, hxVar, al0Var, c90Var, j), new vw0(new me(hbVar, d02VarE, f40Var, hxVar, c90Var), j, o41VarL0.f, o41VarL0.d), o41VarL0.l);
                                }
                            }
                            if (pz1Var != null) {
                                list.add(pz1Var);
                                pz1Var2 = pz1Var;
                            }
                            return Boolean.valueOf(pz1Var2 != null);
                        case 1:
                            String str = ((hb) obj).f;
                            b02 b02Var = c02Var.C;
                            if (b02Var == null) {
                                b02 b02Var2 = new b02(c02Var.s, str);
                                o41 o41Var = new o41(str, c02Var.t, c02Var.u, c02Var.v, c02Var.w, c02Var.x, c02Var.y);
                                o41Var.d(c02Var.L0().i);
                                b02Var2.d = o41Var;
                                c02Var.C = b02Var2;
                            } else if (!xi0.o(str, b02Var.b)) {
                                b02Var.b = str;
                                o41 o41Var2 = b02Var.d;
                                if (o41Var2 != null) {
                                    d02 d02Var = c02Var.t;
                                    c90 c90Var2 = c02Var.u;
                                    int i5 = c02Var.v;
                                    boolean z2 = c02Var.w;
                                    int i6 = c02Var.x;
                                    int i7 = c02Var.y;
                                    o41Var2.a = str;
                                    o41Var2.b = d02Var;
                                    o41Var2.c = c90Var2;
                                    o41Var2.d = i5;
                                    o41Var2.e = z2;
                                    o41Var2.f = i6;
                                    o41Var2.g = i7;
                                    o41Var2.s = (o41Var2.s << 2) | 2;
                                    o41Var2.c();
                                }
                            }
                            kd1.t(c02Var);
                            el.D(c02Var);
                            al.C(c02Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            b02 b02Var3 = c02Var.C;
                            if (b02Var3 == null) {
                                z = false;
                            } else {
                                b02Var3.c = zBooleanValue;
                                kd1.t(c02Var);
                                el.D(c02Var);
                                al.C(c02Var);
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.B = r02;
            r0 = r02;
        }
        hb hbVar = new hb(this.s);
        ck0[] ck0VarArr = yl1.a;
        am1Var.a(vl1.C, hk.G(hbVar));
        b02 b02Var = this.C;
        if (b02Var != null) {
            boolean z = b02Var.c;
            zl1 zl1Var = vl1.E;
            ck0[] ck0VarArr2 = yl1.a;
            ck0 ck0Var = ck0VarArr2[17];
            am1Var.a(zl1Var, Boolean.valueOf(z));
            hb hbVar2 = new hb(b02Var.b);
            zl1 zl1Var2 = vl1.D;
            ck0 ck0Var2 = ck0VarArr2[16];
            am1Var.a(zl1Var2, hbVar2);
        }
        final int i2 = 1;
        am1Var.a(ml1.l, new r0(null, new sa0(this) { // from class: a02
            public final /* synthetic */ c02 f;

            {
                this.f = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
            @Override // defpackage.sa0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object i(Object obj) {
                hx hxVar;
                pz1 pz1Var;
                int i22 = i2;
                c02 c02Var = this.f;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        o41 o41VarL0 = c02Var.L0();
                        d02 d02VarE = d02.e(c02Var.t, vl.g, 0L, null, 0L, 0, 0L, 16777214);
                        al0 al0Var = o41VarL0.o;
                        pz1 pz1Var2 = null;
                        if (al0Var != null && (hxVar = o41VarL0.i) != null) {
                            hb hbVar3 = new hb(o41VarL0.a);
                            if (o41VarL0.j == null || o41VarL0.n == null) {
                                pz1Var = null;
                            } else {
                                long j = o41VarL0.p & (-8589934589L);
                                int i3 = o41VarL0.f;
                                boolean z2 = o41VarL0.e;
                                int i4 = o41VarL0.d;
                                c90 c90Var = o41VarL0.c;
                                f40 f40Var = f40.e;
                                pz1Var = new pz1(new oz1(hbVar3, d02VarE, f40Var, i3, z2, i4, hxVar, al0Var, c90Var, j), new vw0(new me(hbVar3, d02VarE, f40Var, hxVar, c90Var), j, o41VarL0.f, o41VarL0.d), o41VarL0.l);
                            }
                        }
                        if (pz1Var != null) {
                            list.add(pz1Var);
                            pz1Var2 = pz1Var;
                        }
                        return Boolean.valueOf(pz1Var2 != null);
                    case 1:
                        String str = ((hb) obj).f;
                        b02 b02Var2 = c02Var.C;
                        if (b02Var2 == null) {
                            b02 b02Var22 = new b02(c02Var.s, str);
                            o41 o41Var = new o41(str, c02Var.t, c02Var.u, c02Var.v, c02Var.w, c02Var.x, c02Var.y);
                            o41Var.d(c02Var.L0().i);
                            b02Var22.d = o41Var;
                            c02Var.C = b02Var22;
                        } else if (!xi0.o(str, b02Var2.b)) {
                            b02Var2.b = str;
                            o41 o41Var2 = b02Var2.d;
                            if (o41Var2 != null) {
                                d02 d02Var = c02Var.t;
                                c90 c90Var2 = c02Var.u;
                                int i5 = c02Var.v;
                                boolean z22 = c02Var.w;
                                int i6 = c02Var.x;
                                int i7 = c02Var.y;
                                o41Var2.a = str;
                                o41Var2.b = d02Var;
                                o41Var2.c = c90Var2;
                                o41Var2.d = i5;
                                o41Var2.e = z22;
                                o41Var2.f = i6;
                                o41Var2.g = i7;
                                o41Var2.s = (o41Var2.s << 2) | 2;
                                o41Var2.c();
                            }
                        }
                        kd1.t(c02Var);
                        el.D(c02Var);
                        al.C(c02Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        b02 b02Var3 = c02Var.C;
                        if (b02Var3 == null) {
                            z = false;
                        } else {
                            b02Var3.c = zBooleanValue;
                            kd1.t(c02Var);
                            el.D(c02Var);
                            al.C(c02Var);
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        final int i3 = 2;
        am1Var.a(ml1.m, new r0(null, new sa0(this) { // from class: a02
            public final /* synthetic */ c02 f;

            {
                this.f = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
            @Override // defpackage.sa0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object i(Object obj) {
                hx hxVar;
                pz1 pz1Var;
                int i22 = i3;
                c02 c02Var = this.f;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        o41 o41VarL0 = c02Var.L0();
                        d02 d02VarE = d02.e(c02Var.t, vl.g, 0L, null, 0L, 0, 0L, 16777214);
                        al0 al0Var = o41VarL0.o;
                        pz1 pz1Var2 = null;
                        if (al0Var != null && (hxVar = o41VarL0.i) != null) {
                            hb hbVar3 = new hb(o41VarL0.a);
                            if (o41VarL0.j == null || o41VarL0.n == null) {
                                pz1Var = null;
                            } else {
                                long j = o41VarL0.p & (-8589934589L);
                                int i32 = o41VarL0.f;
                                boolean z2 = o41VarL0.e;
                                int i4 = o41VarL0.d;
                                c90 c90Var = o41VarL0.c;
                                f40 f40Var = f40.e;
                                pz1Var = new pz1(new oz1(hbVar3, d02VarE, f40Var, i32, z2, i4, hxVar, al0Var, c90Var, j), new vw0(new me(hbVar3, d02VarE, f40Var, hxVar, c90Var), j, o41VarL0.f, o41VarL0.d), o41VarL0.l);
                            }
                        }
                        if (pz1Var != null) {
                            list.add(pz1Var);
                            pz1Var2 = pz1Var;
                        }
                        return Boolean.valueOf(pz1Var2 != null);
                    case 1:
                        String str = ((hb) obj).f;
                        b02 b02Var2 = c02Var.C;
                        if (b02Var2 == null) {
                            b02 b02Var22 = new b02(c02Var.s, str);
                            o41 o41Var = new o41(str, c02Var.t, c02Var.u, c02Var.v, c02Var.w, c02Var.x, c02Var.y);
                            o41Var.d(c02Var.L0().i);
                            b02Var22.d = o41Var;
                            c02Var.C = b02Var22;
                        } else if (!xi0.o(str, b02Var2.b)) {
                            b02Var2.b = str;
                            o41 o41Var2 = b02Var2.d;
                            if (o41Var2 != null) {
                                d02 d02Var = c02Var.t;
                                c90 c90Var2 = c02Var.u;
                                int i5 = c02Var.v;
                                boolean z22 = c02Var.w;
                                int i6 = c02Var.x;
                                int i7 = c02Var.y;
                                o41Var2.a = str;
                                o41Var2.b = d02Var;
                                o41Var2.c = c90Var2;
                                o41Var2.d = i5;
                                o41Var2.e = z22;
                                o41Var2.f = i6;
                                o41Var2.g = i7;
                                o41Var2.s = (o41Var2.s << 2) | 2;
                                o41Var2.c();
                            }
                        }
                        kd1.t(c02Var);
                        el.D(c02Var);
                        al.C(c02Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        b02 b02Var3 = c02Var.C;
                        if (b02Var3 == null) {
                            z = false;
                        } else {
                            b02Var3.c = zBooleanValue;
                            kd1.t(c02Var);
                            el.D(c02Var);
                            al.C(c02Var);
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        am1Var.a(ml1.n, new r0(null, new p7(27, this)));
        yl1.a(am1Var, r0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // defpackage.il0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n(ws0 ws0Var, pu0 pu0Var, int i) {
        o41 o41VarL0;
        b02 b02Var = this.C;
        if (b02Var == null) {
            o41VarL0 = L0();
        } else {
            if (!b02Var.c) {
                b02Var = null;
            }
            if (b02Var == null || (o41VarL0 = b02Var.d) == null) {
            }
        }
        o41VarL0.d(ws0Var);
        return o41VarL0.a(i, ws0Var.getLayoutDirection());
    }
}
