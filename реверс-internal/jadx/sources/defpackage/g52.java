package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public interface g52 extends h52 {
    @Override // defpackage.e52
    default long b(cb cbVar, cb cbVar2, cb cbVar3) {
        return ((long) (n() + k())) * 1000000;
    }

    int k();

    int n();
}
