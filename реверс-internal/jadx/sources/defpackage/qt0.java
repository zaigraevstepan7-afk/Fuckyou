package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class qt0 implements fc, y81, f70, f30, se1 {
    public static final ub0 g = new ub0(1);
    public static final i32 h = new i32();
    public final /* synthetic */ int e;
    public Object f;

    public qt0(int i) {
        ev0 ev0Var;
        this.e = i;
        switch (i) {
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                this.f = new n1(this);
                break;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                this.f = new AtomicInteger(0);
                break;
            case 15:
                this.f = c2.g(m32.b);
                break;
            case 17:
                this.f = new vq1(nu0.g);
                break;
            case 27:
                ot0 ot0Var = new ot0();
                this.f = ot0Var;
                if (!ot0Var.f) {
                    if (ot0Var.g) {
                        f91.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    ot0Var.a();
                    ot0Var.g = true;
                    break;
                }
                break;
            case 28:
                this.f = new CopyOnWriteArrayList();
                new HashMap();
                break;
            default:
                lb1 lb1Var = lb1.c;
                try {
                    ev0Var = (ev0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    ev0Var = g;
                }
                ev0[] ev0VarArr = {ub0.b, ev0Var};
                pt0 pt0Var = new pt0();
                pt0Var.a = ev0VarArr;
                Charset charset = ki0.a;
                this.f = pt0Var;
                break;
        }
    }

    public static an0 y(qt0 qt0Var, int i) {
        un0 un0Var = (un0) qt0Var.f;
        sp1 sp1VarL = uc1.l();
        sa0 sa0VarE = sp1VarL != null ? sp1VarL.e() : null;
        sp1 sp1VarU = uc1.u(sp1VarL);
        try {
            pn0 pn0Var = (pn0) un0Var.f.getValue();
            uc1.B(sp1VarL, sp1VarU, sa0VarE);
            bn0 bn0Var = un0Var.p;
            long j = pn0Var.j;
            boolean z = un0Var.d;
            mt mtVar = new mt(i, pn0Var);
            tk0 tk0Var = bn0Var.c;
            if (tk0Var == null) {
                return v20.E;
            }
            oc ocVar = bn0Var.b;
            x91 x91Var = (x91) tk0Var.d;
            boolean z2 = x91Var instanceof o7;
            w91 w91Var = new w91(tk0Var, i, ocVar, mtVar);
            w91Var.h = new kr(j);
            if (!z2) {
                x91Var.a(w91Var);
            } else if (z) {
                o7 o7Var = (o7) x91Var;
                o7Var.f.add(new sa1(1, w91Var));
                if (!o7Var.g) {
                    o7Var.g = true;
                    o7Var.e.post(o7Var);
                }
            } else {
                o7 o7Var2 = (o7) x91Var;
                o7Var2.f.add(new sa1(0, w91Var));
                if (!o7Var2.g) {
                    o7Var2.g = true;
                    o7Var2.e.post(o7Var2);
                }
            }
            c2.w("compose:lazy:schedule_prefetch:index", i);
            return w91Var;
        } catch (Throwable th) {
            uc1.B(sp1VarL, sp1VarU, sa0VarE);
            throw th;
        }
    }

    public void A(float f, float f2) {
        ((oc) this.f).i().f(f, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void B(ms1 ms1Var) {
        Object value;
        ms1 ms1Var2;
        ms1Var.getClass();
        qs1 qs1Var = (qs1) this.f;
        do {
            value = qs1Var.getValue();
            ms1Var2 = (ms1) value;
            if ((ms1Var2 instanceof yb1) || xi0.o(ms1Var2, m32.b)) {
                ms1Var2 = ms1Var;
            } else if (ms1Var2 instanceof lu) {
                if (ms1Var.a > ((lu) ms1Var2).a) {
                }
            } else if (!(ms1Var2 instanceof n60)) {
                if (ms1Var2 instanceof tz0) {
                    yc.l("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    return;
                } else {
                    ez1.a();
                    return;
                }
            }
        } while (!qs1Var.h(value, ms1Var2));
    }

    public void C(int i, Object obj, si1 si1Var) {
        nl nlVar = (nl) this.f;
        nlVar.B(i, 3);
        si1Var.f((a0) obj, nlVar.a);
        nlVar.B(i, 4);
    }

    @Override // defpackage.y81
    public long a(sh0 sh0Var, long j, al0 al0Var, long j2) {
        long j3 = ((oh0) ((ha0) this.f).a()).a;
        int i = hk.i(sh0Var.a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), al0Var == al0.e);
        return (((long) hk.i(sh0Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) i) << 32);
    }

    @Override // defpackage.f70
    public Object c(g70 g70Var, ks ksVar) {
        Object objC = ((xg0) this.f).c(new av(g70Var, 0), ksVar);
        return objC == wt.e ? objC : t32.a;
    }

    @Override // defpackage.f30
    public void d(bk bkVar) {
        dq dqVar = new dq("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), dqVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new j8(this, bkVar, threadPoolExecutor, 1));
    }

    public void h(ql0 ql0Var) {
        if (!ql0Var.J()) {
            ng0.b("DepthSortedSet.add called on an unattached node");
        }
        ((vq1) this.f).add(ql0Var);
    }

    public m1 k(int i) {
        return null;
    }

    public void l() {
        ((op) this.f).getClass();
    }

    public void m(byte b) {
        ((Parcel) this.f).writeByte(b);
    }

    public void n(float f) {
        ((Parcel) this.f).writeFloat(f);
    }

    public void o(long j) {
        long jB = g02.b(j);
        byte b = 0;
        if (!h02.a(jB, 0L)) {
            if (h02.a(jB, 4294967296L)) {
                b = 1;
            } else if (h02.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        m(b);
        if (h02.a(g02.b(j), 0L)) {
            return;
        }
        n(g02.c(j));
    }

    public m1 p(int i) {
        return null;
    }

    public ms1 q() {
        return (ms1) ((qs1) this.f).getValue();
    }

    public ns1 r() {
        g30 g30VarA = g30.a();
        if (g30VarA.c() == 1) {
            return new ef0(true);
        }
        v41 v41VarB = xc.B(Boolean.FALSE);
        g30VarA.h(new dw(v41VarB, this));
        return v41VarB;
    }

    public KeyListener s(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((xg0) ((qt0) this.f).f).getClass();
        if (keyListener instanceof p30) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new p30(keyListener);
    }

    public void t(float f, float f2, float f3, float f4) {
        oc ocVar = (oc) this.f;
        cj cjVarI = ocVar.i();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (ocVar.q() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (ocVar.q() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            mg0.a("Width and height must be greater than or equal to zero");
        }
        ocVar.B(jFloatToRawIntBits);
        cjVarI.f(f, f2);
    }

    public String toString() {
        switch (this.e) {
            case 17:
                return ((vq1) this.f).toString();
            default:
                return super.toString();
        }
    }

    public boolean u(int i, int i2, Bundle bundle) {
        return false;
    }

    public boolean v(ql0 ql0Var) {
        if (!ql0Var.J()) {
            ng0.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((vq1) this.f).remove(ql0Var);
    }

    public void w(float f, long j) {
        cj cjVarI = ((oc) this.f).i();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        cjVarI.f(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        cjVarI.b(f);
        cjVarI.f(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void x(float f, float f2, long j) {
        cj cjVarI = ((oc) this.f).i();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        cjVarI.f(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        cjVarI.a(f, f2);
        cjVarI.f(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void z(boolean z) {
        y30 y30Var = (y30) ((xg0) ((qt0) this.f).f).g;
        if (y30Var.g != z) {
            if (y30Var.f != null) {
                g30 g30VarA = g30.a();
                x30 x30Var = y30Var.f;
                g30VarA.getClass();
                bk.n(x30Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = g30VarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    g30VarA.b.remove(x30Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            y30Var.g = z;
            if (z) {
                y30.a(y30Var.e, g30.a().c());
            }
        }
    }

    @Override // defpackage.fc
    public void b(int i) {
    }

    @Override // defpackage.fc
    public void f(int i) {
    }

    @Override // defpackage.fc
    public void g(int i, float f) {
    }

    public /* synthetic */ qt0(int i, boolean z) {
        this.e = i;
    }

    public qt0(nl nlVar) {
        this.e = 11;
        ki0.a(nlVar, "output");
        this.f = nlVar;
        nlVar.a = this;
    }

    public qt0(boolean z) {
        this.e = 7;
        this.f = new AtomicBoolean(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029 A[PHI: r10
      0x0029: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x0019, B:10:0x0022, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qt0(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        this.e = 6;
        int i2 = 1;
        int length = fArr.length - 1;
        wc[][] wcVarArr = new wc[length][];
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i5 < length) {
            int i6 = iArr[i5];
            int i7 = 3;
            if (i6 == 0) {
                i = i7;
            } else if (i6 == i2) {
                i3 = i2;
                i = i3;
            } else {
                if (i6 != 2) {
                    if (i6 != 3) {
                        i7 = 4;
                        if (i6 != 4) {
                            i7 = 5;
                            if (i6 != 5) {
                                i = i4;
                            }
                        }
                    } else {
                        if (i3 == i2) {
                        }
                        i = i3;
                    }
                }
                i3 = 2;
                i = i3;
            }
            float[] fArr3 = fArr2[i5];
            int i8 = i5 + 1;
            float[] fArr4 = fArr2[i8];
            float f = fArr[i5];
            float f2 = fArr[i8];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            wc[] wcVarArr2 = new wc[length2];
            int i9 = 0;
            while (i9 < length2) {
                int i10 = i9 * 2;
                int i11 = i9;
                int i12 = i10 + 1;
                wcVarArr2[i11] = new wc(i, f, f2, fArr3[i10], fArr3[i12], fArr4[i10], fArr4[i12]);
                i9 = i11 + 1;
            }
            wcVarArr[i5] = wcVarArr2;
            i5 = i8;
            i4 = i;
            i2 = 1;
        }
        this.f = wcVarArr;
    }

    public qt0(tb tbVar, int i) {
        this.e = i;
        switch (i) {
            case 21:
                this.f = new xg0(tbVar);
                break;
            default:
                this.f = new qt0(tbVar, 21);
                break;
        }
    }

    public qt0(et0 et0Var, r62 r62Var, cu cuVar) {
        this.e = 1;
        r62Var.getClass();
        cuVar.getClass();
        this.f = new vu(et0Var, r62Var, cuVar);
    }

    public /* synthetic */ qt0(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    public qt0(ic icVar) {
        this.e = 22;
        this.f = new w30(icVar);
    }

    public qt0(Context context) {
        this.e = 20;
        this.f = context.getApplicationContext();
    }

    public qt0(BottomSheetBehavior bottomSheetBehavior) {
        this.e = 9;
        this.f = bottomSheetBehavior;
        new e4(1, this);
    }

    public void j(int i, m1 m1Var, String str, Bundle bundle) {
    }
}
