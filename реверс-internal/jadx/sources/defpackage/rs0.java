package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class rs0 implements hx {
    public boolean e;
    public long f = 9223372034707292159L;
    public long g = 0;
    public final /* synthetic */ ws0 h;

    public rs0(ws0 ws0Var) {
        this.h = ws0Var;
    }

    public final void a(xd0 xd0Var, float f) {
        ws0 ws0Var = this.h;
        ub ubVar = ws0Var.u;
        if (ubVar == null) {
            ubVar = new ub();
            ws0Var.u = ubVar;
        }
        int iV = nd.V((xd0[]) ubVar.b, xd0Var);
        if (iV >= 0) {
            float[] fArr = (float[]) ubVar.c;
            if (fArr[iV] != f) {
                fArr[iV] = f;
                ((byte[]) ubVar.d)[iV] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) ubVar.d;
                if (bArr[iV] == 2) {
                    bArr[iV] = 0;
                    return;
                }
                return;
            }
        }
        int i = ubVar.a;
        xd0[] xd0VarArr = (xd0[]) ubVar.b;
        if (i == xd0VarArr.length) {
            int i2 = i * 2;
            ubVar.b = (xd0[]) Arrays.copyOf(xd0VarArr, i2);
            ubVar.c = Arrays.copyOf((float[]) ubVar.c, i2);
            ubVar.d = Arrays.copyOf((byte[]) ubVar.d, i2);
        }
        ((xd0[]) ubVar.b)[i] = xd0Var;
        ((byte[]) ubVar.d)[i] = 3;
        ((float[]) ubVar.c)[i] = f;
        ubVar.a++;
    }

    @Override // defpackage.hx
    public final float b() {
        return this.h.b();
    }

    @Override // defpackage.hx
    public final float l() {
        return this.h.l();
    }
}
