package p022M;

import p051a1.AbstractC0451c;
import p089t.C1045b;

/* JADX INFO: renamed from: M.c */
/* JADX INFO: loaded from: classes.dex */
public class C0186c {

    /* JADX INFO: renamed from: a */
    public final Object[] f615a;

    /* JADX INFO: renamed from: b */
    public int f616b;

    public C0186c(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f615a = new Object[i2];
    }

    /* JADX INFO: renamed from: a */
    public Object mo622a() {
        int i2 = this.f616b;
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        Object[] objArr = this.f615a;
        Object obj = objArr[i3];
        AbstractC0451c.m1144c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i3] = null;
        this.f616b--;
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public void m623b(C1045b c1045b) {
        int i2 = this.f616b;
        Object[] objArr = this.f615a;
        if (i2 < objArr.length) {
            objArr[i2] = c1045b;
            this.f616b = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean mo624c(Object obj) {
        Object[] objArr;
        boolean z2;
        AbstractC0451c.m1146e(obj, "instance");
        int i2 = this.f616b;
        int i3 = 0;
        while (true) {
            objArr = this.f615a;
            if (i3 >= i2) {
                z2 = false;
                break;
            }
            if (objArr[i3] == obj) {
                z2 = true;
                break;
            }
            i3++;
        }
        if (z2) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i4 = this.f616b;
        if (i4 >= objArr.length) {
            return false;
        }
        objArr[i4] = obj;
        this.f616b = i4 + 1;
        return true;
    }

    public C0186c() {
        this.f615a = new Object[256];
    }
}
