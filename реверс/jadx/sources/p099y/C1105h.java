package p099y;

import java.util.Arrays;

/* JADX INFO: renamed from: y.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1105h {

    /* JADX INFO: renamed from: a */
    public int[] f4680a;

    /* JADX INFO: renamed from: b */
    public int[] f4681b;

    /* JADX INFO: renamed from: c */
    public int f4682c;

    /* JADX INFO: renamed from: d */
    public int[] f4683d;

    /* JADX INFO: renamed from: e */
    public float[] f4684e;

    /* JADX INFO: renamed from: f */
    public int f4685f;

    /* JADX INFO: renamed from: g */
    public int[] f4686g;

    /* JADX INFO: renamed from: h */
    public String[] f4687h;

    /* JADX INFO: renamed from: i */
    public int f4688i;

    /* JADX INFO: renamed from: j */
    public int[] f4689j;

    /* JADX INFO: renamed from: k */
    public boolean[] f4690k;

    /* JADX INFO: renamed from: l */
    public int f4691l;

    /* JADX INFO: renamed from: a */
    public final void m2742a(int i2, float f) {
        int i3 = this.f4685f;
        int[] iArr = this.f4683d;
        if (i3 >= iArr.length) {
            this.f4683d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f4684e;
            this.f4684e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f4683d;
        int i4 = this.f4685f;
        iArr2[i4] = i2;
        float[] fArr2 = this.f4684e;
        this.f4685f = i4 + 1;
        fArr2[i4] = f;
    }

    /* JADX INFO: renamed from: b */
    public final void m2743b(int i2, int i3) {
        int i4 = this.f4682c;
        int[] iArr = this.f4680a;
        if (i4 >= iArr.length) {
            this.f4680a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f4681b;
            this.f4681b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f4680a;
        int i5 = this.f4682c;
        iArr3[i5] = i2;
        int[] iArr4 = this.f4681b;
        this.f4682c = i5 + 1;
        iArr4[i5] = i3;
    }

    /* JADX INFO: renamed from: c */
    public final void m2744c(int i2, boolean z2) {
        int i3 = this.f4691l;
        int[] iArr = this.f4689j;
        if (i3 >= iArr.length) {
            this.f4689j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f4690k;
            this.f4690k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f4689j;
        int i4 = this.f4691l;
        iArr2[i4] = i2;
        boolean[] zArr2 = this.f4690k;
        this.f4691l = i4 + 1;
        zArr2[i4] = z2;
    }

    /* JADX INFO: renamed from: d */
    public final void m2745d(String str, int i2) {
        int i3 = this.f4688i;
        int[] iArr = this.f4686g;
        if (i3 >= iArr.length) {
            this.f4686g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f4687h;
            this.f4687h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f4686g;
        int i4 = this.f4688i;
        iArr2[i4] = i2;
        String[] strArr2 = this.f4687h;
        this.f4688i = i4 + 1;
        strArr2[i4] = str;
    }
}
