package defpackage;

import android.text.C0013;
import android.text.C0014;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.bottomsheet.C0104;
import com.google.android.material.focus.C0121;
import com.google.android.material.sidesheet.C0131;
import com.google.android.material.snackbar.C0138;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sr1 implements or1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f200short = {2917, 2882, 2886, 2889, 2895, 2904, 2885, 2883, 2882, 2828, 2889, 2910, 2910, 2883, 2910, 3095, 3120, 3124, 3131, 3133, 3114, 3127, 3121, 3120, 3099, 3116, 3116, 3121, 3116, 3190, 3123, 3131, 3117, 3117, 3135, 3129, 3131, 3171, 1996};
    public final String a;

    /* JADX INFO: renamed from: ۣۡۡ۟, reason: not valid java name and contains not printable characters */
    public static short[] m1947() {
        if (C0013.m174() <= 0) {
            return f200short;
        }
        return null;
    }

    @Override // defpackage.or1
    public final String a() {
        return C0013.m172(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sr1) && C0138.m1749(C0013.m172(this), C0013.m172((sr1) obj));
    }

    @Override // defpackage.or1
    public final String getTitle() {
        return C0104.m1331(m1947(), 0, 15, 2860);
    }

    public final int hashCode() {
        return C0103.m1321(C0013.m172(this));
    }

    public final String toString() {
        return C0121.m1530(C0014.m181(m1947(), 15, 23, 3166), C0013.m172(this), C0131.m1658(m1947(), 38, 1, 2021));
    }

    public sr1(String str) {
        this.a = str;
    }
}
