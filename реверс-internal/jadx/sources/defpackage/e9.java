package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e9 implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ e9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    @Override // defpackage.sa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj) {
        int i = this.e;
        t32 t32Var = t32.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                h9 h9Var = (h9) obj5;
                xa xaVar = (xa) obj4;
                sa0 sa0Var = (sa0) obj3;
                vc1 vc1Var = (vc1) obj2;
                va vaVar = (va) obj;
                kd1.E(vaVar, h9Var.c);
                v41 v41Var = vaVar.e;
                Object objC = h9Var.c(v41Var.getValue());
                if (!xi0.o(objC, v41Var.getValue())) {
                    h9Var.c.f.setValue(objC);
                    xaVar.f.setValue(objC);
                    if (sa0Var != null) {
                        sa0Var.i(h9Var);
                    }
                    vaVar.i.setValue(Boolean.FALSE);
                    vaVar.d.a();
                    vc1Var.e = true;
                } else if (sa0Var != null) {
                    sa0Var.i(h9Var);
                }
                return t32Var;
            case 1:
                jo0 jo0Var = (jo0) obj5;
                gz1 gz1Var = (gz1) obj4;
                az1 az1Var = (az1) obj3;
                df0 df0Var = (df0) obj2;
                if (jo0Var.b()) {
                    xg0 xg0Var = jo0Var.d;
                    qs qsVar = jo0Var.v;
                    qs qsVar2 = jo0Var.w;
                    zc1 zc1Var = new zc1();
                    kf kfVar = new kf(xg0Var, qsVar, zc1Var);
                    z71 z71Var = gz1Var.a;
                    z71Var.a(az1Var, df0Var, kfVar, qsVar2);
                    kz1 kz1Var = new kz1(gz1Var, z71Var);
                    gz1Var.b.set(kz1Var);
                    zc1Var.e = kz1Var;
                    jo0Var.e = kz1Var;
                }
                return new g7(1);
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                wc1 wc1Var = (wc1) obj5;
                aw awVar = (aw) obj2;
                va vaVar2 = (va) obj;
                float fFloatValue = ((Number) vaVar2.e.getValue()).floatValue() - wc1Var.e;
                float fA = ((yj1) obj4).a(fFloatValue);
                wc1Var.e = ((Number) vaVar2.e.getValue()).floatValue();
                ((wc1) obj3).e = ((Number) vaVar2.a.b.i(vaVar2.f)).floatValue();
                if (Math.abs(fFloatValue - fA) > 0.5f) {
                    vaVar2.i.setValue(Boolean.FALSE);
                    vaVar2.d.a();
                }
                awVar.getClass();
                return t32Var;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                ig0 ig0Var = (ig0) obj4;
                wc1 wc1Var2 = (wc1) obj3;
                vt vtVar = (vt) obj2;
                long jLongValue = ((Long) obj).longValue();
                ns1 ns1Var = (ns1) ((fy0) obj5).getValue();
                long jLongValue2 = ns1Var != null ? ((Number) ns1Var.getValue()).longValue() : jLongValue;
                long j = ig0Var.c;
                iy0 iy0Var = ig0Var.a;
                if (j == Long.MIN_VALUE || wc1Var2.e != kd1.l(vtVar.f())) {
                    ig0Var.c = jLongValue;
                    Object[] objArr = iy0Var.e;
                    int i2 = iy0Var.g;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((gg0) objArr[i3]).j = true;
                    }
                    wc1Var2.e = kd1.l(vtVar.f());
                }
                float f = wc1Var2.e;
                if (f == 0.0f) {
                    Object[] objArr2 = iy0Var.e;
                    int i4 = iy0Var.g;
                    for (int i5 = 0; i5 < i4; i5++) {
                        gg0 gg0Var = (gg0) objArr2[i5];
                        gg0Var.g.setValue(gg0Var.h.c);
                        gg0Var.j = true;
                    }
                } else {
                    long j2 = (long) ((jLongValue2 - ig0Var.c) / f);
                    Object[] objArr3 = iy0Var.e;
                    int i6 = iy0Var.g;
                    boolean z = true;
                    for (int i7 = 0; i7 < i6; i7++) {
                        gg0 gg0Var2 = (gg0) objArr3[i7];
                        if (!gg0Var2.i) {
                            gg0Var2.l.b.setValue(Boolean.FALSE);
                            if (gg0Var2.j) {
                                gg0Var2.j = false;
                                gg0Var2.k = j2;
                            }
                            long j3 = j2 - gg0Var2.k;
                            gg0Var2.g.setValue(gg0Var2.h.b(j3));
                            gg0Var2.i = gg0Var2.h.g(j3);
                        }
                        if (!gg0Var2.i) {
                            z = false;
                        }
                    }
                    ig0Var.d.setValue(Boolean.valueOf(!z));
                }
                return t32Var;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                bn0 bn0Var = (bn0) obj5;
                bn0Var.c = new tk0((sm0) obj4, (ku1) obj3, (x91) obj2);
                return new j2(9, bn0Var);
            default:
                wc1 wc1Var3 = (wc1) obj5;
                qw0 qw0Var = (qw0) obj4;
                zj1 zj1Var = (zj1) obj3;
                h2 h2Var = (h2) obj2;
                va vaVar3 = (va) obj;
                v41 v41Var2 = vaVar3.e;
                ha0 ha0Var = vaVar3.d;
                v41 v41Var3 = vaVar3.i;
                float fFloatValue2 = ((Number) v41Var2.getValue()).floatValue() - wc1Var3.e;
                if (el.j(fFloatValue2)) {
                    if (((Boolean) h2Var.i(Float.valueOf(wc1Var3.e))).booleanValue()) {
                        v41Var3.setValue(Boolean.FALSE);
                        ha0Var.a();
                    }
                } else if (el.j(fFloatValue2 - qw0Var.e(zj1Var, fFloatValue2))) {
                    wc1Var3.e += fFloatValue2;
                    if (((Boolean) h2Var.i(Float.valueOf(wc1Var3.e))).booleanValue()) {
                    }
                } else {
                    v41Var3.setValue(Boolean.FALSE);
                    ha0Var.a();
                }
                return t32Var;
        }
    }
}
