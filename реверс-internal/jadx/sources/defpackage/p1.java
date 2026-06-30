package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p1 implements sa0 {
    public final /* synthetic */ int e;

    public /* synthetic */ p1(om omVar) {
        this.e = 29;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        int i = this.e;
        t32 t32Var = t32.a;
        u42 u42Var = u42.e;
        switch (i) {
            case 0:
                tv0 tv0Var = q1.a;
                return t32Var;
            case 1:
                return Boolean.valueOf(!(((db) obj) instanceof p41));
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                int i2 = mf.a;
                return t32Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ((sl0) obj).a();
                return t32Var;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                if (((Context) ((up) obj).B(w4.b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return ih.b;
                }
                gh.a.getClass();
                return fh.c;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                yl1.b((am1) obj, 0);
                return t32Var;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return t32Var;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                ((i22) obj).getClass();
                throw new ClassCastException();
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                ((i22) obj).getClass();
                throw new ClassCastException();
            case el.a /* 9 */:
                h20 h20Var = (h20) obj;
                h20Var.getClass();
                return h20Var.h;
            case el.b /* 10 */:
                h20 h20Var2 = (h20) obj;
                h20Var2.getClass();
                return Double.valueOf(h20Var2.c ? 90.0d : 10.0d);
            case 11:
                ((h20) obj).getClass();
                return new ms(4.5d, 7.0d, 11.0d, 21.0d);
            case el.c /* 12 */:
                h20 h20Var3 = (h20) obj;
                h20Var3.getClass();
                return h20Var3.g;
            case 13:
                h20 h20Var4 = (h20) obj;
                h20Var4.getClass();
                return Double.valueOf(h20Var4.b == u42Var ? 30.0d : 80.0d);
            case 14:
                ((h20) obj).getClass();
                return new ms(1.0d, 1.0d, 3.0d, 4.5d);
            case 15:
                h20 h20Var5 = (h20) obj;
                h20Var5.getClass();
                return h20Var5.f;
            case 16:
                h20 h20Var6 = (h20) obj;
                h20Var6.getClass();
                return Double.valueOf(h20Var6.b == u42Var ? 25.0d : 30.0d);
            case 17:
                vm vmVar = xi0.v;
                ((h20) obj).getClass();
                return vmVar.v();
            case 18:
                vm vmVar2 = xi0.v;
                ((h20) obj).getClass();
                return vmVar2.u();
            case 19:
                h20 h20Var7 = (h20) obj;
                h20Var7.getClass();
                return h20Var7.e;
            case 20:
                ((h20) obj).getClass();
                return new ms(3.0d, 4.5d, 7.0d, 11.0d);
            case 21:
                h20 h20Var8 = (h20) obj;
                h20Var8.getClass();
                return h20Var8.e;
            case 22:
                h20 h20Var9 = (h20) obj;
                h20Var9.getClass();
                return Double.valueOf(h20Var9.b == u42Var ? 90.0d : 30.0d);
            case 23:
                vm vmVar3 = xi0.v;
                ((h20) obj).getClass();
                return vmVar3.r();
            case 24:
                vm vmVar4 = xi0.v;
                ((h20) obj).getClass();
                return vmVar4.q();
            case 25:
                ((h20) obj).getClass();
                return new ms(3.0d, 4.5d, 7.0d, 11.0d);
            case 26:
                h20 h20Var10 = (h20) obj;
                h20Var10.getClass();
                return h20Var10.g;
            case 27:
                h20 h20Var11 = (h20) obj;
                h20Var11.getClass();
                return Double.valueOf(h20Var11.b == u42Var ? 40.0d : 90.0d);
            case 28:
                ((h20) obj).getClass();
                return new ms(1.0d, 1.0d, 3.0d, 4.5d);
            default:
                h20 h20Var12 = (h20) obj;
                h20Var12.getClass();
                if (om.n(h20Var12)) {
                    d = h20Var12.a.d;
                } else {
                    boolean z = h20Var12.b == u42Var;
                    boolean z2 = h20Var12.c;
                    if (!z) {
                        d = z2 ? 30.0d : 90.0d;
                    } else if (z2) {
                        d = 85.0d;
                    }
                }
                return Double.valueOf(d);
        }
    }

    public /* synthetic */ p1(int i) {
        this.e = i;
    }
}
