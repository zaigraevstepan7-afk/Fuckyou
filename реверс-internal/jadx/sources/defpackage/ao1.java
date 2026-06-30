package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ao1 extends sv0 implements il0, pl1 {
    public long A;
    public long B;
    public int C;
    public vk0 D;
    public g3 E;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public long x;
    public ym1 y;
    public boolean z;

    @Override // defpackage.sv0
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.il0
    public final vu0 e(xu0 xu0Var, pu0 pu0Var, long j) {
        z61 z61VarE = pu0Var.e(j);
        return xu0Var.f0(z61VarE.e, z61VarE.f, g40.e, new b7(8, z61VarE, this));
    }

    @Override // defpackage.pl1
    public final void g0(am1 am1Var) {
        if (this.z) {
            yl1.c(am1Var, this.y);
        }
    }

    @Override // defpackage.pl1
    public final boolean h() {
        return false;
    }

    public final String toString() {
        float f = this.s;
        float f2 = this.t;
        float f3 = this.u;
        float f4 = this.v;
        float f5 = this.w;
        String strB = u12.b(this.x);
        ym1 ym1Var = this.y;
        boolean z = this.z;
        String strI = vl.i(this.A);
        String strI2 = vl.i(this.B);
        String strV = c2.v(this.C);
        vk0 vk0Var = this.D;
        StringBuilder sbM = s91.m("SimpleGraphicsLayerModifier(scaleX=", f, ", scaleY=", f2, ", alpha = ");
        sbM.append(f3);
        sbM.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sbM.append(f4);
        sbM.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sbM.append(f5);
        sbM.append(", transformOrigin=");
        sbM.append(strB);
        sbM.append(", shape=");
        sbM.append(ym1Var);
        sbM.append(", clip=");
        sbM.append(z);
        sbM.append(", renderEffect=null, ambientShadowColor=");
        s91.u(sbM, strI, ", spotShadowColor=", strI2, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sbM.append(strV);
        sbM.append(", colorFilter=nulloutsets=");
        sbM.append(vk0Var);
        sbM.append(")");
        return sbM.toString();
    }
}
