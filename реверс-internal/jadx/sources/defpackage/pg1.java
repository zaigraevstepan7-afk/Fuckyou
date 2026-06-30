package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class pg1 {
    public final List a;
    public final long b;
    public final aq0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public pg1(AbstractList abstractList, long j) {
        ArrayList arrayListK;
        ArrayList arrayListK2;
        char c;
        char c2;
        fu fuVar;
        fu fuVar2;
        List list;
        char c3;
        char c4;
        abstractList.getClass();
        this.a = abstractList;
        this.b = j;
        aq0 aq0VarN = hk.n();
        char c5 = 3;
        char c6 = 2;
        if (abstractList.size() <= 0 || ((v50) abstractList.get(0)).a.size() != 3) {
            arrayListK = null;
            arrayListK2 = null;
        } else {
            j41 j41VarD = ((fu) ((v50) abstractList.get(0)).a.get(1)).d(0.5f);
            fu fuVar3 = (fu) j41VarD.e;
            fu fuVar4 = (fu) j41VarD.f;
            arrayListK2 = hk.K(((v50) abstractList.get(0)).a.get(0), fuVar3);
            arrayListK = hk.K(fuVar4, ((v50) abstractList.get(0)).a.get(2));
        }
        int size = abstractList.size();
        if (size >= 0) {
            int i = 0;
            fuVar = null;
            fuVar2 = null;
            while (true) {
                if (i == 0 && arrayListK != null) {
                    list = arrayListK;
                } else if (i != this.a.size()) {
                    list = ((v50) this.a.get(i)).a;
                } else {
                    if (arrayListK2 == null) {
                        c = c5;
                        c2 = c6;
                        break;
                    }
                    list = arrayListK2;
                }
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    fu fuVar5 = (fu) list.get(i2);
                    if (fuVar5.f()) {
                        c3 = c5;
                        if (fuVar2 != null) {
                            float[] fArr = fuVar2.a;
                            c4 = c6;
                            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
                            fu fuVar6 = new fu(fArrCopyOf);
                            fArrCopyOf[6] = fuVar5.a();
                            fArrCopyOf[7] = fuVar5.b();
                            fuVar2 = fuVar6;
                        } else {
                            c4 = c6;
                        }
                    } else {
                        if (fuVar2 != null) {
                            aq0VarN.add(fuVar2);
                        }
                        c3 = c5;
                        c4 = c6;
                        if (fuVar == null) {
                            fuVar = fuVar5;
                            fuVar2 = fuVar;
                        } else {
                            fuVar2 = fuVar5;
                        }
                    }
                    i2++;
                    c5 = c3;
                    c6 = c4;
                }
                c = c5;
                c2 = c6;
                if (i == size) {
                    break;
                }
                i++;
                c5 = c;
                c6 = c2;
            }
        } else {
            c = 3;
            c2 = 2;
            fuVar = null;
            fuVar2 = null;
        }
        if (fuVar2 == null || fuVar == null) {
            aq0VarN.add(el.a(hk.D(this.b), hk.E(this.b), hk.D(this.b), hk.E(this.b), hk.D(this.b), hk.E(this.b), hk.D(this.b), hk.E(this.b)));
        } else {
            float[] fArr2 = fuVar2.a;
            float f = fArr2[0];
            float f2 = fArr2[1];
            float f3 = fArr2[c2];
            float f4 = fArr2[c];
            float f5 = fArr2[4];
            float f6 = fArr2[5];
            float[] fArr3 = fuVar.a;
            aq0VarN.add(el.a(f, f2, f3, f4, f5, f6, fArr3[0], fArr3[1]));
        }
        aq0 aq0VarK = hk.k(aq0VarN);
        this.c = aq0VarK;
        Object obj = aq0VarK.get(aq0VarK.a() - 1);
        int iA = aq0VarK.a();
        int i3 = 0;
        while (i3 < iA) {
            fu fuVar7 = (fu) this.c.get(i3);
            fu fuVar8 = (fu) obj;
            if (Math.abs(fuVar7.a[0] - fuVar8.a()) > 1.0E-4f || Math.abs(fuVar7.a[1] - fuVar8.b()) > 1.0E-4f) {
                yc.p("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
                throw null;
            }
            i3++;
            obj = fuVar7;
        }
    }

    public static float[] a(pg1 pg1Var, float[] fArr, int i) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5 = 1;
        char c6 = 4;
        float[] fArr2 = (i & 1) != 0 ? new float[4] : fArr;
        aq0 aq0Var = pg1Var.c;
        if (fArr2.length < 4) {
            yc.p("Required bounds size of 4");
            return null;
        }
        int iA = aq0Var.a();
        float fMax = Float.MIN_VALUE;
        char c7 = 0;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        int i2 = 0;
        float fMax2 = Float.MIN_VALUE;
        while (i2 < iA) {
            fu fuVar = (fu) aq0Var.get(i2);
            fuVar.getClass();
            boolean zF = fuVar.f();
            float[] fArr3 = fuVar.a;
            if (zF) {
                fArr2[c7] = fArr3[c7];
                fArr2[c5] = fArr3[c5];
                fArr2[2] = fArr3[c7];
                fArr2[3] = fArr3[c5];
                c = c5;
                c2 = c6;
                c3 = c7;
                c4 = 2;
            } else {
                c = c5;
                float fMin3 = Math.min(fArr3[c7], fuVar.a());
                c2 = c6;
                float fMin4 = Math.min(fArr3[c], fuVar.b());
                c3 = c7;
                float fMax3 = Math.max(fArr3[c7], fuVar.a());
                float fMax4 = Math.max(fArr3[c], fuVar.b());
                c4 = 2;
                fArr2[c3] = Math.min(fMin3, Math.min(fArr3[2], fArr3[c2]));
                fArr2[c] = Math.min(fMin4, Math.min(fArr3[3], fArr3[5]));
                fArr2[2] = Math.max(fMax3, Math.max(fArr3[2], fArr3[c2]));
                fArr2[3] = Math.max(fMax4, Math.max(fArr3[3], fArr3[5]));
            }
            fMin = Math.min(fMin, fArr2[c3]);
            fMin2 = Math.min(fMin2, fArr2[c]);
            fMax = Math.max(fMax, fArr2[c4]);
            fMax2 = Math.max(fMax2, fArr2[3]);
            i2++;
            c7 = c3;
            c6 = c2;
            c5 = c;
        }
        fArr2[c7] = fMin;
        fArr2[c5] = fMin2;
        fArr2[2] = fMax;
        fArr2[3] = fMax2;
        return fArr2;
    }

    public final pg1 b() {
        float[] fArrA = a(this, null, 3);
        float f = fArrA[2] - fArrA[0];
        float f2 = fArrA[3] - fArrA[1];
        float fMax = Math.max(f, f2);
        return c(new og1(((fMax - f) / 2.0f) - fArrA[0], fMax, ((fMax - f2) / 2.0f) - fArrA[1]));
    }

    public final pg1 c(d81 d81Var) {
        long j = this.b;
        long jA = d81Var.a(hk.D(j), hk.E(j));
        long jA2 = z60.a(Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & 4294967295L)));
        aq0 aq0VarN = hk.n();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aq0VarN.add(((v50) list.get(i)).a(d81Var));
        }
        return new pg1(hk.k(aq0VarN), jA2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg1)) {
            return false;
        }
        return xi0.o(this.a, ((pg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[RoundedPolygon. Cubics = ");
        sb.append(pl.h0(this.c, null, null, null, null, 63));
        sb.append(" || Features = ");
        sb.append(pl.h0(this.a, null, null, null, null, 63));
        sb.append(" || Center = (");
        long j = this.b;
        sb.append(hk.D(j));
        sb.append(", ");
        sb.append(hk.E(j));
        sb.append(")]");
        return sb.toString();
    }
}
