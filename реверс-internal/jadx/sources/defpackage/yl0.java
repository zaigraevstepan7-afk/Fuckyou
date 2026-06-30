package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yl0 implements lu1 {
    public al0 e = al0.f;
    public float f;
    public float g;
    public final /* synthetic */ em0 h;

    public yl0(em0 em0Var) {
        this.h = em0Var;
    }

    @Override // defpackage.lu1
    public final List G(wa0 wa0Var, Object obj) {
        em0 em0Var = this.h;
        em0Var.h();
        ql0 ql0Var = em0Var.e;
        ml0 ml0Var = ql0Var.J.d;
        ml0 ml0Var2 = ml0.g;
        ml0 ml0Var3 = ml0.e;
        if (ml0Var != ml0Var3 && ml0Var != ml0Var2 && ml0Var != ml0.f && ml0Var != ml0.h) {
            ng0.b("subcompose can only be used inside the measure or layout blocks");
        }
        zx0 zx0Var = em0Var.k;
        Object objG = zx0Var.g(obj);
        if (objG == null) {
            objG = (ql0) em0Var.n.k(obj);
            if (objG != null) {
                if (em0Var.s <= 0) {
                    ng0.b("Check failed.");
                }
                em0Var.s--;
            } else {
                objG = em0Var.n(obj);
                if (objG == null) {
                    int i = em0Var.h;
                    ql0 ql0Var2 = new ql0(2);
                    ql0Var.t = true;
                    ql0Var.B(i, ql0Var2);
                    ql0Var.t = false;
                    objG = ql0Var2;
                }
            }
            zx0Var.m(obj, objG);
        }
        ql0 ql0Var3 = (ql0) objG;
        if (pl.e0(em0Var.h, ql0Var.o()) != ql0Var3) {
            int i2 = ((iy0) ((qx0) ql0Var.o()).f).i(ql0Var3);
            if (i2 < em0Var.h) {
                ng0.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = em0Var.h;
            if (i3 != i2) {
                em0Var.j(i2, i3);
            }
        }
        em0Var.h++;
        em0Var.m(ql0Var3, obj, false, wa0Var);
        return (ml0Var == ml0Var3 || ml0Var == ml0Var2) ? ql0Var3.m() : ql0Var3.l();
    }

    @Override // defpackage.hx
    public final float b() {
        return this.f;
    }

    @Override // defpackage.pi0
    public final al0 getLayoutDirection() {
        return this.e;
    }

    @Override // defpackage.hx
    public final float l() {
        return this.g;
    }

    @Override // defpackage.pi0
    public final boolean s() {
        ml0 ml0Var = this.h.e.J.d;
        return ml0Var == ml0.h || ml0Var == ml0.f;
    }

    @Override // defpackage.xu0
    public final vu0 u(int i, int i2, Map map, sa0 sa0Var) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ng0.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new xl0(i, i2, map, this, this.h, sa0Var);
    }
}
