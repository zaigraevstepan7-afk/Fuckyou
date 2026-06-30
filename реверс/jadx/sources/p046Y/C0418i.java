package p046Y;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0496j;

/* JADX INFO: renamed from: Y.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0418i implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final EditText f1130a;

    /* JADX INFO: renamed from: b */
    public C0417h f1131b;

    /* JADX INFO: renamed from: c */
    public boolean f1132c = true;

    public C0418i(EditText editText) {
        this.f1130a = editText;
    }

    /* JADX INFO: renamed from: a */
    public static void m1134a(EditText editText, int i2) {
        int length;
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0496j c0496jM1303a = C0496j.m1303a();
            if (editableText == null) {
                length = 0;
            } else {
                c0496jM1303a.getClass();
                length = editableText.length();
            }
            c0496jM1303a.m1307e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) throws Throwable {
        EditText editText = this.f1130a;
        if (editText.isInEditMode() || !this.f1132c || C0496j.f1520k == null || i3 > i4 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM1304b = C0496j.m1303a().m1304b();
        if (iM1304b != 0) {
            if (iM1304b == 1) {
                C0496j.m1303a().m1307e((Spannable) charSequence, i2, i4 + i2);
                return;
            } else if (iM1304b != 3) {
                return;
            }
        }
        C0496j c0496jM1303a = C0496j.m1303a();
        if (this.f1131b == null) {
            this.f1131b = new C0417h(editText);
        }
        c0496jM1303a.m1308f(this.f1131b);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
