package p093v;

import java.util.ArrayList;
import p089t.AbstractC1048e;
import p089t.C1045b;
import p089t.C1046c;
import p089t.C1049f;

/* JADX INFO: renamed from: v.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1067h extends C1063d {

    /* JADX INFO: renamed from: q0 */
    public float f4417q0 = -1.0f;

    /* JADX INFO: renamed from: r0 */
    public int f4418r0 = -1;

    /* JADX INFO: renamed from: s0 */
    public int f4419s0 = -1;

    /* JADX INFO: renamed from: t0 */
    public C1062c f4420t0 = this.f4282J;

    /* JADX INFO: renamed from: u0 */
    public int f4421u0 = 0;

    /* JADX INFO: renamed from: v0 */
    public boolean f4422v0;

    public C1067h() {
        this.f4290R.clear();
        this.f4290R.add(this.f4420t0);
        int length = this.f4289Q.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f4289Q[i2] = this.f4420t0;
        }
    }

    @Override // p093v.C1063d
    /* JADX INFO: renamed from: A */
    public final boolean mo2570A() {
        return this.f4422v0;
    }

    @Override // p093v.C1063d
    /* JADX INFO: renamed from: B */
    public final boolean mo2571B() {
        return this.f4422v0;
    }

    @Override // p093v.C1063d
    /* JADX INFO: renamed from: Q */
    public final void mo2604Q(C1046c c1046c, boolean z2) {
        if (this.f4292T == null) {
            return;
        }
        C1062c c1062c = this.f4420t0;
        c1046c.getClass();
        int iM2523n = C1046c.m2523n(c1062c);
        if (this.f4421u0 == 1) {
            this.f4297Y = iM2523n;
            this.f4298Z = 0;
            m2599L(this.f4292T.m2613k());
            m2602O(0);
            return;
        }
        this.f4297Y = 0;
        this.f4298Z = iM2523n;
        m2602O(this.f4292T.m2617q());
        m2599L(0);
    }

    /* JADX INFO: renamed from: R */
    public final void m2643R(int i2) {
        this.f4420t0.m2587l(i2);
        this.f4422v0 = true;
    }

    /* JADX INFO: renamed from: S */
    public final void m2644S(int i2) {
        if (this.f4421u0 == i2) {
            return;
        }
        this.f4421u0 = i2;
        ArrayList arrayList = this.f4290R;
        arrayList.clear();
        if (this.f4421u0 == 1) {
            this.f4420t0 = this.f4281I;
        } else {
            this.f4420t0 = this.f4282J;
        }
        arrayList.add(this.f4420t0);
        C1062c[] c1062cArr = this.f4289Q;
        int length = c1062cArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            c1062cArr[i3] = this.f4420t0;
        }
    }

    @Override // p093v.C1063d
    /* JADX INFO: renamed from: b */
    public final void mo2574b(C1046c c1046c, boolean z2) {
        C1064e c1064e = (C1064e) this.f4292T;
        if (c1064e == null) {
            return;
        }
        Object objMo2611i = c1064e.mo2611i(2);
        Object objMo2611i2 = c1064e.mo2611i(4);
        C1063d c1063d = this.f4292T;
        boolean z3 = c1063d != null && c1063d.f4330p0[0] == 2;
        if (this.f4421u0 == 0) {
            objMo2611i = c1064e.mo2611i(3);
            objMo2611i2 = c1064e.mo2611i(5);
            C1063d c1063d2 = this.f4292T;
            z3 = c1063d2 != null && c1063d2.f4330p0[1] == 2;
        }
        if (this.f4422v0) {
            C1062c c1062c = this.f4420t0;
            if (c1062c.f4266c) {
                C1049f c1049fM2534k = c1046c.m2534k(c1062c);
                c1046c.m2527d(c1049fM2534k, this.f4420t0.m2579d());
                if (this.f4418r0 != -1) {
                    if (z3) {
                        c1046c.m2529f(c1046c.m2534k(objMo2611i2), c1049fM2534k, 0, 5);
                    }
                } else if (this.f4419s0 != -1 && z3) {
                    C1049f c1049fM2534k2 = c1046c.m2534k(objMo2611i2);
                    c1046c.m2529f(c1049fM2534k, c1046c.m2534k(objMo2611i), 0, 5);
                    c1046c.m2529f(c1049fM2534k2, c1049fM2534k, 0, 5);
                }
                this.f4422v0 = false;
                return;
            }
        }
        if (this.f4418r0 != -1) {
            C1049f c1049fM2534k3 = c1046c.m2534k(this.f4420t0);
            c1046c.m2528e(c1049fM2534k3, c1046c.m2534k(objMo2611i), this.f4418r0, 8);
            if (z3) {
                c1046c.m2529f(c1046c.m2534k(objMo2611i2), c1049fM2534k3, 0, 5);
                return;
            }
            return;
        }
        if (this.f4419s0 != -1) {
            C1049f c1049fM2534k4 = c1046c.m2534k(this.f4420t0);
            C1049f c1049fM2534k5 = c1046c.m2534k(objMo2611i2);
            c1046c.m2528e(c1049fM2534k4, c1049fM2534k5, -this.f4419s0, 8);
            if (z3) {
                c1046c.m2529f(c1049fM2534k4, c1046c.m2534k(objMo2611i), 0, 5);
                c1046c.m2529f(c1049fM2534k5, c1049fM2534k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f4417q0 != -1.0f) {
            C1049f c1049fM2534k6 = c1046c.m2534k(this.f4420t0);
            C1049f c1049fM2534k7 = c1046c.m2534k(objMo2611i2);
            float f = this.f4417q0;
            C1045b c1045bM2535l = c1046c.m2535l();
            c1045bM2535l.f4151d.m2512g(c1049fM2534k6, -1.0f);
            c1045bM2535l.f4151d.m2512g(c1049fM2534k7, f);
            c1046c.m2526c(c1045bM2535l);
        }
    }

    @Override // p093v.C1063d
    /* JADX INFO: renamed from: c */
    public final boolean mo2575c() {
        return true;
    }

    @Override // p093v.C1063d
    /* JADX INFO: renamed from: i */
    public final C1062c mo2611i(int i2) {
        int iM2545a = AbstractC1048e.m2545a(i2);
        if (iM2545a != 1) {
            if (iM2545a != 2) {
                if (iM2545a != 3) {
                    if (iM2545a != 4) {
                        return null;
                    }
                }
            }
            if (this.f4421u0 == 0) {
                return this.f4420t0;
            }
            return null;
        }
        if (this.f4421u0 == 1) {
            return this.f4420t0;
        }
        return null;
    }
}
