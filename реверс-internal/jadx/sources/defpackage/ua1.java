package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class ua1 implements xo0 {
    public static final ua1 m = new ua1();
    public int e;
    public int f;
    public Handler i;
    public boolean g = true;
    public boolean h = true;
    public final zo0 j = new zo0(this, true);
    public final p k = new p(7, this);
    public final y41 l = new y41(5, this);

    public final void a() {
        int i = this.f + 1;
        this.f = i;
        if (i == 1) {
            if (this.g) {
                this.j.d(po0.ON_RESUME);
                this.g = false;
            } else {
                Handler handler = this.i;
                handler.getClass();
                handler.removeCallbacks(this.k);
            }
        }
    }

    @Override // defpackage.xo0
    public final zo0 g() {
        return this.j;
    }
}
