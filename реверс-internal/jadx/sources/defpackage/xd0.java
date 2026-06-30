package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xd0 {
    public final wa0 a;
    public final /* synthetic */ int b;

    public xd0(int i, wa0 wa0Var) {
        this.b = i;
        this.a = wa0Var;
    }

    public final float a(float f, zk0 zk0Var, zk0 zk0Var2) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat((int) (zk0Var2.r(zk0Var, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(((int) (zk0Var.K() >> 32)) / 2.0f) << 32)) & 4294967295L));
            default:
                return Float.intBitsToFloat((int) (zk0Var2.r(zk0Var, (((long) Float.floatToRawIntBits(((int) (zk0Var.K() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
        }
    }
}
