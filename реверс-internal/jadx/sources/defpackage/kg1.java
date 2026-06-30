package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class kg1 implements ym1, li0 {
    public final ht a;
    public final ht b;
    public final ht c;
    public final ht d;

    public kg1(ht htVar, ht htVar2, ht htVar3, ht htVar4) {
        this.a = htVar;
        this.b = htVar2;
        this.c = htVar3;
        this.d = htVar4;
    }

    public static kg1 c(kg1 kg1Var, ht htVar, ht htVar2, ht htVar3, ht htVar4, int i) {
        if ((i & 1) != 0) {
            htVar = kg1Var.a;
        }
        if ((i & 2) != 0) {
            htVar2 = kg1Var.b;
        }
        if ((i & 4) != 0) {
            htVar3 = kg1Var.c;
        }
        if ((i & 8) != 0) {
            htVar4 = kg1Var.d;
        }
        kg1Var.getClass();
        return new kg1(htVar, htVar2, htVar3, htVar4);
    }

    @Override // defpackage.ym1
    public final hk a(long j, al0 al0Var, hx hxVar) {
        float fA = this.a.a(j, hxVar);
        float fA2 = this.b.a(j, hxVar);
        float fA3 = this.c.a(j, hxVar);
        float fA4 = this.d.a(j, hxVar);
        float fB = io1.b(j);
        float f = fA + fA4;
        if (f > fB) {
            float f2 = fB / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fB) {
            float f4 = fB / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            StringBuilder sbM = s91.m("Corner size in Px can't be negative(topStart = ", fA, ", topEnd = ", fA2, ", bottomEnd = ");
            sbM.append(fA3);
            sbM.append(", bottomStart = ");
            sbM.append(fA4);
            sbM.append(")!");
            qg0.a(sbM.toString());
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new o31(qc1.a(0L, j));
        }
        pc1 pc1VarA = qc1.a(0L, j);
        al0 al0Var2 = al0.e;
        float f5 = al0Var == al0Var2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (al0Var == al0Var2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        float f6 = al0Var == al0Var2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (al0Var != al0Var2) {
            fA4 = fA3;
        }
        return new p31(new hg1(pc1VarA.a, pc1VarA.b, pc1VarA.c, pc1VarA.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    @Override // defpackage.li0
    public final Object b(Object obj, float f) {
        if (xi0.o(obj, pv.w) || obj == null) {
            kg1 kg1Var = mg1.a;
            qb1 qb1Var = new qb1(0.0f);
            obj = new kg1(qb1Var, qb1Var, qb1Var, qb1Var);
        }
        if (!(obj instanceof kg1)) {
            return null;
        }
        kg1 kg1Var2 = (kg1) obj;
        kg1 kg1Var3 = mg1.a;
        return new kg1(new lg1(this.a, kg1Var2.a, f), new lg1(this.b, kg1Var2.b, f), new lg1(this.c, kg1Var2.c, f), new lg1(this.d, kg1Var2.d, f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg1)) {
            return false;
        }
        kg1 kg1Var = (kg1) obj;
        return xi0.o(this.a, kg1Var.a) && xi0.o(this.b, kg1Var.b) && xi0.o(this.c, kg1Var.c) && xi0.o(this.d, kg1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ")";
    }
}
