package defpackage;

import android.app.C0000;
import androidx.profileinstaller.C0063;
import androidx.startup.C0070;
import androidx.window.reflection.C0079;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.focus.C0121;
import com.google.android.material.snackbar.C0138;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ux {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f208short = {2812, 2759, 2778, 2780, 2777, 2777, 2758, 2779, 2781, 2764, 2765, 2689, 2760, 2763, 2752, 2708, 434};
    public final String a;

    /* JADX INFO: renamed from: ۢۨۢۢ, reason: not valid java name and contains not printable characters */
    public static short[] m1956() {
        if (C0063.m824() >= 0) {
            return f208short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ux) && C0138.m1749(C0070.m914(this), C0070.m914((ux) obj));
    }

    public final int hashCode() {
        return C0103.m1321(C0070.m914(this));
    }

    public final String toString() {
        return C0121.m1530(C0079.m1020(m1956(), 0, 16, 2729), C0070.m914(this), C0000.m7(m1956(), 16, 1, 411));
    }

    public ux(String str) {
        this.a = str;
    }
}
