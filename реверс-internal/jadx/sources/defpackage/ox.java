package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ox implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ox(z61[] z61VarArr, tg1 tg1Var, int i, int[] iArr) {
        this.e = 2;
        this.g = z61VarArr;
        this.h = tg1Var;
        this.f = i;
        this.i = iArr;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        int i2 = 0;
        t32 t32Var = t32.a;
        Object obj2 = this.i;
        int i3 = this.f;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                th0 th0Var = (th0) obj3;
                ox0 ox0Var = (ox0) obj2;
                if (obj == ((qx) obj4)) {
                    yc.l("A derived state calculation cannot read itself");
                } else if (obj instanceof vs1) {
                    int i4 = th0Var.a - i3;
                    int iD = ox0Var.d(obj);
                    ox0Var.g(Math.min(i4, iD >= 0 ? ox0Var.c[iD] : Integer.MAX_VALUE), obj);
                }
                break;
            case 1:
                yd0 yd0Var = (yd0) obj4;
                xu0 xu0Var = (xu0) obj3;
                z61 z61Var = (z61) obj2;
                y61 y61Var = (y61) obj;
                int i5 = yd0Var.b;
                ky1 ky1Var = yd0Var.a;
                v12 v12Var = yd0Var.c;
                qz1 qz1Var = (qz1) yd0Var.d.a();
                ky1Var.a(k31.f, ef1.b(y61Var, i5, v12Var, qz1Var != null ? qz1Var.a : null, xu0Var.getLayoutDirection() == al0.f, z61Var.e), i3, z61Var.e);
                y61.j(y61Var, z61Var, Math.round(-ky1Var.a.g()), 0);
                break;
            default:
                z61[] z61VarArr = (z61[]) obj4;
                tg1 tg1Var = (tg1) obj3;
                int[] iArr = (int[]) obj2;
                y61 y61Var2 = (y61) obj;
                int length = z61VarArr.length;
                int i6 = 0;
                while (i2 < length) {
                    z61 z61Var2 = z61VarArr[i2];
                    z61Var2.getClass();
                    z61Var2.i();
                    y61Var2.g(z61Var2, iArr[i6], tg1Var.b.a(z61Var2.f, i3), 0.0f);
                    i2++;
                    i6++;
                }
                break;
        }
        return t32Var;
    }

    public /* synthetic */ ox(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.e = i2;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.f = i;
    }
}
