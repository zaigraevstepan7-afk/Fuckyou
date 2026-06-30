package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cz0 {
    public final qs1 a = c2.g(dz0.d);
    public final qs1 b;
    public final bc1 c;
    public final fd d;
    public final fd e;
    public yy0 f;
    public int g;
    public bz0 h;
    public final tx0 i;
    public final tx0 j;
    public final tx0 k;
    public boolean l;
    public boolean m;
    public boolean n;

    public cz0() {
        qs1 qs1VarG = c2.g(new zy0());
        this.b = qs1VarG;
        this.c = xk.e(qs1VarG);
        this.d = new fd();
        this.e = new fd();
        this.i = j31.a();
        this.j = j31.a();
        this.k = j31.a();
    }

    public final void a(wy0 wy0Var, bz0 bz0Var, int i) {
        wy0Var.getClass();
        if (bz0Var.a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.k).g(bz0Var);
            bz0Var.a = wy0Var;
            ((zy0) this.c.e.getValue()).getClass();
            bz0Var.b(i != 0 ? i != 1 ? this.n : this.l : this.m);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(bz0Var);
        wy0 wy0Var2 = bz0Var.a;
        sb.append("' is already added to dispatcher ");
        sb.append(wy0Var2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        long j;
        zy0 zy0Var;
        fd fdVar = this.d;
        if (fdVar == null || !fdVar.isEmpty()) {
            Iterator it = fdVar.iterator();
            while (it.hasNext()) {
                if (((yy0) it.next()).a()) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        fd fdVar2 = this.e;
        if (fdVar2 == null || !fdVar2.isEmpty()) {
            Iterator it2 = fdVar2.iterator();
            while (it2.hasNext()) {
                if (((yy0) it2.next()).a()) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        tx0 tx0Var = this.k;
        char c = 31;
        if (z4) {
            Object[] objArr = tx0Var.b;
            long[] jArr = tx0Var.c;
            j = 2147483647L;
            int i = tx0Var.e;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
                ((bz0) objArr[i]).b(z);
                i = i2;
                fdVar = fdVar;
            }
        } else {
            j = 2147483647L;
        }
        fd fdVar3 = fdVar;
        tx0 tx0Var2 = this.j;
        if (z5) {
            Object[] objArr2 = tx0Var2.b;
            long[] jArr2 = tx0Var2.c;
            int i3 = tx0Var2.e;
            while (i3 != Integer.MAX_VALUE) {
                int i4 = (int) ((jArr2[i3] >> c) & j);
                ((bz0) objArr2[i3]).b(z2);
                c = c;
                i3 = i4;
            }
        }
        char c2 = c;
        tx0 tx0Var3 = this.i;
        if (z6) {
            Object[] objArr3 = tx0Var3.b;
            long[] jArr3 = tx0Var3.c;
            int i5 = tx0Var3.e;
            while (i5 != Integer.MAX_VALUE) {
                int i6 = (int) ((jArr3[i5] >> c2) & j);
                ((bz0) objArr3[i5]).b(z3);
                i5 = i6;
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        yy0 yy0VarC = this.f;
        if (yy0VarC == null) {
            yy0VarC = c(0);
        }
        yy0 yy0VarC2 = this.f;
        if (yy0VarC2 == null) {
            yy0VarC2 = c(0);
        }
        if (xi0.o(yy0VarC2, yy0VarC)) {
            if (yy0VarC2 == null) {
                zy0Var = new zy0();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it3 = fdVar3.iterator();
                while (it3.hasNext()) {
                    ((yy0) it3.next()).a();
                }
                Iterator<E> it4 = fdVar2.iterator();
                while (it4.hasNext()) {
                    ((yy0) it4.next()).a();
                }
                zy0Var = new zy0(yy0VarC2.a, arrayList, f40.e, arrayList.size());
            }
            qs1 qs1Var = this.b;
            if (xi0.o((zy0) qs1Var.getValue(), zy0Var)) {
                return;
            }
            qs1Var.k(null, zy0Var);
            Object[] objArr4 = tx0Var.b;
            long[] jArr4 = tx0Var.c;
            int i7 = tx0Var.e;
            while (i7 != Integer.MAX_VALUE) {
                int i8 = (int) ((jArr4[i7] >> c2) & j);
                ((bz0) objArr4[i7]).getClass();
                i7 = i8;
            }
            Object[] objArr5 = tx0Var2.b;
            long[] jArr5 = tx0Var2.c;
            int i9 = tx0Var2.e;
            while (i9 != Integer.MAX_VALUE) {
                int i10 = (int) ((jArr5[i9] >> c2) & j);
                ((bz0) objArr5[i9]).getClass();
                i9 = i10;
            }
            Object[] objArr6 = tx0Var3.b;
            long[] jArr6 = tx0Var3.c;
            int i11 = tx0Var3.e;
            while (i11 != Integer.MAX_VALUE) {
                int i12 = (int) ((jArr6[i11] >> c2) & j);
                ((bz0) objArr6[i11]).getClass();
                i11 = i12;
            }
        }
    }

    public final yy0 c(int i) {
        Object next;
        Object next2;
        fd fdVar = this.e;
        fd fdVar2 = this.d;
        Object obj = null;
        if (i == -1) {
            Iterator it = fdVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((yy0) next).a()) {
                    break;
                }
            }
            yy0 yy0Var = (yy0) next;
            if (yy0Var != null) {
                return yy0Var;
            }
            Iterator it2 = fdVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                if (((yy0) next3).a()) {
                    obj = next3;
                    break;
                }
            }
            return (yy0) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = fdVar2.iterator();
            while (it3.hasNext()) {
                ((yy0) it3.next()).getClass();
            }
            Iterator it4 = fdVar.iterator();
            while (it4.hasNext()) {
                ((yy0) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = fdVar2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it5.next();
            if (((yy0) next2).a()) {
                break;
            }
        }
        yy0 yy0Var2 = (yy0) next2;
        if (yy0Var2 != null) {
            return yy0Var2;
        }
        Iterator it6 = fdVar.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next4 = it6.next();
            if (((yy0) next4).a()) {
                obj = next4;
                break;
            }
        }
        return (yy0) obj;
    }
}
