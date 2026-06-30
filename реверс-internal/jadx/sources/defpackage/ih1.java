package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ih1 implements hh1 {
    public static final n81 i = new n81(4, new pc(25, 0), new mt(26));
    public final Map e;
    public final zx0 f;
    public jh1 g;
    public final n h;

    public ih1(Map map) {
        this.e = map;
        long[] jArr = pi1.a;
        this.f = new zx0();
        this.h = new n(21, this);
    }

    @Override // defpackage.hh1
    public final void b(Object obj, jo joVar, ob0 ob0Var, int i2) {
        int i3;
        ob0Var.X(533563200);
        if ((i2 & 6) == 0) {
            i3 = (ob0Var.h(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ob0Var.h(joVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ob0Var.h(this) ? 256 : 128;
        }
        if (ob0Var.N(i3 & 1, (i3 & 147) != 146)) {
            ob0Var.Y(obj);
            Object objK = ob0Var.K();
            l91 l91Var = kp.a;
            if (objK == l91Var) {
                n nVar = this.h;
                if (!((Boolean) nVar.i(obj)).booleanValue()) {
                    yc.f(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
                Map map = (Map) this.e.get(obj);
                ys1 ys1Var = mh1.a;
                nh1 nh1Var = new nh1(new kh1(map, nVar));
                ob0Var.f0(nh1Var);
                objK = nh1Var;
            }
            nh1 nh1Var2 = (nh1) objK;
            lk.j(new pb1[]{mh1.a.a(nh1Var2), xr0.a.a(nh1Var2)}, joVar, ob0Var, (i3 & 112) | 8);
            boolean zH = ob0Var.h(this) | ob0Var.h(obj) | ob0Var.h(nh1Var2);
            Object objK2 = ob0Var.K();
            if (zH || objK2 == l91Var) {
                objK2 = new kf(this, obj, nh1Var2, 12);
                ob0Var.f0(objK2);
            }
            wi0.c(t32.a, (sa0) objK2, ob0Var);
            if (ob0Var.y && ob0Var.G.i == ob0Var.z) {
                ob0Var.z = -1;
                ob0Var.y = false;
            }
            ob0Var.p(false);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new r7(this, obj, joVar, i2, 10);
        }
    }
}
