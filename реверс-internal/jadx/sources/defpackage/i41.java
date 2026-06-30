package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class i41 extends sv0 implements il0, o10 {
    public g41 s;
    public boolean t;
    public b3 u;
    public wr v;
    public float w;
    public wl x;

    public static boolean M0(long j) {
        return !io1.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean N0(long j) {
        return !io1.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.sv0
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.il0
    public final int D(ws0 ws0Var, pu0 pu0Var, int i) {
        if (!L0()) {
            return pu0Var.a0(i);
        }
        long jO0 = O0(lr.b(0, i, 0, 0, 13));
        return Math.max(kr.i(jO0), pu0Var.a0(i));
    }

    public final boolean L0() {
        return this.t && this.s.e() != 9205357640488583168L;
    }

    @Override // defpackage.o10
    public final void M(sl0 sl0Var) {
        ej ejVar = sl0Var.e;
        long jE = this.s.e();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(N0(jE) ? Float.intBitsToFloat((int) (jE >> 32)) : Float.intBitsToFloat((int) (ejVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(M0(jE) ? Float.intBitsToFloat((int) (jE & 4294967295L)) : Float.intBitsToFloat((int) (ejVar.d() & 4294967295L)))) & 4294967295L);
        long jQ = (Float.intBitsToFloat((int) (ejVar.d() >> 32)) == 0.0f || Float.intBitsToFloat((int) (ejVar.d() & 4294967295L)) == 0.0f) ? 0L : ef1.q(jFloatToRawIntBits, this.v.k(jFloatToRawIntBits, ejVar.d()));
        long jA = this.u.a((((long) Math.round(Float.intBitsToFloat((int) (jQ >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jQ & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (ejVar.d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (ejVar.d() & 4294967295L)))) & 4294967295L), sl0Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        ((qt0) ejVar.f.a).A(f, f2);
        try {
            this.s.c(sl0Var, jQ, this.w, this.x);
            ((qt0) ejVar.f.a).A(-f, -f2);
            sl0Var.a();
        } catch (Throwable th) {
            ((qt0) ejVar.f.a).A(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.il0
    public final int O(ws0 ws0Var, pu0 pu0Var, int i) {
        if (!L0()) {
            return pu0Var.O(i);
        }
        long jO0 = O0(lr.b(0, 0, 0, i, 7));
        return Math.max(kr.j(jO0), pu0Var.O(i));
    }

    public final long O0(long j) {
        boolean z = false;
        boolean z2 = kr.d(j) && kr.c(j);
        if (kr.f(j) && kr.e(j)) {
            z = true;
        }
        if ((!L0() && z2) || z) {
            return kr.a(j, kr.h(j), 0, kr.g(j), 0, 10);
        }
        long jE = this.s.e();
        int iRound = N0(jE) ? Math.round(Float.intBitsToFloat((int) (jE >> 32))) : kr.j(j);
        int iRound2 = M0(jE) ? Math.round(Float.intBitsToFloat((int) (jE & 4294967295L))) : kr.i(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(lr.f(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(lr.g(iRound, j))) << 32);
        if (L0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!N0(this.s.e()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.s.e() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!M0(this.s.e()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.s.e() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : ef1.q(jFloatToRawIntBits2, this.v.k(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return kr.a(j, lr.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, lr.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // defpackage.il0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        z61 z61VarE = pu0Var.e(O0(j));
        return xu0Var.f0(z61VarE.e, z61VarE.f, g40.e, new u3(z61VarE, 5));
    }

    @Override // defpackage.il0
    public final int f(ws0 ws0Var, pu0 pu0Var, int i) {
        if (!L0()) {
            return pu0Var.U(i);
        }
        long jO0 = O0(lr.b(0, 0, 0, i, 7));
        return Math.max(kr.j(jO0), pu0Var.U(i));
    }

    @Override // defpackage.il0
    public final int n(ws0 ws0Var, pu0 pu0Var, int i) {
        if (!L0()) {
            return pu0Var.f(i);
        }
        long jO0 = O0(lr.b(0, i, 0, 0, 13));
        return Math.max(kr.i(jO0), pu0Var.f(i));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.s + ", sizeToIntrinsics=" + this.t + ", alignment=" + this.u + ", alpha=" + this.w + ", colorFilter=" + this.x + ")";
    }
}
