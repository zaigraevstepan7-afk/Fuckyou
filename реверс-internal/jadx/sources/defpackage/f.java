package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f extends hb0 implements sa0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.l = i4;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        Object[] objArr;
        Object[] objArr2;
        int i;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        int i2 = this.l;
        int i3 = 2;
        int i4 = 0;
        int i5 = 1;
        ks ksVar = null;
        t32 t32Var = t32.a;
        Object obj2 = this.f;
        switch (i2) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                m mVar = (m) obj2;
                lx0 lx0Var = mVar.I;
                if (!zBooleanValue) {
                    if (mVar.u != null) {
                        Object[] objArr3 = lx0Var.c;
                        long[] jArr = lx0Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j = jArr[i6];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8;
                                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                                    int i9 = 0;
                                    while (i9 < i8) {
                                        if ((j & 255) < 128) {
                                            i = i7;
                                            objArr2 = objArr3;
                                            nu0.A(mVar.z0(), null, null, new k(mVar, (oa1) objArr3[(i6 << 3) + i9], ksVar, i4), 3);
                                        } else {
                                            objArr2 = objArr3;
                                            i = i7;
                                        }
                                        j >>= i;
                                        i9++;
                                        i7 = i;
                                        objArr3 = objArr2;
                                    }
                                    objArr = objArr3;
                                    if (i8 == i7) {
                                    }
                                } else {
                                    objArr = objArr3;
                                }
                                if (i6 != length) {
                                    i6++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                        oa1 oa1Var = mVar.K;
                        if (oa1Var != null) {
                            nu0.A(mVar.z0(), null, null, new k(mVar, oa1Var, ksVar, 1), 3);
                        }
                    }
                    lx0Var.a();
                    mVar.K = null;
                    mVar.X0();
                } else {
                    mVar.W0();
                }
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                lr0 lr0Var = (lr0) obj2;
                lr0Var.getClass();
                qs1 qs1Var = lr0Var.e;
                do {
                    value = qs1Var.getValue();
                } while (!qs1Var.h(value, l32.a((l32) value, str, false, false, 0.0f, false, 61)));
                nu0.A(u4.i(lr0Var), null, null, new e(lr0Var, str, ksVar, 20), 3);
                break;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                iq iqVar = (iq) obj;
                iqVar.getClass();
                lr0 lr0Var2 = (lr0) obj2;
                lr0Var2.getClass();
                nu0.A(u4.i(lr0Var2), null, null, new er0(lr0Var2, iqVar, ksVar, i4), 3);
                break;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                iq iqVar2 = (iq) obj;
                iqVar2.getClass();
                lr0 lr0Var3 = (lr0) obj2;
                lr0Var3.getClass();
                qs1 qs1Var2 = lr0Var3.q;
                Object value5 = qs1Var2.getValue();
                String str2 = iqVar2.b;
                if (!xi0.o(value5, str2)) {
                    qs1Var2.k(null, str2);
                    lr0Var3.i();
                    nu0.A(u4.i(lr0Var3), null, null, new er0(lr0Var3, iqVar2, ksVar, i5), 3);
                } else {
                    lr0Var3.i();
                    qs1Var2.j(null);
                }
                break;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                lr0 lr0Var4 = (lr0) obj2;
                qs1 qs1Var3 = lr0Var4.e;
                do {
                    value2 = qs1Var3.getValue();
                } while (!qs1Var3.h(value2, l32.a((l32) value2, null, zBooleanValue2, false, 0.0f, false, 59)));
                nu0.A(u4.i(lr0Var4), null, null, new gr0(lr0Var4, zBooleanValue2, ksVar, i4), 3);
                break;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                lr0 lr0Var5 = (lr0) obj2;
                qs1 qs1Var4 = lr0Var5.e;
                do {
                    value3 = qs1Var4.getValue();
                } while (!qs1Var4.h(value3, l32.a((l32) value3, null, false, zBooleanValue3, 0.0f, false, 55)));
                nu0.A(u4.i(lr0Var5), null, null, new gr0(lr0Var5, zBooleanValue3, ksVar, i5), 3);
                break;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                float fFloatValue = ((Number) obj).floatValue();
                lr0 lr0Var6 = (lr0) obj2;
                qs1 qs1Var5 = lr0Var6.e;
                do {
                    value4 = qs1Var5.getValue();
                } while (!qs1Var5.h(value4, l32.a((l32) value4, null, false, false, fFloatValue, false, 47)));
                nu0.A(u4.i(lr0Var6), null, null, new af(lr0Var6, fFloatValue, ksVar, i3), 3);
                break;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                int iIntValue = ((Number) obj).intValue();
                lr0 lr0Var7 = (lr0) obj2;
                if (iIntValue < 0) {
                    lr0Var7.getClass();
                } else if (iIntValue < lr0Var7.i.a()) {
                    qs1 qs1Var6 = lr0Var7.j;
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    qs1Var6.getClass();
                    qs1Var6.k(null, numValueOf);
                }
                break;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                Uri uri = (Uri) obj;
                uri.getClass();
                lr0 lr0Var8 = (lr0) obj2;
                lr0Var8.getClass();
                nu0.A(u4.i(lr0Var8), null, null, new g(lr0Var8, uri, ksVar, 10), 3);
                break;
            case el.a /* 9 */:
                h20 h20Var = (h20) obj;
                h20Var.getClass();
                break;
            case el.b /* 10 */:
                h20 h20Var2 = (h20) obj;
                h20Var2.getClass();
                break;
            case 11:
                h20 h20Var3 = (h20) obj;
                h20Var3.getClass();
                break;
            case el.c /* 12 */:
                h20 h20Var4 = (h20) obj;
                h20Var4.getClass();
                break;
            case 13:
                h20 h20Var5 = (h20) obj;
                h20Var5.getClass();
                break;
            case 14:
                h20 h20Var6 = (h20) obj;
                h20Var6.getClass();
                break;
            case 15:
                h20 h20Var7 = (h20) obj;
                h20Var7.getClass();
                break;
            case 16:
                h20 h20Var8 = (h20) obj;
                h20Var8.getClass();
                break;
            case 17:
                h20 h20Var9 = (h20) obj;
                h20Var9.getClass();
                break;
            case 18:
                h20 h20Var10 = (h20) obj;
                h20Var10.getClass();
                break;
            case 19:
                h20 h20Var11 = (h20) obj;
                h20Var11.getClass();
                break;
            case 20:
                h20 h20Var12 = (h20) obj;
                h20Var12.getClass();
                break;
            case 21:
                h20 h20Var13 = (h20) obj;
                h20Var13.getClass();
                break;
            case 22:
                h20 h20Var14 = (h20) obj;
                h20Var14.getClass();
                break;
            case 23:
                h20 h20Var15 = (h20) obj;
                h20Var15.getClass();
                break;
            case 24:
                h20 h20Var16 = (h20) obj;
                h20Var16.getClass();
                break;
            case 25:
                h20 h20Var17 = (h20) obj;
                h20Var17.getClass();
                break;
            case 26:
                h20 h20Var18 = (h20) obj;
                h20Var18.getClass();
                break;
            case 27:
                ((rj0) obj2).s((Throwable) obj);
                break;
            default:
                long j2 = ((w01) obj).a;
                pw1 pw1Var = (pw1) obj2;
                pw1Var.getClass();
                tw1 tw1Var = (tw1) hk.o(pw1Var, uw1.a);
                if (tw1Var != null) {
                    nu0.A(pw1Var.z0(), null, null, new h(pw1Var, j2, tw1Var, new ow1(pw1Var, j2), (ks) null), 3);
                }
                break;
        }
        return t32Var;
    }
}
