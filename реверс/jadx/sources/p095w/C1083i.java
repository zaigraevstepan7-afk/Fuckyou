package p095w;

import p093v.C1063d;
import p093v.C1067h;

/* JADX INFO: renamed from: w.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1083i extends AbstractC1089o {
    @Override // p095w.InterfaceC1078d
    /* JADX INFO: renamed from: a */
    public final void mo2650a(InterfaceC1078d interfaceC1078d) {
        C1080f c1080f = this.f4486h;
        if (c1080f.f4456c && !c1080f.f4463j) {
            c1080f.mo2667d((int) ((((C1080f) c1080f.f4465l.get(0)).f4460g * ((C1067h) this.f4480b).f4417q0) + 0.5f));
        }
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: d */
    public final void mo2651d() {
        C1063d c1063d = this.f4480b;
        C1067h c1067h = (C1067h) c1063d;
        int i2 = c1067h.f4418r0;
        int i3 = c1067h.f4419s0;
        int i4 = c1067h.f4421u0;
        C1080f c1080f = this.f4486h;
        if (i4 == 1) {
            if (i2 != -1) {
                c1080f.f4465l.add(c1063d.f4292T.f4305d.f4486h);
                this.f4480b.f4292T.f4305d.f4486h.f4464k.add(c1080f);
                c1080f.f4459f = i2;
            } else if (i3 != -1) {
                c1080f.f4465l.add(c1063d.f4292T.f4305d.f4487i);
                this.f4480b.f4292T.f4305d.f4487i.f4464k.add(c1080f);
                c1080f.f4459f = -i3;
            } else {
                c1080f.f4455b = true;
                c1080f.f4465l.add(c1063d.f4292T.f4305d.f4487i);
                this.f4480b.f4292T.f4305d.f4487i.f4464k.add(c1080f);
            }
            m2677m(this.f4480b.f4305d.f4486h);
            m2677m(this.f4480b.f4305d.f4487i);
            return;
        }
        if (i2 != -1) {
            c1080f.f4465l.add(c1063d.f4292T.f4307e.f4486h);
            this.f4480b.f4292T.f4307e.f4486h.f4464k.add(c1080f);
            c1080f.f4459f = i2;
        } else if (i3 != -1) {
            c1080f.f4465l.add(c1063d.f4292T.f4307e.f4487i);
            this.f4480b.f4292T.f4307e.f4487i.f4464k.add(c1080f);
            c1080f.f4459f = -i3;
        } else {
            c1080f.f4455b = true;
            c1080f.f4465l.add(c1063d.f4292T.f4307e.f4487i);
            this.f4480b.f4292T.f4307e.f4487i.f4464k.add(c1080f);
        }
        m2677m(this.f4480b.f4307e.f4486h);
        m2677m(this.f4480b.f4307e.f4487i);
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: e */
    public final void mo2652e() {
        C1063d c1063d = this.f4480b;
        int i2 = ((C1067h) c1063d).f4421u0;
        C1080f c1080f = this.f4486h;
        if (i2 == 1) {
            c1063d.f4297Y = c1080f.f4460g;
        } else {
            c1063d.f4298Z = c1080f.f4460g;
        }
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: f */
    public final void mo2653f() {
        this.f4486h.m2666c();
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: k */
    public final boolean mo2655k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m2677m(C1080f c1080f) {
        C1080f c1080f2 = this.f4486h;
        c1080f2.f4464k.add(c1080f);
        c1080f.f4465l.add(c1080f2);
    }
}
