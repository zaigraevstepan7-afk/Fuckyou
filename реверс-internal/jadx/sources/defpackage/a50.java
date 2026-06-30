package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class a50 extends y implements z40, RandomAccess, Serializable {
    public final Enum[] e;

    public a50(Enum[] enumArr) {
        this.e = enumArr;
    }

    @Override // defpackage.o
    public final int a() {
        return this.e.length;
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r2 = (Enum) obj;
        return ((Enum) nd.U(r2.ordinal(), this.e)) == r2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.e;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        yc.o(s91.j("index: ", i, ", size: ", length));
        return null;
    }

    @Override // defpackage.y, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) nd.U(iOrdinal, this.e)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.y, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) nd.U(iOrdinal, this.e)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
