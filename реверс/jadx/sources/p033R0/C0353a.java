package p033R0;

import java.io.Serializable;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: R0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0353a implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f992a;

    /* JADX INFO: renamed from: b */
    public final Object f993b;

    public C0353a(Object obj, Object obj2) {
        this.f992a = obj;
        this.f993b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0353a)) {
            return false;
        }
        C0353a c0353a = (C0353a) obj;
        return AbstractC0451c.m1142a(this.f992a, c0353a.f992a) && AbstractC0451c.m1142a(this.f993b, c0353a.f993b);
    }

    public final int hashCode() {
        Object obj = this.f992a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f993b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f992a + ", " + this.f993b + ')';
    }
}
