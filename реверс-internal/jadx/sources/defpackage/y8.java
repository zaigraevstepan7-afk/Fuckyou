package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class y8 implements jt {
    public final /* synthetic */ int e;
    public final Object f;
    public final Object g;

    public y8(y8 y8Var) {
        this.e = 2;
        this.f = y8Var;
        this.g = new tk0();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sa0 sa0Var, ks ksVar) {
        u51 u51Var;
        boolean z;
        Object objT;
        int i = 3;
        switch (this.e) {
            case 0:
                w8 w8Var = (w8) this.g;
                xi xiVar = new xi(1, bl.E(ksVar));
                xiVar.v();
                x8 x8Var = new x8(xiVar, this, sa0Var);
                if (xi0.o(w8Var.g, (Choreographer) this.f)) {
                    synchronized (w8Var.i) {
                        w8Var.k.add(x8Var);
                        if (!w8Var.n) {
                            w8Var.n = true;
                            w8Var.g.postFrameCallback(w8Var.o);
                        }
                        break;
                    }
                    xiVar.x(new b7(i, w8Var, x8Var));
                } else {
                    ((Choreographer) this.f).postFrameCallback(x8Var);
                    xiVar.x(new b7(4, this, x8Var));
                }
                return xiVar.t();
            case 1:
                xi xiVar2 = new xi(1, bl.E(ksVar));
                xiVar2.v();
                me meVar = (me) this.g;
                jh jhVar = new jh();
                jhVar.a = xiVar2;
                jhVar.b = sa0Var;
                xiVar2.x(new kh(0, meVar.d(jhVar, (ec1) this.f)));
                return xiVar2.t();
            default:
                if (ksVar instanceof u51) {
                    u51Var = (u51) ksVar;
                    int i2 = u51Var.k;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        u51Var.k = i2 - Integer.MIN_VALUE;
                    } else {
                        u51Var = new u51(this, ksVar);
                    }
                }
                Object obj = u51Var.i;
                wt wtVar = wt.e;
                int i3 = u51Var.k;
                if (i3 == 0) {
                    xc.G(obj);
                    tk0 tk0Var = (tk0) this.g;
                    u51Var.h = sa0Var;
                    u51Var.k = 1;
                    synchronized (tk0Var.b) {
                        z = tk0Var.a;
                    }
                    if (z) {
                        objT = t32.a;
                    } else {
                        xi xiVar3 = new xi(1, bl.E(u51Var));
                        xiVar3.v();
                        synchronized (tk0Var.b) {
                            ((ArrayList) tk0Var.c).add(xiVar3);
                        }
                        xiVar3.x(new cr(i, tk0Var, xiVar3));
                        objT = xiVar3.t();
                        if (objT != wtVar) {
                            objT = t32.a;
                        }
                    }
                    if (objT != wtVar) {
                    }
                    return wtVar;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        xc.G(obj);
                        return obj;
                    }
                    yc.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sa0Var = u51Var.h;
                xc.G(obj);
                y8 y8Var = (y8) this.f;
                u51Var.h = null;
                u51Var.k = 2;
                Object objC = y8Var.c(sa0Var, u51Var);
                if (objC != wtVar) {
                    return objC;
                }
                return wtVar;
        }
    }

    @Override // defpackage.jt
    public kt getKey() {
        return v20.P;
    }

    @Override // defpackage.lt
    public final lt j(lt ltVar) {
        switch (this.e) {
        }
        return hk.L(this, ltVar);
    }

    @Override // defpackage.lt
    public final jt l(kt ktVar) {
        switch (this.e) {
        }
        return hk.v(this, ktVar);
    }

    @Override // defpackage.lt
    public final Object q(wa0 wa0Var, Object obj) {
        switch (this.e) {
        }
        return wa0Var.h(obj, this);
    }

    @Override // defpackage.lt
    public final lt u(kt ktVar) {
        switch (this.e) {
        }
        return hk.J(this, ktVar);
    }

    public y8(Choreographer choreographer, w8 w8Var) {
        this.e = 0;
        this.f = choreographer;
        this.g = w8Var;
    }

    public y8(ec1 ec1Var) {
        this.e = 1;
        this.f = ec1Var;
        this.g = new me();
    }
}
