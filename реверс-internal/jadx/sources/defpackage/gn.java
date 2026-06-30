package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gn implements lt, Serializable {
    public final lt e;
    public final jt f;

    public gn(jt jtVar, lt ltVar) {
        ltVar.getClass();
        jtVar.getClass();
        this.e = ltVar;
        this.f = jtVar;
    }

    public final boolean equals(Object obj) {
        boolean zO;
        if (this == obj) {
            return true;
        }
        if (obj instanceof gn) {
            gn gnVar = (gn) obj;
            int i = 2;
            gn gnVar2 = gnVar;
            int i2 = 2;
            while (true) {
                lt ltVar = gnVar2.e;
                gnVar2 = ltVar instanceof gn ? (gn) ltVar : null;
                if (gnVar2 == null) {
                    break;
                }
                i2++;
            }
            gn gnVar3 = this;
            while (true) {
                lt ltVar2 = gnVar3.e;
                gnVar3 = ltVar2 instanceof gn ? (gn) ltVar2 : null;
                if (gnVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    jt jtVar = this.f;
                    if (!xi0.o(gnVar.l(jtVar.getKey()), jtVar)) {
                        zO = false;
                        break;
                    }
                    lt ltVar3 = this.e;
                    if (!(ltVar3 instanceof gn)) {
                        ltVar3.getClass();
                        jt jtVar2 = (jt) ltVar3;
                        zO = xi0.o(gnVar.l(jtVar2.getKey()), jtVar2);
                        break;
                    }
                    this = (gn) ltVar3;
                }
                if (zO) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + this.e.hashCode();
    }

    @Override // defpackage.lt
    public final lt j(lt ltVar) {
        ltVar.getClass();
        return ltVar == d40.e ? this : (lt) ltVar.q(new pc(16, (byte) 0), this);
    }

    @Override // defpackage.lt
    public final jt l(kt ktVar) {
        ktVar.getClass();
        while (true) {
            jt jtVarL = this.f.l(ktVar);
            if (jtVarL != null) {
                return jtVarL;
            }
            lt ltVar = this.e;
            if (!(ltVar instanceof gn)) {
                return ltVar.l(ktVar);
            }
            this = (gn) ltVar;
        }
    }

    @Override // defpackage.lt
    public final Object q(wa0 wa0Var, Object obj) {
        return wa0Var.h(this.e.q(wa0Var, obj), this.f);
    }

    public final String toString() {
        return "[" + ((String) q(new pc(1, (byte) 0), "")) + ']';
    }

    @Override // defpackage.lt
    public final lt u(kt ktVar) {
        ktVar.getClass();
        jt jtVar = this.f;
        jt jtVarL = jtVar.l(ktVar);
        lt ltVar = this.e;
        if (jtVarL != null) {
            return ltVar;
        }
        lt ltVarU = ltVar.u(ktVar);
        return ltVarU == ltVar ? this : ltVarU == d40.e ? jtVar : new gn(jtVar, ltVarU);
    }
}
