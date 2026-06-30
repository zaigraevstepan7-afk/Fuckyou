package defpackage;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class z41 extends r42 {
    public lh b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public lh g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public kt1 q;
    public final w6 r;
    public w6 s;
    public w6 t;
    public final hm0 u;

    public z41() {
        int i = a52.a;
        this.d = f40.e;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        w6 w6VarA = y6.a();
        this.r = w6VarA;
        this.s = w6VarA;
        this.u = al.E(zp.p);
    }

    @Override // defpackage.r42
    public final void a(p10 p10Var) {
        kt1 kt1Var;
        if (this.n) {
            bl.T(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        lh lhVar = this.b;
        if (lhVar != null) {
            p10.y0(p10Var, this.s, lhVar, this.c, null, null, 56);
        }
        lh lhVar2 = this.g;
        if (lhVar2 != null) {
            kt1 kt1Var2 = this.q;
            if (this.o || kt1Var2 == null) {
                kt1 kt1Var3 = new kt1(this.f, this.j, this.h, this.i, 16);
                this.q = kt1Var3;
                this.o = false;
                kt1Var = kt1Var3;
            } else {
                kt1Var = kt1Var2;
            }
            p10.y0(p10Var, this.s, lhVar2, this.e, kt1Var, null, 48);
        }
    }

    public final void e() {
        float f = this.k;
        w6 w6Var = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = w6Var;
            return;
        }
        if (xi0.o(this.s, w6Var)) {
            this.s = y6.a();
        } else {
            Path.FillType fillType = this.s.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.s.h();
            Path path = this.s.a;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        hm0 hm0Var = this.u;
        ((x6) hm0Var.getValue()).a.setPath(w6Var != null ? w6Var.a : null, false);
        float length = ((x6) hm0Var.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((x6) hm0Var.getValue()).a(f4, f5, this.s);
            return;
        }
        w6 w6VarA = this.t;
        if (w6VarA == null) {
            w6VarA = y6.a();
            this.t = w6VarA;
        }
        w6VarA.g();
        ((x6) hm0Var.getValue()).a(f4, length, w6VarA);
        w6.a(this.s, w6VarA);
        w6VarA.g();
        ((x6) hm0Var.getValue()).a(0.0f, f5, w6VarA);
        w6.a(this.s, w6VarA);
    }

    public final String toString() {
        return this.r.toString();
    }
}
