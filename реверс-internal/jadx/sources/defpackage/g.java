package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(q81 q81Var, jx0 jx0Var, hp1 hp1Var, ks ksVar) {
        super(2, ksVar);
        this.i = 16;
        this.l = q81Var;
        this.k = jx0Var;
        this.m = hp1Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                return ((g) o((ks) obj2, (vt) obj)).q(t32Var);
            case 1:
                return ((g) o((ks) obj2, (xa1) obj)).q(t32Var);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return ((g) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return ((g) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return ((g) o((ks) obj2, (g70) obj)).q(t32Var);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return ((g) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((g) o((ks) obj2, (fj1) obj)).q(t32Var);
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((g) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return ((g) o((ks) obj2, (vt) obj)).q(t32Var);
            case el.a /* 9 */:
                return ((g) o((ks) obj2, (vt) obj)).q(t32Var);
            case el.b /* 10 */:
                return ((g) o((ks) obj2, (vt) obj)).q(t32Var);
            case 11:
                return ((g) o((ks) obj2, (vt) obj)).q(t32Var);
            case el.c /* 12 */:
                return ((g) o((ks) obj2, (vt) obj)).q(t32Var);
            case 13:
                return ((g) o((ks) obj2, (zj1) obj)).q(t32Var);
            case 14:
                return ((g) o((ks) obj2, (fj1) obj)).q(t32Var);
            case 15:
                return ((g) o((ks) obj2, (vt) obj)).q(t32Var);
            case 16:
                return ((g) o((ks) obj2, (vt) obj)).q(t32Var);
            case 17:
                return ((g) o((ks) obj2, (xa1) obj)).q(t32Var);
            case 18:
                return ((g) o((ks) obj2, (vt) obj)).q(t32Var);
            case 19:
                return ((g) o((ks) obj2, (vt) obj)).q(t32Var);
            default:
                return ((g) o((ks) obj2, (vt) obj)).q(t32Var);
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                return new g((jx0) this.k, (na1) this.l, (az) obj2, ksVar, 0);
            case 1:
                g gVar = new g((d22) this.l, (fy0) obj2, ksVar, 1);
                gVar.k = obj;
                return gVar;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return new g((dh) this.k, (c01) this.l, (y3) obj2, ksVar, 2);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                g gVar2 = new g((g70) this.l, (nj) obj2, ksVar, 3);
                gVar2.k = obj;
                return gVar2;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                g gVar3 = new g((mv) obj2, ksVar, 4);
                gVar3.l = obj;
                return gVar3;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                g gVar4 = new g((mv) this.l, (wa0) obj2, ksVar, 5);
                gVar4.k = obj;
                return gVar4;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                g gVar5 = new g((nw) this.l, (wa0) obj2, ksVar, 6);
                gVar5.k = obj;
                return gVar5;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return new g((nw) this.k, (ly0) this.l, (wa0) obj2, ksVar, 7);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return new g((jx0) this.k, (yh0) this.l, (az) obj2, ksVar, 8);
            case el.a /* 9 */:
                return new g((rh) obj2, ksVar, 9);
            case el.b /* 10 */:
                return new g((lr0) this.l, (Uri) obj2, ksVar, 10);
            case 11:
                g gVar6 = new g((ic1) this.l, (y8) obj2, ksVar, 11);
                gVar6.k = obj;
                return gVar6;
            case el.c /* 12 */:
                g gVar7 = new g((String) obj2, ksVar, 12);
                gVar7.l = obj;
                return gVar7;
            case 13:
                g gVar8 = new g((y00) this.l, (bk1) obj2, ksVar, 13);
                gVar8.k = obj;
                return gVar8;
            case 14:
                g gVar9 = new g((bk1) this.l, (wa0) obj2, ksVar, 14);
                gVar9.k = obj;
                return gVar9;
            case 15:
                g gVar10 = new g((ns1) this.l, (h9) obj2, ksVar, 15);
                gVar10.k = obj;
                return gVar10;
            case 16:
                return new g((q81) this.l, (jx0) this.k, (hp1) obj2, ksVar);
            case 17:
                g gVar11 = new g((lt) this.l, (f70) obj2, ksVar, 17);
                gVar11.k = obj;
                return gVar11;
            case 18:
                return new g((gy1) this.k, (ma1) this.l, (l81) obj2, ksVar, 18);
            case 19:
                g gVar12 = new g((oj0) this.l, (wa0) obj2, ksVar, 19);
                gVar12.k = obj;
                return gVar12;
            default:
                return new g((zw1) this.l, (tw1) obj2, ksVar, 20);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x034f, code lost:
    
        if (r1 == r2) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x05f0, code lost:
    
        if (r0 == r4) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        if (r2 == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bb, code lost:
    
        if (r3.h(r2, r18) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0139, code lost:
    
        if (r0.c(r2, r18) == r3) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0147, code lost:
    
        if (defpackage.nu0.P(r2, r5, r18) == r3) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a5 A[Catch: all -> 0x0379, TryCatch #4 {all -> 0x0379, blocks: (B:175:0x0373, B:185:0x039d, B:187:0x03a5, B:188:0x03b2, B:195:0x03c2, B:182:0x038f, B:197:0x03c5, B:199:0x03ca, B:200:0x03cb, B:181:0x038a, B:189:0x03b3, B:191:0x03b9), top: B:408:0x0367, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x074a  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v42, types: [mj] */
    /* JADX WARN: Type inference failed for: r3v44, types: [rh] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v46, types: [mj] */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r5v8, types: [s, ya1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:183:0x0399 -> B:185:0x039d). Please report as a decompilation issue!!! */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) throws Throwable {
        Object objT;
        g70 g70Var;
        Object objP;
        ms1 ms1Var;
        qh qhVar;
        Object objB;
        boolean z;
        Object objP2;
        lr0 lr0Var;
        qs1 qs1Var;
        Object objY;
        Object oe1Var;
        File file;
        vt vtVar;
        my1 my1Var;
        int i = 6;
        ?? r3 = 5;
        char c = 5;
        char c2 = 5;
        int i2 = 8;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 2;
        int i4 = 3;
        int i5 = 1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        switch (this.i) {
            case 0:
                wt wtVar = wt.e;
                int i6 = this.j;
                if (i6 == 0) {
                    xc.G(obj);
                    jx0 jx0Var = (jx0) this.k;
                    na1 na1Var = (na1) this.l;
                    this.j = 1;
                    if (jx0Var.a(na1Var, this) == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (i6 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                az azVar = (az) this.m;
                if (azVar != null) {
                    azVar.a();
                }
                return t32.a;
            case 1:
                d22 d22Var = (d22) this.l;
                wt wtVar2 = wt.e;
                int i7 = this.j;
                if (i7 == 0) {
                    xc.G(obj);
                    xa1 xa1Var = (xa1) this.k;
                    y41 y41Var = new y41(i2, new l6(new a7(i3, d22Var), null));
                    ma maVar = new ma(xa1Var, d22Var, (fy0) this.m, 0);
                    this.j = 1;
                    if (y41Var.c(maVar, this) == wtVar2) {
                        return wtVar2;
                    }
                } else {
                    if (i7 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                t32 t32Var = t32.a;
                dh dhVar = (dh) this.k;
                wt wtVar3 = wt.e;
                int i8 = this.j;
                if (i8 == 0) {
                    xc.G(obj);
                    vr vrVar = dhVar.s;
                    bh bhVar = new bh(dhVar, (c01) this.l, (y3) this.m);
                    this.j = 1;
                    vrVar.getClass();
                    pc1 pc1Var = (pc1) bhVar.a();
                    if (pc1Var == null || vr.N0(vrVar, pc1Var, 0L, 0L, 3)) {
                        objT = t32Var;
                        if (objT == wtVar3) {
                            return wtVar3;
                        }
                    } else {
                        xi xiVar = new xi(1, bl.E(this));
                        xiVar.v();
                        sr srVar = new sr(bhVar, xiVar);
                        wg wgVar = vrVar.w;
                        iy0 iy0Var = wgVar.a;
                        pc1 pc1Var2 = (pc1) bhVar.a();
                        if (pc1Var2 == null) {
                            xiVar.g(t32Var);
                        } else {
                            xiVar.x(new d(c, wgVar, srVar));
                            rh0 rh0VarO0 = lk.o0(0, iy0Var.g);
                            int i9 = rh0VarO0.e;
                            int i10 = rh0VarO0.f;
                            if (i9 <= i10) {
                                while (true) {
                                    pc1 pc1Var3 = (pc1) ((sr) iy0Var.e[i10]).a.a();
                                    if (pc1Var3 != null) {
                                        pc1 pc1VarE = pc1Var2.e(pc1Var3);
                                        if (pc1VarE.equals(pc1Var2)) {
                                            iy0Var.a(i10 + 1, srVar);
                                        } else if (!pc1VarE.equals(pc1Var3)) {
                                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                            int i11 = iy0Var.g - 1;
                                            if (i11 <= i10) {
                                                while (true) {
                                                    ((sr) iy0Var.e[i10]).b.m(cancellationException);
                                                    if (i11 != i10) {
                                                        i11++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i10 != i9) {
                                        i10--;
                                    }
                                }
                                iy0Var.a(0, srVar);
                                if (!vrVar.z) {
                                    vrVar.O0(0L);
                                }
                            } else {
                                iy0Var.a(0, srVar);
                                if (!vrVar.z) {
                                }
                            }
                        }
                        objT = xiVar.t();
                        if (objT != wtVar3) {
                        }
                        if (objT == wtVar3) {
                        }
                    }
                } else {
                    if (i8 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                t32 t32Var2 = t32.a;
                vt vtVar2 = (vt) this.k;
                wt wtVar4 = wt.e;
                int i12 = this.j;
                if (i12 == 0) {
                    xc.G(obj);
                    g70 g70Var2 = (g70) this.l;
                    nj njVar = (nj) this.m;
                    lt ltVar = njVar.e;
                    int i13 = njVar.f;
                    if (i13 == -3) {
                        i13 = -2;
                    }
                    ph phVar = njVar.g;
                    yt ytVar = yt.g;
                    e eVar = new e(njVar, z4 ? 1 : 0, i);
                    ?? ya1Var = new ya1(lk.W(vtVar2, ltVar), nu0.d(i13, 4, phVar));
                    ya1Var.o0(ytVar, ya1Var, eVar);
                    this.k = null;
                    this.j = 1;
                    Object objU = al.u(g70Var2, ya1Var, true, this);
                    if (objU != wtVar4) {
                        objU = t32Var2;
                    }
                    if (objU == wtVar4) {
                        return wtVar4;
                    }
                } else {
                    if (i12 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32Var2;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                t32 t32Var3 = t32.a;
                mv mvVar = (mv) this.m;
                wt wtVar5 = wt.e;
                int i14 = this.j;
                if (i14 == 0) {
                    xc.G(obj);
                    g70Var = (g70) this.l;
                    this.l = g70Var;
                    this.j = 1;
                    objP = nu0.P(mvVar.f.f(), new wu(mvVar, z5 ? 1 : 0, i3), this);
                    if (objP != wtVar5) {
                    }
                    return wtVar5;
                }
                if (i14 == 1) {
                    g70Var = (g70) this.l;
                    xc.G(obj);
                    objP = obj;
                } else {
                    if (i14 != 2) {
                        if (i14 == 3) {
                            xc.G(obj);
                            return t32Var3;
                        }
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ms1Var = (lu) this.k;
                    g70Var = (g70) this.l;
                    xc.G(obj);
                    xg0 xg0Var = new xg0(12, new qt0(14, new xg0(15, new xg0(16, new xg0(13, new wu(mvVar, z7 ? 1 : 0, z3 ? 1 : 0), (qs1) mvVar.k.f), new xu(i3, z6 ? 1 : 0, z2 ? 1 : 0)), new zd(ms1Var, null, 3))), new yu(mvVar, (ks) null));
                    this.l = null;
                    this.k = null;
                    this.j = 3;
                    if (!(g70Var instanceof s02)) {
                        throw ((s02) g70Var).e;
                    }
                    Object objC = xg0Var.c(g70Var, this);
                    if (objC != wtVar5) {
                        objC = t32Var3;
                    }
                }
                break;
                ms1 ms1Var2 = (ms1) objP;
                if (!(ms1Var2 instanceof lu)) {
                    if (ms1Var2 instanceof m32) {
                        yc.l("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    if (ms1Var2 instanceof yb1) {
                        throw ((yb1) ms1Var2).b;
                    }
                    if (!(ms1Var2 instanceof n60)) {
                        if (ms1Var2 instanceof tz0) {
                            yc.l("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            return null;
                        }
                        ez1.a();
                        return null;
                    }
                    return t32Var3;
                }
                lu luVar = (lu) ms1Var2;
                Object obj2 = luVar.b;
                this.l = g70Var;
                this.k = luVar;
                this.j = 2;
                if (g70Var.l(obj2, this) != wtVar5) {
                    ms1Var = ms1Var2;
                    xg0 xg0Var2 = new xg0(12, new qt0(14, new xg0(15, new xg0(16, new xg0(13, new wu(mvVar, z7 ? 1 : 0, z3 ? 1 : 0), (qs1) mvVar.k.f), new xu(i3, z6 ? 1 : 0, z2 ? 1 : 0)), new zd(ms1Var, null, 3))), new yu(mvVar, (ks) null));
                    this.l = null;
                    this.k = null;
                    this.j = 3;
                    if (!(g70Var instanceof s02)) {
                    }
                }
                return wtVar5;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                mv mvVar2 = (mv) this.l;
                wt wtVar6 = wt.e;
                int i15 = this.j;
                if (i15 != 0) {
                    if (i15 == 1) {
                        xc.G(obj);
                        return obj;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                vt vtVar3 = (vt) this.k;
                ln lnVarA = bk.a();
                ms1 ms1VarQ = mvVar2.k.q();
                if (ms1VarQ instanceof lu) {
                    ms1VarQ = new tz0(((lu) ms1VarQ).a);
                }
                dv0 dv0Var = new dv0((wa0) this.m, lnVarA, ms1VarQ, vtVar3.f());
                vu vuVar = mvVar2.o;
                Object objT2 = ((rh) vuVar.g).t(dv0Var);
                if (objT2 instanceof wj) {
                    Throwable th = ((wj) objT2).a;
                    if (th == null) {
                        throw new hl("Channel was closed normally");
                    }
                    throw th;
                }
                if (objT2 instanceof xj) {
                    yc.l("Check failed.");
                    return null;
                }
                if (((AtomicInteger) ((qt0) vuVar.h).f).getAndIncrement() == 0) {
                    nu0.A((vt) vuVar.e, null, null, new qk1((Object) vuVar, (ks) (z8 ? 1 : 0), i5), 3);
                }
                this.j = 1;
                Object objB2 = lnVarA.B(this);
                return objB2 == wtVar6 ? wtVar6 : objB2;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                v41 v41Var = ((nw) this.l).d;
                wt wtVar7 = wt.e;
                int i16 = this.j;
                try {
                    if (i16 == 0) {
                        xc.G(obj);
                        fj1 fj1Var = (fj1) this.k;
                        v41Var.setValue(Boolean.TRUE);
                        wa0 wa0Var = (wa0) this.m;
                        this.j = 1;
                        if (wa0Var.h(fj1Var, this) == wtVar7) {
                            return wtVar7;
                        }
                    } else {
                        if (i16 != 1) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xc.G(obj);
                    }
                    v41Var.setValue(Boolean.FALSE);
                    return t32.a;
                } catch (Throwable th2) {
                    v41Var.setValue(Boolean.FALSE);
                    throw th2;
                }
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                wt wtVar8 = wt.e;
                int i17 = this.j;
                if (i17 == 0) {
                    xc.G(obj);
                    nw nwVar = (nw) this.k;
                    qy0 qy0Var = nwVar.c;
                    mw mwVar = nwVar.b;
                    ly0 ly0Var = (ly0) this.l;
                    g gVar = new g((Object) nwVar, this.m, (ks) (z9 ? 1 : 0), i);
                    this.j = 1;
                    qy0Var.getClass();
                    if (bl.r(new py0(ly0Var, qy0Var, gVar, mwVar, null), this) == wtVar8) {
                        return wtVar8;
                    }
                } else {
                    if (i17 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                wt wtVar9 = wt.e;
                int i18 = this.j;
                if (i18 == 0) {
                    xc.G(obj);
                    jx0 jx0Var2 = (jx0) this.k;
                    yh0 yh0Var = (yh0) this.l;
                    this.j = 1;
                    if (jx0Var2.a(yh0Var, this) == wtVar9) {
                        return wtVar9;
                    }
                } else {
                    if (i18 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                az azVar2 = (az) this.m;
                if (azVar2 != null) {
                    azVar2.a();
                }
                return t32.a;
            case el.a /* 9 */:
                wt wtVar10 = wt.e;
                int i19 = this.j;
                try {
                    if (i19 == 0) {
                        xc.G(obj);
                        r3 = (rh) this.m;
                        qhVar = new qh(r3);
                        this.k = r3;
                        this.l = qhVar;
                        this.j = 1;
                        objB = qhVar.b(this);
                        r3 = r3;
                        if (objB == wtVar10) {
                        }
                        if (((Boolean) objB).booleanValue()) {
                        }
                    } else {
                        if (i19 != 1) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qhVar = (qh) this.l;
                        mj mjVar = (mj) this.k;
                        xc.G(obj);
                        objB = obj;
                        r3 = mjVar;
                        if (((Boolean) objB).booleanValue()) {
                            hc0.b.set(false);
                            synchronized (aq1.c) {
                                ay0 ay0Var = aq1.j.h;
                                z = ay0Var != null && ay0Var.h();
                            }
                            if (z) {
                                aq1.a();
                            }
                            this.k = r3;
                            this.l = qhVar;
                            this.j = 1;
                            objB = qhVar.b(this);
                            r3 = r3;
                            if (objB == wtVar10) {
                                return wtVar10;
                            }
                            if (((Boolean) objB).booleanValue()) {
                                r3.a(null);
                                return t32.a;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CancellationException cancellationException2 = th3 instanceof CancellationException ? th3 : null;
                        if (cancellationException2 == null) {
                            cancellationException2 = new CancellationException("Channel was consumed, consumer had failed");
                            cancellationException2.initCause(th3);
                        }
                        r3.a(cancellationException2);
                        throw th4;
                    }
                }
                break;
            case el.b /* 10 */:
                lr0 lr0Var2 = (lr0) this.l;
                wt wtVar11 = wt.e;
                int i20 = this.j;
                if (i20 == 0) {
                    xc.G(obj);
                    qs1 qs1Var2 = lr0Var2.n;
                    Boolean bool = Boolean.TRUE;
                    qs1Var2.getClass();
                    qs1Var2.k(null, bool);
                    xg0 xg0Var3 = lr0Var2.d;
                    Uri uri = (Uri) this.m;
                    rd rdVarG = lr0.g(lr0Var2);
                    this.k = lr0Var2;
                    this.j = 1;
                    xg0Var3.getClass();
                    lw lwVar = qy.a;
                    objP2 = nu0.P(fw.g, new qq(xg0Var3, uri, rdVarG, null), this);
                    if (objP2 != wtVar11) {
                        lr0Var = lr0Var2;
                    }
                    return wtVar11;
                }
                if (i20 != 1) {
                    if (i20 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qs1 qs1Var3 = (qs1) this.k;
                    xc.G(obj);
                    qs1Var = qs1Var3;
                    objY = obj;
                    qs1Var.j(objY);
                    qs1 qs1Var4 = lr0Var2.n;
                    Boolean bool2 = Boolean.FALSE;
                    qs1Var4.getClass();
                    qs1Var4.k(null, bool2);
                    return t32.a;
                }
                lr0 lr0Var3 = (lr0) this.k;
                xc.G(obj);
                lr0Var = lr0Var3;
                objP2 = obj;
                lr0.e(lr0Var, (nq) objP2);
                qs1Var = lr0Var2.l;
                xg0 xg0Var4 = lr0Var2.d;
                rd rdVarG2 = lr0.g(lr0Var2);
                this.k = qs1Var;
                this.j = 2;
                objY = xg0Var4.y(rdVarG2, this);
                break;
            case 11:
                wt wtVar12 = wt.e;
                int i21 = this.j;
                if (i21 != 0) {
                    if (i21 == 1) {
                        xc.G(obj);
                        return t32.a;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                vt vtVar4 = (vt) this.k;
                ic1 ic1Var = (ic1) this.l;
                y8 y8Var = (y8) this.m;
                this.j = 1;
                ic1Var.f(vtVar4, y8Var, this);
                return wtVar12;
            case el.c /* 12 */:
                wt wtVar13 = wt.e;
                int i22 = this.j;
                try {
                    if (i22 == 0) {
                        xc.G(obj);
                        String str = (String) this.m;
                        File file2 = new File(str);
                        file2.setReadable(true, false);
                        file2.setWritable(true, false);
                        file2.setExecutable(true, false);
                        String[] strArr = {l91.h, "-c", "chmod 0777 \"" + str + "\""};
                        this.l = null;
                        this.k = file2;
                        this.j = 1;
                        lw lwVar2 = qy.a;
                        if (nu0.P(fw.g, new cg1(strArr, 1500L, null), this) == wtVar13) {
                            return wtVar13;
                        }
                        file = file2;
                    } else {
                        if (i22 != 1) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        file = (File) this.k;
                        xc.G(obj);
                    }
                    oe1Var = Boolean.valueOf(file.canExecute() || file.exists());
                    break;
                } catch (Throwable th5) {
                    oe1Var = new oe1(th5);
                }
                return oe1Var instanceof oe1 ? Boolean.FALSE : oe1Var;
            case 13:
                wt wtVar14 = wt.e;
                int i23 = this.j;
                if (i23 == 0) {
                    xc.G(obj);
                    zj1 zj1Var = (zj1) this.k;
                    y00 y00Var = (y00) this.l;
                    d dVar = new d(20, zj1Var, (bk1) this.m);
                    this.j = 1;
                    if (y00Var.h(dVar, this) == wtVar14) {
                        return wtVar14;
                    }
                } else {
                    if (i23 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case 14:
                wt wtVar15 = wt.e;
                int i24 = this.j;
                if (i24 == 0) {
                    xc.G(obj);
                    fj1 fj1Var2 = (fj1) this.k;
                    bk1 bk1Var = (bk1) this.l;
                    bk1Var.k = fj1Var2;
                    wa0 wa0Var2 = (wa0) this.m;
                    zj1 zj1Var2 = bk1Var.l;
                    this.j = 1;
                    if (wa0Var2.h(zj1Var2, this) == wtVar15) {
                        return wtVar15;
                    }
                } else {
                    if (i24 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case 15:
                wt wtVar16 = wt.e;
                int i25 = this.j;
                if (i25 == 0) {
                    xc.G(obj);
                    vt vtVar5 = (vt) this.k;
                    y41 y41Var2 = new y41(i2, new l6(new il1((ns1) this.l, 1), null));
                    r70 r70Var = new r70(c2, (h9) this.m, vtVar5);
                    this.j = 1;
                    if (y41Var2.c(r70Var, this) == wtVar16) {
                        return wtVar16;
                    }
                } else {
                    if (i25 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case 16:
                hp1 hp1Var = (hp1) this.m;
                wt wtVar17 = wt.e;
                int i26 = this.j;
                if (i26 == 0) {
                    xc.G(obj);
                    q81 q81Var = (q81) this.l;
                    ep1 ep1Var = new ep1((jx0) this.k, hp1Var, null);
                    yo1 yo1Var = new yo1(hp1Var, i4);
                    this.j = 1;
                    if (xv1.d(q81Var, ep1Var, yo1Var, this, 3) == wtVar17) {
                        return wtVar17;
                    }
                } else {
                    if (i26 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case 17:
                f70 f70Var = (f70) this.m;
                lt ltVar2 = (lt) this.l;
                wt wtVar18 = wt.e;
                int i27 = this.j;
                if (i27 == 0) {
                    xc.G(obj);
                    xa1 xa1Var2 = (xa1) this.k;
                    if (!xi0.o(ltVar2, d40.e)) {
                        qk1 qk1Var = new qk1(f70Var, xa1Var2, z10 ? 1 : 0, i4);
                        this.j = 2;
                    } else {
                        kq1 kq1Var = new kq1(xa1Var2, 0);
                        this.j = 1;
                    }
                    break;
                } else {
                    if (i27 != 1 && i27 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case 18:
                t32 t32Var4 = t32.a;
                wt wtVar19 = wt.e;
                int i28 = this.j;
                if (i28 == 0) {
                    xc.G(obj);
                    gy1 gy1Var = (gy1) this.k;
                    ma1 ma1Var = (ma1) this.l;
                    long j = ((l81) this.m).c;
                    this.j = 1;
                    gy1 gy1Var2 = new gy1(gy1Var.l, gy1Var.m, gy1Var.n, this);
                    gy1Var2.j = ma1Var;
                    gy1Var2.k = j;
                    if (gy1Var2.q(t32Var4) == wtVar19) {
                        return wtVar19;
                    }
                } else {
                    if (i28 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32Var4;
            case 19:
                wt wtVar20 = wt.e;
                int i29 = this.j;
                if (i29 == 0) {
                    xc.G(obj);
                    vtVar = (vt) this.k;
                    oj0 oj0Var = (oj0) this.l;
                    this.k = vtVar;
                    this.j = 1;
                    if (oj0Var.w(this) != wtVar20) {
                    }
                    return wtVar20;
                }
                if (i29 != 1) {
                    if (i29 == 2) {
                        xc.G(obj);
                        return t32.a;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vtVar = (vt) this.k;
                xc.G(obj);
                wa0 wa0Var3 = (wa0) this.m;
                this.k = null;
                this.j = 2;
                break;
            default:
                t32 t32Var5 = t32.a;
                zw1 zw1Var = (zw1) this.l;
                wt wtVar21 = wt.e;
                int i30 = this.j;
                try {
                } catch (Throwable th6) {
                    my1 my1Var2 = zw1Var.w;
                    if (my1Var2 == null) {
                        throw th6;
                    }
                    this.k = th6;
                    this.j = 4;
                    my1Var2.i(this);
                    if (t32Var5 != wtVar21) {
                        throw th6;
                    }
                }
                if (i30 == 0) {
                    xc.G(obj);
                    cv cvVar = zw1Var.v;
                    if (cvVar != null) {
                        this.j = 1;
                        if (cvVar.i(this) == wtVar21) {
                        }
                        return wtVar21;
                    }
                } else {
                    if (i30 != 1) {
                        if (i30 == 2) {
                            xc.G(obj);
                            my1Var = zw1Var.w;
                            if (my1Var != null) {
                                this.j = 3;
                                my1Var.i(this);
                                break;
                            }
                            return t32Var5;
                        }
                        if (i30 == 3) {
                            xc.G(obj);
                            return t32Var5;
                        }
                        if (i30 != 4) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th7 = (Throwable) this.k;
                        xc.G(obj);
                        throw th7;
                    }
                    xc.G(obj);
                }
                tw1 tw1Var = (tw1) this.m;
                this.j = 2;
                if (tw1Var.a(zw1Var, this) != wtVar21) {
                    my1Var = zw1Var.w;
                    if (my1Var != null) {
                    }
                    return t32Var5;
                }
                return wtVar21;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, Object obj3, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }
}
