package defpackage;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ long k;
    public Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(pw1 pw1Var, long j, tw1 tw1Var, ow1 ow1Var, ks ksVar) {
        super(2, ksVar);
        this.i = 3;
        this.l = pw1Var;
        this.k = j;
        this.m = tw1Var;
        this.n = ow1Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                return ((h) o((ks) obj2, (vt) obj)).q(t32Var);
            case 1:
                return ((h) o((ks) obj2, (TextClassifier) obj)).q(t32Var);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return ((h) o((ks) obj2, (zj1) obj)).q(t32Var);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return ((h) o((ks) obj2, (vt) obj)).q(t32Var);
            default:
                return ((h) o((ks) obj2, (vt) obj)).q(t32Var);
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (i) {
            case 0:
                return new h((oj0) obj3, this.k, (jx0) obj2, ksVar, 0);
            case 1:
                h hVar = new h(this.k, ksVar, (s71) obj3, (CharSequence) obj2);
                hVar.l = obj;
                return hVar;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                h hVar2 = new h((bk1) obj3, this.k, (wc1) obj2, ksVar, 2);
                hVar2.l = obj;
                return hVar2;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return new h((pw1) this.l, this.k, (tw1) obj3, (ow1) obj2, ksVar);
            default:
                return new h((fy0) obj3, this.k, (jx0) obj2, ksVar, 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r9.a(r4, r18) == r7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r9.a(r0, r18) == r7) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        pa1 pa1Var;
        fy0 fy0Var;
        oa1 oa1Var;
        int i = this.i;
        long j = this.k;
        t32 t32Var = t32.a;
        wt wtVar = wt.e;
        Object obj2 = this.m;
        Object obj3 = this.n;
        int i2 = 1;
        switch (i) {
            case 0:
                jx0 jx0Var = (jx0) obj3;
                int i3 = this.j;
                if (i3 == 0) {
                    xc.G(obj);
                    this.j = 1;
                    if (((oj0) obj2).w(this) != wtVar) {
                    }
                    return wtVar;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            xc.G(obj);
                            return t32Var;
                        }
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pa1Var = (pa1) this.l;
                    xc.G(obj);
                    this.l = null;
                    this.j = 3;
                    if (jx0Var.a(pa1Var, this) != wtVar) {
                        return t32Var;
                    }
                    return wtVar;
                }
                xc.G(obj);
                oa1 oa1Var2 = new oa1(j);
                pa1 pa1Var2 = new pa1(oa1Var2);
                this.l = pa1Var2;
                this.j = 2;
                if (jx0Var.a(oa1Var2, this) != wtVar) {
                    pa1Var = pa1Var2;
                    this.l = null;
                    this.j = 3;
                    if (jx0Var.a(pa1Var, this) != wtVar) {
                    }
                }
                return wtVar;
            case 1:
                int i4 = this.j;
                if (i4 == 0) {
                    xc.G(obj);
                    TextClassifier textClassifier = (TextClassifier) this.l;
                    this.j = 1;
                    return s71.a((s71) obj2, (CharSequence) obj3, this.k, textClassifier, this) == wtVar ? wtVar : t32Var;
                }
                if (i4 == 1) {
                    xc.G(obj);
                    return t32Var;
                }
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                bk1 bk1Var = (bk1) obj2;
                int i5 = this.j;
                if (i5 != 0) {
                    if (i5 == 1) {
                        xc.G(obj);
                        return t32Var;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                zj1 zj1Var = (zj1) this.l;
                float fH = bk1Var.h(j);
                o8 o8Var = new o8((wc1) obj3, bk1Var, zj1Var, 9);
                this.j = 1;
                gr1 gr1VarD = pv.D(0.0f, 0.0f, null, 7);
                r22 r22Var = c2.P;
                Float f = new Float(0.0f);
                Float f2 = new Float(fH);
                Float f3 = new Float(0.0f);
                sa0 sa0Var = r22Var.a;
                cb cbVarC = (cb) sa0Var.i(f3);
                if (cbVarC == null) {
                    cbVarC = ((cb) sa0Var.i(f)).c();
                }
                cb cbVar = cbVarC;
                Object objD = kd1.d(new xa(r22Var, f, cbVar, 56), new yv1(gr1VarD, r22Var, f, f2, cbVar), Long.MIN_VALUE, new wt1(i2, o8Var), this);
                if (objD != wtVar) {
                    objD = t32Var;
                }
                if (objD != wtVar) {
                    objD = t32Var;
                }
                return objD == wtVar ? wtVar : t32Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                int i6 = this.j;
                if (i6 == 0) {
                    xc.G(obj);
                    ly1 ly1Var = ((pw1) this.l).u;
                    if (ly1Var != null) {
                        this.j = 1;
                        if (new ly1(ly1Var.k, this, 0).q(t32Var) != wtVar) {
                        }
                    }
                    return wtVar;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        xc.G(obj);
                        return t32Var;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                this.j = 2;
                if (((tw1) obj2).a((ow1) obj3, this) != wtVar) {
                    return t32Var;
                }
                return wtVar;
            default:
                jx0 jx0Var2 = (jx0) obj3;
                fy0 fy0Var2 = (fy0) obj2;
                int i7 = this.j;
                if (i7 == 0) {
                    xc.G(obj);
                    oa1 oa1Var3 = (oa1) fy0Var2.getValue();
                    if (oa1Var3 == null) {
                        oa1Var = new oa1(j);
                        if (jx0Var2 != null) {
                            this.l = oa1Var;
                            this.j = 2;
                            break;
                        }
                        fy0Var2.setValue(oa1Var);
                        return t32Var;
                    }
                    na1 na1Var = new na1(oa1Var3);
                    if (jx0Var2 != null) {
                        this.l = fy0Var2;
                        this.j = 1;
                    }
                    fy0Var = fy0Var2;
                    break;
                    return wtVar;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oa1Var = (oa1) this.l;
                    xc.G(obj);
                    fy0Var2.setValue(oa1Var);
                    return t32Var;
                }
                fy0Var = (fy0) this.l;
                xc.G(obj);
                fy0Var.setValue(null);
                oa1Var = new oa1(j);
                if (jx0Var2 != null) {
                }
                fy0Var2.setValue(oa1Var);
                return t32Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j, ks ksVar, s71 s71Var, CharSequence charSequence) {
        super(2, ksVar);
        this.i = 1;
        this.m = s71Var;
        this.n = charSequence;
        this.k = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, long j, Object obj2, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.m = obj;
        this.k = j;
        this.n = obj2;
    }
}
