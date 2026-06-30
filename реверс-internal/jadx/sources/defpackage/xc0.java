package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class xc0 extends r42 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = vl.g;
    public List f;
    public boolean g;
    public w6 h;
    public sa0 i;
    public final g3 j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public xc0() {
        int i = a52.a;
        this.f = f40.e;
        this.g = true;
        this.j = new g3(13, this);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.r42
    public final void a(p10 p10Var) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = ou0.a();
                this.b = fArrA;
            } else {
                ou0.d(fArrA);
            }
            ou0.i(fArrA, this.q + this.m, this.r + this.n);
            ou0.e(fArrA, this.l);
            ou0.f(fArrA, this.o, this.p);
            ou0.i(fArrA, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                w6 w6VarA = this.h;
                if (w6VarA == null) {
                    w6VarA = y6.a();
                    this.h = w6VarA;
                }
                bl.T(this.f, w6VarA);
            }
            this.g = false;
        }
        oc ocVarE = p10Var.E();
        long jQ = ocVarE.q();
        ocVarE.i().l();
        try {
            oc ocVar = (oc) ((qt0) ocVarE.a).f;
            float[] fArr = this.b;
            if (fArr != null) {
                ocVar.i().q(fArr);
            }
            w6 w6Var = this.h;
            if (!this.f.isEmpty() && w6Var != null) {
                ocVar.i().s(w6Var);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((r42) arrayList.get(i)).a(p10Var);
            }
        } finally {
            s91.r(ocVarE, jQ);
        }
    }

    @Override // defpackage.r42
    public final sa0 b() {
        return this.i;
    }

    @Override // defpackage.r42
    public final void d(g3 g3Var) {
        this.i = g3Var;
    }

    public final void e(int i, r42 r42Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, r42Var);
        } else {
            arrayList.add(r42Var);
        }
        g(r42Var);
        r42Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = a52.a;
            if (vl.h(j2) == vl.h(j) && vl.g(j2) == vl.g(j) && vl.e(j2) == vl.e(j)) {
                return;
            }
            this.d = false;
            this.e = vl.g;
        }
    }

    public final void g(r42 r42Var) {
        if (!(r42Var instanceof z41)) {
            if (r42Var instanceof xc0) {
                xc0 xc0Var = (xc0) r42Var;
                if (xc0Var.d && this.d) {
                    f(xc0Var.e);
                    return;
                } else {
                    this.d = false;
                    this.e = vl.g;
                    return;
                }
            }
            return;
        }
        z41 z41Var = (z41) r42Var;
        lh lhVar = z41Var.b;
        if (this.d && lhVar != null) {
            if (lhVar instanceof uq1) {
                f(((uq1) lhVar).a);
            } else {
                this.d = false;
                this.e = vl.g;
            }
        }
        lh lhVar2 = z41Var.g;
        if (this.d && lhVar2 != null) {
            if (lhVar2 instanceof uq1) {
                f(((uq1) lhVar2).a);
            } else {
                this.d = false;
                this.e = vl.g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            r42 r42Var = (r42) arrayList.get(i);
            sb.append("\t");
            sb.append(r42Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
