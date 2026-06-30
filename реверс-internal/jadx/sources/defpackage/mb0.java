package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class mb0 extends op {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final ay0 e;
    public final v41 f;
    public final /* synthetic */ ob0 g;

    public mb0(ob0 ob0Var, long j, boolean z, boolean z2, qt0 qt0Var) {
        this.g = ob0Var;
        this.a = j;
        this.b = z;
        this.c = z2;
        ay0 ay0Var = qi1.a;
        this.e = new ay0();
        this.f = new v41(b61.h, l91.f);
    }

    @Override // defpackage.op
    public final void a(tp tpVar, wa0 wa0Var) {
        this.g.b.a(tpVar, wa0Var);
    }

    @Override // defpackage.op
    public final ay0 b(tp tpVar, yn1 yn1Var, wa0 wa0Var) {
        return this.g.b.b(tpVar, yn1Var, wa0Var);
    }

    @Override // defpackage.op
    public final void c() {
        ob0 ob0Var = this.g;
        ob0Var.A--;
    }

    @Override // defpackage.op
    public final boolean d() {
        return this.g.b.d();
    }

    @Override // defpackage.op
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.op
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.op
    public final long g() {
        return this.a;
    }

    @Override // defpackage.op
    public final np h() {
        return this.g.h;
    }

    @Override // defpackage.op
    public final b61 i() {
        return (b61) this.f.getValue();
    }

    @Override // defpackage.op
    public final lt j() {
        return this.g.b.j();
    }

    @Override // defpackage.op
    public final boolean k() {
        return this.g.b.k();
    }

    @Override // defpackage.op
    public final void l(tp tpVar) {
        ob0 ob0Var = this.g;
        ob0Var.b.l(ob0Var.h);
        ob0Var.b.l(tpVar);
    }

    @Override // defpackage.op
    public final rw0 m(sw0 sw0Var) {
        return this.g.b.m(sw0Var);
    }

    @Override // defpackage.op
    public final ay0 n(tp tpVar, yn1 yn1Var, ay0 ay0Var) {
        return this.g.b.n(tpVar, yn1Var, ay0Var);
    }

    @Override // defpackage.op
    public final void o(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.op
    public final void p(ob0 ob0Var) {
        this.e.a(ob0Var);
    }

    @Override // defpackage.op
    public final void q(dc1 dc1Var) {
        this.g.b.q(dc1Var);
    }

    @Override // defpackage.op
    public final void r(tp tpVar) {
        this.g.b.r(tpVar);
    }

    @Override // defpackage.op
    public final zi s(a7 a7Var) {
        return this.g.b.s(a7Var);
    }

    @Override // defpackage.op
    public final void t() {
        this.g.A++;
    }

    @Override // defpackage.op
    public final void u(ob0 ob0Var) {
        HashSet<Set> hashSet = this.d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                ob0Var.getClass();
                set.remove(ob0Var.v());
            }
        }
        if (ob0Var != null) {
            this.e.l(ob0Var);
        }
    }

    @Override // defpackage.op
    public final void v(tp tpVar) {
        this.g.b.v(tpVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w() {
        ay0 ay0Var = this.e;
        if (ay0Var.h()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                Object[] objArr = ay0Var.b;
                long[] jArr = ay0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ob0 ob0Var = (ob0) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(ob0Var.v());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            ay0Var.b();
        }
    }
}
