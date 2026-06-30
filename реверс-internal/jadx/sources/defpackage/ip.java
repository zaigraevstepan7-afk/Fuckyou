package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import com.reddit.secondpage.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ip {
    public final View a;
    public boolean b;
    public op c;
    public xo0 d;
    public vh1 e;
    public t62 f;
    public final bf0 g;
    public final fe1 h;
    public final Configuration i;
    public final fy0 j;
    public final l91 k;
    public final l91 l;
    public final xg0 m;
    public final p3 n;
    public final b90 o;
    public final fy0 p;
    public final id0 q;
    public final a9 r;
    public final sl0 s;
    public final co0 t;
    public final fj u;
    public int v;
    public final hp w;

    public ip(ip ipVar, View view, op opVar, xo0 xo0Var, vh1 vh1Var, t62 t62Var) {
        bf0 bf0Var;
        Configuration configuration;
        fy0 fy0VarB;
        l91 l91Var;
        l91 l91Var2;
        xg0 xg0Var;
        p3 p3Var;
        b90 l91Var3;
        fy0 v41Var;
        a9 a9Var;
        fj fjVar;
        sl0 sl0Var;
        fe1 fe1Var;
        View view2;
        boolean zO = xi0.o((ipVar == null || (view2 = ipVar.a) == null) ? null : view2.getContext(), view.getContext());
        this.a = view;
        this.c = opVar;
        this.d = xo0Var;
        this.e = vh1Var;
        this.f = t62Var;
        if (zO) {
            ipVar.getClass();
            bf0Var = ipVar.g;
        } else {
            bf0Var = new bf0();
        }
        this.g = bf0Var;
        this.h = (ipVar == null || (fe1Var = ipVar.h) == null) ? new fe1() : fe1Var;
        if (zO) {
            ipVar.getClass();
            configuration = ipVar.i;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.i = configuration;
        if (zO) {
            ipVar.getClass();
            fy0VarB = ipVar.j;
        } else {
            fy0VarB = xc.B(new Configuration(configuration));
        }
        this.j = fy0VarB;
        if (zO) {
            ipVar.getClass();
            l91Var = ipVar.k;
        } else {
            Context context = view.getContext();
            l91Var = new l91(16);
            Object systemService = context.getSystemService("accessibility");
            systemService.getClass();
        }
        this.k = l91Var;
        if (zO) {
            ipVar.getClass();
            l91Var2 = ipVar.l;
        } else {
            view.getContext();
            l91Var2 = new l91(20);
        }
        this.l = l91Var2;
        if (zO) {
            ipVar.getClass();
            xg0Var = ipVar.m;
        } else {
            xg0Var = new xg0(view.getContext(), 2);
        }
        this.m = xg0Var;
        if (zO) {
            ipVar.getClass();
            p3Var = ipVar.n;
        } else {
            p3Var = new p3(xg0Var);
        }
        this.n = p3Var;
        if (zO) {
            ipVar.getClass();
            l91Var3 = ipVar.o;
        } else {
            view.getContext();
            l91Var3 = new l91(19);
        }
        this.o = l91Var3;
        if (zO) {
            ipVar.getClass();
            v41Var = ipVar.p;
        } else {
            v41Var = new v41(al.r(view.getContext()), l91.f);
        }
        this.p = v41Var;
        this.q = view == (ipVar != null ? ipVar.a : null) ? ipVar.q : new d71(view);
        if (zO) {
            ipVar.getClass();
            a9Var = ipVar.r;
        } else {
            a9Var = new a9(ViewConfiguration.get(view.getContext()));
        }
        this.r = a9Var;
        this.s = (ipVar == null || (sl0Var = ipVar.s) == null) ? new sl0() : sl0Var;
        this.t = new co0();
        this.u = (ipVar == null || (fjVar = ipVar.u) == null) ? new fj() : fjVar;
        new a7(3, this);
        this.w = new hp(this);
    }

    public final void a(h4 h4Var, wa0 wa0Var, ob0 ob0Var, int i) {
        ob0Var.X(123858079);
        int i2 = (ob0Var.h(h4Var) ? 4 : 2) | i | (ob0Var.h(wa0Var) ? 32 : 16) | (ob0Var.h(this) ? 256 : 128);
        boolean z = false;
        int i3 = 1;
        if (ob0Var.N(i2 & 1, (i2 & 147) != 146)) {
            Object tag = h4Var.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof yj0) && !(tag instanceof bk0))) ? null : (Set) tag;
            if (set == null) {
                Object parent = h4Var.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof yj0) && !(tag2 instanceof bk0))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(ob0Var.v());
                ob0Var.q = true;
                ob0Var.C = true;
                ob0Var.c.b();
                ob0Var.H.b();
                mp1 mp1Var = ob0Var.I;
                jp1 jp1Var = mp1Var.a;
                mp1Var.e = jp1Var.n;
                mp1Var.f = jp1Var.o;
            }
            Object objK = ob0Var.K();
            l91 l91Var = kp.a;
            if (objK == l91Var) {
                f();
                vh1 vh1Var = this.e;
                vh1Var.getClass();
                Object parent2 = h4Var.getParent();
                parent2.getClass();
                View view2 = (View) parent2;
                Object tag3 = view2.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag3 instanceof String ? (String) tag3 : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view2.getId());
                }
                String str = "SaveableStateRegistry:" + strValueOf;
                n81 n81VarC = vh1Var.c();
                Bundle bundleH = n81VarC.h(str);
                if (bundleH != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleH.keySet()) {
                        ArrayList parcelableArrayList = bundleH.getParcelableArrayList(str2);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                }
                a4 a4Var = a4.z;
                ys1 ys1Var = mh1.a;
                kh1 kh1Var = new kh1(linkedHashMap, a4Var);
                if (n81VarC.i(str) == null) {
                    try {
                        n81VarC.n(str, new un(i3, kh1Var));
                        z = true;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                bz bzVar = new bz(kh1Var, new cz(z, n81VarC, str));
                ob0Var.f0(bzVar);
                objK = bzVar;
            }
            bz bzVar2 = (bz) objK;
            boolean zH = ob0Var.h(bzVar2);
            Object objK2 = ob0Var.K();
            if (zH || objK2 == l91Var) {
                objK2 = new g3(8, bzVar2);
                ob0Var.f0(objK2);
            }
            wi0.c(t32.a, (sa0) objK2, ob0Var);
            bq bqVar = aq.x;
            boolean zBooleanValue = ((Boolean) ob0Var.j(bqVar)).booleanValue() | h4Var.getScrollCaptureInProgress$ui();
            boolean zF = ob0Var.f(h4Var.getView());
            Object objK3 = ob0Var.K();
            if (zF || objK3 == l91Var) {
                objK3 = new v62(h4Var.getView());
                ob0Var.f0(objK3);
            }
            v62 v62Var = (v62) objK3;
            boolean zF2 = ob0Var.f(h4Var.getView());
            Object objK4 = ob0Var.K();
            if (zF2 || objK4 == l91Var) {
                objK4 = new c8(h4Var.getView());
                ob0Var.f0(objK4);
            }
            pb1 pb1VarA = tr0.a.a(c());
            nb1 nb1Var = xr0.a;
            f();
            vh1 vh1Var2 = this.e;
            vh1Var2.getClass();
            lk.j(new pb1[]{pb1VarA, nb1Var.a(vh1Var2), w4.d.a(this.g), w4.e.a(this.h), aq.v.a((wq1) objK4), w4.b.a(h4Var.getContext()), jh0.a.a(set), w4.a.a(h4Var.getConfiguration()), mh1.a.a(bzVar2), w4.f.a(h4Var.getView()), bqVar.a(Boolean.valueOf(zBooleanValue)), aq.t.a(h4Var.getViewConfiguration()), ae0.a.a(v62Var)}, lk.d0(1317454175, new gp(h4Var, this, wa0Var), ob0Var), ob0Var, 56);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new gp(this, h4Var, wa0Var, i);
        }
    }

    public final void b() {
        int i = this.v - 1;
        this.v = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.v = 0;
        }
        if (this.v == 0) {
            View view = this.a;
            Context context = view.getContext();
            hp hpVar = this.w;
            context.unregisterComponentCallbacks(hpVar);
            this.t.getClass();
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(hpVar);
        }
    }

    public final xo0 c() {
        f();
        xo0 xo0Var = this.d;
        xo0Var.getClass();
        return xo0Var;
    }

    public final void d() {
        int i = this.v + 1;
        this.v = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            hp hpVar = this.w;
            context.registerComponentCallbacks(hpVar);
            e(view.getResources().getConfiguration());
            this.t.a.setValue(Boolean.valueOf(view.hasWindowFocus()));
            view.getViewTreeObserver().addOnWindowFocusChangeListener(hpVar);
        }
    }

    public final void e(Configuration configuration) {
        int iUpdateFrom = this.i.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.g.a.entrySet().iterator();
            while (it.hasNext()) {
                ze0 ze0Var = (ze0) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (ze0Var == null || Configuration.needNewResources(iUpdateFrom, ze0Var.b)) {
                    it.remove();
                }
            }
            this.j.setValue(new Configuration(configuration));
            fe1 fe1Var = this.h;
            synchronized (fe1Var) {
                fe1Var.a.c();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.p.setValue(al.r(this.a.getContext()));
            }
            if ((805248384 & iUpdateFrom) != 0) {
                this.t.getClass();
            }
        }
    }

    public final void f() {
        if (this.b) {
            return;
        }
        this.b = true;
        op opVar = this.c;
        View view = this.a;
        if (opVar == null) {
            op opVarA = l92.a(view);
            if (opVarA == null) {
                Object parent = view.getParent();
                while (opVarA == null && (parent instanceof View)) {
                    View view2 = (View) parent;
                    opVarA = l92.a(view2);
                    parent = af1.s(view2);
                }
            }
            if (opVarA == null) {
                opVarA = l92.b(view);
            }
            this.c = opVarA;
        }
        if (this.d == null) {
            xo0 xo0VarI = ef1.i(view);
            if (xo0VarI == null) {
                yc.l("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            this.d = xo0VarI;
        }
        if (this.e == null) {
            vh1 vh1VarN = qc1.n(view);
            if (vh1VarN == null) {
                yc.l("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return;
            }
            this.e = vh1VarN;
        }
        if (this.f == null) {
            this.f = uc1.k(view);
        }
    }
}
