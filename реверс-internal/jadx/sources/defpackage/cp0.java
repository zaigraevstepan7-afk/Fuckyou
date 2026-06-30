package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cp0 extends o62 {
    public final hx0 b;

    public cp0() {
        hx0 hx0Var = nh0.a;
        this.b = new hx0();
    }

    @Override // defpackage.o62
    public final void d() {
        hx0 hx0Var = this.b;
        int[] iArr = hx0Var.b;
        Object[] objArr = hx0Var.c;
        long[] jArr = hx0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        sx0 sx0Var = (sx0) objArr[i4];
                        Object[] objArr2 = sx0Var.a;
                        int i6 = sx0Var.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            bp0 bp0Var = (bp0) objArr2[i7];
                            zi ziVar = bp0Var.d;
                            if (ziVar != null) {
                                ziVar.cancel();
                            }
                            bp0Var.d = null;
                            ot0 ot0Var = (ot0) bp0Var.a.f;
                            ot0Var.f = true;
                            ot0Var.e = false;
                            ot0Var.a();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
