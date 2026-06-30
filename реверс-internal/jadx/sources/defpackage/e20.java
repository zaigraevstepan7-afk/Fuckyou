package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class e20 {
    public String a;
    public sa0 b;
    public sa0 c;
    public boolean d;
    public sa0 e;
    public sa0 f;
    public sa0 g;
    public sa0 h;
    public sa0 i;
    public sa0 j;

    public final f20 a() {
        sa0 sa0Var = this.f;
        if (sa0Var == null && this.g != null) {
            yc.e(s91.l("Color ", this.a, " has secondBackground defined, but background is not defined."));
            return null;
        }
        if (sa0Var == null && this.h != null) {
            yc.e(s91.l("Color ", this.a, " has contrastCurve defined, but background is not defined."));
            return null;
        }
        if (sa0Var != null && this.h == null) {
            yc.e(s91.l("Color ", this.a, " has background defined, but contrastCurve is not defined."));
            return null;
        }
        sa0 mtVar = this.c;
        if (mtVar == null) {
            mtVar = sa0Var == null ? new mt(3) : new tq(sa0Var, 1);
        }
        String str = this.a;
        str.getClass();
        sa0 sa0Var2 = this.b;
        sa0Var2.getClass();
        return new f20(str, sa0Var2, mtVar, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final e20 b(final f20 f20Var) {
        String str = this.a;
        String str2 = f20Var.a;
        boolean zO = xi0.o(str, str2);
        hm hmVar = hm.f;
        if (!zO) {
            StringBuilder sbO = s91.o("Attempting to extend color ", this.a, " with color ", str2, " of different name for spec version ");
            sbO.append(hmVar);
            sbO.append(".");
            throw new IllegalArgumentException(sbO.toString().toString());
        }
        boolean z = this.d;
        boolean z2 = f20Var.d;
        String str3 = this.a;
        if (z != z2) {
            String str4 = z ? "background" : "foreground";
            String str5 = z2 ? "background" : "foreground";
            StringBuilder sbO2 = s91.o("Attempting to extend color ", str3, " as a ", str4, " with color ");
            s91.u(sbO2, str2, " as a ", str5, " for spec version ");
            sbO2.append(hmVar);
            sbO2.append(".");
            throw new IllegalArgumentException(sbO2.toString().toString());
        }
        e20 e20Var = new e20();
        str3.getClass();
        e20Var.a = str3;
        e20Var.d = this.d;
        final int i = 0;
        e20Var.b = new sa0() { // from class: d20
            @Override // defpackage.sa0
            public final Object i(Object obj) {
                g12 g12Var;
                int i2 = i;
                e20 e20Var2 = this;
                f20 f20Var2 = f20Var;
                hm hmVar2 = hm.f;
                switch (i2) {
                    case 0:
                        sa0 sa0Var = f20Var2.b;
                        h20 h20Var = (h20) obj;
                        h20Var.getClass();
                        sa0 sa0Var2 = h20Var.l == hmVar2 ? sa0Var : e20Var2.b;
                        return (sa0Var2 == null || (g12Var = (g12) sa0Var2.i(h20Var)) == null) ? (g12) sa0Var.i(h20Var) : g12Var;
                    case 1:
                        sa0 sa0Var3 = f20Var2.c;
                        h20 h20Var2 = (h20) obj;
                        h20Var2.getClass();
                        sa0 sa0Var4 = h20Var2.l == hmVar2 ? sa0Var3 : e20Var2.c;
                        return Double.valueOf(((Number) (sa0Var4 != null ? sa0Var4.i(h20Var2) : sa0Var3.i(h20Var2))).doubleValue());
                    case t91.FLOAT_FIELD_NUMBER /* 2 */:
                        h20 h20Var3 = (h20) obj;
                        h20Var3.getClass();
                        sa0 sa0Var5 = h20Var3.l == hmVar2 ? f20Var2.e : e20Var2.e;
                        return sa0Var5 != null ? (Double) sa0Var5.i(h20Var3) : Double.valueOf(1.0d);
                    case t91.INTEGER_FIELD_NUMBER /* 3 */:
                        h20 h20Var4 = (h20) obj;
                        h20Var4.getClass();
                        sa0 sa0Var6 = h20Var4.l == hmVar2 ? f20Var2.f : e20Var2.f;
                        if (sa0Var6 != null) {
                            return (f20) sa0Var6.i(h20Var4);
                        }
                        return null;
                    case t91.LONG_FIELD_NUMBER /* 4 */:
                        h20 h20Var5 = (h20) obj;
                        h20Var5.getClass();
                        sa0 sa0Var7 = h20Var5.l == hmVar2 ? f20Var2.g : e20Var2.g;
                        if (sa0Var7 != null) {
                            return (f20) sa0Var7.i(h20Var5);
                        }
                        return null;
                    case t91.STRING_FIELD_NUMBER /* 5 */:
                        h20 h20Var6 = (h20) obj;
                        h20Var6.getClass();
                        sa0 sa0Var8 = h20Var6.l == hmVar2 ? f20Var2.h : e20Var2.h;
                        if (sa0Var8 != null) {
                            return (ms) sa0Var8.i(h20Var6);
                        }
                        return null;
                    case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                        h20 h20Var7 = (h20) obj;
                        h20Var7.getClass();
                        sa0 sa0Var9 = h20Var7.l == hmVar2 ? f20Var2.i : e20Var2.i;
                        if (sa0Var9 != null) {
                            return (i12) sa0Var9.i(h20Var7);
                        }
                        return null;
                    default:
                        h20 h20Var8 = (h20) obj;
                        h20Var8.getClass();
                        sa0 sa0Var10 = h20Var8.l == hmVar2 ? f20Var2.j : e20Var2.j;
                        if (sa0Var10 != null) {
                            return (Double) sa0Var10.i(h20Var8);
                        }
                        return null;
                }
            }
        };
        final int i2 = 1;
        e20Var.c = new sa0() { // from class: d20
            @Override // defpackage.sa0
            public final Object i(Object obj) {
                g12 g12Var;
                int i22 = i2;
                e20 e20Var2 = this;
                f20 f20Var2 = f20Var;
                hm hmVar2 = hm.f;
                switch (i22) {
                    case 0:
                        sa0 sa0Var = f20Var2.b;
                        h20 h20Var = (h20) obj;
                        h20Var.getClass();
                        sa0 sa0Var2 = h20Var.l == hmVar2 ? sa0Var : e20Var2.b;
                        return (sa0Var2 == null || (g12Var = (g12) sa0Var2.i(h20Var)) == null) ? (g12) sa0Var.i(h20Var) : g12Var;
                    case 1:
                        sa0 sa0Var3 = f20Var2.c;
                        h20 h20Var2 = (h20) obj;
                        h20Var2.getClass();
                        sa0 sa0Var4 = h20Var2.l == hmVar2 ? sa0Var3 : e20Var2.c;
                        return Double.valueOf(((Number) (sa0Var4 != null ? sa0Var4.i(h20Var2) : sa0Var3.i(h20Var2))).doubleValue());
                    case t91.FLOAT_FIELD_NUMBER /* 2 */:
                        h20 h20Var3 = (h20) obj;
                        h20Var3.getClass();
                        sa0 sa0Var5 = h20Var3.l == hmVar2 ? f20Var2.e : e20Var2.e;
                        return sa0Var5 != null ? (Double) sa0Var5.i(h20Var3) : Double.valueOf(1.0d);
                    case t91.INTEGER_FIELD_NUMBER /* 3 */:
                        h20 h20Var4 = (h20) obj;
                        h20Var4.getClass();
                        sa0 sa0Var6 = h20Var4.l == hmVar2 ? f20Var2.f : e20Var2.f;
                        if (sa0Var6 != null) {
                            return (f20) sa0Var6.i(h20Var4);
                        }
                        return null;
                    case t91.LONG_FIELD_NUMBER /* 4 */:
                        h20 h20Var5 = (h20) obj;
                        h20Var5.getClass();
                        sa0 sa0Var7 = h20Var5.l == hmVar2 ? f20Var2.g : e20Var2.g;
                        if (sa0Var7 != null) {
                            return (f20) sa0Var7.i(h20Var5);
                        }
                        return null;
                    case t91.STRING_FIELD_NUMBER /* 5 */:
                        h20 h20Var6 = (h20) obj;
                        h20Var6.getClass();
                        sa0 sa0Var8 = h20Var6.l == hmVar2 ? f20Var2.h : e20Var2.h;
                        if (sa0Var8 != null) {
                            return (ms) sa0Var8.i(h20Var6);
                        }
                        return null;
                    case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                        h20 h20Var7 = (h20) obj;
                        h20Var7.getClass();
                        sa0 sa0Var9 = h20Var7.l == hmVar2 ? f20Var2.i : e20Var2.i;
                        if (sa0Var9 != null) {
                            return (i12) sa0Var9.i(h20Var7);
                        }
                        return null;
                    default:
                        h20 h20Var8 = (h20) obj;
                        h20Var8.getClass();
                        sa0 sa0Var10 = h20Var8.l == hmVar2 ? f20Var2.j : e20Var2.j;
                        if (sa0Var10 != null) {
                            return (Double) sa0Var10.i(h20Var8);
                        }
                        return null;
                }
            }
        };
        final int i3 = 2;
        e20Var.e = new sa0() { // from class: d20
            @Override // defpackage.sa0
            public final Object i(Object obj) {
                g12 g12Var;
                int i22 = i3;
                e20 e20Var2 = this;
                f20 f20Var2 = f20Var;
                hm hmVar2 = hm.f;
                switch (i22) {
                    case 0:
                        sa0 sa0Var = f20Var2.b;
                        h20 h20Var = (h20) obj;
                        h20Var.getClass();
                        sa0 sa0Var2 = h20Var.l == hmVar2 ? sa0Var : e20Var2.b;
                        return (sa0Var2 == null || (g12Var = (g12) sa0Var2.i(h20Var)) == null) ? (g12) sa0Var.i(h20Var) : g12Var;
                    case 1:
                        sa0 sa0Var3 = f20Var2.c;
                        h20 h20Var2 = (h20) obj;
                        h20Var2.getClass();
                        sa0 sa0Var4 = h20Var2.l == hmVar2 ? sa0Var3 : e20Var2.c;
                        return Double.valueOf(((Number) (sa0Var4 != null ? sa0Var4.i(h20Var2) : sa0Var3.i(h20Var2))).doubleValue());
                    case t91.FLOAT_FIELD_NUMBER /* 2 */:
                        h20 h20Var3 = (h20) obj;
                        h20Var3.getClass();
                        sa0 sa0Var5 = h20Var3.l == hmVar2 ? f20Var2.e : e20Var2.e;
                        return sa0Var5 != null ? (Double) sa0Var5.i(h20Var3) : Double.valueOf(1.0d);
                    case t91.INTEGER_FIELD_NUMBER /* 3 */:
                        h20 h20Var4 = (h20) obj;
                        h20Var4.getClass();
                        sa0 sa0Var6 = h20Var4.l == hmVar2 ? f20Var2.f : e20Var2.f;
                        if (sa0Var6 != null) {
                            return (f20) sa0Var6.i(h20Var4);
                        }
                        return null;
                    case t91.LONG_FIELD_NUMBER /* 4 */:
                        h20 h20Var5 = (h20) obj;
                        h20Var5.getClass();
                        sa0 sa0Var7 = h20Var5.l == hmVar2 ? f20Var2.g : e20Var2.g;
                        if (sa0Var7 != null) {
                            return (f20) sa0Var7.i(h20Var5);
                        }
                        return null;
                    case t91.STRING_FIELD_NUMBER /* 5 */:
                        h20 h20Var6 = (h20) obj;
                        h20Var6.getClass();
                        sa0 sa0Var8 = h20Var6.l == hmVar2 ? f20Var2.h : e20Var2.h;
                        if (sa0Var8 != null) {
                            return (ms) sa0Var8.i(h20Var6);
                        }
                        return null;
                    case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                        h20 h20Var7 = (h20) obj;
                        h20Var7.getClass();
                        sa0 sa0Var9 = h20Var7.l == hmVar2 ? f20Var2.i : e20Var2.i;
                        if (sa0Var9 != null) {
                            return (i12) sa0Var9.i(h20Var7);
                        }
                        return null;
                    default:
                        h20 h20Var8 = (h20) obj;
                        h20Var8.getClass();
                        sa0 sa0Var10 = h20Var8.l == hmVar2 ? f20Var2.j : e20Var2.j;
                        if (sa0Var10 != null) {
                            return (Double) sa0Var10.i(h20Var8);
                        }
                        return null;
                }
            }
        };
        final int i4 = 3;
        e20Var.f = new sa0() { // from class: d20
            @Override // defpackage.sa0
            public final Object i(Object obj) {
                g12 g12Var;
                int i22 = i4;
                e20 e20Var2 = this;
                f20 f20Var2 = f20Var;
                hm hmVar2 = hm.f;
                switch (i22) {
                    case 0:
                        sa0 sa0Var = f20Var2.b;
                        h20 h20Var = (h20) obj;
                        h20Var.getClass();
                        sa0 sa0Var2 = h20Var.l == hmVar2 ? sa0Var : e20Var2.b;
                        return (sa0Var2 == null || (g12Var = (g12) sa0Var2.i(h20Var)) == null) ? (g12) sa0Var.i(h20Var) : g12Var;
                    case 1:
                        sa0 sa0Var3 = f20Var2.c;
                        h20 h20Var2 = (h20) obj;
                        h20Var2.getClass();
                        sa0 sa0Var4 = h20Var2.l == hmVar2 ? sa0Var3 : e20Var2.c;
                        return Double.valueOf(((Number) (sa0Var4 != null ? sa0Var4.i(h20Var2) : sa0Var3.i(h20Var2))).doubleValue());
                    case t91.FLOAT_FIELD_NUMBER /* 2 */:
                        h20 h20Var3 = (h20) obj;
                        h20Var3.getClass();
                        sa0 sa0Var5 = h20Var3.l == hmVar2 ? f20Var2.e : e20Var2.e;
                        return sa0Var5 != null ? (Double) sa0Var5.i(h20Var3) : Double.valueOf(1.0d);
                    case t91.INTEGER_FIELD_NUMBER /* 3 */:
                        h20 h20Var4 = (h20) obj;
                        h20Var4.getClass();
                        sa0 sa0Var6 = h20Var4.l == hmVar2 ? f20Var2.f : e20Var2.f;
                        if (sa0Var6 != null) {
                            return (f20) sa0Var6.i(h20Var4);
                        }
                        return null;
                    case t91.LONG_FIELD_NUMBER /* 4 */:
                        h20 h20Var5 = (h20) obj;
                        h20Var5.getClass();
                        sa0 sa0Var7 = h20Var5.l == hmVar2 ? f20Var2.g : e20Var2.g;
                        if (sa0Var7 != null) {
                            return (f20) sa0Var7.i(h20Var5);
                        }
                        return null;
                    case t91.STRING_FIELD_NUMBER /* 5 */:
                        h20 h20Var6 = (h20) obj;
                        h20Var6.getClass();
                        sa0 sa0Var8 = h20Var6.l == hmVar2 ? f20Var2.h : e20Var2.h;
                        if (sa0Var8 != null) {
                            return (ms) sa0Var8.i(h20Var6);
                        }
                        return null;
                    case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                        h20 h20Var7 = (h20) obj;
                        h20Var7.getClass();
                        sa0 sa0Var9 = h20Var7.l == hmVar2 ? f20Var2.i : e20Var2.i;
                        if (sa0Var9 != null) {
                            return (i12) sa0Var9.i(h20Var7);
                        }
                        return null;
                    default:
                        h20 h20Var8 = (h20) obj;
                        h20Var8.getClass();
                        sa0 sa0Var10 = h20Var8.l == hmVar2 ? f20Var2.j : e20Var2.j;
                        if (sa0Var10 != null) {
                            return (Double) sa0Var10.i(h20Var8);
                        }
                        return null;
                }
            }
        };
        final int i5 = 4;
        e20Var.g = new sa0() { // from class: d20
            @Override // defpackage.sa0
            public final Object i(Object obj) {
                g12 g12Var;
                int i22 = i5;
                e20 e20Var2 = this;
                f20 f20Var2 = f20Var;
                hm hmVar2 = hm.f;
                switch (i22) {
                    case 0:
                        sa0 sa0Var = f20Var2.b;
                        h20 h20Var = (h20) obj;
                        h20Var.getClass();
                        sa0 sa0Var2 = h20Var.l == hmVar2 ? sa0Var : e20Var2.b;
                        return (sa0Var2 == null || (g12Var = (g12) sa0Var2.i(h20Var)) == null) ? (g12) sa0Var.i(h20Var) : g12Var;
                    case 1:
                        sa0 sa0Var3 = f20Var2.c;
                        h20 h20Var2 = (h20) obj;
                        h20Var2.getClass();
                        sa0 sa0Var4 = h20Var2.l == hmVar2 ? sa0Var3 : e20Var2.c;
                        return Double.valueOf(((Number) (sa0Var4 != null ? sa0Var4.i(h20Var2) : sa0Var3.i(h20Var2))).doubleValue());
                    case t91.FLOAT_FIELD_NUMBER /* 2 */:
                        h20 h20Var3 = (h20) obj;
                        h20Var3.getClass();
                        sa0 sa0Var5 = h20Var3.l == hmVar2 ? f20Var2.e : e20Var2.e;
                        return sa0Var5 != null ? (Double) sa0Var5.i(h20Var3) : Double.valueOf(1.0d);
                    case t91.INTEGER_FIELD_NUMBER /* 3 */:
                        h20 h20Var4 = (h20) obj;
                        h20Var4.getClass();
                        sa0 sa0Var6 = h20Var4.l == hmVar2 ? f20Var2.f : e20Var2.f;
                        if (sa0Var6 != null) {
                            return (f20) sa0Var6.i(h20Var4);
                        }
                        return null;
                    case t91.LONG_FIELD_NUMBER /* 4 */:
                        h20 h20Var5 = (h20) obj;
                        h20Var5.getClass();
                        sa0 sa0Var7 = h20Var5.l == hmVar2 ? f20Var2.g : e20Var2.g;
                        if (sa0Var7 != null) {
                            return (f20) sa0Var7.i(h20Var5);
                        }
                        return null;
                    case t91.STRING_FIELD_NUMBER /* 5 */:
                        h20 h20Var6 = (h20) obj;
                        h20Var6.getClass();
                        sa0 sa0Var8 = h20Var6.l == hmVar2 ? f20Var2.h : e20Var2.h;
                        if (sa0Var8 != null) {
                            return (ms) sa0Var8.i(h20Var6);
                        }
                        return null;
                    case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                        h20 h20Var7 = (h20) obj;
                        h20Var7.getClass();
                        sa0 sa0Var9 = h20Var7.l == hmVar2 ? f20Var2.i : e20Var2.i;
                        if (sa0Var9 != null) {
                            return (i12) sa0Var9.i(h20Var7);
                        }
                        return null;
                    default:
                        h20 h20Var8 = (h20) obj;
                        h20Var8.getClass();
                        sa0 sa0Var10 = h20Var8.l == hmVar2 ? f20Var2.j : e20Var2.j;
                        if (sa0Var10 != null) {
                            return (Double) sa0Var10.i(h20Var8);
                        }
                        return null;
                }
            }
        };
        final int i6 = 5;
        e20Var.h = new sa0() { // from class: d20
            @Override // defpackage.sa0
            public final Object i(Object obj) {
                g12 g12Var;
                int i22 = i6;
                e20 e20Var2 = this;
                f20 f20Var2 = f20Var;
                hm hmVar2 = hm.f;
                switch (i22) {
                    case 0:
                        sa0 sa0Var = f20Var2.b;
                        h20 h20Var = (h20) obj;
                        h20Var.getClass();
                        sa0 sa0Var2 = h20Var.l == hmVar2 ? sa0Var : e20Var2.b;
                        return (sa0Var2 == null || (g12Var = (g12) sa0Var2.i(h20Var)) == null) ? (g12) sa0Var.i(h20Var) : g12Var;
                    case 1:
                        sa0 sa0Var3 = f20Var2.c;
                        h20 h20Var2 = (h20) obj;
                        h20Var2.getClass();
                        sa0 sa0Var4 = h20Var2.l == hmVar2 ? sa0Var3 : e20Var2.c;
                        return Double.valueOf(((Number) (sa0Var4 != null ? sa0Var4.i(h20Var2) : sa0Var3.i(h20Var2))).doubleValue());
                    case t91.FLOAT_FIELD_NUMBER /* 2 */:
                        h20 h20Var3 = (h20) obj;
                        h20Var3.getClass();
                        sa0 sa0Var5 = h20Var3.l == hmVar2 ? f20Var2.e : e20Var2.e;
                        return sa0Var5 != null ? (Double) sa0Var5.i(h20Var3) : Double.valueOf(1.0d);
                    case t91.INTEGER_FIELD_NUMBER /* 3 */:
                        h20 h20Var4 = (h20) obj;
                        h20Var4.getClass();
                        sa0 sa0Var6 = h20Var4.l == hmVar2 ? f20Var2.f : e20Var2.f;
                        if (sa0Var6 != null) {
                            return (f20) sa0Var6.i(h20Var4);
                        }
                        return null;
                    case t91.LONG_FIELD_NUMBER /* 4 */:
                        h20 h20Var5 = (h20) obj;
                        h20Var5.getClass();
                        sa0 sa0Var7 = h20Var5.l == hmVar2 ? f20Var2.g : e20Var2.g;
                        if (sa0Var7 != null) {
                            return (f20) sa0Var7.i(h20Var5);
                        }
                        return null;
                    case t91.STRING_FIELD_NUMBER /* 5 */:
                        h20 h20Var6 = (h20) obj;
                        h20Var6.getClass();
                        sa0 sa0Var8 = h20Var6.l == hmVar2 ? f20Var2.h : e20Var2.h;
                        if (sa0Var8 != null) {
                            return (ms) sa0Var8.i(h20Var6);
                        }
                        return null;
                    case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                        h20 h20Var7 = (h20) obj;
                        h20Var7.getClass();
                        sa0 sa0Var9 = h20Var7.l == hmVar2 ? f20Var2.i : e20Var2.i;
                        if (sa0Var9 != null) {
                            return (i12) sa0Var9.i(h20Var7);
                        }
                        return null;
                    default:
                        h20 h20Var8 = (h20) obj;
                        h20Var8.getClass();
                        sa0 sa0Var10 = h20Var8.l == hmVar2 ? f20Var2.j : e20Var2.j;
                        if (sa0Var10 != null) {
                            return (Double) sa0Var10.i(h20Var8);
                        }
                        return null;
                }
            }
        };
        final int i7 = 6;
        e20Var.i = new sa0() { // from class: d20
            @Override // defpackage.sa0
            public final Object i(Object obj) {
                g12 g12Var;
                int i22 = i7;
                e20 e20Var2 = this;
                f20 f20Var2 = f20Var;
                hm hmVar2 = hm.f;
                switch (i22) {
                    case 0:
                        sa0 sa0Var = f20Var2.b;
                        h20 h20Var = (h20) obj;
                        h20Var.getClass();
                        sa0 sa0Var2 = h20Var.l == hmVar2 ? sa0Var : e20Var2.b;
                        return (sa0Var2 == null || (g12Var = (g12) sa0Var2.i(h20Var)) == null) ? (g12) sa0Var.i(h20Var) : g12Var;
                    case 1:
                        sa0 sa0Var3 = f20Var2.c;
                        h20 h20Var2 = (h20) obj;
                        h20Var2.getClass();
                        sa0 sa0Var4 = h20Var2.l == hmVar2 ? sa0Var3 : e20Var2.c;
                        return Double.valueOf(((Number) (sa0Var4 != null ? sa0Var4.i(h20Var2) : sa0Var3.i(h20Var2))).doubleValue());
                    case t91.FLOAT_FIELD_NUMBER /* 2 */:
                        h20 h20Var3 = (h20) obj;
                        h20Var3.getClass();
                        sa0 sa0Var5 = h20Var3.l == hmVar2 ? f20Var2.e : e20Var2.e;
                        return sa0Var5 != null ? (Double) sa0Var5.i(h20Var3) : Double.valueOf(1.0d);
                    case t91.INTEGER_FIELD_NUMBER /* 3 */:
                        h20 h20Var4 = (h20) obj;
                        h20Var4.getClass();
                        sa0 sa0Var6 = h20Var4.l == hmVar2 ? f20Var2.f : e20Var2.f;
                        if (sa0Var6 != null) {
                            return (f20) sa0Var6.i(h20Var4);
                        }
                        return null;
                    case t91.LONG_FIELD_NUMBER /* 4 */:
                        h20 h20Var5 = (h20) obj;
                        h20Var5.getClass();
                        sa0 sa0Var7 = h20Var5.l == hmVar2 ? f20Var2.g : e20Var2.g;
                        if (sa0Var7 != null) {
                            return (f20) sa0Var7.i(h20Var5);
                        }
                        return null;
                    case t91.STRING_FIELD_NUMBER /* 5 */:
                        h20 h20Var6 = (h20) obj;
                        h20Var6.getClass();
                        sa0 sa0Var8 = h20Var6.l == hmVar2 ? f20Var2.h : e20Var2.h;
                        if (sa0Var8 != null) {
                            return (ms) sa0Var8.i(h20Var6);
                        }
                        return null;
                    case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                        h20 h20Var7 = (h20) obj;
                        h20Var7.getClass();
                        sa0 sa0Var9 = h20Var7.l == hmVar2 ? f20Var2.i : e20Var2.i;
                        if (sa0Var9 != null) {
                            return (i12) sa0Var9.i(h20Var7);
                        }
                        return null;
                    default:
                        h20 h20Var8 = (h20) obj;
                        h20Var8.getClass();
                        sa0 sa0Var10 = h20Var8.l == hmVar2 ? f20Var2.j : e20Var2.j;
                        if (sa0Var10 != null) {
                            return (Double) sa0Var10.i(h20Var8);
                        }
                        return null;
                }
            }
        };
        final int i8 = 7;
        e20Var.j = new sa0() { // from class: d20
            @Override // defpackage.sa0
            public final Object i(Object obj) {
                g12 g12Var;
                int i22 = i8;
                e20 e20Var2 = this;
                f20 f20Var2 = f20Var;
                hm hmVar2 = hm.f;
                switch (i22) {
                    case 0:
                        sa0 sa0Var = f20Var2.b;
                        h20 h20Var = (h20) obj;
                        h20Var.getClass();
                        sa0 sa0Var2 = h20Var.l == hmVar2 ? sa0Var : e20Var2.b;
                        return (sa0Var2 == null || (g12Var = (g12) sa0Var2.i(h20Var)) == null) ? (g12) sa0Var.i(h20Var) : g12Var;
                    case 1:
                        sa0 sa0Var3 = f20Var2.c;
                        h20 h20Var2 = (h20) obj;
                        h20Var2.getClass();
                        sa0 sa0Var4 = h20Var2.l == hmVar2 ? sa0Var3 : e20Var2.c;
                        return Double.valueOf(((Number) (sa0Var4 != null ? sa0Var4.i(h20Var2) : sa0Var3.i(h20Var2))).doubleValue());
                    case t91.FLOAT_FIELD_NUMBER /* 2 */:
                        h20 h20Var3 = (h20) obj;
                        h20Var3.getClass();
                        sa0 sa0Var5 = h20Var3.l == hmVar2 ? f20Var2.e : e20Var2.e;
                        return sa0Var5 != null ? (Double) sa0Var5.i(h20Var3) : Double.valueOf(1.0d);
                    case t91.INTEGER_FIELD_NUMBER /* 3 */:
                        h20 h20Var4 = (h20) obj;
                        h20Var4.getClass();
                        sa0 sa0Var6 = h20Var4.l == hmVar2 ? f20Var2.f : e20Var2.f;
                        if (sa0Var6 != null) {
                            return (f20) sa0Var6.i(h20Var4);
                        }
                        return null;
                    case t91.LONG_FIELD_NUMBER /* 4 */:
                        h20 h20Var5 = (h20) obj;
                        h20Var5.getClass();
                        sa0 sa0Var7 = h20Var5.l == hmVar2 ? f20Var2.g : e20Var2.g;
                        if (sa0Var7 != null) {
                            return (f20) sa0Var7.i(h20Var5);
                        }
                        return null;
                    case t91.STRING_FIELD_NUMBER /* 5 */:
                        h20 h20Var6 = (h20) obj;
                        h20Var6.getClass();
                        sa0 sa0Var8 = h20Var6.l == hmVar2 ? f20Var2.h : e20Var2.h;
                        if (sa0Var8 != null) {
                            return (ms) sa0Var8.i(h20Var6);
                        }
                        return null;
                    case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                        h20 h20Var7 = (h20) obj;
                        h20Var7.getClass();
                        sa0 sa0Var9 = h20Var7.l == hmVar2 ? f20Var2.i : e20Var2.i;
                        if (sa0Var9 != null) {
                            return (i12) sa0Var9.i(h20Var7);
                        }
                        return null;
                    default:
                        h20 h20Var8 = (h20) obj;
                        h20Var8.getClass();
                        sa0 sa0Var10 = h20Var8.l == hmVar2 ? f20Var2.j : e20Var2.j;
                        if (sa0Var10 != null) {
                            return (Double) sa0Var10.i(h20Var8);
                        }
                        return null;
                }
            }
        };
        return e20Var;
    }
}
