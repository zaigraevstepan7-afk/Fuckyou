package defpackage;

import android.app.C0000;
import android.support.v4.app.C0002;
import android.support.v4.app.C0004;
import android.support.v4.graphics.drawable.C0007;
import android.support.v4.graphics.drawable.C0008;
import android.text.C0016;
import android.view.C0021;
import android.view.translation.C0018;
import androidx.appcompat.widget.C0031;
import androidx.graphics.path.C0055;
import androidx.profileinstaller.C0063;
import androidx.recyclerview.widget.C0066;
import androidx.versionedparcelable.C0074;
import androidx.versionedparcelable.C0075;
import androidx.versionedparcelable.C0076;
import androidx.window.reflection.C0080;
import com.google.android.material.appbar.C0085;
import com.google.android.material.appbar.C0086;
import com.google.android.material.behavior.C0094;
import com.google.android.material.bottomsheet.C0106;
import com.google.android.material.snackbar.C0138;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i31 implements wa0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f171short = {1246, 1251, 1273, 1250, 1256, 1257, 1256, 1186, 1231, 1248, 1251, 1279, 1257};
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m1918() {
        if (C0106.m1348() > 0) {
            return f171short;
        }
        return null;
    }

    public /* synthetic */ i31(int i, boolean z) {
        this.e = i;
        this.f = z;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        ye0 ye0VarM98;
        int iM272 = C0021.m272(this);
        t32 t32VarM956 = C0074.m956();
        boolean zM974 = C0076.m974(this);
        switch (iM272) {
            case 0:
                ob0 ob0Var = (ob0) obj;
                int iM1214 = C0094.m1214((Integer) obj2);
                if (!C0008.m117(ob0Var, iM1214 & 1, (iM1214 & 3) != 2)) {
                    C0066.m868(ob0Var);
                } else {
                    if (zM974) {
                        ye0VarM98 = C0000.m3();
                    } else {
                        ye0VarM98 = C0007.m98();
                        if (ye0VarM98 == null) {
                            xe0 xe0Var = new xe0(C0002.m34(m1918(), 0, 13, 1164), 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            C0055.m724();
                            uq1 uq1Var = new uq1(C0004.m57());
                            y41 y41Var = new y41(0);
                            C0063.m830(y41Var, 18.3f, 5.71f);
                            C0086.m1110(y41Var, -0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                            C0155.m2014(y41Var, 12.0f, 10.59f);
                            C0155.m2014(y41Var, 7.11f, 5.7f);
                            C0086.m1110(y41Var, -0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                            C0086.m1110(y41Var, -0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                            C0155.m2014(y41Var, 10.59f, 12.0f);
                            C0155.m2014(y41Var, 5.7f, 16.89f);
                            C0086.m1110(y41Var, -0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                            C0086.m1110(y41Var, 0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                            C0155.m2014(y41Var, 12.0f, 13.41f);
                            C0080.m1035(y41Var, 4.89f, 4.89f);
                            C0086.m1110(y41Var, 0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                            C0086.m1110(y41Var, 0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                            C0155.m2014(y41Var, 13.41f, 12.0f);
                            C0080.m1035(y41Var, 4.89f, -4.89f);
                            C0086.m1110(y41Var, 0.38f, -0.38f, 0.38f, -1.02f, 0.0f, -1.4f);
                            C0018.m239(y41Var);
                            C0075.m966(xe0Var, (ArrayList) C0085.m1096(y41Var), uq1Var);
                            ye0VarM98 = C0138.m1739(xe0Var);
                            bl.a = ye0VarM98;
                        }
                    }
                    C0031.m415(ye0VarM98, null, C0031.m413(C0086.m1121(), 16.0f), 0L, ob0Var, 48, 8);
                }
                break;
            default:
                ob0 ob0Var2 = (ob0) obj;
                int iM12142 = C0094.m1214((Integer) obj2);
                if (!C0008.m117(ob0Var2, iM12142 & 1, (iM12142 & 3) != 2)) {
                    C0066.m868(ob0Var2);
                } else {
                    C0016.m215(C0008.m113(), zM974, null, ob0Var2, 3072);
                }
                break;
        }
        return t32VarM956;
    }
}
