package defpackage;

import android.graphics.LightingColorFilter;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fp0 extends wl {
    public final long b;
    public final long c;

    public fp0(long j, long j2) {
        super(new LightingColorFilter(lk.l0(j), lk.l0(j2)));
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp0)) {
            return false;
        }
        fp0 fp0Var = (fp0) obj;
        return vl.c(this.b, fp0Var.b) && vl.c(this.c, fp0Var.c);
    }

    public final int hashCode() {
        int i = vl.h;
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "LightingColorFilter(multiply=" + vl.i(this.b) + ", add=" + vl.i(this.c) + ")";
    }
}
