package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class x extends y implements RandomAccess {
    public final y e;
    public final int f;
    public final int g;

    public x(y yVar, int i, int i2) {
        this.e = yVar;
        this.f = i;
        xi0.s(i, i2, yVar.a());
        this.g = i2 - i;
    }

    @Override // defpackage.o
    public final int a() {
        return this.g;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.g;
        if (i < 0 || i >= i2) {
            yc.o(s91.j("index: ", i, ", size: ", i2));
            return null;
        }
        return this.e.get(this.f + i);
    }

    @Override // defpackage.y, java.util.List
    public final List subList(int i, int i2) {
        xi0.s(i, i2, this.g);
        int i3 = this.f;
        return new x(this.e, i + i3, i3 + i2);
    }
}
