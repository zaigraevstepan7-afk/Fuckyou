package defpackage;

import android.text.C0016;
import com.google.android.material.focus.C0119;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xg1 {
    public static final xg1 e;
    public static final xg1 f;
    public static final /* synthetic */ xg1[] g;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f220short = {500, 484, 501, 494, 503, 499, 2341, 2338, 2342, 2345, 2351, 2360, 2341, 2339, 2338};

    static {
        xg1 xg1Var = new xg1(C0119.m1508(f220short, 0, 6, 423), 0);
        e = xg1Var;
        xg1 xg1Var2 = new xg1(C0016.m217(f220short, 6, 9, 2412), 1);
        f = xg1Var2;
        g = new xg1[]{xg1Var, xg1Var2};
    }

    public static xg1 valueOf(String str) {
        return (xg1) Enum.valueOf(xg1.class, str);
    }

    public static xg1[] values() {
        return (xg1[]) g.clone();
    }
}
