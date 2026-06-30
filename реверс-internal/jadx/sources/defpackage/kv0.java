package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class kv0 {
    public final SparseArray a;
    public a32 b;

    public kv0(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(a32 a32Var, int i, int i2) {
        int iA = a32Var.a(i);
        SparseArray sparseArray = this.a;
        kv0 kv0Var = sparseArray == null ? null : (kv0) sparseArray.get(iA);
        if (kv0Var == null) {
            kv0Var = new kv0(1);
            sparseArray.put(a32Var.a(i), kv0Var);
        }
        if (i2 > i) {
            kv0Var.a(a32Var, i + 1, i2);
        } else {
            kv0Var.b = a32Var;
        }
    }
}
