package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ex0 {
    public float[] a;
    public int b;

    public ex0(int i) {
        this.a = i == 0 ? b70.a : new float[i];
    }

    public static String c(ex0 ex0Var, int i) {
        String str = (i & 2) != 0 ? "" : "[";
        String str2 = (i & 4) == 0 ? "]" : "";
        ex0Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        float[] fArr = ex0Var.a;
        int i2 = ex0Var.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                sb.append((CharSequence) str2);
                break;
            }
            float f = fArr[i3];
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i3 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(f);
            i3++;
        }
        return sb.toString();
    }

    public final void a(float f) {
        int i = this.b + 1;
        float[] fArr = this.a;
        if (fArr.length < i) {
            this.a = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
        }
        float[] fArr2 = this.a;
        int i2 = this.b;
        fArr2[i2] = f;
        this.b = i2 + 1;
    }

    public final float b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        yc.o("Index must be between 0 and size");
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ex0) {
            ex0 ex0Var = (ex0) obj;
            int i = ex0Var.b;
            int i2 = this.b;
            if (i == i2) {
                float[] fArr = this.a;
                float[] fArr2 = ex0Var.a;
                rh0 rh0VarO0 = lk.o0(0, i2);
                int i3 = rh0VarO0.e;
                int i4 = rh0VarO0.f;
                if (i3 > i4) {
                    return true;
                }
                while (fArr[i3] == fArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Float.hashCode(fArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        return c(this, 25);
    }
}
