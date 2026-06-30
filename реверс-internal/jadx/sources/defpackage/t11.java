package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class t11 extends sv0 implements av0 {
    public sa0 s;
    public long t;

    @Override // defpackage.sv0
    public final boolean A0() {
        return true;
    }

    @Override // defpackage.av0
    public final void c(long j) {
        if (vh0.a(this.t, j)) {
            return;
        }
        this.s.i(new vh0(j));
        this.t = j;
    }
}
