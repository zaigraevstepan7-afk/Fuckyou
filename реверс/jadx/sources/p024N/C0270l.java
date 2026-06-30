package p024N;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import androidx.emoji2.text.C0490d;
import androidx.emoji2.text.C0501o;
import androidx.emoji2.text.C0504r;
import androidx.emoji2.text.C0507u;
import androidx.emoji2.text.C0508v;
import androidx.emoji2.text.InterfaceC0500n;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p000A.C0010k;
import p001A0.AbstractC0016e;
import p007E.AbstractC0071q;
import p009F.AbstractC0077d;
import p009F.AbstractC0078e;
import p022M.C0185b;
import p034S.InterfaceC0363g;
import p036T.AbstractC0383m;
import p044X.C0406a;
import p074l.C0904V;
import p074l.C0973u;
import p093v.C1063d;
import p093v.C1064e;
import p095w.C1076b;
import p099y.C1103f;

/* JADX INFO: renamed from: N.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0270l implements InterfaceC0363g {

    /* JADX INFO: renamed from: d */
    public static C0270l f835d;

    /* JADX INFO: renamed from: a */
    public Object f836a;

    /* JADX INFO: renamed from: b */
    public Object f837b;

    /* JADX INFO: renamed from: c */
    public Object f838c;

    public /* synthetic */ C0270l(Object obj, Object obj2, Object obj3) {
        this.f836a = obj;
        this.f837b = obj2;
        this.f838c = obj3;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m837f(Editable editable, KeyEvent keyEvent, boolean z2) {
        C0508v[] c0508vArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c0508vArr = (C0508v[]) editable.getSpans(selectionStart, selectionEnd, C0508v.class)) != null && c0508vArr.length > 0) {
                for (C0508v c0508v : c0508vArr) {
                    int spanStart = editable.getSpanStart(c0508v);
                    int spanEnd = editable.getSpanEnd(c0508v);
                    if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static C0270l m838m(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new C0270l(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    @Override // p034S.InterfaceC0363g
    /* JADX INFO: renamed from: a */
    public ClipDescription mo839a() {
        return (ClipDescription) this.f837b;
    }

    @Override // p034S.InterfaceC0363g
    /* JADX INFO: renamed from: c */
    public Uri mo841c() {
        return (Uri) this.f838c;
    }

    @Override // p034S.InterfaceC0363g
    /* JADX INFO: renamed from: d */
    public Object mo842d() {
        return null;
    }

    @Override // p034S.InterfaceC0363g
    /* JADX INFO: renamed from: e */
    public Uri mo843e() {
        return (Uri) this.f836a;
    }

    /* JADX INFO: renamed from: g */
    public ColorStateList m844g(int i2) {
        int resourceId;
        ColorStateList colorStateListM160I;
        TypedArray typedArray = (TypedArray) this.f837b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListM160I = AbstractC0016e.m160I((Context) this.f836a, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListM160I;
    }

    /* JADX INFO: renamed from: h */
    public Drawable m845h(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f837b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : AbstractC0383m.m1057w((Context) this.f836a, resourceId);
    }

    /* JADX INFO: renamed from: i */
    public Drawable m846i(int i2) {
        int resourceId;
        Drawable drawableM2324g;
        if (!((TypedArray) this.f837b).hasValue(i2) || (resourceId = ((TypedArray) this.f837b).getResourceId(i2, 0)) == 0) {
            return null;
        }
        C0973u c0973uM2423a = C0973u.m2423a();
        Context context = (Context) this.f836a;
        synchronized (c0973uM2423a) {
            drawableM2324g = c0973uM2423a.f3860a.m2324g(context, resourceId, true);
        }
        return drawableM2324g;
    }

    /* JADX INFO: renamed from: j */
    public Typeface m847j(int i2, int i3, C0904V c0904v) {
        int resourceId = ((TypedArray) this.f837b).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f838c) == null) {
            this.f838c = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f838c;
        ThreadLocal threadLocal = AbstractC0071q.f219a;
        Context context = (Context) this.f836a;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC0071q.m351c(context, resourceId, typedValue, i3, c0904v, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m848k(CharSequence charSequence, int i2, int i3, C0507u c0507u) {
        boolean zM362a;
        if ((c0507u.f1556c & 3) == 0) {
            C0490d c0490d = (C0490d) this.f838c;
            C0406a c0406aM1322b = c0507u.m1322b();
            int iM694a = c0406aM1322b.m694a(8);
            short s2 = iM694a != 0 ? ((ByteBuffer) c0406aM1322b.f768d).getShort(iM694a + c0406aM1322b.f765a) : (short) 0;
            c0490d.getClass();
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 23 || s2 <= i4) {
                ThreadLocal threadLocal = C0490d.f1510b;
                if (threadLocal.get() == null) {
                    threadLocal.set(new StringBuilder());
                }
                StringBuilder sb = (StringBuilder) threadLocal.get();
                sb.setLength(0);
                while (i2 < i3) {
                    sb.append(charSequence.charAt(i2));
                    i2++;
                }
                TextPaint textPaint = c0490d.f1511a;
                String string = sb.toString();
                ThreadLocal threadLocal2 = AbstractC0078e.f242a;
                if (Build.VERSION.SDK_INT >= 23) {
                    zM362a = AbstractC0077d.m362a(textPaint, string);
                } else {
                    int length = string.length();
                    if (length != 1 || !Character.isWhitespace(string.charAt(0))) {
                        float fMeasureText = textPaint.measureText("\udfffd");
                        float fMeasureText2 = textPaint.measureText("m");
                        float fMeasureText3 = textPaint.measureText(string);
                        float fMeasureText4 = 0.0f;
                        if (fMeasureText3 != 0.0f) {
                            if (string.codePointCount(0, string.length()) > 1) {
                                if (fMeasureText3 <= fMeasureText2 * 2.0f) {
                                    int i5 = 0;
                                    while (i5 < length) {
                                        int iCharCount = Character.charCount(string.codePointAt(i5)) + i5;
                                        fMeasureText4 += textPaint.measureText(string, i5, iCharCount);
                                        i5 = iCharCount;
                                    }
                                    if (fMeasureText3 >= fMeasureText4) {
                                    }
                                }
                                zM362a = false;
                            }
                            if (fMeasureText3 != fMeasureText) {
                                zM362a = true;
                            } else {
                                ThreadLocal threadLocal3 = AbstractC0078e.f242a;
                                C0185b c0185b = (C0185b) threadLocal3.get();
                                if (c0185b == null) {
                                    c0185b = new C0185b(new Rect(), new Rect());
                                    threadLocal3.set(c0185b);
                                } else {
                                    c0185b.f613a.setEmpty();
                                    c0185b.f614b.setEmpty();
                                }
                                Rect rect = c0185b.f613a;
                                textPaint.getTextBounds("\udfffd", 0, 2, rect);
                                Rect rect2 = c0185b.f614b;
                                textPaint.getTextBounds(string, 0, length, rect2);
                                zM362a = !rect.equals(rect2);
                            }
                        } else {
                            zM362a = false;
                        }
                    }
                }
                int i6 = c0507u.f1556c & 4;
                c0507u.f1556c = zM362a ? i6 | 2 : i6 | 1;
            }
        }
        return (c0507u.f1556c & 3) == 2;
    }

    /* JADX INFO: renamed from: l */
    public boolean m849l(int i2, C1063d c1063d, C1103f c1103f) {
        int[] iArr = c1063d.f4330p0;
        int i3 = iArr[0];
        C1076b c1076b = (C1076b) this.f837b;
        c1076b.f4434a = i3;
        c1076b.f4435b = iArr[1];
        c1076b.f4436c = c1063d.m2617q();
        c1076b.f4437d = c1063d.m2613k();
        c1076b.f4442i = false;
        c1076b.f4443j = i2;
        boolean z2 = c1076b.f4434a == 3;
        boolean z3 = c1076b.f4435b == 3;
        boolean z4 = z2 && c1063d.f4295W > 0.0f;
        boolean z5 = z3 && c1063d.f4295W > 0.0f;
        int[] iArr2 = c1063d.f4334t;
        if (z4 && iArr2[0] == 4) {
            c1076b.f4434a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c1076b.f4435b = 1;
        }
        c1103f.m2741b(c1063d, c1076b);
        c1063d.m2602O(c1076b.f4438e);
        c1063d.m2599L(c1076b.f4439f);
        c1063d.f4277E = c1076b.f4441h;
        c1063d.m2596I(c1076b.f4440g);
        c1076b.f4443j = 0;
        return c1076b.f4442i;
    }

    /* JADX INFO: renamed from: n */
    public Object m850n(CharSequence charSequence, int i2, int i3, int i4, boolean z2, InterfaceC0500n interfaceC0500n) {
        char c2;
        C0501o c0501o = new C0501o((C0504r) ((C0010k) this.f837b).f24c);
        int i5 = i2;
        int iCodePointAt = Character.codePointAt(charSequence, i2);
        int i6 = 0;
        boolean zMo38c = true;
        int iCharCount = i5;
        while (iCharCount < i3 && i6 < i4 && zMo38c) {
            SparseArray sparseArray = c0501o.f1534c.f1547a;
            C0504r c0504r = sparseArray == null ? null : (C0504r) sparseArray.get(iCodePointAt);
            if (c0501o.f1532a == 2) {
                if (c0504r != null) {
                    c0501o.f1534c = c0504r;
                    c0501o.f1537f++;
                } else {
                    if (iCodePointAt == 65038) {
                        c0501o.m1310a();
                    } else if (iCodePointAt != 65039) {
                        C0504r c0504r2 = c0501o.f1534c;
                        if (c0504r2.f1548b != null) {
                            if (c0501o.f1537f != 1) {
                                c0501o.f1535d = c0504r2;
                                c0501o.m1310a();
                            } else if (c0501o.m1311b()) {
                                c0501o.f1535d = c0501o.f1534c;
                                c0501o.m1310a();
                            } else {
                                c0501o.m1310a();
                            }
                            c2 = 3;
                        } else {
                            c0501o.m1310a();
                        }
                    }
                    c2 = 1;
                }
                c2 = 2;
            } else if (c0504r == null) {
                c0501o.m1310a();
                c2 = 1;
            } else {
                c0501o.f1532a = 2;
                c0501o.f1534c = c0504r;
                c0501o.f1537f = 1;
                c2 = 2;
            }
            c0501o.f1536e = iCodePointAt;
            if (c2 == 1) {
                iCharCount = Character.charCount(Character.codePointAt(charSequence, i5)) + i5;
                if (iCharCount < i3) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                }
            } else if (c2 == 2) {
                int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                if (iCharCount2 < i3) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                }
                iCharCount = iCharCount2;
            } else if (c2 == 3) {
                if (z2 || !m848k(charSequence, i5, iCharCount, c0501o.f1535d.f1548b)) {
                    zMo38c = interfaceC0500n.mo38c(charSequence, i5, iCharCount, c0501o.f1535d.f1548b);
                    i6++;
                }
            }
            i5 = iCharCount;
        }
        if (c0501o.f1532a == 2 && c0501o.f1534c.f1548b != null && ((c0501o.f1537f > 1 || c0501o.m1311b()) && i6 < i4 && zMo38c && (z2 || !m848k(charSequence, i5, iCharCount, c0501o.f1534c.f1548b)))) {
            interfaceC0500n.mo38c(charSequence, i5, iCharCount, c0501o.f1534c.f1548b);
        }
        return interfaceC0500n.mo46k();
    }

    /* JADX INFO: renamed from: o */
    public void m851o() {
        ((TypedArray) this.f837b).recycle();
    }

    /* JADX INFO: renamed from: p */
    public void m852p(C1064e c1064e, int i2, int i3, int i4) {
        c1064e.getClass();
        int i5 = c1064e.f4302b0;
        int i6 = c1064e.f4304c0;
        c1064e.f4302b0 = 0;
        c1064e.f4304c0 = 0;
        c1064e.m2602O(i3);
        c1064e.m2599L(i4);
        if (i5 < 0) {
            c1064e.f4302b0 = 0;
        } else {
            c1064e.f4302b0 = i5;
        }
        if (i6 < 0) {
            c1064e.f4304c0 = 0;
        } else {
            c1064e.f4304c0 = i6;
        }
        C1064e c1064e2 = (C1064e) this.f838c;
        c1064e2.f4356t0 = i2;
        c1064e2.m2631U();
    }

    /* JADX INFO: renamed from: q */
    public void m853q(C1064e c1064e) {
        ArrayList arrayList = (ArrayList) this.f836a;
        arrayList.clear();
        int size = c1064e.f4353q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1063d c1063d = (C1063d) c1064e.f4353q0.get(i2);
            int[] iArr = c1063d.f4330p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c1063d);
            }
        }
        c1064e.f4355s0.f4447b = true;
    }

    public C0270l(Runnable runnable) {
        this.f837b = new CopyOnWriteArrayList();
        this.f838c = new HashMap();
        this.f836a = runnable;
    }

    public C0270l(Context context, TypedArray typedArray) {
        this.f836a = context;
        this.f837b = typedArray;
    }

    @Override // p034S.InterfaceC0363g
    /* JADX INFO: renamed from: b */
    public void mo840b() {
    }
}
