package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.constraintlayout.helper.widget.C1146;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import p026O.C0311k;
import p066g0.C1160;

/* JADX INFO: renamed from: M0.s */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0213s {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f707a;

    /* JADX INFO: renamed from: b */
    public final C0212r f708b;

    /* JADX INFO: renamed from: c */
    public final Context f709c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f710d;

    static {
        ZLoader.registerNativesForClass(31, AbstractC0213s.class);
        Hidden0.special_clinit_31_00(AbstractC0213s.class);
    }

    public AbstractC0213s(C0212r c0212r) {
        this.f707a = C1127.m3048(c0212r);
        this.f708b = c0212r;
        this.f709c = C1146.m3855(c0212r);
        this.f710d = C1160.m4441(c0212r);
    }

    /* JADX INFO: renamed from: a */
    public native void mo632a();

    /* JADX INFO: renamed from: b */
    public native void mo673b();

    /* JADX INFO: renamed from: c */
    public native int mo633c();

    /* JADX INFO: renamed from: d */
    public native int mo634d();

    /* JADX INFO: renamed from: e */
    public native View.OnFocusChangeListener mo635e();

    /* JADX INFO: renamed from: f */
    public native View.OnClickListener mo636f();

    /* JADX INFO: renamed from: g */
    public native View.OnFocusChangeListener mo637g();

    /* JADX INFO: renamed from: h */
    public native C0206l mo647h();

    /* JADX INFO: renamed from: i */
    public native boolean mo648i(int i2);

    /* JADX INFO: renamed from: j */
    public native boolean mo649j();

    /* JADX INFO: renamed from: k */
    public native boolean mo674k();

    /* JADX INFO: renamed from: l */
    public native boolean mo650l();

    /* JADX INFO: renamed from: m */
    public native void mo638m(EditText editText);

    /* JADX INFO: renamed from: n */
    public native void mo651n(C0311k c0311k);

    /* JADX INFO: renamed from: o */
    public native void mo652o(AccessibilityEvent accessibilityEvent);

    /* JADX INFO: renamed from: p */
    public native void mo639p(boolean z2);

    /* JADX INFO: renamed from: q */
    public final native void m675q();

    /* JADX INFO: renamed from: r */
    public native void mo640r();

    /* JADX INFO: renamed from: s */
    public native void mo641s();
}
