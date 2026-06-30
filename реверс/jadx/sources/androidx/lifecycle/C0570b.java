package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0570b {

    /* JADX INFO: renamed from: a */
    public final int f1859a;

    /* JADX INFO: renamed from: b */
    public final Method f1860b;

    public C0570b(int i2, Method method) {
        this.f1859a = i2;
        this.f1860b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0570b)) {
            return false;
        }
        C0570b c0570b = (C0570b) obj;
        return this.f1859a == c0570b.f1859a && this.f1860b.getName().equals(c0570b.f1860b.getName());
    }

    public final int hashCode() {
        return this.f1860b.getName().hashCode() + (this.f1859a * 31);
    }
}
