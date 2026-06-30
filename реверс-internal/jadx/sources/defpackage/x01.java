package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class x01 implements vc, g52 {
    public final int e;
    public int f;
    public final Object g;

    public x01(int i, int i2, j20 j20Var) {
        this.e = i;
        this.f = i2;
        this.g = new vu((y60) new d70(i, i2, j20Var));
    }

    @Override // defpackage.vc
    public void c(int i, Object obj) {
        ((vc) this.g).c(i + (this.f == 0 ? this.e : 0), obj);
    }

    @Override // defpackage.vc
    public void d(Object obj) {
        this.f++;
        ((vc) this.g).d(obj);
    }

    @Override // defpackage.vc
    public void e() {
        ((vc) this.g).e();
    }

    @Override // defpackage.vc
    public void f(int i, Object obj) {
        ((vc) this.g).f(i + (this.f == 0 ? this.e : 0), obj);
    }

    @Override // defpackage.vc
    public void h(int i, int i2, int i3) {
        int i4 = this.f == 0 ? this.e : 0;
        ((vc) this.g).h(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.vc
    public Object i() {
        return ((vc) this.g).i();
    }

    @Override // defpackage.vc
    public void j(int i, int i2) {
        ((vc) this.g).j(i + (this.f == 0 ? this.e : 0), i2);
    }

    @Override // defpackage.g52
    public int k() {
        return this.f;
    }

    @Override // defpackage.e52
    public cb l(long j, cb cbVar, cb cbVar2, cb cbVar3) {
        return ((vu) this.g).l(j, cbVar, cbVar2, cbVar3);
    }

    @Override // defpackage.vc
    public void m(wa0 wa0Var, Object obj) {
        ((vc) this.g).m(wa0Var, obj);
    }

    @Override // defpackage.g52
    public int n() {
        return this.e;
    }

    @Override // defpackage.e52
    public cb o(long j, cb cbVar, cb cbVar2, cb cbVar3) {
        return ((vu) this.g).o(j, cbVar, cbVar2, cbVar3);
    }

    @Override // defpackage.vc
    public void q() {
        if (this.f <= 0) {
            mp.a("OffsetApplier up called with no corresponding down");
        }
        this.f--;
        ((vc) this.g).q();
    }

    public x01(vc vcVar, int i) {
        this.g = vcVar;
        this.e = i;
    }
}
