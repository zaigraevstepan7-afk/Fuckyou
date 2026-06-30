package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class o50 implements z01 {
    public int e;
    public int f;

    public /* synthetic */ o50(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.z01
    public int e(int i) {
        if (i >= 0 && i <= this.f) {
            s22.U(i, this.e, i);
        }
        return i;
    }

    @Override // defpackage.z01
    public int g(int i) {
        if (i >= 0 && i <= this.e) {
            s22.T(i, this.f, i);
        }
        return i;
    }
}
