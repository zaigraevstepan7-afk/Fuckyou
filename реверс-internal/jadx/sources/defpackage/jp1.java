package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class jp1 implements qp, Iterable, yj0 {
    public int f;
    public int h;
    public int i;
    public boolean k;
    public int l;
    public HashMap n;
    public hx0 o;
    public int[] e = new int[0];
    public Object[] g = new Object[0];
    public final Object j = new Object();
    public ArrayList m = new ArrayList();

    public final int a(jb0 jb0Var) {
        if (this.k) {
            mp.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!jb0Var.a()) {
            e91.a("Anchor refers to a group that was removed");
        }
        return jb0Var.a;
    }

    public final void b() {
        this.n = new HashMap();
    }

    public final ip1 c() {
        if (this.k) {
            yc.l("Cannot read while a writer is pending");
            return null;
        }
        this.i++;
        return new ip1(this);
    }

    public final mp1 e() {
        if (this.k) {
            mp.a("Cannot start a writer when another writer is pending");
        }
        if (this.i > 0) {
            mp.a("Cannot start a writer when a reader is pending");
        }
        this.k = true;
        this.l++;
        return new mp1(this);
    }

    public final boolean f(jb0 jb0Var) {
        int iE;
        return jb0Var.a() && (iE = lp1.e(this.m, jb0Var.a, this.f)) >= 0 && xi0.o(this.m.get(iE), jb0Var);
    }

    public final qb0 g(int i) {
        int i2;
        ArrayList arrayList;
        int iE;
        HashMap map = this.n;
        if (map != null) {
            if (this.k) {
                mp.a("use active SlotWriter to crate an anchor for location instead");
            }
            jb0 jb0Var = (i < 0 || i >= (i2 = this.f) || (iE = lp1.e((arrayList = this.m), i, i2)) < 0) ? null : (jb0) arrayList.get(iE);
            if (jb0Var != null) {
                return (qb0) map.get(jb0Var);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zc0(this, 0, this.f);
    }
}
