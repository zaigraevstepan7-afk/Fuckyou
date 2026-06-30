package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class q12 {
    public final long a;
    public final long b;
    public final boolean c;

    public q12(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final q12 a(q12 q12Var) {
        return new q12(w01.e(this.a, q12Var.a), Math.max(this.b, q12Var.b), this.c || q12Var.c);
    }
}
