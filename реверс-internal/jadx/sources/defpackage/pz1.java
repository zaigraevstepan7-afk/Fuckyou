package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pz1 {
    public final oz1 a;
    public final vw0 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public pz1(oz1 oz1Var, vw0 vw0Var, long j) {
        this.a = oz1Var;
        this.b = vw0Var;
        this.c = j;
        ArrayList arrayList = vw0Var.h;
        float fD = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((l41) arrayList.get(0)).a.d.d(0);
        if (!arrayList.isEmpty()) {
            l41 l41Var = (l41) pl.i0(arrayList);
            fD = l41Var.a.d.d(r4.g - 1) + l41Var.f;
        }
        this.e = fD;
        this.f = vw0Var.g;
    }

    public final ee1 a(int i) {
        vw0 vw0Var = this.b;
        vw0Var.k(i);
        int length = ((hb) vw0Var.a.a).f.length();
        ArrayList arrayList = vw0Var.h;
        l41 l41Var = (l41) arrayList.get(i == length ? hk.B(arrayList) : bk.u(i, arrayList));
        return l41Var.a.d.f.isRtlCharAt(l41Var.d(i)) ? ee1.f : ee1.e;
    }

    public final pc1 b(int i) {
        float fK;
        float fK2;
        float fJ;
        float fJ2;
        vw0 vw0Var = this.b;
        vw0Var.j(i);
        ArrayList arrayList = vw0Var.h;
        l41 l41Var = (l41) arrayList.get(bk.u(i, arrayList));
        r6 r6Var = l41Var.a;
        int iD = l41Var.d(i);
        CharSequence charSequence = r6Var.e;
        if (iD < 0 || iD >= charSequence.length()) {
            og0.a("offset(" + iD + ") is out of bounds [0," + charSequence.length() + ")");
        }
        nz1 nz1Var = r6Var.d;
        int iG = nz1Var.g(iD);
        float fI = nz1Var.i(iG);
        float fE = nz1Var.e(iG);
        Layout layout = nz1Var.f;
        boolean z = layout.getParagraphDirection(iG) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fJ = nz1Var.k(iD, false);
                fJ2 = nz1Var.k(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fJ = nz1Var.j(iD, false);
                fJ2 = nz1Var.j(iD + 1, true);
            } else {
                fK = nz1Var.k(iD, false);
                fK2 = nz1Var.k(iD + 1, true);
            }
            float f = fJ;
            fK = fJ2;
            fK2 = f;
        } else {
            fK = nz1Var.j(iD, false);
            fK2 = nz1Var.j(iD + 1, true);
        }
        RectF rectF = new RectF(fK, fI, fK2, fE);
        return l41Var.a(new pc1(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final pc1 c(int i) {
        vw0 vw0Var = this.b;
        vw0Var.k(i);
        int length = ((hb) vw0Var.a.a).f.length();
        ArrayList arrayList = vw0Var.h;
        l41 l41Var = (l41) arrayList.get(i == length ? hk.B(arrayList) : bk.u(i, arrayList));
        r6 r6Var = l41Var.a;
        int iD = l41Var.d(i);
        CharSequence charSequence = r6Var.e;
        nz1 nz1Var = r6Var.d;
        if (iD < 0 || iD > charSequence.length()) {
            og0.a("offset(" + iD + ") is out of bounds [0," + charSequence.length() + "]");
        }
        float fJ = nz1Var.j(iD, false);
        int iG = nz1Var.g(iD);
        return l41Var.a(new pc1(fJ, nz1Var.i(iG), fJ, nz1Var.e(iG)));
    }

    public final float d(int i) {
        vw0 vw0Var = this.b;
        vw0Var.l(i);
        ArrayList arrayList = vw0Var.h;
        l41 l41Var = (l41) arrayList.get(bk.v(i, arrayList));
        r6 r6Var = l41Var.a;
        int i2 = i - l41Var.d;
        nz1 nz1Var = r6Var.d;
        return nz1Var.f.getLineLeft(i2) + (i2 == nz1Var.g + (-1) ? nz1Var.j : 0.0f);
    }

    public final float e(int i) {
        vw0 vw0Var = this.b;
        vw0Var.l(i);
        ArrayList arrayList = vw0Var.h;
        l41 l41Var = (l41) arrayList.get(bk.v(i, arrayList));
        r6 r6Var = l41Var.a;
        int i2 = i - l41Var.d;
        nz1 nz1Var = r6Var.d;
        return nz1Var.f.getLineRight(i2) + (i2 == nz1Var.g + (-1) ? nz1Var.k : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pz1) {
            pz1 pz1Var = (pz1) obj;
            if (xi0.o(this.a, pz1Var.a) && this.b == pz1Var.b && vh0.a(this.c, pz1Var.c) && this.d == pz1Var.d && this.e == pz1Var.e && xi0.o(this.f, pz1Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i) {
        vw0 vw0Var = this.b;
        vw0Var.l(i);
        ArrayList arrayList = vw0Var.h;
        l41 l41Var = (l41) arrayList.get(bk.v(i, arrayList));
        r6 r6Var = l41Var.a;
        return r6Var.d.f.getLineStart(i - l41Var.d) + l41Var.b;
    }

    public final ee1 g(int i) {
        vw0 vw0Var = this.b;
        vw0Var.k(i);
        int length = ((hb) vw0Var.a.a).f.length();
        ArrayList arrayList = vw0Var.h;
        l41 l41Var = (l41) arrayList.get(i == length ? hk.B(arrayList) : bk.u(i, arrayList));
        r6 r6Var = l41Var.a;
        int iD = l41Var.d(i);
        nz1 nz1Var = r6Var.d;
        return nz1Var.f.getParagraphDirection(nz1Var.g(iD)) == 1 ? ee1.e : ee1.f;
    }

    public final w6 h(int i, int i2) {
        vw0 vw0Var = this.b;
        hb hbVar = (hb) vw0Var.a.a;
        if (i < 0 || i > i2 || i2 > hbVar.f.length()) {
            int length = hbVar.f.length();
            StringBuilder sbN = s91.n("Start(", i, ") or End(", i2, ") is out of range [0..");
            sbN.append(length);
            sbN.append("), or start > end!");
            og0.a(sbN.toString());
        }
        if (i == i2) {
            return y6.a();
        }
        w6 w6VarA = y6.a();
        bk.x(vw0Var.h, af1.g(i, i2), new ov0(w6VarA, i, i2, 2));
        return w6VarA;
    }

    public final int hashCode() {
        return this.f.hashCode() + s91.a(this.e, s91.a(this.d, s91.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final long i(int i) {
        int iL;
        int iJ;
        int iJ2;
        vw0 vw0Var = this.b;
        vw0Var.k(i);
        int length = ((hb) vw0Var.a.a).f.length();
        ArrayList arrayList = vw0Var.h;
        l41 l41Var = (l41) arrayList.get(i == length ? hk.B(arrayList) : bk.u(i, arrayList));
        r6 r6Var = l41Var.a;
        int iD = l41Var.d(i);
        zb zbVarL = r6Var.d.l();
        if (zbVarL.i(zbVarL.l(iD))) {
            zbVarL.b(iD);
            iL = iD;
            while (iL != -1 && (!zbVarL.i(iL) || zbVarL.e(iL))) {
                iL = zbVarL.l(iL);
            }
        } else {
            zbVarL.b(iD);
            iL = zbVarL.h(iD) ? (!zbVarL.f(iD) || zbVarL.d(iD)) ? zbVarL.l(iD) : iD : zbVarL.d(iD) ? zbVarL.l(iD) : -1;
        }
        if (iL == -1) {
            iL = iD;
        }
        if (zbVarL.e(zbVarL.j(iD))) {
            zbVarL.b(iD);
            iJ = iD;
            while (iJ != -1 && (zbVarL.i(iJ) || !zbVarL.e(iJ))) {
                iJ = zbVarL.j(iJ);
            }
        } else {
            zbVarL.b(iD);
            if (zbVarL.d(iD)) {
                if (!zbVarL.f(iD) || zbVarL.h(iD)) {
                    iJ2 = zbVarL.j(iD);
                    iJ = iJ2;
                } else {
                    iJ = iD;
                }
            } else if (zbVarL.h(iD)) {
                iJ2 = zbVarL.j(iD);
                iJ = iJ2;
            } else {
                iJ = -1;
            }
        }
        if (iJ != -1) {
            iD = iJ;
        }
        return l41Var.b(af1.g(iL, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + vh0.b(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ")";
    }
}
