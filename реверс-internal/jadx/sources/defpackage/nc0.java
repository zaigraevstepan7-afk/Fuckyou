package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class nc0 {
    public boolean A;
    public RectF B;
    public final pc0 a;
    public Outline f;
    public float j;
    public hk k;
    public w6 l;
    public w6 m;
    public boolean n;
    public ej o;
    public p6 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;
    public hx b = u4.j;
    public al0 c = al0.e;
    public sa0 d = a4.G;
    public final g3 e = new g3(11, this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final gk r = new gk();

    static {
        xi0.o(Build.FINGERPRINT, "robolectric");
    }

    public nc0(pc0 pc0Var) {
        this.a = pc0Var;
        pc0Var.t(false);
        this.t = 0L;
        this.u = 0L;
        this.z = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.A;
            Outline outline2 = null;
            pc0 pc0Var = this.a;
            if (z || pc0Var.G() > 0.0f) {
                w6 w6Var = this.l;
                if (w6Var != null) {
                    RectF rectF = this.B;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.B = rectF;
                    }
                    boolean z2 = w6Var instanceof w6;
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    Path path = w6Var.a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(path);
                        }
                        outline.offset(this.v, this.w);
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = w6Var;
                    if (outline != null) {
                        outline.setAlpha(pc0Var.a());
                        outline2 = outline;
                    }
                    pc0Var.m(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.A) {
                        pc0Var.t(false);
                        pc0Var.q();
                    } else {
                        pc0Var.t(this.A);
                    }
                } else {
                    pc0Var.t(this.A);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jP = xk.P(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        jP = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jP >> 32);
                    int i5 = (int) (jP & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(pc0Var.a());
                    pc0Var.m(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                pc0Var.t(false);
                pc0Var.m(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        if (this.s && this.q == 0) {
            gk gkVar = this.r;
            nc0 nc0Var = (nc0) gkVar.b;
            if (nc0Var != null) {
                nc0Var.q--;
                nc0Var.b();
                gkVar.b = null;
            }
            ay0 ay0Var = (ay0) gkVar.d;
            if (ay0Var != null) {
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
                                    r11.q--;
                                    ((nc0) objArr[(i << 3) + i3]).b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                ay0Var.b();
            }
            this.a.q();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(p10 p10Var) {
        gk gkVar = this.r;
        gkVar.c = (nc0) gkVar.b;
        ay0 ay0Var = (ay0) gkVar.d;
        if (ay0Var != null && ay0Var.h()) {
            ay0 ay0Var2 = (ay0) gkVar.e;
            if (ay0Var2 == null) {
                ay0 ay0Var3 = qi1.a;
                ay0Var2 = new ay0();
                gkVar.e = ay0Var2;
            }
            ay0Var2.j(ay0Var);
            ay0Var.b();
        }
        gkVar.a = true;
        this.d.i(p10Var);
        gkVar.a = false;
        nc0 nc0Var = (nc0) gkVar.c;
        if (nc0Var != null) {
            nc0Var.q--;
            nc0Var.b();
        }
        ay0 ay0Var4 = (ay0) gkVar.e;
        if (ay0Var4 == null || !ay0Var4.h()) {
            return;
        }
        Object[] objArr = ay0Var4.b;
        long[] jArr = ay0Var4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            r9.q--;
                            ((nc0) objArr[(i << 3) + i3]).b();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        ay0Var4.b();
    }

    public final hk d() {
        hk o31Var;
        hk hkVar = this.k;
        w6 w6Var = this.l;
        if (hkVar != null) {
            return hkVar;
        }
        if (w6Var != null) {
            n31 n31Var = new n31(w6Var);
            this.k = n31Var;
            return n31Var;
        }
        long jP = xk.P(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jP = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jP >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jP & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            o31Var = new p31(xc.e(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            o31Var = new o31(new pc1(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = o31Var;
        return o31Var;
    }

    public final void e(hx hxVar, al0 al0Var, long j, sa0 sa0Var) {
        boolean zA = vh0.a(this.u, j);
        pc0 pc0Var = this.a;
        if (!zA) {
            this.u = j;
            long j2 = this.t;
            pc0Var.D((int) (j2 >> 32), (int) (j2 & 4294967295L), j);
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = hxVar;
        this.c = al0Var;
        this.d = sa0Var;
        pc0Var.w(hxVar, al0Var, this, this.e);
    }

    public final void f(float f, long j, long j2) {
        float f2 = this.v;
        long jE = w01.e(j, (((long) Float.floatToRawIntBits(this.w)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        if (w01.b(this.h, jE) && io1.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = jE;
        this.i = j2;
        this.j = f;
        a();
    }
}
