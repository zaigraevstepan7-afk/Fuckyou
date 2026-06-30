package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class ji implements Iterable, Serializable {
    public static final ji g = new ji(ki0.b);
    public static final l91 h;
    public int e = 0;
    public final byte[] f;

    static {
        h = j3.a() ? new l91(24) : new l91(23);
    }

    public ji(byte[] bArr) {
        bArr.getClass();
        this.f = bArr;
    }

    public static int b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            yc.o(s91.h(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            yc.o(s91.j("Beginning index larger than ending index: ", i, ", ", i2));
            return 0;
        }
        yc.o(s91.j("End index: ", i2, " >= ", i3));
        return 0;
    }

    public static ji c(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOfRange;
        b(i, i + i2, bArr.length);
        switch (h.e) {
            case 23:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i2];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i2);
                break;
        }
        return new ji(bArrCopyOfRange);
    }

    public byte a(int i) {
        return this.f[i];
    }

    public void e(byte[] bArr, int i) {
        System.arraycopy(this.f, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ji) || size() != ((ji) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof ji)) {
            return obj.equals(this);
        }
        ji jiVar = (ji) obj;
        int i = this.e;
        int i2 = jiVar.e;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > jiVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > jiVar.size()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + jiVar.size());
        }
        byte[] bArr = jiVar.f;
        int iF = f() + size;
        int iF2 = f();
        int iF3 = jiVar.f();
        while (iF2 < iF) {
            if (this.f[iF2] != bArr[iF3]) {
                return false;
            }
            iF2++;
            iF3++;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    public byte g(int i) {
        return this.f[i];
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iF = f();
        int i2 = size;
        for (int i3 = iF; i3 < iF + size; i3++) {
            i2 = (i2 * 31) + this.f[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.e = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new hi(this);
    }

    public int size() {
        return this.f.length;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = pd1.l(this);
        } else {
            int iB = b(0, 47, size());
            strConcat = pd1.l(iB == 0 ? g : new ii(this.f, f(), iB)).concat("...");
        }
        return "<ByteString@" + hexString + " size=" + size + " contents=\"" + strConcat + "\">";
    }
}
