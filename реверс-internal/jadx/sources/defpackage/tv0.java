package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public interface tv0 {
    Object a(wa0 wa0Var, Object obj);

    boolean b(sa0 sa0Var);

    default tv0 c(tv0 tv0Var) {
        return tv0Var == qv0.a ? this : new hn(this, tv0Var);
    }
}
