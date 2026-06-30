package p093v;

/* JADX INFO: renamed from: v.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1065f {

    /* JADX INFO: renamed from: a */
    public int f4363a;

    /* JADX INFO: renamed from: d */
    public C1062c f4366d;

    /* JADX INFO: renamed from: e */
    public C1062c f4367e;

    /* JADX INFO: renamed from: f */
    public C1062c f4368f;

    /* JADX INFO: renamed from: g */
    public C1062c f4369g;

    /* JADX INFO: renamed from: h */
    public int f4370h;

    /* JADX INFO: renamed from: i */
    public int f4371i;

    /* JADX INFO: renamed from: j */
    public int f4372j;

    /* JADX INFO: renamed from: k */
    public int f4373k;

    /* JADX INFO: renamed from: q */
    public int f4379q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C1066g f4380r;

    /* JADX INFO: renamed from: b */
    public C1063d f4364b = null;

    /* JADX INFO: renamed from: c */
    public int f4365c = 0;

    /* JADX INFO: renamed from: l */
    public int f4374l = 0;

    /* JADX INFO: renamed from: m */
    public int f4375m = 0;

    /* JADX INFO: renamed from: n */
    public int f4376n = 0;

    /* JADX INFO: renamed from: o */
    public int f4377o = 0;

    /* JADX INFO: renamed from: p */
    public int f4378p = 0;

    public C1065f(C1066g c1066g, int i2, C1062c c1062c, C1062c c1062c2, C1062c c1062c3, C1062c c1062c4, int i3) {
        this.f4380r = c1066g;
        this.f4363a = i2;
        this.f4366d = c1062c;
        this.f4367e = c1062c2;
        this.f4368f = c1062c3;
        this.f4369g = c1062c4;
        this.f4370h = c1066g.f4413w0;
        this.f4371i = c1066g.f4409s0;
        this.f4372j = c1066g.f4414x0;
        this.f4373k = c1066g.f4410t0;
        this.f4379q = i3;
    }

    /* JADX INFO: renamed from: a */
    public final void m2633a(C1063d c1063d) {
        int i2 = this.f4363a;
        C1066g c1066g = this.f4380r;
        if (i2 == 0) {
            int iM2641U = c1066g.m2641U(c1063d, this.f4379q);
            if (c1063d.f4330p0[0] == 3) {
                this.f4378p++;
                iM2641U = 0;
            }
            this.f4374l = iM2641U + (c1063d.f4312g0 != 8 ? c1066g.f4396P0 : 0) + this.f4374l;
            int iM2640T = c1066g.m2640T(c1063d, this.f4379q);
            if (this.f4364b == null || this.f4365c < iM2640T) {
                this.f4364b = c1063d;
                this.f4365c = iM2640T;
                this.f4375m = iM2640T;
            }
        } else {
            int iM2641U2 = c1066g.m2641U(c1063d, this.f4379q);
            int iM2640T2 = c1066g.m2640T(c1063d, this.f4379q);
            if (c1063d.f4330p0[1] == 3) {
                this.f4378p++;
                iM2640T2 = 0;
            }
            this.f4375m = iM2640T2 + (c1063d.f4312g0 != 8 ? c1066g.f4397Q0 : 0) + this.f4375m;
            if (this.f4364b == null || this.f4365c < iM2641U2) {
                this.f4364b = c1063d;
                this.f4365c = iM2641U2;
                this.f4374l = iM2641U2;
            }
        }
        this.f4377o++;
    }

    /* JADX INFO: renamed from: b */
    public final void m2634b(int i2, boolean z2, boolean z3) {
        C1066g c1066g;
        int i3;
        C1063d c1063d;
        boolean z4;
        float f;
        float f2;
        int i4;
        float f3;
        float f4;
        int i5;
        int i6 = this.f4377o;
        int i7 = 0;
        while (true) {
            c1066g = this.f4380r;
            if (i7 >= i6 || (i5 = this.f4376n + i7) >= c1066g.f4408b1) {
                break;
            }
            C1063d c1063d2 = c1066g.f4407a1[i5];
            if (c1063d2 != null) {
                c1063d2.m2593D();
            }
            i7++;
        }
        if (i6 == 0 || this.f4364b == null) {
            return;
        }
        boolean z5 = z3 && i2 == 0;
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = this.f4376n + (z2 ? (i6 - 1) - i10 : i10);
            if (i11 >= c1066g.f4408b1) {
                break;
            }
            C1063d c1063d3 = c1066g.f4407a1[i11];
            if (c1063d3 != null && c1063d3.f4312g0 == 0) {
                if (i8 == -1) {
                    i8 = i10;
                }
                i9 = i10;
            }
        }
        if (this.f4363a != 0) {
            boolean z6 = z5;
            C1063d c1063d4 = this.f4364b;
            c1063d4.f4316i0 = c1066g.f4384D0;
            int i12 = this.f4370h;
            if (i2 > 0) {
                i12 += c1066g.f4396P0;
            }
            C1062c c1062c = c1063d4.f4281I;
            C1062c c1062c2 = c1063d4.f4283K;
            if (z2) {
                c1062c2.m2576a(this.f4368f, i12);
                if (z3) {
                    c1062c.m2576a(this.f4366d, this.f4372j);
                }
                if (i2 > 0) {
                    this.f4368f.f4267d.f4281I.m2576a(c1062c2, 0);
                }
            } else {
                c1062c.m2576a(this.f4366d, i12);
                if (z3) {
                    c1062c2.m2576a(this.f4368f, this.f4372j);
                }
                if (i2 > 0) {
                    this.f4366d.f4267d.f4283K.m2576a(c1062c, 0);
                }
            }
            C1063d c1063d5 = null;
            for (int i13 = 0; i13 < i6; i13++) {
                int i14 = this.f4376n + i13;
                if (i14 >= c1066g.f4408b1) {
                    return;
                }
                C1063d c1063d6 = c1066g.f4407a1[i14];
                if (c1063d6 != null) {
                    C1062c c1062c3 = c1063d6.f4282J;
                    if (i13 == 0) {
                        c1063d6.m2608f(c1062c3, this.f4367e, this.f4371i);
                        int i15 = c1066g.f4385E0;
                        float f5 = c1066g.f4391K0;
                        if (this.f4376n == 0) {
                            int i16 = c1066g.f4387G0;
                            i3 = -1;
                            if (i16 != -1) {
                                f5 = c1066g.f4393M0;
                            }
                            i15 = i16;
                            c1063d6.f4318j0 = i15;
                            c1063d6.f4308e0 = f5;
                        } else {
                            i3 = -1;
                        }
                        if (z3 && (i16 = c1066g.f4389I0) != i3) {
                            f5 = c1066g.f4395O0;
                            i15 = i16;
                        }
                        c1063d6.f4318j0 = i15;
                        c1063d6.f4308e0 = f5;
                    }
                    if (i13 == i6 - 1) {
                        c1063d6.m2608f(c1063d6.f4284L, this.f4369g, this.f4373k);
                    }
                    if (c1063d5 != null) {
                        int i17 = c1066g.f4397Q0;
                        C1062c c1062c4 = c1063d5.f4284L;
                        c1062c3.m2576a(c1062c4, i17);
                        if (i13 == i8) {
                            int i18 = this.f4371i;
                            if (c1062c3.m2583h()) {
                                c1062c3.f4271h = i18;
                            }
                        }
                        c1062c4.m2576a(c1062c3, 0);
                        if (i13 == i9 + 1) {
                            int i19 = this.f4373k;
                            if (c1062c4.m2583h()) {
                                c1062c4.f4271h = i19;
                            }
                        }
                    }
                    if (c1063d6 != c1063d4) {
                        C1062c c1062c5 = c1063d6.f4283K;
                        C1062c c1062c6 = c1063d6.f4281I;
                        if (z2) {
                            int i20 = c1066g.f4398R0;
                            if (i20 == 0) {
                                c1062c5.m2576a(c1062c2, 0);
                            } else if (i20 == 1) {
                                c1062c6.m2576a(c1062c, 0);
                            } else if (i20 == 2) {
                                c1062c6.m2576a(c1062c, 0);
                                c1062c5.m2576a(c1062c2, 0);
                            }
                            c1063d5 = c1063d6;
                        } else {
                            int i21 = c1066g.f4398R0;
                            if (i21 == 0) {
                                c1062c6.m2576a(c1062c, 0);
                            } else if (i21 == 1) {
                                c1062c5.m2576a(c1062c2, 0);
                            } else if (i21 == 2) {
                                if (z6) {
                                    c1062c6.m2576a(this.f4366d, this.f4370h);
                                    c1062c5.m2576a(this.f4368f, this.f4372j);
                                } else {
                                    c1062c6.m2576a(c1062c, 0);
                                    c1062c5.m2576a(c1062c2, 0);
                                }
                            }
                            c1063d5 = c1063d6;
                        }
                    } else {
                        c1063d5 = c1063d6;
                    }
                }
            }
            return;
        }
        C1063d c1063d7 = this.f4364b;
        c1063d7.f4318j0 = c1066g.f4385E0;
        int i22 = this.f4371i;
        if (i2 > 0) {
            i22 += c1066g.f4397Q0;
        }
        C1062c c1062c7 = this.f4367e;
        C1062c c1062c8 = c1063d7.f4282J;
        c1062c8.m2576a(c1062c7, i22);
        C1062c c1062c9 = c1063d7.f4284L;
        if (z3) {
            c1062c9.m2576a(this.f4369g, this.f4373k);
        }
        if (i2 > 0) {
            this.f4367e.f4267d.f4284L.m2576a(c1062c8, 0);
        }
        if (c1066g.f4399S0 != 3 || c1063d7.f4277E) {
            c1063d = c1063d7;
        } else {
            for (int i23 = 0; i23 < i6; i23++) {
                int i24 = this.f4376n + (z2 ? (i6 - 1) - i23 : i23);
                if (i24 >= c1066g.f4408b1) {
                    break;
                }
                c1063d = c1066g.f4407a1[i24];
                if (c1063d.f4277E) {
                    break;
                }
            }
            c1063d = c1063d7;
        }
        C1063d c1063d8 = null;
        int i25 = 0;
        while (i25 < i6) {
            int i26 = z2 ? (i6 - 1) - i25 : i25;
            int i27 = this.f4376n + i26;
            if (i27 >= c1066g.f4408b1) {
                return;
            }
            C1063d c1063d9 = c1066g.f4407a1[i27];
            if (c1063d9 == null) {
                z4 = z5;
            } else {
                C1062c c1062c10 = c1063d9.f4281I;
                if (i25 == 0) {
                    c1063d9.m2608f(c1062c10, this.f4366d, this.f4370h);
                }
                if (i26 == 0) {
                    int i28 = c1066g.f4384D0;
                    if (z2) {
                        f = 1.0f;
                        f2 = 1.0f - c1066g.f4390J0;
                    } else {
                        f = 1.0f;
                        f2 = c1066g.f4390J0;
                    }
                    if (this.f4376n == 0) {
                        i4 = c1066g.f4386F0;
                        z4 = z5;
                        if (i4 != -1) {
                            if (z2) {
                                f4 = c1066g.f4392L0;
                                f2 = f - f4;
                            } else {
                                f3 = c1066g.f4392L0;
                                f2 = f3;
                            }
                        }
                        c1063d9.f4316i0 = i4;
                        c1063d9.f4306d0 = f2;
                    } else {
                        z4 = z5;
                    }
                    if (!z3 || (i4 = c1066g.f4388H0) == -1) {
                        i4 = i28;
                        c1063d9.f4316i0 = i4;
                        c1063d9.f4306d0 = f2;
                    } else if (z2) {
                        f4 = c1066g.f4394N0;
                        f2 = f - f4;
                        c1063d9.f4316i0 = i4;
                        c1063d9.f4306d0 = f2;
                    } else {
                        f3 = c1066g.f4394N0;
                        f2 = f3;
                        c1063d9.f4316i0 = i4;
                        c1063d9.f4306d0 = f2;
                    }
                } else {
                    z4 = z5;
                }
                if (i25 == i6 - 1) {
                    c1063d9.m2608f(c1063d9.f4283K, this.f4368f, this.f4372j);
                }
                if (c1063d8 != null) {
                    int i29 = c1066g.f4396P0;
                    C1062c c1062c11 = c1063d8.f4283K;
                    c1062c10.m2576a(c1062c11, i29);
                    if (i25 == i8) {
                        int i30 = this.f4370h;
                        if (c1062c10.m2583h()) {
                            c1062c10.f4271h = i30;
                        }
                    }
                    c1062c11.m2576a(c1062c10, 0);
                    if (i25 == i9 + 1) {
                        int i31 = this.f4372j;
                        if (c1062c11.m2583h()) {
                            c1062c11.f4271h = i31;
                        }
                    }
                }
                if (c1063d9 != c1063d7) {
                    int i32 = c1066g.f4399S0;
                    if (i32 == 3 && c1063d.f4277E && c1063d9 != c1063d && c1063d9.f4277E) {
                        c1063d9.f4285M.m2576a(c1063d.f4285M, 0);
                    } else {
                        C1062c c1062c12 = c1063d9.f4282J;
                        if (i32 != 0) {
                            C1062c c1062c13 = c1063d9.f4284L;
                            if (i32 == 1) {
                                c1062c13.m2576a(c1062c9, 0);
                            } else if (z4) {
                                c1062c12.m2576a(this.f4367e, this.f4371i);
                                c1062c13.m2576a(this.f4369g, this.f4373k);
                            } else {
                                c1062c12.m2576a(c1062c8, 0);
                                c1062c13.m2576a(c1062c9, 0);
                            }
                        } else {
                            c1062c12.m2576a(c1062c8, 0);
                        }
                    }
                }
                c1063d8 = c1063d9;
            }
            i25++;
            z5 = z4;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m2635c() {
        return this.f4363a == 1 ? this.f4375m - this.f4380r.f4397Q0 : this.f4375m;
    }

    /* JADX INFO: renamed from: d */
    public final int m2636d() {
        return this.f4363a == 0 ? this.f4374l - this.f4380r.f4396P0 : this.f4374l;
    }

    /* JADX INFO: renamed from: e */
    public final void m2637e(int i2) {
        C1066g c1066g;
        int i3;
        int i4 = this.f4378p;
        if (i4 == 0) {
            return;
        }
        int i5 = this.f4377o;
        int i6 = i2 / i4;
        int i7 = 0;
        while (true) {
            c1066g = this.f4380r;
            if (i7 >= i5 || (i3 = this.f4376n + i7) >= c1066g.f4408b1) {
                break;
            }
            C1063d c1063d = c1066g.f4407a1[i3];
            if (this.f4363a == 0) {
                if (c1063d != null) {
                    int[] iArr = c1063d.f4330p0;
                    if (iArr[0] == 3 && c1063d.f4332r == 0) {
                        c1066g.m2642V(1, i6, iArr[1], c1063d.m2613k(), c1063d);
                    }
                }
            } else if (c1063d != null) {
                int[] iArr2 = c1063d.f4330p0;
                if (iArr2[1] == 3 && c1063d.f4333s == 0) {
                    int i8 = iArr2[0];
                    int i9 = i6;
                    c1066g.m2642V(i8, c1063d.m2617q(), 1, i9, c1063d);
                    i6 = i9;
                }
            }
            i7++;
        }
        this.f4374l = 0;
        this.f4375m = 0;
        this.f4364b = null;
        this.f4365c = 0;
        int i10 = this.f4377o;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f4376n + i11;
            if (i12 >= c1066g.f4408b1) {
                return;
            }
            C1063d c1063d2 = c1066g.f4407a1[i12];
            if (this.f4363a == 0) {
                int iM2617q = c1063d2.m2617q();
                int i13 = c1066g.f4396P0;
                if (c1063d2.f4312g0 == 8) {
                    i13 = 0;
                }
                this.f4374l = iM2617q + i13 + this.f4374l;
                int iM2640T = c1066g.m2640T(c1063d2, this.f4379q);
                if (this.f4364b == null || this.f4365c < iM2640T) {
                    this.f4364b = c1063d2;
                    this.f4365c = iM2640T;
                    this.f4375m = iM2640T;
                }
            } else {
                int iM2641U = c1066g.m2641U(c1063d2, this.f4379q);
                int iM2640T2 = c1066g.m2640T(c1063d2, this.f4379q);
                int i14 = c1066g.f4397Q0;
                if (c1063d2.f4312g0 == 8) {
                    i14 = 0;
                }
                this.f4375m = iM2640T2 + i14 + this.f4375m;
                if (this.f4364b == null || this.f4365c < iM2641U) {
                    this.f4364b = c1063d2;
                    this.f4365c = iM2641U;
                    this.f4374l = iM2641U;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2638f(int i2, C1062c c1062c, C1062c c1062c2, C1062c c1062c3, C1062c c1062c4, int i3, int i4, int i5, int i6, int i7) {
        this.f4363a = i2;
        this.f4366d = c1062c;
        this.f4367e = c1062c2;
        this.f4368f = c1062c3;
        this.f4369g = c1062c4;
        this.f4370h = i3;
        this.f4371i = i4;
        this.f4372j = i5;
        this.f4373k = i6;
        this.f4379q = i7;
    }
}
