package p024N;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: N.s0 */
/* JADX INFO: loaded from: classes.dex */
public class C0285s0 extends C0283r0 {
    public C0285s0(C0295x0 c0295x0, WindowInsets windowInsets) {
        super(c0295x0, windowInsets);
    }

    @Override // p024N.C0291v0
    /* JADX INFO: renamed from: a */
    public C0295x0 mo909a() {
        return C0295x0.m920g(null, this.f864c.consumeDisplayCutout());
    }

    @Override // p024N.C0291v0
    /* JADX INFO: renamed from: e */
    public C0266j mo910e() {
        DisplayCutout displayCutout = this.f864c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0266j(displayCutout);
    }

    @Override // p024N.AbstractC0281q0, p024N.C0291v0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0285s0)) {
            return false;
        }
        C0285s0 c0285s0 = (C0285s0) obj;
        return Objects.equals(this.f864c, c0285s0.f864c) && Objects.equals(this.f868g, c0285s0.f868g);
    }

    @Override // p024N.C0291v0
    public int hashCode() {
        return this.f864c.hashCode();
    }
}
