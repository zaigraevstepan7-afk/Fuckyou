package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jn implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ry1 f;
    public final /* synthetic */ jo g;
    public final /* synthetic */ int h;

    public /* synthetic */ jn(ry1 ry1Var, jo joVar, int i, int i2) {
        this.e = i2;
        this.f = ry1Var;
        this.g = joVar;
        this.h = i;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        int i2 = this.h;
        jo joVar = this.g;
        ry1 ry1Var = this.f;
        ob0 ob0Var = (ob0) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                bl.a(ry1Var, joVar, ob0Var, al.V(i2 | 1));
                break;
            default:
                lk.k(ry1Var, joVar, ob0Var, al.V(i2 | 1));
                break;
        }
        return t32Var;
    }
}
