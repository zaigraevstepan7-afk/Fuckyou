package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uy1 implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ hx f;
    public final /* synthetic */ fy0 g;

    public /* synthetic */ uy1(hx hxVar, fy0 fy0Var, int i) {
        this.e = i;
        this.f = hxVar;
        this.g = fy0Var;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        fy0 fy0Var = this.g;
        hx hxVar = this.f;
        switch (i) {
            case 0:
                int i2 = 1;
                uq uqVar = new uq((ha0) obj, i2);
                uy1 uy1Var = new uy1(hxVar, fy0Var, i2);
                if (jt0.a()) {
                    return jt0.a() ? new gt0(uqVar, uy1Var, Build.VERSION.SDK_INT == 28 ? j71.b : j71.c) : qv0.a;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            default:
                wz wzVar = (wz) obj;
                fy0Var.setValue(new vh0((((long) hxVar.N(wz.a(wzVar.a))) & 4294967295L) | (((long) hxVar.N(wz.b(wzVar.a))) << 32)));
                return t32.a;
        }
    }
}
