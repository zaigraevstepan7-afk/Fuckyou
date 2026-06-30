package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class vy0 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public vy0(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vy0.class == obj.getClass()) {
            vy0 vy0Var = (vy0) obj;
            return this.c == vy0Var.c && this.d == vy0Var.d && this.b == vy0Var.b && this.a == vy0Var.a && this.e == vy0Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + s91.b(this.a, s91.a(this.b, s91.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
