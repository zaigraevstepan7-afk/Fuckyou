package p093v;

import java.util.ArrayList;
import p089t.C1046c;
import p095w.C1076b;
import p099y.C1103f;

/* JADX INFO: renamed from: v.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1066g extends AbstractC1068i {

    /* JADX INFO: renamed from: A0 */
    public int f4381A0;

    /* JADX INFO: renamed from: B0 */
    public C1076b f4382B0;

    /* JADX INFO: renamed from: C0 */
    public C1103f f4383C0;

    /* JADX INFO: renamed from: D0 */
    public int f4384D0;

    /* JADX INFO: renamed from: E0 */
    public int f4385E0;

    /* JADX INFO: renamed from: F0 */
    public int f4386F0;

    /* JADX INFO: renamed from: G0 */
    public int f4387G0;

    /* JADX INFO: renamed from: H0 */
    public int f4388H0;

    /* JADX INFO: renamed from: I0 */
    public int f4389I0;

    /* JADX INFO: renamed from: J0 */
    public float f4390J0;

    /* JADX INFO: renamed from: K0 */
    public float f4391K0;

    /* JADX INFO: renamed from: L0 */
    public float f4392L0;

    /* JADX INFO: renamed from: M0 */
    public float f4393M0;

    /* JADX INFO: renamed from: N0 */
    public float f4394N0;

    /* JADX INFO: renamed from: O0 */
    public float f4395O0;

    /* JADX INFO: renamed from: P0 */
    public int f4396P0;

    /* JADX INFO: renamed from: Q0 */
    public int f4397Q0;

    /* JADX INFO: renamed from: R0 */
    public int f4398R0;

    /* JADX INFO: renamed from: S0 */
    public int f4399S0;

    /* JADX INFO: renamed from: T0 */
    public int f4400T0;

    /* JADX INFO: renamed from: U0 */
    public int f4401U0;

    /* JADX INFO: renamed from: V0 */
    public int f4402V0;

    /* JADX INFO: renamed from: W0 */
    public ArrayList f4403W0;

    /* JADX INFO: renamed from: X0 */
    public C1063d[] f4404X0;

    /* JADX INFO: renamed from: Y0 */
    public C1063d[] f4405Y0;

    /* JADX INFO: renamed from: Z0 */
    public int[] f4406Z0;

    /* JADX INFO: renamed from: a1 */
    public C1063d[] f4407a1;

    /* JADX INFO: renamed from: b1 */
    public int f4408b1;

    /* JADX INFO: renamed from: s0 */
    public int f4409s0;

    /* JADX INFO: renamed from: t0 */
    public int f4410t0;

    /* JADX INFO: renamed from: u0 */
    public int f4411u0;

    /* JADX INFO: renamed from: v0 */
    public int f4412v0;

    /* JADX INFO: renamed from: w0 */
    public int f4413w0;

    /* JADX INFO: renamed from: x0 */
    public int f4414x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f4415y0;

    /* JADX INFO: renamed from: z0 */
    public int f4416z0;

    @Override // p093v.AbstractC1068i
    /* JADX INFO: renamed from: S */
    public final void mo2639S() {
        for (int i2 = 0; i2 < this.f4424r0; i2++) {
            C1063d c1063d = this.f4423q0[i2];
            if (c1063d != null) {
                c1063d.f4278F = true;
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final int m2640T(C1063d c1063d, int i2) {
        C1063d c1063d2;
        if (c1063d != null) {
            int[] iArr = c1063d.f4330p0;
            if (iArr[1] == 3) {
                int i3 = c1063d.f4333s;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int i4 = (int) (c1063d.f4340z * i2);
                        if (i4 != c1063d.m2613k()) {
                            c1063d.f4311g = true;
                            m2642V(iArr[0], c1063d.m2617q(), 1, i4, c1063d);
                        }
                        return i4;
                    }
                    c1063d2 = c1063d;
                    if (i3 == 1) {
                        return c1063d2.m2613k();
                    }
                    if (i3 == 3) {
                        return (int) ((c1063d2.m2617q() * c1063d2.f4295W) + 0.5f);
                    }
                }
            } else {
                c1063d2 = c1063d;
            }
            return c1063d2.m2613k();
        }
        return 0;
    }

    /* JADX INFO: renamed from: U */
    public final int m2641U(C1063d c1063d, int i2) {
        C1063d c1063d2;
        if (c1063d != null) {
            int[] iArr = c1063d.f4330p0;
            if (iArr[0] == 3) {
                int i3 = c1063d.f4332r;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int i4 = (int) (c1063d.f4337w * i2);
                        if (i4 != c1063d.m2617q()) {
                            c1063d.f4311g = true;
                            m2642V(1, i4, iArr[1], c1063d.m2613k(), c1063d);
                        }
                        return i4;
                    }
                    c1063d2 = c1063d;
                    if (i3 == 1) {
                        return c1063d2.m2617q();
                    }
                    if (i3 == 3) {
                        return (int) ((c1063d2.m2613k() * c1063d2.f4295W) + 0.5f);
                    }
                }
            } else {
                c1063d2 = c1063d;
            }
            return c1063d2.m2617q();
        }
        return 0;
    }

    /* JADX INFO: renamed from: V */
    public final void m2642V(int i2, int i3, int i4, int i5, C1063d c1063d) {
        C1103f c1103f;
        C1063d c1063d2;
        while (true) {
            c1103f = this.f4383C0;
            if (c1103f != null || (c1063d2 = this.f4292T) == null) {
                break;
            } else {
                this.f4383C0 = ((C1064e) c1063d2).f4357u0;
            }
        }
        C1076b c1076b = this.f4382B0;
        c1076b.f4434a = i2;
        c1076b.f4435b = i4;
        c1076b.f4436c = i3;
        c1076b.f4437d = i5;
        c1103f.m2741b(c1063d, c1076b);
        c1063d.m2602O(c1076b.f4438e);
        c1063d.m2599L(c1076b.f4439f);
        c1063d.f4277E = c1076b.f4441h;
        c1063d.m2596I(c1076b.f4440g);
    }

    @Override // p093v.C1063d
    /* JADX INFO: renamed from: b */
    public final void mo2574b(C1046c c1046c, boolean z2) {
        C1063d c1063d;
        float f;
        int i2;
        super.mo2574b(c1046c, z2);
        C1063d c1063d2 = this.f4292T;
        boolean z3 = c1063d2 != null && ((C1064e) c1063d2).f4358v0;
        int i3 = this.f4400T0;
        ArrayList arrayList = this.f4403W0;
        if (i3 != 0) {
            if (i3 == 1) {
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    ((C1065f) arrayList.get(i4)).m2634b(i4, z3, i4 == size + (-1));
                    i4++;
                }
            } else if (i3 != 2) {
                if (i3 == 3) {
                    int size2 = arrayList.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        ((C1065f) arrayList.get(i5)).m2634b(i5, z3, i5 == size2 + (-1));
                        i5++;
                    }
                }
            } else if (this.f4406Z0 != null && this.f4405Y0 != null && this.f4404X0 != null) {
                for (int i6 = 0; i6 < this.f4408b1; i6++) {
                    this.f4407a1[i6].m2593D();
                }
                int[] iArr = this.f4406Z0;
                int i7 = iArr[0];
                int i8 = iArr[1];
                float f2 = this.f4390J0;
                C1063d c1063d3 = null;
                int i9 = 0;
                while (i9 < i7) {
                    if (z3) {
                        i2 = (i7 - i9) - 1;
                        f = 1.0f - this.f4390J0;
                    } else {
                        f = f2;
                        i2 = i9;
                    }
                    C1063d c1063d4 = this.f4405Y0[i2];
                    if (c1063d4 != null && c1063d4.f4312g0 != 8) {
                        C1062c c1062c = c1063d4.f4281I;
                        if (i9 == 0) {
                            c1063d4.m2608f(c1062c, this.f4281I, this.f4413w0);
                            c1063d4.f4316i0 = this.f4384D0;
                            c1063d4.f4306d0 = f;
                        }
                        if (i9 == i7 - 1) {
                            c1063d4.m2608f(c1063d4.f4283K, this.f4283K, this.f4414x0);
                        }
                        if (i9 > 0 && c1063d3 != null) {
                            int i10 = this.f4396P0;
                            C1062c c1062c2 = c1063d3.f4283K;
                            c1063d4.m2608f(c1062c, c1062c2, i10);
                            c1063d3.m2608f(c1062c2, c1062c, 0);
                        }
                        c1063d3 = c1063d4;
                    }
                    i9++;
                    f2 = f;
                }
                for (int i11 = 0; i11 < i8; i11++) {
                    C1063d c1063d5 = this.f4404X0[i11];
                    if (c1063d5 != null && c1063d5.f4312g0 != 8) {
                        C1062c c1062c3 = c1063d5.f4282J;
                        if (i11 == 0) {
                            c1063d5.m2608f(c1062c3, this.f4282J, this.f4409s0);
                            c1063d5.f4318j0 = this.f4385E0;
                            c1063d5.f4308e0 = this.f4391K0;
                        }
                        if (i11 == i8 - 1) {
                            c1063d5.m2608f(c1063d5.f4284L, this.f4284L, this.f4410t0);
                        }
                        if (i11 > 0 && c1063d3 != null) {
                            int i12 = this.f4397Q0;
                            C1062c c1062c4 = c1063d3.f4284L;
                            c1063d5.m2608f(c1062c3, c1062c4, i12);
                            c1063d3.m2608f(c1062c4, c1062c3, 0);
                        }
                        c1063d3 = c1063d5;
                    }
                }
                for (int i13 = 0; i13 < i7; i13++) {
                    for (int i14 = 0; i14 < i8; i14++) {
                        int i15 = (i14 * i7) + i13;
                        if (this.f4402V0 == 1) {
                            i15 = (i13 * i8) + i14;
                        }
                        C1063d[] c1063dArr = this.f4407a1;
                        if (i15 < c1063dArr.length && (c1063d = c1063dArr[i15]) != null && c1063d.f4312g0 != 8) {
                            C1063d c1063d6 = this.f4405Y0[i13];
                            C1063d c1063d7 = this.f4404X0[i14];
                            if (c1063d != c1063d6) {
                                c1063d.m2608f(c1063d.f4281I, c1063d6.f4281I, 0);
                                c1063d.m2608f(c1063d.f4283K, c1063d6.f4283K, 0);
                            }
                            if (c1063d != c1063d7) {
                                c1063d.m2608f(c1063d.f4282J, c1063d7.f4282J, 0);
                                c1063d.m2608f(c1063d.f4284L, c1063d7.f4284L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C1065f) arrayList.get(0)).m2634b(0, z3, true);
        }
        this.f4415y0 = false;
    }
}
