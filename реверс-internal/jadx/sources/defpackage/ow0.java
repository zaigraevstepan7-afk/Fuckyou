package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ow0 extends zu1 implements wa0 {
    public vc1 i;
    public vc1 j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ wc1 n;
    public final /* synthetic */ zc1 o;
    public final /* synthetic */ zc1 p;
    public final /* synthetic */ float q;
    public final /* synthetic */ qw0 r;
    public final /* synthetic */ float s;
    public final /* synthetic */ bk1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow0(wc1 wc1Var, zc1 zc1Var, zc1 zc1Var2, float f, qw0 qw0Var, float f2, bk1 bk1Var, ks ksVar) {
        super(2, ksVar);
        this.n = wc1Var;
        this.o = zc1Var;
        this.p = zc1Var2;
        this.q = f;
        this.r = qw0Var;
        this.s = f2;
        this.t = bk1Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        return ((ow0) o((ks) obj2, (zj1) obj)).q(t32.a);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        ow0 ow0Var = new ow0(this.n, this.o, this.p, this.q, this.r, this.s, this.t, ksVar);
        ow0Var.m = obj;
        return ow0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b4 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0175 -> B:36:0x0176). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0188 -> B:38:0x0184). Please report as a decompilation issue!!! */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        zj1 zj1Var;
        vc1 vc1Var;
        wc1 wc1Var;
        zc1 zc1Var;
        zj1 zj1Var2;
        wt wtVar;
        int i;
        char c;
        wt wtVar2;
        int i2;
        int i3;
        zc1 zc1Var2;
        vc1 vc1Var2;
        boolean z;
        ow0 ow0Var = this;
        int i4 = ow0Var.l;
        zc1 zc1Var3 = ow0Var.p;
        wc1 wc1Var2 = ow0Var.n;
        char c2 = 3;
        int i5 = 2;
        int i6 = 1;
        zc1 zc1Var4 = ow0Var.o;
        wt wtVar3 = wt.e;
        if (i4 == 0) {
            xc.G(obj);
            zj1Var = (zj1) ow0Var.m;
            vc1 vc1Var3 = new vc1();
            vc1Var3.e = true;
            vc1Var = vc1Var3;
            z = vc1Var.e;
            t32 t32Var = t32.a;
            if (!z) {
            }
        } else if (i4 == 1) {
            vc1 vc1Var4 = ow0Var.j;
            vc1Var2 = ow0Var.i;
            zj1 zj1Var3 = (zj1) ow0Var.m;
            xc.G(obj);
            c = 3;
            i2 = 1;
            wtVar2 = wtVar3;
            zj1Var2 = zj1Var3;
            i3 = 2;
            zc1Var2 = zc1Var4;
            vc1Var4.e = ((Boolean) obj).booleanValue();
            ow0Var = this;
            zc1Var4 = zc1Var2;
            zj1Var = zj1Var2;
            vc1Var = vc1Var2;
            i5 = i3;
            i6 = i2;
            wtVar3 = wtVar2;
            c2 = c;
            z = vc1Var.e;
            t32 t32Var2 = t32.a;
            if (!z) {
            }
        } else if (i4 == 2) {
            i = ow0Var.k;
            vc1 vc1Var5 = ow0Var.i;
            zj1 zj1Var4 = (zj1) ow0Var.m;
            xc.G(obj);
            wc1Var = wc1Var2;
            wtVar = wtVar3;
            vc1Var = vc1Var5;
            zj1Var2 = zj1Var4;
            zc1Var = zc1Var3;
            if (vc1Var.e) {
            }
        } else {
            if (i4 != 3) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vc1 vc1Var6 = ow0Var.j;
            vc1Var2 = ow0Var.i;
            zj1 zj1Var5 = (zj1) ow0Var.m;
            xc.G(obj);
            vc1Var = vc1Var6;
            c = 3;
            i2 = 1;
            wtVar2 = wtVar3;
            zj1Var2 = zj1Var5;
            Object objD = obj;
            i3 = 2;
            zc1Var2 = zc1Var4;
            vc1Var.e = ((Boolean) objD).booleanValue();
            zc1Var4 = zc1Var2;
            zj1Var = zj1Var2;
            vc1Var = vc1Var2;
            i5 = i3;
            i6 = i2;
            wtVar3 = wtVar2;
            c2 = c;
            z = vc1Var.e;
            t32 t32Var22 = t32.a;
            if (!z) {
                vc1Var.e = false;
                float fFloatValue = wc1Var2.e - ((Number) ((xa) zc1Var4.e).f.getValue()).floatValue();
                boolean z2 = ((mw0) zc1Var3.e).c;
                qw0 qw0Var = ow0Var.r;
                if (!z2) {
                    float fAbs = Math.abs(fFloatValue);
                    float f = ow0Var.q;
                    if (fAbs >= f) {
                        float fSignum = Math.signum(fFloatValue) * f;
                        qw0Var.e(zj1Var, fSignum);
                        xa xaVar = (xa) zc1Var4.e;
                        xa xaVarU = wi0.u(xaVar, ((Number) xaVar.f.getValue()).floatValue() + fSignum);
                        zc1Var4.e = xaVarU;
                        int I = nu0.I(Math.abs(wc1Var2.e - ((Number) xaVarU.f.getValue()).floatValue()) / ow0Var.s);
                        if (I > 100) {
                            I = 100;
                        }
                        xa xaVar2 = (xa) zc1Var4.e;
                        float f2 = wc1Var2.e;
                        int i7 = I;
                        qw0 qw0Var2 = ow0Var.r;
                        wtVar = wtVar3;
                        wc1Var = wc1Var2;
                        zc1Var = zc1Var3;
                        h2 h2Var = new h2(qw0Var2, zc1Var, wc1Var, ow0Var.t, vc1Var, 2);
                        ow0Var.m = zj1Var;
                        ow0Var.i = vc1Var;
                        ow0Var.j = null;
                        ow0Var.k = i7;
                        ow0Var.l = i5;
                        qw0Var2.getClass();
                        wc1 wc1Var3 = new wc1();
                        wc1Var3.e = ((Number) xaVar2.f.getValue()).floatValue();
                        Float f3 = new Float(f2);
                        q22 q22VarG = pv.G(i7, i5, k20.b);
                        zj1 zj1Var6 = zj1Var;
                        e9 e9Var = new e9(wc1Var3, qw0Var2, zj1Var6, h2Var, 5);
                        zj1Var2 = zj1Var6;
                        Object objE = kd1.e(xaVar2, f3, q22VarG, e9Var, ow0Var);
                        if (objE != wtVar) {
                            objE = t32Var22;
                        }
                        if (objE == wtVar) {
                            return wtVar;
                        }
                        i = i7;
                        if (vc1Var.e) {
                            ow0Var.m = zj1Var2;
                            ow0Var.i = vc1Var;
                            ow0Var.j = vc1Var;
                            ow0Var.l = 3;
                            c = 3;
                            wtVar2 = wtVar;
                            i2 = 1;
                            zc1 zc1Var5 = zc1Var;
                            i3 = i5;
                            zc1Var2 = zc1Var4;
                            zc1Var3 = zc1Var5;
                            wc1Var2 = wc1Var;
                            objD = qw0.d(ow0Var.r, zc1Var3, wc1Var2, ow0Var.t, zc1Var2, 50 - ((long) i), ow0Var);
                            if (objD == wtVar2) {
                                return wtVar2;
                            }
                            vc1Var2 = vc1Var;
                            vc1Var.e = ((Boolean) objD).booleanValue();
                            zc1Var4 = zc1Var2;
                            zj1Var = zj1Var2;
                            vc1Var = vc1Var2;
                            i5 = i3;
                            i6 = i2;
                            wtVar3 = wtVar2;
                            c2 = c;
                            z = vc1Var.e;
                            t32 t32Var222 = t32.a;
                            if (!z) {
                                return t32Var222;
                            }
                        } else {
                            zc1Var3 = zc1Var;
                            c = 3;
                            zj1Var = zj1Var2;
                            wc1Var2 = wc1Var;
                            i6 = 1;
                            wtVar3 = wtVar;
                            c2 = c;
                            z = vc1Var.e;
                            t32 t32Var2222 = t32.a;
                            if (!z) {
                            }
                        }
                    }
                }
                c = c2;
                i3 = i5;
                i2 = i6;
                zc1Var2 = zc1Var4;
                wtVar2 = wtVar3;
                zj1Var2 = zj1Var;
                qw0Var.e(zj1Var2, fFloatValue);
                ow0Var.m = zj1Var2;
                ow0Var.i = vc1Var;
                ow0Var.j = vc1Var;
                ow0Var.l = i2;
                Object objD2 = qw0.d(ow0Var.r, zc1Var3, wc1Var2, ow0Var.t, zc1Var2, 50L, ow0Var);
                if (objD2 == wtVar2) {
                    return wtVar2;
                }
                vc1Var2 = vc1Var;
                vc1Var.e = ((Boolean) objD2).booleanValue();
                ow0Var = this;
                zc1Var4 = zc1Var2;
                zj1Var = zj1Var2;
                vc1Var = vc1Var2;
                i5 = i3;
                i6 = i2;
                wtVar3 = wtVar2;
                c2 = c;
                z = vc1Var.e;
                t32 t32Var22222 = t32.a;
                if (!z) {
                }
            }
        }
    }
}
