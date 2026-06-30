package p024N;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: renamed from: N.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0266j {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f829a;

    public C0266j(DisplayCutout displayCutout) {
        this.f829a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0266j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f829a, ((C0266j) obj).f829a);
    }

    public final int hashCode() {
        return this.f829a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f829a + "}";
    }
}
