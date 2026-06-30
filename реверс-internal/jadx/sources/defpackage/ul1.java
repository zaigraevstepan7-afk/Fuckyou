package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ul1 {
    public final ql0 a;
    public final h40 b;
    public final mh0 c;
    public final sx0 d = new sx0(2);

    public ul1(ql0 ql0Var, h40 h40Var, hx0 hx0Var) {
        this.a = ql0Var;
        this.b = h40Var;
        this.c = hx0Var;
    }

    public final rl1 a() {
        return new rl1(this.b, false, this.a, new nl1());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ql0 ql0Var, nl1 nl1Var) {
        b5 b5Var;
        b5 b5Var2;
        e12 e12Var;
        e12 e12Var2;
        y5 y5Var;
        y5 y5Var2;
        sx0 sx0Var = this.d;
        Object[] objArr = sx0Var.a;
        int i = sx0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            l3 l3Var = (l3) objArr[i2];
            l3Var.getClass();
            nl1 nl1VarW = ql0Var.w();
            int i3 = ql0Var.f;
            xg0 xg0Var = l3Var.e;
            h4 h4Var = l3Var.g;
            if (nl1Var != null) {
                Object objG = nl1Var.e.g(vl1.s);
                if (objG == null) {
                    objG = null;
                }
                b5Var = (b5) objG;
            } else {
                b5Var = null;
            }
            if (nl1VarW != null) {
                Object objG2 = nl1VarW.e.g(vl1.s);
                if (objG2 == null) {
                    objG2 = null;
                }
                b5Var2 = (b5) objG2;
            } else {
                b5Var2 = null;
            }
            b5 b5Var3 = v20.w;
            if (!xi0.o(b5Var2, b5Var3)) {
                if (xi0.o(b5Var, b5Var3) && !xi0.o(b5Var2, b5Var3)) {
                    xg0Var.A(h4Var, i3, true);
                }
                if (nl1Var != null) {
                    Object objG3 = nl1Var.e.g(vl1.F);
                    if (objG3 == null) {
                        objG3 = null;
                    }
                    hb hbVar = (hb) objG3;
                    String str = hbVar != null ? hbVar.f : null;
                    if (nl1VarW != null) {
                        Object objG4 = nl1VarW.e.g(vl1.F);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        hb hbVar2 = (hb) objG4;
                        String str2 = hbVar2 != null ? hbVar2.f : null;
                        if (str != str2) {
                            if (str == null) {
                                xg0Var.A(h4Var, i3, true);
                            } else if (str2 == null) {
                                xg0Var.A(h4Var, i3, false);
                            } else if (xi0.o(b5Var2, v20.x)) {
                                xg0Var.w().notifyValueChanged(h4Var, i3, AutofillValue.forText(s22.R(str2)));
                            }
                        }
                        if (nl1Var != null) {
                            Object objG5 = nl1Var.e.g(vl1.K);
                            if (objG5 == null) {
                                objG5 = null;
                            }
                            e12Var = (e12) objG5;
                        } else {
                            e12Var = null;
                        }
                        if (nl1VarW != null) {
                            Object objG6 = nl1VarW.e.g(vl1.K);
                            if (objG6 == null) {
                                objG6 = null;
                            }
                            e12Var2 = (e12) objG6;
                        } else {
                            e12Var2 = null;
                        }
                        if (e12Var != e12Var2) {
                            if (e12Var == null) {
                                xg0Var.A(h4Var, i3, true);
                            } else if (e12Var2 == null) {
                                xg0Var.A(h4Var, i3, false);
                            } else if (xi0.o(b5Var2, v20.y)) {
                                int iOrdinal = e12Var2.ordinal();
                                Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                                if (bool != null) {
                                    xg0Var.w().notifyValueChanged(h4Var, i3, AutofillValue.forToggle(bool.booleanValue()));
                                }
                            }
                        }
                        if (nl1Var != null) {
                            Object objG7 = nl1Var.e.g(vl1.t);
                            if (objG7 == null) {
                                objG7 = null;
                            }
                            y5Var = (y5) objG7;
                        } else {
                            y5Var = null;
                        }
                        if (nl1VarW != null) {
                            Object objG8 = nl1VarW.e.g(vl1.t);
                            if (objG8 == null) {
                                objG8 = null;
                            }
                            y5Var2 = (y5) objG8;
                        } else {
                            y5Var2 = null;
                        }
                        if (!xi0.o(y5Var, y5Var2)) {
                            if (y5Var == null) {
                                xg0Var.A(h4Var, i3, true);
                            } else if (y5Var2 == null) {
                                xg0Var.A(h4Var, i3, false);
                            } else {
                                xg0Var.w().notifyValueChanged(h4Var, i3, y5Var2.a);
                            }
                        }
                    }
                }
            } else if (!xi0.o(b5Var, b5Var3)) {
                xg0Var.A(h4Var, i3, false);
            }
            boolean z = nl1Var != null && nl1Var.e.b(vl1.r);
            boolean z2 = nl1VarW != null && nl1VarW.e.b(vl1.r);
            if (z != z2) {
                ix0 ix0Var = l3Var.l;
                if (z2) {
                    ix0Var.a(i3);
                } else {
                    ix0Var.e(i3);
                }
            }
        }
    }
}
