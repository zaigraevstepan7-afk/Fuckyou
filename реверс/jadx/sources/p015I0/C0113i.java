package p015I0;

/* JADX INFO: renamed from: I0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0113i extends C0109e {

    /* JADX INFO: renamed from: j */
    public final C0110f f368j;

    /* JADX INFO: renamed from: k */
    public final float f369k;

    public C0113i(C0110f c0110f, float f) {
        super(0);
        this.f368j = c0110f;
        this.f369k = f;
    }

    @Override // p015I0.C0109e
    /* JADX INFO: renamed from: c */
    public final boolean mo459c() {
        return true;
    }

    @Override // p015I0.C0109e
    /* JADX INFO: renamed from: d */
    public final void mo460d(float f, float f2, float f3, C0127w c0127w) {
        this.f368j.mo460d(f, f2 - this.f369k, f3, c0127w);
    }
}
