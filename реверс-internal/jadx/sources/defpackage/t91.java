package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class t91 extends xb0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final t91 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile x41 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        t91 t91Var = new t91();
        DEFAULT_INSTANCE = t91Var;
        xb0.j(t91.class, t91Var);
    }

    public static r91 D() {
        return (r91) ((vb0) DEFAULT_INSTANCE.c(5));
    }

    public static void l(t91 t91Var, long j) {
        t91Var.valueCase_ = 4;
        t91Var.value_ = Long.valueOf(j);
    }

    public static void m(t91 t91Var, String str) {
        t91Var.getClass();
        t91Var.valueCase_ = 5;
        t91Var.value_ = str;
    }

    public static void n(t91 t91Var, q91 q91Var) {
        t91Var.getClass();
        t91Var.value_ = q91Var;
        t91Var.valueCase_ = 6;
    }

    public static void o(t91 t91Var, double d) {
        t91Var.valueCase_ = 7;
        t91Var.value_ = Double.valueOf(d);
    }

    public static void p(t91 t91Var, ji jiVar) {
        t91Var.getClass();
        t91Var.valueCase_ = 8;
        t91Var.value_ = jiVar;
    }

    public static void q(t91 t91Var, boolean z) {
        t91Var.valueCase_ = 1;
        t91Var.value_ = Boolean.valueOf(z);
    }

    public static void r(t91 t91Var, float f) {
        t91Var.valueCase_ = 2;
        t91Var.value_ = Float.valueOf(f);
    }

    public static void s(t91 t91Var, int i) {
        t91Var.valueCase_ = 3;
        t91Var.value_ = Integer.valueOf(i);
    }

    public static t91 v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final q91 B() {
        return this.valueCase_ == 6 ? (q91) this.value_ : q91.m();
    }

    public final int C() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return 2;
            case INTEGER_FIELD_NUMBER /* 3 */:
                return 3;
            case LONG_FIELD_NUMBER /* 4 */:
                return 4;
            case STRING_FIELD_NUMBER /* 5 */:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            default:
                return 0;
        }
    }

    @Override // defpackage.xb0
    public final Object c(int i) {
        x41 wb0Var;
        switch (s91.w(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return new xb1(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", q91.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new t91();
            case LONG_FIELD_NUMBER /* 4 */:
                return new r91(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                x41 x41Var = PARSER;
                if (x41Var != null) {
                    return x41Var;
                }
                synchronized (t91.class) {
                    try {
                        wb0Var = PARSER;
                        if (wb0Var == null) {
                            wb0Var = new wb0();
                            PARSER = wb0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return wb0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final ji u() {
        return this.valueCase_ == 8 ? (ji) this.value_ : ji.g;
    }

    public final double w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float x() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
