package defpackage;

import android.text.C0010;
import android.view.C0024;
import androidx.core.app.C0043;
import com.google.android.material.appbar.C0084;
import com.google.android.material.behavior.C0090;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.focus.C0121;
import com.google.android.material.transformation.C0145;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class gs1 implements js1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f168short = {1224, 1261, 1225, 1266, 1241, 1276, 1257, 1272, 1205, 1264, 1272, 1262, 1262, 1276, 1274, 1272, 1184, 1598};
    public final String a;

    /* JADX INFO: renamed from: ۣ۟ۡۦۡ, reason: not valid java name and contains not printable characters */
    public static short[] m1906() {
        if (C0024.m321() > 0) {
            return f168short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gs1) && C0084.m1079(C0010.m127(this), C0010.m127((gs1) obj));
    }

    public final int hashCode() {
        return C0103.m1321(C0010.m127(this));
    }

    public final String toString() {
        return C0121.m1530(C0145.m1827(m1906(), 0, 17, 1181), C0010.m127(this), C0043.m573(m1906(), 17, 1, 1559));
    }

    public gs1(String str) {
        C0090.m1170(str);
        this.a = str;
    }
}
