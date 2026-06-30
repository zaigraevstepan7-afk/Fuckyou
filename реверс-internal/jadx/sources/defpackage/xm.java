package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xm implements cz1 {
    public final long a;

    public xm(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        og0.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.cz1
    public final float a() {
        return vl.d(this.a);
    }

    @Override // defpackage.cz1
    public final long b() {
        return this.a;
    }

    @Override // defpackage.cz1
    public final lh c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xm) && vl.c(this.a, ((xm) obj).a);
    }

    public final int hashCode() {
        int i = vl.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return s91.l("ColorStyle(value=", vl.i(this.a), ")");
    }
}
