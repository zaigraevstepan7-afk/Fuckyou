package defpackage;

import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class k71 extends i71 {
    @Override // defpackage.i71, defpackage.g71
    public final void a(long j, long j2) {
        if (!Float.isNaN(Float.NaN)) {
            this.a.setZoom(Float.NaN);
        }
        long j3 = 9223372034707292159L & j2;
        Magnifier magnifier = this.a;
        if (j3 != 9205357640488583168L) {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
