package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class l81 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final ArrayList m;
    public final long n;
    public boolean o;
    public boolean p;
    public l81 q;

    public l81(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.n = 0L;
        this.o = z3;
        this.p = z3;
    }

    public final void a() {
        l81 l81Var = this.q;
        if (l81Var == null) {
            this.o = true;
            this.p = true;
        } else if (l81Var != null) {
            l81Var.a();
        }
    }

    public final List b() {
        ArrayList arrayList = this.m;
        return arrayList == null ? f40.e : arrayList;
    }

    public final boolean c() {
        l81 l81Var = this.q;
        return l81Var != null ? l81Var.c() : this.o || this.p;
    }

    public final String toString() {
        return "PointerInputChange(id=" + al.T(this.a) + ", uptimeMillis=" + this.b + ", position=" + w01.g(this.c) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + w01.g(this.g) + ", previousPressed=" + this.h + ", isConsumed=" + c() + ", type=" + s81.a(this.i) + ", historical=" + b() + ", scrollDelta=" + w01.g(this.j) + ", scaleFactor=" + this.k + ", panOffset=" + w01.g(this.l) + ")";
    }

    public l81(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.m = arrayList;
        this.n = j8;
    }
}
