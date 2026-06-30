package p031Q0;

import ZeninCPP0.ZLoader;
import ZeninCPP0.hidden.Hidden0;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: Q0.y */
/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C0351y implements X509TrustManager {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f4859short = null;

    /* JADX INFO: renamed from: a */
    public final X509TrustManager f991a;

    static {
        ZLoader.registerNativesForClass(78, C0351y.class);
        Hidden0.special_clinit_78_00(C0351y.class);
    }

    public C0351y(X509TrustManager x509TrustManager) {
        this.f991a = x509TrustManager;
    }

    /* JADX INFO: renamed from: ۡ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static native short[] m3289();

    @Override // javax.net.ssl.X509TrustManager
    public final native void checkClientTrusted(X509Certificate[] x509CertificateArr, String str);

    @Override // javax.net.ssl.X509TrustManager
    public final native void checkServerTrusted(X509Certificate[] x509CertificateArr, String str);

    @Override // javax.net.ssl.X509TrustManager
    public final native X509Certificate[] getAcceptedIssuers();
}
