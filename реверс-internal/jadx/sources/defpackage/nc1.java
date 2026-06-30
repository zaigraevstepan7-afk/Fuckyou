package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class nc1 implements th1 {
    public final LinkedHashSet a = new LinkedHashSet();

    public nc1(n81 n81Var) {
        n81Var.n("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.th1
    public final Bundle a() {
        Bundle bundleJ = s22.j((j41[]) Arrays.copyOf(new j41[0], 0));
        List listO0 = pl.o0(this.a);
        bundleJ.putStringArrayList("classes_to_restore", listO0 instanceof ArrayList ? (ArrayList) listO0 : new ArrayList<>(listO0));
        return bundleJ;
    }
}
