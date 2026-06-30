package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {
    public Object a;

    public /* synthetic */ l1(Object obj) {
        this.a = obj;
    }

    public void a(yh0 yh0Var) {
        Object obj = this.a;
        if (obj == null) {
            this.a = yh0Var;
            return;
        }
        if (obj instanceof ay0) {
            ((ay0) obj).a(yh0Var);
            return;
        }
        if (obj.equals(yh0Var)) {
            return;
        }
        ay0 ay0Var = qi1.a;
        ay0 ay0Var2 = new ay0(2);
        ay0Var2.k((yh0) obj);
        ay0Var2.k(yh0Var);
        this.a = ay0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(yh0 yh0Var) {
        Object obj = this.a;
        if (xi0.o(obj, yh0Var)) {
            this.a = null;
            return;
        }
        if (obj instanceof ay0) {
            ay0 ay0Var = (ay0) obj;
            ay0Var.l(yh0Var);
            int i = ay0Var.d;
            if (i == 0) {
                this.a = null;
                return;
            }
            if (i != 1) {
                return;
            }
            Object[] objArr = ay0Var.b;
            long[] jArr = ay0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                this.a = objArr[(i2 << 3) + i4];
                                return;
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            yc.h("The ScatterSet is empty");
        }
    }
}
