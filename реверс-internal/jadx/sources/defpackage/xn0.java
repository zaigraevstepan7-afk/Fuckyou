package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xn0 implements jh1, hh1 {
    public final kh1 e;
    public final ih1 f;
    public final ay0 g;

    public xn0(jh1 jh1Var, Map map, ih1 ih1Var) {
        n nVar = new n(16, jh1Var);
        ys1 ys1Var = mh1.a;
        this.e = new kh1(map, nVar);
        this.f = ih1Var;
        ay0 ay0Var = qi1.a;
        this.g = new ay0();
    }

    @Override // defpackage.jh1
    public final oc a(String str, ha0 ha0Var) {
        return this.e.a(str, ha0Var);
    }

    @Override // defpackage.hh1
    public final void b(Object obj, jo joVar, ob0 ob0Var, int i) {
        int i2;
        ob0Var.X(-858296452);
        if ((i & 6) == 0) {
            i2 = (ob0Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ob0Var.h(joVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ob0Var.h(this) ? 256 : 128;
        }
        if (ob0Var.N(i2 & 1, (i2 & 147) != 146)) {
            this.f.b(obj, joVar, ob0Var, i2 & 126);
            boolean zH = ob0Var.h(this) | ob0Var.h(obj);
            Object objK = ob0Var.K();
            if (zH || objK == kp.a) {
                objK = new d(12, this, obj);
                ob0Var.f0(objK);
            }
            wi0.c(obj, (sa0) objK, ob0Var);
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new r7(this, obj, joVar, i, 8);
        }
    }

    @Override // defpackage.jh1
    public final boolean d(Object obj) {
        return this.e.d(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // defpackage.jh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map e() {
        ay0 ay0Var = this.g;
        Object[] objArr = ay0Var.b;
        long[] jArr = ay0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            ih1 ih1Var = this.f;
                            if (ih1Var.f.k(obj) == null) {
                                ih1Var.e.remove(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.e.e();
    }

    @Override // defpackage.jh1
    public final Object f(String str) {
        return this.e.f(str);
    }
}
