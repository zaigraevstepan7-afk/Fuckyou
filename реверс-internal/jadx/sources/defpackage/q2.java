package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class q2 implements gt {
    public final gt a;
    public final float b;

    public q2(float f, gt gtVar) {
        while (gtVar instanceof q2) {
            gtVar = ((q2) gtVar).a;
            f += ((q2) gtVar).b;
        }
        this.a = gtVar;
        this.b = f;
    }

    @Override // defpackage.gt
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return this.a.equals(q2Var.a) && this.b == q2Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
