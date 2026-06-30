package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class yu0 {
    public final fu a;
    public final float b;
    public float c;
    public float d;
    public final /* synthetic */ zu0 e;

    public yu0(zu0 zu0Var, fu fuVar, float f, float f2) {
        fuVar.getClass();
        this.e = zu0Var;
        this.a = fuVar;
        if (f2 < f) {
            yc.p("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            throw null;
        }
        zu0Var.e.getClass();
        this.b = Float.intBitsToFloat((int) (wr.j(fuVar, Float.POSITIVE_INFINITY) & 4294967295L));
        this.c = f;
        this.d = f2;
    }

    public final j41 a(float f) {
        float fZ = lk.z(f, this.c, this.d);
        float f2 = this.d;
        float f3 = this.c;
        float f4 = (fZ - f3) / (f2 - f3);
        zu0 zu0Var = this.e;
        wr wrVar = zu0Var.e;
        float f5 = f4 * this.b;
        wrVar.getClass();
        fu fuVar = this.a;
        fuVar.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (wr.j(fuVar, f5) >> 32));
        if (0.0f > fIntBitsToFloat || fIntBitsToFloat > 1.0f) {
            yc.p("Cubic cut point is expected to be between 0 and 1");
            return null;
        }
        j41 j41VarD = fuVar.d(fIntBitsToFloat);
        return new j41(new yu0(zu0Var, (fu) j41VarD.e, this.c, fZ), new yu0(zu0Var, (fu) j41VarD.f, fZ, this.d));
    }

    public final String toString() {
        return "MeasuredCubic(outlineProgress=[" + this.c + " .. " + this.d + "], size=" + this.b + ", cubic=" + this.a + ')';
    }
}
