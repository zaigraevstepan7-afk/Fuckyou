package defpackage;

import android.os.Bundle;
import android.view.WindowInsetsAnimation;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class n81 implements yh1, fk1 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public n81(int i) {
        this.a = i;
        switch (i) {
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                this.b = new Object();
                hx0 hx0Var = nh0.a;
                this.c = new hx0();
                break;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                this.b = new t61(27);
                this.c = new dt0(16);
                break;
            case el.a /* 9 */:
            default:
                this.b = new LinkedHashMap();
                this.c = new LinkedHashMap();
                break;
            case el.b /* 10 */:
                this.b = new iy0(new Reference[16]);
                this.c = new ReferenceQueue();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(n81 n81Var) {
        synchronized (n81Var.b) {
            hx0 hx0Var = (hx0) n81Var.c;
            long[] jArr = hx0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                int i5 = hx0Var.b[i4];
                                nt1 nt1Var = (nt1) hx0Var.c[i4];
                                if (nt1Var.c != ot1.i && !nt1Var.b.e()) {
                                    hx0Var.h(i4);
                                }
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
        }
    }

    @Override // defpackage.fk1
    public int a(int i) {
        do {
            i = ((zb) this.c).l(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i)));
        return i;
    }

    @Override // defpackage.fk1
    public int b(int i) {
        do {
            i = ((zb) this.c).j(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.yh1
    public Object c(Object obj) {
        return ((sa0) this.c).i(obj);
    }

    @Override // defpackage.fk1
    public int d(int i) {
        CharSequence charSequence = (CharSequence) this.b;
        do {
            i = ((zb) this.c).j(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.fk1
    public int e(int i) {
        do {
            i = ((zb) this.c).l(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.yh1
    public Object f(gh1 gh1Var, Object obj) {
        return ((wa0) this.b).h(gh1Var, obj);
    }

    public Bundle h(String str) {
        uh1 uh1Var = (uh1) this.b;
        if (!uh1Var.g) {
            yc.l("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = uh1Var.f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleU = bundle.containsKey(str) ? xc.u(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            uh1Var.f = null;
        }
        return bundleU;
    }

    public th1 i(String str) {
        th1 th1Var;
        uh1 uh1Var = (uh1) this.b;
        synchronized (uh1Var.c) {
            Iterator it = uh1Var.d.entrySet().iterator();
            do {
                th1Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                th1 th1Var2 = (th1) entry.getValue();
                if (xi0.o(str2, str)) {
                    th1Var = th1Var2;
                }
            } while (th1Var == null);
        }
        return th1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[PHI: r5
      0x006a: PHI (r5v3 long) = (r5v2 long), (r5v4 long) binds: [B:8:0x0025, B:24:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long j() {
        long j;
        int i;
        synchronized (this.b) {
            hx0 hx0Var = (hx0) this.c;
            int[] iArr = hx0Var.b;
            Object[] objArr = hx0Var.c;
            long[] jArr = hx0Var.a;
            int length = jArr.length - 2;
            j = 0;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((255 & j2) < 128) {
                                int i6 = (i2 << 3) + i5;
                                int i7 = iArr[i6];
                                nt1 nt1Var = (nt1) objArr[i6];
                                i = i3;
                                if (nt1Var.c == ot1.i || nt1Var.b.e()) {
                                    j |= 1 << i7;
                                }
                            } else {
                                i = i3;
                            }
                            j2 >>= i;
                            i5++;
                            i3 = i;
                        }
                        if (i4 != i3) {
                            break;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return j;
    }

    public void k(Bundle bundle) {
        uh1 uh1Var = (uh1) this.b;
        vh1 vh1Var = uh1Var.a;
        if (!uh1Var.e) {
            uh1Var.a();
        }
        if (vh1Var.g().c.compareTo(qo0.h) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + vh1Var.g().c).toString());
        }
        if (uh1Var.g) {
            yc.l("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleU = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleU = xc.u("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        uh1Var.f = bundleU;
        uh1Var.g = true;
    }

    public void l(Bundle bundle) {
        uh1 uh1Var = (uh1) this.b;
        Bundle bundleJ = s22.j((j41[]) Arrays.copyOf(new j41[0], 0));
        Bundle bundle2 = uh1Var.f;
        if (bundle2 != null) {
            bundleJ.putAll(bundle2);
        }
        synchronized (uh1Var.c) {
            for (Map.Entry entry : uh1Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((th1) entry.getValue()).a();
                str.getClass();
                bundleJ.putBundle(str, bundleA);
            }
        }
        if (bundleJ.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleJ);
    }

    public void m(xt1 xt1Var) {
        int i;
        hx0 hx0Var = (hx0) this.c;
        int[] iArr = hx0Var.b;
        Object[] objArr = hx0Var.c;
        long[] jArr = hx0Var.a;
        int i2 = 2;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((255 & j) < 128) {
                        int i7 = (i3 << 3) + i6;
                        int i8 = iArr[i7];
                        nt1 nt1Var = (nt1) objArr[i7];
                        ot1 ot1Var = nt1Var.c;
                        n81 n81Var = nt1Var.e;
                        int iOrdinal = ot1Var.ordinal();
                        if (iOrdinal != 0) {
                            int i9 = 4;
                            ks ksVar = null;
                            i = i4;
                            if (iOrdinal == i2) {
                                nt1Var.c = ot1.i;
                                vt vtVarZ0 = xt1Var.z0();
                                jr1 jr1Var = nt1Var.d;
                                if (jr1Var != null) {
                                    jr1Var.a(null);
                                }
                                nt1Var.d = nu0.A(vtVarZ0, null, null, new qk1(n81Var, nt1Var, ksVar, i9), 3);
                            } else if (iOrdinal == 3) {
                                vt vtVarZ02 = xt1Var.z0();
                                jr1 jr1Var2 = nt1Var.d;
                                if (jr1Var2 != null) {
                                    jr1Var2.a(null);
                                }
                                nt1Var.d = nu0.A(vtVarZ02, null, null, new qk1(n81Var, nt1Var, ksVar, i9), 3);
                            }
                        } else {
                            i = i4;
                            nt1Var.c = ot1.j;
                        }
                    } else {
                        i = i4;
                    }
                    j >>= i;
                    i6++;
                    i4 = i;
                    i2 = 2;
                }
                if (i5 != i4) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            }
            i3++;
            i2 = 2;
        }
    }

    public void n(String str, th1 th1Var) {
        th1Var.getClass();
        uh1 uh1Var = (uh1) this.b;
        synchronized (uh1Var.c) {
            if (uh1Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            uh1Var.d.put(str, th1Var);
        }
    }

    public void o() {
        if (!((uh1) this.b).h) {
            yc.l("Can not perform this action after onSaveInstanceState");
            return;
        }
        nc1 nc1Var = (nc1) this.c;
        if (nc1Var == null) {
            nc1Var = new nc1(this);
        }
        this.c = nc1Var;
        try {
            io0.class.getDeclaredConstructor(null);
            nc1 nc1Var2 = (nc1) this.c;
            if (nc1Var2 != null) {
                nc1Var2.a.add(io0.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + io0.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public float p(int i) {
        synchronized (this.b) {
            nt1 nt1Var = (nt1) ((hx0) this.c).b(i);
            float fFloatValue = 0.0f;
            if (nt1Var == null) {
                return 0.0f;
            }
            if (nt1Var.c != ot1.i) {
                fFloatValue = ((Number) nt1Var.b.d()).floatValue();
            }
            return fFloatValue;
        }
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return "Bounds{lower=" + ((eh0) this.b) + " upper=" + ((eh0) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public n81(uh1 uh1Var, int i) {
        this.a = i;
        switch (i) {
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                this.b = uh1Var;
                this.c = new n81(uh1Var, 2);
                break;
            default:
                this.b = uh1Var;
                break;
        }
    }

    public /* synthetic */ n81(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public n81(WindowInsetsAnimation.Bounds bounds) {
        this.a = 11;
        this.b = eh0.c(bounds.getLowerBound());
        this.c = eh0.c(bounds.getUpperBound());
    }
}
