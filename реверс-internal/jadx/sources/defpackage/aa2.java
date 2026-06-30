package defpackage;

import androidx.appcompat.widget.C0031;
import androidx.appcompat.widget.C0033;
import androidx.compose.ui.input.pointer.C0036;
import androidx.startup.C0072;
import androidx.versionedparcelable.C0074;
import com.google.android.material.carousel.C0109;
import com.google.android.material.transformation.C0145;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aa2 implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ z2 f;
    public final /* synthetic */ ha0 g;

    public /* synthetic */ aa2(z2 z2Var, ha0 ha0Var, int i) {
        this.e = i;
        this.f = z2Var;
        this.g = ha0Var;
    }

    @Override // defpackage.ha0
    public final Object a() {
        int iM1817 = C0145.m1817(this);
        t32 t32VarM956 = C0074.m956();
        ha0 ha0VarM1382 = C0109.m1382(this);
        z2 z2VarM932 = C0072.m932(this);
        switch (iM1817) {
            case 0:
                C0031.m405(C0036.m478((y2) z2VarM932));
                C0031.m405(ha0VarM1382);
                break;
            default:
                C0031.m405(C0033.m442((u2) z2VarM932));
                C0031.m405(ha0VarM1382);
                break;
        }
        return t32VarM956;
    }
}
