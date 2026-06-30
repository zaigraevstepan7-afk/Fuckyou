package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class p61 extends c0 implements Collection, yj0 {
    public f0 e;
    public Object[] f;
    public Object[] g;
    public int h;
    public wr i = new wr(25);
    public Object[] j;
    public Object[] k;
    public int l;

    public p61(f0 f0Var, Object[] objArr, Object[] objArr2, int i) {
        this.e = f0Var;
        this.f = objArr;
        this.g = objArr2;
        this.h = i;
        this.j = objArr;
        this.k = objArr2;
        this.l = f0Var.a();
    }

    public static void e(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(Object[] objArr, int i, int i2, l1 l1Var) {
        int iP = qc1.p(i2, i);
        if (i == 0) {
            Object obj = objArr[iP];
            Object[] objArrL = l(objArr);
            nd.M(objArr, objArrL, iP, iP + 1, 32);
            objArrL[31] = l1Var.a;
            l1Var.a = obj;
            return objArrL;
        }
        int iP2 = objArr[31] == null ? qc1.p(C() - 1, i) : 31;
        Object[] objArrL2 = l(objArr);
        int i3 = i - 5;
        int i4 = iP + 1;
        if (i4 <= iP2) {
            while (true) {
                Object obj2 = objArrL2[iP2];
                obj2.getClass();
                objArrL2[iP2] = A((Object[]) obj2, i3, 0, l1Var);
                if (iP2 == i4) {
                    break;
                }
                iP2--;
            }
        }
        Object obj3 = objArrL2[iP];
        obj3.getClass();
        objArrL2[iP] = A((Object[]) obj3, i3, i2, l1Var);
        return objArrL2;
    }

    public final Object B(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.l - i;
        Object[] objArr2 = this.k;
        if (i4 == 1) {
            Object obj = objArr2[0];
            r(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrL = l(objArr2);
        nd.M(objArr2, objArrL, i3, i3 + 1, i4);
        objArrL[i4 - 1] = null;
        this.j = objArr;
        this.k = objArrL;
        this.l = (i + i4) - 1;
        this.h = i2;
        return obj2;
    }

    public final int C() {
        int i = this.l;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] D(Object[] objArr, int i, int i2, Object obj, l1 l1Var) {
        int iP = qc1.p(i2, i);
        Object[] objArrL = l(objArr);
        if (i != 0) {
            Object obj2 = objArrL[iP];
            obj2.getClass();
            objArrL[iP] = D((Object[]) obj2, i - 5, i2, obj, l1Var);
            return objArrL;
        }
        if (objArrL != objArr) {
            ((AbstractList) this).modCount++;
        }
        l1Var.a = objArrL[iP];
        objArrL[iP] = obj;
        return objArrL;
    }

    public final void E(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrN;
        if (i3 < 1) {
            e91.a("requires at least one nullBuffer");
        }
        Object[] objArrL = l(objArr);
        objArr2[0] = objArrL;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            nd.M(objArrL, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrN = objArrL;
            } else {
                objArrN = n();
                i3--;
                objArr2[i3] = objArrN;
            }
            int i7 = i2 - i6;
            nd.M(objArrL, objArr3, 0, i7, i2);
            nd.M(objArrL, objArrN, size + 1, i4, i7);
            objArr3 = objArrN;
        }
        Iterator it = collection.iterator();
        e(objArrL, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrN2 = n();
            e(objArrN2, 0, it);
            objArr2[i8] = objArrN2;
        }
        e(objArr3, 0, it);
    }

    public final int F() {
        int i = this.l;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.c0
    public final int a() {
        return this.l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        lk.v(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iC = C();
        if (i >= iC) {
            i(this.j, i - iC, obj);
            return;
        }
        l1 l1Var = new l1(null);
        Object[] objArr = this.j;
        objArr.getClass();
        i(h(objArr, this.h, i, obj, l1Var), 0, l1Var.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrN;
        lk.v(i, this.l);
        if (i == this.l) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.l - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.k;
            Object[] objArrL = l(objArr);
            nd.M(objArr, objArrL, size2 + 1, i3, F());
            e(objArrL, i3, collection.iterator());
            this.k = objArrL;
            this.l = collection.size() + this.l;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iF = F();
        int size3 = collection.size() + this.l;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= C()) {
            objArrN = n();
            collection2 = collection;
            E(collection2, i, this.k, iF, objArr2, size, objArrN);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.k;
            if (size3 > iF) {
                int i4 = size3 - iF;
                Object[] objArrM = m(i4, objArr3);
                g(collection2, i, i4, objArr2, size, objArrM);
                objArr2 = objArr2;
                objArrN = objArrM;
            } else {
                objArrN = n();
                int i5 = iF - size3;
                nd.M(objArr3, objArrN, 0, i5, iF);
                int i6 = 32 - i5;
                Object[] objArrM2 = m(i6, this.k);
                int i7 = size - 1;
                objArr2[i7] = objArrM2;
                g(collection2, i, i6, objArr2, i7, objArrM2);
                collection2 = collection2;
            }
        }
        this.j = t(this.j, i2, objArr2);
        this.k = objArrN;
        this.l = collection2.size() + this.l;
        return true;
    }

    @Override // defpackage.c0
    public final Object b(int i) {
        lk.u(i, a());
        ((AbstractList) this).modCount++;
        int iC = C();
        if (i >= iC) {
            return B(this.j, iC, this.h, i - iC);
        }
        l1 l1Var = new l1(this.k[0]);
        Object[] objArr = this.j;
        objArr.getClass();
        B(A(objArr, this.h, i, l1Var), iC, this.h, 0);
        return l1Var.a;
    }

    public final f0 c() {
        f0 np1Var;
        Object[] objArr = this.j;
        if (objArr == this.f && this.k == this.g) {
            np1Var = this.e;
        } else {
            this.i = new wr(25);
            this.f = objArr;
            Object[] objArr2 = this.k;
            this.g = objArr2;
            np1Var = objArr == null ? objArr2.length == 0 ? np1.f : new np1(Arrays.copyOf(objArr2, this.l)) : new o61(objArr, objArr2, this.l, this.h);
        }
        this.e = np1Var;
        return np1Var;
    }

    public final int f() {
        return ((AbstractList) this).modCount;
    }

    public final void g(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.j == null) {
            yc.l("root is null");
            return;
        }
        int i4 = i >> 5;
        z zVarK = k(C() >> 5);
        int i5 = i3;
        Object[] objArrM = objArr2;
        while (zVarK.e - 1 != i4) {
            Object[] objArr3 = (Object[]) zVarK.previous();
            nd.M(objArr3, objArrM, 0, 32 - i2, 32);
            objArrM = m(i2, objArr3);
            i5--;
            objArr[i5] = objArrM;
        }
        Object[] objArr4 = (Object[]) zVarK.previous();
        int iC = i3 - (((C() >> 5) - 1) - i4);
        if (iC < i3) {
            objArr2 = objArr[iC];
            objArr2.getClass();
        }
        E(collection, i, objArr4, 32, objArr, iC, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        lk.u(i, a());
        if (C() <= i) {
            objArr = this.k;
        } else {
            Object[] objArr2 = this.j;
            objArr2.getClass();
            for (int i2 = this.h; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[qc1.p(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final Object[] h(Object[] objArr, int i, int i2, Object obj, l1 l1Var) {
        Object obj2;
        int iP = qc1.p(i2, i);
        if (i == 0) {
            l1Var.a = objArr[31];
            Object[] objArrL = l(objArr);
            nd.M(objArr, objArrL, iP + 1, iP, 31);
            objArrL[iP] = obj;
            return objArrL;
        }
        Object[] objArrL2 = l(objArr);
        int i3 = i - 5;
        Object obj3 = objArrL2[iP];
        obj3.getClass();
        objArrL2[iP] = h((Object[]) obj3, i3, i2, obj, l1Var);
        while (true) {
            iP++;
            if (iP >= 32 || (obj2 = objArrL2[iP]) == null) {
                break;
            }
            objArrL2[iP] = h((Object[]) obj2, i3, 0, l1Var.a, l1Var);
        }
        return objArrL2;
    }

    public final void i(Object[] objArr, int i, Object obj) {
        int iF = F();
        Object[] objArrL = l(this.k);
        Object[] objArr2 = this.k;
        if (iF >= 32) {
            Object obj2 = objArr2[31];
            nd.M(objArr2, objArrL, i + 1, i, 31);
            objArrL[i] = obj;
            u(objArr, objArrL, o(obj2));
            return;
        }
        nd.M(objArr2, objArrL, i + 1, i, iF);
        objArrL[i] = obj;
        this.j = objArr;
        this.k = objArrL;
        this.l++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final boolean j(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.i;
    }

    public final z k(int i) {
        Object[] objArr = this.j;
        if (objArr == null) {
            yc.l("Invalid root");
            return null;
        }
        int iC = C() >> 5;
        lk.v(i, iC);
        int i2 = this.h;
        return i2 == 0 ? new oh(i, objArr) : new l22(objArr, i, iC, i2 / 5);
    }

    public final Object[] l(Object[] objArr) {
        if (objArr == null) {
            return n();
        }
        if (j(objArr)) {
            return objArr;
        }
        Object[] objArrN = n();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        nd.P(objArr, objArrN, 0, length, 6);
        return objArrN;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        lk.v(i, this.l);
        return new r61(this, i);
    }

    public final Object[] m(int i, Object[] objArr) {
        if (j(objArr)) {
            nd.M(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] objArrN = n();
        nd.M(objArr, objArrN, i, 0, 32 - i);
        return objArrN;
    }

    public final Object[] n() {
        Object[] objArr = new Object[33];
        objArr[32] = this.i;
        return objArr;
    }

    public final Object[] o(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.i;
        return objArr;
    }

    public final Object[] p(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            e91.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iP = qc1.p(i, i2);
        Object obj = objArr[iP];
        obj.getClass();
        Object objP = p((Object[]) obj, i, i2 - 5);
        if (iP < 31) {
            int i3 = iP + 1;
            if (objArr[i3] != null) {
                if (j(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrN = n();
                nd.M(objArr, objArrN, 0, 0, i3);
                objArr = objArrN;
            }
        }
        if (objP == objArr[iP]) {
            return objArr;
        }
        Object[] objArrL = l(objArr);
        objArrL[iP] = objP;
        return objArrL;
    }

    public final Object[] q(Object[] objArr, int i, int i2, l1 l1Var) {
        Object[] objArrQ;
        int iP = qc1.p(i2 - 1, i);
        if (i == 5) {
            l1Var.a = objArr[iP];
            objArrQ = null;
        } else {
            Object obj = objArr[iP];
            obj.getClass();
            objArrQ = q((Object[]) obj, i - 5, i2, l1Var);
        }
        if (objArrQ == null && iP == 0) {
            return null;
        }
        Object[] objArrL = l(objArr);
        objArrL[iP] = objArrQ;
        return objArrL;
    }

    public final void r(Object[] objArr, int i, int i2) {
        Object obj = null;
        if (i2 == 0) {
            this.j = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.k = objArr;
            this.l = i;
            this.h = i2;
            return;
        }
        l1 l1Var = new l1(obj);
        objArr.getClass();
        Object[] objArrQ = q(objArr, i2, i, l1Var);
        objArrQ.getClass();
        Object obj2 = l1Var.a;
        obj2.getClass();
        this.k = (Object[]) obj2;
        this.l = i;
        if (objArrQ[1] == null) {
            this.j = (Object[]) objArrQ[0];
            this.h = i2 - 5;
        } else {
            this.j = objArrQ;
            this.h = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return z(new e0(1, collection));
    }

    public final Object[] s(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            e91.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            e91.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrL = l(objArr);
        int iP = qc1.p(i, i2);
        int i3 = i2 - 5;
        objArrL[iP] = s((Object[]) objArrL[iP], i, i3, it);
        while (true) {
            iP++;
            if (iP >= 32 || !it.hasNext()) {
                break;
            }
            objArrL[iP] = s((Object[]) objArrL[iP], 0, i3, it);
        }
        return objArrL;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        lk.u(i, a());
        if (C() > i) {
            l1 l1Var = new l1(null);
            Object[] objArr = this.j;
            objArr.getClass();
            this.j = D(objArr, this.h, i, obj, l1Var);
            return l1Var.a;
        }
        Object[] objArrL = l(this.k);
        if (objArrL != this.k) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrL[i2];
        objArrL[i2] = obj;
        this.k = objArrL;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i, Object[][] objArr2) {
        v vVar = new v(1, objArr2);
        int i2 = i >> 5;
        int i3 = this.h;
        Object[] objArrS = i2 < (1 << i3) ? s(objArr, i, i3, vVar) : l(objArr);
        while (vVar.hasNext()) {
            this.h += 5;
            objArrS = o(objArrS);
            int i4 = this.h;
            s(objArrS, 1 << i4, i4, vVar);
        }
        return objArrS;
    }

    public final void u(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.l;
        int i2 = i >> 5;
        int i3 = this.h;
        if (i2 > (1 << i3)) {
            this.j = v(this.h + 5, o(objArr), objArr2);
            this.k = objArr3;
            this.h += 5;
            this.l++;
            return;
        }
        if (objArr == null) {
            this.j = objArr2;
            this.k = objArr3;
            this.l = i + 1;
        } else {
            this.j = v(i3, objArr, objArr2);
            this.k = objArr3;
            this.l++;
        }
    }

    public final Object[] v(int i, Object[] objArr, Object[] objArr2) {
        int iP = qc1.p(a() - 1, i);
        Object[] objArrL = l(objArr);
        if (i == 5) {
            objArrL[iP] = objArr2;
            return objArrL;
        }
        objArrL[iP] = v(i - 5, (Object[]) objArrL[iP], objArr2);
        return objArrL;
    }

    public final int w(sa0 sa0Var, Object[] objArr, int i, int i2, l1 l1Var, ArrayList arrayList, ArrayList arrayList2) {
        if (j(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = l1Var.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrN = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) sa0Var.i(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrN = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : n();
                    i2 = 0;
                }
                objArrN[i2] = obj2;
                i2++;
            }
        }
        l1Var.a = objArrN;
        if (objArr2 != objArrN) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int x(sa0 sa0Var, Object[] objArr, int i, l1 l1Var) {
        Object[] objArrL = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) sa0Var.i(obj)).booleanValue()) {
                if (!z) {
                    objArrL = l(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrL[i2] = obj;
                i2++;
            }
        }
        l1Var.a = objArrL;
        return i2;
    }

    public final int y(sa0 sa0Var, int i, l1 l1Var) {
        int iX = x(sa0Var, this.k, i, l1Var);
        Object obj = l1Var.a;
        if (iX == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iX, i, (Object) null);
        this.k = objArr;
        this.l -= i - iX;
        return iX;
    }

    public final boolean z(sa0 sa0Var) {
        int i;
        sa0 sa0Var2 = sa0Var;
        int iF = F();
        Object[] objArrP = null;
        l1 l1Var = new l1(objArrP);
        boolean z = false;
        if (this.j != null) {
            z zVarK = k(0);
            int iX = 32;
            while (iX == 32 && zVarK.hasNext()) {
                iX = x(sa0Var2, (Object[]) zVarK.next(), 32, l1Var);
            }
            if (iX == 32) {
                int iY = y(sa0Var2, iF, l1Var);
                if (iY == 0) {
                    r(this.j, this.l, this.h);
                }
                if (iY != iF) {
                }
            } else {
                int i2 = (zVarK.e - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iW = iX;
                while (zVarK.hasNext()) {
                    iW = w(sa0Var2, (Object[]) zVarK.next(), 32, iW, l1Var, arrayList2, arrayList);
                    sa0Var2 = sa0Var;
                }
                int iW2 = w(sa0Var, this.k, iF, iW, l1Var, arrayList2, arrayList);
                Object obj = l1Var.a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iW2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrS = this.j;
                if (zIsEmpty) {
                    objArrS.getClass();
                } else {
                    objArrS = s(objArrS, i2, this.h, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    e91.a("invalid size");
                }
                if (size == 0) {
                    this.h = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.h;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.h = i - 5;
                        Object[] objArr2 = objArrS[0];
                        objArr2.getClass();
                        objArrS = objArr2;
                    }
                    objArrP = p(objArrS, i3, i);
                }
                this.j = objArrP;
                this.k = objArr;
                this.l = size + iW2;
            }
            z = true;
        } else if (y(sa0Var2, iF, l1Var) != iF) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iF = F();
        if (iF < 32) {
            Object[] objArrL = l(this.k);
            objArrL[iF] = obj;
            this.k = objArrL;
            this.l = a() + 1;
        } else {
            u(this.j, this.k, o(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iF = F();
        Iterator it = collection.iterator();
        if (32 - iF >= collection.size()) {
            Object[] objArrL = l(this.k);
            e(objArrL, iF, it);
            this.k = objArrL;
            this.l = collection.size() + this.l;
            return true;
        }
        int size = ((collection.size() + iF) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrL2 = l(this.k);
        e(objArrL2, iF, it);
        objArr[0] = objArrL2;
        for (int i = 1; i < size; i++) {
            Object[] objArrN = n();
            e(objArrN, 0, it);
            objArr[i] = objArrN;
        }
        this.j = t(this.j, C(), objArr);
        Object[] objArrN2 = n();
        e(objArrN2, 0, it);
        this.k = objArrN2;
        this.l = collection.size() + this.l;
        return true;
    }
}
