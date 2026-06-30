package defpackage;

import internal0.Internal;
import internal0.hidden.Hidden0;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class w61 implements X509TrustManager {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f216short = null;
    public final X509TrustManager a;

    static {
        Internal.registerNativesForClass(10, w61.class);
        Hidden0.special_clinit_10_00(w61.class);
    }

    public w61(X509TrustManager x509TrustManager) {
        this.a = x509TrustManager;
    }

    /* JADX INFO: renamed from: ۨۢۦۧ, reason: not valid java name and contains not printable characters */
    public static native short[] m1965();

    @Override // javax.net.ssl.X509TrustManager
    public final native void checkClientTrusted(X509Certificate[] x509CertificateArr, String str);

    @Override // javax.net.ssl.X509TrustManager
    public final native void checkServerTrusted(X509Certificate[] x509CertificateArr, String str);

    @Override // javax.net.ssl.X509TrustManager
    public final native X509Certificate[] getAcceptedIssuers();
}
