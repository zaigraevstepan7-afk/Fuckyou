package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class f20 {
    public final String a;
    public final sa0 b;
    public final sa0 c;
    public final boolean d;
    public final sa0 e;
    public final sa0 f;
    public final sa0 g;
    public final sa0 h;
    public final sa0 i;
    public final sa0 j;
    public final HashMap k;

    public f20(String str, sa0 sa0Var, sa0 sa0Var2, boolean z, sa0 sa0Var3, sa0 sa0Var4, sa0 sa0Var5, sa0 sa0Var6, sa0 sa0Var7, sa0 sa0Var8) {
        str.getClass();
        sa0Var.getClass();
        this.a = str;
        this.b = sa0Var;
        this.c = sa0Var2;
        this.d = z;
        this.e = sa0Var3;
        this.f = sa0Var4;
        this.g = sa0Var5;
        this.h = sa0Var6;
        this.i = sa0Var7;
        this.j = sa0Var8;
        this.k = new HashMap();
    }

    public final double a(h20 h20Var) {
        h20Var.getClass();
        return (h20Var.l == hm.f ? u4.g : u4.f).k(this, h20Var);
    }

    public final e20 b() {
        e20 e20Var = new e20();
        String str = this.a;
        str.getClass();
        e20Var.a = str;
        sa0 sa0Var = this.b;
        sa0Var.getClass();
        e20Var.b = sa0Var;
        e20Var.c = this.c;
        e20Var.d = this.d;
        e20Var.e = this.e;
        e20Var.f = this.f;
        e20Var.g = this.g;
        e20Var.h = this.h;
        e20Var.i = this.i;
        e20Var.j = this.j;
        return e20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f20)) {
            return false;
        }
        f20 f20Var = (f20) obj;
        return xi0.o(this.a, f20Var.a) && xi0.o(this.b, f20Var.b) && this.c.equals(f20Var.c) && this.d == f20Var.d && xi0.o(this.e, f20Var.e) && xi0.o(this.f, f20Var.f) && xi0.o(this.g, f20Var.g) && xi0.o(this.h, f20Var.h) && xi0.o(this.i, f20Var.i) && xi0.o(this.j, f20Var.j);
    }

    public final int hashCode() {
        int iD = s91.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        sa0 sa0Var = this.e;
        int iHashCode = (iD + (sa0Var == null ? 0 : sa0Var.hashCode())) * 31;
        sa0 sa0Var2 = this.f;
        int iHashCode2 = (iHashCode + (sa0Var2 == null ? 0 : sa0Var2.hashCode())) * 31;
        sa0 sa0Var3 = this.g;
        int iHashCode3 = (iHashCode2 + (sa0Var3 == null ? 0 : sa0Var3.hashCode())) * 31;
        sa0 sa0Var4 = this.h;
        int iHashCode4 = (iHashCode3 + (sa0Var4 == null ? 0 : sa0Var4.hashCode())) * 31;
        sa0 sa0Var5 = this.i;
        int iHashCode5 = (iHashCode4 + (sa0Var5 == null ? 0 : sa0Var5.hashCode())) * 31;
        sa0 sa0Var6 = this.j;
        return iHashCode5 + (sa0Var6 != null ? sa0Var6.hashCode() : 0);
    }

    public final String toString() {
        return "DynamicColor(name=" + this.a + ", palette=" + this.b + ", tone=" + this.c + ", isBackground=" + this.d + ", chromaMultiplier=" + this.e + ", background=" + this.f + ", secondBackground=" + this.g + ", contrastCurve=" + this.h + ", toneDeltaPair=" + this.i + ", opacity=" + this.j + ")";
    }
}
