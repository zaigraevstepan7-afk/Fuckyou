package defpackage;

import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e2 implements ha0 {
    public final /* synthetic */ int e;

    public /* synthetic */ e2(int i) {
        this.e = i;
    }

    @Override // defpackage.ha0
    public final Object a() {
        switch (this.e) {
            case 0:
                g0 g0Var = wb1.e;
                return Integer.valueOf(wb1.e.d().nextInt(2147418112) + 65536);
            case 1:
                return UUID.randomUUID().toString();
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                bq bqVar = t2.a;
                return sv.a;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                return xc.B(vi1.e);
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return new uq1(lk.f(1308617531));
            case t91.STRING_FIELD_NUMBER /* 5 */:
                ys1 ys1Var = pf.a;
                return null;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                ys1 ys1Var2 = dm.a;
                return Boolean.TRUE;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return t32.a;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                ys1 ys1Var3 = sp.a;
                return null;
            case el.a /* 9 */:
                mp.b("Unexpected call to default provider");
                throw new pn();
            case el.b /* 10 */:
                float f = s00.a;
                return Boolean.TRUE;
            case 11:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case el.c /* 12 */:
                bq bqVar2 = mf0.a;
                return vv.a;
            case 13:
                ys1 ys1Var4 = jh0.a;
                return null;
            case 14:
                ud0 ud0Var = bi0.a;
                return Boolean.TRUE;
            case 15:
                return new tz(48.0f);
            case 16:
                return new un0(0, 0);
            case 17:
                bq bqVar3 = sr0.a;
                return null;
            case 18:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 19:
                bq bqVar4 = vr0.a;
                return null;
            case 20:
                ys1 ys1Var5 = wr0.a;
                return v20.L;
            case 21:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 22:
                bq bqVar5 = yr0.a;
                return null;
            case 23:
                ys1 ys1Var6 = mu0.a;
                return Boolean.FALSE;
            case 24:
                return new ju0(dm.d(0L, 0L, 0L, 0L, -1), new f32(), new pn1(), hw0.a);
            case 25:
                return new q31();
            case 26:
                lw lwVar = qy.a;
                return fw.g;
            case 27:
                int i = b91.a;
                return Boolean.FALSE;
            case 28:
                bq bqVar6 = jf1.a;
                return xi0.y;
            default:
                return new ih1(new LinkedHashMap());
        }
    }
}
