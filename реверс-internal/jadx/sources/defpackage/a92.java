package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class a92 {
    public final mg a;
    public final float b;

    public a92(Rect rect, float f) {
        this.a = new mg(rect);
        this.b = f;
    }

    public final Rect a() {
        mg mgVar = this.a;
        mgVar.getClass();
        return new Rect(mgVar.a, mgVar.b, mgVar.c, mgVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a92.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        a92 a92Var = (a92) obj;
        return xi0.o(this.a, a92Var.a) && this.b == a92Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public a92(mg mgVar, float f) {
        this.a = mgVar;
        this.b = f;
    }
}
