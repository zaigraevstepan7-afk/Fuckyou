package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class q52 {
    public final boolean a;
    public final p52 b;
    public final int c;
    public final ou[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public q52(boolean z, p52 p52Var) {
        int i;
        this.a = z;
        this.b = p52Var;
        if (z && p52Var.equals(p52.e)) {
            yc.l("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = p52Var.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                ez1.a();
                throw null;
            }
            i = 2;
        }
        this.c = i;
        this.d = new ou[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        ou[] ouVarArr = this.d;
        ou ouVar = ouVarArr[i];
        if (ouVar != null) {
            ouVar.a = j;
            ouVar.b = f;
        } else {
            ou ouVar2 = new ou();
            ouVar2.a = j;
            ouVar2.b = f;
            ouVarArr[i] = ouVar2;
        }
    }

    public final float b() {
        boolean z;
        p52 p52Var;
        float[] fArr;
        int i;
        float[] fArr2;
        int i2;
        float f;
        float f2;
        float fSignum;
        int i3 = this.e;
        ou[] ouVarArr = this.d;
        ou ouVar = ouVarArr[i3];
        if (ouVar == null) {
            return 0.0f;
        }
        int i4 = 0;
        ou ouVar2 = ouVar;
        do {
            ou ouVar3 = ouVarArr[i3];
            z = this.a;
            p52Var = this.b;
            float[] fArr3 = this.f;
            fArr = this.g;
            if (ouVar3 == null) {
                i = i4;
                fArr2 = fArr3;
                i2 = 1;
                f = 0.0f;
            } else {
                long j = ouVar.a;
                i = i4;
                f = 0.0f;
                long j2 = ouVar3.a;
                float f3 = j - j2;
                fArr2 = fArr3;
                i2 = 1;
                float fAbs = Math.abs(j2 - ouVar2.a);
                ouVar2 = (p52Var == p52.e || z) ? ouVar3 : ouVar;
                if (f3 <= 100.0f && fAbs <= 40.0f) {
                    fArr2[i] = ouVar3.b;
                    fArr[i] = -f3;
                    if (i3 == 0) {
                        i3 = 20;
                    }
                    i3--;
                    i4 = i + 1;
                }
            }
            i4 = i;
            break;
        } while (i4 < 20);
        if (i4 < this.c) {
            return f;
        }
        int iOrdinal = p52Var.ordinal();
        if (iOrdinal == 0) {
            try {
                float[] fArr4 = this.h;
                pd1.o(fArr, fArr2, i4, fArr4);
                f2 = fArr4[1];
            } catch (IllegalArgumentException unused) {
                f2 = f;
            }
            fSignum = f2;
        } else {
            if (iOrdinal != i2) {
                ez1.a();
                return f;
            }
            int i5 = i4 - i2;
            float f4 = fArr[i5];
            int i6 = i5;
            float f5 = f;
            while (i6 > 0) {
                int i7 = i6 - 1;
                float f6 = fArr[i7];
                if (f4 != f6) {
                    float f7 = (z ? -fArr2[i7] : fArr2[i6] - fArr2[i7]) / (f4 - f6);
                    float fAbs2 = (Math.abs(f7) * (f7 - (Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f))))) + f5;
                    if (i6 == i5) {
                        fAbs2 *= 0.5f;
                    }
                    f5 = fAbs2;
                }
                i6--;
                f4 = f6;
            }
            fSignum = Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f));
        }
        return fSignum * 1000.0f;
    }

    public final float c(float f) {
        if (f <= 0.0f) {
            ng0.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        float fB = b();
        if (fB == 0.0f || Float.isNaN(fB)) {
            return 0.0f;
        }
        if (fB <= 0.0f) {
            float f2 = -f;
            if (fB < f2) {
                return f2;
            }
        } else if (fB > f) {
            return f;
        }
        return fB;
    }

    public /* synthetic */ q52() {
        this(false, p52.e);
    }

    public q52(boolean z) {
        this(z, p52.f);
    }
}
