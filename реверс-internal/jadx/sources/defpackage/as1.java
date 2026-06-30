package defpackage;

import android.text.C0016;
import com.google.android.material.appbar.C0086;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.focus.C0121;
import com.google.android.material.snackbar.C0138;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class as1 implements js1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f85short = {477, 502, 494, 503, 501, 502, 504, 509, 458, 493, 504, 491, 493, 508, 509, 433, 501, 504, 507, 508, 501, 420, 2998};
    public final String a;

    /* JADX INFO: renamed from: ۤۧۡۥ, reason: not valid java name and contains not printable characters */
    public static short[] m1074() {
        if (C0121.m1535() >= 0) {
            return f85short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof as1) && C0138.m1749(C0016.m213(this), C0016.m213((as1) obj));
    }

    public final int hashCode() {
        return C0103.m1321(C0016.m213(this));
    }

    public final String toString() {
        return C0121.m1530(C0105.m1338(m1074(), 0, 22, 409), C0016.m213(this), C0086.m1120(m1074(), 22, 1, 2975));
    }

    public as1(String str) {
        this.a = str;
    }
}
