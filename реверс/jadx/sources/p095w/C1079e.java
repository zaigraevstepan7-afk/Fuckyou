package p095w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p093v.AbstractC1068i;
import p093v.C1062c;
import p093v.C1063d;
import p093v.C1064e;
import p093v.C1067h;
import p099y.C1103f;

/* JADX INFO: renamed from: w.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1079e {

    /* JADX INFO: renamed from: a */
    public C1064e f4446a;

    /* JADX INFO: renamed from: b */
    public boolean f4447b;

    /* JADX INFO: renamed from: c */
    public boolean f4448c;

    /* JADX INFO: renamed from: d */
    public C1064e f4449d;

    /* JADX INFO: renamed from: e */
    public ArrayList f4450e;

    /* JADX INFO: renamed from: f */
    public C1103f f4451f;

    /* JADX INFO: renamed from: g */
    public C1076b f4452g;

    /* JADX INFO: renamed from: h */
    public ArrayList f4453h;

    /* JADX INFO: renamed from: a */
    public final void m2658a(C1080f c1080f, int i2, ArrayList arrayList, C1086l c1086l) {
        AbstractC1089o abstractC1089o = c1080f.f4457d;
        if (abstractC1089o.f4481c == null) {
            C1064e c1064e = this.f4446a;
            if (abstractC1089o == c1064e.f4305d || abstractC1089o == c1064e.f4307e) {
                return;
            }
            if (c1086l == null) {
                c1086l = new C1086l();
                c1086l.f4469a = null;
                c1086l.f4470b = new ArrayList();
                c1086l.f4469a = abstractC1089o;
                arrayList.add(c1086l);
            }
            abstractC1089o.f4481c = c1086l;
            c1086l.f4470b.add(abstractC1089o);
            C1080f c1080f2 = abstractC1089o.f4486h;
            for (InterfaceC1078d interfaceC1078d : c1080f2.f4464k) {
                if (interfaceC1078d instanceof C1080f) {
                    m2658a((C1080f) interfaceC1078d, i2, arrayList, c1086l);
                }
            }
            C1080f c1080f3 = abstractC1089o.f4487i;
            for (InterfaceC1078d interfaceC1078d2 : c1080f3.f4464k) {
                if (interfaceC1078d2 instanceof C1080f) {
                    m2658a((C1080f) interfaceC1078d2, i2, arrayList, c1086l);
                }
            }
            if (i2 == 1 && (abstractC1089o instanceof C1087m)) {
                for (InterfaceC1078d interfaceC1078d3 : ((C1087m) abstractC1089o).f4471k.f4464k) {
                    if (interfaceC1078d3 instanceof C1080f) {
                        m2658a((C1080f) interfaceC1078d3, i2, arrayList, c1086l);
                    }
                }
            }
            Iterator it = c1080f2.f4465l.iterator();
            while (it.hasNext()) {
                m2658a((C1080f) it.next(), i2, arrayList, c1086l);
            }
            Iterator it2 = c1080f3.f4465l.iterator();
            while (it2.hasNext()) {
                m2658a((C1080f) it2.next(), i2, arrayList, c1086l);
            }
            if (i2 == 1 && (abstractC1089o instanceof C1087m)) {
                Iterator it3 = ((C1087m) abstractC1089o).f4471k.f4465l.iterator();
                while (it3.hasNext()) {
                    m2658a((C1080f) it3.next(), i2, arrayList, c1086l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0189  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2659b(C1064e c1064e) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        for (C1063d c1063d : c1064e.f4353q0) {
            int[] iArr = c1063d.f4330p0;
            int i11 = iArr[0];
            int i12 = iArr[1];
            if (c1063d.f4312g0 == 8) {
                c1063d.f4299a = true;
            } else {
                float f = c1063d.f4337w;
                if (f < 1.0f && i11 == 3) {
                    c1063d.f4332r = 2;
                }
                float f2 = c1063d.f4340z;
                if (f2 < 1.0f && i12 == 3) {
                    c1063d.f4333s = 2;
                }
                if (c1063d.f4295W > 0.0f) {
                    if (i11 == 3 && (i12 == 2 || i12 == 1)) {
                        c1063d.f4332r = 3;
                    } else if (i12 == 3 && (i11 == 2 || i11 == 1)) {
                        c1063d.f4333s = 3;
                    } else if (i11 == 3 && i12 == 3) {
                        if (c1063d.f4332r == 0) {
                            c1063d.f4332r = 3;
                        }
                        if (c1063d.f4333s == 0) {
                            c1063d.f4333s = 3;
                        }
                    }
                }
                C1062c c1062c = c1063d.f4283K;
                C1062c c1062c2 = c1063d.f4281I;
                if (i11 == 3 && c1063d.f4332r == 1 && (c1062c2.f4269f == null || c1062c.f4269f == null)) {
                    i11 = 2;
                }
                C1062c c1062c3 = c1063d.f4284L;
                C1062c c1062c4 = c1063d.f4282J;
                if (i12 == 3 && c1063d.f4333s == 1 && (c1062c4.f4269f == null || c1062c3.f4269f == null)) {
                    i12 = 2;
                }
                C1085k c1085k = c1063d.f4305d;
                c1085k.f4482d = i11;
                int i13 = c1063d.f4332r;
                c1085k.f4479a = i13;
                C1087m c1087m = c1063d.f4307e;
                c1087m.f4482d = i12;
                int i14 = c1063d.f4333s;
                c1087m.f4479a = i14;
                if ((i11 == 4 || i11 == 1 || i11 == 2) && (i12 == 4 || i12 == 1 || i12 == 2)) {
                    int i15 = i12;
                    int iM2617q = c1063d.m2617q();
                    if (i11 == 4) {
                        iM2617q = (c1064e.m2617q() - c1062c2.f4270g) - c1062c.f4270g;
                        i11 = 1;
                    }
                    int i16 = iM2617q;
                    int iM2613k = c1063d.m2613k();
                    if (i15 == 4) {
                        iM2613k = (c1064e.m2613k() - c1062c4.f4270g) - c1062c3.f4270g;
                        i15 = 1;
                    }
                    m2663f(i11, i16, i15, iM2613k, c1063d);
                    c1063d.f4305d.f4483e.mo2667d(c1063d.m2617q());
                    c1063d.f4307e.f4483e.mo2667d(c1063d.m2613k());
                    c1063d.f4299a = true;
                } else {
                    int[] iArr2 = c1064e.f4330p0;
                    C1062c[] c1062cArr = c1063d.f4289Q;
                    if (i11 != 3 || (i12 != 2 && i12 != 1)) {
                        i2 = i11;
                        i4 = i14;
                        i6 = 2;
                        i3 = 1;
                        i5 = i12;
                        if (i5 != 3) {
                            i7 = i2;
                            i8 = 1;
                            i9 = 2;
                        } else if (i2 != i6 && i2 != i3) {
                            i7 = i2;
                            i8 = 1;
                            i10 = 3;
                            i9 = 2;
                            if (i7 != i10 && i5 == i10) {
                                if (i13 == i8 || i4 == i8) {
                                    m2663f(2, 0, i9, 0, c1063d);
                                    c1063d.f4305d.f4483e.f4466m = c1063d.m2617q();
                                    c1063d.f4307e.f4483e.f4466m = c1063d.m2613k();
                                } else if (i4 == 2 && i13 == 2 && iArr2[0] == i3 && iArr2[i8] == i3) {
                                    m2663f(1, (int) ((f * c1064e.m2617q()) + 0.5f), i3, (int) ((f2 * c1064e.m2613k()) + 0.5f), c1063d);
                                    c1063d.f4305d.f4483e.mo2667d(c1063d.m2617q());
                                    c1063d.f4307e.f4483e.mo2667d(c1063d.m2613k());
                                    c1063d.f4299a = true;
                                }
                            }
                        } else if (i4 == 3) {
                            if (i2 == i6) {
                                m2663f(i6, 0, i6, 0, c1063d);
                            }
                            int iM2617q2 = c1063d.m2617q();
                            float f3 = c1063d.f4295W;
                            if (c1063d.f4296X == -1) {
                                f3 = 1.0f / f3;
                            }
                            m2663f(1, iM2617q2, i3, (int) ((iM2617q2 * f3) + 0.5f), c1063d);
                            c1063d.f4305d.f4483e.mo2667d(c1063d.m2617q());
                            c1063d.f4307e.f4483e.mo2667d(c1063d.m2613k());
                            c1063d.f4299a = true;
                        } else if (i4 == 1) {
                            m2663f(i2, 0, 2, 0, c1063d);
                            c1063d.f4307e.f4483e.f4466m = c1063d.m2613k();
                        } else {
                            int i17 = i2;
                            i9 = 2;
                            if (i4 == 2) {
                                int i18 = iArr2[1];
                                if (i18 == i3 || i18 == 4) {
                                    m2663f(i17, c1063d.m2617q(), 1, (int) ((f2 * c1064e.m2613k()) + 0.5f), c1063d);
                                    c1063d.f4305d.f4483e.mo2667d(c1063d.m2617q());
                                    c1063d.f4307e.f4483e.mo2667d(c1063d.m2613k());
                                    c1063d.f4299a = true;
                                } else {
                                    i7 = i17;
                                    i8 = 1;
                                }
                            } else {
                                i7 = i17;
                                if (c1062cArr[2].f4269f == null || c1062cArr[3].f4269f == null) {
                                    m2663f(2, 0, i5, 0, c1063d);
                                    c1063d.f4305d.f4483e.mo2667d(c1063d.m2617q());
                                    c1063d.f4307e.f4483e.mo2667d(c1063d.m2613k());
                                    c1063d.f4299a = true;
                                } else {
                                    i8 = 1;
                                }
                            }
                        }
                        i10 = 3;
                        if (i7 != i10) {
                        }
                    } else if (i13 == 3) {
                        if (i12 == 2) {
                            m2663f(2, 0, 2, 0, c1063d);
                        }
                        int iM2613k2 = c1063d.m2613k();
                        m2663f(1, (int) ((iM2613k2 * c1063d.f4295W) + 0.5f), 1, iM2613k2, c1063d);
                        c1063d.f4305d.f4483e.mo2667d(c1063d.m2617q());
                        c1063d.f4307e.f4483e.mo2667d(c1063d.m2613k());
                        c1063d.f4299a = true;
                    } else {
                        i2 = i11;
                        i6 = 2;
                        i3 = 1;
                        if (i13 == 1) {
                            m2663f(2, 0, i12, 0, c1063d);
                            c1063d.f4305d.f4483e.f4466m = c1063d.m2617q();
                        } else {
                            i4 = i14;
                            i5 = i12;
                            if (i13 == 2) {
                                int i19 = iArr2[0];
                                if (i19 == 1 || i19 == 4) {
                                    m2663f(1, (int) ((f * c1064e.m2617q()) + 0.5f), i5, c1063d.m2613k(), c1063d);
                                    c1063d.f4305d.f4483e.mo2667d(c1063d.m2617q());
                                    c1063d.f4307e.f4483e.mo2667d(c1063d.m2613k());
                                    c1063d.f4299a = true;
                                } else {
                                    if (i5 != 3) {
                                    }
                                    i10 = 3;
                                    if (i7 != i10) {
                                    }
                                }
                            } else if (c1062cArr[0].f4269f == null || c1062cArr[1].f4269f == null) {
                                m2663f(2, 0, i5, 0, c1063d);
                                c1063d.f4305d.f4483e.mo2667d(c1063d.m2617q());
                                c1063d.f4307e.f4483e.mo2667d(c1063d.m2613k());
                                c1063d.f4299a = true;
                            } else {
                                if (i5 != 3) {
                                }
                                i10 = 3;
                                if (i7 != i10) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2660c() {
        ArrayList<AbstractC1089o> arrayList = this.f4450e;
        arrayList.clear();
        C1064e c1064e = this.f4449d;
        c1064e.f4305d.mo2653f();
        c1064e.f4307e.mo2653f();
        arrayList.add(c1064e.f4305d);
        arrayList.add(c1064e.f4307e);
        HashSet hashSet = null;
        for (C1063d c1063d : c1064e.f4353q0) {
            if (c1063d instanceof C1067h) {
                C1083i c1083i = new C1083i(c1063d);
                c1063d.f4305d.mo2653f();
                c1063d.f4307e.mo2653f();
                c1083i.f4484f = ((C1067h) c1063d).f4421u0;
                arrayList.add(c1083i);
            } else {
                if (c1063d.m2624x()) {
                    if (c1063d.f4301b == null) {
                        c1063d.f4301b = new C1077c(c1063d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1063d.f4301b);
                } else {
                    arrayList.add(c1063d.f4305d);
                }
                if (c1063d.m2625y()) {
                    if (c1063d.f4303c == null) {
                        c1063d.f4303c = new C1077c(c1063d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1063d.f4303c);
                } else {
                    arrayList.add(c1063d.f4307e);
                }
                if (c1063d instanceof AbstractC1068i) {
                    arrayList.add(new C1084j(c1063d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC1089o) it.next()).mo2653f();
        }
        for (AbstractC1089o abstractC1089o : arrayList) {
            if (abstractC1089o.f4480b != c1064e) {
                abstractC1089o.mo2651d();
            }
        }
        ArrayList arrayList2 = this.f4453h;
        arrayList2.clear();
        C1064e c1064e2 = this.f4446a;
        m2662e(c1064e2.f4305d, 0, arrayList2);
        m2662e(c1064e2.f4307e, 1, arrayList2);
        this.f4447b = false;
    }

    /* JADX INFO: renamed from: d */
    public final int m2661d(C1064e c1064e, int i2) {
        ArrayList arrayList;
        int i3;
        int i4;
        long jMax;
        float f;
        C1064e c1064e2 = c1064e;
        ArrayList arrayList2 = this.f4453h;
        int size = arrayList2.size();
        int i5 = 0;
        long jMax2 = 0;
        while (i5 < size) {
            AbstractC1089o abstractC1089o = ((C1086l) arrayList2.get(i5)).f4469a;
            if (!(abstractC1089o instanceof C1077c) ? !(i2 != 0 ? (abstractC1089o instanceof C1087m) : (abstractC1089o instanceof C1085k)) : ((C1077c) abstractC1089o).f4484f != i2) {
                C1080f c1080f = (i2 == 0 ? c1064e2.f4305d : c1064e2.f4307e).f4486h;
                C1080f c1080f2 = (i2 == 0 ? c1064e2.f4305d : c1064e2.f4307e).f4487i;
                boolean zContains = abstractC1089o.f4486h.f4465l.contains(c1080f);
                C1080f c1080f3 = abstractC1089o.f4487i;
                boolean zContains2 = c1080f3.f4465l.contains(c1080f2);
                long jMo2654j = abstractC1089o.mo2654j();
                C1080f c1080f4 = abstractC1089o.f4486h;
                if (zContains && zContains2) {
                    long jM2682b = C1086l.m2682b(c1080f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i3 = size;
                    long jM2681a = C1086l.m2681a(c1080f3, 0L);
                    long j2 = jM2682b - jMo2654j;
                    int i6 = c1080f3.f4459f;
                    arrayList = arrayList3;
                    i4 = i5;
                    if (j2 >= (-i6)) {
                        j2 += (long) i6;
                    }
                    long j3 = (-jM2681a) - jMo2654j;
                    long j4 = c1080f4.f4459f;
                    long j5 = j3 - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    C1063d c1063d = abstractC1089o.f4480b;
                    if (i2 == 0) {
                        f = c1063d.f4306d0;
                    } else if (i2 == 1) {
                        f = c1063d.f4308e0;
                    } else {
                        c1063d.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j2 / (1.0f - f)) + (j5 / f)) : 0L;
                    jMax = (((long) c1080f4.f4459f) + ((((long) ((f2 * f) + 0.5f)) + jMo2654j) + ((long) (((1.0f - f) * f2) + 0.5f)))) - ((long) c1080f3.f4459f);
                } else {
                    arrayList = arrayList2;
                    i3 = size;
                    i4 = i5;
                    jMax = zContains ? Math.max(C1086l.m2682b(c1080f4, c1080f4.f4459f), ((long) c1080f4.f4459f) + jMo2654j) : zContains2 ? Math.max(-C1086l.m2681a(c1080f3, c1080f3.f4459f), ((long) (-c1080f3.f4459f)) + jMo2654j) : (abstractC1089o.mo2654j() + ((long) c1080f4.f4459f)) - ((long) c1080f3.f4459f);
                }
            } else {
                arrayList = arrayList2;
                i3 = size;
                i4 = i5;
                jMax = 0;
            }
            jMax2 = Math.max(jMax2, jMax);
            i5 = i4 + 1;
            c1064e2 = c1064e;
            size = i3;
            arrayList2 = arrayList;
        }
        return (int) jMax2;
    }

    /* JADX INFO: renamed from: e */
    public final void m2662e(AbstractC1089o abstractC1089o, int i2, ArrayList arrayList) {
        C1080f c1080f;
        Iterator it = abstractC1089o.f4486h.f4464k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c1080f = abstractC1089o.f4487i;
            if (!zHasNext) {
                break;
            }
            InterfaceC1078d interfaceC1078d = (InterfaceC1078d) it.next();
            if (interfaceC1078d instanceof C1080f) {
                m2658a((C1080f) interfaceC1078d, i2, arrayList, null);
            } else if (interfaceC1078d instanceof AbstractC1089o) {
                m2658a(((AbstractC1089o) interfaceC1078d).f4486h, i2, arrayList, null);
            }
        }
        for (InterfaceC1078d interfaceC1078d2 : c1080f.f4464k) {
            if (interfaceC1078d2 instanceof C1080f) {
                m2658a((C1080f) interfaceC1078d2, i2, arrayList, null);
            } else if (interfaceC1078d2 instanceof AbstractC1089o) {
                m2658a(((AbstractC1089o) interfaceC1078d2).f4487i, i2, arrayList, null);
            }
        }
        if (i2 == 1) {
            for (InterfaceC1078d interfaceC1078d3 : ((C1087m) abstractC1089o).f4471k.f4464k) {
                if (interfaceC1078d3 instanceof C1080f) {
                    m2658a((C1080f) interfaceC1078d3, i2, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2663f(int i2, int i3, int i4, int i5, C1063d c1063d) {
        C1076b c1076b = this.f4452g;
        c1076b.f4434a = i2;
        c1076b.f4435b = i4;
        c1076b.f4436c = i3;
        c1076b.f4437d = i5;
        this.f4451f.m2741b(c1063d, c1076b);
        c1063d.m2602O(c1076b.f4438e);
        c1063d.m2599L(c1076b.f4439f);
        c1063d.f4277E = c1076b.f4441h;
        c1063d.m2596I(c1076b.f4440g);
    }

    /* JADX INFO: renamed from: g */
    public final void m2664g() {
        C1075a c1075a;
        for (C1063d c1063d : this.f4446a.f4353q0) {
            if (!c1063d.f4299a) {
                int[] iArr = c1063d.f4330p0;
                boolean z2 = false;
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = c1063d.f4332r;
                int i5 = c1063d.f4333s;
                boolean z3 = i2 == 2 || (i2 == 3 && i4 == 1);
                if (i3 == 2 || (i3 == 3 && i5 == 1)) {
                    z2 = true;
                }
                C1081g c1081g = c1063d.f4305d.f4483e;
                boolean z4 = c1081g.f4463j;
                C1081g c1081g2 = c1063d.f4307e.f4483e;
                boolean z5 = c1081g2.f4463j;
                boolean z6 = z3;
                if (z4 && z5) {
                    m2663f(1, c1081g.f4460g, 1, c1081g2.f4460g, c1063d);
                    c1063d.f4299a = true;
                } else if (z4 && z2) {
                    m2663f(1, c1081g.f4460g, 2, c1081g2.f4460g, c1063d);
                    if (i3 == 3) {
                        c1063d.f4307e.f4483e.f4466m = c1063d.m2613k();
                    } else {
                        c1063d.f4307e.f4483e.mo2667d(c1063d.m2613k());
                        c1063d.f4299a = true;
                    }
                } else if (z5 && z6) {
                    m2663f(2, c1081g.f4460g, 1, c1081g2.f4460g, c1063d);
                    if (i2 == 3) {
                        c1063d.f4305d.f4483e.f4466m = c1063d.m2617q();
                    } else {
                        c1063d.f4305d.f4483e.mo2667d(c1063d.m2617q());
                        c1063d.f4299a = true;
                    }
                }
                if (c1063d.f4299a && (c1075a = c1063d.f4307e.f4472l) != null) {
                    c1075a.mo2667d(c1063d.f4300a0);
                }
            }
        }
    }
}
