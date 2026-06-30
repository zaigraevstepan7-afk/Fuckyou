package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class y30 implements TextWatcher {
    public final tb e;
    public x30 f;
    public boolean g = true;

    public y30(tb tbVar) {
        this.e = tbVar;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            g30 g30VarA = g30.a();
            if (editableText == null) {
                length = 0;
            } else {
                g30VarA.getClass();
                length = editableText.length();
            }
            g30VarA.g(editableText, 0, length, 0);
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
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        tb tbVar = this.e;
        if (!tbVar.isInEditMode() && this.g && g30.d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iC = g30.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    g30.a().g((Spannable) charSequence, i, i3 + i, 0);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            g30 g30VarA = g30.a();
            if (this.f == null) {
                this.f = new x30(tbVar);
            }
            g30VarA.h(this.f);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
