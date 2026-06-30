package androidx.emoji2.text;

import android.text.TextPaint;

/* JADX INFO: renamed from: androidx.emoji2.text.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0490d {

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f1510b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final TextPaint f1511a;

    public C0490d() {
        TextPaint textPaint = new TextPaint();
        this.f1511a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
