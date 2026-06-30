package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sr {
    public final bh a;
    public final xi b;

    public sr(bh bhVar, xi xiVar) {
        this.a = bhVar;
        this.b = xiVar;
    }

    public final String toString() {
        xi xiVar = this.b;
        if (xiVar.i.l(rt.f) != null) {
            yc.d();
            return null;
        }
        int iHashCode = hashCode();
        s22.k(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return "Request@" + string + "(currentBounds()=" + this.a.a() + ", continuation=" + xiVar + ")";
    }
}
