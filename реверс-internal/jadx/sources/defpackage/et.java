package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class et extends yw implements pl1 {
    public df0 A;
    public o80 B;
    public v12 u;
    public az1 v;
    public jo0 w;
    public boolean x;
    public z01 y;
    public ry1 z;

    public static void O0(jo0 jo0Var, String str, boolean z) {
        if (z) {
            kz1 kz1Var = jo0Var.e;
            qs qsVar = jo0Var.v;
            if (kz1Var == null) {
                int length = str.length();
                qsVar.i(new az1(str, af1.g(length, length), 4));
            } else {
                az1 az1VarQ = jo0Var.d.q(hk.H(new dx(), new in(str, 1)));
                kz1Var.a(null, az1VarQ);
                qsVar.i(az1VarQ);
            }
        }
    }

    @Override // defpackage.pl1
    public final void g0(am1 am1Var) {
        hb hbVar = this.v.a;
        ck0[] ck0VarArr = yl1.a;
        zl1 zl1Var = vl1.F;
        ck0[] ck0VarArr2 = yl1.a;
        ck0 ck0Var = ck0VarArr2[18];
        am1Var.a(zl1Var, hbVar);
        hb hbVar2 = this.u.a;
        zl1 zl1Var2 = vl1.G;
        ck0 ck0Var2 = ck0VarArr2[19];
        am1Var.a(zl1Var2, hbVar2);
        long j = this.v.b;
        zl1 zl1Var3 = vl1.H;
        ck0 ck0Var3 = ck0VarArr2[20];
        am1Var.a(zl1Var3, new wz1(j));
        b5 b5Var = v20.x;
        zl1 zl1Var4 = vl1.s;
        ck0 ck0Var4 = ck0VarArr2[9];
        am1Var.a(zl1Var4, b5Var);
        y5 y5Var = new y5(AutofillValue.forText(s22.R(this.v.a)));
        zl1 zl1Var5 = vl1.t;
        ck0 ck0Var5 = ck0VarArr2[10];
        am1Var.a(zl1Var5, y5Var);
        am1Var.a(ml1.h, new r0(null, new dt(this, 0)));
        int i = this.A.d;
        if (i == 6) {
            as.a.getClass();
            c5 c5Var = zr.c;
            zl1 zl1Var6 = vl1.r;
            ck0 ck0Var6 = ck0VarArr2[8];
            am1Var.a(zl1Var6, c5Var);
        } else if (i == 7 || i == 8) {
            as.a.getClass();
            c5 c5Var2 = zr.b;
            zl1 zl1Var7 = vl1.r;
            ck0 ck0Var7 = ck0VarArr2[8];
            am1Var.a(zl1Var7, c5Var2);
        } else if (i == 4) {
            as.a.getClass();
            c5 c5Var3 = zr.d;
            zl1 zl1Var8 = vl1.r;
            ck0 ck0Var8 = ck0VarArr2[8];
            am1Var.a(zl1Var8, c5Var3);
        }
        if (!this.x) {
            am1Var.a(vl1.j, t32.a);
        }
        boolean z = this.x;
        zl1 zl1Var9 = vl1.O;
        ck0 ck0Var9 = ck0VarArr2[28];
        am1Var.a(zl1Var9, Boolean.valueOf(z));
        yl1.a(am1Var, new dt(this, 1));
        int i2 = 2;
        if (z) {
            am1Var.a(ml1.k, new r0(null, new dt(this, i2)));
            am1Var.a(ml1.o, new r0(null, new dt(this, am1Var)));
        }
        am1Var.a(ml1.j, new r0(null, new wi(2, this)));
        int i3 = this.A.e;
        ct ctVar = new ct(this, 6);
        am1Var.a(vl1.I, new cf0(i3));
        am1Var.a(ml1.p, new r0(null, ctVar));
        am1Var.a(ml1.b, new r0(null, new ct(this, 7)));
        am1Var.a(ml1.c, new r0(null, new ct(this, 1)));
        if (!wz1.c(this.v.b)) {
            am1Var.a(ml1.q, new r0(null, new ct(this, 2)));
            if (this.x) {
                am1Var.a(ml1.r, new r0(null, new ct(this, 3)));
            }
        }
        if (this.x) {
            am1Var.a(ml1.s, new r0(null, new ct(this, 5)));
        }
    }

    @Override // defpackage.pl1
    public final boolean k0() {
        return true;
    }
}
