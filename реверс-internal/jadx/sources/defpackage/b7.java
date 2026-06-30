package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class b7 extends sk0 implements sa0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7(int i, Object obj, Object obj2) {
        super(1);
        this.f = i;
        this.h = obj;
        this.g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sa0
    public final Object i(Object obj) {
        mc1 mc1Var;
        int i = 0;
        switch (this.f) {
            case 0:
                return new yg0((ko0) this.h, new a7(i, (c7) this.g));
            case 1:
                yg0 yg0Var = (yg0) this.h;
                synchronized (yg0Var.c) {
                    try {
                        yg0Var.e = true;
                        iy0 iy0Var = yg0Var.d;
                        Object[] objArr = iy0Var.e;
                        int i2 = iy0Var.g;
                        while (i < i2) {
                            p01 p01Var = (p01) ((f72) objArr[i]).get();
                            if (p01Var != null && (mc1Var = p01Var.b) != null) {
                                mc1Var.closeConnection();
                                p01Var.b = null;
                            }
                            i++;
                        }
                        yg0Var.d.g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                gz1 gz1Var = ((c7) this.g).f;
                gz1Var.b.set(null);
                gz1Var.a.g();
                return t32.a;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                v81 v81Var = (v81) this.h;
                v81Var.setPositionProvider((y81) this.g);
                v81Var.s();
                return new g7(0);
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                w8 w8Var = (w8) this.h;
                x8 x8Var = (x8) this.g;
                synchronized (w8Var.i) {
                    w8Var.k.remove(x8Var);
                }
                return t32.a;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                ((Choreographer) ((y8) this.h).f).removeFrameCallback((x8) this.g);
                return t32.a;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ((y61) obj).g((z61) this.h, 0, 0, ((yr) this.g).c.g());
                return t32.a;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                y61.m((y61) obj, (z61) this.h, 0, 0, ((yf) this.g).s);
                return t32.a;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                p10 p10Var = (p10) obj;
                p10 p10Var2 = (p10) this.h;
                hx hxVarK = p10Var.E().k();
                al0 al0VarO = p10Var.E().o();
                cj cjVarI = p10Var.E().i();
                long jQ = p10Var.E().q();
                nc0 nc0Var = (nc0) p10Var.E().b;
                sa0 sa0Var = (sa0) this.g;
                hx hxVarK2 = p10Var2.E().k();
                al0 al0VarO2 = p10Var2.E().o();
                cj cjVarI2 = p10Var2.E().i();
                long jQ2 = p10Var2.E().q();
                nc0 nc0Var2 = (nc0) p10Var2.E().b;
                oc ocVarE = p10Var2.E();
                ocVarE.z(hxVarK);
                ocVarE.A(al0VarO);
                ocVarE.y(cjVarI);
                ocVarE.B(jQ);
                ocVarE.b = nc0Var;
                cjVarI.l();
                try {
                    sa0Var.i(p10Var2);
                    cjVarI.i();
                    oc ocVarE2 = p10Var2.E();
                    ocVarE2.z(hxVarK2);
                    ocVarE2.A(al0VarO2);
                    ocVarE2.y(cjVarI2);
                    ocVarE2.B(jQ2);
                    ocVarE2.b = nc0Var2;
                    return t32.a;
                } catch (Throwable th2) {
                    cjVarI.i();
                    oc ocVarE3 = p10Var2.E();
                    ocVarE3.z(hxVarK2);
                    ocVarE3.A(al0VarO2);
                    ocVarE3.y(cjVarI2);
                    ocVarE3.B(jQ2);
                    ocVarE3.b = nc0Var2;
                    throw th2;
                }
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                y61.m((y61) obj, (z61) this.h, 0, 0, ((ao1) this.g).E);
                return t32.a;
            default:
                ip ipVar = (ip) obj;
                wa0 wa0Var = (wa0) this.g;
                v92 v92Var = (v92) this.h;
                if (!v92Var.g) {
                    xo0 xo0VarC = ipVar.c();
                    View view = ipVar.a;
                    zo0 zo0VarG = xo0VarC.g();
                    v92Var.i = wa0Var;
                    if (v92Var.h == null) {
                        if (xi0.o(Looper.myLooper(), view.getHandler().getLooper())) {
                            v92Var.h = zo0VarG;
                            zo0VarG.a(v92Var);
                        } else {
                            view.post(new y4(5, v92Var, zo0VarG));
                        }
                    } else if (zo0VarG.c.compareTo(qo0.g) >= 0) {
                        v92Var.f.B(new jo(-1723985096, true, new l5(ipVar, v92Var, wa0Var)));
                    }
                }
                return t32.a;
        }
    }
}
