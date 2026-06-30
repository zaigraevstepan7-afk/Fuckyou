package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h5 implements sa0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ h5(float f, f6 f6Var, wf wfVar) {
        this.f = f;
        this.g = f6Var;
        this.h = wfVar;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        long jRound;
        int i = this.e;
        t32 t32Var = t32.a;
        Object obj2 = this.h;
        float f = this.f;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                f6 f6Var = (f6) obj3;
                wf wfVar = (wf) obj2;
                sl0 sl0Var = (sl0) obj;
                sl0Var.a();
                oc ocVar = sl0Var.e.f;
                long jQ = ocVar.q();
                ocVar.i().l();
                try {
                    qt0 qt0Var = (qt0) ocVar.a;
                    qt0Var.A(f, 0.0f);
                    qt0Var.w(45.0f, 0L);
                    p10.Y(sl0Var, f6Var, 0L, 0.0f, wfVar, 46);
                    return t32Var;
                } finally {
                    s91.r(ocVar, jQ);
                }
            case 1:
                z61 z61Var = (z61) obj3;
                y61 y61Var = (y61) obj;
                h9 h9Var = ((v02) obj2).w;
                y61.j(y61Var, z61Var, h9Var != null ? (int) ((Number) h9Var.d()).floatValue() : (int) f, 0);
                return t32Var;
            default:
                k42 k42Var = (k42) obj3;
                sa0 sa0Var = (sa0) obj2;
                long jLongValue = ((Long) obj).longValue();
                if (k42Var.b == Long.MIN_VALUE) {
                    k42Var.b = jLongValue;
                }
                float f2 = k42Var.e;
                ya yaVar = new ya(f2);
                ya yaVar2 = k42.f;
                if (f == 0.0f) {
                    jRound = k42Var.a.b(new ya(f2), yaVar2, k42Var.c);
                } else {
                    double d = (jLongValue - k42Var.b) / f;
                    if (Double.isNaN(d)) {
                        yc.p("Cannot round NaN value.");
                        return null;
                    }
                    jRound = Math.round(d);
                }
                long j = jRound;
                float f3 = ((ya) k42Var.a.o(j, yaVar, yaVar2, k42Var.c)).a;
                k42Var.c = (ya) k42Var.a.l(j, yaVar, yaVar2, k42Var.c);
                k42Var.b = jLongValue;
                float f4 = k42Var.e - f3;
                k42Var.e = f3;
                sa0Var.i(Float.valueOf(f4));
                return t32Var;
        }
    }

    public /* synthetic */ h5(z61 z61Var, v02 v02Var, float f) {
        this.g = z61Var;
        this.h = v02Var;
        this.f = f;
    }

    public /* synthetic */ h5(k42 k42Var, float f, sa0 sa0Var) {
        this.g = k42Var;
        this.f = f;
        this.h = sa0Var;
    }
}
