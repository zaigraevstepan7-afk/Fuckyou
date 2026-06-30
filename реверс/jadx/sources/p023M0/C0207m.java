package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.constraintlayout.helper.widget.C1146;
import com.reddit.frontpage.R;
import p004C.C1122;
import p026O.C0311k;
import p045X0.C1141;
import p068h0.C1162;

/* JADX INFO: renamed from: M0.m */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0207m extends AbstractC0213s {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4839short = null;

    /* JADX INFO: renamed from: e */
    public final int f663e;

    /* JADX INFO: renamed from: f */
    public final int f664f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f665g;

    /* JADX INFO: renamed from: h */
    public AutoCompleteTextView f666h;

    /* JADX INFO: renamed from: i */
    public final ViewOnClickListenerC0195a f667i;

    /* JADX INFO: renamed from: j */
    public final ViewOnFocusChangeListenerC0196b f668j;

    /* JADX INFO: renamed from: k */
    public final C0206l f669k;

    /* JADX INFO: renamed from: l */
    public boolean f670l;

    /* JADX INFO: renamed from: m */
    public boolean f671m;

    /* JADX INFO: renamed from: n */
    public boolean f672n;

    /* JADX INFO: renamed from: o */
    public long f673o;

    /* JADX INFO: renamed from: p */
    public AccessibilityManager f674p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f675q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f676r;

    static {
        ZLoader.registerNativesForClass(40, C0207m.class);
        Hidden0.special_clinit_40_00(C0207m.class);
    }

    public C0207m(C0212r c0212r) {
        super(c0212r);
        this.f667i = new ViewOnClickListenerC0195a(1, this);
        this.f668j = new ViewOnFocusChangeListenerC0196b(this, 1);
        this.f669k = new C0206l(this);
        this.f673o = Long.MAX_VALUE;
        this.f664f = C1162.m4553(C1146.m3855(c0212r), R.attr.resc, 67);
        this.f663e = C1162.m4553(C1146.m3855(c0212r), R.attr.resc, 50);
        this.f665g = C1141.m3626(C1146.m3855(c0212r), R.attr.resc, C1122.m2816());
    }

    /* JADX INFO: renamed from: ۟ۢۥۡ۟, reason: not valid java name and contains not printable characters */
    public static native short[] m3005();

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: a */
    public final native void mo632a();

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: c */
    public final native int mo633c();

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: d */
    public final native int mo634d();

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: e */
    public final native View.OnFocusChangeListener mo635e();

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: f */
    public final native View.OnClickListener mo636f();

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: h */
    public final native C0206l mo647h();

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: i */
    public final native boolean mo648i(int i2);

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: j */
    public final native boolean mo649j();

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: l */
    public final native boolean mo650l();

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: m */
    public final native void mo638m(EditText editText);

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: n */
    public final native void mo651n(C0311k c0311k);

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: o */
    public final native void mo652o(AccessibilityEvent accessibilityEvent);

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: r */
    public final native void mo640r();

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: s */
    public final native void mo641s();

    /* JADX INFO: renamed from: t */
    public final native void m653t(boolean z2);

    /* JADX INFO: renamed from: u */
    public final native void m654u();
}
