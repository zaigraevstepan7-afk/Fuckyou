package defpackage;

import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.view.C0021;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.focus.C0119;
import com.google.android.material.focus.C0121;
import com.google.android.material.sidesheet.C0129;
import com.google.android.material.snackbar.C0138;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class mr1 implements or1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f182short = {405, 417, 416, 444, 443, 422, 445, 430, 437, 416, 445, 443, 442, 500, 433, 422, 422, 443, 422, 1228, 1272, 1273, 1253, 1224, 1279, 1279, 1250, 1279, 1189, 1248, 1256, 1278, 1278, 1260, 1258, 1256, 1200, 479};
    public final String a;

    /* JADX INFO: renamed from: ۤۤۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m1927() {
        if (C0002.m39() >= 0) {
            return f182short;
        }
        return null;
    }

    @Override // defpackage.or1
    public final String a() {
        return C0004.m66(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mr1) && C0138.m1749(C0004.m66(this), C0004.m66((mr1) obj));
    }

    @Override // defpackage.or1
    public final String getTitle() {
        return C0129.m1629(m1927(), 0, 19, 468);
    }

    public final int hashCode() {
        return C0103.m1321(C0004.m66(this));
    }

    public final String toString() {
        return C0121.m1530(C0021.m280(m1927(), 19, 18, 1165), C0004.m66(this), C0119.m1508(m1927(), 37, 1, 502));
    }

    public mr1(String str) {
        this.a = str;
    }
}
