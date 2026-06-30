package p031Q0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import com.reddit.frontpage.MainActivity;

/* JADX INFO: renamed from: Q0.s */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0345s implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4856short = null;

    /* JADX INFO: renamed from: a */
    public final MainActivity f979a;

    /* JADX INFO: renamed from: b */
    public final long f980b;

    /* JADX INFO: renamed from: c */
    public final long f981c;

    /* JADX INFO: renamed from: d */
    public final double f982d;

    /* JADX INFO: renamed from: e */
    public final long f983e;

    static {
        ZLoader.registerNativesForClass(72, RunnableC0345s.class);
        Hidden0.special_clinit_72_00(RunnableC0345s.class);
    }

    public /* synthetic */ RunnableC0345s(MainActivity mainActivity, long j2, long j3, double d2, long j4) {
        this.f979a = mainActivity;
        this.f980b = j2;
        this.f981c = j3;
        this.f982d = d2;
        this.f983e = j4;
    }

    /* JADX INFO: renamed from: ۢ۟ۨۦ, reason: not valid java name and contains not printable characters */
    public static native short[] m3286();

    @Override // java.lang.Runnable
    public final native void run();
}
