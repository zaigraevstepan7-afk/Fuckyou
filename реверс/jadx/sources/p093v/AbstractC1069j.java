package p093v;

import java.util.ArrayList;
import p089t.C1045b;
import p089t.C1046c;
import p089t.C1049f;

/* JADX INFO: renamed from: v.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1069j {

    /* JADX INFO: renamed from: a */
    public static final boolean[] f4425a = new boolean[3];

    /* JADX WARN: Removed duplicated region for block: B:189:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0675 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x06c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x06dc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2646a(C1064e c1064e, C1046c c1046c, ArrayList arrayList, int i2) {
        int i3;
        C1061b[] c1061bArr;
        int i4;
        int i5;
        float f;
        float f2;
        boolean z2;
        C1063d c1063d;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C1062c[] c1062cArr;
        int i6;
        C1061b[] c1061bArr2;
        C1063d c1063d2;
        C1046c c1046c2;
        C1049f c1049f;
        C1062c c1062c;
        C1049f c1049f2;
        C1063d c1063d3;
        C1062c c1062c2;
        C1049f c1049f3;
        C1063d c1063d4;
        C1063d c1063d5;
        int i7;
        C1049f c1049f4;
        int size;
        float f3;
        ArrayList arrayList2;
        int i8;
        float f4;
        C1063d c1063d6;
        int i9;
        C1061b[] c1061bArr3;
        int i10;
        C1063d c1063d7;
        int i11;
        int i12;
        int i13;
        C1063d c1063d8;
        C1064e c1064e2 = c1064e;
        C1046c c1046c3 = c1046c;
        ArrayList arrayList3 = arrayList;
        if (i2 == 0) {
            i3 = c1064e2.f4362z0;
            c1061bArr = c1064e2.f4343C0;
            i4 = 0;
        } else {
            i3 = c1064e2.f4341A0;
            c1061bArr = c1064e2.f4342B0;
            i4 = 2;
        }
        int i14 = i3;
        C1061b[] c1061bArr4 = c1061bArr;
        int i15 = 0;
        while (i15 < i14) {
            C1061b c1061b = c1061bArr4[i15];
            boolean z7 = c1061b.f4263q;
            C1063d c1063d9 = c1061b.f4247a;
            int i16 = 3;
            int i17 = 8;
            if (z7) {
                i5 = i15;
                f = 0.0f;
            } else {
                int i18 = c1061b.f4258l;
                int i19 = i18 * 2;
                C1063d c1063d10 = c1063d9;
                C1063d c1063d11 = c1063d10;
                boolean z8 = false;
                f = 0.0f;
                while (!z8) {
                    c1061b.f4255i++;
                    c1063d10.f4324m0[i18] = null;
                    c1063d10.f4322l0[i18] = null;
                    int i20 = c1063d10.f4312g0;
                    C1062c[] c1062cArr2 = c1063d10.f4289Q;
                    if (i20 != i17) {
                        c1063d10.m2612j(i18);
                        c1062cArr2[i19].m2580e();
                        int i21 = i19 + 1;
                        c1062cArr2[i21].m2580e();
                        c1062cArr2[i19].m2580e();
                        c1062cArr2[i21].m2580e();
                        if (c1061b.f4248b == null) {
                            c1061b.f4248b = c1063d10;
                        }
                        c1061b.f4250d = c1063d10;
                        int i22 = c1063d10.f4330p0[i18];
                        if (i22 == i16) {
                            int i23 = c1063d10.f4334t[i18];
                            if (i23 == 0 || i23 == i16 || i23 == 2) {
                                c1061b.f4256j++;
                                float f5 = c1063d10.f4320k0[i18];
                                if (f5 > 0.0f) {
                                    i12 = i15;
                                    c1061b.f4257k += f5;
                                } else {
                                    i12 = i15;
                                }
                                i13 = i18;
                                if (c1063d10.f4312g0 != 8 && i22 == 3 && (i23 == 0 || i23 == 3)) {
                                    if (f5 < 0.0f) {
                                        c1061b.f4260n = true;
                                    } else {
                                        c1061b.f4261o = true;
                                    }
                                    if (c1061b.f4254h == null) {
                                        c1061b.f4254h = new ArrayList();
                                    }
                                    c1061b.f4254h.add(c1063d10);
                                }
                                if (c1061b.f4252f == null) {
                                    c1061b.f4252f = c1063d10;
                                }
                                C1063d c1063d12 = c1061b.f4253g;
                                if (c1063d12 != null) {
                                    c1063d12.f4322l0[i13] = c1063d10;
                                }
                                c1061b.f4253g = c1063d10;
                            } else {
                                i12 = i15;
                                i13 = i18;
                            }
                            if (i13 == 0) {
                                if (c1063d10.f4332r == 0 && c1063d10.f4335u == 0) {
                                    int i24 = c1063d10.f4336v;
                                }
                            } else if (c1063d10.f4333s == 0 && c1063d10.f4338x == 0) {
                                int i25 = c1063d10.f4339y;
                            }
                        } else {
                            i12 = i15;
                            i13 = i18;
                        }
                    }
                    if (c1063d11 != c1063d10) {
                        c1063d11.f4324m0[i13] = c1063d10;
                    }
                    C1062c c1062c3 = c1062cArr2[i19 + 1].f4269f;
                    if (c1062c3 != null) {
                        c1063d8 = c1062c3.f4267d;
                        C1062c c1062c4 = c1063d8.f4289Q[i19].f4269f;
                        if (c1062c4 == null || c1062c4.f4267d != c1063d10) {
                            c1063d8 = null;
                        }
                    }
                    if (c1063d8 == null) {
                        c1063d8 = c1063d10;
                        z8 = true;
                    }
                    c1063d11 = c1063d10;
                    i18 = i13;
                    i16 = 3;
                    i17 = 8;
                    c1063d10 = c1063d8;
                    i15 = i12;
                }
                i5 = i15;
                int i26 = i18;
                C1063d c1063d13 = c1061b.f4248b;
                if (c1063d13 != null) {
                    c1063d13.f4289Q[i19].m2580e();
                }
                C1063d c1063d14 = c1061b.f4250d;
                if (c1063d14 != null) {
                    c1063d14.f4289Q[i19 + 1].m2580e();
                }
                c1061b.f4249c = c1063d10;
                if (i26 == 0 && c1061b.f4259m) {
                    c1061b.f4251e = c1063d10;
                } else {
                    c1061b.f4251e = c1063d9;
                }
                c1061b.f4262p = c1061b.f4261o && c1061b.f4260n;
            }
            c1061b.f4263q = true;
            if (arrayList3 == null || arrayList3.contains(c1063d9)) {
                C1063d c1063d15 = c1061b.f4249c;
                C1063d c1063d16 = c1061b.f4248b;
                C1063d c1063d17 = c1061b.f4250d;
                C1063d c1063d18 = c1061b.f4251e;
                float f6 = c1061b.f4257k;
                boolean z9 = c1064e2.f4330p0[i2] == 2;
                if (i2 == 0) {
                    int i27 = c1063d18.f4316i0;
                    boolean z10 = i27 == 0;
                    boolean z11 = i27 == 1;
                    z2 = i27 == 2;
                    z3 = z9;
                    z5 = z11;
                    z4 = z10;
                    z6 = false;
                    f2 = f6;
                    c1063d = c1063d9;
                } else {
                    int i28 = c1063d18.f4318j0;
                    boolean z12 = i28 == 0;
                    boolean z13 = i28 == 1;
                    f2 = f6;
                    z2 = i28 == 2;
                    c1063d = c1063d9;
                    z3 = z9;
                    z4 = z12;
                    z5 = z13;
                    z6 = false;
                }
                while (true) {
                    c1062cArr = c1064e2.f4289Q;
                    if (z6) {
                        break;
                    }
                    C1062c c1062c5 = c1063d.f4289Q[i4];
                    int i29 = z2 ? 1 : 4;
                    int iM2580e = c1062c5.m2580e();
                    boolean z14 = z6;
                    int[] iArr = c1063d.f4330p0;
                    boolean z15 = z2;
                    boolean z16 = iArr[i2] == 3 && c1063d.f4334t[i2] == 0;
                    C1062c c1062c6 = c1062c5.f4269f;
                    if (c1062c6 != null && c1063d != c1063d9) {
                        iM2580e = c1062c6.m2580e() + iM2580e;
                    }
                    int i30 = iM2580e;
                    if (z15 && c1063d != c1063d9 && c1063d != c1063d16) {
                        i29 = 8;
                    }
                    boolean z17 = z16;
                    C1062c c1062c7 = c1062c5.f4269f;
                    if (c1062c7 != null) {
                        if (c1063d == c1063d16) {
                            i10 = i14;
                            c1046c3.m2529f(c1062c5.f4272i, c1062c7.f4272i, i30, 6);
                        } else {
                            i10 = i14;
                            c1046c3.m2529f(c1062c5.f4272i, c1062c7.f4272i, i30, 8);
                        }
                        if (z17 && !z15) {
                            i29 = 5;
                        }
                        c1046c3.m2528e(c1062c5.f4272i, c1062c5.f4269f.f4272i, i30, (c1063d == c1063d16 && z15 && c1063d.f4291S[i2]) ? 5 : i29);
                    } else {
                        i10 = i14;
                    }
                    C1062c[] c1062cArr3 = c1063d.f4289Q;
                    if (z3) {
                        if (c1063d.f4312g0 == 8 || iArr[i2] != 3) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                            c1046c3.m2529f(c1062cArr3[i4 + 1].f4272i, c1062cArr3[i4].f4272i, 0, 5);
                        }
                        c1046c3.m2529f(c1062cArr3[i4].f4272i, c1062cArr[i4].f4272i, i11, 8);
                    }
                    C1062c c1062c8 = c1062cArr3[i4 + 1].f4269f;
                    if (c1062c8 != null) {
                        c1063d7 = c1062c8.f4267d;
                        C1062c c1062c9 = c1063d7.f4289Q[i4].f4269f;
                        if (c1062c9 == null || c1062c9.f4267d != c1063d) {
                            c1063d7 = null;
                        }
                    }
                    if (c1063d7 != null) {
                        c1063d = c1063d7;
                        z6 = z14;
                    } else {
                        z6 = true;
                    }
                    z2 = z15;
                    i14 = i10;
                }
                boolean z18 = z2;
                i6 = i14;
                if (c1063d17 != null) {
                    int i31 = i4 + 1;
                    if (c1063d15.f4289Q[i31].f4269f != null) {
                        C1062c c1062c10 = c1063d17.f4289Q[i31];
                        if (c1063d17.f4330p0[i2] == 3 && c1063d17.f4334t[i2] == 0 && !z18) {
                            C1062c c1062c11 = c1062c10.f4269f;
                            if (c1062c11.f4267d == c1064e2) {
                                c1046c3.m2528e(c1062c10.f4272i, c1062c11.f4272i, -c1062c10.m2580e(), 5);
                            }
                            c1046c3.m2530g(c1062c10.f4272i, c1063d15.f4289Q[i31].f4269f.f4272i, -c1062c10.m2580e(), 6);
                        } else {
                            if (z18) {
                                C1062c c1062c12 = c1062c10.f4269f;
                                if (c1062c12.f4267d == c1064e2) {
                                    c1046c3.m2528e(c1062c10.f4272i, c1062c12.f4272i, -c1062c10.m2580e(), 4);
                                }
                            }
                            c1046c3.m2530g(c1062c10.f4272i, c1063d15.f4289Q[i31].f4269f.f4272i, -c1062c10.m2580e(), 6);
                        }
                    }
                }
                if (z3) {
                    int i32 = i4 + 1;
                    C1049f c1049f5 = c1062cArr[i32].f4272i;
                    C1062c c1062c13 = c1063d15.f4289Q[i32];
                    c1046c3.m2529f(c1049f5, c1062c13.f4272i, c1062c13.m2580e(), 8);
                }
                ArrayList arrayList4 = c1061b.f4254h;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    if (c1061b.f4260n && !c1061b.f4262p) {
                        f2 = c1061b.f4256j;
                    }
                    C1063d c1063d19 = null;
                    int i33 = 0;
                    float f7 = 0.0f;
                    while (i33 < size) {
                        C1063d c1063d20 = (C1063d) arrayList4.get(i33);
                        float f8 = c1063d20.f4320k0[i2];
                        C1062c[] c1062cArr4 = c1063d20.f4289Q;
                        if (f8 >= f) {
                            f3 = f8;
                        } else if (c1061b.f4262p) {
                            arrayList2 = arrayList4;
                            i8 = size;
                            c1046c3.m2528e(c1062cArr4[i4 + 1].f4272i, c1062cArr4[i4].f4272i, 0, 4);
                            i9 = i33;
                            c1061bArr3 = c1061bArr4;
                            i33 = i9 + 1;
                            c1061bArr4 = c1061bArr3;
                            arrayList4 = arrayList2;
                            size = i8;
                        } else {
                            f3 = 1.0f;
                        }
                        arrayList2 = arrayList4;
                        i8 = size;
                        if (f3 == f) {
                            c1046c3.m2528e(c1062cArr4[i4 + 1].f4272i, c1062cArr4[i4].f4272i, 0, 8);
                            i9 = i33;
                            c1061bArr3 = c1061bArr4;
                            i33 = i9 + 1;
                            c1061bArr4 = c1061bArr3;
                            arrayList4 = arrayList2;
                            size = i8;
                        } else {
                            if (c1063d19 != null) {
                                C1062c[] c1062cArr5 = c1063d19.f4289Q;
                                C1049f c1049f6 = c1062cArr5[i4].f4272i;
                                int i34 = i4 + 1;
                                C1049f c1049f7 = c1062cArr5[i34].f4272i;
                                f4 = f3;
                                C1049f c1049f8 = c1062cArr4[i4].f4272i;
                                C1049f c1049f9 = c1062cArr4[i34].f4272i;
                                c1063d6 = c1063d20;
                                C1045b c1045bM2535l = c1046c3.m2535l();
                                i9 = i33;
                                c1045bM2535l.f4149b = 0.0f;
                                f = 0.0f;
                                if (f2 == 0.0f || f7 == f4) {
                                    c1061bArr3 = c1061bArr4;
                                    c1045bM2535l.f4151d.m2512g(c1049f6, 1.0f);
                                    c1045bM2535l.f4151d.m2512g(c1049f7, -1.0f);
                                    c1045bM2535l.f4151d.m2512g(c1049f9, 1.0f);
                                    c1045bM2535l.f4151d.m2512g(c1049f8, -1.0f);
                                } else {
                                    if (f7 == 0.0f) {
                                        c1045bM2535l.f4151d.m2512g(c1049f6, 1.0f);
                                        c1045bM2535l.f4151d.m2512g(c1049f7, -1.0f);
                                    } else if (f3 == f) {
                                        c1045bM2535l.f4151d.m2512g(c1049f8, 1.0f);
                                        c1045bM2535l.f4151d.m2512g(c1049f9, -1.0f);
                                    } else {
                                        float f9 = (f7 / f2) / (f4 / f2);
                                        c1061bArr3 = c1061bArr4;
                                        c1045bM2535l.f4151d.m2512g(c1049f6, 1.0f);
                                        c1045bM2535l.f4151d.m2512g(c1049f7, -1.0f);
                                        c1045bM2535l.f4151d.m2512g(c1049f9, f9);
                                        c1045bM2535l.f4151d.m2512g(c1049f8, -f9);
                                    }
                                    c1061bArr3 = c1061bArr4;
                                }
                                c1046c3.m2526c(c1045bM2535l);
                            } else {
                                f4 = f3;
                                c1063d6 = c1063d20;
                                i9 = i33;
                                c1061bArr3 = c1061bArr4;
                            }
                            c1063d19 = c1063d6;
                            f7 = f4;
                            i33 = i9 + 1;
                            c1061bArr4 = c1061bArr3;
                            arrayList4 = arrayList2;
                            size = i8;
                        }
                    }
                }
                c1061bArr2 = c1061bArr4;
                if (c1063d16 == null || !(c1063d16 == c1063d17 || z18)) {
                    c1063d2 = c1063d17;
                    if (!z4 || c1063d16 == null) {
                        if (z5 && c1063d16 != null) {
                            int i35 = c1061b.f4256j;
                            boolean z19 = i35 > 0 && c1061b.f4255i == i35;
                            C1063d c1063d21 = c1063d16;
                            C1063d c1063d22 = c1063d21;
                            while (c1063d21 != null) {
                                C1063d c1063d23 = c1063d21.f4324m0[i2];
                                while (c1063d23 != null && c1063d23.f4312g0 == 8) {
                                    c1063d23 = c1063d23.f4324m0[i2];
                                }
                                if (c1063d21 != c1063d16 && c1063d21 != c1063d2 && c1063d23 != null) {
                                    if (c1063d23 == c1063d2) {
                                        c1063d23 = null;
                                    }
                                    C1062c[] c1062cArr6 = c1063d21.f4289Q;
                                    C1062c c1062c14 = c1062cArr6[i4];
                                    C1049f c1049f10 = c1062c14.f4272i;
                                    int i36 = i4 + 1;
                                    C1049f c1049f11 = c1063d22.f4289Q[i36].f4272i;
                                    int iM2580e2 = c1062c14.m2580e();
                                    int iM2580e3 = c1062cArr6[i36].m2580e();
                                    if (c1063d23 != null) {
                                        c1062c = c1063d23.f4289Q[i4];
                                        c1049f2 = c1062c.f4272i;
                                        C1062c c1062c15 = c1062c.f4269f;
                                        c1049f = c1062c15 != null ? c1062c15.f4272i : null;
                                    } else {
                                        C1062c c1062c16 = c1063d2.f4289Q[i4];
                                        C1049f c1049f12 = c1062c16 != null ? c1062c16.f4272i : null;
                                        c1049f = c1062cArr6[i36].f4272i;
                                        c1062c = c1062c16;
                                        c1049f2 = c1049f12;
                                    }
                                    if (c1062c != null) {
                                        iM2580e3 += c1062c.m2580e();
                                    }
                                    int iM2580e4 = c1063d22.f4289Q[i36].m2580e() + iM2580e2;
                                    C1049f c1049f13 = c1049f2;
                                    int i37 = iM2580e3;
                                    C1049f c1049f14 = c1049f;
                                    int i38 = z19 ? 8 : 4;
                                    if (c1049f10 == null || c1049f11 == null || c1049f13 == null || c1049f14 == null) {
                                        c1063d3 = c1063d23;
                                    } else {
                                        c1063d3 = c1063d23;
                                        c1046c.m2525b(c1049f10, c1049f11, iM2580e4, 0.5f, c1049f13, c1049f14, i37, i38);
                                    }
                                    c1063d23 = c1063d3;
                                }
                                if (c1063d21.f4312g0 != 8) {
                                    c1063d22 = c1063d21;
                                }
                                c1063d21 = c1063d23;
                            }
                            C1062c c1062c17 = c1063d16.f4289Q[i4];
                            C1062c c1062c18 = c1063d9.f4289Q[i4].f4269f;
                            int i39 = i4 + 1;
                            C1062c c1062c19 = c1063d2.f4289Q[i39];
                            C1062c c1062c20 = c1063d15.f4289Q[i39].f4269f;
                            if (c1062c18 == null) {
                                c1046c2 = c1046c;
                                if (c1062c20 != null && c1063d16 != c1063d2) {
                                    c1046c2.m2528e(c1062c19.f4272i, c1062c20.f4272i, -c1062c19.m2580e(), 5);
                                }
                            } else {
                                if (c1063d16 != c1063d2) {
                                    c1046c.m2528e(c1062c17.f4272i, c1062c18.f4272i, c1062c17.m2580e(), 5);
                                } else {
                                    if (c1062c20 != null) {
                                        c1046c2 = c1046c;
                                        c1046c2.m2525b(c1062c17.f4272i, c1062c18.f4272i, c1062c17.m2580e(), 0.5f, c1062c19.f4272i, c1062c20.f4272i, c1062c19.m2580e(), 5);
                                    }
                                    if (c1062c20 != null) {
                                        c1046c2.m2528e(c1062c19.f4272i, c1062c20.f4272i, -c1062c19.m2580e(), 5);
                                    }
                                }
                                c1046c2 = c1046c;
                                if (c1062c20 != null) {
                                }
                            }
                        }
                        if ((z4 || z5) && c1063d16 != null && c1063d16 != c1063d2) {
                            C1062c[] c1062cArr7 = c1063d16.f4289Q;
                            C1062c c1062c21 = c1062cArr7[i4];
                            if (c1063d2 == null) {
                                c1063d2 = c1063d16;
                            }
                            int i40 = i4 + 1;
                            C1062c[] c1062cArr8 = c1063d2.f4289Q;
                            C1062c c1062c22 = c1062cArr8[i40];
                            C1062c c1062c23 = c1062c21.f4269f;
                            c1049f4 = c1062c23 != null ? c1062c23.f4272i : null;
                            C1062c c1062c24 = c1062c22.f4269f;
                            C1049f c1049f15 = c1062c24 != null ? c1062c24.f4272i : null;
                            if (c1063d15 != c1063d2) {
                                C1062c c1062c25 = c1063d15.f4289Q[i40].f4269f;
                                c1049f15 = c1062c25 != null ? c1062c25.f4272i : null;
                            }
                            if (c1063d16 == c1063d2) {
                                c1062c22 = c1062cArr7[i40];
                            }
                            if (c1049f4 != null && c1049f15 != null) {
                                c1046c2.m2525b(c1062c21.f4272i, c1049f4, c1062c21.m2580e(), 0.5f, c1049f15, c1062c22.f4272i, c1062cArr8[i40].m2580e(), 5);
                            }
                        }
                    } else {
                        int i41 = c1061b.f4256j;
                        boolean z20 = i41 > 0 && c1061b.f4255i == i41;
                        C1063d c1063d24 = c1063d16;
                        C1063d c1063d25 = c1063d24;
                        while (c1063d24 != null) {
                            C1063d c1063d26 = c1063d24.f4324m0[i2];
                            while (c1063d26 != null && c1063d26.f4312g0 == 8) {
                                c1063d26 = c1063d26.f4324m0[i2];
                            }
                            if (c1063d26 != null || c1063d24 == c1063d2) {
                                C1062c[] c1062cArr9 = c1063d24.f4289Q;
                                C1062c c1062c26 = c1062cArr9[i4];
                                C1049f c1049f16 = c1062c26.f4272i;
                                C1062c c1062c27 = c1062c26.f4269f;
                                C1049f c1049f17 = c1062c27 != null ? c1062c27.f4272i : null;
                                if (c1063d25 != c1063d24) {
                                    c1049f17 = c1063d25.f4289Q[i4 + 1].f4272i;
                                } else if (c1063d24 == c1063d16) {
                                    C1062c c1062c28 = c1063d9.f4289Q[i4].f4269f;
                                    c1049f17 = c1062c28 != null ? c1062c28.f4272i : null;
                                }
                                int iM2580e5 = c1062c26.m2580e();
                                int i42 = i4 + 1;
                                int iM2580e6 = c1062cArr9[i42].m2580e();
                                if (c1063d26 != null) {
                                    c1062c2 = c1063d26.f4289Q[i4];
                                    c1049f3 = c1062c2.f4272i;
                                } else {
                                    c1062c2 = c1063d15.f4289Q[i42].f4269f;
                                    c1049f3 = c1062c2 != null ? c1062c2.f4272i : null;
                                }
                                C1049f c1049f18 = c1062cArr9[i42].f4272i;
                                if (c1062c2 != null) {
                                    iM2580e6 += c1062c2.m2580e();
                                }
                                int iM2580e7 = c1063d25.f4289Q[i42].m2580e() + iM2580e5;
                                if (c1049f16 == null || c1049f17 == null || c1049f3 == null || c1049f18 == null) {
                                    c1063d4 = c1063d9;
                                    c1063d5 = c1063d25;
                                    i7 = 8;
                                } else {
                                    if (c1063d24 == c1063d16) {
                                        iM2580e7 = c1063d16.f4289Q[i4].m2580e();
                                    }
                                    if (c1063d24 == c1063d2) {
                                        iM2580e6 = c1063d2.f4289Q[i42].m2580e();
                                    }
                                    c1063d4 = c1063d9;
                                    c1063d5 = c1063d25;
                                    i7 = 8;
                                    c1046c.m2525b(c1049f16, c1049f17, iM2580e7, 0.5f, c1049f3, c1049f18, iM2580e6, z20 ? 8 : 5);
                                }
                            }
                            if (c1063d24.f4312g0 != i7) {
                                c1063d5 = c1063d24;
                            }
                            c1063d24 = c1063d26;
                            c1063d25 = c1063d5;
                            c1063d9 = c1063d4;
                        }
                    }
                } else {
                    C1062c c1062c29 = c1063d9.f4289Q[i4];
                    int i43 = i4 + 1;
                    C1062c c1062c30 = c1063d15.f4289Q[i43];
                    C1062c c1062c31 = c1062c29.f4269f;
                    C1049f c1049f19 = c1062c31 != null ? c1062c31.f4272i : null;
                    C1062c c1062c32 = c1062c30.f4269f;
                    C1049f c1049f20 = c1062c32 != null ? c1062c32.f4272i : null;
                    C1062c c1062c33 = c1063d16.f4289Q[i4];
                    if (c1063d17 != null) {
                        c1062c30 = c1063d17.f4289Q[i43];
                    }
                    if (c1049f19 == null || c1049f20 == null) {
                        c1063d2 = c1063d17;
                    } else {
                        float f10 = i2 == 0 ? c1063d18.f4306d0 : c1063d18.f4308e0;
                        int iM2580e8 = c1062c33.m2580e();
                        int iM2580e9 = c1062c30.m2580e();
                        C1049f c1049f21 = c1062c33.f4272i;
                        C1049f c1049f22 = c1062c30.f4272i;
                        C1049f c1049f23 = c1049f19;
                        c1063d2 = c1063d17;
                        c1046c3.m2525b(c1049f21, c1049f23, iM2580e8, f10, c1049f20, c1049f22, iM2580e9, 7);
                    }
                }
                c1046c2 = c1046c;
                if (z4) {
                    C1062c[] c1062cArr72 = c1063d16.f4289Q;
                    C1062c c1062c212 = c1062cArr72[i4];
                    if (c1063d2 == null) {
                    }
                    int i402 = i4 + 1;
                    C1062c[] c1062cArr82 = c1063d2.f4289Q;
                    C1062c c1062c222 = c1062cArr82[i402];
                    C1062c c1062c232 = c1062c212.f4269f;
                    if (c1062c232 != null) {
                    }
                    C1062c c1062c242 = c1062c222.f4269f;
                    if (c1062c242 != null) {
                    }
                    if (c1063d15 != c1063d2) {
                    }
                    if (c1063d16 == c1063d2) {
                    }
                    if (c1049f4 != null) {
                    }
                } else {
                    C1062c[] c1062cArr722 = c1063d16.f4289Q;
                    C1062c c1062c2122 = c1062cArr722[i4];
                    if (c1063d2 == null) {
                    }
                    int i4022 = i4 + 1;
                    C1062c[] c1062cArr822 = c1063d2.f4289Q;
                    C1062c c1062c2222 = c1062cArr822[i4022];
                    C1062c c1062c2322 = c1062c2122.f4269f;
                    if (c1062c2322 != null) {
                    }
                    C1062c c1062c2422 = c1062c2222.f4269f;
                    if (c1062c2422 != null) {
                    }
                    if (c1063d15 != c1063d2) {
                    }
                    if (c1063d16 == c1063d2) {
                    }
                    if (c1049f4 != null) {
                    }
                }
            } else {
                i6 = i14;
                c1061bArr2 = c1061bArr4;
            }
            i15 = i5 + 1;
            c1064e2 = c1064e;
            c1046c3 = c1046c;
            arrayList3 = arrayList;
            c1061bArr4 = c1061bArr2;
            i14 = i6;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2647b(C1064e c1064e, C1046c c1046c, C1063d c1063d) {
        c1063d.f4327o = -1;
        c1063d.f4329p = -1;
        int i2 = c1064e.f4330p0[0];
        int[] iArr = c1063d.f4330p0;
        if (i2 != 2 && iArr[0] == 4) {
            C1062c c1062c = c1063d.f4281I;
            int i3 = c1062c.f4270g;
            int iM2617q = c1064e.m2617q();
            C1062c c1062c2 = c1063d.f4283K;
            int i4 = iM2617q - c1062c2.f4270g;
            c1062c.f4272i = c1046c.m2534k(c1062c);
            c1062c2.f4272i = c1046c.m2534k(c1062c2);
            c1046c.m2527d(c1062c.f4272i, i3);
            c1046c.m2527d(c1062c2.f4272i, i4);
            c1063d.f4327o = 2;
            c1063d.f4297Y = i3;
            int i5 = i4 - i3;
            c1063d.f4293U = i5;
            int i6 = c1063d.f4302b0;
            if (i5 < i6) {
                c1063d.f4293U = i6;
            }
        }
        if (c1064e.f4330p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C1062c c1062c3 = c1063d.f4282J;
        int i7 = c1062c3.f4270g;
        int iM2613k = c1064e.m2613k();
        C1062c c1062c4 = c1063d.f4284L;
        int i8 = iM2613k - c1062c4.f4270g;
        c1062c3.f4272i = c1046c.m2534k(c1062c3);
        c1062c4.f4272i = c1046c.m2534k(c1062c4);
        c1046c.m2527d(c1062c3.f4272i, i7);
        c1046c.m2527d(c1062c4.f4272i, i8);
        if (c1063d.f4300a0 > 0 || c1063d.f4312g0 == 8) {
            C1062c c1062c5 = c1063d.f4285M;
            C1049f c1049fM2534k = c1046c.m2534k(c1062c5);
            c1062c5.f4272i = c1049fM2534k;
            c1046c.m2527d(c1049fM2534k, c1063d.f4300a0 + i7);
        }
        c1063d.f4329p = 2;
        c1063d.f4298Z = i7;
        int i9 = i8 - i7;
        c1063d.f4294V = i9;
        int i10 = c1063d.f4304c0;
        if (i9 < i10) {
            c1063d.f4294V = i10;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m2648c(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}
