package p066g0;

/* JADX INFO: renamed from: g0.X */
/* JADX INFO: loaded from: classes.dex */
public final class C0735X {

    /* JADX INFO: renamed from: a */
    public int f2904a;

    /* JADX INFO: renamed from: b */
    public int f2905b;

    /* JADX INFO: renamed from: c */
    public int f2906c;

    /* JADX INFO: renamed from: d */
    public int f2907d;

    /* JADX INFO: renamed from: e */
    public int f2908e;

    /* JADX INFO: renamed from: f */
    public boolean f2909f;

    /* JADX INFO: renamed from: g */
    public boolean f2910g;

    /* JADX INFO: renamed from: h */
    public boolean f2911h;

    /* JADX INFO: renamed from: i */
    public boolean f2912i;

    /* JADX INFO: renamed from: j */
    public boolean f2913j;

    /* JADX INFO: renamed from: k */
    public boolean f2914k;

    /* JADX INFO: renamed from: l */
    public int f2915l;

    /* JADX INFO: renamed from: m */
    public long f2916m;

    /* JADX INFO: renamed from: n */
    public int f2917n;

    /* JADX INFO: renamed from: a */
    public final void m2034a(int i2) {
        if ((this.f2907d & i2) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.f2907d));
    }

    /* JADX INFO: renamed from: b */
    public final int m2035b() {
        return this.f2910g ? this.f2905b - this.f2906c : this.f2908e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2904a + ", mData=null, mItemCount=" + this.f2908e + ", mIsMeasuring=" + this.f2912i + ", mPreviousLayoutItemCount=" + this.f2905b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2906c + ", mStructureChanged=" + this.f2909f + ", mInPreLayout=" + this.f2910g + ", mRunSimpleAnimations=" + this.f2913j + ", mRunPredictiveAnimations=" + this.f2914k + '}';
    }
}
