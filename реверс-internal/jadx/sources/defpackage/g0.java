package defpackage;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 extends wb1 {
    @Override // defpackage.wb1
    public final int a(int i) {
        return (d().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.wb1
    public final int b() {
        return d().nextInt();
    }

    public abstract Random d();
}
