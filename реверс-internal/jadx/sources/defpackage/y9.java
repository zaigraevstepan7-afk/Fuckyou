package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class y9 extends sk0 implements sa0 {
    public final /* synthetic */ aa f;
    public final /* synthetic */ z61 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(aa aaVar, z61 z61Var, long j) {
        super(1);
        this.f = aaVar;
        this.g = z61Var;
        this.h = j;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        this.f.v.getClass();
        z61 z61Var = this.g;
        long j = (((long) z61Var.e) << 32) | (((long) z61Var.f) & 4294967295L);
        long j2 = this.h;
        y61.i((y61) obj, z61Var, (((long) Math.round((1.0f - 1.0f) * ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f))) & 4294967295L) | (((long) Math.round((1.0f - 1.0f) * ((((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f))) << 32));
        return t32.a;
    }
}
