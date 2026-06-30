package defpackage;

import android.support.v4.app.C0002;
import androidx.core.app.C0037;
import androidx.core.app.C0044;
import androidx.core.widget.C0053;
import androidx.graphics.path.C0057;
import androidx.lifecycle.C0060;
import androidx.profileinstaller.C0062;
import androidx.startup.C0071;
import com.google.android.material.appbar.C0084;
import com.google.android.material.behavior.C0090;
import com.google.android.material.behavior.C0091;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.bottomsheet.C0107;
import com.google.android.material.focus.C0120;
import com.google.android.material.snackbar.C0138;
import com.google.android.material.transformation.C0144;
import com.reddit.frontpage.C0148;
import java.text.SimpleDateFormat;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class iq {
    public final String a;
    public final String b;
    public final long c;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f172short = {737, 737, 683, 712, 712, 683, 764, 764, 764, 764, 677, 717, 717, 703, 744, 744, 1931, 1927, 2007, 1990, 2003, 1999, 1946, 549, 553, 616, 621, 621, 620, 621, 584, 637, 564, 2291, 2271, 2270, 2262, 2265, 2263, 2297, 2244, 2261, 2269, 2200, 2270, 2257, 2269, 2261, 2189, 2180};
    public static final SimpleDateFormat d = new SimpleDateFormat(C0071.m925(m1919(), 0, 16, 645), C0044.m582());

    /* JADX INFO: renamed from: ۨۥۣۧ, reason: not valid java name and contains not printable characters */
    public static short[] m1919() {
        if (C0107.m1359() < 0) {
            return f172short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq)) {
            return false;
        }
        iq iqVar = (iq) obj;
        return C0084.m1079(C0091.m1189(this), C0091.m1189(iqVar)) && C0138.m1749(C0037.m490(this), C0037.m490(iqVar)) && C0120.m1515(this) == C0120.m1515(iqVar);
    }

    public final int hashCode() {
        return C0060.m780(C0120.m1515(this)) + ((C0103.m1321(C0037.m490(this)) + (C0103.m1321(C0091.m1189(this)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM754 = C0057.m754(C0107.m1357(m1919(), 33, 16, 2224), C0091.m1189(this), C0002.m34(m1919(), 16, 7, 1959), C0037.m490(this), C0057.m748(m1919(), 23, 10, 521));
        C0148.m1854(sbM754, C0120.m1515(this));
        C0062.m817(sbM754, C0144.m1809(m1919(), 49, 1, 2221));
        return C0053.m699(sbM754);
    }

    public iq(String str, String str2, long j) {
        C0090.m1170(str);
        this.a = str;
        this.b = str2;
        this.c = j;
    }
}
