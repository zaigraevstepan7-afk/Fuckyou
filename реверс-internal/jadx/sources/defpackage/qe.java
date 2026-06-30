package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qe {
    public final wy0 a;
    public final n11 b;

    public qe(wy0 wy0Var, n11 n11Var) {
        this.a = wy0Var;
        this.b = n11Var;
        if ((wy0Var == null ? n11Var : wy0Var) != null) {
            return;
        }
        yc.p("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }
}
