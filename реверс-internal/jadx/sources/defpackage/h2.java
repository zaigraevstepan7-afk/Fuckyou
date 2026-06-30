package defpackage;

import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h2 implements sa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ h2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj5;
    }

    @Override // defpackage.sa0
    public final Object i(Object obj) {
        Object objB;
        int i;
        int i2 = this.e;
        t32 t32Var = t32.a;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i2) {
            case 0:
                d2 d2Var = (d2) obj6;
                zn znVar = (zn) obj5;
                String str = (String) obj4;
                c2 c2Var = (c2) obj3;
                i2 i2Var = new i2((fy0) obj2);
                fy0 fy0Var = (fy0) i2Var.a;
                Bundle bundle = znVar.g;
                LinkedHashMap linkedHashMap = znVar.a;
                LinkedHashMap linkedHashMap2 = znVar.f;
                str.getClass();
                LinkedHashMap linkedHashMap3 = znVar.b;
                if (((Integer) linkedHashMap3.get(str)) == null) {
                    e2 e2Var = new e2(0);
                    for (Number number : new jr(new m60(e2Var, new n(26, e2Var), 1))) {
                        if (!linkedHashMap.containsKey(Integer.valueOf(number.intValue()))) {
                            int iIntValue = number.intValue();
                            linkedHashMap.put(Integer.valueOf(iIntValue), str);
                            linkedHashMap3.put(str, Integer.valueOf(iIntValue));
                        }
                    }
                    yc.h("Sequence contains no element matching the predicate.");
                    return null;
                }
                znVar.e.put(str, new f2(i2Var, c2Var));
                if (linkedHashMap2.containsKey(str)) {
                    Object obj7 = linkedHashMap2.get(str);
                    linkedHashMap2.remove(str);
                    ((sa0) fy0Var.getValue()).i(obj7);
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    objB = i1.b(str, bundle);
                } else {
                    Parcelable parcelable = bundle.getParcelable(str);
                    objB = b2.class.isInstance(parcelable) ? parcelable : null;
                }
                b2 b2Var = (b2) objB;
                if (b2Var != null) {
                    bundle.remove(str);
                    ((sa0) fy0Var.getValue()).i(c2Var.r(b2Var.f, b2Var.e));
                }
                d2Var.a = new g2(znVar, str, c2Var);
                return new j2(0, d2Var);
            case 1:
                ko0 ko0Var = (ko0) obj;
                eo0 eo0Var = ((n6) obj5).a;
                ko0Var.h = (az1) obj6;
                ko0Var.i = (df0) obj4;
                ko0Var.c = (kf) obj3;
                ko0Var.d = (sa0) obj2;
                ko0Var.e = eo0Var != null ? eo0Var.t : null;
                ko0Var.f = eo0Var != null ? eo0Var.u : null;
                ko0Var.g = eo0Var != null ? (j62) hk.o(eo0Var, aq.t) : null;
                return t32Var;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                qw0 qw0Var = (qw0) obj6;
                zc1 zc1Var = (zc1) obj5;
                wc1 wc1Var = (wc1) obj4;
                bk1 bk1Var = (bk1) obj3;
                vc1 vc1Var = (vc1) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                mw0 mw0VarG = qw0.g(qw0Var.g);
                if (mw0VarG != null) {
                    xg0 xg0Var = qw0Var.e;
                    long j = mw0VarG.b;
                    long j2 = mw0VarG.a;
                    ((q52) xg0Var.f).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((q52) xg0Var.g).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    mw0 mw0VarA = ((mw0) zc1Var.e).a(mw0VarG);
                    zc1Var.e = mw0VarA;
                    wc1Var.e = bk1Var.j(bk1Var.f(mw0VarA.a));
                    vc1Var.e = !el.j(r0 - fFloatValue);
                }
                return Boolean.valueOf(mw0VarG != null);
            default:
                z01 z01Var = (z01) obj5;
                az1 az1Var = (az1) obj4;
                jo0 jo0Var = (jo0) obj3;
                uq1 uq1Var = (uq1) obj2;
                sl0 sl0Var = (sl0) obj;
                sl0Var.a();
                ej ejVar = sl0Var.e;
                float fG = ((iu) obj6).c.g();
                if (fG != 0.0f) {
                    long j3 = az1Var.b;
                    int i3 = wz1.c;
                    int iG = z01Var.g((int) (j3 >> 32));
                    qz1 qz1VarD = jo0Var.d();
                    pc1 pc1VarC = qz1VarD != null ? qz1VarD.a.c(iG) : new pc1(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(sl0Var.y(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2.0f;
                    float f2 = pc1VarC.a + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (ejVar.d() >> 32)) - f;
                    if (f2 > fIntBitsToFloat) {
                        f2 = fIntBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(pc1VarC.b)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(pc1VarC.d)) & 4294967295L);
                    cj cjVar = ejVar.e.c;
                    p6 p6VarL = ejVar.h;
                    if (p6VarL == null) {
                        p6VarL = wi0.l();
                        p6VarL.k(1);
                        ejVar.h = p6VarL;
                    }
                    Paint paint = p6VarL.a;
                    uq1Var.a(fG, ejVar.d(), p6VarL);
                    if (!xi0.o(p6VarL.d, null)) {
                        p6VarL.g(null);
                    }
                    if (p6VarL.b != 3) {
                        p6VarL.e(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        p6VarL.j(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (p6VarL.b() == 0) {
                        i = 0;
                    } else {
                        i = 0;
                        p6VarL.h(0);
                    }
                    if (p6VarL.c() != 0) {
                        p6VarL.i(i);
                    }
                    if (!paint.isFilterBitmap()) {
                        paint.setFilterBitmap(true);
                    }
                    cjVar.m(jFloatToRawIntBits, jFloatToRawIntBits2, p6VarL);
                }
                return t32Var;
        }
    }
}
