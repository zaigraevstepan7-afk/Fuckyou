package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class o61 extends f0 {
    public final Object[] e;
    public final Object[] f;
    public final int g;
    public final int h;

    public o61(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.e = objArr;
        this.f = objArr2;
        this.g = i;
        this.h = i2;
        if (!(a() > 32)) {
            e91.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] j(Object[] objArr, int i, int i2, Object obj, l1 l1Var) {
        int iP = qc1.p(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iP == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            nd.M(objArr, objArrCopyOf, iP + 1, iP, 31);
            l1Var.a = objArr[31];
            objArrCopyOf[iP] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iP];
        obj2.getClass();
        objArrCopyOf2[iP] = j((Object[]) obj2, i3, i2, obj, l1Var);
        while (true) {
            iP++;
            if (iP >= 32 || objArrCopyOf2[iP] == null) {
                break;
            }
            Object obj3 = objArr[iP];
            obj3.getClass();
            objArrCopyOf2[iP] = j((Object[]) obj3, i3, 0, l1Var.a, l1Var);
        }
        return objArrCopyOf2;
    }

    public static Object[] l(Object[] objArr, int i, int i2, l1 l1Var) {
        Object[] objArrL;
        int iP = qc1.p(i2, i);
        if (i == 5) {
            l1Var.a = objArr[iP];
            objArrL = null;
        } else {
            Object obj = objArr[iP];
            obj.getClass();
            objArrL = l((Object[]) obj, i - 5, i2, l1Var);
        }
        if (objArrL == null && iP == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iP] = objArrL;
        return objArrCopyOf;
    }

    public static Object[] r(Object[] objArr, int i, int i2, Object obj) {
        int iP = qc1.p(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iP] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iP];
        obj2.getClass();
        objArrCopyOf[iP] = r((Object[]) obj2, i - 5, i2, obj);
        return objArrCopyOf;
    }

    @Override // defpackage.o
    public final int a() {
        return this.g;
    }

    @Override // defpackage.f0
    public final f0 b(int i, Object obj) {
        int i2 = this.g;
        lk.v(i, i2);
        if (i == i2) {
            return c(obj);
        }
        int iQ = q();
        Object[] objArr = this.e;
        if (i >= iQ) {
            return k(objArr, i - iQ, obj);
        }
        l1 l1Var = new l1(null);
        return k(j(objArr, this.h, i, obj, l1Var), 0, l1Var.a);
    }

    @Override // defpackage.f0
    public final f0 c(Object obj) {
        int iQ = q();
        int i = this.g;
        int i2 = i - iQ;
        Object[] objArr = this.e;
        Object[] objArr2 = this.f;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new o61(objArr, objArrCopyOf, i + 1, this.h);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return m(objArr, objArr2, objArr3);
    }

    @Override // defpackage.f0
    public final p61 f() {
        return new p61(this, this.e, this.f, this.h);
    }

    @Override // defpackage.f0
    public final f0 g(e0 e0Var) {
        p61 p61Var = new p61(this, this.e, this.f, this.h);
        p61Var.z(e0Var);
        return p61Var.c();
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        lk.u(i, a());
        if (q() <= i) {
            objArr = this.f;
        } else {
            Object[] objArr2 = this.e;
            for (int i2 = this.h; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[qc1.p(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.f0
    public final f0 h(int i) {
        lk.u(i, a());
        int iQ = q();
        int i2 = this.h;
        Object[] objArr = this.e;
        return i >= iQ ? p(objArr, iQ, i2, i - iQ) : p(o(objArr, i2, i, new l1(this.f[0])), iQ, i2, 0);
    }

    @Override // defpackage.f0
    public final f0 i(int i, Object obj) {
        int i2 = this.g;
        lk.u(i, i2);
        int iQ = q();
        Object[] objArr = this.e;
        Object[] objArr2 = this.f;
        int i3 = this.h;
        if (iQ > i) {
            return new o61(r(objArr, i3, i, obj), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new o61(objArr, objArrCopyOf, i2, i3);
    }

    public final o61 k(Object[] objArr, int i, Object obj) {
        int iQ = q();
        int i2 = this.g;
        int i3 = i2 - iQ;
        Object[] objArr2 = this.f;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            nd.M(objArr2, objArrCopyOf, i + 1, i, i3);
            objArrCopyOf[i] = obj;
            return new o61(objArr, objArrCopyOf, i2 + 1, this.h);
        }
        Object obj2 = objArr2[31];
        nd.M(objArr2, objArrCopyOf, i + 1, i, i3 - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m(objArr, objArrCopyOf, objArr3);
    }

    @Override // defpackage.y, java.util.List
    public final ListIterator listIterator(int i) {
        lk.v(i, this.g);
        return new q61(this.e, this.f, i, this.g, (this.h / 5) + 1);
    }

    public final o61 m(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.g;
        int i2 = i >> 5;
        int i3 = this.h;
        if (i2 <= (1 << i3)) {
            return new o61(n(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new o61(n(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] n(int i, Object[] objArr, Object[] objArr2) {
        int iP = qc1.p(a() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iP] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iP] = n(i - 5, (Object[]) objArrCopyOf[iP], objArr2);
        return objArrCopyOf;
    }

    public final Object[] o(Object[] objArr, int i, int i2, l1 l1Var) {
        int iP = qc1.p(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iP == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            nd.M(objArr, objArrCopyOf, iP, iP + 1, 32);
            objArrCopyOf[31] = l1Var.a;
            l1Var.a = objArr[iP];
            return objArrCopyOf;
        }
        int iP2 = objArr[31] == null ? qc1.p(q() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iP + 1;
        if (i4 <= iP2) {
            while (true) {
                Object obj = objArrCopyOf2[iP2];
                obj.getClass();
                objArrCopyOf2[iP2] = o((Object[]) obj, i3, 0, l1Var);
                if (iP2 == i4) {
                    break;
                }
                iP2--;
            }
        }
        Object obj2 = objArrCopyOf2[iP];
        obj2.getClass();
        objArrCopyOf2[iP] = o((Object[]) obj2, i3, i2, l1Var);
        return objArrCopyOf2;
    }

    public final f0 p(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.g - i;
        Object obj = null;
        if (i4 != 1) {
            Object[] objArr2 = this.f;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                nd.M(objArr2, objArrCopyOf, i3, i3 + 1, i4);
            }
            objArrCopyOf[i5] = null;
            return new o61(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new np1(objArr);
        }
        l1 l1Var = new l1(obj);
        Object[] objArrL = l(objArr, i2, i - 1, l1Var);
        objArrL.getClass();
        Object obj2 = l1Var.a;
        obj2.getClass();
        Object[] objArr3 = (Object[]) obj2;
        if (objArrL[1] != null) {
            return new o61(objArrL, objArr3, i, i2);
        }
        Object obj3 = objArrL[0];
        obj3.getClass();
        return new o61((Object[]) obj3, objArr3, i, i2 - 5);
    }

    public final int q() {
        return (this.g - 1) & (-32);
    }
}
