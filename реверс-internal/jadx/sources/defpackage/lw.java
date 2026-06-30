package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class lw extends i50 {
    public static final lw h;
    public ut g;

    static {
        int i = bw1.c;
        int i2 = bw1.d;
        long j = bw1.e;
        String str = bw1.a;
        lw lwVar = new lw();
        lwVar.g = new ut(i, i2, j, str);
        h = lwVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.ot
    public final void e(lt ltVar, Runnable runnable) {
        ut.c(this.g, runnable, 6);
    }

    @Override // defpackage.ot
    public final String toString() {
        return "Dispatchers.Default";
    }
}
