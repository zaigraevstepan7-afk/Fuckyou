package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class s extends vj0 implements ks, vt {
    public final lt i;

    public s(lt ltVar, boolean z) {
        super(z);
        S((oj0) ltVar.l(v20.O));
        this.i = ltVar.j(this);
    }

    @Override // defpackage.vj0
    public final String F() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.vj0
    public final void R(pn pnVar) throws IllegalAccessException, InvocationTargetException {
        al.B(this.i, pnVar);
    }

    @Override // defpackage.vj0
    public final void a0(Object obj) {
        if (!(obj instanceof on)) {
            n0(obj);
        } else {
            on onVar = (on) obj;
            m0(onVar.a, on.b.get(onVar) == 1);
        }
    }

    @Override // defpackage.ks
    public final lt e() {
        return this.i;
    }

    @Override // defpackage.vt
    public final lt f() {
        return this.i;
    }

    @Override // defpackage.ks
    public final void g(Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thA = pe1.a(obj);
        if (thA != null) {
            obj = new on(thA, false);
        }
        Object objW = W(obj);
        if (objW == s22.j) {
            return;
        }
        A(objW);
    }

    public final void o0(yt ytVar, s sVar, wa0 wa0Var) {
        Object objH;
        int iOrdinal = ytVar.ordinal();
        t32 t32Var = t32.a;
        if (iOrdinal == 0) {
            try {
                s22.H(bl.E(bl.t(sVar, this, wa0Var)), t32Var);
                return;
            } finally {
                th = th;
                if (th instanceof ly) {
                    th = ((ly) th).e;
                }
                g(xc.p(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                wa0Var.getClass();
                bl.E(bl.t(sVar, this, wa0Var)).g(t32Var);
                return;
            }
            if (iOrdinal != 3) {
                ez1.a();
                return;
            }
            try {
                lt ltVar = this.i;
                Object objM = xi0.M(ltVar, null);
                try {
                    if (wa0Var instanceof ye) {
                        s22.i(2, wa0Var);
                        objH = wa0Var.h(sVar, this);
                    } else {
                        objH = bl.X(wa0Var, sVar, this);
                    }
                    xi0.G(ltVar, objM);
                    if (objH != wt.e) {
                        g(objH);
                    }
                } catch (Throwable th) {
                    xi0.G(ltVar, objM);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public void n0(Object obj) {
    }

    public void m0(Throwable th, boolean z) {
    }
}
