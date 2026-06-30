package defpackage;

import android.support.v4.app.C0005;
import android.text.C0012;
import android.text.C0013;
import android.text.C0015;
import androidx.appcompat.app.C0029;
import androidx.appcompat.widget.C0032;
import androidx.compose.ui.input.pointer.C0035;
import androidx.core.app.C0038;
import androidx.core.app.C0039;
import androidx.core.app.C0041;
import androidx.core.app.C0043;
import androidx.core.widget.C0050;
import androidx.core.widget.C0052;
import androidx.core.widget.C0053;
import androidx.graphics.path.C0054;
import androidx.lifecycle.C0060;
import androidx.profileinstaller.C0062;
import androidx.recyclerview.widget.C0067;
import androidx.versionedparcelable.C0074;
import androidx.window.reflection.C0080;
import androidx.window.reflection.C0082;
import com.google.android.material.behavior.C0088;
import com.google.android.material.behavior.C0090;
import com.google.android.material.bottomappbar.C0100;
import com.google.android.material.bottomsheet.C0106;
import com.google.android.material.carousel.C0111;
import com.google.android.material.floatingactionbutton.C0117;
import com.google.android.material.search.C0125;
import com.google.android.material.search.C0128;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ba1 extends zu1 implements wa0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f86short = {1279, 1250, 1267, 1262, 1168, 545, 551, 556, 555, 612, 555, 559, 590, 2550, 2548, 2529, 2485, 3147};
    public final /* synthetic */ int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ String k;

    /* JADX INFO: renamed from: ۟ۦ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static short[] m1075() {
        if (C0106.m1348() > 0) {
            return f86short;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ba1(String str, ks ksVar, int i) {
        super(2, ksVar);
        this.i = i;
        this.k = str;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int iM193 = C0015.m193(this);
        t32 t32VarM956 = C0074.m956();
        switch (iM193) {
            case 0:
                C0111.m1407((ba1) C0060.m785(this, (ks) obj2, (wx0) obj), t32VarM956);
                return t32VarM956;
            case 1:
                C0111.m1407((ba1) C0060.m785(this, (ks) obj2, (wx0) obj), t32VarM956);
                return t32VarM956;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                C0111.m1407((ba1) C0060.m785(this, (ks) obj2, (wx0) obj), t32VarM956);
                return t32VarM956;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return C0111.m1407((ba1) C0060.m785(this, (ks) obj2, (vt) obj), t32VarM956);
            default:
                return C0111.m1407((ba1) C0060.m785(this, (ks) obj2, (vt) obj), t32VarM956);
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        int iM193 = C0015.m193(this);
        String strM710 = C0054.m710(this);
        switch (iM193) {
            case 0:
                ba1 ba1Var = new ba1(strM710, ksVar, 0);
                ba1Var.j = obj;
                return ba1Var;
            case 1:
                ba1 ba1Var2 = new ba1(strM710, ksVar, 1);
                ba1Var2.j = obj;
                return ba1Var2;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ba1 ba1Var3 = new ba1(strM710, ksVar, 2);
                ba1Var3.j = obj;
                return ba1Var3;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ba1 ba1Var4 = new ba1(strM710, ksVar, 3);
                ba1Var4.j = obj;
                return ba1Var4;
            default:
                ba1 ba1Var5 = new ba1(strM710, ksVar, 4);
                ba1Var5.j = obj;
                return ba1Var5;
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        Object oe1Var;
        Object oe1Var2;
        int iM193 = C0015.m193(this);
        String strM1148 = C0088.m1148(m1075(), 0, 5, 1178);
        switch (iM193) {
            case 0:
                wx0 wx0Var = (wx0) C0012.m156(this);
                C0029.m378(obj);
                C0117.m1473(wx0Var, C0100.m1283(), C0054.m710(this));
                return C0074.m956();
            case 1:
                wx0 wx0Var2 = (wx0) C0012.m156(this);
                C0029.m378(obj);
                C0117.m1473(wx0Var2, C0041.m558(), C0054.m710(this));
                return C0074.m956();
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                wx0 wx0Var3 = (wx0) C0012.m156(this);
                C0029.m378(obj);
                C0117.m1473(wx0Var3, C0154.m2007(), C0054.m710(this));
                return C0074.m956();
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                String strM510 = C0038.m510(m1075(), 13, 4, 2453);
                C0029.m378(obj);
                String strM710 = C0054.m710(this);
                try {
                    Process processM786 = C0060.m786(C0029.m382(), C0128.m1612());
                    OutputStream outputStreamM528 = C0039.m528(processM786);
                    StringBuilder sb = new StringBuilder(strM510);
                    C0062.m817(sb, strM710);
                    C0062.m817(sb, C0156.m2026(m1075(), 17, 1, 3137));
                    String strM699 = C0053.m699(sb);
                    Charset charsetM1053 = C0082.m1053();
                    byte[] bArrM680 = C0052.m680(strM699, charsetM1053);
                    C0090.m1170(bArrM680);
                    C0157.m2036(outputStreamM528, bArrM680);
                    byte[] bArrM6802 = C0052.m680(strM1148, charsetM1053);
                    C0090.m1170(bArrM6802);
                    C0157.m2036(outputStreamM528, bArrM6802);
                    C0050.m655(outputStreamM528);
                    C0032.m426(outputStreamM528);
                    InputStream inputStreamM1577 = C0125.m1577(processM786);
                    C0090.m1170(inputStreamM1577);
                    String strM165 = C0013.m165(new BufferedReader(new InputStreamReader(inputStreamM1577, charsetM1053), 8192));
                    C0154.m2005(processM786);
                    oe1Var = C0080.m1037(C0067.m874(strM165));
                    break;
                } catch (Throwable th) {
                    oe1Var = new oe1(th);
                }
                if (oe1Var instanceof oe1) {
                    return null;
                }
                return oe1Var;
            default:
                C0029.m378(obj);
                try {
                    Process processM7862 = C0060.m786(C0029.m382(), C0054.m710(this));
                    OutputStream outputStreamM5282 = C0039.m528(processM7862);
                    String strM573 = C0043.m573(m1075(), 5, 8, 580);
                    Charset charsetM10532 = C0082.m1053();
                    byte[] bArrM6803 = C0052.m680(strM573, charsetM10532);
                    C0090.m1170(bArrM6803);
                    C0157.m2036(outputStreamM5282, bArrM6803);
                    byte[] bArrM6804 = C0052.m680(strM1148, charsetM10532);
                    C0090.m1170(bArrM6804);
                    C0157.m2036(outputStreamM5282, bArrM6804);
                    C0050.m655(outputStreamM5282);
                    C0032.m426(outputStreamM5282);
                    oe1Var2 = C0035.m467(C0154.m2005(processM7862) == 0);
                    break;
                } catch (Throwable th2) {
                    oe1Var2 = new oe1(th2);
                }
                return oe1Var2 instanceof oe1 ? C0005.m70() : oe1Var2;
        }
    }
}
