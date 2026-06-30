package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class af extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public /* synthetic */ float k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af(Object obj, float f, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.l = obj;
        this.k = f;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                return ((af) o((ks) obj2, (vt) obj)).q(t32Var);
            case 1:
                return ((af) o((ks) obj2, Float.valueOf(((Number) obj).floatValue()))).q(t32Var);
            default:
                return ((af) o((ks) obj2, (vt) obj)).q(t32Var);
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                return new af((h9) obj2, this.k, ksVar, 0);
            case 1:
                af afVar = new af((yo) obj2, ksVar);
                afVar.k = ((Number) obj).floatValue();
                return afVar;
            default:
                return new af((lr0) obj2, this.k, ksVar, 2);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int i = this.i;
        t32 t32Var = t32.a;
        Object obj2 = this.l;
        wt wtVar = wt.e;
        switch (i) {
            case 0:
                h9 h9Var = (h9) obj2;
                float f = this.k;
                int i2 = this.j;
                if (i2 != 0) {
                    if (i2 == 1) {
                        xc.G(obj);
                        return t32Var;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                Float f2 = new Float(f);
                q22 q22Var = ((Number) h9Var.d()).floatValue() < f ? e72.a : e72.b;
                this.j = 1;
                return h9.b(h9Var, f2, q22Var, null, null, this, 12) == wtVar ? wtVar : t32Var;
            case 1:
                yo yoVar = (yo) obj2;
                int i3 = this.j;
                if (i3 == 0) {
                    xc.G(obj);
                    float f3 = this.k;
                    Object objG = yoVar.a.d.e.g(ml1.e);
                    wa0 wa0Var = (wa0) (objG != null ? objG : null);
                    if (wa0Var == null) {
                        throw s91.g("Required value was null.");
                    }
                    w01 w01Var = new w01((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
                    this.j = 1;
                    obj = wa0Var.h(w01Var, this);
                    if (obj == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (i3 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((w01) obj).a & 4294967295L)));
            default:
                int i4 = this.j;
                if (i4 != 0) {
                    if (i4 == 1) {
                        xc.G(obj);
                        return t32Var;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                xg0 xg0Var = ((lr0) obj2).b;
                float f4 = this.k;
                this.j = 1;
                return xg0Var.F(f4, this) == wtVar ? wtVar : t32Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(yo yoVar, ks ksVar) {
        super(2, ksVar);
        this.i = 1;
        this.l = yoVar;
    }
}
