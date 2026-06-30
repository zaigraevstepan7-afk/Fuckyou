package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class dl implements AutoCloseable, vt {
    public final lt e;

    public dl(lt ltVar) {
        ltVar.getClass();
        this.e = ltVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        oj0 oj0Var = (oj0) this.e.l(v20.O);
        if (oj0Var != null) {
            oj0Var.a(null);
        }
    }

    @Override // defpackage.vt
    public final lt f() {
        return this.e;
    }
}
