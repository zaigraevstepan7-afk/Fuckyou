package defpackage;

import androidx.core.app.C0044;
import androidx.startup.C0069;
import androidx.window.reflection.C0081;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.focus.C0121;
import com.google.android.material.focus.C0122;
import com.google.android.material.snackbar.C0138;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class mq implements nq {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f181short = {1890, 1862, 1797, 1856, 1864, 1886, 1886, 1868, 1866, 1864, 1808, 2796};
    public final String a;

    /* JADX INFO: renamed from: ۦۢ, reason: contains not printable characters */
    public static short[] m1926() {
        if (C0122.m1542() < 0) {
            return f181short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mq) && C0138.m1749(C0069.m902(this), C0069.m902((mq) obj));
    }

    public final int hashCode() {
        return C0103.m1321(C0069.m902(this));
    }

    public final String toString() {
        return C0121.m1530(C0081.m1041(m1926(), 0, 11, 1837), C0069.m902(this), C0044.m587(m1926(), 11, 1, 2757));
    }

    public mq(String str) {
        this.a = str;
    }
}
