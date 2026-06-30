package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class p01 implements InputConnection {
    public final g3 a;
    public mc1 b;

    public p01(mc1 mc1Var, g3 g3Var) {
        this.a = g3Var;
        this.b = mc1Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            if (mc1Var != null) {
                mc1Var.closeConnection();
                this.b = null;
            }
            this.a.i(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        mc1 mc1Var = this.b;
        if (mc1Var != null) {
            return mc1Var.setSelection(i, i2);
        }
        return false;
    }
}
