package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ii extends ji {
    public final int i;
    public final int j;

    public ii(byte[] bArr, int i, int i2) {
        super(bArr);
        ji.b(i, i + i2, bArr.length);
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.ji
    public final byte a(int i) {
        int i2 = this.j;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f[this.i + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(s91.i("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(s91.j("Index > length: ", i, ", ", i2));
    }

    @Override // defpackage.ji
    public final void e(byte[] bArr, int i) {
        System.arraycopy(this.f, this.i, bArr, 0, i);
    }

    @Override // defpackage.ji
    public final int f() {
        return this.i;
    }

    @Override // defpackage.ji
    public final byte g(int i) {
        return this.f[this.i + i];
    }

    @Override // defpackage.ji
    public final int size() {
        return this.j;
    }
}
