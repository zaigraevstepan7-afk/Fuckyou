package p066g0;

/* JADX INFO: renamed from: g0.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0759k0 {

    /* JADX INFO: renamed from: a */
    public int f3034a;

    /* JADX INFO: renamed from: b */
    public int f3035b;

    /* JADX INFO: renamed from: c */
    public int f3036c;

    /* JADX INFO: renamed from: d */
    public int f3037d;

    /* JADX INFO: renamed from: e */
    public int f3038e;

    /* JADX INFO: renamed from: a */
    public final boolean m2091a() {
        int i2 = this.f3034a;
        int i3 = 2;
        if ((i2 & 7) != 0) {
            int i4 = this.f3037d;
            int i5 = this.f3035b;
            if (((i4 > i5 ? 1 : i4 == i5 ? 2 : 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 112) != 0) {
            int i6 = this.f3037d;
            int i7 = this.f3036c;
            if ((((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) << 4) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 1792) != 0) {
            int i8 = this.f3038e;
            int i9 = this.f3035b;
            if ((((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) << 8) & i2) == 0) {
                return false;
            }
        }
        if ((i2 & 28672) != 0) {
            int i10 = this.f3038e;
            int i11 = this.f3036c;
            if (i10 > i11) {
                i3 = 1;
            } else if (i10 != i11) {
                i3 = 4;
            }
            if ((i2 & (i3 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
