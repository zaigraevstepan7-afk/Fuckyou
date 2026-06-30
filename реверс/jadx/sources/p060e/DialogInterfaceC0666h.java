package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.DialogC0467l;
import com.reddit.frontpage.R;
import p022M.C1126;
import p032R.C1134;
import p038U.C1137;
import p050a0.C1142;
import p058d0.C0643;
import p066g0.C1160;
import p097x.C1178;

/* JADX INFO: renamed from: e.h */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceC0666h extends DialogC0467l implements DialogInterface, InterfaceC0670l {

    /* JADX INFO: renamed from: d */
    public LayoutInflaterFactory2C0648D f2691d;

    /* JADX INFO: renamed from: e */
    public final C0649E f2692e;

    /* JADX INFO: renamed from: f */
    public final C0665g f2693f;

    static {
        ZLoader.registerNativesForClass(105, DialogInterfaceC0666h.class);
        Hidden0.special_clinit_105_00(DialogInterfaceC0666h.class);
    }

    public DialogInterfaceC0666h(ContextThemeWrapper contextThemeWrapper, int i2) {
        int iM3678;
        int iM3319 = C1134.m3319(contextThemeWrapper, i2);
        if (iM3319 == 0) {
            TypedValue typedValue = new TypedValue();
            C0643.m4286(C1160.m4451(contextThemeWrapper), R.attr.resc, typedValue, true);
            iM3678 = C1142.m3678(typedValue);
        } else {
            iM3678 = iM3319;
        }
        super(contextThemeWrapper, iM3678);
        this.f2692e = new C0649E(this);
        AbstractC0676r abstractC0676rM2970 = C1126.m2970(this);
        if (iM3319 == 0) {
            TypedValue typedValue2 = new TypedValue();
            C0643.m4286(C1160.m4451(contextThemeWrapper), R.attr.resc, typedValue2, true);
            iM3319 = C1142.m3678(typedValue2);
        }
        ((LayoutInflaterFactory2C0648D) abstractC0676rM2970).f2547T = iM3319;
        C1178.m5178(abstractC0676rM2970);
        this.f2693f = new C0665g(C1137.m3436(this), this, C0643.m4324(this));
    }

    /* JADX INFO: renamed from: g */
    public static native int m1888g(Context context, int i2);

    /* JADX INFO: renamed from: ۟ۥ۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static native int m4377(Object obj);

    @Override // androidx.activity.DialogC0467l, android.app.Dialog
    public final native void addContentView(View view, ViewGroup.LayoutParams layoutParams);

    @Override // android.app.Dialog, android.content.DialogInterface
    public final native void dismiss();

    @Override // android.app.Dialog, android.view.Window.Callback
    public final native boolean dispatchKeyEvent(KeyEvent keyEvent);

    /* JADX INFO: renamed from: e */
    public final native AbstractC0676r m1889e();

    /* JADX INFO: renamed from: f */
    public final native void m1890f(Bundle bundle);

    @Override // android.app.Dialog
    public final native View findViewById(int i2);

    /* JADX INFO: renamed from: h */
    public final native void m1891h(CharSequence charSequence);

    /* JADX INFO: renamed from: i */
    public final native boolean m1892i(KeyEvent keyEvent);

    @Override // android.app.Dialog
    public final native void invalidateOptionsMenu();

    @Override // androidx.activity.DialogC0467l, android.app.Dialog
    public final native void onCreate(Bundle bundle);

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final native boolean onKeyDown(int i2, KeyEvent keyEvent);

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final native boolean onKeyUp(int i2, KeyEvent keyEvent);

    @Override // androidx.activity.DialogC0467l, android.app.Dialog
    public final native void onStop();

    @Override // androidx.activity.DialogC0467l, android.app.Dialog
    public final native void setContentView(int i2);

    @Override // androidx.activity.DialogC0467l, android.app.Dialog
    public final native void setContentView(View view);

    @Override // androidx.activity.DialogC0467l, android.app.Dialog
    public final native void setContentView(View view, ViewGroup.LayoutParams layoutParams);

    @Override // android.app.Dialog
    public final native void setTitle(int i2);

    @Override // android.app.Dialog
    public final native void setTitle(CharSequence charSequence);
}
