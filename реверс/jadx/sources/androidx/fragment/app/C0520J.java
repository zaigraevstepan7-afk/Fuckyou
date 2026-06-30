package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC0565I;
import androidx.lifecycle.C0567K;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.fragment.app.J */
/* JADX INFO: loaded from: classes.dex */
public final class C0520J extends AbstractC0565I {

    /* JADX INFO: renamed from: f */
    public final boolean f1628f;

    /* JADX INFO: renamed from: c */
    public final HashMap f1625c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f1626d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final HashMap f1627e = new HashMap();

    /* JADX INFO: renamed from: g */
    public boolean f1629g = false;

    /* JADX INFO: renamed from: h */
    public boolean f1630h = false;

    public C0520J(boolean z2) {
        this.f1628f = z2;
    }

    @Override // androidx.lifecycle.AbstractC0565I
    /* JADX INFO: renamed from: a */
    public final void mo1384a() {
        if (C0518H.m1330F(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1629g = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m1385b(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        if (C0518H.m1330F(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0548r);
        }
        m1386c(abstractComponentCallbacksC0548r.f1781e);
    }

    /* JADX INFO: renamed from: c */
    public final void m1386c(String str) {
        HashMap map = this.f1626d;
        C0520J c0520j = (C0520J) map.get(str);
        if (c0520j != null) {
            c0520j.mo1384a();
            map.remove(str);
        }
        HashMap map2 = this.f1627e;
        C0567K c0567k = (C0567K) map2.get(str);
        if (c0567k != null) {
            c0567k.m1473a();
            map2.remove(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1387d(AbstractComponentCallbacksC0548r abstractComponentCallbacksC0548r) {
        if (this.f1630h) {
            if (C0518H.m1330F(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f1625c.remove(abstractComponentCallbacksC0548r.f1781e) == null || !C0518H.m1330F(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0548r);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0520J.class == obj.getClass()) {
            C0520J c0520j = (C0520J) obj;
            if (this.f1625c.equals(c0520j.f1625c) && this.f1626d.equals(c0520j.f1626d) && this.f1627e.equals(c0520j.f1627e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1627e.hashCode() + ((this.f1626d.hashCode() + (this.f1625c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f1625c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f1626d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f1627e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
