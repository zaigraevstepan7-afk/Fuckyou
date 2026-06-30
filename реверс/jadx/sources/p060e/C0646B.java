package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import p071j.C0788c;

/* JADX INFO: renamed from: e.B */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0646B extends ContentFrameLayout {

    /* JADX INFO: renamed from: i */
    public final LayoutInflaterFactory2C0648D f2508i;

    static {
        ZLoader.registerNativesForClass(84, C0646B.class);
        Hidden0.special_clinit_84_00(C0646B.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0646B(LayoutInflaterFactory2C0648D layoutInflaterFactory2C0648D, C0788c c0788c) {
        super(c0788c, null);
        this.f2508i = layoutInflaterFactory2C0648D;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final native boolean dispatchKeyEvent(KeyEvent keyEvent);

    @Override // android.view.ViewGroup
    public final native boolean onInterceptTouchEvent(MotionEvent motionEvent);

    @Override // android.view.View
    public final native void setBackgroundResource(int i2);
}
