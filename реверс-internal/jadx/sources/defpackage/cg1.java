package defpackage;

import android.support.v4.app.C0004;
import android.text.C0011;
import android.text.C0013;
import android.view.C0022;
import android.view.translation.C0018;
import androidx.appcompat.app.C0029;
import androidx.core.app.C0040;
import androidx.core.widget.C0053;
import androidx.graphics.path.C0054;
import androidx.versionedparcelable.C0074;
import com.google.android.material.behavior.C0090;
import com.google.android.material.bottomappbar.C0096;
import com.google.android.material.bottomsheet.C0107;
import com.google.android.material.carousel.C0109;
import com.google.android.material.search.C0125;
import com.google.android.material.search.C0128;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cg1 extends zu1 implements wa0 {
    public final /* synthetic */ int i = 1;
    public final /* synthetic */ long j;
    public /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg1(String[] strArr, long j, ks ksVar) {
        super(2, ksVar);
        this.k = strArr;
        this.j = j;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int iM2030 = C0156.m2030(this);
        t32 t32VarM956 = C0074.m956();
        switch (iM2030) {
            case 0:
                return C0029.m387((cg1) C0004.m56(this, (ks) obj2, (vt) obj), t32VarM956);
            default:
                C0029.m387((cg1) C0004.m56(this, (ks) obj2, (zj1) obj), t32VarM956);
                return t32VarM956;
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int iM2030 = C0156.m2030(this);
        long jM1239 = C0096.m1239(this);
        switch (iM2030) {
            case 0:
                return new cg1((String[]) C0109.m1384(this), jM1239, ksVar);
            default:
                cg1 cg1Var = new cg1(jM1239, ksVar);
                cg1Var.k = obj;
                return cg1Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    @Override // defpackage.ye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) throws Throwable {
        String strM699;
        String strM6992;
        Process processM148;
        String strM6993;
        String strM6994;
        switch (C0156.m2030(this)) {
            case 0:
                C0029.m378(obj);
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                Process process = null;
                try {
                    try {
                        processM148 = C0011.m148(C0029.m382(), (String[]) C0109.m1384(this));
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (process != null) {
                        C0128.m1613(process);
                    }
                    throw th;
                }
                try {
                    InputStream inputStreamM1577 = C0125.m1577(processM148);
                    C0090.m1170(inputStreamM1577);
                    int i = 4;
                    Thread thread = new Thread(new y4(i, inputStreamM1577, sb));
                    C0107.m1363(thread, true);
                    InputStream inputStreamM176 = C0013.m176(processM148);
                    C0090.m1170(inputStreamM176);
                    Thread thread2 = new Thread(new y4(i, inputStreamM176, sb2));
                    C0107.m1363(thread2, true);
                    C0013.m170(thread);
                    C0013.m170(thread2);
                    int iM2005 = C0154.m2005(processM148);
                    C0018.m242(thread, C0096.m1239(this));
                    C0018.m242(thread2, C0096.m1239(this));
                    synchronized (sb) {
                        strM6993 = C0053.m699(sb);
                    }
                    synchronized (sb2) {
                        strM6994 = C0053.m699(sb2);
                    }
                    zf1 zf1Var = new zf1(iM2005, strM6993, strM6994, null);
                    C0128.m1613(processM148);
                    return zf1Var;
                } catch (Exception e2) {
                    e = e2;
                    process = processM148;
                    synchronized (sb) {
                        strM699 = C0053.m699(sb);
                    }
                    synchronized (sb2) {
                        strM6992 = C0053.m699(sb2);
                    }
                    zf1 zf1Var2 = new zf1(-1, strM699, strM6992, C0040.m532(e));
                    if (process != null) {
                        C0128.m1613(process);
                    }
                    return zf1Var2;
                } catch (Throwable th2) {
                    th = th2;
                    process = processM148;
                    if (process != null) {
                    }
                    throw th;
                }
            default:
                C0029.m378(obj);
                zj1 zj1Var = (zj1) C0109.m1384(this);
                long jM1239 = C0096.m1239(this);
                bk1 bk1VarM149 = C0011.m149(zj1Var);
                C0022.m302(bk1VarM149, C0054.m709(bk1VarM149), jM1239, 1);
                return C0074.m956();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg1(long j, ks ksVar) {
        super(2, ksVar);
        this.j = j;
    }
}
