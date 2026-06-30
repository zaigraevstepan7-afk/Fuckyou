package p066g0;

/* JADX INFO: renamed from: g0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0740b {

    /* JADX INFO: renamed from: a */
    public long f2928a = 0;

    /* JADX INFO: renamed from: b */
    public C0740b f2929b;

    /* JADX INFO: renamed from: a */
    public final void m2039a(int i2) {
        if (i2 < 64) {
            this.f2928a &= ~(1 << i2);
            return;
        }
        C0740b c0740b = this.f2929b;
        if (c0740b != null) {
            c0740b.m2039a(i2 - 64);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m2040b(int i2) {
        C0740b c0740b = this.f2929b;
        if (c0740b == null) {
            return i2 >= 64 ? Long.bitCount(this.f2928a) : Long.bitCount(this.f2928a & ((1 << i2) - 1));
        }
        if (i2 < 64) {
            return Long.bitCount(this.f2928a & ((1 << i2) - 1));
        }
        return Long.bitCount(this.f2928a) + c0740b.m2040b(i2 - 64);
    }

    /* JADX INFO: renamed from: c */
    public final void m2041c() {
        if (this.f2929b == null) {
            this.f2929b = new C0740b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2042d(int i2) {
        if (i2 < 64) {
            return (this.f2928a & (1 << i2)) != 0;
        }
        m2041c();
        return this.f2929b.m2042d(i2 - 64);
    }

    /* JADX INFO: renamed from: e */
    public final void m2043e(int i2, boolean z2) {
        if (i2 >= 64) {
            m2041c();
            this.f2929b.m2043e(i2 - 64, z2);
            return;
        }
        long j2 = this.f2928a;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i2) - 1;
        this.f2928a = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            m2046h(i2);
        } else {
            m2039a(i2);
        }
        if (z3 || this.f2929b != null) {
            m2041c();
            this.f2929b.m2043e(0, z3);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2044f(int i2) {
        if (i2 >= 64) {
            m2041c();
            return this.f2929b.m2044f(i2 - 64);
        }
        long j2 = 1 << i2;
        long j3 = this.f2928a;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f2928a = j4;
        long j5 = j2 - 1;
        this.f2928a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0740b c0740b = this.f2929b;
        if (c0740b != null) {
            if (c0740b.m2042d(0)) {
                m2046h(63);
            }
            this.f2929b.m2044f(0);
        }
        return z2;
    }

    /* JADX INFO: renamed from: g */
    public final void m2045g() {
        this.f2928a = 0L;
        C0740b c0740b = this.f2929b;
        if (c0740b != null) {
            c0740b.m2045g();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2046h(int i2) {
        if (i2 < 64) {
            this.f2928a |= 1 << i2;
        } else {
            m2041c();
            this.f2929b.m2046h(i2 - 64);
        }
    }

    public final String toString() {
        if (this.f2929b == null) {
            return Long.toBinaryString(this.f2928a);
        }
        return this.f2929b.toString() + "xx" + Long.toBinaryString(this.f2928a);
    }
}
