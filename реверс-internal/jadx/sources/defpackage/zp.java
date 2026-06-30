package defpackage;

import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class zp extends sk0 implements ha0 {
    public static final zp g;
    public static final zp h;
    public static final zp i;
    public static final zp j;
    public static final zp k;
    public static final zp l;
    public static final zp m;
    public static final zp n;
    public static final zp o;
    public static final zp p;
    public static final zp q;
    public static final zp r;
    public static final zp s;
    public final /* synthetic */ int f;

    static {
        int i2 = 0;
        g = new zp(i2, 0);
        h = new zp(i2, 1);
        i = new zp(i2, 2);
        j = new zp(i2, 3);
        k = new zp(i2, 4);
        l = new zp(i2, 5);
        m = new zp(i2, 6);
        n = new zp(i2, 7);
        o = new zp(i2, 8);
        p = new zp(i2, 9);
        q = new zp(i2, 10);
        r = new zp(i2, 11);
        s = new zp(i2, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    @Override // defpackage.ha0
    public final Object a() {
        switch (this.f) {
            case 0:
                return new yp();
            case 1:
                return null;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                aq.b("LocalTextToolbar");
                throw null;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                aq.b("LocalUriHandler");
                throw null;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                aq.b("LocalViewConfiguration");
                throw null;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                aq.b("LocalWindowInfo");
                throw null;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return Boolean.TRUE;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return Boolean.FALSE;
            case t91.BYTES_FIELD_NUMBER /* 8 */:
                return new ql0(3);
            case el.a /* 9 */:
                return new x6(new PathMeasure());
            case el.b /* 10 */:
            case 11:
                return null;
            default:
                return t32.a;
        }
    }
}
