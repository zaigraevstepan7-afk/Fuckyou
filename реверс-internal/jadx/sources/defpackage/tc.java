package defpackage;

import android.app.C0001;
import android.support.v4.app.C0002;
import android.support.v4.app.C0003;
import android.support.v4.graphics.drawable.C0008;
import android.text.C0011;
import android.text.C0014;
import android.view.C0021;
import androidx.appcompat.app.C0029;
import androidx.core.app.C0037;
import androidx.core.app.C0043;
import androidx.graphics.path.C0055;
import androidx.graphics.path.C0056;
import androidx.lifecycle.C0059;
import androidx.profileinstaller.C0062;
import androidx.profileinstaller.C0064;
import androidx.recyclerview.widget.C0065;
import androidx.recyclerview.widget.C0066;
import androidx.versionedparcelable.C0074;
import androidx.versionedparcelable.C0076;
import androidx.window.reflection.C0083;
import com.google.android.material.appbar.C0086;
import com.google.android.material.behavior.C0088;
import com.google.android.material.behavior.C0090;
import com.google.android.material.behavior.C0094;
import com.google.android.material.bottomappbar.C0101;
import com.google.android.material.bottomsheet.C0105;
import com.google.android.material.carousel.C0111;
import com.google.android.material.floatingactionbutton.C0115;
import com.google.android.material.focus.C0120;
import com.google.android.material.focus.C0122;
import com.google.android.material.search.C0124;
import com.google.android.material.search.C0128;
import com.google.android.material.sidesheet.C0129;
import com.google.android.material.sidesheet.C0133;
import com.reddit.frontpage.C0149;
import com.reddit.frontpage.C0150;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tc implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ tc(sa0 sa0Var, boolean z) {
        this.e = 3;
        this.f = z;
        this.g = sa0Var;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int iM779 = C0059.m779(this);
        boolean zM1454 = C0115.m1454(this);
        t32 t32VarM956 = C0074.m956();
        Object objM1514 = C0120.m1514(this);
        switch (iM779) {
            case 0:
                C0090.m1170((Integer) obj2);
                C0105.m1335((tv0) objM1514, zM1454, (ob0) obj, C0002.m29(1));
                break;
            case 1:
                C0090.m1170((Integer) obj2);
                C0074.m964(zM1454, (ha0) objM1514, (ob0) obj, C0002.m29(1));
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                C0090.m1170((Integer) obj2);
                C0101.m1293((ry1) objM1514, zM1454, (ob0) obj, C0002.m29(1));
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                sa0 sa0Var = (sa0) objM1514;
                ob0 ob0Var = (ob0) obj;
                int iM1214 = C0094.m1214((Integer) obj2);
                int i = 0;
                if (!C0008.m117(ob0Var, 1 & iM1214, (iM1214 & 3) != 2)) {
                    C0066.m868(ob0Var);
                } else {
                    ys1 ys1VarM1108 = C0086.m1108();
                    long jM1142 = C0088.m1142(C0133.m1680((ju0) C0065.m844(ob0Var, ys1VarM1108)));
                    long jM1567 = C0124.m1567(C0021.m282(), ob0Var);
                    long jM15672 = C0124.m1567(C0086.m1116(), ob0Var);
                    long jM1611 = C0128.m1611();
                    long jM15673 = C0124.m1567(C0011.m151(), ob0Var);
                    long jM15674 = C0124.m1567(C0066.m866(), ob0Var);
                    long jM15675 = C0124.m1567(C0014.m183(), ob0Var);
                    long jM15676 = C0124.m1567(C0065.m850(), ob0Var);
                    long jM1545 = C0122.m1545(C0059.m770(C0062.m819(), C0124.m1567(C0086.m1111(), ob0Var)), C0150.m1880(C0133.m1680((ju0) C0065.m844(ob0Var, ys1VarM1108))));
                    long jM15677 = C0124.m1567(C0076.m977(), ob0Var);
                    float fM499 = C0037.m499();
                    gv1 gv1Var = new gv1(jM1567, jM15672, jM1611, jM1142, jM15673, jM15674, jM15675, jM15676, jM1545, C0122.m1545(C0059.m770(fM499, jM15677), C0150.m1880(C0133.m1680((ju0) C0065.m844(ob0Var, ys1VarM1108)))), jM1611, C0122.m1545(C0059.m770(C0111.m1405(), C0124.m1567(C0129.m1625(), ob0Var)), C0150.m1880(C0133.m1680((ju0) C0065.m844(ob0Var, ys1VarM1108)))), C0122.m1545(C0059.m770(C0062.m813(), C0124.m1567(C0003.m51(), ob0Var)), C0150.m1880(C0133.m1680((ju0) C0065.m844(ob0Var, ys1VarM1108)))), C0122.m1545(C0059.m770(fM499, C0124.m1567(C0149.m1868(), ob0Var)), C0150.m1880(C0133.m1680((ju0) C0065.m844(ob0Var, ys1VarM1108)))), C0122.m1545(C0059.m770(fM499, C0124.m1567(C0064.m838(), ob0Var)), C0150.m1880(C0133.m1680((ju0) C0065.m844(ob0Var, ys1VarM1108)))), C0122.m1545(C0059.m770(C0153.m1991(), C0124.m1567(C0111.m1406(), ob0Var)), C0150.m1880(C0133.m1680((ju0) C0065.m844(ob0Var, ys1VarM1108)))));
                    boolean zM14542 = C0115.m1454(this);
                    C0059.m771(zM14542, sa0Var, null, C0083.m1064(1062482630, new i31(i, zM14542), ob0Var), gv1Var, ob0Var, 3072);
                }
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                p10 p10Var = (p10) obj;
                C0056.m729();
                C0029.m388(p10Var, C0043.m572((no1) objM1514, zM1454, true), C0066.m865(p10Var, C0055.m714()) / 2.0f, C0152.m1977((w01) obj2), 120);
                break;
            default:
                C0090.m1170((Integer) obj2);
                C0001.m27(zM1454, (jo) objM1514, (ob0) obj, C0002.m29(49));
                break;
        }
        return t32VarM956;
    }

    public /* synthetic */ tc(no1 no1Var, boolean z) {
        this.e = 4;
        this.g = no1Var;
        this.f = z;
    }

    public /* synthetic */ tc(Object obj, boolean z, int i, int i2) {
        this.e = i2;
        this.g = obj;
        this.f = z;
    }

    public /* synthetic */ tc(boolean z, eb0 eb0Var, int i, int i2) {
        this.e = i2;
        this.f = z;
        this.g = eb0Var;
    }
}
