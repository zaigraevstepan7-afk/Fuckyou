package defpackage;

import internal0.Internal;
import internal0.hidden.Hidden0;
import java.io.File;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes2.dex */
public final class rz extends zu1 implements wa0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f198short = null;
    public HttpURLConnection i;
    public zc1 j;
    public zc1 k;
    public zc1 l;
    public byte[] m;
    public xc1 n;
    public long o;
    public long p;
    public long q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public Object w;
    public final File x;
    public final String y;

    static {
        Internal.registerNativesForClass(8, rz.class);
        Hidden0.special_clinit_8_00(rz.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz(File file, String str, ks ksVar) {
        super(2, ksVar);
        this.x = file;
        this.y = str;
    }

    /* JADX INFO: renamed from: ۟ۧۡۦۧ, reason: not valid java name and contains not printable characters */
    public static native short[] m1946();

    @Override // defpackage.wa0
    public final native Object h(Object obj, Object obj2);

    @Override // defpackage.ye
    public final native ks o(ks ksVar, Object obj);

    @Override // defpackage.ye
    public final native Object q(Object obj);
}
