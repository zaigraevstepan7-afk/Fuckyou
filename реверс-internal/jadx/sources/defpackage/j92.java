package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class j92 implements vo0 {
    public final /* synthetic */ js e;
    public final /* synthetic */ y8 f;
    public final /* synthetic */ jc1 g;
    public final /* synthetic */ zc1 h;

    public j92(js jsVar, y8 y8Var, jc1 jc1Var, zc1 zc1Var) {
        this.e = jsVar;
        this.f = y8Var;
        this.g = jc1Var;
        this.h = zc1Var;
    }

    @Override // defpackage.vo0
    public final void e(xo0 xo0Var, po0 po0Var) throws IllegalAccessException, ly, InvocationTargetException {
        boolean z;
        vi viVarY = null;
        switch (i92.a[po0Var.ordinal()]) {
            case 1:
                nu0.A(this.e, null, yt.h, new m6(this.h, this.g, xo0Var, this, null, 17), 1);
                return;
            case t91.FLOAT_FIELD_NUMBER /* 2 */:
                y8 y8Var = this.f;
                if (y8Var != null) {
                    tk0 tk0Var = (tk0) y8Var.g;
                    synchronized (tk0Var.b) {
                        try {
                            synchronized (tk0Var.b) {
                                z = tk0Var.a;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) tk0Var.c;
                                tk0Var.c = (ArrayList) tk0Var.d;
                                tk0Var.d = arrayList;
                                tk0Var.a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((ks) arrayList.get(i)).g(t32.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                jc1 jc1Var = this.g;
                synchronized (jc1Var.c) {
                    if (jc1Var.t) {
                        jc1Var.t = false;
                        viVarY = jc1Var.y();
                    }
                    break;
                }
                if (viVarY != null) {
                    ((xi) viVarY).g(t32.a);
                    return;
                }
                return;
            case t91.INTEGER_FIELD_NUMBER /* 3 */:
                jc1 jc1Var2 = this.g;
                synchronized (jc1Var2.c) {
                    jc1Var2.t = true;
                }
                return;
            case t91.LONG_FIELD_NUMBER /* 4 */:
                this.g.x();
                return;
            case t91.STRING_FIELD_NUMBER /* 5 */:
            case t91.STRING_SET_FIELD_NUMBER /* 6 */:
            case t91.DOUBLE_FIELD_NUMBER /* 7 */:
                return;
            default:
                ez1.a();
                return;
        }
    }
}
