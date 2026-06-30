package defpackage;

import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class i71 implements g71 {
    public final Magnifier a;

    public i71(Magnifier magnifier) {
        this.a = magnifier;
    }

    @Override // defpackage.g71
    public void a(long j, long j2) {
        this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void b() {
        this.a.dismiss();
    }

    public final long c() {
        return (((long) this.a.getWidth()) << 32) | (((long) this.a.getHeight()) & 4294967295L);
    }

    public final void d() {
        this.a.update();
    }
}
