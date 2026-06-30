package p095w;

import java.util.ArrayList;
import java.util.Iterator;
import p093v.C1062c;
import p093v.C1063d;
import p093v.C1064e;

/* JADX INFO: renamed from: w.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1077c extends AbstractC1089o {

    /* JADX INFO: renamed from: k */
    public final ArrayList f4444k;

    /* JADX INFO: renamed from: l */
    public int f4445l;

    public C1077c(C1063d c1063d, int i2) {
        C1063d c1063d2;
        super(c1063d);
        this.f4444k = new ArrayList();
        this.f4484f = i2;
        C1063d c1063d3 = this.f4480b;
        C1063d c1063dM2615m = c1063d3.m2615m(i2);
        while (true) {
            C1063d c1063d4 = c1063dM2615m;
            c1063d2 = c1063d3;
            c1063d3 = c1063d4;
            if (c1063d3 == null) {
                break;
            } else {
                c1063dM2615m = c1063d3.m2615m(this.f4484f);
            }
        }
        this.f4480b = c1063d2;
        int i3 = this.f4484f;
        AbstractC1089o abstractC1089o = i3 == 0 ? c1063d2.f4305d : i3 == 1 ? c1063d2.f4307e : null;
        ArrayList<AbstractC1089o> arrayList = this.f4444k;
        arrayList.add(abstractC1089o);
        C1063d c1063dM2614l = c1063d2.m2614l(this.f4484f);
        while (c1063dM2614l != null) {
            int i4 = this.f4484f;
            arrayList.add(i4 == 0 ? c1063dM2614l.f4305d : i4 == 1 ? c1063dM2614l.f4307e : null);
            c1063dM2614l = c1063dM2614l.m2614l(this.f4484f);
        }
        for (AbstractC1089o abstractC1089o2 : arrayList) {
            int i5 = this.f4484f;
            if (i5 == 0) {
                abstractC1089o2.f4480b.f4301b = this;
            } else if (i5 == 1) {
                abstractC1089o2.f4480b.f4303c = this;
            }
        }
        if (this.f4484f == 0 && ((C1064e) this.f4480b.f4292T).f4358v0 && arrayList.size() > 1) {
            this.f4480b = ((AbstractC1089o) arrayList.get(arrayList.size() - 1)).f4480b;
        }
        this.f4445l = this.f4484f == 0 ? this.f4480b.f4316i0 : this.f4480b.f4318j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0152  */
    @Override // p095w.InterfaceC1078d
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2650a(InterfaceC1078d interfaceC1078d) {
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        float f2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z3;
        int i15;
        C1080f c1080f = this.f4486h;
        if (c1080f.f4463j) {
            C1080f c1080f2 = this.f4487i;
            if (c1080f2.f4463j) {
                C1063d c1063d = this.f4480b.f4292T;
                boolean z4 = c1063d instanceof C1064e ? ((C1064e) c1063d).f4358v0 : false;
                int i16 = c1080f2.f4460g - c1080f.f4460g;
                ArrayList arrayList = this.f4444k;
                int size = arrayList.size();
                int i17 = 0;
                while (true) {
                    i2 = -1;
                    i3 = 8;
                    if (i17 >= size) {
                        i17 = -1;
                        break;
                    } else if (((AbstractC1089o) arrayList.get(i17)).f4480b.f4312g0 != 8) {
                        break;
                    } else {
                        i17++;
                    }
                }
                int i18 = size - 1;
                int i19 = i18;
                while (true) {
                    if (i19 < 0) {
                        break;
                    }
                    if (((AbstractC1089o) arrayList.get(i19)).f4480b.f4312g0 != 8) {
                        i2 = i19;
                        break;
                    }
                    i19--;
                }
                int i20 = 0;
                while (i20 < 2) {
                    int i21 = 0;
                    i6 = 0;
                    int i22 = 0;
                    int i23 = 0;
                    f = 0.0f;
                    while (i21 < size) {
                        AbstractC1089o abstractC1089o = (AbstractC1089o) arrayList.get(i21);
                        C1063d c1063d2 = abstractC1089o.f4480b;
                        boolean z5 = z4;
                        if (c1063d2.f4312g0 == i3) {
                            i14 = i20;
                        } else {
                            i23++;
                            if (i21 > 0 && i21 >= i17) {
                                i6 += abstractC1089o.f4486h.f4459f;
                            }
                            C1081g c1081g = abstractC1089o.f4483e;
                            int i24 = c1081g.f4460g;
                            i14 = i20;
                            boolean z6 = abstractC1089o.f4482d != 3;
                            if (z6) {
                                int i25 = this.f4484f;
                                if (i25 == 0 && !c1063d2.f4305d.f4483e.f4463j) {
                                    return;
                                }
                                if (i25 == 1 && !c1063d2.f4307e.f4483e.f4463j) {
                                    return;
                                } else {
                                    z3 = z6;
                                }
                            } else {
                                z3 = z6;
                                if (abstractC1089o.f4479a == 1 && i14 == 0) {
                                    i15 = c1081g.f4466m;
                                    i22++;
                                } else if (c1081g.f4463j) {
                                    i15 = i24;
                                }
                                z3 = true;
                                if (z3) {
                                    i22++;
                                    float f3 = c1063d2.f4320k0[this.f4484f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i6 += i15;
                                }
                                if (i21 >= i18 && i21 < i2) {
                                    i6 += -abstractC1089o.f4487i.f4459f;
                                }
                            }
                            i15 = i24;
                            if (z3) {
                            }
                            if (i21 >= i18) {
                            }
                        }
                        i21++;
                        z4 = z5;
                        i20 = i14;
                        i3 = 8;
                    }
                    z2 = z4;
                    int i26 = i20;
                    if (i6 < i16 || i22 == 0) {
                        i4 = i22;
                        i5 = i23;
                        break;
                    } else {
                        i20 = i26 + 1;
                        z4 = z2;
                        i3 = 8;
                    }
                }
                z2 = z4;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                f = 0.0f;
                int i27 = c1080f.f4460g;
                if (z2) {
                    i27 = c1080f2.f4460g;
                }
                if (i6 > i16) {
                    i27 = z2 ? i27 + ((int) (((i6 - i16) / 2.0f) + 0.5f)) : i27 - ((int) (((i6 - i16) / 2.0f) + 0.5f));
                }
                if (i4 > 0) {
                    float f4 = i16 - i6;
                    int i28 = (int) ((f4 / i4) + 0.5f);
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < size) {
                        AbstractC1089o abstractC1089o2 = (AbstractC1089o) arrayList.get(i29);
                        int i31 = i27;
                        C1063d c1063d3 = abstractC1089o2.f4480b;
                        int i32 = i4;
                        float f5 = f4;
                        if (c1063d3.f4312g0 != 8 && abstractC1089o2.f4482d == 3) {
                            C1081g c1081g2 = abstractC1089o2.f4483e;
                            if (c1081g2.f4463j) {
                                i10 = i28;
                                i13 = i29;
                            } else {
                                if (f > 0.0f) {
                                    i9 = (int) (((c1063d3.f4320k0[this.f4484f] * f5) / f) + 0.5f);
                                    i10 = i28;
                                } else {
                                    i9 = i28;
                                    i10 = i9;
                                }
                                if (this.f4484f == 0) {
                                    i11 = c1063d3.f4336v;
                                    i12 = c1063d3.f4335u;
                                } else {
                                    i11 = c1063d3.f4339y;
                                    i12 = c1063d3.f4338x;
                                }
                                i13 = i29;
                                int iMax = Math.max(i12, abstractC1089o2.f4479a == 1 ? Math.min(i9, c1081g2.f4466m) : i9);
                                if (i11 > 0) {
                                    iMax = Math.min(i11, iMax);
                                }
                                if (iMax != i9) {
                                    i30++;
                                    i9 = iMax;
                                }
                                c1081g2.mo2667d(i9);
                            }
                        }
                        i29 = i13 + 1;
                        i27 = i31;
                        i4 = i32;
                        f4 = f5;
                        i28 = i10;
                    }
                    i7 = i27;
                    int i33 = i4;
                    f2 = 0.5f;
                    if (i30 > 0) {
                        i4 = i33 - i30;
                        i6 = 0;
                        for (int i34 = 0; i34 < size; i34++) {
                            AbstractC1089o abstractC1089o3 = (AbstractC1089o) arrayList.get(i34);
                            if (abstractC1089o3.f4480b.f4312g0 != 8) {
                                if (i34 > 0 && i34 >= i17) {
                                    i6 += abstractC1089o3.f4486h.f4459f;
                                }
                                i6 += abstractC1089o3.f4483e.f4460g;
                                if (i34 < i18 && i34 < i2) {
                                    i6 += -abstractC1089o3.f4487i.f4459f;
                                }
                            }
                        }
                    } else {
                        i4 = i33;
                    }
                    i8 = 2;
                    if (this.f4445l == 2 && i30 == 0) {
                        this.f4445l = 0;
                    }
                } else {
                    i7 = i27;
                    i8 = 2;
                    f2 = 0.5f;
                }
                if (i6 > i16) {
                    this.f4445l = i8;
                }
                if (i5 > 0 && i4 == 0 && i17 == i2) {
                    this.f4445l = i8;
                }
                int i35 = this.f4445l;
                if (i35 == 1) {
                    int i36 = i5 > 1 ? (i16 - i6) / (i5 - 1) : i5 == 1 ? (i16 - i6) / 2 : 0;
                    if (i4 > 0) {
                        i36 = 0;
                    }
                    int i37 = i7;
                    for (int i38 = 0; i38 < size; i38++) {
                        AbstractC1089o abstractC1089o4 = (AbstractC1089o) arrayList.get(z2 ? size - (i38 + 1) : i38);
                        int i39 = abstractC1089o4.f4480b.f4312g0;
                        C1080f c1080f3 = abstractC1089o4.f4487i;
                        C1080f c1080f4 = abstractC1089o4.f4486h;
                        if (i39 == 8) {
                            c1080f4.mo2667d(i37);
                            c1080f3.mo2667d(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z2 ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i17) {
                                i37 = z2 ? i37 - c1080f4.f4459f : i37 + c1080f4.f4459f;
                            }
                            if (z2) {
                                c1080f3.mo2667d(i37);
                            } else {
                                c1080f4.mo2667d(i37);
                            }
                            C1081g c1081g3 = abstractC1089o4.f4483e;
                            int i40 = c1081g3.f4460g;
                            if (abstractC1089o4.f4482d == 3 && abstractC1089o4.f4479a == 1) {
                                i40 = c1081g3.f4466m;
                            }
                            i37 = z2 ? i37 - i40 : i37 + i40;
                            if (z2) {
                                c1080f4.mo2667d(i37);
                            } else {
                                c1080f3.mo2667d(i37);
                            }
                            abstractC1089o4.f4485g = true;
                            if (i38 < i18 && i38 < i2) {
                                i37 = z2 ? i37 - (-c1080f3.f4459f) : i37 + (-c1080f3.f4459f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i41 = (i16 - i6) / (i5 + 1);
                    if (i4 > 0) {
                        i41 = 0;
                    }
                    int i42 = i7;
                    for (int i43 = 0; i43 < size; i43++) {
                        AbstractC1089o abstractC1089o5 = (AbstractC1089o) arrayList.get(z2 ? size - (i43 + 1) : i43);
                        int i44 = abstractC1089o5.f4480b.f4312g0;
                        C1080f c1080f5 = abstractC1089o5.f4487i;
                        C1080f c1080f6 = abstractC1089o5.f4486h;
                        if (i44 == 8) {
                            c1080f6.mo2667d(i42);
                            c1080f5.mo2667d(i42);
                        } else {
                            int i45 = z2 ? i42 - i41 : i42 + i41;
                            if (i43 > 0 && i43 >= i17) {
                                i45 = z2 ? i45 - c1080f6.f4459f : i45 + c1080f6.f4459f;
                            }
                            if (z2) {
                                c1080f5.mo2667d(i45);
                            } else {
                                c1080f6.mo2667d(i45);
                            }
                            C1081g c1081g4 = abstractC1089o5.f4483e;
                            int iMin = c1081g4.f4460g;
                            if (abstractC1089o5.f4482d == 3 && abstractC1089o5.f4479a == 1) {
                                iMin = Math.min(iMin, c1081g4.f4466m);
                            }
                            i42 = z2 ? i45 - iMin : i45 + iMin;
                            if (z2) {
                                c1080f6.mo2667d(i42);
                            } else {
                                c1080f5.mo2667d(i42);
                            }
                            if (i43 < i18 && i43 < i2) {
                                i42 = z2 ? i42 - (-c1080f5.f4459f) : i42 + (-c1080f5.f4459f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    float f6 = this.f4484f == 0 ? this.f4480b.f4306d0 : this.f4480b.f4308e0;
                    if (z2) {
                        f6 = 1.0f - f6;
                    }
                    int i46 = (int) (((i16 - i6) * f6) + f2);
                    if (i46 < 0 || i4 > 0) {
                        i46 = 0;
                    }
                    int i47 = z2 ? i7 - i46 : i7 + i46;
                    for (int i48 = 0; i48 < size; i48++) {
                        AbstractC1089o abstractC1089o6 = (AbstractC1089o) arrayList.get(z2 ? size - (i48 + 1) : i48);
                        int i49 = abstractC1089o6.f4480b.f4312g0;
                        C1080f c1080f7 = abstractC1089o6.f4487i;
                        C1080f c1080f8 = abstractC1089o6.f4486h;
                        if (i49 == 8) {
                            c1080f8.mo2667d(i47);
                            c1080f7.mo2667d(i47);
                        } else {
                            if (i48 > 0 && i48 >= i17) {
                                i47 = z2 ? i47 - c1080f8.f4459f : i47 + c1080f8.f4459f;
                            }
                            if (z2) {
                                c1080f7.mo2667d(i47);
                            } else {
                                c1080f8.mo2667d(i47);
                            }
                            C1081g c1081g5 = abstractC1089o6.f4483e;
                            int i50 = c1081g5.f4460g;
                            if (abstractC1089o6.f4482d == 3 && abstractC1089o6.f4479a == 1) {
                                i50 = c1081g5.f4466m;
                            }
                            i47 = z2 ? i47 - i50 : i47 + i50;
                            if (z2) {
                                c1080f8.mo2667d(i47);
                            } else {
                                c1080f7.mo2667d(i47);
                            }
                            if (i48 < i18 && i48 < i2) {
                                i47 = z2 ? i47 - (-c1080f7.f4459f) : i47 + (-c1080f7.f4459f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: d */
    public final void mo2651d() {
        ArrayList arrayList = this.f4444k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC1089o) it.next()).mo2651d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C1063d c1063d = ((AbstractC1089o) arrayList.get(0)).f4480b;
        C1063d c1063d2 = ((AbstractC1089o) arrayList.get(size - 1)).f4480b;
        int i2 = this.f4484f;
        C1080f c1080f = this.f4487i;
        C1080f c1080f2 = this.f4486h;
        if (i2 == 0) {
            C1062c c1062c = c1063d.f4281I;
            C1062c c1062c2 = c1063d2.f4283K;
            C1080f c1080fM2689i = AbstractC1089o.m2689i(c1062c, 0);
            int iM2580e = c1062c.m2580e();
            C1063d c1063dM2656m = m2656m();
            if (c1063dM2656m != null) {
                iM2580e = c1063dM2656m.f4281I.m2580e();
            }
            if (c1080fM2689i != null) {
                AbstractC1089o.m2687b(c1080f2, c1080fM2689i, iM2580e);
            }
            C1080f c1080fM2689i2 = AbstractC1089o.m2689i(c1062c2, 0);
            int iM2580e2 = c1062c2.m2580e();
            C1063d c1063dM2657n = m2657n();
            if (c1063dM2657n != null) {
                iM2580e2 = c1063dM2657n.f4283K.m2580e();
            }
            if (c1080fM2689i2 != null) {
                AbstractC1089o.m2687b(c1080f, c1080fM2689i2, -iM2580e2);
            }
        } else {
            C1062c c1062c3 = c1063d.f4282J;
            C1062c c1062c4 = c1063d2.f4284L;
            C1080f c1080fM2689i3 = AbstractC1089o.m2689i(c1062c3, 1);
            int iM2580e3 = c1062c3.m2580e();
            C1063d c1063dM2656m2 = m2656m();
            if (c1063dM2656m2 != null) {
                iM2580e3 = c1063dM2656m2.f4282J.m2580e();
            }
            if (c1080fM2689i3 != null) {
                AbstractC1089o.m2687b(c1080f2, c1080fM2689i3, iM2580e3);
            }
            C1080f c1080fM2689i4 = AbstractC1089o.m2689i(c1062c4, 1);
            int iM2580e4 = c1062c4.m2580e();
            C1063d c1063dM2657n2 = m2657n();
            if (c1063dM2657n2 != null) {
                iM2580e4 = c1063dM2657n2.f4284L.m2580e();
            }
            if (c1080fM2689i4 != null) {
                AbstractC1089o.m2687b(c1080f, c1080fM2689i4, -iM2580e4);
            }
        }
        c1080f2.f4454a = this;
        c1080f.f4454a = this;
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: e */
    public final void mo2652e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f4444k;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((AbstractC1089o) arrayList.get(i2)).mo2652e();
            i2++;
        }
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: f */
    public final void mo2653f() {
        this.f4481c = null;
        Iterator it = this.f4444k.iterator();
        while (it.hasNext()) {
            ((AbstractC1089o) it.next()).mo2653f();
        }
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: j */
    public final long mo2654j() {
        ArrayList arrayList = this.f4444k;
        int size = arrayList.size();
        long jMo2654j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1089o abstractC1089o = (AbstractC1089o) arrayList.get(i2);
            jMo2654j = ((long) abstractC1089o.f4487i.f4459f) + abstractC1089o.mo2654j() + jMo2654j + ((long) abstractC1089o.f4486h.f4459f);
        }
        return jMo2654j;
    }

    @Override // p095w.AbstractC1089o
    /* JADX INFO: renamed from: k */
    public final boolean mo2655k() {
        ArrayList arrayList = this.f4444k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((AbstractC1089o) arrayList.get(i2)).mo2655k()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final C1063d m2656m() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f4444k;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C1063d c1063d = ((AbstractC1089o) arrayList.get(i2)).f4480b;
            if (c1063d.f4312g0 != 8) {
                return c1063d;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final C1063d m2657n() {
        ArrayList arrayList = this.f4444k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1063d c1063d = ((AbstractC1089o) arrayList.get(size)).f4480b;
            if (c1063d.f4312g0 != 8) {
                return c1063d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f4484f == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC1089o abstractC1089o : this.f4444k) {
            sb.append("<");
            sb.append(abstractC1089o);
            sb.append("> ");
        }
        return sb.toString();
    }
}
