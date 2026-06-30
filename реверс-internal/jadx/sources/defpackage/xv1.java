package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class xv1 {
    public static final f10 a = new f10(3, null, 2);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(defpackage.ev1 r5, boolean r6, defpackage.f81 r7, defpackage.ye r8) {
        /*
            boolean r0 = r8 instanceof defpackage.ov1
            if (r0 == 0) goto L13
            r0 = r8
            ov1 r0 = (defpackage.ov1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ov1 r0 = new ov1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.k
            int r1 = r0.l
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.j
            f81 r6 = r0.i
            ev1 r7 = r0.h
            defpackage.xc.G(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.yc.l(r5)
            r5 = 0
            return r5
        L36:
            defpackage.xc.G(r8)
        L39:
            r0.h = r5
            r0.i = r7
            r0.j = r6
            r0.l = r2
            java.lang.Object r8 = r5.a(r7, r0)
            wt r1 = defpackage.wt.e
            if (r8 != r1) goto L4a
            return r1
        L4a:
            e81 r8 = (defpackage.e81) r8
            boolean r1 = e(r8, r6)
            if (r1 == 0) goto L39
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv1.a(ev1, boolean, f81, ye):java.lang.Object");
    }

    public static /* synthetic */ Object b(ev1 ev1Var, ye yeVar, int i) {
        return a(ev1Var, (i & 1) != 0, f81.f, yeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(ev1 ev1Var, ls lsVar) {
        pv1 pv1Var;
        wt wtVar;
        int size;
        int i;
        int i2;
        int size2;
        if (lsVar instanceof pv1) {
            pv1Var = (pv1) lsVar;
            int i3 = pv1Var.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pv1Var.j = i3 - Integer.MIN_VALUE;
            } else {
                pv1Var = new pv1(lsVar);
            }
        }
        Object objA = pv1Var.i;
        int i4 = pv1Var.j;
        if (i4 == 0) {
            xc.G(objA);
            pv1Var.h = ev1Var;
            pv1Var.j = 1;
            objA = ev1Var.a(f81.f, pv1Var);
            wtVar = wt.e;
            if (objA == wtVar) {
            }
            e81 e81Var = (e81) objA;
            List list = e81Var.a;
            size = list.size();
            i = 0;
            while (i2 < size) {
            }
            List list2 = e81Var.a;
            size2 = list2.size();
            while (i < size2) {
            }
            return t32.a;
        }
        if (i4 != 1) {
            yc.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ev1Var = pv1Var.h;
        xc.G(objA);
        e81 e81Var2 = (e81) objA;
        List list3 = e81Var2.a;
        size = list3.size();
        i = 0;
        for (i2 = 0; i2 < size; i2++) {
            ((l81) list3.get(i2)).a();
        }
        List list22 = e81Var2.a;
        size2 = list22.size();
        while (i < size2) {
            if (((l81) list22.get(i)).d) {
                pv1Var.h = ev1Var;
                pv1Var.j = 1;
                objA = ev1Var.a(f81.f, pv1Var);
                wtVar = wt.e;
                if (objA == wtVar) {
                    return wtVar;
                }
                e81 e81Var22 = (e81) objA;
                List list32 = e81Var22.a;
                size = list32.size();
                i = 0;
                while (i2 < size) {
                }
                List list222 = e81Var22.a;
                size2 = list222.size();
                while (i < size2) {
                }
            } else {
                i++;
            }
        }
        return t32.a;
    }

    public static Object d(q81 q81Var, ep1 ep1Var, sa0 sa0Var, zu1 zu1Var, int i) {
        xa0 xa0Var = ep1Var;
        if ((i & 4) != 0) {
            xa0Var = a;
        }
        Object objR = bl.r(new m6(q81Var, xa0Var, sa0Var, (ks) null), zu1Var);
        return objR == wt.e ? objR : t32.a;
    }

    public static boolean e(e81 e81Var, boolean z) {
        List list = e81Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            l81 l81Var = (l81) list.get(i);
            if (!(z ? lk.q(l81Var) : lk.r(l81Var))) {
                return false;
            }
        }
        return true;
    }

    public static jr1 f(vt vtVar, oj0 oj0Var, wa0 wa0Var) {
        return nu0.A(vtVar, null, yt.h, new g(oj0Var, wa0Var, (ks) null, 19), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0382  */
    /* JADX WARN: Type inference failed for: r13v14, types: [l81] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r27v1, types: [ks] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [ks, lt] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v31, types: [ks] */
    /* JADX WARN: Type inference failed for: r5v34, types: [ks] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(ev1 ev1Var, vt vtVar, ma1 ma1Var, xa0 xa0Var, sa0 sa0Var, ye yeVar) throws Throwable {
        tv1 tv1Var;
        vt vtVar2;
        ma1 ma1Var2;
        ?? r5;
        xa0 xa0Var2;
        sa0 sa0Var2;
        int i;
        Object objB;
        sa0 sa0Var3;
        sa0 sa0Var4;
        ma1 ma1Var3;
        l81 l81Var;
        ev1 ev1Var2;
        oj0 oj0Var;
        vt vtVar3;
        sa0 sa0Var5;
        xa0 xa0Var3;
        ma1 ma1Var4;
        xa0 xa0Var4;
        sa0 sa0Var6;
        vt vtVar4;
        sa0 sa0Var7;
        sa0 sa0Var8;
        l81 l81Var2;
        ma1 ma1Var5;
        f81 f81Var;
        ls0 ls0Var;
        jr1 jr1VarF;
        sa0 sa0Var9;
        xa0 xa0Var5;
        ev1 ev1Var3;
        sa0 sa0Var10;
        sa0 sa0Var11;
        l81 l81Var3;
        oj0 oj0Var2;
        ms0 ms0Var;
        ks ksVar;
        ma1 ma1Var6;
        vt vtVar5;
        l81 l81Var4;
        ma1 ma1Var7;
        sa0 sa0Var12;
        l81 l81Var5;
        oj0 oj0Var3;
        l81 l81Var6;
        sa0 sa0Var13;
        sa0 sa0Var14;
        l81 l81Var7;
        ma1 ma1Var8;
        vt vtVar6;
        sa0 sa0Var15;
        ev1 ev1Var4;
        oj0 oj0Var4;
        l81 l81Var8;
        sa0 sa0Var16;
        sa0 sa0Var17;
        vt vtVar7;
        sa0 sa0Var18;
        ?? r13;
        ?? r52;
        sa0 sa0Var19;
        ms0 ms0Var2;
        Object obj;
        oj0 oj0Var5;
        vt vtVar8;
        ?? r53;
        ev1 ev1Var5 = ev1Var;
        if (yeVar instanceof tv1) {
            tv1Var = (tv1) yeVar;
            int i2 = tv1Var.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tv1Var.r = i2 - Integer.MIN_VALUE;
            } else {
                tv1Var = new tv1(yeVar);
            }
        }
        Object objI = tv1Var.q;
        int i3 = tv1Var.r;
        yt ytVar = yt.h;
        f81 f81Var2 = f81.f;
        ls0 ls0Var2 = ls0.a;
        f10 f10Var = a;
        t32 t32Var = t32.a;
        wt wtVar = wt.e;
        switch (i3) {
            case 0:
                xc.G(objI);
                tv1Var.h = ev1Var5;
                vtVar2 = vtVar;
                tv1Var.i = vtVar2;
                ma1Var2 = ma1Var;
                tv1Var.j = ma1Var2;
                r5 = 0;
                tv1Var.k = null;
                tv1Var.l = null;
                xa0Var2 = xa0Var;
                tv1Var.m = xa0Var2;
                sa0Var2 = sa0Var;
                tv1Var.n = sa0Var2;
                i = 1;
                tv1Var.r = 1;
                objB = b(ev1Var5, tv1Var, 3);
                if (objB != wtVar) {
                    sa0Var3 = null;
                    sa0Var4 = null;
                    l81 l81Var9 = (l81) objB;
                    l81Var9.a();
                    jr1 jr1VarA = nu0.A(vtVar2, r5, ytVar, new rv1(ma1Var2, r5, i), i);
                    if (xa0Var2 == f10Var) {
                        ma1 ma1Var9 = ma1Var2;
                        ma1Var3 = ma1Var9;
                        l81Var = l81Var9;
                        f(vtVar2, jr1VarA, new uv1(xa0Var2, ma1Var9, l81Var9, r5, 0));
                    } else {
                        ma1Var3 = ma1Var2;
                        l81Var = l81Var9;
                    }
                    if (sa0Var3 != null) {
                        tv1Var.h = ev1Var5;
                        tv1Var.i = vtVar2;
                        tv1Var.j = ma1Var3;
                        tv1Var.k = sa0Var4;
                        tv1Var.l = sa0Var3;
                        tv1Var.m = xa0Var2;
                        tv1Var.n = sa0Var2;
                        tv1Var.o = jr1VarA;
                        tv1Var.r = 2;
                        Object objI2 = i(ev1Var5, f81Var2, tv1Var);
                        if (objI2 != wtVar) {
                            ev1Var2 = ev1Var5;
                            oj0Var = jr1VarA;
                            xa0Var4 = xa0Var2;
                            sa0Var6 = sa0Var3;
                            vtVar4 = vtVar2;
                            objI = objI2;
                            sa0Var7 = sa0Var2;
                            sa0Var8 = sa0Var4;
                            l81Var2 = (l81) objI;
                            ma1 ma1Var10 = ma1Var3;
                            xa0Var3 = xa0Var4;
                            ma1Var5 = ma1Var10;
                            if (l81Var2 == null) {
                                f81Var = f81Var2;
                                ls0Var = ls0Var2;
                                jr1VarF = f(vtVar4, oj0Var, new qv1(ma1Var5, null, 3));
                            } else {
                                f81Var = f81Var2;
                                ls0Var = ls0Var2;
                                l81Var2.a();
                                jr1VarF = f(vtVar4, oj0Var, new qv1(ma1Var5, null, 4));
                            }
                            if (l81Var2 != null) {
                                if (sa0Var8 != null) {
                                    tv1Var.h = ev1Var2;
                                    tv1Var.i = vtVar4;
                                    tv1Var.j = ma1Var5;
                                    tv1Var.k = sa0Var8;
                                    tv1Var.l = sa0Var6;
                                    tv1Var.m = xa0Var3;
                                    tv1Var.n = sa0Var7;
                                    tv1Var.o = l81Var2;
                                    tv1Var.p = jr1VarF;
                                    tv1Var.r = 5;
                                    jr1 jr1Var = jr1VarF;
                                    Object objI3 = ev1Var2.i(ev1Var2.f().b(), new dl1(l81Var2, null), tv1Var);
                                    if (objI3 != wtVar) {
                                        xa0 xa0Var6 = xa0Var3;
                                        sa0Var9 = sa0Var8;
                                        xa0Var5 = xa0Var6;
                                        ev1Var3 = ev1Var2;
                                        sa0Var10 = sa0Var6;
                                        sa0Var11 = sa0Var7;
                                        l81Var3 = l81Var2;
                                        objI = objI3;
                                        oj0Var2 = jr1Var;
                                        l81Var4 = (l81) objI;
                                        if (l81Var4 == null) {
                                            ks ksVar2 = null;
                                            jr1 jr1VarA2 = nu0.A(vtVar4, null, ytVar, new qk1(oj0Var2, ma1Var5, ksVar2, 6), 1);
                                            if (xa0Var5 != f10Var) {
                                                ma1 ma1Var11 = ma1Var5;
                                                uv1 uv1Var = new uv1(xa0Var5, ma1Var11, l81Var4, ksVar2, 1);
                                                ma1Var7 = ma1Var11;
                                                l81Var5 = l81Var4;
                                                sa0Var12 = null;
                                                f(vtVar4, jr1VarA2, uv1Var);
                                            } else {
                                                ma1Var7 = ma1Var5;
                                                sa0Var12 = null;
                                                l81Var5 = l81Var4;
                                            }
                                            if (sa0Var10 == null) {
                                                tv1Var.h = vtVar4;
                                                tv1Var.i = ma1Var7;
                                                tv1Var.j = sa0Var9;
                                                tv1Var.k = sa0Var11;
                                                tv1Var.l = jr1VarA2;
                                                tv1Var.m = l81Var3;
                                                tv1Var.n = sa0Var12;
                                                tv1Var.o = sa0Var12;
                                                tv1Var.p = sa0Var12;
                                                tv1Var.r = 6;
                                                objI = i(ev1Var3, f81Var, tv1Var);
                                                if (objI != wtVar) {
                                                    l81 l81Var10 = l81Var3;
                                                    oj0Var4 = jr1VarA2;
                                                    l81Var8 = l81Var10;
                                                    sa0Var16 = sa0Var11;
                                                    sa0Var17 = sa0Var9;
                                                    vtVar7 = vtVar4;
                                                    sa0Var18 = sa0Var12;
                                                    r52 = sa0Var18;
                                                    r13 = (l81) objI;
                                                    if (r13 != 0) {
                                                        r13.a();
                                                        f(vtVar7, oj0Var4, new qv1(ma1Var7, r52, 5));
                                                        sa0Var17.i(new w01(r13.c));
                                                        return t32Var;
                                                    }
                                                    f(vtVar7, oj0Var4, new qv1(ma1Var7, r52, 6));
                                                    if (sa0Var16 != null) {
                                                        sa0Var16.i(new w01(l81Var8.c));
                                                        return t32Var;
                                                    }
                                                }
                                            } else {
                                                tv1Var.h = ev1Var3;
                                                tv1Var.i = vtVar4;
                                                tv1Var.j = ma1Var7;
                                                tv1Var.k = sa0Var9;
                                                tv1Var.l = sa0Var10;
                                                tv1Var.m = sa0Var11;
                                                tv1Var.n = jr1VarA2;
                                                tv1Var.o = l81Var3;
                                                tv1Var.p = l81Var5;
                                                tv1Var.r = 7;
                                                Object objH = h(ev1Var3, f81Var, tv1Var);
                                                if (objH != wtVar) {
                                                    sa0 sa0Var20 = sa0Var11;
                                                    oj0Var3 = jr1VarA2;
                                                    l81Var6 = l81Var5;
                                                    objI = objH;
                                                    sa0Var13 = sa0Var9;
                                                    sa0Var14 = sa0Var20;
                                                    ma1 ma1Var12 = ma1Var7;
                                                    l81Var7 = l81Var3;
                                                    ma1Var8 = ma1Var12;
                                                    vtVar6 = vtVar4;
                                                    sa0Var15 = sa0Var10;
                                                    ev1Var4 = ev1Var3;
                                                    sa0Var19 = sa0Var12;
                                                    ms0Var2 = (ms0) objI;
                                                    if (xi0.o(ms0Var2, ls0Var)) {
                                                        if (ms0Var2 instanceof ks0) {
                                                            obj = ((ks0) ms0Var2).a;
                                                        } else {
                                                            if (!(ms0Var2 instanceof js0)) {
                                                                ez1.a();
                                                                return null;
                                                            }
                                                            obj = sa0Var19;
                                                        }
                                                        l81Var8 = l81Var7;
                                                        sa0Var16 = sa0Var14;
                                                        vtVar7 = vtVar6;
                                                        ma1Var7 = ma1Var8;
                                                        oj0Var4 = oj0Var3;
                                                        sa0Var17 = sa0Var13;
                                                        r52 = sa0Var19;
                                                        r13 = obj;
                                                        if (r13 != 0) {
                                                        }
                                                    } else {
                                                        sa0Var15.i(new w01(l81Var6.c));
                                                        tv1Var.h = vtVar6;
                                                        tv1Var.i = ma1Var8;
                                                        tv1Var.j = oj0Var3;
                                                        tv1Var.k = sa0Var19;
                                                        tv1Var.l = sa0Var19;
                                                        tv1Var.m = sa0Var19;
                                                        tv1Var.n = sa0Var19;
                                                        tv1Var.o = sa0Var19;
                                                        tv1Var.p = sa0Var19;
                                                        tv1Var.r = 8;
                                                        if (c(ev1Var4, tv1Var) != wtVar) {
                                                            oj0Var5 = oj0Var3;
                                                            vtVar8 = vtVar6;
                                                            r53 = sa0Var19;
                                                            f(vtVar8, oj0Var5, new qv1(ma1Var8, r53, 7));
                                                            return t32Var;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (sa0Var11 != null) {
                                            sa0Var11.i(new w01(l81Var3.c));
                                            return t32Var;
                                        }
                                    }
                                } else if (sa0Var7 != null) {
                                    sa0Var7.i(new w01(l81Var2.c));
                                    return t32Var;
                                }
                            }
                            return t32Var;
                        }
                    } else {
                        tv1Var.h = ev1Var5;
                        tv1Var.i = vtVar2;
                        tv1Var.j = ma1Var3;
                        tv1Var.k = sa0Var4;
                        tv1Var.l = sa0Var3;
                        tv1Var.m = xa0Var2;
                        tv1Var.n = sa0Var2;
                        tv1Var.o = l81Var;
                        tv1Var.p = jr1VarA;
                        tv1Var.r = 3;
                        Object objH2 = h(ev1Var5, f81Var2, tv1Var);
                        if (objH2 != wtVar) {
                            ev1Var2 = ev1Var5;
                            oj0Var = jr1VarA;
                            sa0 sa0Var21 = sa0Var2;
                            vtVar3 = vtVar2;
                            objI = objH2;
                            sa0Var5 = sa0Var21;
                            ma1 ma1Var13 = ma1Var3;
                            xa0Var3 = xa0Var2;
                            ma1Var4 = ma1Var13;
                            ms0Var = (ms0) objI;
                            if (xi0.o(ms0Var, ls0Var2)) {
                                if (ms0Var instanceof ks0) {
                                    l81Var2 = ((ks0) ms0Var).a;
                                } else {
                                    if (!(ms0Var instanceof js0)) {
                                        ez1.a();
                                        return null;
                                    }
                                    l81Var2 = null;
                                }
                                sa0Var7 = sa0Var5;
                                ma1Var5 = ma1Var4;
                                sa0Var6 = sa0Var3;
                                vtVar4 = vtVar3;
                                sa0Var8 = sa0Var4;
                                if (l81Var2 == null) {
                                }
                                if (l81Var2 != null) {
                                }
                                return t32Var;
                            }
                            sa0Var3.i(new w01(l81Var.c));
                            tv1Var.h = vtVar3;
                            tv1Var.i = ma1Var4;
                            tv1Var.j = oj0Var;
                            ksVar = null;
                            tv1Var.k = null;
                            tv1Var.l = null;
                            tv1Var.m = null;
                            tv1Var.n = null;
                            tv1Var.o = null;
                            tv1Var.p = null;
                            tv1Var.r = 4;
                            if (c(ev1Var2, tv1Var) != wtVar) {
                                ma1Var6 = ma1Var4;
                                vtVar5 = vtVar3;
                                f(vtVar5, oj0Var, new qv1(ma1Var6, ksVar, 2));
                                return t32Var;
                            }
                        }
                    }
                }
                return wtVar;
            case 1:
                sa0 sa0Var22 = (sa0) tv1Var.n;
                xa0 xa0Var7 = (xa0) tv1Var.m;
                sa0 sa0Var23 = (sa0) tv1Var.l;
                sa0 sa0Var24 = tv1Var.k;
                ma1 ma1Var14 = (ma1) tv1Var.j;
                vt vtVar9 = (vt) tv1Var.i;
                ev1 ev1Var6 = (ev1) tv1Var.h;
                xc.G(objI);
                objB = objI;
                sa0Var4 = sa0Var24;
                vtVar2 = vtVar9;
                i = 1;
                xa0Var2 = xa0Var7;
                ma1Var2 = ma1Var14;
                sa0Var2 = sa0Var22;
                ev1Var5 = ev1Var6;
                sa0Var3 = sa0Var23;
                r5 = 0;
                l81 l81Var92 = (l81) objB;
                l81Var92.a();
                jr1 jr1VarA3 = nu0.A(vtVar2, r5, ytVar, new rv1(ma1Var2, r5, i), i);
                if (xa0Var2 == f10Var) {
                }
                if (sa0Var3 != null) {
                }
                return wtVar;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                oj0Var = (oj0) tv1Var.o;
                sa0Var7 = (sa0) tv1Var.n;
                xa0Var4 = (xa0) tv1Var.m;
                sa0Var6 = (sa0) tv1Var.l;
                sa0Var8 = tv1Var.k;
                ma1Var3 = (ma1) tv1Var.j;
                vtVar4 = (vt) tv1Var.i;
                ev1Var2 = (ev1) tv1Var.h;
                xc.G(objI);
                l81Var2 = (l81) objI;
                ma1 ma1Var102 = ma1Var3;
                xa0Var3 = xa0Var4;
                ma1Var5 = ma1Var102;
                if (l81Var2 == null) {
                }
                if (l81Var2 != null) {
                }
                return t32Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                oj0Var = (oj0) tv1Var.p;
                l81Var = (l81) tv1Var.o;
                sa0Var5 = (sa0) tv1Var.n;
                xa0Var3 = (xa0) tv1Var.m;
                sa0Var3 = (sa0) tv1Var.l;
                sa0Var4 = tv1Var.k;
                ma1Var4 = (ma1) tv1Var.j;
                vtVar3 = (vt) tv1Var.i;
                ev1Var2 = (ev1) tv1Var.h;
                xc.G(objI);
                ms0Var = (ms0) objI;
                if (xi0.o(ms0Var, ls0Var2)) {
                }
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                oj0Var = (oj0) tv1Var.j;
                ma1Var6 = (ma1) tv1Var.i;
                vtVar5 = (vt) tv1Var.h;
                xc.G(objI);
                ksVar = null;
                f(vtVar5, oj0Var, new qv1(ma1Var6, ksVar, 2));
                return t32Var;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                oj0Var2 = (oj0) tv1Var.p;
                l81Var3 = (l81) tv1Var.o;
                sa0Var11 = (sa0) tv1Var.n;
                xa0Var5 = (xa0) tv1Var.m;
                sa0Var10 = (sa0) tv1Var.l;
                sa0Var9 = tv1Var.k;
                ma1Var5 = (ma1) tv1Var.j;
                vtVar4 = (vt) tv1Var.i;
                ev1Var3 = (ev1) tv1Var.h;
                xc.G(objI);
                f81Var = f81Var2;
                ls0Var = ls0Var2;
                l81Var4 = (l81) objI;
                if (l81Var4 == null) {
                }
                break;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                l81Var8 = (l81) tv1Var.m;
                oj0Var4 = (oj0) tv1Var.l;
                sa0Var16 = tv1Var.k;
                sa0Var17 = (sa0) tv1Var.j;
                ma1Var7 = (ma1) tv1Var.i;
                vtVar7 = (vt) tv1Var.h;
                xc.G(objI);
                sa0Var18 = null;
                r52 = sa0Var18;
                r13 = (l81) objI;
                if (r13 != 0) {
                }
                break;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                l81Var6 = (l81) tv1Var.p;
                l81 l81Var11 = (l81) tv1Var.o;
                oj0Var3 = (oj0) tv1Var.n;
                sa0 sa0Var25 = (sa0) tv1Var.m;
                sa0Var15 = (sa0) tv1Var.l;
                sa0Var13 = tv1Var.k;
                ma1 ma1Var15 = (ma1) tv1Var.j;
                vtVar6 = (vt) tv1Var.i;
                ev1Var4 = (ev1) tv1Var.h;
                xc.G(objI);
                sa0Var14 = sa0Var25;
                ls0Var = ls0Var2;
                sa0Var19 = null;
                l81Var7 = l81Var11;
                ma1Var8 = ma1Var15;
                ms0Var2 = (ms0) objI;
                if (xi0.o(ms0Var2, ls0Var)) {
                }
                break;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                oj0Var5 = (oj0) tv1Var.j;
                ma1Var8 = (ma1) tv1Var.i;
                vtVar8 = (vt) tv1Var.h;
                xc.G(objI);
                r53 = 0;
                f(vtVar8, oj0Var5, new qv1(ma1Var8, r53, 7));
                return t32Var;
            default:
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(ev1 ev1Var, f81 f81Var, ls lsVar) throws Throwable {
        vv1 vv1Var;
        zc1 zc1Var;
        if (lsVar instanceof vv1) {
            vv1Var = (vv1) lsVar;
            int i = vv1Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                vv1Var.j = i - Integer.MIN_VALUE;
            } else {
                vv1Var = new vv1(lsVar);
            }
        }
        Object obj = vv1Var.i;
        int i2 = vv1Var.j;
        ks ksVar = null;
        try {
            if (i2 == 0) {
                xc.G(obj);
                zc1 zc1Var2 = new zc1();
                zc1Var2.e = js0.a;
                long jC = ev1Var.f().c();
                wa0 ea0Var = new ea0(f81Var, zc1Var2, ksVar, 3);
                vv1Var.h = zc1Var2;
                vv1Var.j = 1;
                Object objH = ev1Var.h(jC, ea0Var, vv1Var);
                Object obj2 = wt.e;
                if (objH == obj2) {
                    return obj2;
                }
                zc1Var = zc1Var2;
            } else {
                if (i2 != 1) {
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zc1Var = vv1Var.h;
                xc.G(obj);
            }
            return zc1Var.e;
        } catch (g81 unused) {
            return ls0.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        if (r0 == r7) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(ev1 ev1Var, f81 f81Var, ye yeVar) {
        wv1 wv1Var;
        ev1 ev1Var2;
        wv1 wv1Var2;
        f81 f81Var2;
        ev1 ev1Var3;
        f81 f81Var3;
        int size;
        int i;
        Object objA;
        if (yeVar instanceof wv1) {
            wv1Var = (wv1) yeVar;
            int i2 = wv1Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wv1Var.k = i2 - Integer.MIN_VALUE;
            } else {
                wv1Var = new wv1(yeVar);
            }
        }
        Object objA2 = wv1Var.j;
        int i3 = wv1Var.k;
        wt wtVar = wt.e;
        if (i3 == 0) {
            xc.G(objA2);
            ev1Var2 = ev1Var;
            wv1Var2 = wv1Var;
            f81Var2 = f81Var;
            wv1Var2.h = ev1Var2;
            wv1Var2.i = f81Var2;
            wv1Var2.k = 1;
            objA = ev1Var2.a(f81Var2, wv1Var2);
            if (objA != wtVar) {
            }
            return wtVar;
        }
        if (i3 == 1) {
            f81Var3 = wv1Var.i;
            ev1Var3 = wv1Var.h;
            xc.G(objA2);
            List list = ((e81) objA2).a;
            size = list.size();
            while (i < size) {
            }
            return list.get(0);
        }
        if (i3 != 2) {
            yc.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f81Var3 = wv1Var.i;
        ev1Var3 = wv1Var.h;
        xc.G(objA2);
        f81 f81Var4 = f81Var3;
        wv1Var2 = wv1Var;
        f81Var2 = f81Var4;
        List list2 = ((e81) objA2).a;
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            if (((l81) list2.get(i4)).c()) {
                break;
            }
        }
        ev1Var2 = ev1Var3;
        wv1Var2.h = ev1Var2;
        wv1Var2.i = f81Var2;
        wv1Var2.k = 1;
        objA = ev1Var2.a(f81Var2, wv1Var2);
        if (objA != wtVar) {
            ev1Var3 = ev1Var2;
            objA2 = objA;
            wv1 wv1Var3 = wv1Var2;
            f81Var3 = f81Var2;
            wv1Var = wv1Var3;
            List list3 = ((e81) objA2).a;
            size = list3.size();
            for (i = 0; i < size; i++) {
                if (!lk.s((l81) list3.get(i))) {
                    int size3 = list3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        l81 l81Var = (l81) list3.get(i5);
                        if (l81Var.c() || lk.T(l81Var, ev1Var3.j.B, ev1Var3.c())) {
                            break;
                        }
                    }
                    wv1Var.h = ev1Var3;
                    wv1Var.i = f81Var3;
                    wv1Var.k = 2;
                    objA2 = ev1Var3.a(f81.g, wv1Var);
                }
            }
            return list3.get(0);
        }
        return wtVar;
    }
}
