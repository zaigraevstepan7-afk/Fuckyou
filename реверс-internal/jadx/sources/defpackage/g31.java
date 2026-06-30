package defpackage;

import android.view.translation.C0020;
import androidx.appcompat.widget.C0032;
import androidx.compose.ui.input.pointer.C0035;
import androidx.versionedparcelable.C0074;
import com.google.android.material.carousel.C0110;
import com.google.android.material.search.C0128;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g31 implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ sa0 f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ g31(sa0 sa0Var, boolean z, int i) {
        this.e = i;
        this.f = sa0Var;
        this.g = z;
    }

    @Override // defpackage.ha0
    public final Object a() {
        int iM430 = C0032.m430(this);
        t32 t32VarM956 = C0074.m956();
        boolean zM261 = C0020.m261(this);
        sa0 sa0VarM1620 = C0128.m1620(this);
        switch (iM430) {
            case 0:
                C0110.m1395(sa0VarM1620, C0035.m467(!zM261));
                break;
            default:
                C0110.m1395(sa0VarM1620, C0035.m467(!zM261));
                break;
        }
        return t32VarM956;
    }
}
