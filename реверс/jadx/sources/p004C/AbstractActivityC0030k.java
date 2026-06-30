package p004C;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0559C;
import androidx.lifecycle.C0588t;
import androidx.lifecycle.FragmentC0561E;
import androidx.lifecycle.InterfaceC0586r;
import p001A0.AbstractC0016e;
import p024N.InterfaceC0268k;
import p051a1.AbstractC0451c;

/* JADX INFO: renamed from: C.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0030k extends Activity implements InterfaceC0586r, InterfaceC0268k {

    /* JADX INFO: renamed from: a */
    public final C0588t f74a = new C0588t(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC0451c.m1146e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC0451c.m1145d(decorView, "window.decorView");
        if (AbstractC0016e.m155C(decorView, keyEvent)) {
            return true;
        }
        return AbstractC0016e.m156D(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC0451c.m1146e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC0451c.m1145d(decorView, "window.decorView");
        if (AbstractC0016e.m155C(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // p024N.InterfaceC0268k
    /* JADX INFO: renamed from: e */
    public final boolean mo246e(KeyEvent keyEvent) {
        AbstractC0451c.m1146e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i2 = FragmentC0561E.f1838b;
        AbstractC0559C.m1470b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0451c.m1146e(bundle, "outState");
        this.f74a.m1487g();
        super.onSaveInstanceState(bundle);
    }
}
