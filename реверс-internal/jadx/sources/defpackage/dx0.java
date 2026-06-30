package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class dx0 extends fu {
    public final void g(d81 d81Var, int i) {
        float[] fArr = this.a;
        int i2 = i + 1;
        long jA = d81Var.a(fArr[i], fArr[i2]);
        fArr[i] = Float.intBitsToFloat((int) (jA >> 32));
        fArr[i2] = Float.intBitsToFloat((int) (4294967295L & jA));
    }
}
