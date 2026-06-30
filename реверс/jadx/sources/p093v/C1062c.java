package p093v;

import androidx.fragment.app.AbstractC0529T;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p089t.AbstractC1048e;
import p089t.C1049f;
import p095w.AbstractC1082h;
import p095w.C1088n;

/* JADX INFO: renamed from: v.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1062c {

    /* JADX INFO: renamed from: b */
    public int f4265b;

    /* JADX INFO: renamed from: c */
    public boolean f4266c;

    /* JADX INFO: renamed from: d */
    public final C1063d f4267d;

    /* JADX INFO: renamed from: e */
    public final int f4268e;

    /* JADX INFO: renamed from: f */
    public C1062c f4269f;

    /* JADX INFO: renamed from: i */
    public C1049f f4272i;

    /* JADX INFO: renamed from: a */
    public HashSet f4264a = null;

    /* JADX INFO: renamed from: g */
    public int f4270g = 0;

    /* JADX INFO: renamed from: h */
    public int f4271h = Integer.MIN_VALUE;

    public C1062c(C1063d c1063d, int i2) {
        this.f4267d = c1063d;
        this.f4268e = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2576a(C1062c c1062c, int i2) {
        m2577b(c1062c, i2, Integer.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2577b(C1062c c1062c, int i2, int i3, boolean z2) {
        if (c1062c == null) {
            m2585j();
            return true;
        }
        if (!z2 && !m2584i(c1062c)) {
            return false;
        }
        this.f4269f = c1062c;
        if (c1062c.f4264a == null) {
            c1062c.f4264a = new HashSet();
        }
        HashSet hashSet = this.f4269f.f4264a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f4270g = i2;
        this.f4271h = i3;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m2578c(int i2, ArrayList arrayList, C1088n c1088n) {
        HashSet hashSet = this.f4264a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC1082h.m2669b(((C1062c) it.next()).f4267d, i2, arrayList, c1088n);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m2579d() {
        if (this.f4266c) {
            return this.f4265b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m2580e() {
        C1062c c1062c;
        if (this.f4267d.f4312g0 == 8) {
            return 0;
        }
        int i2 = this.f4271h;
        return (i2 == Integer.MIN_VALUE || (c1062c = this.f4269f) == null || c1062c.f4267d.f4312g0 != 8) ? this.f4270g : i2;
    }

    /* JADX INFO: renamed from: f */
    public final C1062c m2581f() {
        int i2 = this.f4268e;
        int iM2545a = AbstractC1048e.m2545a(i2);
        C1063d c1063d = this.f4267d;
        switch (iM2545a) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c1063d.f4283K;
            case 2:
                return c1063d.f4284L;
            case 3:
                return c1063d.f4281I;
            case 4:
                return c1063d.f4282J;
            default:
                throw new AssertionError(AbstractC0529T.m1419h(i2));
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2582g() {
        HashSet hashSet = this.f4264a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C1062c) it.next()).m2581f().m2583h()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2583h() {
        return this.f4269f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0063 A[RETURN] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2584i(C1062c c1062c) {
        if (c1062c != null) {
            int i2 = this.f4268e;
            C1063d c1063d = c1062c.f4267d;
            int i3 = c1062c.f4268e;
            if (i3 != i2) {
                switch (AbstractC1048e.m2545a(i2)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z2 = i3 == 2 || i3 == 4;
                        if (!(c1063d instanceof C1067h)) {
                            return z2;
                        }
                        if (z2 || i3 == 8) {
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z3 = i3 == 3 || i3 == 5;
                        if (!(c1063d instanceof C1067h)) {
                            return z3;
                        }
                        if (z3 || i3 == 9) {
                        }
                        break;
                    case 5:
                        if (i3 == 2 || i3 == 4) {
                        }
                        break;
                    case 6:
                        if (i3 == 6 || i3 == 8 || i3 == 9) {
                        }
                        break;
                    default:
                        throw new AssertionError(AbstractC0529T.m1419h(i2));
                }
            } else if (i2 != 6 || (c1063d.f4277E && this.f4267d.f4277E)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m2585j() {
        HashSet hashSet;
        C1062c c1062c = this.f4269f;
        if (c1062c != null && (hashSet = c1062c.f4264a) != null) {
            hashSet.remove(this);
            if (this.f4269f.f4264a.size() == 0) {
                this.f4269f.f4264a = null;
            }
        }
        this.f4264a = null;
        this.f4269f = null;
        this.f4270g = 0;
        this.f4271h = Integer.MIN_VALUE;
        this.f4266c = false;
        this.f4265b = 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m2586k() {
        C1049f c1049f = this.f4272i;
        if (c1049f == null) {
            this.f4272i = new C1049f(1);
        } else {
            c1049f.m2548c();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2587l(int i2) {
        this.f4265b = i2;
        this.f4266c = true;
    }

    public final String toString() {
        return this.f4267d.f4314h0 + ":" + AbstractC0529T.m1419h(this.f4268e);
    }
}
