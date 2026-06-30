package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pn0 implements vu0 {
    public final qn0 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final vu0 e;
    public final float f;
    public final boolean g;
    public final vt h;
    public final hx i;
    public final long j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final k31 o;
    public final int p;
    public final int q;

    public pn0(qn0 qn0Var, int i, boolean z, float f, vu0 vu0Var, float f2, boolean z2, vt vtVar, hx hxVar, long j, List list, int i2, int i3, int i4, k31 k31Var, int i5, int i6) {
        this.a = qn0Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = vu0Var;
        this.f = f2;
        this.g = z2;
        this.h = vtVar;
        this.i = hxVar;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = k31Var;
        this.p = i5;
        this.q = i6;
    }

    @Override // defpackage.vu0
    public final Map a() {
        return this.e.a();
    }

    @Override // defpackage.vu0
    public final void b() {
        this.e.b();
    }

    @Override // defpackage.vu0
    public final wa0 c() {
        return this.e.c();
    }

    @Override // defpackage.vu0
    public final int d() {
        return this.e.d();
    }

    @Override // defpackage.vu0
    public final sa0 e() {
        return this.e.e();
    }

    @Override // defpackage.vu0
    public final sa0 f() {
        return this.e.f();
    }

    @Override // defpackage.vu0
    public final int g() {
        return this.e.g();
    }

    public final pn0 h(int i, boolean z) {
        qn0 qn0Var;
        if (this.g) {
            return null;
        }
        List list = this.k;
        if (list.isEmpty() || (qn0Var = this.a) == null) {
            return null;
        }
        int iA = qn0Var.a();
        int i2 = this.b - i;
        if (i2 < 0 || i2 >= iA) {
            return null;
        }
        qn0 qn0Var2 = (qn0) pl.c0(list);
        qn0 qn0Var3 = (qn0) pl.i0(list);
        if (qn0Var2.o || qn0Var3.o) {
            return null;
        }
        int i3 = qn0Var2.j;
        int i4 = this.m;
        int i5 = this.l;
        if (i < 0) {
            if (Math.min((qn0Var2.a() + i3) - i5, (qn0Var3.a() + qn0Var3.j) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - i3, i4 - qn0Var3.j) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            qn0 qn0Var4 = (qn0) list.get(i6);
            qn0Var4.getClass();
            int[] iArr = qn0Var4.q;
            if (!qn0Var4.o) {
                qn0Var4.j += i;
                int length = iArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    if ((i7 & 1) != 0) {
                        iArr[i7] = iArr[i7] + i;
                    }
                }
                if (z) {
                    int size2 = qn0Var4.b.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        s91.t(((zx0) qn0Var4.i.a).g(qn0Var4.g));
                    }
                }
            }
        }
        return new pn0(this.a, i2, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, list, this.l, this.m, this.n, this.o, this.p, this.q);
    }

    public final long i() {
        vu0 vu0Var = this.e;
        return (((long) vu0Var.g()) << 32) | (((long) vu0Var.d()) & 4294967295L);
    }
}
