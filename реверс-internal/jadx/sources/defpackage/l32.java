package defpackage;

import android.app.C0001;
import android.support.v4.app.C0005;
import android.text.C0012;
import android.text.C0013;
import android.view.translation.C0017;
import android.view.translation.C0020;
import androidx.appcompat.widget.C0030;
import androidx.core.app.C0043;
import androidx.core.graphics.drawable.C0049;
import androidx.core.widget.C0053;
import androidx.graphics.path.C0055;
import androidx.profileinstaller.C0061;
import androidx.profileinstaller.C0062;
import androidx.window.reflection.C0083;
import com.google.android.material.behavior.C0090;
import com.google.android.material.behavior.C0091;
import com.google.android.material.bottomappbar.C0098;
import com.google.android.material.bottomappbar.C0101;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.bottomsheet.C0107;
import com.google.android.material.search.C0123;
import com.google.android.material.sidesheet.C0133;
import com.google.android.material.snackbar.C0136;
import com.google.android.material.snackbar.C0138;
import com.google.android.material.transformation.C0143;
import com.reddit.frontpage.C0150;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l32 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f177short = {1260, 1232, 1258, 1229, 1240, 1229, 1244, 1169, 1236, 1238, 1245, 1244, 1156, 1725, 1713, 1786, 1780, 1768, 1708, 639, 627, 572, 549, 566, 545, 575, 562, 554, 622, 2300, 2288, 2211, 2225, 2230, 2229, 2205, 2239, 2228, 2229, 2285, 3008, 3020, 2975, 2959, 2957, 2944, 2953, 3025, 2970, 2966, 3039, 3013, 3060, 3011, 3013, 3023, 2955, 2938};
    public final dr0 a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final float e;
    public final boolean f;

    public static l32 a(l32 l32Var, String str, boolean z, boolean z2, float f, boolean z3, int i) {
        boolean zM1289 = z3;
        float fM809 = f;
        boolean zM154 = z2;
        boolean zM22 = z;
        String strM401 = str;
        dr0 dr0VarM69 = C0005.m69(l32Var);
        if ((i & 2) != 0) {
            strM401 = C0030.m401(l32Var);
        }
        if ((i & 4) != 0) {
            zM22 = C0001.m22(l32Var);
        }
        if ((i & 8) != 0) {
            zM154 = C0012.m154(l32Var);
        }
        if ((i & 16) != 0) {
            fM809 = C0061.m809(l32Var);
        }
        if ((i & 32) != 0) {
            zM1289 = C0101.m1289(l32Var);
        }
        boolean z4 = zM1289;
        C0090.m1170(l32Var);
        C0090.m1170(dr0VarM69);
        C0090.m1170(strM401);
        float f2 = fM809;
        boolean z5 = zM154;
        return new l32(dr0VarM69, strM401, zM22, z5, f2, z4);
    }

    /* JADX INFO: renamed from: ۥۨۤ۟, reason: contains not printable characters */
    public static short[] m1923() {
        if (C0107.m1359() < 0) {
            return f177short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l32)) {
            return false;
        }
        l32 l32Var = (l32) obj;
        return C0005.m69(this) == C0005.m69(l32Var) && C0138.m1749(C0030.m401(this), C0030.m401(l32Var)) && C0001.m22(this) == C0001.m22(l32Var) && C0012.m154(this) == C0012.m154(l32Var) && C0083.m1070(C0061.m809(this), C0061.m809(l32Var)) == 0 && C0101.m1289(this) == C0101.m1289(l32Var);
    }

    public final int hashCode() {
        return C0143.m1802(C0101.m1289(this)) + C0043.m579(C0061.m809(this), C0150.m1884(C0150.m1884((C0103.m1321(C0030.m401(this)) + (C0055.m722(C0005.m69(this)) * 31)) * 31, 31, C0001.m22(this)), 31, C0012.m154(this)), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0020.m265(m1923(), 0, 13, 1209));
        C0049.m649(sb, C0005.m69(this));
        C0062.m817(sb, C0017.m225(m1923(), 13, 6, 1681));
        C0062.m817(sb, C0030.m401(this));
        C0062.m817(sb, C0005.m81(m1923(), 19, 10, 595));
        C0136.m1714(sb, C0001.m22(this));
        C0062.m817(sb, C0091.m1184(m1923(), 29, 11, 2256));
        C0136.m1714(sb, C0012.m154(this));
        C0062.m817(sb, C0123.m1551(m1923(), 40, 8, 3052));
        C0013.m177(sb, C0061.m809(this));
        C0062.m817(sb, C0133.m1675(m1923(), 48, 9, 2998));
        C0136.m1714(sb, C0101.m1289(this));
        C0062.m817(sb, C0098.m1267(m1923(), 57, 1, 2899));
        return C0053.m699(sb);
    }

    public l32(dr0 dr0Var, String str, boolean z, boolean z2, float f, boolean z3) {
        C0090.m1170(dr0Var);
        this.a = dr0Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = f;
        this.f = z3;
    }
}
