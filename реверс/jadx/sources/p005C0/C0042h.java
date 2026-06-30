package p005C0;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: C0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0042h {

    /* JADX INFO: renamed from: l */
    public static final int f147l;

    /* JADX INFO: renamed from: m */
    public static boolean f148m;

    /* JADX INFO: renamed from: n */
    public static Constructor f149n;

    /* JADX INFO: renamed from: o */
    public static TextDirectionHeuristic f150o;

    /* JADX INFO: renamed from: a */
    public CharSequence f151a;

    /* JADX INFO: renamed from: b */
    public final TextPaint f152b;

    /* JADX INFO: renamed from: c */
    public final int f153c;

    /* JADX INFO: renamed from: d */
    public int f154d;

    /* JADX INFO: renamed from: j */
    public boolean f160j;

    /* JADX INFO: renamed from: e */
    public Layout.Alignment f155e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f */
    public int f156f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g */
    public float f157g = 1.0f;

    /* JADX INFO: renamed from: h */
    public int f158h = f147l;

    /* JADX INFO: renamed from: i */
    public boolean f159i = true;

    /* JADX INFO: renamed from: k */
    public TextUtils.TruncateAt f161k = null;

    static {
        f147l = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public C0042h(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f151a = charSequence;
        this.f152b = textPaint;
        this.f153c = i2;
        this.f154d = charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public final StaticLayout m267a() throws C0041g {
        char c2;
        if (this.f151a == null) {
            this.f151a = "";
        }
        int iMax = Math.max(0, this.f153c);
        CharSequence charSequenceEllipsize = this.f151a;
        int i2 = this.f156f;
        TextPaint textPaint = this.f152b;
        if (i2 == 1) {
            c2 = '\t';
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f161k);
        } else {
            c2 = '\t';
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f154d);
        this.f154d = iMin;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            if (this.f160j && this.f156f == 1) {
                this.f155e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
            builderObtain.setAlignment(this.f155e);
            builderObtain.setIncludePad(this.f159i);
            builderObtain.setTextDirection(this.f160j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f161k;
            if (truncateAt != null) {
                builderObtain.setEllipsize(truncateAt);
            }
            builderObtain.setMaxLines(this.f156f);
            float f = this.f157g;
            if (f != 1.0f) {
                builderObtain.setLineSpacing(0.0f, f);
            }
            if (this.f156f > 1) {
                builderObtain.setHyphenationFrequency(this.f158h);
            }
            return builderObtain.build();
        }
        if (!f148m) {
            try {
                f150o = this.f160j && i3 >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                Class[] clsArr = new Class[13];
                clsArr[0] = CharSequence.class;
                Class cls = Integer.TYPE;
                clsArr[1] = cls;
                clsArr[2] = cls;
                clsArr[3] = TextPaint.class;
                clsArr[4] = cls;
                clsArr[5] = Layout.Alignment.class;
                clsArr[6] = TextDirectionHeuristic.class;
                Class cls2 = Float.TYPE;
                clsArr[7] = cls2;
                clsArr[8] = cls2;
                clsArr[c2] = Boolean.TYPE;
                clsArr[10] = TextUtils.TruncateAt.class;
                clsArr[11] = cls;
                clsArr[12] = cls;
                Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(clsArr);
                f149n = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f148m = true;
            } catch (Exception e2) {
                throw new C0041g(e2);
            }
        }
        try {
            Constructor constructor = f149n;
            constructor.getClass();
            Integer numValueOf = Integer.valueOf(this.f154d);
            Integer numValueOf2 = Integer.valueOf(iMax);
            Layout.Alignment alignment = this.f155e;
            TextDirectionHeuristic textDirectionHeuristic = f150o;
            textDirectionHeuristic.getClass();
            Float fValueOf = Float.valueOf(1.0f);
            Float fValueOf2 = Float.valueOf(0.0f);
            Boolean boolValueOf = Boolean.valueOf(this.f159i);
            Integer numValueOf3 = Integer.valueOf(iMax);
            Integer numValueOf4 = Integer.valueOf(this.f156f);
            Object[] objArr = new Object[13];
            objArr[0] = charSequenceEllipsize;
            objArr[1] = 0;
            objArr[2] = numValueOf;
            objArr[3] = textPaint;
            objArr[4] = numValueOf2;
            objArr[5] = alignment;
            objArr[6] = textDirectionHeuristic;
            objArr[7] = fValueOf;
            objArr[8] = fValueOf2;
            objArr[c2] = boolValueOf;
            objArr[10] = null;
            objArr[11] = numValueOf3;
            objArr[12] = numValueOf4;
            return (StaticLayout) constructor.newInstance(objArr);
        } catch (Exception e3) {
            throw new C0041g(e3);
        }
    }
}
