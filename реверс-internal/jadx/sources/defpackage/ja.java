package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ja implements ym1 {
    public final v41 a = xc.B(new fl(0.0f, 1.0f));
    public final /* synthetic */ ea b;

    public ja(ea eaVar) {
        this.b = eaVar;
    }

    @Override // defpackage.ym1
    public final hk a(long j, al0 al0Var, hx hxVar) {
        ea eaVar = this.b;
        kg1 kg1Var = eaVar.a;
        eaVar.c = j;
        fl flVar = new fl(0.0f, Float.intBitsToFloat((int) (4294967295L & j)) / 2.0f);
        v41 v41Var = this.a;
        v41Var.setValue(flVar);
        long j2 = eaVar.c;
        hx hxVar2 = eaVar.d;
        h9 h9VarA = eaVar.e;
        if (h9VarA == null) {
            h9VarA = xi0.a(kg1Var.a.a(j2, hxVar2));
            eaVar.e = h9VarA;
        }
        float fFloatValue = ((Number) lk.C(Float.valueOf(((Number) h9VarA.d()).floatValue()), (fl) v41Var.getValue())).floatValue();
        long j3 = eaVar.c;
        hx hxVar3 = eaVar.d;
        h9 h9VarA2 = eaVar.f;
        if (h9VarA2 == null) {
            h9VarA2 = xi0.a(kg1Var.b.a(j3, hxVar3));
            eaVar.f = h9VarA2;
        }
        float fFloatValue2 = ((Number) lk.C(Float.valueOf(((Number) h9VarA2.d()).floatValue()), (fl) v41Var.getValue())).floatValue();
        long j4 = eaVar.c;
        hx hxVar4 = eaVar.d;
        h9 h9VarA3 = eaVar.g;
        if (h9VarA3 == null) {
            h9VarA3 = xi0.a(kg1Var.d.a(j4, hxVar4));
            eaVar.g = h9VarA3;
        }
        float fFloatValue3 = ((Number) lk.C(Float.valueOf(((Number) h9VarA3.d()).floatValue()), (fl) v41Var.getValue())).floatValue();
        long j5 = eaVar.c;
        hx hxVar5 = eaVar.d;
        h9 h9VarA4 = eaVar.h;
        if (h9VarA4 == null) {
            h9VarA4 = xi0.a(kg1Var.c.a(j5, hxVar5));
            eaVar.h = h9VarA4;
        }
        float fFloatValue4 = ((Number) lk.C(Float.valueOf(((Number) h9VarA4.d()).floatValue()), (fl) v41Var.getValue())).floatValue();
        kg1 kg1Var2 = mg1.a;
        return new kg1(new qb1(fFloatValue), new qb1(fFloatValue2), new qb1(fFloatValue4), new qb1(fFloatValue3)).a(j, al0Var, hxVar);
    }
}
