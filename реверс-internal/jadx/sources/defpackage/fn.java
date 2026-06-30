package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class fn extends m {
    public final lx0 O;
    public final lx0 P;
    public l81 Q;
    public jr1 R;
    public jr1 S;
    public boolean T;
    public boolean U;
    public long V;
    public boolean W;
    public uf0 X;
    public jr1 Y;
    public jr1 Z;
    public boolean a0;
    public boolean b0;
    public long c0;
    public boolean d0;

    public fn(ha0 ha0Var, pf0 pf0Var, jx0 jx0Var, boolean z) {
        super(jx0Var, pf0Var, false, z, null, null, ha0Var);
        int i = is0.a;
        this.O = new lx0(6);
        this.P = new lx0(6);
        this.V = -1L;
        this.c0 = -1L;
    }

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
            if (f81Var != f81.g || this.X == null || this.b0) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                uf0 uf0Var = (uf0) arrayList.get(i);
                if (uf0Var.i && uf0Var != this.X) {
                    c1(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.X == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (al.m((uf0) arrayList.get(i2))) {
                    uf0 uf0Var2 = (uf0) arrayList.get(0);
                    uf0Var2.i = true;
                    this.X = uf0Var2;
                    if (this.z) {
                        jr1 jr1Var = this.Z;
                        if (jr1Var != null && jr1Var.b()) {
                            ((j62) hk.o(this, aq.t)).getClass();
                            if (uf0Var2.b - this.c0 < 40) {
                                this.d0 = true;
                                return;
                            }
                            this.a0 = true;
                            jr1 jr1Var2 = this.Z;
                            if (jr1Var2 != null) {
                                jr1Var2.a(null);
                            }
                            this.Z = null;
                        }
                        this.b0 = false;
                        U0(uf0Var2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.b0) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                uf0 uf0Var3 = (uf0) arrayList.get(i3);
                if (!uf0Var3.h || uf0Var3.d) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((uf0) arrayList.get(i)).i = true;
                        i++;
                    }
                    return;
                }
            }
            uf0 uf0Var4 = (uf0) arrayList.get(0);
            uf0Var4.i = true;
            long j = uf0Var4.b;
            uf0 uf0Var5 = this.X;
            uf0Var5.getClass();
            d1(j, uf0Var5);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            uf0 uf0Var6 = (uf0) arrayList.get(i4);
            if (uf0Var6.i || !uf0Var6.h || uf0Var6.d) {
                float fD = ((j62) hk.o(this, aq.t)).d();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    uf0 uf0Var7 = (uf0) arrayList.get(i5);
                    long j2 = uf0Var7.c;
                    uf0 uf0Var8 = this.X;
                    uf0Var8.getClass();
                    boolean z = Math.abs(w01.c(w01.d(j2, uf0Var8.c))) > fD;
                    if (uf0Var7.i || z) {
                        c1(true);
                        return;
                    }
                }
                return;
            }
        }
        uf0 uf0Var9 = (uf0) arrayList.get(0);
        uf0Var9.i = true;
        long j3 = uf0Var9.b;
        uf0 uf0Var10 = this.X;
        uf0Var10.getClass();
        d1(j3, uf0Var10);
    }

    @Override // defpackage.sv0
    public final void F0() {
        f1();
    }

    @Override // defpackage.m, defpackage.p81
    public final void I(e81 e81Var, f81 f81Var, long j) {
        super.I(e81Var, f81Var, j);
        if (f81Var != f81.f) {
            if (f81Var != f81.g || this.Q == null || this.U) {
                return;
            }
            List list = e81Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                l81 l81Var = (l81) list.get(i);
                if (l81Var.c() && l81Var != this.Q) {
                    c1(false);
                    return;
                }
            }
            return;
        }
        if (this.Q == null) {
            if (xv1.e(e81Var, true)) {
                l81 l81Var2 = (l81) e81Var.a.get(0);
                l81Var2.a();
                this.Q = l81Var2;
                if (this.z) {
                    jr1 jr1Var = this.S;
                    if (jr1Var != null && jr1Var.b()) {
                        ((j62) hk.o(this, aq.t)).getClass();
                        if (l81Var2.b - this.V < 40) {
                            this.W = true;
                            return;
                        }
                        this.T = true;
                        jr1 jr1Var2 = this.S;
                        if (jr1Var2 != null) {
                            jr1Var2.a(null);
                        }
                        this.S = null;
                    }
                    this.U = false;
                    V0(l81Var2);
                    return;
                }
                return;
            }
            return;
        }
        int i2 = e81Var.c;
        List list2 = e81Var.a;
        if (this.U) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (!lk.t((l81) list2.get(i3))) {
                    int size3 = list2.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        ((l81) list2.get(i4)).a();
                    }
                    return;
                }
            }
            l81 l81Var3 = (l81) list2.get(0);
            l81Var3.a();
            long j2 = l81Var3.b;
            l81 l81Var4 = this.Q;
            l81Var4.getClass();
            e1(j2, l81Var4);
            return;
        }
        int size4 = list2.size();
        for (int i5 = 0; i5 < size4; i5++) {
            if (!lk.s((l81) list2.get(i5))) {
                long jR0 = R0(j);
                int size5 = list2.size();
                for (int i6 = 0; i6 < size5; i6++) {
                    l81 l81Var5 = (l81) list2.get(i6);
                    if (l81Var5.c() || lk.T(l81Var5, j, jR0)) {
                        c1(false);
                        return;
                    }
                }
                return;
            }
        }
        l81 l81Var6 = (l81) list2.get(0);
        l81Var6.a();
        long j3 = l81Var6.b;
        l81 l81Var7 = this.Q;
        l81Var7.getClass();
        e1(j3, l81Var7);
    }

    @Override // defpackage.m
    public final void X0() {
        f1();
    }

    @Override // defpackage.m
    public final boolean Y0(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.m
    public final void Z0(KeyEvent keyEvent) {
        long jA = bl.A(keyEvent);
        lx0 lx0Var = this.O;
        boolean z = false;
        if (lx0Var.d(jA) != null) {
            oj0 oj0Var = (oj0) lx0Var.d(jA);
            if (oj0Var != null) {
                if (oj0Var.b()) {
                    oj0Var.a(null);
                } else {
                    z = true;
                }
            }
            lx0Var.f(jA);
        }
        if (z) {
            return;
        }
        a1();
    }

    public final void c1(boolean z) {
        if (z) {
            this.X = null;
            jr1 jr1Var = this.Y;
            if (jr1Var != null) {
                jr1Var.a(null);
            }
            this.Y = null;
            jr1 jr1Var2 = this.Z;
            if (jr1Var2 != null) {
                jr1Var2.a(null);
            }
            this.Z = null;
            this.a0 = false;
            this.b0 = false;
            this.c0 = -1L;
            this.d0 = false;
        } else {
            this.Q = null;
            jr1 jr1Var3 = this.R;
            if (jr1Var3 != null) {
                jr1Var3.a(null);
            }
            this.R = null;
            jr1 jr1Var4 = this.S;
            if (jr1Var4 != null) {
                jr1Var4.a(null);
            }
            this.S = null;
            this.T = false;
            this.U = false;
            this.V = -1L;
            this.W = false;
        }
        S0(z);
    }

    public final void d1(long j, uf0 uf0Var) {
        if (this.z && !this.d0) {
            T0(uf0Var.c, true);
            this.c0 = j;
            if (!this.b0 && !this.a0) {
                a1();
            }
        }
        this.X = null;
        this.d0 = false;
        this.a0 = false;
        jr1 jr1Var = this.Y;
        if (jr1Var != null) {
            jr1Var.a(null);
        }
        this.Y = null;
        this.b0 = false;
    }

    public final void e1(long j, l81 l81Var) {
        if (this.z && !this.W) {
            T0(l81Var.c, false);
            this.V = j;
            if (!this.U && !this.T) {
                a1();
            }
        }
        this.Q = null;
        this.W = false;
        this.T = false;
        jr1 jr1Var = this.R;
        if (jr1Var != null) {
            jr1Var.a(null);
        }
        this.R = null;
        this.U = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1() {
        char c;
        long j;
        long j2;
        char c2;
        lx0 lx0Var = this.O;
        Object[] objArr = lx0Var.c;
        long[] jArr = lx0Var.a;
        int length = jArr.length - 2;
        char c3 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            c2 = c3;
                            ((oj0) objArr[(i << 3) + i3]).a(null);
                        } else {
                            c2 = c3;
                        }
                        j3 >>= 8;
                        i3++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                }
                if (i == length) {
                    break;
                }
                i++;
                c3 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        lx0Var.a();
        lx0 lx0Var2 = this.P;
        Object[] objArr2 = lx0Var2.c;
        long[] jArr2 = lx0Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((en) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 == length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        lx0Var2.a();
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

    @Override // defpackage.m
    public final void O0(am1 am1Var) {
    }
}
