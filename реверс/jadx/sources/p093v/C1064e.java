package p093v;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p024N.C0270l;
import p089t.C1046c;
import p089t.C1049f;
import p095w.AbstractC1082h;
import p095w.AbstractC1089o;
import p095w.C1076b;
import p095w.C1077c;
import p095w.C1079e;
import p095w.C1088n;
import p099y.C1103f;

/* JADX INFO: renamed from: v.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1064e extends C1063d {

    /* JADX INFO: renamed from: A0 */
    public int f4341A0;

    /* JADX INFO: renamed from: B0 */
    public C1061b[] f4342B0;

    /* JADX INFO: renamed from: C0 */
    public C1061b[] f4343C0;

    /* JADX INFO: renamed from: D0 */
    public int f4344D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f4345E0;

    /* JADX INFO: renamed from: F0 */
    public boolean f4346F0;

    /* JADX INFO: renamed from: G0 */
    public WeakReference f4347G0;

    /* JADX INFO: renamed from: H0 */
    public WeakReference f4348H0;

    /* JADX INFO: renamed from: I0 */
    public WeakReference f4349I0;

    /* JADX INFO: renamed from: J0 */
    public WeakReference f4350J0;

    /* JADX INFO: renamed from: K0 */
    public final HashSet f4351K0;

    /* JADX INFO: renamed from: L0 */
    public final C1076b f4352L0;

    /* JADX INFO: renamed from: q0 */
    public ArrayList f4353q0 = new ArrayList();

    /* JADX INFO: renamed from: r0 */
    public final C0270l f4354r0;

    /* JADX INFO: renamed from: s0 */
    public final C1079e f4355s0;

    /* JADX INFO: renamed from: t0 */
    public int f4356t0;

    /* JADX INFO: renamed from: u0 */
    public C1103f f4357u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f4358v0;

    /* JADX INFO: renamed from: w0 */
    public final C1046c f4359w0;

    /* JADX INFO: renamed from: x0 */
    public int f4360x0;

    /* JADX INFO: renamed from: y0 */
    public int f4361y0;

    /* JADX INFO: renamed from: z0 */
    public int f4362z0;

    public C1064e() {
        C0270l c0270l = new C0270l();
        c0270l.f836a = new ArrayList();
        c0270l.f837b = new C1076b();
        c0270l.f838c = this;
        this.f4354r0 = c0270l;
        C1079e c1079e = new C1079e();
        c1079e.f4447b = true;
        c1079e.f4448c = true;
        c1079e.f4450e = new ArrayList();
        new ArrayList();
        c1079e.f4451f = null;
        c1079e.f4452g = new C1076b();
        c1079e.f4453h = new ArrayList();
        c1079e.f4446a = this;
        c1079e.f4449d = this;
        this.f4355s0 = c1079e;
        this.f4357u0 = null;
        this.f4358v0 = false;
        this.f4359w0 = new C1046c();
        this.f4362z0 = 0;
        this.f4341A0 = 0;
        this.f4342B0 = new C1061b[4];
        this.f4343C0 = new C1061b[4];
        this.f4344D0 = 257;
        this.f4345E0 = false;
        this.f4346F0 = false;
        this.f4347G0 = null;
        this.f4348H0 = null;
        this.f4349I0 = null;
        this.f4350J0 = null;
        this.f4351K0 = new HashSet();
        this.f4352L0 = new C1076b();
    }

    /* JADX INFO: renamed from: V */
    public static void m2627V(C1063d c1063d, C1103f c1103f, C1076b c1076b) {
        int i2;
        int i3;
        if (c1103f == null) {
            return;
        }
        if (c1063d.f4312g0 == 8 || (c1063d instanceof C1067h) || (c1063d instanceof C1060a)) {
            c1076b.f4438e = 0;
            c1076b.f4439f = 0;
            return;
        }
        int[] iArr = c1063d.f4330p0;
        c1076b.f4434a = iArr[0];
        c1076b.f4435b = iArr[1];
        c1076b.f4436c = c1063d.m2617q();
        c1076b.f4437d = c1063d.m2613k();
        c1076b.f4442i = false;
        c1076b.f4443j = 0;
        boolean z2 = c1076b.f4434a == 3;
        boolean z3 = c1076b.f4435b == 3;
        boolean z4 = z2 && c1063d.f4295W > 0.0f;
        boolean z5 = z3 && c1063d.f4295W > 0.0f;
        if (z2 && c1063d.m2620t(0) && c1063d.f4332r == 0 && !z4) {
            c1076b.f4434a = 2;
            if (z3 && c1063d.f4333s == 0) {
                c1076b.f4434a = 1;
            }
            z2 = false;
        }
        if (z3 && c1063d.m2620t(1) && c1063d.f4333s == 0 && !z5) {
            c1076b.f4435b = 2;
            if (z2 && c1063d.f4332r == 0) {
                c1076b.f4435b = 1;
            }
            z3 = false;
        }
        if (c1063d.mo2570A()) {
            c1076b.f4434a = 1;
            z2 = false;
        }
        if (c1063d.mo2571B()) {
            c1076b.f4435b = 1;
            z3 = false;
        }
        int[] iArr2 = c1063d.f4334t;
        if (z4) {
            if (iArr2[0] == 4) {
                c1076b.f4434a = 1;
            } else if (!z3) {
                if (c1076b.f4435b == 1) {
                    i3 = c1076b.f4437d;
                } else {
                    c1076b.f4434a = 2;
                    c1103f.m2741b(c1063d, c1076b);
                    i3 = c1076b.f4439f;
                }
                c1076b.f4434a = 1;
                c1076b.f4436c = (int) (c1063d.f4295W * i3);
            }
        }
        if (z5) {
            if (iArr2[1] == 4) {
                c1076b.f4435b = 1;
            } else if (!z2) {
                if (c1076b.f4434a == 1) {
                    i2 = c1076b.f4436c;
                } else {
                    c1076b.f4435b = 2;
                    c1103f.m2741b(c1063d, c1076b);
                    i2 = c1076b.f4438e;
                }
                c1076b.f4435b = 1;
                if (c1063d.f4296X == -1) {
                    c1076b.f4437d = (int) (i2 / c1063d.f4295W);
                } else {
                    c1076b.f4437d = (int) (c1063d.f4295W * i2);
                }
            }
        }
        c1103f.m2741b(c1063d, c1076b);
        c1063d.m2602O(c1076b.f4438e);
        c1063d.m2599L(c1076b.f4439f);
        c1063d.f4277E = c1076b.f4441h;
        c1063d.m2596I(c1076b.f4440g);
        c1076b.f4443j = 0;
    }

    @Override // p093v.C1063d
    /* JADX INFO: renamed from: C */
    public final void mo2592C() {
        this.f4359w0.m2542t();
        this.f4360x0 = 0;
        this.f4361y0 = 0;
        this.f4353q0.clear();
        super.mo2592C();
    }

    @Override // p093v.C1063d
    /* JADX INFO: renamed from: F */
    public final void mo2595F(C0270l c0270l) {
        super.mo2595F(c0270l);
        int size = this.f4353q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C1063d) this.f4353q0.get(i2)).mo2595F(c0270l);
        }
    }

    @Override // p093v.C1063d
    /* JADX INFO: renamed from: P */
    public final void mo2603P(boolean z2, boolean z3) {
        super.mo2603P(z2, z3);
        int size = this.f4353q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C1063d) this.f4353q0.get(i2)).mo2603P(z2, z3);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m2628R(C1063d c1063d, int i2) {
        if (i2 == 0) {
            int i3 = this.f4362z0 + 1;
            C1061b[] c1061bArr = this.f4343C0;
            if (i3 >= c1061bArr.length) {
                this.f4343C0 = (C1061b[]) Arrays.copyOf(c1061bArr, c1061bArr.length * 2);
            }
            C1061b[] c1061bArr2 = this.f4343C0;
            int i4 = this.f4362z0;
            c1061bArr2[i4] = new C1061b(c1063d, 0, this.f4358v0);
            this.f4362z0 = i4 + 1;
            return;
        }
        if (i2 == 1) {
            int i5 = this.f4341A0 + 1;
            C1061b[] c1061bArr3 = this.f4342B0;
            if (i5 >= c1061bArr3.length) {
                this.f4342B0 = (C1061b[]) Arrays.copyOf(c1061bArr3, c1061bArr3.length * 2);
            }
            C1061b[] c1061bArr4 = this.f4342B0;
            int i6 = this.f4341A0;
            c1061bArr4[i6] = new C1061b(c1063d, 1, this.f4358v0);
            this.f4341A0 = i6 + 1;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m2629S(C1046c c1046c) {
        C1064e c1064e;
        C1046c c1046c2;
        boolean zM2632W = m2632W(64);
        mo2574b(c1046c, zM2632W);
        int size = this.f4353q0.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1063d c1063d = (C1063d) this.f4353q0.get(i2);
            boolean[] zArr = c1063d.f4291S;
            zArr[0] = false;
            zArr[1] = false;
            if (c1063d instanceof C1060a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                C1063d c1063d2 = (C1063d) this.f4353q0.get(i3);
                if (c1063d2 instanceof C1060a) {
                    C1060a c1060a = (C1060a) c1063d2;
                    for (int i4 = 0; i4 < c1060a.f4424r0; i4++) {
                        C1063d c1063d3 = c1060a.f4423q0[i4];
                        if (c1060a.f4244t0 || c1063d3.mo2575c()) {
                            int i5 = c1060a.f4243s0;
                            if (i5 == 0 || i5 == 1) {
                                c1063d3.f4291S[0] = true;
                            } else if (i5 == 2 || i5 == 3) {
                                c1063d3.f4291S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f4351K0;
        hashSet.clear();
        for (int i6 = 0; i6 < size; i6++) {
            C1063d c1063d4 = (C1063d) this.f4353q0.get(i6);
            c1063d4.getClass();
            boolean z3 = c1063d4 instanceof C1066g;
            if (z3 || (c1063d4 instanceof C1067h)) {
                if (z3) {
                    hashSet.add(c1063d4);
                } else {
                    c1063d4.mo2574b(c1046c, zM2632W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1066g c1066g = (C1066g) ((C1063d) it.next());
                for (int i7 = 0; i7 < c1066g.f4424r0; i7++) {
                    if (hashSet.contains(c1066g.f4423q0[i7])) {
                        c1066g.mo2574b(c1046c, zM2632W);
                        hashSet.remove(c1066g);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C1063d) it2.next()).mo2574b(c1046c, zM2632W);
                }
                hashSet.clear();
            }
        }
        if (C1046c.f4153q) {
            HashSet<C1063d> hashSet2 = new HashSet();
            for (int i8 = 0; i8 < size; i8++) {
                C1063d c1063d5 = (C1063d) this.f4353q0.get(i8);
                c1063d5.getClass();
                if (!(c1063d5 instanceof C1066g) && !(c1063d5 instanceof C1067h)) {
                    hashSet2.add(c1063d5);
                }
            }
            c1064e = this;
            c1046c2 = c1046c;
            c1064e.m2605a(this, c1046c2, hashSet2, this.f4330p0[0] == 2 ? 0 : 1, false);
            for (C1063d c1063d6 : hashSet2) {
                AbstractC1069j.m2647b(this, c1046c2, c1063d6);
                c1063d6.mo2574b(c1046c2, zM2632W);
            }
        } else {
            c1064e = this;
            c1046c2 = c1046c;
            for (int i9 = 0; i9 < size; i9++) {
                C1063d c1063d7 = (C1063d) c1064e.f4353q0.get(i9);
                if (c1063d7 instanceof C1064e) {
                    int[] iArr = c1063d7.f4330p0;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    if (i10 == 2) {
                        c1063d7.m2600M(1);
                    }
                    if (i11 == 2) {
                        c1063d7.m2601N(1);
                    }
                    c1063d7.mo2574b(c1046c2, zM2632W);
                    if (i10 == 2) {
                        c1063d7.m2600M(i10);
                    }
                    if (i11 == 2) {
                        c1063d7.m2601N(i11);
                    }
                } else {
                    AbstractC1069j.m2647b(this, c1046c2, c1063d7);
                    if (!(c1063d7 instanceof C1066g) && !(c1063d7 instanceof C1067h)) {
                        c1063d7.mo2574b(c1046c2, zM2632W);
                    }
                }
            }
        }
        if (c1064e.f4362z0 > 0) {
            AbstractC1069j.m2646a(this, c1046c2, null, 0);
        }
        if (c1064e.f4341A0 > 0) {
            AbstractC1069j.m2646a(this, c1046c2, null, 1);
        }
    }

    /* JADX INFO: renamed from: T */
    public final boolean m2630T(int i2, boolean z2) {
        boolean z3;
        C1079e c1079e = this.f4355s0;
        C1064e c1064e = c1079e.f4446a;
        boolean z4 = false;
        int iM2612j = c1064e.m2612j(0);
        int iM2612j2 = c1064e.m2612j(1);
        int iM2618r = c1064e.m2618r();
        int iM2619s = c1064e.m2619s();
        ArrayList<AbstractC1089o> arrayList = c1079e.f4450e;
        if (z2 && (iM2612j == 2 || iM2612j2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC1089o abstractC1089o = (AbstractC1089o) it.next();
                if (abstractC1089o.f4484f == i2 && !abstractC1089o.mo2655k()) {
                    z2 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z2 && iM2612j == 2) {
                    c1064e.m2600M(1);
                    c1064e.m2602O(c1079e.m2661d(c1064e, 0));
                    c1064e.f4305d.f4483e.mo2667d(c1064e.m2617q());
                }
            } else if (z2 && iM2612j2 == 2) {
                c1064e.m2601N(1);
                c1064e.m2599L(c1079e.m2661d(c1064e, 1));
                c1064e.f4307e.f4483e.mo2667d(c1064e.m2613k());
            }
        }
        int[] iArr = c1064e.f4330p0;
        if (i2 == 0) {
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int iM2617q = c1064e.m2617q() + iM2618r;
                c1064e.f4305d.f4487i.mo2667d(iM2617q);
                c1064e.f4305d.f4483e.mo2667d(iM2617q - iM2618r);
                z3 = true;
            }
            z3 = false;
        } else {
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int iM2613k = c1064e.m2613k() + iM2619s;
                c1064e.f4307e.f4487i.mo2667d(iM2613k);
                c1064e.f4307e.f4483e.mo2667d(iM2613k - iM2619s);
                z3 = true;
            }
            z3 = false;
        }
        c1079e.m2664g();
        for (AbstractC1089o abstractC1089o2 : arrayList) {
            if (abstractC1089o2.f4484f == i2 && (abstractC1089o2.f4480b != c1064e || abstractC1089o2.f4485g)) {
                abstractC1089o2.mo2652e();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z4 = true;
                break;
            }
            AbstractC1089o abstractC1089o3 = (AbstractC1089o) it2.next();
            if (abstractC1089o3.f4484f == i2 && (z3 || abstractC1089o3.f4480b != c1064e)) {
                if (!abstractC1089o3.f4486h.f4463j || !abstractC1089o3.f4487i.f4463j || (!(abstractC1089o3 instanceof C1077c) && !abstractC1089o3.f4483e.f4463j)) {
                    break;
                }
            }
        }
        c1064e.m2600M(iM2612j);
        c1064e.m2601N(iM2612j2);
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0844 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0851 A[LOOP:14: B:500:0x084f->B:501:0x0851, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0128  */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX INFO: renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2631U() {
        Object[] objArr;
        C1062c c1062c;
        int i2;
        int i3;
        boolean z2;
        char c2;
        int i4;
        boolean z3;
        boolean z4;
        C1062c c1062c2;
        boolean z5;
        boolean[] zArr;
        boolean z6;
        int iMax;
        ?? r14;
        boolean z7;
        int iMax2;
        boolean z8;
        boolean z9;
        int i5;
        int i6;
        int iMax3;
        int iMax4;
        WeakReference weakReference;
        char c3;
        C1088n c1088n;
        int iM2685b;
        int iM2685b2;
        int i7;
        C1088n c1088n2;
        C1088n c1088n3;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i8;
        boolean z11;
        this.f4297Y = 0;
        this.f4298Z = 0;
        this.f4345E0 = false;
        this.f4346F0 = false;
        int size = this.f4353q0.size();
        int iMax5 = Math.max(0, m2617q());
        int iMax6 = Math.max(0, m2613k());
        int[] iArr = this.f4330p0;
        int i9 = iArr[1];
        int i10 = iArr[0];
        int i11 = this.f4356t0;
        C1062c c1062c3 = this.f4282J;
        C1062c c1062c4 = this.f4281I;
        if (i11 == 0 && AbstractC1069j.m2648c(this.f4344D0, 1)) {
            C1103f c1103f = this.f4357u0;
            int i12 = iArr[0];
            int i13 = iArr[1];
            m2594E();
            ArrayList arrayList6 = this.f4353q0;
            int size2 = arrayList6.size();
            for (int i14 = 0; i14 < size2; i14++) {
                ((C1063d) arrayList6.get(i14)).m2594E();
            }
            boolean z12 = this.f4358v0;
            if (i12 == 1) {
                m2597J(0, m2617q());
            } else {
                c1062c4.m2587l(0);
                this.f4297Y = 0;
            }
            int i15 = 0;
            boolean z13 = false;
            boolean z14 = false;
            while (i15 < size2) {
                int[] iArr2 = iArr;
                C1063d c1063d = (C1063d) arrayList6.get(i15);
                int i16 = i15;
                if (c1063d instanceof C1067h) {
                    C1067h c1067h = (C1067h) c1063d;
                    z11 = z13;
                    if (c1067h.f4421u0 == 1) {
                        int i17 = c1067h.f4418r0;
                        if (i17 != -1) {
                            c1067h.m2643R(i17);
                        } else if (c1067h.f4419s0 != -1 && mo2570A()) {
                            c1067h.m2643R(m2617q() - c1067h.f4419s0);
                        } else if (mo2570A()) {
                            c1067h.m2643R((int) ((c1067h.f4417q0 * m2617q()) + 0.5f));
                        }
                        z11 = true;
                    }
                } else {
                    z11 = z13;
                    if ((c1063d instanceof C1060a) && ((C1060a) c1063d).m2573U() == 0) {
                        z13 = z11;
                        z14 = true;
                    }
                    i15 = i16 + 1;
                    iArr = iArr2;
                }
                z13 = z11;
                i15 = i16 + 1;
                iArr = iArr2;
            }
            objArr = iArr;
            if (z13) {
                for (int i18 = 0; i18 < size2; i18 = i8 + 1) {
                    C1063d c1063d2 = (C1063d) arrayList6.get(i18);
                    if (c1063d2 instanceof C1067h) {
                        C1067h c1067h2 = (C1067h) c1063d2;
                        i8 = i18;
                        if (c1067h2.f4421u0 == 1) {
                            AbstractC1082h.m2670c(0, c1067h2, c1103f, z12);
                        }
                    } else {
                        i8 = i18;
                    }
                }
            }
            AbstractC1082h.m2670c(0, this, c1103f, z12);
            if (z14) {
                for (int i19 = 0; i19 < size2; i19++) {
                    C1063d c1063d3 = (C1063d) arrayList6.get(i19);
                    if (c1063d3 instanceof C1060a) {
                        C1060a c1060a = (C1060a) c1063d3;
                        if (c1060a.m2573U() == 0 && c1060a.m2572T()) {
                            AbstractC1082h.m2670c(1, c1060a, c1103f, z12);
                        }
                    }
                }
            }
            if (i13 == 1) {
                m2598K(0, m2613k());
            } else {
                c1062c3.m2587l(0);
                this.f4298Z = 0;
            }
            int i20 = 0;
            boolean z15 = false;
            boolean z16 = false;
            while (i20 < size2) {
                C1063d c1063d4 = (C1063d) arrayList6.get(i20);
                int i21 = i20;
                if (c1063d4 instanceof C1067h) {
                    C1067h c1067h3 = (C1067h) c1063d4;
                    if (c1067h3.f4421u0 == 0) {
                        int i22 = c1067h3.f4418r0;
                        if (i22 != -1) {
                            c1067h3.m2643R(i22);
                        } else if (c1067h3.f4419s0 != -1 && mo2571B()) {
                            c1067h3.m2643R(m2613k() - c1067h3.f4419s0);
                        } else if (mo2571B()) {
                            c1067h3.m2643R((int) ((c1067h3.f4417q0 * m2613k()) + 0.5f));
                        }
                        z15 = true;
                    }
                } else if ((c1063d4 instanceof C1060a) && ((C1060a) c1063d4).m2573U() == 1) {
                    z16 = true;
                }
                i20 = i21 + 1;
            }
            if (z15) {
                for (int i23 = 0; i23 < size2; i23++) {
                    C1063d c1063d5 = (C1063d) arrayList6.get(i23);
                    if (c1063d5 instanceof C1067h) {
                        C1067h c1067h4 = (C1067h) c1063d5;
                        if (c1067h4.f4421u0 == 0) {
                            AbstractC1082h.m2676i(1, c1067h4, c1103f);
                        }
                    }
                }
            }
            AbstractC1082h.m2676i(0, this, c1103f);
            if (z16) {
                for (int i24 = 0; i24 < size2; i24++) {
                    C1063d c1063d6 = (C1063d) arrayList6.get(i24);
                    if (c1063d6 instanceof C1060a) {
                        C1060a c1060a2 = (C1060a) c1063d6;
                        if (c1060a2.m2573U() == 1 && c1060a2.m2572T()) {
                            AbstractC1082h.m2676i(1, c1060a2, c1103f);
                        }
                    }
                }
            }
            for (int i25 = 0; i25 < size2; i25++) {
                C1063d c1063d7 = (C1063d) arrayList6.get(i25);
                if (c1063d7.m2626z() && AbstractC1082h.m2668a(c1063d7)) {
                    m2627V(c1063d7, c1103f, AbstractC1082h.f4467a);
                    if (!(c1063d7 instanceof C1067h)) {
                        AbstractC1082h.m2670c(0, c1063d7, c1103f, z12);
                        AbstractC1082h.m2676i(0, c1063d7, c1103f);
                    } else if (((C1067h) c1063d7).f4421u0 == 0) {
                        AbstractC1082h.m2676i(0, c1063d7, c1103f);
                    } else {
                        AbstractC1082h.m2670c(0, c1063d7, c1103f, z12);
                    }
                }
            }
            for (int i26 = 0; i26 < size; i26++) {
                C1063d c1063d8 = (C1063d) this.f4353q0.get(i26);
                if (c1063d8.m2626z() && !(c1063d8 instanceof C1067h) && !(c1063d8 instanceof C1060a) && !(c1063d8 instanceof C1066g) && !c1063d8.f4278F) {
                    int iM2612j = c1063d8.m2612j(0);
                    int iM2612j2 = c1063d8.m2612j(1);
                    if (iM2612j != 3 || c1063d8.f4332r == 1 || iM2612j2 != 3 || c1063d8.f4333s == 1) {
                        m2627V(c1063d8, this.f4357u0, new C1076b());
                    }
                }
            }
        } else {
            objArr = iArr;
        }
        C1046c c1046c = this.f4359w0;
        if (size > 2 && ((i10 == 2 || i9 == 2) && AbstractC1069j.m2648c(this.f4344D0, 1024))) {
            C1103f c1103f2 = this.f4357u0;
            ArrayList arrayList7 = this.f4353q0;
            int size3 = arrayList7.size();
            int i27 = 0;
            while (true) {
                if (i27 < size3) {
                    C1063d c1063d9 = (C1063d) arrayList7.get(i27);
                    char c4 = objArr[0];
                    char c5 = objArr[1];
                    int i28 = i27;
                    int[] iArr3 = c1063d9.f4330p0;
                    c1062c = c1062c4;
                    if (!AbstractC1082h.m2675h(c4, c5, iArr3[0], iArr3[1]) || (c1063d9 instanceof C1066g)) {
                        break;
                    }
                    i27 = i28 + 1;
                    c1062c4 = c1062c;
                } else {
                    c1062c = c1062c4;
                    int i29 = 0;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    ArrayList arrayList11 = null;
                    ArrayList arrayList12 = null;
                    ArrayList arrayList13 = null;
                    while (i29 < size3) {
                        int i30 = i29;
                        C1063d c1063d10 = (C1063d) arrayList7.get(i29);
                        ArrayList arrayList14 = arrayList8;
                        char c6 = objArr[0];
                        ArrayList arrayList15 = arrayList9;
                        char c7 = objArr[1];
                        ArrayList arrayList16 = arrayList10;
                        int[] iArr4 = c1063d10.f4330p0;
                        ArrayList arrayList17 = arrayList11;
                        if (!AbstractC1082h.m2675h(c6, c7, iArr4[0], iArr4[1])) {
                            m2627V(c1063d10, c1103f2, this.f4352L0);
                        }
                        boolean z17 = c1063d10 instanceof C1067h;
                        if (z17) {
                            C1067h c1067h5 = (C1067h) c1063d10;
                            if (c1067h5.f4421u0 == 0) {
                                arrayList2 = arrayList16 == null ? new ArrayList() : arrayList16;
                                arrayList2.add(c1067h5);
                            } else {
                                arrayList2 = arrayList16;
                            }
                            z10 = z17;
                            if (c1067h5.f4421u0 == 1) {
                                arrayList = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList.add(c1067h5);
                            } else {
                                arrayList = arrayList14;
                            }
                        } else {
                            z10 = z17;
                            arrayList = arrayList14;
                            arrayList2 = arrayList16;
                        }
                        if (!(c1063d10 instanceof AbstractC1068i)) {
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            arrayList9 = arrayList15;
                        } else if (c1063d10 instanceof C1060a) {
                            C1060a c1060a3 = (C1060a) c1063d10;
                            if (c1060a3.m2573U() == 0) {
                                arrayList5 = arrayList15 == null ? new ArrayList() : arrayList15;
                                arrayList5.add(c1060a3);
                            } else {
                                arrayList5 = arrayList15;
                            }
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            if (c1060a3.m2573U() == 1) {
                                ArrayList arrayList18 = arrayList17 == null ? new ArrayList() : arrayList17;
                                arrayList18.add(c1060a3);
                                arrayList17 = arrayList18;
                            }
                            arrayList9 = arrayList5;
                        } else {
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            AbstractC1068i abstractC1068i = (AbstractC1068i) c1063d10;
                            arrayList9 = arrayList15 == null ? new ArrayList() : arrayList15;
                            arrayList9.add(abstractC1068i);
                            arrayList11 = arrayList17 == null ? new ArrayList() : arrayList17;
                            arrayList11.add(abstractC1068i);
                            if (c1063d10.f4281I.f4269f == null && c1063d10.f4283K.f4269f == null && !z10 && !(c1063d10 instanceof C1060a)) {
                                if (arrayList12 == null) {
                                    arrayList12 = new ArrayList();
                                }
                                ArrayList arrayList19 = arrayList12;
                                arrayList19.add(c1063d10);
                                arrayList12 = arrayList19;
                            }
                            if (c1063d10.f4282J.f4269f != null && c1063d10.f4284L.f4269f == null && c1063d10.f4285M.f4269f == null && !z10 && !(c1063d10 instanceof C1060a)) {
                                if (arrayList13 == null) {
                                    arrayList13 = new ArrayList();
                                }
                                ArrayList arrayList20 = arrayList13;
                                arrayList20.add(c1063d10);
                                arrayList13 = arrayList20;
                            }
                            i29 = i30 + 1;
                            arrayList8 = arrayList3;
                            arrayList10 = arrayList4;
                        }
                        arrayList11 = arrayList17;
                        if (c1063d10.f4281I.f4269f == null) {
                            if (arrayList12 == null) {
                            }
                            ArrayList arrayList192 = arrayList12;
                            arrayList192.add(c1063d10);
                            arrayList12 = arrayList192;
                        }
                        if (c1063d10.f4282J.f4269f != null) {
                        }
                        i29 = i30 + 1;
                        arrayList8 = arrayList3;
                        arrayList10 = arrayList4;
                    }
                    ArrayList arrayList21 = arrayList8;
                    ArrayList<AbstractC1068i> arrayList22 = arrayList9;
                    ArrayList arrayList23 = arrayList10;
                    ArrayList<AbstractC1068i> arrayList24 = arrayList11;
                    ArrayList<C1088n> arrayList25 = new ArrayList();
                    if (arrayList21 != null) {
                        Iterator it = arrayList21.iterator();
                        while (it.hasNext()) {
                            AbstractC1082h.m2669b((C1067h) it.next(), 0, arrayList25, null);
                        }
                    }
                    int i31 = 0;
                    C1088n c1088n4 = null;
                    if (arrayList22 != null) {
                        for (AbstractC1068i abstractC1068i2 : arrayList22) {
                            C1088n c1088nM2669b = AbstractC1082h.m2669b(abstractC1068i2, i31, arrayList25, c1088n4);
                            abstractC1068i2.m2645R(i31, arrayList25, c1088nM2669b);
                            c1088nM2669b.m2684a(arrayList25);
                            i31 = 0;
                            c1088n4 = null;
                        }
                    }
                    HashSet hashSet = mo2611i(2).f4264a;
                    if (hashSet != null) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            AbstractC1082h.m2669b(((C1062c) it2.next()).f4267d, 0, arrayList25, null);
                        }
                    }
                    HashSet hashSet2 = mo2611i(4).f4264a;
                    if (hashSet2 != null) {
                        Iterator it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            AbstractC1082h.m2669b(((C1062c) it3.next()).f4267d, 0, arrayList25, null);
                        }
                    }
                    HashSet hashSet3 = mo2611i(7).f4264a;
                    if (hashSet3 != null) {
                        Iterator it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            AbstractC1082h.m2669b(((C1062c) it4.next()).f4267d, 0, arrayList25, null);
                        }
                    }
                    C1088n c1088n5 = null;
                    if (arrayList12 != null) {
                        Iterator it5 = arrayList12.iterator();
                        while (it5.hasNext()) {
                            AbstractC1082h.m2669b((C1063d) it5.next(), 0, arrayList25, null);
                        }
                    }
                    if (arrayList23 != null) {
                        Iterator it6 = arrayList23.iterator();
                        while (it6.hasNext()) {
                            AbstractC1082h.m2669b((C1067h) it6.next(), 1, arrayList25, null);
                        }
                    }
                    int i32 = 1;
                    if (arrayList24 != null) {
                        for (AbstractC1068i abstractC1068i3 : arrayList24) {
                            C1088n c1088nM2669b2 = AbstractC1082h.m2669b(abstractC1068i3, i32, arrayList25, c1088n5);
                            abstractC1068i3.m2645R(i32, arrayList25, c1088nM2669b2);
                            c1088nM2669b2.m2684a(arrayList25);
                            i32 = 1;
                            c1088n5 = null;
                        }
                    }
                    HashSet hashSet4 = mo2611i(3).f4264a;
                    if (hashSet4 != null) {
                        Iterator it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            AbstractC1082h.m2669b(((C1062c) it7.next()).f4267d, 1, arrayList25, null);
                        }
                    }
                    HashSet hashSet5 = mo2611i(6).f4264a;
                    if (hashSet5 != null) {
                        Iterator it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            AbstractC1082h.m2669b(((C1062c) it8.next()).f4267d, 1, arrayList25, null);
                        }
                    }
                    HashSet hashSet6 = mo2611i(5).f4264a;
                    if (hashSet6 != null) {
                        Iterator it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            AbstractC1082h.m2669b(((C1062c) it9.next()).f4267d, 1, arrayList25, null);
                        }
                    }
                    HashSet hashSet7 = mo2611i(7).f4264a;
                    if (hashSet7 != null) {
                        Iterator it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            AbstractC1082h.m2669b(((C1062c) it10.next()).f4267d, 1, arrayList25, null);
                        }
                    }
                    if (arrayList13 != null) {
                        Iterator it11 = arrayList13.iterator();
                        while (it11.hasNext()) {
                            AbstractC1082h.m2669b((C1063d) it11.next(), 1, arrayList25, null);
                        }
                    }
                    int i33 = 0;
                    while (i33 < size3) {
                        C1063d c1063d11 = (C1063d) arrayList7.get(i33);
                        int[] iArr5 = c1063d11.f4330p0;
                        if (iArr5[0] == 3 && iArr5[1] == 3) {
                            int i34 = c1063d11.f4326n0;
                            int size4 = arrayList25.size();
                            int i35 = 0;
                            while (true) {
                                if (i35 >= size4) {
                                    i7 = i33;
                                    c1088n2 = null;
                                    break;
                                }
                                i7 = i33;
                                c1088n2 = (C1088n) arrayList25.get(i35);
                                int i36 = size4;
                                if (i34 == c1088n2.f4475b) {
                                    break;
                                }
                                i35++;
                                size4 = i36;
                                i33 = i7;
                            }
                            int i37 = c1063d11.f4328o0;
                            int size5 = arrayList25.size();
                            int i38 = 0;
                            while (true) {
                                if (i38 >= size5) {
                                    c1088n3 = null;
                                    break;
                                }
                                c1088n3 = (C1088n) arrayList25.get(i38);
                                int i39 = size5;
                                if (i37 == c1088n3.f4475b) {
                                    break;
                                }
                                i38++;
                                size5 = i39;
                            }
                            if (c1088n2 != null && c1088n3 != null) {
                                c1088n2.m2686c(0, c1088n3);
                                c1088n3.f4476c = 2;
                                arrayList25.remove(c1088n2);
                            }
                        } else {
                            i7 = i33;
                        }
                        i33 = i7 + 1;
                    }
                    if (arrayList25.size() > 1) {
                        if (objArr[0] == 2) {
                            int i40 = 0;
                            c1088n = null;
                            for (C1088n c1088n6 : arrayList25) {
                                if (c1088n6.f4476c != 1 && (iM2685b2 = c1088n6.m2685b(c1046c, 0)) > i40) {
                                    c1088n = c1088n6;
                                    i40 = iM2685b2;
                                }
                            }
                            c3 = 1;
                            if (c1088n != null) {
                                m2600M(1);
                                m2602O(i40);
                            }
                            if (objArr[c3] != 2) {
                                int i41 = 0;
                                C1088n c1088n7 = null;
                                for (C1088n c1088n8 : arrayList25) {
                                    if (c1088n8.f4476c != 0 && (iM2685b = c1088n8.m2685b(c1046c, 1)) > i41) {
                                        c1088n7 = c1088n8;
                                        i41 = iM2685b;
                                    }
                                }
                                if (c1088n7 != null) {
                                    m2601N(1);
                                    m2599L(i41);
                                } else {
                                    c1088n7 = null;
                                }
                                if (c1088n != null || c1088n7 != null) {
                                    if (i10 == 2) {
                                        if (iMax5 >= m2617q() || iMax5 <= 0) {
                                            iMax5 = m2617q();
                                        } else {
                                            m2602O(iMax5);
                                            this.f4345E0 = true;
                                        }
                                    }
                                    if (i9 == 2) {
                                        if (iMax6 >= m2613k() || iMax6 <= 0) {
                                            iMax6 = m2613k();
                                        } else {
                                            m2599L(iMax6);
                                            this.f4346F0 = true;
                                        }
                                    }
                                    i2 = iMax6;
                                    i3 = iMax5;
                                    z2 = true;
                                }
                            }
                        } else {
                            c3 = 1;
                        }
                        c1088n = null;
                        if (objArr[c3] != 2) {
                        }
                    }
                }
            }
            boolean z18 = !m2632W(64) || m2632W(128);
            c1046c.getClass();
            c1046c.f4161h = false;
            if (this.f4344D0 == 0 && z18) {
                c2 = 1;
                c1046c.f4161h = true;
            } else {
                c2 = 1;
            }
            ArrayList arrayList26 = this.f4353q0;
            boolean z19 = objArr[0] != 2 || objArr[c2] == 2;
            this.f4362z0 = 0;
            this.f4341A0 = 0;
            for (i4 = 0; i4 < size; i4++) {
                C1063d c1063d12 = (C1063d) this.f4353q0.get(i4);
                if (c1063d12 instanceof C1064e) {
                    ((C1064e) c1063d12).m2631U();
                }
            }
            boolean zM2632W = m2632W(64);
            z3 = z2;
            int i42 = 0;
            z4 = true;
            while (z4) {
                int i43 = i42 + 1;
                try {
                    c1046c.m2542t();
                    this.f4362z0 = 0;
                    this.f4341A0 = 0;
                    m2609g(c1046c);
                    for (int i44 = 0; i44 < size; i44++) {
                        ((C1063d) this.f4353q0.get(i44)).m2609g(c1046c);
                    }
                    m2629S(c1046c);
                    try {
                        WeakReference weakReference2 = this.f4347G0;
                        if (weakReference2 == null || weakReference2.get() == null) {
                            c1062c2 = c1062c3;
                            z5 = z19;
                        } else {
                            C1062c c1062c5 = (C1062c) this.f4347G0.get();
                            C1049f c1049fM2534k = c1046c.m2534k(c1062c3);
                            C1046c c1046c2 = this.f4359w0;
                            c1062c2 = c1062c3;
                            z5 = z19;
                            try {
                                c1046c2.m2529f(c1046c2.m2534k(c1062c5), c1049fM2534k, 0, 5);
                                this.f4347G0 = null;
                            } catch (Exception e2) {
                                e = e2;
                                z4 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr2 = AbstractC1069j.f4425a;
                                if (z4) {
                                }
                                if (z5) {
                                }
                                iMax = Math.max(this.f4302b0, m2617q());
                                if (iMax <= m2617q()) {
                                }
                                iMax2 = Math.max(this.f4304c0, m2613k());
                                if (iMax2 <= m2613k()) {
                                }
                                if (!z8) {
                                }
                                z3 = z8;
                                z9 = z6;
                                i5 = 8;
                                if (i43 > i5) {
                                }
                                i42 = i43;
                                c1062c3 = c1062c2;
                                z19 = z5;
                            }
                        }
                        WeakReference weakReference3 = this.f4349I0;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            C1062c c1062c6 = (C1062c) this.f4349I0.get();
                            C1049f c1049fM2534k2 = c1046c.m2534k(this.f4284L);
                            C1046c c1046c3 = this.f4359w0;
                            c1046c3.m2529f(c1049fM2534k2, c1046c3.m2534k(c1062c6), 0, 5);
                            this.f4349I0 = null;
                        }
                        WeakReference weakReference4 = this.f4348H0;
                        if (weakReference4 == null || weakReference4.get() == null) {
                            weakReference = this.f4350J0;
                            if (weakReference == null && weakReference.get() != null) {
                                C1062c c1062c7 = (C1062c) this.f4350J0.get();
                                C1049f c1049fM2534k3 = c1046c.m2534k(this.f4283K);
                                try {
                                    C1046c c1046c4 = this.f4359w0;
                                    try {
                                        c1046c4.m2529f(c1049fM2534k3, c1046c4.m2534k(c1062c7), 0, 5);
                                    } catch (Exception e3) {
                                        e = e3;
                                        z4 = true;
                                        e.printStackTrace();
                                        System.out.println("EXCEPTION : " + e);
                                    }
                                    try {
                                        this.f4350J0 = null;
                                    } catch (Exception e4) {
                                        e = e4;
                                        z4 = true;
                                        e.printStackTrace();
                                        System.out.println("EXCEPTION : " + e);
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    z4 = true;
                                    e.printStackTrace();
                                    System.out.println("EXCEPTION : " + e);
                                    boolean[] zArr22 = AbstractC1069j.f4425a;
                                    if (z4) {
                                    }
                                    if (z5) {
                                    }
                                    iMax = Math.max(this.f4302b0, m2617q());
                                    if (iMax <= m2617q()) {
                                    }
                                    iMax2 = Math.max(this.f4304c0, m2613k());
                                    if (iMax2 <= m2613k()) {
                                    }
                                    if (!z8) {
                                    }
                                    z3 = z8;
                                    z9 = z6;
                                    i5 = 8;
                                    if (i43 > i5) {
                                    }
                                    i42 = i43;
                                    c1062c3 = c1062c2;
                                    z19 = z5;
                                }
                            }
                            c1046c.m2538p();
                            z4 = true;
                        } else {
                            C1062c c1062c8 = (C1062c) this.f4348H0.get();
                            C1062c c1062c9 = c1062c;
                            try {
                                C1049f c1049fM2534k4 = c1046c.m2534k(c1062c9);
                                C1046c c1046c5 = this.f4359w0;
                                c1062c = c1062c9;
                                c1046c5.m2529f(c1046c5.m2534k(c1062c8), c1049fM2534k4, 0, 5);
                                this.f4348H0 = null;
                                weakReference = this.f4350J0;
                                if (weakReference == null) {
                                    c1046c.m2538p();
                                    z4 = true;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                c1062c = c1062c9;
                                z4 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                boolean[] zArr222 = AbstractC1069j.f4425a;
                                if (z4) {
                                }
                                if (z5) {
                                    int iMax7 = 0;
                                    int iMax8 = 0;
                                    while (i6 < size) {
                                    }
                                    iMax3 = Math.max(this.f4302b0, iMax7);
                                    iMax4 = Math.max(this.f4304c0, iMax8);
                                    if (i10 == 2) {
                                        m2602O(iMax3);
                                        objArr[0] = 2;
                                        z3 = true;
                                        z6 = true;
                                    }
                                    if (i9 == 2) {
                                        m2599L(iMax4);
                                        objArr[1] = 2;
                                        z3 = true;
                                        z6 = true;
                                    }
                                }
                                iMax = Math.max(this.f4302b0, m2617q());
                                if (iMax <= m2617q()) {
                                }
                                iMax2 = Math.max(this.f4304c0, m2613k());
                                if (iMax2 <= m2613k()) {
                                }
                                if (!z8) {
                                }
                                z3 = z8;
                                z9 = z6;
                                i5 = 8;
                                if (i43 > i5) {
                                }
                                i42 = i43;
                                c1062c3 = c1062c2;
                                z19 = z5;
                            }
                        }
                    } catch (Exception e7) {
                        e = e7;
                        c1062c2 = c1062c3;
                        z5 = z19;
                    }
                } catch (Exception e8) {
                    e = e8;
                    c1062c2 = c1062c3;
                    z5 = z19;
                }
                boolean[] zArr2222 = AbstractC1069j.f4425a;
                if (z4) {
                    zArr = zArr2222;
                    mo2604Q(c1046c, zM2632W);
                    for (int i45 = 0; i45 < size; i45++) {
                        ((C1063d) this.f4353q0.get(i45)).mo2604Q(c1046c, zM2632W);
                    }
                    z6 = false;
                } else {
                    zArr2222[2] = false;
                    boolean zM2632W2 = m2632W(64);
                    mo2604Q(c1046c, zM2632W2);
                    int size6 = this.f4353q0.size();
                    int i46 = 0;
                    z6 = false;
                    while (i46 < size6) {
                        C1063d c1063d13 = (C1063d) this.f4353q0.get(i46);
                        c1063d13.mo2604Q(c1046c, zM2632W2);
                        boolean[] zArr3 = zArr2222;
                        boolean z20 = zM2632W2;
                        if (c1063d13.f4313h != -1 || c1063d13.f4315i != -1) {
                            z6 = true;
                        }
                        i46++;
                        zArr2222 = zArr3;
                        zM2632W2 = z20;
                    }
                    zArr = zArr2222;
                }
                if (z5 && i43 < 8 && zArr[2]) {
                    int iMax72 = 0;
                    int iMax82 = 0;
                    for (i6 = 0; i6 < size; i6++) {
                        C1063d c1063d14 = (C1063d) this.f4353q0.get(i6);
                        iMax72 = Math.max(iMax72, c1063d14.m2617q() + c1063d14.f4297Y);
                        iMax82 = Math.max(iMax82, c1063d14.m2613k() + c1063d14.f4298Z);
                    }
                    iMax3 = Math.max(this.f4302b0, iMax72);
                    iMax4 = Math.max(this.f4304c0, iMax82);
                    if (i10 == 2 && m2617q() < iMax3) {
                        m2602O(iMax3);
                        objArr[0] = 2;
                        z3 = true;
                        z6 = true;
                    }
                    if (i9 == 2 && m2613k() < iMax4) {
                        m2599L(iMax4);
                        objArr[1] = 2;
                        z3 = true;
                        z6 = true;
                    }
                }
                iMax = Math.max(this.f4302b0, m2617q());
                if (iMax <= m2617q()) {
                    m2602O(iMax);
                    r14 = 1;
                    objArr[0] = 1;
                    z6 = true;
                    z7 = true;
                } else {
                    r14 = 1;
                    z7 = z3;
                }
                iMax2 = Math.max(this.f4304c0, m2613k());
                if (iMax2 <= m2613k()) {
                    m2599L(iMax2);
                    objArr[r14] = r14;
                    z8 = true;
                    z6 = true;
                } else {
                    z8 = z7;
                }
                if (!z8) {
                    if (objArr[0] == 2 && i3 > 0 && m2617q() > i3) {
                        this.f4345E0 = r14;
                        objArr[0] = r14;
                        m2602O(i3);
                        z8 = true;
                        z6 = true;
                    }
                    if (objArr[r14] == 2 && i2 > 0 && m2613k() > i2) {
                        this.f4346F0 = r14;
                        objArr[r14] = r14;
                        m2599L(i2);
                        i5 = 8;
                        z9 = true;
                        z3 = true;
                    }
                    z4 = i43 > i5 ? false : z9;
                    i42 = i43;
                    c1062c3 = c1062c2;
                    z19 = z5;
                }
                z3 = z8;
                z9 = z6;
                i5 = 8;
                if (i43 > i5) {
                }
                i42 = i43;
                c1062c3 = c1062c2;
                z19 = z5;
            }
            this.f4353q0 = arrayList26;
            if (z3) {
                objArr[0] = i10;
                objArr[1] = i9;
            }
            mo2595F(c1046c.f4166m);
        }
        c1062c = c1062c4;
        i2 = iMax6;
        i3 = iMax5;
        z2 = false;
        if (m2632W(64)) {
        }
        c1046c.getClass();
        c1046c.f4161h = false;
        if (this.f4344D0 == 0) {
            c2 = 1;
        }
        ArrayList arrayList262 = this.f4353q0;
        if (objArr[0] != 2) {
        }
        this.f4362z0 = 0;
        this.f4341A0 = 0;
        while (i4 < size) {
        }
        boolean zM2632W3 = m2632W(64);
        z3 = z2;
        int i422 = 0;
        z4 = true;
        while (z4) {
        }
        this.f4353q0 = arrayList262;
        if (z3) {
        }
        mo2595F(c1046c.f4166m);
    }

    /* JADX INFO: renamed from: W */
    public final boolean m2632W(int i2) {
        return (this.f4344D0 & i2) == i2;
    }

    @Override // p093v.C1063d
    /* JADX INFO: renamed from: n */
    public final void mo2616n(StringBuilder sb) {
        sb.append(this.f4317j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f4293U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f4294V);
        sb.append("\n");
        Iterator it = this.f4353q0.iterator();
        while (it.hasNext()) {
            ((C1063d) it.next()).mo2616n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
