package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class f61 extends d61 {
    public final e61 h;
    public Object i;
    public boolean j;
    public int k;

    public f61(e61 e61Var, n22[] n22VarArr) {
        super(e61Var.g, n22VarArr);
        this.h = e61Var;
        this.k = e61Var.i;
    }

    public final void c(int i, m22 m22Var, Object obj, int i2) {
        int i3 = i2 * 5;
        n22[] n22VarArr = this.e;
        if (i3 <= 30) {
            int iY = 1 << xc.y(i, i3);
            if (m22Var.h(iY)) {
                n22VarArr[i2].a(m22Var.d, Integer.bitCount(m22Var.a) * 2, m22Var.f(iY));
                this.f = i2;
                return;
            } else {
                int iT = m22Var.t(iY);
                m22 m22VarS = m22Var.s(iT);
                n22VarArr[i2].a(m22Var.d, Integer.bitCount(m22Var.a) * 2, iT);
                c(i, m22VarS, obj, i2 + 1);
                return;
            }
        }
        n22 n22Var = n22VarArr[i2];
        Object[] objArr = m22Var.d;
        n22Var.a(objArr, objArr.length, 0);
        while (true) {
            n22 n22Var2 = n22VarArr[i2];
            if (xi0.o(n22Var2.e[n22Var2.g], obj)) {
                this.f = i2;
                return;
            } else {
                n22VarArr[i2].g += 2;
            }
        }
    }

    @Override // defpackage.d61, java.util.Iterator
    public final Object next() {
        if (this.h.i != this.k) {
            throw new ConcurrentModificationException();
        }
        if (!this.g) {
            yc.m();
            return null;
        }
        n22 n22Var = this.e[this.f];
        this.i = n22Var.e[n22Var.g];
        this.j = true;
        return super.next();
    }

    @Override // defpackage.d61, java.util.Iterator
    public final void remove() {
        if (!this.j) {
            throw new IllegalStateException();
        }
        boolean z = this.g;
        e61 e61Var = this.h;
        if (!z) {
            s22.h(e61Var).remove(this.i);
        } else {
            if (!z) {
                yc.m();
                return;
            }
            n22 n22Var = this.e[this.f];
            Object obj = n22Var.e[n22Var.g];
            s22.h(e61Var).remove(this.i);
            c(obj != null ? obj.hashCode() : 0, e61Var.g, obj, 0);
        }
        this.i = null;
        this.j = false;
        this.k = e61Var.i;
    }
}
