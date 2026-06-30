package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fd1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final ie g;

    public fd1(long j, long j2, long j3, long j4, long j5, float[] fArr, ie ieVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = ieVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && fd1.class == obj.getClass()) {
            fd1 fd1Var = (fd1) obj;
            if (this.a == fd1Var.a && this.b == fd1Var.b && this.e == fd1Var.e && oh0.a(this.c, fd1Var.c) && oh0.a(this.d, fd1Var.d)) {
                float[] fArr = fd1Var.f;
                float[] fArr2 = this.f;
                if (fArr2 == null) {
                    zEquals = fArr == null;
                    return zEquals && this.g == fd1Var.g;
                }
                if (fArr != null) {
                    zEquals = fArr2.equals(fArr);
                }
                if (zEquals) {
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = s91.c(s91.c(s91.c(s91.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.e), 31, this.c), 31, this.d);
        float[] fArr = this.f;
        return this.g.hashCode() + ((iC + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
