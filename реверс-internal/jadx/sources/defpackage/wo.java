package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wo extends IllegalStateException {
    public final String e;

    public wo(String str) {
        this.e = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.e;
    }
}
