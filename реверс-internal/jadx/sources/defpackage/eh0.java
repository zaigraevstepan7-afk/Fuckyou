package defpackage;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class eh0 {
    public static final eh0 e = new eh0(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public eh0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static eh0 a(eh0 eh0Var, eh0 eh0Var2) {
        return b(Math.max(eh0Var.a, eh0Var2.a), Math.max(eh0Var.b, eh0Var2.b), Math.max(eh0Var.c, eh0Var2.c), Math.max(eh0Var.d, eh0Var2.d));
    }

    public static eh0 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new eh0(i, i2, i3, i4);
    }

    public static eh0 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return qr.h(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eh0.class != obj.getClass()) {
            return false;
        }
        eh0 eh0Var = (eh0) obj;
        return this.d == eh0Var.d && this.a == eh0Var.a && this.c == eh0Var.c && this.b == eh0Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
