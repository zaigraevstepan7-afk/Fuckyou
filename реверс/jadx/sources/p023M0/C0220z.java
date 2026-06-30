package p023M0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.View;
import android.widget.EditText;
import com.reddit.frontpage.R;

/* JADX INFO: renamed from: M0.z */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0220z extends AbstractC0213s {

    /* JADX INFO: renamed from: e */
    public final int f758e;

    /* JADX INFO: renamed from: f */
    public EditText f759f;

    /* JADX INFO: renamed from: g */
    public final ViewOnClickListenerC0195a f760g;

    static {
        ZLoader.registerNativesForClass(52, C0220z.class);
        Hidden0.special_clinit_52_00(C0220z.class);
    }

    public C0220z(C0212r c0212r, int i2) {
        super(c0212r);
        this.f758e = R.drawable.resc;
        this.f760g = new ViewOnClickListenerC0195a(2, this);
        if (i2 != 0) {
            this.f758e = i2;
        }
    }

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: b */
    public final native void mo673b();

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: c */
    public final native int mo633c();

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: d */
    public final native int mo634d();

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: f */
    public final native View.OnClickListener mo636f();

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: k */
    public final native boolean mo674k();

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: l */
    public final native boolean mo650l();

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: m */
    public final native void mo638m(EditText editText);

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: r */
    public final native void mo640r();

    @Override // p023M0.AbstractC0213s
    /* JADX INFO: renamed from: s */
    public final native void mo641s();
}
