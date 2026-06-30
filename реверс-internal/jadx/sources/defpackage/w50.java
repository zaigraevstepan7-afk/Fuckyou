package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class w50 {
    public static final List a;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        j41 j41Var = new j41(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(0.5f);
        a = hk.H(j41Var, new j41(fValueOf2, fValueOf2));
    }

    public static final long a(v50 v50Var) {
        v50Var.getClass();
        List list = v50Var.a;
        return z60.a((((fu) pl.i0(list)).a() + ((fu) pl.c0(list)).a[0]) / 2.0f, (((fu) pl.i0(list)).b() + ((fu) pl.c0(list)).a[1]) / 2.0f);
    }
}
