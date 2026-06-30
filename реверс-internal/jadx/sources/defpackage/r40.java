package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class r40 {
    public static final r22 a = new r22(a4.A, a4.B);
    public static final gr1 b = pv.D(0.0f, 400.0f, null, 5);
    public static final gr1 c = pv.D(0.0f, 400.0f, null, 5);
    public static final gr1 d;
    public static final gr1 e;

    static {
        Map map = z62.a;
        d = pv.D(0.0f, 400.0f, new oh0(4294967297L), 1);
        e = pv.D(0.0f, 400.0f, new vh0(4294967297L), 1);
    }

    public static final void a(d22 d22Var, ha0 ha0Var, ob0 ob0Var, int i) {
        ob0Var.X(-1186853286);
        int i2 = (ob0Var.f(d22Var) ? 4 : 2) | i | (ob0Var.h(ha0Var) ? 32 : 16);
        int i3 = 1;
        if (ob0Var.N(i2 & 1, (i2 & 19) != 18)) {
            v41 v41Var = d22Var.e;
            v41 v41Var2 = d22Var.d;
            boolean z = v41Var.getValue() != null;
            if (xi0.o(d22Var.c(), v41Var2.getValue()) && !z) {
                ha0Var.a();
            }
            Object objK = ob0Var.K();
            l91 l91Var = kp.a;
            Object obj = objK;
            if (objK == l91Var) {
                boolean[] zArr = {z};
                ob0Var.f0(zArr);
                obj = zArr;
            }
            boolean[] zArr2 = (boolean[]) obj;
            Object objK2 = ob0Var.K();
            if (objK2 == l91Var) {
                objK2 = new Object[1];
                ob0Var.f0(objK2);
            }
            Object[] objArr = (Object[]) objK2;
            if (!xi0.o(objArr[0], v41Var2.getValue())) {
                if (!z && !zArr2[0]) {
                    ha0Var.a();
                }
                objArr[0] = v41Var2.getValue();
            }
            zArr2[0] = z;
        } else {
            ob0Var.Q();
        }
        dc1 dc1VarR = ob0Var.r();
        if (dc1VarR != null) {
            dc1VarR.d = new z4(d22Var, ha0Var, i, i3);
        }
    }

    public static w40 b(p60 p60Var, int i) {
        if ((i & 1) != 0) {
            p60Var = pv.D(0.0f, 400.0f, null, 5);
        }
        return new w40(new e22(new p50(p60Var), (wi0) null, (mi1) null, (LinkedHashMap) null, 126));
    }
}
