package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wm0 implements ns1 {
    public final v41 e;
    public int f;

    public wm0(int i) {
        int i2 = (i / 30) * 30;
        this.e = new v41(lk.o0(Math.max(i2 - 100, 0), i2 + 130), l91.p);
        this.f = i;
    }

    @Override // defpackage.ns1
    public final Object getValue() {
        return (rh0) this.e.getValue();
    }
}
