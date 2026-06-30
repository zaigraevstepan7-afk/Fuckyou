package p007E;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: renamed from: E.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0067m {

    /* JADX INFO: renamed from: a */
    public final Resources f211a;

    /* JADX INFO: renamed from: b */
    public final Resources.Theme f212b;

    public C0067m(Resources resources, Resources.Theme theme) {
        this.f211a = resources;
        this.f212b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0067m.class == obj.getClass()) {
            C0067m c0067m = (C0067m) obj;
            if (this.f211a.equals(c0067m.f211a) && Objects.equals(this.f212b, c0067m.f212b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f211a, this.f212b);
    }
}
