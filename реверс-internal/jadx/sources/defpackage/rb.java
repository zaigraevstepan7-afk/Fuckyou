package defpackage;

import android.text.SegmentFinder;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class rb extends SegmentFinder {
    public final /* synthetic */ n81 a;

    public rb(n81 n81Var) {
        this.a = n81Var;
    }

    public final int nextEndBoundary(int i) {
        return this.a.b(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.d(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.e(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.a(i);
    }
}
