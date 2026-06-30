package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f8 implements ha0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ f8(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018e  */
    @Override // defpackage.ha0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() throws PendingIntent.CanceledException {
        List listL0;
        long j;
        qz1 qz1VarD;
        jo0 jo0Var;
        hb hbVar;
        int i = this.e;
        t01 t01Var = null;
        Object[] objArr = 0;
        t32 t32Var = t32.a;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ((zc1) obj2).e = ((ha0) obj).a();
                return t32Var;
            case 1:
                ((mj) obj2).t((tz) obj);
                return t32Var;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                ((ro) obj2).c = (ha0) obj;
                return t32Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                we weVar = (we) obj2;
                sl0 sl0Var = (sl0) obj;
                weVar.y = weVar.t.a(sl0Var.e.d(), sl0Var.getLayoutDirection(), sl0Var);
                return t32Var;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                az1 az1Var = (az1) obj2;
                fy0 fy0Var = (fy0) obj;
                if (!wz1.b(az1Var.b, ((az1) fy0Var.getValue()).b) || !xi0.o(az1Var.c, ((az1) fy0Var.getValue()).c)) {
                    fy0Var.setValue(az1Var);
                }
                return t32Var;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ob0 ob0Var = ((rp) obj2).e;
                jp1 jp1Var = ob0Var.c;
                ip1 ip1VarC = jp1Var.c();
                int i2 = 0;
                while (i2 < jp1Var.f) {
                    try {
                        if (ip1VarC.l(i2)) {
                            Object objN = ip1VarC.n(i2);
                            if (objN != obj) {
                                sb0 sb0Var = objN instanceof sb0 ? (sb0) objN : null;
                                if ((sb0Var != null ? sb0Var.a : null) == obj) {
                                }
                            }
                            t01 t01Var2 = new t01(i2, null);
                            ip1VarC.c();
                            t01Var = t01Var2;
                            if (t01Var != null) {
                                int i3 = t01Var.a;
                                Integer num = t01Var.b;
                                ip1 ip1VarC2 = jp1Var.c();
                                try {
                                    ArrayList arrayListU = al.U(ip1VarC2, i3, num);
                                    ip1VarC2.c();
                                    listL0 = pl.l0(arrayListU, ob0Var.D());
                                } finally {
                                }
                            } else {
                                listL0 = f40.e;
                            }
                            return new ap(listL0, ob0Var.C);
                        }
                        int[] iArr = ip1VarC.b;
                        int i4 = i2 + 1;
                        int iB = (i4 < ip1VarC.c ? iArr[(i4 * 5) + 4] : ip1VarC.e) - lp1.b(iArr, i2);
                        for (int i5 = 0; i5 < iB; i5++) {
                            Object objH = ip1VarC.h(i2, i5);
                            if (objH != obj) {
                                sb0 sb0Var2 = objH instanceof sb0 ? (sb0) objH : null;
                                if ((sb0Var2 != null ? sb0Var2.a : null) != obj) {
                                }
                            }
                            t01Var = new t01(i2, Integer.valueOf(i5));
                            if (t01Var != null) {
                            }
                            return new ap(listL0, ob0Var.C);
                        }
                        i2 = i4;
                    } finally {
                    }
                }
                if (t01Var != null) {
                }
                return new ap(listL0, ob0Var.C);
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                ((nt0) obj2).w(((rd) obj).f.toArray(new String[0]));
                return t32Var;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return new oh0(hk.S(((lw1) obj2).g((zk0) ((ha0) obj).a())));
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                ((rw1) obj2).d.i((ww1) obj);
                return t32Var;
            case el.a /* 9 */:
                ((zc1) obj2).e = hk.o((z80) obj, u61.a);
                return t32Var;
            case el.b /* 10 */:
                return new xn0((jh1) obj2, g40.e, (ih1) obj);
            case 11:
                ec1 ec1Var = (ec1) obj;
                if (((xd) ((oc) obj2).a).get() == 0) {
                    ec1Var.a();
                }
                return t32Var;
            case el.c /* 12 */:
                ay0 ay0Var = (ay0) obj2;
                tp tpVar = (tp) obj;
                Object[] objArr2 = ay0Var.b;
                long[] jArr = ay0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j2 = jArr[i6];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((255 & j2) < 128) {
                                    tpVar.A(objArr2[(i6 << 3) + i8]);
                                }
                                j2 >>= 8;
                            }
                            if (i7 == 8) {
                                if (i6 != length) {
                                    i6++;
                                }
                            }
                        }
                    }
                }
                return t32Var;
            case 13:
                ((sa0) obj2).i(ct1.X((String) ((fy0) obj).getValue()).toString());
                return t32Var;
            case 14:
                ((sa0) obj2).i(Float.valueOf(((r41) obj).g()));
                return t32Var;
            case 15:
                Context context = (Context) obj2;
                TextClassification textClassification = (TextClassification) obj;
                String text = textClassification.getText();
                af1.A(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
                return t32Var;
            case 16:
                nu0.A((vt) obj2, null, yt.h, new tv(obj, (ks) (objArr == true ? 1 : 0), 14), 1);
                return t32Var;
            default:
                ry1 ry1Var = (ry1) obj2;
                long j3 = ((vh0) ((fy0) obj).getValue()).a;
                w01 w01VarI = ry1Var.i();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (w01VarI != null) {
                    long j4 = w01VarI.a;
                    hb hbVarM = ry1Var.m();
                    if (hbVarM != null && hbVarM.f.length() != 0) {
                        ad0 ad0Var = (ad0) ry1Var.q.getValue();
                        int i9 = ad0Var == null ? -1 : ty1.a[ad0Var.ordinal()];
                        if (i9 != -1) {
                            if (i9 == 1 || i9 == 2) {
                                long j5 = ry1Var.n().b;
                                int i10 = wz1.c;
                                j = j5 >> 32;
                            } else {
                                if (i9 != 3) {
                                    ez1.a();
                                    return null;
                                }
                                long j6 = ry1Var.n().b;
                                int i11 = wz1.c;
                                j = j6 & 4294967295L;
                            }
                            int i12 = (int) j;
                            jo0 jo0Var2 = ry1Var.d;
                            if (jo0Var2 != null && (qz1VarD = jo0Var2.d()) != null && (jo0Var = ry1Var.d) != null && (hbVar = jo0Var.a.a) != null) {
                                int iA = lk.A(ry1Var.b.g(i12), 0, hbVar.f.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (qz1VarD.d(j4) >> 32));
                                pz1 pz1Var = qz1VarD.a;
                                vw0 vw0Var = pz1Var.b;
                                int iD = vw0Var.d(iA);
                                float fD = pz1Var.d(iD);
                                float fE = pz1Var.e(iD);
                                float fZ = lk.z(fIntBitsToFloat, Math.min(fD, fE), Math.max(fD, fE));
                                if (vh0.a(j3, 0L) || Math.abs(fIntBitsToFloat - fZ) <= ((int) (j3 >> 32)) / 2) {
                                    float f = vw0Var.f(iD);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fZ)) << 32) | (((long) Float.floatToRawIntBits(((vw0Var.b(iD) - f) / 2.0f) + f)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new w01(jFloatToRawIntBits);
        }
    }
}
