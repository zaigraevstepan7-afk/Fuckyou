package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class sy {
    public final DisplayCutout a;

    public sy(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final eh0 a() {
        return Build.VERSION.SDK_INT >= 30 ? eh0.c(h1.c(this.a)) : eh0.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sy.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((sy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
