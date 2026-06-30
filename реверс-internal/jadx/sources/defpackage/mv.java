package defpackage;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class mv implements pu {
    public final b60 e;
    public final vt f;
    public final y41 g;
    public int i;
    public jr1 j;
    public final vu l;
    public final jv1 m;
    public final jv1 n;
    public final vu o;
    public final uy0 h = new uy0();
    public final qt0 k = new qt0(15);

    public mv(b60 b60Var, List list, wr wrVar, vt vtVar) {
        this.e = b60Var;
        this.f = vtVar;
        ks ksVar = null;
        this.g = new y41(8, new g(this, ksVar, 4));
        vu vuVar = new vu();
        vuVar.h = this;
        vuVar.e = new uy0();
        vuVar.f = bk.a();
        vuVar.g = pl.o0(list);
        this.l = vuVar;
        final byte b = 0;
        this.m = new jv1(new ha0(this) { // from class: qu
            public final /* synthetic */ mv f;

            {
                this.f = this;
            }

            @Override // defpackage.ha0
            public final Object a() throws IOException {
                int i = b;
                mv mvVar = this.f;
                switch (i) {
                    case 0:
                        b60 b60Var2 = mvVar.e;
                        File canonicalFile = ((File) b60Var2.b.a()).getCanonicalFile();
                        synchronized (b60.d) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = b60.c;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new e60(canonicalFile, (fo1) b60Var2.a.i(canonicalFile), new p7(7, canonicalFile));
                    default:
                        return ((e60) mvVar.m.getValue()).b;
                }
            }
        });
        final int i = 1;
        this.n = new jv1(new ha0(this) { // from class: qu
            public final /* synthetic */ mv f;

            {
                this.f = this;
            }

            @Override // defpackage.ha0
            public final Object a() throws IOException {
                int i2 = i;
                mv mvVar = this.f;
                switch (i2) {
                    case 0:
                        b60 b60Var2 = mvVar.e;
                        File canonicalFile = ((File) b60Var2.b.a()).getCanonicalFile();
                        synchronized (b60.d) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = b60.c;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new e60(canonicalFile, (fo1) b60Var2.a.i(canonicalFile), new p7(7, canonicalFile));
                    default:
                        return ((e60) mvVar.m.getValue()).b;
                }
            }
        });
        n nVar = new n(7, this);
        pc pcVar = new pc(20, b);
        e eVar = new e(this, ksVar, 17);
        vu vuVar2 = new vu();
        vuVar2.e = vtVar;
        vuVar2.f = eVar;
        vuVar2.g = nu0.d(Integer.MAX_VALUE, 6, null);
        vuVar2.h = new qt0(8);
        oj0 oj0Var = (oj0) vtVar.f().l(v20.O);
        if (oj0Var != null) {
            oj0Var.s(new kf(nVar, vuVar2, pcVar, 14));
        }
        this.o = vuVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(mv mvVar, ls lsVar) {
        bv bvVar;
        uy0 uy0Var;
        if (lsVar instanceof bv) {
            bvVar = (bv) lsVar;
            int i = bvVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bvVar.k = i - Integer.MIN_VALUE;
            } else {
                bvVar = new bv(mvVar, lsVar);
            }
        }
        Object obj = bvVar.i;
        int i2 = bvVar.k;
        if (i2 == 0) {
            xc.G(obj);
            uy0 uy0Var2 = mvVar.h;
            bvVar.h = uy0Var2;
            bvVar.k = 1;
            Object objE = uy0Var2.e(bvVar);
            wt wtVar = wt.e;
            if (objE == wtVar) {
                return wtVar;
            }
            uy0Var = uy0Var2;
        } else {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uy0Var = bvVar.h;
            xc.G(obj);
        }
        try {
            int i3 = mvVar.i - 1;
            mvVar.i = i3;
            if (i3 == 0) {
                jr1 jr1Var = mvVar.j;
                if (jr1Var != null) {
                    jr1Var.a(null);
                }
                mvVar.j = null;
            }
            uy0Var.h(null);
            return t32.a;
        } catch (Throwable th) {
            uy0Var.h(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(mv mvVar, dv0 dv0Var, ls lsVar) throws IllegalAccessException, InvocationTargetException {
        dv dvVar;
        ln lnVar;
        lt ltVar;
        if (lsVar instanceof dv) {
            dvVar = (dv) lsVar;
            int i = dvVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dvVar.k = i - Integer.MIN_VALUE;
            } else {
                dvVar = new dv(mvVar, lsVar);
            }
        }
        Object oe1Var = dvVar.i;
        int i2 = dvVar.k;
        ks ksVar = null;
        if (i2 == 0) {
            xc.G(oe1Var);
            ln lnVar2 = dv0Var.b;
            try {
                ltVar = dv0Var.d;
            } catch (Throwable th) {
                th = th;
            }
            try {
                lt ltVar2 = dvVar.f;
                ltVar2.getClass();
                lt ltVarJ = ltVar.j(ltVar2);
                e eVar = new e(mvVar, dv0Var, ksVar, 15);
                dvVar.h = lnVar2;
                dvVar.k = 1;
                Object objP = nu0.P(ltVarJ, eVar, dvVar);
                wt wtVar = wt.e;
                if (objP == wtVar) {
                    return wtVar;
                }
                oe1Var = objP;
                lnVar = lnVar2;
            } catch (Throwable th2) {
                th = th2;
                lnVar = lnVar2;
                oe1Var = new oe1(th);
            }
        } else {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lnVar = dvVar.h;
            try {
                xc.G(oe1Var);
            } catch (Throwable th3) {
                th = th3;
                oe1Var = new oe1(th);
            }
        }
        Throwable thA = pe1.a(oe1Var);
        if (thA == null) {
            lnVar.V(oe1Var);
        } else {
            lnVar.getClass();
            lnVar.V(new on(thA, false));
        }
        return t32.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(mv mvVar, ls lsVar) {
        ev evVar;
        uy0 uy0Var;
        if (lsVar instanceof ev) {
            evVar = (ev) lsVar;
            int i = evVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                evVar.k = i - Integer.MIN_VALUE;
            } else {
                evVar = new ev(mvVar, lsVar);
            }
        }
        Object obj = evVar.i;
        int i2 = evVar.k;
        int i3 = 1;
        ks ksVar = null;
        if (i2 == 0) {
            xc.G(obj);
            uy0 uy0Var2 = mvVar.h;
            evVar.h = uy0Var2;
            evVar.k = 1;
            Object objE = uy0Var2.e(evVar);
            wt wtVar = wt.e;
            if (objE == wtVar) {
                return wtVar;
            }
            uy0Var = uy0Var2;
        } else {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uy0Var = evVar.h;
            xc.G(obj);
        }
        try {
            int i4 = mvVar.i + 1;
            mvVar.i = i4;
            if (i4 == 1) {
                mvVar.j = nu0.A(mvVar.f, null, null, new wu(mvVar, ksVar, i3), 3);
            }
            uy0Var.h(null);
            return t32.a;
        } catch (Throwable th) {
            uy0Var.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r1.i(r0) == r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(mv mvVar, ls lsVar) throws Throwable {
        fv fvVar;
        int iIntValue;
        int i;
        Throwable th;
        if (lsVar instanceof fv) {
            fvVar = (fv) lsVar;
            int i2 = fvVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fvVar.k = i2 - Integer.MIN_VALUE;
            } else {
                fvVar = new fv(mvVar, lsVar);
            }
        }
        Object objA = fvVar.i;
        int i3 = fvVar.k;
        Object obj = wt.e;
        try {
            if (i3 == 0) {
                xc.G(objA);
                fo1 fo1VarI = mvVar.i();
                fvVar.k = 1;
                objA = fo1VarI.a();
                if (objA != obj) {
                }
                return obj;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = fvVar.h;
                try {
                    xc.G(objA);
                    return t32.a;
                } catch (Throwable th2) {
                    th = th2;
                    mvVar.k.B(new yb1(th, i));
                    throw th;
                }
            }
            xc.G(objA);
            vu vuVar = mvVar.l;
            fvVar.h = iIntValue;
            fvVar.k = 2;
        } catch (Throwable th3) {
            i = iIntValue;
            th = th3;
            mvVar.k.B(new yb1(th, i));
            throw th;
        }
        iIntValue = ((Number) objA).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (r11 == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r11 == r7) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(mv mvVar, boolean z, ks ksVar) throws Throwable {
        gv gvVar;
        ms1 ms1VarQ;
        j41 j41Var;
        qt0 qt0Var = mvVar.k;
        if (ksVar instanceof gv) {
            gvVar = (gv) ksVar;
            int i = gvVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                gvVar.l = i - Integer.MIN_VALUE;
            } else {
                gvVar = new gv(mvVar, ksVar);
            }
        }
        Object objA = gvVar.j;
        int i2 = gvVar.l;
        int i3 = 2;
        ks ksVar2 = null;
        wt wtVar = wt.e;
        if (i2 == 0) {
            xc.G(objA);
            ms1VarQ = qt0Var.q();
            if (ms1VarQ instanceof m32) {
                yc.l("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                return null;
            }
            fo1 fo1VarI = mvVar.i();
            gvVar.i = ms1VarQ;
            gvVar.h = z;
            gvVar.l = 1;
            objA = fo1VarI.a();
            if (objA != wtVar) {
            }
            return wtVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                xc.G(objA);
                j41Var = (j41) objA;
                ms1 ms1Var = (ms1) j41Var.e;
                if (((Boolean) j41Var.f).booleanValue()) {
                }
                return ms1Var;
            }
            if (i2 != 3) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xc.G(objA);
            j41Var = (j41) objA;
            ms1 ms1Var2 = (ms1) j41Var.e;
            if (((Boolean) j41Var.f).booleanValue()) {
                qt0Var.B(ms1Var2);
            }
            return ms1Var2;
        }
        z = gvVar.h;
        ms1VarQ = gvVar.i;
        xc.G(objA);
        int iIntValue = ((Number) objA).intValue();
        boolean z2 = ms1VarQ instanceof lu;
        int i4 = z2 ? ((lu) ms1VarQ).a : -1;
        if (z2 && iIntValue == i4) {
            return ms1VarQ;
        }
        if (z) {
            fo1 fo1VarI2 = mvVar.i();
            k8 k8Var = new k8(mvVar, ksVar2, i3);
            gvVar.i = null;
            gvVar.l = 2;
            objA = fo1VarI2.b(k8Var, gvVar);
        } else {
            fo1 fo1VarI3 = mvVar.i();
            hv hvVar = new hv(mvVar, i4, ksVar2, 0);
            gvVar.i = null;
            gvVar.l = 3;
            objA = fo1VarI3.c(hvVar, gvVar);
        }
        return wtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0111, code lost:
    
        if (r10 != r5) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2 A[Catch: au -> 0x0097, TryCatch #0 {au -> 0x0097, blocks: (B:36:0x0092, B:68:0x0114, B:41:0x009c, B:65:0x00f9, B:44:0x00a6, B:60:0x00dd, B:47:0x00ac, B:55:0x00c2, B:56:0x00c6, B:51:0x00b5, B:62:0x00e9), top: B:72:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(mv mvVar, boolean z, ls lsVar) {
        iv ivVar;
        Object objA;
        Object obj;
        int i;
        au auVar;
        xc1 xc1Var;
        zc1 zc1Var;
        if (lsVar instanceof iv) {
            ivVar = (iv) lsVar;
            int i2 = ivVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ivVar.o = i2 - Integer.MIN_VALUE;
            } else {
                ivVar = new iv(mvVar, lsVar);
            }
        }
        Object objA2 = ivVar.m;
        int i3 = ivVar.o;
        int i4 = 1;
        ks ksVar = null;
        Object obj2 = wt.e;
        try {
            switch (i3) {
                case 0:
                    xc.G(objA2);
                    if (!z) {
                        fo1 fo1VarI = mvVar.i();
                        ivVar.h = z;
                        ivVar.o = 3;
                        objA2 = fo1VarI.a();
                        if (objA2 != obj2) {
                            int iIntValue = ((Number) objA2).intValue();
                            fo1 fo1VarI2 = mvVar.i();
                            wa0 hvVar = new hv(mvVar, iIntValue, ksVar, i4);
                            ivVar.h = z;
                            ivVar.o = 4;
                            objA2 = fo1VarI2.c(hvVar, ivVar);
                            break;
                        }
                    } else {
                        ivVar.h = z;
                        ivVar.o = 1;
                        objA2 = mvVar.j(ivVar);
                        if (objA2 != obj2) {
                            iHashCode = objA2 != null ? objA2.hashCode() : 0;
                            fo1 fo1VarI3 = mvVar.i();
                            ivVar.i = objA2;
                            ivVar.h = z;
                            ivVar.l = iHashCode;
                            ivVar.o = 2;
                            objA = fo1VarI3.a();
                            if (objA == obj2) {
                                obj = objA2;
                                objA2 = objA;
                                i = iHashCode;
                                return new lu(i, ((Number) objA2).intValue(), obj);
                            }
                        }
                    }
                    return obj2;
                case 1:
                    z = ivVar.h;
                    xc.G(objA2);
                    if (objA2 != null) {
                    }
                    fo1 fo1VarI32 = mvVar.i();
                    ivVar.i = objA2;
                    ivVar.h = z;
                    ivVar.l = iHashCode;
                    ivVar.o = 2;
                    objA = fo1VarI32.a();
                    if (objA == obj2) {
                    }
                    break;
                case t91.FLOAT_FIELD_NUMBER /* 2 */:
                    i = ivVar.l;
                    boolean z2 = ivVar.h;
                    obj = ivVar.i;
                    xc.G(objA2);
                    return new lu(i, ((Number) objA2).intValue(), obj);
                case t91.INTEGER_FIELD_NUMBER /* 3 */:
                    z = ivVar.h;
                    xc.G(objA2);
                    int iIntValue2 = ((Number) objA2).intValue();
                    fo1 fo1VarI22 = mvVar.i();
                    wa0 hvVar2 = new hv(mvVar, iIntValue2, ksVar, i4);
                    ivVar.h = z;
                    ivVar.o = 4;
                    objA2 = fo1VarI22.c(hvVar2, ivVar);
                    break;
                case t91.LONG_FIELD_NUMBER /* 4 */:
                    boolean z3 = ivVar.h;
                    xc.G(objA2);
                    return (lu) objA2;
                case t91.STRING_FIELD_NUMBER /* 5 */:
                    boolean z4 = ivVar.h;
                    zc1 zc1Var2 = (zc1) ivVar.k;
                    zc1 zc1Var3 = ivVar.j;
                    au auVar2 = (au) ivVar.i;
                    xc.G(objA2);
                    zc1Var2.e = objA2;
                    xc1 xc1Var2 = new xc1();
                    try {
                        jv jvVar = new jv(zc1Var3, mvVar, xc1Var2, (ks) null);
                        ivVar.i = auVar2;
                        ivVar.j = zc1Var3;
                        ivVar.k = xc1Var2;
                        ivVar.o = 6;
                        if ((z4 ? jvVar.i(ivVar) : mvVar.i().b(new cv(jvVar, ksVar, iHashCode), ivVar)) != obj2) {
                            xc1Var = xc1Var2;
                            zc1Var = zc1Var3;
                            Object obj3 = zc1Var.e;
                            return new lu(obj3 != null ? obj3.hashCode() : 0, xc1Var.e, obj3);
                        }
                        return obj2;
                    } catch (Throwable th) {
                        th = th;
                        auVar = auVar2;
                        al.h(auVar, th);
                        throw auVar;
                    }
                case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                    xc1Var = (xc1) ivVar.k;
                    zc1Var = ivVar.j;
                    auVar = (au) ivVar.i;
                    try {
                        xc.G(objA2);
                        Object obj32 = zc1Var.e;
                        return new lu(obj32 != null ? obj32.hashCode() : 0, xc1Var.e, obj32);
                    } catch (Throwable th2) {
                        th = th2;
                        al.h(auVar, th);
                        throw auVar;
                    }
                default:
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (au e) {
            zc1 zc1Var4 = new zc1();
            ivVar.i = e;
            ivVar.j = zc1Var4;
            ivVar.k = zc1Var4;
            ivVar.h = z;
            ivVar.o = 5;
            throw e;
        }
    }

    @Override // defpackage.pu
    public final Object g(wa0 wa0Var, ls lsVar) {
        l42 l42Var = (l42) lsVar.e().l(l91.v);
        if (l42Var != null) {
            l42Var.c(this);
        }
        return nu0.P(new l42(l42Var, this), new g(this, wa0Var, (ks) null, 5), lsVar);
    }

    @Override // defpackage.pu
    public final f70 h() {
        return this.g;
    }

    public final fo1 i() {
        return (fo1) this.n.getValue();
    }

    public final Object j(ls lsVar) {
        return ((e60) this.m.getValue()).a(new yu(3, (ks) null), lsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, boolean z, ls lsVar) {
        kv kvVar;
        xc1 xc1Var;
        if (lsVar instanceof kv) {
            kvVar = (kv) lsVar;
            int i = kvVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kvVar.k = i - Integer.MIN_VALUE;
            } else {
                kvVar = new kv(this, lsVar);
            }
        }
        Object obj2 = kvVar.i;
        int i2 = kvVar.k;
        if (i2 == 0) {
            xc.G(obj2);
            xc1 xc1Var2 = new xc1();
            e60 e60Var = (e60) this.m.getValue();
            lv lvVar = new lv(xc1Var2, this, obj, z, null);
            kvVar.h = xc1Var2;
            kvVar.k = 1;
            Object objB = e60Var.b(lvVar, kvVar);
            wt wtVar = wt.e;
            if (objB == wtVar) {
                return wtVar;
            }
            xc1Var = xc1Var2;
        } else {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xc1Var = kvVar.h;
            xc.G(obj2);
        }
        return new Integer(xc1Var.e);
    }
}
