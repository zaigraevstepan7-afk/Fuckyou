package p093v;

import androidx.fragment.app.AbstractC0529T;
import p089t.C1045b;
import p089t.C1046c;
import p089t.C1049f;

/* JADX INFO: renamed from: v.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1060a extends AbstractC1068i {

    /* JADX INFO: renamed from: s0 */
    public int f4243s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f4244t0;

    /* JADX INFO: renamed from: u0 */
    public int f4245u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f4246v0;

    @Override // p093v.C1063d
    /* JADX INFO: renamed from: A */
    public final boolean mo2570A() {
        return this.f4246v0;
    }

    @Override // p093v.C1063d
    /* JADX INFO: renamed from: B */
    public final boolean mo2571B() {
        return this.f4246v0;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m2572T() {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        boolean z2 = true;
        while (true) {
            i2 = this.f4424r0;
            if (i5 >= i2) {
                break;
            }
            C1063d c1063d = this.f4423q0[i5];
            if ((this.f4244t0 || c1063d.mo2575c()) && ((((i3 = this.f4243s0) == 0 || i3 == 1) && !c1063d.mo2570A()) || (((i4 = this.f4243s0) == 2 || i4 == 3) && !c1063d.mo2571B()))) {
                z2 = false;
            }
            i5++;
        }
        if (!z2 || i2 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.f4424r0; i6++) {
            C1063d c1063d2 = this.f4423q0[i6];
            if (this.f4244t0 || c1063d2.mo2575c()) {
                if (!z3) {
                    int i7 = this.f4243s0;
                    if (i7 == 0) {
                        iMax = c1063d2.mo2611i(2).m2579d();
                    } else if (i7 == 1) {
                        iMax = c1063d2.mo2611i(4).m2579d();
                    } else if (i7 == 2) {
                        iMax = c1063d2.mo2611i(3).m2579d();
                    } else if (i7 == 3) {
                        iMax = c1063d2.mo2611i(5).m2579d();
                    }
                    z3 = true;
                }
                int i8 = this.f4243s0;
                if (i8 == 0) {
                    iMax = Math.min(iMax, c1063d2.mo2611i(2).m2579d());
                } else if (i8 == 1) {
                    iMax = Math.max(iMax, c1063d2.mo2611i(4).m2579d());
                } else if (i8 == 2) {
                    iMax = Math.min(iMax, c1063d2.mo2611i(3).m2579d());
                } else if (i8 == 3) {
                    iMax = Math.max(iMax, c1063d2.mo2611i(5).m2579d());
                }
            }
        }
        int i9 = iMax + this.f4245u0;
        int i10 = this.f4243s0;
        if (i10 == 0 || i10 == 1) {
            m2597J(i9, i9);
        } else {
            m2598K(i9, i9);
        }
        this.f4246v0 = true;
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final int m2573U() {
        int i2 = this.f4243s0;
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        return (i2 == 2 || i2 == 3) ? 1 : -1;
    }

    @Override // p093v.C1063d
    /* JADX INFO: renamed from: b */
    public final void mo2574b(C1046c c1046c, boolean z2) {
        boolean z3;
        int i2;
        int i3;
        C1062c[] c1062cArr = this.f4289Q;
        C1062c c1062c = this.f4281I;
        c1062cArr[0] = c1062c;
        C1062c c1062c2 = this.f4282J;
        int i4 = 2;
        c1062cArr[2] = c1062c2;
        C1062c c1062c3 = this.f4283K;
        c1062cArr[1] = c1062c3;
        C1062c c1062c4 = this.f4284L;
        c1062cArr[3] = c1062c4;
        for (C1062c c1062c5 : c1062cArr) {
            c1062c5.f4272i = c1046c.m2534k(c1062c5);
        }
        int i5 = this.f4243s0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        C1062c c1062c6 = c1062cArr[i5];
        if (!this.f4246v0) {
            m2572T();
        }
        if (this.f4246v0) {
            this.f4246v0 = false;
            int i6 = this.f4243s0;
            if (i6 == 0 || i6 == 1) {
                c1046c.m2527d(c1062c.f4272i, this.f4297Y);
                c1046c.m2527d(c1062c3.f4272i, this.f4297Y);
                return;
            } else {
                if (i6 == 2 || i6 == 3) {
                    c1046c.m2527d(c1062c2.f4272i, this.f4298Z);
                    c1046c.m2527d(c1062c4.f4272i, this.f4298Z);
                    return;
                }
                return;
            }
        }
        for (int i7 = 0; i7 < this.f4424r0; i7++) {
            C1063d c1063d = this.f4423q0[i7];
            if ((this.f4244t0 || c1063d.mo2575c()) && ((((i3 = this.f4243s0) == 0 || i3 == 1) && c1063d.f4330p0[0] == 3 && c1063d.f4281I.f4269f != null && c1063d.f4283K.f4269f != null) || ((i3 == 2 || i3 == 3) && c1063d.f4330p0[1] == 3 && c1063d.f4282J.f4269f != null && c1063d.f4284L.f4269f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = c1062c.m2582g() || c1062c3.m2582g();
        boolean z5 = c1062c2.m2582g() || c1062c4.m2582g();
        int i8 = (z3 || !(((i2 = this.f4243s0) == 0 && z4) || ((i2 == 2 && z5) || ((i2 == 1 && z4) || (i2 == 3 && z5))))) ? 4 : 5;
        int i9 = 0;
        while (i9 < this.f4424r0) {
            C1063d c1063d2 = this.f4423q0[i9];
            if (this.f4244t0 || c1063d2.mo2575c()) {
                C1049f c1049fM2534k = c1046c.m2534k(c1063d2.f4289Q[this.f4243s0]);
                int i10 = this.f4243s0;
                C1062c c1062c7 = c1063d2.f4289Q[i10];
                c1062c7.f4272i = c1049fM2534k;
                C1062c c1062c8 = c1062c7.f4269f;
                int i11 = (c1062c8 == null || c1062c8.f4267d != this) ? 0 : c1062c7.f4270g;
                if (i10 == 0 || i10 == i4) {
                    C1049f c1049f = c1062c6.f4272i;
                    int i12 = this.f4245u0 - i11;
                    C1045b c1045bM2535l = c1046c.m2535l();
                    C1049f c1049fM2536m = c1046c.m2536m();
                    c1049fM2536m.f4177d = 0;
                    c1045bM2535l.m2516c(c1049f, c1049fM2534k, c1049fM2536m, i12);
                    c1046c.m2526c(c1045bM2535l);
                } else {
                    C1049f c1049f2 = c1062c6.f4272i;
                    int i13 = this.f4245u0 + i11;
                    C1045b c1045bM2535l2 = c1046c.m2535l();
                    C1049f c1049fM2536m2 = c1046c.m2536m();
                    c1049fM2536m2.f4177d = 0;
                    c1045bM2535l2.m2515b(c1049f2, c1049fM2534k, c1049fM2536m2, i13);
                    c1046c.m2526c(c1045bM2535l2);
                }
                c1046c.m2528e(c1062c6.f4272i, c1049fM2534k, this.f4245u0 + i11, i8);
            }
            i9++;
            i4 = 2;
        }
        int i14 = this.f4243s0;
        if (i14 == 0) {
            c1046c.m2528e(c1062c3.f4272i, c1062c.f4272i, 0, 8);
            c1046c.m2528e(c1062c.f4272i, this.f4292T.f4283K.f4272i, 0, 4);
            c1046c.m2528e(c1062c.f4272i, this.f4292T.f4281I.f4272i, 0, 0);
            return;
        }
        if (i14 == 1) {
            c1046c.m2528e(c1062c.f4272i, c1062c3.f4272i, 0, 8);
            c1046c.m2528e(c1062c.f4272i, this.f4292T.f4281I.f4272i, 0, 4);
            c1046c.m2528e(c1062c.f4272i, this.f4292T.f4283K.f4272i, 0, 0);
        } else if (i14 == 2) {
            c1046c.m2528e(c1062c4.f4272i, c1062c2.f4272i, 0, 8);
            c1046c.m2528e(c1062c2.f4272i, this.f4292T.f4284L.f4272i, 0, 4);
            c1046c.m2528e(c1062c2.f4272i, this.f4292T.f4282J.f4272i, 0, 0);
        } else if (i14 == 3) {
            c1046c.m2528e(c1062c2.f4272i, c1062c4.f4272i, 0, 8);
            c1046c.m2528e(c1062c2.f4272i, this.f4292T.f4282J.f4272i, 0, 4);
            c1046c.m2528e(c1062c2.f4272i, this.f4292T.f4284L.f4272i, 0, 0);
        }
    }

    @Override // p093v.C1063d
    /* JADX INFO: renamed from: c */
    public final boolean mo2575c() {
        return true;
    }

    @Override // p093v.C1063d
    public final String toString() {
        String strM1417f = "[Barrier] " + this.f4314h0 + " {";
        for (int i2 = 0; i2 < this.f4424r0; i2++) {
            C1063d c1063d = this.f4423q0[i2];
            if (i2 > 0) {
                strM1417f = AbstractC0529T.m1417f(strM1417f, ", ");
            }
            strM1417f = strM1417f + c1063d.f4314h0;
        }
        return AbstractC0529T.m1417f(strM1417f, "}");
    }
}
