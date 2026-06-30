package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p001A0.AbstractC0016e;

/* JADX INFO: renamed from: androidx.emoji2.text.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0506t extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a */
    public final Class f1551a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1552b;

    public C0506t(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f1552b = new ArrayList();
        AbstractC0016e.m180j(cls, "watcherClass cannot be null");
        this.f1551a = cls;
    }

    /* JADX INFO: renamed from: a */
    public final void m1316a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1552b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C0505s) arrayList.get(i2)).f1550b.incrementAndGet();
            i2++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m1317b() {
        m1320e();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1552b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C0505s) arrayList.get(i2)).onTextChanged(this, 0, length(), length());
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0505s m1318c(Object obj) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1552b;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C0505s c0505s = (C0505s) arrayList.get(i2);
            if (c0505s.f1549a == obj) {
                return c0505s;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1319d(Object obj) {
        if (obj != null) {
            return this.f1551a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m1320e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1552b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C0505s) arrayList.get(i2)).f1550b.decrementAndGet();
            i2++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C0505s c0505sM1318c;
        if (m1319d(obj) && (c0505sM1318c = m1318c(obj)) != null) {
            obj = c0505sM1318c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C0505s c0505sM1318c;
        if (m1319d(obj) && (c0505sM1318c = m1318c(obj)) != null) {
            obj = c0505sM1318c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C0505s c0505sM1318c;
        if (m1319d(obj) && (c0505sM1318c = m1318c(obj)) != null) {
            obj = c0505sM1318c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        if (this.f1551a != cls) {
            return super.getSpans(i2, i3, cls);
        }
        C0505s[] c0505sArr = (C0505s[]) super.getSpans(i2, i3, C0505s.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c0505sArr.length);
        for (int i4 = 0; i4 < c0505sArr.length; i4++) {
            objArr[i4] = c0505sArr[i4].f1549a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        if (cls == null || this.f1551a == cls) {
            cls = C0505s.class;
        }
        return super.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C0505s c0505sM1318c;
        if (m1319d(obj)) {
            c0505sM1318c = m1318c(obj);
            if (c0505sM1318c != null) {
                obj = c0505sM1318c;
            }
        } else {
            c0505sM1318c = null;
        }
        super.removeSpan(obj);
        if (c0505sM1318c != null) {
            this.f1552b.remove(c0505sM1318c);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i2, int i3, CharSequence charSequence) {
        replace(i2, i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        if (m1319d(obj)) {
            C0505s c0505s = new C0505s(obj);
            this.f1552b.add(c0505s);
            obj = c0505s;
        }
        super.setSpan(obj, i2, i3, i4);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return new C0506t(this.f1551a, this, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        replace(i2, i3, charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence) {
        m1316a();
        super.replace(i2, i3, charSequence);
        m1320e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    public C0506t(Class cls, C0506t c0506t, int i2, int i3) {
        super(c0506t, i2, i3);
        this.f1552b = new ArrayList();
        AbstractC0016e.m180j(cls, "watcherClass cannot be null");
        this.f1551a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        m1316a();
        super.replace(i2, i3, charSequence, i4, i5);
        m1320e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i2) {
        super.append(charSequence, obj, i2);
        return this;
    }
}
