package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l7 {
    public static final bq a = new bq(v4.n);
    public static final bq b = new bq(v4.m);

    /* JADX WARN: Removed duplicated region for block: B:103:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(y81 y81Var, ha0 ha0Var, z81 z81Var, jo joVar, ob0 ob0Var, int i, int i2) {
        int i3;
        ha0 ha0Var2;
        z81 z81Var2;
        ha0 ha0Var3;
        dc1 dc1VarR;
        int i4;
        String str;
        boolean z;
        al0 al0Var;
        y81 y81Var2 = y81Var;
        ob0Var.X(-1772091631);
        if ((i & 6) == 0) {
            i3 = (ob0Var.f(y81Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                ha0Var2 = ha0Var;
                i3 |= ob0Var.h(ha0Var2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                z81Var2 = z81Var;
                i3 |= ob0Var.f(z81Var2) ? 256 : 128;
            } else {
                z81Var2 = z81Var;
            }
            if ((i & 3072) == 0) {
                i3 |= ob0Var.h(joVar) ? 2048 : 1024;
            }
            if (ob0Var.N(i3 & 1, (i3 & 1171) == 1170)) {
                ob0Var.Q();
                ha0Var3 = ha0Var2;
            } else {
                ha0 ha0Var4 = i5 != 0 ? null : ha0Var2;
                View view = (View) ob0Var.j(w4.f);
                hx hxVar = (hx) ob0Var.j(aq.h);
                String str2 = (String) ob0Var.j(a);
                al0 al0Var2 = (al0) ob0Var.j(aq.n);
                mb0 mb0VarM = xk.M(ob0Var);
                fy0 fy0VarD = xc.D(joVar, ob0Var);
                Object[] objArr = new Object[0];
                Object objK = ob0Var.K();
                Object obj = kp.a;
                Object obj2 = objK;
                if (objK == obj) {
                    Object obj3 = v4.o;
                    ob0Var.f0(obj3);
                    obj2 = obj3;
                }
                UUID uuid = (UUID) kd1.w(objArr, (ha0) obj2, ob0Var);
                boolean zBooleanValue = ((Boolean) ob0Var.j(b)).booleanValue();
                Object objK2 = ob0Var.K();
                if (objK2 == obj) {
                    i4 = i3;
                    z = true;
                    str = str2;
                    v81 v81Var = new v81(ha0Var4, z81Var2, str, view, hxVar, y81Var2, uuid, zBooleanValue);
                    y81Var2 = y81Var2;
                    v81Var.o(mb0VarM, new jo(-297523940, true, new k7(v81Var, fy0VarD, true ? 1 : 0)));
                    ob0Var.f0(v81Var);
                    objK2 = v81Var;
                } else {
                    i4 = i3;
                    str = str2;
                    z = true;
                }
                v81 v81Var2 = (v81) objK2;
                int i6 = i4 & 112;
                int i7 = i4 & 896;
                boolean zH = ob0Var.h(v81Var2) | (i6 == 32 ? z : false) | (i7 == 256 ? z : false) | ob0Var.f(str) | ob0Var.d(al0Var2.ordinal());
                Object objK3 = ob0Var.K();
                if (zH != 0 || objK3 == obj) {
                    Object e7Var = new e7(v81Var2, ha0Var4, z81Var, str, al0Var2);
                    ob0Var.f0(e7Var);
                    objK3 = e7Var;
                }
                wi0.c(v81Var2, (sa0) objK3, ob0Var);
                boolean zH2 = ob0Var.h(v81Var2) | (i6 == 32 ? z : false) | (i7 == 256 ? z : false) | ob0Var.f(str) | ob0Var.d(al0Var2.ordinal());
                Object objK4 = ob0Var.K();
                if (zH2 != 0 || objK4 == obj) {
                    Object f7Var = new f7(v81Var2, ha0Var4, z81Var, str, al0Var2);
                    al0Var = al0Var2;
                    ob0Var.f0(f7Var);
                    objK4 = f7Var;
                } else {
                    al0Var = al0Var2;
                }
                wi0.m((ha0) objK4, ob0Var);
                boolean zH3 = ob0Var.h(v81Var2) | ((i4 & 14) == 4 ? z : false);
                Object objK5 = ob0Var.K();
                Object obj4 = objK5;
                if (zH3 != 0 || objK5 == obj) {
                    Object b7Var = new b7(2, v81Var2, y81Var2);
                    ob0Var.f0(b7Var);
                    obj4 = b7Var;
                }
                wi0.c(y81Var2, (sa0) obj4, ob0Var);
                boolean zH4 = ob0Var.h(v81Var2);
                Object objK6 = ob0Var.K();
                Object obj5 = objK6;
                if (zH4 || objK6 == obj) {
                    Object eVar = new e(v81Var2, null, 4);
                    ob0Var.f0(eVar);
                    obj5 = eVar;
                }
                wi0.i((wa0) obj5, ob0Var, v81Var2);
                boolean zH5 = ob0Var.h(v81Var2);
                Object objK7 = ob0Var.K();
                Object obj6 = objK7;
                if (zH5 || objK7 == obj) {
                    Object h7Var = new h7(v81Var2, 0);
                    ob0Var.f0(h7Var);
                    obj6 = h7Var;
                }
                tv0 tv0VarO = u4.o(qv0.a, (sa0) obj6);
                boolean zH6 = ob0Var.h(v81Var2) | ob0Var.d(al0Var.ordinal());
                Object objK8 = ob0Var.K();
                Object obj7 = objK8;
                if (zH6 || objK8 == obj) {
                    Object i7Var = new i7(v81Var2, al0Var);
                    ob0Var.f0(i7Var);
                    obj7 = i7Var;
                }
                uu0 uu0Var = (uu0) obj7;
                int iHashCode = Long.hashCode(ob0Var.T);
                b61 b61VarL = ob0Var.l();
                tv0 tv0VarP = bk.P(ob0Var, tv0VarO);
                ep.c.getClass();
                ha0 ha0Var5 = dp.b;
                ob0Var.Z();
                if (ob0Var.S) {
                    ob0Var.k(ha0Var5);
                } else {
                    ob0Var.i0();
                }
                xc.E(dp.f, ob0Var, uu0Var);
                xc.E(dp.e, ob0Var, b61VarL);
                xc.E(dp.g, ob0Var, Integer.valueOf(iHashCode));
                xc.C(ob0Var, dp.h);
                xc.E(dp.d, ob0Var, tv0VarP);
                ob0Var.p(z);
                ha0Var3 = ha0Var4;
            }
            dc1VarR = ob0Var.r();
            if (dc1VarR == null) {
                dc1VarR.d = new j7(y81Var2, ha0Var3, z81Var, joVar, i, i2);
                return;
            }
            return;
        }
        i3 |= 48;
        ha0Var2 = ha0Var;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) == 0) {
        }
        if (ob0Var.N(i3 & 1, (i3 & 1171) == 1170)) {
        }
        dc1VarR = ob0Var.r();
        if (dc1VarR == null) {
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
