package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class q41 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        h02[] h02VarArr = g02.b;
        a = g02.c;
    }

    public static final p41 a(p41 p41Var, int i, int i2, long j, fz1 fz1Var, m71 m71Var, mp0 mp0Var, int i3, int i4, uz1 uz1Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        fz1 fz1Var2 = fz1Var;
        m71 m71Var2 = m71Var;
        mp0 mp0Var2 = mp0Var;
        int i7 = i3;
        int i8 = i4;
        uz1 uz1Var2 = uz1Var;
        if (i5 == 0 || i5 == p41Var.a) {
            h02[] h02VarArr = g02.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (g02.a(j3, p41Var.c)) {
                }
            }
            if ((fz1Var2 == null || fz1Var2.equals(p41Var.d)) && ((i6 == 0 || i6 == p41Var.b) && ((m71Var2 == null || m71Var2.equals(p41Var.e)) && ((mp0Var2 == null || mp0Var2.equals(p41Var.f)) && ((i7 == 0 || i7 == p41Var.g) && ((i8 == 0 || i8 == p41Var.h) && (uz1Var2 == null || uz1Var2.equals(p41Var.i)))))))) {
                return p41Var;
            }
        } else {
            j2 = 0;
        }
        h02[] h02VarArr2 = g02.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = p41Var.c;
        }
        if (fz1Var2 == null) {
            fz1Var2 = p41Var.d;
        }
        if (i5 == 0) {
            i5 = p41Var.a;
        }
        if (i6 == 0) {
            i6 = p41Var.b;
        }
        m71 m71Var3 = p41Var.e;
        if (m71Var3 != null && m71Var2 == null) {
            m71Var2 = m71Var3;
        }
        if (mp0Var2 == null) {
            mp0Var2 = p41Var.f;
        }
        if (i7 == 0) {
            i7 = p41Var.g;
        }
        if (i8 == 0) {
            i8 = p41Var.h;
        }
        if (uz1Var2 == null) {
            uz1Var2 = p41Var.i;
        }
        return new p41(i5, i6, j3, fz1Var2, m71Var2, mp0Var2, i7, i8, uz1Var2);
    }
}
