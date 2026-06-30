package p036T;

/* JADX INFO: renamed from: T.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0371a {

    /* JADX INFO: renamed from: a */
    public int f1013a;

    /* JADX INFO: renamed from: b */
    public int f1014b;

    /* JADX INFO: renamed from: c */
    public float f1015c;

    /* JADX INFO: renamed from: d */
    public float f1016d;

    /* JADX INFO: renamed from: e */
    public long f1017e;

    /* JADX INFO: renamed from: f */
    public long f1018f;

    /* JADX INFO: renamed from: g */
    public long f1019g;

    /* JADX INFO: renamed from: h */
    public float f1020h;

    /* JADX INFO: renamed from: i */
    public int f1021i;

    /* JADX INFO: renamed from: a */
    public final float m1002a(long j2) {
        if (j2 < this.f1017e) {
            return 0.0f;
        }
        long j3 = this.f1019g;
        if (j3 < 0 || j2 < j3) {
            return ViewOnTouchListenerC0377g.m1016b((j2 - r0) / this.f1013a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f1020h;
        return (ViewOnTouchListenerC0377g.m1016b((j2 - j3) / this.f1021i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
