package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class us0 implements vu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ sa0 d;
    public final /* synthetic */ ws0 e;

    public us0(int i, int i2, Map map, sa0 sa0Var, ws0 ws0Var) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = sa0Var;
        this.e = ws0Var;
    }

    @Override // defpackage.vu0
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.vu0
    public final void b() {
        this.d.i(this.e.t);
    }

    @Override // defpackage.vu0
    public final int d() {
        return this.b;
    }

    @Override // defpackage.vu0
    public final sa0 e() {
        return null;
    }

    @Override // defpackage.vu0
    public final int g() {
        return this.a;
    }
}
