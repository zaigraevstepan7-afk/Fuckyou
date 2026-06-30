package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yt1 {
    public lh A;
    public long B;
    public lh C;
    public boolean D;
    public ym1 E;
    public Object F;
    public Object G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public wl T;
    public long U;
    public lh V;
    public uz1 W;
    public fz1 X;
    public long Y;
    public long Z;
    public long a;
    public long a0;
    public int b;
    public float b0;
    public float c;
    public int c0;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float p;
    public float q;
    public float r;
    public float s;
    public lh y;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public float v = Float.NaN;
    public float w = Float.NaN;
    public long x = vl.b;
    public long z = vl.f;

    public yt1() {
        long j = vl.g;
        this.B = j;
        this.E = pv.w;
        this.H = 1.0f;
        this.I = 1.0f;
        this.J = 1.0f;
        long j2 = u12.b;
        this.P = Float.intBitsToFloat((int) (j2 >> 32));
        this.Q = Float.intBitsToFloat((int) (j2 & 4294967295L));
        this.R = 1.0f;
        this.U = j;
        this.W = uz1.c;
        long j3 = g02.c;
        this.Y = j3;
        this.Z = j3;
        this.a0 = j3;
        this.b0 = Float.NaN;
    }

    public final void a(lh lhVar) {
        this.a &= -17179869185L;
        int i = this.b;
        this.b = lhVar != null ? i | 2 : i & (-3);
        this.A = lhVar;
        int i2 = vl.h;
        this.z = vl.g;
    }

    public final void b(long j) {
        this.a |= 17179869184L;
        this.b &= -3;
        this.z = j;
        this.A = null;
    }

    public final void c(lh lhVar) {
        this.a &= -34359738369L;
        int i = this.b;
        this.b = lhVar != null ? i | 1 : i & (-2);
        this.y = lhVar;
        int i2 = vl.h;
        this.x = vl.g;
    }

    public final void d(lh lhVar) {
        this.a &= -137438953473L;
        int i = this.b;
        this.b = lhVar != null ? i | 128 : i & (-129);
        this.V = lhVar;
        int i2 = vl.h;
        this.U = vl.g;
    }

    public final void e(yt1 yt1Var) {
        yt1Var.a = this.a;
        yt1Var.b = this.b;
        yt1Var.p = this.p;
        yt1Var.q = this.q;
        yt1Var.r = this.r;
        yt1Var.s = this.s;
        yt1Var.t = this.t;
        yt1Var.u = this.u;
        yt1Var.v = this.v;
        yt1Var.w = this.w;
        yt1Var.c = this.c;
        yt1Var.d = this.d;
        yt1Var.e = this.e;
        yt1Var.f = this.f;
        yt1Var.g = this.g;
        yt1Var.h = this.h;
        yt1Var.i = this.i;
        yt1Var.j = this.j;
        yt1Var.k = this.k;
        yt1Var.E = this.E;
        yt1Var.H = this.H;
        yt1Var.I = this.I;
        yt1Var.J = this.J;
        yt1Var.K = this.K;
        yt1Var.L = this.L;
        yt1Var.M = this.M;
        yt1Var.N = this.N;
        yt1Var.O = this.O;
        yt1Var.P = this.P;
        yt1Var.Q = this.Q;
        yt1Var.S = this.S;
        yt1Var.T = this.T;
        yt1Var.R = this.R;
        yt1Var.x = this.x;
        yt1Var.y = this.y;
        yt1Var.z = this.z;
        yt1Var.A = this.A;
        yt1Var.B = this.B;
        yt1Var.C = this.C;
        yt1Var.F = this.F;
        yt1Var.G = this.G;
        yt1Var.D = this.D;
        yt1Var.l = this.l;
        yt1Var.m = this.m;
        yt1Var.n = this.n;
        yt1Var.o = this.o;
        yt1Var.U = this.U;
        yt1Var.V = this.V;
        yt1Var.W = this.W;
        yt1Var.X = this.X;
        yt1Var.Y = this.Y;
        yt1Var.Z = this.Z;
        yt1Var.a0 = this.a0;
        yt1Var.b0 = this.b0;
        yt1Var.c0 = this.c0;
    }

    public final void f(yt1 yt1Var, long j, int i) {
        long j2 = j & this.a;
        if (j2 != 0) {
            if ((j2 & 8192) != 0) {
                float f = this.p;
                yt1Var.a = 8192 | yt1Var.a;
                yt1Var.p = f;
            }
            if ((j2 & 16384) != 0) {
                float f2 = this.q;
                yt1Var.a = 16384 | yt1Var.a;
                yt1Var.q = f2;
            }
            if ((j2 & 32768) != 0) {
                float f3 = this.r;
                yt1Var.a = 32768 | yt1Var.a;
                yt1Var.r = f3;
            }
            if ((j2 & 65536) != 0) {
                float f4 = this.s;
                yt1Var.a = 65536 | yt1Var.a;
                yt1Var.s = f4;
            }
            if ((j2 & 262144) != 0) {
                float f5 = this.t;
                yt1Var.a = 262144 | yt1Var.a;
                yt1Var.t = f5;
            }
            if ((j2 & 1048576) != 0) {
                float f6 = this.u;
                yt1Var.a = 1048576 | yt1Var.a;
                yt1Var.u = f6;
            }
            if ((j2 & 131072) != 0) {
                float f7 = this.v;
                yt1Var.a = 131072 | yt1Var.a;
                yt1Var.v = f7;
            }
            if ((j2 & 524288) != 0) {
                float f8 = this.w;
                yt1Var.a = 524288 | yt1Var.a;
                yt1Var.w = f8;
            }
            if ((j2 & 1) != 0) {
                float f9 = this.c;
                yt1Var.a = 1 | yt1Var.a;
                yt1Var.c = f9;
            }
            if ((j2 & 2) != 0) {
                float f10 = this.d;
                yt1Var.a = 2 | yt1Var.a;
                yt1Var.d = f10;
            }
            if ((j2 & 4) != 0) {
                float f11 = this.e;
                yt1Var.a = 4 | yt1Var.a;
                yt1Var.e = f11;
            }
            if ((j2 & 8) != 0) {
                float f12 = this.f;
                yt1Var.a = 8 | yt1Var.a;
                yt1Var.f = f12;
            }
            if ((j2 & 16) != 0) {
                float f13 = this.g;
                yt1Var.a = 16 | yt1Var.a;
                yt1Var.g = f13;
            }
            if ((j2 & 32) != 0) {
                float f14 = this.h;
                yt1Var.a = 32 | yt1Var.a;
                yt1Var.h = f14;
            }
            if ((j2 & 64) != 0) {
                float f15 = this.i;
                yt1Var.a = 64 | yt1Var.a;
                yt1Var.i = f15;
            }
            if ((j2 & 128) != 0) {
                float f16 = this.j;
                yt1Var.a = 128 | yt1Var.a;
                yt1Var.j = f16;
            }
            if ((j2 & 256) != 0) {
                float f17 = this.k;
                yt1Var.a = 256 | yt1Var.a;
                yt1Var.k = f17;
            }
            if ((j2 & 2097152) != 0) {
                float f18 = this.H;
                yt1Var.a = 2097152 | yt1Var.a;
                yt1Var.H = f18;
            }
            if ((j2 & 4194304) != 0) {
                float f19 = this.I;
                yt1Var.a = 4194304 | yt1Var.a;
                yt1Var.I = f19;
            }
            if ((j2 & 8388608) != 0) {
                float f20 = this.J;
                yt1Var.a = 8388608 | yt1Var.a;
                yt1Var.J = f20;
            }
            if ((j2 & 16777216) != 0) {
                float f21 = this.K;
                yt1Var.a = 16777216 | yt1Var.a;
                yt1Var.K = f21;
            }
            if ((j2 & 33554432) != 0) {
                float f22 = this.L;
                yt1Var.a = 33554432 | yt1Var.a;
                yt1Var.L = f22;
            }
            if ((j2 & 67108864) != 0) {
                float f23 = this.M;
                yt1Var.a = 67108864 | yt1Var.a;
                yt1Var.M = f23;
            }
            if ((j2 & 134217728) != 0) {
                float f24 = this.N;
                yt1Var.a = 134217728 | yt1Var.a;
                yt1Var.N = f24;
            }
            if ((j2 & 268435456) != 0) {
                float f25 = this.O;
                yt1Var.a = 268435456 | yt1Var.a;
                yt1Var.O = f25;
            }
            if ((j2 & 536870912) != 0) {
                float f26 = this.P;
                yt1Var.a = 536870912 | yt1Var.a;
                yt1Var.P = f26;
            }
            if ((j2 & 1073741824) != 0) {
                float f27 = this.Q;
                yt1Var.a = 1073741824 | yt1Var.a;
                yt1Var.Q = f27;
            }
            if ((j2 & 4294967296L) != 0) {
                float f28 = this.S;
                yt1Var.a = 4294967296L | yt1Var.a;
                yt1Var.S = f28;
            }
            if ((j2 & 8589934592L) != 0) {
                float f29 = this.R;
                yt1Var.a = 8589934592L | yt1Var.a;
                yt1Var.R = f29;
            }
            if ((j2 & 34359738368L) != 0) {
                long j3 = this.x;
                yt1Var.a = 34359738368L | yt1Var.a;
                yt1Var.b &= -2;
                yt1Var.x = j3;
                yt1Var.y = null;
            }
            if ((17179869184L & j2) != 0) {
                yt1Var.b(this.z);
            }
            if ((j2 & 68719476736L) != 0) {
                long j4 = this.B;
                yt1Var.a = 68719476736L | yt1Var.a;
                yt1Var.b &= -5;
                yt1Var.B = j4;
                yt1Var.C = null;
            }
            if ((j2 & 2147483648L) != 0) {
                boolean z = this.D;
                yt1Var.a = 2147483648L | yt1Var.a;
                yt1Var.D = z;
            }
            if ((j2 & 512) != 0) {
                float f30 = this.l;
                yt1Var.a = (512 | yt1Var.a) & (-2049);
                yt1Var.l = f30;
                yt1Var.n = Float.NaN;
            }
            if ((j2 & 1024) != 0) {
                float f31 = this.m;
                yt1Var.a = (1024 | yt1Var.a) & (-4097);
                yt1Var.m = f31;
                yt1Var.o = Float.NaN;
            }
            if ((j2 & 2048) != 0) {
                float f32 = this.n;
                yt1Var.a = 2048 | (yt1Var.a & (-513));
                yt1Var.n = f32;
                yt1Var.l = Float.NaN;
            }
            if ((j2 & 4096) != 0) {
                float f33 = this.o;
                yt1Var.a = 4096 | (yt1Var.a & (-1025));
                yt1Var.o = f33;
                yt1Var.m = Float.NaN;
            }
            if ((j2 & 137438953472L) != 0) {
                long j5 = this.U;
                yt1Var.a = 137438953472L | yt1Var.a;
                yt1Var.b &= -129;
                yt1Var.U = j5;
                yt1Var.V = null;
            }
            if ((j2 & 140737488355328L) != 0) {
                long j6 = this.Z;
                yt1Var.a = 140737488355328L | yt1Var.a;
                yt1Var.Z = j6;
            }
            if ((j2 & 281474976710656L) != 0) {
                long j7 = this.a0;
                yt1Var.a = 281474976710656L | yt1Var.a;
                yt1Var.a0 = j7;
            }
            if ((j2 & 8796093022208L) != 0) {
                float f34 = this.b0;
                yt1Var.a = 8796093022208L | yt1Var.a;
                yt1Var.b0 = f34;
            }
            if ((j2 & 562949953421312L) != 0) {
                yt1Var.a = 562949953421312L | yt1Var.a;
            }
            if ((131666517426176L & j2) != 0) {
                if ((274877906944L & j2) != 0) {
                    yt1Var.y(s());
                }
                if ((j2 & 70368744177664L) != 0) {
                    long j8 = this.Y;
                    yt1Var.a = 70368744177664L | yt1Var.a;
                    yt1Var.Y = j8;
                }
                if ((2199023255552L & j2) != 0) {
                    yt1Var.x(r());
                }
                if ((4398046511104L & j2) != 0) {
                    yt1Var.z(t());
                }
                if ((17592186044416L & j2) != 0) {
                    yt1Var.w(p());
                }
                if ((35184372088832L & j2) != 0) {
                    yt1Var.j(n());
                }
                if ((549755813888L & j2) != 0) {
                    yt1Var.k(o());
                }
                if ((j2 & 1099511627776L) != 0) {
                    yt1Var.i(m());
                }
            }
        }
        int i2 = this.b & i;
        if (i2 != 0) {
            if ((i2 & 8) != 0) {
                ym1 ym1Var = this.E;
                yt1Var.b |= 8;
                yt1Var.E = ym1Var;
            }
            if ((i2 & 16) != 0) {
                wl wlVar = this.T;
                yt1Var.b |= 16;
                yt1Var.T = wlVar;
            }
            if ((i2 & 1) != 0) {
                yt1Var.c(this.y);
            }
            if ((i2 & 2) != 0) {
                yt1Var.a(this.A);
            }
            if ((i2 & 4) != 0) {
                yt1Var.l(this.C);
            }
            if ((i2 & 32) != 0) {
                Object obj = this.F;
                int i3 = yt1Var.b;
                yt1Var.b = obj != null ? i3 | 32 : i3 & (-33);
                yt1Var.F = obj;
            }
            if ((i2 & 64) != 0) {
                Object obj2 = this.G;
                int i4 = yt1Var.b;
                yt1Var.b = obj2 != null ? i4 | 64 : i4 & (-65);
                yt1Var.G = obj2;
            }
            if ((i2 & 128) != 0) {
                yt1Var.d(this.V);
            }
            if ((i2 & 256) != 0) {
                yt1Var.b |= 256;
            }
            if ((i2 & 512) != 0) {
                uz1 uz1Var = this.W;
                yt1Var.b |= 512;
                yt1Var.W = uz1Var;
            }
            if ((i2 & 1024) != 0) {
                fz1 fz1Var = this.X;
                fz1Var.getClass();
                yt1Var.b |= 1024;
                yt1Var.X = fz1Var;
            }
        }
    }

    public final int g(int i, yt1 yt1Var) {
        int i2 = this.b;
        int i3 = yt1Var.b;
        int i4 = i2 & i3 & i;
        int i5 = i & (i2 ^ i3);
        if (i4 == 0) {
            return i5;
        }
        if ((i4 & 1) != 0 && xi0.o(this.y, yt1Var.y)) {
            i4 &= -2;
        }
        if ((i4 & 2) != 0 && xi0.o(this.A, yt1Var.A)) {
            i4 &= -3;
        }
        if ((i4 & 4) != 0 && xi0.o(this.C, yt1Var.C)) {
            i4 &= -5;
        }
        if ((i4 & 8) != 0 && xi0.o(this.E, yt1Var.E)) {
            i4 &= -9;
        }
        if ((i4 & 16) != 0 && xi0.o(this.T, yt1Var.T)) {
            i4 &= -17;
        }
        if ((i4 & 32) != 0 && xi0.o(this.F, yt1Var.F)) {
            i4 &= -33;
        }
        if ((i4 & 64) != 0 && xi0.o(this.G, yt1Var.G)) {
            i4 &= -65;
        }
        if ((i4 & 128) != 0 && xi0.o(this.V, yt1Var.V)) {
            i4 &= -129;
        }
        if ((i4 & 256) != 0) {
            i4 &= -257;
        }
        if ((i4 & 512) != 0 && xi0.o(this.W, yt1Var.W)) {
            i4 &= -513;
        }
        if ((i4 & 1024) != 0 && xi0.o(this.X, yt1Var.X)) {
            i4 &= -1025;
        }
        return i4 | i5;
    }

    public final long h(yt1 yt1Var, long j) {
        long j2 = this.a;
        long j3 = yt1Var.a;
        long j4 = j2 & j3 & j;
        long j5 = j & (j2 ^ j3);
        if (j4 == 0) {
            return j5;
        }
        if ((1 & j4) != 0 && Float.floatToRawIntBits(this.c) == Float.floatToRawIntBits(yt1Var.c)) {
            j4 &= -2;
        }
        if ((2 & j4) != 0 && Float.floatToRawIntBits(this.d) == Float.floatToRawIntBits(yt1Var.d)) {
            j4 &= -3;
        }
        if ((4 & j4) != 0 && Float.floatToRawIntBits(this.e) == Float.floatToRawIntBits(yt1Var.e)) {
            j4 &= -5;
        }
        if ((8 & j4) != 0 && Float.floatToRawIntBits(this.f) == Float.floatToRawIntBits(yt1Var.f)) {
            j4 &= -9;
        }
        if ((16 & j4) != 0 && Float.floatToRawIntBits(this.g) == Float.floatToRawIntBits(yt1Var.g)) {
            j4 &= -17;
        }
        if ((32 & j4) != 0 && Float.floatToRawIntBits(this.h) == Float.floatToRawIntBits(yt1Var.h)) {
            j4 &= -33;
        }
        if ((64 & j4) != 0 && Float.floatToRawIntBits(this.i) == Float.floatToRawIntBits(yt1Var.i)) {
            j4 &= -65;
        }
        if ((128 & j4) != 0 && Float.floatToRawIntBits(this.j) == Float.floatToRawIntBits(yt1Var.j)) {
            j4 &= -129;
        }
        if ((256 & j4) != 0 && Float.floatToRawIntBits(this.k) == Float.floatToRawIntBits(yt1Var.k)) {
            j4 &= -257;
        }
        if ((512 & j4) != 0 && Float.floatToRawIntBits(this.l) == Float.floatToRawIntBits(yt1Var.l)) {
            j4 &= -513;
        }
        if ((1024 & j4) != 0 && Float.floatToRawIntBits(this.m) == Float.floatToRawIntBits(yt1Var.m)) {
            j4 &= -1025;
        }
        if ((2048 & j4) != 0 && Float.floatToRawIntBits(this.n) == Float.floatToRawIntBits(yt1Var.n)) {
            j4 &= -2049;
        }
        if ((4096 & j4) != 0 && Float.floatToRawIntBits(this.o) == Float.floatToRawIntBits(yt1Var.o)) {
            j4 &= -4097;
        }
        if ((8192 & j4) != 0 && Float.floatToRawIntBits(this.p) == Float.floatToRawIntBits(yt1Var.p)) {
            j4 &= -8193;
        }
        if ((16384 & j4) != 0 && Float.floatToRawIntBits(this.q) == Float.floatToRawIntBits(yt1Var.q)) {
            j4 &= -16385;
        }
        if ((32768 & j4) != 0 && Float.floatToRawIntBits(this.r) == Float.floatToRawIntBits(yt1Var.r)) {
            j4 &= -32769;
        }
        if ((65536 & j4) != 0 && Float.floatToRawIntBits(this.s) == Float.floatToRawIntBits(yt1Var.s)) {
            j4 &= -65537;
        }
        if ((131072 & j4) != 0 && Float.floatToRawIntBits(this.v) == Float.floatToRawIntBits(yt1Var.v)) {
            j4 &= -131073;
        }
        if ((262144 & j4) != 0 && Float.floatToRawIntBits(this.t) == Float.floatToRawIntBits(yt1Var.t)) {
            j4 &= -262145;
        }
        if ((524288 & j4) != 0 && Float.floatToRawIntBits(this.w) == Float.floatToRawIntBits(yt1Var.w)) {
            j4 &= -524289;
        }
        if ((1048576 & j4) != 0 && Float.floatToRawIntBits(this.u) == Float.floatToRawIntBits(yt1Var.u)) {
            j4 &= -1048577;
        }
        if ((2097152 & j4) != 0 && Float.floatToRawIntBits(this.H) == Float.floatToRawIntBits(yt1Var.H)) {
            j4 &= -2097153;
        }
        if ((4194304 & j4) != 0 && Float.floatToRawIntBits(this.I) == Float.floatToRawIntBits(yt1Var.I)) {
            j4 &= -4194305;
        }
        if ((8388608 & j4) != 0 && Float.floatToRawIntBits(this.J) == Float.floatToRawIntBits(yt1Var.J)) {
            j4 &= -8388609;
        }
        if ((16777216 & j4) != 0 && Float.floatToRawIntBits(this.K) == Float.floatToRawIntBits(yt1Var.K)) {
            j4 &= -16777217;
        }
        if ((33554432 & j4) != 0 && Float.floatToRawIntBits(this.L) == Float.floatToRawIntBits(yt1Var.L)) {
            j4 &= -33554433;
        }
        if ((67108864 & j4) != 0 && Float.floatToRawIntBits(this.M) == Float.floatToRawIntBits(yt1Var.M)) {
            j4 &= -67108865;
        }
        if ((134217728 & j4) != 0 && Float.floatToRawIntBits(this.N) == Float.floatToRawIntBits(yt1Var.N)) {
            j4 &= -134217729;
        }
        if ((268435456 & j4) != 0 && Float.floatToRawIntBits(this.O) == Float.floatToRawIntBits(yt1Var.O)) {
            j4 &= -268435457;
        }
        if ((536870912 & j4) != 0 && Float.floatToRawIntBits(this.P) == Float.floatToRawIntBits(yt1Var.P)) {
            j4 &= -536870913;
        }
        if ((1073741824 & j4) != 0 && Float.floatToRawIntBits(this.Q) == Float.floatToRawIntBits(yt1Var.Q)) {
            j4 &= -1073741825;
        }
        if ((2147483648L & j4) != 0 && this.D == yt1Var.D) {
            j4 &= -2147483649L;
        }
        if ((4294967296L & j4) != 0 && Float.floatToRawIntBits(this.S) == Float.floatToRawIntBits(yt1Var.S)) {
            j4 &= -4294967297L;
        }
        if ((8589934592L & j4) != 0 && Float.floatToRawIntBits(this.R) == Float.floatToRawIntBits(yt1Var.R)) {
            j4 &= -8589934593L;
        }
        if ((17179869184L & j4) != 0 && vl.c(this.z, yt1Var.z)) {
            j4 &= -17179869185L;
        }
        if ((34359738368L & j4) != 0 && vl.c(this.x, yt1Var.x)) {
            j4 &= -34359738369L;
        }
        if ((68719476736L & j4) != 0 && vl.c(this.B, yt1Var.B)) {
            j4 &= -68719476737L;
        }
        if ((137438953472L & j4) != 0 && vl.c(this.U, yt1Var.U)) {
            j4 &= -137438953473L;
        }
        if ((274877906944L & j4) != 0 && s().equals(yt1Var.s())) {
            j4 &= -274877906945L;
        }
        if ((549755813888L & j4) != 0 && xi0.o(o(), yt1Var.o())) {
            j4 &= -549755813889L;
        }
        if ((1099511627776L & j4) != 0 && m() == yt1Var.m()) {
            j4 &= -1099511627777L;
        }
        if ((2199023255552L & j4) != 0 && r() == yt1Var.r()) {
            j4 &= -2199023255553L;
        }
        if ((4398046511104L & j4) != 0 && t() == yt1Var.t()) {
            j4 &= -4398046511105L;
        }
        if ((8796093022208L & j4) != 0 && Float.compare(this.b0, yt1Var.b0) == 0) {
            j4 &= -8796093022209L;
        }
        if ((17592186044416L & j4) != 0 && p() == yt1Var.p()) {
            j4 &= -17592186044417L;
        }
        if ((35184372088832L & j4) != 0 && n() == yt1Var.n()) {
            j4 &= -35184372088833L;
        }
        if ((70368744177664L & j4) != 0 && g02.a(this.Y, yt1Var.Y)) {
            j4 &= -70368744177665L;
        }
        if ((140737488355328L & j4) != 0 && g02.a(this.Z, yt1Var.Z)) {
            j4 &= -140737488355329L;
        }
        if ((281474976710656L & j4) != 0 && g02.a(this.a0, yt1Var.a0)) {
            j4 &= -281474976710657L;
        }
        if ((562949953421312L & j4) != 0) {
            j4 &= -562949953421313L;
        }
        return j4 | j5;
    }

    public final void i(int i) {
        this.a |= 1099511627776L;
        this.c0 = ((i | 2) & 3) | (this.c0 & (-4));
    }

    public final void j(int i) {
        this.a |= 35184372088832L;
        this.c0 = ((i << 10) & 15360) | (this.c0 & (-15361));
    }

    public final void k(aa0 aa0Var) {
        this.a |= 549755813888L;
        this.c0 = ((aa0Var.e << 17) & 134086656) | (this.c0 & (-134086657));
    }

    public final void l(lh lhVar) {
        this.a &= -68719476737L;
        int i = this.b;
        this.b = lhVar != null ? i | 4 : i & (-5);
        this.C = lhVar;
        int i2 = vl.h;
        this.B = vl.g;
    }

    public final int m() {
        return ((this.a & 1099511627776L) == 0 || (this.c0 & 1) != 1) ? 0 : 1;
    }

    public final int n() {
        if ((this.a & 35184372088832L) == 0) {
            return 0;
        }
        int i = ((this.c0 & 15360) >> 10) & 15;
        if (i != 0 && i != 1 && i != 2 && i != 65535) {
            og0.a("The given value=" + i + " is not recognized by FontSynthesis.");
        }
        return i;
    }

    public final aa0 o() {
        if ((this.a & 549755813888L) != 0) {
            return new aa0((this.c0 & 134086656) >> 17);
        }
        aa0 aa0Var = aa0.f;
        return aa0.g;
    }

    public final int p() {
        if ((this.a & 17592186044416L) == 0) {
            return 0;
        }
        int i = (this.c0 & 768) >> 8;
        if (i >= 0 && i < 3) {
            return i;
        }
        og0.a("The given value=" + i + " is not recognized by Hyphens.");
        return i;
    }

    public final int q() {
        return zt1.e(this.b) | zt1.g(this.a);
    }

    public final int r() {
        if ((this.a & 2199023255552L) == 0) {
            return 0;
        }
        int i = (this.c0 & 28) >> 2;
        if (i >= 0 && i < 7) {
            return i;
        }
        og0.a("The given value=" + i + " is not recognized by TextAlign.");
        return i;
    }

    public final ax1 s() {
        int i;
        return ((this.a & 274877906944L) == 0 || (i = ((this.c0 & 114688) >> 14) & 3) == 0) ? ax1.b : i != 1 ? i != 2 ? new ax1(i) : ax1.d : ax1.c;
    }

    public final int t() {
        if ((this.a & 4398046511104L) == 0) {
            return 0;
        }
        int i = (this.c0 & 112) >> 4;
        if (i >= 0 && i < 6) {
            return i;
        }
        og0.a("The given value=" + i + " is not recognized by TextDirection.");
        return i;
    }

    public final boolean u(byte b) {
        return b < 50 && ((1 << b) & this.a) != 0;
    }

    public final boolean v(int i) {
        return i >= 50 && (this.b & (1 << (i - 50))) != 0;
    }

    public final void w(int i) {
        this.a |= 17592186044416L;
        this.c0 = ((i << 8) & 768) | (this.c0 & (-769));
    }

    public final void x(int i) {
        this.a |= 2199023255552L;
        this.c0 = ((i << 2) & 28) | (this.c0 & (-29));
    }

    public final void y(ax1 ax1Var) {
        this.a |= 274877906944L;
        this.c0 = (((ax1Var.a | 4) << 14) & 114688) | (this.c0 & (-114689));
    }

    public final void z(int i) {
        this.a |= 4398046511104L;
        this.c0 = ((i << 4) & 112) | (this.c0 & (-113));
    }
}
