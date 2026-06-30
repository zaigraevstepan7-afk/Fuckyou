package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ne {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public ne(vy0 vy0Var) {
        vy0Var.getClass();
        float f = vy0Var.c;
        float f2 = vy0Var.d;
        float f3 = vy0Var.b;
        int i = vy0Var.a;
        long j = vy0Var.e;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }
}
