package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class o21 extends d31 {
    public static final o21 c = new o21(1, 0, 2);

    @Override // defpackage.d31
    public final void a(ll llVar, vc vcVar, mp1 mp1Var, hd1 hd1Var, e31 e31Var) {
        int[] iArr;
        jb0 jb0Var;
        int iC;
        int iD = llVar.d(0);
        if (mp1Var.n != 0) {
            mp.a("Cannot move a group while inserting");
        }
        if (iD < 0) {
            mp.a("Parameter offset is out of bounds");
        }
        if (iD == 0) {
            return;
        }
        int i = mp1Var.t;
        int i2 = mp1Var.v;
        int i3 = mp1Var.u;
        int i4 = i;
        while (true) {
            iArr = mp1Var.b;
            if (iD <= 0) {
                break;
            }
            i4 += iArr[(mp1Var.r(i4) * 5) + 3];
            if (i4 > i3) {
                mp.a("Parameter offset is out of bounds");
            }
            iD--;
        }
        int i5 = iArr[(mp1Var.r(i4) * 5) + 3];
        int iG = mp1Var.g(mp1Var.b, mp1Var.r(mp1Var.t));
        int iG2 = mp1Var.g(mp1Var.b, mp1Var.r(i4));
        int i6 = i4 + i5;
        int iG3 = mp1Var.g(mp1Var.b, mp1Var.r(i6));
        int i7 = iG3 - iG2;
        mp1Var.x(i7, Math.max(mp1Var.t - 1, 0));
        mp1Var.w(i5);
        int[] iArr2 = mp1Var.b;
        int iR = mp1Var.r(i6) * 5;
        nd.K(mp1Var.r(i) * 5, iR, (i5 * 5) + iR, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = mp1Var.c;
            int iH = mp1Var.h(iG2 + i7);
            System.arraycopy(objArr, iH, objArr, iG, mp1Var.h(iG3 + i7) - iH);
        }
        int i8 = iG2 + i7;
        int i9 = i8 - iG;
        int i10 = mp1Var.k;
        int i11 = mp1Var.l;
        int length = mp1Var.c.length;
        int i12 = mp1Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iR2 = mp1Var.r(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iR2 * 5) + 4] = mp1.i(mp1.i(mp1Var.g(iArr2, iR2) - i15, i12 < iR2 ? 0 : i10, i11, length), mp1Var.k, mp1Var.l, mp1Var.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iP = mp1Var.p();
        int iA = lp1.a(mp1Var.d, i6, iP);
        ArrayList arrayList = new ArrayList();
        if (iA >= 0) {
            while (iA < mp1Var.d.size() && (iC = mp1Var.c((jb0Var = (jb0) mp1Var.d.get(iA)))) >= i6 && iC < i16) {
                arrayList.add(jb0Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            jb0 jb0Var2 = (jb0) arrayList.get(i18);
            int iC2 = mp1Var.c(jb0Var2) + i17;
            if (iC2 >= mp1Var.g) {
                jb0Var2.a = -(iP - iC2);
            } else {
                jb0Var2.a = iC2;
            }
            mp1Var.d.add(lp1.a(mp1Var.d, iC2, iP), jb0Var2);
        }
        if (mp1Var.I(i6, i5)) {
            mp.a("Unexpectedly removed anchors");
        }
        mp1Var.m(i2, mp1Var.u, i);
        if (i7 > 0) {
            mp1Var.J(i8, i7, i6 - 1);
        }
    }
}
