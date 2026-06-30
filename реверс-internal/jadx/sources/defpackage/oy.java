package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class oy extends zv1 {
    public int g;

    public oy(int i) {
        super(0L, false);
        this.g = i;
    }

    public abstract ks c();

    public Throwable f(Object obj) {
        on onVar = obj instanceof on ? (on) obj : null;
        if (onVar != null) {
            return onVar.a;
        }
        return null;
    }

    public final void i(Throwable th) throws IllegalAccessException, InvocationTargetException {
        al.B(c().e(), new zt("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        try {
            ks ksVarC = c();
            ksVarC.getClass();
            my myVar = (my) ksVarC;
            ls lsVar = myVar.i;
            Object obj = myVar.k;
            lt ltVarE = lsVar.e();
            Object objM = xi0.M(ltVarE, obj);
            oj0 oj0Var = null;
            p32 p32VarP0 = objM != xi0.b0 ? lk.p0(lsVar, ltVarE, objM) : null;
            try {
                lt ltVarE2 = lsVar.e();
                Object objJ = j();
                Throwable thF = f(objJ);
                if (thF == null) {
                    int i = this.g;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        oj0Var = (oj0) ltVarE2.l(v20.O);
                    }
                }
                if (oj0Var != null && !oj0Var.b()) {
                    CancellationException cancellationExceptionP = oj0Var.p();
                    b(cancellationExceptionP);
                    lsVar.g(xc.p(cancellationExceptionP));
                } else if (thF != null) {
                    lsVar.g(new oe1(thF));
                } else {
                    lsVar.g(h(objJ));
                }
                if (p32VarP0 == null || p32VarP0.q0()) {
                    xi0.G(ltVarE, objM);
                }
            } catch (Throwable th) {
                if (p32VarP0 == null || p32VarP0.q0()) {
                    xi0.G(ltVarE, objM);
                }
                throw th;
            }
        } catch (ly e) {
            al.B(c().e(), e.e);
        } catch (Throwable th2) {
            i(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object h(Object obj) {
        return obj;
    }
}
