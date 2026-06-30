package p033R0;

import java.io.Serializable;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: R0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0354b implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Throwable f994a;

    public C0354b(Throwable th) {
        this.f994a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0354b) {
            return AbstractC0451c.m1142a(this.f994a, ((C0354b) obj).f994a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f994a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f994a + ')';
    }
}
