package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class oh extends z {
    public final /* synthetic */ int g = 1;
    public final Object h;

    public oh(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.h = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    yc.m();
                } else {
                    int i2 = this.e;
                    this.e = i2 + 1;
                }
                break;
            default:
                if (!hasNext()) {
                    yc.m();
                } else {
                    this.e++;
                }
                break;
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    yc.m();
                } else {
                    int i2 = this.e - 1;
                    this.e = i2;
                }
                break;
            default:
                if (!hasPrevious()) {
                    yc.m();
                } else {
                    this.e--;
                }
                break;
        }
        return null;
    }

    public oh(int i, Object obj) {
        super(i, 1);
        this.h = obj;
    }
}
