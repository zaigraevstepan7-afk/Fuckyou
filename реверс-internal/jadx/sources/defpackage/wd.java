package defpackage;

import android.graphics.Bitmap;
import androidx.appcompat.app.C0029;
import androidx.core.graphics.drawable.C0046;
import androidx.versionedparcelable.C0074;
import com.google.android.material.behavior.C0091;
import com.google.android.material.snackbar.C0138;
import com.google.android.material.transformation.C0144;
import com.google.android.material.transformation.C0145;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wd extends zu1 implements wa0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ File j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd(File file, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.j = file;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int iM1818 = C0145.m1818(this);
        t32 t32VarM956 = C0074.m956();
        vt vtVar = (vt) obj;
        ks ksVar = (ks) obj2;
        switch (iM1818) {
        }
        return C0144.m1813((wd) C0138.m1731(this, ksVar, vtVar), t32VarM956);
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int iM1818 = C0145.m1818(this);
        File fileM609 = C0046.m609(this);
        switch (iM1818) {
            case 0:
                return new wd(fileM609, ksVar, 0);
            default:
                return new wd(fileM609, ksVar, 1);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        int iM1818 = C0145.m1818(this);
        File fileM609 = C0046.m609(this);
        switch (iM1818) {
            case 0:
                C0029.m378(obj);
                Bitmap bitmapM1179 = C0091.m1179(fileM609, 1280);
                if (bitmapM1179 != null) {
                    return new f6(bitmapM1179);
                }
                return null;
            default:
                C0029.m378(obj);
                Bitmap bitmapM11792 = C0091.m1179(fileM609, 256);
                if (bitmapM11792 != null) {
                    return new f6(bitmapM11792);
                }
                return null;
        }
    }
}
