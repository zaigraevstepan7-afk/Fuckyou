package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bg0 implements e10 {
    public final z00 e;
    public wf0 f;
    public zf0 g;
    public yf0 h;
    public xf0 i;
    public xk j;
    public y41 k;
    public m12 l;
    public final qn m;
    public final qn n;

    public bg0(z00 z00Var) {
        this.e = z00Var;
        qn qnVar = new qn();
        qnVar.b = new sx0();
        this.m = qnVar;
        qn qnVar2 = new qn();
        qnVar2.b = new kx0();
        this.n = qnVar2;
    }

    public static void c(bg0 bg0Var, uf0 uf0Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        z00 z00Var = bg0Var.e;
        yf0 yf0Var = bg0Var.h;
        if (yf0Var == null) {
            yf0Var = new yf0();
            yf0Var.c = null;
            yf0Var.d = Long.MAX_VALUE;
            yf0Var.e = false;
            bg0Var.h = yf0Var;
        }
        yf0Var.c = uf0Var;
        yf0Var.d = j;
        m12 m12Var = bg0Var.l;
        k31 k31Var = z00Var.u;
        if (m12Var == null) {
            bg0Var.l = new m12(k31Var);
        } else {
            m12Var.a = k31Var;
            m12Var.b = j2;
        }
        yf0Var.e = false;
        bg0Var.j = yf0Var;
    }

    public final void a() {
        wf0 wf0Var = this.f;
        vf0 vf0Var = vf0.g;
        if (wf0Var == null) {
            wf0Var = new wf0();
            wf0Var.c = vf0Var;
            wf0Var.d = false;
            wf0Var.e = false;
            this.f = wf0Var;
        }
        wf0Var.c = vf0Var;
        wf0Var.d = false;
        wf0Var.e = false;
        this.j = wf0Var;
    }

    public final void b(uf0 uf0Var, long j, m12 m12Var) {
        xf0 xf0Var = this.i;
        if (xf0Var == null) {
            xf0Var = new xf0();
            xf0Var.c = null;
            xf0Var.d = Long.MAX_VALUE;
            this.i = xf0Var;
        }
        xf0Var.c = uf0Var;
        xf0Var.d = j;
        m12Var.b = 0L;
        this.j = xf0Var;
    }

    public final y41 d() {
        y41 y41Var = this.k;
        if (y41Var != null) {
            return y41Var;
        }
        yc.p("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(uf0 uf0Var, tf0 tf0Var, long j) {
        long j2;
        float fIntBitsToFloat;
        long j3 = uf0Var.c;
        z00 z00Var = this.e;
        k31 k31Var = z00Var.u;
        k31Var.getClass();
        f10 f10Var = g10.a;
        long j4 = 4294967295L;
        if (Math.abs(Float.intBitsToFloat((int) (k31Var == k31.e ? j & 4294967295L : j >> 32))) > 2.0f) {
            y41 y41VarD = d();
            k31 k31Var2 = z00Var.u;
            qn qnVar = this.m;
            sx0 sx0Var = (sx0) qnVar.b;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            if (al.m(uf0Var)) {
                qnVar.a = 0;
                sx0Var.d();
            }
            float fIntBitsToFloat4 = 0.0f;
            if (al.d(uf0Var) || al.m(uf0Var)) {
                j2 = 4294967295L;
            } else {
                if (sx0Var.b == 3) {
                    int i = qnVar.a;
                    qnVar.a = i + 1;
                    sx0Var.n(i, uf0Var);
                } else {
                    sx0Var.a(uf0Var);
                }
                if (qnVar.a == 3) {
                    qnVar.a = 0;
                }
                Object[] objArr = sx0Var.a;
                int i2 = sx0Var.b;
                int i3 = 0;
                float fIntBitsToFloat5 = 0.0f;
                while (i3 < i2) {
                    fIntBitsToFloat5 += Float.intBitsToFloat((int) (((uf0) objArr[i3]).c >> 32));
                    i3++;
                    j4 = j4;
                }
                j2 = j4;
                int i4 = sx0Var.b;
                fIntBitsToFloat2 = fIntBitsToFloat5 / i4;
                Object[] objArr2 = sx0Var.a;
                float fIntBitsToFloat6 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    fIntBitsToFloat6 += Float.intBitsToFloat((int) (((uf0) objArr2[i5]).c & j2));
                }
                fIntBitsToFloat3 = fIntBitsToFloat6 / sx0Var.b;
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
            if (k31Var2 != null) {
                int i6 = tf0Var.a;
                if (i6 == 1) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                } else if (i6 == 2) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
                }
                jFloatToRawIntBits = k31Var2 == k31.f ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
            }
            ((ft0) y41VarD.f).a(uf0Var.b, jFloatToRawIntBits);
            qn qnVar2 = this.n;
            kx0 kx0Var = (kx0) qnVar2.b;
            int i7 = kx0Var.b;
            if (i7 == 3) {
                int i8 = qnVar2.a;
                qnVar2.a = i8 + 1;
                if (i8 < 0 || i8 >= i7) {
                    yc.o("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = kx0Var.a;
                    long j5 = jArr[i8];
                    jArr[i8] = j;
                }
            } else {
                kx0Var.a(j);
            }
            if (qnVar2.a == 3) {
                qnVar2.a = 0;
            }
            long[] jArr2 = kx0Var.a;
            int i9 = kx0Var.b;
            float fIntBitsToFloat7 = 0.0f;
            for (int i10 = 0; i10 < i9; i10++) {
                fIntBitsToFloat7 += Float.intBitsToFloat((int) (jArr2[i10] >> 32));
            }
            int i11 = kx0Var.b;
            float f = fIntBitsToFloat7 / i11;
            long[] jArr3 = kx0Var.a;
            for (int i12 = 0; i12 < i11; i12++) {
                fIntBitsToFloat4 = Float.intBitsToFloat((int) (jArr3[i12] & j2)) + fIntBitsToFloat4;
            }
            z00Var.W0(new h00((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4 / kx0Var.b)) & j2), true));
        }
    }

    public final void f(uf0 uf0Var, uf0 uf0Var2, tf0 tf0Var, long j) {
        char c;
        long j2;
        float fIntBitsToFloat;
        if (this.k == null) {
            this.k = new y41(24);
        }
        y41 y41VarD = d();
        z00 z00Var = this.e;
        k31 k31Var = z00Var.u;
        qn qnVar = this.m;
        sx0 sx0Var = (sx0) qnVar.b;
        char c2 = ' ';
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (uf0Var.c >> 32));
        long j3 = 4294967295L;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (uf0Var.c & 4294967295L));
        if (al.m(uf0Var)) {
            qnVar.a = 0;
            sx0Var.d();
        }
        if (al.d(uf0Var) || al.m(uf0Var)) {
            c = ' ';
            j2 = 4294967295L;
        } else {
            if (sx0Var.b == 3) {
                int i = qnVar.a;
                qnVar.a = i + 1;
                sx0Var.n(i, uf0Var);
            } else {
                sx0Var.a(uf0Var);
            }
            if (qnVar.a == 3) {
                qnVar.a = 0;
            }
            Object[] objArr = sx0Var.a;
            int i2 = sx0Var.b;
            int i3 = 0;
            float fIntBitsToFloat4 = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((uf0) objArr[i3]).c >> c3));
                i3++;
                c2 = c3;
                j3 = j3;
            }
            c = c2;
            j2 = j3;
            int i4 = sx0Var.b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = sx0Var.a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((uf0) objArr2[i5]).c & j2));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / sx0Var.b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2);
        if (k31Var != null) {
            int i6 = tf0Var.a;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
            }
            jFloatToRawIntBits = k31Var == k31.f ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        }
        ((ft0) y41VarD.f).a(uf0Var.b, jFloatToRawIntBits);
        long jD = w01.d(al.L(uf0Var2, z00Var.u, tf0Var), j);
        if (((Boolean) z00Var.v.i(new s81(1))).booleanValue()) {
            z00Var.W0(new i00(jD));
        }
        qn qnVar2 = this.n;
        qnVar2.a = 0;
        ((kx0) qnVar2.b).b = 0;
    }

    @Override // defpackage.e10
    public final k31 j() {
        return this.e.u;
    }

    @Override // defpackage.ac0
    public final String r0() {
        xk xkVar = this.j;
        return xkVar instanceof wf0 ? ((wf0) xkVar).e ? "waiting" : "idle" : ((xkVar instanceof yf0) || (xkVar instanceof xf0)) ? "waiting" : xkVar instanceof zf0 ? "recognized" : "idle";
    }
}
