package p095w;

import p089t.AbstractC1048e;
import p093v.AbstractC1068i;
import p093v.C1062c;
import p093v.C1063d;

/* JADX INFO: renamed from: w.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1087m extends AbstractC1089o {

    /* JADX INFO: renamed from: k */
    public C1080f f4471k;

    /* JADX INFO: renamed from: l */
    public C1075a f4472l;

    @Override // p095w.InterfaceC1078d
    /* JADX INFO: renamed from: a */
    public final void mo2650a(InterfaceC1078d interfaceC1078d) {
        float f;
        float f2;
        float f3;
        int i2;
        if (AbstractC1048e.m2545a(this.f4488j) == 3) {
            C1063d c1063d = this.f4480b;
            m2692l(c1063d.f4282J, c1063d.f4284L, 1);
            return;
        }
        C1081g c1081g = this.f4483e;
        if (c1081g.f4456c && !c1081g.f4463j && this.f4482d == 3) {
            C1063d c1063d2 = this.f4480b;
            int i3 = c1063d2.f4333s;
            if (i3 == 2) {
                C1063d c1063d3 = c1063d2.f4292T;
                if (c1063d3 != null) {
                    if (c1063d3.f4307e.f4483e.f4463j) {
                        c1081g.mo2667d((int) ((r5.f4460g * c1063d2.f4340z) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                C1081g c1081g2 = c1063d2.f4305d.f4483e;
                if (c1081g2.f4463j) {
                    int i4 = c1063d2.f4296X;
                    if (i4 == -1) {
                        f = c1081g2.f4460g;
                        f2 = c1063d2.f4295W;
                    } else if (i4 == 0) {
                        f3 = c1081g2.f4460g * c1063d2.f4295W;
                        i2 = (int) (f3 + 0.5f);
                        c1081g.mo2667d(i2);
                    } else if (i4 != 1) {
                        i2 = 0;
                        c1081g.mo2667d(i2);
                    } else {
                        f = c1081g2.f4460g;
                        f2 = c1063d2.f4295W;
                    }
                    f3 = f / f2;
                    i2 = (int) (f3 + 0.5f);
                    c1081g.mo2667d(i2);
                }
            }
        }
        C1080f c1080f = this.f4486h;
        if (c1080f.f4456c) {
            C1080f c1080f2 = this.f4487i;
            if (c1080f2.f4456c) {
                if (c1080f.f4463j && c1080f2.f4463j && c1081g.f4463j) {
                    return;
                }
                if (!c1081g.f4463j && this.f4482d == 3) {
                    C1063d c1063d4 = this.f4480b;
                    if (c1063d4.f4332r == 0 && !c1063d4.m2625y()) {
                        C1080f c1080f3 = (C1080f) c1080f.f4465l.get(0);
                        C1080f c1080f4 = (C1080f) c1080f2.f4465l.get(0);
                        int i5 = c1080f3.f4460g + c1080f.f4459f;
                        int i6 = c1080f4.f4460g + c1080f2.f4459f;
                        c1080f.mo2667d(i5);
                        c1080f2.mo2667d(i6);
                        c1081g.mo2667d(i6 - i5);
                        return;
                    }
                }
                if (!c1081g.f4463j && this.f4482d == 3 && this.f4479a == 1 && c1080f.f4465l.size() > 0 && c1080f2.f4465l.size() > 0) {
                    C1080f c1080f5 = (C1080f) c1080f.f4465l.get(0);
                    int i7 = (((C1080f) c1080f2.f4465l.get(0)).f4460g + c1080f2.f4459f) - (c1080f5.f4460g + c1080f.f4459f);
                    int i8 = c1081g.f4466m;
                    if (i7 < i8) {
                        c1081g.mo2667d(i7);
                    } else {
                        c1081g.mo2667d(i8);
                    }
                }
                if (c1081g.f4463j && c1080f.f4465l.size() > 0 && c1080f2.f4465l.size() > 0) {
                    C1080f c1080f6 = (C1080f) c1080f.f4465l.get(0);
                    C1080f c1080f7 = (C1080f) c1080f2.f4465l.get(0);
                    int i9 = c1080f6.f4460g;
                    int i10 = c1080f.f4459f + i9;
                    int i11 = c1080f7.f4460g;
                    int i12 = c1080f2.f4459f + i11;
                    float f4 = this.f4480b.f4308e0;
                    if (c1080f6 == c1080f7) {
                        f4 = 0.5f;
                    } else {
                        i9 = i10;
                        i11 = i12;
                    }
                    c1080f.mo2667d((int) ((((i11 - i9) - c1081g.f4460g) * f4) + i9 + 0.5f));
                    c1080f2.mo2667d(c1080f.f4460g + c1081g.f4460g);
                }
            }
        }
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: d */
    public final void mo2651d() {
        C1063d c1063d;
        C1063d c1063d2;
        C1063d c1063d3;
        C1063d c1063d4;
        C1063d c1063d5 = this.f4480b;
        boolean z2 = c1063d5.f4299a;
        C1081g c1081g = this.f4483e;
        if (z2) {
            c1081g.mo2667d(c1063d5.m2613k());
        }
        boolean z3 = c1081g.f4463j;
        C1080f c1080f = this.f4487i;
        C1080f c1080f2 = this.f4486h;
        if (!z3) {
            C1063d c1063d6 = this.f4480b;
            this.f4482d = c1063d6.f4330p0[1];
            if (c1063d6.f4277E) {
                this.f4472l = new C1075a(this);
            }
            int i2 = this.f4482d;
            if (i2 != 3) {
                if (i2 == 4 && (c1063d4 = this.f4480b.f4292T) != null && c1063d4.f4330p0[1] == 1) {
                    int iM2613k = (c1063d4.m2613k() - this.f4480b.f4282J.m2580e()) - this.f4480b.f4284L.m2580e();
                    AbstractC1089o.m2687b(c1080f2, c1063d4.f4307e.f4486h, this.f4480b.f4282J.m2580e());
                    AbstractC1089o.m2687b(c1080f, c1063d4.f4307e.f4487i, -this.f4480b.f4284L.m2580e());
                    c1081g.mo2667d(iM2613k);
                    return;
                }
                if (i2 == 1) {
                    c1081g.mo2667d(this.f4480b.m2613k());
                }
            }
        } else if (this.f4482d == 4 && (c1063d2 = (c1063d = this.f4480b).f4292T) != null && c1063d2.f4330p0[1] == 1) {
            AbstractC1089o.m2687b(c1080f2, c1063d2.f4307e.f4486h, c1063d.f4282J.m2580e());
            AbstractC1089o.m2687b(c1080f, c1063d2.f4307e.f4487i, -this.f4480b.f4284L.m2580e());
            return;
        }
        boolean z4 = c1081g.f4463j;
        C1080f c1080f3 = this.f4471k;
        if (z4) {
            C1063d c1063d7 = this.f4480b;
            if (c1063d7.f4299a) {
                C1062c[] c1062cArr = c1063d7.f4289Q;
                C1062c c1062c = c1062cArr[2];
                C1062c c1062c2 = c1062c.f4269f;
                if (c1062c2 != null && c1062cArr[3].f4269f != null) {
                    if (c1063d7.m2625y()) {
                        c1080f2.f4459f = this.f4480b.f4289Q[2].m2580e();
                        c1080f.f4459f = -this.f4480b.f4289Q[3].m2580e();
                    } else {
                        C1080f c1080fM2688h = AbstractC1089o.m2688h(this.f4480b.f4289Q[2]);
                        if (c1080fM2688h != null) {
                            AbstractC1089o.m2687b(c1080f2, c1080fM2688h, this.f4480b.f4289Q[2].m2580e());
                        }
                        C1080f c1080fM2688h2 = AbstractC1089o.m2688h(this.f4480b.f4289Q[3]);
                        if (c1080fM2688h2 != null) {
                            AbstractC1089o.m2687b(c1080f, c1080fM2688h2, -this.f4480b.f4289Q[3].m2580e());
                        }
                        c1080f2.f4455b = true;
                        c1080f.f4455b = true;
                    }
                    C1063d c1063d8 = this.f4480b;
                    if (c1063d8.f4277E) {
                        AbstractC1089o.m2687b(c1080f3, c1080f2, c1063d8.f4300a0);
                        return;
                    }
                    return;
                }
                if (c1062c2 != null) {
                    C1080f c1080fM2688h3 = AbstractC1089o.m2688h(c1062c);
                    if (c1080fM2688h3 != null) {
                        AbstractC1089o.m2687b(c1080f2, c1080fM2688h3, this.f4480b.f4289Q[2].m2580e());
                        AbstractC1089o.m2687b(c1080f, c1080f2, c1081g.f4460g);
                        C1063d c1063d9 = this.f4480b;
                        if (c1063d9.f4277E) {
                            AbstractC1089o.m2687b(c1080f3, c1080f2, c1063d9.f4300a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C1062c c1062c3 = c1062cArr[3];
                if (c1062c3.f4269f != null) {
                    C1080f c1080fM2688h4 = AbstractC1089o.m2688h(c1062c3);
                    if (c1080fM2688h4 != null) {
                        AbstractC1089o.m2687b(c1080f, c1080fM2688h4, -this.f4480b.f4289Q[3].m2580e());
                        AbstractC1089o.m2687b(c1080f2, c1080f, -c1081g.f4460g);
                    }
                    C1063d c1063d10 = this.f4480b;
                    if (c1063d10.f4277E) {
                        AbstractC1089o.m2687b(c1080f3, c1080f2, c1063d10.f4300a0);
                        return;
                    }
                    return;
                }
                C1062c c1062c4 = c1062cArr[4];
                if (c1062c4.f4269f != null) {
                    C1080f c1080fM2688h5 = AbstractC1089o.m2688h(c1062c4);
                    if (c1080fM2688h5 != null) {
                        AbstractC1089o.m2687b(c1080f3, c1080fM2688h5, 0);
                        AbstractC1089o.m2687b(c1080f2, c1080f3, -this.f4480b.f4300a0);
                        AbstractC1089o.m2687b(c1080f, c1080f2, c1081g.f4460g);
                        return;
                    }
                    return;
                }
                if ((c1063d7 instanceof AbstractC1068i) || c1063d7.f4292T == null || c1063d7.mo2611i(7).f4269f != null) {
                    return;
                }
                C1063d c1063d11 = this.f4480b;
                AbstractC1089o.m2687b(c1080f2, c1063d11.f4292T.f4307e.f4486h, c1063d11.m2619s());
                AbstractC1089o.m2687b(c1080f, c1080f2, c1081g.f4460g);
                C1063d c1063d12 = this.f4480b;
                if (c1063d12.f4277E) {
                    AbstractC1089o.m2687b(c1080f3, c1080f2, c1063d12.f4300a0);
                    return;
                }
                return;
            }
        }
        if (z4 || this.f4482d != 3) {
            c1081g.m2665b(this);
        } else {
            C1063d c1063d13 = this.f4480b;
            int i3 = c1063d13.f4333s;
            if (i3 == 2) {
                C1063d c1063d14 = c1063d13.f4292T;
                if (c1063d14 != null) {
                    C1081g c1081g2 = c1063d14.f4307e.f4483e;
                    c1081g.f4465l.add(c1081g2);
                    c1081g2.f4464k.add(c1081g);
                    c1081g.f4455b = true;
                    c1081g.f4464k.add(c1080f2);
                    c1081g.f4464k.add(c1080f);
                }
            } else if (i3 == 3 && !c1063d13.m2625y()) {
                C1063d c1063d15 = this.f4480b;
                if (c1063d15.f4332r != 3) {
                    C1081g c1081g3 = c1063d15.f4305d.f4483e;
                    c1081g.f4465l.add(c1081g3);
                    c1081g3.f4464k.add(c1081g);
                    c1081g.f4455b = true;
                    c1081g.f4464k.add(c1080f2);
                    c1081g.f4464k.add(c1080f);
                }
            }
        }
        C1063d c1063d16 = this.f4480b;
        C1062c[] c1062cArr2 = c1063d16.f4289Q;
        C1062c c1062c5 = c1062cArr2[2];
        C1062c c1062c6 = c1062c5.f4269f;
        if (c1062c6 != null && c1062cArr2[3].f4269f != null) {
            if (c1063d16.m2625y()) {
                c1080f2.f4459f = this.f4480b.f4289Q[2].m2580e();
                c1080f.f4459f = -this.f4480b.f4289Q[3].m2580e();
            } else {
                C1080f c1080fM2688h6 = AbstractC1089o.m2688h(this.f4480b.f4289Q[2]);
                C1080f c1080fM2688h7 = AbstractC1089o.m2688h(this.f4480b.f4289Q[3]);
                if (c1080fM2688h6 != null) {
                    c1080fM2688h6.m2665b(this);
                }
                if (c1080fM2688h7 != null) {
                    c1080fM2688h7.m2665b(this);
                }
                this.f4488j = 4;
            }
            if (this.f4480b.f4277E) {
                m2690c(c1080f3, c1080f2, 1, this.f4472l);
            }
        } else if (c1062c6 != null) {
            C1080f c1080fM2688h8 = AbstractC1089o.m2688h(c1062c5);
            if (c1080fM2688h8 != null) {
                AbstractC1089o.m2687b(c1080f2, c1080fM2688h8, this.f4480b.f4289Q[2].m2580e());
                m2690c(c1080f, c1080f2, 1, c1081g);
                if (this.f4480b.f4277E) {
                    m2690c(c1080f3, c1080f2, 1, this.f4472l);
                }
                if (this.f4482d == 3) {
                    C1063d c1063d17 = this.f4480b;
                    if (c1063d17.f4295W > 0.0f) {
                        C1085k c1085k = c1063d17.f4305d;
                        if (c1085k.f4482d == 3) {
                            c1085k.f4483e.f4464k.add(c1081g);
                            c1081g.f4465l.add(this.f4480b.f4305d.f4483e);
                            c1081g.f4454a = this;
                        }
                    }
                }
            }
        } else {
            C1062c c1062c7 = c1062cArr2[3];
            if (c1062c7.f4269f != null) {
                C1080f c1080fM2688h9 = AbstractC1089o.m2688h(c1062c7);
                if (c1080fM2688h9 != null) {
                    AbstractC1089o.m2687b(c1080f, c1080fM2688h9, -this.f4480b.f4289Q[3].m2580e());
                    m2690c(c1080f2, c1080f, -1, c1081g);
                    if (this.f4480b.f4277E) {
                        m2690c(c1080f3, c1080f2, 1, this.f4472l);
                    }
                }
            } else {
                C1062c c1062c8 = c1062cArr2[4];
                if (c1062c8.f4269f != null) {
                    C1080f c1080fM2688h10 = AbstractC1089o.m2688h(c1062c8);
                    if (c1080fM2688h10 != null) {
                        AbstractC1089o.m2687b(c1080f3, c1080fM2688h10, 0);
                        m2690c(c1080f2, c1080f3, -1, this.f4472l);
                        m2690c(c1080f, c1080f2, 1, c1081g);
                    }
                } else if (!(c1063d16 instanceof AbstractC1068i) && (c1063d3 = c1063d16.f4292T) != null) {
                    AbstractC1089o.m2687b(c1080f2, c1063d3.f4307e.f4486h, c1063d16.m2619s());
                    m2690c(c1080f, c1080f2, 1, c1081g);
                    if (this.f4480b.f4277E) {
                        m2690c(c1080f3, c1080f2, 1, this.f4472l);
                    }
                    if (this.f4482d == 3) {
                        C1063d c1063d18 = this.f4480b;
                        if (c1063d18.f4295W > 0.0f) {
                            C1085k c1085k2 = c1063d18.f4305d;
                            if (c1085k2.f4482d == 3) {
                                c1085k2.f4483e.f4464k.add(c1081g);
                                c1081g.f4465l.add(this.f4480b.f4305d.f4483e);
                                c1081g.f4454a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c1081g.f4465l.size() == 0) {
            c1081g.f4456c = true;
        }
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: e */
    public final void mo2652e() {
        C1080f c1080f = this.f4486h;
        if (c1080f.f4463j) {
            this.f4480b.f4298Z = c1080f.f4460g;
        }
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: f */
    public final void mo2653f() {
        this.f4481c = null;
        this.f4486h.m2666c();
        this.f4487i.m2666c();
        this.f4471k.m2666c();
        this.f4483e.m2666c();
        this.f4485g = false;
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: k */
    public final boolean mo2655k() {
        return this.f4482d != 3 || this.f4480b.f4333s == 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m2683m() {
        this.f4485g = false;
        C1080f c1080f = this.f4486h;
        c1080f.m2666c();
        c1080f.f4463j = false;
        C1080f c1080f2 = this.f4487i;
        c1080f2.m2666c();
        c1080f2.f4463j = false;
        C1080f c1080f3 = this.f4471k;
        c1080f3.m2666c();
        c1080f3.f4463j = false;
        this.f4483e.f4463j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f4480b.f4314h0;
    }
}
