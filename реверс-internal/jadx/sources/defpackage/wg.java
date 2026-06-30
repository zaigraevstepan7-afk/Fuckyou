package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wg {
    public final iy0 a;

    public wg(int i) {
        switch (i) {
            case 1:
                this.a = new iy0(new km0[16]);
                break;
            default:
                this.a = new iy0(new sr[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        iy0 iy0Var = this.a;
        int i = iy0Var.g;
        vi[] viVarArr = new vi[i];
        for (int i2 = 0; i2 < i; i2++) {
            viVarArr[i2] = ((sr) iy0Var.e[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            viVarArr[i3].m(cancellationException);
        }
        if (iy0Var.g == 0) {
            return;
        }
        qg0.c("uncancelled requests present");
    }

    public void b() throws IllegalAccessException, ly, InvocationTargetException {
        iy0 iy0Var = this.a;
        rh0 rh0VarO0 = lk.o0(0, iy0Var.g);
        int i = rh0VarO0.e;
        int i2 = rh0VarO0.f;
        if (i <= i2) {
            while (true) {
                ((sr) iy0Var.e[i]).b.g(t32.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        iy0Var.g();
    }
}
