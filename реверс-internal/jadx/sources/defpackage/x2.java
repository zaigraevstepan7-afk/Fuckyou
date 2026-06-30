package defpackage;

import android.view.C0025;
import androidx.appcompat.app.C0029;
import androidx.core.graphics.drawable.C0049;
import androidx.core.widget.C0053;
import androidx.graphics.path.C0055;
import androidx.graphics.path.C0057;
import androidx.profileinstaller.C0062;
import androidx.profileinstaller.C0063;
import com.google.android.material.appbar.C0084;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.carousel.C0111;
import com.google.android.material.focus.C0119;
import com.google.android.material.focus.C0122;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class x2 implements z2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f218short = {2418, 2430, 2355, 2363, 2349, 2349, 2367, 2361, 2363, 2403, 1012, 1016, 936, 938, 951, 959, 938, 957, 939, 939, 997, 1298, 1328, 1325, 1317, 1328, 1319, 1329, 1329, 1386, 1334, 1323, 1334, 1326, 1319, 1407, 967};
    public final String a;
    public final String b;
    public final Float c;

    /* JADX INFO: renamed from: ۟ۤ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static short[] m1967() {
        if (C0122.m1542() <= 0) {
            return f218short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return C0084.m1079(C0098.m1260(this), C0098.m1260(x2Var)) && C0084.m1079(C0025.m339(this), C0025.m339(x2Var)) && C0084.m1079(C0029.m377(this), C0029.m377(x2Var));
    }

    public /* synthetic */ x2(int i, String str, String str2) {
        this(str, (i & 2) != 0 ? null : str2, (Float) null);
    }

    public final int hashCode() {
        int iM1321 = C0103.m1321(C0098.m1260(this)) * 31;
        String strM339 = C0025.m339(this);
        int iM13212 = (iM1321 + (strM339 == null ? 0 : C0103.m1321(strM339))) * 31;
        Float fM377 = C0029.m377(this);
        return iM13212 + (fM377 != null ? C0055.m722(fM377) : 0);
    }

    public final String toString() {
        StringBuilder sbM754 = C0057.m754(C0063.m827(m1967(), 21, 15, 1346), C0098.m1260(this), C0119.m1508(m1967(), 0, 10, 2398), C0025.m339(this), C0153.m1995(m1967(), 10, 11, 984));
        C0049.m649(sbM754, C0029.m377(this));
        C0062.m817(sbM754, C0111.m1413(m1967(), 36, 1, 1006));
        return C0053.m699(sbM754);
    }

    public x2(String str, String str2, Float f) {
        this.a = str;
        this.b = str2;
        this.c = f;
    }
}
