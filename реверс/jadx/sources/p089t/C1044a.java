package p089t;

import androidx.fragment.app.AbstractC0529T;
import java.util.Arrays;
import p024N.C0270l;

/* JADX INFO: renamed from: t.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1044a {

    /* JADX INFO: renamed from: b */
    public final C1045b f4139b;

    /* JADX INFO: renamed from: c */
    public final C0270l f4140c;

    /* JADX INFO: renamed from: a */
    public int f4138a = 0;

    /* JADX INFO: renamed from: d */
    public int f4141d = 8;

    /* JADX INFO: renamed from: e */
    public int[] f4142e = new int[8];

    /* JADX INFO: renamed from: f */
    public int[] f4143f = new int[8];

    /* JADX INFO: renamed from: g */
    public float[] f4144g = new float[8];

    /* JADX INFO: renamed from: h */
    public int f4145h = -1;

    /* JADX INFO: renamed from: i */
    public int f4146i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f4147j = false;

    public C1044a(C1045b c1045b, C0270l c0270l) {
        this.f4139b = c1045b;
        this.f4140c = c0270l;
    }

    /* JADX INFO: renamed from: a */
    public final void m2506a(C1049f c1049f, float f, boolean z2) {
        if (f <= -0.001f || f >= 0.001f) {
            int i2 = this.f4145h;
            C1045b c1045b = this.f4139b;
            if (i2 == -1) {
                this.f4145h = 0;
                this.f4144g[0] = f;
                this.f4142e[0] = c1049f.f4175b;
                this.f4143f[0] = -1;
                c1049f.f4184k++;
                c1049f.m2546a(c1045b);
                this.f4138a++;
                if (this.f4147j) {
                    return;
                }
                int i3 = this.f4146i + 1;
                this.f4146i = i3;
                int[] iArr = this.f4142e;
                if (i3 >= iArr.length) {
                    this.f4147j = true;
                    this.f4146i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.f4138a; i5++) {
                int i6 = this.f4142e[i2];
                int i7 = c1049f.f4175b;
                if (i6 == i7) {
                    float[] fArr = this.f4144g;
                    float f2 = fArr[i2] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i2] = f2;
                    if (f2 == 0.0f) {
                        if (i2 == this.f4145h) {
                            this.f4145h = this.f4143f[i2];
                        } else {
                            int[] iArr2 = this.f4143f;
                            iArr2[i4] = iArr2[i2];
                        }
                        if (z2) {
                            c1049f.m2547b(c1045b);
                        }
                        if (this.f4147j) {
                            this.f4146i = i2;
                        }
                        c1049f.f4184k--;
                        this.f4138a--;
                        return;
                    }
                    return;
                }
                if (i6 < i7) {
                    i4 = i2;
                }
                i2 = this.f4143f[i2];
            }
            int length = this.f4146i;
            int i8 = length + 1;
            if (this.f4147j) {
                int[] iArr3 = this.f4142e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i8;
            }
            int[] iArr4 = this.f4142e;
            if (length >= iArr4.length && this.f4138a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f4142e;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.f4142e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i10 = this.f4141d * 2;
                this.f4141d = i10;
                this.f4147j = false;
                this.f4146i = length - 1;
                this.f4144g = Arrays.copyOf(this.f4144g, i10);
                this.f4142e = Arrays.copyOf(this.f4142e, this.f4141d);
                this.f4143f = Arrays.copyOf(this.f4143f, this.f4141d);
            }
            this.f4142e[length] = c1049f.f4175b;
            this.f4144g[length] = f;
            if (i4 != -1) {
                int[] iArr7 = this.f4143f;
                iArr7[length] = iArr7[i4];
                iArr7[i4] = length;
            } else {
                this.f4143f[length] = this.f4145h;
                this.f4145h = length;
            }
            c1049f.f4184k++;
            c1049f.m2546a(c1045b);
            this.f4138a++;
            if (!this.f4147j) {
                this.f4146i++;
            }
            int i11 = this.f4146i;
            int[] iArr8 = this.f4142e;
            if (i11 >= iArr8.length) {
                this.f4147j = true;
                this.f4146i = iArr8.length - 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2507b() {
        int i2 = this.f4145h;
        for (int i3 = 0; i2 != -1 && i3 < this.f4138a; i3++) {
            C1049f c1049f = ((C1049f[]) this.f4140c.f838c)[this.f4142e[i2]];
            if (c1049f != null) {
                c1049f.m2547b(this.f4139b);
            }
            i2 = this.f4143f[i2];
        }
        this.f4145h = -1;
        this.f4146i = -1;
        this.f4147j = false;
        this.f4138a = 0;
    }

    /* JADX INFO: renamed from: c */
    public final float m2508c(C1049f c1049f) {
        int i2 = this.f4145h;
        for (int i3 = 0; i2 != -1 && i3 < this.f4138a; i3++) {
            if (this.f4142e[i2] == c1049f.f4175b) {
                return this.f4144g[i2];
            }
            i2 = this.f4143f[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final int m2509d() {
        return this.f4138a;
    }

    /* JADX INFO: renamed from: e */
    public final C1049f m2510e(int i2) {
        int i3 = this.f4145h;
        for (int i4 = 0; i3 != -1 && i4 < this.f4138a; i4++) {
            if (i4 == i2) {
                return ((C1049f[]) this.f4140c.f838c)[this.f4142e[i3]];
            }
            i3 = this.f4143f[i3];
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final float m2511f(int i2) {
        int i3 = this.f4145h;
        for (int i4 = 0; i3 != -1 && i4 < this.f4138a; i4++) {
            if (i4 == i2) {
                return this.f4144g[i3];
            }
            i3 = this.f4143f[i3];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public final void m2512g(C1049f c1049f, float f) {
        if (f == 0.0f) {
            m2513h(c1049f, true);
            return;
        }
        int i2 = this.f4145h;
        C1045b c1045b = this.f4139b;
        if (i2 == -1) {
            this.f4145h = 0;
            this.f4144g[0] = f;
            this.f4142e[0] = c1049f.f4175b;
            this.f4143f[0] = -1;
            c1049f.f4184k++;
            c1049f.m2546a(c1045b);
            this.f4138a++;
            if (this.f4147j) {
                return;
            }
            int i3 = this.f4146i + 1;
            this.f4146i = i3;
            int[] iArr = this.f4142e;
            if (i3 >= iArr.length) {
                this.f4147j = true;
                this.f4146i = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f4138a; i5++) {
            int i6 = this.f4142e[i2];
            int i7 = c1049f.f4175b;
            if (i6 == i7) {
                this.f4144g[i2] = f;
                return;
            }
            if (i6 < i7) {
                i4 = i2;
            }
            i2 = this.f4143f[i2];
        }
        int length = this.f4146i;
        int i8 = length + 1;
        if (this.f4147j) {
            int[] iArr2 = this.f4142e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i8;
        }
        int[] iArr3 = this.f4142e;
        if (length >= iArr3.length && this.f4138a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f4142e;
                if (i9 >= iArr4.length) {
                    break;
                }
                if (iArr4[i9] == -1) {
                    length = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr5 = this.f4142e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i10 = this.f4141d * 2;
            this.f4141d = i10;
            this.f4147j = false;
            this.f4146i = length - 1;
            this.f4144g = Arrays.copyOf(this.f4144g, i10);
            this.f4142e = Arrays.copyOf(this.f4142e, this.f4141d);
            this.f4143f = Arrays.copyOf(this.f4143f, this.f4141d);
        }
        this.f4142e[length] = c1049f.f4175b;
        this.f4144g[length] = f;
        if (i4 != -1) {
            int[] iArr6 = this.f4143f;
            iArr6[length] = iArr6[i4];
            iArr6[i4] = length;
        } else {
            this.f4143f[length] = this.f4145h;
            this.f4145h = length;
        }
        c1049f.f4184k++;
        c1049f.m2546a(c1045b);
        int i11 = this.f4138a + 1;
        this.f4138a = i11;
        if (!this.f4147j) {
            this.f4146i++;
        }
        int[] iArr7 = this.f4142e;
        if (i11 >= iArr7.length) {
            this.f4147j = true;
        }
        if (this.f4146i >= iArr7.length) {
            this.f4147j = true;
            this.f4146i = iArr7.length - 1;
        }
    }

    /* JADX INFO: renamed from: h */
    public final float m2513h(C1049f c1049f, boolean z2) {
        int i2 = this.f4145h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f4138a) {
            if (this.f4142e[i2] == c1049f.f4175b) {
                if (i2 == this.f4145h) {
                    this.f4145h = this.f4143f[i2];
                } else {
                    int[] iArr = this.f4143f;
                    iArr[i4] = iArr[i2];
                }
                if (z2) {
                    c1049f.m2547b(this.f4139b);
                }
                c1049f.f4184k--;
                this.f4138a--;
                this.f4142e[i2] = -1;
                if (this.f4147j) {
                    this.f4146i = i2;
                }
                return this.f4144g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f4143f[i2];
        }
        return 0.0f;
    }

    public final String toString() {
        int i2 = this.f4145h;
        String str = "";
        for (int i3 = 0; i2 != -1 && i3 < this.f4138a; i3++) {
            str = (AbstractC0529T.m1417f(str, " -> ") + this.f4144g[i2] + " : ") + ((C1049f[]) this.f4140c.f838c)[this.f4142e[i2]];
            i2 = this.f4143f[i2];
        }
        return str;
    }
}
