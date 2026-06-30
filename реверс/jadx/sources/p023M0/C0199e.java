package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.helper.widget.C1146;
import com.reddit.frontpage.R;
import p004C.C1122;
import p045X0.C1141;
import p051a1.C1145;
import p068h0.C1162;

/* JADX INFO: renamed from: M0.e */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0199e extends AbstractC0213s {

    /* JADX INFO: renamed from: e */
    public final int f645e;

    /* JADX INFO: renamed from: f */
    public final int f646f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f647g;

    /* JADX INFO: renamed from: h */
    public final TimeInterpolator f648h;

    /* JADX INFO: renamed from: i */
    public EditText f649i;

    /* JADX INFO: renamed from: j */
    public final ViewOnClickListenerC0195a f650j;

    /* JADX INFO: renamed from: k */
    public final ViewOnFocusChangeListenerC0196b f651k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f652l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f653m;

    static {
        ZLoader.registerNativesForClass(32, C0199e.class);
        Hidden0.special_clinit_32_00(C0199e.class);
    }

    public C0199e(C0212r c0212r) {
        super(c0212r);
        this.f650j = new ViewOnClickListenerC0195a(0, this);
        this.f651k = new ViewOnFocusChangeListenerC0196b(this, 0);
        this.f645e = C1162.m4553(C1146.m3855(c0212r), R.attr.resc, 100);
        this.f646f = C1162.m4553(C1146.m3855(c0212r), R.attr.resc, 150);
        this.f647g = C1141.m3626(C1146.m3855(c0212r), R.attr.resc, C1122.m2816());
        this.f648h = C1141.m3626(C1146.m3855(c0212r), R.attr.resc, C1145.m3810());
    }

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
    /* JADX INFO: renamed from: g */
    public final native View.OnFocusChangeListener mo637g();

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: m */
    public final native void mo638m(EditText editText);

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: p */
    public final native void mo639p(boolean z2);

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: r */
    public final native void mo640r();

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: s */
    public final native void mo641s();

    /* JADX INFO: renamed from: t */
    public final native void m642t(boolean z2);

    /* JADX INFO: renamed from: u */
    public final native boolean m643u();
}
