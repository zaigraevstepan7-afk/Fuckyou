package defpackage;

import android.text.Layout;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hg implements sa0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Serializable h;
    public final /* synthetic */ Object i;

    public /* synthetic */ hg(long j, float[] fArr, xc1 xc1Var, wc1 wc1Var) {
        this.f = j;
        this.g = fArr;
        this.h = xc1Var;
        this.i = wc1Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        long j;
        t32 t32Var;
        float[] fArr;
        int i;
        float fA;
        float fA2;
        int i2 = this.e;
        t32 t32Var2 = t32.a;
        Object obj2 = this.i;
        Serializable serializable = this.h;
        Object obj3 = this.g;
        switch (i2) {
            case 0:
                pc1 pc1Var = (pc1) obj3;
                zc1 zc1Var = (zc1) serializable;
                long j2 = this.f;
                wl wlVar = (wl) obj2;
                sl0 sl0Var = (sl0) obj;
                sl0Var.a();
                float f = pc1Var.a;
                float f2 = pc1Var.b;
                ej ejVar = sl0Var.e;
                ((qt0) ejVar.f.a).A(f, f2);
                try {
                    p10.Z(sl0Var, (f6) zc1Var.e, j2, 0L, 0.0f, wlVar, 0, 890);
                    return t32Var2;
                } finally {
                    ((qt0) ejVar.f.a).A(-f, -f2);
                }
            default:
                float[] fArr2 = (float[]) obj3;
                xc1 xc1Var = (xc1) serializable;
                wc1 wc1Var = (wc1) obj2;
                l41 l41Var = (l41) obj;
                int i3 = l41Var.b;
                r6 r6Var = l41Var.a;
                int iE = l41Var.c;
                long j3 = this.f;
                int iF = i3 > wz1.f(j3) ? l41Var.b : wz1.f(j3);
                if (iE >= wz1.e(j3)) {
                    iE = wz1.e(j3);
                }
                long jG = af1.g(l41Var.d(iF), l41Var.d(iE));
                int i4 = xc1Var.e;
                nz1 nz1Var = r6Var.d;
                int iF2 = wz1.f(jG);
                int iE2 = wz1.e(jG);
                Layout layout = nz1Var.f;
                int length = layout.getText().length();
                if (iF2 < 0) {
                    og0.a("startOffset must be > 0");
                }
                if (iF2 >= length) {
                    og0.a("startOffset must be less than text length");
                }
                if (iE2 <= iF2) {
                    og0.a("endOffset must be greater than startOffset");
                }
                if (iE2 > length) {
                    og0.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i4 < (iE2 - iF2) * 4) {
                    og0.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int iG = nz1Var.g(iF2);
                int iG2 = nz1Var.g(iE2 - 1);
                vd0 vd0Var = new vd0(nz1Var);
                if (iG <= iG2) {
                    while (true) {
                        int lineStart = layout.getLineStart(iG);
                        j = jG;
                        int iF3 = nz1Var.f(iG);
                        int iMax = Math.max(iF2, lineStart);
                        int iMin = Math.min(iE2, iF3);
                        float fI = nz1Var.i(iG);
                        float fE = nz1Var.e(iG);
                        t32Var = t32Var2;
                        fArr = fArr2;
                        boolean z = false;
                        boolean z2 = layout.getParagraphDirection(iG) == 1;
                        int i5 = i4;
                        int i6 = iMax;
                        while (i6 < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(i6);
                            if (!z2 || zIsRtlCharAt) {
                                if (z2 && zIsRtlCharAt) {
                                    z = false;
                                    float fA3 = vd0Var.a(i6, false, false, false);
                                    i = iMin;
                                    fA = vd0Var.a(i6 + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    i = iMin;
                                    z = false;
                                    if (z2 || !zIsRtlCharAt) {
                                        fA = vd0Var.a(i6, false, false, false);
                                        fA2 = vd0Var.a(i6 + 1, true, true, false);
                                    } else {
                                        fA2 = vd0Var.a(i6, false, false, true);
                                        fA = vd0Var.a(i6 + 1, true, true, true);
                                    }
                                }
                                fArr[i5] = fA;
                                fArr[i5 + 1] = fI;
                                fArr[i5 + 2] = fA2;
                                fArr[i5 + 3] = fE;
                                i5 += 4;
                                i6++;
                                iMin = i;
                            } else {
                                fA = vd0Var.a(i6, z, z, true);
                                i = iMin;
                                fA2 = vd0Var.a(i6 + 1, true, true, true);
                            }
                            z = false;
                            fArr[i5] = fA;
                            fArr[i5 + 1] = fI;
                            fArr[i5 + 2] = fA2;
                            fArr[i5 + 3] = fE;
                            i5 += 4;
                            i6++;
                            iMin = i;
                        }
                        if (iG != iG2) {
                            iG++;
                            jG = j;
                            i4 = i5;
                            t32Var2 = t32Var;
                            fArr2 = fArr;
                        }
                    }
                } else {
                    j = jG;
                    t32Var = t32Var2;
                    fArr = fArr2;
                }
                int iD = (wz1.d(j) * 4) + xc1Var.e;
                for (int i7 = xc1Var.e; i7 < iD; i7 += 4) {
                    int i8 = i7 + 1;
                    float f3 = fArr[i8];
                    float f4 = wc1Var.e;
                    fArr[i8] = f3 + f4;
                    int i9 = i7 + 3;
                    fArr[i9] = fArr[i9] + f4;
                }
                xc1Var.e = iD;
                wc1Var.e = r6Var.b() + wc1Var.e;
                return t32Var;
        }
    }

    public /* synthetic */ hg(pc1 pc1Var, zc1 zc1Var, long j, wf wfVar) {
        this.g = pc1Var;
        this.h = zc1Var;
        this.f = j;
        this.i = wfVar;
    }
}
