package defpackage;

import android.text.C0013;
import android.view.C0022;
import androidx.core.app.C0043;
import androidx.core.widget.C0053;
import androidx.profileinstaller.C0062;
import androidx.profileinstaller.C0064;
import androidx.recyclerview.widget.C0065;
import androidx.window.reflection.C0083;
import com.google.android.material.behavior.C0090;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.floatingactionbutton.C0114;
import com.google.android.material.focus.C0118;
import com.google.android.material.focus.C0120;
import com.google.android.material.sidesheet.C0131;
import com.google.android.material.sidesheet.C0132;
import com.google.android.material.snackbar.C0136;
import com.google.android.material.snackbar.C0138;
import com.google.android.material.transformation.C0143;
import com.google.android.material.transformation.C0146;
import com.reddit.frontpage.C0150;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xq0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f221short = {480, 455, 466, 449, 455, 483, 466, 449, 466, 478, 448, 411, 472, 470, 458, 398, 2347, 2343, 2420, 2404, 2406, 2411, 2402, 2362, 789, 793, 854, 847, 860, 843, 853, 856, 832, 772, 3223, 3227, 3272, 3290, 3293, 3294, 3206, 1488, 1500, 1438, 1424, 1417, 1433, 1455, 1416, 1437, 1439, 1431, 1423, 1457, 1427, 1432, 1433, 1452, 1437, 1423, 1423, 1433, 1432, 1473, 1055};
    public final String a;
    public final float b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    /* JADX INFO: renamed from: ۟ۤۧۦۧ, reason: not valid java name and contains not printable characters */
    public static short[] m1969() {
        if (C0132.m1666() < 0) {
            return f221short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq0)) {
            return false;
        }
        xq0 xq0Var = (xq0) obj;
        return C0138.m1749(C0022.m296(this), C0022.m296(xq0Var)) && C0083.m1070(C0064.m832(this), C0064.m832(xq0Var)) == 0 && C0098.m1258(this) == C0098.m1258(xq0Var) && C0155.m2022(this) == C0155.m2022(xq0Var) && C0118.m1492(this) == C0118.m1492(xq0Var);
    }

    public final int hashCode() {
        return C0143.m1802(C0118.m1492(this)) + C0150.m1884(C0150.m1884(C0043.m579(C0064.m832(this), C0103.m1321(C0022.m296(this)) * 31, 31), 31, C0098.m1258(this)), 31, C0155.m2022(this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0114.m1450(m1969(), 0, 16, 435));
        C0062.m817(sb, C0022.m296(this));
        C0062.m817(sb, C0146.m1838(m1969(), 16, 8, 2311));
        C0013.m177(sb, C0064.m832(this));
        C0062.m817(sb, C0065.m851(m1969(), 24, 10, 825));
        C0136.m1714(sb, C0098.m1258(this));
        C0062.m817(sb, C0120.m1523(m1969(), 34, 7, 3259));
        C0136.m1714(sb, C0155.m2022(this));
        C0062.m817(sb, C0131.m1658(m1969(), 41, 23, 1532));
        C0136.m1714(sb, C0118.m1492(this));
        C0062.m817(sb, C0090.m1171(m1969(), 64, 1, 1078));
        return C0053.m699(sb);
    }

    public xq0(String str, float f, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = f;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
