package p024N;

import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: N.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0265i0 extends AbstractC0267j0 {

    /* JADX INFO: renamed from: e */
    public final WindowInsetsAnimation f828e;

    public C0265i0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f828e = windowInsetsAnimation;
    }

    @Override // p024N.AbstractC0267j0
    /* JADX INFO: renamed from: a */
    public final long mo833a() {
        return this.f828e.getDurationMillis();
    }

    @Override // p024N.AbstractC0267j0
    /* JADX INFO: renamed from: b */
    public final float mo834b() {
        return this.f828e.getInterpolatedFraction();
    }

    @Override // p024N.AbstractC0267j0
    /* JADX INFO: renamed from: c */
    public final int mo835c() {
        return this.f828e.getTypeMask();
    }

    @Override // p024N.AbstractC0267j0
    /* JADX INFO: renamed from: d */
    public final void mo836d(float f) {
        this.f828e.setFraction(f);
    }
}
