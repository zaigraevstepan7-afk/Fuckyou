package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class dj0 implements xu0, pi0 {
    public final /* synthetic */ pi0 e;
    public final al0 f;

    public dj0(pi0 pi0Var, al0 al0Var) {
        this.e = pi0Var;
        this.f = al0Var;
    }

    @Override // defpackage.hx
    public final float J(long j) {
        return this.e.J(j);
    }

    @Override // defpackage.hx
    public final int N(float f) {
        return this.e.N(f);
    }

    @Override // defpackage.hx
    public final long X(long j) {
        return this.e.X(j);
    }

    @Override // defpackage.hx
    public final float b() {
        return this.e.b();
    }

    @Override // defpackage.hx
    public final float d0(long j) {
        return this.e.d0(j);
    }

    @Override // defpackage.pi0
    public final al0 getLayoutDirection() {
        return this.f;
    }

    @Override // defpackage.hx
    public final float l() {
        return this.e.l();
    }

    @Override // defpackage.hx
    public final long m0(float f) {
        return this.e.m0(f);
    }

    @Override // defpackage.pi0
    public final boolean s() {
        return this.e.s();
    }

    @Override // defpackage.hx
    public final float s0(int i) {
        return this.e.s0(i);
    }

    @Override // defpackage.xu0
    public final vu0 u(int i, int i2, Map map, sa0 sa0Var) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            ng0.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new cj0(i, i2, map);
    }

    @Override // defpackage.hx
    public final long v(float f) {
        return this.e.v(f);
    }

    @Override // defpackage.hx
    public final float v0(float f) {
        return this.e.v0(f);
    }

    @Override // defpackage.hx
    public final long w(long j) {
        return this.e.w(j);
    }

    @Override // defpackage.hx
    public final float y(float f) {
        return this.e.y(f);
    }
}
