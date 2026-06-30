package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xz0 {
    public final ql0 a;
    public final wz0 b;
    public final tg0 c;
    public c01 d;
    public final nv1 e;
    public sv0 f;
    public iy0 g;
    public iy0 h;
    public final iy0 i;
    public vz0 j;

    public xz0(ql0 ql0Var) {
        this.a = ql0Var;
        wz0 wz0Var = new wz0();
        wz0Var.h = -1;
        this.b = wz0Var;
        tg0 tg0Var = new tg0(ql0Var);
        this.c = tg0Var;
        this.d = tg0Var;
        nv1 nv1Var = tg0Var.Z;
        this.e = nv1Var;
        this.f = nv1Var;
        this.i = new iy0(new tv0[16]);
    }

    public static final void a(xz0 xz0Var, sv0 sv0Var, c01 c01Var) {
        for (sv0 sv0Var2 = sv0Var.i; sv0Var2 != null; sv0Var2 = sv0Var2.i) {
            if (sv0Var2 == xz0Var.b) {
                ql0 ql0VarU = xz0Var.a.u();
                c01Var.y = ql0VarU != null ? ql0VarU.I.c : null;
                xz0Var.d = c01Var;
                return;
            } else {
                if ((sv0Var2.g & 2) != 0) {
                    return;
                }
                sv0Var2.K0(c01Var);
            }
        }
    }

    public static sv0 b(rv0 rv0Var, sv0 sv0Var) {
        sv0 sv0VarD;
        if (rv0Var instanceof xv0) {
            sv0VarD = ((xv0) rv0Var).d();
            sv0VarD.g = d01.f(sv0VarD);
        } else {
            xe xeVar = new xe();
            xeVar.g = d01.d(rv0Var);
            xeVar.s = rv0Var;
            new HashSet();
            sv0VarD = xeVar;
        }
        if (sv0VarD.r) {
            ng0.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        sv0VarD.m = true;
        sv0 sv0Var2 = sv0Var.j;
        if (sv0Var2 != null) {
            sv0Var2.i = sv0VarD;
            sv0VarD.j = sv0Var2;
        }
        sv0Var.j = sv0VarD;
        sv0VarD.i = sv0Var;
        return sv0VarD;
    }

    public static sv0 c(sv0 sv0Var) {
        boolean z = sv0Var.r;
        if (z) {
            ox0 ox0Var = d01.a;
            if (!z) {
                ng0.b("autoInvalidateRemovedNode called on unattached node");
            }
            d01.a(sv0Var, -1, 2);
            sv0Var.I0();
            sv0Var.C0();
        }
        sv0 sv0Var2 = sv0Var.j;
        sv0 sv0Var3 = sv0Var.i;
        if (sv0Var2 != null) {
            sv0Var2.i = sv0Var3;
            sv0Var.j = null;
        }
        if (sv0Var3 != null) {
            sv0Var3.j = sv0Var2;
            sv0Var.i = null;
        }
        sv0Var3.getClass();
        return sv0Var3;
    }

    public static void h(rv0 rv0Var, rv0 rv0Var2, sv0 sv0Var) {
        if ((rv0Var instanceof xv0) && (rv0Var2 instanceof xv0)) {
            sv0Var.getClass();
            ((xv0) rv0Var2).f(sv0Var);
            if (sv0Var.r) {
                d01.c(sv0Var);
                return;
            } else {
                sv0Var.n = true;
                return;
            }
        }
        if (!(sv0Var instanceof xe)) {
            ng0.b("Unknown Modifier.Node type");
            return;
        }
        xe xeVar = (xe) sv0Var;
        boolean z = xeVar.r;
        if (z) {
            if (!z) {
                ng0.b("unInitializeModifier called on unattached node");
            }
            if ((xeVar.g & 8) != 0) {
                ((h4) bl.Q(xeVar)).w();
            }
        }
        xeVar.s = rv0Var2;
        xeVar.g = d01.d(rv0Var2);
        if (xeVar.r) {
            xeVar.L0(false);
        }
        if (sv0Var.r) {
            d01.c(sv0Var);
        } else {
            sv0Var.n = true;
        }
    }

    public final boolean d(int i) {
        return (this.f.h & i) != 0;
    }

    public final void e() {
        for (sv0 sv0Var = this.f; sv0Var != null; sv0Var = sv0Var.j) {
            sv0Var.H0();
            if (sv0Var.m) {
                ox0 ox0Var = d01.a;
                if (!sv0Var.r) {
                    ng0.b("autoInvalidateInsertedNode called on unattached node");
                }
                d01.a(sv0Var, -1, 1);
            }
            if (sv0Var.n) {
                d01.c(sv0Var);
            }
            sv0Var.m = false;
            sv0Var.n = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0262, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0268, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0148, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014e, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0150, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0152, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0154, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0155, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015b, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0169, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016c, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016e, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0177, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0179, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0180, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0186, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018b, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018d, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018f, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0192, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0194, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019e, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a0, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a2, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ae, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b0, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b7, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bb, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bf, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c1, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c3, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c5, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cb, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cd, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i, iy0 iy0Var, iy0 iy0Var2, sv0 sv0Var, boolean z) {
        int i2;
        iy0 iy0Var3;
        iy0 iy0Var4;
        int i3;
        int[] iArr;
        int[] iArr2;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        vz0 vz0Var = this.j;
        if (vz0Var == null) {
            i2 = i;
            iy0Var3 = iy0Var;
            iy0Var4 = iy0Var2;
            vz0Var = new vz0(this, sv0Var, i2, iy0Var3, iy0Var4, z);
            this.j = vz0Var;
        } else {
            i2 = i;
            iy0Var3 = iy0Var;
            iy0Var4 = iy0Var2;
            vz0Var.a = sv0Var;
            vz0Var.b = i2;
            vz0Var.c = iy0Var3;
            vz0Var.d = iy0Var4;
            vz0Var.e = z;
        }
        xz0 xz0Var = vz0Var.f;
        int i9 = iy0Var3.g - i2;
        int i10 = iy0Var4.g - i2;
        char c3 = 2;
        int i11 = ((i9 + i10) + 1) / 2;
        wh0 wh0Var = new wh0(i11 * 3);
        wh0 wh0Var2 = new wh0(i11 * 4);
        int i12 = 0;
        wh0Var2.e(0, i9, 0, i10);
        int i13 = (i11 * 2) + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[5];
        while (true) {
            int i14 = wh0Var2.b;
            if (i14 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = wh0Var2.a;
            int i15 = i12;
            int i16 = i14 - 1;
            wh0Var2.b = i16;
            int i17 = iArr6[i16];
            int i18 = i14 - 2;
            wh0Var2.b = i18;
            int i19 = iArr6[i18];
            int i20 = i14 - 3;
            wh0Var2.b = i20;
            int i21 = iArr6[i20];
            int i22 = i14 - 4;
            wh0Var2.b = i22;
            int i23 = iArr6[i22];
            int i24 = i21 - i23;
            int i25 = i13;
            int i26 = i17 - i19;
            int[] iArr7 = iArr3;
            if (i24 < 1 || i26 < 1) {
                iArr = iArr4;
                iArr2 = iArr5;
            } else {
                int i27 = 1;
                int i28 = ((i24 + i26) + 1) / 2;
                int i29 = i25 / 2;
                int i30 = i29 + 1;
                iArr7[i30] = i23;
                iArr4[i30] = i21;
                int i31 = i15;
                while (i31 < i28) {
                    int i32 = i24 - i26;
                    int i33 = i28;
                    iArr = iArr4;
                    int i34 = -i31;
                    int i35 = (Math.abs(i32) & 1) == i27 ? 1 : i15;
                    int i36 = i34;
                    while (true) {
                        if (i36 > i31) {
                            break;
                        }
                        if (i36 != i34) {
                            if (i36 != i31) {
                                i4 = i36;
                                iArr2 = iArr5;
                                if (iArr7[i36 + 1 + i29] > iArr7[(i4 - 1) + i29]) {
                                }
                                int i37 = ((i6 - i23) + i19) - i4;
                                int i38 = i37 - ((i31 != 0 ? 1 : i15) & (i6 == i5 ? 1 : i15));
                                int i39 = i5;
                                i7 = i37;
                                while (i6 < i21 && i7 < i17 && vz0Var.a(i6, i7)) {
                                    i6++;
                                    i7++;
                                }
                                iArr7[i29 + i4] = i6;
                                if (i35 != 0) {
                                    int i40 = i7;
                                    int i41 = i32 - i4;
                                    i8 = i24;
                                    if (i41 >= i34 + 1 && i41 <= i31 - 1 && iArr[i29 + i41] <= i6) {
                                        iArr2[i15] = i39;
                                        iArr2[1] = i38;
                                        iArr2[c4] = i6;
                                        iArr2[3] = i40;
                                        iArr2[4] = i15;
                                        c = 1;
                                        break;
                                    }
                                } else {
                                    i8 = i24;
                                }
                                i36 = i4 + 2;
                                iArr5 = iArr2;
                                i24 = i8;
                            } else {
                                i4 = i36;
                                iArr2 = iArr5;
                            }
                            i5 = iArr7[(i4 - 1) + i29];
                            i6 = i5 + 1;
                            int i372 = ((i6 - i23) + i19) - i4;
                            int i382 = i372 - ((i31 != 0 ? 1 : i15) & (i6 == i5 ? 1 : i15));
                            int i392 = i5;
                            i7 = i372;
                            while (i6 < i21) {
                                i6++;
                                i7++;
                            }
                            iArr7[i29 + i4] = i6;
                            if (i35 != 0) {
                            }
                            i36 = i4 + 2;
                            iArr5 = iArr2;
                            i24 = i8;
                        } else {
                            i4 = i36;
                            iArr2 = iArr5;
                        }
                        i5 = iArr7[i4 + 1 + i29];
                        i6 = i5;
                        int i3722 = ((i6 - i23) + i19) - i4;
                        int i3822 = i3722 - ((i31 != 0 ? 1 : i15) & (i6 == i5 ? 1 : i15));
                        int i3922 = i5;
                        i7 = i3722;
                        while (i6 < i21) {
                        }
                        iArr7[i29 + i4] = i6;
                        if (i35 != 0) {
                        }
                        i36 = i4 + 2;
                        iArr5 = iArr2;
                        i24 = i8;
                    }
                    if (Math.min(iArr2[c4] - iArr2[i15], iArr2[3] - iArr2[c]) > 0) {
                        int i42 = iArr2[i15];
                        int i43 = iArr2[c];
                        int i44 = iArr2[3] - i43;
                        int iMin = iArr2[c4] - i42;
                        if (i44 != iMin) {
                            iMin = Math.min(iMin, i44);
                            int i45 = iArr2[4];
                            int i46 = i45 != 0 ? 1 : i15;
                            int i47 = iArr2[3];
                            c2 = 1;
                            int i48 = iArr2[1];
                            int i49 = i47 - i48;
                            int i50 = iArr2[c4];
                            int i51 = iArr2[i15];
                            int i52 = i42 + (((i49 > i50 - i51 ? 1 : i15) | i46) ^ 1);
                            i43 += (((i47 - i48 > i50 - i51 ? 1 : i15) ^ 1) | (i45 != 0 ? 1 : i15)) ^ 1;
                            i42 = i52;
                        } else {
                            c2 = 1;
                        }
                        wh0Var.d(i42, i43, iMin);
                    } else {
                        c2 = c;
                    }
                    wh0Var2.e(i23, iArr2[i15], i19, iArr2[c2]);
                    wh0Var2.e(iArr2[c4], i21, iArr2[3], i17);
                }
                iArr = iArr4;
                iArr2 = iArr5;
            }
            c3 = c4;
            i12 = i15;
            i13 = i25;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i53 = i12;
        int i54 = wh0Var.b;
        if (i54 % 3 != 0) {
            ng0.b("Array size not a multiple of 3");
        }
        if (i54 > 3) {
            i3 = i53;
            wh0Var.f(i3, i54 - 3);
        } else {
            i3 = i53;
        }
        wh0Var.d(i9, i10, i3);
        int i55 = i3;
        int i56 = i55;
        int i57 = i56;
        while (i55 < wh0Var.b) {
            int[] iArr8 = wh0Var.a;
            int i58 = iArr8[i55];
            int i59 = iArr8[i55 + 2];
            int i60 = i58 - i59;
            int i61 = iArr8[i55 + 1] - i59;
            i55 += 3;
            while (i56 < i60) {
                sv0 sv0Var2 = vz0Var.a.j;
                sv0Var2.getClass();
                if ((sv0Var2.g & 2) != 0) {
                    c01 c01Var = sv0Var2.l;
                    c01Var.getClass();
                    c01 c01Var2 = c01Var.y;
                    c01 c01Var3 = c01Var.x;
                    c01Var3.getClass();
                    if (c01Var2 != null) {
                        c01Var2.x = c01Var3;
                    }
                    c01Var3.y = c01Var2;
                    a(xz0Var, vz0Var.a, c01Var3);
                }
                vz0Var.a = c(sv0Var2);
                i56++;
            }
            while (i57 < i61) {
                sv0 sv0VarB = b((rv0) vz0Var.d.e[vz0Var.b + i57], vz0Var.a);
                vz0Var.a = sv0VarB;
                if (vz0Var.e) {
                    sv0 sv0Var3 = sv0VarB.j;
                    sv0Var3.getClass();
                    c01 c01Var4 = sv0Var3.l;
                    c01Var4.getClass();
                    il0 il0VarO = bl.o(vz0Var.a);
                    if (il0VarO != null) {
                        kl0 kl0Var = new kl0(xz0Var.a, il0VarO);
                        vz0Var.a.K0(kl0Var);
                        a(xz0Var, vz0Var.a, kl0Var);
                        kl0Var.y = c01Var4.y;
                        kl0Var.x = c01Var4;
                        c01Var4.y = kl0Var;
                    } else {
                        vz0Var.a.K0(c01Var4);
                    }
                    vz0Var.a.B0();
                    vz0Var.a.H0();
                    sv0 sv0Var4 = vz0Var.a;
                    ox0 ox0Var = d01.a;
                    if (!sv0Var4.r) {
                        ng0.b("autoInvalidateInsertedNode called on unattached node");
                    }
                    d01.a(sv0Var4, -1, 1);
                } else {
                    sv0VarB.m = true;
                }
                i57++;
            }
            while (true) {
                int i62 = i59 - 1;
                if (i59 > 0) {
                    sv0 sv0Var5 = vz0Var.a.j;
                    sv0Var5.getClass();
                    vz0Var.a = sv0Var5;
                    iy0 iy0Var5 = vz0Var.c;
                    int i63 = vz0Var.b;
                    rv0 rv0Var = (rv0) iy0Var5.e[i63 + i56];
                    rv0 rv0Var2 = (rv0) vz0Var.d.e[i63 + i57];
                    if (!xi0.o(rv0Var, rv0Var2)) {
                        h(rv0Var, rv0Var2, vz0Var.a);
                    }
                    i56++;
                    i57++;
                    i59 = i62;
                }
            }
        }
        int i64 = i3;
        for (sv0 sv0Var6 = this.e.i; sv0Var6 != null && sv0Var6 != this.b; sv0Var6 = sv0Var6.i) {
            i64 |= sv0Var6.g;
            sv0Var6.h = i64;
        }
    }

    public final void g() {
        ql0 ql0Var;
        kl0 kl0Var;
        v31 v31Var;
        sv0 sv0Var = this.e.i;
        c01 c01Var = this.c;
        while (true) {
            ql0Var = this.a;
            if (sv0Var == null) {
                break;
            }
            il0 il0VarO = bl.o(sv0Var);
            if (il0VarO != null) {
                c01 c01Var2 = sv0Var.l;
                if (c01Var2 != null) {
                    kl0Var = (kl0) c01Var2;
                    il0 il0Var = kl0Var.Z;
                    kl0Var.y1(il0VarO);
                    if (il0Var != sv0Var && (v31Var = kl0Var.T) != null) {
                        ((qc0) v31Var).c();
                    }
                } else {
                    kl0Var = new kl0(ql0Var, il0VarO);
                    sv0Var.K0(kl0Var);
                }
                c01Var.y = kl0Var;
                kl0Var.x = c01Var;
                c01Var = kl0Var;
            } else {
                sv0Var.K0(c01Var);
            }
            sv0Var = sv0Var.i;
        }
        ql0 ql0VarU = ql0Var.u();
        c01Var.y = ql0VarU != null ? ql0VarU.I.c : null;
        this.d = c01Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sv0 sv0Var = this.f;
        nv1 nv1Var = this.e;
        if (sv0Var == nv1Var) {
            sb.append("]");
        } else {
            while (true) {
                if (sv0Var == null || sv0Var == nv1Var) {
                    break;
                }
                sb.append(String.valueOf(sv0Var));
                if (sv0Var.j == nv1Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                sv0Var = sv0Var.j;
            }
        }
        return sb.toString();
    }
}
