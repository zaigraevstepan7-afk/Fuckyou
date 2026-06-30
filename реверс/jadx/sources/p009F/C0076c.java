package p009F;

import android.graphics.Insets;

/* JADX INFO: renamed from: F.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0076c {

    /* JADX INFO: renamed from: e */
    public static final C0076c f237e = new C0076c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f238a;

    /* JADX INFO: renamed from: b */
    public final int f239b;

    /* JADX INFO: renamed from: c */
    public final int f240c;

    /* JADX INFO: renamed from: d */
    public final int f241d;

    public C0076c(int i2, int i3, int i4, int i5) {
        this.f238a = i2;
        this.f239b = i3;
        this.f240c = i4;
        this.f241d = i5;
    }

    /* JADX INFO: renamed from: a */
    public static C0076c m358a(C0076c c0076c, C0076c c0076c2) {
        return m359b(Math.max(c0076c.f238a, c0076c2.f238a), Math.max(c0076c.f239b, c0076c2.f239b), Math.max(c0076c.f240c, c0076c2.f240c), Math.max(c0076c.f241d, c0076c2.f241d));
    }

    /* JADX INFO: renamed from: b */
    public static C0076c m359b(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f237e : new C0076c(i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: c */
    public static C0076c m360c(Insets insets) {
        return m359b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: d */
    public final Insets m361d() {
        return AbstractC0075b.m357a(this.f238a, this.f239b, this.f240c, this.f241d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0076c.class != obj.getClass()) {
            return false;
        }
        C0076c c0076c = (C0076c) obj;
        return this.f241d == c0076c.f241d && this.f238a == c0076c.f238a && this.f240c == c0076c.f240c && this.f239b == c0076c.f239b;
    }

    public final int hashCode() {
        return (((((this.f238a * 31) + this.f239b) * 31) + this.f240c) * 31) + this.f241d;
    }

    public final String toString() {
        return "Insets{left=" + this.f238a + ", top=" + this.f239b + ", right=" + this.f240c + ", bottom=" + this.f241d + '}';
    }
}
