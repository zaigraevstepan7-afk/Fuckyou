package p024N;

import android.view.WindowInsets;
import p000A.AbstractC0000a;
import p009F.C0076c;

/* JADX INFO: renamed from: N.n0 */
/* JADX INFO: loaded from: classes.dex */
public class C0275n0 extends AbstractC0279p0 {

    /* JADX INFO: renamed from: c */
    public final WindowInsets.Builder f854c;

    public C0275n0() {
        this.f854c = AbstractC0000a.m9f();
    }

    @Override // p024N.AbstractC0279p0
    /* JADX INFO: renamed from: b */
    public C0295x0 mo868b() {
        m889a();
        C0295x0 c0295x0M920g = C0295x0.m920g(null, AbstractC0000a.m11h(this.f854c));
        c0295x0M920g.f882a.mo900o(this.f856b);
        return c0295x0M920g;
    }

    @Override // p024N.AbstractC0279p0
    /* JADX INFO: renamed from: d */
    public void mo879d(C0076c c0076c) {
        AbstractC0000a.m2C(this.f854c, c0076c.m361d());
    }

    @Override // p024N.AbstractC0279p0
    /* JADX INFO: renamed from: e */
    public void mo869e(C0076c c0076c) {
        AbstractC0000a.m26w(this.f854c, c0076c.m361d());
    }

    @Override // p024N.AbstractC0279p0
    /* JADX INFO: renamed from: f */
    public void mo880f(C0076c c0076c) {
        AbstractC0000a.m0A(this.f854c, c0076c.m361d());
    }

    @Override // p024N.AbstractC0279p0
    /* JADX INFO: renamed from: g */
    public void mo870g(C0076c c0076c) {
        AbstractC0000a.m19p(this.f854c, c0076c.m361d());
    }

    @Override // p024N.AbstractC0279p0
    /* JADX INFO: renamed from: h */
    public void mo881h(C0076c c0076c) {
        AbstractC0000a.m3D(this.f854c, c0076c.m361d());
    }

    public C0275n0(C0295x0 c0295x0) {
        WindowInsets.Builder builderM9f;
        super(c0295x0);
        WindowInsets windowInsetsM925f = c0295x0.m925f();
        if (windowInsetsM925f != null) {
            builderM9f = AbstractC0000a.m10g(windowInsetsM925f);
        } else {
            builderM9f = AbstractC0000a.m9f();
        }
        this.f854c = builderM9f;
    }
}
