package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zl0 implements vu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vu0 b;
    public final /* synthetic */ em0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ vu0 e;

    public /* synthetic */ zl0(vu0 vu0Var, em0 em0Var, int i, vu0 vu0Var2, int i2) {
        this.a = i2;
        this.c = em0Var;
        this.d = i;
        this.e = vu0Var2;
        this.b = vu0Var;
    }

    @Override // defpackage.vu0
    public final Map a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    @Override // defpackage.vu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i;
        int i2 = this.a;
        vu0 vu0Var = this.e;
        int i3 = this.d;
        em0 em0Var = this.c;
        switch (i2) {
            case 0:
                em0Var.i = i3;
                vu0Var.b();
                iy0 iy0Var = em0Var.q;
                zx0 zx0Var = em0Var.p;
                long[] jArr = zx0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((255 & j) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    Object obj = zx0Var.b[i8];
                                    iu1 iu1Var = (iu1) zx0Var.c[i8];
                                    int i9 = iy0Var.i(obj);
                                    if (i9 < 0 || i9 >= em0Var.i) {
                                        if (i9 >= 0) {
                                            Object obj2 = pv.C;
                                            i = i5;
                                            Object[] objArr = iy0Var.e;
                                            Object obj3 = objArr[i9];
                                            objArr[i9] = obj2;
                                        } else {
                                            i = i5;
                                        }
                                        if (em0Var.n.b(obj)) {
                                            iu1Var.a();
                                        }
                                        zx0Var.l(i8);
                                    } else {
                                        i = i5;
                                    }
                                }
                                j >>= i;
                                i7++;
                                i5 = i;
                            }
                            if (i6 == i5) {
                                if (i4 != length) {
                                    i4++;
                                }
                            }
                        }
                    }
                }
                em0Var.g(em0Var.h);
                break;
            default:
                em0Var.h = i3;
                vu0Var.b();
                if (em0Var.e.l == null) {
                    em0Var.g(em0Var.h);
                }
                break;
        }
    }

    @Override // defpackage.vu0
    public final wa0 c() {
        switch (this.a) {
        }
        return this.b.c();
    }

    @Override // defpackage.vu0
    public final int d() {
        switch (this.a) {
        }
        return this.b.d();
    }

    @Override // defpackage.vu0
    public final sa0 e() {
        switch (this.a) {
        }
        return this.b.e();
    }

    @Override // defpackage.vu0
    public final sa0 f() {
        switch (this.a) {
        }
        return this.b.f();
    }

    @Override // defpackage.vu0
    public final int g() {
        switch (this.a) {
        }
        return this.b.g();
    }
}
