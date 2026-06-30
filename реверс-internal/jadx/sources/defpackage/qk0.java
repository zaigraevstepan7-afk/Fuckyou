package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qk0 implements a20 {
    public final pk0 a;

    public qk0(pk0 pk0Var) {
        this.a = pk0Var;
    }

    @Override // defpackage.a20, defpackage.wa
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final k52 a(r22 r22Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        pk0 pk0Var = this.a;
        hx0 hx0Var = pk0Var.b;
        gx0 gx0Var = new gx0(hx0Var.e + 2);
        hx0 hx0Var2 = new hx0(hx0Var.e);
        int[] iArr3 = hx0Var.b;
        Object[] objArr3 = hx0Var.c;
        long[] jArr = hx0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            ok0 ok0Var = (ok0) objArr3[i6];
                            gx0Var.a(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            hx0Var2.i(i7, new j52((cb) r22Var.a.i(ok0Var.a), ok0Var.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!hx0Var.a(0)) {
            int i8 = gx0Var.b;
            if (i8 < 0) {
                yc.o("Index must be between 0 and size");
                return null;
            }
            gx0Var.b(i8 + 1);
            int[] iArr4 = gx0Var.a;
            int i9 = gx0Var.b;
            if (i9 != 0) {
                nd.K(1, 0, i9, iArr4, iArr4);
            }
            iArr4[0] = 0;
            gx0Var.b++;
        }
        if (!hx0Var.a(pk0Var.a)) {
            gx0Var.a(pk0Var.a);
        }
        int i10 = gx0Var.b;
        if (i10 != 0) {
            int[] iArr5 = gx0Var.a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i10);
        }
        return new k52(gx0Var, hx0Var2, pk0Var.a, k20.b);
    }
}
