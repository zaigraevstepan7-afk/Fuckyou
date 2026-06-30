package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qn0 {
    public final int a;
    public final List b;
    public final sf c;
    public final al0 d;
    public final int e;
    public final long f;
    public final Object g;
    public final Object h;
    public final qm0 i;
    public int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public boolean o;
    public int p = Integer.MIN_VALUE;
    public final int[] q;

    public qn0(int i, List list, sf sfVar, al0 al0Var, int i2, int i3, int i4, long j, Object obj, Object obj2, qm0 qm0Var, long j2) {
        this.a = i;
        this.b = list;
        this.c = sfVar;
        this.d = al0Var;
        this.e = i4;
        this.f = j;
        this.g = obj;
        this.h = obj2;
        this.i = qm0Var;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            z61 z61Var = (z61) list.get(i6);
            i5 += z61Var.f;
            iMax = Math.max(iMax, z61Var.e);
        }
        this.k = i5;
        this.n = iMax;
        this.q = new int[this.b.size() * 2];
        this.m = this.e;
        this.l = i5;
    }

    public final int a() {
        int i = this.l + this.m;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final long b(int i) {
        if (i == 0 && this.b.size() == 0) {
            return ((long) this.j) & 4294967295L;
        }
        int i2 = i * 2;
        int[] iArr = this.q;
        int i3 = iArr[i2];
        return (((long) iArr[i2 + 1]) & 4294967295L) | (((long) i3) << 32);
    }

    public final void c(y61 y61Var) {
        zz0 zz0Var = zz0.q;
        if (this.p == Integer.MIN_VALUE) {
            qg0.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            z61 z61Var = (z61) list.get(i);
            int i2 = z61Var.f;
            long jB = b(i);
            s91.t(((zx0) this.i.a).g(this.g));
            long jC = oh0.c(jB, this.f);
            int i3 = a71.b;
            y61Var.getClass();
            y61.a(y61Var, z61Var);
            z61Var.k0(oh0.c(jC, z61Var.i), 0.0f, zz0Var);
        }
    }

    public final void d(int i, int i2, int i3) {
        this.j = i;
        this.p = i3;
        List list = this.b;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            z61 z61Var = (z61) list.get(i4);
            int i5 = i4 * 2;
            sf sfVar = this.c;
            if (sfVar == null) {
                throw s91.v("null horizontalAlignment when isVertical == true");
            }
            int iA = sfVar.a(z61Var.e, i2, this.d);
            int[] iArr = this.q;
            iArr[i5] = iA;
            iArr[i5 + 1] = i;
            i += z61Var.f;
        }
    }
}
