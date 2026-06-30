package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class z62 {
    public static final Map a;

    static {
        Float fValueOf = Float.valueOf(1.0f);
        j41 j41Var = new j41(c2.Q, fValueOf);
        j41 j41Var2 = new j41(c2.W, fValueOf);
        j41 j41Var3 = new j41(c2.V, fValueOf);
        j41 j41Var4 = new j41(c2.P, Float.valueOf(0.01f));
        j41 j41Var5 = new j41(c2.X, fValueOf);
        j41 j41Var6 = new j41(c2.T, fValueOf);
        j41 j41Var7 = new j41(c2.U, fValueOf);
        r22 r22Var = c2.R;
        Float fValueOf2 = Float.valueOf(0.4f);
        j41[] j41VarArr = {j41Var, j41Var2, j41Var3, j41Var4, j41Var5, j41Var6, j41Var7, new j41(r22Var, fValueOf2), new j41(c2.S, fValueOf2)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(bl.I(9));
        for (int i = 0; i < 9; i++) {
            j41 j41Var8 = j41VarArr[i];
            linkedHashMap.put(j41Var8.e, j41Var8.f);
        }
        a = linkedHashMap;
    }
}
