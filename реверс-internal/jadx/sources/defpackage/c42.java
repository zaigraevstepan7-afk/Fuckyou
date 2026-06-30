package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class c42 extends e42 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c42(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.e42
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (!f42.g) {
                }
                break;
            default:
                if (!f42.g) {
                }
                break;
        }
        return f42.c(j, obj);
    }

    @Override // defpackage.e42
    public final double d(long j, Object obj) {
        switch (this.b) {
        }
        return Double.longBitsToDouble(g(j, obj));
    }

    @Override // defpackage.e42
    public final float e(long j, Object obj) {
        switch (this.b) {
        }
        return Float.intBitsToFloat(f(j, obj));
    }

    @Override // defpackage.e42
    public final void j(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!f42.g) {
                    f42.l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    f42.k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!f42.g) {
                    f42.l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    f42.k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // defpackage.e42
    public final void k(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!f42.g) {
                    f42.l(obj, j, b);
                } else {
                    f42.k(obj, j, b);
                }
                break;
            default:
                if (!f42.g) {
                    f42.l(obj, j, b);
                } else {
                    f42.k(obj, j, b);
                }
                break;
        }
    }

    @Override // defpackage.e42
    public final void l(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.e42
    public final void m(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                n(obj, j, Float.floatToIntBits(f));
                break;
            default:
                n(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.e42
    public final boolean r() {
        switch (this.b) {
        }
        return false;
    }
}
