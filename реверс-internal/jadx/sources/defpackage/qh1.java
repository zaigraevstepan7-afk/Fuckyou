package defpackage;

import android.os.Bundle;
import com.reddit.frontpage.MainActivity;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class qh1 implements th1 {
    public final n81 a;
    public boolean b;
    public Bundle c;
    public final jv1 d;

    public qh1(n81 n81Var, MainActivity mainActivity) {
        n81Var.getClass();
        this.a = n81Var;
        this.d = new jv1(new rn(mainActivity, 5));
    }

    @Override // defpackage.th1
    public final Bundle a() {
        Bundle bundleJ = s22.j((j41[]) Arrays.copyOf(new j41[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleJ.putAll(bundle);
        }
        for (Map.Entry entry : ((rh1) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((un) ((oh1) entry.getValue()).a.e).a();
            if (!bundleA.isEmpty()) {
                str.getClass();
                bundleJ.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleJ;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleH = this.a.h("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleJ = s22.j((j41[]) Arrays.copyOf(new j41[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleJ.putAll(bundle);
        }
        if (bundleH != null) {
            bundleJ.putAll(bundleH);
        }
        this.c = bundleJ;
        this.b = true;
    }
}
