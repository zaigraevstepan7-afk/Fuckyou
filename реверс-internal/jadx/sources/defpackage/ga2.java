package defpackage;

import android.app.C0000;
import android.app.C0001;
import android.support.v4.app.C0005;
import android.text.C0011;
import android.text.C0013;
import androidx.appcompat.app.C0029;
import androidx.appcompat.widget.C0032;
import androidx.compose.ui.input.pointer.C0034;
import androidx.core.app.C0043;
import androidx.core.widget.C0053;
import androidx.profileinstaller.C0062;
import androidx.recyclerview.widget.C0068;
import androidx.startup.C0072;
import androidx.window.reflection.C0080;
import androidx.window.reflection.C0083;
import com.google.android.material.behavior.C0091;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.sidesheet.C0130;
import com.google.android.material.snackbar.C0136;
import com.google.android.material.snackbar.C0138;
import com.google.android.material.transformation.C0146;
import com.reddit.frontpage.C0150;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ga2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f166short = {3063, 3016, 3011, 3012, 3011, 3069, 3039, 3016, 3019, 3038, 2949, 3014, 3016, 3028, 2960, 3074, 3086, 3137, 3160, 3147, 3164, 3138, 3151, 3159, 3091, 689, 701, 750, 764, 763, 760, 720, 754, 761, 760, 672, 1975, 1979, 2024, 2040, 2042, 2039, 2046, 1958, 575, 563, 608, 624, 609, 634, 611, 615, 602, 631, 558, 2160, 2172, 2095, 2089, 2060, 2109, 2088, 2100, 2145, 2946};
    public final String a;
    public final boolean b;
    public final boolean c;
    public final float d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: ۟ۢۨۨ۟, reason: not valid java name and contains not printable characters */
    public static short[] m1904() {
        if (C0130.m1641() > 0) {
            return f166short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga2)) {
            return false;
        }
        ga2 ga2Var = (ga2) obj;
        return C0138.m1749(C0068.m890(this), C0068.m890(ga2Var)) && C0153.m1992(this) == C0153.m1992(ga2Var) && C0032.m428(this) == C0032.m428(ga2Var) && C0083.m1070(C0001.m23(this), C0001.m23(ga2Var)) == 0 && C0138.m1749(C0080.m1029(this), C0080.m1029(ga2Var)) && C0138.m1749(C0005.m79(this), C0005.m79(ga2Var));
    }

    public final int hashCode() {
        return C0103.m1321(C0005.m79(this)) + ((C0103.m1321(C0080.m1029(this)) + C0043.m579(C0001.m23(this), C0150.m1884(C0150.m1884(C0103.m1321(C0068.m890(this)) * 31, 31, C0153.m1992(this)), 31, C0032.m428(this)), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0029.m380(m1904(), 0, 15, 2989));
        C0062.m817(sb, C0068.m890(this));
        C0062.m817(sb, C0034.m459(m1904(), 15, 10, 3118));
        C0136.m1714(sb, C0153.m1992(this));
        C0062.m817(sb, C0011.m141(m1904(), 25, 11, 669));
        C0136.m1714(sb, C0032.m428(this));
        C0062.m817(sb, C0072.m928(m1904(), 36, 8, 1947));
        C0013.m177(sb, C0001.m23(this));
        C0062.m817(sb, C0146.m1838(m1904(), 44, 11, 531));
        C0062.m817(sb, C0080.m1029(this));
        C0062.m817(sb, C0000.m7(m1904(), 55, 9, 2140));
        C0062.m817(sb, C0005.m79(this));
        C0062.m817(sb, C0091.m1184(m1904(), 64, 1, 2987));
        return C0053.m699(sb);
    }

    public ga2(String str, boolean z, boolean z2, float f, String str2, String str3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = f;
        this.e = str2;
        this.f = str3;
    }
}
