package p046Y;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.C0492f;
import androidx.emoji2.text.C0496j;
import java.nio.ByteBuffer;
import p015I0.C0109e;
import p044X.C0407b;

/* JADX INFO: renamed from: Y.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0411b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final EditText f1116a;

    /* JADX INFO: renamed from: b */
    public final C0109e f1117b;

    public C0411b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C0109e c0109e = new C0109e(8);
        super(inputConnection, false);
        this.f1116a = editText;
        this.f1117b = c0109e;
        if (C0496j.f1520k != null) {
            C0496j c0496jM1303a = C0496j.m1303a();
            if (c0496jM1303a.m1304b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C0492f c0492f = c0496jM1303a.f1525e;
            c0492f.getClass();
            Bundle bundle = editorInfo.extras;
            C0407b c0407b = (C0407b) c0492f.f1515c.f22a;
            int iM694a = c0407b.m694a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM694a != 0 ? ((ByteBuffer) c0407b.f768d).getInt(iM694a + c0407b.f765a) : 0);
            Bundle bundle2 = editorInfo.extras;
            c0492f.f1513a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        Editable editableText = this.f1116a.getEditableText();
        this.f1117b.getClass();
        return C0109e.m456i(this, editableText, i2, i3, false) || super.deleteSurroundingText(i2, i3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        Editable editableText = this.f1116a.getEditableText();
        this.f1117b.getClass();
        return C0109e.m456i(this, editableText, i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3);
    }
}
