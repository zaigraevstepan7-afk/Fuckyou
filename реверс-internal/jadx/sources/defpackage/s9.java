package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class s9 extends sk0 implements sa0 {
    public final /* synthetic */ z61[] f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(z61[] z61VarArr, t9 t9Var, int i, int i2) {
        super(1);
        this.f = z61VarArr;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        y61 y61Var = (y61) obj;
        for (z61 z61Var : this.f) {
            if (z61Var != null) {
                long j = (((long) z61Var.e) << 32) | (((long) z61Var.f) & 4294967295L);
                long j2 = (((long) this.g) << 32) | (((long) this.h) & 4294967295L);
                long jRound = (((long) Math.round((1.0f - 1.0f) * ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f))) & 4294967295L) | (((long) Math.round((1.0f - 1.0f) * ((((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f))) << 32);
                y61Var.g(z61Var, (int) (jRound >> 32), (int) (jRound & 4294967295L), 0.0f);
            }
        }
        return t32.a;
    }
}
