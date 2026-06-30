package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xx0 extends kb1 implements ck0, sa0 {
    public xx0(String str, String str2) {
        super(ni.e, yl1.class, str, str2, 1);
    }

    @Override // defpackage.oi
    public final xj0 d() {
        ad1.a.getClass();
        return this;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        k();
        throw null;
    }

    public final void k() {
        if (this.k) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        xj0 xj0VarG = g();
        if (xj0VarG == this) {
            throw new zt("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((xx0) ((ck0) xj0VarG)).k();
    }
}
