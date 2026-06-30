package p095w;

import java.util.ArrayList;
import p089t.AbstractC1048e;
import p093v.AbstractC1068i;
import p093v.C1062c;
import p093v.C1063d;

/* JADX INFO: renamed from: w.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1085k extends AbstractC1089o {

    /* JADX INFO: renamed from: k */
    public static final int[] f4468k = new int[2];

    /* JADX INFO: renamed from: m */
    public static void m2679m(int[] iArr, int i2, int i3, int i4, int i5, float f, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f) + 0.5f);
                iArr[1] = i8;
                return;
            } else {
                if (i6 != 1) {
                    return;
                }
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f) + 0.5f);
        int i10 = (int) ((i7 / f) + 0.5f);
        if (i9 <= i7) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else if (i10 <= i8) {
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // p095w.InterfaceC1078d
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2650a(InterfaceC1078d interfaceC1078d) {
        float f;
        float f2;
        float f3;
        float f4;
        int i2;
        if (AbstractC1048e.m2545a(this.f4488j) == 3) {
            C1063d c1063d = this.f4480b;
            m2692l(c1063d.f4281I, c1063d.f4283K, 0);
            return;
        }
        C1081g c1081g = this.f4483e;
        boolean z2 = c1081g.f4463j;
        C1080f c1080f = this.f4486h;
        C1080f c1080f2 = this.f4487i;
        if (z2 || this.f4482d != 3) {
            f = 0.5f;
        } else {
            C1063d c1063d2 = this.f4480b;
            int i3 = c1063d2.f4332r;
            if (i3 == 2) {
                f = 0.5f;
                C1063d c1063d3 = c1063d2.f4292T;
                if (c1063d3 != null) {
                    if (c1063d3.f4305d.f4483e.f4463j) {
                        c1081g.mo2667d((int) ((r7.f4460g * c1063d2.f4337w) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = c1063d2.f4333s;
                if (i4 == 0 || i4 == 3) {
                    C1087m c1087m = c1063d2.f4307e;
                    C1080f c1080f3 = c1087m.f4486h;
                    C1080f c1080f4 = c1087m.f4487i;
                    boolean z3 = c1063d2.f4281I.f4269f != null;
                    boolean z4 = c1063d2.f4282J.f4269f != null;
                    boolean z5 = c1063d2.f4283K.f4269f != null;
                    boolean z6 = c1063d2.f4284L.f4269f != null;
                    f = 0.5f;
                    int i5 = c1063d2.f4296X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = c1063d2.f4295W;
                        boolean z7 = c1080f3.f4463j;
                        int[] iArr = f4468k;
                        if (z7 && c1080f4.f4463j) {
                            if (c1080f.f4456c && c1080f2.f4456c) {
                                m2679m(iArr, ((C1080f) c1080f.f4465l.get(0)).f4460g + c1080f.f4459f, ((C1080f) c1080f2.f4465l.get(0)).f4460g - c1080f2.f4459f, c1080f3.f4460g + c1080f3.f4459f, c1080f4.f4460g - c1080f4.f4459f, f5, i5);
                                c1081g.mo2667d(iArr[0]);
                                this.f4480b.f4307e.f4483e.mo2667d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c1080f.f4463j;
                        ArrayList arrayList = c1080f3.f4465l;
                        if (z8 && c1080f2.f4463j) {
                            if (!c1080f3.f4456c || !c1080f4.f4456c) {
                                return;
                            }
                            m2679m(iArr, c1080f.f4460g + c1080f.f4459f, c1080f2.f4460g - c1080f2.f4459f, ((C1080f) arrayList.get(0)).f4460g + c1080f3.f4459f, ((C1080f) c1080f4.f4465l.get(0)).f4460g - c1080f4.f4459f, f5, i5);
                            c1081g.mo2667d(iArr[0]);
                            this.f4480b.f4307e.f4483e.mo2667d(iArr[1]);
                        }
                        if (!c1080f.f4456c || !c1080f2.f4456c || !c1080f3.f4456c || !c1080f4.f4456c) {
                            return;
                        }
                        m2679m(iArr, ((C1080f) c1080f.f4465l.get(0)).f4460g + c1080f.f4459f, ((C1080f) c1080f2.f4465l.get(0)).f4460g - c1080f2.f4459f, ((C1080f) arrayList.get(0)).f4460g + c1080f3.f4459f, ((C1080f) c1080f4.f4465l.get(0)).f4460g - c1080f4.f4459f, f5, i5);
                        c1081g.mo2667d(iArr[0]);
                        this.f4480b.f4307e.f4483e.mo2667d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c1080f.f4456c || !c1080f2.f4456c) {
                            return;
                        }
                        float f6 = c1063d2.f4295W;
                        int i6 = ((C1080f) c1080f.f4465l.get(0)).f4460g + c1080f.f4459f;
                        int i7 = ((C1080f) c1080f2.f4465l.get(0)).f4460g - c1080f2.f4459f;
                        if (i5 == -1 || i5 == 0) {
                            int iM2691g = m2691g(i7 - i6, 0);
                            int i8 = (int) ((iM2691g * f6) + 0.5f);
                            int iM2691g2 = m2691g(i8, 1);
                            if (i8 != iM2691g2) {
                                iM2691g = (int) ((iM2691g2 / f6) + 0.5f);
                            }
                            c1081g.mo2667d(iM2691g);
                            this.f4480b.f4307e.f4483e.mo2667d(iM2691g2);
                        } else if (i5 == 1) {
                            int iM2691g3 = m2691g(i7 - i6, 0);
                            int i9 = (int) ((iM2691g3 / f6) + 0.5f);
                            int iM2691g4 = m2691g(i9, 1);
                            if (i9 != iM2691g4) {
                                iM2691g3 = (int) ((iM2691g4 * f6) + 0.5f);
                            }
                            c1081g.mo2667d(iM2691g3);
                            this.f4480b.f4307e.f4483e.mo2667d(iM2691g4);
                        }
                    } else if (z4 && z6) {
                        if (!c1080f3.f4456c || !c1080f4.f4456c) {
                            return;
                        }
                        float f7 = c1063d2.f4295W;
                        int i10 = ((C1080f) c1080f3.f4465l.get(0)).f4460g + c1080f3.f4459f;
                        int i11 = ((C1080f) c1080f4.f4465l.get(0)).f4460g - c1080f4.f4459f;
                        if (i5 == -1) {
                            int iM2691g5 = m2691g(i11 - i10, 1);
                            int i12 = (int) ((iM2691g5 / f7) + 0.5f);
                            int iM2691g6 = m2691g(i12, 0);
                            if (i12 != iM2691g6) {
                                iM2691g5 = (int) ((iM2691g6 * f7) + 0.5f);
                            }
                            c1081g.mo2667d(iM2691g6);
                            this.f4480b.f4307e.f4483e.mo2667d(iM2691g5);
                        } else if (i5 == 0) {
                            int iM2691g7 = m2691g(i11 - i10, 1);
                            int i13 = (int) ((iM2691g7 * f7) + 0.5f);
                            int iM2691g8 = m2691g(i13, 0);
                            if (i13 != iM2691g8) {
                                iM2691g7 = (int) ((iM2691g8 / f7) + 0.5f);
                            }
                            c1081g.mo2667d(iM2691g8);
                            this.f4480b.f4307e.f4483e.mo2667d(iM2691g7);
                        } else if (i5 == 1) {
                        }
                    }
                } else {
                    int i14 = c1063d2.f4296X;
                    if (i14 == -1) {
                        f2 = c1063d2.f4307e.f4483e.f4460g;
                        f3 = c1063d2.f4295W;
                    } else if (i14 == 0) {
                        f4 = c1063d2.f4307e.f4483e.f4460g / c1063d2.f4295W;
                        i2 = (int) (f4 + 0.5f);
                        c1081g.mo2667d(i2);
                        f = 0.5f;
                    } else if (i14 != 1) {
                        i2 = 0;
                        c1081g.mo2667d(i2);
                        f = 0.5f;
                    } else {
                        f2 = c1063d2.f4307e.f4483e.f4460g;
                        f3 = c1063d2.f4295W;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    c1081g.mo2667d(i2);
                    f = 0.5f;
                }
            }
        }
        if (c1080f.f4456c && c1080f2.f4456c) {
            if (c1080f.f4463j && c1080f2.f4463j && c1081g.f4463j) {
                return;
            }
            if (!c1081g.f4463j && this.f4482d == 3) {
                C1063d c1063d4 = this.f4480b;
                if (c1063d4.f4332r == 0 && !c1063d4.m2624x()) {
                    C1080f c1080f5 = (C1080f) c1080f.f4465l.get(0);
                    C1080f c1080f6 = (C1080f) c1080f2.f4465l.get(0);
                    int i15 = c1080f5.f4460g + c1080f.f4459f;
                    int i16 = c1080f6.f4460g + c1080f2.f4459f;
                    c1080f.mo2667d(i15);
                    c1080f2.mo2667d(i16);
                    c1081g.mo2667d(i16 - i15);
                    return;
                }
            }
            if (!c1081g.f4463j && this.f4482d == 3 && this.f4479a == 1 && c1080f.f4465l.size() > 0 && c1080f2.f4465l.size() > 0) {
                int iMin = Math.min((((C1080f) c1080f2.f4465l.get(0)).f4460g + c1080f2.f4459f) - (((C1080f) c1080f.f4465l.get(0)).f4460g + c1080f.f4459f), c1081g.f4466m);
                C1063d c1063d5 = this.f4480b;
                int i17 = c1063d5.f4336v;
                int iMax = Math.max(c1063d5.f4335u, iMin);
                if (i17 > 0) {
                    iMax = Math.min(i17, iMax);
                }
                c1081g.mo2667d(iMax);
            }
            if (c1081g.f4463j) {
                C1080f c1080f7 = (C1080f) c1080f.f4465l.get(0);
                C1080f c1080f8 = (C1080f) c1080f2.f4465l.get(0);
                int i18 = c1080f7.f4460g;
                int i19 = c1080f.f4459f + i18;
                int i20 = c1080f8.f4460g;
                int i21 = c1080f2.f4459f + i20;
                float f8 = this.f4480b.f4306d0;
                if (c1080f7 == c1080f8) {
                    f8 = 0.5f;
                } else {
                    i18 = i19;
                    i20 = i21;
                }
                c1080f.mo2667d((int) ((((i20 - i18) - c1081g.f4460g) * f8) + i18 + f));
                c1080f2.mo2667d(c1080f.f4460g + c1081g.f4460g);
            }
        }
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: d */
    public final void mo2651d() {
        C1063d c1063d;
        C1063d c1063d2;
        int i2;
        C1063d c1063d3;
        C1063d c1063d4;
        int i3;
        C1063d c1063d5 = this.f4480b;
        boolean z2 = c1063d5.f4299a;
        C1081g c1081g = this.f4483e;
        if (z2) {
            c1081g.mo2667d(c1063d5.m2617q());
        }
        boolean z3 = c1081g.f4463j;
        C1080f c1080f = this.f4487i;
        C1080f c1080f2 = this.f4486h;
        if (!z3) {
            C1063d c1063d6 = this.f4480b;
            int i4 = c1063d6.f4330p0[0];
            this.f4482d = i4;
            if (i4 != 3) {
                if (i4 == 4 && (c1063d4 = c1063d6.f4292T) != null && ((i3 = c1063d4.f4330p0[0]) == 1 || i3 == 4)) {
                    int iM2617q = (c1063d4.m2617q() - this.f4480b.f4281I.m2580e()) - this.f4480b.f4283K.m2580e();
                    AbstractC1089o.m2687b(c1080f2, c1063d4.f4305d.f4486h, this.f4480b.f4281I.m2580e());
                    AbstractC1089o.m2687b(c1080f, c1063d4.f4305d.f4487i, -this.f4480b.f4283K.m2580e());
                    c1081g.mo2667d(iM2617q);
                    return;
                }
                if (i4 == 1) {
                    c1081g.mo2667d(c1063d6.m2617q());
                }
            }
        } else if (this.f4482d == 4 && (c1063d2 = (c1063d = this.f4480b).f4292T) != null && ((i2 = c1063d2.f4330p0[0]) == 1 || i2 == 4)) {
            AbstractC1089o.m2687b(c1080f2, c1063d2.f4305d.f4486h, c1063d.f4281I.m2580e());
            AbstractC1089o.m2687b(c1080f, c1063d2.f4305d.f4487i, -this.f4480b.f4283K.m2580e());
            return;
        }
        if (c1081g.f4463j) {
            C1063d c1063d7 = this.f4480b;
            if (c1063d7.f4299a) {
                C1062c[] c1062cArr = c1063d7.f4289Q;
                C1062c c1062c = c1062cArr[0];
                C1062c c1062c2 = c1062c.f4269f;
                if (c1062c2 != null && c1062cArr[1].f4269f != null) {
                    if (c1063d7.m2624x()) {
                        c1080f2.f4459f = this.f4480b.f4289Q[0].m2580e();
                        c1080f.f4459f = -this.f4480b.f4289Q[1].m2580e();
                        return;
                    }
                    C1080f c1080fM2688h = AbstractC1089o.m2688h(this.f4480b.f4289Q[0]);
                    if (c1080fM2688h != null) {
                        AbstractC1089o.m2687b(c1080f2, c1080fM2688h, this.f4480b.f4289Q[0].m2580e());
                    }
                    C1080f c1080fM2688h2 = AbstractC1089o.m2688h(this.f4480b.f4289Q[1]);
                    if (c1080fM2688h2 != null) {
                        AbstractC1089o.m2687b(c1080f, c1080fM2688h2, -this.f4480b.f4289Q[1].m2580e());
                    }
                    c1080f2.f4455b = true;
                    c1080f.f4455b = true;
                    return;
                }
                if (c1062c2 != null) {
                    C1080f c1080fM2688h3 = AbstractC1089o.m2688h(c1062c);
                    if (c1080fM2688h3 != null) {
                        AbstractC1089o.m2687b(c1080f2, c1080fM2688h3, this.f4480b.f4289Q[0].m2580e());
                        AbstractC1089o.m2687b(c1080f, c1080f2, c1081g.f4460g);
                        return;
                    }
                    return;
                }
                C1062c c1062c3 = c1062cArr[1];
                if (c1062c3.f4269f != null) {
                    C1080f c1080fM2688h4 = AbstractC1089o.m2688h(c1062c3);
                    if (c1080fM2688h4 != null) {
                        AbstractC1089o.m2687b(c1080f, c1080fM2688h4, -this.f4480b.f4289Q[1].m2580e());
                        AbstractC1089o.m2687b(c1080f2, c1080f, -c1081g.f4460g);
                        return;
                    }
                    return;
                }
                if ((c1063d7 instanceof AbstractC1068i) || c1063d7.f4292T == null || c1063d7.mo2611i(7).f4269f != null) {
                    return;
                }
                C1063d c1063d8 = this.f4480b;
                AbstractC1089o.m2687b(c1080f2, c1063d8.f4292T.f4305d.f4486h, c1063d8.m2618r());
                AbstractC1089o.m2687b(c1080f, c1080f2, c1081g.f4460g);
                return;
            }
        }
        if (this.f4482d == 3) {
            C1063d c1063d9 = this.f4480b;
            int i5 = c1063d9.f4332r;
            if (i5 == 2) {
                C1063d c1063d10 = c1063d9.f4292T;
                if (c1063d10 != null) {
                    C1081g c1081g2 = c1063d10.f4307e.f4483e;
                    c1081g.f4465l.add(c1081g2);
                    c1081g2.f4464k.add(c1081g);
                    c1081g.f4455b = true;
                    c1081g.f4464k.add(c1080f2);
                    c1081g.f4464k.add(c1080f);
                }
            } else if (i5 == 3) {
                if (c1063d9.f4333s == 3) {
                    c1080f2.f4454a = this;
                    c1080f.f4454a = this;
                    C1087m c1087m = c1063d9.f4307e;
                    c1087m.f4486h.f4454a = this;
                    c1087m.f4487i.f4454a = this;
                    c1081g.f4454a = this;
                    if (c1063d9.m2625y()) {
                        c1081g.f4465l.add(this.f4480b.f4307e.f4483e);
                        this.f4480b.f4307e.f4483e.f4464k.add(c1081g);
                        C1087m c1087m2 = this.f4480b.f4307e;
                        c1087m2.f4483e.f4454a = this;
                        c1081g.f4465l.add(c1087m2.f4486h);
                        c1081g.f4465l.add(this.f4480b.f4307e.f4487i);
                        this.f4480b.f4307e.f4486h.f4464k.add(c1081g);
                        this.f4480b.f4307e.f4487i.f4464k.add(c1081g);
                    } else if (this.f4480b.m2624x()) {
                        this.f4480b.f4307e.f4483e.f4465l.add(c1081g);
                        c1081g.f4464k.add(this.f4480b.f4307e.f4483e);
                    } else {
                        this.f4480b.f4307e.f4483e.f4465l.add(c1081g);
                    }
                } else {
                    C1081g c1081g3 = c1063d9.f4307e.f4483e;
                    c1081g.f4465l.add(c1081g3);
                    c1081g3.f4464k.add(c1081g);
                    this.f4480b.f4307e.f4486h.f4464k.add(c1081g);
                    this.f4480b.f4307e.f4487i.f4464k.add(c1081g);
                    c1081g.f4455b = true;
                    c1081g.f4464k.add(c1080f2);
                    c1081g.f4464k.add(c1080f);
                    c1080f2.f4465l.add(c1081g);
                    c1080f.f4465l.add(c1081g);
                }
            }
        }
        C1063d c1063d11 = this.f4480b;
        C1062c[] c1062cArr2 = c1063d11.f4289Q;
        C1062c c1062c4 = c1062cArr2[0];
        C1062c c1062c5 = c1062c4.f4269f;
        if (c1062c5 != null && c1062cArr2[1].f4269f != null) {
            if (c1063d11.m2624x()) {
                c1080f2.f4459f = this.f4480b.f4289Q[0].m2580e();
                c1080f.f4459f = -this.f4480b.f4289Q[1].m2580e();
                return;
            }
            C1080f c1080fM2688h5 = AbstractC1089o.m2688h(this.f4480b.f4289Q[0]);
            C1080f c1080fM2688h6 = AbstractC1089o.m2688h(this.f4480b.f4289Q[1]);
            if (c1080fM2688h5 != null) {
                c1080fM2688h5.m2665b(this);
            }
            if (c1080fM2688h6 != null) {
                c1080fM2688h6.m2665b(this);
            }
            this.f4488j = 4;
            return;
        }
        if (c1062c5 != null) {
            C1080f c1080fM2688h7 = AbstractC1089o.m2688h(c1062c4);
            if (c1080fM2688h7 != null) {
                AbstractC1089o.m2687b(c1080f2, c1080fM2688h7, this.f4480b.f4289Q[0].m2580e());
                m2690c(c1080f, c1080f2, 1, c1081g);
                return;
            }
            return;
        }
        C1062c c1062c6 = c1062cArr2[1];
        if (c1062c6.f4269f != null) {
            C1080f c1080fM2688h8 = AbstractC1089o.m2688h(c1062c6);
            if (c1080fM2688h8 != null) {
                AbstractC1089o.m2687b(c1080f, c1080fM2688h8, -this.f4480b.f4289Q[1].m2580e());
                m2690c(c1080f2, c1080f, -1, c1081g);
                return;
            }
            return;
        }
        if ((c1063d11 instanceof AbstractC1068i) || (c1063d3 = c1063d11.f4292T) == null) {
            return;
        }
        AbstractC1089o.m2687b(c1080f2, c1063d3.f4305d.f4486h, c1063d11.m2618r());
        m2690c(c1080f, c1080f2, 1, c1081g);
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: e */
    public final void mo2652e() {
        C1080f c1080f = this.f4486h;
        if (c1080f.f4463j) {
            this.f4480b.f4297Y = c1080f.f4460g;
        }
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: f */
    public final void mo2653f() {
        this.f4481c = null;
        this.f4486h.m2666c();
        this.f4487i.m2666c();
        this.f4483e.m2666c();
        this.f4485g = false;
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: k */
    public final boolean mo2655k() {
        return this.f4482d != 3 || this.f4480b.f4332r == 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m2680n() {
        this.f4485g = false;
        C1080f c1080f = this.f4486h;
        c1080f.m2666c();
        c1080f.f4463j = false;
        C1080f c1080f2 = this.f4487i;
        c1080f2.m2666c();
        c1080f2.f4463j = false;
        this.f4483e.f4463j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f4480b.f4314h0;
    }
}
