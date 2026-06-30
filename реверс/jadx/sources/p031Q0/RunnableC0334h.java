package p031Q0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import com.reddit.frontpage.MainActivity;

/* JADX INFO: renamed from: Q0.h */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0334h implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4851short = null;

    /* JADX INFO: renamed from: a */
    public final int f951a;

    /* JADX INFO: renamed from: b */
    public final Object f952b;

    /* JADX INFO: renamed from: c */
    public final Object f953c;

    /* JADX INFO: renamed from: d */
    public final Object f954d;

    static {
        ZLoader.registerNativesForClass(61, RunnableC0334h.class);
        Hidden0.special_clinit_61_00(RunnableC0334h.class);
    }

    public /* synthetic */ RunnableC0334h(MainActivity mainActivity, String str, String str2) {
        this.f951a = 1;
        this.f953c = mainActivity;
        this.f952b = str;
        this.f954d = str2;
    }

    public /* synthetic */ RunnableC0334h(Object obj, Object obj2, Object obj3, int i2) {
        this.f951a = i2;
        this.f953c = obj;
        this.f954d = obj2;
        this.f952b = obj3;
    }

    /* JADX INFO: renamed from: ۟ۦۣۥۡ, reason: not valid java name and contains not printable characters */
    public static native short[] m3277();

    @Override // java.lang.Runnable
    public final native void run();
}
