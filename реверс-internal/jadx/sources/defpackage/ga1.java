package defpackage;

import android.support.v4.app.C0002;
import androidx.appcompat.app.C0029;
import androidx.lifecycle.C0060;
import androidx.versionedparcelable.C0074;
import androidx.versionedparcelable.C0075;
import com.google.android.material.floatingactionbutton.C0117;
import com.google.android.material.transformation.C0142;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ga1 extends zu1 implements wa0 {
    public /* synthetic */ Object i;
    public final /* synthetic */ float j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga1(float f, ks ksVar) {
        super(2, ksVar);
        this.j = f;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        ga1 ga1Var = (ga1) C0002.m42(this, (ks) obj2, (wx0) obj);
        t32 t32VarM956 = C0074.m956();
        C0142.m1789(ga1Var, t32VarM956);
        return t32VarM956;
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        ga1 ga1Var = new ga1(C0060.m796(this), ksVar);
        ga1Var.i = obj;
        return ga1Var;
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        wx0 wx0Var = (wx0) C0153.m1989(this);
        C0029.m378(obj);
        C0117.m1473(wx0Var, C0075.m970(), new Float(C0060.m796(this)));
        return C0074.m956();
    }
}
