package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class o22 extends n22 {
    public final /* synthetic */ int h;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                int i = this.g;
                this.g = i + 2;
                Object[] objArr = this.e;
                return new xt0(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.g;
                this.g = i2 + 2;
                return this.e[i2];
            default:
                int i3 = this.g;
                this.g = i3 + 2;
                return this.e[i3 + 1];
        }
    }
}
