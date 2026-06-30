package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public interface y60 extends wa {
    @Override // defpackage.wa
    default e52 a(r22 r22Var) {
        return new vu(this);
    }

    float b(long j, float f, float f2, float f3);

    float c(long j, float f, float f2, float f3);

    long d(float f, float f2, float f3);

    default float e(float f, float f2, float f3) {
        return c(d(f, f2, f3), f, f2, f3);
    }
}
