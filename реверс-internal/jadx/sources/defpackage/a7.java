package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class a7 extends sk0 implements ha0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7(int i, Object obj) {
        super(0);
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    @Override // defpackage.ha0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        tp tpVar;
        int i = this.f;
        Context context = null;
        zk0Var = null;
        zk0 zk0Var = null;
        context = null;
        t32 t32Var = t32.a;
        Object obj = this.g;
        switch (i) {
            case 0:
                bl.q(((c7) obj).g, null);
                return t32Var;
            case 1:
                return t32Var;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                d22 d22Var = (d22) obj;
                Object objC = d22Var.c();
                k40 k40Var = k40.g;
                return Boolean.valueOf(objC == k40Var && d22Var.d.getValue() == k40Var);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                boolean zA = vh0.a(0L, 0L);
                View view = ((ip) obj).a;
                if (!zA) {
                    return new nx(0L, xi0.d(view.getContext()).w(xk.P(0L)));
                }
                Context context2 = view.getContext();
                Context baseContext = context2;
                while (baseContext instanceof ContextWrapper) {
                    if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                        context = baseContext;
                        if (context == null) {
                        }
                    } else {
                        ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                        if (contextWrapper.getBaseContext() == null) {
                            if (context == null) {
                                Configuration configuration = context2.getResources().getConfiguration();
                                lx lxVarD = xi0.d(context2);
                                long jC = bk.c(configuration.screenWidthDp, configuration.screenHeightDp);
                                long jX = lxVarD.X(jC);
                                return new nx((((long) ((int) Float.intBitsToFloat((int) (jX & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jX >> 32)))) << 32), jC);
                            }
                            c92.a.getClass();
                            b92 b92Var = b92.a;
                            d92 d92Var = b92.b;
                            d92Var.getClass();
                            int i2 = Build.VERSION.SDK_INT;
                            a92 a92VarD = (i2 >= 34 ? jx.f : i2 >= 30 ? pg.f : l91.x).d(context, d92Var.b);
                            long jHeight = (((long) a92VarD.a().height()) & 4294967295L) | (((long) a92VarD.a().width()) << 32);
                            return new nx(jHeight, xi0.d(context).w(xk.P(jHeight)));
                        }
                        baseContext = contextWrapper.getBaseContext();
                    }
                }
                if (context == null) {
                }
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                vn1 vn1Var = (vn1) obj;
                v41 v41Var = vn1Var.b;
                Boolean bool = Boolean.FALSE;
                v41Var.setValue(bool);
                vn1Var.c(false);
                qm0 qm0Var = vn1Var.c;
                ((v41) qm0Var.a).setValue(bool);
                ((v41) qm0Var.c).setValue(bool);
                ((v41) qm0Var.e).setValue(bool);
                ((v41) qm0Var.g).setValue(bool);
                vn1Var.e = vl.f;
                vn1Var.f = 1.0f;
                vn1Var.g = 1.0f;
                q52 q52Var = vn1Var.j;
                if (q52Var != null) {
                    ou[] ouVarArr = q52Var.d;
                    Arrays.fill(ouVarArr, 0, ouVarArr.length, (Object) null);
                    q52Var.e = 0;
                }
                vn1Var.h = u12.b;
                vn1Var.i = 0L;
                return t32Var;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ((w80) obj).N0();
                return t32Var;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                Object systemService = ((View) ((oc) obj).a).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                ul0 ul0Var = ((ql0) obj).J;
                ul0Var.p.D = true;
                ct0 ct0Var = ul0Var.q;
                if (ct0Var != null) {
                    ct0Var.x = true;
                }
                return t32Var;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                wl0 wl0Var = (wl0) obj;
                if (!((Boolean) wl0Var.g.getValue()).booleanValue() && (tpVar = wl0Var.c) != null) {
                    tpVar.l();
                }
                return t32Var;
            case el.a /* 9 */:
                ot0 ot0Var = (ot0) ((bp0) obj).a.f;
                if (!ot0Var.f) {
                    if (ot0Var.g) {
                        f91.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    ot0Var.a();
                    ot0Var.g = true;
                }
                return t32Var;
            case el.b /* 10 */:
                return (vt) ((vu) obj).h;
            case 11:
                return ((mz0) obj).L0();
            case el.c /* 12 */:
                v81 v81Var = (v81) obj;
                zk0 parentLayoutCoordinates = v81Var.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != null && parentLayoutCoordinates.B()) {
                    zk0Var = parentLayoutCoordinates;
                }
                return Boolean.valueOf((zk0Var == null || v81Var.m1959getPopupContentSizebOM6tXw() == null) ? false : true);
            case 13:
                sc1 sc1Var = (sc1) obj;
                sc1Var.i = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    sc1Var.a();
                    return t32Var;
                } finally {
                    Trace.endSection();
                }
            case 14:
                em0 em0VarA = ((ku1) obj).a();
                ql0 ql0Var = em0VarA.e;
                if (em0VarA.r != ((iy0) ((qx0) ql0Var.o()).f).g) {
                    zx0 zx0Var = em0VarA.j;
                    Object[] objArr = zx0Var.c;
                    long[] jArr = zx0Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((255 & j) < 128) {
                                        ((wl0) objArr[(i3 << 3) + i5]).d = true;
                                    }
                                    j >>= 8;
                                }
                                if (i4 == 8) {
                                    if (i3 != length) {
                                        i3++;
                                    }
                                }
                            }
                        }
                    }
                    if (ql0Var.l != null) {
                        if (!ql0Var.J.e) {
                            ql0.X(ql0Var, false, 7);
                        }
                    } else if (!ql0Var.q()) {
                        ql0.Z(ql0Var, false, 7);
                    }
                }
                return t32Var;
            case 15:
                return new BaseInputConnection(((jz1) obj).a, false);
            default:
                ((c52) obj).h.setValue(t32Var);
                return t32Var;
        }
    }
}
