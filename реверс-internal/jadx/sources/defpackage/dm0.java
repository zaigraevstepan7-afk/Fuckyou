package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class dm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ em0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dm0(em0 em0Var, Object obj, int i) {
        this.a = i;
        this.b = em0Var;
        this.c = obj;
    }

    public wl0 b() {
        em0 em0Var = this.b;
        ql0 ql0Var = (ql0) em0Var.n.g(this.c);
        if (ql0Var != null) {
            return (wl0) em0Var.j.g(ql0Var);
        }
        return null;
    }

    public final boolean c() {
        v51 v51Var;
        switch (this.a) {
            case 0:
                return true;
            default:
                wl0 wl0VarB = b();
                if (wl0VarB == null || (v51Var = wl0VarB.f) == null) {
                    return true;
                }
                return v51Var.c();
        }
    }

    private final void a() {
    }
}
