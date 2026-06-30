package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class np1 extends f0 {
    public static final np1 f = new np1(new Object[0]);
    public final Object[] e;

    public np1(Object[] objArr) {
        this.e = objArr;
    }

    @Override // defpackage.o
    public final int a() {
        return this.e.length;
    }

    @Override // defpackage.f0
    public final f0 b(int i, Object obj) {
        Object[] objArr = this.e;
        lk.v(i, objArr.length);
        if (i == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            nd.P(objArr, objArr2, 0, i, 6);
            nd.M(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new np1(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        nd.M(objArr, objArrCopyOf, i + 1, i, objArr.length - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new o61(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.f0
    public final f0 c(Object obj) {
        Object[] objArr = this.e;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new np1(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new o61(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.f0
    public final f0 e(Collection collection) {
        Object[] objArr = this.e;
        if (collection.size() + objArr.length > 32) {
            p61 p61VarF = f();
            p61VarF.addAll(collection);
            return p61VarF.c();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new np1(objArrCopyOf);
    }

    @Override // defpackage.f0
    public final p61 f() {
        return new p61(this, null, this.e, 0);
    }

    @Override // defpackage.f0
    public final f0 g(e0 e0Var) {
        Object[] objArr = this.e;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) e0Var.i(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f : new np1(nd.Q(objArrCopyOf, 0, length));
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.e;
        lk.u(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.f0
    public final f0 h(int i) {
        Object[] objArr = this.e;
        lk.u(i, objArr.length);
        if (objArr.length == 1) {
            return f;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        nd.M(objArr, objArrCopyOf, i, i + 1, objArr.length);
        return new np1(objArrCopyOf);
    }

    @Override // defpackage.f0
    public final f0 i(int i, Object obj) {
        Object[] objArr = this.e;
        lk.u(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new np1(objArrCopyOf);
    }

    @Override // defpackage.y, java.util.List
    public final int indexOf(Object obj) {
        return nd.V(this.e, obj);
    }

    @Override // defpackage.y, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.e;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.y, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.e;
        lk.v(i, objArr.length);
        return new oh(objArr, i, objArr.length);
    }
}
