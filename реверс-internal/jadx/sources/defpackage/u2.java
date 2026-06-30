package defpackage;

import android.text.C0015;
import android.text.C0016;
import android.view.C0025;
import android.view.C0026;
import android.view.translation.C0017;
import androidx.appcompat.widget.C0033;
import androidx.core.graphics.drawable.C0049;
import androidx.core.widget.C0053;
import androidx.graphics.path.C0055;
import androidx.graphics.path.C0057;
import androidx.lifecycle.C0059;
import androidx.profileinstaller.C0062;
import androidx.profileinstaller.C0064;
import androidx.window.area.reflectionguard.C0078;
import com.google.android.material.appbar.C0084;
import com.google.android.material.behavior.C0090;
import com.google.android.material.bottomsheet.C0102;
import com.google.android.material.bottomsheet.C0103;
import com.google.android.material.snackbar.C0138;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class u2 implements z2 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f205short = {952, 911, 911, 914, 911, 720, 724, 2645, 2649, 2580, 2588, 2570, 2570, 2584, 2590, 2588, 2628, 1522, 1534, 1469, 1457, 1456, 1464, 1463, 1452, 1459, 1426, 1471, 1468, 1467, 1458, 1507, 1081, 1038, 1038, 1043, 1038, 1108, 1032, 1045, 1032, 1040, 1049, 1089, 2580, 2584, 2647, 2646, 2683, 2647, 2646, 2654, 2641, 2634, 2645, 2565, 1437};
    public final String a;
    public final String b;
    public final String c;
    public final ha0 d;

    /* JADX INFO: renamed from: ۨۧۦ۠, reason: not valid java name and contains not printable characters */
    public static short[] m1952() {
        if (C0078.m998() < 0) {
            return f205short;
        }
        return null;
    }

    public u2(int i, String str, String str2) {
        String strM217 = (i & 1) != 0 ? C0016.m217(m1952(), 0, 5, 1021) : str;
        e2 e2Var = new e2(7);
        C0090.m1170(strM217);
        C0090.m1170(str2);
        this.a = strM217;
        this.b = str2;
        this.c = C0138.m1743(m1952(), 5, 2, 671);
        this.d = e2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        return C0138.m1749(C0017.m226(this), C0017.m226(u2Var)) && C0084.m1079(C0102.m1308(this), C0102.m1308(u2Var)) && C0138.m1749(C0015.m194(this), C0015.m194(u2Var)) && C0138.m1749(C0033.m442(this), C0033.m442(u2Var));
    }

    public final int hashCode() {
        return C0055.m722(C0033.m442(this)) + ((C0103.m1321(C0015.m194(this)) + ((C0103.m1321(C0102.m1308(this)) + (C0103.m1321(C0017.m226(this)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM754 = C0057.m754(C0025.m334(m1952(), 32, 12, 1148), C0017.m226(this), C0059.m778(m1952(), 7, 10, 2681), C0102.m1308(this), C0064.m833(m1952(), 17, 15, 1502));
        C0062.m817(sbM754, C0015.m194(this));
        C0062.m817(sbM754, C0026.m352(m1952(), 44, 12, 2616));
        C0049.m649(sbM754, C0033.m442(this));
        C0062.m817(sbM754, C0016.m217(m1952(), 56, 1, 1460));
        return C0053.m699(sbM754);
    }
}
