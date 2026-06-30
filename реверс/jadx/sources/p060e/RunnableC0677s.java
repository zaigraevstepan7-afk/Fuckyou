package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;

/* JADX INFO: renamed from: e.s */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0677s implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f2718a;

    /* JADX INFO: renamed from: b */
    public final LayoutInflaterFactory2C0648D f2719b;

    static {
        ZLoader.registerNativesForClass(113, RunnableC0677s.class);
        Hidden0.special_clinit_113_00(RunnableC0677s.class);
    }

    public /* synthetic */ RunnableC0677s(LayoutInflaterFactory2C0648D layoutInflaterFactory2C0648D, int i2) {
        this.f2718a = i2;
        this.f2719b = layoutInflaterFactory2C0648D;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
