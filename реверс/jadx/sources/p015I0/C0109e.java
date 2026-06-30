package p015I0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.view.View;
import androidx.emoji2.text.C0508v;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p001A0.AbstractC0016e;
import p005C0.C0048n;
import p024N.C0290v;
import p046Y.C0411b;
import p061e0.InterfaceC0689e;
import p072k.InterfaceC0827x;
import p072k.MenuC0816m;
import p073k0.AbstractC0860x;
import p073k0.AbstractC0861y;
import p079n0.AbstractC1013a;
import p082p.AbstractC1018a;
import p082p.AbstractC1020c;
import p082p.C1019b;

/* JADX INFO: renamed from: I0.e */
/* JADX INFO: loaded from: classes.dex */
public class C0109e implements InterfaceC0689e, InterfaceC0827x {

    /* JADX INFO: renamed from: b */
    public static C0109e f318b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f319c = true;

    /* JADX INFO: renamed from: d */
    public static Method f320d = null;

    /* JADX INFO: renamed from: e */
    public static boolean f321e = false;

    /* JADX INFO: renamed from: f */
    public static Field f322f = null;

    /* JADX INFO: renamed from: g */
    public static boolean f323g = false;

    /* JADX INFO: renamed from: h */
    public static boolean f324h = true;

    /* JADX INFO: renamed from: i */
    public static boolean f325i = true;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f326a;

    public /* synthetic */ C0109e(int i2) {
        this.f326a = i2;
    }

    /* JADX INFO: renamed from: a */
    public static C0109e m454a(Context context, int i2) {
        AbstractC0016e.m177h(i2 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC1013a.f4033o);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        AbstractC0016e.m162K(context, typedArrayObtainStyledAttributes, 4);
        AbstractC0016e.m162K(context, typedArrayObtainStyledAttributes, 9);
        AbstractC0016e.m162K(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        C0117m.m491a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C0105a(0)).m489a();
        typedArrayObtainStyledAttributes.recycle();
        C0109e c0109e = new C0109e(16);
        AbstractC0016e.m178i(rect.left);
        AbstractC0016e.m178i(rect.top);
        AbstractC0016e.m178i(rect.right);
        AbstractC0016e.m178i(rect.bottom);
        return c0109e;
    }

