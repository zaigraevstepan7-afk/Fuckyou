package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
final class oc0 extends xv0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final ym1 f;
    public final boolean g;
    public final long h;
    public final long i;
    public final vk0 j;

    public oc0(float f, float f2, float f3, float f4, long j, ym1 ym1Var, boolean z, long j2, long j3, vk0 vk0Var) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = ym1Var;
        this.g = z;
        this.h = j2;
        this.i = j3;
        this.j = vk0Var;
    }

    @Override // defpackage.xv0
    public final sv0 d() {
        ao1 ao1Var = new ao1();
        ao1Var.s = this.a;
        ao1Var.t = this.b;
        ao1Var.u = this.c;
        ao1Var.v = this.d;
        ao1Var.w = 8.0f;
        ao1Var.x = this.e;
        ao1Var.y = this.f;
        ao1Var.z = this.g;
        ao1Var.A = this.h;
        ao1Var.B = this.i;
        ao1Var.C = 3;
        ao1Var.D = this.j;
        ao1Var.E = new g3(20, ao1Var);
        return ao1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc0)) {
            return false;
        }
        oc0 oc0Var = (oc0) obj;
        return Float.compare(this.a, oc0Var.a) == 0 && Float.compare(this.b, oc0Var.b) == 0 && Float.compare(this.c, oc0Var.c) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.d, oc0Var.d) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && u12.a(this.e, oc0Var.e) && xi0.o(this.f, oc0Var.f) && this.g == oc0Var.g && vl.c(this.h, oc0Var.h) && vl.c(this.i, oc0Var.i) && xi0.o(this.j, oc0Var.j);
    }

    @Override // defpackage.xv0
    public final void f(sv0 sv0Var) {
        ao1 ao1Var = (ao1) sv0Var;
        ao1Var.s = this.a;
        ao1Var.t = this.b;
        ao1Var.u = this.c;
        ao1Var.v = this.d;
        ao1Var.w = 8.0f;
        ao1Var.x = this.e;
        ao1Var.y = this.f;
        ao1Var.z = this.g;
        ao1Var.A = this.h;
        ao1Var.B = this.i;
        ao1Var.C = 3;
        ao1Var.D = this.j;
        el.V(ao1Var, ao1Var.E);
    }

    public final int hashCode() {
        int iA = s91.a(8.0f, s91.a(0.0f, s91.a(0.0f, s91.a(0.0f, s91.a(this.d, s91.a(0.0f, s91.a(0.0f, s91.a(this.c, s91.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = u12.c;
        int iD = s91.d((this.f.hashCode() + s91.c(iA, 31, this.e)) * 31, 961, this.g);
        int i2 = vl.h;
        return this.j.hashCode() + s91.b(3, s91.b(0, s91.c(s91.c(iD, 31, this.h), 31, this.i), 31), 961);
    }

    public final String toString() {
        String strB = u12.b(this.e);
        String strI = vl.i(this.h);
        String strI2 = vl.i(this.i);
        String strV = c2.v(3);
        StringBuilder sbM = s91.m("GraphicsLayerElement(scaleX=", this.a, ", scaleY=", this.b, ", alpha=");
        sbM.append(this.c);
        sbM.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sbM.append(this.d);
        sbM.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sbM.append(strB);
        sbM.append(", shape=");
        sbM.append(this.f);
        sbM.append(", clip=");
        sbM.append(this.g);
        sbM.append(", renderEffect=null, ambientShadowColor=");
        sbM.append(strI);
        sbM.append(", spotShadowColor=");
        s91.u(sbM, strI2, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", strV, ", colorFilter=null, outsets=");
        sbM.append(this.j);
        sbM.append(")");
        return sbM.toString();
    }
}
