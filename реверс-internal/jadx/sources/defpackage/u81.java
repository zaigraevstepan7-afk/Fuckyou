package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class u81 extends sk0 implements ha0 {
    public final /* synthetic */ yc1 f;
    public final /* synthetic */ v81 g;
    public final /* synthetic */ sh0 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u81(yc1 yc1Var, v81 v81Var, sh0 sh0Var, long j, long j2) {
        super(0);
        this.f = yc1Var;
        this.g = v81Var;
        this.h = sh0Var;
        this.i = j;
        this.j = j2;
    }

    @Override // defpackage.ha0
    public final Object a() {
        v81 v81Var = this.g;
        this.f.e = v81Var.getPositionProvider().a(this.h, this.i, v81Var.getParentLayoutDirection(), this.j);
        return t32.a;
    }
}
