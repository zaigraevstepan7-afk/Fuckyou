package p024N;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: N.j0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0267j0 {

    /* JADX INFO: renamed from: a */
    public final int f830a;

    /* JADX INFO: renamed from: b */
    public float f831b;

    /* JADX INFO: renamed from: c */
    public final Interpolator f832c;

    /* JADX INFO: renamed from: d */
    public final long f833d;

    public AbstractC0267j0(int i2, Interpolator interpolator, long j2) {
        this.f830a = i2;
        this.f832c = interpolator;
        this.f833d = j2;
    }

    /* JADX INFO: renamed from: a */
    public long mo833a() {
        return this.f833d;
    }

    /* JADX INFO: renamed from: b */
    public float mo834b() {
        Interpolator interpolator = this.f832c;
        return interpolator != null ? interpolator.getInterpolation(this.f831b) : this.f831b;
    }

    /* JADX INFO: renamed from: c */
    public int mo835c() {
        return this.f830a;
    }

    /* JADX INFO: renamed from: d */
    public void mo836d(float f) {
        this.f831b = f;
    }
}
