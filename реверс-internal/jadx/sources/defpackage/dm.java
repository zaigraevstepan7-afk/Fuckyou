package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class dm {
    public static final ys1 a = new ys1(new e2(6));

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(long j, ob0 ob0Var) {
        ob0Var.W(89373914);
        bm bmVar = ((ju0) ob0Var.j(mu0.b)).a;
        long j2 = bmVar.a;
        long j3 = bmVar.U;
        long j4 = bmVar.Q;
        long j5 = bmVar.M;
        long j6 = bmVar.q;
        if (vl.c(j, j2)) {
            j3 = bmVar.b;
        } else if (vl.c(j, bmVar.f)) {
            j3 = bmVar.g;
        } else if (vl.c(j, bmVar.j)) {
            j3 = bmVar.k;
        } else if (vl.c(j, bmVar.n)) {
            j3 = bmVar.o;
        } else if (vl.c(j, bmVar.w)) {
            j3 = bmVar.x;
        } else if (vl.c(j, bmVar.c)) {
            j3 = bmVar.d;
        } else if (vl.c(j, bmVar.h)) {
            j3 = bmVar.i;
        } else if (vl.c(j, bmVar.l)) {
            j3 = bmVar.m;
        } else if (vl.c(j, bmVar.y)) {
            j3 = bmVar.z;
        } else if (vl.c(j, bmVar.u)) {
            j3 = bmVar.v;
        } else if (!vl.c(j, bmVar.p)) {
            if (vl.c(j, bmVar.r)) {
                j3 = bmVar.s;
            } else if (vl.c(j, bmVar.D) || vl.c(j, bmVar.F) || vl.c(j, bmVar.G) || vl.c(j, bmVar.H) || vl.c(j, bmVar.I) || vl.c(j, bmVar.J) || vl.c(j, bmVar.E)) {
                j3 = j6;
            } else if (vl.c(j, bmVar.K) || vl.c(j, bmVar.L)) {
                j3 = j5;
            } else if (vl.c(j, bmVar.O) || vl.c(j, bmVar.P)) {
                j3 = j4;
            } else if (!vl.c(j, bmVar.S) && !vl.c(j, bmVar.T)) {
                j3 = vl.g;
            }
        }
        if (j3 == 16) {
            j3 = ((vl) ob0Var.j(rr.a)).a;
        }
        ob0Var.p(false);
        return j3;
    }

    public static final long b(bm bmVar, cm cmVar) {
        switch (cmVar.ordinal()) {
            case 0:
                return bmVar.n;
            case 1:
                return bmVar.w;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return bmVar.y;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return bmVar.v;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return bmVar.e;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return bmVar.u;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return bmVar.o;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return bmVar.x;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return bmVar.z;
            case el.a /* 9 */:
                return bmVar.b;
            case el.b /* 10 */:
                return bmVar.d;
            case 11:
                return bmVar.M;
            case el.c /* 12 */:
                return bmVar.N;
            case 13:
                return bmVar.g;
            case 14:
                return bmVar.i;
            case 15:
                return bmVar.Q;
            case 16:
                return bmVar.R;
            case 17:
                return bmVar.q;
            case 18:
                return bmVar.s;
            case 19:
                return bmVar.k;
            case 20:
                return bmVar.m;
            case 21:
                return bmVar.U;
            case 22:
                return bmVar.V;
            case 23:
                return bmVar.A;
            case 24:
                return bmVar.B;
            case 25:
                return bmVar.a;
            case 26:
                return bmVar.c;
            case 27:
                return bmVar.K;
            case 28:
                return bmVar.L;
            case 29:
                return bmVar.C;
            case 30:
                return bmVar.f;
            case 31:
                return bmVar.h;
            case 32:
                return bmVar.O;
            case 33:
                return bmVar.P;
            case 34:
                return bmVar.p;
            case 35:
                return bmVar.D;
            case 36:
                return bmVar.F;
            case 37:
                return bmVar.G;
            case 38:
                return bmVar.H;
            case 39:
                return bmVar.I;
            case 40:
                return bmVar.J;
            case 41:
                return bmVar.E;
            case 42:
                return bmVar.t;
            case 43:
                return bmVar.r;
            case 44:
                return bmVar.j;
            case 45:
                return bmVar.l;
            case 46:
                return bmVar.S;
            case 47:
                return bmVar.T;
            default:
                ez1.a();
                return 0L;
        }
    }

    public static final long c(cm cmVar, ob0 ob0Var) {
        return b(((ju0) ob0Var.j(mu0.b)).a, cmVar);
    }

    public static bm d(long j, long j2, long j3, long j4, int i) {
        long j5 = yl.z;
        return new bm(j5, yl.j, yl.A, (i & 8) != 0 ? yl.k : j, yl.e, yl.E, yl.n, yl.F, (i & 256) != 0 ? yl.o : j2, yl.R, yl.t, yl.S, (i & 4096) != 0 ? yl.u : j3, yl.a, yl.g, yl.I, yl.r, yl.Q, yl.s, j5, yl.f, yl.d, yl.b, yl.h, yl.c, (i & 33554432) != 0 ? yl.i : j4, yl.x, yl.y, yl.D, yl.J, yl.P, yl.K, yl.L, yl.M, yl.N, yl.O, yl.B, yl.C, yl.l, yl.m, yl.G, yl.H, yl.p, yl.q, yl.T, yl.U, yl.v, yl.w);
    }
}
