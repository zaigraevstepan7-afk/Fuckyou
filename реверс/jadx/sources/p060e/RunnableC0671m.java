package p060e;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import android.content.Context;

/* JADX INFO: renamed from: e.m */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0671m implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4897short = null;

    /* JADX INFO: renamed from: a */
    public final int f2703a;

    /* JADX INFO: renamed from: b */
    public final Context f2704b;

    static {
        ZLoader.registerNativesForClass(108, RunnableC0671m.class);
        Hidden0.special_clinit_108_00(RunnableC0671m.class);
    }

    public /* synthetic */ RunnableC0671m(Context context, int i2) {
        this.f2703a = i2;
        this.f2704b = context;
    }

    /* JADX INFO: renamed from: ۥ۠ۤۤ, reason: contains not printable characters */
    public static native short[] m4381();

    @Override // java.lang.Runnable
    public final native void run();
}
