package defpackage;

import android.app.C0000;
import android.support.v4.app.C0002;
import android.text.C0015;
import androidx.appcompat.widget.C0031;
import androidx.startup.C0071;
import androidx.versionedparcelable.C0074;
import androidx.versionedparcelable.C0077;
import androidx.window.reflection.C0079;
import com.google.android.material.behavior.C0090;
import com.google.android.material.behavior.C0091;
import com.google.android.material.transformation.C0141;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ij implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ ij(Object obj, int i, Object obj2, Object obj3, int i2, int i3) {
        this.e = i3;
        this.h = obj;
        this.f = i;
        this.i = obj2;
        this.j = obj3;
        this.g = i2;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int iM1019 = C0079.m1019(this);
        t32 t32VarM956 = C0074.m956();
        int iM987 = C0077.m987(this);
        Object objM921 = C0071.m921(this);
        Object objM10 = C0000.m10(this);
        switch (iM1019) {
            case 0:
                C0090.m1170((Integer) obj2);
                int iM29 = C0002.m29(iM987 | 1);
                C0031.m408((ArrayList) C0015.m209(this), C0141.m1772(this), (sa0) objM10, (tv0) objM921, (ob0) obj, iM29);
                break;
            default:
                C0090.m1170((Integer) obj2);
                int iM292 = C0002.m29(iM987 | 1);
                C0091.m1185(C0015.m209(this), C0141.m1772(this), (ym0) objM10, (jo) objM921, (ob0) obj, iM292);
                break;
        }
        return t32VarM956;
    }
}
