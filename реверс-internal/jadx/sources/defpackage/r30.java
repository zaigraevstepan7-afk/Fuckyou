package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class r30 implements q30 {
    public final int e;
    public int f = -1;
    public int g = -1;

    public r30(int i) {
        this.e = i;
    }

    @Override // defpackage.q30
    public final boolean b(CharSequence charSequence, int i, int i2, a32 a32Var) {
        int i3 = this.e;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.f = i;
        this.g = i2;
        return false;
    }

    @Override // defpackage.q30
    public final Object a() {
        return this;
    }
}
