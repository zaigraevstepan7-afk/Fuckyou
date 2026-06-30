package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class t8 extends zu1 implements wa0 {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t8(int i, ks ksVar, int i2) {
        super(i, ksVar);
        this.i = i2;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.i;
        t32 t32Var = t32.a;
        switch (i) {
            case 0:
                return ((t8) o((ks) obj2, (vt) obj)).q(t32Var);
            default:
                ((t8) o((ks) obj2, (g70) obj)).q(t32Var);
                return t32Var;
        }
    }

    @Override // defpackage.ye
    public final ks o(ks ksVar, Object obj) {
        switch (this.i) {
            case 0:
                return new t8(2, ksVar, 0);
            default:
                return new t8(2, ksVar, 1);
        }
    }

    @Override // defpackage.ye
    public final Object q(Object obj) {
        switch (this.i) {
            case 0:
                xc.G(obj);
                return Choreographer.getInstance();
            default:
                xc.G(obj);
                return t32.a;
        }
    }
}
