package defpackage;

import android.support.v4.app.C0005;
import androidx.core.graphics.drawable.C0049;
import com.google.android.material.behavior.C0093;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.carousel.C0109;
import com.google.android.material.focus.C0121;
import com.google.android.material.snackbar.C0138;
import com.reddit.frontpage.C0149;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class nr1 implements or1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f184short = {2429, 2390, 2382, 2391, 2389, 2390, 2392, 2397, 2329, 2396, 2379, 2379, 2390, 2379, 3177, 3138, 3162, 3139, 3137, 3138, 3148, 3145, 3176, 3167, 3167, 3138, 3167, 3077, 3136, 3144, 3166, 3166, 3148, 3146, 3144, 3088, 2837};
    public final String a;

    /* JADX INFO: renamed from: ۦ۠ۡۡ, reason: contains not printable characters */
    public static short[] m1929() {
        if (C0093.m1203() >= 0) {
            return f184short;
        }
        return null;
    }

    @Override // defpackage.or1
    public final String a() {
        return C0149.m1870(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nr1) && C0138.m1749(C0149.m1870(this), C0149.m1870((nr1) obj));
    }

    @Override // defpackage.or1
    public final String getTitle() {
        return C0005.m81(m1929(), 0, 14, 2361);
    }

    public final int hashCode() {
        return C0103.m1321(C0149.m1870(this));
    }

    public final String toString() {
        return C0121.m1530(C0109.m1379(m1929(), 14, 22, 3117), C0149.m1870(this), C0049.m653(m1929(), 36, 1, 2876));
    }

    public nr1(String str) {
        this.a = str;
    }
}
