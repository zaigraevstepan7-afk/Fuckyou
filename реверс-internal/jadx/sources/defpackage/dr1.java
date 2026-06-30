package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class dr1 implements Cloneable {
    public /* synthetic */ int[] e;
    public /* synthetic */ Object[] f;
    public /* synthetic */ int g;

    public dr1() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.e = new int[i4];
        this.f = new Object[i4];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dr1 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        dr1 dr1Var = (dr1) objClone;
        dr1Var.e = (int[]) this.e.clone();
        dr1Var.f = (Object[]) this.f.clone();
        return dr1Var;
    }

    public final Object b(int i) {
        Object obj;
        int iR = wi0.r(this.g, i, this.e);
        if (iR < 0 || (obj = this.f[iR]) == s22.l0) {
            return null;
        }
        return obj;
    }

    public final void c(int i, Object obj) {
        int iR = wi0.r(this.g, i, this.e);
        if (iR >= 0) {
            this.f[iR] = obj;
            return;
        }
        int i2 = ~iR;
        int i3 = this.g;
        if (i2 < i3) {
            Object[] objArr = this.f;
            if (objArr[i2] == s22.l0) {
                this.e[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.e.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.e = Arrays.copyOf(this.e, i7);
            this.f = Arrays.copyOf(this.f, i7);
        }
        int i8 = this.g;
        if (i8 - i2 != 0) {
            int[] iArr = this.e;
            int i9 = i2 + 1;
            nd.K(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.f;
            nd.M(objArr2, objArr2, i9, i2, this.g);
        }
        this.e[i2] = i;
        this.f[i2] = obj;
        this.g++;
    }

    public final Object d(int i) {
        Object[] objArr = this.f;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i = this.g;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.g;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.e[i3]);
            sb.append('=');
            Object objD = d(i3);
            if (objD != this) {
                sb.append(objD);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
