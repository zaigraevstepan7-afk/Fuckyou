package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import p071j.C0790e;
import p073k0.C1167;

/* JADX INFO: renamed from: e.y */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class WindowCallbackC0683y implements Window.Callback {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4900short = null;

    /* JADX INFO: renamed from: a */
    public final Window.Callback f2724a;

    /* JADX INFO: renamed from: b */
    public boolean f2725b;

    /* JADX INFO: renamed from: c */
    public boolean f2726c;

    /* JADX INFO: renamed from: d */
    public boolean f2727d;

    /* JADX INFO: renamed from: e */
    public final LayoutInflaterFactory2C0648D f2728e;

    static {
        ZLoader.registerNativesForClass(119, WindowCallbackC0683y.class);
        Hidden0.special_clinit_119_00(WindowCallbackC0683y.class);
    }

    public WindowCallbackC0683y(LayoutInflaterFactory2C0648D layoutInflaterFactory2C0648D, Window.Callback callback) {
        this.f2728e = layoutInflaterFactory2C0648D;
        if (callback == null) {
            throw new IllegalArgumentException(C1167.m4743(m4384(), 0, 31, 1986));
        }
        this.f2724a = callback;
    }

    /* JADX INFO: renamed from: ۟ۥۥ۟۟, reason: not valid java name and contains not printable characters */
    public static native short[] m4384();

    /* JADX INFO: renamed from: ۣۤۢ۠, reason: not valid java name and contains not printable characters */
    public static native int m4385(Object obj);

    /* JADX INFO: renamed from: a */
    public final native void m1915a(Window.Callback callback);

    /* JADX INFO: renamed from: b */
    public final native boolean m1916b(int i2, Menu menu);

    /* JADX INFO: renamed from: c */
    public final native void m1917c(int i2, Menu menu);

    /* JADX INFO: renamed from: d */
    public final native void m1918d(List list, Menu menu, int i2);

    @Override // android.view.Window.Callback
    public final native boolean dispatchGenericMotionEvent(MotionEvent motionEvent);

    @Override // android.view.Window.Callback
    public final native boolean dispatchKeyEvent(KeyEvent keyEvent);

    @Override // android.view.Window.Callback
    public final native boolean dispatchKeyShortcutEvent(KeyEvent keyEvent);

    @Override // android.view.Window.Callback
    public final native boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent);

    @Override // android.view.Window.Callback
    public final native boolean dispatchTouchEvent(MotionEvent motionEvent);

    @Override // android.view.Window.Callback
    public final native boolean dispatchTrackballEvent(MotionEvent motionEvent);

    /* JADX INFO: renamed from: e */
    public final native C0790e m1919e(ActionMode.Callback callback);

    @Override // android.view.Window.Callback
    public final native void onActionModeFinished(ActionMode actionMode);

    @Override // android.view.Window.Callback
    public final native void onActionModeStarted(ActionMode actionMode);

    @Override // android.view.Window.Callback
    public final native void onAttachedToWindow();

    @Override // android.view.Window.Callback
    public final native void onContentChanged();

    @Override // android.view.Window.Callback
    public final native boolean onCreatePanelMenu(int i2, Menu menu);

    @Override // android.view.Window.Callback
    public final native View onCreatePanelView(int i2);

    @Override // android.view.Window.Callback
    public final native void onDetachedFromWindow();

    @Override // android.view.Window.Callback
    public final native boolean onMenuItemSelected(int i2, MenuItem menuItem);

    @Override // android.view.Window.Callback
    public final native boolean onMenuOpened(int i2, Menu menu);

    @Override // android.view.Window.Callback
    public final native void onPanelClosed(int i2, Menu menu);

    @Override // android.view.Window.Callback
    public final native void onPointerCaptureChanged(boolean z2);

    @Override // android.view.Window.Callback
    public final native boolean onPreparePanel(int i2, View view, Menu menu);

    @Override // android.view.Window.Callback
    public final native void onProvideKeyboardShortcuts(List list, Menu menu, int i2);

    @Override // android.view.Window.Callback
    public final native boolean onSearchRequested();

    @Override // android.view.Window.Callback
    public final native boolean onSearchRequested(SearchEvent searchEvent);

    @Override // android.view.Window.Callback
    public final native void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams);

    @Override // android.view.Window.Callback
    public final native void onWindowFocusChanged(boolean z2);

    @Override // android.view.Window.Callback
    public final native ActionMode onWindowStartingActionMode(ActionMode.Callback callback);

    @Override // android.view.Window.Callback
    public final native ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2);
}
