package defpackage;

import android.view.textclassifier.TextClassifier;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = obj;
        this.l = obj2;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) throws Throwable {
        int i = this.i;
        wt wtVar = wt.e;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case 1:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ((e) o((ks) obj2, (yg0) obj)).q(t32Var);
                return wtVar;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((e) o((ks) obj2, (ya1) obj)).q(t32Var);
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((e) o((ks) obj2, (g70) obj)).q(t32Var);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case el.a /* 9 */:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case el.b /* 10 */:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case 11:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case el.c /* 12 */:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case 13:
                ((e) o((ks) obj2, (vt) obj)).q(t32Var);
                return wtVar;
            case 14:
                return ((e) o((ks) obj2, (tu) obj)).q(t32Var);
            case 15:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case 16:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case 17:
                return ((e) o((ks) obj2, (dv0) obj)).q(t32Var);
            case 18:
                ((e) o((ks) obj2, (vt) obj)).q(t32Var);
                return wtVar;
            case 19:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case 20:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case 21:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case 22:
                ((e) o((ks) obj2, (vt) obj)).q(t32Var);
                return wtVar;
            case 23:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case 24:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case 25:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case 26:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case 27:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            case 28:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
            default:
                return ((e) o((ks) obj2, (vt) obj)).q(t32Var);
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                return new e((jx0) this.k, (ce0) obj2, ksVar, 0);
            case 1:
                return new e((jx0) this.k, (de0) obj2, ksVar, 1);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return new e((n6) this.k, (xg0) obj2, ksVar, 2);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                e eVar = new e((c7) obj2, ksVar, 3);
                eVar.k = obj;
                return eVar;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                e eVar2 = new e((v81) obj2, ksVar, 4);
                eVar2.k = obj;
                return eVar2;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return new e((dh) this.k, (ke) obj2, ksVar, 5);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                e eVar3 = new e((nj) obj2, ksVar, 6);
                eVar3.k = obj;
                return eVar3;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                e eVar4 = new e((qj) obj2, ksVar, 7);
                eVar4.k = obj;
                return eVar4;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return new e((yo) this.k, (Runnable) obj2, ksVar, 8);
            case el.a /* 9 */:
                e eVar5 = new e((iq) obj2, ksVar, 9);
                eVar5.k = obj;
                return eVar5;
            case el.b /* 10 */:
                return new e((rd) this.k, (xg0) obj2, ksVar, 10);
            case 11:
                return new e((ry1) this.k, (zg) obj2, ksVar, 11);
            case el.c /* 12 */:
                return new e((q81) this.k, (ry1) obj2, ksVar, 12);
            case 13:
                return new e((oj0) this.k, (iu) obj2, ksVar, 13);
            case 14:
                e eVar6 = new e((List) obj2, ksVar, 14);
                eVar6.k = obj;
                return eVar6;
            case 15:
                return new e((mv) this.k, (dv0) obj2, ksVar, 15);
            case 16:
                return new e((wa0) this.k, (lu) obj2, ksVar, 16);
            case 17:
                e eVar7 = new e((mv) obj2, ksVar, 17);
                eVar7.k = obj;
                return eVar7;
            case 18:
                return new e((eo0) this.k, (m6) obj2, ksVar, 18);
            case 19:
                return new e((lr0) obj2, ksVar, 19);
            case 20:
                return new e((lr0) this.k, (String) obj2, ksVar, 20);
            case 21:
                return new e((lr0) this.k, (l32) obj2, ksVar, 21);
            case 22:
                return new e((os1) this.k, (bw0) obj2, ksVar, 22);
            case 23:
                e eVar8 = new e((qw0) obj2, ksVar, 23);
                eVar8.k = obj;
                return eVar8;
            case 24:
                return new e((l01) this.k, (wa0) obj2, ksVar, 24);
            case 25:
                e eVar9 = new e((mj) obj2, ksVar, 25);
                eVar9.k = obj;
                return eVar9;
            case 26:
                return new e((TextClassifier) this.k, (wa0) obj2, ksVar, 26);
            case 27:
                return new e((q7) this.k, (wa) obj2, ksVar, 27);
            case 28:
                e eVar10 = new e((q7) obj2, ksVar, 28);
                eVar10.k = obj;
                return eVar10;
            default:
                return new e((j00) this.k, (uj1) obj2, ksVar, 29);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x0407, code lost:
    
        if (r0 == r2) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x044c, code lost:
    
        if (r0 == r2) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x04eb, code lost:
    
        if (defpackage.al.s(500, r5) != r0) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04e0 A[Catch: all -> 0x0496, TryCatch #2 {all -> 0x0496, blocks: (B:248:0x0492, B:276:0x04ef, B:269:0x04d7, B:272:0x04e0, B:253:0x049c, B:254:0x04a0, B:255:0x04a8, B:265:0x04c7, B:267:0x04d0), top: B:475:0x0488 }] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b3  */
    /* JADX WARN: Type inference failed for: r11v0, types: [ks] */
    /* JADX WARN: Type inference failed for: r11v29, types: [java.lang.Object, qz1] */
    /* JADX WARN: Type inference failed for: r11v55, types: [java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r11v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r1v102, types: [int] */
    /* JADX WARN: Type inference failed for: r1v103, types: [oj0] */
    /* JADX WARN: Type inference failed for: r1v107, types: [oj0] */
    /* JADX WARN: Type inference failed for: r1v122 */
    /* JADX WARN: Type inference failed for: r1v123 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:273:0x04eb -> B:276:0x04ef). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:411:0x07ee -> B:413:0x07f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x01b3 -> B:88:0x0174). Please report as a decompilation issue!!! */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) throws Throwable {
        vt vtVar;
        Object oe1Var;
        Object objP;
        Object objL;
        Collection collection;
        Object objB;
        Object objY;
        qs1 qs1Var;
        Object value;
        Object value2;
        Object value3;
        qs1 qs1Var2;
        Object value4;
        vt vtVar2;
        Object objD;
        float fY;
        float fY2;
        bk1 bk1Var;
        e eVar;
        Object objN;
        e eVar2 = this;
        int i = 7;
        int i2 = 4;
        int i3 = 3;
        int i4 = 2;
        int i5 = 0;
        int i6 = 1;
        ?? r11 = 0;
        switch (eVar2.i) {
            case 0:
                wt wtVar = wt.e;
                int i7 = eVar2.j;
                if (i7 == 0) {
                    xc.G(obj);
                    jx0 jx0Var = (jx0) eVar2.k;
                    ce0 ce0Var = (ce0) eVar2.l;
                    eVar2.j = 1;
                    if (jx0Var.a(ce0Var, eVar2) == wtVar) {
                        return wtVar;
                    }
                } else {
                    if (i7 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case 1:
                wt wtVar2 = wt.e;
                int i8 = eVar2.j;
                if (i8 == 0) {
                    xc.G(obj);
                    jx0 jx0Var2 = (jx0) eVar2.k;
                    de0 de0Var = (de0) eVar2.l;
                    eVar2.j = 1;
                    if (jx0Var2.a(de0Var, eVar2) == wtVar2) {
                        return wtVar2;
                    }
                } else {
                    if (i8 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                wt wtVar3 = wt.e;
                int i9 = eVar2.j;
                if (i9 == 0) {
                    xc.G(obj);
                    eVar2.j = 1;
                    lt ltVar = eVar2.f;
                    ltVar.getClass();
                    if (al.z(ltVar).c(new fc0(new mt(17), 1), eVar2) != wtVar3) {
                    }
                    return wtVar3;
                }
                if (i9 != 1) {
                    if (i9 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                    yc.j();
                    return null;
                }
                xc.G(obj);
                dy0 dy0VarI = ((n6) eVar2.k).i();
                if (dy0VarI == null) {
                    return t32.a;
                }
                j6 j6Var = new j6(i5, (xg0) eVar2.l);
                eVar2.j = 2;
                tn1.k((tn1) dy0VarI, j6Var, eVar2);
                return wtVar3;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                wt wtVar4 = wt.e;
                int i10 = eVar2.j;
                if (i10 == 0) {
                    xc.G(obj);
                    yg0 yg0Var = (yg0) eVar2.k;
                    c7 c7Var = (c7) eVar2.l;
                    eVar2.k = yg0Var;
                    eVar2.j = 1;
                    xi xiVar = new xi(1, bl.E(eVar2));
                    xiVar.v();
                    gz1 gz1Var = c7Var.f;
                    z71 z71Var = gz1Var.a;
                    z71Var.c();
                    gz1Var.b.set(new kz1(gz1Var, z71Var));
                    xiVar.x(new b7(1, yg0Var, c7Var));
                    if (xiVar.t() == wtVar4) {
                        return wtVar4;
                    }
                } else {
                    if (i10 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                yc.j();
                return null;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                lt ltVar2 = eVar2.f;
                wt wtVar5 = wt.e;
                int i11 = eVar2.j;
                if (i11 == 0) {
                    xc.G(obj);
                    vtVar = (vt) eVar2.k;
                    if (bl.G(vtVar)) {
                    }
                } else {
                    if (i11 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vtVar = (vt) eVar2.k;
                    xc.G(obj);
                    v81 v81Var = (v81) eVar2.l;
                    int[] iArr = v81Var.I;
                    if (v81Var.isAttachedToWindow()) {
                        int i12 = iArr[0];
                        int i13 = iArr[1];
                        v81Var.q.getLocationOnScreen(iArr);
                        if (i12 != iArr[0] || i13 != iArr[1]) {
                            v81Var.q();
                        }
                    }
                    if (bl.G(vtVar)) {
                        a4 a4Var = a4.l;
                        eVar2.k = vtVar;
                        eVar2.j = 1;
                        ltVar2.getClass();
                        if (ltVar2.l(v20.N) != null) {
                            yc.d();
                            return null;
                        }
                        ltVar2.getClass();
                        if (al.z(ltVar2).c(a4Var, eVar2) == wtVar5) {
                            return wtVar5;
                        }
                        v81 v81Var2 = (v81) eVar2.l;
                        int[] iArr2 = v81Var2.I;
                        if (v81Var2.isAttachedToWindow()) {
                        }
                        if (bl.G(vtVar)) {
                            return t32.a;
                        }
                    }
                }
                break;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                wt wtVar6 = wt.e;
                int i14 = eVar2.j;
                if (i14 == 0) {
                    xc.G(obj);
                    dh dhVar = (dh) eVar2.k;
                    ke keVar = (ke) eVar2.l;
                    eVar2.j = 1;
                    if (wi0.t(dhVar, keVar, eVar2) == wtVar6) {
                        return wtVar6;
                    }
                } else {
                    if (i14 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                ya1 ya1Var = (ya1) eVar2.k;
                wt wtVar7 = wt.e;
                int i15 = eVar2.j;
                if (i15 == 0) {
                    xc.G(obj);
                    nj njVar = (nj) eVar2.l;
                    eVar2.k = null;
                    eVar2.j = 1;
                    if (njVar.a(ya1Var, eVar2) == wtVar7) {
                        return wtVar7;
                    }
                } else {
                    if (i15 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                g70 g70Var = (g70) eVar2.k;
                wt wtVar8 = wt.e;
                int i16 = eVar2.j;
                if (i16 == 0) {
                    xc.G(obj);
                    qj qjVar = (qj) eVar2.l;
                    eVar2.k = null;
                    eVar2.j = 1;
                    if (qjVar.f(g70Var, eVar2) == wtVar8) {
                        return wtVar8;
                    }
                } else {
                    if (i16 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                t32 t32Var = t32.a;
                yo yoVar = (yo) eVar2.k;
                wt wtVar9 = wt.e;
                int i17 = eVar2.j;
                if (i17 == 0) {
                    xc.G(obj);
                    vd0 vd0Var = yoVar.f;
                    eVar2.j = 1;
                    Object objB2 = vd0Var.b(0.0f - vd0Var.b, eVar2);
                    if (objB2 != wtVar9) {
                        objB2 = t32Var;
                    }
                    if (objB2 == wtVar9) {
                        return wtVar9;
                    }
                } else {
                    if (i17 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                ((v41) yoVar.c.f).setValue(Boolean.FALSE);
                ((Runnable) eVar2.l).run();
                return t32Var;
            case el.a /* 9 */:
                iq iqVar = (iq) eVar2.l;
                wt wtVar10 = wt.e;
                int i18 = eVar2.j;
                if (i18 == 0) {
                    xc.G(obj);
                    try {
                        oe1Var = Boolean.valueOf(new File(iqVar.b).delete());
                    } catch (Throwable th) {
                        oe1Var = new oe1(th);
                    }
                    Boolean bool = Boolean.FALSE;
                    boolean z = oe1Var instanceof oe1;
                    Object obj2 = oe1Var;
                    if (z) {
                        obj2 = bool;
                    }
                    if (((Boolean) obj2).booleanValue()) {
                        return new mq("Deleted: " + iqVar.a);
                    }
                    String strConcat = "rm -f ".concat(l91.v(iqVar.b));
                    eVar2.k = null;
                    eVar2.j = 1;
                    String[] strArr = {l91.h, "-c", strConcat};
                    lw lwVar = qy.a;
                    objP = nu0.P(fw.g, new cg1(strArr, 1500L, null), eVar2);
                    if (objP == wtVar10) {
                        return wtVar10;
                    }
                    break;
                } else {
                    if (i18 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                    objP = obj;
                }
                zf1 zf1Var = (zf1) objP;
                if (zf1Var.b()) {
                    return new mq("Deleted: " + iqVar.a);
                }
                String strA = zf1Var.a();
                if (strA.length() == 0) {
                    strA = "Failed to delete";
                }
                return new lq(strA);
            case el.b /* 10 */:
                xg0 xg0Var = (xg0) eVar2.l;
                rd rdVar = (rd) eVar2.k;
                wt wtVar11 = wt.e;
                int i19 = eVar2.j;
                if (i19 == 0) {
                    xc.G(obj);
                    List list = rdVar.d;
                    List list2 = rdVar.e;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        File[] fileArrListFiles = new File((String) it.next()).listFiles(new jq(list2));
                        if (fileArrListFiles == null) {
                            collection = f40.e;
                        } else {
                            ArrayList arrayList = new ArrayList(fileArrListFiles.length);
                            int i20 = i5;
                            for (int length = fileArrListFiles.length; i20 < length; length = length) {
                                File file = fileArrListFiles[i20];
                                String name = file.getName();
                                name.getClass();
                                int i21 = i5;
                                String absolutePath = file.getAbsolutePath();
                                absolutePath.getClass();
                                arrayList.add(new iq(name, absolutePath, file.lastModified()));
                                i20++;
                                i5 = i21;
                            }
                            collection = arrayList;
                        }
                        int i22 = i5;
                        if (!collection.isEmpty()) {
                            return pl.m0(collection, new x80(i));
                        }
                        i5 = i22;
                    }
                    String str = (String) pl.c0(rdVar.d);
                    eVar2.j = 1;
                    objL = xg0.l(xg0Var, str, list2, eVar2);
                    if (objL == wtVar11) {
                        return wtVar11;
                    }
                } else {
                    if (i19 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                    objL = obj;
                }
                return pl.m0((Iterable) objL, new x80(8));
            case 11:
                wt wtVar12 = wt.e;
                int i23 = eVar2.j;
                if (i23 == 0) {
                    xc.G(obj);
                    ry1 ry1Var = (ry1) eVar2.k;
                    z01 z01Var = ry1Var.b;
                    long j = ry1Var.n().b;
                    int i24 = wz1.c;
                    int iG = z01Var.g((int) (j >> 32));
                    jo0 jo0Var = ry1Var.d;
                    D = jo0Var != null ? jo0Var.d() : 0;
                    D.getClass();
                    pz1 pz1Var = D.a;
                    pc1 pc1VarC = pz1Var.c(lk.A(iG, 0, pz1Var.a.a.f.length()));
                    zg zgVar = (zg) eVar2.l;
                    eVar2.j = 1;
                    if (zgVar.a(pc1VarC, eVar2) == wtVar12) {
                        return wtVar12;
                    }
                } else {
                    if (i23 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case el.c /* 12 */:
                wt wtVar13 = wt.e;
                int i25 = eVar2.j;
                if (i25 == 0) {
                    xc.G(obj);
                    q81 q81Var = (q81) eVar2.k;
                    vs vsVar = new vs((ry1) eVar2.l, i6);
                    eVar2.j = 1;
                    if (xv1.d(q81Var, null, vsVar, eVar2, 7) == wtVar13) {
                        return wtVar13;
                    }
                } else {
                    if (i25 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case 13:
                iu iuVar = (iu) eVar2.l;
                wt wtVar14 = wt.e;
                int i26 = eVar2.j;
                try {
                    if (i26 != 0) {
                        if (i26 == 1) {
                            xc.G(obj);
                        } else {
                            if (i26 == 2) {
                                xc.G(obj);
                                throw new pn();
                            }
                            if (i26 != 3) {
                                if (i26 != 4) {
                                    yc.l("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                xc.G(obj);
                                iuVar.c.h(1.0f);
                                eVar2.j = 3;
                                if (al.s(500L, eVar2) == wtVar14) {
                                    iuVar.c.h(0.0f);
                                    eVar2.j = 4;
                                    break;
                                }
                                return wtVar14;
                            }
                            xc.G(obj);
                            iuVar.c.h(0.0f);
                            eVar2.j = 4;
                        }
                        break;
                    } else {
                        xc.G(obj);
                        oj0 oj0Var = (oj0) eVar2.k;
                        if (oj0Var != null) {
                            eVar2.j = 1;
                            oj0Var.a(null);
                            Object objW = oj0Var.w(eVar2);
                            if (objW != wtVar14) {
                                objW = t32.a;
                            }
                            if (objW == wtVar14) {
                            }
                            return wtVar14;
                        }
                    }
                    iuVar.c.h(1.0f);
                    if (!iuVar.a) {
                        eVar2.j = 2;
                        al.i(eVar2);
                        return wtVar14;
                    }
                    eVar2.j = 3;
                    if (al.s(500L, eVar2) == wtVar14) {
                    }
                    return wtVar14;
                } catch (Throwable th2) {
                    iuVar.c.h(0.0f);
                    throw th2;
                }
            case 14:
                wt wtVar15 = wt.e;
                int i27 = eVar2.j;
                if (i27 == 0) {
                    xc.G(obj);
                    tu tuVar = (tu) eVar2.k;
                    List list3 = (List) eVar2.l;
                    eVar2.j = 1;
                    if (hk.g(list3, tuVar, eVar2) == wtVar15) {
                        return wtVar15;
                    }
                } else {
                    if (i27 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case 15:
                dv0 dv0Var = (dv0) eVar2.l;
                mv mvVar = (mv) eVar2.k;
                wt wtVar16 = wt.e;
                int i28 = eVar2.j;
                if (i28 != 0) {
                    if (i28 != 1) {
                        if (i28 == 2) {
                            xc.G(obj);
                        } else if (i28 != 3) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    xc.G(obj);
                    return obj;
                }
                xc.G(obj);
                ms1 ms1VarQ = mvVar.k.q();
                if (ms1VarQ instanceof lu) {
                    wa0 wa0Var = dv0Var.a;
                    lt ltVar3 = dv0Var.d;
                    eVar2.j = 1;
                    objB = mvVar.i().b(new jv(mvVar, ltVar3, wa0Var, (ks) null), eVar2);
                    break;
                } else {
                    if (!(ms1VarQ instanceof yb1) && !(ms1VarQ instanceof m32)) {
                        if (ms1VarQ instanceof n60) {
                            throw ((n60) ms1VarQ).b;
                        }
                        if (ms1VarQ instanceof tz0) {
                            yc.l("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            return null;
                        }
                        ez1.a();
                        return null;
                    }
                    if (ms1VarQ != dv0Var.c) {
                        throw ((yb1) ms1VarQ).b;
                    }
                    eVar2.j = 2;
                    if (mv.d(mvVar, eVar2) != wtVar16) {
                    }
                }
                return wtVar16;
                wa0 wa0Var2 = dv0Var.a;
                lt ltVar4 = dv0Var.d;
                eVar2.j = 3;
                objB = mvVar.i().b(new jv(mvVar, ltVar4, wa0Var2, (ks) null), eVar2);
                break;
            case 16:
                wt wtVar17 = wt.e;
                int i29 = eVar2.j;
                if (i29 != 0) {
                    if (i29 == 1) {
                        xc.G(obj);
                        return obj;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                wa0 wa0Var3 = (wa0) eVar2.k;
                Object obj3 = ((lu) eVar2.l).b;
                eVar2.j = 1;
                Object objH = wa0Var3.h(obj3, eVar2);
                return objH == wtVar17 ? wtVar17 : objH;
            case 17:
                wt wtVar18 = wt.e;
                int i30 = eVar2.j;
                if (i30 == 0) {
                    xc.G(obj);
                    dv0 dv0Var2 = (dv0) eVar2.k;
                    mv mvVar2 = (mv) eVar2.l;
                    eVar2.j = 1;
                    if (mv.b(mvVar2, dv0Var2, eVar2) == wtVar18) {
                        return wtVar18;
                    }
                } else {
                    if (i30 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case 18:
                wt wtVar19 = wt.e;
                int i31 = eVar2.j;
                if (i31 != 0) {
                    if (i31 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                    yc.j();
                    return null;
                }
                xc.G(obj);
                eo0 eo0Var = (eo0) eVar2.k;
                m6 m6Var = (m6) eVar2.l;
                eVar2.j = 1;
                y71.a(eo0Var, m6Var, eVar2);
                return wtVar19;
            case 19:
                lr0 lr0Var = (lr0) eVar2.l;
                wt wtVar20 = wt.e;
                int i32 = eVar2.j;
                if (i32 == 0) {
                    xc.G(obj);
                    qs1 qs1Var3 = lr0Var.l;
                    f40 f40Var = f40.e;
                    qs1Var3.getClass();
                    qs1Var3.k(null, f40Var);
                    qs1 qs1Var4 = lr0Var.n;
                    Boolean bool2 = Boolean.TRUE;
                    qs1Var4.getClass();
                    qs1Var4.k(null, bool2);
                    qs1 qs1Var5 = lr0Var.l;
                    xg0 xg0Var2 = lr0Var.d;
                    rd rdVarG = lr0.g(lr0Var);
                    eVar2.k = qs1Var5;
                    eVar2.j = 1;
                    objY = xg0Var2.y(rdVarG, eVar2);
                    if (objY == wtVar20) {
                        return wtVar20;
                    }
                    qs1Var = qs1Var5;
                } else {
                    if (i32 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qs1Var = (qs1) eVar2.k;
                    xc.G(obj);
                    objY = obj;
                }
                qs1Var.j(objY);
                qs1 qs1Var6 = lr0Var.n;
                Boolean bool3 = Boolean.FALSE;
                qs1Var6.getClass();
                qs1Var6.k(null, bool3);
                return t32.a;
            case 20:
                wt wtVar21 = wt.e;
                int i33 = eVar2.j;
                if (i33 == 0) {
                    xc.G(obj);
                    xg0 xg0Var3 = ((lr0) eVar2.k).b;
                    String str2 = (String) eVar2.l;
                    eVar2.j = 1;
                    if (xg0Var3.C(str2, eVar2) == wtVar21) {
                        return wtVar21;
                    }
                } else {
                    if (i33 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case 21:
                lr0 lr0Var2 = (lr0) eVar2.k;
                wt wtVar22 = wt.e;
                int i34 = eVar2.j;
                try {
                    try {
                        if (i34 == 0) {
                            xc.G(obj);
                            qs1 qs1Var7 = lr0Var2.e;
                            do {
                                value3 = qs1Var7.getValue();
                            } while (!qs1Var7.h(value3, l32.a((l32) value3, null, false, false, 0.0f, true, 31)));
                            oc ocVar = lr0Var2.c;
                            l32 l32Var = (l32) eVar2.l;
                            xq0 xq0Var = new xq0(l32Var.b, l32Var.e, l32Var.c, l32Var.d, lr0Var2.s);
                            ocVar.getClass();
                            oj ojVar = new oj(new cr0(ocVar, xq0Var, null), d40.e, -2, ph.e);
                            hr0 hr0Var = new hr0(lr0Var2);
                            eVar2.j = 1;
                            if (ojVar.c(hr0Var, eVar2) == wtVar22) {
                                return wtVar22;
                            }
                        } else {
                            if (i34 != 1) {
                                yc.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            xc.G(obj);
                        }
                        do {
                            value4 = qs1Var2.getValue();
                        } while (!qs1Var2.h(value4, l32.a((l32) value4, null, false, false, 0.0f, false, 31)));
                    } catch (Exception e) {
                        qs1 qs1Var8 = lr0Var2.g;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "Unexpected error";
                        }
                        u2 u2Var = new u2(13, null, message);
                        qs1Var8.getClass();
                        qs1Var8.k(null, u2Var);
                        qs1 qs1Var9 = lr0Var2.e;
                        do {
                            value2 = qs1Var9.getValue();
                        } while (!qs1Var9.h(value2, l32.a((l32) value2, null, false, false, 0.0f, false, 31)));
                    }
                    return t32.a;
                } finally {
                    qs1 qs1Var10 = lr0Var2.e;
                    do {
                        value = qs1Var10.getValue();
                    } while (!qs1Var10.h(value, l32.a((l32) value, null, false, false, 0.0f, false, 31)));
                }
            case 22:
                wt wtVar23 = wt.e;
                int i35 = eVar2.j;
                if (i35 == 0) {
                    xc.G(obj);
                    os1 os1Var = (os1) eVar2.k;
                    j6 j6Var2 = new j6(i3, (bw0) eVar2.l);
                    eVar2.j = 1;
                    if (os1Var.c(j6Var2, eVar2) == wtVar23) {
                        return wtVar23;
                    }
                } else {
                    if (i35 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                yc.j();
                return null;
            case 23:
                qw0 qw0Var = (qw0) eVar2.l;
                wt wtVar24 = wt.e;
                int i36 = eVar2.j;
                try {
                    if (i36 == 0) {
                        xc.G(obj);
                        vtVar2 = (vt) eVar2.k;
                    } else {
                        if (i36 == 1) {
                            vtVar2 = (vt) eVar2.k;
                            xc.G(obj);
                            objD = obj;
                            vt vtVar3 = vtVar2;
                            fY = qw0Var.c.y(6.0f);
                            fY2 = qw0Var.c.y(1.0f);
                            bk1Var = qw0Var.a;
                            eVar2.k = vtVar3;
                            eVar2.j = 2;
                            eVar = eVar2;
                            eVar2 = eVar;
                            if (qw0.c(qw0Var, bk1Var, (mw0) objD, fY, fY2, eVar) != wtVar24) {
                                vtVar2 = vtVar3;
                            }
                            return wtVar24;
                        }
                        if (i36 != 2) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vtVar2 = (vt) eVar2.k;
                        xc.G(obj);
                    }
                    if (!bk.J(vtVar2.f())) {
                        qw0Var.h = null;
                        return t32.a;
                    }
                    rh rhVar = qw0Var.g;
                    eVar2.k = vtVar2;
                    eVar2.j = 1;
                    rhVar.getClass();
                    objD = rh.D(rhVar, eVar2);
                    if (objD != wtVar24) {
                        vt vtVar32 = vtVar2;
                        fY = qw0Var.c.y(6.0f);
                        fY2 = qw0Var.c.y(1.0f);
                        bk1Var = qw0Var.a;
                        eVar2.k = vtVar32;
                        eVar2.j = 2;
                        eVar = eVar2;
                        eVar2 = eVar;
                        if (qw0.c(qw0Var, bk1Var, (mw0) objD, fY, fY2, eVar) != wtVar24) {
                        }
                    }
                    return wtVar24;
                } catch (Throwable th3) {
                    qw0Var.h = null;
                    throw th3;
                }
            case 24:
                wt wtVar25 = wt.e;
                int i37 = eVar2.j;
                if (i37 == 0) {
                    xc.G(obj);
                    bk1 bk1Var2 = ((l01) eVar2.k).a;
                    ly0 ly0Var = ly0.f;
                    wa0 wa0Var4 = (wa0) eVar2.l;
                    eVar2.j = 1;
                    if (bk1Var2.g(ly0Var, wa0Var4, eVar2) == wtVar25) {
                        return wtVar25;
                    }
                } else {
                    if (i37 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case 25:
                wt wtVar26 = wt.e;
                ?? r1 = eVar2.j;
                try {
                    if (r1 == 0) {
                        xc.G(obj);
                        jr1 jr1VarA = nu0.A((vt) eVar2.k, null, null, new tv(i4, D), 3);
                        mj mjVar = (mj) eVar2.l;
                        eVar2.k = jr1VarA;
                        eVar2.j = 1;
                        objN = mjVar.n(eVar2);
                        r1 = jr1VarA;
                        if (objN == wtVar26) {
                            return wtVar26;
                        }
                    } else {
                        if (r1 != 1) {
                            yc.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oj0 oj0Var2 = (oj0) eVar2.k;
                        xc.G(obj);
                        objN = obj;
                        r1 = oj0Var2;
                    }
                    r1.a(null);
                    r11 = objN;
                    return r11;
                } catch (Throwable th4) {
                    r1.a(r11);
                    throw th4;
                }
            case 26:
                wt wtVar27 = wt.e;
                int i38 = eVar2.j;
                if (i38 != 0) {
                    if (i38 == 1) {
                        xc.G(obj);
                        return obj;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                TextClassifier textClassifier = (TextClassifier) eVar2.k;
                if (textClassifier == null) {
                    return null;
                }
                wa0 wa0Var5 = (wa0) eVar2.l;
                eVar2.j = 1;
                Object objH2 = wa0Var5.h(textClassifier, eVar2);
                return objH2 == wtVar27 ? wtVar27 : objH2;
            case 27:
                wt wtVar28 = wt.e;
                int i39 = eVar2.j;
                if (i39 == 0) {
                    xc.G(obj);
                    h9 h9Var = ((q7) eVar2.k).B;
                    Float f = new Float(0.0f);
                    wa waVar = (wa) eVar2.l;
                    eVar2.j = 1;
                    if (h9.b(h9Var, f, waVar, null, null, eVar2, 12) == wtVar28) {
                        return wtVar28;
                    }
                } else {
                    if (i39 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
            case 28:
                wt wtVar29 = wt.e;
                int i40 = eVar2.j;
                if (i40 != 0) {
                    if (i40 == 1) {
                        xc.G(obj);
                        return t32.a;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xc.G(obj);
                vt vtVar4 = (vt) eVar2.k;
                q7 q7Var = (q7) eVar2.l;
                tn1 tn1Var = q7Var.s.a;
                r70 r70Var = new r70(i2, q7Var, vtVar4);
                eVar2.j = 1;
                tn1Var.getClass();
                tn1.k(tn1Var, r70Var, eVar2);
                return wtVar29;
            default:
                wt wtVar30 = wt.e;
                int i41 = eVar2.j;
                if (i41 == 0) {
                    xc.G(obj);
                    j00 j00Var = (j00) eVar2.k;
                    float f2 = j00Var.b ? -1.0f : 1.0f;
                    bk1 bk1Var3 = ((uj1) eVar2.l).R;
                    long jF = o52.f(f2, j00Var.a);
                    eVar2.j = 1;
                    if (bk1Var3.c(jF, false, eVar2) == wtVar30) {
                        return wtVar30;
                    }
                } else {
                    if (i41 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xc.G(obj);
                }
                return t32.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.l = obj;
    }
}
