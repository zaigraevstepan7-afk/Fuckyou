package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class go1 {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public final Object d;

    public go1(boolean z, wk1 wk1Var, ll llVar) {
        this.a = 0;
        this.b = z;
        this.c = wk1Var;
        this.d = llVar;
    }

    public du a() {
        ll llVar = (ll) this.d;
        int i = llVar.b;
        int i2 = llVar.c;
        return i < i2 ? du.f : i > i2 ? du.e : du.g;
    }

    public void b() {
        if (this.b) {
            ry1.b((ry1) this.d, (wz1) this.c);
        }
    }

    public long c(az1 az1Var, long j, boolean z, yc ycVar) {
        ry1 ry1Var = (ry1) this.d;
        long jC = ry1.c(ry1Var, az1Var, j, z, false, ycVar, false, null);
        if (!wz1.a(jC, (wz1) this.c)) {
            this.b = false;
        }
        ry1Var.q(wz1.c(jC) ? cd0.g : cd0.f);
        return jC;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "SingleSelectionLayout(isStartHandle=" + this.b + ", crossed=" + a() + ", info=\n\t" + ((ll) this.d) + ")";
            default:
                return super.toString();
        }
    }

    public go1(ry1 ry1Var) {
        this.a = 1;
        this.d = ry1Var;
        this.b = true;
    }
}
