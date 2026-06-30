package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class nn implements ks {
    public static final nn f = new nn(0);
    public static final nn g = new nn(1);
    public final /* synthetic */ int e;

    public /* synthetic */ nn(int i) {
        this.e = i;
    }

    @Override // defpackage.ks
    public final lt e() {
        switch (this.e) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return d40.e;
        }
    }

    @Override // defpackage.ks
    public final void g(Object obj) {
        switch (this.e) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.e) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}
