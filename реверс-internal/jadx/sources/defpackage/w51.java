package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class w51 implements id1 {
    public final Set e;
    public final iy0 f = new iy0(new sb0[16]);

    public w51(Set set) {
        this.e = set;
    }

    @Override // defpackage.id1
    public final void c() {
        iy0 iy0Var = this.f;
        Object[] objArr = iy0Var.e;
        int i = iy0Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            id1 id1Var = ((sb0) objArr[i2]).a;
            this.e.remove(id1Var);
            id1Var.c();
        }
    }

    @Override // defpackage.id1
    public final void d() {
    }

    @Override // defpackage.id1
    public final void e() {
    }
}
