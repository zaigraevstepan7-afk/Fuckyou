package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vk0 {
    public static final vk0 a;

    static {
        vk0 vk0Var = new vk0();
        if (tz.a(0.0f, 0.0f) < 0 || tz.a(0.0f, 0.0f) < 0 || tz.a(0.0f, 0.0f) < 0 || tz.a(0.0f, 0.0f) < 0) {
            mg0.a("Layer outsets must be non-negative");
        }
        a = vk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vk0) && tz.b(0.0f, 0.0f) && tz.b(0.0f, 0.0f) && tz.b(0.0f, 0.0f) && tz.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + s91.a(0.0f, s91.a(0.0f, Float.hashCode(0.0f) * 31, 31), 31);
    }

    public final String toString() {
        String strC = tz.c(0.0f);
        String strC2 = tz.c(0.0f);
        String strC3 = tz.c(0.0f);
        String strC4 = tz.c(0.0f);
        StringBuilder sbO = s91.o("LayerOutsets(left=", strC, ", top=", strC2, ", right=");
        sbO.append(strC3);
        sbO.append(", bottom=");
        sbO.append(strC4);
        sbO.append(")");
        return sbO.toString();
    }
}
