package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class tv extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv(un0 un0Var, int i, ks ksVar) {
        super(2, ksVar);
        this.i = 3;
        this.k = un0Var;
        this.j = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) throws Throwable {
        int i = this.i;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                return ((tv) o((ks) obj2, (vt) obj)).q(t32Var);
            case 1:
                return ((tv) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return ((tv) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ((tv) o((ks) obj2, (fj1) obj)).q(t32Var);
                return t32Var;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return ((tv) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return ((tv) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((tv) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((tv) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                ((tv) o((ks) obj2, (vt) obj)).q(t32Var);
                return wt.e;
            case el.a /* 9 */:
                return ((tv) o((ks) obj2, (vt) obj)).q(t32Var);
            case el.b /* 10 */:
                return ((tv) o((ks) obj2, (vt) obj)).q(t32Var);
            case 11:
                return ((tv) o((ks) obj2, (vt) obj)).q(t32Var);
            case el.c /* 12 */:
                return ((tv) o((ks) obj2, (vt) obj)).q(t32Var);
            case 13:
                return ((tv) o((ks) obj2, (vt) obj)).q(t32Var);
            case 14:
                return ((tv) o((ks) obj2, (vt) obj)).q(t32Var);
            default:
                return ((tv) o((ks) obj2, (vt) obj)).q(t32Var);
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = 2;
        switch (this.i) {
            case 0:
                return new tv((uv) this.k, ksVar, 0);
            case 1:
                return new tv((z80) this.k, ksVar, 1);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return new tv((xg0) this.k, ksVar, i);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return new tv((un0) this.k, this.j, ksVar);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return new tv((oj0) this.k, ksVar, 4);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return new tv((String) this.k, ksVar, 5);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return new tv((lr0) this.k, ksVar, 6);
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return new tv((h9) this.k, ksVar, 7);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return new tv((it0) this.k, ksVar, 8);
            case el.a /* 9 */:
                return new tv((qw0) this.k, ksVar, 9);
            case el.b /* 10 */:
                tv tvVar = new tv(i, ksVar);
                tvVar.k = obj;
                return tvVar;
            case 11:
                return new tv((q7) this.k, ksVar, 11);
            case el.c /* 12 */:
                return new tv((fv1) this.k, ksVar, 12);
            case 13:
                return new tv((iu) this.k, ksVar, 13);
            case 14:
                return new tv((sa0) this.k, ksVar, 14);
            default:
                return new tv((v02) this.k, ksVar, 15);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x024d, code lost:
    
        if (defpackage.lr0.f(r1, r14) == r0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0298, code lost:
    
        if (defpackage.nu0.P(defpackage.fw.g, new defpackage.cg1(r2, 1500, null), r14) == r1) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019d, code lost:
    
        if (defpackage.al.z(r7).c(new defpackage.fc0(r4, r6), r14) == r2) goto L96;
     */
    /* JADX WARN: Path cross not found for [B:89:0x0177, B:92:0x0180], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:92:0x0180, B:89:0x0177], limit reached: 228 */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0184  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0182 -> B:87:0x0173). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x019d -> B:98:0x01a1). Please report as a decompilation issue!!! */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) throws Throwable {
        Object objS;
        Object value;
        rh rhVar;
        vt vtVar;
        int i = 17;
        int i2 = 1;
        ks ksVar = null;
        switch (this.i) {
            case 0:
                wt wtVar = wt.e;
                int i3 = this.j;
                if (i3 != 0) {
                    if (i3 == 1) {
                        xc.G(obj);
                        return t32.a;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                xc1 xc1Var = new xc1();
                xc1 xc1Var2 = new xc1();
                xc1 xc1Var3 = new xc1();
                uv uvVar = (uv) this.k;
                tn1 tn1Var = uvVar.s.a;
                uj ujVar = new uj(xc1Var, xc1Var2, xc1Var3, uvVar, 2);
                this.j = 1;
                tn1Var.getClass();
                tn1.k(tn1Var, ujVar, this);
                return wtVar;
            case 1:
                wt wtVar2 = wt.e;
                int i4 = this.j;
                if (i4 == 0) {
                    xc.G(obj);
                    z80 z80Var = (z80) this.k;
                    this.j = 1;
                    if (wi0.t(z80Var, null, this) == wtVar2) {
                        return wtVar2;
                    }
                } else {
                    if (i4 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                wt wtVar3 = wt.e;
                int i5 = this.j;
                if (i5 == 0) {
                    xc.G(obj);
                    xa xaVar = (xa) ((xg0) this.k).g;
                    Float f = new Float(0.0f);
                    gr1 gr1VarD = pv.D(0.0f, 400.0f, new Float(0.5f), 1);
                    this.j = 1;
                    if (kd1.e(xaVar, f, gr1VarD, new fi1(12), this) == wtVar3) {
                        return wtVar3;
                    }
                } else {
                    if (i5 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                xc.G(obj);
                un0 un0Var = (un0) this.k;
                int i6 = this.j;
                gk gkVar = un0Var.e;
                if (((s41) gkVar.b).g() != i6 || ((s41) gkVar.c).g() != 0) {
                    qm0 qm0Var = un0Var.n;
                    qm0Var.c();
                    qm0Var.b = null;
                }
                gkVar.e(i6, 0);
                gkVar.d = null;
                ql0 ql0Var = un0Var.k;
                if (ql0Var != null) {
                    ql0Var.k();
                }
                return t32.a;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                wt wtVar4 = wt.e;
                int i7 = this.j;
                if (i7 == 0) {
                    xc.G(obj);
                    oj0 oj0Var = (oj0) this.k;
                    this.j = 1;
                    if (oj0Var.w(this) == wtVar4) {
                        return wtVar4;
                    }
                } else {
                    if (i7 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                t32 t32Var = t32.a;
                wt wtVar5 = wt.e;
                int i8 = this.j;
                if (i8 == 0) {
                    xc.G(obj);
                    this.j = 1;
                    if (al.s(1000L, this) != wtVar5) {
                    }
                    return wtVar5;
                }
                if (i8 != 1) {
                    if (i8 == 2) {
                        xc.G(obj);
                        return t32Var;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                String[] strArr = {(String) this.k, "-c", "am start -n com.axlebolt.standoff2/com.google.firebase.MessagingUnityPlayerActivity"};
                this.j = 2;
                lw lwVar = qy.a;
                break;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                wt wtVar6 = wt.e;
                int i9 = this.j;
                if (i9 == 0) {
                    xc.G(obj);
                    y41 y41Var = (y41) ((lr0) this.k).b.g;
                    this.j = 1;
                    objS = xk.s(y41Var, this);
                    if (objS != wtVar6) {
                    }
                    return wtVar6;
                }
                if (i9 != 1) {
                    if (i9 == 2) {
                        xc.G(obj);
                        return t32.a;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                objS = obj;
                ga2 ga2Var = (ga2) objS;
                String str = ga2Var.f;
                if (str.length() > 0) {
                    l91.h = str;
                }
                qs1 qs1Var = ((lr0) this.k).e;
                do {
                    value = qs1Var.getValue();
                } while (!qs1Var.h(value, l32.a((l32) value, ga2Var.a, ga2Var.b, ga2Var.c, ga2Var.d, false, 33)));
                lr0 lr0Var = (lr0) this.k;
                this.j = 2;
                break;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                wt wtVar7 = wt.e;
                int i10 = this.j;
                if (i10 == 0) {
                    xc.G(obj);
                    h9 h9Var = (h9) this.k;
                    Float f2 = new Float(360.0f);
                    fg0 fg0VarS = pv.s(pv.G(4666, 2, k20.b), 4);
                    this.j = 1;
                    if (h9.b(h9Var, f2, fg0VarS, null, null, this, 12) == wtVar7) {
                        return wtVar7;
                    }
                } else {
                    if (i10 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                it0 it0Var = (it0) this.k;
                wt wtVar8 = wt.e;
                int i11 = this.j;
                if (i11 == 0) {
                    xc.G(obj);
                    rhVar = it0Var.C;
                    if (rhVar != null) {
                    }
                    if (it0Var.x == null) {
                    }
                    return wtVar8;
                }
                if (i11 == 1) {
                    xc.G(obj);
                    if (it0Var.x == null) {
                    }
                    return wtVar8;
                }
                if (i11 != 2) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                g71 g71Var = it0Var.x;
                if (g71Var != null) {
                    ((i71) g71Var).d();
                }
                rhVar = it0Var.C;
                if (rhVar != null) {
                    this.j = 1;
                    if (rh.D(rhVar, this) != wtVar8) {
                    }
                    return wtVar8;
                }
                if (it0Var.x == null) {
                    mt mtVar = new mt(i);
                    this.j = 2;
                    lt ltVar = this.f;
                    ltVar.getClass();
                    break;
                } else {
                    rhVar = it0Var.C;
                    if (rhVar != null) {
                    }
                    if (it0Var.x == null) {
                    }
                }
                return wtVar8;
            case el.a /* 9 */:
                wt wtVar9 = wt.e;
                int i12 = this.j;
                if (i12 != 0) {
                    if (i12 == 1) {
                        xc.G(obj);
                        return obj;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                rh rhVar2 = ((qw0) this.k).g;
                this.j = 1;
                Object objR = bl.r(new e(rhVar2, ksVar, 25), this);
                return objR == wtVar9 ? wtVar9 : objR;
            case el.b /* 10 */:
                wt wtVar10 = wt.e;
                int i13 = this.j;
                if (i13 == 0) {
                    xc.G(obj);
                    vtVar = (vt) this.k;
                } else {
                    if (i13 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vtVar = (vt) this.k;
                    xc.G(obj);
                }
                while (bk.J(vtVar.f())) {
                    mt mtVar2 = new mt(i);
                    this.k = vtVar;
                    this.j = 1;
                    lt ltVar2 = this.f;
                    ltVar2.getClass();
                    if (al.z(ltVar2).c(mtVar2, this) == wtVar10) {
                        return wtVar10;
                    }
                }
                return t32.a;
            case 11:
                wt wtVar11 = wt.e;
                int i14 = this.j;
                if (i14 == 0) {
                    xc.G(obj);
                    h9 h9Var2 = ((q7) this.k).E;
                    Float f3 = new Float(0.0f);
                    this.j = 1;
                    if (h9Var2.f(this, f3) == wtVar11) {
                        return wtVar11;
                    }
                } else {
                    if (i14 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case el.c /* 12 */:
                fv1 fv1Var = (fv1) this.k;
                wt wtVar12 = wt.e;
                int i15 = this.j;
                if (i15 == 0) {
                    xc.G(obj);
                    PointerInputEventHandler pointerInputEventHandler = fv1Var.u;
                    this.j = 2;
                    if (pointerInputEventHandler.invoke(fv1Var, this) == wtVar12) {
                        return wtVar12;
                    }
                } else {
                    if (i15 != 1 && i15 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case 13:
                t32 t32Var2 = t32.a;
                wt wtVar13 = wt.e;
                int i16 = this.j;
                if (i16 == 0) {
                    xc.G(obj);
                    iu iuVar = (iu) this.k;
                    this.j = 1;
                    iuVar.getClass();
                    Object objR2 = bl.r(new zd(iuVar, null, 2), this);
                    if (objR2 != wtVar13) {
                        objR2 = t32Var2;
                    }
                    if (objR2 == wtVar13) {
                        return wtVar13;
                    }
                } else {
                    if (i16 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32Var2;
            case 14:
                wt wtVar14 = wt.e;
                int i17 = this.j;
                if (i17 == 0) {
                    xc.G(obj);
                    sa0 sa0Var = (sa0) this.k;
                    this.j = 1;
                    if (sa0Var.i(this) == wtVar14) {
                        return wtVar14;
                    }
                } else {
                    if (i17 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            default:
                wt wtVar15 = wt.e;
                int i18 = this.j;
                if (i18 != 0) {
                    if (i18 == 1) {
                        xc.G(obj);
                        return t32.a;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                xc1 xc1Var4 = new xc1();
                v02 v02Var = (v02) this.k;
                tn1 tn1Var2 = v02Var.s.a;
                r70 r70Var = new r70(6, xc1Var4, v02Var);
                this.j = 1;
                tn1Var2.getClass();
                tn1.k(tn1Var2, r70Var, this);
                return wtVar15;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tv(int i, ks ksVar) {
        super(i, ksVar);
        this.i = 10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tv(Object obj, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = obj;
    }
}
