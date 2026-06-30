package defpackage;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends w0 {
    public static x0 e;
    public static x0 f;
    public static x0 g;
    public static final ee1 h = ee1.f;
    public static final ee1 i = ee1.e;
    public final /* synthetic */ int c;
    public Object d;

    @Override // defpackage.w0
    public final int[] a(int i2) {
        int iD;
        switch (this.c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        xi0.K("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            xi0.K("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i2);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return b(i2, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        xi0.K("impl");
                        throw null;
                    }
                    i2 = breakIterator2.following(i2);
                } while (i2 != -1);
                return null;
            case 1:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!h(i2) && (!h(i2) || (i2 != 0 && h(i2 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        xi0.K("impl");
                        throw null;
                    }
                    i2 = breakIterator3.following(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    xi0.K("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i2);
                if (iFollowing2 == -1 || !g(iFollowing2)) {
                    return null;
                }
                return b(i2, iFollowing2);
            default:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                pz1 pz1Var = (pz1) this.d;
                ee1 ee1Var = h;
                if (i2 < 0) {
                    if (pz1Var == null) {
                        xi0.K("layoutResult");
                        throw null;
                    }
                    iD = pz1Var.b.d(0);
                } else {
                    if (pz1Var == null) {
                        xi0.K("layoutResult");
                        throw null;
                    }
                    int iD2 = pz1Var.b.d(i2);
                    iD = e(iD2, ee1Var) == i2 ? iD2 : iD2 + 1;
                }
                pz1 pz1Var2 = (pz1) this.d;
                if (pz1Var2 == null) {
                    xi0.K("layoutResult");
                    throw null;
                }
                if (iD >= pz1Var2.b.f) {
                    return null;
                }
                return b(e(iD, ee1Var), e(iD, i) + 1);
        }
    }

    @Override // defpackage.w0
    public final int[] d(int i2) {
        int iD;
        switch (this.c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        xi0.K("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            xi0.K("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i2);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return b(iPreceding, i2);
                    }
                    if (breakIterator2 == null) {
                        xi0.K("impl");
                        throw null;
                    }
                    i2 = breakIterator2.preceding(i2);
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = c().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !h(i2 - 1) && !g(i2)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        xi0.K("impl");
                        throw null;
                    }
                    i2 = breakIterator3.preceding(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    xi0.K("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i2);
                if (iPreceding2 == -1 || !h(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !h(iPreceding2 - 1)) {
                    return b(iPreceding2, i2);
                }
                return null;
            default:
                if (c().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = c().length();
                pz1 pz1Var = (pz1) this.d;
                ee1 ee1Var = i;
                if (i2 > length3) {
                    if (pz1Var == null) {
                        xi0.K("layoutResult");
                        throw null;
                    }
                    iD = pz1Var.b.d(c().length());
                } else {
                    if (pz1Var == null) {
                        xi0.K("layoutResult");
                        throw null;
                    }
                    int iD2 = pz1Var.b.d(i2);
                    iD = e(iD2, ee1Var) + 1 == i2 ? iD2 : iD2 - 1;
                }
                if (iD < 0) {
                    return null;
                }
                return b(e(iD, h), e(iD, ee1Var) + 1);
        }
    }

    public int e(int i2, ee1 ee1Var) {
        pz1 pz1Var = (pz1) this.d;
        if (pz1Var == null) {
            xi0.K("layoutResult");
            throw null;
        }
        int iF = pz1Var.f(i2);
        pz1 pz1Var2 = (pz1) this.d;
        if (pz1Var2 == null) {
            xi0.K("layoutResult");
            throw null;
        }
        ee1 ee1VarG = pz1Var2.g(iF);
        pz1 pz1Var3 = (pz1) this.d;
        if (ee1Var != ee1VarG) {
            if (pz1Var3 != null) {
                return pz1Var3.f(i2);
            }
            xi0.K("layoutResult");
            throw null;
        }
        if (pz1Var3 != null) {
            return pz1Var3.b.c(i2, false) - 1;
        }
        xi0.K("layoutResult");
        throw null;
    }

    public void f(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    xi0.K("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    xi0.K("impl");
                    throw null;
                }
        }
    }

    public boolean g(int i2) {
        if (i2 <= 0 || !h(i2 - 1)) {
            return false;
        }
        return i2 == c().length() || !h(i2);
    }

    public boolean h(int i2) {
        if (i2 < 0 || i2 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i2));
    }
}
