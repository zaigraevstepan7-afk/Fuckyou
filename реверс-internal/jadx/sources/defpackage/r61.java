package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class r61 extends z {
    public final p61 g;
    public int h;
    public l22 i;
    public int j;

    public r61(p61 p61Var, int i) {
        super(i, p61Var.l);
        this.g = p61Var;
        this.h = p61Var.f();
        this.j = -1;
        b();
    }

    public final void a() {
        if (this.h != this.g.f()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.z, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.e;
        p61 p61Var = this.g;
        p61Var.add(i, obj);
        this.e++;
        this.f = p61Var.a();
        this.h = p61Var.f();
        this.j = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        p61 p61Var = this.g;
        Object[] objArr = p61Var.j;
        if (objArr == null) {
            this.i = null;
            return;
        }
        int i = (p61Var.l - 1) & (-32);
        int i2 = this.e;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (p61Var.h / 5) + 1;
        l22 l22Var = this.i;
        if (l22Var == null) {
            this.i = new l22(objArr, i2, i, i3);
            return;
        }
        l22Var.e = i2;
        l22Var.f = i;
        l22Var.g = i3;
        if (l22Var.h.length < i3) {
            l22Var.h = new Object[i3];
        }
        l22Var.h[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        l22Var.i = r0;
        l22Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            yc.m();
            return null;
        }
        int i = this.e;
        this.j = i;
        l22 l22Var = this.i;
        p61 p61Var = this.g;
        if (l22Var == null) {
            Object[] objArr = p61Var.k;
            this.e = i + 1;
            return objArr[i];
        }
        if (l22Var.hasNext()) {
            this.e++;
            return l22Var.next();
        }
        Object[] objArr2 = p61Var.k;
        int i2 = this.e;
        this.e = i2 + 1;
        return objArr2[i2 - l22Var.f];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            yc.m();
            return null;
        }
        int i = this.e;
        this.j = i - 1;
        l22 l22Var = this.i;
        p61 p61Var = this.g;
        if (l22Var == null) {
            Object[] objArr = p61Var.k;
            int i2 = i - 1;
            this.e = i2;
            return objArr[i2];
        }
        int i3 = l22Var.f;
        if (i <= i3) {
            this.e = i - 1;
            return l22Var.previous();
        }
        Object[] objArr2 = p61Var.k;
        int i4 = i - 1;
        this.e = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.z, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.j;
        if (i == -1) {
            throw new IllegalStateException();
        }
        p61 p61Var = this.g;
        p61Var.b(i);
        int i2 = this.j;
        if (i2 < this.e) {
            this.e = i2;
        }
        this.f = p61Var.a();
        this.h = p61Var.f();
        this.j = -1;
        b();
    }

    @Override // defpackage.z, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.j;
        if (i == -1) {
            throw new IllegalStateException();
        }
        p61 p61Var = this.g;
        p61Var.set(i, obj);
        this.h = p61Var.f();
        b();
    }
}
