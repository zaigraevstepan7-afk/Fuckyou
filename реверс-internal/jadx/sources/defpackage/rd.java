package defpackage;

import android.text.C0010;
import android.view.C0022;
import android.view.C0026;
import android.view.translation.C0020;
import androidx.appcompat.app.C0028;
import androidx.compose.ui.input.pointer.C0035;
import androidx.core.graphics.drawable.C0046;
import androidx.core.graphics.drawable.C0049;
import androidx.core.widget.C0053;
import androidx.graphics.path.C0055;
import androidx.profileinstaller.C0062;
import androidx.recyclerview.widget.C0067;
import androidx.window.reflection.C0083;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.bottomsheet.C0104;
import com.google.android.material.floatingactionbutton.C0113;
import com.google.android.material.search.C0124;
import com.google.android.material.snackbar.C0138;
import com.google.android.material.transformation.C0145;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class rd {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f196short = {2306, 2352, 2352, 2342, 2359, 2304, 2338, 2359, 2342, 2340, 2348, 2353, 2362, 2411, 2344, 2346, 2349, 2343, 2430, 3230, 3218, 3270, 3291, 3270, 3294, 3287, 3215, 910, 898, 960, 963, 966, 965, 967, 927, 1277, 1265, 1205, 1208, 1187, 1186, 1260, 676, 680, 749, 752, 764, 749, 742, 763, 737, 743, 742, 763, 693, 425, 421, 501, 492, 486, 494, 456, 492, 488, 480, 465, 508, 501, 480, 502, 440, 1137, 1149, 1081, 1080, 1083, 1084, 1064, 1073, 1065, 1055, 1084, 1070, 1080, 1043, 1084, 1072, 1080, 1120, 1744};
    public final sd a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final List f;
    public final String g;

    /* JADX INFO: renamed from: ۠ۤۥۨ, reason: not valid java name and contains not printable characters */
    public static short[] m1944() {
        if (C0155.m2019() > 0) {
            return f196short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd)) {
            return false;
        }
        rd rdVar = (rd) obj;
        return C0046.m606(this) == C0046.m606(rdVar) && C0138.m1749(C0010.m135(this), C0010.m135(rdVar)) && C0138.m1749(C0022.m292(this), C0022.m292(rdVar)) && C0138.m1749(C0067.m877(this), C0067.m877(rdVar)) && C0138.m1749(C0026.m345(this), C0026.m345(rdVar)) && C0138.m1749(C0022.m299(this), C0022.m299(rdVar)) && C0138.m1749(C0113.m1430(this), C0113.m1430(rdVar));
    }

    public final int hashCode() {
        return C0103.m1321(C0113.m1430(this)) + ((C0055.m722(C0022.m299(this)) + ((C0055.m722(C0026.m345(this)) + ((C0055.m722(C0067.m877(this)) + ((C0103.m1321(C0022.m292(this)) + ((C0103.m1321(C0010.m135(this)) + (C0055.m722(C0046.m606(this)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0145.m1827(m1944(), 0, 19, 2371));
        C0049.m649(sb, C0046.m606(this));
        C0062.m817(sb, C0022.m297(m1944(), 19, 8, 3250));
        C0062.m817(sb, C0010.m135(this));
        C0062.m817(sb, C0035.m463(m1944(), 27, 8, 930));
        C0062.m817(sb, C0022.m292(this));
        C0062.m817(sb, C0020.m265(m1944(), 35, 7, 1233));
        C0049.m649(sb, C0067.m877(this));
        C0062.m817(sb, C0124.m1571(m1944(), 42, 13, 648));
        C0049.m649(sb, C0026.m345(this));
        C0062.m817(sb, C0028.m369(m1944(), 55, 16, 389));
        C0049.m649(sb, C0022.m299(this));
        C0062.m817(sb, C0083.m1072(m1944(), 71, 18, 1117));
        C0062.m817(sb, C0113.m1430(this));
        C0062.m817(sb, C0104.m1331(m1944(), 89, 1, 1785));
        return C0053.m699(sb);
    }

    public rd(sd sdVar, String str, String str2, List list, List list2, List list3, String str3) {
        this.a = sdVar;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = str3;
    }
}
