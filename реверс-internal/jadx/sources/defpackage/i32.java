package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public class i32 implements g52 {
    public static i32 e;

    public static final d9 c(String str, int i) {
        WeakHashMap weakHashMap = t82.v;
        return new d9(str, i);
    }

    public static final t42 d(String str, int i) {
        WeakHashMap weakHashMap = t82.v;
        return new t42(new ih0(0, 0, 0, 0), str);
    }

    public static qt0 e(t62 t62Var, sw swVar, int i) {
        r62 r62Var = swVar;
        if ((i & 2) != 0) {
            r62Var = t62Var instanceof kd0 ? (r62) ((bo) ((kd0) t62Var)).w.getValue() : sw.b;
        }
        cu cuVarD = t62Var instanceof kd0 ? ((bo) ((kd0) t62Var)).d() : bu.b;
        r62Var.getClass();
        cuVarD.getClass();
        return new qt0(((bo) t62Var).e(), r62Var, cuVarD);
    }

    public static t82 f(ob0 ob0Var) {
        t82 t82Var;
        View view = (View) ob0Var.j(w4.f);
        WeakHashMap weakHashMap = t82.v;
        synchronized (weakHashMap) {
            try {
                Object t82Var2 = weakHashMap.get(view);
                if (t82Var2 == null) {
                    t82Var2 = new t82(view);
                    weakHashMap.put(view, t82Var2);
                }
                t82Var = (t82) t82Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean zH = ob0Var.h(t82Var) | ob0Var.h(view);
        Object objK = ob0Var.K();
        if (zH || objK == kp.a) {
            objK = new d(28, t82Var, view);
            ob0Var.f0(objK);
        }
        wi0.c(t82Var, (sa0) objK, ob0Var);
        return t82Var;
    }

    public boolean g(CharSequence charSequence) {
        return false;
    }

    @Override // defpackage.g52
    public int k() {
        return 0;
    }

    @Override // defpackage.g52
    public int n() {
        return 0;
    }

    @Override // defpackage.e52
    public cb o(long j, cb cbVar, cb cbVar2, cb cbVar3) {
        return j < 0 ? cbVar : cbVar2;
    }

    @Override // defpackage.e52
    public cb l(long j, cb cbVar, cb cbVar2, cb cbVar3) {
        return cbVar3;
    }
}
