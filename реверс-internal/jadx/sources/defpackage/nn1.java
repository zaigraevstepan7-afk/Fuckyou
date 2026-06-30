package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class nn1 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public nn1() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.b;
        float f5 = this.c;
        jn1 jn1Var = new jn1(f4, f5, f4, f5);
        jn1Var.f = this.d;
        jn1Var.g = f3;
        this.g.add(new hn1(jn1Var));
        this.d = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ln1) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        kn1 kn1Var = new kn1();
        kn1Var.b = f;
        kn1Var.c = f2;
        this.f.add(kn1Var);
        in1 in1Var = new in1(kn1Var, this.b, this.c);
        float fB = in1Var.b() + 270.0f;
        float fB2 = in1Var.b() + 270.0f;
        a(fB);
        this.g.add(in1Var);
        this.d = fB2;
        this.b = f;
        this.c = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
