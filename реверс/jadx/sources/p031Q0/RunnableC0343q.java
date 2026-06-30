package p031Q0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import com.reddit.frontpage.MainActivity;

/* JADX INFO: renamed from: Q0.q */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0343q implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4854short = null;

    /* JADX INFO: renamed from: a */
    public final int f976a;

    /* JADX INFO: renamed from: b */
    public final MainActivity f977b;

    /* JADX INFO: renamed from: c */
    public final String f978c;

    static {
        ZLoader.registerNativesForClass(70, RunnableC0343q.class);
        Hidden0.special_clinit_70_00(RunnableC0343q.class);
    }

    public /* synthetic */ RunnableC0343q(MainActivity mainActivity, String str, int i2) {
        this.f976a = i2;
        this.f977b = mainActivity;
        this.f978c = str;
    }

    /* JADX INFO: renamed from: ۟ۡ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static native short[] m3284();

    @Override // java.lang.Runnable
    public final native void run();
}
