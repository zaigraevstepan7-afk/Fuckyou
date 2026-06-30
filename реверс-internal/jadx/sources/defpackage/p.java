package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.reddit.frontpage.MainActivity;
import java.nio.MappedByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View viewFindFocus;
        int i = this.e;
        Boolean bool = null;
        Object obj = this.f;
        switch (i) {
            case 0:
                ((r) obj).c();
                return;
            case 1:
                m4 m4Var = (m4) obj;
                Trace.beginSection("measureAndLayout");
                try {
                    m4Var.h.r(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        m4Var.h();
                        Trace.endSection();
                        m4Var.N = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ActionMode actionMode = ((l8) obj).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                bo.a((MainActivity) obj);
                return;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                xn xnVar = (xn) obj;
                Runnable runnable = xnVar.f;
                if (runnable != null) {
                    runnable.run();
                    xnVar.f = null;
                    return;
                }
                return;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                fy.a((fy) obj);
                return;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                l90 l90Var = (l90) obj;
                synchronized (l90Var.h) {
                    try {
                        if (l90Var.l == null) {
                            return;
                        }
                        try {
                            ca0 ca0VarB = l90Var.b();
                            int i2 = ca0VarB.f;
                            if (i2 == 2) {
                                synchronized (l90Var.h) {
                                }
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            }
                            try {
                                int i3 = o12.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                wr wrVar = l90Var.g;
                                Context context = l90Var.e;
                                wrVar.getClass();
                                ca0[] ca0VarArr = {ca0VarB};
                                qc1 qc1Var = v22.a;
                                qc1.e("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceI = v22.a.i(context, ca0VarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferV = uc1.v(l90Var.e, ca0VarB.a);
                                    if (mappedByteBufferV == null || typefaceI == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        vu vuVar = new vu(typefaceI, hk.P(mappedByteBufferV));
                                        Trace.endSection();
                                        synchronized (l90Var.h) {
                                            try {
                                                bk bkVar = l90Var.l;
                                                if (bkVar != null) {
                                                    bkVar.T(vuVar);
                                                }
                                            } finally {
                                            }
                                            break;
                                        }
                                        l90Var.a();
                                        return;
                                    } finally {
                                        int i4 = o12.a;
                                    }
                                } finally {
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        } catch (Throwable th2) {
                            synchronized (l90Var.h) {
                                try {
                                    bk bkVar2 = l90Var.l;
                                    if (bkVar2 != null) {
                                        bkVar2.S(th2);
                                    }
                                    l90Var.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                ua1 ua1Var = (ua1) obj;
                zo0 zo0Var = ua1Var.j;
                if (ua1Var.f == 0) {
                    ua1Var.g = true;
                    zo0Var.d(po0.ON_PAUSE);
                }
                if (ua1Var.e == 0 && ua1Var.g) {
                    zo0Var.d(po0.ON_STOP);
                    ua1Var.h = true;
                    return;
                }
                return;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                hf1.setRippleState$lambda$1((hf1) obj);
                return;
            case el.a /* 9 */:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) ((y41) obj).f;
                int i5 = sideSheetBehavior.i;
                if (i5 != 2 || i5 == 0) {
                    return;
                }
                sideSheetBehavior.i = 0;
                return;
            case el.b /* 10 */:
                View view = (View) obj;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            default:
                jz1 jz1Var = (jz1) obj;
                oc ocVar = jz1Var.b;
                jz1Var.n = null;
                iy0 iy0Var = jz1Var.m;
                View view2 = jz1Var.a;
                if (!view2.isFocused() && (viewFindFocus = view2.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    iy0Var.g();
                    return;
                }
                Object[] objArr = iy0Var.e;
                int i6 = iy0Var.g;
                Boolean boolValueOf = null;
                for (int i7 = 0; i7 < i6; i7++) {
                    iz1 iz1Var = (iz1) objArr[i7];
                    int iOrdinal = iz1Var.ordinal();
                    if (iOrdinal == 0) {
                        bool = Boolean.TRUE;
                    } else if (iOrdinal == 1) {
                        bool = Boolean.FALSE;
                    } else if (iOrdinal != 2 && iOrdinal != 3) {
                        ez1.a();
                        return;
                    } else {
                        if (!xi0.o(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(iz1Var == iz1.g);
                        }
                    }
                    boolValueOf = bool;
                }
                iy0Var.g();
                if (xi0.o(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((hm0) ocVar.b).getValue()).restartInput((View) ocVar.a);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((y41) ((y41) ocVar.c).f).D();
                    } else {
                        ((y41) ((y41) ocVar.c).f).t();
                    }
                }
                if (xi0.o(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((hm0) ocVar.b).getValue()).restartInput((View) ocVar.a);
                    return;
                }
                return;
        }
    }
}
