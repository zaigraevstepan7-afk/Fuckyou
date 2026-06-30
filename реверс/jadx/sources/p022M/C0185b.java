package p022M;

import android.graphics.Rect;

/* JADX INFO: renamed from: M.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0185b {

    /* JADX INFO: renamed from: a */
    public final Rect f613a;

    /* JADX INFO: renamed from: b */
    public final Rect f614b;

    public C0185b(Rect rect, Rect rect2) {
        this.f613a = rect;
        this.f614b = rect2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0185b)) {
            return false;
        }
        C0185b c0185b = (C0185b) obj;
        return c0185b.f613a.equals(this.f613a) && c0185b.f614b.equals(this.f614b);
    }

    public final int hashCode() {
        return this.f613a.hashCode() ^ this.f614b.hashCode();
    }

    public final String toString() {
        return "Pair{" + this.f613a + " " + this.f614b + "}";
    }
}
