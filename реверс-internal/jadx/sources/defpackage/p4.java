package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class p4 implements ViewTranslationCallback {
    public static final p4 a = new p4();

    public final boolean onClearTranslation(View view) {
        ha0 ha0Var;
        view.getClass();
        a5 contentCaptureManager$ui = ((h4) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.j = x4.e;
        mh0 mh0VarF = contentCaptureManager$ui.f();
        Object[] objArr = mh0VarF.c;
        long[] jArr = mh0VarF.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        zx0 zx0Var = ((tl1) objArr[(i << 3) + i3]).a.d.e;
                        Object objG = zx0Var.g(vl1.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = zx0Var.g(ml1.n);
                            r0 r0Var = (r0) (objG2 != null ? objG2 : null);
                            if (r0Var != null && (ha0Var = (ha0) r0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        sa0 sa0Var;
        view.getClass();
        a5 contentCaptureManager$ui = ((h4) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.j = x4.e;
        mh0 mh0VarF = contentCaptureManager$ui.f();
        Object[] objArr = mh0VarF.c;
        long[] jArr = mh0VarF.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        zx0 zx0Var = ((tl1) objArr[(i << 3) + i3]).a.d.e;
                        Object objG = zx0Var.g(vl1.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (xi0.o(objG, Boolean.TRUE)) {
                            Object objG2 = zx0Var.g(ml1.m);
                            r0 r0Var = (r0) (objG2 != null ? objG2 : null);
                            if (r0Var != null && (sa0Var = (sa0) r0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        sa0 sa0Var;
        view.getClass();
        a5 contentCaptureManager$ui = ((h4) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.j = x4.f;
        mh0 mh0VarF = contentCaptureManager$ui.f();
        Object[] objArr = mh0VarF.c;
        long[] jArr = mh0VarF.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        zx0 zx0Var = ((tl1) objArr[(i << 3) + i3]).a.d.e;
                        Object objG = zx0Var.g(vl1.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (xi0.o(objG, Boolean.FALSE)) {
                            Object objG2 = zx0Var.g(ml1.m);
                            r0 r0Var = (r0) (objG2 != null ? objG2 : null);
                            if (r0Var != null && (sa0Var = (sa0) r0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
