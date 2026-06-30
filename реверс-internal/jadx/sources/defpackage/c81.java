package defpackage;

import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.textclassifier.TextClassificationContext;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c81 {
    public static /* synthetic */ PrecomputedText.Params.Builder e(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* synthetic */ TextClassificationContext.Builder j(String str, String str2) {
        return new TextClassificationContext.Builder(str, str2);
    }

    public static /* synthetic */ void n() {
    }

    public static /* bridge */ /* synthetic */ boolean r(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
