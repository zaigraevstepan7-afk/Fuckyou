package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class uk extends m {
    public l81 O;
    public uf0 P;

    @Override // defpackage.cg0
    public final void C() {
        c1(true);
    }

    @Override // defpackage.cg0
    public final void F(g6 g6Var, f81 f81Var) {
        ArrayList arrayList = (ArrayList) g6Var.b;
        W0();
        if (this.z && this.D == null) {
            bc0 bc0Var = new bc0(this);
            L0(bc0Var);
            this.D = bc0Var;
        }
        int i = 0;
        if (f81Var != f81.f) {
            if (f81Var == f81.g) {
                if (this.P != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        uf0 uf0Var = (uf0) arrayList.get(i);
                        if (uf0Var.i && uf0Var != this.P) {
                            c1(true);
                            break;
                        }
                        i++;
                    }
                }
                if (xi0.o(this.E, "recognized")) {
                    this.E = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.P == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (al.m((uf0) arrayList.get(i2))) {
                    uf0 uf0Var2 = (uf0) arrayList.get(0);
                    uf0Var2.i = true;
                    this.P = uf0Var2;
                    if (this.z) {
                        this.E = "waiting";
                        U0(uf0Var2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            uf0 uf0Var3 = (uf0) arrayList.get(i3);
            if (uf0Var3.i || !uf0Var3.h || uf0Var3.d) {
                float fD = ((j62) hk.o(this, aq.t)).d();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    uf0 uf0Var4 = (uf0) arrayList.get(i4);
                    long j = uf0Var4.c;
                    uf0 uf0Var5 = this.P;
                    uf0Var5.getClass();
                    boolean z = Math.abs(w01.c(w01.d(j, uf0Var5.c))) > fD;
                    if (uf0Var4.i || z) {
                        c1(true);
                        return;
                    }
                }
                return;
            }
        }
        ((uf0) arrayList.get(0)).i = true;
        if (this.z) {
            this.E = "recognized";
            uf0 uf0Var6 = this.P;
            uf0Var6.getClass();
            T0(uf0Var6.c, true);
            a1();
        }
        this.P = null;
    }

    @Override // defpackage.m, defpackage.p81
    public final void I(e81 e81Var, f81 f81Var, long j) {
        super.I(e81Var, f81Var, j);
        if (f81Var != f81.f) {
            if (f81Var == f81.g) {
                if (this.O != null) {
                    List list = e81Var.a;
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        l81 l81Var = (l81) list.get(i);
                        if (l81Var.c() && l81Var != this.O) {
                            c1(false);
                            break;
                        }
                        i++;
                    }
                }
                if (xi0.o(this.E, "recognized")) {
                    this.E = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.O == null) {
            if (xv1.e(e81Var, true)) {
                l81 l81Var2 = (l81) e81Var.a.get(0);
                l81Var2.a();
                this.O = l81Var2;
                if (this.z) {
                    this.E = "waiting";
                    V0(l81Var2);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = e81Var.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!lk.s((l81) list2.get(i2))) {
                long jR0 = R0(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    l81 l81Var3 = (l81) list2.get(i3);
                    if (l81Var3.c() || lk.T(l81Var3, j, jR0)) {
                        c1(false);
                        return;
                    }
                }
                return;
            }
        }
        ((l81) list2.get(0)).a();
        if (this.z) {
            this.E = "recognized";
            l81 l81Var4 = this.O;
            l81Var4.getClass();
            T0(l81Var4.c, false);
            a1();
        }
        this.O = null;
    }

    @Override // defpackage.m
    public final boolean Y0(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.m
    public final void Z0(KeyEvent keyEvent) {
        a1();
    }

    public final void c1(boolean z) {
        if (z) {
            this.P = null;
        } else {
            this.O = null;
        }
        S0(z);
        this.E = "idle";
    }

    @Override // defpackage.p81
    public final void h0() {
        ce0 ce0Var;
        jx0 jx0Var = this.u;
        if (jx0Var != null && (ce0Var = this.H) != null) {
            jx0Var.b(new de0(ce0Var));
        }
        this.H = null;
        c1(false);
    }
}
