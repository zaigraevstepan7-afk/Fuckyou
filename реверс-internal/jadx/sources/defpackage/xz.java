package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xz {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xz) && tz.b(10.0f, 10.0f) && tz.b(40.0f, 40.0f) && tz.b(10.0f, 10.0f) && tz.b(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + s91.a(40.0f, s91.a(10.0f, s91.a(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strC = tz.c(10.0f);
        String strC2 = tz.c(40.0f);
        String strC3 = tz.c(10.0f);
        String strC4 = tz.c(40.0f);
        StringBuilder sbO = s91.o("DpTouchBoundsExpansion(start=", strC, ", top=", strC2, ", end=");
        sbO.append(strC3);
        sbO.append(", bottom=");
        sbO.append(strC4);
        sbO.append(", isLayoutDirectionAware=true)");
        return sbO.toString();
    }
}
