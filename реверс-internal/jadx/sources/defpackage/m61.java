package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class m61 extends o {
    public final c61 e;

    public m61(c61 c61Var) {
        this.e = c61Var;
    }

    @Override // defpackage.o
    public final int a() {
        c61 c61Var = this.e;
        c61Var.getClass();
        return c61Var.f;
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.e.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        m22 m22Var = this.e.e;
        n22[] n22VarArr = new n22[8];
        for (int i = 0; i < 8; i++) {
            n22VarArr[i] = new o22(2);
        }
        return new l61(m22Var, n22VarArr);
    }
}
