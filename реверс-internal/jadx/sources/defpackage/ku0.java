package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ku0 implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ f32 f;
    public final /* synthetic */ jo g;

    public /* synthetic */ ku0(f32 f32Var, jo joVar, int i) {
        this.e = i;
        this.f = f32Var;
        this.g = joVar;
    }

    @Override // defpackage.wa0
    public final Object h(Object obj, Object obj2) {
        int i = this.e;
        t32 t32Var = t32.a;
        jo joVar = this.g;
        f32 f32Var = this.f;
        int i2 = 1;
        ob0 ob0Var = (ob0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob0Var.Q();
                } else {
                    b91.a(lk.d0(-241536773, new ku0(f32Var, joVar, i2), ob0Var), ob0Var, 6);
                }
                break;
            default:
                if (!ob0Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ob0Var.Q();
                } else {
                    mz1.a(f32Var.j, joVar, ob0Var, 0);
                }
                break;
        }
        return t32Var;
    }
}
