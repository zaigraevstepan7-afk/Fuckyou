package defpackage;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class uj1 extends z00 implements jk0, pl1 {
    public v5 N;
    public aw O;
    public final vu P;
    public final aw Q;
    public final bk1 R;
    public final qj1 S;
    public final w80 T;
    public final vr U;
    public ud V;
    public sj1 W;
    public qw0 X;
    public s12 Y;

    public uj1(v5 v5Var, aw awVar, jx0 jx0Var, k31 k31Var, vj1 vj1Var, boolean z, boolean z2) {
        super(oj1.a, z, jx0Var, k31Var);
        this.N = v5Var;
        this.O = awVar;
        vu vuVar = new vu();
        vuVar.g = new a7(10, vuVar);
        this.P = vuVar;
        aw awVar2 = new aw(new rv(new y41(oj1.d)));
        this.Q = awVar2;
        v5 v5Var2 = this.N;
        aw awVar3 = this.O;
        bk1 bk1Var = new bk1(vj1Var, v5Var2, awVar3 == null ? awVar2 : awVar3, k31Var, z2, vuVar, this, new rj1(this, 0));
        this.R = bk1Var;
        qj1 qj1Var = new qj1(bk1Var, z);
        this.S = qj1Var;
        w80 w80Var = new w80(2, null, 10);
        L0(w80Var);
        this.T = w80Var;
        vr vrVar = new vr(k31Var, bk1Var, z2, new rj1(this, 1));
        L0(vrVar);
        this.U = vrVar;
        L0(new mz0(qj1Var, vuVar));
        dh dhVar = new dh();
        dhVar.s = vrVar;
        L0(dhVar);
    }

    @Override // defpackage.sv0
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.sv0
    public final void D0() {
        if (this.r) {
            hx hxVar = bl.P(this).B;
            aw awVar = this.Q;
            awVar.getClass();
            awVar.a = new rv(new y41(hxVar));
        }
        qw0 qw0Var = this.X;
        if (qw0Var != null) {
            qw0Var.c = bl.P(this).B;
        }
        s12 s12Var = this.Y;
        if (s12Var != null) {
            s12Var.c = bl.P(this).B;
        }
    }

    @Override // defpackage.z00, defpackage.p81
    public final void I(e81 e81Var, f81 f81Var, long j) {
        int i;
        List list = e81Var.a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (((Boolean) this.v.i(new s81(((l81) list.get(i2)).i))).booleanValue()) {
                super.I(e81Var, f81Var, j);
                break;
            }
            i2++;
        }
        if (this.w) {
            if (this.E == null) {
                bc0 bc0Var = new bc0(this);
                L0(bc0Var);
                this.E = bc0Var;
            }
            int i3 = 3;
            f81 f81Var2 = f81.e;
            ks ksVar = null;
            bk1 bk1Var = this.R;
            if (f81Var == f81Var2 && e81Var.f == 6) {
                if (this.X == null) {
                    this.X = new qw0(bk1Var, new qt0(i3, ViewConfiguration.get(el.L(this).getContext())), new io(2, this, uj1.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), bl.P(this).B);
                }
                qw0 qw0Var = this.X;
                if (qw0Var != null) {
                    vt vtVarZ0 = z0();
                    if (qw0Var.h == null) {
                        qw0Var.h = nu0.A(vtVarZ0, null, null, new e(qw0Var, ksVar, 23), 3);
                    }
                }
            }
            qw0 qw0Var2 = this.X;
            f81 f81Var3 = f81.f;
            if (qw0Var2 != null && e81Var.f == 6) {
                int size2 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        if (f81Var == f81Var2 && qw0Var2.d) {
                            qw0Var2.f(e81Var);
                            l01.a(e81Var);
                        }
                        if (f81Var == f81Var3 && !qw0Var2.d && qw0Var2.f(e81Var)) {
                            l01.a(e81Var);
                        }
                    } else if (((l81) list.get(i4)).c()) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            if (f81Var == f81Var2 && ((i = e81Var.f) == 10 || i == 11 || i == 12)) {
                if (this.Y == null) {
                    this.Y = new s12(bk1Var, new io(2, this, uj1.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 2), bl.P(this).B);
                }
                s12 s12Var = this.Y;
                if (s12Var != null) {
                    vt vtVarZ02 = z0();
                    if (s12Var.g == null) {
                        s12Var.g = nu0.A(vtVarZ02, null, null, new m6(s12Var, null), 3);
                    }
                }
            }
            s12 s12Var2 = this.Y;
            if (s12Var2 != null) {
                int i5 = e81Var.f;
                if (i5 == 10 || i5 == 11 || i5 == 12) {
                    int size3 = list.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        if (((l81) list.get(i6)).c()) {
                            return;
                        }
                    }
                    if (f81Var == f81Var2 && s12Var2.d) {
                        s12Var2.d(e81Var);
                        l01.a(e81Var);
                    }
                    if (f81Var == f81Var3 && !s12Var2.d && s12Var2.d(e81Var)) {
                        l01.a(e81Var);
                    }
                }
            }
        }
    }

    @Override // defpackage.jk0
    public final boolean P(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.w || ((!ek0.a(bl.A(keyEvent), ek0.D) && !ek0.a(hk.d(keyEvent.getKeyCode()), ek0.C)) || bl.D(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.R.d == k31.e;
        vr vrVar = this.U;
        if (z) {
            int iM0 = (int) (vrVar.M0() & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(ek0.a(hk.d(keyEvent.getKeyCode()), ek0.C) ? iM0 : -iM0)));
        } else {
            int iM02 = (int) (vrVar.M0() >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(ek0.a(hk.d(keyEvent.getKeyCode()), ek0.C) ? iM02 : -iM02)) << 32);
        }
        nu0.A(z0(), null, null, new sj1(this, jFloatToRawIntBits, null, 0), 3);
        return true;
    }

    @Override // defpackage.z00
    public final Object S0(y00 y00Var, y00 y00Var2) {
        bk1 bk1Var = this.R;
        Object objG = bk1Var.g(ly0.f, new g(y00Var, bk1Var, (ks) null, 13), y00Var2);
        return objG == wt.e ? objG : t32.a;
    }

    @Override // defpackage.z00
    public final void Y0(j00 j00Var) {
        nu0.A(this.P.f(), null, null, new e(j00Var, this, null, 29), 3);
    }

    @Override // defpackage.xw, defpackage.p81
    public final void a() {
        h0();
        if (this.r) {
            hx hxVar = bl.P(this).B;
            aw awVar = this.Q;
            awVar.getClass();
            awVar.a = new rv(new y41(hxVar));
        }
        qw0 qw0Var = this.X;
        if (qw0Var != null) {
            qw0Var.c = bl.P(this).B;
        }
        s12 s12Var = this.Y;
        if (s12Var != null) {
            s12Var.c = bl.P(this).B;
        }
    }

    @Override // defpackage.z00
    public final boolean d1() {
        bk1 bk1Var = this.R;
        if (bk1Var.a.b()) {
            return true;
        }
        v5 v5Var = bk1Var.b;
        return v5Var != null ? v5Var.e() : false;
    }

    @Override // defpackage.pl1
    public final void g0(am1 am1Var) {
        if (this.w && (this.V == null || this.W == null)) {
            this.V = new ud(14, this);
            this.W = new sj1(this, null);
        }
        ud udVar = this.V;
        if (udVar != null) {
            ck0[] ck0VarArr = yl1.a;
            am1Var.a(ml1.d, new r0(null, udVar));
        }
        sj1 sj1Var = this.W;
        if (sj1Var != null) {
            ck0[] ck0VarArr2 = yl1.a;
            am1Var.a(ml1.e, sj1Var);
        }
    }

    public final void g1(v5 v5Var, aw awVar, jx0 jx0Var, k31 k31Var, vj1 vj1Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.w != z) {
            this.S.b = z;
            z3 = true;
        } else {
            z3 = false;
        }
        aw awVar2 = awVar == null ? this.Q : awVar;
        bk1 bk1Var = this.R;
        if (!xi0.o(bk1Var.a, vj1Var)) {
            bk1Var.a = vj1Var;
            z5 = true;
        }
        bk1Var.b = v5Var;
        if (bk1Var.d != k31Var) {
            bk1Var.d = k31Var;
            z5 = true;
        }
        if (bk1Var.e != z2) {
            bk1Var.e = z2;
        } else {
            z4 = z5;
        }
        bk1Var.c = awVar2;
        bk1Var.f = this.P;
        vr vrVar = this.U;
        vrVar.s = k31Var;
        vrVar.u = z2;
        this.N = v5Var;
        this.O = awVar;
        fi1 fi1Var = oj1.a;
        k31 k31Var2 = bk1Var.d;
        k31 k31Var3 = k31.e;
        if (k31Var2 != k31Var3) {
            k31Var3 = k31.f;
        }
        f1(fi1Var, z, jx0Var, k31Var3, z4);
        if (z3) {
            this.V = null;
            this.W = null;
            kd1.t(this);
        }
    }

    @Override // defpackage.jk0
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.z00
    public final void X0(long j) {
    }
}
