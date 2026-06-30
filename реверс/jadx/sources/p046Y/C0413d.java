package p046Y;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C0496j;

/* JADX INFO: renamed from: Y.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0413d implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final TextView f1120a;

    /* JADX INFO: renamed from: b */
    public C0412c f1121b;

    public C0413d(TextView textView) {
        this.f1120a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        TextView textView = this.f1120a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM1304b = C0496j.m1303a().m1304b();
        if (iM1304b != 0) {
            if (iM1304b == 1) {
                if ((i5 == 0 && i4 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i2 != 0 || i3 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i2, i3);
                }
                return C0496j.m1303a().m1307e(charSequence, 0, charSequence.length());
            }
            if (iM1304b != 3) {
                return charSequence;
            }
        }
        C0496j c0496jM1303a = C0496j.m1303a();
        if (this.f1121b == null) {
            this.f1121b = new C0412c(textView, this);
        }
        c0496jM1303a.m1308f(this.f1121b);
        return charSequence;
    }
}
