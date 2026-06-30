package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class oz1 {
    public final hb a;
    public final d02 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final hx g;
    public final al0 h;
    public final c90 i;
    public final long j;

    public oz1(hb hbVar, d02 d02Var, List list, int i, boolean z, int i2, hx hxVar, al0 al0Var, c90 c90Var, long j) {
        this.a = hbVar;
        this.b = d02Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = hxVar;
        this.h = al0Var;
        this.i = c90Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz1)) {
            return false;
        }
        oz1 oz1Var = (oz1) obj;
        return xi0.o(this.a, oz1Var.a) && xi0.o(this.b, oz1Var.b) && xi0.o(this.c, oz1Var.c) && this.d == oz1Var.d && this.e == oz1Var.e && this.f == oz1Var.f && xi0.o(this.g, oz1Var.g) && this.h == oz1Var.h && xi0.o(this.i, oz1Var.i) && kr.b(this.j, oz1Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + s91.b(this.f, s91.d((((this.c.hashCode() + s91.e(this.b, this.a.hashCode() * 31, 31)) * 31) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        int i = this.f;
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid") + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + kr.k(this.j) + ")";
    }
}
