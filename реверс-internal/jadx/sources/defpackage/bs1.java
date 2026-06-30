package defpackage;

import android.view.C0026;
import androidx.core.app.C0040;
import androidx.core.graphics.drawable.C0049;
import androidx.core.widget.C0053;
import androidx.graphics.path.C0055;
import androidx.profileinstaller.C0062;
import com.google.android.material.appbar.C0084;
import com.google.android.material.behavior.C0090;
import com.google.android.material.floatingactionbutton.C0117;
import com.reddit.frontpage.C0151;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bs1 implements js1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f88short = {670, 693, 685, 692, 694, 693, 699, 702, 691, 692, 701, 754, 682, 680, 693, 701, 680, 703, 681, 681, 743, 2739};
    public final pz a;

    /* JADX INFO: renamed from: ۟ۥۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m1077() {
        if (C0117.m1475() >= 0) {
            return f88short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bs1) && C0084.m1079(C0151.m1891(this), C0151.m1891((bs1) obj));
    }

    public final int hashCode() {
        return C0055.m722(C0151.m1891(this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0040.m537(m1077(), 0, 21, 730));
        C0049.m649(sb, C0151.m1891(this));
        C0062.m817(sb, C0026.m352(m1077(), 21, 1, 2714));
        return C0053.m699(sb);
    }

    public bs1(pz pzVar) {
        C0090.m1170(pzVar);
        this.a = pzVar;
    }
}
