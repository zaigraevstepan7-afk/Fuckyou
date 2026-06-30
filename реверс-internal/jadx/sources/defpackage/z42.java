package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class z42 extends b52 implements Iterable, yj0 {
    public final String e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final List m;
    public final List n;

    public z42(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.e = str;
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
        this.j = f5;
        this.k = f6;
        this.l = f7;
        this.m = list;
        this.n = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof z42)) {
            z42 z42Var = (z42) obj;
            return xi0.o(this.e, z42Var.e) && this.f == z42Var.f && this.g == z42Var.g && this.h == z42Var.h && this.i == z42Var.i && this.j == z42Var.j && this.k == z42Var.k && this.l == z42Var.l && xi0.o(this.m, z42Var.m) && xi0.o(this.n, z42Var.n);
        }
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode() + ((this.m.hashCode() + s91.a(this.l, s91.a(this.k, s91.a(this.j, s91.a(this.i, s91.a(this.h, s91.a(this.g, s91.a(this.f, this.e.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new h61(this);
    }
}
