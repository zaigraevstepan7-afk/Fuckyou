package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class cx1 {
    public final hb a;
    public final d02 b;
    public final boolean e;
    public final hx g;
    public final c90 h;
    public me j;
    public al0 k;
    public final int c = Integer.MAX_VALUE;
    public final int d = 1;
    public final int f = 1;
    public final List i = f40.e;

    public cx1(hb hbVar, d02 d02Var, boolean z, hx hxVar, c90 c90Var, int i) {
        this.a = hbVar;
        this.b = d02Var;
        this.e = z;
        this.g = hxVar;
        this.h = c90Var;
    }

    public final void a(al0 al0Var) {
        me meVar = this.j;
        if (meVar == null || al0Var != this.k || meVar.b()) {
            this.k = al0Var;
            meVar = new me(this.a, qc1.x(this.b, al0Var), this.i, this.g, this.h);
        }
        this.j = meVar;
    }
}
