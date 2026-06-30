package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ff0 extends y {
    public final f0 e;
    public final int f;
    public final int g;

    public ff0(f0 f0Var, int i, int i2) {
        this.e = f0Var;
        this.f = i;
        lk.w(i, i2, f0Var.a());
        this.g = i2 - i;
    }

    @Override // defpackage.o
    public final int a() {
        return this.g;
    }

    @Override // java.util.List
    public final Object get(int i) {
        lk.u(i, this.g);
        return this.e.get(this.f + i);
    }

    @Override // defpackage.y, java.util.List
    public final List subList(int i, int i2) {
        lk.w(i, i2, this.g);
        int i3 = this.f;
        return new ff0(this.e, i + i3, i3 + i2);
    }
}
