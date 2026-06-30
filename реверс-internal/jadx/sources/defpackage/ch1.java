package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ch1 extends fh1 implements Iterator {
    public dh1 e;
    public dh1 f;
    public final /* synthetic */ int g;

    public ch1(dh1 dh1Var, dh1 dh1Var2, int i) {
        this.g = i;
        this.e = dh1Var2;
        this.f = dh1Var;
    }

    @Override // defpackage.fh1
    public final void a(dh1 dh1Var) {
        dh1 dh1Var2;
        dh1 dh1VarB = null;
        if (this.e == dh1Var && dh1Var == this.f) {
            this.f = null;
            this.e = null;
        }
        dh1 dh1Var3 = this.e;
        if (dh1Var3 == dh1Var) {
            switch (this.g) {
                case 0:
                    dh1Var2 = dh1Var3.h;
                    break;
                default:
                    dh1Var2 = dh1Var3.g;
                    break;
            }
            this.e = dh1Var2;
        }
        dh1 dh1Var4 = this.f;
        if (dh1Var4 == dh1Var) {
            dh1 dh1Var5 = this.e;
            if (dh1Var4 != dh1Var5 && dh1Var5 != null) {
                dh1VarB = b(dh1Var4);
            }
            this.f = dh1VarB;
        }
    }

    public final dh1 b(dh1 dh1Var) {
        switch (this.g) {
            case 0:
                return dh1Var.g;
            default:
                return dh1Var.h;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        dh1 dh1Var = this.f;
        dh1 dh1Var2 = this.e;
        this.f = (dh1Var == dh1Var2 || dh1Var2 == null) ? null : b(dh1Var);
        return dh1Var;
    }
}
