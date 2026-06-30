package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zg {
    public final iy0 a = new iy0(new ah[16]);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005f -> B:19:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(pc1 pc1Var, ls lsVar) {
        yg ygVar;
        int i;
        pc1 pc1Var2;
        int i2;
        Object[] objArr;
        if (lsVar instanceof yg) {
            ygVar = (yg) lsVar;
            int i3 = ygVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ygVar.n = i3 - Integer.MIN_VALUE;
            } else {
                ygVar = new yg(this, lsVar);
            }
        }
        Object obj = ygVar.l;
        int i4 = ygVar.n;
        if (i4 == 0) {
            xc.G(obj);
            iy0 iy0Var = this.a;
            Object[] objArr2 = iy0Var.e;
            i = iy0Var.g;
            pc1Var2 = pc1Var;
            i2 = 0;
            objArr = objArr2;
            if (i2 < i) {
            }
        } else {
            if (i4 != 1) {
                yc.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = ygVar.k;
            i2 = ygVar.j;
            objArr = ygVar.i;
            pc1 pc1Var3 = ygVar.h;
            xc.G(obj);
            pc1Var2 = pc1Var3;
            i2++;
            if (i2 < i) {
                ah ahVar = (ah) objArr[i2];
                p7 p7Var = new p7(3, pc1Var2);
                ygVar.h = pc1Var2;
                ygVar.i = objArr;
                ygVar.j = i2;
                ygVar.k = i;
                ygVar.n = 1;
                Object objT = wi0.t(ahVar, p7Var, ygVar);
                wt wtVar = wt.e;
                if (objT == wtVar) {
                    return wtVar;
                }
                i2++;
                if (i2 < i) {
                    return t32.a;
                }
            }
        }
    }
}
