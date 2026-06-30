package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class y00 extends zu1 implements wa0 {
    public final /* synthetic */ int i = 1;
    public zc1 j;
    public zc1 k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ z00 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y00(zc1 zc1Var, z00 z00Var, ks ksVar) {
        super(2, ksVar);
        this.k = zc1Var;
        this.n = z00Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                return ((y00) o((ks) obj2, (sa0) obj)).q(t32Var);
            default:
                return ((y00) o((ks) obj2, (vt) obj)).q(t32Var);
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        z00 z00Var = this.n;
        switch (i) {
            case 0:
                y00 y00Var = new y00(this.k, z00Var, ksVar);
                y00Var.m = obj;
                return y00Var;
            default:
                y00 y00Var2 = new y00(z00Var, ksVar);
                y00Var2.m = obj;
                return y00Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e7, code lost:
    
        if (defpackage.z00.O0(r5, r8) != r4) goto L12;
     */
    /* JADX WARN: Path cross not found for [B:45:0x00ca, B:41:0x00b8], limit reached: 87 */
    /* JADX WARN: Path cross not found for [B:47:0x00ce, B:20:0x005e], limit reached: 87 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[PHI: r0 r3
      0x003a: PHI (r0v13 zc1) = (r0v5 zc1), (r0v17 zc1) binds: [B:14:0x0037, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r3v15 vt) = (r3v13 vt), (r3v16 vt) binds: [B:14:0x0037, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[PHI: r7
      0x005e: PHI (r7v14 vt) = (r7v7 vt), (r7v10 vt), (r7v10 vt), (r7v10 vt), (r7v12 vt), (r7v15 vt) binds: [B:19:0x0056, B:46:0x00cc, B:48:0x00d9, B:42:0x00c5, B:31:0x0089, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8 A[Catch: CancellationException -> 0x00c8, TryCatch #2 {CancellationException -> 0x00c8, blocks: (B:39:0x00b2, B:41:0x00b8, B:45:0x00ca, B:47:0x00ce), top: B:85:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca A[Catch: CancellationException -> 0x00c8, TryCatch #2 {CancellationException -> 0x00c8, blocks: (B:39:0x00b2, B:41:0x00b8, B:45:0x00ca, B:47:0x00ce), top: B:85:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0089 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c5 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00cc -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d9 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e7 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0133 -> B:76:0x0134). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0137 -> B:78:0x0139). Please report as a decompilation issue!!! */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) throws Throwable {
        sa0 sa0Var;
        Object obj2;
        vt vtVar;
        zc1 zc1Var;
        zc1 zc1Var2;
        zc1 zc1Var3;
        vt vtVar2;
        vt vtVar3;
        Object obj3;
        y00 y00Var;
        k00 k00Var;
        Object obj4;
        int i = this.i;
        t32 t32Var = t32.a;
        wt wtVar = wt.e;
        z00 z00Var = this.n;
        switch (i) {
            case 0:
                zc1 zc1Var4 = this.k;
                int i2 = this.l;
                if (i2 == 0) {
                    xc.G(obj);
                    sa0Var = (sa0) this.m;
                    obj2 = zc1Var4.e;
                    if (obj2 instanceof j00) {
                    }
                } else {
                    if (i2 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zc1 zc1Var5 = this.j;
                    sa0Var = (sa0) this.m;
                    xc.G(obj);
                    k00 k00Var2 = (k00) obj;
                    zc1Var5.e = k00Var2;
                    obj2 = zc1Var4.e;
                    if ((obj2 instanceof j00) && !(obj2 instanceof g00)) {
                        h00 h00Var = obj2 instanceof h00 ? (h00) obj2 : null;
                        if (h00Var != null) {
                            sa0Var.i(h00Var);
                        }
                        rh rhVar = z00Var.y;
                        if (rhVar != null) {
                            this.m = sa0Var;
                            this.j = zc1Var4;
                            this.l = 1;
                            obj = rh.D(rhVar, this);
                            if (obj == wtVar) {
                                return wtVar;
                            }
                            zc1Var5 = zc1Var4;
                            k00 k00Var22 = (k00) obj;
                            zc1Var5.e = k00Var22;
                            obj2 = zc1Var4.e;
                            return obj2 instanceof j00 ? t32Var : t32Var;
                        }
                        zc1Var5 = zc1Var4;
                        k00Var22 = null;
                        zc1Var5.e = k00Var22;
                        obj2 = zc1Var4.e;
                        if (obj2 instanceof j00) {
                        }
                    }
                }
                break;
            default:
                switch (this.l) {
                    case 0:
                        xc.G(obj);
                        vtVar = (vt) this.m;
                        if (!bl.G(vtVar)) {
                            zc1Var = new zc1();
                            rh rhVar2 = z00Var.y;
                            if (rhVar2 == null) {
                                zc1Var2 = zc1Var;
                                k00Var = null;
                                zc1Var.e = k00Var;
                                obj4 = zc1Var2.e;
                                if (obj4 instanceof i00) {
                                }
                                return wtVar;
                            }
                            this.m = vtVar;
                            this.j = zc1Var;
                            this.k = zc1Var;
                            this.l = 1;
                            obj = rh.D(rhVar2, this);
                            if (obj != wtVar) {
                                zc1Var2 = zc1Var;
                                k00Var = (k00) obj;
                                zc1Var.e = k00Var;
                                obj4 = zc1Var2.e;
                                if (obj4 instanceof i00) {
                                    this.m = vtVar;
                                    this.j = zc1Var2;
                                    this.k = null;
                                    this.l = 2;
                                    if (z00.P0(z00Var, (i00) obj4, this) != wtVar) {
                                        zc1Var3 = zc1Var2;
                                        vtVar2 = vtVar;
                                        y00Var = new y00(zc1Var3, z00Var, null);
                                        this.m = vtVar2;
                                        this.j = zc1Var3;
                                        this.l = 3;
                                        if (z00Var.S0(y00Var, this) != wtVar) {
                                            vtVar = vtVar2;
                                            try {
                                            } catch (CancellationException unused) {
                                                vtVar3 = vtVar;
                                                this.m = vtVar3;
                                                this.j = null;
                                                this.l = 6;
                                                break;
                                            }
                                            obj3 = zc1Var3.e;
                                            if (obj3 instanceof j00) {
                                                this.m = vtVar;
                                                this.j = null;
                                                this.l = 4;
                                                if (z00.Q0(z00Var, (j00) obj3, this) != wtVar) {
                                                    if (!bl.G(vtVar)) {
                                                    }
                                                }
                                            } else {
                                                if (obj3 instanceof g00) {
                                                    this.m = vtVar;
                                                    this.j = null;
                                                    this.l = 5;
                                                    if (z00.O0(z00Var, this) != wtVar) {
                                                    }
                                                }
                                                if (!bl.G(vtVar)) {
                                                    return t32Var;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return wtVar;
                        }
                        break;
                    case 1:
                        zc1Var = this.k;
                        zc1Var2 = this.j;
                        vtVar = (vt) this.m;
                        xc.G(obj);
                        k00Var = (k00) obj;
                        zc1Var.e = k00Var;
                        obj4 = zc1Var2.e;
                        if (obj4 instanceof i00) {
                        }
                        return wtVar;
                    case t91.FLOAT_FIELD_NUMBER /* 2 */:
                        zc1Var3 = this.j;
                        vtVar2 = (vt) this.m;
                        xc.G(obj);
                        y00Var = new y00(zc1Var3, z00Var, null);
                        this.m = vtVar2;
                        this.j = zc1Var3;
                        this.l = 3;
                        if (z00Var.S0(y00Var, this) != wtVar) {
                        }
                        return wtVar;
                    case t91.INTEGER_FIELD_NUMBER /* 3 */:
                        zc1Var3 = this.j;
                        vtVar2 = (vt) this.m;
                        try {
                            xc.G(obj);
                        } catch (CancellationException unused2) {
                            vtVar3 = vtVar2;
                            this.m = vtVar3;
                            this.j = null;
                            this.l = 6;
                        }
                        vtVar = vtVar2;
                        obj3 = zc1Var3.e;
                        if (obj3 instanceof j00) {
                        }
                        break;
                    case t91.LONG_FIELD_NUMBER /* 4 */:
                        vtVar3 = (vt) this.m;
                        try {
                            xc.G(obj);
                        } catch (CancellationException unused3) {
                            this.m = vtVar3;
                            this.j = null;
                            this.l = 6;
                        }
                        vtVar = vtVar3;
                        if (!bl.G(vtVar)) {
                        }
                        break;
                    case t91.STRING_FIELD_NUMBER /* 5 */:
                        vtVar3 = (vt) this.m;
                        xc.G(obj);
                        vtVar = vtVar3;
                        if (!bl.G(vtVar)) {
                        }
                        break;
                    case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                        vtVar3 = (vt) this.m;
                        xc.G(obj);
                        vtVar = vtVar3;
                        if (!bl.G(vtVar)) {
                        }
                        break;
                    default:
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y00(z00 z00Var, ks ksVar) {
        super(2, ksVar);
        this.n = z00Var;
    }
}
