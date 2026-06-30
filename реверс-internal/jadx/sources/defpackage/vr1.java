package defpackage;

import com.google.android.material.bottomappbar.C0099;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.floatingactionbutton.C0116;
import com.google.android.material.focus.C0121;
import com.google.android.material.snackbar.C0138;
import com.reddit.frontpage.C0148;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vr1 implements yr1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f214short = {1180, 1195, 1213, 1214, 1185, 1184, 1213, 1195, 1254, 1210, 1195, 1206, 1210, 1267, 2294};
    public final String a;

    /* JADX INFO: renamed from: ۣ۟۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m1963() {
        if (C0116.m1470() < 0) {
            return f214short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vr1) && C0138.m1749(C0148.m1862(this), C0148.m1862((vr1) obj));
    }

    public final int hashCode() {
        return C0103.m1321(C0148.m1862(this));
    }

    public final String toString() {
        return C0121.m1530(C0138.m1743(m1963(), 0, 14, 1230), C0148.m1862(this), C0099.m1275(m1963(), 14, 1, 2271));
    }

    public vr1(String str) {
        this.a = str;
    }
}
