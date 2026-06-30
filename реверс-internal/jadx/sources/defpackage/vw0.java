package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vw0 {
    public final me a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public vw0(me meVar, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iG;
        int i5;
        this.a = meVar;
        this.b = i;
        if (kr.j(j) != 0 || kr.i(j) != 0) {
            og0.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) meVar.e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            m41 m41Var = (m41) arrayList2.get(i6);
            v6 v6Var = m41Var.a;
            int iH = kr.h(j);
            if (kr.c(j)) {
                i4 = i6;
                iG = kr.g(j) - ((int) Math.ceil(f));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i4 = i6;
                iG = kr.g(j);
            }
            i3 = 0;
            r6 r6Var = new r6(v6Var, this.b - i7, i2, lr.b(0, iH, 0, iG, 5));
            float fB = r6Var.b() + f;
            nz1 nz1Var = r6Var.d;
            int i8 = i7 + nz1Var.g;
            arrayList.add(new l41(r6Var, m41Var.b, m41Var.c, i7, i8, f, fB));
            if (!nz1Var.d) {
                if (i8 == this.b) {
                    i5 = i4;
                    if (i5 != hk.B((ArrayList) this.a.e)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = fB;
            }
            z = true;
            i7 = i8;
            f = fB;
            break;
        }
        i3 = 0;
        z = false;
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = kr.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            l41 l41Var = (l41) arrayList.get(i9);
            List list = l41Var.a.f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                pc1 pc1Var = (pc1) list.get(i10);
                arrayList4.add(pc1Var != null ? l41Var.a(pc1Var) : null);
            }
            ul.a0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.a.b).size()) {
            int size4 = ((List) this.a.b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = pl.l0(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void i(vw0 vw0Var, cj cjVar, lh lhVar, float f, um1 um1Var, ax1 ax1Var, q10 q10Var) {
        cjVar.l();
        ArrayList arrayList = vw0Var.h;
        if (arrayList.size() <= 1 || (lhVar instanceof uq1)) {
            pv.j(vw0Var, cjVar, lhVar, f, um1Var, ax1Var, q10Var);
        } else {
            if (!(lhVar instanceof mh)) {
                ez1.a();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i = 0; i < size; i++) {
                l41 l41Var = (l41) arrayList.get(i);
                fB += l41Var.a.b();
                fMax = Math.max(fMax, l41Var.a.d());
            }
            Shader shaderC = ((mh) lhVar).c((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderC.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                r6 r6Var = ((l41) arrayList.get(i2)).a;
                r6Var.g(cjVar, new mh(shaderC), f, um1Var, ax1Var, q10Var);
                cjVar.f(0.0f, r6Var.b());
                matrix.setTranslate(0.0f, -r6Var.b());
                shaderC.setLocalMatrix(matrix);
            }
        }
        cjVar.i();
    }

    public final void a(long j, float[] fArr) {
        j(wz1.f(j));
        k(wz1.e(j));
        xc1 xc1Var = new xc1();
        xc1Var.e = 0;
        bk.x(this.h, j, new hg(j, fArr, xc1Var, new wc1()));
    }

    public final float b(int i) {
        l(i);
        ArrayList arrayList = this.h;
        l41 l41Var = (l41) arrayList.get(bk.v(i, arrayList));
        r6 r6Var = l41Var.a;
        return r6Var.d.e(i - l41Var.d) + l41Var.f;
    }

    public final int c(int i, boolean z) {
        int iF;
        l(i);
        ArrayList arrayList = this.h;
        l41 l41Var = (l41) arrayList.get(bk.v(i, arrayList));
        r6 r6Var = l41Var.a;
        int i2 = i - l41Var.d;
        nz1 nz1Var = r6Var.d;
        if (z) {
            Layout layout = nz1Var.f;
            ThreadLocal threadLocal = rz1.a;
            if (layout.getEllipsisCount(i2) <= 0 || nz1Var.b != TextUtils.TruncateAt.END) {
                me meVarC = nz1Var.c();
                Layout layout2 = (Layout) meVarC.a;
                iF = meVarC.k(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iF = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iF = nz1Var.f(i2);
        }
        return iF + l41Var.b;
    }

    public final int d(int i) {
        int length = ((hb) this.a.a).f.length();
        ArrayList arrayList = this.h;
        l41 l41Var = (l41) arrayList.get(i >= length ? hk.B(arrayList) : i < 0 ? 0 : bk.u(i, arrayList));
        return l41Var.a.d.g(l41Var.d(i)) + l41Var.d;
    }

    public final int e(float f) {
        int lineForVertical;
        ArrayList arrayList = this.h;
        l41 l41Var = (l41) arrayList.get(bk.w(arrayList, f));
        int i = l41Var.c - l41Var.b;
        int i2 = l41Var.d;
        if (i == 0) {
            return i2;
        }
        r6 r6Var = l41Var.a;
        float f2 = f - l41Var.f;
        nz1 nz1Var = r6Var.d;
        int i3 = (int) f2;
        int i4 = nz1Var.g;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = nz1Var.f.getLineForVertical(i3 - nz1Var.h);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    public final float f(int i) {
        l(i);
        ArrayList arrayList = this.h;
        l41 l41Var = (l41) arrayList.get(bk.v(i, arrayList));
        r6 r6Var = l41Var.a;
        return r6Var.d.i(i - l41Var.d) + l41Var.f;
    }

    public final int g(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        l41 l41Var = (l41) arrayList.get(bk.w(arrayList, fIntBitsToFloat));
        int i2 = l41Var.c;
        int i3 = l41Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        r6 r6Var = l41Var.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - l41Var.f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        nz1 nz1Var = r6Var.d;
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits));
        Layout layout = nz1Var.f;
        int lineForVertical = layout.getLineForVertical(iIntBitsToFloat - nz1Var.h);
        if (lineForVertical >= nz1Var.g) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (nz1Var.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    public final long h(pc1 pc1Var, int i, ez1 ez1Var) {
        long jB;
        long j;
        float f = pc1Var.b;
        ArrayList arrayList = this.h;
        int iW = bk.w(arrayList, f);
        float f2 = ((l41) arrayList.get(iW)).g;
        float f3 = pc1Var.d;
        if (f2 >= f3 || iW == hk.B(arrayList)) {
            l41 l41Var = (l41) arrayList.get(iW);
            return l41Var.b(l41Var.a.c(l41Var.c(pc1Var), i, ez1Var), true);
        }
        int iW2 = bk.w(arrayList, f3);
        long jB2 = wz1.b;
        while (true) {
            jB = wz1.b;
            if (!wz1.b(jB2, jB) || iW > iW2) {
                break;
            }
            l41 l41Var2 = (l41) arrayList.get(iW);
            jB2 = l41Var2.b(l41Var2.a.c(l41Var2.c(pc1Var), i, ez1Var), true);
            iW++;
        }
        if (wz1.b(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = wz1.b;
            if (!wz1.b(jB, j) || iW > iW2) {
                break;
            }
            l41 l41Var3 = (l41) arrayList.get(iW2);
            jB = l41Var3.b(l41Var3.a.c(l41Var3.c(pc1Var), i, ez1Var), true);
            iW2--;
        }
        return wz1.b(jB, j) ? jB2 : af1.g((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void j(int i) {
        hb hbVar = (hb) this.a.a;
        if (i < 0 || i >= hbVar.f.length()) {
            og0.a("offset(" + i + ") is out of bounds [0, " + hbVar.f.length() + ")");
        }
    }

    public final void k(int i) {
        hb hbVar = (hb) this.a.a;
        if (i < 0 || i > hbVar.f.length()) {
            og0.a("offset(" + i + ") is out of bounds [0, " + hbVar.f.length() + "]");
        }
    }

    public final void l(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        og0.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ")");
    }
}
