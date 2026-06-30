package p089t;

import java.util.Arrays;
import p000A.C0009j;
import p005C0.C0048n;

/* JADX INFO: renamed from: t.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1047d extends C1045b {

    /* JADX INFO: renamed from: f */
    public C1049f[] f4170f;

    /* JADX INFO: renamed from: g */
    public C1049f[] f4171g;

    /* JADX INFO: renamed from: h */
    public int f4172h;

    /* JADX INFO: renamed from: i */
    public C0048n f4173i;

    @Override // p089t.C1045b
    /* JADX INFO: renamed from: d */
    public final C1049f mo2517d(boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.f4172h; i3++) {
            C1049f[] c1049fArr = this.f4170f;
            C1049f c1049f = c1049fArr[i3];
            if (!zArr[c1049f.f4175b]) {
                C0048n c0048n = this.f4173i;
                c0048n.f174b = c1049f;
                int i4 = 8;
                if (i2 == -1) {
                    while (i4 >= 0) {
                        float f = ((C1049f) c0048n.f174b).f4181h[i4];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i2 = i3;
                                break;
                            }
                            i4--;
                        }
                    }
                } else {
                    C1049f c1049f2 = c1049fArr[i2];
                    while (true) {
                        if (i4 >= 0) {
                            float f2 = c1049f2.f4181h[i4];
                            float f3 = ((C1049f) c0048n.f174b).f4181h[i4];
                            if (f3 == f2) {
                                i4--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f4170f[i2];
    }

    @Override // p089t.C1045b
    /* JADX INFO: renamed from: e */
    public final boolean mo2518e() {
        return this.f4172h == 0;
    }

    @Override // p089t.C1045b
    /* JADX INFO: renamed from: i */
    public final void mo2522i(C1046c c1046c, C1045b c1045b, boolean z2) {
        C1049f c1049f = c1045b.f4148a;
        if (c1049f == null) {
            return;
        }
        C1044a c1044a = c1045b.f4151d;
        int iM2509d = c1044a.m2509d();
        for (int i2 = 0; i2 < iM2509d; i2++) {
            C1049f c1049fM2510e = c1044a.m2510e(i2);
            float fM2511f = c1044a.m2511f(i2);
            C0048n c0048n = this.f4173i;
            c0048n.f174b = c1049fM2510e;
            boolean z3 = c1049fM2510e.f4174a;
            float[] fArr = c1049f.f4181h;
            if (z3) {
                boolean z4 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr2 = ((C1049f) c0048n.f174b).f4181h;
                    float f = (fArr[i3] * fM2511f) + fArr2[i3];
                    fArr2[i3] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((C1049f) c0048n.f174b).f4181h[i3] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C1047d) c0048n.f175c).m2544k((C1049f) c0048n.f174b);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = fArr[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fM2511f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((C1049f) c0048n.f174b).f4181h[i4] = f3;
                    } else {
                        ((C1049f) c0048n.f174b).f4181h[i4] = 0.0f;
                    }
                }
                m2543j(c1049fM2510e);
            }
            this.f4149b = (c1045b.f4149b * fM2511f) + this.f4149b;
        }
        m2544k(c1049f);
    }

    /* JADX INFO: renamed from: j */
    public final void m2543j(C1049f c1049f) {
        int i2;
        int i3 = this.f4172h + 1;
        C1049f[] c1049fArr = this.f4170f;
        if (i3 > c1049fArr.length) {
            C1049f[] c1049fArr2 = (C1049f[]) Arrays.copyOf(c1049fArr, c1049fArr.length * 2);
            this.f4170f = c1049fArr2;
            this.f4171g = (C1049f[]) Arrays.copyOf(c1049fArr2, c1049fArr2.length * 2);
        }
        C1049f[] c1049fArr3 = this.f4170f;
        int i4 = this.f4172h;
        c1049fArr3[i4] = c1049f;
        int i5 = i4 + 1;
        this.f4172h = i5;
        if (i5 > 1 && c1049fArr3[i4].f4175b > c1049f.f4175b) {
            int i6 = 0;
            while (true) {
                i2 = this.f4172h;
                if (i6 >= i2) {
                    break;
                }
                this.f4171g[i6] = this.f4170f[i6];
                i6++;
            }
            Arrays.sort(this.f4171g, 0, i2, new C0009j(3));
            for (int i7 = 0; i7 < this.f4172h; i7++) {
                this.f4170f[i7] = this.f4171g[i7];
            }
        }
        c1049f.f4174a = true;
        c1049f.m2546a(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m2544k(C1049f c1049f) {
        int i2 = 0;
        while (i2 < this.f4172h) {
            if (this.f4170f[i2] == c1049f) {
                while (true) {
                    int i3 = this.f4172h;
                    if (i2 >= i3 - 1) {
                        this.f4172h = i3 - 1;
                        c1049f.f4174a = false;
                        return;
                    } else {
                        C1049f[] c1049fArr = this.f4170f;
                        int i4 = i2 + 1;
                        c1049fArr[i2] = c1049fArr[i4];
                        i2 = i4;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // p089t.C1045b
    public final String toString() {
        String str = " goal -> (" + this.f4149b + ") : ";
        for (int i2 = 0; i2 < this.f4172h; i2++) {
            C1049f c1049f = this.f4170f[i2];
            C0048n c0048n = this.f4173i;
            c0048n.f174b = c1049f;
            str = str + c0048n + " ";
        }
        return str;
    }
}
