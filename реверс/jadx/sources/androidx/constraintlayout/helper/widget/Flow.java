package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p093v.C1062c;
import p093v.C1063d;
import p093v.C1064e;
import p093v.C1065f;
import p093v.C1066g;
import p093v.C1067h;
import p095w.C1076b;
import p099y.AbstractC1115r;
import p099y.AbstractC1117t;
import p099y.C1103f;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends AbstractC1117t {

    /* JADX INFO: renamed from: j */
    public final C1066g f1418j;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4591a = new int[32];
        this.f4597g = new HashMap();
        this.f4593c = context;
        super.mo2737g(attributeSet);
        C1066g c1066g = new C1066g();
        c1066g.f4409s0 = 0;
        c1066g.f4410t0 = 0;
        c1066g.f4411u0 = 0;
        c1066g.f4412v0 = 0;
        c1066g.f4413w0 = 0;
        c1066g.f4414x0 = 0;
        c1066g.f4415y0 = false;
        c1066g.f4416z0 = 0;
        c1066g.f4381A0 = 0;
        c1066g.f4382B0 = new C1076b();
        c1066g.f4383C0 = null;
        c1066g.f4384D0 = -1;
        c1066g.f4385E0 = -1;
        c1066g.f4386F0 = -1;
        c1066g.f4387G0 = -1;
        c1066g.f4388H0 = -1;
        c1066g.f4389I0 = -1;
        c1066g.f4390J0 = 0.5f;
        c1066g.f4391K0 = 0.5f;
        c1066g.f4392L0 = 0.5f;
        c1066g.f4393M0 = 0.5f;
        c1066g.f4394N0 = 0.5f;
        c1066g.f4395O0 = 0.5f;
        c1066g.f4396P0 = 0;
        c1066g.f4397Q0 = 0;
        c1066g.f4398R0 = 2;
        c1066g.f4399S0 = 2;
        c1066g.f4400T0 = 0;
        c1066g.f4401U0 = -1;
        c1066g.f4402V0 = 0;
        c1066g.f4403W0 = new ArrayList();
        c1066g.f4404X0 = null;
        c1066g.f4405Y0 = null;
        c1066g.f4406Z0 = null;
        c1066g.f4408b1 = 0;
        this.f1418j = c1066g;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1115r.f4802b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f1418j.f4402V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C1066g c1066g2 = this.f1418j;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1066g2.f4409s0 = dimensionPixelSize;
                    c1066g2.f4410t0 = dimensionPixelSize;
                    c1066g2.f4411u0 = dimensionPixelSize;
                    c1066g2.f4412v0 = dimensionPixelSize;
                } else if (index == 18) {
                    C1066g c1066g3 = this.f1418j;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1066g3.f4411u0 = dimensionPixelSize2;
                    c1066g3.f4413w0 = dimensionPixelSize2;
                    c1066g3.f4414x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f1418j.f4412v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f1418j.f4413w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f1418j.f4409s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f1418j.f4414x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f1418j.f4410t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f1418j.f4400T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f1418j.f4384D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f1418j.f4385E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f1418j.f4386F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f1418j.f4388H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f1418j.f4387G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f1418j.f4389I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f1418j.f4390J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f1418j.f4392L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f1418j.f4394N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f1418j.f4393M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f1418j.f4395O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f1418j.f4391K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f1418j.f4398R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f1418j.f4399S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f1418j.f4396P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f1418j.f4397Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f1418j.f4401U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f4594d = this.f1418j;
        m2738i();
    }

    @Override // p099y.AbstractC1100c
    /* JADX INFO: renamed from: h */
    public final void mo1241h(C1063d c1063d, boolean z2) {
        C1066g c1066g = this.f1418j;
        int i2 = c1066g.f4411u0;
        if (i2 > 0 || c1066g.f4412v0 > 0) {
            if (z2) {
                c1066g.f4413w0 = c1066g.f4412v0;
                c1066g.f4414x0 = i2;
            } else {
                c1066g.f4413w0 = i2;
                c1066g.f4414x0 = c1066g.f4412v0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x00ce A[EDGE_INSN: B:425:0x00ce->B:59:0x00ce BREAK  A[LOOP:1: B:53:0x00ba->B:58:0x00ca], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0122  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:282:0x044f -> B:219:0x0396). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:283:0x0451 -> B:219:0x0396). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:285:0x0457 -> B:219:0x0396). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:286:0x0459 -> B:219:0x0396). Please report as a decompilation issue!!! */
    @Override // p099y.AbstractC1117t
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1242j(C1066g c1066g, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C1063d[] c1063dArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        C1065f c1065f;
        char c2;
        int i15;
        int i16;
        int i17;
        int iCeil;
        int iCeil2;
        Object obj;
        C1063d c1063d;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (c1066g == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (c1066g.f4424r0 <= 0) {
            int i23 = c1066g.f4413w0;
            int i24 = c1066g.f4414x0;
            int i25 = c1066g.f4409s0;
            int i26 = c1066g.f4410t0;
            int[] iArr2 = new int[2];
            int i27 = (size - i23) - i24;
            i4 = c1066g.f4402V0;
            if (i4 == 1) {
                i27 = (size2 - i25) - i26;
            }
            if (i4 != 0) {
                if (c1066g.f4384D0 == -1) {
                    c1066g.f4384D0 = 0;
                }
                if (c1066g.f4385E0 == -1) {
                    c1066g.f4385E0 = 0;
                }
            } else {
                if (c1066g.f4384D0 == -1) {
                    c1066g.f4384D0 = 0;
                }
                if (c1066g.f4385E0 == -1) {
                    c1066g.f4385E0 = 0;
                }
            }
            C1063d[] c1063dArr2 = c1066g.f4423q0;
            i5 = 0;
            i6 = 0;
            char c3 = 0;
            while (true) {
                i7 = c1066g.f4424r0;
                if (i5 < i7) {
                    break;
                }
                if (c1066g.f4423q0[i5].f4312g0 == 8) {
                    i6++;
                }
                i5++;
            }
            if (i6 <= 0) {
                C1063d[] c1063dArr3 = new C1063d[i7 - i6];
                int i28 = 0;
                i8 = 0;
                while (i28 < c1066g.f4424r0) {
                    C1063d c1063d2 = c1066g.f4423q0[i28];
                    int i29 = i23;
                    C1063d[] c1063dArr4 = c1063dArr3;
                    if (c1063d2.f4312g0 != 8) {
                        c1063dArr4[i8] = c1063d2;
                        i8++;
                    }
                    i28++;
                    i23 = i29;
                    c1063dArr3 = c1063dArr4;
                }
                c1063dArr = c1063dArr3;
            } else {
                i8 = i7;
                c1063dArr = c1063dArr2;
            }
            int i30 = i23;
            c1066g.f4407a1 = c1063dArr;
            c1066g.f4408b1 = i8;
            i9 = c1066g.f4400T0;
            ArrayList arrayList = c1066g.f4403W0;
            if (i9 == 0) {
                C1062c c1062c = c1066g.f4282J;
                C1062c c1062c2 = c1066g.f4281I;
                C1062c c1062c3 = c1066g.f4283K;
                C1062c c1062c4 = c1066g.f4284L;
                int[] iArr3 = c1066g.f4330p0;
                if (i9 == 1) {
                    i10 = i24;
                    i11 = i25;
                    i12 = i26;
                    iArr = iArr2;
                    i13 = size2;
                    i14 = i30;
                    int i31 = c1066g.f4402V0;
                    if (i8 != 0) {
                        arrayList.clear();
                        C1065f c1065f2 = new C1065f(c1066g, i31, c1066g.f4281I, c1066g.f4282J, c1066g.f4283K, c1066g.f4284L, i27);
                        arrayList.add(c1065f2);
                        if (i31 == 0) {
                            int i32 = 0;
                            i15 = 0;
                            int i33 = 0;
                            while (i32 < i8) {
                                C1063d c1063d3 = c1063dArr[i32];
                                int iM2641U = c1066g.m2641U(c1063d3, i27);
                                if (c1063d3.f4330p0[0] == 3) {
                                    i15++;
                                }
                                int i34 = i15;
                                boolean z2 = (i33 == i27 || (c1066g.f4396P0 + i33) + iM2641U > i27) && c1065f2.f4364b != null;
                                if (!z2 && i32 > 0 && (i17 = c1066g.f4401U0) > 0 && i32 % i17 == 0) {
                                    z2 = true;
                                }
                                if (z2) {
                                    c1065f2 = new C1065f(c1066g, i31, c1066g.f4281I, c1066g.f4282J, c1066g.f4283K, c1066g.f4284L, i27);
                                    c1065f2.f4376n = i32;
                                    arrayList.add(c1065f2);
                                } else {
                                    if (i32 > 0) {
                                        i33 = c1066g.f4396P0 + iM2641U + i33;
                                    }
                                    c1065f2.m2633a(c1063d3);
                                    i32++;
                                    i15 = i34;
                                }
                                i33 = iM2641U;
                                c1065f2.m2633a(c1063d3);
                                i32++;
                                i15 = i34;
                            }
                        } else {
                            int i35 = 0;
                            i15 = 0;
                            int i36 = 0;
                            while (i35 < i8) {
                                C1063d c1063d4 = c1063dArr[i35];
                                int iM2640T = c1066g.m2640T(c1063d4, i27);
                                if (c1063d4.f4330p0[1] == 3) {
                                    i15++;
                                }
                                int i37 = i15;
                                boolean z3 = (i36 == i27 || (c1066g.f4397Q0 + i36) + iM2640T > i27) && c1065f2.f4364b != null;
                                if (!z3 && i35 > 0 && (i16 = c1066g.f4401U0) > 0 && i35 % i16 == 0) {
                                    z3 = true;
                                }
                                if (z3) {
                                    c1065f2 = new C1065f(c1066g, i31, c1066g.f4281I, c1066g.f4282J, c1066g.f4283K, c1066g.f4284L, i27);
                                    c1065f2.f4376n = i35;
                                    arrayList.add(c1065f2);
                                } else {
                                    if (i35 > 0) {
                                        i36 = c1066g.f4397Q0 + iM2640T + i36;
                                    }
                                    c1065f2.m2633a(c1063d4);
                                    i35++;
                                    i15 = i37;
                                }
                                i36 = iM2640T;
                                c1065f2.m2633a(c1063d4);
                                i35++;
                                i15 = i37;
                            }
                        }
                        int size3 = arrayList.size();
                        int i38 = c1066g.f4413w0;
                        int i39 = c1066g.f4409s0;
                        int i40 = c1066g.f4414x0;
                        int i41 = c1066g.f4410t0;
                        boolean z4 = iArr3[0] == 2 || iArr3[1] == 2;
                        if (i15 > 0 && z4) {
                            for (int i42 = 0; i42 < size3; i42++) {
                                C1065f c1065f3 = (C1065f) arrayList.get(i42);
                                if (i31 == 0) {
                                    c1065f3.m2637e(i27 - c1065f3.m2636d());
                                } else {
                                    c1065f3.m2637e(i27 - c1065f3.m2635c());
                                }
                            }
                        }
                        int i43 = i38;
                        int i44 = i39;
                        int i45 = i40;
                        int i46 = i41;
                        C1062c c1062c5 = c1062c2;
                        C1062c c1062c6 = c1062c;
                        C1062c c1062c7 = c1062c3;
                        C1062c c1062c8 = c1062c4;
                        int iMax = 0;
                        int i47 = 0;
                        for (int i48 = 0; i48 < size3; i48++) {
                            C1065f c1065f4 = (C1065f) arrayList.get(i48);
                            if (i31 == 0) {
                                if (i48 < size3 - 1) {
                                    c1062c8 = ((C1065f) arrayList.get(i48 + 1)).f4364b.f4282J;
                                    i46 = 0;
                                } else {
                                    i46 = c1066g.f4410t0;
                                    c1062c8 = c1062c4;
                                }
                                C1062c c1062c9 = c1065f4.f4364b.f4284L;
                                c1065f4.m2638f(i31, c1062c5, c1062c6, c1062c7, c1062c8, i43, i44, i45, i46, i27);
                                iMax = Math.max(iMax, c1065f4.m2636d());
                                int iM2635c = c1065f4.m2635c() + i47;
                                if (i48 > 0) {
                                    iM2635c += c1066g.f4397Q0;
                                }
                                i47 = iM2635c;
                                c1062c6 = c1062c9;
                                i44 = 0;
                            } else {
                                if (i48 < size3 - 1) {
                                    c1062c7 = ((C1065f) arrayList.get(i48 + 1)).f4364b.f4281I;
                                    i45 = 0;
                                } else {
                                    i45 = c1066g.f4414x0;
                                    c1062c7 = c1062c3;
                                }
                                C1062c c1062c10 = c1065f4.f4364b.f4283K;
                                c1065f4.m2638f(i31, c1062c5, c1062c6, c1062c7, c1062c8, i43, i44, i45, i46, i27);
                                int iM2636d = c1065f4.m2636d() + iMax;
                                int iMax2 = Math.max(i47, c1065f4.m2635c());
                                if (i48 > 0) {
                                    iM2636d += c1066g.f4396P0;
                                }
                                i47 = iMax2;
                                iMax = iM2636d;
                                c1062c5 = c1062c10;
                                i43 = 0;
                            }
                        }
                        iArr[0] = iMax;
                        iArr[1] = i47;
                    }
                } else if (i9 == 2) {
                    i10 = i24;
                    i11 = i25;
                    i12 = i26;
                    iArr = iArr2;
                    i13 = size2;
                    i14 = i30;
                    int i49 = c1066g.f4402V0;
                    if (i49 == 0) {
                        int i50 = c1066g.f4401U0;
                        if (i50 <= 0) {
                            int i51 = 0;
                            iCeil2 = 0;
                            for (int i52 = 0; i52 < i8; i52++) {
                                if (i52 > 0) {
                                    i51 += c1066g.f4396P0;
                                }
                                C1063d c1063d5 = c1063dArr[i52];
                                if (c1063d5 != null) {
                                    int iM2641U2 = c1066g.m2641U(c1063d5, i27) + i51;
                                    if (iM2641U2 > i27) {
                                        break;
                                    }
                                    iCeil2++;
                                    i51 = iM2641U2;
                                }
                            }
                        } else {
                            iCeil2 = i50;
                        }
                        iCeil = 0;
                    } else {
                        iCeil = c1066g.f4401U0;
                        if (iCeil <= 0) {
                            int i53 = 0;
                            int i54 = 0;
                            for (int i55 = 0; i55 < i8; i55++) {
                                if (i55 > 0) {
                                    i53 += c1066g.f4397Q0;
                                }
                                C1063d c1063d6 = c1063dArr[i55];
                                if (c1063d6 != null) {
                                    int iM2640T2 = c1066g.m2640T(c1063d6, i27) + i53;
                                    if (iM2640T2 > i27) {
                                        break;
                                    }
                                    i54++;
                                    i53 = iM2640T2;
                                }
                            }
                            iCeil = i54;
                        }
                        iCeil2 = 0;
                    }
                    if (c1066g.f4406Z0 == null) {
                        c1066g.f4406Z0 = new int[2];
                    }
                    boolean z5 = (iCeil == 0 && i49 == 1) || (iCeil2 == 0 && i49 == 0);
                    while (!z5) {
                        if (i49 == 0) {
                            iCeil = (int) Math.ceil(i8 / iCeil2);
                        } else {
                            iCeil2 = (int) Math.ceil(i8 / iCeil);
                        }
                        C1063d[] c1063dArr5 = c1066g.f4405Y0;
                        if (c1063dArr5 == null || c1063dArr5.length < iCeil2) {
                            obj = null;
                            c1066g.f4405Y0 = new C1063d[iCeil2];
                        } else {
                            obj = null;
                            Arrays.fill(c1063dArr5, (Object) null);
                        }
                        C1063d[] c1063dArr6 = c1066g.f4404X0;
                        if (c1063dArr6 == null || c1063dArr6.length < iCeil) {
                            c1066g.f4404X0 = new C1063d[iCeil];
                        } else {
                            Arrays.fill(c1063dArr6, obj);
                        }
                        for (int i56 = 0; i56 < iCeil2; i56++) {
                            for (int i57 = 0; i57 < iCeil; i57++) {
                                int i58 = (i57 * iCeil2) + i56;
                                if (i49 == 1) {
                                    i58 = (i56 * iCeil) + i57;
                                }
                                if (i58 < c1063dArr.length && (c1063d = c1063dArr[i58]) != null) {
                                    int iM2641U3 = c1066g.m2641U(c1063d, i27);
                                    C1063d c1063d7 = c1066g.f4405Y0[i56];
                                    if (c1063d7 == null || c1063d7.m2617q() < iM2641U3) {
                                        c1066g.f4405Y0[i56] = c1063d;
                                    }
                                    int iM2640T3 = c1066g.m2640T(c1063d, i27);
                                    C1063d c1063d8 = c1066g.f4404X0[i57];
                                    if (c1063d8 == null || c1063d8.m2613k() < iM2640T3) {
                                        c1066g.f4404X0[i57] = c1063d;
                                    }
                                }
                            }
                        }
                        int iM2641U4 = 0;
                        for (int i59 = 0; i59 < iCeil2; i59++) {
                            C1063d c1063d9 = c1066g.f4405Y0[i59];
                            if (c1063d9 != null) {
                                if (i59 > 0) {
                                    iM2641U4 += c1066g.f4396P0;
                                }
                                iM2641U4 = c1066g.m2641U(c1063d9, i27) + iM2641U4;
                            }
                        }
                        int iM2640T4 = 0;
                        for (int i60 = 0; i60 < iCeil; i60++) {
                            C1063d c1063d10 = c1066g.f4404X0[i60];
                            if (c1063d10 != null) {
                                if (i60 > 0) {
                                    iM2640T4 += c1066g.f4397Q0;
                                }
                                iM2640T4 = c1066g.m2640T(c1063d10, i27) + iM2640T4;
                            }
                        }
                        iArr[0] = iM2641U4;
                        iArr[1] = iM2640T4;
                        if (i49 != 0) {
                            if (iM2640T4 > i27 && iCeil > 1) {
                                iCeil--;
                            }
                        } else if (iM2641U4 > i27 && iCeil2 > 1) {
                            iCeil2--;
                        }
                        while (!z5) {
                        }
                    }
                    int[] iArr4 = c1066g.f4406Z0;
                    iArr4[0] = iCeil2;
                    iArr4[1] = iCeil;
                } else if (i9 != 3) {
                    i10 = i24;
                    i11 = i25;
                    i12 = i26;
                    iArr = iArr2;
                    i13 = size2;
                    i14 = i30;
                } else {
                    int i61 = c1066g.f4402V0;
                    if (i8 != 0) {
                        arrayList.clear();
                        i14 = i30;
                        i10 = i24;
                        i11 = i25;
                        i12 = i26;
                        iArr = iArr2;
                        C1065f c1065f5 = new C1065f(c1066g, i61, c1066g.f4281I, c1066g.f4282J, c1066g.f4283K, c1066g.f4284L, i27);
                        arrayList.add(c1065f5);
                        if (i61 == 0) {
                            int i62 = 0;
                            int i63 = 0;
                            i18 = 0;
                            int i64 = 0;
                            while (i62 < i8) {
                                i63++;
                                C1063d c1063d11 = c1063dArr[i62];
                                int iM2641U5 = c1066g.m2641U(c1063d11, i27);
                                int i65 = i61;
                                int i66 = i62;
                                if (c1063d11.f4330p0[0] == 3) {
                                    i18++;
                                }
                                int i67 = i18;
                                boolean z6 = (i64 == i27 || (c1066g.f4396P0 + i64) + iM2641U5 > i27) && c1065f5.f4364b != null;
                                if (!z6 && i66 > 0 && (i22 = c1066g.f4401U0) > 0 && i63 > i22) {
                                    z6 = true;
                                }
                                if (z6) {
                                    i61 = i65;
                                    i20 = size2;
                                    i21 = i66;
                                    c1065f5 = new C1065f(c1066g, i61, c1066g.f4281I, c1066g.f4282J, c1066g.f4283K, c1066g.f4284L, i27);
                                    c1065f5.f4376n = i21;
                                    arrayList.add(c1065f5);
                                    i64 = iM2641U5;
                                    i63 = 1;
                                } else {
                                    i61 = i65;
                                    i20 = size2;
                                    i21 = i66;
                                    i64 = i21 > 0 ? c1066g.f4396P0 + iM2641U5 + i64 : iM2641U5;
                                }
                                c1065f5.m2633a(c1063d11);
                                i62 = i21 + 1;
                                i18 = i67;
                                size2 = i20;
                            }
                            i13 = size2;
                        } else {
                            i13 = size2;
                            int i68 = 0;
                            int i69 = 0;
                            int i70 = 0;
                            int i71 = 0;
                            while (i68 < i8) {
                                i69++;
                                C1063d c1063d12 = c1063dArr[i68];
                                int iM2640T5 = c1066g.m2640T(c1063d12, i27);
                                int i72 = i61;
                                if (c1063d12.f4330p0[1] == 3) {
                                    i70++;
                                }
                                int i73 = i70;
                                boolean z7 = (i71 == i27 || (c1066g.f4397Q0 + i71) + iM2640T5 > i27) && c1065f5.f4364b != null;
                                if (!z7 && i68 > 0 && (i19 = c1066g.f4401U0) > 0 && i69 > i19) {
                                    z7 = true;
                                }
                                if (z7) {
                                    i61 = i72;
                                    c1065f5 = new C1065f(c1066g, i61, c1066g.f4281I, c1066g.f4282J, c1066g.f4283K, c1066g.f4284L, i27);
                                    c1065f5.f4376n = i68;
                                    arrayList.add(c1065f5);
                                    i71 = iM2640T5;
                                    i69 = 1;
                                } else {
                                    i61 = i72;
                                    i71 = i68 > 0 ? c1066g.f4397Q0 + iM2640T5 + i71 : iM2640T5;
                                }
                                c1065f5.m2633a(c1063d12);
                                i68++;
                                i70 = i73;
                            }
                            i18 = i70;
                        }
                        int size4 = arrayList.size();
                        int i74 = c1066g.f4413w0;
                        int i75 = c1066g.f4409s0;
                        int i76 = c1066g.f4414x0;
                        int i77 = c1066g.f4410t0;
                        boolean z8 = iArr3[0] == 2 || iArr3[1] == 2;
                        if (i18 > 0 && z8) {
                            for (int i78 = 0; i78 < size4; i78++) {
                                C1065f c1065f6 = (C1065f) arrayList.get(i78);
                                if (i61 == 0) {
                                    c1065f6.m2637e(i27 - c1065f6.m2636d());
                                } else {
                                    c1065f6.m2637e(i27 - c1065f6.m2635c());
                                }
                            }
                        }
                        int i79 = i74;
                        int i80 = i75;
                        int i81 = i76;
                        int i82 = i77;
                        C1062c c1062c11 = c1062c2;
                        C1062c c1062c12 = c1062c;
                        C1062c c1062c13 = c1062c3;
                        C1062c c1062c14 = c1062c4;
                        int iMax3 = 0;
                        int i83 = 0;
                        for (int i84 = 0; i84 < size4; i84++) {
                            C1065f c1065f7 = (C1065f) arrayList.get(i84);
                            if (i61 == 0) {
                                if (i84 < size4 - 1) {
                                    c1062c14 = ((C1065f) arrayList.get(i84 + 1)).f4364b.f4282J;
                                    i82 = 0;
                                } else {
                                    i82 = c1066g.f4410t0;
                                    c1062c14 = c1062c4;
                                }
                                C1062c c1062c15 = c1065f7.f4364b.f4284L;
                                c1065f7.m2638f(i61, c1062c11, c1062c12, c1062c13, c1062c14, i79, i80, i81, i82, i27);
                                iMax3 = Math.max(iMax3, c1065f7.m2636d());
                                int iM2635c2 = c1065f7.m2635c() + i83;
                                if (i84 > 0) {
                                    iM2635c2 += c1066g.f4397Q0;
                                }
                                i83 = iM2635c2;
                                c1062c12 = c1062c15;
                                i80 = 0;
                            } else {
                                if (i84 < size4 - 1) {
                                    c1062c13 = ((C1065f) arrayList.get(i84 + 1)).f4364b.f4281I;
                                    i81 = 0;
                                } else {
                                    i81 = c1066g.f4414x0;
                                    c1062c13 = c1062c3;
                                }
                                C1062c c1062c16 = c1065f7.f4364b.f4283K;
                                c1065f7.m2638f(i61, c1062c11, c1062c12, c1062c13, c1062c14, i79, i80, i81, i82, i27);
                                int iM2636d2 = c1065f7.m2636d() + iMax3;
                                int iMax4 = Math.max(i83, c1065f7.m2635c());
                                if (i84 > 0) {
                                    iM2636d2 += c1066g.f4396P0;
                                }
                                i83 = iMax4;
                                iMax3 = iM2636d2;
                                c1062c11 = c1062c16;
                                i79 = 0;
                            }
                        }
                        iArr[0] = iMax3;
                        iArr[1] = i83;
                    }
                }
            } else {
                i10 = i24;
                i11 = i25;
                i12 = i26;
                iArr = iArr2;
                i13 = size2;
                i14 = i30;
                int i85 = c1066g.f4402V0;
                if (i8 != 0) {
                    if (arrayList.size() == 0) {
                        c1065f = new C1065f(c1066g, i85, c1066g.f4281I, c1066g.f4282J, c1066g.f4283K, c1066g.f4284L, i27);
                        arrayList.add(c1065f);
                    } else {
                        c1065f = (C1065f) arrayList.get(0);
                        c1065f.f4365c = 0;
                        c1065f.f4364b = null;
                        c1065f.f4374l = 0;
                        c1065f.f4375m = 0;
                        c1065f.f4376n = 0;
                        c1065f.f4377o = 0;
                        c1065f.f4378p = 0;
                        c1065f.m2638f(i85, c1066g.f4281I, c1066g.f4282J, c1066g.f4283K, c1066g.f4284L, c1066g.f4413w0, c1066g.f4409s0, c1066g.f4414x0, c1066g.f4410t0, i27);
                    }
                    for (int i86 = 0; i86 < i8; i86++) {
                        c1065f.m2633a(c1063dArr[i86]);
                    }
                    c3 = 0;
                    iArr[0] = c1065f.m2636d();
                    c2 = 1;
                    iArr[1] = c1065f.m2635c();
                }
                int i87 = iArr[c3] + i14 + i10;
                int i88 = iArr[c2] + i11 + i12;
                if (mode != 1073741824) {
                    size = mode == Integer.MIN_VALUE ? Math.min(i87, size) : mode == 0 ? i87 : 0;
                }
                int iMin = mode2 == 1073741824 ? i13 : mode2 == Integer.MIN_VALUE ? Math.min(i88, i13) : mode2 == 0 ? i88 : 0;
                c1066g.f4416z0 = size;
                c1066g.f4381A0 = iMin;
                c1066g.m2602O(size);
                c1066g.m2599L(iMin);
                c1066g.f4415y0 = c1066g.f4424r0 > 0;
            }
            c2 = 1;
            int i872 = iArr[c3] + i14 + i10;
            int i882 = iArr[c2] + i11 + i12;
            if (mode != 1073741824) {
            }
            if (mode2 == 1073741824) {
            }
            c1066g.f4416z0 = size;
            c1066g.f4381A0 = iMin;
            c1066g.m2602O(size);
            c1066g.m2599L(iMin);
            c1066g.f4415y0 = c1066g.f4424r0 > 0;
        } else {
            C1063d c1063d13 = c1066g.f4292T;
            C1103f c1103f = c1063d13 != null ? ((C1064e) c1063d13).f4357u0 : null;
            if (c1103f == null) {
                c1066g.f4416z0 = 0;
                c1066g.f4381A0 = 0;
                c1066g.f4415y0 = false;
            } else {
                for (int i89 = 0; i89 < c1066g.f4424r0; i89++) {
                    C1063d c1063d14 = c1066g.f4423q0[i89];
                    if (c1063d14 != null && !(c1063d14 instanceof C1067h)) {
                        int iM2612j = c1063d14.m2612j(0);
                        int iM2612j2 = c1063d14.m2612j(1);
                        if (iM2612j != 3 || c1063d14.f4332r == 1 || iM2612j2 != 3 || c1063d14.f4333s == 1) {
                            if (iM2612j == 3) {
                                iM2612j = 2;
                            }
                            if (iM2612j2 == 3) {
                                iM2612j2 = 2;
                            }
                            C1076b c1076b = c1066g.f4382B0;
                            c1076b.f4434a = iM2612j;
                            c1076b.f4435b = iM2612j2;
                            c1076b.f4436c = c1063d14.m2617q();
                            c1076b.f4437d = c1063d14.m2613k();
                            c1103f.m2741b(c1063d14, c1076b);
                            c1063d14.m2602O(c1076b.f4438e);
                            c1063d14.m2599L(c1076b.f4439f);
                            c1063d14.m2596I(c1076b.f4440g);
                        }
                    }
                }
                int i232 = c1066g.f4413w0;
                int i242 = c1066g.f4414x0;
                int i252 = c1066g.f4409s0;
                int i262 = c1066g.f4410t0;
                int[] iArr22 = new int[2];
                int i272 = (size - i232) - i242;
                i4 = c1066g.f4402V0;
                if (i4 == 1) {
                }
                if (i4 != 0) {
                }
                C1063d[] c1063dArr22 = c1066g.f4423q0;
                i5 = 0;
                i6 = 0;
                char c32 = 0;
                while (true) {
                    i7 = c1066g.f4424r0;
                    if (i5 < i7) {
                    }
                    i5++;
                }
                if (i6 <= 0) {
                }
                int i302 = i232;
                c1066g.f4407a1 = c1063dArr;
                c1066g.f4408b1 = i8;
                i9 = c1066g.f4400T0;
                ArrayList arrayList2 = c1066g.f4403W0;
                if (i9 == 0) {
                }
                c2 = 1;
                int i8722 = iArr[c32] + i14 + i10;
                int i8822 = iArr[c2] + i11 + i12;
                if (mode != 1073741824) {
                }
                if (mode2 == 1073741824) {
                }
                c1066g.f4416z0 = size;
                c1066g.f4381A0 = iMin;
                c1066g.m2602O(size);
                c1066g.m2599L(iMin);
                c1066g.f4415y0 = c1066g.f4424r0 > 0;
            }
        }
        setMeasuredDimension(c1066g.f4416z0, c1066g.f4381A0);
    }

    @Override // p099y.AbstractC1100c, android.view.View
    public final void onMeasure(int i2, int i3) {
        mo1242j(this.f1418j, i2, i3);
    }

    public void setFirstHorizontalBias(float f) {
        this.f1418j.f4392L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i2) {
        this.f1418j.f4386F0 = i2;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f1418j.f4393M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i2) {
        this.f1418j.f4387G0 = i2;
        requestLayout();
    }

    public void setHorizontalAlign(int i2) {
        this.f1418j.f4398R0 = i2;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f1418j.f4390J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i2) {
        this.f1418j.f4396P0 = i2;
        requestLayout();
    }

    public void setHorizontalStyle(int i2) {
        this.f1418j.f4384D0 = i2;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f1418j.f4394N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i2) {
        this.f1418j.f4388H0 = i2;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f1418j.f4395O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i2) {
        this.f1418j.f4389I0 = i2;
        requestLayout();
    }

    public void setMaxElementsWrap(int i2) {
        this.f1418j.f4401U0 = i2;
        requestLayout();
    }

    public void setOrientation(int i2) {
        this.f1418j.f4402V0 = i2;
        requestLayout();
    }

    public void setPadding(int i2) {
        C1066g c1066g = this.f1418j;
        c1066g.f4409s0 = i2;
        c1066g.f4410t0 = i2;
        c1066g.f4411u0 = i2;
        c1066g.f4412v0 = i2;
        requestLayout();
    }

    public void setPaddingBottom(int i2) {
        this.f1418j.f4410t0 = i2;
        requestLayout();
    }

    public void setPaddingLeft(int i2) {
        this.f1418j.f4413w0 = i2;
        requestLayout();
    }

    public void setPaddingRight(int i2) {
        this.f1418j.f4414x0 = i2;
        requestLayout();
    }

    public void setPaddingTop(int i2) {
        this.f1418j.f4409s0 = i2;
        requestLayout();
    }

    public void setVerticalAlign(int i2) {
        this.f1418j.f4399S0 = i2;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f1418j.f4391K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i2) {
        this.f1418j.f4397Q0 = i2;
        requestLayout();
    }

    public void setVerticalStyle(int i2) {
        this.f1418j.f4385E0 = i2;
        requestLayout();
    }

    public void setWrapMode(int i2) {
        this.f1418j.f4400T0 = i2;
        requestLayout();
    }
}
