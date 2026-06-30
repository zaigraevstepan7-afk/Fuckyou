package p036T;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Trace;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.emoji2.text.AbstractC0493g;
import androidx.emoji2.text.C0489c;
import androidx.emoji2.text.C0502p;
import androidx.emoji2.text.C0503q;
import com.reddit.frontpage.R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import p000A.AbstractC0000a;
import p000A.C0010k;
import p001A0.AbstractC0016e;
import p009F.AbstractC0074a;
import p015I0.C0109e;
import p018K.C0149e;
import p020L.C0173g;
import p021L0.C0183f;
import p024N.C0246Y;
import p038U.C0393a;
import p044X.C0407b;
import p051a1.AbstractC0451c;
import p051a1.InterfaceC0449a;
import p059d1.InterfaceC0644a;
import p060e.AbstractActivityC0669k;
import p062e1.C0696a;
import p066g0.AbstractC0723K;
import p066g0.C0735X;
import p073k0.AbstractC0858v;
import p074l.AbstractC0949l1;
import p074l.C0867C;
import p074l.C0899S0;
import p074l.C0927e0;
import p074l.ViewOnLongClickListenerC0955n1;
import p087s.AbstractFutureC1041g;
import p087s.C1037c;
import p087s.C1040f;

/* JADX INFO: renamed from: T.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0383m {

    /* JADX INFO: renamed from: a */
    public static Method f1042a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f1043b = false;

    /* JADX INFO: renamed from: c */
    public static Field f1044c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f1045d = false;

    /* JADX INFO: renamed from: e */
    public static Field f1046e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f1047f = false;

    /* JADX INFO: renamed from: g */
    public static Class f1048g = null;

    /* JADX INFO: renamed from: h */
    public static boolean f1049h = false;

    /* JADX INFO: renamed from: i */
    public static Field f1050i = null;

    /* JADX INFO: renamed from: j */
    public static boolean f1051j = false;

    /* JADX INFO: renamed from: k */
    public static Field f1052k = null;

    /* JADX INFO: renamed from: l */
    public static boolean f1053l = false;

    /* JADX INFO: renamed from: m */
    public static long f1054m = 0;

    /* JADX INFO: renamed from: n */
    public static Method f1055n = null;

    /* JADX INFO: renamed from: o */
    public static boolean f1056o = true;

    /* JADX INFO: renamed from: B */
    public static C0173g m1026B(C0927e0 c0927e0) {
        int iM1082a;
        int iM1085d;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new C0173g(AbstractC0386p.m1093c(c0927e0));
        }
        TextPaint textPaint = new TextPaint(c0927e0.getPaint());
        if (i2 >= 23) {
            iM1082a = 1;
            iM1085d = 1;
        } else {
            iM1082a = 0;
            iM1085d = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i2 >= 23) {
            iM1082a = AbstractC0384n.m1082a(c0927e0);
            iM1085d = AbstractC0384n.m1085d(c0927e0);
        }
        if (c0927e0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i2 < 28 || (c0927e0.getInputType() & 15) != 3) {
            boolean z2 = c0927e0.getLayoutDirection() == 1;
            switch (c0927e0.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z2) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(AbstractC0386p.m1092b(AbstractC0385o.m1090a(c0927e0.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C0173g(textPaint, textDirectionHeuristic, iM1082a, iM1085d);
    }

    /* JADX INFO: renamed from: E */
    public static boolean m1027E(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        }
        if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        }
        if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        }
        if (i2 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m1028F(int i2) {
        if (i2 == 0) {
            return false;
        }
        ThreadLocal threadLocal = AbstractC0074a.f236a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i2);
        int iGreen = Color.green(i2);
        int iBlue = Color.blue(i2);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d2 = ((double) iRed) / 255.0d;
        double dPow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iGreen) / 255.0d;
        double dPow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d4 = ((double) iBlue) / 255.0d;
        double dPow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d5 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d5;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d5 / 100.0d > 0.5d;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m1029H() {
        try {
            if (f1055n == null) {
                return AbstractC0000a.m21r();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f1055n == null) {
                f1054m = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1055n = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1055n.invoke(null, Long.valueOf(f1054m))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX INFO: renamed from: I */
    public static int m1030I(int i2, int i3, float f) {
        return AbstractC0074a.m354c(AbstractC0074a.m356e(i3, Math.round(Color.alpha(i3) * f)), i2);
    }

    /* JADX INFO: renamed from: J */
    public static int m1031J(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    /* JADX INFO: renamed from: K */
    public static int m1032K(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX INFO: renamed from: L */
    public static void m1033L(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX INFO: renamed from: X */
    public static C0407b m1034X(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j4 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    C0407b c0407b = new C0407b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c0407b.f768d = byteBufferDuplicate;
                    c0407b.f765a = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c0407b.f766b = i7;
                    c0407b.f767c = ((ByteBuffer) c0407b.f768d).getShort(i7);
                    return c0407b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: renamed from: b0 */
    public static void m1035b0(TextView textView, int i2) {
        AbstractC0016e.m178i(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0386p.m1094d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static void m1036c0(TextView textView, int i2) {
        AbstractC0016e.m178i(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static void m1037d0(TextView textView, int i2) {
        AbstractC0016e.m178i(i2);
        if (i2 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i2 - r0, 1.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1038e(int i2, Rect rect, Rect rect2, Rect rect3) {
        int i3;
        int i4;
        boolean zM1040f = m1040f(i2, rect, rect2);
        if (m1040f(i2, rect, rect3) || !zM1040f) {
            return false;
        }
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i2 != 17 && i2 != 66) {
                            int iM1031J = m1031J(i2, rect, rect2);
                            if (i2 == 17) {
                                i3 = rect.left;
                                i4 = rect3.left;
                            } else if (i2 == 33) {
                                i3 = rect.top;
                                i4 = rect3.top;
                            } else if (i2 == 66) {
                                i3 = rect3.right;
                                i4 = rect.right;
                            } else {
                                if (i2 != 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i3 = rect3.bottom;
                                i4 = rect.bottom;
                            }
                            if (iM1031J >= Math.max(1, i3 - i4)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                }
            } else if (rect.top >= rect3.bottom) {
            }
        } else if (rect.left >= rect3.right) {
        }
        return true;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m1039e0(C0867C c0867c, boolean z2) {
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC0382l.m1024c(c0867c, z2);
            return;
        }
        if (!f1045d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f1044c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
            }
            f1045d = true;
        }
        Field field = f1044c;
        if (field != null) {
            try {
                field.set(c0867c, Boolean.valueOf(z2));
            } catch (IllegalAccessException e3) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1040f(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX INFO: renamed from: f0 */
    public static void m1041f0(TextView textView, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i2);
        } else {
            textView.setTextAppearance(textView.getContext(), i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m1042g(View view) {
        AbstractC0451c.m1146e(view, "<this>");
        C0696a c0696a = new C0696a();
        C0246Y c0246y = new C0246Y(view, c0696a);
        c0246y.f789c = c0696a;
        c0696a.f2777d = c0246y;
        while (c0696a.hasNext()) {
            View view2 = (View) c0696a.next();
            C0393a c0393a = (C0393a) view2.getTag(R.id.resc);
            if (c0393a == null) {
                c0393a = new C0393a();
                view2.setTag(R.id.resc, c0393a);
            }
            ArrayList arrayList = c0393a.f1065a;
            int iM166R = AbstractC0016e.m166R(arrayList);
            if (-1 < iM166R) {
                arrayList.get(iM166R).getClass();
                throw new ClassCastException();
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m1043g0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0949l1.m2399a(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0955n1 viewOnLongClickListenerC0955n1 = ViewOnLongClickListenerC0955n1.f3795k;
        if (viewOnLongClickListenerC0955n1 != null && viewOnLongClickListenerC0955n1.f3797a == view) {
            ViewOnLongClickListenerC0955n1.m2400b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC0955n1(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0955n1 viewOnLongClickListenerC0955n12 = ViewOnLongClickListenerC0955n1.f3796l;
        if (viewOnLongClickListenerC0955n12 != null && viewOnLongClickListenerC0955n12.f3797a == view) {
            viewOnLongClickListenerC0955n12.m2401a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m1044h0(PopupWindow popupWindow, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC0382l.m1025d(popupWindow, i2);
            return;
        }
        if (!f1043b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f1042a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f1043b = true;
        }
        Method method = f1042a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i2));
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m1045k0(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0858v.m2264b(viewGroup, z2);
        } else if (f1056o) {
            try {
                AbstractC0858v.m2264b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f1056o = false;
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static int m1046l0(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i2});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: n */
    public static int m1047n(C0735X c0735x, AbstractC0493g abstractC0493g, View view, View view2, AbstractC0723K abstractC0723K, boolean z2) {
        if (abstractC0723K.m2014v() == 0 || c0735x.m2035b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(AbstractC0723K.m1989G(view) - AbstractC0723K.m1989G(view2)) + 1;
        }
        return Math.min(abstractC0493g.mo1299l(), abstractC0493g.mo1289b(view2) - abstractC0493g.mo1292e(view));
    }

    /* JADX INFO: renamed from: n0 */
    public static ActionMode.Callback m1048n0(ActionMode.Callback callback) {
        return (!(callback instanceof ActionModeCallbackC0388r) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionModeCallbackC0388r) callback).f1057a;
    }

    /* JADX INFO: renamed from: o */
    public static int m1049o(C0735X c0735x, AbstractC0493g abstractC0493g, View view, View view2, AbstractC0723K abstractC0723K, boolean z2, boolean z3) {
        if (abstractC0723K.m2014v() == 0 || c0735x.m2035b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z3 ? Math.max(0, (c0735x.m2035b() - Math.max(AbstractC0723K.m1989G(view), AbstractC0723K.m1989G(view2))) - 1) : Math.max(0, Math.min(AbstractC0723K.m1989G(view), AbstractC0723K.m1989G(view2)));
        if (z2) {
            return Math.round((iMax * (Math.abs(abstractC0493g.mo1289b(view2) - abstractC0493g.mo1292e(view)) / (Math.abs(AbstractC0723K.m1989G(view) - AbstractC0723K.m1989G(view2)) + 1))) + (abstractC0493g.mo1298k() - abstractC0493g.mo1292e(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: o0 */
    public static ActionMode.Callback m1050o0(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof ActionModeCallbackC0388r) || callback == null) ? callback : new ActionModeCallbackC0388r(callback, textView);
    }

    /* JADX INFO: renamed from: p */
    public static int m1051p(C0735X c0735x, AbstractC0493g abstractC0493g, View view, View view2, AbstractC0723K abstractC0723K, boolean z2) {
        if (abstractC0723K.m2014v() == 0 || c0735x.m2035b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return c0735x.m2035b();
        }
        return (int) (((abstractC0493g.mo1289b(view2) - abstractC0493g.mo1292e(view)) / (Math.abs(AbstractC0723K.m1989G(view) - AbstractC0723K.m1989G(view2)) + 1)) * c0735x.m2035b());
    }

    /* JADX INFO: renamed from: q */
    public static C0503q m1052q(Context context) {
        ProviderInfo providerInfo;
        C0149e c0149e;
        ApplicationInfo applicationInfo;
        C0109e c0489c = Build.VERSION.SDK_INT >= 28 ? new C0489c(10) : new C0109e(10);
        PackageManager packageManager = context.getPackageManager();
        AbstractC0016e.m180j(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c0149e = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo461f = c0489c.mo461f(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo461f) {
                    arrayList.add(signature.toByteArray());
                }
                c0149e = new C0149e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
                c0149e = null;
            }
        }
        if (c0149e == null) {
            return null;
        }
        return new C0503q(new C0502p(context, c0149e));
    }

    /* JADX INFO: renamed from: s */
    public static void m1053s(Object obj) {
        LongSparseArray longSparseArray;
        if (!f1049h) {
            try {
                f1048g = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f1049h = true;
        }
        Class cls = f1048g;
        if (cls == null) {
            return;
        }
        if (!f1051j) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f1050i = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f1051j = true;
        }
        Field field = f1050i;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    /* JADX INFO: renamed from: t */
    public static int m1054t(Context context, int i2, int i3) {
        Integer numValueOf;
        TypedValue typedValueM189o0 = AbstractC0016e.m189o0(context, i2);
        if (typedValueM189o0 != null) {
            int i4 = typedValueM189o0.resourceId;
            numValueOf = Integer.valueOf(i4 != 0 ? AbstractC0016e.m159H(context, i4) : typedValueM189o0.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i3;
    }

    /* JADX INFO: renamed from: u */
    public static int m1055u(Context context, int i2, String str) {
        TypedValue typedValueM197s0 = AbstractC0016e.m197s0(context, i2, str);
        int i3 = typedValueM197s0.resourceId;
        return i3 != 0 ? AbstractC0016e.m159H(context, i3) : typedValueM197s0.data;
    }

    /* JADX INFO: renamed from: v */
    public static int m1056v(View view, int i2) {
        Context context = view.getContext();
        TypedValue typedValueM197s0 = AbstractC0016e.m197s0(view.getContext(), i2, view.getClass().getCanonicalName());
        int i3 = typedValueM197s0.resourceId;
        return i3 != 0 ? AbstractC0016e.m159H(context, i3) : typedValueM197s0.data;
    }

    /* JADX INFO: renamed from: w */
    public static Drawable m1057w(Context context, int i2) {
        return C0899S0.m2316d().m2323f(context, i2);
    }

    /* JADX INFO: renamed from: x */
    public static Set m1058x() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: z */
    public static final Class m1059z(InterfaceC0644a interfaceC0644a) {
        AbstractC0451c.m1146e(interfaceC0644a, "<this>");
        Class clsMo1141a = ((InterfaceC0449a) interfaceC0644a).mo1141a();
        if (clsMo1141a.isPrimitive()) {
            String name = clsMo1141a.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsMo1141a;
    }

    /* JADX INFO: renamed from: A */
    public C0183f mo1060A(AbstractActivityC0669k abstractActivityC0669k, Object obj) {
        return null;
    }

    /* JADX INFO: renamed from: C */
    public int mo546C(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public int mo547D() {
        return 0;
    }

    /* JADX INFO: renamed from: G */
    public abstract boolean mo1061G();

    /* JADX INFO: renamed from: M */
    public abstract void mo1062M(Throwable th);

    /* JADX INFO: renamed from: N */
    public abstract View mo1063N(int i2);

    /* JADX INFO: renamed from: O */
    public abstract boolean mo1064O();

    /* JADX INFO: renamed from: P */
    public abstract void mo1065P(C0010k c0010k);

    /* JADX INFO: renamed from: R */
    public abstract void mo548R(int i2);

    /* JADX INFO: renamed from: S */
    public abstract void mo549S(View view, int i2, int i3);

    /* JADX INFO: renamed from: T */
    public abstract void mo550T(View view, float f, float f2);

    /* JADX INFO: renamed from: U */
    public abstract Object mo1067U(int i2, Intent intent);

    /* JADX INFO: renamed from: V */
    public abstract void mo1068V(C1040f c1040f, C1040f c1040f2);

    /* JADX INFO: renamed from: W */
    public abstract void mo1069W(C1040f c1040f, Thread thread);

    /* JADX INFO: renamed from: Z */
    public abstract void mo1071Z(boolean z2);

    /* JADX INFO: renamed from: a0 */
    public abstract void mo1072a0(boolean z2);

    /* JADX INFO: renamed from: h */
    public boolean mo1073h() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean mo1074i(AbstractFutureC1041g abstractFutureC1041g, C1037c c1037c);

    /* JADX INFO: renamed from: i0 */
    public abstract void mo1075i0();

    /* JADX INFO: renamed from: j */
    public abstract boolean mo1076j(AbstractFutureC1041g abstractFutureC1041g, Object obj, Object obj2);

    /* JADX INFO: renamed from: j0 */
    public abstract void mo1077j0();

    /* JADX INFO: renamed from: k */
    public abstract boolean mo1078k(AbstractFutureC1041g abstractFutureC1041g, C1040f c1040f, C1040f c1040f2);

    /* JADX INFO: renamed from: l */
    public abstract int mo551l(View view, int i2);

    /* JADX INFO: renamed from: m */
    public abstract int mo552m(View view, int i2);

    /* JADX INFO: renamed from: m0 */
    public abstract boolean mo553m0(View view, int i2);

    /* JADX INFO: renamed from: p0 */
    public abstract TransformationMethod mo1079p0(TransformationMethod transformationMethod);

    /* JADX INFO: renamed from: r */
    public abstract Intent mo1080r(AbstractActivityC0669k abstractActivityC0669k, Object obj);

    /* JADX INFO: renamed from: y */
    public abstract InputFilter[] mo1081y(InputFilter[] inputFilterArr);

    /* JADX INFO: renamed from: Y */
    public void mo1070Y() {
    }

    /* JADX INFO: renamed from: Q */
    public void mo1066Q(View view, int i2) {
    }
}
