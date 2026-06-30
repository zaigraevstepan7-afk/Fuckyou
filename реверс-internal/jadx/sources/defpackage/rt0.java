package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class rt0 extends tt0 implements Iterator, yj0 {
    public final /* synthetic */ int i;

    public rt0(ut0 ut0Var, int i) {
        this.i = i;
        ut0Var.getClass();
        this.h = ut0Var;
        this.f = -1;
        this.g = ut0Var.l;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.i) {
            case 0:
                b();
                int i = this.e;
                ut0 ut0Var = (ut0) this.h;
                if (i >= ut0Var.j) {
                    yc.m();
                } else {
                    this.e = i + 1;
                    this.f = i;
                    st0 st0Var = new st0(ut0Var, i);
                    c();
                }
                break;
            case 1:
                b();
                int i2 = this.e;
                ut0 ut0Var2 = (ut0) this.h;
                if (i2 >= ut0Var2.j) {
                    yc.m();
                } else {
                    this.e = i2 + 1;
                    this.f = i2;
                    Object obj = ut0Var2.e[i2];
                    c();
                }
                break;
            default:
                b();
                int i3 = this.e;
                ut0 ut0Var3 = (ut0) this.h;
                if (i3 >= ut0Var3.j) {
                    yc.m();
                } else {
                    this.e = i3 + 1;
                    this.f = i3;
                    Object[] objArr = ut0Var3.f;
                    objArr.getClass();
                    Object obj2 = objArr[this.f];
                    c();
                }
                break;
        }
        return null;
    }
}
