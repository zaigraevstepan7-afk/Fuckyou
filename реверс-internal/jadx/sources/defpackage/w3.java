package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w3 extends hb0 implements ha0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.l = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0125  */
    @Override // defpackage.ha0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        ContentCaptureSession contentCaptureSessionA;
        xz0 xz0Var;
        int i = this.l;
        t32 t32Var = t32.a;
        ks ksVar = null;
        Object obj = this.f;
        switch (i) {
            case 0:
                View view = (View) obj;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    h1.f(view);
                }
                if (i2 < 29 || (contentCaptureSessionA = qr.a(view)) == null) {
                    return null;
                }
                return new xg0(contentCaptureSessionA, view);
            case 1:
                lr0 lr0Var = (lr0) obj;
                lr0Var.getClass();
                nu0.A(u4.i(lr0Var), null, null, new e(lr0Var, ksVar, 19), 3);
                return t32Var;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                lr0 lr0Var2 = (lr0) obj;
                lr0Var2.i();
                lr0Var2.q.j(null);
                return t32Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                lr0 lr0Var3 = (lr0) obj;
                qs1 qs1Var = lr0Var3.e;
                if (!((l32) qs1Var.getValue()).f) {
                    nu0.A(u4.i(lr0Var3), null, null, new e(lr0Var3, (l32) qs1Var.getValue(), ksVar, 21), 3);
                }
                return t32Var;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                qs1 qs1Var2 = ((lr0) obj).g;
                qs1Var2.getClass();
                qs1Var2.k(null, w2.a);
                return t32Var;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return ((lw1) obj).t0();
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                h80 h80Var = (h80) obj;
                ay0 ay0Var = h80Var.c;
                ay0 ay0Var2 = h80Var.d;
                m80 m80Var = h80Var.a;
                w80 w80VarF = m80Var.f();
                v80 v80Var = v80.g;
                if (w80VarF == null) {
                    Object[] objArr = ay0Var2.b;
                    long[] jArr = ay0Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            int i4 = length;
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8 - ((~(i3 - i4)) >>> 31);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if ((j & 255) < 128) {
                                        ((b80) objArr[(i3 << 3) + i6]).R(v80Var);
                                    }
                                    j >>= 8;
                                }
                                if (i5 == 8) {
                                    if (i3 != i4) {
                                        i3++;
                                        length = i4;
                                    }
                                }
                            }
                        }
                    }
                } else if (w80VarF.r) {
                    if (ay0Var.c(w80VarF)) {
                        w80VarF.R0();
                    }
                    v80 v80VarQ0 = w80VarF.Q0();
                    if (!w80VarF.e.r) {
                        ng0.b("visitAncestors called on an unattached node");
                    }
                    sv0 sv0Var = w80VarF.e;
                    ql0 ql0VarP = bl.P(w80VarF);
                    int i7 = 0;
                    while (ql0VarP != null) {
                        if ((ql0VarP.I.f.h & 5120) != 0) {
                            while (sv0Var != null) {
                                int i8 = sv0Var.g;
                                if ((i8 & 5120) != 0) {
                                    if ((i8 & 1024) != 0) {
                                        i7++;
                                    }
                                    if ((sv0Var instanceof b80) && ay0Var2.c(sv0Var)) {
                                        if (i7 <= 1) {
                                            ((b80) sv0Var).R(v80VarQ0);
                                        } else {
                                            ((b80) sv0Var).R(v80.f);
                                        }
                                        ay0Var2.l(sv0Var);
                                    }
                                }
                                sv0Var = sv0Var.i;
                            }
                        }
                        ql0VarP = ql0VarP.u();
                        sv0Var = (ql0VarP == null || (xz0Var = ql0VarP.I) == null) ? null : xz0Var.e;
                    }
                    Object[] objArr2 = ay0Var2.b;
                    long[] jArr2 = ay0Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j2 = jArr2[i9];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                for (int i11 = 0; i11 < i10; i11++) {
                                    if ((j2 & 255) < 128) {
                                        ((b80) objArr2[(i9 << 3) + i11]).R(v80Var);
                                    }
                                    j2 >>= 8;
                                }
                                if (i10 == 8) {
                                    if (i9 != length2) {
                                        i9++;
                                    }
                                }
                            }
                        }
                    }
                }
                if (m80Var.f() == null || m80Var.c.Q0() == v80Var) {
                    m80Var.c();
                }
                ay0Var.b();
                ay0Var2.b();
                h80Var.e = false;
                return t32Var;
            default:
                return Boolean.valueOf(((z80) obj).z.S0(7));
        }
    }
}
