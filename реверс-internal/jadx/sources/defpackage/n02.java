package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class n02 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(n02.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public e50[] a;

    public final void a(e50 e50Var) {
        e50Var.d((f50) this);
        e50[] e50VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (e50VarArr == null) {
            e50VarArr = new e50[4];
            this.a = e50VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= e50VarArr.length) {
            e50VarArr = (e50[]) Arrays.copyOf(e50VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = e50VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        e50VarArr[i] = e50Var;
        e50Var.f = i;
        c(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e50 b(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                e50 e50Var = objArr[i];
                e50Var.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (e50Var.compareTo(obj) < 0) {
                    d(i, i2);
                    c(i2);
                } else {
                    while (true) {
                        int i3 = i * 2;
                        int i4 = i3 + 1;
                        if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        Object[] objArr2 = this.a;
                        objArr2.getClass();
                        int i5 = i3 + 2;
                        if (i5 < atomicIntegerFieldUpdater.get(this)) {
                            Comparable comparable = objArr2[i5];
                            comparable.getClass();
                            Object obj2 = objArr2[i4];
                            obj2.getClass();
                            if (comparable.compareTo(obj2) >= 0) {
                                i5 = i4;
                            }
                            Comparable comparable2 = objArr2[i];
                            comparable2.getClass();
                            Comparable comparable3 = objArr2[i5];
                            comparable3.getClass();
                            if (comparable2.compareTo(comparable3) <= 0) {
                                break;
                            }
                            d(i, i5);
                            i = i5;
                        }
                    }
                }
            }
        }
        e50 e50Var2 = objArr[atomicIntegerFieldUpdater.get(this)];
        e50Var2.getClass();
        e50Var2.d(null);
        e50Var2.f = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return e50Var2;
    }

    public final void c(int i) {
        while (i > 0) {
            e50[] e50VarArr = this.a;
            e50VarArr.getClass();
            int i2 = (i - 1) / 2;
            e50 e50Var = e50VarArr[i2];
            e50Var.getClass();
            e50 e50Var2 = e50VarArr[i];
            e50Var2.getClass();
            if (e50Var.compareTo(e50Var2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        e50[] e50VarArr = this.a;
        e50VarArr.getClass();
        e50 e50Var = e50VarArr[i2];
        e50Var.getClass();
        e50 e50Var2 = e50VarArr[i];
        e50Var2.getClass();
        e50VarArr[i] = e50Var;
        e50VarArr[i2] = e50Var2;
        e50Var.f = i;
        e50Var2.f = i2;
    }
}
