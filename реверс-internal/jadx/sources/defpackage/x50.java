package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class x50 {
    public static final /* synthetic */ int c = 0;
    public final op1 a = op1.f();
    public boolean b;

    static {
        new x50(0);
    }

    public x50(int i) {
        a();
        a();
    }

    public static void b(nl nlVar, q92 q92Var, int i, Object obj) throws IOException {
        if (q92Var == q92.h) {
            nlVar.B(i, 3);
            ((a0) obj).b(nlVar);
            nlVar.B(i, 4);
        }
        nlVar.B(i, q92Var.f);
        switch (q92Var.ordinal()) {
            case 0:
                nlVar.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                nlVar.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                nlVar.F(((Long) obj).longValue());
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                nlVar.F(((Long) obj).longValue());
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                nlVar.w(((Integer) obj).intValue());
                break;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                nlVar.u(((Long) obj).longValue());
                break;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                nlVar.s(((Integer) obj).intValue());
                break;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                nlVar.m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof ji)) {
                    nlVar.A((String) obj);
                } else {
                    nlVar.q((ji) obj);
                }
                break;
            case el.a /* 9 */:
                ((a0) obj).b(nlVar);
                break;
            case el.b /* 10 */:
                a0 a0Var = (a0) obj;
                nlVar.D(((xb0) a0Var).a(null));
                a0Var.b(nlVar);
                break;
            case 11:
                if (!(obj instanceof ji)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    nlVar.D(length);
                    nlVar.n(bArr, 0, length);
                } else {
                    nlVar.q((ji) obj);
                }
                break;
            case el.c /* 12 */:
                nlVar.D(((Integer) obj).intValue());
                break;
            case 13:
                nlVar.w(((Integer) obj).intValue());
                break;
            case 14:
                nlVar.s(((Integer) obj).intValue());
                break;
            case 15:
                nlVar.u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                nlVar.D((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                nlVar.F((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        op1 op1Var = this.a;
        int size = op1Var.e.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryC = op1Var.c(i);
            if (entryC.getValue() instanceof xb0) {
                xb0 xb0Var = (xb0) entryC.getValue();
                xb0Var.getClass();
                lb1 lb1Var = lb1.c;
                lb1Var.getClass();
                lb1Var.a(xb0Var.getClass()).c(xb0Var);
                xb0Var.h();
            }
        }
        if (!op1Var.g) {
            if (op1Var.e.size() > 0) {
                op1Var.c(0).getKey().getClass();
                yc.d();
                return;
            } else {
                Iterator it = op1Var.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    yc.d();
                    return;
                }
            }
        }
        if (!op1Var.g) {
            op1Var.f = op1Var.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(op1Var.f);
            op1Var.i = op1Var.i.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(op1Var.i);
            op1Var.g = true;
        }
        this.b = true;
    }

    public final Object clone() {
        x50 x50Var = new x50();
        op1 op1Var = this.a;
        if (op1Var.e.size() > 0) {
            Map.Entry entryC = op1Var.c(0);
            if (entryC.getKey() != null) {
                yc.d();
                return null;
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = op1Var.d().iterator();
        if (!it.hasNext()) {
            return x50Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            yc.d();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x50) {
            return this.a.equals(((x50) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public x50() {
    }
}
