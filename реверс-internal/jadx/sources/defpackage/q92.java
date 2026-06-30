package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class q92 {
    public static final m92 g;
    public static final n92 h;
    public static final o92 i;
    public static final /* synthetic */ q92[] j;
    public final r92 e;
    public final int f;

    /* JADX INFO: Fake field, exist only in values array */
    q92 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    q92 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    q92 EF2;

    static {
        q92 q92Var = new q92("DOUBLE", 0, r92.h, 1);
        q92 q92Var2 = new q92("FLOAT", 1, r92.g, 5);
        r92 r92Var = r92.f;
        q92 q92Var3 = new q92("INT64", 2, r92Var, 0);
        q92 q92Var4 = new q92("UINT64", 3, r92Var, 0);
        r92 r92Var2 = r92.e;
        q92 q92Var5 = new q92("INT32", 4, r92Var2, 0);
        q92 q92Var6 = new q92("FIXED64", 5, r92Var, 1);
        q92 q92Var7 = new q92("FIXED32", 6, r92Var2, 5);
        q92 q92Var8 = new q92("BOOL", 7, r92.i, 0);
        m92 m92Var = new m92("STRING", 8, r92.j, 2);
        g = m92Var;
        r92 r92Var3 = r92.m;
        n92 n92Var = new n92("GROUP", 9, r92Var3, 3);
        h = n92Var;
        o92 o92Var = new o92("MESSAGE", 10, r92Var3, 2);
        i = o92Var;
        j = new q92[]{q92Var, q92Var2, q92Var3, q92Var4, q92Var5, q92Var6, q92Var7, q92Var8, m92Var, n92Var, o92Var, new p92("BYTES", 11, r92.k, 2), new q92("UINT32", 12, r92Var2, 0), new q92("ENUM", 13, r92.l, 0), new q92("SFIXED32", 14, r92Var2, 5), new q92("SFIXED64", 15, r92Var, 1), new q92("SINT32", 16, r92Var2, 0), new q92("SINT64", 17, r92Var, 0)};
    }

    public q92(String str, int i2, r92 r92Var, int i3) {
        this.e = r92Var;
        this.f = i3;
    }

    public static q92 valueOf(String str) {
        return (q92) Enum.valueOf(q92.class, str);
    }

    public static q92[] values() {
        return (q92[]) j.clone();
    }
}
