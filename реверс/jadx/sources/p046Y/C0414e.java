package p046Y;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import p015I0.C0109e;
import p024N.C0270l;

/* JADX INFO: renamed from: Y.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0414e implements KeyListener {

    /* JADX INFO: renamed from: a */
    public final KeyListener f1122a;

    /* JADX INFO: renamed from: b */
    public final C0109e f1123b;

    public C0414e(KeyListener keyListener) {
        C0109e c0109e = new C0109e(9);
        this.f1122a = keyListener;
        this.f1123b = c0109e;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i2) {
        this.f1122a.clearMetaKeyState(view, editable, i2);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f1122a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i2, KeyEvent keyEvent) {
        boolean z2;
        this.f1123b.getClass();
        if (i2 != 67 ? i2 != 112 ? false : C0270l.m837f(editable, keyEvent, true) : C0270l.m837f(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2 || this.f1122a.onKeyDown(view, editable, i2, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f1122a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i2, KeyEvent keyEvent) {
        return this.f1122a.onKeyUp(view, editable, i2, keyEvent);
    }
}
