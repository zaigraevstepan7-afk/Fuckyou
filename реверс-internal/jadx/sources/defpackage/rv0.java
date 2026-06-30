package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public interface rv0 extends tv0 {
    @Override // defpackage.tv0
    default Object a(wa0 wa0Var, Object obj) {
        return wa0Var.h(obj, this);
    }

    @Override // defpackage.tv0
    default boolean b(sa0 sa0Var) {
        return ((Boolean) sa0Var.i(this)).booleanValue();
    }
}
