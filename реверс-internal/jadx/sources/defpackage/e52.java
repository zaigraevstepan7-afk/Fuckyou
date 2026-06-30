package defpackage;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public interface e52 {
    boolean a();

    long b(cb cbVar, cb cbVar2, cb cbVar3);

    cb l(long j, cb cbVar, cb cbVar2, cb cbVar3);

    cb o(long j, cb cbVar, cb cbVar2, cb cbVar3);

    default cb p(cb cbVar, cb cbVar2, cb cbVar3) {
        return l(b(cbVar, cbVar2, cbVar3), cbVar, cbVar2, cbVar3);
    }
}
