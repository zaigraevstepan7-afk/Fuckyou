package p073k0;

import android.view.View;
import androidx.fragment.app.AbstractC0529T;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: k0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0857u {

    /* JADX INFO: renamed from: b */
    public final View f3490b;

    /* JADX INFO: renamed from: a */
    public final HashMap f3489a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList f3491c = new ArrayList();

    public C0857u(View view) {
        this.f3490b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0857u)) {
            return false;
        }
        C0857u c0857u = (C0857u) obj;
        return this.f3490b == c0857u.f3490b && this.f3489a.equals(c0857u.f3489a);
    }

    public final int hashCode() {
        return this.f3489a.hashCode() + (this.f3490b.hashCode() * 31);
    }

    public final String toString() {
        String strM1417f = AbstractC0529T.m1417f(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f3490b + "\n", "    values:");
        HashMap map = this.f3489a;
        for (String str : map.keySet()) {
            strM1417f = strM1417f + "    " + str + ": " + map.get(str) + "\n";
        }
        return strM1417f;
    }
}
