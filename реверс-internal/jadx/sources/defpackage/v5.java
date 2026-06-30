package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class v5 {
    public final hx a;
    public long b = 9205357640488583168L;
    public final n20 c;
    public final v41 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final yw i;

    public v5(Context context, hx hxVar, long j, c41 c41Var) {
        this.a = hxVar;
        n20 n20Var = new n20(context, lk.l0(j));
        this.c = n20Var;
        this.d = new v41(t32.a, v20.S);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        u5 u5Var = new u5(0, this);
        e81 e81Var = bv1.a;
        fv1 fv1Var = new fv1(null, null, u5Var);
        this.i = Build.VERSION.SDK_INT >= 31 ? new jc0(fv1Var, this, n20Var) : new jc0(fv1Var, this, n20Var, c41Var);
    }

    public final void a() {
        boolean z;
        n20 n20Var = this.c;
        EdgeEffect edgeEffect = n20Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = n20Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = n20Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = n20Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, ak1 ak1Var, ls lsVar) {
        s5 s5Var;
        long jD;
        if (lsVar instanceof s5) {
            s5Var = (s5) lsVar;
            int i = s5Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                s5Var.k = i - Integer.MIN_VALUE;
            } else {
                s5Var = new s5(this, lsVar);
            }
        }
        Object objQ = s5Var.i;
        int i2 = s5Var.k;
        t32 t32Var = t32.a;
        n20 n20Var = this.c;
        if (i2 == 0) {
            xc.G(objQ);
            boolean zC = io1.c(this.g);
            wt wtVar = wt.e;
            if (zC) {
                s5Var.k = 1;
                ak1Var.getClass();
                ak1 ak1Var2 = new ak1(ak1Var.l, s5Var);
                ak1Var2.k = j;
                if (ak1Var2.q(t32Var) != wtVar) {
                    return t32Var;
                }
            } else {
                boolean zG = n20.g(n20Var.f);
                hx hxVar = this.a;
                long jC = kd1.c((!zG || o52.b(j) >= 0.0f) ? (!n20.g(n20Var.g) || o52.b(j) <= 0.0f) ? 0.0f : -al.b(n20Var.d(), -o52.b(j), Float.intBitsToFloat((int) (this.g >> 32)), hxVar) : al.b(n20Var.c(), o52.b(j), Float.intBitsToFloat((int) (this.g >> 32)), hxVar), (!n20.g(n20Var.d) || o52.c(j) >= 0.0f) ? (!n20.g(n20Var.e) || o52.c(j) <= 0.0f) ? 0.0f : -al.b(n20Var.b(), -o52.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), hxVar) : al.b(n20Var.e(), o52.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), hxVar));
                if (jC != 0) {
                    d();
                }
                jD = o52.d(j, jC);
                s5Var.h = jD;
                s5Var.k = 2;
                ak1Var.getClass();
                ak1 ak1Var3 = new ak1(ak1Var.l, s5Var);
                ak1Var3.k = jD;
                objQ = ak1Var3.q(t32Var);
            }
            return wtVar;
        }
        if (i2 == 1) {
            xc.G(objQ);
            return t32Var;
        }
        if (i2 != 2) {
            yc.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jD = s5Var.h;
        xc.G(objQ);
        long jD2 = o52.d(jD, ((o52) objQ).a);
        this.f = false;
        if (o52.b(jD2) > 0.0f) {
            EdgeEffect edgeEffectC = n20Var.c();
            int I = nu0.I(o52.b(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectC.isFinished()) {
                edgeEffectC.onAbsorb(I);
            }
        } else if (o52.b(jD2) < 0.0f) {
            EdgeEffect edgeEffectD = n20Var.d();
            int i3 = -nu0.I(o52.b(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectD.isFinished()) {
                edgeEffectD.onAbsorb(i3);
            }
        }
        if (o52.c(jD2) > 0.0f) {
            EdgeEffect edgeEffectE = n20Var.e();
            int I2 = nu0.I(o52.c(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectE.isFinished()) {
                edgeEffectE.onAbsorb(I2);
            }
        } else if (o52.c(jD2) < 0.0f) {
            EdgeEffect edgeEffectB = n20Var.b();
            int i4 = -nu0.I(o52.c(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectB.isFinished()) {
                edgeEffectB.onAbsorb(i4);
            }
        }
        a();
        return t32Var;
    }

    public final long c() {
        long j = this.b;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = ef1.j(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(t32.a);
        }
    }

    public final boolean e() {
        n20 n20Var = this.c;
        EdgeEffect edgeEffect = n20Var.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? pb.c(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = n20Var.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? pb.c(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = n20Var.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? pb.c(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = n20Var.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? pb.c(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final float f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        float fD = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fD = pb.d(edgeEffectB, fD, f);
        } else {
            edgeEffectB.onPull(fD, f);
        }
        return (i2 >= 31 ? pb.c(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-fD) : Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = pb.d(edgeEffectC, fIntBitsToFloat2, f);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? pb.c(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        float fD = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fD = pb.d(edgeEffectD, fD, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fD, fIntBitsToFloat);
        }
        return (i2 >= 31 ? pb.c(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-fD) : Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = pb.d(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? pb.c(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void j(long j) {
        boolean zA = io1.a(this.g, 0L);
        boolean zA2 = io1.a(j, this.g);
        this.g = j;
        if (!zA2) {
            int I = nu0.I(Float.intBitsToFloat((int) (j >> 32)));
            long jI = (((long) nu0.I(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) I) << 32);
            n20 n20Var = this.c;
            n20Var.c = jI;
            EdgeEffect edgeEffect = n20Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jI >> 32), (int) (jI & 4294967295L));
            }
            EdgeEffect edgeEffect2 = n20Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jI >> 32), (int) (jI & 4294967295L));
            }
            EdgeEffect edgeEffect3 = n20Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jI & 4294967295L), (int) (jI >> 32));
            }
            EdgeEffect edgeEffect4 = n20Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jI & 4294967295L), (int) (jI >> 32));
            }
            EdgeEffect edgeEffect5 = n20Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jI >> 32), (int) (jI & 4294967295L));
            }
            EdgeEffect edgeEffect6 = n20Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jI >> 32), (int) (jI & 4294967295L));
            }
            EdgeEffect edgeEffect7 = n20Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jI & 4294967295L), (int) (jI >> 32));
            }
            EdgeEffect edgeEffect8 = n20Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jI), (int) (jI >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}
