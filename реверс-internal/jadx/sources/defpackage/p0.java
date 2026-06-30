package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {
    public q0[] e;
    public int f;
    public int g;
    public ou1 h;

    public final q0 a() {
        q0 q0VarB;
        ou1 ou1Var;
        synchronized (this) {
            try {
                q0[] q0VarArrD = this.e;
                if (q0VarArrD == null) {
                    q0VarArrD = d();
                    this.e = q0VarArrD;
                } else if (this.f >= q0VarArrD.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(q0VarArrD, q0VarArrD.length * 2);
                    this.e = (q0[]) objArrCopyOf;
                    q0VarArrD = (q0[]) objArrCopyOf;
                }
                int i = this.g;
                do {
                    q0VarB = q0VarArrD[i];
                    if (q0VarB == null) {
                        q0VarB = b();
                        q0VarArrD[i] = q0VarB;
                    }
                    i++;
                    if (i >= q0VarArrD.length) {
                        i = 0;
                    }
                } while (!q0VarB.a(this));
                this.g = i;
                this.f++;
                ou1Var = this.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ou1Var != null) {
            ou1Var.x(1);
        }
        return q0VarB;
    }

    public abstract q0 b();

    public abstract q0[] d();

    public final void f(q0 q0Var) {
        ou1 ou1Var;
        int i;
        ks[] ksVarArrB;
        synchronized (this) {
            try {
                int i2 = this.f - 1;
                this.f = i2;
                ou1Var = this.h;
                if (i2 == 0) {
                    this.g = 0;
                }
                q0Var.getClass();
                ksVarArrB = q0Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (ks ksVar : ksVarArrB) {
            if (ksVar != null) {
                ksVar.g(t32.a);
            }
        }
        if (ou1Var != null) {
            ou1Var.x(-1);
        }
    }

    public final ou1 g() {
        ou1 ou1Var;
        synchronized (this) {
            ou1Var = this.h;
            if (ou1Var == null) {
                int i = this.f;
                ou1Var = new ou1(1, Integer.MAX_VALUE, ph.f);
                ou1Var.r(Integer.valueOf(i));
                this.h = ou1Var;
            }
        }
        return ou1Var;
    }
}
