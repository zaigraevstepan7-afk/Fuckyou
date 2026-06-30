package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fs implements xa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ fs(ha0 ha0Var, sa0 sa0Var) {
        this.e = 1;
        this.g = ha0Var;
        this.f = sa0Var;
    }

    @Override // defpackage.xa0
    public final Object f(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        int i = this.e;
        ks ksVar = null;
        t32 t32Var = t32.a;
        l91 l91Var = kp.a;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                sa0 sa0Var = (sa0) obj5;
                cs csVar = (cs) obj4;
                ob0 ob0Var = (ob0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (ob0Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Object objK = ob0Var.K();
                    if (objK == l91Var) {
                        objK = new ds();
                        ob0Var.f0(objK);
                    }
                    ds dsVar = (ds) objK;
                    dsVar.a.clear();
                    sa0Var.i(dsVar);
                    dsVar.a(csVar, ob0Var, 0);
                } else {
                    ob0Var.Q();
                }
                return t32Var;
            case 1:
                ha0 ha0Var = (ha0) obj4;
                sa0 sa0Var2 = (sa0) obj5;
                ob0 ob0Var2 = (ob0) obj2;
                ((Integer) obj3).getClass();
                ob0Var2.W(759876635);
                Object objK2 = ob0Var2.K();
                if (objK2 == l91Var) {
                    objK2 = xc.s(ha0Var);
                    ob0Var2.f0(objK2);
                }
                ns1 ns1Var = (ns1) objK2;
                Object objK3 = ob0Var2.K();
                if (objK3 == l91Var) {
                    objK3 = new h9(new w01(((w01) ns1Var.getValue()).a), kl1.b, new w01(kl1.c), 8);
                    ob0Var2.f0(objK3);
                }
                h9 h9Var = (h9) objK3;
                boolean zH = ob0Var2.h(h9Var);
                Object objK4 = ob0Var2.K();
                if (zH || objK4 == l91Var) {
                    objK4 = new g(ns1Var, h9Var, ksVar, 15);
                    ob0Var2.f0(objK4);
                }
                wi0.i((wa0) objK4, ob0Var2, t32Var);
                xa xaVar = h9Var.c;
                boolean zF = ob0Var2.f(xaVar);
                Object objK5 = ob0Var2.K();
                if (zF || objK5 == l91Var) {
                    objK5 = new il1(xaVar, 0);
                    ob0Var2.f0(objK5);
                }
                tv0 tv0Var = (tv0) sa0Var2.i((ha0) objK5);
                ob0Var2.p(false);
                return tv0Var;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                Spannable spannable = (Spannable) obj5;
                u6 u6Var = (u6) obj4;
                zq1 zq1Var = (zq1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                lv1 lv1Var = zq1Var.f;
                aa0 aa0Var = zq1Var.c;
                if (aa0Var == null) {
                    aa0Var = aa0.g;
                }
                y90 y90Var = zq1Var.d;
                int i2 = y90Var != null ? y90Var.a : 0;
                z90 z90Var = zq1Var.e;
                int i3 = z90Var != null ? z90Var.a : 65535;
                v6 v6Var = u6Var.e;
                d32 d32VarB = ((d90) v6Var.e).b(lv1Var, aa0Var, i2, i3);
                if (d32VarB instanceof d32) {
                    Object obj6 = d32VarB.e;
                    obj6.getClass();
                    typeface = (Typeface) obj6;
                } else {
                    oc ocVar = new oc(d32VarB, v6Var.j);
                    v6Var.j = ocVar;
                    Object obj7 = ocVar.c;
                    obj7.getClass();
                    typeface = (Typeface) obj7;
                }
                spannable.setSpan(new f90(1, typeface), iIntValue2, iIntValue3, 33);
                return t32Var;
            default:
                dy1 dy1Var = (dy1) obj5;
                jx0 jx0Var = (jx0) obj4;
                ob0 ob0Var3 = (ob0) obj2;
                ((Integer) obj3).getClass();
                ob0Var3.W(-102778667);
                Object objK6 = ob0Var3.K();
                if (objK6 == l91Var) {
                    objK6 = wi0.v(ob0Var3);
                    ob0Var3.f0(objK6);
                }
                vt vtVar = (vt) objK6;
                Object objK7 = ob0Var3.K();
                if (objK7 == l91Var) {
                    objK7 = xc.B(null);
                    ob0Var3.f0(objK7);
                }
                fy0 fy0Var = (fy0) objK7;
                fy0 fy0VarD = xc.D(dy1Var, ob0Var3);
                boolean zF2 = ob0Var3.f(jx0Var);
                Object objK8 = ob0Var3.K();
                if (zF2 || objK8 == l91Var) {
                    objK8 = new d(fy0Var, jx0Var);
                    ob0Var3.f0(objK8);
                }
                wi0.c(jx0Var, (sa0) objK8, ob0Var3);
                boolean zH2 = ob0Var3.h(vtVar) | ob0Var3.f(jx0Var) | ob0Var3.f(fy0VarD);
                Object objK9 = ob0Var3.K();
                if (zH2 || objK9 == l91Var) {
                    objK9 = new hy1(vtVar, fy0Var, jx0Var, fy0VarD);
                    ob0Var3.f0(objK9);
                }
                tv0 tv0VarA = bv1.a(qv0.a, jx0Var, (PointerInputEventHandler) objK9);
                ob0Var3.p(false);
                return tv0VarA;
        }
    }

    public /* synthetic */ fs(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
