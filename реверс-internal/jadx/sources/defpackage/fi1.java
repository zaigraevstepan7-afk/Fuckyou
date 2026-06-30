package defpackage;

import android.content.res.Resources;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fi1 implements sa0 {
    public final /* synthetic */ int e;

    public /* synthetic */ fi1(int i) {
        this.e = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0146  */
    @Override // defpackage.sa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) {
        int iOffsetByCodePoints;
        int i = this.e;
        t32 t32Var = t32.a;
        boolean z = false;
        switch (i) {
            case 0:
                obj.getClass();
                return new u30(((Integer) obj).intValue());
            case 1:
                obj.getClass();
                return new hp0(((Integer) obj).intValue());
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                tz1 tz1Var = (xi0.o(obj2, Boolean.FALSE) || obj2 == null) ? null : (tz1) ((sa0) c2.G.c).i(obj2);
                tz1Var.getClass();
                int i2 = tz1Var.a;
                Object obj3 = list.get(1);
                Boolean bool = obj3 != null ? (Boolean) obj3 : null;
                bool.getClass();
                return new uz1(i2, bool.booleanValue());
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                obj.getClass();
                return new tz1(((Integer) obj).intValue());
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return new hj1(((Integer) obj).intValue());
            case t91.STRING_FIELD_NUMBER /* 5 */:
                s81 s81Var = (s81) obj;
                if (s81Var != null && s81Var.a == 2) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                yl1.b((am1) obj, 3);
                return t32Var;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                ck0[] ck0VarArr = yl1.a;
                ((am1) obj).a(vl1.e, t32Var);
                return t32Var;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                w01 w01Var = (w01) obj;
                long j = w01Var.a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new za(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (w01Var.a & 4294967295L))) : kl1.a;
            case el.a /* 9 */:
                za zaVar = (za) obj;
                return new w01((((long) Float.floatToRawIntBits(zaVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(zaVar.a)) << 32));
            case el.b /* 10 */:
                fi1 fi1Var = aq1.a;
                return t32Var;
            case 11:
                ck0[] ck0VarArr2 = yl1.a;
                zl1 zl1Var = vl1.m;
                ck0 ck0Var = yl1.a[5];
                ((am1) obj).a(zl1Var, Boolean.TRUE);
                return t32Var;
            case el.c /* 12 */:
                return t32Var;
            case 13:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 14:
                ((Integer) obj).getClass();
                return jx1.a;
            case 15:
                ey1 ey1Var = (ey1) obj;
                String str = ey1Var.g.f;
                long j2 = ey1Var.f;
                int i3 = wz1.c;
                int i4 = (int) (j2 & 4294967295L);
                if (i4 > 0) {
                    g30 g30VarO = qc1.o();
                    if (g30VarO == null) {
                        iOffsetByCodePoints = i4 <= 0 ? -1 : Character.offsetByCodePoints(str, i4, -1);
                    } else {
                        int iB = g30VarO.b(str, i4 - 1);
                        if (iB >= 0) {
                            iOffsetByCodePoints = iB;
                        } else if (i4 > 0) {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str, i4, -1);
                        }
                    }
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new ex(((int) (ey1Var.f & 4294967295L)) - iOffsetByCodePoints, 0);
            case 16:
                ey1 ey1Var2 = (ey1) obj;
                String str2 = ey1Var2.g.f;
                long j3 = ey1Var2.f;
                int i5 = wz1.c;
                int iL = qc1.l(str2, (int) (j3 & 4294967295L));
                if (iL != -1) {
                    return new ex(0, iL - ((int) (ey1Var2.f & 4294967295L)));
                }
                return null;
            case 17:
                ey1 ey1Var3 = (ey1) obj;
                Integer numE = ey1Var3.e();
                if (numE == null) {
                    return null;
                }
                int iIntValue = numE.intValue();
                long j4 = ey1Var3.f;
                int i6 = wz1.c;
                return new ex(((int) (j4 & 4294967295L)) - iIntValue, 0);
            case 18:
                ey1 ey1Var4 = (ey1) obj;
                Integer numD = ey1Var4.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue2 = numD.intValue();
                long j5 = ey1Var4.f;
                int i7 = wz1.c;
                return new ex(0, iIntValue2 - ((int) (j5 & 4294967295L)));
            case 19:
                ey1 ey1Var5 = (ey1) obj;
                Integer numC = ey1Var5.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue3 = numC.intValue();
                long j6 = ey1Var5.f;
                int i8 = wz1.c;
                return new ex(((int) (j6 & 4294967295L)) - iIntValue3, 0);
            case 20:
                ey1 ey1Var6 = (ey1) obj;
                Integer numB = ey1Var6.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j7 = ey1Var6.f;
                int i9 = wz1.c;
                return new ex(0, iIntValue4 - ((int) (j7 & 4294967295L)));
            case 21:
                List list2 = (List) obj;
                Object obj4 = list2.get(1);
                obj4.getClass();
                k31 k31Var = ((Boolean) obj4).booleanValue() ? k31.e : k31.f;
                Object obj5 = list2.get(0);
                obj5.getClass();
                return new ky1(k31Var, ((Float) obj5).floatValue());
            case 22:
                return new ya(((Float) obj).floatValue());
            case 23:
                return new ya(((Integer) obj).intValue());
            case 24:
                return Integer.valueOf((int) ((ya) obj).a);
            case 25:
                return new ya(((tz) obj).e);
            case 26:
                return new tz(((ya) obj).a);
            case 27:
                vz vzVar = (vz) obj;
                return new za(vz.a(vzVar.a), vz.b(vzVar.a));
            case 28:
                za zaVar2 = (za) obj;
                return new vz((((long) Float.floatToRawIntBits(zaVar2.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(zaVar2.a)) << 32));
            default:
                io1 io1Var = (io1) obj;
                return new za(Float.intBitsToFloat((int) (io1Var.a >> 32)), Float.intBitsToFloat((int) (io1Var.a & 4294967295L)));
        }
    }
}
