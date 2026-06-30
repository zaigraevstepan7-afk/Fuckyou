package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
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
public final class y50 {
    public static final y50 f;
    public static final y50 g;
    public static final y50[] h;
    public static final /* synthetic */ y50[] i;
    public final int e;

    /* JADX INFO: Fake field, exist only in values array */
    y50 EF0;

    static {
        nj0 nj0Var = nj0.i;
        y50 y50Var = new y50("DOUBLE", 0, 0, 1, nj0Var);
        nj0 nj0Var2 = nj0.h;
        y50 y50Var2 = new y50("FLOAT", 1, 1, 1, nj0Var2);
        nj0 nj0Var3 = nj0.g;
        y50 y50Var3 = new y50("INT64", 2, 2, 1, nj0Var3);
        y50 y50Var4 = new y50("UINT64", 3, 3, 1, nj0Var3);
        nj0 nj0Var4 = nj0.f;
        y50 y50Var5 = new y50("INT32", 4, 4, 1, nj0Var4);
        y50 y50Var6 = new y50("FIXED64", 5, 5, 1, nj0Var3);
        y50 y50Var7 = new y50("FIXED32", 6, 6, 1, nj0Var4);
        nj0 nj0Var5 = nj0.j;
        y50 y50Var8 = new y50("BOOL", 7, 7, 1, nj0Var5);
        nj0 nj0Var6 = nj0.k;
        y50 y50Var9 = new y50("STRING", 8, 8, 1, nj0Var6);
        nj0 nj0Var7 = nj0.n;
        y50 y50Var10 = new y50("MESSAGE", 9, 9, 1, nj0Var7);
        nj0 nj0Var8 = nj0.l;
        y50 y50Var11 = new y50("BYTES", 10, 10, 1, nj0Var8);
        y50 y50Var12 = new y50("UINT32", 11, 11, 1, nj0Var4);
        nj0 nj0Var9 = nj0.m;
        y50 y50Var13 = new y50("ENUM", 12, 12, 1, nj0Var9);
        y50 y50Var14 = new y50("SFIXED32", 13, 13, 1, nj0Var4);
        y50 y50Var15 = new y50("SFIXED64", 14, 14, 1, nj0Var3);
        y50 y50Var16 = new y50("SINT32", 15, 15, 1, nj0Var4);
        y50 y50Var17 = new y50("SINT64", 16, 16, 1, nj0Var3);
        y50 y50Var18 = new y50("GROUP", 17, 17, 1, nj0Var7);
        y50 y50Var19 = new y50("DOUBLE_LIST", 18, 18, 2, nj0Var);
        y50 y50Var20 = new y50("FLOAT_LIST", 19, 19, 2, nj0Var2);
        y50 y50Var21 = new y50("INT64_LIST", 20, 20, 2, nj0Var3);
        y50 y50Var22 = new y50("UINT64_LIST", 21, 21, 2, nj0Var3);
        y50 y50Var23 = new y50("INT32_LIST", 22, 22, 2, nj0Var4);
        y50 y50Var24 = new y50("FIXED64_LIST", 23, 23, 2, nj0Var3);
        y50 y50Var25 = new y50("FIXED32_LIST", 24, 24, 2, nj0Var4);
        y50 y50Var26 = new y50("BOOL_LIST", 25, 25, 2, nj0Var5);
        y50 y50Var27 = new y50("STRING_LIST", 26, 26, 2, nj0Var6);
        y50 y50Var28 = new y50("MESSAGE_LIST", 27, 27, 2, nj0Var7);
        y50 y50Var29 = new y50("BYTES_LIST", 28, 28, 2, nj0Var8);
        y50 y50Var30 = new y50("UINT32_LIST", 29, 29, 2, nj0Var4);
        y50 y50Var31 = new y50("ENUM_LIST", 30, 30, 2, nj0Var9);
        y50 y50Var32 = new y50("SFIXED32_LIST", 31, 31, 2, nj0Var4);
        y50 y50Var33 = new y50("SFIXED64_LIST", 32, 32, 2, nj0Var3);
        y50 y50Var34 = new y50("SINT32_LIST", 33, 33, 2, nj0Var4);
        y50 y50Var35 = new y50("SINT64_LIST", 34, 34, 2, nj0Var3);
        y50 y50Var36 = new y50("DOUBLE_LIST_PACKED", 35, 35, 3, nj0Var);
        f = y50Var36;
        y50 y50Var37 = new y50("FLOAT_LIST_PACKED", 36, 36, 3, nj0Var2);
        y50 y50Var38 = new y50("INT64_LIST_PACKED", 37, 37, 3, nj0Var3);
        y50 y50Var39 = new y50("UINT64_LIST_PACKED", 38, 38, 3, nj0Var3);
        y50 y50Var40 = new y50("INT32_LIST_PACKED", 39, 39, 3, nj0Var4);
        y50 y50Var41 = new y50("FIXED64_LIST_PACKED", 40, 40, 3, nj0Var3);
        y50 y50Var42 = new y50("FIXED32_LIST_PACKED", 41, 41, 3, nj0Var4);
        y50 y50Var43 = new y50("BOOL_LIST_PACKED", 42, 42, 3, nj0Var5);
        y50 y50Var44 = new y50("UINT32_LIST_PACKED", 43, 43, 3, nj0Var4);
        y50 y50Var45 = new y50("ENUM_LIST_PACKED", 44, 44, 3, nj0Var9);
        y50 y50Var46 = new y50("SFIXED32_LIST_PACKED", 45, 45, 3, nj0Var4);
        y50 y50Var47 = new y50("SFIXED64_LIST_PACKED", 46, 46, 3, nj0Var3);
        y50 y50Var48 = new y50("SINT32_LIST_PACKED", 47, 47, 3, nj0Var4);
        y50 y50Var49 = new y50("SINT64_LIST_PACKED", 48, 48, 3, nj0Var3);
        g = y50Var49;
        i = new y50[]{y50Var, y50Var2, y50Var3, y50Var4, y50Var5, y50Var6, y50Var7, y50Var8, y50Var9, y50Var10, y50Var11, y50Var12, y50Var13, y50Var14, y50Var15, y50Var16, y50Var17, y50Var18, y50Var19, y50Var20, y50Var21, y50Var22, y50Var23, y50Var24, y50Var25, y50Var26, y50Var27, y50Var28, y50Var29, y50Var30, y50Var31, y50Var32, y50Var33, y50Var34, y50Var35, y50Var36, y50Var37, y50Var38, y50Var39, y50Var40, y50Var41, y50Var42, y50Var43, y50Var44, y50Var45, y50Var46, y50Var47, y50Var48, y50Var49, new y50("GROUP_LIST", 49, 49, 2, nj0Var7), new y50("MAP", 50, 50, 4, nj0.e)};
        y50[] y50VarArrValues = values();
        h = new y50[y50VarArrValues.length];
        for (y50 y50Var50 : y50VarArrValues) {
            h[y50Var50.e] = y50Var50;
        }
    }

    public y50(String str, int i2, int i3, int i4, nj0 nj0Var) {
        this.e = i3;
        int iW = s91.w(i4);
        if (iW == 1 || iW == 3) {
            nj0Var.getClass();
        }
        if (i4 == 1) {
            nj0Var.ordinal();
        }
    }

    public static y50 valueOf(String str) {
        return (y50) Enum.valueOf(y50.class, str);
    }

    public static y50[] values() {
        return (y50[]) i.clone();
    }
}
