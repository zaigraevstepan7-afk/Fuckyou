package defpackage;

import androidx.startup.C0071;
import com.google.android.material.sidesheet.C0133;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sd {
    public static final sd e;
    public static final sd f;
    public static final sd g;
    public static final /* synthetic */ sd[] h;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f199short = {1858, 1870, 1871, 1863, 1864, 1862, 1735, 1759, 1741, 1750, 1755, 1740, 2354, 2350, 2356, 2351, 2341};

    static {
        sd sdVar = new sd(C0133.m1675(f199short, 0, 6, 1793), 0);
        e = sdVar;
        sd sdVar2 = new sd(C0071.m925(f199short, 6, 6, 1684), 1);
        f = sdVar2;
        sd sdVar3 = new sd(C0133.m1675(f199short, 12, 5, 2401), 2);
        g = sdVar3;
        h = new sd[]{sdVar, sdVar2, sdVar3};
    }

    public static sd valueOf(String str) {
        return (sd) Enum.valueOf(sd.class, str);
    }

    public static sd[] values() {
        return (sd[]) h.clone();
    }
}
