package defpackage;

import android.app.C0000;
import android.view.C0022;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vi1 {
    public static final vi1 e;
    public static final vi1 f;
    public static final /* synthetic */ vi1[] g;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f212short = {2796, 2784, 2792, 2799, 1874, 1886, 1887, 1879, 1880, 1878, 1858};

    static {
        vi1 vi1Var = new vi1(C0022.m297(f212short, 0, 4, 2721), 0);
        e = vi1Var;
        vi1 vi1Var2 = new vi1(C0000.m7(f212short, 4, 7, 1809), 1);
        f = vi1Var2;
        g = new vi1[]{vi1Var, vi1Var2};
    }

    public static vi1 valueOf(String str) {
        return (vi1) Enum.valueOf(vi1.class, str);
    }

    public static vi1[] values() {
        return (vi1[]) g.clone();
    }
}
