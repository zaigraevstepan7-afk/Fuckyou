package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class f82 extends e82 {
    public f82(p82 p82Var, WindowInsets windowInsets) {
        super(p82Var, windowInsets);
    }

    @Override // defpackage.m82
    public p82 a() {
        return p82.c(this.c.consumeDisplayCutout(), null);
    }

    @Override // defpackage.d82, defpackage.m82
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f82)) {
            return false;
        }
        f82 f82Var = (f82) obj;
        return Objects.equals(this.c, f82Var.c) && Objects.equals(this.g, f82Var.g) && d82.L(this.h, f82Var.h);
    }

    @Override // defpackage.m82
    public sy g() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new sy(displayCutout);
    }

    @Override // defpackage.m82
    public int hashCode() {
        return this.c.hashCode();
    }
}
