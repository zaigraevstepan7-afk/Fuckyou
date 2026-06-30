package defpackage;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class r72 extends s72 {
    public final WindowInsetsAnimation e;

    public r72(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.s72
    public final long a() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.s72
    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.s72
    public final int c() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.s72
    public final void d(float f) {
        this.e.setFraction(f);
    }
}
