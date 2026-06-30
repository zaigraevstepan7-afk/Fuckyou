package p095w;

import p089t.AbstractC1048e;
import p093v.C1062c;
import p093v.C1063d;

/* JADX INFO: renamed from: w.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1089o implements InterfaceC1078d {

    /* JADX INFO: renamed from: a */
    public int f4479a;

    /* JADX INFO: renamed from: b */
    public C1063d f4480b;

    /* JADX INFO: renamed from: c */
    public C1086l f4481c;

    /* JADX INFO: renamed from: d */
    public int f4482d;

    /* JADX INFO: renamed from: e */
    public final C1081g f4483e = new C1081g(this);

    /* JADX INFO: renamed from: f */
    public int f4484f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f4485g = false;

    /* JADX INFO: renamed from: h */
    public final C1080f f4486h = new C1080f(this);

    /* JADX INFO: renamed from: i */
    public final C1080f f4487i = new C1080f(this);

    /* JADX INFO: renamed from: j */
    public int f4488j = 1;

    public AbstractC1089o(C1063d c1063d) {
        this.f4480b = c1063d;
    }

    /* JADX INFO: renamed from: b */
    public static void m2687b(C1080f c1080f, C1080f c1080f2, int i2) {
        c1080f.f4465l.add(c1080f2);
        c1080f.f4459f = i2;
        c1080f2.f4464k.add(c1080f);
    }

    /* JADX INFO: renamed from: h */
    public static C1080f m2688h(C1062c c1062c) {
        C1062c c1062c2 = c1062c.f4269f;
        if (c1062c2 == null) {
            return null;
        }
        int iM2545a = AbstractC1048e.m2545a(c1062c2.f4268e);
        C1063d c1063d = c1062c2.f4267d;
        if (iM2545a == 1) {
            return c1063d.f4305d.f4486h;
        }
        if (iM2545a == 2) {
            return c1063d.f4307e.f4486h;
        }
        if (iM2545a == 3) {
            return c1063d.f4305d.f4487i;
        }
        if (iM2545a == 4) {
            return c1063d.f4307e.f4487i;
        }
        if (iM2545a != 5) {
            return null;
        }
        return c1063d.f4307e.f4471k;
    }

    /* JADX INFO: renamed from: i */
    public static C1080f m2689i(C1062c c1062c, int i2) {
        C1062c c1062c2 = c1062c.f4269f;
        if (c1062c2 == null) {
            return null;
        }
        C1063d c1063d = c1062c2.f4267d;
        AbstractC1089o abstractC1089o = i2 == 0 ? c1063d.f4305d : c1063d.f4307e;
        int iM2545a = AbstractC1048e.m2545a(c1062c2.f4268e);
        if (iM2545a == 1 || iM2545a == 2) {
            return abstractC1089o.f4486h;
        }
        if (iM2545a == 3 || iM2545a == 4) {
            return abstractC1089o.f4487i;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m2690c(C1080f c1080f, C1080f c1080f2, int i2, C1081g c1081g) {
        c1080f.f4465l.add(c1080f2);
        c1080f.f4465l.add(this.f4483e);
        c1080f.f4461h = i2;
        c1080f.f4462i = c1081g;
        c1080f2.f4464k.add(c1080f);
        c1081g.f4464k.add(c1080f);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo2651d();

    /* JADX INFO: renamed from: e */
    public abstract void mo2652e();

    /* JADX INFO: renamed from: f */
    public abstract void mo2653f();

    /* JADX INFO: renamed from: g */
    public final int m2691g(int i2, int i3) {
        if (i3 == 0) {
            C1063d c1063d = this.f4480b;
            int i4 = c1063d.f4336v;
            int iMax = Math.max(c1063d.f4335u, i2);
            if (i4 > 0) {
                iMax = Math.min(i4, i2);
            }
            if (iMax != i2) {
                return iMax;
            }
        } else {
            C1063d c1063d2 = this.f4480b;
            int i5 = c1063d2.f4339y;
            int iMax2 = Math.max(c1063d2.f4338x, i2);
            if (i5 > 0) {
                iMax2 = Math.min(i5, i2);
            }
            if (iMax2 != i2) {
                return iMax2;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: j */
    public long mo2654j() {
        if (this.f4483e.f4463j) {
            return r0.f4460g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo2655k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2692l(C1062c c1062c, C1062c c1062c2, int i2) {
        C1080f c1080fM2688h = m2688h(c1062c);
        C1080f c1080fM2688h2 = m2688h(c1062c2);
        if (c1080fM2688h.f4463j && c1080fM2688h2.f4463j) {
            int iM2580e = c1062c.m2580e() + c1080fM2688h.f4460g;
            int iM2580e2 = c1080fM2688h2.f4460g - c1062c2.m2580e();
            int i3 = iM2580e2 - iM2580e;
            C1081g c1081g = this.f4483e;
            if (!c1081g.f4463j && this.f4482d == 3) {
                int i4 = this.f4479a;
                if (i4 == 0) {
                    c1081g.mo2667d(m2691g(i3, i2));
                } else if (i4 == 1) {
                    c1081g.mo2667d(Math.min(m2691g(c1081g.f4466m, i2), i3));
                } else if (i4 == 2) {
                    C1063d c1063d = this.f4480b;
                    C1063d c1063d2 = c1063d.f4292T;
                    if (c1063d2 != null) {
                        if ((i2 == 0 ? c1063d2.f4305d : c1063d2.f4307e).f4483e.f4463j) {
                            c1081g.mo2667d(m2691g((int) ((r6.f4460g * (i2 == 0 ? c1063d.f4337w : c1063d.f4340z)) + 0.5f), i2));
                        }
                    }
                } else if (i4 == 3) {
                    C1063d c1063d3 = this.f4480b;
                    AbstractC1089o abstractC1089o = c1063d3.f4305d;
                    if (abstractC1089o.f4482d == 3 && abstractC1089o.f4479a == 3) {
                        C1087m c1087m = c1063d3.f4307e;
                        if (c1087m.f4482d != 3 || c1087m.f4479a != 3) {
                        }
                    } else {
                        if (i2 == 0) {
                            abstractC1089o = c1063d3.f4307e;
                        }
                        if (abstractC1089o.f4483e.f4463j) {
                            float f = c1063d3.f4295W;
                            c1081g.mo2667d(i2 == 1 ? (int) ((r6.f4460g / f) + 0.5f) : (int) ((f * r6.f4460g) + 0.5f));
                        }
                    }
                }
            }
            if (c1081g.f4463j) {
                int i5 = c1081g.f4460g;
                C1080f c1080f = this.f4487i;
                C1080f c1080f2 = this.f4486h;
                if (i5 == i3) {
                    c1080f2.mo2667d(iM2580e);
                    c1080f.mo2667d(iM2580e2);
                    return;
                }
                float f2 = i2 == 0 ? this.f4480b.f4306d0 : this.f4480b.f4308e0;
                if (c1080fM2688h == c1080fM2688h2) {
                    iM2580e = c1080fM2688h.f4460g;
                    iM2580e2 = c1080fM2688h2.f4460g;
                    f2 = 0.5f;
                }
                c1080f2.mo2667d((int) ((((iM2580e2 - iM2580e) - i5) * f2) + iM2580e + 0.5f));
                c1080f.mo2667d(c1080f2.f4460g + c1081g.f4460g);
            }
        }
    }
}
