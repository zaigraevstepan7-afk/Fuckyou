package p024N;

import android.view.WindowInsets;
import p009F.C0076c;

/* JADX INFO: renamed from: N.r0 */
/* JADX INFO: loaded from: classes.dex */
public class C0283r0 extends AbstractC0281q0 {

    /* JADX INFO: renamed from: m */
    public C0076c f869m;

    public C0283r0(C0295x0 c0295x0, WindowInsets windowInsets) {
        super(c0295x0, windowInsets);
        this.f869m = null;
    }

    @Override // p024N.C0291v0
    /* JADX INFO: renamed from: b */
    public C0295x0 mo904b() {
        return C0295x0.m920g(null, this.f864c.consumeStableInsets());
    }

    @Override // p024N.C0291v0
    /* JADX INFO: renamed from: c */
    public C0295x0 mo905c() {
        return C0295x0.m920g(null, this.f864c.consumeSystemWindowInsets());
    }

    @Override // p024N.C0291v0
    /* JADX INFO: renamed from: h */
    public final C0076c mo906h() {
        if (this.f869m == null) {
            WindowInsets windowInsets = this.f864c;
            this.f869m = C0076c.m359b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f869m;
    }

    @Override // p024N.C0291v0
    /* JADX INFO: renamed from: m */
    public boolean mo907m() {
        return this.f864c.isConsumed();
    }

    @Override // p024N.C0291v0
    /* JADX INFO: renamed from: q */
    public void mo908q(C0076c c0076c) {
        this.f869m = c0076c;
    }
}
