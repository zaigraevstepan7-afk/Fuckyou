package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class mg {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new mg(0, 0, 0, 0);
    }

    public mg(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            yc.e(s91.j("Left must be less than or equal to right, left: ", i, ", right: ", i3));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        yc.e(s91.j("top must be less than or equal to bottom, top: ", i2, ", bottom: ", i4));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mg.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        mg mgVar = (mg) obj;
        return this.a == mgVar.a && this.b == mgVar.b && this.c == mgVar.c && this.d == mgVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return mg.class.getSimpleName() + " { [" + this.a + ',' + this.b + ',' + this.c + ',' + this.d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mg(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
