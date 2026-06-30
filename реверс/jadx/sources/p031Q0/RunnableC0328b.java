package p031Q0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import p060e.AbstractActivityC0669k;

/* JADX INFO: renamed from: Q0.b */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0328b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f937a;

    /* JADX INFO: renamed from: b */
    public final AbstractActivityC0669k f938b;

    /* JADX INFO: renamed from: c */
    public final boolean f939c;

    static {
        ZLoader.registerNativesForClass(55, RunnableC0328b.class);
        Hidden0.special_clinit_55_00(RunnableC0328b.class);
    }

    public /* synthetic */ RunnableC0328b(AbstractActivityC0669k abstractActivityC0669k, boolean z2, int i2) {
        this.f937a = i2;
        this.f938b = abstractActivityC0669k;
        this.f939c = z2;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
