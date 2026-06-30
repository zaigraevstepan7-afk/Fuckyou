package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class s40 extends sk0 implements sa0 {
    public final /* synthetic */ v40 f;
    public final /* synthetic */ ns1 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ z61 j;
    public final /* synthetic */ long k;
    public final /* synthetic */ p40 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s40(v40 v40Var, y12 y12Var, long j, long j2, long j3, z61 z61Var, long j4, p40 p40Var) {
        super(1);
        this.f = v40Var;
        this.g = y12Var;
        this.h = j2;
        this.i = j3;
        this.j = z61Var;
        this.k = j4;
        this.l = p40Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        y61 y61Var = (y61) obj;
        v40 v40Var = this.f;
        vn1 vn1Var = v40Var.z;
        ns1 ns1Var = this.g;
        long j = ns1Var != null ? ((oh0) ns1Var.getValue()).a : 0L;
        vn1Var.b();
        if (vn1Var.b()) {
            vn1Var.c.getClass();
        }
        long jC = oh0.c(j, 0L);
        if (vn1Var.b()) {
            vn1Var.i = jC;
        }
        b3 b3Var = v40Var.D;
        long jC2 = oh0.c(b3Var != null ? b3Var.a(this.h, this.i, al0.e) : 0L, jC);
        long j2 = this.k;
        y61Var.getClass();
        z61 z61Var = this.j;
        y61.a(y61Var, z61Var);
        z61Var.k0(oh0.c((((long) (((int) (jC2 >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (jC2 & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), z61Var.i), 0.0f, this.l);
        return t32.a;
    }
}
