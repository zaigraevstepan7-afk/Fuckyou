package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class lp {
    public final ob0 a;
    public kj b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final wh0 d = new wh0();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public lp(ob0 ob0Var, kj kjVar) {
        this.a = ob0Var;
        this.b = kjVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            f31 f31Var = this.b.b;
            f31Var.b0(b31.c);
            f31Var.f[f31Var.g - f31Var.d[f31Var.e - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        kj kjVar = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        kjVar.getClass();
        if (size != 0) {
            f31 f31Var2 = kjVar.b;
            f31Var2.b0(e21.c);
            al.O(f31Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                f31 f31Var = this.b.b;
                f31Var.b0(t21.c);
                int i3 = f31Var.g - f31Var.d[f31Var.e - 1].a;
                int[] iArr = f31Var.f;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                f31 f31Var2 = this.b.b;
                f31Var2.b0(p21.c);
                int i6 = f31Var2.g - f31Var2.d[f31Var2.e - 1].a;
                int[] iArr2 = f31Var2.f;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        ip1 ip1Var = this.a.G;
        int i = z ? ip1Var.i : ip1Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            mp.a("Tried to seek backward");
        }
        if (i2 > 0) {
            f31 f31Var = this.b.b;
            f31Var.b0(x11.c);
            f31Var.f[f31Var.g - f31Var.d[f31Var.e - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                mp.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
