package defpackage;

import android.os.Build;
import android.view.View;
import com.reddit.secondpage.R;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class um0 implements xa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ um0(wa0 wa0Var, ds dsVar, xa0 xa0Var, ha0 ha0Var) {
        this.e = 1;
        this.f = wa0Var;
        this.g = dsVar;
        this.h = xa0Var;
        this.i = ha0Var;
    }

    @Override // defpackage.xa0
    public final Object f(Object obj, Object obj2, Object obj3) {
        bn0 bn0Var;
        tv0 tv0VarC;
        Object obj4;
        Object e9Var;
        Object objL;
        int i = this.e;
        t32 t32Var = t32.a;
        l91 l91Var = kp.a;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        switch (i) {
            case 0:
                bn0 bn0Var2 = (bn0) obj8;
                tv0 tv0Var = (tv0) obj7;
                on0 on0Var = (on0) obj6;
                fy0 fy0Var = (fy0) obj5;
                hh1 hh1Var = (hh1) obj;
                ob0 ob0Var = (ob0) obj2;
                ((Integer) obj3).getClass();
                Object objK = ob0Var.K();
                int i2 = 8;
                Object obj9 = objK;
                if (objK == l91Var) {
                    sm0 sm0Var = new sm0(hh1Var, new n8(fy0Var, 8));
                    ob0Var.f0(sm0Var);
                    obj9 = sm0Var;
                }
                sm0 sm0Var2 = (sm0) obj9;
                Object objK2 = ob0Var.K();
                Object obj10 = objK2;
                if (objK2 == l91Var) {
                    ku1 ku1Var = new ku1(new xg0(sm0Var2));
                    ob0Var.f0(ku1Var);
                    obj10 = ku1Var;
                }
                ku1 ku1Var2 = (ku1) obj10;
                if (bn0Var2 != null) {
                    ob0Var.W(1743490539);
                    ob0Var.W(887527095);
                    String str = Build.FINGERPRINT;
                    if (str == null || !str.equals("robolectric")) {
                        ob0Var.W(1345729441);
                        View view = (View) ob0Var.j(w4.f);
                        boolean zF = ob0Var.f(view);
                        Object objK3 = ob0Var.K();
                        if (zF || objK3 == l91Var) {
                            Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                            x91 o7Var = tag instanceof x91 ? (x91) tag : null;
                            if (o7Var == null) {
                                o7Var = new o7(view);
                                view.setTag(R.id.compose_prefetch_scheduler, o7Var);
                            }
                            objK3 = o7Var;
                            ob0Var.f0(objK3);
                        }
                        obj4 = (x91) objK3;
                        ob0Var.p(false);
                    } else {
                        ob0Var.W(1345548711);
                        Object objK4 = ob0Var.K();
                        if (objK4 == l91Var) {
                            objK4 = new y91();
                            ob0Var.f0(objK4);
                        }
                        obj4 = (y91) objK4;
                        ob0Var.p(false);
                    }
                    Object obj11 = obj4;
                    ob0Var.p(false);
                    Object[] objArr = {bn0Var2, sm0Var2, ku1Var2, obj11};
                    boolean zF2 = ob0Var.f(bn0Var2) | ob0Var.h(sm0Var2) | ob0Var.h(ku1Var2) | ob0Var.h(obj11);
                    Object objK5 = ob0Var.K();
                    if (zF2 || objK5 == l91Var) {
                        bn0Var = bn0Var2;
                        e9Var = new e9(bn0Var, sm0Var2, ku1Var2, obj11, 4);
                        ob0Var.f0(e9Var);
                    } else {
                        e9Var = objK5;
                        bn0Var = bn0Var2;
                    }
                    sa0 sa0Var = (sa0) e9Var;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
                    boolean zF3 = false;
                    for (Object obj12 : objArrCopyOf) {
                        zF3 |= ob0Var.f(obj12);
                    }
                    Object objK6 = ob0Var.K();
                    if (zF3 || objK6 == l91Var) {
                        ob0Var.f0(new xy(sa0Var));
                    }
                    ob0Var.p(false);
                } else {
                    bn0Var = bn0Var2;
                    ob0Var.W(1744076749);
                    ob0Var.p(false);
                }
                int i3 = cn0.a;
                if (bn0Var != null && (tv0VarC = tv0Var.c(new j22(bn0Var))) != null) {
                    tv0Var = tv0VarC;
                }
                boolean zF4 = ob0Var.f(sm0Var2) | ob0Var.f(on0Var);
                Object objK7 = ob0Var.K();
                Object obj13 = objK7;
                if (zF4 || objK7 == l91Var) {
                    fi fiVar = new fi(i2, sm0Var2, on0Var);
                    ob0Var.f0(fiVar);
                    obj13 = fiVar;
                }
                pv.d(ku1Var2, tv0Var, (wa0) obj13, ob0Var, 8);
                return t32Var;
            case 1:
                wa0 wa0Var = (wa0) obj8;
                ds dsVar = (ds) obj7;
                xa0 xa0Var = (xa0) obj6;
                ha0 ha0Var = (ha0) obj5;
                cs csVar = (cs) obj;
                ob0 ob0Var2 = (ob0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ob0Var2.f(csVar) ? 4 : 2;
                }
                if (ob0Var2.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String str2 = (String) wa0Var.h(ob0Var2, 0);
                    if (ct1.P(str2)) {
                        qg0.c("Label must not be blank");
                    }
                    dsVar.getClass();
                    s22.a.b(str2, Boolean.TRUE, csVar, xa0Var, ha0Var, ob0Var2, Integer.valueOf((iIntValue << 9) & 7168));
                } else {
                    ob0Var2.Q();
                }
                return t32Var;
            default:
                uq1 uq1Var = (uq1) obj8;
                jo0 jo0Var = (jo0) obj7;
                az1 az1Var = (az1) obj6;
                long j = az1Var.b;
                z01 z01Var = (z01) obj5;
                tv0 tv0Var2 = (tv0) obj;
                ob0 ob0Var3 = (ob0) obj2;
                ((Integer) obj3).getClass();
                ob0Var3.W(-84507373);
                boolean zBooleanValue = ((Boolean) ob0Var3.j(aq.y)).booleanValue();
                boolean zG = ob0Var3.g(zBooleanValue);
                Object objK8 = ob0Var3.K();
                if (zG || objK8 == l91Var) {
                    objK8 = new iu(zBooleanValue);
                    ob0Var3.f0(objK8);
                }
                iu iuVar = (iu) objK8;
                boolean z = uq1Var.a != 16;
                if (((co0) ((i72) ob0Var3.j(aq.u))).a() && jo0Var.b() && wz1.c(j) && z) {
                    ob0Var3.W(-707487962);
                    hb hbVar = az1Var.a;
                    wz1 wz1Var = new wz1(j);
                    boolean zH = ob0Var3.h(iuVar);
                    Object objK9 = ob0Var3.K();
                    if (zH || objK9 == l91Var) {
                        objK9 = new tv((Object) iuVar, (ks) (false ? 1 : 0), 13);
                        ob0Var3.f0(objK9);
                    }
                    wi0.j(hbVar, wz1Var, (wa0) objK9, ob0Var3);
                    boolean zH2 = ob0Var3.h(iuVar) | ob0Var3.h(z01Var) | ob0Var3.f(az1Var) | ob0Var3.h(jo0Var) | ob0Var3.f(uq1Var);
                    Object objK10 = ob0Var3.K();
                    if (zH2 || objK10 == l91Var) {
                        h2 h2Var = new h2(iuVar, z01Var, az1Var, jo0Var, uq1Var, 3);
                        ob0Var3.f0(h2Var);
                        objK10 = h2Var;
                    }
                    objL = pv.l(tv0Var2, (sa0) objK10);
                    ob0Var3.p(false);
                } else {
                    ob0Var3.W(-705473241);
                    ob0Var3.p(false);
                    objL = qv0.a;
                }
                ob0Var3.p(false);
                return objL;
        }
    }

    public /* synthetic */ um0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }
}
