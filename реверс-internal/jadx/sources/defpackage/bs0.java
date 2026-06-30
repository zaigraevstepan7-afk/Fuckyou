package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class bs0 {
    public final cs0 a;

    static {
        new LocaleList(new Locale[0]);
    }

    public bs0(cs0 cs0Var) {
        this.a = cs0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bs0) {
            return this.a.equals(((bs0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
