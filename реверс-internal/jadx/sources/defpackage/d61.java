package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d61 implements Iterator, yj0 {
    public final n22[] e;
    public int f;
    public boolean g = true;

    public d61(m22 m22Var, n22[] n22VarArr) {
        this.e = n22VarArr;
        n22VarArr[0].a(m22Var.d, Integer.bitCount(m22Var.a) * 2, 0);
        this.f = 0;
        a();
    }

    public final void a() {
        int i = this.f;
        n22[] n22VarArr = this.e;
        n22 n22Var = n22VarArr[i];
        if (n22Var.g < n22Var.f) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                n22 n22Var2 = n22VarArr[i];
                int i2 = n22Var2.g;
                Object[] objArr = n22Var2.e;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    n22Var2.g = i2 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.f = iB;
                return;
            }
            if (i > 0) {
                n22 n22Var3 = n22VarArr[i - 1];
                int i3 = n22Var3.g;
                int length2 = n22Var3.e.length;
                n22Var3.g = i3 + 1;
            }
            n22VarArr[i].a(m22.e.d, 0, 0);
            i--;
        }
        this.g = false;
    }

    public final int b(int i) {
        n22[] n22VarArr = this.e;
        n22 n22Var = n22VarArr[i];
        int i2 = n22Var.g;
        if (i2 < n22Var.f) {
            return i;
        }
        Object[] objArr = n22Var.e;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        m22 m22Var = (m22) obj;
        if (i == 6) {
            n22 n22Var2 = n22VarArr[i + 1];
            Object[] objArr2 = m22Var.d;
            n22Var2.a(objArr2, objArr2.length, 0);
        } else {
            n22VarArr[i + 1].a(m22Var.d, Integer.bitCount(m22Var.a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.g) {
            yc.m();
            return null;
        }
        Object next = this.e[this.f].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