    /* JADX INFO: renamed from: e */
    public static Path m455e(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m456i(C0411b c0411b, Editable editable, int i2, int i3, boolean z2) {
        int iMin;
        if (editable != null && i2 >= 0 && i3 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z2) {
                    int iMax = Math.max(i2, 0);
                    int length = editable.length();
                    if (selectionStart < 0 || length < selectionStart || iMax < 0) {
                        selectionStart = -1;
                        int iMax2 = Math.max(i3, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0 || iMin < selectionEnd || iMax2 < 0) {
                            iMin = -1;
                            if (selectionStart != -1 && iMin != -1) {
                            }
                        } else {
                            loop2: while (true) {
                                boolean z3 = false;
                                while (true) {
                                    if (iMax2 == 0) {
                                        iMin = selectionEnd;
                                        break loop2;
                                    }
                                    if (selectionEnd >= iMin) {
                                        if (z3) {
                                            break;
                                        }
                                    } else {
                                        char cCharAt = editable.charAt(selectionEnd);
                                        if (z3) {
                                            break;
                                        }
                                        if (!Character.isSurrogate(cCharAt)) {
                                            iMax2--;
                                            selectionEnd++;
                                        } else {
                                            if (Character.isLowSurrogate(cCharAt)) {
                                                break loop2;
                                            }
                                            selectionEnd++;
                                            z3 = true;
                                        }
                                    }
                                }
                                iMax2--;
                                selectionEnd++;
                            }
                            iMin = -1;
                            if (selectionStart != -1) {
                            }
                        }
                    } else {
                        loop0: while (true) {
                            boolean z4 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char cCharAt2 = editable.charAt(selectionStart);
                                    if (z4) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(cCharAt2)) {
                                        iMax--;
                                    } else {
                                        if (Character.isHighSurrogate(cCharAt2)) {
                                            break loop0;
                                        }
                                        z4 = true;
                                    }
                                } else {
                                    if (z4) {
                                        break loop0;
                                    }
                                    selectionStart = 0;
                                }
                            }
                            iMax--;
                        }
                        selectionStart = -1;
                        int iMax22 = Math.max(i3, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0) {
                            iMin = -1;
                            if (selectionStart != -1) {
                            }
                        }
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i2, 0);
                    iMin = Math.min(selectionEnd + i3, editable.length());
                }
                C0508v[] c0508vArr = (C0508v[]) editable.getSpans(selectionStart, iMin, C0508v.class);
                if (c0508vArr != null && c0508vArr.length > 0) {
                    for (C0508v c0508v : c0508vArr) {
                        int spanStart = editable.getSpanStart(c0508v);
                        int spanEnd = editable.getSpanEnd(c0508v);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    c0411b.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    c0411b.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo459c() {
        return this instanceof C0110f;
    }

    /* JADX INFO: renamed from: d */
    public void mo460d(float f, float f2, float f3, C0127w c0127w) {
        c0127w.m503c(f, 0.0f);
    }

    /* JADX INFO: renamed from: f */
    public Signature[] mo461f(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    /* JADX INFO: renamed from: g */
    public float mo462g(View view) {
        if (f319c) {
            try {
                return AbstractC0860x.m2267a(view);
            } catch (NoSuchMethodError unused) {
                f319c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p072k.InterfaceC0827x
    /* JADX INFO: renamed from: h */
    public boolean mo43h(MenuC0816m menuC0816m) {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo463j(CharSequence charSequence) {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public void mo464m(View view, int i2, int i3, int i4, int i5) {
        if (!f321e) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f320d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setFrame method", e2);
            }
            f321e = true;
        }
        Method method = f320d;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m465n(C0048n c0048n, float f) {
        C1019b c1019b = (C1019b) ((Drawable) c0048n.f174b);
        AbstractC1018a abstractC1018a = (AbstractC1018a) c0048n.f175c;
        boolean useCompatPadding = abstractC1018a.getUseCompatPadding();
        boolean preventCornerOverlap = abstractC1018a.getPreventCornerOverlap();
        if (f != c1019b.f4069e || c1019b.f4070f != useCompatPadding || c1019b.f4071g != preventCornerOverlap) {
            c1019b.f4069e = f;
            c1019b.f4070f = useCompatPadding;
            c1019b.f4071g = preventCornerOverlap;
            c1019b.m2469b(null);
            c1019b.invalidateSelf();
        }
        if (!abstractC1018a.getUseCompatPadding()) {
            c0048n.m293K(0, 0, 0, 0);
            return;
        }
        C1019b c1019b2 = (C1019b) ((Drawable) c0048n.f174b);
        float f2 = c1019b2.f4069e;
        float f3 = c1019b2.f4065a;
        int iCeil = (int) Math.ceil(AbstractC1020c.m2470a(f2, f3, abstractC1018a.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(AbstractC1020c.m2471b(f2, f3, abstractC1018a.getPreventCornerOverlap()));
        c0048n.m293K(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // p061e0.InterfaceC0689e
    /* JADX INFO: renamed from: o */
    public void mo50o(int i2, Serializable serializable) {
        String str;
        switch (this.f326a) {
            case 18:
                break;
            default:
                switch (i2) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i2 == 6 || i2 == 7 || i2 == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo466p(View view, float f) {
        if (f319c) {
            try {
                AbstractC0860x.m2268b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f319c = false;
            }
        }
        view.setAlpha(f);
    }

    /* JADX INFO: renamed from: q */
    public void mo467q(View view, int i2) {
        if (!f323g) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f322f = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f323g = true;
        }
        Field field = f322f;
        if (field != null) {
            try {
                f322f.setInt(view, i2 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void mo468r(View view, Matrix matrix) {
        if (f324h) {
            try {
                AbstractC0861y.m2270b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f324h = false;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void mo469s(View view, Matrix matrix) {
        if (f325i) {
            try {
                AbstractC0861y.m2271c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f325i = false;
            }
        }
    }

    @Override // p061e0.InterfaceC0689e
    /* JADX INFO: renamed from: u */
    public void mo56u() {
        switch (this.f326a) {
            case 18:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    public C0109e(View view, int i2) {
        this.f326a = i2;
        switch (i2) {
            case 4:
                if (Build.VERSION.SDK_INT < 30) {
                    new C0109e(view, 3);
                } else {
                    new C0290v(view, 3);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m457k() {
    }

    /* JADX INFO: renamed from: l */
    private final void m458l(int i2, Serializable serializable) {
    }

    @Override // p072k.InterfaceC0827x
    /* JADX INFO: renamed from: b */
    public void mo37b(MenuC0816m menuC0816m, boolean z2) {
    }
}
