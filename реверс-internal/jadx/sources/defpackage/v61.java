package defpackage;

import internal0.Internal;
import internal0.hidden.Hidden0;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v61 implements HostnameVerifier {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f210short = null;

    static {
        Internal.registerNativesForClass(9, v61.class);
        Hidden0.special_clinit_9_00(v61.class);
    }

    /* JADX INFO: renamed from: ۣ۟ۦۥۥ, reason: not valid java name and contains not printable characters */
    public static native short[] m1958();

    @Override // javax.net.ssl.HostnameVerifier
    public final native boolean verify(String str, SSLSession sSLSession);
}
