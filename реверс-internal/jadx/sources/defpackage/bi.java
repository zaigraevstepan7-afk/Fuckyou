package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bi extends zu1 implements wa0 {
    public int i;
    public final /* synthetic */ h9 j;
    public final /* synthetic */ float k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ ci m;
    public final /* synthetic */ yh0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(h9 h9Var, float f, boolean z, ci ciVar, yh0 yh0Var, ks ksVar) {
        super(2, ksVar);
        this.j = h9Var;
        this.k = f;
        this.l = z;
        this.m = ciVar;
        this.n = yh0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        return ((bi) o((ks) obj2, (vt) obj)).q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        return new bi(this.j, this.k, this.l, this.m, this.n, ksVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00dc A[RETURN] */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        Object objF;
        int i = this.i;
        t32 t32Var = t32.a;
        q22 q22Var = null;
        if (i != 0) {
            if (i == 1) {
                xc.G(obj);
                return t32Var;
            }
            if (i == 2) {
                xc.G(obj);
                return t32Var;
            }
            yc.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        xc.G(obj);
        h9 h9Var = this.j;
        float f = ((tz) h9Var.e.getValue()).e;
        float f2 = this.k;
        if (!tz.b(f, f2)) {
            boolean z = this.l;
            wt wtVar = wt.e;
            if (z) {
                float f3 = ((tz) h9Var.e.getValue()).e;
                yh0 oa1Var = tz.b(f3, 0.0f) ? new oa1(0L) : tz.b(f3, this.m.a) ? new ce0() : tz.b(f3, 0.0f) ? new c80() : null;
                this.i = 2;
                q22 q22Var2 = z20.b;
                q22 q22Var3 = z20.a;
                yh0 yh0Var = this.n;
                if (yh0Var != null) {
                    if ((yh0Var instanceof oa1) || (yh0Var instanceof b10) || (yh0Var instanceof ce0) || (yh0Var instanceof c80)) {
                        q22Var = q22Var3;
                    }
                } else if (oa1Var != null) {
                    if (!(oa1Var instanceof oa1) && !(oa1Var instanceof b10)) {
                        if (oa1Var instanceof ce0) {
                            q22Var = z20.c;
                        } else if (oa1Var instanceof c80) {
                        }
                    }
                    q22Var = q22Var2;
                }
                q22 q22Var4 = q22Var;
                h9 h9Var2 = this.j;
                if (q22Var4 == null ? (objF = h9Var2.f(this, new tz(f2))) != wtVar : (objF = h9.b(h9Var2, new tz(f2), q22Var4, null, null, this, 12)) != wtVar) {
                    objF = t32Var;
                }
                if (objF == wtVar) {
                }
            } else {
                tz tzVar = new tz(f2);
                this.i = 1;
                if (h9Var.f(this, tzVar) == wtVar) {
                    return wtVar;
                }
            }
        }
        return t32Var;
    }
}
