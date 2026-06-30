package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class i9 extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public int j;
    public Object k;
    public Object l;
    public Object m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(mj mjVar, h9 h9Var, fy0 fy0Var, fy0 fy0Var2, ks ksVar) {
        super(2, ksVar);
        this.i = 0;
        this.m = mjVar;
        this.n = h9Var;
        this.o = fy0Var;
        this.p = fy0Var2;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (i) {
        }
        return ((i9) o(ksVar, vtVar)).q(t32Var);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int i = this.i;
        Object obj2 = this.p;
        Object obj3 = this.o;
        switch (i) {
            case 0:
                i9 i9Var = new i9((mj) this.m, (h9) this.n, (fy0) obj3, (fy0) obj2, ksVar);
                i9Var.k = obj;
                return i9Var;
            case 1:
                i9 i9Var2 = new i9((iq) this.n, (xg0) obj3, (Uri) obj2, ksVar, 1);
                i9Var2.k = obj;
                return i9Var2;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                i9 i9Var3 = new i9((iq) this.n, (xg0) obj3, (String) obj2, ksVar, 2);
                i9Var3.k = obj;
                return i9Var3;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                i9 i9Var4 = new i9((qy0) obj3, (sa0) obj2, ksVar, 3);
                i9Var4.n = obj;
                return i9Var4;
            default:
                i9 i9Var5 = new i9((ry0) obj3, (sa0) obj2, ksVar, 4);
                i9Var5.n = obj;
                return i9Var5;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:101|(1:(1:(3:105|140|(2:142|290)(4:143|(1:145)|146|147))(2:106|286))(1:107))(10:108|(1:110)|111|(1:113)(1:114)|115|(1:117)|118|(1:120)(7:126|257|127|131|(1:133)|134|(2:136|288)(1:137))|139|289)|123|(2:125|287)|126|257|127|131|(0)|134|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0288, code lost:
    
        if (r8 == r12) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02ba, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02bb, code lost:
    
        r0 = new defpackage.oe1(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x031b, code lost:
    
        if (r0 == r12) goto L139;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x04b2: IGET (r0 I:java.lang.Object) = (r3 I:zc1) A[Catch: all -> 0x04bb, TRY_ENTER] (LINE:1203) zc1.e java.lang.Object, block:B:207:0x04b2 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x04bd: IGET (r1 I:java.lang.Object) = (r3 I:zc1) A[Catch: all -> 0x04c6, TRY_ENTER] (LINE:1214) zc1.e java.lang.Object, block:B:212:0x04bd */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x046a A[Catch: all -> 0x037a, Exception -> 0x037d, TRY_LEAVE, TryCatch #7 {Exception -> 0x037d, blocks: (B:152:0x0371, B:166:0x0416, B:168:0x041e, B:171:0x0425, B:176:0x0442, B:190:0x046a, B:188:0x0466, B:189:0x0469, B:195:0x047c, B:197:0x0486, B:198:0x0496, B:160:0x038d, B:163:0x039c), top: B:251:0x0365, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0477 A[Catch: all -> 0x047a, TRY_LEAVE, TryCatch #10 {all -> 0x047a, blocks: (B:191:0x0471, B:193:0x0477), top: B:255:0x0471 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0437 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Type inference failed for: r3v32, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8, types: [zc1] */
    /* JADX WARN: Type inference failed for: r3v9, types: [zc1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:224:0x0503 -> B:226:0x0507). Please report as a decompilation issue!!! */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) throws Throwable {
        vt vtVar;
        qh it;
        Object objB;
        ?? r3;
        File file;
        zc1 zc1Var;
        File file2;
        String str;
        Object objP;
        OutputStream outputStreamOpenOutputStream;
        Object mqVar;
        File file3;
        String str2;
        String str3;
        Object objP2;
        String str4;
        Object oe1Var;
        Object objP3;
        ?? r32;
        ny0 ny0Var;
        sa0 sa0Var;
        sy0 sy0Var;
        qy0 qy0Var;
        qy0 qy0Var2;
        ny0 ny0Var2;
        Object objI;
        sy0 sy0Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        oy0 oy0Var;
        sa0 sa0Var2;
        sy0 sy0Var3;
        ry0 ry0Var;
        ry0 ry0Var2;
        oy0 oy0Var2;
        Object objI2;
        sy0 sy0Var4;
        AtomicReference atomicReference3;
        AtomicReference atomicReference4;
        int i = 1;
        ks ksVar = null;
        switch (this.i) {
            case 0:
                mj mjVar = (mj) this.m;
                wt wtVar = wt.e;
                int i2 = this.j;
                if (i2 == 0) {
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
                    if (i2 != 1) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (qh) this.l;
                    vtVar = (vt) this.k;
                    xc.G(obj);
                    objB = obj;
                    if (((Boolean) objB).booleanValue()) {
                        Object objC = it.c();
                        Object objV = nu0.v(mjVar.r());
                        nu0.A(vtVar, null, null, new m6(objV == null ? objC : objV, (h9) this.n, (fy0) this.o, (fy0) this.p, null, 1), 3);
                        this.k = vtVar;
                        this.l = it;
                        this.j = 1;
                        objB = it.b(this);
                        if (objB == wtVar) {
                            return wtVar;
                        }
                        if (((Boolean) objB).booleanValue()) {
                            return t32.a;
                        }
                    }
                }
                break;
            case 1:
                xg0 xg0Var = (xg0) this.o;
                iq iqVar = (iq) this.n;
                vt vtVar2 = (vt) this.k;
                wt wtVar2 = wt.e;
                int i3 = this.j;
                try {
                    try {
                        if (i3 == 0) {
                            xc.G(obj);
                            zc1Var = new zc1();
                            file2 = new File(iqVar.b);
                            if (file2.canRead()) {
                                outputStreamOpenOutputStream = ((Context) xg0Var.g).getContentResolver().openOutputStream((Uri) this.p);
                                if (outputStreamOpenOutputStream == null) {
                                    try {
                                        FileInputStream fileInputStream = new FileInputStream(file2);
                                        try {
                                            xi0.w(fileInputStream, outputStreamOpenOutputStream);
                                            fileInputStream.close();
                                            outputStreamOpenOutputStream.close();
                                            mqVar = new mq("Exported: " + iqVar.a);
                                        } finally {
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            el.p(outputStreamOpenOutputStream, th);
                                            throw th2;
                                        }
                                    }
                                } else {
                                    mqVar = new lq("Failed to open destination");
                                }
                                try {
                                    file3 = (File) zc1Var.e;
                                    if (file3 != null) {
                                        file3.delete();
                                    }
                                    break;
                                } catch (Throwable unused) {
                                }
                                return mqVar;
                            }
                            str = "Failed to read ";
                            file2 = new File(((Context) xg0Var.g).getCacheDir(), "export_" + System.currentTimeMillis() + ".tmp");
                            zc1Var.e = file2;
                            String str5 = "cp -f " + l91.v(iqVar.b) + " " + l91.v(file2.getAbsolutePath()) + " && chmod 0666 " + l91.v(file2.getAbsolutePath());
                            this.k = vtVar2;
                            this.l = zc1Var;
                            this.m = file2;
                            this.j = 1;
                            String[] strArr = {l91.h, "-c", str5};
                            lw lwVar = qy.a;
                            objP = nu0.P(fw.g, new cg1(strArr, 1500L, null), this);
                            if (objP == wtVar2) {
                                return wtVar2;
                            }
                        } else {
                            if (i3 != 1) {
                                yc.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            file2 = (File) this.m;
                            zc1Var = (zc1) this.l;
                            xc.G(obj);
                            objP = obj;
                            str = "Failed to read ";
                        }
                        zf1 zf1Var = (zf1) objP;
                        if (zf1Var.b()) {
                            if (!file2.exists()) {
                            }
                            outputStreamOpenOutputStream = ((Context) xg0Var.g).getContentResolver().openOutputStream((Uri) this.p);
                            if (outputStreamOpenOutputStream == null) {
                            }
                            file3 = (File) zc1Var.e;
                            if (file3 != null) {
                            }
                            return mqVar;
                        }
                        String strA = zf1Var.a();
                        if (strA.length() == 0) {
                            strA = str + iqVar.a;
                        }
                        lq lqVar = new lq(strA);
                        try {
                            File file4 = (File) zc1Var.e;
                            if (file4 == null) {
                                return lqVar;
                            }
                            file4.delete();
                            return lqVar;
                        } catch (Throwable unused2) {
                            return lqVar;
                        }
                    } catch (Exception e) {
                        String message = e.getMessage();
                        if (message == null) {
                            message = "Export failed";
                        }
                        try {
                            if (file != null) {
                            }
                            break;
                        } catch (Throwable unused3) {
                        }
                        return new lq(message);
                    }
                } finally {
                    try {
                        file = (File) r3.e;
                        if (file != null) {
                            file.delete();
                        }
                        break;
                    } catch (Throwable unused4) {
                    }
                }
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                xg0 xg0Var2 = (xg0) this.o;
                iq iqVar2 = (iq) this.n;
                vt vtVar3 = (vt) this.k;
                wt wtVar3 = wt.e;
                int i4 = this.j;
                if (i4 == 0) {
                    xc.G(obj);
                    String strU = ct1.U(iqVar2.a);
                    String strV = ct1.V(xg0.o(xg0Var2, (String) this.p));
                    if (strV.length() == 0) {
                        strV = "file";
                    }
                    str2 = strU.length() == 0 ? strV : strV + "." + strU;
                    String parent = new File(iqVar2.b).getParent();
                    if (parent == null) {
                        parent = (String) pl.c0(((dr0) xg0Var2.f).n);
                    }
                    str3 = parent + "/" + str2;
                    if (str3.equals(iqVar2.b)) {
                        str4 = str2;
                        String str6 = str3;
                        oe1Var = Boolean.valueOf(new File(iqVar2.b).renameTo(new File(str6)));
                        Object obj2 = Boolean.FALSE;
                        if (oe1Var instanceof oe1) {
                            oe1Var = obj2;
                        }
                        if (!((Boolean) oe1Var).booleanValue()) {
                            return new mq("Renamed to " + str4);
                        }
                        String str7 = "mv " + l91.v(iqVar2.b) + " " + l91.v(str6);
                        this.k = null;
                        this.l = str4;
                        this.m = null;
                        this.j = 2;
                        String[] strArr2 = {l91.h, "-c", str7};
                        lw lwVar2 = qy.a;
                        objP3 = nu0.P(fw.g, new cg1(strArr2, 1500L, null), this);
                        break;
                    } else {
                        this.k = vtVar3;
                        this.l = str2;
                        this.m = str3;
                        this.j = 1;
                        lw lwVar3 = qy.a;
                        objP2 = nu0.P(fw.g, new bg1(str3, ksVar, i), this);
                        break;
                    }
                    return wtVar3;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        yc.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str8 = (String) this.l;
                    xc.G(obj);
                    str4 = str8;
                    objP3 = obj;
                    zf1 zf1Var2 = (zf1) objP3;
                    if (zf1Var2.b()) {
                        return new mq("Renamed to " + str4);
                    }
                    String strA2 = zf1Var2.a();
                    if (strA2.length() == 0) {
                        strA2 = "Failed to rename";
                    }
                    return new lq(strA2);
                }
                str3 = (String) this.m;
                str2 = (String) this.l;
                xc.G(obj);
                objP2 = obj;
                if (((Boolean) objP2).booleanValue()) {
                    return new lq(s91.l("A file named \"", str2, "\" already exists"));
                }
                str4 = str2;
                String str62 = str3;
                oe1Var = Boolean.valueOf(new File(iqVar2.b).renameTo(new File(str62)));
                Object obj22 = Boolean.FALSE;
                if (oe1Var instanceof oe1) {
                }
                if (!((Boolean) oe1Var).booleanValue()) {
                }
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                qy0 qy0Var3 = (qy0) this.o;
                wt wtVar4 = wt.e;
                r32 = this.j;
                try {
                    try {
                        if (r32 == 0) {
                            xc.G(obj);
                            vt vtVar4 = (vt) this.n;
                            ly0 ly0Var = ly0.e;
                            jt jtVarL = vtVar4.f().l(v20.O);
                            jtVarL.getClass();
                            ny0Var = new ny0(ly0Var, (oj0) jtVarL);
                            qy0.a(qy0Var3, ny0Var);
                            uy0 uy0Var = qy0Var3.b;
                            sa0Var = (sa0) this.p;
                            this.n = ny0Var;
                            this.l = uy0Var;
                            this.k = sa0Var;
                            this.m = qy0Var3;
                            this.j = 1;
                            if (uy0Var.e(this) != wtVar4) {
                                sy0Var = uy0Var;
                            }
                            return wtVar4;
                        }
                        if (r32 != 1) {
                            if (r32 != 2) {
                                yc.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qy0Var2 = (qy0) this.k;
                            sy0Var2 = (sy0) this.l;
                            ny0Var2 = (ny0) this.n;
                            try {
                                xc.G(obj);
                                objI = obj;
                                atomicReference2 = qy0Var2.a;
                                while (!atomicReference2.compareAndSet(ny0Var2, null) && atomicReference2.get() == ny0Var2) {
                                }
                                ((uy0) sy0Var2).h(null);
                                return objI;
                            } catch (Throwable th3) {
                                th = th3;
                                atomicReference = qy0Var2.a;
                                while (!atomicReference.compareAndSet(ny0Var2, null) && atomicReference.get() == ny0Var2) {
                                }
                                throw th;
                            }
                        }
                        qy0Var3 = (qy0) this.m;
                        sa0 sa0Var3 = (sa0) this.k;
                        sy0 sy0Var5 = (sy0) this.l;
                        ny0 ny0Var3 = (ny0) this.n;
                        xc.G(obj);
                        sy0Var = sy0Var5;
                        ny0Var = ny0Var3;
                        sa0Var = sa0Var3;
                        this.n = ny0Var;
                        this.l = sy0Var;
                        this.k = qy0Var;
                        this.m = null;
                        this.j = 2;
                        objI = sa0Var.i(this);
                        if (objI != wtVar4) {
                            qy0Var2 = qy0Var;
                            ny0Var2 = ny0Var;
                            sy0Var2 = sy0Var;
                            atomicReference2 = qy0Var2.a;
                            while (!atomicReference2.compareAndSet(ny0Var2, null)) {
                            }
                            ((uy0) sy0Var2).h(null);
                            return objI;
                        }
                        return wtVar4;
                    } catch (Throwable th4) {
                        th = th4;
                        qy0Var2 = qy0Var;
                        ny0Var2 = ny0Var;
                        atomicReference = qy0Var2.a;
                        while (!atomicReference.compareAndSet(ny0Var2, null)) {
                        }
                        throw th;
                    }
                    qy0Var = qy0Var3;
                } finally {
                }
                break;
            default:
                ry0 ry0Var3 = (ry0) this.o;
                wt wtVar5 = wt.e;
                r32 = this.j;
                try {
                    try {
                        if (r32 == 0) {
                            xc.G(obj);
                            jt jtVarL2 = ((vt) this.n).f().l(v20.O);
                            jtVarL2.getClass();
                            oy0Var = new oy0((oj0) jtVarL2);
                            AtomicReference atomicReference5 = ry0Var3.a;
                            while (true) {
                                oy0 oy0Var3 = (oy0) atomicReference5.get();
                                if (oy0Var3 != null) {
                                    my0 my0Var = my0.e;
                                    if (my0Var.compareTo(my0Var) < 0) {
                                        throw new CancellationException("Current mutation had a higher priority");
                                    }
                                }
                                while (!atomicReference5.compareAndSet(oy0Var3, oy0Var)) {
                                    if (atomicReference5.get() != oy0Var3) {
                                    }
                                    break;
                                }
                                if (oy0Var3 != null) {
                                    oy0Var3.a.a(new ck("Mutation interrupted", 1));
                                }
                                uy0 uy0Var2 = ry0Var3.b;
                                sa0Var2 = (sa0) this.p;
                                this.n = oy0Var;
                                this.l = uy0Var2;
                                this.k = sa0Var2;
                                this.m = ry0Var3;
                                this.j = 1;
                                if (uy0Var2.e(this) != wtVar5) {
                                    sy0Var3 = uy0Var2;
                                }
                            }
                            return wtVar5;
                        }
                        if (r32 != 1) {
                            if (r32 != 2) {
                                yc.l("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ry0Var2 = (ry0) this.k;
                            sy0Var4 = (sy0) this.l;
                            oy0Var2 = (oy0) this.n;
                            try {
                                xc.G(obj);
                                objI2 = obj;
                                atomicReference4 = ry0Var2.a;
                                while (!atomicReference4.compareAndSet(oy0Var2, null) && atomicReference4.get() == oy0Var2) {
                                }
                                ((uy0) sy0Var4).h(null);
                                return objI2;
                            } catch (Throwable th5) {
                                th = th5;
                                atomicReference3 = ry0Var2.a;
                                while (!atomicReference3.compareAndSet(oy0Var2, null)) {
                                }
                                throw th;
                            }
                        }
                        ry0Var3 = (ry0) this.m;
                        sa0 sa0Var4 = (sa0) this.k;
                        sy0 sy0Var6 = (sy0) this.l;
                        oy0 oy0Var4 = (oy0) this.n;
                        xc.G(obj);
                        sy0Var3 = sy0Var6;
                        oy0Var = oy0Var4;
                        sa0Var2 = sa0Var4;
                        this.n = oy0Var;
                        this.l = sy0Var3;
                        this.k = ry0Var;
                        this.m = null;
                        this.j = 2;
                        objI2 = sa0Var2.i(this);
                        if (objI2 != wtVar5) {
                            ry0Var2 = ry0Var;
                            oy0Var2 = oy0Var;
                            sy0Var4 = sy0Var3;
                            atomicReference4 = ry0Var2.a;
                            while (!atomicReference4.compareAndSet(oy0Var2, null)) {
                            }
                            ((uy0) sy0Var4).h(null);
                            return objI2;
                        }
                        return wtVar5;
                    } catch (Throwable th6) {
                        th = th6;
                        ry0Var2 = ry0Var;
                        oy0Var2 = oy0Var;
                        atomicReference3 = ry0Var2.a;
                        while (!atomicReference3.compareAndSet(oy0Var2, null) && atomicReference3.get() == oy0Var2) {
                        }
                        throw th;
                    }
                    ry0Var = ry0Var3;
                } finally {
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i9(iq iqVar, xg0 xg0Var, Comparable comparable, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.n = iqVar;
        this.o = xg0Var;
        this.p = comparable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i9(Object obj, sa0 sa0Var, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.o = obj;
        this.p = sa0Var;
    }
}
