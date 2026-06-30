package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fo0 {
    public final k6 a;
    public final xg0 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public az1 j;
    public pz1 k;
    public z01 l;
    public pc1 m;
    public pc1 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = ou0.a();
    public final Matrix q = new Matrix();

    public fo0(k6 k6Var, xg0 xg0Var) {
        this.a = k6Var;
        this.b = xg0Var;
    }

    public final void a() {
        float f;
        float f2;
        xg0 xg0Var = this.b;
        InputMethodManager inputMethodManagerU = xg0Var.u();
        View view = (View) xg0Var.f;
        if (!inputMethodManagerU.isActive(view) || this.j == null || this.l == null || this.k == null || this.m == null || this.n == null) {
            return;
        }
        float[] fArr = this.p;
        ou0.d(fArr);
        zk0 zk0Var = (zk0) this.a.l.v.getValue();
        if (zk0Var != null) {
            if (!zk0Var.B()) {
                zk0Var = null;
            }
            if (zk0Var != null) {
                zk0Var.C(fArr);
            }
        }
        pc1 pc1Var = this.n;
        pc1Var.getClass();
        float f3 = -pc1Var.a;
        pc1 pc1Var2 = this.n;
        pc1Var2.getClass();
        ou0.i(fArr, f3, -pc1Var2.b);
        Matrix matrix = this.q;
        u4.s(matrix, fArr);
        az1 az1Var = this.j;
        az1Var.getClass();
        long j = az1Var.b;
        z01 z01Var = this.l;
        z01Var.getClass();
        pz1 pz1Var = this.k;
        pz1Var.getClass();
        vw0 vw0Var = pz1Var.b;
        pc1 pc1Var3 = this.m;
        pc1Var3.getClass();
        float f4 = pc1Var3.d;
        float f5 = pc1Var3.b;
        pc1 pc1Var4 = this.n;
        pc1Var4.getClass();
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        boolean z4 = this.i;
        CursorAnchorInfo.Builder builder = this.o;
        builder.reset();
        builder.setMatrix(matrix);
        wz1 wz1Var = az1Var.c;
        int iF = wz1.f(j);
        builder.setSelectionRange(iF, wz1.e(j));
        ee1 ee1Var = ee1.f;
        if (!z || iF < 0) {
            f = f4;
            f2 = f5;
        } else {
            int iG = z01Var.g(iF);
            pc1 pc1VarC = pz1Var.c(iG);
            f = f4;
            f2 = f5;
            float fZ = lk.z(pc1VarC.a, 0.0f, (int) (pz1Var.c >> 32));
            boolean zP = al.p(pc1Var3, fZ, pc1VarC.b);
            boolean zP2 = al.p(pc1Var3, fZ, pc1VarC.d);
            boolean z5 = pz1Var.a(iG) == ee1Var;
            int i = (zP || zP2) ? 1 : 0;
            if (!zP || !zP2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f6 = pc1VarC.b;
            float f7 = pc1VarC.d;
            builder.setInsertionMarkerLocation(fZ, f6, f7, f7, i);
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
                    float f8 = fArr2[i2];
                    CursorAnchorInfo.Builder builder3 = builder2;
                    float f9 = fArr2[i2 + 1];
                    int i3 = iG2;
                    float f10 = fArr2[i2 + 2];
                    float f11 = fArr2[i2 + 3];
                    int i4 = iE;
                    int i5 = (pc1Var3.a < f10 ? 1 : 0) & (f8 < pc1Var3.c ? 1 : 0) & (f2 < f11 ? 1 : 0) & (f9 < f ? 1 : 0);
                    if (!al.p(pc1Var3, f8, f9) || !al.p(pc1Var3, f10, f11)) {
                        i5 |= 2;
                    }
                    if (pz1Var.a(iG4) == ee1Var) {
                        i5 |= 4;
                    }
                    int i6 = iF2;
                    builder3.addCharacterBounds(i6, f8, f9, f10, f11, i5);
                    builder2 = builder3;
                    iF2 = i6 + 1;
                    iG2 = i3;
                    iE = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z3) {
            builder2.setEditorBoundsInfo(e1.h().setEditorBounds(el.R(pc1Var4)).setHandwritingBounds(el.R(pc1Var4)).build());
        }
        if (i7 >= 34 && z4 && !pc1Var3.f()) {
            int i8 = vw0Var.f - 1;
            if (i8 < 0) {
                i8 = 0;
            }
            int iA = lk.A(vw0Var.e(f2), 0, i8);
            int iA2 = lk.A(vw0Var.e(f), 0, i8);
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
        xg0Var.u().updateCursorAnchorInfo(view, builder2.build());
        this.e = false;
    }
}
