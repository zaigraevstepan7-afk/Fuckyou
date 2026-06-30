package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pd0 {
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final long e;

    public pd0(long j, long j2, float f, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = j3;
        this.e = j4;
    }

    public final String toString() {
        return "HistoricalChange(uptimeMillis=" + this.a + ", position=" + w01.g(this.b) + ", scaleFactor=" + this.c + ", panOffset=" + w01.g(this.d) + ")";
    }
}
