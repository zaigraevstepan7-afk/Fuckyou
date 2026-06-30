package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class mh extends lh {
    public y41 a;
    public long b = 9205357640488583168L;
    public final /* synthetic */ Shader c;

    public mh(Shader shader) {
        this.c = shader;
    }

    @Override // defpackage.lh
    public final void a(float f, long j, p6 p6Var) {
        Paint paint = p6Var.a;
        y41 y41Var = this.a;
        if (y41Var == null || !io1.a(this.b, j)) {
            if (io1.c(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                y41Var = null;
            } else {
                y41Var = this.a;
                if (y41Var == null) {
                    y41Var = new y41(18, false);
                    this.a = y41Var;
                }
                y41Var.f = c(j);
                this.a = y41Var;
                this.b = j;
            }
        }
        long jA = p6Var.a();
        long j2 = vl.b;
        if (!vl.c(jA, j2)) {
            p6Var.f(j2);
        }
        if (!xi0.o(p6Var.c, y41Var != null ? (Shader) y41Var.f : null)) {
            Shader shader = y41Var != null ? (Shader) y41Var.f : null;
            p6Var.c = shader;
            paint.setShader(shader);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        p6Var.d(f);
    }

    public final Shader c(long j) {
        return this.c;
    }
}
