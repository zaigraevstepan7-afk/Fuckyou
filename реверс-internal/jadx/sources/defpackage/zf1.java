package defpackage;

import android.text.C0012;
import android.view.translation.C0017;
import androidx.appcompat.app.C0028;
import androidx.compose.ui.input.pointer.C0035;
import androidx.core.graphics.drawable.C0046;
import androidx.core.widget.C0053;
import androidx.profileinstaller.C0062;
import androidx.recyclerview.widget.C0067;
import androidx.window.reflection.C0080;
import com.google.android.material.appbar.C0084;
import com.google.android.material.bottomappbar.C0097;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.carousel.C0108;
import com.google.android.material.focus.C0119;
import com.google.android.material.sidesheet.C0130;
import com.google.android.material.snackbar.C0138;
import com.google.android.material.transformation.C0142;
import com.reddit.frontpage.C0151;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zf1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f227short = {2995, 916, 952, 954, 954, 950, 953, 947, 901, 946, 932, 930, 955, 931, 1023, 946, 943, 958, 931, 916, 952, 947, 946, 1002, 1800, 1796, 1879, 1872, 1856, 1867, 1873, 1872, 1817, 2642, 2654, 2573, 2570, 2586, 2587, 2572, 2572, 2627, 2557, 2545, 2484, 2467, 2467, 2494, 2467, 2460, 2484, 2466, 2466, 2480, 2486, 2484, 2540, 1332};
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    /* JADX INFO: renamed from: ۟۠ۡۧۥ, reason: not valid java name and contains not printable characters */
    public static short[] m1975() {
        if (C0130.m1641() > 0) {
            return f227short;
        }
        return null;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        C0062.m817(sb, C0035.m466(this));
        C0062.m817(sb, C0017.m225(m1975(), 0, 1, 3001));
        C0062.m817(sb, C0012.m161(this));
        return C0080.m1037(C0067.m874(C0053.m699(sb)));
    }

    public final boolean b() {
        return C0151.m1890(this) == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf1)) {
            return false;
        }
        zf1 zf1Var = (zf1) obj;
        return C0151.m1890(this) == C0151.m1890(zf1Var) && C0138.m1749(C0035.m466(this), C0035.m466(zf1Var)) && C0138.m1749(C0012.m161(this), C0012.m161(zf1Var)) && C0084.m1079(C0119.m1505(this), C0119.m1505(zf1Var));
    }

    public final int hashCode() {
        int iM1321 = (C0103.m1321(C0012.m161(this)) + ((C0103.m1321(C0035.m466(this)) + (C0046.m607(C0151.m1890(this)) * 31)) * 31)) * 31;
        String strM1505 = C0119.m1505(this);
        return iM1321 + (strM1505 == null ? 0 : C0103.m1321(strM1505));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0097.m1244(m1975(), 1, 23, 983));
        C0142.m1793(sb, C0151.m1890(this));
        C0062.m817(sb, C0067.m873(m1975(), 24, 9, 1828));
        C0062.m817(sb, C0035.m466(this));
        C0062.m817(sb, C0028.m369(m1975(), 33, 9, 2686));
        C0062.m817(sb, C0012.m161(this));
        C0062.m817(sb, C0028.m369(m1975(), 42, 15, 2513));
        C0062.m817(sb, C0119.m1505(this));
        C0062.m817(sb, C0108.m1366(m1975(), 57, 1, 1309));
        return C0053.m699(sb);
    }

    public zf1(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
