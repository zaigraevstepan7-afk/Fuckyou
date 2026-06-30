package defpackage;

import android.view.C0026;
import androidx.core.widget.C0053;
import com.google.android.material.behavior.C0089;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.bottomsheet.C0106;
import com.google.android.material.focus.C0121;
import com.google.android.material.snackbar.C0138;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xr1 implements or1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f222short = {2851, 2840, 2821, 2819, 2822, 2822, 2841, 2820, 2818, 2835, 2834, 2902, 2869, 2854, 2851, 580, 639, 610, 612, 609, 609, 638, 611, 613, 628, 629, 594, 609, 612, 569, 636, 628, 610, 610, 624, 630, 628, 556, 2273};
    public final String a;

    /* JADX INFO: renamed from: ۟ۦۡۦۥ, reason: not valid java name and contains not printable characters */
    public static short[] m1970() {
        if (C0053.m695() < 0) {
            return f222short;
        }
        return null;
    }

    @Override // defpackage.or1
    public final String a() {
        return C0089.m1155(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xr1) && C0138.m1749(C0089.m1155(this), C0089.m1155((xr1) obj));
    }

    @Override // defpackage.or1
    public final String getTitle() {
        return C0106.m1350(m1970(), 0, 15, 2934);
    }

    public final int hashCode() {
        return C0103.m1321(C0089.m1155(this));
    }

    public final String toString() {
        return C0121.m1530(C0026.m352(m1970(), 15, 23, 529), C0089.m1155(this), C0154.m2004(m1970(), 38, 1, 2248));
    }

    public xr1(String str) {
        this.a = str;
    }
}
