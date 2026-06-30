package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ye0 {
    public static int k;
    public static final wr l = new wr(15);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final z42 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public ye0(String str, float f, float f2, float f3, float f4, z42 z42Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z42Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye0)) {
            return false;
        }
        ye0 ye0Var = (ye0) obj;
        return xi0.o(this.a, ye0Var.a) && tz.b(this.b, ye0Var.b) && tz.b(this.c, ye0Var.c) && this.d == ye0Var.d && this.e == ye0Var.e && this.f.equals(ye0Var.f) && vl.c(this.g, ye0Var.g) && this.h == ye0Var.h && this.i == ye0Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + s91.a(this.e, s91.a(this.d, s91.a(this.c, s91.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = vl.h;
        return Boolean.hashCode(this.i) + s91.b(this.h, s91.c(iHashCode, 31, this.g), 31);
    }
}
