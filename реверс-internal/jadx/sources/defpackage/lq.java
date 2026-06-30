package defpackage;

import androidx.core.app.C0043;
import androidx.profileinstaller.C0064;
import androidx.versionedparcelable.C0074;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.focus.C0121;
import com.google.android.material.snackbar.C0138;
import com.reddit.frontpage.C0150;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class lq implements nq {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f178short = {801, 790, 790, 844, 777, 769, 791, 791, 773, 771, 769, 857, 1977};
    public final String a;

    /* JADX INFO: renamed from: ۣ۟۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static short[] m1924() {
        if (C0043.m578() > 0) {
            return f178short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lq) && C0138.m1749(C0150.m1877(this), C0150.m1877((lq) obj));
    }

    public final int hashCode() {
        return C0103.m1321(C0150.m1877(this));
    }

    public final String toString() {
        return C0121.m1530(C0074.m955(m1924(), 0, 12, 868), C0150.m1877(this), C0064.m833(m1924(), 12, 1, 1936));
    }

    public lq(String str) {
        this.a = str;
    }
}
