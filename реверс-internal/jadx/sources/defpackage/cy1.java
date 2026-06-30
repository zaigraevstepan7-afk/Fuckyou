package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cy1 implements uu0 {
    public final boolean a;
    public final zx1 b;
    public final rx1 c;
    public final rx1 d;
    public final rx1 e;
    public final c41 f;
    public final float g;

    public cy1(boolean z, zx1 zx1Var, rx1 rx1Var, rx1 rx1Var2, rx1 rx1Var3, c41 c41Var, float f) {
        this.a = z;
        this.b = zx1Var;
        this.c = rx1Var;
        this.d = rx1Var2;
        this.e = rx1Var3;
        this.f = c41Var;
        this.g = f;
    }

    public static int e(List list, int i, wa0 wa0Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (xi0.o(hk.C((pu0) obj7), "TextField")) {
                int iIntValue = ((Number) wa0Var.h(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (xi0.o(hk.C((pu0) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                pu0 pu0Var = (pu0) obj2;
                int iIntValue2 = pu0Var != null ? ((Number) wa0Var.h(pu0Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (xi0.o(hk.C((pu0) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                pu0 pu0Var2 = (pu0) obj3;
                int iIntValue3 = pu0Var2 != null ? ((Number) wa0Var.h(pu0Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (xi0.o(hk.C((pu0) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                pu0 pu0Var3 = (pu0) obj4;
                int iIntValue4 = pu0Var3 != null ? ((Number) wa0Var.h(pu0Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (xi0.o(hk.C((pu0) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                pu0 pu0Var4 = (pu0) obj5;
                int iIntValue5 = pu0Var4 != null ? ((Number) wa0Var.h(pu0Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (xi0.o(hk.C((pu0) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                pu0 pu0Var5 = (pu0) obj6;
                int iIntValue6 = pu0Var5 != null ? ((Number) wa0Var.h(pu0Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (xi0.o(hk.C((pu0) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                pu0 pu0Var6 = (pu0) obj;
                int i9 = iIntValue4 + iIntValue5;
                return lr.g(Math.max(iIntValue + i9, Math.max((pu0Var6 != null ? ((Number) wa0Var.h(pu0Var6, Integer.valueOf(i))).intValue() : 0) + i9, iIntValue2)) + iIntValue6 + iIntValue3, lr.b(0, 0, 0, 0, 15));
            }
        }
        vq0.b("Collection contains no element matching the predicate.");
        yc.j();
        return 0;
    }

    public static final int f(cy1 cy1Var, int i, int i2, z61 z61Var) {
        return cy1Var.a ? Math.round(((i - z61Var.f) / 2.0f) * 1.0f) : i2;
    }

    public final int a(pi0 pi0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        c41 c41Var = this.f;
        int iN = pi0Var.N(c41Var.c() + c41Var.d());
        int[] iArr = {i7, i5, i6, xk.B(f, i2, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i = Math.max(i, iArr[i9]);
        }
        return lr.f(Math.max(i3, Math.max(i4, iN + (i2 > 0 ? Math.max(pi0Var.N(this.g * 2.0f), xk.B(kw0.a.b(f), 0, i2)) : 0) + i)) + i8, j);
    }

    @Override // defpackage.uu0
    public final int b(pi0 pi0Var, List list, int i) {
        return c(pi0Var, list, i, new gi1(7));
    }

    public final int c(pi0 pi0Var, List list, int i, wa0 wa0Var) {
        Object obj;
        int i2;
        int iIntValue;
        int iU;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i3;
        Object obj5;
        int i4;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (xi0.o(hk.C((pu0) obj), "Leading")) {
                break;
            }
            i5++;
        }
        pu0 pu0Var = (pu0) obj;
        if (pu0Var != null) {
            i2 = i;
            iU = hk.U(i2, pu0Var.U(Integer.MAX_VALUE));
            iIntValue = ((Number) wa0Var.h(pu0Var, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            iIntValue = 0;
            iU = i2;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (xi0.o(hk.C((pu0) obj2), "Trailing")) {
                break;
            }
            i6++;
        }
        pu0 pu0Var2 = (pu0) obj2;
        if (pu0Var2 != null) {
            iU = hk.U(iU, pu0Var2.U(Integer.MAX_VALUE));
            iIntValue2 = ((Number) wa0Var.h(pu0Var2, Integer.valueOf(i2))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i7);
            if (xi0.o(hk.C((pu0) obj3), "Label")) {
                break;
            }
            i7++;
        }
        Object obj8 = (pu0) obj3;
        int iIntValue3 = obj8 != null ? ((Number) wa0Var.h(obj8, Integer.valueOf(iU))).intValue() : 0;
        int size4 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i8);
            if (xi0.o(hk.C((pu0) obj4), "Prefix")) {
                break;
            }
            i8++;
        }
        pu0 pu0Var3 = (pu0) obj4;
        if (pu0Var3 != null) {
            int iIntValue4 = ((Number) wa0Var.h(pu0Var3, Integer.valueOf(iU))).intValue();
            iU = hk.U(iU, pu0Var3.U(Integer.MAX_VALUE));
            i3 = iIntValue4;
        } else {
            i3 = 0;
        }
        int size5 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i9);
            if (xi0.o(hk.C((pu0) obj5), "Suffix")) {
                break;
            }
            i9++;
        }
        pu0 pu0Var4 = (pu0) obj5;
        if (pu0Var4 != null) {
            int iIntValue5 = ((Number) wa0Var.h(pu0Var4, Integer.valueOf(iU))).intValue();
            iU = hk.U(iU, pu0Var4.U(Integer.MAX_VALUE));
            i4 = iIntValue5;
        } else {
            i4 = 0;
        }
        int size6 = list.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj9 = list.get(i10);
            if (xi0.o(hk.C((pu0) obj9), "TextField")) {
                int iIntValue6 = ((Number) wa0Var.h(obj9, Integer.valueOf(iU))).intValue();
                int size7 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i11);
                    if (xi0.o(hk.C((pu0) obj6), "Hint")) {
                        break;
                    }
                    i11++;
                }
                Object obj10 = (pu0) obj6;
                int iIntValue7 = obj10 != null ? ((Number) wa0Var.h(obj10, Integer.valueOf(iU))).intValue() : 0;
                int size8 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i12);
                    if (xi0.o(hk.C((pu0) obj7), "Supporting")) {
                        break;
                    }
                    i12++;
                }
                Object obj11 = (pu0) obj7;
                return a(pi0Var, iIntValue6, iIntValue3, iIntValue, iIntValue2, i3, i4, iIntValue7, obj11 != null ? ((Number) wa0Var.h(obj11, Integer.valueOf(i2))).intValue() : 0, lr.b(0, 0, 0, 0, 15), this.c.a());
            }
        }
        vq0.b("Collection contains no element matching the predicate.");
        yc.j();
        return 0;
    }

    @Override // defpackage.uu0
    public final int d(pi0 pi0Var, List list, int i) {
        return e(list, i, new gi1(5));
    }

    @Override // defpackage.uu0
    public final vu0 g(final xu0 xu0Var, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        z61 z61VarE;
        Object obj4;
        int i2;
        z61 z61VarE2;
        Object obj5;
        int i3;
        Object obj6;
        Object obj7;
        z61 z61Var;
        int i4;
        int i5;
        int i6;
        int i7;
        z61 z61Var2;
        int i8;
        z61 z61Var3;
        int i9;
        z61 z61Var4;
        int i10;
        float f;
        z61 z61Var5;
        zc1 zc1Var;
        int i11;
        z61 z61Var6;
        z61 z61Var7;
        int i12;
        int i13;
        cy1 cy1Var;
        int i14;
        float fA = this.c.a();
        c41 c41Var = this.f;
        final int iN = xu0Var.N(c41Var.d());
        int iN2 = xu0Var.N(c41Var.c());
        long jA = kr.a(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i15);
            if (xi0.o(xi0.z((pu0) obj), "Leading")) {
                break;
            }
            i15++;
        }
        pu0 pu0Var = (pu0) obj;
        z61 z61VarE3 = pu0Var != null ? pu0Var.e(jA) : null;
        int i16 = z61VarE3 != null ? z61VarE3.e : 0;
        int iMax = Math.max(0, z61VarE3 != null ? z61VarE3.f : 0);
        int size2 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i17);
            if (xi0.o(xi0.z((pu0) obj2), "Trailing")) {
                break;
            }
            i17++;
        }
        pu0 pu0Var2 = (pu0) obj2;
        z61 z61VarE4 = pu0Var2 != null ? pu0Var2.e(lr.j(-i16, 0, 2, jA)) : null;
        int i18 = i16 + (z61VarE4 != null ? z61VarE4.e : 0);
        int iMax2 = Math.max(iMax, z61VarE4 != null ? z61VarE4.f : 0);
        int size3 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i19);
            if (xi0.o(xi0.z((pu0) obj3), "Prefix")) {
                break;
            }
            i19++;
        }
        pu0 pu0Var3 = (pu0) obj3;
        if (pu0Var3 != null) {
            i = i18;
            z61VarE = pu0Var3.e(lr.j(-i18, 0, 2, jA));
        } else {
            i = i18;
            z61VarE = null;
        }
        int i20 = (z61VarE != null ? z61VarE.e : 0) + i;
        int iMax3 = Math.max(iMax2, z61VarE != null ? z61VarE.f : 0);
        int size4 = list.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i21);
            if (xi0.o(xi0.z((pu0) obj4), "Suffix")) {
                break;
            }
            i21++;
        }
        pu0 pu0Var4 = (pu0) obj4;
        if (pu0Var4 != null) {
            i2 = i20;
            z61VarE2 = pu0Var4.e(lr.j(-i20, 0, 2, jA));
        } else {
            i2 = i20;
            z61VarE2 = null;
        }
        int i22 = i2 + (z61VarE2 != null ? z61VarE2.e : 0);
        int iMax4 = Math.max(iMax3, z61VarE2 != null ? z61VarE2.f : 0);
        int size5 = list.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i23);
            int i24 = size5;
            if (xi0.o(xi0.z((pu0) obj5), "Label")) {
                break;
            }
            i23++;
            size5 = i24;
        }
        pu0 pu0Var5 = (pu0) obj5;
        zc1 zc1Var2 = new zc1();
        int i25 = -i22;
        zc1Var2.e = pu0Var5 != null ? pu0Var5.e(lr.i(i25, -iN2, jA)) : null;
        int size6 = list.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size6) {
                i3 = iN2;
                obj6 = null;
                break;
            }
            obj6 = list.get(i26);
            i3 = iN2;
            if (xi0.o(xi0.z((pu0) obj6), "Supporting")) {
                break;
            }
            i26++;
            iN2 = i3;
        }
        pu0 pu0Var6 = (pu0) obj6;
        int iA0 = pu0Var6 != null ? pu0Var6.a0(kr.j(j)) : 0;
        z61 z61Var8 = (z61) zc1Var2.e;
        int i27 = iN + (z61Var8 != null ? z61Var8.f : 0);
        long jI = lr.i(i25, ((-i27) - i3) - iA0, kr.a(j, 0, 0, 0, 0, 11));
        int size7 = list.size();
        int i28 = 0;
        while (i28 < size7) {
            int i29 = i27;
            pu0 pu0Var7 = (pu0) list.get(i28);
            int i30 = size7;
            float f2 = fA;
            if (xi0.o(xi0.z(pu0Var7), "TextField")) {
                final z61 z61VarE5 = pu0Var7.e(jI);
                long jA2 = kr.a(jI, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i31 = 0;
                while (true) {
                    if (i31 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i31);
                    int i32 = size8;
                    int i33 = i31;
                    if (xi0.o(xi0.z((pu0) obj7), "Hint")) {
                        break;
                    }
                    i31 = i33 + 1;
                    size8 = i32;
                }
                pu0 pu0Var8 = (pu0) obj7;
                z61 z61VarE6 = pu0Var8 != null ? pu0Var8.e(jA2) : null;
                int iMax5 = Math.max(iMax4, Math.max(z61VarE5.f, z61VarE6 != null ? z61VarE6.f : 0) + i29 + i3);
                int i34 = z61VarE3 != null ? z61VarE3.e : 0;
                int i35 = z61VarE4 != null ? z61VarE4.e : 0;
                int i36 = z61VarE != null ? z61VarE.e : 0;
                int i37 = z61VarE2 != null ? z61VarE2.e : 0;
                int i38 = i35;
                int i39 = z61VarE5.e;
                z61 z61Var9 = (z61) zc1Var2.e;
                int i40 = i36 + i37;
                int iG = lr.g(Math.max(i39 + i40, Math.max((z61VarE6 != null ? z61VarE6.e : 0) + i40, z61Var9 != null ? z61Var9.e : 0)) + i34 + i38, j);
                z61 z61VarE7 = pu0Var6 != null ? pu0Var6.e(kr.a(lr.j(0, -iMax5, 1, jA), 0, iG, 0, 0, 9)) : null;
                int i41 = z61VarE7 != null ? z61VarE7.f : 0;
                int i42 = z61VarE5.f;
                z61 z61Var10 = (z61) zc1Var2.e;
                int i43 = z61Var10 != null ? z61Var10.f : 0;
                int i44 = z61VarE3 != null ? z61VarE3.f : 0;
                if (z61VarE4 != null) {
                    z61Var = z61VarE3;
                    i4 = i43;
                    i5 = z61VarE4.f;
                } else {
                    z61Var = z61VarE3;
                    i4 = i43;
                    i5 = 0;
                }
                if (z61VarE != null) {
                    i6 = i44;
                    i7 = z61VarE.f;
                } else {
                    i6 = i44;
                    i7 = 0;
                }
                final z61 z61Var11 = z61VarE4;
                if (z61VarE2 != null) {
                    z61 z61Var12 = z61VarE;
                    i8 = z61VarE2.f;
                    z61Var2 = z61Var12;
                } else {
                    z61Var2 = z61VarE;
                    i8 = 0;
                }
                final z61 z61Var13 = z61Var2;
                if (z61VarE6 != null) {
                    z61 z61Var14 = z61Var;
                    i9 = z61VarE6.f;
                    z61Var3 = z61Var14;
                } else {
                    z61Var3 = z61Var;
                    i9 = 0;
                }
                if (z61VarE7 != null) {
                    z61Var5 = z61Var3;
                    z61Var4 = z61VarE2;
                    i10 = i6;
                    f = f2;
                    zc1Var = zc1Var2;
                    i11 = z61VarE7.f;
                    z61Var6 = z61VarE6;
                    z61Var7 = z61VarE7;
                    i12 = iG;
                    i13 = 0;
                    i14 = i42;
                    cy1Var = this;
                } else {
                    z61Var4 = z61VarE2;
                    i10 = i6;
                    f = f2;
                    z61Var5 = z61Var3;
                    zc1Var = zc1Var2;
                    i11 = 0;
                    z61Var6 = z61VarE6;
                    z61Var7 = z61VarE7;
                    i12 = iG;
                    i13 = 0;
                    cy1Var = this;
                    i14 = i42;
                }
                final int iA = cy1Var.a(xu0Var, i14, i4, i10, i5, i7, i8, i9, i11, j, f);
                final int i45 = iA - i41;
                int size9 = list.size();
                int i46 = i13;
                while (i46 < size9) {
                    pu0 pu0Var9 = (pu0) list.get(i46);
                    if (xi0.o(xi0.z(pu0Var9), "Container")) {
                        final z61 z61VarE8 = pu0Var9.e(lr.a(i12 != Integer.MAX_VALUE ? i12 : i13, i12, i45 != Integer.MAX_VALUE ? i45 : i13, i45));
                        final int i47 = i12;
                        final z61 z61Var15 = z61Var5;
                        final zc1 zc1Var3 = zc1Var;
                        final z61 z61Var16 = z61Var6;
                        final z61 z61Var17 = z61Var7;
                        final float f3 = f;
                        final z61 z61Var18 = z61Var4;
                        return xu0Var.f0(i47, iA, g40.e, new sa0() { // from class: by1
                            /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
                            /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
                            /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
                            /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
                            /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
                            /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
                            /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
                            /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
                            /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
                            /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
                            /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
                            /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
                            /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
                            /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
                            /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
                            /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
                            /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
                            /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
                            /* JADX WARN: Removed duplicated region for block: B:60:0x012a  */
                            /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
                            /* JADX WARN: Removed duplicated region for block: B:67:0x0159  */
                            @Override // defpackage.sa0
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object i(Object obj8) {
                                z61 z61Var19;
                                int i48;
                                int i49;
                                int iN3;
                                z61 z61Var20;
                                int i50;
                                sf sfVar;
                                z61 z61Var21;
                                int i51;
                                cy1 cy1Var2 = this;
                                final rx1 rx1Var = cy1Var2.e;
                                final rx1 rx1Var2 = cy1Var2.d;
                                y61 y61Var = (y61) obj8;
                                zc1 zc1Var4 = zc1Var3;
                                Object obj9 = zc1Var4.e;
                                int i52 = i47;
                                int i53 = iA;
                                z61 z61Var22 = z61VarE5;
                                z61 z61Var23 = z61Var16;
                                z61 z61Var24 = z61Var15;
                                z61 z61Var25 = z61Var11;
                                z61 z61Var26 = z61Var13;
                                z61 z61Var27 = z61Var18;
                                z61 z61Var28 = z61VarE8;
                                z61 z61Var29 = z61Var17;
                                if (obj9 != null) {
                                    boolean z = cy1Var2.a;
                                    int i54 = iN;
                                    if (z) {
                                        i49 = i53;
                                        iN3 = Math.round(((i45 - ((z61) obj9).f) / 2.0f) * 1.0f);
                                    } else {
                                        i49 = i53;
                                        iN3 = y61Var.N(cy1Var2.g) + i54;
                                    }
                                    z61 z61Var30 = (z61) zc1Var4.e;
                                    int i55 = z61Var30.f + i54;
                                    al0 layoutDirection = xu0Var.getLayoutDirection();
                                    zx1 zx1Var = cy1Var2.b;
                                    y61Var.g(z61Var28, 0, 0, 0.0f);
                                    int i56 = i49 - (z61Var29 != null ? z61Var29.f : 0);
                                    if (z61Var24 != null) {
                                        z61Var20 = z61Var29;
                                        y61.j(y61Var, z61Var24, 0, Math.round(((i56 - z61Var24.f) / 2.0f) * 1.0f));
                                    } else {
                                        z61Var20 = z61Var29;
                                    }
                                    float f4 = f3;
                                    int iB = xk.B(f4, iN3, i54);
                                    if (layoutDirection == al0.e) {
                                        i50 = z61Var24 != null ? z61Var24.e : 0;
                                        int i57 = i50;
                                        int iA2 = zx1Var.b.a(z61Var30.e, (i52 - (z61Var24 == null ? z61Var24.e : 0)) - (z61Var25 == null ? z61Var25.e : 0), layoutDirection) + i57;
                                        if (zx1Var instanceof zx1) {
                                            yc.n(zx1Var, "Unknown position: ");
                                            sfVar = null;
                                        } else {
                                            sfVar = zx1Var.a;
                                        }
                                        y61Var.g(z61Var30, xk.B(f4, iA2, sfVar.a(z61Var30.e, (i52 - (z61Var24 == null ? z61Var24.e : 0)) - (z61Var25 == null ? z61Var25.e : 0), layoutDirection) + i57), iB, 0.0f);
                                        if (z61Var26 == null) {
                                            final int i58 = 1;
                                            z61Var21 = z61Var26;
                                            i51 = i55;
                                            y61.k(y61Var, z61Var21, z61Var24 != null ? z61Var24.e : 0, i51, new sa0() { // from class: ay1
                                                @Override // defpackage.sa0
                                                public final Object i(Object obj10) {
                                                    int i59 = i58;
                                                    t32 t32Var = t32.a;
                                                    rx1 rx1Var3 = rx1Var;
                                                    ue1 ue1Var = (ue1) obj10;
                                                    switch (i59) {
                                                        case 0:
                                                            ue1Var.c(rx1Var3.a());
                                                            break;
                                                        case 1:
                                                            ue1Var.c(rx1Var3.a());
                                                            break;
                                                        case t91.FLOAT_FIELD_NUMBER /* 2 */:
                                                            ue1Var.c(rx1Var3.a());
                                                            break;
                                                        case t91.INTEGER_FIELD_NUMBER /* 3 */:
                                                            ue1Var.c(rx1Var3.a());
                                                            break;
                                                        case t91.LONG_FIELD_NUMBER /* 4 */:
                                                            ue1Var.c(rx1Var3.a());
                                                            break;
                                                        default:
                                                            ue1Var.c(rx1Var3.a());
                                                            break;
                                                    }
                                                    return t32Var;
                                                }
                                            }, 4);
                                        } else {
                                            z61Var21 = z61Var26;
                                            i51 = i55;
                                        }
                                        int i59 = (z61Var24 == null ? z61Var24.e : 0) + (z61Var21 == null ? z61Var21.e : 0);
                                        y61.j(y61Var, z61Var22, i59, i51);
                                        if (z61Var23 != null) {
                                            final int i60 = 2;
                                            y61.k(y61Var, z61Var23, i59, i51, new sa0() { // from class: ay1
                                                @Override // defpackage.sa0
                                                public final Object i(Object obj10) {
                                                    int i592 = i60;
                                                    t32 t32Var = t32.a;
                                                    rx1 rx1Var3 = rx1Var2;
                                                    ue1 ue1Var = (ue1) obj10;
                                                    switch (i592) {
                                                        case 0:
                                                            ue1Var.c(rx1Var3.a());
                                                            break;
                                                        case 1:
                                                            ue1Var.c(rx1Var3.a());
                                                            break;
                                                        case t91.FLOAT_FIELD_NUMBER /* 2 */:
                                                            ue1Var.c(rx1Var3.a());
                                                            break;
                                                        case t91.INTEGER_FIELD_NUMBER /* 3 */:
                                                            ue1Var.c(rx1Var3.a());
                                                            break;
                                                        case t91.LONG_FIELD_NUMBER /* 4 */:
                                                            ue1Var.c(rx1Var3.a());
                                                            break;
                                                        default:
                                                            ue1Var.c(rx1Var3.a());
                                                            break;
                                                    }
                                                    return t32Var;
                                                }
                                            }, 4);
                                        }
                                        if (z61Var27 != null) {
                                            final int i61 = 3;
                                            y61.k(y61Var, z61Var27, (i52 - (z61Var25 != null ? z61Var25.e : 0)) - z61Var27.e, i51, new sa0() { // from class: ay1
                                                @Override // defpackage.sa0
                                                public final Object i(Object obj10) {
                                                    int i592 = i61;
                                                    t32 t32Var = t32.a;
                                                    rx1 rx1Var3 = rx1Var;
                                                    ue1 ue1Var = (ue1) obj10;
                                                    switch (i592) {
                                                        case 0:
                                                            ue1Var.c(rx1Var3.a());
                                                            break;
                                                        case 1:
                                                            ue1Var.c(rx1Var3.a());
                                                            break;
                                                        case t91.FLOAT_FIELD_NUMBER /* 2 */:
                                                            ue1Var.c(rx1Var3.a());
                                                            break;
                                                        case t91.INTEGER_FIELD_NUMBER /* 3 */:
                                                            ue1Var.c(rx1Var3.a());
                                                            break;
                                                        case t91.LONG_FIELD_NUMBER /* 4 */:
                                                            ue1Var.c(rx1Var3.a());
                                                            break;
                                                        default:
                                                            ue1Var.c(rx1Var3.a());
                                                            break;
                                                    }
                                                    return t32Var;
                                                }
                                            }, 4);
                                        }
                                        if (z61Var25 != null) {
                                            y61.j(y61Var, z61Var25, i52 - z61Var25.e, Math.round(((i56 - z61Var25.f) / 2.0f) * 1.0f));
                                        }
                                        if (z61Var20 != null) {
                                            y61.j(y61Var, z61Var20, 0, i56);
                                        }
                                    } else {
                                        if (z61Var25 != null) {
                                            i50 = z61Var25.e;
                                        }
                                        int i572 = i50;
                                        int iA22 = zx1Var.b.a(z61Var30.e, (i52 - (z61Var24 == null ? z61Var24.e : 0)) - (z61Var25 == null ? z61Var25.e : 0), layoutDirection) + i572;
                                        if (zx1Var instanceof zx1) {
                                        }
                                        y61Var.g(z61Var30, xk.B(f4, iA22, sfVar.a(z61Var30.e, (i52 - (z61Var24 == null ? z61Var24.e : 0)) - (z61Var25 == null ? z61Var25.e : 0), layoutDirection) + i572), iB, 0.0f);
                                        if (z61Var26 == null) {
                                        }
                                        int i592 = (z61Var24 == null ? z61Var24.e : 0) + (z61Var21 == null ? z61Var21.e : 0);
                                        y61.j(y61Var, z61Var22, i592, i51);
                                        if (z61Var23 != null) {
                                        }
                                        if (z61Var27 != null) {
                                        }
                                        if (z61Var25 != null) {
                                        }
                                        if (z61Var20 != null) {
                                        }
                                    }
                                } else {
                                    float fB = y61Var.b();
                                    y61.i(y61Var, z61Var28, 0L);
                                    int i62 = i53 - (z61Var29 != null ? z61Var29.f : 0);
                                    int I = nu0.I(cy1Var2.f.d() * fB);
                                    if (z61Var24 != null) {
                                        y61.j(y61Var, z61Var24, 0, Math.round(((i62 - z61Var24.f) / 2.0f) * 1.0f));
                                    }
                                    if (z61Var26 != null) {
                                        int i63 = z61Var24 != null ? z61Var24.e : 0;
                                        int iF = cy1.f(cy1Var2, i62, I, z61Var26);
                                        final int i64 = 4;
                                        sa0 sa0Var = new sa0() { // from class: ay1
                                            @Override // defpackage.sa0
                                            public final Object i(Object obj10) {
                                                int i5922 = i64;
                                                t32 t32Var = t32.a;
                                                rx1 rx1Var3 = rx1Var;
                                                ue1 ue1Var = (ue1) obj10;
                                                switch (i5922) {
                                                    case 0:
                                                        ue1Var.c(rx1Var3.a());
                                                        break;
                                                    case 1:
                                                        ue1Var.c(rx1Var3.a());
                                                        break;
                                                    case t91.FLOAT_FIELD_NUMBER /* 2 */:
                                                        ue1Var.c(rx1Var3.a());
                                                        break;
                                                    case t91.INTEGER_FIELD_NUMBER /* 3 */:
                                                        ue1Var.c(rx1Var3.a());
                                                        break;
                                                    case t91.LONG_FIELD_NUMBER /* 4 */:
                                                        ue1Var.c(rx1Var3.a());
                                                        break;
                                                    default:
                                                        ue1Var.c(rx1Var3.a());
                                                        break;
                                                }
                                                return t32Var;
                                            }
                                        };
                                        z61Var19 = z61Var29;
                                        i48 = I;
                                        y61Var = y61Var;
                                        y61.k(y61Var, z61Var26, i63, iF, sa0Var, 4);
                                    } else {
                                        z61Var19 = z61Var29;
                                        i48 = I;
                                    }
                                    int i65 = (z61Var24 != null ? z61Var24.e : 0) + (z61Var26 != null ? z61Var26.e : 0);
                                    y61.j(y61Var, z61Var22, i65, cy1.f(cy1Var2, i62, i48, z61Var22));
                                    if (z61Var23 != null) {
                                        final int i66 = 5;
                                        y61.k(y61Var, z61Var23, i65, cy1.f(cy1Var2, i62, i48, z61Var23), new sa0() { // from class: ay1
                                            @Override // defpackage.sa0
                                            public final Object i(Object obj10) {
                                                int i5922 = i66;
                                                t32 t32Var = t32.a;
                                                rx1 rx1Var3 = rx1Var2;
                                                ue1 ue1Var = (ue1) obj10;
                                                switch (i5922) {
                                                    case 0:
                                                        ue1Var.c(rx1Var3.a());
                                                        break;
                                                    case 1:
                                                        ue1Var.c(rx1Var3.a());
                                                        break;
                                                    case t91.FLOAT_FIELD_NUMBER /* 2 */:
                                                        ue1Var.c(rx1Var3.a());
                                                        break;
                                                    case t91.INTEGER_FIELD_NUMBER /* 3 */:
                                                        ue1Var.c(rx1Var3.a());
                                                        break;
                                                    case t91.LONG_FIELD_NUMBER /* 4 */:
                                                        ue1Var.c(rx1Var3.a());
                                                        break;
                                                    default:
                                                        ue1Var.c(rx1Var3.a());
                                                        break;
                                                }
                                                return t32Var;
                                            }
                                        }, 4);
                                    }
                                    if (z61Var27 != null) {
                                        final int i67 = 0;
                                        y61.k(y61Var, z61Var27, (i52 - (z61Var25 != null ? z61Var25.e : 0)) - z61Var27.e, cy1.f(cy1Var2, i62, i48, z61Var27), new sa0() { // from class: ay1
                                            @Override // defpackage.sa0
                                            public final Object i(Object obj10) {
                                                int i5922 = i67;
                                                t32 t32Var = t32.a;
                                                rx1 rx1Var3 = rx1Var;
                                                ue1 ue1Var = (ue1) obj10;
                                                switch (i5922) {
                                                    case 0:
                                                        ue1Var.c(rx1Var3.a());
                                                        break;
                                                    case 1:
                                                        ue1Var.c(rx1Var3.a());
                                                        break;
                                                    case t91.FLOAT_FIELD_NUMBER /* 2 */:
                                                        ue1Var.c(rx1Var3.a());
                                                        break;
                                                    case t91.INTEGER_FIELD_NUMBER /* 3 */:
                                                        ue1Var.c(rx1Var3.a());
                                                        break;
                                                    case t91.LONG_FIELD_NUMBER /* 4 */:
                                                        ue1Var.c(rx1Var3.a());
                                                        break;
                                                    default:
                                                        ue1Var.c(rx1Var3.a());
                                                        break;
                                                }
                                                return t32Var;
                                            }
                                        }, 4);
                                    }
                                    if (z61Var25 != null) {
                                        y61.j(y61Var, z61Var25, i52 - z61Var25.e, Math.round(((i62 - z61Var25.f) / 2.0f) * 1.0f));
                                    }
                                    if (z61Var19 != null) {
                                        y61.j(y61Var, z61Var19, 0, i62);
                                    }
                                }
                                return t32.a;
                            }
                        });
                    }
                    i46++;
                    i45 = i45;
                }
                vq0.b("Collection contains no element matching the predicate.");
                yc.j();
                return null;
            }
            fA = f2;
            i28++;
            size7 = i30;
            i27 = i29;
            z61VarE3 = z61VarE3;
            jI = jI;
        }
        vq0.b("Collection contains no element matching the predicate.");
        yc.j();
        return null;
    }

    @Override // defpackage.uu0
    public final int h(pi0 pi0Var, List list, int i) {
        return c(pi0Var, list, i, new gi1(6));
    }

    @Override // defpackage.uu0
    public final int j(pi0 pi0Var, List list, int i) {
        return e(list, i, new gi1(4));
    }
}
