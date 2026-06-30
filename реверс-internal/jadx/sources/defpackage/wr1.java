package defpackage;

import android.view.C0027;
import android.view.translation.C0018;
import androidx.core.widget.C0053;
import androidx.profileinstaller.C0062;
import androidx.versionedparcelable.C0075;
import com.google.android.material.behavior.C0093;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.carousel.C0109;
import com.google.android.material.snackbar.C0138;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wr1 implements yr1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f217short = {3186, 3156, 3138, 3138, 3140, 3154, 3154, 3081, 3157, 3144, 3157, 3149, 3140, 3100, 426, 422, 491, 483, 501, 501, 487, 481, 483, 443, 2377};
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: ۦۧۥۨ, reason: contains not printable characters */
    public static short[] m1966() {
        if (C0018.m241() < 0) {
            return f217short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr1)) {
            return false;
        }
        wr1 wr1Var = (wr1) obj;
        return C0138.m1749(C0093.m1209(this), C0093.m1209(wr1Var)) && C0138.m1749(C0109.m1387(this), C0109.m1387(wr1Var));
    }

    public final int hashCode() {
        return C0103.m1321(C0109.m1387(this)) + (C0103.m1321(C0093.m1209(this)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0027.m363(m1966(), 0, 14, 3105));
        C0062.m817(sb, C0093.m1209(this));
        C0062.m817(sb, C0018.m243(m1966(), 14, 10, 390));
        C0062.m817(sb, C0109.m1387(this));
        C0062.m817(sb, C0075.m972(m1966(), 24, 1, 2400));
        return C0053.m699(sb);
    }

    public wr1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
