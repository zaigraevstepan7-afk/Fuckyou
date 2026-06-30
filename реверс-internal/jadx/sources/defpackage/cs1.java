package defpackage;

import androidx.core.graphics.drawable.C0049;
import androidx.core.widget.C0053;
import androidx.graphics.path.C0055;
import androidx.profileinstaller.C0062;
import com.google.android.material.carousel.C0111;
import com.google.android.material.snackbar.C0138;
import com.google.android.material.transformation.C0139;
import com.google.android.material.transformation.C0146;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cs1 implements js1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f159short = {3122, 3101, 3098, 3101, 3079, 3100, 3089, 3088, 3164, 3078, 3089, 3079, 3073, 3096, 3072, 3145, 1636};
    public final yr1 a;

    /* JADX INFO: renamed from: ۟ۥۥۤۦ, reason: not valid java name and contains not printable characters */
    public static short[] m1898() {
        if (C0146.m1831() >= 0) {
            return f159short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cs1) && C0138.m1749(C0111.m1417(this), C0111.m1417((cs1) obj));
    }

    public final int hashCode() {
        return C0055.m722(C0111.m1417(this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0138.m1743(m1898(), 0, 16, 3188));
        C0049.m649(sb, C0111.m1417(this));
        C0062.m817(sb, C0139.m1753(m1898(), 16, 1, 1613));
        return C0053.m699(sb);
    }

    public cs1(yr1 yr1Var) {
        this.a = yr1Var;
    }
}
