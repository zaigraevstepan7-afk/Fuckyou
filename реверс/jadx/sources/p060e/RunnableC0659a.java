package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.view.View;

/* JADX INFO: renamed from: e.a */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0659a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f2631a;

    /* JADX INFO: renamed from: b */
    public final View f2632b;

    /* JADX INFO: renamed from: c */
    public final View f2633c;

    /* JADX INFO: renamed from: d */
    public final C0665g f2634d;

    static {
        ZLoader.registerNativesForClass(98, RunnableC0659a.class);
        Hidden0.special_clinit_98_00(RunnableC0659a.class);
    }

    public /* synthetic */ RunnableC0659a(C0665g c0665g, View view, View view2, int i2) {
        this.f2631a = i2;
        this.f2634d = c0665g;
        this.f2632b = view;
        this.f2633c = view2;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
