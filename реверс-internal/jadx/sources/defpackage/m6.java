package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import android.view.ScrollCaptureSession;
import android.view.textclassifier.TextClassifier;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class m6 extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public Object k;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(q81 q81Var, xa0 xa0Var, sa0 sa0Var, ks ksVar) {
        super(2, ksVar);
        this.i = 15;
        this.m = q81Var;
        this.n = xa0Var;
        this.l = sa0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) throws Throwable {
        int i = this.i;
        wt wtVar = wt.e;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                ((m6) o((ks) obj2, (c7) obj)).q(t32Var);
                return wtVar;
            case 1:
                return ((m6) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return ((m6) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return ((m6) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return ((m6) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return ((m6) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((m6) o((ks) obj2, (gp1) obj)).q(t32Var);
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((m6) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return ((m6) o((ks) obj2, (wn1) obj)).q(t32Var);
            case el.a /* 9 */:
                return ((m6) o((ks) obj2, (vt) obj)).q(t32Var);
            case el.b /* 10 */:
                ((m6) o((ks) obj2, (vt) obj)).q(t32Var);
                return wtVar;
            case 11:
                return ((m6) o((ks) obj2, (vt) obj)).q(t32Var);
            case el.c /* 12 */:
                return ((m6) o((ks) obj2, (vt) obj)).q(t32Var);
            case 13:
                return ((m6) o((ks) obj2, (vt) obj)).q(t32Var);
            case 14:
                return ((m6) o((ks) obj2, (vt) obj)).q(t32Var);
            case 15:
                return ((m6) o((ks) obj2, (vt) obj)).q(t32Var);
            case 16:
                return ((m6) o((ks) obj2, (vt) obj)).q(t32Var);
            default:
                return ((m6) o((ks) obj2, (vt) obj)).q(t32Var);
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                m6 m6Var = new m6((sa0) this.l, (n6) this.m, (eo0) obj2, ksVar, 0);
                m6Var.k = obj;
                return m6Var;
            case 1:
                return new m6(this.k, (h9) this.l, (fy0) this.m, (fy0) obj2, ksVar, 1);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                m6 m6Var2 = new m6((mj) this.m, (ka) obj2, ksVar, 2);
                m6Var2.k = obj;
                return m6Var2;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                m6 m6Var3 = new m6((mj) this.m, (ea) obj2, ksVar, 3);
                m6Var3.k = obj;
                return m6Var3;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return new m6((wa0) this.l, (iq) this.m, (fy0) obj2, ksVar, 4);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return new m6((yo) this.k, (ScrollCaptureSession) this.l, (Rect) this.m, (Consumer) obj2, ksVar, 5);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                m6 m6Var4 = new m6((y00) this.l, (i10) this.m, (k31) obj2, ksVar, 6);
                m6Var4.k = obj;
                return m6Var4;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                m6 m6Var5 = new m6((i10) this.l, (j00) this.m, (k31) obj2, ksVar, 7);
                m6Var5.k = obj;
                return m6Var5;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                m6 m6Var6 = new m6((f70) this.l, (qs1) this.m, (Float) obj2, ksVar, 8);
                m6Var6.k = obj;
                return m6Var6;
            case el.a /* 9 */:
                return new m6((ls1) this.k, (f70) this.l, (qs1) this.m, (Float) obj2, ksVar, 9);
            case el.b /* 10 */:
                m6 m6Var7 = new m6((fy0) this.m, (ig0) obj2, ksVar, 10);
                m6Var7.k = obj;
                return m6Var7;
            case 11:
                return new m6((lr0) this.l, (iq) this.m, (Uri) obj2, ksVar, 11);
            case el.c /* 12 */:
                return new m6((lr0) this.l, (iq) this.m, (String) obj2, ksVar, 12);
            case 13:
                return new m6((s71) this.m, (wa0) obj2, ksVar, 13);
            case 14:
                m6 m6Var8 = new m6((sa0) this.l, (AtomicReference) this.m, (wa0) obj2, ksVar, 14);
                m6Var8.k = obj;
                return m6Var8;
            case 15:
                m6 m6Var9 = new m6((q81) this.m, (xa0) obj2, (sa0) this.l, ksVar);
                m6Var9.k = obj;
                return m6Var9;
            case 16:
                m6 m6Var10 = new m6((s12) obj2, ksVar);
                m6Var10.k = obj;
                return m6Var10;
            default:
                return new m6((zc1) this.k, (jc1) this.l, (xo0) this.m, (j92) obj2, ksVar, 17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x02bb, code lost:
    
        if (r0 == r9) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x05ca, code lost:
    
        if (r0 == r9) goto L283;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:369:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:400:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:402:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a9  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:174:0x037f -> B:178:0x03a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x03a1 -> B:178:0x03a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:294:0x060c -> B:296:0x0610). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:311:0x0670 -> B:313:0x0674). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ef -> B:42:0x00b9). Please report as a decompilation issue!!! */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) throws Throwable {
        vt vtVar;
        qh it;
        Object objB;
        vt vtVar2;
        qh it2;
        Object objB2;
        Object objH;
        fy0 fy0Var;
        Object objP;
        Object objA;
        vt vtVar3;
        wc1 wc1Var;
        vt vtVar4;
        wc1 wc1Var2;
        lr0 lr0Var;
        Object objP2;
        Object objP3;
        lr0 lr0Var2;
        qs1 qs1Var;
        Object objY;
        s71 s71Var;
        sy0 sy0Var;
        Object objG;
        ?? r2;
        Object objG2;
        om1 om1Var;
        om1 om1Var2;
        Object objH2;
        ?? r3;
        vt vtVar5;
        s12 s12Var;
        Object objD;
        vt vtVar6;
        bk1 bk1Var;
        int i = this.i;
        ?? r22 = 4;
        ?? r23 = 4;
        int i2 = 0;
        int i3 = 2;
        Object obj2 = t32.a;
        wt wtVar = wt.e;
        Object obj3 = this.n;
        int i4 = 1;
        f6 f6Var = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        switch (i) {
            case 0:
                int i5 = this.j;
                if (i5 == 0) {
                    xc.G(obj);
                    l6 l6Var = new l6((c7) this.k, (sa0) this.l, (n6) this.m, (eo0) obj3, null, 0);
                    this.j = 1;
                    if (bl.r(l6Var, this) == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (i5 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                yc.j();
                return null;
            case 1:
                h9 h9Var = (h9) this.l;
                int i6 = this.j;
                if (i6 == 0) {
                    xc.G(obj);
                    if (xi0.o(this.k, h9Var.e.getValue())) {
                        return obj2;
                    }
                    h9 h9Var2 = (h9) this.l;
                    Object obj4 = this.k;
                    fy0 fy0Var2 = (fy0) this.m;
                    int i7 = j9.a;
                    wa waVar = (wa) fy0Var2.getValue();
                    this.j = 1;
                    if (h9.b(h9Var2, obj4, waVar, null, null, this, 12) == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (i6 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                int i8 = j9.a;
                sa0 sa0Var = (sa0) ((fy0) obj3).getValue();
                if (sa0Var == null) {
                    return obj2;
                }
                sa0Var.i(h9Var.d());
                return obj2;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                mj mjVar = (mj) this.m;
                int i9 = this.j;
                if (i9 == 0) {
                    xc.G(obj);
                    vtVar = (vt) this.k;
                    it = mjVar.iterator();
                    this.k = vtVar;
                    this.l = it;
                    this.j = 1;
                    objB = it.b(this);
                    if (objB == wtVar) {
                    }
                    if (((Boolean) objB).booleanValue()) {
                    }
                } else {
                    if (i9 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (qh) this.l;
                    vtVar = (vt) this.k;
                    xc.G(obj);
                    objB = obj;
                    if (((Boolean) objB).booleanValue()) {
                        kg1 kg1Var = (kg1) it.c();
                        kg1 kg1Var2 = (kg1) nu0.v(mjVar.r());
                        if (kg1Var2 != null) {
                            kg1Var = kg1Var2;
                        }
                        nu0.A(vtVar, null, null, new ia((ka) obj3, kg1Var, z ? 1 : 0, i2), 3);
                        this.k = vtVar;
                        this.l = it;
                        this.j = 1;
                        objB = it.b(this);
                        if (objB == wtVar) {
                            return wtVar;
                        }
                        if (((Boolean) objB).booleanValue()) {
                            return obj2;
                        }
                    }
                }
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                mj mjVar2 = (mj) this.m;
                int i10 = this.j;
                if (i10 == 0) {
                    xc.G(obj);
                    vtVar2 = (vt) this.k;
                    it2 = mjVar2.iterator();
                    this.k = vtVar2;
                    this.l = it2;
                    this.j = 1;
                    objB2 = it2.b(this);
                    if (objB2 == wtVar) {
                    }
                    if (((Boolean) objB2).booleanValue()) {
                    }
                } else {
                    if (i10 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it2 = (qh) this.l;
                    vtVar2 = (vt) this.k;
                    xc.G(obj);
                    objB2 = obj;
                    if (((Boolean) objB2).booleanValue()) {
                        kg1 kg1Var3 = (kg1) it2.c();
                        kg1 kg1Var4 = (kg1) nu0.v(mjVar2.r());
                        if (kg1Var4 != null) {
                            kg1Var3 = kg1Var4;
                        }
                        nu0.A(vtVar2, null, null, new ca((ea) obj3, kg1Var3, z2 ? 1 : 0, r22), 3);
                        this.k = vtVar2;
                        this.l = it2;
                        this.j = 1;
                        objB2 = it2.b(this);
                        if (objB2 == wtVar) {
                            return wtVar;
                        }
                        if (((Boolean) objB2).booleanValue()) {
                            return obj2;
                        }
                    }
                }
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                int i11 = this.j;
                if (i11 == 0) {
                    xc.G(obj);
                    wa0 wa0Var = (wa0) this.l;
                    iq iqVar = (iq) this.m;
                    this.j = 1;
                    objH = wa0Var.h(iqVar, this);
                    if (objH != wtVar) {
                    }
                    return wtVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fy0 fy0Var3 = (fy0) this.k;
                    xc.G(obj);
                    fy0Var = fy0Var3;
                    objP = obj;
                    f6Var = (f6) objP;
                    fy0Var.setValue(f6Var);
                    return obj2;
                }
                xc.G(obj);
                objH = obj;
                File file = (File) objH;
                fy0Var = (fy0) obj3;
                if (file != null) {
                    lw lwVar = qy.a;
                    fw fwVar = fw.g;
                    wd wdVar = new wd(file, z3 ? 1 : 0, i4);
                    this.k = fy0Var;
                    this.j = 2;
                    objP = nu0.P(fwVar, wdVar, this);
                    break;
                }
                fy0Var.setValue(f6Var);
                return obj2;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                int i12 = this.j;
                if (i12 == 0) {
                    xc.G(obj);
                    yo yoVar = (yo) this.k;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.l;
                    Rect rect = (Rect) this.m;
                    sh0 sh0Var = new sh0(rect.left, rect.top, rect.right, rect.bottom);
                    this.j = 1;
                    objA = yo.a(yoVar, scrollCaptureSession, sh0Var, this);
                    if (objA == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (i12 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                    objA = obj;
                }
                ((Consumer) obj3).accept(el.Q((sh0) objA));
                return obj2;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                int i13 = this.j;
                if (i13 != 0) {
                    if (i13 == 1) {
                        xc.G(obj);
                        return obj2;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                gp1 gp1Var = (gp1) this.k;
                y00 y00Var = (y00) this.l;
                kf kfVar = new kf(gp1Var, (i10) this.m, (k31) obj3, 7);
                this.j = 1;
                return y00Var.h(kfVar, this) == wtVar ? wtVar : obj2;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                int i14 = this.j;
                if (i14 != 0) {
                    if (i14 == 1) {
                        xc.G(obj);
                        return obj2;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                vt vtVar7 = (vt) this.k;
                i10 i10Var = (i10) this.l;
                xa0 xa0Var = i10Var.Q;
                long jF = o52.f(i10Var.R ? -1.0f : 1.0f, ((j00) this.m).a);
                k31 k31Var = (k31) obj3;
                f10 f10Var = g10.a;
                Float f = new Float(k31Var == k31.e ? o52.c(jF) : o52.b(jF));
                this.j = 1;
                return xa0Var.f(vtVar7, f, this) == wtVar ? wtVar : obj2;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                qs1 qs1Var2 = (qs1) this.m;
                wn1 wn1Var = (wn1) this.k;
                int i15 = this.j;
                if (i15 == 0) {
                    xc.G(obj);
                    int iOrdinal = wn1Var.ordinal();
                    if (iOrdinal == 0) {
                        f70 f70Var = (f70) this.l;
                        this.k = null;
                        this.j = 1;
                        return f70Var.c(qs1Var2, this) == wtVar ? wtVar : obj2;
                    }
                    if (iOrdinal == 1) {
                        return obj2;
                    }
                    if (iOrdinal == 2) {
                        Float f2 = (Float) obj3;
                        if (f2 == s22.k0) {
                            throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                        }
                        qs1Var2.k(null, f2);
                        return obj2;
                    }
                    ez1.a();
                } else {
                    if (i15 == 1) {
                        xc.G(obj);
                        return obj2;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case el.a /* 9 */:
                f70 f70Var2 = (f70) this.l;
                qs1 qs1Var3 = (qs1) this.m;
                int i16 = this.j;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            xc.G(obj);
                        } else if (i16 != 3 && i16 != 4) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    xc.G(obj);
                    return obj2;
                }
                xc.G(obj);
                ls1 ls1Var = (ls1) this.k;
                if (ls1Var == xn1.a) {
                    this.j = 1;
                    if (f70Var2.c(qs1Var3, this) != wtVar) {
                        return obj2;
                    }
                } else {
                    ks ksVar = null;
                    if (ls1Var == xn1.b) {
                        ou1 ou1VarG = qs1Var3.g();
                        x70 x70Var = new x70(2, null);
                        this.j = 2;
                        if (xk.r(ou1VarG, x70Var, this) != wtVar) {
                        }
                    } else {
                        ou1 ou1VarG2 = qs1Var3.g();
                        ks1 ks1Var = new ks1(ls1Var, null);
                        int i17 = t70.a;
                        d40 d40Var = d40.e;
                        ph phVar = ph.e;
                        f70 f70VarN = xk.n(xk.n(new xg0(15, new vj(ks1Var, ou1VarG2, d40Var, -2, phVar), new xu(i3, ksVar, r22))));
                        m6 m6Var = new m6(f70Var2, qs1Var3, (Float) obj3, ksVar, 8);
                        this.j = 4;
                        Object objC = xk.f(new vj(new s70(m6Var, null), f70VarN, d40Var, -2, phVar), 0).c(m01.e, this);
                        if (objC != wtVar) {
                            objC = obj2;
                        }
                        if (objC != wtVar) {
                            objC = obj2;
                        }
                        if (objC != wtVar) {
                            return obj2;
                        }
                    }
                }
                return wtVar;
                this.j = 3;
                if (f70Var2.c(qs1Var3, this) != wtVar) {
                    return obj2;
                }
                return wtVar;
            case el.b /* 10 */:
                int i18 = this.j;
                if (i18 == 0) {
                    xc.G(obj);
                    vt vtVar8 = (vt) this.k;
                    wc1 wc1Var3 = new wc1();
                    wc1Var3.e = 1.0f;
                    vtVar3 = vtVar8;
                    wc1Var = wc1Var3;
                    e9 e9Var = new e9((fy0) this.m, (ig0) obj3, wc1Var, vtVar3, 3);
                    wc1 wc1Var4 = wc1Var;
                    vt vtVar9 = vtVar3;
                    this.k = vtVar9;
                    this.l = wc1Var4;
                    this.j = 1;
                    if (e().l(v20.N) != null) {
                    }
                } else if (i18 == 1) {
                    wc1Var2 = (wc1) this.l;
                    vtVar4 = (vt) this.k;
                    xc.G(obj);
                    if (wc1Var2.e == 0.0f) {
                    }
                    wc1Var = wc1Var2;
                    vtVar3 = vtVar4;
                    e9 e9Var2 = new e9((fy0) this.m, (ig0) obj3, wc1Var, vtVar3, 3);
                    wc1 wc1Var42 = wc1Var;
                    vt vtVar92 = vtVar3;
                    this.k = vtVar92;
                    this.l = wc1Var42;
                    this.j = 1;
                    if (e().l(v20.N) != null) {
                    }
                } else {
                    if (i18 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wc1Var2 = (wc1) this.l;
                    vtVar4 = (vt) this.k;
                    xc.G(obj);
                    wc1Var = wc1Var2;
                    vtVar3 = vtVar4;
                    e9 e9Var22 = new e9((fy0) this.m, (ig0) obj3, wc1Var, vtVar3, 3);
                    wc1 wc1Var422 = wc1Var;
                    vt vtVar922 = vtVar3;
                    this.k = vtVar922;
                    this.l = wc1Var422;
                    this.j = 1;
                    if (e().l(v20.N) != null) {
                        yc.d();
                        return null;
                    }
                    if (al.z(e()).c(e9Var22, this) == wtVar) {
                        return wtVar;
                    }
                    vtVar4 = vtVar922;
                    wc1Var2 = wc1Var422;
                    if (wc1Var2.e == 0.0f) {
                        int i19 = 8;
                        y41 y41Var = new y41(i19, new l6(new p7(i19, vtVar4), null));
                        hg0 hg0Var = new hg0(2, null);
                        this.k = vtVar4;
                        this.l = wc1Var2;
                        this.j = 2;
                        if (xk.r(y41Var, hg0Var, this) == wtVar) {
                            return wtVar;
                        }
                    }
                    wc1Var = wc1Var2;
                    vtVar3 = vtVar4;
                    e9 e9Var222 = new e9((fy0) this.m, (ig0) obj3, wc1Var, vtVar3, 3);
                    wc1 wc1Var4222 = wc1Var;
                    vt vtVar9222 = vtVar3;
                    this.k = vtVar9222;
                    this.l = wc1Var4222;
                    this.j = 1;
                    if (e().l(v20.N) != null) {
                    }
                }
                break;
            case 11:
                int i20 = this.j;
                if (i20 == 0) {
                    xc.G(obj);
                    lr0Var = (lr0) this.l;
                    xg0 xg0Var = lr0Var.d;
                    this.k = lr0Var;
                    this.j = 1;
                    xg0Var.getClass();
                    lw lwVar2 = qy.a;
                    objP2 = nu0.P(fw.g, new i9((iq) this.m, xg0Var, (Uri) obj3, (ks) null, 1), this);
                    if (objP2 == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (i20 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lr0Var = (lr0) this.k;
                    xc.G(obj);
                    objP2 = obj;
                }
                lr0.e(lr0Var, (nq) objP2);
                return obj2;
            case el.c /* 12 */:
                lr0 lr0Var3 = (lr0) this.l;
                int i21 = this.j;
                if (i21 == 0) {
                    xc.G(obj);
                    xg0 xg0Var2 = lr0Var3.d;
                    this.k = lr0Var3;
                    this.j = 1;
                    xg0Var2.getClass();
                    lw lwVar3 = qy.a;
                    objP3 = nu0.P(fw.g, new i9((iq) this.m, xg0Var2, (String) obj3, (ks) null, 2), this);
                    if (objP3 != wtVar) {
                        lr0Var2 = lr0Var3;
                    }
                    return wtVar;
                }
                if (i21 != 1) {
                    if (i21 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qs1 qs1Var4 = (qs1) this.k;
                    xc.G(obj);
                    qs1Var = qs1Var4;
                    objY = obj;
                    qs1Var.j(objY);
                    return obj2;
                }
                lr0 lr0Var4 = (lr0) this.k;
                xc.G(obj);
                lr0Var2 = lr0Var4;
                objP3 = obj;
                lr0.e(lr0Var2, (nq) objP3);
                qs1Var = lr0Var3.l;
                xg0 xg0Var3 = lr0Var3.d;
                rd rdVarG = lr0.g(lr0Var3);
                this.k = qs1Var;
                this.j = 2;
                objY = xg0Var3.y(rdVarG, this);
                break;
            case 13:
                int i22 = this.j;
                c20 c20Var = c20.MILLISECONDS;
                try {
                    if (i22 == 0) {
                        xc.G(obj);
                        s71Var = (s71) this.m;
                        uy0 uy0Var = s71Var.e;
                        this.k = uy0Var;
                        this.l = s71Var;
                        this.j = 1;
                        Object objE = uy0Var.e(this);
                        sy0Var = uy0Var;
                        if (objE != wtVar) {
                        }
                        return wtVar;
                    }
                    if (i22 != 1) {
                        if (i22 != 2) {
                            if (i22 == 3) {
                                xc.G(obj);
                                return obj;
                            }
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sy0 sy0Var2 = (sy0) this.k;
                        xc.G(obj);
                        objG = obj;
                        r22 = sy0Var2;
                        textClassifier = (TextClassifier) objG;
                        r2 = r22;
                        ((uy0) r2).h(null);
                        wr wrVar = z10.e;
                        long jT = el.T(200L, c20Var);
                        e eVar = new e(textClassifier, (wa0) obj3, z5 ? 1 : 0, 26);
                        this.k = null;
                        this.l = null;
                        this.j = 3;
                        objG2 = af1.G(jT, eVar, this);
                        if (objG2 != wtVar) {
                            return objG2;
                        }
                        return wtVar;
                    }
                    s71Var = (s71) this.l;
                    sy0 sy0Var3 = (sy0) this.k;
                    xc.G(obj);
                    sy0Var = sy0Var3;
                    TextClassifier textClassifier = s71Var.f;
                    if (textClassifier != null) {
                        r2 = sy0Var;
                        if (!textClassifier.isDestroyed()) {
                            ((uy0) r2).h(null);
                            wr wrVar2 = z10.e;
                            long jT2 = el.T(200L, c20Var);
                            e eVar2 = new e(textClassifier, (wa0) obj3, z5 ? 1 : 0, 26);
                            this.k = null;
                            this.l = null;
                            this.j = 3;
                            objG2 = af1.G(jT2, eVar2, this);
                            if (objG2 != wtVar) {
                            }
                        }
                        return wtVar;
                    }
                    wr wrVar3 = z10.e;
                    long jT3 = el.T(300L, c20Var);
                    q71 q71Var = new q71(s71Var, z4 ? 1 : 0, i2);
                    this.k = sy0Var;
                    this.l = null;
                    this.j = 2;
                    objG = af1.G(jT3, q71Var, this);
                    r22 = sy0Var;
                    if (objG == wtVar) {
                        return wtVar;
                    }
                    textClassifier = (TextClassifier) objG;
                    r2 = r22;
                    ((uy0) r2).h(null);
                    wr wrVar22 = z10.e;
                    long jT22 = el.T(200L, c20Var);
                    e eVar22 = new e(textClassifier, (wa0) obj3, z5 ? 1 : 0, 26);
                    this.k = null;
                    this.l = null;
                    this.j = 3;
                    objG2 = af1.G(jT22, eVar22, this);
                    if (objG2 != wtVar) {
                    }
                    return wtVar;
                } catch (Throwable th) {
                    ((uy0) r22).h(null);
                    throw th;
                }
            case 14:
                AtomicReference atomicReference = (AtomicReference) this.m;
                int i23 = this.j;
                try {
                    if (i23 == 0) {
                        xc.G(obj);
                        vt vtVar10 = (vt) this.k;
                        om1 om1Var3 = new om1(bk.D(vtVar10.f()), ((sa0) this.l).i(vtVar10));
                        om1 om1Var4 = (om1) atomicReference.getAndSet(om1Var3);
                        om1Var2 = om1Var3;
                        if (om1Var4 != null) {
                            oj0 oj0Var = om1Var4.a;
                            this.k = om1Var3;
                            this.j = 1;
                            oj0Var.a(null);
                            Object objW = oj0Var.w(this);
                            if (objW == wtVar) {
                                obj2 = objW;
                            }
                            if (obj2 == wtVar) {
                                return wtVar;
                            }
                            om1Var = om1Var3;
                        }
                        Object obj5 = om1Var2.b;
                        this.k = om1Var2;
                        this.j = 2;
                        objH2 = ((wa0) obj3).h(obj5, this);
                        r23 = om1Var2;
                        if (objH2 == wtVar) {
                            return wtVar;
                        }
                        r3 = r23;
                        while (!atomicReference.compareAndSet(r3, null)) {
                        }
                        return objH2;
                    }
                    if (i23 != 1) {
                        if (i23 != 2) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        om1 om1Var5 = (om1) this.k;
                        xc.G(obj);
                        objH2 = obj;
                        r23 = om1Var5;
                        r3 = r23;
                        while (!atomicReference.compareAndSet(r3, null) && atomicReference.get() == r3) {
                        }
                        return objH2;
                    }
                    om1 om1Var6 = (om1) this.k;
                    xc.G(obj);
                    om1Var = om1Var6;
                    om1Var2 = om1Var;
                    Object obj52 = om1Var2.b;
                    this.k = om1Var2;
                    this.j = 2;
                    objH2 = ((wa0) obj3).h(obj52, this);
                    r23 = om1Var2;
                    if (objH2 == wtVar) {
                    }
                    r3 = r23;
                    while (!atomicReference.compareAndSet(r3, null)) {
                    }
                    return objH2;
                } catch (Throwable th2) {
                    while (!atomicReference.compareAndSet(r23, null) && atomicReference.get() == r23) {
                    }
                    throw th2;
                }
            case 15:
                q81 q81Var = (q81) this.m;
                int i24 = this.j;
                if (i24 == 0) {
                    xc.G(obj);
                    sv1 sv1Var = new sv1((vt) this.k, new ma1(q81Var), (xa0) obj3, (sa0) this.l, null);
                    this.j = 1;
                    return el.o(q81Var, sv1Var, this) == wtVar ? wtVar : obj2;
                }
                if (i24 == 1) {
                    xc.G(obj);
                    return obj2;
                }
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                s12 s12Var2 = (s12) obj3;
                int i25 = this.j;
                try {
                    if (i25 == 0) {
                        xc.G(obj);
                        vtVar5 = (vt) this.k;
                    } else {
                        if (i25 == 1) {
                            bk1Var = (bk1) this.m;
                            s12 s12Var3 = (s12) this.l;
                            vt vtVar11 = (vt) this.k;
                            xc.G(obj);
                            s12Var = s12Var3;
                            vtVar6 = vtVar11;
                            objD = obj;
                            this.k = vtVar6;
                            this.l = null;
                            this.m = null;
                            this.j = 2;
                            if (s12.c(s12Var, bk1Var, (q12) objD, this) != wtVar) {
                                vtVar5 = vtVar6;
                            }
                            return wtVar;
                        }
                        if (i25 != 2) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vtVar5 = (vt) this.k;
                        xc.G(obj);
                    }
                    if (!bk.J(vtVar5.f())) {
                        return obj2;
                    }
                    bk1 bk1Var2 = s12Var2.a;
                    rh rhVar = s12Var2.f;
                    this.k = vtVar5;
                    this.l = s12Var2;
                    this.m = bk1Var2;
                    this.j = 1;
                    rhVar.getClass();
                    objD = rh.D(rhVar, this);
                    if (objD == wtVar) {
                        return wtVar;
                    }
                    vtVar6 = vtVar5;
                    bk1Var = bk1Var2;
                    s12Var = s12Var2;
                    this.k = vtVar6;
                    this.l = null;
                    this.m = null;
                    this.j = 2;
                    if (s12.c(s12Var, bk1Var, (q12) objD, this) != wtVar) {
                    }
                    return wtVar;
                } finally {
                    s12Var2.g = null;
                }
            default:
                j92 j92Var = (j92) obj3;
                xo0 xo0Var = (xo0) this.m;
                jc1 jc1Var = (jc1) this.l;
                int i26 = this.j;
                try {
                    if (i26 == 0) {
                        xc.G(obj);
                        bw0 bw0Var = (bw0) ((zc1) this.k).e;
                        if (bw0Var != null) {
                            bw0Var.f = bl.d(jc1Var.x);
                        }
                        this.j = 1;
                        ic1 ic1Var = new ic1(jc1Var, null);
                        lt ltVar = this.f;
                        ltVar.getClass();
                        Object objP4 = nu0.P(jc1Var.a, new l6(jc1Var, ic1Var, al.z(ltVar), null, 8), this);
                        if (objP4 != wtVar) {
                            objP4 = obj2;
                        }
                        if (objP4 != wtVar) {
                            objP4 = obj2;
                        }
                        if (objP4 == wtVar) {
                            return wtVar;
                        }
                    } else {
                        if (i26 != 1) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xc.G(obj);
                    }
                    return obj2;
                } finally {
                    xo0Var.g().f(j92Var);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(s12 s12Var, ks ksVar) {
        super(2, ksVar);
        this.i = 16;
        this.n = s12Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m6(Object obj, Object obj2, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m6(Object obj, Object obj2, Object obj3, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m6(Object obj, Object obj2, Object obj3, Object obj4, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
    }
}
