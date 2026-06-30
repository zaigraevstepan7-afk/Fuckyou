package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ll {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public ll(kl klVar) {
        this.a = 0;
        this.d = 0;
        Charset charset = ki0.a;
        this.e = klVar;
        klVar.f = this;
    }

    public void A(int i) throws ej0 {
        if ((this.b & 7) != i) {
            throw fj0.b();
        }
    }

    public boolean B() {
        int i;
        kl klVar = (kl) this.e;
        if (klVar.d() || (i = this.b) == this.c) {
            return false;
        }
        return klVar.C(i);
    }

    public vk1 a(int i) {
        return new vk1(ef1.l((pz1) this.e, i), i, 1L);
    }

    public int b() {
        return this.d - this.c;
    }

    public int c() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = ((kl) this.e).z();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public int d(int i) {
        return ((f31) this.e).f[this.c + i];
    }

    public Object e(int i) {
        return ((f31) this.e).h[this.d + i];
    }

    public void f(Object obj, si1 si1Var, l50 l50Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            si1Var.h(obj, this, l50Var);
            if (this.b == this.c) {
            } else {
                throw new fj0("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public void g(Object obj, si1 si1Var, l50 l50Var) throws fj0 {
        kl klVar = (kl) this.e;
        int iA = klVar.A();
        if (klVar.e >= 100) {
            throw new fj0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iJ = klVar.j(iA);
        klVar.e++;
        si1Var.h(obj, this, l50Var);
        klVar.b(0);
        klVar.e--;
        klVar.i(iJ);
    }

    public void h(ji0 ji0Var) throws fj0 {
        int iZ;
        kl klVar = (kl) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((mb1) ji0Var).add(Boolean.valueOf(klVar.k()));
                if (klVar.d()) {
                    return;
                } else {
                    iZ = klVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw fj0.b();
        }
        int iC = klVar.c() + klVar.A();
        do {
            ((mb1) ji0Var).add(Boolean.valueOf(klVar.k()));
        } while (klVar.c() < iC);
        z(iC);
    }

    public ji i() throws ej0 {
        A(2);
        return ((kl) this.e).l();
    }

    public void j(ji0 ji0Var) throws ej0 {
        int iZ;
        kl klVar = (kl) this.e;
        if ((this.b & 7) != 2) {
            throw fj0.b();
        }
        do {
            ((mb1) ji0Var).add(i());
            if (klVar.d()) {
                return;
            } else {
                iZ = klVar.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    public void k(ji0 ji0Var) throws fj0 {
        int iZ;
        kl klVar = (kl) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((mb1) ji0Var).add(Double.valueOf(klVar.m()));
                if (klVar.d()) {
                    return;
                } else {
                    iZ = klVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw fj0.b();
        }
        int iA = klVar.A();
        if ((iA & 7) != 0) {
            throw new fj0("Failed to parse the message.");
        }
        int iC = klVar.c() + iA;
        do {
            ((mb1) ji0Var).add(Double.valueOf(klVar.m()));
        } while (klVar.c() < iC);
    }

    public void l(ji0 ji0Var) throws fj0 {
        int iZ;
        kl klVar = (kl) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((mb1) ji0Var).add(Integer.valueOf(klVar.n()));
                if (klVar.d()) {
                    return;
                } else {
                    iZ = klVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw fj0.b();
        }
        int iC = klVar.c() + klVar.A();
        do {
            ((mb1) ji0Var).add(Integer.valueOf(klVar.n()));
        } while (klVar.c() < iC);
        z(iC);
    }

    public Object m(q92 q92Var, Class cls, l50 l50Var) throws fj0 {
        kl klVar = (kl) this.e;
        switch (q92Var.ordinal()) {
            case 0:
                A(1);
                return Double.valueOf(klVar.m());
            case 1:
                A(5);
                return Float.valueOf(klVar.q());
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                A(0);
                return Long.valueOf(klVar.s());
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                A(0);
                return Long.valueOf(klVar.B());
            case t91.LONG_FIELD_NUMBER /* 4 */:
                A(0);
                return Integer.valueOf(klVar.r());
            case t91.STRING_FIELD_NUMBER /* 5 */:
                A(1);
                return Long.valueOf(klVar.p());
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                A(5);
                return Integer.valueOf(klVar.o());
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                A(0);
                return Boolean.valueOf(klVar.k());
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                A(2);
                return klVar.y();
            case el.a /* 9 */:
            default:
                yc.p("unsupported field type.");
                return null;
            case el.b /* 10 */:
                A(2);
                si1 si1VarA = lb1.c.a(cls);
                xb0 xb0VarI = si1VarA.i();
                g(xb0VarI, si1VarA, l50Var);
                si1VarA.c(xb0VarI);
                return xb0VarI;
            case 11:
                return i();
            case el.c /* 12 */:
                A(0);
                return Integer.valueOf(klVar.A());
            case 13:
                A(0);
                return Integer.valueOf(klVar.n());
            case 14:
                A(5);
                return Integer.valueOf(klVar.t());
            case 15:
                A(1);
                return Long.valueOf(klVar.u());
            case 16:
                A(0);
                return Integer.valueOf(klVar.v());
            case 17:
                A(0);
                return Long.valueOf(klVar.w());
        }
    }

    public void n(ji0 ji0Var) throws fj0 {
        int iZ;
        kl klVar = (kl) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iA = klVar.A();
            if ((iA & 3) != 0) {
                throw new fj0("Failed to parse the message.");
            }
            int iC = klVar.c() + iA;
            do {
                ((mb1) ji0Var).add(Integer.valueOf(klVar.o()));
            } while (klVar.c() < iC);
            return;
        }
        if (i != 5) {
            throw fj0.b();
        }
        do {
            ((mb1) ji0Var).add(Integer.valueOf(klVar.o()));
            if (klVar.d()) {
                return;
            } else {
                iZ = klVar.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    public void o(ji0 ji0Var) throws fj0 {
        int iZ;
        kl klVar = (kl) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((mb1) ji0Var).add(Long.valueOf(klVar.p()));
                if (klVar.d()) {
                    return;
                } else {
                    iZ = klVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw fj0.b();
        }
        int iA = klVar.A();
        if ((iA & 7) != 0) {
            throw new fj0("Failed to parse the message.");
        }
        int iC = klVar.c() + iA;
        do {
            ((mb1) ji0Var).add(Long.valueOf(klVar.p()));
        } while (klVar.c() < iC);
    }

    public void p(ji0 ji0Var) throws fj0 {
        int iZ;
        kl klVar = (kl) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iA = klVar.A();
            if ((iA & 3) != 0) {
                throw new fj0("Failed to parse the message.");
            }
            int iC = klVar.c() + iA;
            do {
                ((mb1) ji0Var).add(Float.valueOf(klVar.q()));
            } while (klVar.c() < iC);
            return;
        }
        if (i != 5) {
            throw fj0.b();
        }
        do {
            ((mb1) ji0Var).add(Float.valueOf(klVar.q()));
            if (klVar.d()) {
                return;
            } else {
                iZ = klVar.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    public void q(ji0 ji0Var) throws fj0 {
        int iZ;
        kl klVar = (kl) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((mb1) ji0Var).add(Integer.valueOf(klVar.r()));
                if (klVar.d()) {
                    return;
                } else {
                    iZ = klVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw fj0.b();
        }
        int iC = klVar.c() + klVar.A();
        do {
            ((mb1) ji0Var).add(Integer.valueOf(klVar.r()));
        } while (klVar.c() < iC);
        z(iC);
    }

    public void r(ji0 ji0Var) throws fj0 {
        int iZ;
        kl klVar = (kl) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((mb1) ji0Var).add(Long.valueOf(klVar.s()));
                if (klVar.d()) {
                    return;
                } else {
                    iZ = klVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw fj0.b();
        }
        int iC = klVar.c() + klVar.A();
        do {
            ((mb1) ji0Var).add(Long.valueOf(klVar.s()));
        } while (klVar.c() < iC);
        z(iC);
    }

    public void s(ji0 ji0Var) throws fj0 {
        int iZ;
        kl klVar = (kl) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iA = klVar.A();
            if ((iA & 3) != 0) {
                throw new fj0("Failed to parse the message.");
            }
            int iC = klVar.c() + iA;
            do {
                ((mb1) ji0Var).add(Integer.valueOf(klVar.t()));
            } while (klVar.c() < iC);
            return;
        }
        if (i != 5) {
            throw fj0.b();
        }
        do {
            ((mb1) ji0Var).add(Integer.valueOf(klVar.t()));
            if (klVar.d()) {
                return;
            } else {
                iZ = klVar.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    public void t(ji0 ji0Var) throws fj0 {
        int iZ;
        kl klVar = (kl) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((mb1) ji0Var).add(Long.valueOf(klVar.u()));
                if (klVar.d()) {
                    return;
                } else {
                    iZ = klVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw fj0.b();
        }
        int iA = klVar.A();
        if ((iA & 7) != 0) {
            throw new fj0("Failed to parse the message.");
        }
        int iC = klVar.c() + iA;
        do {
            ((mb1) ji0Var).add(Long.valueOf(klVar.u()));
        } while (klVar.c() < iC);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "";
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
            default:
                return super.toString();
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                int i = this.b;
                pz1 pz1Var = (pz1) this.e;
                ee1 ee1VarL = ef1.l(pz1Var, i);
                int i2 = this.c;
                return "SelectionInfo(id=1, range=(" + i + "-" + ee1VarL + "," + i2 + "-" + ef1.l(pz1Var, i2) + "), prevOffset=" + this.d + ")";
        }
    }

    public void u(ji0 ji0Var) throws fj0 {
        int iZ;
        kl klVar = (kl) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((mb1) ji0Var).add(Integer.valueOf(klVar.v()));
                if (klVar.d()) {
                    return;
                } else {
                    iZ = klVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw fj0.b();
        }
        int iC = klVar.c() + klVar.A();
        do {
            ((mb1) ji0Var).add(Integer.valueOf(klVar.v()));
        } while (klVar.c() < iC);
        z(iC);
    }

    public void v(ji0 ji0Var) throws fj0 {
        int iZ;
        kl klVar = (kl) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((mb1) ji0Var).add(Long.valueOf(klVar.w()));
                if (klVar.d()) {
                    return;
                } else {
                    iZ = klVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw fj0.b();
        }
        int iC = klVar.c() + klVar.A();
        do {
            ((mb1) ji0Var).add(Long.valueOf(klVar.w()));
        } while (klVar.c() < iC);
        z(iC);
    }

    public void w(ji0 ji0Var, boolean z) throws ej0 {
        String strX;
        int iZ;
        kl klVar = (kl) this.e;
        if ((this.b & 7) != 2) {
            throw fj0.b();
        }
        do {
            if (z) {
                A(2);
                strX = klVar.y();
            } else {
                A(2);
                strX = klVar.x();
            }
            ((mb1) ji0Var).add(strX);
            if (klVar.d()) {
                return;
            } else {
                iZ = klVar.z();
            }
        } while (iZ == this.b);
        this.d = iZ;
    }

    public void x(ji0 ji0Var) throws fj0 {
        int iZ;
        kl klVar = (kl) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((mb1) ji0Var).add(Integer.valueOf(klVar.A()));
                if (klVar.d()) {
                    return;
                } else {
                    iZ = klVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw fj0.b();
        }
        int iC = klVar.c() + klVar.A();
        do {
            ((mb1) ji0Var).add(Integer.valueOf(klVar.A()));
        } while (klVar.c() < iC);
        z(iC);
    }

    public void y(ji0 ji0Var) throws fj0 {
        int iZ;
        kl klVar = (kl) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((mb1) ji0Var).add(Long.valueOf(klVar.B()));
                if (klVar.d()) {
                    return;
                } else {
                    iZ = klVar.z();
                }
            } while (iZ == this.b);
            this.d = iZ;
            return;
        }
        if (i != 2) {
            throw fj0.b();
        }
        int iC = klVar.c() + klVar.A();
        do {
            ((mb1) ji0Var).add(Long.valueOf(klVar.B()));
        } while (klVar.c() < iC);
        z(iC);
    }

    public void z(int i) throws fj0 {
        if (((kl) this.e).c() != i) {
            throw fj0.e();
        }
    }

    public /* synthetic */ ll() {
        this.a = 1;
    }

    public ll(f31 f31Var) {
        this.a = 2;
        this.e = f31Var;
    }

    public ll(int i, int i2, int i3, pz1 pz1Var) {
        this.a = 3;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = pz1Var;
    }
}
