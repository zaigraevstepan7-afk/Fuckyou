package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class h01 {
    public final iy0 a = new iy0(new uz0[16]);
    public final sx0 b = new sx0(10);

    public boolean a(qs0 qs0Var, zk0 zk0Var, xg0 xg0Var, boolean z) {
        iy0 iy0Var = this.a;
        Object[] objArr = iy0Var.e;
        int i = iy0Var.g;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((uz0) objArr[i2]).a(qs0Var, zk0Var, xg0Var, z) || z2;
        }
        return z2;
    }

    public void b(xg0 xg0Var) {
        iy0 iy0Var = this.a;
        int i = iy0Var.g;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((uz0) iy0Var.e[i]).d.a == 0) {
                iy0Var.k(i);
            }
        }
    }
}
