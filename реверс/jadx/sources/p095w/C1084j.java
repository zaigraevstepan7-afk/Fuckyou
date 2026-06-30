package p095w;

import java.util.Iterator;
import p093v.C1060a;
import p093v.C1063d;

/* JADX INFO: renamed from: w.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1084j extends AbstractC1089o {
    @Override // p095w.InterfaceC1078d
    /* JADX INFO: renamed from: a */
    public final void mo2650a(InterfaceC1078d interfaceC1078d) {
        C1060a c1060a = (C1060a) this.f4480b;
        int i2 = c1060a.f4243s0;
        C1080f c1080f = this.f4486h;
        Iterator it = c1080f.f4465l.iterator();
        int i3 = 0;
        int i4 = -1;
        while (it.hasNext()) {
            int i5 = ((C1080f) it.next()).f4460g;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i3 < i5) {
                i3 = i5;
            }
        }
        if (i2 == 0 || i2 == 2) {
            c1080f.mo2667d(i4 + c1060a.f4245u0);
        } else {
            c1080f.mo2667d(i3 + c1060a.f4245u0);
        }
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: d */
    public final void mo2651d() {
        C1063d c1063d = this.f4480b;
        if (c1063d instanceof C1060a) {
            C1080f c1080f = this.f4486h;
            c1080f.f4455b = true;
            C1060a c1060a = (C1060a) c1063d;
            int i2 = c1060a.f4243s0;
            boolean z2 = c1060a.f4244t0;
            int i3 = 0;
            if (i2 == 0) {
                c1080f.f4458e = 4;
                while (i3 < c1060a.f4424r0) {
                    C1063d c1063d2 = c1060a.f4423q0[i3];
                    if (z2 || c1063d2.f4312g0 != 8) {
                        C1080f c1080f2 = c1063d2.f4305d.f4486h;
                        c1080f2.f4464k.add(c1080f);
                        c1080f.f4465l.add(c1080f2);
                    }
                    i3++;
                }
                m2678m(this.f4480b.f4305d.f4486h);
                m2678m(this.f4480b.f4305d.f4487i);
                return;
            }
            if (i2 == 1) {
                c1080f.f4458e = 5;
                while (i3 < c1060a.f4424r0) {
                    C1063d c1063d3 = c1060a.f4423q0[i3];
                    if (z2 || c1063d3.f4312g0 != 8) {
                        C1080f c1080f3 = c1063d3.f4305d.f4487i;
                        c1080f3.f4464k.add(c1080f);
                        c1080f.f4465l.add(c1080f3);
                    }
                    i3++;
                }
                m2678m(this.f4480b.f4305d.f4486h);
                m2678m(this.f4480b.f4305d.f4487i);
                return;
            }
            if (i2 == 2) {
                c1080f.f4458e = 6;
                while (i3 < c1060a.f4424r0) {
                    C1063d c1063d4 = c1060a.f4423q0[i3];
                    if (z2 || c1063d4.f4312g0 != 8) {
                        C1080f c1080f4 = c1063d4.f4307e.f4486h;
                        c1080f4.f4464k.add(c1080f);
                        c1080f.f4465l.add(c1080f4);
                    }
                    i3++;
                }
                m2678m(this.f4480b.f4307e.f4486h);
                m2678m(this.f4480b.f4307e.f4487i);
                return;
            }
            if (i2 != 3) {
                return;
            }
            c1080f.f4458e = 7;
            while (i3 < c1060a.f4424r0) {
                C1063d c1063d5 = c1060a.f4423q0[i3];
                if (z2 || c1063d5.f4312g0 != 8) {
                    C1080f c1080f5 = c1063d5.f4307e.f4487i;
                    c1080f5.f4464k.add(c1080f);
                    c1080f.f4465l.add(c1080f5);
                }
                i3++;
            }
            m2678m(this.f4480b.f4307e.f4486h);
            m2678m(this.f4480b.f4307e.f4487i);
        }
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: e */
    public final void mo2652e() {
        C1063d c1063d = this.f4480b;
        if (c1063d instanceof C1060a) {
            int i2 = ((C1060a) c1063d).f4243s0;
            C1080f c1080f = this.f4486h;
            if (i2 == 0 || i2 == 1) {
                c1063d.f4297Y = c1080f.f4460g;
            } else {
                c1063d.f4298Z = c1080f.f4460g;
            }
        }
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: f */
    public final void mo2653f() {
        this.f4481c = null;
        this.f4486h.m2666c();
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: k */
    public final boolean mo2655k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m2678m(C1080f c1080f) {
        C1080f c1080f2 = this.f4486h;
        c1080f2.f4464k.add(c1080f);
        c1080f.f4465l.add(c1080f2);
    }
}
