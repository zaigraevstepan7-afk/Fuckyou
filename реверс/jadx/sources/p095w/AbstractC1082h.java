package p095w;

import java.util.ArrayList;
import java.util.HashSet;
import p093v.AbstractC1068i;
import p093v.C1062c;
import p093v.C1063d;
import p093v.C1064e;
import p093v.C1067h;
import p099y.C1103f;

/* JADX INFO: renamed from: w.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1082h {

    /* JADX INFO: renamed from: a */
    public static final C1076b f4467a = new C1076b();

    /* JADX INFO: renamed from: a */
    public static boolean m2668a(C1063d c1063d) {
        int[] iArr = c1063d.f4330p0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        C1063d c1063d2 = c1063d.f4292T;
        C1064e c1064e = c1063d2 != null ? (C1064e) c1063d2 : null;
        if (c1064e != null) {
            int i4 = c1064e.f4330p0[0];
        }
        if (c1064e != null) {
            int i5 = c1064e.f4330p0[1];
        }
        boolean z2 = i2 == 1 || c1063d.mo2570A() || i2 == 2 || (i2 == 3 && c1063d.f4332r == 0 && c1063d.f4295W == 0.0f && c1063d.m2620t(0)) || (i2 == 3 && c1063d.f4332r == 1 && c1063d.m2621u(0, c1063d.m2617q()));
        boolean z3 = i3 == 1 || c1063d.mo2571B() || i3 == 2 || (i3 == 3 && c1063d.f4333s == 0 && c1063d.f4295W == 0.0f && c1063d.m2620t(1)) || (i3 == 3 && c1063d.f4333s == 1 && c1063d.m2621u(1, c1063d.m2613k()));
        return (c1063d.f4295W > 0.0f && (z2 || z3)) || (z2 && z3);
    }

    /* JADX INFO: renamed from: b */
    public static C1088n m2669b(C1063d c1063d, int i2, ArrayList arrayList, C1088n c1088n) {
        int i3;
        int i4 = i2 == 0 ? c1063d.f4326n0 : c1063d.f4328o0;
        if (i4 != -1 && (c1088n == null || i4 != c1088n.f4475b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                C1088n c1088n2 = (C1088n) arrayList.get(i5);
                if (c1088n2.f4475b == i4) {
                    if (c1088n != null) {
                        c1088n.m2686c(i2, c1088n2);
                        arrayList.remove(c1088n);
                    }
                    c1088n = c1088n2;
                } else {
                    i5++;
                }
            }
        } else if (i4 != -1) {
            return c1088n;
        }
        if (c1088n == null) {
            if (c1063d instanceof AbstractC1068i) {
                AbstractC1068i abstractC1068i = (AbstractC1068i) c1063d;
                int i6 = 0;
                while (true) {
                    if (i6 >= abstractC1068i.f4424r0) {
                        i3 = -1;
                        break;
                    }
                    C1063d c1063d2 = abstractC1068i.f4423q0[i6];
                    if ((i2 == 0 && (i3 = c1063d2.f4326n0) != -1) || (i2 == 1 && (i3 = c1063d2.f4328o0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        C1088n c1088n3 = (C1088n) arrayList.get(i7);
                        if (c1088n3.f4475b == i3) {
                            c1088n = c1088n3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (c1088n == null) {
                c1088n = new C1088n();
                c1088n.f4474a = new ArrayList();
                c1088n.f4477d = null;
                c1088n.f4478e = -1;
                int i8 = C1088n.f4473f;
                C1088n.f4473f = i8 + 1;
                c1088n.f4475b = i8;
                c1088n.f4476c = i2;
            }
            arrayList.add(c1088n);
        }
        ArrayList arrayList2 = c1088n.f4474a;
        if (arrayList2.contains(c1063d)) {
            return c1088n;
        }
        arrayList2.add(c1063d);
        if (c1063d instanceof C1067h) {
            C1067h c1067h = (C1067h) c1063d;
            c1067h.f4420t0.m2578c(c1067h.f4421u0 == 0 ? 1 : 0, arrayList, c1088n);
        }
        int i9 = c1088n.f4475b;
        if (i2 == 0) {
            c1063d.f4326n0 = i9;
            c1063d.f4281I.m2578c(i2, arrayList, c1088n);
            c1063d.f4283K.m2578c(i2, arrayList, c1088n);
        } else {
            c1063d.f4328o0 = i9;
            c1063d.f4282J.m2578c(i2, arrayList, c1088n);
            c1063d.f4285M.m2578c(i2, arrayList, c1088n);
            c1063d.f4284L.m2578c(i2, arrayList, c1088n);
        }
        c1063d.f4288P.m2578c(i2, arrayList, c1088n);
        return c1088n;
    }

    /* JADX INFO: renamed from: c */
    public static void m2670c(int i2, C1063d c1063d, C1103f c1103f, boolean z2) {
        C1062c c1062c;
        C1062c c1062c2;
        char c2;
        C1062c c1062c3;
        C1062c c1062c4;
        if (c1063d.f4323m) {
            return;
        }
        if (!(c1063d instanceof C1064e) && c1063d.m2626z() && m2668a(c1063d)) {
            C1064e.m2627V(c1063d, c1103f, new C1076b());
        }
        C1062c c1062cMo2611i = c1063d.mo2611i(2);
        C1062c c1062cMo2611i2 = c1063d.mo2611i(4);
        int iM2579d = c1062cMo2611i.m2579d();
        int iM2579d2 = c1062cMo2611i2.m2579d();
        HashSet<C1062c> hashSet = c1062cMo2611i.f4264a;
        if (hashSet != null && c1062cMo2611i.f4266c) {
            for (C1062c c1062c5 : hashSet) {
                C1063d c1063d2 = c1062c5.f4267d;
                int i3 = i2 + 1;
                boolean zM2668a = m2668a(c1063d2);
                if (c1063d2.m2626z() && zM2668a) {
                    c2 = 0;
                    C1064e.m2627V(c1063d2, c1103f, new C1076b());
                } else {
                    c2 = 0;
                }
                C1062c c1062c6 = c1063d2.f4281I;
                C1062c c1062c7 = c1063d2.f4283K;
                boolean z3 = (c1062c5 == c1062c6 && (c1062c4 = c1062c7.f4269f) != null && c1062c4.f4266c) || (c1062c5 == c1062c7 && (c1062c3 = c1062c6.f4269f) != null && c1062c3.f4266c);
                int i4 = c1063d2.f4330p0[c2];
                if (i4 != 3 || zM2668a) {
                    if (!c1063d2.m2626z()) {
                        if (c1062c5 == c1062c6 && c1062c7.f4269f == null) {
                            int iM2580e = c1062c6.m2580e() + iM2579d;
                            c1063d2.m2597J(iM2580e, c1063d2.m2617q() + iM2580e);
                            m2670c(i3, c1063d2, c1103f, z2);
                        } else if (c1062c5 == c1062c7 && c1062c6.f4269f == null) {
                            int iM2580e2 = iM2579d - c1062c7.m2580e();
                            c1063d2.m2597J(iM2580e2 - c1063d2.m2617q(), iM2580e2);
                            m2670c(i3, c1063d2, c1103f, z2);
                        } else if (z3 && !c1063d2.m2624x()) {
                            m2671d(i3, c1063d2, c1103f, z2);
                        }
                    }
                } else if (i4 == 3 && c1063d2.f4336v >= 0 && c1063d2.f4335u >= 0 && (c1063d2.f4312g0 == 8 || (c1063d2.f4332r == 0 && c1063d2.f4295W == 0.0f))) {
                    if (!c1063d2.m2624x() && !c1063d2.f4278F && z3 && !c1063d2.m2624x()) {
                        m2672e(i3, c1063d, c1103f, c1063d2, z2);
                    }
                }
            }
        }
        if (c1063d instanceof C1067h) {
            return;
        }
        HashSet<C1062c> hashSet2 = c1062cMo2611i2.f4264a;
        if (hashSet2 != null && c1062cMo2611i2.f4266c) {
            for (C1062c c1062c8 : hashSet2) {
                C1063d c1063d3 = c1062c8.f4267d;
                int i5 = i2 + 1;
                boolean zM2668a2 = m2668a(c1063d3);
                if (c1063d3.m2626z() && zM2668a2) {
                    C1064e.m2627V(c1063d3, c1103f, new C1076b());
                }
                C1062c c1062c9 = c1063d3.f4281I;
                C1062c c1062c10 = c1063d3.f4283K;
                boolean z4 = (c1062c8 == c1062c9 && (c1062c2 = c1062c10.f4269f) != null && c1062c2.f4266c) || (c1062c8 == c1062c10 && (c1062c = c1062c9.f4269f) != null && c1062c.f4266c);
                int i6 = c1063d3.f4330p0[0];
                if (i6 != 3 || zM2668a2) {
                    if (!c1063d3.m2626z()) {
                        if (c1062c8 == c1062c9 && c1062c10.f4269f == null) {
                            int iM2580e3 = c1062c9.m2580e() + iM2579d2;
                            c1063d3.m2597J(iM2580e3, c1063d3.m2617q() + iM2580e3);
                            m2670c(i5, c1063d3, c1103f, z2);
                        } else if (c1062c8 == c1062c10 && c1062c9.f4269f == null) {
                            int iM2580e4 = iM2579d2 - c1062c10.m2580e();
                            c1063d3.m2597J(iM2580e4 - c1063d3.m2617q(), iM2580e4);
                            m2670c(i5, c1063d3, c1103f, z2);
                        } else if (z4 && !c1063d3.m2624x()) {
                            m2671d(i5, c1063d3, c1103f, z2);
                        }
                    }
                } else if (i6 == 3 && c1063d3.f4336v >= 0 && c1063d3.f4335u >= 0) {
                    if (c1063d3.f4312g0 == 8 || (c1063d3.f4332r == 0 && c1063d3.f4295W == 0.0f)) {
                        if (!c1063d3.m2624x() && !c1063d3.f4278F && z4 && !c1063d3.m2624x()) {
                            m2672e(i5, c1063d, c1103f, c1063d3, z2);
                        }
                    }
                }
            }
        }
        c1063d.f4323m = true;
    }

    /* JADX INFO: renamed from: d */
    public static void m2671d(int i2, C1063d c1063d, C1103f c1103f, boolean z2) {
        float f = c1063d.f4306d0;
        C1062c c1062c = c1063d.f4281I;
        int iM2579d = c1062c.f4269f.m2579d();
        C1062c c1062c2 = c1063d.f4283K;
        int iM2579d2 = c1062c2.f4269f.m2579d();
        int iM2580e = c1062c.m2580e() + iM2579d;
        int iM2580e2 = iM2579d2 - c1062c2.m2580e();
        if (iM2579d == iM2579d2) {
            f = 0.5f;
        } else {
            iM2579d = iM2580e;
            iM2579d2 = iM2580e2;
        }
        int iM2617q = c1063d.m2617q();
        int i3 = (iM2579d2 - iM2579d) - iM2617q;
        if (iM2579d > iM2579d2) {
            i3 = (iM2579d - iM2579d2) - iM2617q;
        }
        int i4 = ((int) (i3 > 0 ? (f * i3) + 0.5f : f * i3)) + iM2579d;
        int i5 = i4 + iM2617q;
        if (iM2579d > iM2579d2) {
            i5 = i4 - iM2617q;
        }
        c1063d.m2597J(i4, i5);
        m2670c(i2 + 1, c1063d, c1103f, z2);
    }

    /* JADX INFO: renamed from: e */
    public static void m2672e(int i2, C1063d c1063d, C1103f c1103f, C1063d c1063d2, boolean z2) {
        float f = c1063d2.f4306d0;
        C1062c c1062c = c1063d2.f4281I;
        int iM2580e = c1062c.m2580e() + c1062c.f4269f.m2579d();
        C1062c c1062c2 = c1063d2.f4283K;
        int iM2579d = c1062c2.f4269f.m2579d() - c1062c2.m2580e();
        if (iM2579d >= iM2580e) {
            int iM2617q = c1063d2.m2617q();
            if (c1063d2.f4312g0 != 8) {
                int i3 = c1063d2.f4332r;
                if (i3 == 2) {
                    iM2617q = (int) (c1063d2.f4306d0 * 0.5f * (c1063d instanceof C1064e ? c1063d.m2617q() : c1063d.f4292T.m2617q()));
                } else if (i3 == 0) {
                    iM2617q = iM2579d - iM2580e;
                }
                iM2617q = Math.max(c1063d2.f4335u, iM2617q);
                int i4 = c1063d2.f4336v;
                if (i4 > 0) {
                    iM2617q = Math.min(i4, iM2617q);
                }
            }
            int i5 = iM2580e + ((int) ((f * ((iM2579d - iM2580e) - iM2617q)) + 0.5f));
            c1063d2.m2597J(i5, iM2617q + i5);
            m2670c(i2 + 1, c1063d2, c1103f, z2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2673f(int i2, C1063d c1063d, C1103f c1103f) {
        float f = c1063d.f4308e0;
        C1062c c1062c = c1063d.f4282J;
        int iM2579d = c1062c.f4269f.m2579d();
        C1062c c1062c2 = c1063d.f4284L;
        int iM2579d2 = c1062c2.f4269f.m2579d();
        int iM2580e = c1062c.m2580e() + iM2579d;
        int iM2580e2 = iM2579d2 - c1062c2.m2580e();
        if (iM2579d == iM2579d2) {
            f = 0.5f;
        } else {
            iM2579d = iM2580e;
            iM2579d2 = iM2580e2;
        }
        int iM2613k = c1063d.m2613k();
        int i3 = (iM2579d2 - iM2579d) - iM2613k;
        if (iM2579d > iM2579d2) {
            i3 = (iM2579d - iM2579d2) - iM2613k;
        }
        int i4 = (int) (i3 > 0 ? (f * i3) + 0.5f : f * i3);
        int i5 = iM2579d + i4;
        int i6 = i5 + iM2613k;
        if (iM2579d > iM2579d2) {
            i5 = iM2579d - i4;
            i6 = i5 - iM2613k;
        }
        c1063d.m2598K(i5, i6);
        m2676i(i2 + 1, c1063d, c1103f);
    }

    /* JADX INFO: renamed from: g */
    public static void m2674g(int i2, C1063d c1063d, C1103f c1103f, C1063d c1063d2) {
        float f = c1063d2.f4308e0;
        C1062c c1062c = c1063d2.f4282J;
        int iM2580e = c1062c.m2580e() + c1062c.f4269f.m2579d();
        C1062c c1062c2 = c1063d2.f4284L;
        int iM2579d = c1062c2.f4269f.m2579d() - c1062c2.m2580e();
        if (iM2579d >= iM2580e) {
            int iM2613k = c1063d2.m2613k();
            if (c1063d2.f4312g0 != 8) {
                int i3 = c1063d2.f4333s;
                if (i3 == 2) {
                    iM2613k = (int) (f * 0.5f * (c1063d instanceof C1064e ? c1063d.m2613k() : c1063d.f4292T.m2613k()));
                } else if (i3 == 0) {
                    iM2613k = iM2579d - iM2580e;
                }
                iM2613k = Math.max(c1063d2.f4338x, iM2613k);
                int i4 = c1063d2.f4339y;
                if (i4 > 0) {
                    iM2613k = Math.min(i4, iM2613k);
                }
            }
            int i5 = iM2580e + ((int) ((f * ((iM2579d - iM2580e) - iM2613k)) + 0.5f));
            c1063d2.m2598K(i5, iM2613k + i5);
            m2676i(i2 + 1, c1063d2, c1103f);
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2675h(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }

    /* JADX INFO: renamed from: i */
    public static void m2676i(int i2, C1063d c1063d, C1103f c1103f) {
        C1062c c1062c;
        C1062c c1062c2;
        C1062c c1062c3;
        C1062c c1062c4;
        if (c1063d.f4325n) {
            return;
        }
        if (!(c1063d instanceof C1064e) && c1063d.m2626z() && m2668a(c1063d)) {
            C1064e.m2627V(c1063d, c1103f, new C1076b());
        }
        C1062c c1062cMo2611i = c1063d.mo2611i(3);
        C1062c c1062cMo2611i2 = c1063d.mo2611i(5);
        int iM2579d = c1062cMo2611i.m2579d();
        int iM2579d2 = c1062cMo2611i2.m2579d();
        HashSet<C1062c> hashSet = c1062cMo2611i.f4264a;
        if (hashSet != null && c1062cMo2611i.f4266c) {
            for (C1062c c1062c5 : hashSet) {
                C1063d c1063d2 = c1062c5.f4267d;
                int i3 = i2 + 1;
                boolean zM2668a = m2668a(c1063d2);
                if (c1063d2.m2626z() && zM2668a) {
                    C1064e.m2627V(c1063d2, c1103f, new C1076b());
                }
                C1062c c1062c6 = c1063d2.f4282J;
                C1062c c1062c7 = c1063d2.f4284L;
                boolean z2 = (c1062c5 == c1062c6 && (c1062c4 = c1062c7.f4269f) != null && c1062c4.f4266c) || (c1062c5 == c1062c7 && (c1062c3 = c1062c6.f4269f) != null && c1062c3.f4266c);
                int i4 = c1063d2.f4330p0[1];
                if (i4 != 3 || zM2668a) {
                    if (!c1063d2.m2626z()) {
                        if (c1062c5 == c1062c6 && c1062c7.f4269f == null) {
                            int iM2580e = c1062c6.m2580e() + iM2579d;
                            c1063d2.m2598K(iM2580e, c1063d2.m2613k() + iM2580e);
                            m2676i(i3, c1063d2, c1103f);
                        } else if (c1062c5 == c1062c7 && c1062c6.f4269f == null) {
                            int iM2580e2 = iM2579d - c1062c7.m2580e();
                            c1063d2.m2598K(iM2580e2 - c1063d2.m2613k(), iM2580e2);
                            m2676i(i3, c1063d2, c1103f);
                        } else if (z2 && !c1063d2.m2625y()) {
                            m2673f(i3, c1063d2, c1103f);
                        }
                    }
                } else if (i4 == 3 && c1063d2.f4339y >= 0 && c1063d2.f4338x >= 0 && (c1063d2.f4312g0 == 8 || (c1063d2.f4333s == 0 && c1063d2.f4295W == 0.0f))) {
                    if (!c1063d2.m2625y() && !c1063d2.f4278F && z2 && !c1063d2.m2625y()) {
                        m2674g(i3, c1063d, c1103f, c1063d2);
                    }
                }
            }
        }
        char c2 = 1;
        if (c1063d instanceof C1067h) {
            return;
        }
        HashSet<C1062c> hashSet2 = c1062cMo2611i2.f4264a;
        if (hashSet2 != null && c1062cMo2611i2.f4266c) {
            for (C1062c c1062c8 : hashSet2) {
                C1063d c1063d3 = c1062c8.f4267d;
                int i5 = i2 + 1;
                boolean zM2668a2 = m2668a(c1063d3);
                if (c1063d3.m2626z() && zM2668a2) {
                    C1064e.m2627V(c1063d3, c1103f, new C1076b());
                }
                C1062c c1062c9 = c1063d3.f4282J;
                C1062c c1062c10 = c1063d3.f4284L;
                boolean z3 = (c1062c8 == c1062c9 && (c1062c2 = c1062c10.f4269f) != null && c1062c2.f4266c) || (c1062c8 == c1062c10 && (c1062c = c1062c9.f4269f) != null && c1062c.f4266c);
                int i6 = c1063d3.f4330p0[1];
                if (i6 != 3 || zM2668a2) {
                    if (!c1063d3.m2626z()) {
                        if (c1062c8 == c1062c9 && c1062c10.f4269f == null) {
                            int iM2580e3 = c1062c9.m2580e() + iM2579d2;
                            c1063d3.m2598K(iM2580e3, c1063d3.m2613k() + iM2580e3);
                            m2676i(i5, c1063d3, c1103f);
                        } else if (c1062c8 == c1062c10 && c1062c9.f4269f == null) {
                            int iM2580e4 = iM2579d2 - c1062c10.m2580e();
                            c1063d3.m2598K(iM2580e4 - c1063d3.m2613k(), iM2580e4);
                            m2676i(i5, c1063d3, c1103f);
                        } else if (z3 && !c1063d3.m2625y()) {
                            m2673f(i5, c1063d3, c1103f);
                        }
                    }
                } else if (i6 == 3 && c1063d3.f4339y >= 0 && c1063d3.f4338x >= 0 && (c1063d3.f4312g0 == 8 || (c1063d3.f4333s == 0 && c1063d3.f4295W == 0.0f))) {
                    if (!c1063d3.m2625y() && !c1063d3.f4278F && z3 && !c1063d3.m2625y()) {
                        m2674g(i5, c1063d, c1103f, c1063d3);
                    }
                }
            }
        }
        C1062c c1062cMo2611i3 = c1063d.mo2611i(6);
        if (c1062cMo2611i3.f4264a != null && c1062cMo2611i3.f4266c) {
            int iM2579d3 = c1062cMo2611i3.m2579d();
            for (C1062c c1062c11 : c1062cMo2611i3.f4264a) {
                C1063d c1063d4 = c1062c11.f4267d;
                int i7 = i2 + 1;
                boolean zM2668a3 = m2668a(c1063d4);
                if (c1063d4.m2626z() && zM2668a3) {
                    C1064e.m2627V(c1063d4, c1103f, new C1076b());
                }
                if (c1063d4.f4330p0[c2] != 3 || zM2668a3) {
                    if (c1063d4.m2626z()) {
                        continue;
                    } else {
                        C1062c c1062c12 = c1063d4.f4285M;
                        if (c1062c11 == c1062c12) {
                            int iM2580e5 = c1062c11.m2580e() + iM2579d3;
                            if (c1063d4.f4277E) {
                                int i8 = iM2580e5 - c1063d4.f4300a0;
                                int i9 = c1063d4.f4294V + i8;
                                c1063d4.f4298Z = i8;
                                c1063d4.f4282J.m2587l(i8);
                                c1063d4.f4284L.m2587l(i9);
                                c1062c12.m2587l(iM2580e5);
                                c1063d4.f4321l = true;
                            }
                            m2676i(i7, c1063d4, c1103f);
                        }
                    }
                }
                c2 = 1;
            }
        }
        c1063d.f4325n = true;
    }
}
