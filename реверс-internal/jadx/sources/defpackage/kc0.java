package defpackage;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class kc0 extends lk {
    public final CharSequence b;
    public final TextPaint c;

    public kc0(CharSequence charSequence, TextPaint textPaint) {
        this.b = charSequence;
        this.c = textPaint;
    }

    @Override // defpackage.lk
    public final int X(int i) {
        CharSequence charSequence = this.b;
        return this.c.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.lk
    public final int b0(int i) {
        CharSequence charSequence = this.b;
        return this.c.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
