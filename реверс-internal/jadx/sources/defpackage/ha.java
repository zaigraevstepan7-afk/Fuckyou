package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ha implements ym1 {
    public final v41 a = xc.B(new fl(0.0f, 1.0f));
    public final /* synthetic */ ka b;

    public ha(ka kaVar) {
        this.b = kaVar;
    }

    @Override // defpackage.ym1
    public final hk a(long j, al0 al0Var, hx hxVar) {
        ka kaVar = this.b;
        kaVar.c = j;
        fl flVar = new fl(0.0f, Float.intBitsToFloat((int) (4294967295L & j)) / 2.0f);
        v41 v41Var = this.a;
        v41Var.setValue(flVar);
        kg1 kg1Var = kaVar.a;
        long j2 = kaVar.c;
        hx hxVar2 = kaVar.d;
        h9 h9VarA = kaVar.e;
        if (h9VarA == null) {
            h9VarA = xi0.a(kg1Var.a.a(j2, hxVar2));
            kaVar.e = h9VarA;
        }
        qb1 qb1Var = new qb1(((Number) lk.C(Float.valueOf(((Number) h9VarA.d()).floatValue()), (fl) v41Var.getValue())).floatValue());
        long j3 = kaVar.c;
        hx hxVar3 = kaVar.d;
        h9 h9VarA2 = kaVar.f;
        if (h9VarA2 == null) {
            h9VarA2 = xi0.a(kg1Var.b.a(j3, hxVar3));
            kaVar.f = h9VarA2;
        }
        qb1 qb1Var2 = new qb1(((Number) lk.C(Float.valueOf(((Number) h9VarA2.d()).floatValue()), (fl) v41Var.getValue())).floatValue());
        long j4 = kaVar.c;
        hx hxVar4 = kaVar.d;
        h9 h9VarA3 = kaVar.g;
        if (h9VarA3 == null) {
            h9VarA3 = xi0.a(kg1Var.d.a(j4, hxVar4));
            kaVar.g = h9VarA3;
        }
        qb1 qb1Var3 = new qb1(((Number) lk.C(Float.valueOf(((Number) h9VarA3.d()).floatValue()), (fl) v41Var.getValue())).floatValue());
        long j5 = kaVar.c;
        hx hxVar5 = kaVar.d;
        h9 h9VarA4 = kaVar.h;
        if (h9VarA4 == null) {
            h9VarA4 = xi0.a(kg1Var.c.a(j5, hxVar5));
            kaVar.h = h9VarA4;
        }
        return new kg1(qb1Var, qb1Var2, new qb1(((Number) lk.C(Float.valueOf(((Number) h9VarA4.d()).floatValue()), (fl) v41Var.getValue())).floatValue()), qb1Var3).a(j, al0Var, hxVar);
    }
}
