package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class rl0 {
    public final h3 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public h3 h;
    public final /* synthetic */ int j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public rl0(h3 h3Var, int i) {
        this.j = i;
        this.a = h3Var;
    }

    public static final void a(rl0 rl0Var, c3 c3Var, int i, c01 c01Var) {
        HashMap map = rl0Var.i;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jM = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (rl0Var.j) {
                    case 0:
                        v31 v31Var = c01Var.T;
                        if (v31Var != null) {
                            qc0 qc0Var = (qc0) v31Var;
                            float[] fArrB = qc0Var.b();
                            if (!qc0Var.w) {
                                jM = ou0.b(jM, fArrB);
                            }
                        }
                        jM = hk.M(jM, c01Var.H);
                        break;
                    default:
                        ys0 ys0VarU0 = c01Var.U0();
                        ys0VarU0.getClass();
                        long j = ys0VarU0.x;
                        jM = w01.e((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jM);
                        break;
                }
                c01Var = c01Var.y;
                c01Var.getClass();
                if (c01Var.equals(rl0Var.a.n())) {
                    int iRound = Math.round(c3Var instanceof ud0 ? Float.intBitsToFloat((int) (jM & 4294967295L)) : Float.intBitsToFloat((int) (jM >> 32)));
                    if (map.containsKey(c3Var)) {
                        map.getClass();
                        Object obj = map.get(c3Var);
                        if (obj == null && !map.containsKey(c3Var)) {
                            throw new NoSuchElementException("Key " + c3Var + " is missing in the map.");
                        }
                        int iIntValue = ((Number) obj).intValue();
                        ud0 ud0Var = f3.a;
                        iRound = ((Number) c3Var.a.h(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(c3Var, Integer.valueOf(iRound));
                    return;
                }
            } while (!rl0Var.b(c01Var).containsKey(c3Var));
            float fC = rl0Var.c(c01Var, c3Var);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(c01 c01Var) {
        switch (this.j) {
            case 0:
                return c01Var.D0().a();
            default:
                ys0 ys0VarU0 = c01Var.U0();
                ys0VarU0.getClass();
                return ys0VarU0.D0().a();
        }
    }

    public final int c(c01 c01Var, c3 c3Var) {
        switch (this.j) {
            case 0:
                return c01Var.b0(c3Var);
            default:
                ys0 ys0VarU0 = c01Var.U0();
                ys0VarU0.getClass();
                return ys0VarU0.b0(c3Var);
        }
    }

    public final boolean d() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean e() {
        h();
        return this.h != null;
    }

    public final void f() {
        this.b = true;
        h3 h3Var = this.a;
        h3 h3VarO = h3Var.o();
        if (h3VarO == null) {
            return;
        }
        if (this.c) {
            h3VarO.R();
        } else if (this.e || this.d) {
            h3VarO.requestLayout();
        }
        if (this.f) {
            h3Var.R();
        }
        if (this.g) {
            h3Var.requestLayout();
        }
        h3VarO.a().f();
    }

    public final void g() {
        HashMap map = this.i;
        map.clear();
        g3 g3Var = new g3(0, this);
        h3 h3Var = this.a;
        h3Var.k(g3Var);
        map.putAll(b(h3Var.n()));
        this.b = false;
    }

    public final void h() {
        rl0 rl0VarA;
        rl0 rl0VarA2;
        boolean zD = d();
        h3 h3Var = this.a;
        if (!zD) {
            h3 h3VarO = h3Var.o();
            if (h3VarO == null) {
                return;
            }
            h3Var = h3VarO.a().h;
            if (h3Var == null || !h3Var.a().d()) {
                h3 h3Var2 = this.h;
                if (h3Var2 == null || h3Var2.a().d()) {
                    return;
                }
                h3 h3VarO2 = h3Var2.o();
                if (h3VarO2 != null && (rl0VarA2 = h3VarO2.a()) != null) {
                    rl0VarA2.h();
                }
                h3 h3VarO3 = h3Var2.o();
                h3Var = (h3VarO3 == null || (rl0VarA = h3VarO3.a()) == null) ? null : rl0VarA.h;
            }
        }
        this.h = h3Var;
    }
}
