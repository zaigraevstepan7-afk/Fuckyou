package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wf extends wl {
    public final long b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public wf(int i, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            m3.g();
            porterDuffColorFilter = m3.d(lk.l0(j), nu0.K(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(lk.l0(j), nu0.L(i));
        }
        super(porterDuffColorFilter);
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf)) {
            return false;
        }
        wf wfVar = (wf) obj;
        return vl.c(this.b, wfVar.b) && this.c == wfVar.c;
    }

    public final int hashCode() {
        int i = vl.h;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "BlendModeColorFilter(color=" + vl.i(this.b) + ", blendMode=" + c2.v(this.c) + ")";
    }
}
