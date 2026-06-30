package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class po0 {
    private static final /* synthetic */ z40 $ENTRIES;
    private static final /* synthetic */ po0[] $VALUES;
    public static final no0 Companion;
    public static final po0 ON_ANY;
    public static final po0 ON_CREATE;
    public static final po0 ON_DESTROY;
    public static final po0 ON_PAUSE;
    public static final po0 ON_RESUME;
    public static final po0 ON_START;
    public static final po0 ON_STOP;

    static {
        po0 po0Var = new po0("ON_CREATE", 0);
        ON_CREATE = po0Var;
        po0 po0Var2 = new po0("ON_START", 1);
        ON_START = po0Var2;
        po0 po0Var3 = new po0("ON_RESUME", 2);
        ON_RESUME = po0Var3;
        po0 po0Var4 = new po0("ON_PAUSE", 3);
        ON_PAUSE = po0Var4;
        po0 po0Var5 = new po0("ON_STOP", 4);
        ON_STOP = po0Var5;
        po0 po0Var6 = new po0("ON_DESTROY", 5);
        ON_DESTROY = po0Var6;
        po0 po0Var7 = new po0("ON_ANY", 6);
        ON_ANY = po0Var7;
        po0[] po0VarArr = {po0Var, po0Var2, po0Var3, po0Var4, po0Var5, po0Var6, po0Var7};
        $VALUES = po0VarArr;
        $ENTRIES = new a50(po0VarArr);
        Companion = new no0();
    }

    public static po0 valueOf(String str) {
        return (po0) Enum.valueOf(po0.class, str);
    }

    public static po0[] values() {
        return (po0[]) $VALUES.clone();
    }

    public final qo0 a() {
        switch (oo0.a[ordinal()]) {
            case 1:
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                return qo0.g;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
            case t91.LONG_FIELD_NUMBER /* 4 */:
                return qo0.h;
            case t91.STRING_FIELD_NUMBER /* 5 */:
                return qo0.i;
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
                return qo0.e;
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                ez1.a();
                return null;
        }
    }
}
