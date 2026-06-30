package p089t;

import java.util.Arrays;

/* JADX INFO: renamed from: t.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1049f implements Comparable {

    /* JADX INFO: renamed from: a */
    public boolean f4174a;

    /* JADX INFO: renamed from: e */
    public float f4178e;

    /* JADX INFO: renamed from: l */
    public int f4185l;

    /* JADX INFO: renamed from: b */
    public int f4175b = -1;

    /* JADX INFO: renamed from: c */
    public int f4176c = -1;

    /* JADX INFO: renamed from: d */
    public int f4177d = 0;

    /* JADX INFO: renamed from: f */
    public boolean f4179f = false;

    /* JADX INFO: renamed from: g */
    public final float[] f4180g = new float[9];

    /* JADX INFO: renamed from: h */
    public final float[] f4181h = new float[9];

    /* JADX INFO: renamed from: i */
    public C1045b[] f4182i = new C1045b[16];

    /* JADX INFO: renamed from: j */
    public int f4183j = 0;

    /* JADX INFO: renamed from: k */
    public int f4184k = 0;

    public C1049f(int i2) {
        this.f4185l = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2546a(C1045b c1045b) {
        int i2 = 0;
        while (true) {
            int i3 = this.f4183j;
            if (i2 >= i3) {
                C1045b[] c1045bArr = this.f4182i;
                if (i3 >= c1045bArr.length) {
                    this.f4182i = (C1045b[]) Arrays.copyOf(c1045bArr, c1045bArr.length * 2);
                }
                C1045b[] c1045bArr2 = this.f4182i;
                int i4 = this.f4183j;
                c1045bArr2[i4] = c1045b;
                this.f4183j = i4 + 1;
                return;
            }
            if (this.f4182i[i2] == c1045b) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2547b(C1045b c1045b) {
        int i2 = this.f4183j;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f4182i[i3] == c1045b) {
                while (i3 < i2 - 1) {
                    C1045b[] c1045bArr = this.f4182i;
                    int i4 = i3 + 1;
                    c1045bArr[i3] = c1045bArr[i4];
                    i3 = i4;
                }
                this.f4183j--;
                return;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2548c() {
        this.f4185l = 5;
        this.f4177d = 0;
        this.f4175b = -1;
        this.f4176c = -1;
        this.f4178e = 0.0f;
        this.f4179f = false;
        int i2 = this.f4183j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f4182i[i3] = null;
        }
        this.f4183j = 0;
        this.f4184k = 0;
        this.f4174a = false;
        Arrays.fill(this.f4181h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4175b - ((C1049f) obj).f4175b;
    }

    /* JADX INFO: renamed from: d */
    public final void m2549d(C1046c c1046c, float f) {
        this.f4178e = f;
        this.f4179f = true;
        int i2 = this.f4183j;
        this.f4176c = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f4182i[i3].m2521h(c1046c, this, false);
        }
        this.f4183j = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m2550e(C1046c c1046c, C1045b c1045b) {
        int i2 = this.f4183j;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f4182i[i3].mo2522i(c1046c, c1045b, false);
        }
        this.f4183j = 0;
    }

    public final String toString() {
        return "" + this.f4175b;
    }
}
