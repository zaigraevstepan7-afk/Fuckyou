package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.textfield.TextInputLayout;
import p024N.C0250b;
import p026O.C0311k;

/* JADX INFO: renamed from: M0.E */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0192E extends C0250b {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4836short = null;

    /* JADX INFO: renamed from: d */
    public final TextInputLayout f634d;

    static {
        ZLoader.registerNativesForClass(25, C0192E.class);
        Hidden0.special_clinit_25_00(C0192E.class);
    }

    public C0192E(TextInputLayout textInputLayout) {
        this.f634d = textInputLayout;
    }

    /* JADX INFO: renamed from: ۟ۥۧۨ, reason: not valid java name and contains not printable characters */
    public static native short[] m3002();

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: d */
    public final native void mo251d(View view, C0311k c0311k);

    @Override // p024N.C0250b
    /* JADX INFO: renamed from: e */
    public final native void mo631e(View view, AccessibilityEvent accessibilityEvent);
}
