package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class hu {
    public final h4 a;
    public final oc b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public az1 j;
    public pz1 k;
    public z01 l;
    public pc1 n;
    public pc1 o;
    public final Object c = new Object();
    public sa0 m = a4.y;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = ou0.a();
    public final Matrix r = new Matrix();

    public hu(h4 h4Var, oc ocVar) {
        this.a = h4Var;
        this.b = ocVar;
    }

    public final void a() {
        View view;
        oc ocVar = this.b;
        hm0 hm0Var = (hm0) ocVar.b;
        InputMethodManager inputMethodManager = (InputMethodManager) hm0Var.getValue();
        View view2 = (View) ocVar.a;
        if (inputMethodManager.isActive(view2)) {
            sa0 sa0Var = this.m;
            float[] fArr = this.q;
            sa0Var.i(new ou0(fArr));
            this.a.p(fArr);
            Matrix matrix = this.r;
            u4.s(matrix, fArr);
            az1 az1Var = this.j;
            az1Var.getClass();
            long j = az1Var.b;
            z01 z01Var = this.l;
            z01Var.getClass();
            pz1 pz1Var = this.k;
            pz1Var.getClass();
            vw0 vw0Var = pz1Var.b;
            pc1 pc1Var = this.n;
            pc1Var.getClass();
            float f = pc1Var.d;
            float f2 = pc1Var.b;
            pc1 pc1Var2 = this.o;
            pc1Var2.getClass();
            boolean z = this.f;
            boolean z2 = this.g;
            boolean z3 = this.h;
            boolean z4 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
            builder.reset();
            builder.setMatrix(matrix);
            wz1 wz1Var = az1Var.c;
            int iF = wz1.f(j);
            builder.setSelectionRange(iF, wz1.e(j));
            ee1 ee1Var = ee1.f;
            if (!z || iF < 0) {
                view = view2;
            } else {
                int iG = z01Var.g(iF);
                pc1 pc1VarC = pz1Var.c(iG);
                view = view2;
                float fZ = lk.z(pc1VarC.a, 0.0f, (int) (pz1Var.c >> 32));
                boolean zR = bk.r(pc1Var, fZ, pc1VarC.b);
                boolean zR2 = bk.r(pc1Var, fZ, pc1VarC.d);
                boolean z5 = pz1Var.a(iG) == ee1Var;
                int i = (zR || zR2) ? 1 : 0;
                if (!zR || !zR2) {
                    i |= 2;
                }
                if (z5) {
                    i |= 4;
                }
                float f3 = pc1VarC.b;
                float f4 = pc1VarC.d;
                builder.setInsertionMarkerLocation(fZ, f3, f4, f4, i);
            }
            CursorAnchorInfo.Builder builder2 = builder;
            if (z2) {
                int iF2 = wz1Var != null ? wz1.f(wz1Var.a) : -1;
                int iE = wz1Var != null ? wz1.e(wz1Var.a) : -1;
                if (iF2 >= 0 && iF2 < iE) {
                    builder2.setComposingText(iF2, az1Var.a.f.subSequence(iF2, iE));
                    int iG2 = z01Var.g(iF2);
                    int iG3 = z01Var.g(iE);
                    float[] fArr2 = new float[(iG3 - iG2) * 4];
                    vw0Var.a(af1.g(iG2, iG3), fArr2);
                    while (iF2 < iE) {
                        int iG4 = z01Var.g(iF2);
                        int i2 = (iG4 - iG2) * 4;
                        float f5 = fArr2[i2];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f6 = fArr2[i2 + 1];
                        int i3 = iE;
                        float f7 = fArr2[i2 + 2];
                        float f8 = fArr2[i2 + 3];
                        int i4 = iF2;
                        int i5 = (pc1Var.a < f7 ? 1 : 0) & (f5 < pc1Var.c ? 1 : 0) & (f2 < f8 ? 1 : 0) & (f6 < f ? 1 : 0);
                        if (!bk.r(pc1Var, f5, f6) || !bk.r(pc1Var, f7, f8)) {
                            i5 |= 2;
                        }
                        if (pz1Var.a(iG4) == ee1Var) {
                            i5 |= 4;
                        }
                        builder3.addCharacterBounds(i4, f5, f6, f7, f8, i5);
                        builder2 = builder3;
                        iF2 = i4 + 1;
                        iE = i3;
                    }
                }
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33 && z3) {
                builder2.setEditorBoundsInfo(e1.h().setEditorBounds(el.R(pc1Var2)).setHandwritingBounds(el.R(pc1Var2)).build());
            }
            if (i6 >= 34 && z4 && !pc1Var.f()) {
                int i7 = vw0Var.f - 1;
                if (i7 < 0) {
                    i7 = 0;
                }
                int iA = lk.A(vw0Var.e(f2), 0, i7);
                int iA2 = lk.A(vw0Var.e(f), 0, i7);
                if (iA <= iA2) {
                    while (true) {
                        builder2.addVisibleLineBounds(pz1Var.d(iA), vw0Var.f(iA), pz1Var.e(iA), vw0Var.b(iA));
                        if (iA == iA2) {
                            break;
                        } else {
                            iA++;
                        }
                    }
                }
            }
            ((InputMethodManager) hm0Var.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.e = false;
        }
    }
}
