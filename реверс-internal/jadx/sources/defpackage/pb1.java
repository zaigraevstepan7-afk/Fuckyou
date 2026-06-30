package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pb1 {
    public final nb1 a;
    public final boolean b;
    public final hq1 c;
    public final sa0 d;
    public final boolean e;
    public final Object f;
    public boolean g = true;

    public pb1(nb1 nb1Var, Object obj, boolean z, hq1 hq1Var, sa0 sa0Var, boolean z2) {
        this.a = nb1Var;
        this.b = z;
        this.c = hq1Var;
        this.d = sa0Var;
        this.e = z2;
        this.f = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        mp.b("Unexpected form of a provided value");
        yc.j();
        return null;
    }
}
