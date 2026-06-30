package defpackage;

import android.app.Application;
import android.os.Bundle;
import com.reddit.frontpage.MainActivity;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-7d02091066cdaef854dd62631b7ece0560bf3f98008d2b2dd5cfb5f5ba2a990d */
/* JADX INFO: loaded from: classes.dex */
public final class wh1 implements r62 {
    public final Application a;
    public final q62 b;
    public final Bundle c;
    public final zo0 d;
    public final n81 e;

    public wh1(Application application, MainActivity mainActivity, Bundle bundle) {
        q62 q62Var;
        this.e = (n81) mainActivity.h.c;
        this.d = mainActivity.e;
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (q62.c == null) {
                q62.c = new q62(application);
            }
            q62Var = q62.c;
            q62Var.getClass();
        } else {
            q62Var = new q62(null);
        }
        this.b = q62Var;
    }

    @Override // defpackage.r62
    public final o62 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        yc.p("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.r62
    public final o62 b(Class cls, cx0 cx0Var) {
        i32 i32Var = qt0.h;
        LinkedHashMap linkedHashMap = cx0Var.a;
        String str = (String) linkedHashMap.get(i32Var);
        if (str == null) {
            yc.l("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(nu0.n) == null || linkedHashMap.get(nu0.o) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            yc.l("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(q62.d);
        boolean zIsAssignableFrom = b9.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? xh1.a(cls, xh1.b) : xh1.a(cls, xh1.a);
        return constructorA == null ? this.b.b(cls, cx0Var) : (!zIsAssignableFrom || application == null) ? xh1.b(cls, constructorA, nu0.n(cx0Var)) : xh1.b(cls, constructorA, application, nu0.n(cx0Var));
    }

    @Override // defpackage.r62
    public final o62 c(mk mkVar, cx0 cx0Var) {
        return b(lk.P(mkVar), cx0Var);
    }

    public final o62 d(Class cls, String str) {
        zo0 zo0Var = this.d;
        if (zo0Var == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = b9.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? xh1.a(cls, xh1.b) : xh1.a(cls, xh1.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            if (s62.a == null) {
                s62.a = new s62();
            }
            s62.a.getClass();
            return xk.l(cls);
        }
        n81 n81Var = this.e;
        n81Var.getClass();
        oh1 oh1VarJ = pd1.j(n81Var.h(str), this.c);
        ph1 ph1Var = new ph1(str, oh1VarJ);
        ph1Var.d(zo0Var, n81Var);
        qo0 qo0Var = zo0Var.c;
        if (qo0Var == qo0.f || qo0Var.compareTo(qo0.h) >= 0) {
            n81Var.o();
        } else {
            zo0Var.a(new kw(zo0Var, n81Var));
        }
        o62 o62VarB = (!zIsAssignableFrom || application == null) ? xh1.b(cls, constructorA, oh1VarJ) : xh1.b(cls, constructorA, application, oh1VarJ);
        o62VarB.a("androidx.lifecycle.savedstate.vm.tag", ph1Var);
        return o62VarB;
    }
}
