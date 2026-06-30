package p074l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: l.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0945k0 {

    /* JADX INFO: renamed from: l */
    public static final RectF f3756l = new RectF();

    /* JADX INFO: renamed from: m */
    public static final ConcurrentHashMap f3757m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public int f3758a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f3759b = false;

    /* JADX INFO: renamed from: c */
    public float f3760c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f3761d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f3762e = -1.0f;

    /* JADX INFO: renamed from: f */
    public int[] f3763f = new int[0];

    /* JADX INFO: renamed from: g */
    public boolean f3764g = false;

    /* JADX INFO: renamed from: h */
    public TextPaint f3765h;

    /* JADX INFO: renamed from: i */
    public final TextView f3766i;

    /* JADX INFO: renamed from: j */
    public final Context f3767j;

    /* JADX INFO: renamed from: k */
    public final C0942j0 f3768k;

    public C0945k0(TextView textView) {
        this.f3766i = textView;
        this.f3767j = textView.getContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.f3768k = new C0939i0();
        } else if (i2 >= 23) {
            this.f3768k = new C0933g0();
        } else {
            this.f3768k = new C0942j0();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int[] m2385b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i2 : iArr) {
                if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public static Method m2386d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f3757m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Object m2387e(Object obj, String str, Object obj2) {
        try {
            return m2386d(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return obj2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2388a() {
        if (m2390f()) {
            if (this.f3759b) {
                if (this.f3766i.getMeasuredHeight() <= 0 || this.f3766i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f3768k.mo2380b(this.f3766i) ? 1048576 : (this.f3766i.getMeasuredWidth() - this.f3766i.getTotalPaddingLeft()) - this.f3766i.getTotalPaddingRight();
                int height = (this.f3766i.getHeight() - this.f3766i.getCompoundPaddingBottom()) - this.f3766i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f3756l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM2389c = m2389c(rectF);
                        if (fM2389c != this.f3766i.getTextSize()) {
                            m2391g(0, fM2389c);
                        }
                    } finally {
                    }
                }
            }
            this.f3759b = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m2389c(RectF rectF) {
        int i2;
        CharSequence charSequence;
        StaticLayout staticLayout;
        CharSequence transformation;
        int length = this.f3763f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i3 = length - 1;
        int i4 = 1;
        int i5 = 0;
        while (i4 <= i3) {
            int i6 = (i4 + i3) / 2;
            int i7 = this.f3763f[i6];
            TextView textView = this.f3766i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence2 = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f3765h;
            if (textPaint == null) {
                this.f3765h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f3765h.set(textView.getPaint());
            this.f3765h.setTextSize(i7);
            Layout.Alignment alignment = (Layout.Alignment) m2387e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            int iRound = Math.round(rectF.right);
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = AbstractC0930f0.m2372a(charSequence2, alignment, iRound, maxLines, this.f3766i, this.f3765h, this.f3768k);
                i2 = maxLines;
                charSequence = charSequence2;
            } else {
                i2 = maxLines;
                charSequence = charSequence2;
                staticLayout = new StaticLayout(charSequence, this.f3765h, iRound, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
            }
            if ((i2 == -1 || (staticLayout.getLineCount() <= i2 && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == charSequence.length())) && staticLayout.getHeight() <= rectF.bottom) {
                int i8 = i6 + 1;
                i5 = i4;
                i4 = i8;
            } else {
                i5 = i6 - 1;
                i3 = i5;
            }
        }
        return this.f3763f[i5];
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2390f() {
        return m2394j() && this.f3758a != 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m2391g(int i2, float f) {
        Context context = this.f3767j;
        float fApplyDimension = TypedValue.applyDimension(i2, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f3766i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f3759b = false;
                try {
                    Method methodM2386d = m2386d("nullLayouts");
                    if (methodM2386d != null) {
                        methodM2386d.invoke(textView, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2392h() {
        if (m2394j() && this.f3758a == 1) {
            if (!this.f3764g || this.f3763f.length == 0) {
                int iFloor = ((int) Math.floor((this.f3762e - this.f3761d) / this.f3760c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i2 = 0; i2 < iFloor; i2++) {
                    iArr[i2] = Math.round((i2 * this.f3760c) + this.f3761d);
                }
                this.f3763f = m2385b(iArr);
            }
            this.f3759b = true;
        } else {
            this.f3759b = false;
        }
        return this.f3759b;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2393i() {
        boolean z2 = this.f3763f.length > 0;
        this.f3764g = z2;
        if (z2) {
            this.f3758a = 1;
            this.f3761d = r0[0];
            this.f3762e = r0[r1 - 1];
            this.f3760c = -1.0f;
        }
        return z2;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2394j() {
        return !(this.f3766i instanceof C0977w);
    }

    /* JADX INFO: renamed from: k */
    public final void m2395k(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f3758a = 1;
        this.f3761d = f;
        this.f3762e = f2;
        this.f3760c = f3;
        this.f3764g = false;
    }
}
