package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ly extends Exception {
    public final Throwable e;

    public ly(Throwable th, ot otVar, lt ltVar) {
        super("Coroutine dispatcher " + otVar + " threw an exception, context = " + ltVar, th);
        this.e = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.e;
    }
}
