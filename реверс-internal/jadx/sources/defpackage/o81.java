package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class o81 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public o81(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o81)) {
            return false;
        }
        o81 o81Var = (o81) obj;
        return al.v(this.a, o81Var.a) && this.b == o81Var.b && w01.b(this.c, o81Var.c) && w01.b(this.d, o81Var.d) && this.e == o81Var.e && Float.compare(this.f, o81Var.f) == 0 && this.g == o81Var.g && this.h == o81Var.h && this.i.equals(o81Var.i) && w01.b(this.j, o81Var.j) && Float.compare(this.k, o81Var.k) == 0 && w01.b(this.l, o81Var.l) && w01.b(this.m, o81Var.m);
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + s91.c(s91.a(this.k, s91.c((this.i.hashCode() + s91.d(s91.b(this.g, s91.a(this.f, s91.d(s91.c(s91.c(s91.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h)) * 31, 31, this.j), 31), 31, this.l);
    }

    public final String toString() {
        String strT = al.T(this.a);
        String strG = w01.g(this.c);
        String strG2 = w01.g(this.d);
        String strA = s81.a(this.g);
        String strG3 = w01.g(this.j);
        String strG4 = w01.g(this.l);
        String strG5 = w01.g(this.m);
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append(strT);
        sb.append(", uptime=");
        sb.append(this.b);
        s91.u(sb, ", positionOnScreen=", strG, ", position=", strG2);
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(strA);
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append(strG3);
        sb.append(", scaleGestureFactor=");
        sb.append(this.k);
        sb.append(", panGestureOffset=");
        sb.append(strG4);
        sb.append(", originalEventPosition=");
        sb.append(strG5);
        sb.append(")");
        return sb.toString();
    }
}
