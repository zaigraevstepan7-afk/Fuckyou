package defpackage;

import android.content.Context;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l6 extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public Object k;
    public Object l;
    public Object m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
        this.o = obj5;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) throws Throwable {
        int i = this.i;
        wt wtVar = wt.e;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                ((l6) o((ks) obj2, (vt) obj)).q(t32Var);
                return wtVar;
            case 1:
                return ((l6) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return ((l6) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return ((l6) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return ((l6) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return ((l6) o((ks) obj2, obj)).q(t32Var);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((l6) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((l6) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return ((l6) o((ks) obj2, (vt) obj)).q(t32Var);
            case el.a /* 9 */:
                ((l6) o((ks) obj2, (g70) obj)).q(t32Var);
                return wtVar;
            case el.b /* 10 */:
                return ((l6) o((ks) obj2, (vt) obj)).q(t32Var);
            default:
                return ((l6) o((ks) obj2, (zj1) obj)).q(t32Var);
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                l6 l6Var = new l6((c7) this.l, (sa0) this.m, (n6) this.n, (eo0) obj2, ksVar, 0);
                l6Var.k = obj;
                return l6Var;
            case 1:
                return new l6((wa0) this.l, (iq) this.m, (fy0) this.n, (fy0) obj2, ksVar, 1);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return new l6((iq) this.n, (xg0) obj2, ksVar, 2);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return new l6((jo0) this.k, (fy0) this.l, (gz1) this.m, (ry1) this.n, (df0) obj2, ksVar, 3);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return new l6((zg) this.k, (az1) this.l, (jo0) this.m, (qz1) this.n, (z01) obj2, ksVar, 4);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                l6 l6Var2 = new l6((List) this.n, (ArrayList) obj2, ksVar, 5);
                l6Var2.m = obj;
                return l6Var2;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return new l6((fy0) this.k, (fy0) this.l, (fy0) this.m, (fy0) this.n, (jx0) obj2, ksVar, 6);
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return new l6((h9) this.k, (gr1) this.l, (List) this.m, (s41) this.n, (r41) obj2, ksVar, 7);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                l6 l6Var3 = new l6((jc1) this.m, (ic1) this.n, (y8) obj2, ksVar, 8);
                l6Var3.k = obj;
                return l6Var3;
            case el.a /* 9 */:
                l6 l6Var4 = new l6((ha0) obj2, ksVar);
                l6Var4.n = obj;
                return l6Var4;
            case el.b /* 10 */:
                l6 l6Var5 = new l6((q81) this.l, (gy1) this.m, (p8) this.n, (ma1) obj2, ksVar, 10);
                l6Var5.k = obj;
                return l6Var5;
            default:
                l6 l6Var6 = new l6((s12) this.m, (bk1) this.n, (zc1) obj2, ksVar, 11);
                l6Var6.k = obj;
                return l6Var6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0439, code lost:
    
        if (r0.f(r26, r1) == r8) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x075e, code lost:
    
        if (r0 == r3) goto L305;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:51:0x01c9, B:56:0x01e4], limit reached: 379 */
    /* JADX WARN: Path cross not found for [B:56:0x01e4, B:51:0x01c9], limit reached: 379 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x02fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0362 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0394 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01da A[Catch: all -> 0x017e, PHI: r2 r4 r7 r8
      0x01da: PHI (r2v49 java.lang.Object) = (r2v48 java.lang.Object), (r2v53 java.lang.Object) binds: [B:52:0x01d7, B:45:0x0195] A[DONT_GENERATE, DONT_INLINE]
      0x01da: PHI (r4v33 mj) = (r4v32 mj), (r4v37 mj) binds: [B:52:0x01d7, B:45:0x0195] A[DONT_GENERATE, DONT_INLINE]
      0x01da: PHI (r7v19 ??) = (r7v50 ??), (r7v51 ??) binds: [B:52:0x01d7, B:45:0x0195] A[DONT_GENERATE, DONT_INLINE]
      0x01da: PHI (r8v26 g70) = (r8v25 g70), (r8v30 g70) binds: [B:52:0x01d7, B:45:0x0195] A[DONT_GENERATE, DONT_INLINE], TryCatch #9 {all -> 0x017e, blocks: (B:45:0x0195, B:54:0x01da, B:51:0x01c9, B:56:0x01e4, B:39:0x017a, B:48:0x01b3), top: B:368:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e4 A[Catch: all -> 0x017e, TRY_LEAVE, TryCatch #9 {all -> 0x017e, blocks: (B:45:0x0195, B:54:0x01da, B:51:0x01c9, B:56:0x01e4, B:39:0x017a, B:48:0x01b3), top: B:368:0x0163 }] */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v6, types: [fy0] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [ks] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r7v14, types: [int] */
    /* JADX WARN: Type inference failed for: r7v15, types: [y41] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, y41] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0087 -> B:16:0x0089). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01e2 -> B:51:0x01c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01f6 -> B:51:0x01c9). Please report as a decompilation issue!!! */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) throws Throwable {
        Object objH;
        Object objP;
        fy0 fy0Var;
        ?? r2;
        File file;
        String strU;
        Object objP2;
        File file2;
        Object objP3;
        Object obj2;
        List list;
        Iterator it;
        Object objB;
        qs1 qs1Var;
        n61 n61Var;
        n61 n61Var2;
        oj0 oj0Var;
        i2 i2Var;
        jc1 jc1Var;
        List listD;
        tp tpVar;
        jc1 jc1Var2;
        jc1 jc1Var3;
        g70 g70Var;
        Object objB2;
        ?? r7;
        Object objB3;
        zj1 zj1Var;
        int i = 12;
        mj mjVarD = null;
        boolean z = false;
        boolean z2 = false;
        int i2 = 2;
        int i3 = 1;
        ?? r6 = 0;
        switch (this.i) {
            case 0:
                n6 n6Var = (n6) this.n;
                c7 c7Var = (c7) this.l;
                wt wtVar = wt.e;
                int i4 = this.j;
                try {
                    if (i4 != 0) {
                        if (i4 != 1) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xc.G(obj);
                        throw new pn();
                    }
                    xc.G(obj);
                    vt vtVar = (vt) this.k;
                    go0 go0Var = ho0.a;
                    View view = c7Var.e;
                    go0Var.getClass();
                    xg0 xg0Var = new xg0(view);
                    ko0 ko0Var = new ko0(c7Var.e, new k6((eo0) this.o), xg0Var);
                    if (du1.a) {
                        nu0.A(vtVar, null, null, new e(n6Var, xg0Var, r6, i2), 3);
                    }
                    sa0 sa0Var = (sa0) this.m;
                    if (sa0Var != null) {
                        sa0Var.i(ko0Var);
                    }
                    n6Var.c = ko0Var;
                    this.j = 1;
                    c7Var.a(ko0Var, this);
                    return wtVar;
                } catch (Throwable th) {
                    n6Var.c = null;
                    throw th;
                }
            case 1:
                wt wtVar2 = wt.e;
                int i5 = this.j;
                if (i5 == 0) {
                    xc.G(obj);
                    wa0 wa0Var = (wa0) this.l;
                    iq iqVar = (iq) this.m;
                    this.j = 1;
                    objH = wa0Var.h(iqVar, this);
                    if (objH != wtVar2) {
                    }
                    return wtVar2;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fy0 fy0Var2 = (fy0) this.k;
                    xc.G(obj);
                    objP = obj;
                    fy0Var = fy0Var2;
                    r2 = fy0Var;
                    r6 = (f6) objP;
                    r2.setValue(r6);
                    ((fy0) this.o).setValue(Boolean.TRUE);
                    return t32.a;
                }
                xc.G(obj);
                objH = obj;
                File file3 = (File) objH;
                fy0 fy0Var3 = (fy0) this.n;
                r2 = fy0Var3;
                if (file3 != null) {
                    lw lwVar = qy.a;
                    fw fwVar = fw.g;
                    wd wdVar = new wd(file3, r6, z ? 1 : 0);
                    this.k = fy0Var3;
                    this.j = 2;
                    objP = nu0.P(fwVar, wdVar, this);
                    if (objP != wtVar2) {
                        fy0Var = fy0Var3;
                        r2 = fy0Var;
                        r6 = (f6) objP;
                    }
                    return wtVar2;
                }
                r2.setValue(r6);
                ((fy0) this.o).setValue(Boolean.TRUE);
                return t32.a;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                iq iqVar2 = (iq) this.n;
                wt wtVar3 = wt.e;
                int i6 = this.j;
                if (i6 == 0) {
                    xc.G(obj);
                    File file4 = new File(iqVar2.b);
                    if (file4.canRead()) {
                        return file4;
                    }
                    file = new File(((Context) ((xg0) this.o).g).getCacheDir(), "assets");
                    file.mkdirs();
                    strU = ct1.U(iqVar2.a);
                    String strConcat = "stat -c %Y_%s ".concat(l91.v(iqVar2.b));
                    this.k = file;
                    this.l = strU;
                    this.j = 1;
                    String[] strArr = {l91.h, "-c", strConcat};
                    lw lwVar2 = qy.a;
                    objP2 = nu0.P(fw.g, new cg1(strArr, 1500L, null), this);
                    if (objP2 != wtVar3) {
                    }
                    return wtVar3;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    File file5 = (File) this.m;
                    xc.G(obj);
                    file2 = file5;
                    objP3 = obj;
                    if (!((zf1) objP3).b() || !file2.exists()) {
                        return null;
                    }
                    return file2;
                }
                strU = (String) this.l;
                file = (File) this.k;
                xc.G(obj);
                objP2 = obj;
                String string = ct1.X(((zf1) objP2).b).toString();
                if (string.length() == 0) {
                    string = "0";
                }
                file2 = new File(file, String.valueOf((iqVar2.b + "|" + string).hashCode()) + (strU.length() != 0 ? ".".concat(strU) : ""));
                if (!file2.exists() || file2.length() <= 0) {
                    String strV = l91.v(iqVar2.b);
                    String strV2 = l91.v(file2.getAbsolutePath());
                    String strV3 = l91.v(file2.getAbsolutePath());
                    StringBuilder sbO = s91.o("cp -f ", strV, " ", strV2, " && chmod 0666 ");
                    sbO.append(strV3);
                    String string2 = sbO.toString();
                    this.k = null;
                    this.l = null;
                    this.m = file2;
                    this.j = 2;
                    String[] strArr2 = {l91.h, "-c", string2};
                    lw lwVar3 = qy.a;
                    objP3 = nu0.P(fw.g, new cg1(strArr2, 1500L, null), this);
                    break;
                }
                return file2;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                jo0 jo0Var = (jo0) this.k;
                wt wtVar4 = wt.e;
                int i7 = this.j;
                try {
                    if (i7 == 0) {
                        xc.G(obj);
                        y41 y41Var = new y41(8, new l6(new n8((fy0) this.l, 7), null));
                        uj ujVar = new uj(jo0Var, (gz1) this.m, (ry1) this.n, (df0) this.o, 1);
                        this.j = 1;
                        if (y41Var.c(ujVar, this) == wtVar4) {
                            return wtVar4;
                        }
                    } else {
                        if (i7 != 1) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xc.G(obj);
                    }
                    bl.v(jo0Var);
                    return t32.a;
                } catch (Throwable th2) {
                    bl.v(jo0Var);
                    throw th2;
                }
            case t91.LONG_FIELD_NUMBER /* 4 */:
                t32 t32Var = t32.a;
                wt wtVar5 = wt.e;
                int i8 = this.j;
                if (i8 == 0) {
                    xc.G(obj);
                    zg zgVar = (zg) this.k;
                    az1 az1Var = (az1) this.l;
                    cx1 cx1Var = ((jo0) this.m).a;
                    pz1 pz1Var = ((qz1) this.n).a;
                    z01 z01Var = (z01) this.o;
                    this.j = 1;
                    int iG = z01Var.g(wz1.e(az1Var.b));
                    Object objA = zgVar.a(iG < pz1Var.a.a.f.length() ? pz1Var.b(iG) : iG != 0 ? pz1Var.b(iG - 1) : new pc1(0.0f, 0.0f, 1.0f, (int) (jx1.a(cx1Var.b, cx1Var.g, cx1Var.h) & 4294967295L)), this);
                    if (objA != wtVar5) {
                        objA = t32Var;
                    }
                    if (objA == wtVar5) {
                        return wtVar5;
                    }
                } else {
                    if (i8 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32Var;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                int i9 = this.j;
                if (i9 == 0) {
                    xc.G(obj);
                    obj2 = this.m;
                    List list2 = (List) this.n;
                    list = (ArrayList) this.o;
                    it = list2.iterator();
                } else if (i9 == 1) {
                    obj2 = this.k;
                    it = (Iterator) this.l;
                    list = (List) this.m;
                    xc.G(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list.add(new nu(1, null));
                        this.m = list;
                        this.l = it;
                        this.k = null;
                        this.j = 2;
                        throw null;
                    }
                } else {
                    if (i9 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Iterator it2 = (Iterator) this.l;
                    List list3 = (List) this.m;
                    xc.G(obj);
                    list = list3;
                    it = it2;
                    obj2 = obj;
                }
                if (!it.hasNext()) {
                    return obj2;
                }
                if (it.next() != null) {
                    yc.d();
                    return null;
                }
                this.m = list;
                this.l = it;
                this.k = obj2;
                this.j = 1;
                throw null;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                wt wtVar6 = wt.e;
                int i10 = this.j;
                if (i10 != 0) {
                    if (i10 == 1) {
                        xc.G(obj);
                        return t32.a;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                ArrayList arrayList = ((fy0) this.k) != null ? new ArrayList() : null;
                ArrayList arrayList2 = ((fy0) this.l) != null ? new ArrayList() : null;
                ArrayList arrayList3 = ((fy0) this.m) != null ? new ArrayList() : null;
                ArrayList arrayList4 = ((fy0) this.n) != null ? new ArrayList() : null;
                tn1 tn1Var = ((jx0) this.o).a;
                qq0 qq0Var = new qq0(arrayList, arrayList2, arrayList3, arrayList4, (fy0) this.k, (fy0) this.l, (fy0) this.m, (fy0) this.n);
                this.j = 1;
                tn1Var.getClass();
                tn1.k(tn1Var, qq0Var, this);
                return wtVar6;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                wt wtVar7 = wt.e;
                int i11 = this.j;
                if (i11 == 0) {
                    xc.G(obj);
                    h9 h9Var = (h9) this.k;
                    Float f = new Float(1.0f);
                    gr1 gr1Var = (gr1) this.l;
                    this.j = 1;
                    objB = h9.b(h9Var, f, gr1Var, null, null, this, 12);
                    if (objB != wtVar7) {
                    }
                    return wtVar7;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                    r41 r41Var = (r41) this.o;
                    r41Var.h((r41Var.g() + 90.0f) % 360.0f);
                    return t32.a;
                }
                xc.G(obj);
                objB = obj;
                if (((ua) objB).b == ta.f) {
                    s41 s41Var = (s41) this.n;
                    s41Var.h((s41Var.g() + 1) % ((List) this.m).size());
                    h9 h9Var2 = (h9) this.k;
                    Float f2 = new Float(0.0f);
                    this.j = 2;
                    break;
                }
                return t32.a;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                wt wtVar8 = wt.e;
                int i12 = this.j;
                if (i12 == 0) {
                    xc.G(obj);
                    oj0 oj0VarD = bk.D(((vt) this.k).f());
                    jc1 jc1Var4 = (jc1) this.m;
                    synchronized (jc1Var4.c) {
                        Throwable th3 = jc1Var4.e;
                        if (th3 != null) {
                            throw th3;
                        }
                        if (((gc1) jc1Var4.u.getValue()).compareTo(gc1.f) <= 0) {
                            throw new IllegalStateException("Recomposer shut down");
                        }
                        if (jc1Var4.d != null) {
                            throw new IllegalStateException("Recomposer already running");
                        }
                        jc1Var4.d = oj0VarD;
                        if (jc1Var4.y() != null) {
                            mp.a("called outside of runRecomposeAndApplyChanges");
                        }
                    }
                    ud udVar = new ud(i, (jc1) this.m);
                    aq1.e(aq1.a);
                    synchronized (aq1.c) {
                        aq1.h = pl.k0(aq1.h, udVar);
                    }
                    i2 i2Var2 = new i2(udVar);
                    qs1 qs1Var2 = jc1.z;
                    t61 t61Var = ((jc1) this.m).y;
                    try {
                        do {
                            qs1Var = jc1.z;
                            n61Var = (n61) qs1Var.getValue();
                            v20 v20Var = v20.J;
                            c61 c61Var = n61Var.g;
                            if (c61Var.containsKey(t61Var)) {
                                n61Var2 = n61Var;
                            } else if (n61Var.isEmpty()) {
                                n61Var2 = new n61(t61Var, t61Var, c61Var.c(t61Var, new yp0(v20Var, v20Var)));
                            } else {
                                Object obj3 = n61Var.f;
                                Object obj4 = c61Var.get(obj3);
                                obj4.getClass();
                                n61Var2 = new n61(n61Var.e, t61Var, c61Var.c(obj3, new yp0(((yp0) obj4).a, t61Var)).c(t61Var, new yp0(obj3, v20Var)));
                            }
                            if (n61Var != n61Var2) {
                            }
                            jc1Var = (jc1) this.m;
                            synchronized (jc1Var.c) {
                                listD = jc1Var.D();
                            }
                            int size = listD.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                for (Object obj5 : ((tp) listD.get(i13)).j.g) {
                                    dc1 dc1Var = obj5 instanceof dc1 ? (dc1) obj5 : null;
                                    if (dc1Var != null && (tpVar = dc1Var.a) != null) {
                                        tpVar.s(dc1Var, null);
                                    }
                                }
                            }
                            g gVar = new g((ic1) this.n, (y8) this.o, (ks) r6, 11);
                            this.k = oj0VarD;
                            this.l = i2Var2;
                            this.j = 1;
                            if (bl.r(gVar, this) == wtVar8) {
                                return wtVar8;
                            }
                            oj0Var = oj0VarD;
                            i2Var = i2Var2;
                            i2Var.a();
                            jc1Var3 = (jc1) this.m;
                            synchronized (jc1Var3.c) {
                            }
                        } while (!qs1Var.h(n61Var, n61Var2));
                        jc1Var = (jc1) this.m;
                        synchronized (jc1Var.c) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        oj0Var = oj0VarD;
                        i2Var = i2Var2;
                        i2Var.a();
                        jc1Var2 = (jc1) this.m;
                        synchronized (jc1Var2.c) {
                            try {
                                if (jc1Var2.d == oj0Var) {
                                    jc1Var2.d = null;
                                }
                                if (jc1Var2.y() != null) {
                                    mp.a("called outside of runRecomposeAndApplyChanges");
                                }
                            } catch (Throwable th5) {
                                throw th5;
                            }
                            break;
                        }
                        qs1 qs1Var3 = jc1.z;
                        t61.a(((jc1) this.m).y);
                        throw th;
                    }
                } else {
                    if (i12 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2Var = (i2) this.l;
                    oj0Var = (oj0) this.k;
                    try {
                        xc.G(obj);
                        i2Var.a();
                        jc1Var3 = (jc1) this.m;
                        synchronized (jc1Var3.c) {
                            try {
                                if (jc1Var3.d == oj0Var) {
                                    jc1Var3.d = null;
                                }
                                if (jc1Var3.y() != null) {
                                    mp.a("called outside of runRecomposeAndApplyChanges");
                                }
                            } catch (Throwable th6) {
                                throw th6;
                            }
                            break;
                        }
                        qs1 qs1Var4 = jc1.z;
                        t61.a(((jc1) this.m).y);
                        return t32.a;
                    } catch (Throwable th7) {
                        th = th7;
                        i2Var.a();
                        jc1Var2 = (jc1) this.m;
                        synchronized (jc1Var2.c) {
                        }
                    }
                }
                break;
            case el.a /* 9 */:
                ha0 ha0Var = (ha0) this.o;
                wt wtVar9 = wt.e;
                ?? r72 = this.j;
                try {
                    if (r72 == 0) {
                        xc.G(obj);
                        g70Var = (g70) this.n;
                        y41 y41Var2 = new y41(i, z2 ? 1 : 0);
                        y41Var2.f = new ho1();
                        mjVarD = nu0.d(1, 6, null);
                        objB2 = y41Var2.B(mjVarD, ha0Var);
                        this.n = g70Var;
                        this.l = y41Var2;
                        this.m = mjVarD;
                        this.k = objB2;
                        this.j = 1;
                        r7 = y41Var2;
                        if (g70Var.l(objB2, this) == wtVar9) {
                        }
                        return wtVar9;
                    }
                    if (r72 != 1) {
                        if (r72 == 2) {
                            objB2 = this.k;
                            mjVarD = (mj) this.m;
                            y41 y41Var3 = (y41) this.l;
                            g70Var = (g70) this.n;
                            xc.G(obj);
                            r72 = y41Var3;
                            objB3 = r72.B(mjVarD, ha0Var);
                            r7 = r72;
                            if (!xi0.o(objB3, objB2)) {
                                this.n = g70Var;
                                this.l = r72;
                                this.m = mjVarD;
                                this.k = objB3;
                                this.j = 3;
                                if (g70Var.l(objB3, this) != wtVar9) {
                                    objB2 = objB3;
                                    r7 = r72;
                                }
                                return wtVar9;
                            }
                        } else if (r72 != 3) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    objB2 = this.k;
                    mjVarD = (mj) this.m;
                    y41 y41Var4 = (y41) this.l;
                    g70Var = (g70) this.n;
                    xc.G(obj);
                    r7 = y41Var4;
                    this.n = g70Var;
                    this.l = r7;
                    this.m = mjVarD;
                    this.k = objB2;
                    this.j = 2;
                    r72 = r7;
                    if (mjVarD.n(this) == wtVar9) {
                        objB3 = r72.B(mjVarD, ha0Var);
                        r7 = r72;
                        if (!xi0.o(objB3, objB2)) {
                        }
                        this.n = g70Var;
                        this.l = r7;
                        this.m = mjVarD;
                        this.k = objB2;
                        this.j = 2;
                        r72 = r7;
                        if (mjVarD.n(this) == wtVar9) {
                        }
                    }
                    return wtVar9;
                } catch (Throwable th8) {
                    bp bpVar = (bp) r72.f;
                    if (bpVar != null) {
                        bpVar.h(mjVarD);
                    }
                    bp bpVar2 = (bp) r72.f;
                    if (bpVar2 == null) {
                        e91.b("Called dispose on a manager that has been disposed of");
                    }
                    bpVar2.e();
                    r72.f = null;
                    throw th8;
                }
            case el.b /* 10 */:
                wt wtVar10 = wt.e;
                int i14 = this.j;
                if (i14 == 0) {
                    xc.G(obj);
                    vt vtVar2 = (vt) this.k;
                    q81 q81Var = (q81) this.l;
                    p00 p00Var = new p00(vtVar2, (gy1) this.m, (p8) this.n, (ma1) this.o, null);
                    this.j = 1;
                    if (el.o(q81Var, p00Var, this) == wtVar10) {
                        return wtVar10;
                    }
                } else {
                    if (i14 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            default:
                bk1 bk1Var = (bk1) this.n;
                zc1 zc1Var = (zc1) this.o;
                s12 s12Var = (s12) this.m;
                wt wtVar11 = wt.e;
                int i15 = this.j;
                if (i15 == 0) {
                    xc.G(obj);
                    zj1 zj1Var2 = (zj1) this.k;
                    float fJ = bk1Var.j(bk1Var.f(((q12) zc1Var.e).a));
                    bk1 bk1Var2 = s12Var.a;
                    bk1Var2.h(bk1Var2.f(zj1Var2.a(1, bk1Var2.i(bk1Var2.e(fJ)))));
                    zj1Var = zj1Var2;
                    if (!((q12) zc1Var.e).c) {
                    }
                } else {
                    if (i15 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zc1 zc1Var2 = (zc1) this.l;
                    zj1 zj1Var3 = (zj1) this.k;
                    xc.G(obj);
                    zj1 zj1Var4 = zj1Var3;
                    zc1 zc1Var3 = zc1Var2;
                    Object objR = obj;
                    zc1Var3.e = objR;
                    q12 q12Var = (q12) zc1Var.e;
                    xg0 xg0Var2 = s12Var.e;
                    long j = q12Var.b;
                    long j2 = q12Var.a;
                    ((q52) xg0Var2.f).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((q52) xg0Var2.g).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    q12 q12VarE = s12.e(s12Var.f);
                    if (q12VarE != null) {
                        xg0 xg0Var3 = s12Var.e;
                        long j3 = q12VarE.b;
                        long j4 = q12VarE.a;
                        ((q52) xg0Var3.f).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                        ((q52) xg0Var3.g).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                        zc1Var.e = ((q12) zc1Var.e).a(q12VarE);
                    }
                    float fJ2 = bk1Var.j(bk1Var.f(((q12) zc1Var.e).a));
                    bk1 bk1Var3 = s12Var.a;
                    bk1Var3.h(bk1Var3.f(zj1Var4.a(1, bk1Var3.i(bk1Var3.e(fJ2)))));
                    zj1Var = zj1Var4;
                    i3 = 1;
                    if (!((q12) zc1Var.e).c) {
                        rh rhVar = s12Var.f;
                        this.k = zj1Var;
                        this.l = zc1Var;
                        this.j = i3;
                        objR = bl.r(new e(rhVar, r6, 25), this);
                        if (objR == wtVar11) {
                            return wtVar11;
                        }
                        zj1Var4 = zj1Var;
                        zc1Var3 = zc1Var;
                        zc1Var3.e = objR;
                        q12 q12Var2 = (q12) zc1Var.e;
                        xg0 xg0Var22 = s12Var.e;
                        long j5 = q12Var2.b;
                        long j22 = q12Var2.a;
                        ((q52) xg0Var22.f).a(Float.intBitsToFloat((int) (j22 >> 32)), j5);
                        ((q52) xg0Var22.g).a(Float.intBitsToFloat((int) (j22 & 4294967295L)), j5);
                        q12 q12VarE2 = s12.e(s12Var.f);
                        if (q12VarE2 != null) {
                        }
                        float fJ22 = bk1Var.j(bk1Var.f(((q12) zc1Var.e).a));
                        bk1 bk1Var32 = s12Var.a;
                        bk1Var32.h(bk1Var32.f(zj1Var4.a(1, bk1Var32.i(bk1Var32.e(fJ22)))));
                        zj1Var = zj1Var4;
                        i3 = 1;
                        if (!((q12) zc1Var.e).c) {
                            return t32.a;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l6(Object obj, Object obj2, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.n = obj;
        this.o = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l6(Object obj, Object obj2, Object obj3, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l6(Object obj, Object obj2, Object obj3, Object obj4, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(ha0 ha0Var, ks ksVar) {
        super(2, ksVar);
        this.i = 9;
        this.o = ha0Var;
    }
}
