package defpackage;

import android.support.v4.graphics.drawable.C0007;
import androidx.compose.ui.input.pointer.C0034;
import androidx.compose.ui.input.pointer.C0036;
import androidx.core.graphics.drawable.C0049;
import androidx.core.widget.C0051;
import androidx.core.widget.C0053;
import androidx.graphics.path.C0055;
import androidx.graphics.path.C0057;
import androidx.lifecycle.C0060;
import androidx.profileinstaller.C0062;
import androidx.startup.C0073;
import com.google.android.material.appbar.C0084;
import com.google.android.material.behavior.C0088;
import com.google.android.material.behavior.C0092;
import com.google.android.material.behavior.C0093;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.snackbar.C0138;
import com.google.android.material.transformation.C0143;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class y2 implements z2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f223short = {1848, 1852, 788, 792, 853, 861, 843, 843, 857, 863, 861, 773, 2157, 2145, 2082, 2094, 2095, 2087, 2088, 2099, 2092, 2061, 2080, 2083, 2084, 2093, 2172, 1651, 1621, 1603, 1603, 1605, 1619, 1619, 1544, 1620, 1609, 1620, 1612, 1605, 1565, 408, 404, 475, 474, 503, 475, 474, 466, 477, 454, 473, 393, 2090};
    public final String a;
    public final String b;
    public final String c;
    public final ha0 d;

    /* JADX INFO: renamed from: ۧۢۤۥ, reason: not valid java name and contains not printable characters */
    public static short[] m1971() {
        if (C0092.m1194() >= 0) {
            return f223short;
        }
        return null;
    }

    public y2(String str, String str2) {
        e2 e2Var = new e2(7);
        this.a = str;
        this.b = str2;
        this.c = C0007.m105(m1971(), 0, 2, 1911);
        this.d = e2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return C0138.m1749(C0088.m1144(this), C0088.m1144(y2Var)) && C0138.m1749(C0073.m953(this), C0073.m953(y2Var)) && C0138.m1749(C0143.m1801(this), C0143.m1801(y2Var)) && C0138.m1749(C0036.m478(this), C0036.m478(y2Var));
    }

    public final int hashCode() {
        return C0055.m722(C0036.m478(this)) + ((C0103.m1321(C0143.m1801(this)) + ((C0103.m1321(C0073.m953(this)) + (C0103.m1321(C0088.m1144(this)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM754 = C0057.m754(C0060.m783(m1971(), 27, 14, 1568), C0088.m1144(this), C0084.m1090(m1971(), 2, 10, 824), C0073.m953(this), C0034.m459(m1971(), 12, 15, 2113));
        C0062.m817(sbM754, C0143.m1801(this));
        C0062.m817(sbM754, C0051.m667(m1971(), 41, 12, 436));
        C0049.m649(sbM754, C0036.m478(this));
        C0062.m817(sbM754, C0093.m1204(m1971(), 53, 1, 2051));
        return C0053.m699(sbM754);
    }
}
