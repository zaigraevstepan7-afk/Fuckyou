package p024N;

import p001A0.AbstractC0016e;
import p009F.C0076c;

/* JADX INFO: renamed from: N.p0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0279p0 {

    /* JADX INFO: renamed from: a */
    public final C0295x0 f855a;

    /* JADX INFO: renamed from: b */
    public C0076c[] f856b;

    public AbstractC0279p0() {
        this(new C0295x0());
    }

    /* JADX INFO: renamed from: a */
    public final void m889a() {
        C0076c[] c0076cArr = this.f856b;
        if (c0076cArr != null) {
            C0076c c0076cMo896f = c0076cArr[0];
            C0076c c0076cMo896f2 = c0076cArr[1];
            C0295x0 c0295x0 = this.f855a;
            if (c0076cMo896f2 == null) {
                c0076cMo896f2 = c0295x0.f882a.mo896f(2);
            }
            if (c0076cMo896f == null) {
                c0076cMo896f = c0295x0.f882a.mo896f(1);
            }
            mo870g(C0076c.m358a(c0076cMo896f, c0076cMo896f2));
            C0076c c0076c = this.f856b[AbstractC0016e.m170a0(16)];
            if (c0076c != null) {
                mo880f(c0076c);
            }
            C0076c c0076c2 = this.f856b[AbstractC0016e.m170a0(32)];
            if (c0076c2 != null) {
                mo879d(c0076c2);
            }
            C0076c c0076c3 = this.f856b[AbstractC0016e.m170a0(64)];
            if (c0076c3 != null) {
                mo881h(c0076c3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract C0295x0 mo868b();

    /* JADX INFO: renamed from: c */
    public void mo887c(int i2, C0076c c0076c) {
        if (this.f856b == null) {
            this.f856b = new C0076c[9];
        }
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                this.f856b[AbstractC0016e.m170a0(i3)] = c0076c;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo869e(C0076c c0076c);

    /* JADX INFO: renamed from: g */
    public abstract void mo870g(C0076c c0076c);

    public AbstractC0279p0(C0295x0 c0295x0) {
        this.f855a = c0295x0;
    }

    /* JADX INFO: renamed from: d */
    public void mo879d(C0076c c0076c) {
    }

    /* JADX INFO: renamed from: f */
    public void mo880f(C0076c c0076c) {
    }

    /* JADX INFO: renamed from: h */
    public void mo881h(C0076c c0076c) {
    }
}
