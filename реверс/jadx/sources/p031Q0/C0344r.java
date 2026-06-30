package p031Q0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: Q0.r */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0344r implements HostnameVerifier {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4855short = null;

    static {
        ZLoader.registerNativesForClass(71, C0344r.class);
        Hidden0.special_clinit_71_00(C0344r.class);
    }

    /* JADX INFO: renamed from: ۡۢۡ۠, reason: not valid java name and contains not printable characters */
    public static native short[] m3285();

    @Override // javax.net.ssl.HostnameVerifier
    public final native boolean verify(String str, SSLSession sSLSession);
}
