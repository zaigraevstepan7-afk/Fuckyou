package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class m60 implements km1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final sa0 c;

    public /* synthetic */ m60(Object obj, sa0 sa0Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = sa0Var;
    }

    @Override // defpackage.km1
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new l60(this);
            case 1:
                return new yb0(this);
            default:
                return new w12(this);
        }
    }
}
