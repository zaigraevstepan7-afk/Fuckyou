package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pa extends sk0 implements wa0 {
    public final /* synthetic */ d22 f;
    public final /* synthetic */ sa0 g;
    public final /* synthetic */ w40 h;
    public final /* synthetic */ j50 i;
    public final /* synthetic */ jo j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(d22 d22Var, sa0 sa0Var, w40 w40Var, j50 j50Var, jo joVar, int i) {
        super(2);
        this.f = d22Var;
        this.g = sa0Var;
        this.h = w40Var;
        this.i = j50Var;
        this.j = joVar;
        this.k = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        s22.c(this.f, this.g, this.h, this.i, this.j, (ob0) obj, al.V(this.k | 1));
        return t32.a;
    }
}
