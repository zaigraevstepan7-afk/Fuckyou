package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p015I0.C0109e;

/* JADX INFO: renamed from: androidx.emoji2.text.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0510x implements Spannable {

    /* JADX INFO: renamed from: a */
    public boolean f1562a = false;

    /* JADX INFO: renamed from: b */
    public Spannable f1563b;

    public C0510x(Spannable spannable) {
        this.f1563b = spannable;
    }

    /* JADX INFO: renamed from: a */
    public final void m1323a() {
        Spannable spannable = this.f1563b;
        if (!this.f1562a) {
            if ((Build.VERSION.SDK_INT < 28 ? new C0109e(13) : new C0509w(13)).mo463j(spannable)) {
                this.f1563b = new SpannableString(spannable);
            }
        }
        this.f1562a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f1563b.charAt(i2);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f1563b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f1563b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1563b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1563b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1563b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        return this.f1563b.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1563b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f1563b.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m1323a();
        this.f1563b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        m1323a();
        this.f1563b.setSpan(obj, i2, i3, i4);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return this.f1563b.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1563b.toString();
    }
}
