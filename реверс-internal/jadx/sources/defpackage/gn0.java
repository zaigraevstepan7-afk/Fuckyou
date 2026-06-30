package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gn0 implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ hn0 f;

    public /* synthetic */ gn0(hn0 hn0Var, int i) {
        this.e = i;
        this.f = hn0Var;
    }

    @Override // defpackage.ha0
    public final Object a() {
        int i = this.e;
        hn0 hn0Var = this.f;
        switch (i) {
            case 0:
                un0 un0Var = hn0Var.t.b;
                return Float.valueOf((((s41) un0Var.e.b).g() * 500) + ((s41) un0Var.e.c).g());
            case 1:
                un0 un0Var2 = hn0Var.t.b;
                int iG = ((s41) un0Var2.e.b).g();
                int iG2 = ((s41) un0Var2.e.c).g();
                return Float.valueOf(un0Var2.c() ? (iG * 500) + iG2 + 100.0f : (iG * 500) + iG2);
            default:
                un0 un0Var3 = hn0Var.t.b;
                int i2 = (int) (un0Var3.g().o == k31.e ? un0Var3.g().i() & 4294967295L : un0Var3.g().i() >> 32);
                un0 un0Var4 = hn0Var.t.b;
                return Float.valueOf(i2 - ((-un0Var4.g().l) + un0Var4.g().p));
        }
    }
}
