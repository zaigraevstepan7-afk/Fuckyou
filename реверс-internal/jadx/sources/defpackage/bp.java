package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public abstract class bp {
    public final Object a;

    public bp(int i) {
        switch (i) {
            case 1:
                this.a = new Object();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public boolean a(int i, qb0 qb0Var, Object obj) {
        ArrayList arrayList = qb0Var.a;
        if (arrayList == null) {
            b(i, qb0Var, null);
            return true;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof jb0)) {
                if (!(obj2 instanceof qb0)) {
                    yc.g(obj2, "Unexpected child source info ");
                    break;
                }
                if (a(i, (qb0) obj2, obj)) {
                    b(0, qb0Var, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                b(0, qb0Var, obj2);
                return true;
            }
            i2++;
        }
        return false;
    }

    public void b(int i, qb0 qb0Var, Object obj) {
        ((ArrayList) this.a).add(new cp(i, null, null));
    }

    public abstract void c(im1 im1Var);

    public abstract void d();

    public abstract void e();

    public void f(int i, Object obj, qb0 qb0Var, Object obj2) {
        if (xi0.o(obj, kp.a)) {
            b(i, qb0Var, null);
        }
    }

    public abstract sa0 g(im1 im1Var);

    public abstract void h(mj mjVar);
}
