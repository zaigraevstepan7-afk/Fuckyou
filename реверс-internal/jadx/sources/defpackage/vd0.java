package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vd0 {
    public int a;
    public float b;
    public final Object c;

    public vd0(nz1 nz1Var) {
        this.c = nz1Var;
        this.a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        nz1 nz1Var = (nz1) this.c;
        int i2 = 1;
        if (z) {
            int iW = xk.w(nz1Var.f, i, z);
            z4 = i == nz1Var.f.getLineStart(iW) || i == nz1Var.f(iW);
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.a == i4) {
            return this.b;
        }
        float fJ = z3 ? nz1Var.j(i, z) : nz1Var.k(i, z);
        if (z2) {
            this.a = i4;
            this.b = fJ;
        }
        return fJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(float f, ls lsVar) {
        gd1 gd1Var;
        if (lsVar instanceof gd1) {
            gd1Var = (gd1) lsVar;
            int i = gd1Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                gd1Var.j = i - Integer.MIN_VALUE;
            } else {
                gd1Var = new gd1(this, lsVar);
            }
        }
        Object objH = gd1Var.h;
        int i2 = gd1Var.j;
        if (i2 == 0) {
            xc.G(objH);
            af afVar = (af) this.c;
            Float f2 = new Float(f);
            gd1Var.j = 1;
            objH = afVar.h(f2, gd1Var);
            wt wtVar = wt.e;
            if (objH == wtVar) {
                return wtVar;
            }
        } else {
            if (i2 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xc.G(objH);
        }
        this.b += ((Number) objH).floatValue();
        return t32.a;
    }

    public vd0(int i, af afVar) {
        this.a = i;
        this.c = afVar;
    }
}
