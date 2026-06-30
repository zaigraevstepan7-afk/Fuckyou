package defpackage;

import android.view.C0027;
import androidx.appcompat.app.C0029;
import androidx.core.graphics.drawable.C0048;
import androidx.core.widget.C0053;
import androidx.profileinstaller.C0062;
import androidx.versionedparcelable.C0077;
import androidx.window.reflection.C0079;
import com.google.android.material.behavior.C0089;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.snackbar.C0136;
import com.google.android.material.snackbar.C0138;
import com.google.android.material.transformation.C0143;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class tx {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f204short = {761, 735, 730, 730, 709, 728, 734, 719, 718, 642, 715, 712, 707, 663, 3302, 3306, 3235, 3257, 3218, 3314, 3324, 3319, 1172};
    public final String a;
    public final boolean b;

    /* JADX INFO: renamed from: ۣ۟ۢ۟۠, reason: not valid java name and contains not printable characters */
    public static short[] m1951() {
        if (C0079.m1016() < 0) {
            return f204short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx)) {
            return false;
        }
        tx txVar = (tx) obj;
        return C0138.m1749(C0029.m383(this), C0029.m383(txVar)) && C0089.m1162(this) == C0089.m1162(txVar);
    }

    public final int hashCode() {
        return C0143.m1802(C0089.m1162(this)) + (C0103.m1321(C0029.m383(this)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0027.m363(m1951(), 0, 14, 682));
        C0062.m817(sb, C0029.m383(this));
        C0062.m817(sb, C0048.m639(m1951(), 14, 8, 3274));
        C0136.m1714(sb, C0089.m1162(this));
        C0062.m817(sb, C0077.m994(m1951(), 22, 1, 1213));
        return C0053.m699(sb);
    }

    public tx(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
