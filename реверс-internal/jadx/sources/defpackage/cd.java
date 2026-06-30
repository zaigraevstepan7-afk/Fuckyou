package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cd implements bd, dd {
    public final float e;
    public final yc f;
    public final float g;

    public cd(float f, yc ycVar) {
        this.e = f;
        this.f = ycVar;
        this.g = f;
    }

    @Override // defpackage.bd, defpackage.dd
    public final float a() {
        return this.g;
    }

    @Override // defpackage.bd
    public final void b(xu0 xu0Var, int i, int[] iArr, al0 al0Var, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int iN = xu0Var.N(this.e);
        boolean z = al0Var == al0.f;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iN, iMax);
                i = iArr2[i4] - iMin;
                i3++;
                i4++;
            }
            i2 = i + iMin;
        } else {
            int length2 = iArr.length;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i5 < length2) {
                int i9 = iArr[i5];
                int iMin2 = Math.min(i6, i - i9);
                iArr2[i8] = iMin2;
                int iMin3 = Math.min(iN, (i - iMin2) - i9);
                int i10 = iArr2[i8] + i9 + iMin3;
                i5++;
                i7 = iMin3;
                i6 = i10;
                i8++;
            }
            i2 = i - (i6 - i7);
        }
        if (i2 > 0) {
            int iRound = Math.round((1.0f + (al0Var == al0.e ? -1.0f : 1.0f)) * (i2 / 2.0f));
            if (z) {
                iRound -= i2;
            }
            if (iRound != 0) {
                int length3 = iArr2.length;
                for (int i11 = 0; i11 < length3; i11++) {
                    iArr2[i11] = iArr2[i11] + iRound;
                }
            }
        }
    }

    @Override // defpackage.dd
    public final void e(int i, xu0 xu0Var, int[] iArr, int[] iArr2) {
        b(xu0Var, i, iArr, al0.e, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cd) {
            cd cdVar = (cd) obj;
            return tz.b(this.e, cdVar.e) && this.f == cdVar.f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + s91.d(Float.hashCode(this.e) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + tz.c(this.e) + ", " + this.f + ")";
    }
}
