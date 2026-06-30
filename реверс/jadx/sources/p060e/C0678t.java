package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.View;
import p024N.C0295x0;
import p024N.InterfaceC0282r;
import p072k.InterfaceC0827x;
import p072k.MenuC0816m;
import p074l.InterfaceC0951m0;

/* JADX INFO: renamed from: e.t */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0678t implements InterfaceC0282r, InterfaceC0951m0, InterfaceC0827x {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4899short = null;

    /* JADX INFO: renamed from: a */
    public final int f2720a;

    /* JADX INFO: renamed from: b */
    public final LayoutInflaterFactory2C0648D f2721b;

    static {
        ZLoader.registerNativesForClass(114, C0678t.class);
        Hidden0.special_clinit_114_00(C0678t.class);
    }

    public /* synthetic */ C0678t(LayoutInflaterFactory2C0648D layoutInflaterFactory2C0648D, int i2) {
        this.f2720a = i2;
        this.f2721b = layoutInflaterFactory2C0648D;
    }

    /* JADX INFO: renamed from: ۟۟ۥ۠۠, reason: not valid java name and contains not printable characters */
    public static native short[] m4383();

    @Override // p072k.InterfaceC0827x
    /* JADX INFO: renamed from: b */
    public native void mo37b(MenuC0816m menuC0816m, boolean z2);

    @Override // p072k.InterfaceC0827x
    /* JADX INFO: renamed from: h */
    public native boolean mo43h(MenuC0816m menuC0816m);

    @Override // p024N.InterfaceC0282r
    /* JADX INFO: renamed from: p */
    public native C0295x0 mo51p(View view, C0295x0 c0295x0);
}
