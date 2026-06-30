package p024N;

import android.view.WindowInsets;
import p000A.AbstractC0000a;
import p009F.C0076c;

/* JADX INFO: renamed from: N.t0 */
/* JADX INFO: loaded from: classes.dex */
public class C0287t0 extends C0285s0 {

    /* JADX INFO: renamed from: n */
    public C0076c f870n;

    /* JADX INFO: renamed from: o */
    public C0076c f871o;

    /* JADX INFO: renamed from: p */
    public C0076c f872p;

    public C0287t0(C0295x0 c0295x0, WindowInsets windowInsets) {
        super(c0295x0, windowInsets);
        this.f870n = null;
        this.f871o = null;
        this.f872p = null;
    }

    @Override // p024N.C0291v0
    /* JADX INFO: renamed from: g */
    public C0076c mo911g() {
        if (this.f871o == null) {
            this.f871o = C0076c.m360c(AbstractC0000a.m23t(this.f864c));
        }
        return this.f871o;
    }

    @Override // p024N.C0291v0
    /* JADX INFO: renamed from: i */
    public C0076c mo912i() {
        if (this.f870n == null) {
            this.f870n = C0076c.m360c(AbstractC0000a.m27x(this.f864c));
        }
        return this.f870n;
    }

    @Override // p024N.C0291v0
    /* JADX INFO: renamed from: k */
    public C0076c mo913k() {
        if (this.f872p == null) {
            this.f872p = C0076c.m360c(AbstractC0000a.m6c(this.f864c));
        }
        return this.f872p;
    }

    @Override // p024N.AbstractC0281q0, p024N.C0291v0
    /* JADX INFO: renamed from: l */
    public C0295x0 mo898l(int i2, int i3, int i4, int i5) {
        return C0295x0.m920g(null, AbstractC0000a.m12i(this.f864c, i2, i3, i4, i5));
    }

    @Override // p024N.C0283r0, p024N.C0291v0
    /* JADX INFO: renamed from: q */
    public void mo908q(C0076c c0076c) {
    }
}
