package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cz extends sk0 implements ha0 {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ n81 g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz(boolean z, n81 n81Var, String str) {
        super(0);
        this.f = z;
        this.g = n81Var;
        this.h = str;
    }

    @Override // defpackage.ha0
    public final Object a() {
        if (this.f) {
            n81 n81Var = this.g;
            String str = this.h;
            uh1 uh1Var = (uh1) n81Var.b;
            synchronized (uh1Var.c) {
            }
        }
        return t32.a;
    }
}
