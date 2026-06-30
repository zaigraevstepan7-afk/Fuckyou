package p036T;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p024N.C0258f;
import p024N.InterfaceC0256e;
import p024N.InterfaceC0284s;

/* JADX INFO: renamed from: T.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0389s implements InterfaceC0284s {
    /* JADX INFO: renamed from: a */
    public final C0258f m1096a(View view, C0258f c0258f) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0258f);
        }
        if (c0258f.f810a.mo41f() == 2) {
            return c0258f;
        }
        InterfaceC0256e interfaceC0256e = c0258f.f810a;
        ClipData clipDataMo47l = interfaceC0256e.mo47l();
        int iMo54s = interfaceC0256e.mo54s();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z2 = false;
        for (int i2 = 0; i2 < clipDataMo47l.getItemCount(); i2++) {
            ClipData.Item itemAt = clipDataMo47l.getItemAt(i2);
            if ((iMo54s & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z2) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z2 = true;
                }
            }
        }
        return null;
    }
}
