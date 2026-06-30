package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class o40 extends sk0 implements sa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ w40 g;
    public final /* synthetic */ j50 h;
    public final /* synthetic */ vn1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o40(w40 w40Var, j50 j50Var, vn1 vn1Var, int i) {
        super(1);
        this.f = i;
        this.g = w40Var;
        this.h = j50Var;
        this.i = vn1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    @Override // defpackage.sa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) {
        int i = this.f;
        w40 w40Var = this.g;
        vn1 vn1Var = this.i;
        j50 j50Var = this.h;
        float f = 1.0f;
        switch (i) {
            case 0:
                int iOrdinal = ((k40) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            ez1.a();
                            return null;
                        }
                        f = j50Var.a.a != null ? 0.0f : vn1Var.f;
                    }
                } else if (w40Var.a.a != null) {
                }
                return Float.valueOf(f);
            default:
                int iOrdinal2 = ((k40) obj).ordinal();
                if (iOrdinal2 == 0) {
                    mi1 mi1Var = w40Var.a.b;
                    if (mi1Var != null) {
                        f = mi1Var.a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        ez1.a();
                        return null;
                    }
                    mi1 mi1Var2 = j50Var.a.b;
                    f = mi1Var2 != null ? mi1Var2.a : vn1Var.g;
                }
                return Float.valueOf(f);
        }
    }
}
