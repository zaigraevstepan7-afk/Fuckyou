package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class na extends sk0 implements wa0 {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ tv0 g;
    public final /* synthetic */ w40 h;
    public final /* synthetic */ j50 i;
    public final /* synthetic */ String j;
    public final /* synthetic */ jo k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(boolean z, tv0 tv0Var, w40 w40Var, j50 j50Var, String str, jo joVar, int i) {
        super(2);
        this.f = z;
        this.g = tv0Var;
        this.h = w40Var;
        this.i = j50Var;
        this.j = str;
        this.k = joVar;
        this.l = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        s22.b(this.f, this.g, this.h, this.i, this.j, this.k, (ob0) obj, al.V(this.l | 1));
        return t32.a;
    }
}
