package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fi implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ fi(int i, int i2, Object obj, Object obj2) {
        this.e = i2;
        this.f = obj;
        this.g = obj2;
    }

    private final Object d(Object obj, Object obj2) {
        jo joVar = (jo) this.g;
        ki1 ki1Var = (ki1) this.f;
        ob0 ob0Var = (ob0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            joVar.f(ki1Var, ob0Var, 6);
        } else {
            ob0Var.Q();
        }
        return t32.a;
    }

    private final Object e(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        af1.d((tv0) this.f, (jo) this.g, (ob0) obj, al.V(49));
        return t32.a;
    }

    private final Object g(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ((l91) this.f).h((Drawable) this.g, (ob0) obj, al.V(49));
        return t32.a;
    }

    private final Object k(Object obj, Object obj2) {
        xa0 xa0Var = (xa0) this.f;
        px1 px1Var = (px1) this.g;
        ob0 ob0Var = (ob0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            xa0Var.f(px1Var, ob0Var, 6);
        } else {
            ob0Var.Q();
        }
        return t32.a;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) throws Throwable {
        int i;
        ob0 ob0Var;
        boolean z;
        sa0 sa0VarE;
        int i2;
        lu1 lu1Var;
        int i3;
        int i4;
        int i5;
        int iMin;
        gx0 gx0Var;
        un0 un0Var;
        long j;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        String str;
        List arrayList;
        vm0 vm0Var;
        boolean z2;
        fd fdVar;
        int i13;
        List list;
        fd fdVar2;
        Object obj3;
        Integer numValueOf;
        Integer numValueOf2;
        int i14;
        int i15;
        lu1 lu1Var2;
        pn0 pn0Var;
        int i16;
        gx0 gx0Var2;
        int i17;
        qn0 qn0Var;
        fd fdVar3;
        int iB;
        Object obj4;
        long j2;
        int iB2;
        int i18;
        int iMax;
        int i19;
        int iC;
        int i20;
        int i21;
        wz1 wz1Var;
        int i22 = this.e;
        l91 l91Var = kp.a;
        hw1 hw1Var = null;
        t32 t32Var = t32.a;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i22) {
            case 0:
                c41 c41Var = (c41) obj6;
                jo joVar = (jo) obj5;
                ob0 ob0Var2 = (ob0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (ob0Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = yh.a;
                    tv0 tv0VarB = xi0.B(ko1.a(qv0.a, yh.d, yh.b()), c41Var);
                    tg1 tg1VarA = sg1.a(pv.e, v20.p, ob0Var2, 54);
                    int iHashCode = Long.hashCode(ob0Var2.T);
                    b61 b61VarL = ob0Var2.l();
                    tv0 tv0VarP = bk.P(ob0Var2, tv0VarB);
                    ep.c.getClass();
                    zp zpVar = dp.b;
                    ob0Var2.Z();
                    if (ob0Var2.S) {
                        ob0Var2.k(zpVar);
                    } else {
                        ob0Var2.i0();
                    }
                    xc.E(dp.f, ob0Var2, tg1VarA);
                    xc.E(dp.e, ob0Var2, b61VarL);
                    xc.E(dp.g, ob0Var2, Integer.valueOf(iHashCode));
                    xc.C(ob0Var2, dp.h);
                    xc.E(dp.d, ob0Var2, tv0VarP);
                    joVar.f(vg1.a, ob0Var2, 6);
                    ob0Var2.p(true);
                } else {
                    ob0Var2.Q();
                }
                return t32Var;
            case 1:
                ((Integer) obj2).getClass();
                u4.a((tv0) obj6, (sa0) obj5, (ob0) obj, al.V(1));
                return t32Var;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                ((ds) obj6).a((cs) obj5, (ob0) obj, al.V(1));
                return t32Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).getClass();
                ((sv) obj6).a((oc) obj5, (ob0) obj, al.V(1));
                return t32Var;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                lw1 lw1Var = (lw1) obj6;
                ww1 ww1Var = (ww1) obj5;
                ob0 ob0Var3 = (ob0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (ob0Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zF = ob0Var3.f(lw1Var);
                    Object objK = ob0Var3.K();
                    if (zF || objK == l91Var) {
                        objK = xc.s(new w3(0, lw1Var, lw1.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 0, 5));
                        ob0Var3.f0(objK);
                    }
                    qw.a(ww1Var, (kw1) ((ns1) objK).getValue(), ob0Var3, 0);
                } else {
                    ob0Var3.Q();
                }
                return t32Var;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ((Integer) obj2).getClass();
                qw.a((ww1) obj6, (kw1) obj5, (ob0) obj, al.V(1));
                return t32Var;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                hd1 hd1Var = (hd1) obj6;
                mp1 mp1Var = (mp1) obj5;
                int iIntValue3 = ((Integer) obj).intValue();
                if (obj2 instanceof to) {
                    hd1Var.f.b((to) obj2);
                } else if (!(obj2 instanceof te1)) {
                    if (obj2 instanceof sb0) {
                        s22.G(mp1Var, iIntValue3, obj2);
                        hd1Var.e((sb0) obj2);
                    } else if (obj2 instanceof dc1) {
                        s22.G(mp1Var, iIntValue3, obj2);
                        ((dc1) obj2).c();
                    }
                }
                return t32Var;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                sm0 sm0Var = (sm0) obj6;
                rm0 rm0Var = (rm0) obj5;
                Object obj7 = rm0Var.a;
                ob0 ob0Var4 = (ob0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (ob0Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    kn0 kn0Var = (kn0) sm0Var.b.a();
                    int iB3 = rm0Var.c;
                    if (iB3 >= kn0Var.c() || !kn0Var.d(iB3).equals(obj7)) {
                        iB3 = kn0Var.d.b(obj7);
                        i = -1;
                        if (iB3 != -1) {
                            rm0Var.c = iB3;
                        }
                    } else {
                        i = -1;
                    }
                    if (iB3 != i) {
                        ob0Var4.W(-1664741271);
                        bl.f(kn0Var, sm0Var.a, iB3, obj7, ob0Var4, 0);
                        ob0Var = ob0Var4;
                        ob0Var.p(false);
                    } else {
                        ob0Var = ob0Var4;
                        ob0Var.W(-1664505826);
                        ob0Var.p(false);
                    }
                    boolean zH = ob0Var.h(rm0Var);
                    Object objK2 = ob0Var.K();
                    if (zH || objK2 == l91Var) {
                        objK2 = new n(13, rm0Var);
                        ob0Var.f0(objK2);
                    }
                    wi0.c(obj7, (sa0) objK2, ob0Var);
                } else {
                    ob0Var4.Q();
                }
                return t32Var;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                boolean zA = vh0.a(0L, 0L);
                on0 on0Var = (on0) obj5;
                lu1 lu1Var3 = (lu1) obj;
                vm0 vm0Var2 = new vm0((sm0) obj6, lu1Var3);
                long j3 = ((kr) obj2).a;
                on0Var.getClass();
                dd ddVar = on0Var.d;
                e41 e41Var = on0Var.b;
                un0 un0Var2 = on0Var.a;
                fy0 fy0Var = un0Var2.s;
                gk gkVar = un0Var2.e;
                fy0Var.getValue();
                boolean z3 = un0Var2.b || lu1Var3.s();
                k31 k31Var = k31.e;
                bk.p(j3, k31Var);
                int iN = lu1Var3.N(e41Var.a(lu1Var3.getLayoutDirection()));
                int iN2 = lu1Var3.N(e41Var.b(lu1Var3.getLayoutDirection()));
                int iN3 = lu1Var3.N(e41Var.b);
                int iN4 = lu1Var3.N(e41Var.d) + iN3;
                int i23 = iN2 + iN;
                int i24 = iN4 - iN3;
                long jI = lr.i(-i23, -iN4, j3);
                kn0 kn0Var2 = (kn0) on0Var.c.a();
                jm0 jm0Var = kn0Var2.c;
                int iH = kr.h(jI);
                int iG = kr.g(jI);
                jm0Var.a.h(iH);
                jm0Var.b.h(iG);
                if (ddVar == null) {
                    throw s91.v("null verticalArrangement when isVertical == true");
                }
                int iN5 = lu1Var3.N(ddVar.a());
                int iC2 = kn0Var2.c();
                int iG2 = kr.g(j3) - iN4;
                nn0 nn0Var = new nn0(jI, kn0Var2, vm0Var2, iC2, iN5, on0Var.g, iN3, i24, (((long) iN) << 32) | (((long) iN3) & 4294967295L), on0Var.a);
                sp1 sp1VarL = uc1.l();
                if (sp1VarL != null) {
                    z = z3;
                    sa0VarE = sp1VarL.e();
                } else {
                    z = z3;
                    sa0VarE = null;
                }
                sp1 sp1VarU = uc1.u(sp1VarL);
                try {
                    int iG3 = ((s41) gkVar.b).g();
                    int iX = el.x(iG3, kn0Var2, gkVar.d);
                    if (iG3 != iX) {
                        i3 = iN3;
                        ((s41) gkVar.b).h(iX);
                        wm0 wm0Var = (wm0) gkVar.e;
                        i2 = iX;
                        if (iG3 != wm0Var.f) {
                            wm0Var.f = iG3;
                            int i25 = (iG3 / 30) * 30;
                            lu1Var = lu1Var3;
                            wm0Var.e.setValue(lk.o0(Math.max(i25 - 100, 0), i25 + 130));
                        } else {
                            lu1Var = lu1Var3;
                        }
                    } else {
                        i2 = iX;
                        lu1Var = lu1Var3;
                        i3 = iN3;
                    }
                    int iG4 = ((s41) gkVar.c).g();
                    uc1.B(sp1VarL, sp1VarU, sa0VarE);
                    ym0 ym0Var = un0Var2.r;
                    wg wgVar = un0Var2.o;
                    mq1 mq1Var = ym0Var.e;
                    mq1Var.getClass();
                    f0 f0Var = wi0.y(mq1Var).c;
                    iy0 iy0Var = wgVar.a;
                    if ((iy0Var.g != 0) || !f0Var.isEmpty()) {
                        gx0 gx0Var3 = new gx0();
                        if (wgVar.a.g != 0) {
                            int i26 = iy0Var.g;
                            if (i26 != 0) {
                                Object[] objArr = iy0Var.e;
                                i5 = ((km0) objArr[0]).a;
                                i4 = iG4;
                                int i27 = 0;
                                while (i27 < i26) {
                                    int i28 = i27;
                                    int i29 = ((km0) objArr[i27]).a;
                                    if (i29 < i5) {
                                        i5 = i29;
                                    }
                                    i27 = i28 + 1;
                                }
                                if (i5 < 0) {
                                    qg0.a("negative minIndex");
                                }
                                int i30 = iy0Var.g;
                                if (i30 != 0) {
                                    Object[] objArr2 = iy0Var.e;
                                    int i31 = ((km0) objArr2[0]).b;
                                    for (int i32 = 0; i32 < i30; i32++) {
                                        int i33 = ((km0) objArr2[i32]).b;
                                        if (i33 > i31) {
                                            i31 = i33;
                                        }
                                    }
                                    iMin = Math.min(i31, kn0Var2.c() - 1);
                                } else {
                                    yc.h("MutableVector is empty.");
                                }
                            } else {
                                yc.h("MutableVector is empty.");
                            }
                            return null;
                        }
                        i4 = iG4;
                        i5 = 1;
                        iMin = 0;
                        int iA = f0Var.a();
                        for (int i34 = 0; i34 < iA; i34++) {
                            xm0 xm0Var = (xm0) f0Var.get(i34);
                            int iX2 = el.x(xm0Var.c, kn0Var2, xm0Var.a);
                            if ((i5 > iX2 || iX2 > iMin) && iX2 >= 0 && iX2 < kn0Var2.c()) {
                                gx0Var3.a(iX2);
                            }
                        }
                        if (i5 <= iMin) {
                            while (true) {
                                gx0Var3.a(i5);
                                if (i5 != iMin) {
                                    i5++;
                                }
                            }
                        }
                        int i35 = gx0Var3.b;
                        if (i35 != 0) {
                            int[] iArr = gx0Var3.a;
                            iArr.getClass();
                            Arrays.sort(iArr, 0, i35);
                        }
                        gx0Var = gx0Var3;
                    } else {
                        gx0Var = lh0.a;
                        i4 = iG4;
                    }
                    float fFloatValue = (lu1Var.s() || !z) ? un0Var2.h : ((Number) ((xa) un0Var2.w.g).f.getValue()).floatValue();
                    qm0 qm0Var = un0Var2.n;
                    boolean zS = lu1Var.s();
                    vt vtVar = on0Var.e;
                    fy0 fy0Var2 = un0Var2.v;
                    t61 t61Var = on0Var.f;
                    if (i3 < 0) {
                        qg0.a("invalid beforeContentPadding");
                    }
                    if (i24 < 0) {
                        qg0.a("invalid afterContentPadding");
                    }
                    g40 g40Var = g40.e;
                    kn0 kn0Var3 = nn0Var.b;
                    int i36 = i3;
                    List list2 = f40.e;
                    if (iC2 > 0) {
                        float f2 = fFloatValue;
                        int i37 = i2;
                        lu1 lu1Var4 = lu1Var;
                        if (i37 >= iC2) {
                            i37 = iC2 - 1;
                            i4 = 0;
                        }
                        int iRound = Math.round(f2);
                        int i38 = i4 - iRound;
                        if (i37 == 0 && i38 < 0) {
                            iRound += i38;
                            i38 = 0;
                        }
                        int i39 = i37;
                        fd fdVar4 = new fd();
                        int i40 = -i36;
                        un0Var = un0Var2;
                        int i41 = i40 + (iN5 < 0 ? iN5 : 0);
                        int iA2 = i38 + i41;
                        int iMax2 = 0;
                        while (true) {
                            j = nn0Var.d;
                            if (iA2 < 0 && i39 > 0) {
                                fy0 fy0Var3 = fy0Var2;
                                int i42 = i39 - 1;
                                qn0 qn0VarA = nn0Var.a(i42, j);
                                fdVar4.add(0, qn0VarA);
                                iMax2 = Math.max(iMax2, qn0VarA.n);
                                iA2 += qn0VarA.a();
                                i39 = i42;
                                fy0Var2 = fy0Var3;
                            }
                        }
                        fy0 fy0Var4 = fy0Var2;
                        if (iA2 < i41) {
                            iRound -= i41 - iA2;
                            iA2 = i41;
                        }
                        int i43 = iRound;
                        int i44 = iA2 - i41;
                        int i45 = iG2 + i24;
                        int i46 = iMax2;
                        int i47 = i45 < 0 ? 0 : i45;
                        int i48 = i40;
                        int i49 = -i44;
                        int iA3 = i44;
                        int i50 = i39;
                        int i51 = 0;
                        boolean z4 = false;
                        while (i51 < fdVar4.g) {
                            if (i49 >= i47) {
                                fdVar4.b(i51);
                                z4 = true;
                            } else {
                                i50++;
                                int iA4 = ((qn0) fdVar4.get(i51)).a() + i49;
                                i51++;
                                i49 = iA4;
                            }
                        }
                        int iMax3 = i46;
                        boolean z5 = z4;
                        int i52 = i50;
                        while (i52 < iC2 && (i49 < i47 || i49 <= 0 || fdVar4.isEmpty())) {
                            int i53 = i47;
                            qn0 qn0VarA2 = nn0Var.a(i52, j);
                            int iA5 = qn0VarA2.a() + i49;
                            if (iA5 <= i41) {
                                i21 = iA5;
                                if (i52 != iC2 - 1) {
                                    iA3 -= qn0VarA2.a();
                                    i39 = i52 + 1;
                                    z5 = true;
                                }
                                i52++;
                                i47 = i53;
                                i49 = i21;
                            } else {
                                i21 = iA5;
                            }
                            int iMax4 = Math.max(iMax3, qn0VarA2.n);
                            fdVar4.addLast(qn0VarA2);
                            iMax3 = iMax4;
                            i52++;
                            i47 = i53;
                            i49 = i21;
                        }
                        if (i49 < iG2) {
                            int i54 = iG2 - i49;
                            int i55 = i49 + i54;
                            int iA6 = iA3 - i54;
                            while (iA6 < i36 && i39 > 0) {
                                int i56 = iA6;
                                int i57 = i39 - 1;
                                int i58 = i36;
                                qn0 qn0VarA3 = nn0Var.a(i57, j);
                                i39 = i57;
                                fdVar4.add(0, qn0VarA3);
                                iMax3 = Math.max(iMax3, qn0VarA3.n);
                                iA6 = qn0VarA3.a() + i56;
                                i36 = i58;
                            }
                            int i59 = iA6;
                            i6 = i36;
                            i7 = i54 + i43;
                            if (i59 < 0) {
                                i7 += i59;
                                i49 = i55 + i59;
                                i8 = iMax3;
                                i9 = i39;
                                i10 = 0;
                            } else {
                                i49 = i55;
                                i9 = i39;
                                i8 = iMax3;
                                i10 = i59;
                            }
                        } else {
                            i6 = i36;
                            i7 = i43;
                            i8 = iMax3;
                            i9 = i39;
                            i10 = iA3;
                        }
                        int i60 = i52;
                        float f3 = (Integer.signum(Math.round(f2)) != Integer.signum(i7) || Math.abs(Math.round(f2)) < Math.abs(i7)) ? f2 : i7;
                        float f4 = f2 - f3;
                        float f5 = 0.0f;
                        if (zS && i7 > i43 && f4 <= 0.0f) {
                            f5 = (i7 - i43) + f4;
                        }
                        if (i10 < 0) {
                            qg0.a("negative currentFirstItemScrollOffset");
                        }
                        int i61 = -i10;
                        String str2 = "ArrayDeque is empty.";
                        if (fdVar4.isEmpty()) {
                            yc.h("ArrayDeque is empty.");
                        } else {
                            float f6 = f3;
                            qn0 qn0Var2 = (qn0) fdVar4.f[fdVar4.e];
                            if (i6 > 0 || iN5 < 0) {
                                int iA7 = fdVar4.a();
                                qn0 qn0Var3 = qn0Var2;
                                int i62 = 0;
                                while (true) {
                                    if (i62 < iA7) {
                                        i11 = i61;
                                        int iA8 = ((qn0) fdVar4.get(i62)).a();
                                        if (i10 != 0 && iA8 <= i10 && i62 != fdVar4.a() - 1) {
                                            i10 -= iA8;
                                            i62++;
                                            qn0Var3 = (qn0) fdVar4.get(i62);
                                            i61 = i11;
                                        }
                                    } else {
                                        i11 = i61;
                                    }
                                }
                                qn0Var2 = qn0Var3;
                            } else {
                                i11 = i61;
                            }
                            int i63 = i10;
                            int iMax5 = Math.max(0, i9);
                            int i64 = i9 - 1;
                            ArrayList arrayList2 = null;
                            if (iMax5 <= i64) {
                                while (true) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    arrayList2.add(nn0Var.a(i64, j));
                                    if (i64 != iMax5) {
                                        i64--;
                                    }
                                }
                            }
                            int[] iArr2 = gx0Var.a;
                            int i65 = gx0Var.b - 1;
                            ArrayList arrayList3 = arrayList2;
                            while (-1 < i65) {
                                int i66 = iArr2[i65];
                                if (i66 < iMax5) {
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                    }
                                    i20 = iMax5;
                                    ArrayList arrayList4 = arrayList3;
                                    arrayList4.add(nn0Var.a(i66, j));
                                    arrayList3 = arrayList4;
                                } else {
                                    i20 = iMax5;
                                }
                                i65--;
                                iMax5 = i20;
                            }
                            List list3 = arrayList3 == null ? list2 : arrayList3;
                            int iMax6 = i8;
                            int i67 = 0;
                            for (int size = list3.size(); i67 < size; size = size) {
                                iMax6 = Math.max(iMax6, ((qn0) list3.get(i67)).n);
                                i67++;
                            }
                            int iMin2 = Math.min(((qn0) pl.i0(fdVar4)).a, iC2 - 1);
                            int i68 = ((qn0) pl.i0(fdVar4)).a + 1;
                            if (i68 <= iMin2) {
                                List arrayList5 = null;
                                while (true) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    i12 = iMax6;
                                    arrayList = arrayList5;
                                    str = str2;
                                    arrayList.add(nn0Var.a(i68, j));
                                    if (i68 != iMin2) {
                                        i68++;
                                        str2 = str;
                                        arrayList5 = arrayList;
                                        iMax6 = i12;
                                    }
                                }
                            } else {
                                i12 = iMax6;
                                str = "ArrayDeque is empty.";
                                arrayList = null;
                            }
                            if (arrayList != null && ((qn0) pl.i0(arrayList)).a > iMin2) {
                                iMin2 = ((qn0) pl.i0(arrayList)).a;
                            }
                            int[] iArr3 = gx0Var.a;
                            int i69 = gx0Var.b;
                            int i70 = 0;
                            while (i70 < i69) {
                                int i71 = i69;
                                int i72 = iArr3[i70];
                                if (i72 > iMin2) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nn0Var.a(i72, j));
                                }
                                i70++;
                                i69 = i71;
                            }
                            if (arrayList == null) {
                                arrayList = list2;
                            }
                            int size2 = arrayList.size();
                            int iMax7 = i12;
                            for (int i73 = 0; i73 < size2; i73++) {
                                iMax7 = Math.max(iMax7, ((qn0) arrayList.get(i73)).n);
                            }
                            if (fdVar4.isEmpty()) {
                                yc.h(str);
                            } else {
                                boolean z6 = xi0.o(qn0Var2, fdVar4.f[fdVar4.e]) && list3.isEmpty() && arrayList.isEmpty();
                                int iG5 = lr.g(iMax7, jI);
                                int iF = lr.f(i49, jI);
                                boolean z7 = i49 < Math.min(iF, iG2);
                                if (z7 && i11 != 0) {
                                    qg0.c("non-zero itemsScrollOffset");
                                }
                                qn0 qn0Var4 = qn0Var2;
                                boolean z8 = z6;
                                ArrayList arrayList6 = new ArrayList(arrayList.size() + list3.size() + fdVar4.a());
                                if (z7) {
                                    if (!list3.isEmpty() || !arrayList.isEmpty()) {
                                        qg0.a("no extra items");
                                    }
                                    int iA9 = fdVar4.a();
                                    int[] iArr4 = new int[iA9];
                                    for (int i74 = 0; i74 < iA9; i74++) {
                                        iArr4[i74] = ((qn0) fdVar4.get(i74)).k;
                                    }
                                    int[] iArr5 = new int[iA9];
                                    if (ddVar == null) {
                                        throw s91.v("null verticalArrangement when isVertical == true");
                                    }
                                    ddVar.e(iF, vm0Var2, iArr4, iArr5);
                                    vm0Var = vm0Var2;
                                    int i75 = new rh0(0, iA9 - 1, 1).f;
                                    if (i75 >= 0) {
                                        int i76 = 0;
                                        while (true) {
                                            int i77 = iArr5[i76];
                                            qn0 qn0Var5 = (qn0) fdVar4.get(i76);
                                            qn0Var5.d(i77, iG5, iF);
                                            arrayList6.add(qn0Var5);
                                            if (i76 != i75) {
                                                i76++;
                                            }
                                        }
                                    }
                                } else {
                                    vm0Var = vm0Var2;
                                    int size3 = list3.size();
                                    int iA10 = i11;
                                    int i78 = 0;
                                    while (i78 < size3) {
                                        int i79 = size3;
                                        qn0 qn0Var6 = (qn0) list3.get(i78);
                                        iA10 -= qn0Var6.a();
                                        qn0Var6.d(iA10, iG5, iF);
                                        arrayList6.add(qn0Var6);
                                        i78++;
                                        size3 = i79;
                                    }
                                    int iA11 = fdVar4.a();
                                    int iA12 = i11;
                                    for (int i80 = 0; i80 < iA11; i80++) {
                                        qn0 qn0Var7 = (qn0) fdVar4.get(i80);
                                        qn0Var7.d(iA12, iG5, iF);
                                        arrayList6.add(qn0Var7);
                                        iA12 += qn0Var7.a();
                                    }
                                    int size4 = arrayList.size();
                                    for (int i81 = 0; i81 < size4; i81++) {
                                        qn0 qn0Var8 = (qn0) arrayList.get(i81);
                                        qn0Var8.d(iA12, iG5, iF);
                                        arrayList6.add(qn0Var8);
                                        iA12 += qn0Var8.a();
                                    }
                                }
                                qm0Var.b(iG5, iF, arrayList6, kn0Var3.d, nn0Var, zS, z, i63, i49);
                                boolean z9 = zS;
                                if (!z9) {
                                    qm0Var.a();
                                    if (!zA) {
                                        iG5 = lr.g(Math.max(iG5, 0), jI);
                                        int iF2 = lr.f(Math.max(iF, 0), jI);
                                        if (iF2 != iF) {
                                            int size5 = arrayList6.size();
                                            for (int i82 = 0; i82 < size5; i82++) {
                                                ((qn0) arrayList6.get(i82)).p = iF2;
                                            }
                                        }
                                        iF = iF2;
                                    }
                                }
                                qn0 qn0Var9 = (qn0) (fdVar4.isEmpty() ? null : fdVar4.f[fdVar4.e]);
                                int i83 = qn0Var9 != null ? qn0Var9.a : 0;
                                qn0 qn0Var10 = (qn0) fdVar4.g();
                                int i84 = qn0Var10 != null ? qn0Var10.a : 0;
                                kn0Var3.b.getClass();
                                gx0 gx0Var4 = lh0.a;
                                if (t61Var == null || arrayList6.isEmpty() || (i16 = gx0Var4.b) == 0) {
                                    z2 = z9;
                                    fdVar = fdVar4;
                                    i13 = i48;
                                    list = list2;
                                } else {
                                    if (i84 - i83 < 0 || i16 == 0) {
                                        gx0Var2 = gx0Var4;
                                    } else {
                                        rh0 rh0VarO0 = lk.o0(0, i16);
                                        int i85 = rh0VarO0.e;
                                        int i86 = rh0VarO0.f;
                                        if (i85 <= i86) {
                                            iC = -1;
                                            while (gx0Var4.c(i85) <= i83) {
                                                iC = gx0Var4.c(i85);
                                                if (i85 != i86) {
                                                    i85++;
                                                } else {
                                                    i19 = -1;
                                                }
                                            }
                                            i19 = -1;
                                        } else {
                                            i19 = -1;
                                            iC = -1;
                                        }
                                        if (iC == i19) {
                                            gx0Var2 = lh0.a;
                                        } else {
                                            gx0Var2 = new gx0(1);
                                            gx0Var2.a(iC);
                                        }
                                    }
                                    ArrayList arrayList7 = new ArrayList();
                                    ArrayList arrayList8 = new ArrayList(arrayList6.size());
                                    int size6 = arrayList6.size();
                                    int i87 = 0;
                                    while (i87 < size6) {
                                        int i88 = size6;
                                        Object obj8 = arrayList6.get(i87);
                                        int i89 = i87;
                                        int i90 = ((qn0) obj8).a;
                                        boolean z10 = z9;
                                        int[] iArr6 = gx0Var4.a;
                                        int i91 = gx0Var4.b;
                                        gx0 gx0Var5 = gx0Var4;
                                        int i92 = 0;
                                        while (true) {
                                            if (i92 < i91) {
                                                int i93 = i91;
                                                if (iArr6[i92] == i90) {
                                                    arrayList8.add(obj8);
                                                } else {
                                                    i92++;
                                                    i91 = i93;
                                                }
                                            }
                                        }
                                        i87 = i89 + 1;
                                        size6 = i88;
                                        gx0Var4 = gx0Var5;
                                        z9 = z10;
                                    }
                                    z2 = z9;
                                    int[] iArr7 = gx0Var2.a;
                                    int i94 = gx0Var2.b;
                                    int i95 = 0;
                                    while (i95 < i94) {
                                        int i96 = iArr7[i95];
                                        int size7 = arrayList6.size();
                                        int[] iArr8 = iArr7;
                                        int i97 = 0;
                                        int i98 = 0;
                                        while (true) {
                                            if (i97 < size7) {
                                                Object obj9 = arrayList6.get(i97);
                                                int i99 = i97 + 1;
                                                if (((qn0) obj9).a == i96) {
                                                    i17 = i98;
                                                } else {
                                                    i98++;
                                                    i97 = i99;
                                                }
                                            } else {
                                                i17 = -1;
                                            }
                                        }
                                        qn0 qn0VarA4 = i17 == -1 ? nn0Var.a(i96, j) : (qn0) arrayList6.remove(i17);
                                        int iX3 = pv.x(qn0VarA4);
                                        int i100 = i94;
                                        if (i17 == -1) {
                                            qn0Var = qn0VarA4;
                                            fdVar3 = fdVar4;
                                            iB = Integer.MIN_VALUE;
                                        } else {
                                            qn0Var = qn0VarA4;
                                            fdVar3 = fdVar4;
                                            iB = (int) (qn0Var.b(0) & 4294967295L);
                                        }
                                        int size8 = arrayList8.size();
                                        int i101 = 0;
                                        while (true) {
                                            if (i101 < size8) {
                                                obj4 = arrayList8.get(i101);
                                                int i102 = size8;
                                                if (((qn0) obj4).a == i96) {
                                                    i101++;
                                                    size8 = i102;
                                                }
                                            } else {
                                                obj4 = null;
                                            }
                                        }
                                        qn0 qn0Var11 = (qn0) obj4;
                                        if (qn0Var11 != null) {
                                            j2 = j;
                                            iB2 = (int) (qn0Var11.b(0) & 4294967295L);
                                        } else {
                                            j2 = j;
                                            iB2 = Integer.MIN_VALUE;
                                        }
                                        if (iB == Integer.MIN_VALUE) {
                                            iMax = i48;
                                            i18 = iMax;
                                        } else {
                                            i18 = i48;
                                            iMax = Math.max(i18, iB);
                                        }
                                        if (iB2 != Integer.MIN_VALUE) {
                                            iMax = Math.min(iMax, iB2 - iX3);
                                        }
                                        qn0Var.o = true;
                                        qn0Var.d(iMax, iG5, iF);
                                        arrayList7.add(qn0Var);
                                        i95++;
                                        fdVar4 = fdVar3;
                                        i48 = i18;
                                        iArr7 = iArr8;
                                        i94 = i100;
                                        j = j2;
                                    }
                                    fdVar = fdVar4;
                                    i13 = i48;
                                    list = arrayList7;
                                }
                                if (z8) {
                                    qn0 qn0Var12 = (qn0) pl.d0(arrayList6);
                                    numValueOf = qn0Var12 != null ? Integer.valueOf(qn0Var12.a) : null;
                                    fdVar2 = fdVar;
                                } else {
                                    if (fdVar.isEmpty()) {
                                        obj3 = null;
                                        fdVar2 = fdVar;
                                    } else {
                                        fdVar2 = fdVar;
                                        obj3 = fdVar2.f[fdVar2.e];
                                    }
                                    qn0 qn0Var13 = (qn0) obj3;
                                    numValueOf = qn0Var13 != null ? Integer.valueOf(qn0Var13.a) : null;
                                }
                                if (z8) {
                                    qn0 qn0Var14 = (qn0) pl.j0(arrayList6);
                                    if (qn0Var14 != null) {
                                        numValueOf2 = Integer.valueOf(qn0Var14.a);
                                        i14 = iC2;
                                        i15 = i60;
                                    }
                                    i14 = iC2;
                                    i15 = i60;
                                    numValueOf2 = null;
                                } else {
                                    qn0 qn0Var15 = (qn0) fdVar2.g();
                                    if (qn0Var15 != null) {
                                        numValueOf2 = Integer.valueOf(qn0Var15.a);
                                        i14 = iC2;
                                        i15 = i60;
                                    }
                                    i14 = iC2;
                                    i15 = i60;
                                    numValueOf2 = null;
                                }
                                boolean z11 = i15 < i14 || i49 > iG2;
                                lu1Var2 = lu1Var4;
                                vu0 vu0VarF0 = lu1Var2.f0(lr.g(iG5 + i23, j3), lr.f(iF + iN4, j3), g40Var, new kf(fy0Var4, arrayList6, list, z2));
                                int iIntValue5 = numValueOf != null ? numValueOf.intValue() : 0;
                                int iIntValue6 = numValueOf2 != null ? numValueOf2.intValue() : 0;
                                if (!arrayList6.isEmpty()) {
                                    ArrayList arrayList9 = new ArrayList(list);
                                    int size9 = arrayList6.size();
                                    for (int i103 = 0; i103 < size9; i103++) {
                                        qn0 qn0Var16 = (qn0) arrayList6.get(i103);
                                        int i104 = qn0Var16.a;
                                        if (iIntValue5 <= i104 && i104 <= iIntValue6) {
                                            arrayList9.add(qn0Var16);
                                        }
                                    }
                                    tl.Z(arrayList9, pv.t);
                                    list2 = arrayList9;
                                }
                                pn0Var = new pn0(qn0Var4, i63, z11, f6, vu0VarF0, f5, z5, vtVar, vm0Var, nn0Var.d, list2, i13, i45, i14, k31Var, i24, iN5);
                            }
                        }
                        return null;
                    }
                    int iJ = kr.j(jI);
                    int i105 = kr.i(jI);
                    qm0Var.b(iJ, i105, new ArrayList(), kn0Var3.d, nn0Var, zS, z, 0, 0);
                    if (!zS) {
                        qm0Var.a();
                        if (!zA) {
                            iJ = lr.g(0, jI);
                            i105 = lr.f(0, jI);
                        }
                    }
                    lu1Var2 = lu1Var;
                    pn0Var = new pn0(null, 0, false, 0.0f, lu1Var2.f0(lr.g(iJ + i23, j3), lr.f(i105 + iN4, j3), g40Var, new mt(9)), 0.0f, false, vtVar, vm0Var2, nn0Var.d, list2, -i36, iG2 + i24, 0, k31Var, i24, iN5);
                    un0Var = un0Var2;
                    pn0 pn0Var2 = pn0Var;
                    un0Var.f(pn0Var2, lu1Var2.s(), false);
                    return pn0Var2;
                } catch (Throwable th) {
                    uc1.B(sp1VarL, sp1VarU, sa0VarE);
                    throw th;
                }
            case el.a /* 9 */:
                jo joVar2 = (jo) obj5;
                xn0 xn0Var = (xn0) obj6;
                ob0 ob0Var5 = (ob0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (ob0Var5.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    joVar2.f(xn0Var, ob0Var5, 0);
                } else {
                    ob0Var5.Q();
                }
                return t32Var;
            case el.b /* 10 */:
                g32 g32Var = (g32) obj6;
                ns1 ns1Var = (ns1) obj5;
                ob0 ob0Var6 = (ob0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (ob0Var6.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    sq0.f(((vl) ns1Var.getValue()).a, g32Var, ob0Var6, 48);
                } else {
                    ob0Var6.Q();
                }
                return t32Var;
            case 11:
                return d(obj, obj2);
            case el.c /* 12 */:
                return e(obj, obj2);
            case 13:
                return g(obj, obj2);
            case 14:
                return k(obj, obj2);
            default:
                ry1 ry1Var = (ry1) obj6;
                vt vtVar2 = (vt) obj5;
                iw1 iw1Var = (iw1) obj;
                Context context = (Context) obj2;
                boolean zJ = ry1Var.j();
                hb hbVarM = ry1Var.m();
                String str3 = hbVarM != null ? hbVarM.f : null;
                wz1 wz1Var2 = ry1Var.v;
                if (wz1Var2 != null) {
                    long j4 = wz1Var2.a;
                    z01 z01Var = ry1Var.b;
                    wz1Var = new wz1(af1.g(z01Var.g((int) (j4 >> 32)), z01Var.g((int) (j4 & 4294967295L))));
                } else {
                    wz1Var = null;
                }
                s71 s71Var = ry1Var.i;
                kf kfVar = new kf(ry1Var, vtVar2, context, 17);
                ys1 ys1Var = u71.a;
                if (Build.VERSION.SDK_INT < 28 || str3 == null || wz1Var == null || s71Var == null || !(s71Var instanceof s71)) {
                    String str4 = str3;
                    kfVar.i(iw1Var);
                    if (str4 != null && wz1Var != null) {
                        bl.m(iw1Var, context, zJ, str4, wz1Var.a);
                    }
                } else {
                    long j5 = wz1Var.a;
                    Object obj10 = s71Var.h;
                    uy0 uy0Var = s71Var.e;
                    if (uy0Var.f()) {
                        hw1 hw1Var2 = (hw1) s71Var.g.getValue();
                        if (hw1Var2 == null || !wz1.b(j5, hw1Var2.b) || !xi0.o(str3, hw1Var2.a)) {
                            hw1Var2 = null;
                        }
                        uy0Var.h(null);
                        hw1Var = hw1Var2;
                    }
                    if (hw1Var == null) {
                        kfVar.i(iw1Var);
                    } else {
                        ArrayList arrayList10 = hw1Var.d;
                        TextClassification textClassification = hw1Var.c;
                        if (!textClassification.getActions().isEmpty()) {
                            iw1Var.a.a(new xw1(obj10, textClassification, 0, (Drawable) arrayList10.get(0)));
                        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                            iw1Var.a.a(new xw1(obj10, textClassification, -1, textClassification.getIcon()));
                        }
                        kfVar.i(iw1Var);
                        List actions = textClassification.getActions();
                        int size10 = actions.size();
                        for (int i106 = 0; i106 < size10; i106++) {
                            if (i106 > 0) {
                                iw1Var.a.a(new xw1(obj10, textClassification, i106, (Drawable) arrayList10.get(i106)));
                            }
                        }
                    }
                    bl.m(iw1Var, context, zJ, str3, wz1Var.a);
                }
                return t32Var;
        }
    }

    public /* synthetic */ fi(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    public /* synthetic */ fi(jo joVar, Object obj, int i) {
        this.e = i;
        this.g = joVar;
        this.f = obj;
    }
}
