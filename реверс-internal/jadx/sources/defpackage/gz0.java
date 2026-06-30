package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gz0 extends ey0 {
    public final ey0 o;
    public boolean p;

    public gz0(long j, yp1 yp1Var, sa0 sa0Var, sa0 sa0Var2, ey0 ey0Var) {
        super(j, yp1Var, sa0Var, sa0Var2);
        this.o = ey0Var;
        ey0Var.k();
    }

    @Override // defpackage.ey0, defpackage.sp1
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.ey0
    public final kd1 w() {
        gz0 gz0Var;
        ey0 ey0Var = this.o;
        if (ey0Var.m || ey0Var.c) {
            return new up1(this);
        }
        ay0 ay0Var = this.h;
        long j = this.b;
        HashMap mapB = ay0Var != null ? aq1.b(ey0Var.g(), this, this.o.d()) : null;
        Object obj = aq1.c;
        synchronized (obj) {
            try {
                aq1.c(this);
                if (ay0Var == null || ay0Var.d == 0) {
                    gz0Var = this;
                    gz0Var.a();
                } else {
                    gz0Var = this;
                    kd1 kd1VarZ = gz0Var.z(this.o.g(), ay0Var, mapB, this.o.d());
                    if (!kd1VarZ.equals(vp1.c)) {
                        return kd1VarZ;
                    }
                    ay0 ay0VarX = gz0Var.o.x();
                    if (ay0VarX != null) {
                        ay0VarX.j(ay0Var);
                    } else {
                        gz0Var.o.B(ay0Var);
                        gz0Var.h = null;
                    }
                }
                if (xi0.u(gz0Var.o.g(), j) < 0) {
                    gz0Var.o.v();
                }
                ey0 ey0Var2 = gz0Var.o;
                ey0Var2.r(ey0Var2.d().b(j).a(gz0Var.j));
                gz0Var.o.A(j);
                ey0 ey0Var3 = gz0Var.o;
                int i = gz0Var.d;
                gz0Var.d = -1;
                if (i >= 0) {
                    int[] iArr = ey0Var3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    ey0Var3.k = iArrCopyOf;
                } else {
                    ey0Var3.getClass();
                }
                ey0 ey0Var4 = gz0Var.o;
                yp1 yp1Var = gz0Var.j;
                ey0Var4.getClass();
                synchronized (obj) {
                    ey0Var4.j = ey0Var4.j.e(yp1Var);
                    ey0 ey0Var5 = gz0Var.o;
                    int[] iArr2 = gz0Var.k;
                    ey0Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = ey0Var5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        ey0Var5.k = iArr2;
                    }
                }
                gz0Var.m = true;
                if (!gz0Var.p) {
                    gz0Var.p = true;
                    gz0Var.o.l();
                }
                return vp1.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
