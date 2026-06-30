package p046Y;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.AbstractC0494h;
import androidx.emoji2.text.C0496j;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: Y.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0412c extends AbstractC0494h {

    /* JADX INFO: renamed from: a */
    public final WeakReference f1118a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f1119b;

    public C0412c(TextView textView, C0413d c0413d) {
        this.f1118a = new WeakReference(textView);
        this.f1119b = new WeakReference(c0413d);
    }

    @Override // androidx.emoji2.text.AbstractC0494h
    /* JADX INFO: renamed from: b */
    public final void mo1132b() throws Throwable {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f1118a.get();
        InputFilter inputFilter = (InputFilter) this.f1119b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C0496j c0496jM1303a = C0496j.m1303a();
                    if (text == null) {
                        length = 0;
                    } else {
                        c0496jM1303a.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM1307e = c0496jM1303a.m1307e(text, 0, length);
                    if (text == charSequenceM1307e) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM1307e);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM1307e);
                    textView.setText(charSequenceM1307e);
                    if (charSequenceM1307e instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM1307e;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
