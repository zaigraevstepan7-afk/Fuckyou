package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ss0 extends sk0 implements ha0 {
    public final /* synthetic */ ws0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ b71 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(ws0 ws0Var, long j, long j2, b71 b71Var) {
        super(0);
        this.f = ws0Var;
        this.g = j;
        this.h = j2;
        this.i = b71Var;
    }

    @Override // defpackage.ha0
    public final Object a() {
        ws0 ws0Var = this.f;
        ws0Var.G0().e = false;
        ws0Var.G0().f = this.g;
        ws0Var.G0().g = this.h;
        sa0 sa0VarE = this.i.e.e();
        if (sa0VarE != null) {
            sa0VarE.i(ws0Var.G0());
        }
        return t32.a;
    }
}
