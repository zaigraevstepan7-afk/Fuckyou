package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qp1 implements Iterator {
    public int e = -1;
    public boolean f;
    public Iterator g;
    public final /* synthetic */ op1 h;

    public qp1(op1 op1Var) {
        this.h = op1Var;
    }

    public final Iterator a() {
        if (this.g == null) {
            this.g = this.h.f.entrySet().iterator();
        }
        return this.g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.e + 1;
        op1 op1Var = this.h;
        return i < op1Var.e.size() || (!op1Var.f.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f = true;
        int i = this.e + 1;
        this.e = i;
        op1 op1Var = this.h;
        return i < op1Var.e.size() ? (Map.Entry) op1Var.e.get(this.e) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f) {
            yc.l("remove() was called before next()");
            return;
        }
        this.f = false;
        int i = op1.j;
        op1 op1Var = this.h;
        op1Var.b();
        if (this.e >= op1Var.e.size()) {
            a().remove();
            return;
        }
        int i2 = this.e;
        this.e = i2 - 1;
        op1Var.h(i2);
    }
}
