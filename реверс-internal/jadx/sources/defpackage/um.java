package defpackage;

import android.view.View;
import com.reddit.secondpage.R;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class um implements sa0 {
    public final /* synthetic */ int e;

    public /* synthetic */ um(int i) {
        this.e = i;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        double dW;
        int i = this.e;
        g20 g20Var = g20.h;
        double dW2 = 90.0d;
        u42 u42Var = u42.f;
        u42 u42Var2 = u42.g;
        u42 u42Var3 = u42.h;
        u42 u42Var4 = u42.i;
        g20 g20Var2 = g20.g;
        switch (i) {
            case 0:
                h20 h20Var = (h20) obj;
                h20Var.getClass();
                return h20Var.e;
            case 1:
                vm vmVar = xi0.v;
                ((h20) obj).getClass();
                return vmVar.r();
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ((h20) obj).getClass();
                return l91.i(7.0d);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                h20 h20Var2 = (h20) obj;
                h20Var2.getClass();
                return h20Var2.h;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                h20 h20Var3 = (h20) obj;
                h20Var3.getClass();
                return Double.valueOf(h20Var3.j == g20Var2 ? h20Var3.c ? 6.0d : h20Var3.h.c.b() ? 98.0d : h20Var3.b == u42Var3 ? 95.0d : 96.0d : 15.0d);
            case t91.STRING_FIELD_NUMBER /* 5 */:
                h20 h20Var4 = (h20) obj;
                Double dValueOf = Double.valueOf(1.3d);
                h20Var4.getClass();
                if (h20Var4.j == g20Var2) {
                    u42 u42Var5 = h20Var4.b;
                    if (u42Var5 == u42Var) {
                        return dValueOf;
                    }
                    if (u42Var5 == u42Var2) {
                        return Double.valueOf(1.25d);
                    }
                    if (u42Var5 == u42Var4) {
                        return h20Var4.h.c.b() ? dValueOf : Double.valueOf(1.15d);
                    }
                    if (u42Var5 == u42Var3) {
                        return Double.valueOf(1.08d);
                    }
                }
                return Double.valueOf(1.0d);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                h20 h20Var5 = (h20) obj;
                h20Var5.getClass();
                return h20Var5.h;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                h20 h20Var6 = (h20) obj;
                h20Var6.getClass();
                return Double.valueOf(h20Var6.c ? 98.0d : 4.0d);
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                h20 h20Var7 = (h20) obj;
                h20Var7.getClass();
                return h20Var7.h;
            case el.a /* 9 */:
                h20 h20Var8 = (h20) obj;
                h20Var8.getClass();
                if (h20Var8.j != g20Var2) {
                    dW2 = 25.0d;
                } else if (h20Var8.c) {
                    dW2 = 12.0d;
                } else if (h20Var8.h.c.b()) {
                    dW2 = 94.0d;
                } else if (h20Var8.b != u42Var3) {
                    dW2 = 92.0d;
                }
                return Double.valueOf(dW2);
            case el.b /* 10 */:
                h20 h20Var9 = (h20) obj;
                h20Var9.getClass();
                if (h20Var9.j == g20Var2) {
                    u42 u42Var6 = h20Var9.b;
                    if (u42Var6 == u42Var) {
                        return Double.valueOf(1.9d);
                    }
                    if (u42Var6 == u42Var2) {
                        return Double.valueOf(1.5d);
                    }
                    if (u42Var6 == u42Var4) {
                        return h20Var9.h.c.b() ? Double.valueOf(1.95d) : Double.valueOf(1.45d);
                    }
                    if (u42Var6 == u42Var3) {
                        return Double.valueOf(1.22d);
                    }
                }
                return Double.valueOf(1.0d);
            case 11:
                h20 h20Var10 = (h20) obj;
                h20Var10.getClass();
                return h20Var10.f;
            case el.c /* 12 */:
                vm vmVar2 = xi0.v;
                ((h20) obj).getClass();
                return vmVar2.v();
            case 13:
                ((h20) obj).getClass();
                return l91.i(4.5d);
            case 14:
                h20 h20Var11 = (h20) obj;
                h20Var11.getClass();
                return h20Var11.k;
            case 15:
                vm vmVar3 = xi0.v;
                ((h20) obj).getClass();
                return vmVar3.c();
            case 16:
                h20 h20Var12 = (h20) obj;
                h20Var12.getClass();
                return h20Var12.j == g20Var2 ? l91.i(4.5d) : l91.i(7.0d);
            case 17:
                h20 h20Var13 = (h20) obj;
                h20Var13.getClass();
                return h20Var13.f;
            case 18:
                h20 h20Var14 = (h20) obj;
                h20Var14.getClass();
                g12 g12Var = h20Var14.f;
                boolean z = h20Var14.c;
                if (h20Var14.j == g20Var) {
                    dW2 = 30.0d;
                } else {
                    u42 u42Var7 = h20Var14.b;
                    if (u42Var7 == u42Var3) {
                        dW2 = z ? l91.x(g12Var, 30.0d, 40.0d) : l91.w(g12Var, 84.0d, 90.0d);
                    } else if (u42Var7 == u42Var4) {
                        dW2 = z ? 15.0d : l91.w(g12Var, 90.0d, 95.0d);
                    } else if (z) {
                        dW2 = 25.0d;
                    }
                }
                return Double.valueOf(dW2);
            case 19:
                h20 h20Var15 = (h20) obj;
                h20Var15.getClass();
                return h20Var15.j == g20Var2 ? l91.i(4.5d) : l91.i(7.0d);
            case 20:
                h20 h20Var16 = (h20) obj;
                h20Var16.getClass();
                if (h20Var16.j != g20Var2 || h20Var16.d <= 0.0d) {
                    return null;
                }
                return l91.i(1.5d);
            case 21:
                h20 h20Var17 = (h20) obj;
                h20Var17.getClass();
                return h20Var17.h;
            case 22:
                h20 h20Var18 = (h20) obj;
                h20Var18.getClass();
                if (h20Var18.j != g20Var2) {
                    return Double.valueOf(1.0d);
                }
                u42 u42Var8 = h20Var18.b;
                return Double.valueOf(u42Var8 == u42Var ? 2.2d : u42Var8 == u42Var2 ? 1.7d : u42Var8 == u42Var4 ? h20Var18.h.c.b() ? h20Var18.c ? 3.0d : 2.3d : 1.6d : 1.0d);
            case 23:
                vm vmVar4 = xi0.v;
                h20 h20Var19 = (h20) obj;
                h20Var19.getClass();
                return h20Var19.j == g20Var2 ? h20Var19.c ? vmVar4.w() : vmVar4.x() : vmVar4.H();
            case 24:
                h20 h20Var20 = (h20) obj;
                h20Var20.getClass();
                return h20Var20.j == g20Var2 ? l91.i(3.0d) : l91.i(4.5d);
            case 25:
                h20 h20Var21 = (h20) obj;
                h20Var21.getClass();
                return h20Var21.g;
            case 26:
                h20 h20Var22 = (h20) obj;
                h20Var22.getClass();
                g12 g12Var2 = h20Var22.g;
                boolean z2 = h20Var22.c;
                g20 g20Var3 = h20Var22.j;
                u42 u42Var9 = h20Var22.b;
                if (g20Var3 == g20Var) {
                    dW = u42Var9 == u42Var2 ? l91.w(g12Var2, 0.0d, 90.0d) : l91.w(g12Var2, 0.0d, 100.0d);
                } else if (u42Var9 == u42Var) {
                    dW = z2 ? l91.w(g12Var2, 0.0d, 93.0d) : l91.w(g12Var2, 0.0d, 96.0d);
                } else {
                    if (u42Var9 == u42Var2) {
                        dW = l91.w(g12Var2, 0.0d, z2 ? 93 : 100);
                    } else if (u42Var9 == u42Var4) {
                        if (g12Var2.c.a()) {
                            i = 88;
                        } else if (z2) {
                            i = 93;
                        }
                        dW = l91.w(g12Var2, 75.0d, i);
                    } else {
                        dW = z2 ? l91.w(g12Var2, 0.0d, 93.0d) : l91.w(g12Var2, 72.0d, 100.0d);
                    }
                }
                return Double.valueOf(dW);
            case 27:
                View view = ((v62) ((up) obj).B(ae0.a)).a;
                while (view != null) {
                    Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
                    if (tag != null) {
                        return tag;
                    }
                    Object objS = af1.s(view);
                    view = objS instanceof View ? (View) objS : null;
                }
                return null;
            case 28:
                String str = (String) obj;
                str.getClass();
                return ct1.X(str).toString();
            default:
                String str2 = (String) obj;
                str2.getClass();
                return s91.l("'", jt1.J(str2, "'", "'\"'\"'"), "'");
        }
    }
}
