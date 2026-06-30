package p089t;

import java.util.ArrayList;
import java.util.Arrays;
import p005C0.C0048n;
import p022M.C0186c;
import p024N.C0270l;
import p093v.C1062c;

/* JADX INFO: renamed from: t.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1046c {

    /* JADX INFO: renamed from: q */
    public static boolean f4153q;

    /* JADX INFO: renamed from: d */
    public final C1047d f4157d;

    /* JADX INFO: renamed from: m */
    public final C0270l f4166m;

    /* JADX INFO: renamed from: p */
    public C1045b f4169p;

    /* JADX INFO: renamed from: a */
    public int f4154a = 1000;

    /* JADX INFO: renamed from: b */
    public boolean f4155b = false;

    /* JADX INFO: renamed from: c */
    public int f4156c = 0;

    /* JADX INFO: renamed from: e */
    public int f4158e = 32;

    /* JADX INFO: renamed from: f */
    public int f4159f = 32;

    /* JADX INFO: renamed from: h */
    public boolean f4161h = false;

    /* JADX INFO: renamed from: i */
    public boolean[] f4162i = new boolean[32];

    /* JADX INFO: renamed from: j */
    public int f4163j = 1;

    /* JADX INFO: renamed from: k */
    public int f4164k = 0;

    /* JADX INFO: renamed from: l */
    public int f4165l = 32;

    /* JADX INFO: renamed from: n */
    public C1049f[] f4167n = new C1049f[1000];

    /* JADX INFO: renamed from: o */
    public int f4168o = 0;

    /* JADX INFO: renamed from: g */
    public C1045b[] f4160g = new C1045b[32];

    public C1046c() {
        m2541s();
        C0270l c0270l = new C0270l();
        c0270l.f836a = new C0186c();
        c0270l.f837b = new C0186c();
        c0270l.f838c = new C1049f[32];
        this.f4166m = c0270l;
        C1047d c1047d = new C1047d(c0270l);
        c1047d.f4170f = new C1049f[128];
        c1047d.f4171g = new C1049f[128];
        c1047d.f4172h = 0;
        c1047d.f4173i = new C0048n(17, c1047d);
        this.f4157d = c1047d;
        this.f4169p = new C1045b(c0270l);
    }

    /* JADX INFO: renamed from: n */
    public static int m2523n(Object obj) {
        C1049f c1049f = ((C1062c) obj).f4272i;
        if (c1049f != null) {
            return (int) (c1049f.f4178e + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final C1049f m2524a(int i2) {
        C0186c c0186c = (C0186c) this.f4166m.f837b;
        int i3 = c0186c.f616b;
        Object obj = null;
        if (i3 > 0) {
            int i4 = i3 - 1;
            Object[] objArr = c0186c.f615a;
            Object obj2 = objArr[i4];
            objArr[i4] = null;
            c0186c.f616b = i4;
            obj = obj2;
        }
        C1049f c1049f = (C1049f) obj;
        if (c1049f == null) {
            c1049f = new C1049f(i2);
            c1049f.f4185l = i2;
        } else {
            c1049f.m2548c();
            c1049f.f4185l = i2;
        }
        int i5 = this.f4168o;
        int i6 = this.f4154a;
        if (i5 >= i6) {
            int i7 = i6 * 2;
            this.f4154a = i7;
            this.f4167n = (C1049f[]) Arrays.copyOf(this.f4167n, i7);
        }
        C1049f[] c1049fArr = this.f4167n;
        int i8 = this.f4168o;
        this.f4168o = i8 + 1;
        c1049fArr[i8] = c1049f;
        return c1049f;
    }

    /* JADX INFO: renamed from: b */
    public final void m2525b(C1049f c1049f, C1049f c1049f2, int i2, float f, C1049f c1049f3, C1049f c1049f4, int i3, int i4) {
        C1045b c1045bM2535l = m2535l();
        if (c1049f2 == c1049f3) {
            c1045bM2535l.f4151d.m2512g(c1049f, 1.0f);
            c1045bM2535l.f4151d.m2512g(c1049f4, 1.0f);
            c1045bM2535l.f4151d.m2512g(c1049f2, -2.0f);
        } else if (f == 0.5f) {
            c1045bM2535l.f4151d.m2512g(c1049f, 1.0f);
            c1045bM2535l.f4151d.m2512g(c1049f2, -1.0f);
            c1045bM2535l.f4151d.m2512g(c1049f3, -1.0f);
            c1045bM2535l.f4151d.m2512g(c1049f4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                c1045bM2535l.f4149b = (-i2) + i3;
            }
        } else if (f <= 0.0f) {
            c1045bM2535l.f4151d.m2512g(c1049f, -1.0f);
            c1045bM2535l.f4151d.m2512g(c1049f2, 1.0f);
            c1045bM2535l.f4149b = i2;
        } else if (f >= 1.0f) {
            c1045bM2535l.f4151d.m2512g(c1049f4, -1.0f);
            c1045bM2535l.f4151d.m2512g(c1049f3, 1.0f);
            c1045bM2535l.f4149b = -i3;
        } else {
            float f2 = 1.0f - f;
            c1045bM2535l.f4151d.m2512g(c1049f, f2 * 1.0f);
            c1045bM2535l.f4151d.m2512g(c1049f2, f2 * (-1.0f));
            c1045bM2535l.f4151d.m2512g(c1049f3, (-1.0f) * f);
            c1045bM2535l.f4151d.m2512g(c1049f4, 1.0f * f);
            if (i2 > 0 || i3 > 0) {
                c1045bM2535l.f4149b = (i3 * f) + ((-i2) * f2);
            }
        }
        if (i4 != 8) {
            c1045bM2535l.m2514a(this, i4);
        }
        m2526c(c1045bM2535l);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fe  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2526c(C1045b c1045b) {
        boolean z2;
        boolean z3;
        C1049f c1049f;
        C1049f c1049fM2519f;
        ArrayList arrayList;
        if (this.f4164k + 1 >= this.f4165l || this.f4163j + 1 >= this.f4159f) {
            m2537o();
        }
        if (c1045b.f4152e) {
            z2 = false;
        } else {
            if (this.f4160g.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int iM2509d = c1045b.f4151d.m2509d();
                    int i2 = 0;
                    while (true) {
                        arrayList = c1045b.f4150c;
                        if (i2 >= iM2509d) {
                            break;
                        }
                        C1049f c1049fM2510e = c1045b.f4151d.m2510e(i2);
                        if (c1049fM2510e.f4176c != -1 || c1049fM2510e.f4179f) {
                            arrayList.add(c1049fM2510e);
                        }
                        i2++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i3 = 0; i3 < size; i3++) {
                            C1049f c1049f2 = (C1049f) arrayList.get(i3);
                            if (c1049f2.f4179f) {
                                c1045b.m2521h(this, c1049f2, true);
                            } else {
                                c1045b.mo2522i(this, this.f4160g[c1049f2.f4176c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (c1045b.f4148a != null && c1045b.f4151d.m2509d() == 0) {
                    c1045b.f4152e = true;
                    this.f4155b = true;
                }
            }
            if (c1045b.mo2518e()) {
                return;
            }
            float f = c1045b.f4149b;
            if (f < 0.0f) {
                c1045b.f4149b = f * (-1.0f);
                C1044a c1044a = c1045b.f4151d;
                int i4 = c1044a.f4145h;
                for (int i5 = 0; i4 != -1 && i5 < c1044a.f4138a; i5++) {
                    float[] fArr = c1044a.f4144g;
                    fArr[i4] = fArr[i4] * (-1.0f);
                    i4 = c1044a.f4143f[i4];
                }
            }
            int iM2509d2 = c1045b.f4151d.m2509d();
            C1049f c1049f3 = null;
            C1049f c1049f4 = null;
            float f2 = 0.0f;
            boolean z5 = false;
            float f3 = 0.0f;
            boolean z6 = false;
            for (int i6 = 0; i6 < iM2509d2; i6++) {
                float fM2511f = c1045b.f4151d.m2511f(i6);
                C1049f c1049fM2510e2 = c1045b.f4151d.m2510e(i6);
                if (c1049fM2510e2.f4185l == 1) {
                    if (c1049f3 == null) {
                        z5 = c1049fM2510e2.f4184k <= 1;
                    } else if (f2 > fM2511f) {
                        if (c1049fM2510e2.f4184k <= 1) {
                        }
                    } else if (!z5 && c1049fM2510e2.f4184k <= 1) {
                        c1049f3 = c1049fM2510e2;
                        f2 = fM2511f;
                        z5 = true;
                    }
                    c1049f3 = c1049fM2510e2;
                    f2 = fM2511f;
                } else if (c1049f3 == null && fM2511f < 0.0f) {
                    if (c1049f4 == null) {
                        z6 = c1049fM2510e2.f4184k <= 1;
                    } else if (f3 > fM2511f) {
                        if (c1049fM2510e2.f4184k <= 1) {
                        }
                    } else if (!z6 && c1049fM2510e2.f4184k <= 1) {
                        c1049f4 = c1049fM2510e2;
                        f3 = fM2511f;
                        z6 = true;
                    }
                    c1049f4 = c1049fM2510e2;
                    f3 = fM2511f;
                }
            }
            if (c1049f3 == null) {
                c1049f3 = c1049f4;
            }
            if (c1049f3 == null) {
                z3 = true;
            } else {
                c1045b.m2520g(c1049f3);
                z3 = false;
            }
            if (c1045b.f4151d.m2509d() == 0) {
                c1045b.f4152e = true;
            }
            if (z3) {
                if (this.f4163j + 1 >= this.f4159f) {
                    m2537o();
                }
                C1049f c1049fM2524a = m2524a(3);
                int i7 = this.f4156c + 1;
                this.f4156c = i7;
                this.f4163j++;
                c1049fM2524a.f4175b = i7;
                C0270l c0270l = this.f4166m;
                ((C1049f[]) c0270l.f838c)[i7] = c1049fM2524a;
                c1045b.f4148a = c1049fM2524a;
                int i8 = this.f4164k;
                m2531h(c1045b);
                if (this.f4164k == i8 + 1) {
                    C1045b c1045b2 = this.f4169p;
                    c1045b2.f4148a = null;
                    c1045b2.f4151d.m2507b();
                    for (int i9 = 0; i9 < c1045b.f4151d.m2509d(); i9++) {
                        c1045b2.f4151d.m2506a(c1045b.f4151d.m2510e(i9), c1045b.f4151d.m2511f(i9), true);
                    }
                    m2540r(this.f4169p);
                    if (c1049fM2524a.f4176c == -1) {
                        if (c1045b.f4148a == c1049fM2524a && (c1049fM2519f = c1045b.m2519f(null, c1049fM2524a)) != null) {
                            c1045b.m2520g(c1049fM2519f);
                        }
                        if (!c1045b.f4152e) {
                            c1045b.f4148a.m2550e(this, c1045b);
                        }
                        ((C0186c) c0270l.f836a).m623b(c1045b);
                        this.f4164k--;
                    }
                    z2 = true;
                }
                c1049f = c1045b.f4148a;
                if (c1049f != null) {
                }
            } else {
                z2 = false;
                c1049f = c1045b.f4148a;
                if (c1049f != null) {
                    return;
                }
                if (c1049f.f4185l != 1 && c1045b.f4149b < 0.0f) {
                    return;
                }
            }
        }
        if (z2) {
            return;
        }
        m2531h(c1045b);
    }

    /* JADX INFO: renamed from: d */
    public final void m2527d(C1049f c1049f, int i2) {
        int i3 = c1049f.f4176c;
        if (i3 == -1) {
            c1049f.m2549d(this, i2);
            for (int i4 = 0; i4 < this.f4156c + 1; i4++) {
                C1049f c1049f2 = ((C1049f[]) this.f4166m.f838c)[i4];
            }
            return;
        }
        if (i3 == -1) {
            C1045b c1045bM2535l = m2535l();
            c1045bM2535l.f4148a = c1049f;
            float f = i2;
            c1049f.f4178e = f;
            c1045bM2535l.f4149b = f;
            c1045bM2535l.f4152e = true;
            m2526c(c1045bM2535l);
            return;
        }
        C1045b c1045b = this.f4160g[i3];
        if (c1045b.f4152e) {
            c1045b.f4149b = i2;
            return;
        }
        if (c1045b.f4151d.m2509d() == 0) {
            c1045b.f4152e = true;
            c1045b.f4149b = i2;
            return;
        }
        C1045b c1045bM2535l2 = m2535l();
        if (i2 < 0) {
            c1045bM2535l2.f4149b = i2 * (-1);
            c1045bM2535l2.f4151d.m2512g(c1049f, 1.0f);
        } else {
            c1045bM2535l2.f4149b = i2;
            c1045bM2535l2.f4151d.m2512g(c1049f, -1.0f);
        }
        m2526c(c1045bM2535l2);
    }

    /* JADX INFO: renamed from: e */
    public final void m2528e(C1049f c1049f, C1049f c1049f2, int i2, int i3) {
        if (i3 == 8 && c1049f2.f4179f && c1049f.f4176c == -1) {
            c1049f.m2549d(this, c1049f2.f4178e + i2);
            return;
        }
        C1045b c1045bM2535l = m2535l();
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            c1045bM2535l.f4149b = i2;
        }
        if (z2) {
            c1045bM2535l.f4151d.m2512g(c1049f, 1.0f);
            c1045bM2535l.f4151d.m2512g(c1049f2, -1.0f);
        } else {
            c1045bM2535l.f4151d.m2512g(c1049f, -1.0f);
            c1045bM2535l.f4151d.m2512g(c1049f2, 1.0f);
        }
        if (i3 != 8) {
            c1045bM2535l.m2514a(this, i3);
        }
        m2526c(c1045bM2535l);
    }

    /* JADX INFO: renamed from: f */
    public final void m2529f(C1049f c1049f, C1049f c1049f2, int i2, int i3) {
        C1045b c1045bM2535l = m2535l();
        C1049f c1049fM2536m = m2536m();
        c1049fM2536m.f4177d = 0;
        c1045bM2535l.m2515b(c1049f, c1049f2, c1049fM2536m, i2);
        if (i3 != 8) {
            c1045bM2535l.f4151d.m2512g(m2533j(i3), (int) (c1045bM2535l.f4151d.m2508c(c1049fM2536m) * (-1.0f)));
        }
        m2526c(c1045bM2535l);
    }

    /* JADX INFO: renamed from: g */
    public final void m2530g(C1049f c1049f, C1049f c1049f2, int i2, int i3) {
        C1045b c1045bM2535l = m2535l();
        C1049f c1049fM2536m = m2536m();
        c1049fM2536m.f4177d = 0;
        c1045bM2535l.m2516c(c1049f, c1049f2, c1049fM2536m, i2);
        if (i3 != 8) {
            c1045bM2535l.f4151d.m2512g(m2533j(i3), (int) (c1045bM2535l.f4151d.m2508c(c1049fM2536m) * (-1.0f)));
        }
        m2526c(c1045bM2535l);
    }

    /* JADX INFO: renamed from: h */
    public final void m2531h(C1045b c1045b) {
        int i2;
        if (c1045b.f4152e) {
            c1045b.f4148a.m2549d(this, c1045b.f4149b);
        } else {
            C1045b[] c1045bArr = this.f4160g;
            int i3 = this.f4164k;
            c1045bArr[i3] = c1045b;
            C1049f c1049f = c1045b.f4148a;
            c1049f.f4176c = i3;
            this.f4164k = i3 + 1;
            c1049f.m2550e(this, c1045b);
        }
        if (this.f4155b) {
            int i4 = 0;
            while (i4 < this.f4164k) {
                if (this.f4160g[i4] == null) {
                    System.out.println("WTF");
                }
                C1045b c1045b2 = this.f4160g[i4];
                if (c1045b2 != null && c1045b2.f4152e) {
                    c1045b2.f4148a.m2549d(this, c1045b2.f4149b);
                    ((C0186c) this.f4166m.f836a).m623b(c1045b2);
                    this.f4160g[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.f4164k;
                        if (i5 >= i2) {
                            break;
                        }
                        C1045b[] c1045bArr2 = this.f4160g;
                        int i7 = i5 - 1;
                        C1045b c1045b3 = c1045bArr2[i5];
                        c1045bArr2[i7] = c1045b3;
                        C1049f c1049f2 = c1045b3.f4148a;
                        if (c1049f2.f4176c == i5) {
                            c1049f2.f4176c = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f4160g[i6] = null;
                    }
                    this.f4164k = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.f4155b = false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2532i() {
        for (int i2 = 0; i2 < this.f4164k; i2++) {
            C1045b c1045b = this.f4160g[i2];
            c1045b.f4148a.f4178e = c1045b.f4149b;
        }
    }

    /* JADX INFO: renamed from: j */
    public final C1049f m2533j(int i2) {
        if (this.f4163j + 1 >= this.f4159f) {
            m2537o();
        }
        C1049f c1049fM2524a = m2524a(4);
        int i3 = this.f4156c + 1;
        this.f4156c = i3;
        this.f4163j++;
        c1049fM2524a.f4175b = i3;
        c1049fM2524a.f4177d = i2;
        ((C1049f[]) this.f4166m.f838c)[i3] = c1049fM2524a;
        C1047d c1047d = this.f4157d;
        c1047d.f4173i.f174b = c1049fM2524a;
        float[] fArr = c1049fM2524a.f4181h;
        Arrays.fill(fArr, 0.0f);
        fArr[c1049fM2524a.f4177d] = 1.0f;
        c1047d.m2543j(c1049fM2524a);
        return c1049fM2524a;
    }

    /* JADX INFO: renamed from: k */
    public final C1049f m2534k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f4163j + 1 >= this.f4159f) {
            m2537o();
        }
        if (!(obj instanceof C1062c)) {
            return null;
        }
        C1062c c1062c = (C1062c) obj;
        C1049f c1049f = c1062c.f4272i;
        if (c1049f == null) {
            c1062c.m2586k();
            c1049f = c1062c.f4272i;
        }
        int i2 = c1049f.f4175b;
        C0270l c0270l = this.f4166m;
        if (i2 != -1 && i2 <= this.f4156c && ((C1049f[]) c0270l.f838c)[i2] != null) {
            return c1049f;
        }
        if (i2 != -1) {
            c1049f.m2548c();
        }
        int i3 = this.f4156c + 1;
        this.f4156c = i3;
        this.f4163j++;
        c1049f.f4175b = i3;
        c1049f.f4185l = 1;
        ((C1049f[]) c0270l.f838c)[i3] = c1049f;
        return c1049f;
    }

    /* JADX INFO: renamed from: l */
    public final C1045b m2535l() {
        Object obj;
        C0270l c0270l = this.f4166m;
        C0186c c0186c = (C0186c) c0270l.f836a;
        int i2 = c0186c.f616b;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = c0186c.f615a;
            obj = objArr[i3];
            objArr[i3] = null;
            c0186c.f616b = i3;
        } else {
            obj = null;
        }
        C1045b c1045b = (C1045b) obj;
        if (c1045b == null) {
            return new C1045b(c0270l);
        }
        c1045b.f4148a = null;
        c1045b.f4151d.m2507b();
        c1045b.f4149b = 0.0f;
        c1045b.f4152e = false;
        return c1045b;
    }

    /* JADX INFO: renamed from: m */
    public final C1049f m2536m() {
        if (this.f4163j + 1 >= this.f4159f) {
            m2537o();
        }
        C1049f c1049fM2524a = m2524a(3);
        int i2 = this.f4156c + 1;
        this.f4156c = i2;
        this.f4163j++;
        c1049fM2524a.f4175b = i2;
        ((C1049f[]) this.f4166m.f838c)[i2] = c1049fM2524a;
        return c1049fM2524a;
    }

    /* JADX INFO: renamed from: o */
    public final void m2537o() {
        int i2 = this.f4158e * 2;
        this.f4158e = i2;
        this.f4160g = (C1045b[]) Arrays.copyOf(this.f4160g, i2);
        C0270l c0270l = this.f4166m;
        c0270l.f838c = (C1049f[]) Arrays.copyOf((C1049f[]) c0270l.f838c, this.f4158e);
        int i3 = this.f4158e;
        this.f4162i = new boolean[i3];
        this.f4159f = i3;
        this.f4165l = i3;
    }

    /* JADX INFO: renamed from: p */
    public final void m2538p() {
        C1047d c1047d = this.f4157d;
        if (c1047d.mo2518e()) {
            m2532i();
            return;
        }
        if (!this.f4161h) {
            m2539q(c1047d);
            return;
        }
        for (int i2 = 0; i2 < this.f4164k; i2++) {
            if (!this.f4160g[i2].f4152e) {
                m2539q(c1047d);
                return;
            }
        }
        m2532i();
    }

    /* JADX INFO: renamed from: q */
    public final void m2539q(C1047d c1047d) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.f4164k) {
                break;
            }
            C1045b c1045b = this.f4160g[i2];
            int i3 = 1;
            if (c1045b.f4148a.f4185l != 1) {
                float f = 0.0f;
                if (c1045b.f4149b < 0.0f) {
                    boolean z2 = false;
                    int i4 = 0;
                    while (!z2) {
                        i4 += i3;
                        float f2 = Float.MAX_VALUE;
                        int i5 = 0;
                        int i6 = -1;
                        int i7 = -1;
                        int i8 = 0;
                        while (i5 < this.f4164k) {
                            C1045b c1045b2 = this.f4160g[i5];
                            if (c1045b2.f4148a.f4185l != i3 && !c1045b2.f4152e && c1045b2.f4149b < f) {
                                int iM2509d = c1045b2.f4151d.m2509d();
                                int i9 = 0;
                                while (i9 < iM2509d) {
                                    C1049f c1049fM2510e = c1045b2.f4151d.m2510e(i9);
                                    float fM2508c = c1045b2.f4151d.m2508c(c1049fM2510e);
                                    if (fM2508c > f) {
                                        for (int i10 = 0; i10 < 9; i10++) {
                                            float f3 = c1049fM2510e.f4180g[i10] / fM2508c;
                                            if ((f3 < f2 && i10 == i8) || i10 > i8) {
                                                i8 = i10;
                                                i7 = c1049fM2510e.f4175b;
                                                i6 = i5;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i9++;
                                    f = 0.0f;
                                }
                            }
                            i5++;
                            f = 0.0f;
                            i3 = 1;
                        }
                        if (i6 != -1) {
                            C1045b c1045b3 = this.f4160g[i6];
                            c1045b3.f4148a.f4176c = -1;
                            c1045b3.m2520g(((C1049f[]) this.f4166m.f838c)[i7]);
                            C1049f c1049f = c1045b3.f4148a;
                            c1049f.f4176c = i6;
                            c1049f.m2550e(this, c1045b3);
                        } else {
                            z2 = true;
                        }
                        if (i4 > this.f4163j / 2) {
                            z2 = true;
                        }
                        f = 0.0f;
                        i3 = 1;
                    }
                }
            }
            i2++;
        }
        m2540r(c1047d);
        m2532i();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092 A[SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2540r(C1045b c1045b) {
        boolean z2;
        for (int i2 = 0; i2 < this.f4163j; i2++) {
            this.f4162i[i2] = false;
        }
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            int i4 = 1;
            i3++;
            if (i3 >= this.f4163j * 2) {
                return;
            }
            C1049f c1049f = c1045b.f4148a;
            if (c1049f != null) {
                this.f4162i[c1049f.f4175b] = true;
            }
            C1049f c1049fMo2517d = c1045b.mo2517d(this.f4162i);
            if (c1049fMo2517d != null) {
                boolean[] zArr = this.f4162i;
                int i5 = c1049fMo2517d.f4175b;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (c1049fMo2517d != null) {
                float f = Float.MAX_VALUE;
                int i6 = 0;
                int i7 = -1;
                while (i6 < this.f4164k) {
                    C1045b c1045b2 = this.f4160g[i6];
                    if (c1045b2.f4148a.f4185l != i4 && !c1045b2.f4152e) {
                        C1044a c1044a = c1045b2.f4151d;
                        int i8 = c1044a.f4145h;
                        if (i8 == -1) {
                            z2 = false;
                            if (!z2) {
                                float fM2508c = c1045b2.f4151d.m2508c(c1049fMo2517d);
                                if (fM2508c < 0.0f) {
                                    float f2 = (-c1045b2.f4149b) / fM2508c;
                                    if (f2 < f) {
                                        f = f2;
                                        i7 = i6;
                                    }
                                }
                            }
                        } else {
                            for (int i9 = 0; i8 != -1 && i9 < c1044a.f4138a; i9++) {
                                if (c1044a.f4142e[i8] == c1049fMo2517d.f4175b) {
                                    z2 = true;
                                    break;
                                }
                                i8 = c1044a.f4143f[i8];
                            }
                            z2 = false;
                            if (!z2) {
                            }
                        }
                    }
                    i6++;
                    i4 = 1;
                }
                if (i7 > -1) {
                    C1045b c1045b3 = this.f4160g[i7];
                    c1045b3.f4148a.f4176c = -1;
                    c1045b3.m2520g(c1049fMo2517d);
                    C1049f c1049f2 = c1045b3.f4148a;
                    c1049f2.f4176c = i7;
                    c1049f2.m2550e(this, c1045b3);
                }
            } else {
                z3 = true;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2541s() {
        for (int i2 = 0; i2 < this.f4164k; i2++) {
            C1045b c1045b = this.f4160g[i2];
            if (c1045b != null) {
                ((C0186c) this.f4166m.f836a).m623b(c1045b);
            }
            this.f4160g[i2] = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2542t() {
        C0270l c0270l;
        int i2 = 0;
        while (true) {
            c0270l = this.f4166m;
            C1049f[] c1049fArr = (C1049f[]) c0270l.f838c;
            if (i2 >= c1049fArr.length) {
                break;
            }
            C1049f c1049f = c1049fArr[i2];
            if (c1049f != null) {
                c1049f.m2548c();
            }
            i2++;
        }
        C0186c c0186c = (C0186c) c0270l.f837b;
        C1049f[] c1049fArr2 = this.f4167n;
        int length = this.f4168o;
        c0186c.getClass();
        if (length > c1049fArr2.length) {
            length = c1049fArr2.length;
        }
        for (int i3 = 0; i3 < length; i3++) {
            C1049f c1049f2 = c1049fArr2[i3];
            int i4 = c0186c.f616b;
            Object[] objArr = c0186c.f615a;
            if (i4 < objArr.length) {
                objArr[i4] = c1049f2;
                c0186c.f616b = i4 + 1;
            }
        }
        this.f4168o = 0;
        Arrays.fill((C1049f[]) c0270l.f838c, (Object) null);
        this.f4156c = 0;
        C1047d c1047d = this.f4157d;
        c1047d.f4172h = 0;
        c1047d.f4149b = 0.0f;
        this.f4163j = 1;
        for (int i5 = 0; i5 < this.f4164k; i5++) {
            C1045b c1045b = this.f4160g[i5];
        }
        m2541s();
        this.f4164k = 0;
        this.f4169p = new C1045b(c0270l);
    }
}
