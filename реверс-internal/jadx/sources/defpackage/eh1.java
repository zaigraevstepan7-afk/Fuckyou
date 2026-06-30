package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class eh1 extends fh1 implements Iterator {
    public dh1 e;
    public boolean f = true;
    public final /* synthetic */ s50 g;

    public eh1(s50 s50Var) {
        this.g = s50Var;
    }

    @Override // defpackage.fh1
    public final void a(dh1 dh1Var) {
        dh1 dh1Var2 = this.e;
        if (dh1Var == dh1Var2) {
            dh1 dh1Var3 = dh1Var2.h;
            this.e = dh1Var3;
            this.f = dh1Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f) {
            return this.g.e != null;
        }
        dh1 dh1Var = this.e;
        return (dh1Var == null || dh1Var.g == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f) {
            this.f = false;
            this.e = this.g.e;
        } else {
            dh1 dh1Var = this.e;
            this.e = dh1Var != null ? dh1Var.g : null;
        }
        return this.e;
    }
}
