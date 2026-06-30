package defpackage;

import android.view.C0027;
import androidx.compose.ui.input.pointer.C0036;
import androidx.core.app.C0039;
import androidx.lifecycle.C0059;
import androidx.recyclerview.widget.C0066;
import androidx.versionedparcelable.C0074;
import com.google.android.material.behavior.C0092;
import com.google.android.material.carousel.C0110;
import com.google.android.material.transformation.C0139;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jj implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ jj(int i, int i2, Object obj) {
        this.e = i2;
        this.g = obj;
        this.f = i;
    }

    @Override // defpackage.ha0
    public final Object a() {
        int iM772 = C0059.m772(this);
        int iM529 = C0039.m529(this);
        Object objM360 = C0027.m360(this);
        switch (iM772) {
            case 0:
                C0110.m1395((sa0) objM360, C0066.m867(iM529));
                return C0074.m956();
            default:
                return C0066.m867(C0092.m1197(C0139.m1757((pz1) C0036.m471((ll) objM360)), iM529));
        }
    }
}
