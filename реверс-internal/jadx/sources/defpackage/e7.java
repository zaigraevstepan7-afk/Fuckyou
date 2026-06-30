package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class e7 extends sk0 implements sa0 {
    public final /* synthetic */ v81 f;
    public final /* synthetic */ ha0 g;
    public final /* synthetic */ z81 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ al0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(v81 v81Var, ha0 ha0Var, z81 z81Var, String str, al0 al0Var) {
        super(1);
        this.f = v81Var;
        this.g = ha0Var;
        this.h = z81Var;
        this.i = str;
        this.j = al0Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        v81 v81Var = this.f;
        v81Var.t.addView(v81Var, v81Var.u);
        v81Var.p(this.g, this.h, this.i, this.j);
        return new j2(2, v81Var);
    }
}
