package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class sp1 {
    public yp1 a;
    public long b;
    public boolean c;
    public int d;

    public sp1(long j, yp1 yp1Var) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = yp1Var;
        this.b = j;
        fi1 fi1Var = aq1.a;
        if (j != 0) {
            yp1 yp1VarD = d();
            long j2 = yp1VarD.g;
            long[] jArr = yp1VarD.h;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = yp1VarD.f;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = yp1VarD.e;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (aq1.c) {
                iA = aq1.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(sp1 sp1Var) {
        aq1.b.x(sp1Var);
    }

    public final void a() {
        synchronized (aq1.c) {
            b();
            p();
        }
    }

    public void b() {
        aq1.d = aq1.d.b(g());
    }

    public abstract void c();

    public yp1 d() {
        return this.a;
    }

    public abstract sa0 e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract sa0 i();

    public final sp1 j() {
        oc ocVar = aq1.b;
        sp1 sp1Var = (sp1) ocVar.h();
        ocVar.x(this);
        return sp1Var;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(vs1 vs1Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            aq1.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(yp1 yp1Var) {
        this.a = yp1Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract sp1 u(sa0 sa0Var);
}
